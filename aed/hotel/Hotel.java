package aed.hotel;

import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.*;


/**
 * Documenta los metodos disponibles para realisar y cancelar reservas en un hotel,
 * y para realisar preguntas sobre reservas en vigor.
 */
public interface Hotel {
  /**
   * Añadir a una habitacion.
   *
   * @param habitacion la habitacion nueva que se puede reservar
   * @throws IllegalArgumentException si ya habia una habitacion registrado con el mismo nombre.
   */
  public void anadirHabitacion(Habitacion habitacion);
  /*
   * Reserva una habitacion para una estancia entre los dias
   * (inclusivo) diaEntrada hasta (inclusivo) diaSalida. 
   *
   * @param reserva la reserva para realisar
   * @return true si la habitacíon es disponible y la reserva fue exitosa.

   * @throws IllegalArgumentException si la habitacion de la reserva no existe.
   */
  public boolean reservaHabitacion(Reserva reserva);

  /**
   * Cancelar una reserva. 
   *
   * @param reserva la reserva para cancelar
   * @return devuelve true si se podia cancelar la reserva (fue encontrado).
   * @throws IllegalArgumentException si la habitacion de la reserva no existe.
   */ 
  public boolean cancelarReserva(Reserva reserva) ;

  /**
   * Devuelve todas habitaciones disponible entre (inclusivo) diaEntrada
   * hasta (inclusivo) diaSalida. El método devuelve una lista de habitaciones
   * ordenada segun el precio total en orden ascendente. Es decir,
   * el primer elemento de la lista devuelta es la 
   * la habitacion mas barata. 
   *
   * @param diaEntrada el dia de entreda al hotel
   * @param diaSalida el dia de salida del hotel
   * @return una lista con las habitaciones disponibles
   * @throws IllegalArgumentException si la habitacion de la reserva no existe.
   */
  public IndexedList<Habitacion> disponibilidadHabitaciones(String diaEntrada, String diaSalida);

  /**
   * Devuelve una lista de todas las reservas de un cliente (identificado
   * por su dniPasaporte. La lista contiene pares, habitacion y fecha entrada,
   * ordenada usando las fechas de entrada (orden ascendiente).
   *
   * @param dniPasaporte la idenficacion del cliente
   * @return una lista con las reservas realisados por el cliente
   */
  public IndexedList<Reserva> reservasPorCliente(String dniPasaporte);

  /**
   * Devuelve una lista de habitaciones que necesitan ser limpiados, ordenado
   * segun el nombre de la habitacion. Es decir, devuelve habitaciones cuya
   * entrada fue antes que hoyDia y su salida es despues or igual a hoyDia.
   *
   * @param hoyDia la fecha cuando se realiza la llamada
   * @return una lista con las habitaciones que deben ser limpiados
   */
  public IndexedList<Habitacion> habitacionesParaLimpiar(String hoyDia);

  /**
   * Devuelve la reserva para una habitacion en la fecha indicada,
   * y si no habia una reserva, devuelve null. Notad que el dia de la salida no 
   * se toma en cuenta para devolver una reserva.
   *
   * @param nombreHabitacion el nombre de habitacion 
   * @param dia el dia
   * @return devuelve la reserva de la habitacion en el dia especificado
   * @throws IllegalArgumentException si la habitacion de la reserva no existe.
   */
  public Reserva reservaDeHabitacion(String nombreHabitacion, String dia);
}
