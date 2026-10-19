package rip.breeze.client;

import java.util.Comparator;

final class BreezeComparator implements Comparator<Comparable> {
   public int getValue(Comparable var1, Comparable var2) {
      return var1.compareTo(var2);
   }
}
