package aed.hotel;

import es.upm.aedlib.indexedlist.*;


/**
 * Define los datos relevantes para una habitacion, incluyendo
 * las reservas.
 */
public class Habitacion implements Comparable<Habitacion> {
  private String nombre;                  // un nombre unico
  private int precio;                     // precio al dia
  private IndexedList<Reserva> reservas;  // reservas

  public Habitacion(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
    this.reservas = new ArrayIndexedList<>();
  }

  public String getNombre() { return this.nombre; }
  public int getPrecio() { return this.precio; }
  public IndexedList<Reserva> getReservas() { return this.reservas; }

  @Override
  public boolean equals(Object obj) {
    if (this==obj) return true;
    if (obj instanceof Habitacion) {
      Habitacion otherHabitacion = (Habitacion) obj;
      return getNombre().equals(otherHabitacion.getNombre());
    } else return false;
  }

  @Override
  public int hashCode() {
    return nombre.hashCode();
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Habitacion(");
    sb.append("\""+nombre+"\"");
    sb.append(","+precio);
    if (reservas.size() > 0) {
      sb.append(",");
      for (int i=0; i<reservas.size(); i++) {
        if (i>0) sb.append(",");
        sb.append(reservas.get(i));
      }
    }
    sb.append(")");
    return sb.toString();
  }

  @Override
  public int compareTo(Habitacion otraHabitacion) {
    return getNombre().compareTo(otraHabitacion.getNombre());
  }
  
}
