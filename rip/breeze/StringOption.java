package rip.breeze;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringOption {
   private String selected;
   private final String[] options;

   public StringOption(String var1, String[] var2) {
      this.selected = var1;
      this.options = var2;
   }

   public int getValue() {
      return Arrays.stream(this.options).collect(Collectors.toList()).indexOf(this.selected);
   }

   public String getString_a() {
      return this.selected;
   }

   public String[] getArr_b() {
      return this.options;
   }

   public void setString_a(String var1) {
      this.selected = var1;
   }
}
