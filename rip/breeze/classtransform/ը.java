package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ը {
   private final rip.breeze.inject.é é_ÿ;
   private final String string_þ;
   private final String string_ý;
   private final Set<String> set_ü;
   private final int int_û;
   final ժ ժ_ú;

   private ը(ժ var1, short var2, int var3, rip.breeze.inject.é var4, char var5) {
      String[] var8;
      label42: {
         long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ encKey_a;
         this.ժ_ú = var1;
         String[] var10000 = ժ.method_004();
         super();
         this.é_ÿ = var4;
         this.string_þ = MathUtil3.buildString(new Object[]{var4.string_ú_2});
         this.string_ý = var4.string_ø_2;
         var8 = var10000;
         this.set_ü = new HashSet<>();
         ը var11 = this;
         if (var8 != null) {
            if (this.string_ý == null) {
               break label42;
            }

            var11 = this;
         }

         var11.set_ü.add(MathUtil3.buildString(new Object[]{this.string_ý}));
      }

      label45: {
         List var12 = var4.list_ö_2;
         if (var8 != null) {
            if (var4.list_ö_2 == null) {
               break label45;
            }

            var12 = var4.list_ö_2;
         }

         for (String var10 : var12) {
            this.set_ü.add(MathUtil3.buildString(new Object[]{var10}));
            String[] var13 = var8;
            if (var2 >= 0) {
               if (var8 == null) {
                  return;
               }

               var13 = var8;
            }

            if (var13 == null) {
               break;
            }
         }
      }

      this.int_û = var4.int_û_2;
      if (var5 > 0) {
      }
   }

   public rip.breeze.inject.é getÉ_ÿ() {
      return this.é_ÿ;
   }

   public String getString(Object[] var1) {
      return this.string_þ;
   }

   public ը getԸ(Object[] param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/classtransform/է
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/classtransform/ը.encKey_a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 30111108491011
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: invokestatic rip/breeze/classtransform/ժ.method_004 ()[Ljava/lang/String;
      // 25: astore 7
      // 27: aload 0
      // 28: aload 7
      // 2a: ifnull 65
      // 2d: getfield rip/breeze/classtransform/ը.string_ý Ljava/lang/String;
      // 30: ifnonnull 40
      // 33: goto 3a
      // 36: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 39: athrow
      // 3a: aconst_null
      // 3b: areturn
      // 3c: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/classtransform/ը.ժ_ú Lrip/breeze/classtransform/ժ;
      // 44: lload 5
      // 46: aload 2
      // 47: aload 0
      // 48: getfield rip/breeze/classtransform/ը.string_ý Ljava/lang/String;
      // 4b: bipush 3
      // 4c: anewarray 4
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 2
      // 52: swap
      // 53: aastore
      // 54: dup_x1
      // 55: swap
      // 56: bipush 1
      // 57: swap
      // 58: aastore
      // 59: dup_x2
      // 5a: dup_x2
      // 5b: pop
      // 5c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f: bipush 0
      // 60: swap
      // 61: aastore
      // 62: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 65: areturn
      // try (25 -> 30): 31 java/lang/ClassNotFoundException
      // try (28 -> 35): 35 java/lang/ClassNotFoundException
   }

   public Set invoke_3(Object[] var1) {
      return Collections.unmodifiableSet(this.set_ü);
   }

   public Set invoke_4(Object[] param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/classtransform/է
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Boolean
      // 19: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c: istore 5
      // 1e: pop
      // 1f: getstatic rip/breeze/classtransform/ը.encKey_a J
      // 22: lload 2
      // 23: lxor
      // 24: lstore 2
      // 25: lload 2
      // 26: dup2
      // 27: ldc2_w 68369663139840
      // 2a: lxor
      // 2b: lstore 6
      // 2d: pop2
      // 2e: invokestatic rip/breeze/classtransform/ժ.method_004 ()[Ljava/lang/String;
      // 31: new java/util/HashSet
      // 34: dup
      // 35: invokespecial java/util/HashSet.<init> ()V
      // 38: astore 8
      // 3a: astore 9
      // 3c: iload 5
      // 3e: aload 9
      // 40: ifnull 5c
      // 43: ifeq 5d
      // 46: goto 4d
      // 49: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 4c: athrow
      // 4d: aload 8
      // 4f: aload 0
      // 50: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 55: goto 5c
      // 58: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 5b: athrow
      // 5c: pop
      // 5d: aload 0
      // 5e: getfield rip/breeze/classtransform/ը.set_ü Ljava/util/Set;
      // 61: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 66: astore 10
      // 68: aload 10
      // 6a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6f: ifeq df
      // 72: aload 10
      // 74: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 79: checkcast java/lang/String
      // 7c: astore 11
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt b5
      // 84: aload 8
      // 86: aload 9
      // 88: ifnull e1
      // 8b: aload 0
      // 8c: getfield rip/breeze/classtransform/ը.ժ_ú Lrip/breeze/classtransform/ժ;
      // 8f: lload 6
      // 91: aload 4
      // 93: aload 11
      // 95: bipush 3
      // 96: anewarray 4
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 2
      // 9c: swap
      // 9d: aastore
      // 9e: dup_x1
      // 9f: swap
      // a0: bipush 1
      // a1: swap
      // a2: aastore
      // a3: dup_x2
      // a4: dup_x2
      // a5: pop
      // a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a9: bipush 0
      // aa: swap
      // ab: aastore
      // ac: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // af: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // b4: pop
      // b5: aload 9
      // b7: ifnonnull 68
      // ba: lload 2
      // bb: lconst_0
      // bc: lcmp
      // bd: ifle 7e
      // c0: goto c7
      // c3: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // c6: athrow
      // c7: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // ca: lload 2
      // cb: lconst_0
      // cc: lcmp
      // cd: ifle d4
      // d0: ifeq db
      // d3: bipush 0
      // d4: goto dc
      // d7: invokestatic rip/breeze/classtransform/ը.getClassNotFoundException (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // da: athrow
      // db: bipush 1
      // dc: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // df: aload 8
      // e1: areturn
      // try (35 -> 39): 40 java/lang/ClassNotFoundException
      // try (38 -> 45): 46 java/lang/ClassNotFoundException
      // try (60 -> 96): 101 java/lang/ClassNotFoundException
      // try (103 -> 111): 111 java/lang/ClassNotFoundException
   }

   public int getValue(Object[] var1) {
      return this.int_û;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 20272872937815L;
      String[] var4 = ժ.method_004();
      Object var10000 = this;
      if (var4 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var4 != null) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         ը var5 = (ը)var10000;
         return Objects.equals(this.string_þ, var5.string_þ);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.string_þ);
   }

   ը(ժ var1, rip.breeze.inject.é var2, թ var3, long var4) {
      var4 = encKey_a ^ var4;
      long var10001 = var4 ^ 123294440071558L;
      int var6 = (int)((var4 ^ 123294440071558L) >>> 48);
      int var7 = (int)((var4 ^ 123294440071558L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      this(var1, (short)var6, var7, var2, (char)var8);
   }

   static Set invoke_6(Object[] var0) {
      ը var1 = (ը)var0[0];
      return var1.set_ü;
   }

   private static ClassNotFoundException getClassNotFoundException(ClassNotFoundException var0) {
      return var0;
   }
}
