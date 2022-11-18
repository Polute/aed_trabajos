package aed.recursion;

public class MyInteger implements Comparable<MyInteger> {
  static long counter = 0;
  int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public static void setCounter(long value) {
    counter = value;
  }

  public static long getCounter() {
    return counter;
  }

  public Integer value() {
    return value;
  }

  public int compareTo(MyInteger other) {
    ++counter;
    return this.value().compareTo(other.value());
  }

  public boolean equals(Object obj) {
    if (obj instanceof MyInteger) {
      MyInteger my = (MyInteger) obj;
      return value == my.value;
    } else return false;
  }

  public int hashCode() {
    return value;
  }

  public String toString() {
    return Integer.toString(value);
  }
}
