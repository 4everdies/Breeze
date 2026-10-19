package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ք {
   private static int[] arr_ÿ_2;
   private static final String[] CONST_C_2;
   private static final String[] CONST_D_2;
   private static final Map CONST_E_2 = new HashMap(13);

   public String invoke_6(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 113318034844623L;
      long var7 = var2 ^ 121350582028123L;
      return this.method_007(new Object[]{MathUtil3.getDataBuilder(var4), var7}).buildString_5(new Object[]{var5});
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private MathUtil3 invoke_7(Object[] var1) {
      MathUtil3 var2 = (MathUtil3)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 9218505711755L;
      long var7 = var3 ^ 8888257639527L;
      long var9 = var3 ^ 63202627622293L;
      long var11 = var3 ^ 51009673147470L;
      long var13 = var3 ^ 75450539717543L;
      long var15 = var3 ^ 1394758326515L;
      int[] var17 = method_020();
      MathUtil3 var10000 = var2;
      if (var17 != null) {
         switch (var2.getValue(new Object[]{var11})) {
            case 9:
               StringBuilder var18 = new StringBuilder();
               int var21 = 0;

               while (true) {
                  if (var21 < var2.calculate_2(new Object[]{var5})) {
                     StringBuilder var24 = var18.append('[');
                     if (var3 <= 0L) {
                        return MathUtil3.getDataBuilder(var24.toString());
                     }

                     var21++;
                     if (var17 == null) {
                        return MathUtil3.getDataBuilder(var18.toString());
                     }

                     if (var17 != null) {
                        continue;
                     }
                  }

                  do {
                     var18.append(this.method_007(new Object[]{var2.getDataBuilder_5(new Object[]{var9}), var15}).buildString_5(new Object[]{var7}));
                     if (var3 >= 0L || var17 == null) {
                        return MathUtil3.getDataBuilder(var18.toString());
                     }
                  } while (var17 == null);
               }
            case 10:
               String var19 = this.method_005(new Object[]{var2.buildString_3(new Object[0])});
               String var22 = var19;
               if (var17 != null) {
                  if (var19 == null) {
                     return var2;
                  }

                  var22 = var19;
               }

               return MathUtil3.getDataBuilder_6(var22);
            case 11:
               return MathUtil3.getDataBuilder_7(new Object[]{this.method_010(new Object[]{var13, var2.buildString_5(new Object[]{var7})})});
            default:
               var10000 = var2;
         }
      }

      return var10000;
   }

   public String invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 20887126727007L;
      int[] var7 = method_020();
      String var10000 = var4;
      if (var7 != null) {
         if (var4 == null) {
            return null;
         }

         var10000 = this.method_007(new Object[]{MathUtil3.getDataBuilder_6(var4), var5}).buildString_3(new Object[0]);
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public String[] invoke_9(Object[] var1) {
      String[] var2 = (String[])var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 116797154429811L;
      int[] var10000 = method_020();
      String[] var7 = null;
      int[] var8 = var10000;
      int var9 = 0;

      label61:
      while (true) {
         String[] var13;
         if (var9 < var2.length) {
            var13 = var2;
         } else {
            var13 = var7;
            if (var3 >= 0L) {
               if (var8 == null) {
                  return var7;
               }

               if (var7 != null) {
                  return var7;
               }
               break;
            }
         }

         do {
            String var10 = var13[var9];
            String var11 = this.method_008(new Object[]{var5, var10});
            var10000 = var8;
            if (var3 > 0L) {
               if (var8 == null) {
                  return var2;
               }

               var10000 = var8;
            }

            if (var3 > 0L) {
               if (var10000 != null) {
                  if (var11 != null) {
                     String[] var15 = var7;
                     if (var8 != null) {
                        if (var7 == null) {
                           var7 = (String[])var2.clone();
                        }

                        var15 = var7;
                     }

                     var15[var9] = var11;
                  }

                  var9++;
               }

               var10000 = var8;
            }

            if (var10000 != null) {
               continue label61;
            }

            var13 = var7;
         } while (var3 < 0L);

         if (var8 == null) {
            return var7;
         }

         if (var7 != null) {
            return var7;
         }
         break;
      }

      return var2;
   }

   public String invoke_10(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 85551352733491L;
      long var7 = var2 ^ 85999079642542L;
      long var9 = var2 ^ 73922536096434L;
      long var11 = var2 ^ 75450539717543L;
      int[] var13 = method_020();
      String var10000 = method_022(32726, 2142964217494460040L ^ var2);
      if (var13 != null) {
         if (!var10000.equals(var4)) {
            StringBuilder var14 = new StringBuilder("(");
            MathUtil3[] var15 = MathUtil3.clamp(new Object[]{var9, var4});
            int var16 = var15.length;
            int var17 = 0;

            while (true) {
               if (var17 < var16) {
                  var21 = var15[var17];
                  if (var13 == null) {
                     break;
                  }

                  MathUtil3 var18 = var21;
                  var14.append(this.method_007(new Object[]{var18, var11}).buildString_5(new Object[]{var5}));
                  var17++;
                  if (var13 != null) {
                     continue;
                  }
               }

               var21 = MathUtil3.getDataBuilder_10(new Object[]{var4, var7});
               break;
            }

            label29: {
               var20 = var21;
               int[] var22 = var13;
               if (var2 > 0L) {
                  if (var13 != null) {
                     if (var20 != MathUtil3.CONST_Ð) {
                        break label29;
                     }

                     var14.append(method_022(8730, 7975377346762345285L ^ var2));
                  }

                  var22 = var13;
               }

               if (var22 != null) {
                  return var14.toString();
               }
            }

            var14.append(')').append(this.method_007(new Object[]{var20, var11}).buildString_5(new Object[]{var5}));
            return var14.toString();
         }

         var10000 = var4;
      }

      return var10000;
   }

   public Object call_11(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:50 from source 47_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Object
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/ք.encKey_a_2 J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 47602663247516
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 52216264731458
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 78870519278261
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 58701387997538
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 108866150583194
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 123939735734838
      // 041: lxor
      // 042: lstore 15
      // 044: dup2
      // 045: ldc2_w 34782451520926
      // 048: lxor
      // 049: lstore 17
      // 04b: dup2
      // 04c: ldc2_w 1394758326515
      // 04f: lxor
      // 050: lstore 19
      // 052: pop2
      // 053: invokestatic rip/breeze/inject/ք.method_020 ()[I
      // 056: astore 21
      // 058: aload 2
      // 059: instanceof rip/breeze/inject/MathUtil3
      // 05c: aload 21
      // 05e: ifnull 085
      // 061: ifeq 081
      // 064: aload 0
      // 065: aload 2
      // 066: checkcast rip/breeze/inject/MathUtil3
      // 069: lload 15
      // 06b: bipush 2
      // 06c: anewarray 4
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: invokevirtual rip/breeze/inject/ք.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 080: areturn
      // 081: aload 2
      // 082: instanceof rip/breeze/inject/º
      // 085: aload 21
      // 087: ifnull 1c6
      // 08a: ifeq 1bd
      // 08d: aload 2
      // 08e: checkcast rip/breeze/inject/º
      // 091: astore 22
      // 093: aload 22
      // 095: bipush 0
      // 096: anewarray 4
      // 099: invokevirtual rip/breeze/inject/º.method_001 ([Ljava/lang/Object;)I
      // 09c: aload 21
      // 09e: ifnull 0a6
      // 0a1: bipush 4
      // 0a2: if_icmpgt 0a9
      // 0a5: bipush 1
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: istore 23
      // 0ac: new rip/breeze/inject/º
      // 0af: dup
      // 0b0: aload 22
      // 0b2: bipush 0
      // 0b3: anewarray 4
      // 0b6: invokevirtual rip/breeze/inject/º.method_001 ([Ljava/lang/Object;)I
      // 0b9: aload 0
      // 0ba: aload 22
      // 0bc: bipush 0
      // 0bd: anewarray 4
      // 0c0: invokevirtual rip/breeze/inject/º.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0c3: lload 13
      // 0c5: dup2_x1
      // 0c6: pop2
      // 0c7: bipush 2
      // 0c8: anewarray 4
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 1
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x2
      // 0d1: dup_x2
      // 0d2: pop
      // 0d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d6: bipush 0
      // 0d7: swap
      // 0d8: aastore
      // 0d9: invokevirtual rip/breeze/inject/ք.method_008 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0dc: iload 23
      // 0de: ifeq 123
      // 0e1: aload 0
      // 0e2: aload 22
      // 0e4: bipush 0
      // 0e5: anewarray 4
      // 0e8: invokevirtual rip/breeze/inject/º.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0eb: lload 9
      // 0ed: dup2_x1
      // 0ee: pop2
      // 0ef: aload 22
      // 0f1: bipush 0
      // 0f2: anewarray 4
      // 0f5: invokevirtual rip/breeze/inject/º.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0f8: aload 22
      // 0fa: bipush 0
      // 0fb: anewarray 4
      // 0fe: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 101: bipush 4
      // 102: anewarray 4
      // 105: dup_x1
      // 106: swap
      // 107: bipush 3
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 2
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 0
      // 11b: swap
      // 11c: aastore
      // 11d: invokevirtual rip/breeze/inject/ք.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 120: goto 162
      // 123: aload 0
      // 124: aload 22
      // 126: bipush 0
      // 127: anewarray 4
      // 12a: invokevirtual rip/breeze/inject/º.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 12d: aload 22
      // 12f: bipush 0
      // 130: anewarray 4
      // 133: invokevirtual rip/breeze/inject/º.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 136: aload 22
      // 138: bipush 0
      // 139: anewarray 4
      // 13c: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 13f: lload 5
      // 141: dup2_x1
      // 142: pop2
      // 143: bipush 4
      // 144: anewarray 4
      // 147: dup_x1
      // 148: swap
      // 149: bipush 3
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: invokevirtual rip/breeze/inject/ք.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 162: iload 23
      // 164: ifeq 18d
      // 167: aload 0
      // 168: aload 22
      // 16a: bipush 0
      // 16b: anewarray 4
      // 16e: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 171: lload 17
      // 173: dup2_x1
      // 174: pop2
      // 175: bipush 2
      // 176: anewarray 4
      // 179: dup_x1
      // 17a: swap
      // 17b: bipush 1
      // 17c: swap
      // 17d: aastore
      // 17e: dup_x2
      // 17f: dup_x2
      // 180: pop
      // 181: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: invokevirtual rip/breeze/inject/ք.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 18a: goto 1b0
      // 18d: aload 0
      // 18e: aload 22
      // 190: bipush 0
      // 191: anewarray 4
      // 194: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 197: lload 11
      // 199: dup2_x1
      // 19a: pop2
      // 19b: bipush 2
      // 19c: anewarray 4
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 1
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 0
      // 1ab: swap
      // 1ac: aastore
      // 1ad: invokevirtual rip/breeze/inject/ք.method_010 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1b0: aload 22
      // 1b2: bipush 0
      // 1b3: anewarray 4
      // 1b6: invokevirtual rip/breeze/inject/º.method_005 ([Ljava/lang/Object;)Z
      // 1b9: invokespecial rip/breeze/inject/º.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 1bc: areturn
      // 1bd: aload 2
      // 1be: aload 21
      // 1c0: ifnull 2a5
      // 1c3: instanceof rip/breeze/inject/è
      // 1c6: ifeq 2a4
      // 1c9: aload 2
      // 1ca: checkcast rip/breeze/inject/è
      // 1cd: astore 22
      // 1cf: aload 22
      // 1d1: bipush 0
      // 1d2: anewarray 4
      // 1d5: invokevirtual rip/breeze/inject/è.method_004 ([Ljava/lang/Object;)I
      // 1d8: istore 23
      // 1da: iload 23
      // 1dc: anewarray 4
      // 1df: astore 24
      // 1e1: bipush 0
      // 1e2: istore 25
      // 1e4: iload 25
      // 1e6: iload 23
      // 1e8: if_icmpge 223
      // 1eb: aload 24
      // 1ed: iload 25
      // 1ef: aload 0
      // 1f0: aload 22
      // 1f2: iload 25
      // 1f4: bipush 1
      // 1f5: anewarray 4
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fd: bipush 0
      // 1fe: swap
      // 1ff: aastore
      // 200: invokevirtual rip/breeze/inject/è.method_005 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 203: lload 19
      // 205: bipush 2
      // 206: anewarray 4
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x1
      // 213: swap
      // 214: bipush 0
      // 215: swap
      // 216: aastore
      // 217: invokevirtual rip/breeze/inject/ք.method_011 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 21a: aastore
      // 21b: iinc 25 1
      // 21e: aload 21
      // 220: ifnonnull 1e4
      // 223: lload 3
      // 224: lconst_0
      // 225: lcmp
      // 226: ifle 21e
      // 229: aload 22
      // 22b: bipush 0
      // 22c: anewarray 4
      // 22f: invokevirtual rip/breeze/inject/è.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 232: astore 25
      // 234: new rip/breeze/inject/è
      // 237: dup
      // 238: aload 0
      // 239: aload 22
      // 23b: bipush 0
      // 23c: anewarray 4
      // 23f: invokevirtual rip/breeze/inject/è.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 242: aload 25
      // 244: lload 7
      // 246: bipush 3
      // 247: anewarray 4
      // 24a: dup_x2
      // 24b: dup_x2
      // 24c: pop
      // 24d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 250: bipush 2
      // 251: swap
      // 252: aastore
      // 253: dup_x1
      // 254: swap
      // 255: bipush 1
      // 256: swap
      // 257: aastore
      // 258: dup_x1
      // 259: swap
      // 25a: bipush 0
      // 25b: swap
      // 25c: aastore
      // 25d: invokevirtual rip/breeze/inject/ք.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 260: aload 0
      // 261: lload 17
      // 263: aload 25
      // 265: bipush 2
      // 266: anewarray 4
      // 269: dup_x1
      // 26a: swap
      // 26b: bipush 1
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 0
      // 275: swap
      // 276: aastore
      // 277: invokevirtual rip/breeze/inject/ք.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 27a: aload 0
      // 27b: aload 22
      // 27d: bipush 0
      // 27e: anewarray 4
      // 281: invokevirtual rip/breeze/inject/è.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/º;
      // 284: lload 19
      // 286: bipush 2
      // 287: anewarray 4
      // 28a: dup_x2
      // 28b: dup_x2
      // 28c: pop
      // 28d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 290: bipush 1
      // 291: swap
      // 292: aastore
      // 293: dup_x1
      // 294: swap
      // 295: bipush 0
      // 296: swap
      // 297: aastore
      // 298: invokevirtual rip/breeze/inject/ք.method_011 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 29b: checkcast rip/breeze/inject/º
      // 29e: aload 24
      // 2a0: invokespecial rip/breeze/inject/è.<init> (Ljava/lang/String;Ljava/lang/String;Lrip/breeze/inject/º;[Ljava/lang/Object;)V
      // 2a3: areturn
      // 2a4: aload 2
      // 2a5: areturn
   }

   public String invoke_12(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 102698936353045L;
      long var8 = var3 ^ 56238401346412L;
      long var10 = var3 ^ 62648036902861L;
      long var12 = var3 ^ 72727625054974L;
      int[] var14 = method_020();
      if (var2 == null) {
         return null;
      }

      տ var15;
      ռ var16;
      վ var17;
      label23: {
         var15 = new տ(var2);
         var16 = new ռ(var12);
         var17 = this.method_014(new Object[]{var6, var16});
         int[] var10000 = var14;
         if (var3 >= 0L) {
            if (var14 != null) {
               if (!var5) {
                  break label23;
               }

               var15.method_002(new Object[]{var17, var10});
            }

            var10000 = var14;
         }

         if (var10000 != null) {
            return var16.toString();
         }
      }

      var15.method_001(new Object[]{var8, var17});
      return var16.toString();
   }

   @Deprecated
   protected վ invoke_13(Object[] var1) {
      long var2 = (Long)var1[0];
      վ var4 = (վ)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 71200109237750L;
      return this.method_014(new Object[]{var5, var4});
   }

   protected վ invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
      վ var4 = (վ)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 9553218641468L;
      return new ս(var4, var5, this);
   }

   public String invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      return (String)var1[2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public String invoke_15(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      var2 = encKey_a_2 ^ var2;
      long var7 = var2 ^ 83860525287467L;
      int[] var10000 = method_020();
      String var9 = this.method_008(new Object[]{var7, var4});
      int[] var10 = var10000;
      int var15 = var9.equals(var4);
      if (var10 != null) {
         if (var15 != 0) {
            return var6;
         }

         var15 = var4.lastIndexOf(47);
      }

      int var11 = var15;
      int var12 = var9.lastIndexOf(47);
      var16 = var11;
      label69:
      if (var10 != null) {
         if (var11 != -1) {
            var16 = var12;
            if (var10 == null) {
               break label69;
            }

            if (var12 != -1) {
               var16 = var4.substring(var11).equals(var9.substring(var12));
               if (var10 == null) {
                  break label69;
               }

               if (var16 != 0) {
                  return var6;
               }
            }
         }

         if (var10 == null) {
            return var9;
         }

         var16 = var9.contains("$");
      }

      if (var16 != 0) {
         var11 = var9.lastIndexOf(36) + 1;

         int var10001;
         label53:
         while (true) {
            if (var11 < var9.length()) {
               var18 = var9;
            } else {
               var18 = var9;
               if (var2 >= 0L) {
                  var10001 = var11;
                  break;
               }
            }

            do {
               int[] var10002 = var10;
               if (var2 > 0L) {
                  if (var10 == null) {
                     return var18.substring(var11);
                  }

                  var10002 = var10;
               }

               if (var10002 == null) {
                  return var18.substring(var11);
               }

               if (Character.isDigit(var18.charAt(var11))) {
                  var11++;
                  if (var10 != null) {
                     continue label53;
                  }
               }

               var18 = var9;
            } while (var2 < 0L);

            var10001 = var11;
            break;
         }

         return var18.substring(var10001);
      } else {
         return var6;
      }
   }

   public String invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      String var6 = (String)var1[3];
      return var3;
   }

   public String invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      return var2;
   }

   public String invoke_16(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      return var3;
   }

   public String invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      return var5;
   }

   public String invoke_17(Object[] var1) {
      return (String)var1[0];
   }

   public String invoke_18(Object[] var1) {
      return (String)var1[0];
   }

   public String invoke_5(Object[] var1) {
      return (String)var1[0];
   }

   public static void execute_19(int[] var0) {
      arr_ÿ_2 = var0;
   }

   public static int[] invoke_20() {
      return arr_ÿ_2;
   }

   static {
      int[] var10000 = new int[3];
      method_019(var10000);
      long var0 = 42666045009888L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "\u001erÖ%s]\\£ô\u001c\u0088\u0097s\u009f\u001dr\u0010Pøv.Þ\u0082\u009eÇö\u0091h<Ó\u007f\u0096J";
      int var7 = "\u001erÖ%s]\\£ô\u001c\u0088\u0097s\u009f\u001dr\u0010Pøv.Þ\u0082\u009eÇö\u0091h<Ó\u007f\u0096J".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_021(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_C_2 = var4;
            CONST_D_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_21(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String invoke_22(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21734;
      if (CONST_D_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ք", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C_2[var3].getBytes("ISO-8859-1");
         CONST_D_2[var3] = method_021(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D_2[var3];
   }
}
