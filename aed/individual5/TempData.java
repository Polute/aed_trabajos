package aed.individual5;

public class TempData {
  private String location;
  private int temperature;
  private long time;

  public TempData(String location, long time, int temperature) {
    this.location = location;
    this.time = time;
    this.temperature = temperature;
  }
  
  public String getLocation() {
    return location;
  }

  public long getTime() {
    return time;
  }

  public int getTemperature() {
    return temperature;
  }

  @Override
  public String toString() {
    return "{"+location+","+time+","+temperature+"}";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof TempData) {
      TempData otherData = (TempData) obj;
      return location.equals(otherData.getLocation())
        && time == otherData.getTime();
    } else return false;
  }

  @Override
  public int hashCode() {
    return location.hashCode() + (int) time;
  }
}
