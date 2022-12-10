package aed.urgencias;


/**
 * Un paciente.
 */
public class Paciente implements Comparable<Paciente> {

  // DNI
  private String DNI;
  // Prioridad 
  private int prioridad;
  // Tiempo de admision en las urgencias
  private int tiempoAdmision;
  // Tiempo cuando entro en la prioridad 
  private int tiempoAdmisionEnPrioridad;

  /**
   * Constructor.
   */
  public Paciente(String DNI, int prioridad, int tiempoAdmision, int tiempoAdmisionEnPrioridad) {
    this.DNI = DNI;
    this.prioridad = prioridad;
    this.tiempoAdmision = tiempoAdmision;
    this.tiempoAdmisionEnPrioridad = tiempoAdmisionEnPrioridad;
  }

  /**
   * Devuelve el dni.
   * @return el dni.
   */
  public String getDNI() {
    return DNI;
  }

  /**
   * Devuelve la prioridad.
   * @return la prioridad.
   */
  public int getPrioridad() {
    return prioridad;
  }

  /**
   * Devuelve el tiempo de admision.
   * @return el tiempo de admision.
   */
  public int getTiempoAdmision() {
    return tiempoAdmision;
  }

  /**
   * Devuelve el tiempo de admision en la prioridad actual.
   * @return el tiempo de admision en la prioridad actual.
   */
  public int getTiempoAdmisionEnPrioridad() {
    return tiempoAdmisionEnPrioridad;
  }

  /**
   * Asigna una prioridad nueva.
   * @return la prioridad antigua.
   */
  public int setPrioridad(int prioridadNuevo) {
    int oldPrioridad = prioridad;
    prioridad = prioridadNuevo;
    return oldPrioridad;
  }

  /**
   * Asigna un nuevo tiempo de admision en prioridad.
   * @return el tiempo de admision en prioridad antigua.
   */
  public int setTiempoAdmisionEnPrioridad(int tiempoNuevo) {
    int oldTiempo = tiempoAdmisionEnPrioridad;
    tiempoAdmisionEnPrioridad = tiempoNuevo;
    return oldTiempo;
  }

  @Override
  public String toString() {
     return "<\""+DNI.toString()+"\","+prioridad+","+tiempoAdmision+","+tiempoAdmisionEnPrioridad+">";
  }

  // ----------------------------------------------------------------------
  // Para terminar

  // Hay que definir compareTo:
  // (ve la descripcion en la guia)
  @Override
  public int compareTo(Paciente paciente) {
	  if(prioridad<paciente.getPrioridad()) {
		  return -1;//(<,x,x)
	  }
	  else if(prioridad==paciente.getPrioridad()){
		  if(tiempoAdmisionEnPrioridad>paciente.getTiempoAdmisionEnPrioridad()) {
			  return 1;//(>,x,<)
		  }
		  else if(tiempoAdmisionEnPrioridad==paciente.getTiempoAdmisionEnPrioridad()) {
			  if(tiempoAdmision<paciente.getTiempoAdmision()) {
				  return -1;//(=,>,=)
			  }
			  else if(tiempoAdmision==paciente.getTiempoAdmision()){
				  return 0;//(=,=,=)
			  }
			  else return 1;//(<,<,<)
		  }else return -1;//(>,x,>)
	 }else return 1;//(>,x,x)
  }
  
  // Hay que definir equals
  // Usad solo el DNI al comparar pacientes
  @Override
  public boolean equals(Object obj) {
	  if (this == obj) return true;
	    if (obj instanceof Paciente) {
	      Paciente otherPaciente = (Paciente) obj;
	      return this.DNI.equals(otherPaciente.getDNI());
	    }
	    else if(obj instanceof String) {
	    	String otherDNI = (String) obj;
	    	return this.DNI.equals(otherDNI);
	    }
	    else { 
	    	return false;
	    }
  }

  // Hay que definit hashCode
  // Usad solo el DNI al calcular el hashCode
  @Override
  public int hashCode() {
    return DNI.hashCode();
  }

}
