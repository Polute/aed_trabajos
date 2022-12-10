package aed.urgencias;


import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;

public class UrgenciasAED implements Urgencias {
	// Cola en la que meteremos a los pacientes ordenadamente.
	private IndexedList<Paciente> cola;
	// Aqui identificaremos a cada paciente por su DNI.
	private Map<String, Paciente> entries;
	//Par que contiene:
	// Sumatorio de todos los tiempos de espera de los pacientes atendidos.
	// Contador de los pacientes atendidos hasta el momento.
	private Pair<Integer, Integer> lista;

	// Inicializamos todos los atrinutos de la clase.
	public UrgenciasAED() {
		this.cola = new ArrayIndexedList<>();
		this.entries = new HashTableMap<String, Paciente>();;
		this.lista = new Pair<>(0, 0);
	}

	@Override
	public Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException {
		if (entries.containsKey(DNI)) {
			throw new PacienteExisteException();
		}
		// Creamos al nuevo paciente con los atributos dados.
		Paciente p = new Paciente(DNI, prioridad, hora, hora);
		// Guardamos al paciente en las estructuras de datos.
		findPosAndEntry(p);
		entries.put(DNI, p);
		return p;

	}

	@Override
	public Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException {
		if (!entries.containsKey(DNI)) {
			throw new PacienteNoExisteException();
		}
		Paciente p = entries.get(DNI);
		// Eliminamos al paciente de las estructuras de datos.
		cola.remove(p);
		entries.remove(DNI);

		return p;
	}

	@Override
	public Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException {
		if (!entries.containsKey(DNI)) {
			throw new PacienteNoExisteException();
		}
		Paciente p = entries.get(DNI);
		if (p.getPrioridad() == nuevaPrioridad) {
			return p;
		} else {
			cola.remove(p);
			p.setPrioridad(nuevaPrioridad);
			p.setTiempoAdmisionEnPrioridad(hora);
			findPosAndEntry(p);
			return p;
		}
	}

	@Override
	public Paciente atenderPaciente(int hora) {
		if (entries.isEmpty()) {
			return null;
		} else {
			Paciente p = entries.get(cola.get(0).getDNI());
			// Se suma lo que ha esperado el paciente al computo global.
			lista.setLeft(lista.getLeft()+(hora - p.getTiempoAdmision()));
			// Se incrementa el numero de pacientes atendidos.
			lista.setRight(lista.getRight()+1);
			// Eliminamos al paciente de las estructuras de datos.
			cola.remove(cola.get(0));
			entries.remove(p.getDNI());

			return p;
		}
	}

	@Override
	public void aumentaPrioridad(int maxTiempoEspera, int hora) {
		Iterator<Entry<String, Paciente>> aux = entries.entries().iterator();
		while (aux.hasNext()) {
			Entry<String, Paciente> e = aux.next();
			// Aumenta en 1 la prioridad a los que superen maxTiempoEspera y se les reordena
			// en la cola.
			if (hora - e.getValue().getTiempoAdmisionEnPrioridad() > maxTiempoEspera
					&& e.getValue().getPrioridad() >= 1) {
				e.getValue().setPrioridad(e.getValue().getPrioridad() - 1);
				e.getValue().setTiempoAdmisionEnPrioridad(hora);
				cola.remove(e.getValue());
				findPosAndEntry(e.getValue());
			}
		}
	}

	@Override
	public Iterable<Paciente> pacientesEsperando() {
		return cola;
	}

	@Override
	public Paciente getPaciente(String DNI) {
		Paciente p = entries.get(DNI);
		return p;
	}

	@Override
	public Pair<Integer, Integer> informacionEspera() {
		return lista;
	}

	/*
	 * Metodo que recibe un paciente y lo inserta en la cola en la posicion
	 * correspondiente segun el criterio del compareTo.
	 */
	public void findPosAndEntry(Paciente paciente) {
		// Casos triviales.
		if (cola.size() == 0) {
			cola.add(0, paciente);
		} else if (cola.size() == 1) {
			if (paciente.compareTo(cola.get(0)) < 0) {
				cola.add(0, paciente);
			} else {
				cola.add(1, paciente);
			}
		}

		// Realizamos una busqueda binaria para introducir al paciente en orden.
		else {
			int inicio = 0;
			int fin = cola.size() - 1;
			int medio = 0;
			boolean metido = false;
			while (fin >= inicio && !metido) {
				medio = (inicio + fin) / 2;
				if (cola.get(fin).compareTo(paciente) < 0) {
					medio = cola.size();
					metido = true;
				} else if (cola.get(inicio).compareTo(paciente) > 0) {
					medio = inicio;
					metido = true;
				} else if (cola.get(medio).compareTo(paciente) < 0) {
					inicio = medio + 1;
				} else if (cola.get(medio).compareTo(paciente) > 0) {
					fin = medio;
				} else {
					metido = true;
				}
			}
			cola.add(medio, paciente);
		}
	}
}
