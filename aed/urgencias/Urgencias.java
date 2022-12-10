package aed.urgencias;

import es.upm.aedlib.Pair;


/**
 * Las operaciones de urgencias.
 */
public interface Urgencias {

  /* Operaciones O(log n):
   * =====================
   */

  /**
   * Paciente entra en las urgencias. 
   * @returns el paciente nuevo
   * @throws  la excepcion PacienteExisteException si
   * ya hay una paciente con este DNI admitido, que no ha sido atendido, ni ha salido.
   */
   Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException; 

  /** 
   * Paciente sale de las urgencias. Borra el paciente de
   * las estructuras de datos de las urgencias.
   * @returns el paciente
   * @throws la excepcion PacienteNoExisteException si
   * no hay una paciente con este DNI admitido.
   */
   Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException;

  /**
   * La prioridad del paciente cambia a nuevaPrioridad. 
   * @returns el paciente
   * @throws la excepcion PacienteNoExisteException si
   * no hay una paciente con este DNI admitido.
   */
   Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException;

  /**
   * Atende a un paciente (el primero en la cola), y borra el paciente de
   * las estructuras de datos de las urgencias.
   * @returns el paciente, o null si no hay ningun paciente admitido.
   */
  Paciente atenderPaciente(int hora);


  /** 
   * Operaciones O(n log n):
   * =======================
   */

  /** 
   * Aumenta la prioridad de los pacientes que han esperado mas que maxTiempoEspera
   * en su prioridad actual. 
   */
   void aumentaPrioridad(int maxTiempoEspera, int hora);

  /**
   * Devuelve un objeto Iterable ordenado segun el orden en que los pacientes
   * serian atendidos.
   */
  Iterable<Paciente> pacientesEsperando();


  /** 
   * Operaciones O(1):
   * ==================
   */
  
  /** 
   * Devuelve el paciente. Si no hay un paciente con este DNI devuelve null.
   */
  Paciente getPaciente(String DNI);

  /**
   * Devuelve un par de enteros donde el primer entero es la suma de los tiempos de espera
   * de los pacientes que han sido atendidos, y el segundo es el numero de pacientes
   * que han sido atentidos.
   * Se devuelve null si ningun paciente ha sido atendido.
   * @returns un par con la sumas de esperas y el numero de pacientes admitidos.
   */
  Pair<Integer,Integer> informacionEspera();
}
