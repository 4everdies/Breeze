package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public class õ extends rip.breeze.inject.í {
   private final ժ ժ_w_2;
   private final է է_v_2;

   public õ(ժ var1, long var2, է var4) {
      var2 = encKey_c_2 ^ var2;
      long var5 = var2 ^ 87232358349344L;
      this(2, var1, var5, var4);
   }

   public õ(int var1, ժ var2, long var3, է var5) {
      var3 = encKey_c_2 ^ var3;
      long var6 = var3 ^ 107870544629879L;
      super(var1, var6);
      this.ժ_w_2 = var2;
      this.է_v_2 = var5;
   }

   @Override
   protected String invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      long var6 = var3 ^ 48516580927935L;
      long var8 = var3 ^ 90369423704217L;
      String[] var10 = ժ.method_004();
      String var10000 = var2;
      if (var10 != null) {
         label54: {
            boolean var11 = var2.equals(ջ.CONST_Þ_2);
            if (var3 > 0L) {
               if (var11) {
                  break label54;
               }

               var11 = var5.equals(ջ.CONST_Þ_2);
            }

            if (var10 != null) {
               if (var11) {
                  break label54;
               }

               if (var3 < 0L) {
                  return this.method_002(var10);
               }

               if (var10 == null) {
                  return this.method_002(new Object[]{var2, var6, var5});
               }

               var11 = this.է_v_2.method_003(new Object[0]);
            }

            if (var11) {
               return this.method_001(new Object[]{var2, var5, var8});
            }

            return this.method_002(new Object[]{var2, var6, var5});
         }

         var10000 = ջ.CONST_Þ_2;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private String invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_c_2 ^ var4;
      String[] var10000 = ժ.method_004();
      List var6 = Arrays.asList(this.է_v_2.getSuperClasses(var2));
      String[] var7 = var10000;
      List var8 = Arrays.asList(this.է_v_2.getSuperClasses(var3));
      boolean var11 = var8.contains(var2);
      if (var7 != null) {
         if (var11) {
            return var2;
         }

         var11 = var6.contains(var3);
      }

      String[] var10001 = var7;
      if (var4 > 0L) {
         if (var7 != null) {
            if (var11) {
               return var3;
            }

            var11 = this.է_v_2.isInterface(var2);
         }

         var10001 = var7;
      }

      label84: {
         if (var10001 != null) {
            if (var11) {
               return ջ.CONST_Þ_2;
            }

            if (var7 == null) {
               var2 = this.է_v_2.getSuperClass(var3);
               if (var2 == null) {
                  return ջ.CONST_Þ_2;
               }
               break label84;
            }

            if (this.է_v_2.isInterface(var3)) {
               return ջ.CONST_Þ_2;
            }
         } else if (var11) {
            return ջ.CONST_Þ_2;
         }

         var2 = this.է_v_2.getSuperClass(var2);
         if (var2 == null) {
            return ջ.CONST_Þ_2;
         }
      }

      do {
         while (!var8.contains(var2)) {
            var2 = this.է_v_2.getSuperClass(var2);
            if (var2 == null) {
               return ջ.CONST_Þ_2;
            }
         }

         if (var4 >= 0L) {
            if (var7 != null) {
               return var2;
            }

            return var2;
         }
      } while (var2 != null);

      return ջ.CONST_Þ_2;
   }

   private String invoke_2(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/õ.encKey_c_2 J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 36418366705795
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 37633998541255
      // 02d: lxor
      // 02e: lstore 8
      // 030: pop2
      // 031: invokestatic rip/breeze/classtransform/ժ.method_004 ()[Ljava/lang/String;
      // 034: aconst_null
      // 035: astore 10
      // 037: aconst_null
      // 038: astore 11
      // 03a: astore 12
      // 03c: aload 0
      // 03d: getfield rip/breeze/classtransform/õ.ժ_w_2 Lrip/breeze/classtransform/ժ;
      // 040: aload 0
      // 041: getfield rip/breeze/classtransform/õ.է_v_2 Lrip/breeze/classtransform/է;
      // 044: lload 8
      // 046: dup2_x1
      // 047: pop2
      // 048: aload 2
      // 049: bipush 3
      // 04a: anewarray 65
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x1
      // 053: swap
      // 054: bipush 1
      // 055: swap
      // 056: aastore
      // 057: dup_x2
      // 058: dup_x2
      // 059: pop
      // 05a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 063: astore 10
      // 065: aload 0
      // 066: getfield rip/breeze/classtransform/õ.ժ_w_2 Lrip/breeze/classtransform/ժ;
      // 069: aload 0
      // 06a: getfield rip/breeze/classtransform/õ.է_v_2 Lrip/breeze/classtransform/է;
      // 06d: lload 8
      // 06f: dup2_x1
      // 070: pop2
      // 071: aload 5
      // 073: bipush 3
      // 074: anewarray 65
      // 077: dup_x1
      // 078: swap
      // 079: bipush 2
      // 07a: swap
      // 07b: aastore
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 08d: astore 11
      // 08f: goto 0a2
      // 092: astore 13
      // 094: aload 13
      // 096: bipush 1
      // 097: anewarray 65
      // 09a: dup_x1
      // 09b: swap
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: invokestatic rip/breeze/classtransform/ս.method_001 ([Ljava/lang/Object;)V
      // 0a2: aload 11
      // 0a4: bipush 0
      // 0a5: anewarray 65
      // 0a8: invokevirtual rip/breeze/classtransform/ը.method_003 ([Ljava/lang/Object;)Ljava/util/Set;
      // 0ab: aload 10
      // 0ad: bipush 0
      // 0ae: anewarray 65
      // 0b1: invokevirtual rip/breeze/classtransform/ը.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0b4: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0b9: aload 12
      // 0bb: lload 3
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 0ed
      // 0c1: ifnull 0eb
      // 0c4: ifeq 0d4
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 0cd: athrow
      // 0ce: aload 2
      // 0cf: areturn
      // 0d0: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 0d3: athrow
      // 0d4: aload 10
      // 0d6: bipush 0
      // 0d7: anewarray 65
      // 0da: invokevirtual rip/breeze/classtransform/ը.method_003 ([Ljava/lang/Object;)Ljava/util/Set;
      // 0dd: aload 11
      // 0df: bipush 0
      // 0e0: anewarray 65
      // 0e3: invokevirtual rip/breeze/classtransform/ը.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0e6: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0eb: aload 12
      // 0ed: lload 3
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 115
      // 0f3: ifnull 113
      // 0f6: ifeq 107
      // 0f9: goto 100
      // 0fc: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 0ff: athrow
      // 100: aload 5
      // 102: areturn
      // 103: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 106: athrow
      // 107: aload 10
      // 109: bipush 0
      // 10a: anewarray 65
      // 10d: invokevirtual rip/breeze/classtransform/ը.getValue ([Ljava/lang/Object;)I
      // 110: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 113: aload 12
      // 115: ifnull 147
      // 118: ifne 1d2
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 121: athrow
      // 122: lload 3
      // 123: lconst_0
      // 124: lcmp
      // 125: iflt 169
      // 128: aload 11
      // 12a: aload 12
      // 12c: ifnull 167
      // 12f: goto 136
      // 132: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 135: athrow
      // 136: bipush 0
      // 137: anewarray 65
      // 13a: invokevirtual rip/breeze/classtransform/ը.getValue ([Ljava/lang/Object;)I
      // 13d: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 140: goto 147
      // 143: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 146: athrow
      // 147: ifne 1d2
      // 14a: aload 10
      // 14c: aload 0
      // 14d: getfield rip/breeze/classtransform/õ.է_v_2 Lrip/breeze/classtransform/է;
      // 150: lload 6
      // 152: bipush 2
      // 153: anewarray 65
      // 156: dup_x2
      // 157: dup_x2
      // 158: pop
      // 159: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15c: bipush 1
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: invokevirtual rip/breeze/classtransform/ը.getԸ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 167: astore 10
      // 169: goto 17c
      // 16c: astore 13
      // 16e: aload 13
      // 170: bipush 1
      // 171: anewarray 65
      // 174: dup_x1
      // 175: swap
      // 176: bipush 0
      // 177: swap
      // 178: aastore
      // 179: invokestatic rip/breeze/classtransform/ս.method_001 ([Ljava/lang/Object;)V
      // 17c: aload 10
      // 17e: aload 12
      // 180: lload 3
      // 181: lconst_0
      // 182: lcmp
      // 183: ifle 19d
      // 186: ifnull 199
      // 189: ifnonnull 197
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/classtransform/õ.method_003 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 192: athrow
      // 193: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 196: areturn
      // 197: aload 11
      // 199: bipush 0
      // 19a: anewarray 65
      // 19d: invokevirtual rip/breeze/classtransform/ը.method_003 ([Ljava/lang/Object;)Ljava/util/Set;
      // 1a0: aload 10
      // 1a2: bipush 0
      // 1a3: anewarray 65
      // 1a6: invokevirtual rip/breeze/classtransform/ը.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 1a9: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 1ae: ifeq 14a
      // 1b1: aload 10
      // 1b3: bipush 0
      // 1b4: anewarray 65
      // 1b7: invokevirtual rip/breeze/classtransform/ը.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 1ba: bipush 1
      // 1bb: anewarray 65
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: invokestatic rip/breeze/classtransform/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1c6: lload 3
      // 1c7: lconst_0
      // 1c8: lcmp
      // 1c9: iflt 196
      // 1cc: aload 12
      // 1ce: ifnull 196
      // 1d1: areturn
      // 1d2: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 1d5: areturn
      // try (38 -> 96): 97 java/lang/ClassNotFoundException
      // try (164 -> 178): 179 java/lang/ClassNotFoundException
      // try (160 -> 171): 172 java/lang/ClassNotFoundException
      // try (158 -> 161): 162 java/lang/ClassNotFoundException
      // try (145 -> 151): 151 java/lang/ClassNotFoundException
      // try (139 -> 146): 147 java/lang/ClassNotFoundException
      // try (122 -> 128): 128 java/lang/ClassNotFoundException
      // try (107 -> 123): 124 java/lang/ClassNotFoundException
      // try (182 -> 202): 203 java/lang/ClassNotFoundException
      // try (213 -> 221): 222 java/lang/ClassNotFoundException
   }

   private static ClassNotFoundException invoke_3(ClassNotFoundException var0) {
      return var0;
   }
}
