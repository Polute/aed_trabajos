package aed.hotel;

/**
 * Define los contenidos de una reserva.
 */
public class Reserva implements Comparable<Reserva> {
  private String habitacion;     // habitacion reservado
  private String dniPasaporte;   // dni o pasaporte del cliente haciendo
                                 // la reserva
  private String diaEntrada;     // Dia entrada 
  private String diaSalida;      // Dia salida

  /**
   * Devuelve la habitacion de la reserva
   * @return la habitacion de la reserva
   */
  public String getHabitacion() {
	  
	  return this.habitacion; 
  }
  /**
   * Devuelve el numero del documento de indentidad del cliente realisando la reserva
   * @return el documento de identidad del cliente
   */
  public String getDniPasaporte() { 
	  return this.dniPasaporte; 
  }
  /**
   * Devuelve el dia de entrada al hotel
   * @return el dia de entrada
   */
  public String getDiaEntrada() { 
	  return this.diaEntrada; 
  }
  /**
   * Devuelve el dia de salida del hotel
   * @return el dia de salida
   */
  public String getDiaSalida() { 
	  return this.diaSalida; 
  }

  /**
   * Crea una reserva.
   *
   * @param habitacion la habitacion de la reserva
   * @param dniPasaporte el documento de indentidad del cliente realisando la reserva
   * @param diaEntrada dia de entrada al hotel
   * @param diaSalida dia de salida del hotel
   */
  public Reserva(String habitacion, String dniPasaporte, String diaEntrada, String diaSalida) {
    this.habitacion = habitacion;
    this.dniPasaporte = dniPasaporte;
    this.diaEntrada = diaEntrada;
    this.diaSalida = diaSalida;
  }

  /**
   * Ordena reservas segun la fecha de entrada.
   */
  public int compareTo(Reserva otherReserva) {
    return getDiaEntrada().compareTo(otherReserva.getDiaEntrada());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Reserva) {
      Reserva otherReserva = (Reserva) obj;
      return 
        this.getHabitacion().equals(otherReserva.getHabitacion())
        && this.getDniPasaporte().equals(otherReserva.getDniPasaporte())
        && this.getDiaEntrada().equals(otherReserva.getDiaEntrada())
        && this.getDiaSalida().equals(otherReserva.getDiaSalida());
    } else return false;
  }

  @Override
  public int hashCode() {
    return 
      getHabitacion().hashCode() 
      + getDniPasaporte().hashCode() 
      + getDiaEntrada().hashCode() 
      + getDiaSalida().hashCode();
  }
  
  @Override 
  public String toString() {
    return "Reserva(\""+getHabitacion()+"\","+getDniPasaporte()+",\""+getDiaEntrada()+"\",\""+getDiaSalida()+"\")";
  }
}
