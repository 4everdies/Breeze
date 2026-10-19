package rip.breeze.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rip.breeze.StringDecryptor;

public final class BreezeIterable extends PlayerUtil8 implements Iterable<PlayerUtil8> {
   private final List<PlayerUtil8> items = new ArrayList<>();
   private static int fieldInt_c;

   public void processAll(Number var1, long var2) {
      var2 = 137273447440991L ^ var2;
      long var4 = var2 ^ 100109292997389L;

      List var10000;
      PlayerUtil8 var10001;
      label17: {
         try {
            var10000 = this.items;
            if (var1 == null) {
               var10001 = Util40.CONST_A;
               break label17;
            }
         } catch (IllegalStateException var6) {
            throw getIllegalStateException(var6);
         }

         var10001 = new Util138(var4, var1);
      }

      var10000.add(var10001);
   }

   public void processAll_2(String var1, long var2) {
      var2 = 137273447440991L ^ var2;
      long var4 = var2 ^ 21832919947189L;

      List var10000;
      PlayerUtil8 var10001;
      label17: {
         try {
            var10000 = this.items;
            if (var1 == null) {
               var10001 = Util40.CONST_A;
               break label17;
            }
         } catch (IllegalStateException var6) {
            throw getIllegalStateException(var6);
         }

         var10001 = new Util138(var4, var1);
      }

      var10000.add(var10001);
   }

   public void processNullable(long var1, PlayerUtil8 var3) {
      var1 = 137273447440991L ^ var1;
      if (var3 == null) {
         var3 = Util40.CONST_A;
      }

      this.items.add(var3);
   }

   public int getValue() {
      return this.items.size();
   }

   @Override
   public Iterator<PlayerUtil8> iterator() {
      return this.items.iterator();
   }

   public PlayerUtil8 getDataBuilder2(int var1) {
      return this.items.get(var1);
   }

   @Override
   public Number getNumber(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).getNumber(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
   }

   @Override
   public String buildString(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 0L;
      int var6 = (int)((var4 ^ 0L) >>> 48);
      int var7 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).buildString((char)var6, var7, (short)var8);
         }
      } catch (IllegalStateException var9) {
         throw getIllegalStateException(var9);
      }

      throw new IllegalStateException();
   }

   @Override
   public double getDouble(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).getDouble(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
   }

   @Override
   public float getFloat(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).getFloat(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
   }

   @Override
   public long getLong(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).getLong(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
   }

   public int getValue_2(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).getValue(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
   }

   public boolean isValid(long var1) {
      long var3 = var1 ^ 0L;

      try {
         if (this.items.size() == 1) {
            return this.items.get(0).isValid_5(var3);
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      throw new IllegalStateException();
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
      // 00: getstatic rip/breeze/client/BreezeIterable.137273447440991L J
      // 03: ldc2_w 46638447910675
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: aload 0
      // 0a: if_acmpeq 35
      // 0d: aload 1
      // 0e: instanceof rip/breeze/client/BreezeIterable
      // 11: ifeq 3d
      // 14: goto 1b
      // 17: invokestatic rip/breeze/client/BreezeIterable.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: checkcast rip/breeze/client/BreezeIterable
      // 1f: getfield rip/breeze/client/BreezeIterable.items Ljava/util/List;
      // 22: aload 0
      // 23: getfield rip/breeze/client/BreezeIterable.items Ljava/util/List;
      // 26: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 2b: ifeq 3d
      // 2e: goto 35
      // 31: invokestatic rip/breeze/client/BreezeIterable.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3e
      // 39: invokestatic rip/breeze/client/BreezeIterable.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // try (4 -> 10): 11 java/lang/IllegalStateException
      // try (7 -> 20): 21 java/lang/IllegalStateException
      // try (13 -> 25): 25 java/lang/IllegalStateException
   }

   @Override
   public int hashCode() {
      return this.items.hashCode();
   }

   public static void initialize(int var0) {
      fieldInt_c = var0;
   }

   public static int getValue_3() {
      return fieldInt_c;
   }

   public static int getValue_4() {
      int var0 = getValue_3();

      try {
         return var0 == 0 ? 114 : 0;
      } catch (IllegalStateException var1) {
         throw getIllegalStateException(var1);
      }
   }

   static {
      if (getValue_4() != 0) {
         initialize(11);
      }
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
   }
}
