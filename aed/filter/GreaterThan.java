package aed.filter;

import java.util.function.Predicate;

public class GreaterThan<E extends Comparable<E>> implements Predicate<E> {
  E e;

  public GreaterThan(E e) {
    this.e = e;
  }

  public boolean test(E e) {
    int result = this.e.compareTo(e);
    return result < 0;
  }

  public String toString() {
    return "new GreaterThan("+e+")";
  }
}

