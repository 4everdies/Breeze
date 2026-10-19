package rip.breeze.client;

import java.io.ObjectStreamException;
import java.math.BigDecimal;
import rip.breeze.StringDecryptor;

public final class NumberConverter extends Number {
   private final String string_a;

   public NumberConverter(String var1) {
      this.string_a = var1;
   }

   @Override
   public int intValue() {
      try {
         return Integer.parseInt(this.string_a);
      } catch (NumberFormatException var4) {
         try {
            return (int)Long.parseLong(this.string_a);
         } catch (NumberFormatException var3) {
            return new BigDecimal(this.string_a).intValue();
         }
      }
   }

   @Override
   public long longValue() {
      try {
         return Long.parseLong(this.string_a);
      } catch (NumberFormatException var2) {
         return new BigDecimal(this.string_a).longValue();
      }
   }

   @Override
   public float floatValue() {
      return Float.parseFloat(this.string_a);
   }

   @Override
   public double doubleValue() {
      return Double.parseDouble(this.string_a);
   }

   @Override
   public String toString() {
      return this.string_a;
   }

   private Object writeReplace() throws ObjectStreamException {
      return new BigDecimal(this.string_a);
   }

   @Override
   public int hashCode() {
      return this.string_a.hashCode();
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/NumberConverter.1580577549957L J
      // 03: ldc2_w 8186888793536
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: if_acmpne 13
      // 0d: bipush 1
      // 0e: ireturn
      // 0f: invokestatic rip/breeze/client/NumberConverter.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 12: athrow
      // 13: aload 1
      // 14: instanceof rip/breeze/client/NumberConverter
      // 17: ifeq 4c
      // 1a: aload 1
      // 1b: checkcast rip/breeze/client/NumberConverter
      // 1e: astore 4
      // 20: aload 0
      // 21: getfield rip/breeze/client/NumberConverter.string_a Ljava/lang/String;
      // 24: aload 4
      // 26: getfield rip/breeze/client/NumberConverter.string_a Ljava/lang/String;
      // 29: if_acmpeq 42
      // 2c: aload 0
      // 2d: getfield rip/breeze/client/NumberConverter.string_a Ljava/lang/String;
      // 30: aload 4
      // 32: getfield rip/breeze/client/NumberConverter.string_a Ljava/lang/String;
      // 35: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 38: ifeq 4a
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/client/NumberConverter.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 41: athrow
      // 42: bipush 1
      // 43: goto 4b
      // 46: invokestatic rip/breeze/client/NumberConverter.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: bipush 0
      // 4d: ireturn
      // try (4 -> 9): 9 java/lang/NumberFormatException
      // try (17 -> 28): 29 java/lang/NumberFormatException
      // try (22 -> 33): 33 java/lang/NumberFormatException
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
