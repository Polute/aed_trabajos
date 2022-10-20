package aed.hotel;

import java.util.Comparator;

import es.upm.aedlib.indexedlist.*;


/**
 * Implementa el interfaz Hotel, para realisar y cancelar reservas en un hotel,
 * y para realisar preguntas sobre reservas en vigor.
 */
public class MiHotel implements Hotel {
  /**
   * Usa esta estructura para guardar las habitaciones creados.
   */
  private IndexedList<Habitacion> habitaciones;

  /**
   * Crea una instancia del hotel. 
   */
  public MiHotel() {
    // No se debe cambiar este codigo
    this.habitaciones = new ArrayIndexedList<>();
  }
  @Override
  public void anadirHabitacion(Habitacion habitacion) throws IllegalArgumentException{
	  //Buscamos la posicion donde se colocaria la habitacion por su precio
	  int pos=busquedaBinaria(habitaciones,habitacion,new comparadorHabitacionPrecio());
	  //Si ya hay una habitacion con ese nombre, da una excepcion
	  if(habitaciones.indexOf(habitacion)>=0) {
		  throw new IllegalArgumentException("La habitacion"+habitacion.toString()+ "ya esta en el hotel");
	  }
	  //Si no, se aniade a su posicion ordenada
	  else {
		  habitaciones.add(pos, habitacion);
	  }
  }
 @Override
public boolean reservaHabitacion(Reserva reserva) throws IllegalArgumentException {
	  Habitacion habitacion=null;
	  int i=0;
	  //Vemos que habitacion queremos reservar
	  for(i=0;i<habitaciones.size() && habitacion==null;i++) {
		  if(habitaciones.get(i).getNombre().equals(reserva.getHabitacion())) {
			  habitacion=habitaciones.get(i);
		  }	  
	  }
	  //Si no esta, da una excepcioon
	  if(habitacion==null) {
		  throw new IllegalArgumentException("La habitacion a reservar no esta en el hotel");
	  }
	  //Obtenemos las habitaciones disponibles en el rango de la reserva
	  IndexedList<Habitacion> disponibles=new ArrayIndexedList<>();
	  disponibles=disponibilidadHabitaciones(reserva.getDiaEntrada(),reserva.getDiaSalida());
	  int posR;
	  int posH;
	  boolean res=false;
	  for (int j=0;j<disponibles.size() && !res; j++) {
		  //Si se encuentra, se coloca en la lista de reservas de la habitacion la reserva
		  if(disponibles.get(j).getNombre().equals(reserva.getHabitacion())){
			  res=true;
			  posH=busquedaBinaria(habitaciones,disponibles.get(j),new comparadorHabitacionPrecio());
			  posR=posReservaPorFecha(habitaciones.get(posH).getReservas(),reserva.getDiaEntrada(),reserva.getDiaSalida(), new comparadorReservaFechas());
			  habitaciones.get(posH).getReservas().add(posR, reserva);
		  }
	  }
	return res;
  }
 @Override
 public boolean cancelarReserva(Reserva reserva) throws IllegalArgumentException{
	  boolean res=false;
	  IndexedList<Reserva> reservas = new ArrayIndexedList<Reserva>();
	  //Recogemos todas las reservas ya hechas
		for (int i = 0; i < habitaciones.size() && !res; i++) {
			reservas = habitaciones.get(i).getReservas();
			if (reservas.indexOf(reserva) >= 0) {
				res = true;
			}
		}//Si esta, se elimina
		if (res) {
			reservas.remove(reserva);
		} else { //Si no esta, da una excepcion
			throw new IllegalArgumentException("La reserva a cancelar no estaba reservada de antes");
		}
	  return res;
 }
 @Override
 public IndexedList<Habitacion> disponibilidadHabitaciones(String diaEntrada, String diaSalida){
	  IndexedList<Habitacion> disponibles=new ArrayIndexedList<>();
	  IndexedList<Reserva>  listaReservas=new ArrayIndexedList<>();
	//Recogemos todas las reservas ya hechas
	  for(int i=0;i<habitaciones.size();i++) {
		  listaReservas=habitaciones.get(i).getReservas();
		  //Colocamos las reservas que se pueden hacer en la lista de habitaciones disponibles
	  int posR=posReservaPorFecha(listaReservas, diaEntrada, diaSalida, new comparadorReservaFechas());
      if(posR!=-1) {
    	  disponibles.add(disponibles.size(), habitaciones.get(i));
      }
	  }
	  
	return disponibles;
	
 }
 
@Override
public IndexedList<Reserva> reservasPorCliente(String dniPasaporte) {
	IndexedList<Reserva> res = new ArrayIndexedList<>();
	IndexedList<Reserva> reservasAux = new ArrayIndexedList<>();
	//Con la lista de reservas, aniadimos aquellas que poseen el mismo dni a la lista resultado
	for(int i=0;i<habitaciones.size();i++) {
		reservasAux = habitaciones.get(i).getReservas();
		for (int j=0; j<reservasAux.size(); j++) {
			if(reservasAux.get(j).getDniPasaporte().equals(dniPasaporte)) {
				res.add(res.size(), reservasAux.get(j));
			}
		}
	}
	return res;
	
}

@Override
public IndexedList<Habitacion> habitacionesParaLimpiar(String hoyDia) {
    IndexedList<Habitacion> res = new ArrayIndexedList<>();
    boolean reservado=false;
    //Vemos posibles rangos donde se puede limpiar la habitacion
    for (int i=0; i<habitaciones.size(); i++) {
        for(int j=0; j < habitaciones.get(i).getReservas().size() && !reservado;j++) {
            if(hoyDia.compareTo(habitaciones.get(i).getReservas().get(j).getDiaEntrada())>0 
            		&& hoyDia.compareTo(habitaciones.get(i).getReservas().get(j).getDiaSalida())<=0) {
            	reservado=true;
            }
        }
        //Se aniaden una vez a la lista de habitaciones para limpiar
        if(reservado) {
       		  res.add(res.size(),habitaciones.get(i));
       		  reservado=false;
        }
    }
    //Se organiza la lista por nombre, en vez de por precio
    res=ordenacionPorNombre(res,new comparadorHabitacion());
    return res;
}

@Override
public Reserva reservaDeHabitacion(String nombreHabitacion, String dia) throws IllegalArgumentException{
	Reserva reserva = null;
	Habitacion habitacion=null;
	//Vemos si la habitacion esta en el hotel
	for(int i=0;i<habitaciones.size();i++) {
		if(habitaciones.get(i).getNombre().equals(nombreHabitacion)){
		  habitacion=habitaciones.get(i);
		}  
	}
	//Si no esta, da una excepcion
	if(habitacion==null) {
	  throw new IllegalArgumentException("La habitacion"+nombreHabitacion+"no esta en el hotel");
	}
	//Si esta, se obtiene la reserva correspondiente
    else {
	  IndexedList<Reserva> reservas = habitacion.getReservas();
	  int pos=posicionReserva(reservas,dia,new comparadorReservaFechas());
	  if(pos!=-1) {
		  reserva=reservas.get(pos);
	  }
	}
	  return reserva;
		  
}

private int posReservaPorFecha(IndexedList<Reserva> listaReservas,String diaEntrada, String diaSalida,Comparator<String> comparador ) {
	//Busqueda binaria que devuelve la posicion segun las fechas y la lista de reservas
	int res=-1;
    int max=listaReservas.size();
    int inicio=0;
    int medio=0;
    while(inicio<max) {
    	medio = (inicio+max)/2;
    	if(comparador.compare(diaEntrada,listaReservas.get(medio).getDiaSalida())>=0){
    		inicio=medio+1;
			medio++;
    	}
		else {
			max=medio;
		}
	}
    if(medio!=listaReservas.size()) {
    	if(comparador.compare(diaSalida,listaReservas.get(medio).getDiaEntrada())<=0) {
    		res=medio;
    	}
    }
    else {
        res=medio;
    }
	return res;
}
private int posicionReserva(IndexedList<Reserva> listaReservas,String dia,Comparator<String> comparador ) {
	//Busqueda binaria que devuelve la posicion segun una fecha y la lista de reservas
	int res = -1;
	int inicio = 0;
	int max = listaReservas.size();
	int medio = 0;
	while (inicio<max) {
		medio = (inicio+max)/2;
		if(comparador.compare(dia,listaReservas.get(medio).getDiaSalida())>=0) {
			inicio=medio+1;
			medio++;
		}
		else {
			max=medio;
		}
	}
	if (medio!=listaReservas.size()) {
		if(comparador.compare(dia,listaReservas.get(medio).getDiaEntrada())>=0) {
			res=medio;
		}
	}
	return res;
}
private IndexedList<Habitacion> ordenacionPorNombre(IndexedList<Habitacion> lista,Comparator<Habitacion> comparador ) {
	//Se reordena una lista segun el nombre por busqueda binaria
	IndexedList<Habitacion> res = new ArrayIndexedList<Habitacion>();
	Habitacion habitacion;
	int inicio;
	int max;
	int medio;
	for (int i=0;i<lista.size(); i++) {
		habitacion=lista.get(i);
		max=res.size();
		inicio=0;
		medio=0;
		while (inicio<max) {
			medio=(inicio+max)/2;
			if(comparador.compare(habitacion,res.get(medio))<=0) {
				inicio=medio+1;
			}
			else {
				max=medio;
				medio++;}
		}
		res.add(medio, habitacion);
	}
	//Devuelve una lista reordenada, es la lista resultado
	return res;
}

public <E> int busquedaBinaria(IndexedList<E> lista,E objeto,Comparator<E> comparador ){
	//Busqueda binaria que compara los objetos de una lista y un mismo objeto
	//Devuelve la posicion en la que se encuentra el objeto, o donde se debe colocar
	int inicio=0;
	int max=lista.size();
	int medio=0;
	while (inicio<max) {
		medio=(max+inicio)/2;
		if(comparador.compare(lista.get(medio), objeto)<0) {
			inicio=medio+1;
		}
		else if(comparador.compare(lista.get(medio), objeto)>0) {
			max=medio;
		}
		else {
			inicio=medio;
			max=medio;
		}
	}
	return inicio;

}
//Comparadores segun el par de atributos que le damos
static class comparadorHabitacion implements Comparator<Habitacion>{
	@Override
	public int compare(Habitacion o1, Habitacion o2) {
		return o1.compareTo(o2);
	}
}
static class comparadorReservaFechas implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
static class comparadorHabitacionPrecio implements Comparator<Habitacion>{
	@Override
	public int compare(Habitacion o1, Habitacion o2) {
		return o1.getPrecio()-o2.getPrecio();
	}
}
}



