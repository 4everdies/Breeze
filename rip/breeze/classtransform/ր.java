package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import rip.breeze.inject.BreezeClass12;

public class ր {

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void invoke_1(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      BreezeClass12 var4 = (BreezeClass12)var0[2];
      String var5 = (String)var0[3];
      var1 = encKey_a_2 ^ var1;
      long var6 = var1 ^ 122629545793331L;
      long var8 = var1 ^ 26987838546307L;
      long var10 = var1 ^ 38732060838917L;
      int var10000 = MathUtil3.getValue_5();
      Iterator var12 = var3.list_ä_2.iterator();
      int var13 = var10000;

      label120:
      while (true) {
         var10000 = var12.hasNext();

         label117:
         while (true) {
            BreezeClass12 var14;
            if (var10000 != 0) {
               var14 = (BreezeClass12)var12.next();
               if (var1 < 0L) {
                  return;
               }

               var10000 = Modifier.isStatic(var4.int_û);
               if (var13 != 0) {
                  return;
               }
            } else {
               if (var1 >= 0L) {
                  var3.list_ä_2.remove(var4);
                  return;
               }

               var14 = (BreezeClass12)var3.list_ä_2;
               if (var1 < 0L) {
                  return;
               }

               var10000 = Modifier.isStatic(var4.int_û);
               if (var13 != 0) {
                  return;
               }
            }

            while (true) {
               int var15;
               label100: {
                  int var10001 = var13;
                  if (var1 >= 0L) {
                     if (var13 == 0) {
                        if (var10000 != 0) {
                           var15 = 184;
                           if (var1 >= 0L) {
                              if (var13 == 0) {
                                 break label100;
                              }

                              var10000 = Modifier.isInterface(var3.int_û_2);
                              var10001 = var13;
                           } else {
                              var10000 = Modifier.isInterface(var13);
                              var10001 = var13;
                           }
                        } else {
                           var10000 = Modifier.isInterface(var3.int_û_2);
                           var10001 = var13;
                        }
                     } else {
                        var10001 = var13;
                     }
                  }

                  if (var10001 == 0) {
                     if (var10000 != 0) {
                        var15 = 185;
                        if (var13 != 0) {
                           var15 = 182;
                        }
                     } else {
                        var15 = 182;
                     }
                  } else {
                     var15 = var10000;
                  }
               }

               String var10004 = var4.string_ú;
               String var10005 = var4.string_ù;
               Object[] var10007 = new Object[]{null, null, var10, var5, var10004, var10005};
               var10007[1] = var15;
               var10007[0] = var14;
               rip.breeze.inject.ջ[] var16 = method_002(var10007);
               rip.breeze.inject.ջ[] var17 = var16;
               int var18 = var17.length;
               int var19 = 0;

               while (true) {
                  if (var19 < var18) {
                     rip.breeze.inject.ջ var20 = var17[var19];
                     method_003(new Object[]{var3.string_ú_2, var14, var20, MathUtil3.getBreezeClass12_2(new Object[]{var6, var4}), var8});
                     var19++;
                     if (var13 != 0) {
                        continue label120;
                     }

                     var10000 = var13;
                     if (var1 <= 0L) {
                        if (var13 != 0) {
                           return;
                        }
                        break;
                     }

                     if (var13 == 0) {
                        continue;
                     }

                     var10000 = var13;
                     if (var1 < 0L) {
                        continue label117;
                     }

                     if (var13 == 0) {
                        continue label120;
                     }
                  } else {
                     var10000 = var13;
                     if (var1 < 0L) {
                        continue label117;
                     }

                     if (var13 == 0) {
                        continue label120;
                     }
                  }

                  if (var1 >= 0L) {
                     var3.list_ä_2.remove(var4);
                     return;
                  }

                  var14 = (BreezeClass12)var3.list_ä_2;
                  if (var1 < 0L) {
                     return;
                  }

                  var10000 = Modifier.isStatic(var4.int_û);
                  if (var13 != 0) {
                     return;
                  }
                  break;
               }
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static rip.breeze.inject.ջ[] invoke_2(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      int var2 = (Integer)var0[1];
      long var3 = (Long)var0[2];
      String var5 = (String)var0[3];
      String var6 = (String)var0[4];
      String var7 = (String)var0[5];
      var3 = encKey_a_2 ^ var3;
      long var8 = var3 ^ 49903477482850L;
      int var10000 = MathUtil3.getValue_5();
      ArrayList var10 = new ArrayList();
      ListIterator var11 = var1.թ_ê.method_008(new Object[]{var8});
      int var12 = var10000;

      label112:
      while (true) {
         Object var16;
         if (var11.hasNext()) {
            var16 = (rip.breeze.inject.կ)var11.next();
         } else {
            var16 = var10.toArray(new rip.breeze.inject.ջ[0]);
            if (var3 > 0L) {
               return var16;
            }
         }

         do {
            label114: {
               rip.breeze.inject.ջ var13;
               label115: {
                  var13 = var16;
                  int var17 = var13 instanceof rip.breeze.inject.կ;
                  int var10001 = var12;
                  if (var3 >= 0L) {
                     if (var12 == 0) {
                        if (var17 == 0) {
                           if (var12 == 0) {
                              continue label112;
                           }
                           break label114;
                        }

                        var16 = var13;
                        if (var3 > 0L) {
                           if (var12 != 0) {
                              break label115;
                           }

                           var17 = var13.method_004(new Object[0]);
                           var10001 = var2;
                        } else {
                           var17 = var13.method_004(new Object[var12]);
                           var10001 = var2;
                        }
                     } else {
                        var10001 = var2;
                     }
                  }

                  if (var17 != var10001) {
                     if (var12 == 0) {
                        continue label112;
                     }
                     break label114;
                  }

                  var16 = var13;
               }

               rip.breeze.inject.կ var14 = var16;
               boolean var19 = var14.string_ç_2.equals(var5);
               int var21 = var12;
               if (var3 >= 0L) {
                  if (var12 == 0) {
                     if (!var19) {
                        if (var12 == 0) {
                           continue label112;
                        }
                        break label114;
                     }

                     var19 = var14.string_æ_2.equals(var6);
                     var21 = var12;
                  } else {
                     var21 = var12;
                  }
               }

               if (var3 >= 0L) {
                  if (var21 == 0) {
                     if (var19) {
                        boolean var20 = var14.string_å_2.equals(var7);
                        if (var12 == 0) {
                           if (var20) {
                              var10.add(var13);
                           }
                        }

                        if (var12 == 0) {
                           continue label112;
                        }
                     } else if (var12 == 0) {
                        continue label112;
                     }
                  } else {
                     if (var12 == 0) {
                        if (var19) {
                           var10.add(var13);
                        }
                     }

                     if (var12 == 0) {
                        continue label112;
                     }
                  }
               } else {
                  if (var21 == 0) {
                     if (var19) {
                        var10.add(var13);
                     }
                  }

                  if (var12 == 0) {
                     continue label112;
                  }
               }
            }

            var16 = var10.toArray(new rip.breeze.inject.ջ[0]);
         } while (var3 <= 0L);

         return var16;
      }
   }

   private static void invoke_3(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/BreezeClass12
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/inject/ջ
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast rip/breeze/inject/BreezeClass12
      // 01c: astore 4
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 5
      // 029: pop
      // 02a: getstatic rip/breeze/classtransform/ր.encKey_a_2 J
      // 02d: lload 5
      // 02f: lxor
      // 030: lstore 5
      // 032: lload 5
      // 034: dup2
      // 035: ldc2_w 73582906429305
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 52137811782211
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 130521893599560
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 57804898525240
      // 04d: lxor
      // 04e: lstore 13
      // 050: dup2
      // 051: ldc2_w 64914161891900
      // 054: lxor
      // 055: lstore 15
      // 057: dup2
      // 058: ldc2_w 26637941738651
      // 05b: lxor
      // 05c: lstore 17
      // 05e: dup2
      // 05f: ldc2_w 117917182991701
      // 062: lxor
      // 063: lstore 19
      // 065: dup2
      // 066: ldc2_w 5975866039479
      // 069: lxor
      // 06a: lstore 21
      // 06c: dup2
      // 06d: ldc2_w 131556863846575
      // 070: lxor
      // 071: lstore 23
      // 073: dup2
      // 074: ldc2_w 54865503859421
      // 077: lxor
      // 078: lstore 25
      // 07a: dup2
      // 07b: ldc2_w 134871338303411
      // 07e: lxor
      // 07f: lstore 27
      // 081: dup2
      // 082: ldc2_w 84695098490497
      // 085: lxor
      // 086: lstore 29
      // 088: dup2
      // 089: ldc2_w 132062465255039
      // 08c: lxor
      // 08d: lstore 31
      // 08f: dup2
      // 090: ldc2_w 121256489737215
      // 093: lxor
      // 094: lstore 33
      // 096: dup2
      // 097: ldc2_w 25093701994724
      // 09a: lxor
      // 09b: lstore 35
      // 09d: dup2
      // 09e: ldc2_w 30145031061196
      // 0a1: lxor
      // 0a2: lstore 37
      // 0a4: pop2
      // 0a5: lload 21
      // 0a7: aload 2
      // 0a8: bipush 2
      // 0a9: anewarray 4
      // 0ac: dup_x1
      // 0ad: swap
      // 0ae: bipush 1
      // 0af: swap
      // 0b0: aastore
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 0
      // 0b8: swap
      // 0b9: aastore
      // 0ba: invokestatic rip/breeze/classtransform/MathUtil3.calculate ([Ljava/lang/Object;)I
      // 0bd: istore 39
      // 0bf: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 0c2: new java/util/HashMap
      // 0c5: dup
      // 0c6: invokespecial java/util/HashMap.<init> ()V
      // 0c9: astore 40
      // 0cb: new java/util/ArrayList
      // 0ce: dup
      // 0cf: invokespecial java/util/ArrayList.<init> ()V
      // 0d2: astore 41
      // 0d4: istore 42
      // 0d6: aload 4
      // 0d8: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0db: lload 27
      // 0dd: dup2_x1
      // 0de: pop2
      // 0df: bipush 2
      // 0e0: anewarray 4
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 1
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 0
      // 0ef: swap
      // 0f0: aastore
      // 0f1: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 0f4: astore 43
      // 0f6: aload 4
      // 0f8: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0fb: lload 23
      // 0fd: bipush 2
      // 0fe: anewarray 4
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 112: astore 44
      // 114: new rip/breeze/inject/ճ
      // 117: dup
      // 118: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 11b: astore 45
      // 11d: new rip/breeze/inject/թ
      // 120: dup
      // 121: invokespecial rip/breeze/inject/թ.<init> ()V
      // 124: astore 46
      // 126: aload 4
      // 128: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 12b: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 12e: iload 42
      // 130: ifne 13e
      // 133: ifeq 141
      // 136: goto 13d
      // 139: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: bipush 0
      // 13e: goto 142
      // 141: bipush 1
      // 142: istore 47
      // 144: aload 43
      // 146: astore 48
      // 148: aload 48
      // 14a: arraylength
      // 14b: istore 49
      // 14d: bipush 0
      // 14e: istore 50
      // 150: iload 50
      // 152: iload 49
      // 154: if_icmpge 204
      // 157: aload 48
      // 159: iload 50
      // 15b: aaload
      // 15c: astore 51
      // 15e: aload 46
      // 160: new rip/breeze/inject/ի
      // 163: dup
      // 164: aload 51
      // 166: bipush 54
      // 168: lload 13
      // 16a: bipush 2
      // 16b: anewarray 4
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 1
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17c: bipush 0
      // 17d: swap
      // 17e: aastore
      // 17f: invokevirtual rip/breeze/inject/MathUtil3.calculate_3 ([Ljava/lang/Object;)I
      // 182: iload 39
      // 184: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 187: lload 11
      // 189: bipush 2
      // 18a: anewarray 4
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 1
      // 194: swap
      // 195: aastore
      // 196: dup_x1
      // 197: swap
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: invokevirtual rip/breeze/inject/թ.method_014 ([Ljava/lang/Object;)V
      // 19e: aload 40
      // 1a0: iload 47
      // 1a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a5: iload 39
      // 1a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1aa: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1af: pop
      // 1b0: iload 39
      // 1b2: aload 51
      // 1b4: lload 29
      // 1b6: bipush 1
      // 1b7: anewarray 4
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 1c6: iadd
      // 1c7: istore 39
      // 1c9: iload 47
      // 1cb: aload 51
      // 1cd: lload 29
      // 1cf: bipush 1
      // 1d0: anewarray 4
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 1df: iadd
      // 1e0: istore 47
      // 1e2: iinc 50 1
      // 1e5: iload 42
      // 1e7: lload 5
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: ifle 1f3
      // 1ee: ifne 261
      // 1f1: iload 42
      // 1f3: ifeq 150
      // 1f6: lload 5
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: ifle 1e5
      // 1fd: goto 204
      // 200: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: lload 5
      // 206: lconst_0
      // 207: lcmp
      // 208: iflt 25e
      // 20b: aload 4
      // 20d: iload 42
      // 20f: ifne 25d
      // 212: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 215: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 218: ifne 261
      // 21b: goto 222
      // 21e: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: aload 46
      // 224: new rip/breeze/inject/ի
      // 227: dup
      // 228: bipush 58
      // 22a: iload 39
      // 22c: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 22f: lload 33
      // 231: bipush 2
      // 232: anewarray 4
      // 235: dup_x2
      // 236: dup_x2
      // 237: pop
      // 238: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23b: bipush 1
      // 23c: swap
      // 23d: aastore
      // 23e: dup_x1
      // 23f: swap
      // 240: bipush 0
      // 241: swap
      // 242: aastore
      // 243: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 246: aload 40
      // 248: bipush 0
      // 249: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24c: iload 39
      // 24e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 251: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 256: goto 25d
      // 259: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: pop
      // 25e: iinc 39 1
      // 261: new rip/breeze/inject/ԥ
      // 264: dup
      // 265: new rip/breeze/inject/ԝ
      // 268: dup
      // 269: lload 17
      // 26b: invokespecial rip/breeze/inject/ԝ.<init> (J)V
      // 26e: invokespecial rip/breeze/inject/ԥ.<init> (Lrip/breeze/inject/ԟ;)V
      // 271: astore 47
      // 273: aload 47
      // 275: lload 9
      // 277: aload 1
      // 278: aload 2
      // 279: bipush 3
      // 27a: anewarray 4
      // 27d: dup_x1
      // 27e: swap
      // 27f: bipush 2
      // 280: swap
      // 281: aastore
      // 282: dup_x1
      // 283: swap
      // 284: bipush 1
      // 285: swap
      // 286: aastore
      // 287: dup_x2
      // 288: dup_x2
      // 289: pop
      // 28a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28d: bipush 0
      // 28e: swap
      // 28f: aastore
      // 290: invokevirtual rip/breeze/inject/ԥ.method_001 ([Ljava/lang/Object;)[Lrip/breeze/inject/ԡ;
      // 293: astore 48
      // 295: aload 48
      // 297: aload 2
      // 298: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 29b: aload 3
      // 29c: lload 25
      // 29e: bipush 2
      // 29f: anewarray 4
      // 2a2: dup_x2
      // 2a3: dup_x2
      // 2a4: pop
      // 2a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a8: bipush 1
      // 2a9: swap
      // 2aa: aastore
      // 2ab: dup_x1
      // 2ac: swap
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 2b3: aaload
      // 2b4: astore 49
      // 2b6: aload 49
      // 2b8: iload 42
      // 2ba: lload 5
      // 2bc: lconst_0
      // 2bd: lcmp
      // 2be: iflt 2d1
      // 2c1: ifne 2d0
      // 2c4: ifnull 39e
      // 2c7: goto 2ce
      // 2ca: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cd: athrow
      // 2ce: aload 49
      // 2d0: bipush 0
      // 2d1: anewarray 4
      // 2d4: invokevirtual rip/breeze/inject/ԡ.method_010 ([Ljava/lang/Object;)I
      // 2d7: aload 40
      // 2d9: invokeinterface java/util/Map.size ()I 1
      // 2de: isub
      // 2df: istore 50
      // 2e1: bipush 0
      // 2e2: istore 51
      // 2e4: iload 51
      // 2e6: iload 50
      // 2e8: if_icmpge 39e
      // 2eb: aload 49
      // 2ed: iload 50
      // 2ef: iload 51
      // 2f1: isub
      // 2f2: bipush 1
      // 2f3: isub
      // 2f4: bipush 1
      // 2f5: anewarray 4
      // 2f8: dup_x1
      // 2f9: swap
      // 2fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2fd: bipush 0
      // 2fe: swap
      // 2ff: aastore
      // 300: invokevirtual rip/breeze/inject/ԡ.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 303: checkcast rip/breeze/inject/ԣ
      // 306: bipush 0
      // 307: anewarray 4
      // 30a: invokevirtual rip/breeze/inject/ԣ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 30d: astore 52
      // 30f: aload 46
      // 311: new rip/breeze/inject/ի
      // 314: dup
      // 315: aload 52
      // 317: bipush 54
      // 319: lload 13
      // 31b: bipush 2
      // 31c: anewarray 4
      // 31f: dup_x2
      // 320: dup_x2
      // 321: pop
      // 322: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 325: bipush 1
      // 326: swap
      // 327: aastore
      // 328: dup_x1
      // 329: swap
      // 32a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: invokevirtual rip/breeze/inject/MathUtil3.calculate_3 ([Ljava/lang/Object;)I
      // 333: iload 39
      // 335: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 338: lload 33
      // 33a: bipush 2
      // 33b: anewarray 4
      // 33e: dup_x2
      // 33f: dup_x2
      // 340: pop
      // 341: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 344: bipush 1
      // 345: swap
      // 346: aastore
      // 347: dup_x1
      // 348: swap
      // 349: bipush 0
      // 34a: swap
      // 34b: aastore
      // 34c: lload 5
      // 34e: lconst_0
      // 34f: lcmp
      // 350: iflt 3b7
      // 353: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 356: aload 41
      // 358: new rip/breeze/classtransform/վ
      // 35b: dup
      // 35c: aload 52
      // 35e: iload 39
      // 360: aconst_null
      // 361: invokespecial rip/breeze/classtransform/վ.<init> (Lrip/breeze/inject/MathUtil3;ILrip/breeze/classtransform/տ;)V
      // 364: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 369: pop
      // 36a: iload 39
      // 36c: aload 52
      // 36e: lload 29
      // 370: bipush 1
      // 371: anewarray 4
      // 374: dup_x2
      // 375: dup_x2
      // 376: pop
      // 377: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37a: bipush 0
      // 37b: swap
      // 37c: aastore
      // 37d: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 380: iadd
      // 381: istore 39
      // 383: iinc 51 1
      // 386: iload 42
      // 388: ifne 3a3
      // 38b: iload 42
      // 38d: ifeq 2e4
      // 390: lload 5
      // 392: lconst_0
      // 393: lcmp
      // 394: ifle 386
      // 397: goto 39e
      // 39a: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39d: athrow
      // 39e: goto 3a3
      // 3a1: astore 47
      // 3a3: aload 4
      // 3a5: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 3a8: lload 35
      // 3aa: bipush 1
      // 3ab: anewarray 4
      // 3ae: dup_x2
      // 3af: dup_x2
      // 3b0: pop
      // 3b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b4: bipush 0
      // 3b5: swap
      // 3b6: aastore
      // 3b7: invokevirtual rip/breeze/inject/թ.method_008 ([Ljava/lang/Object;)Ljava/util/ListIterator;
      // 3ba: astore 47
      // 3bc: aload 47
      // 3be: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c3: ifeq 56b
      // 3c6: aload 47
      // 3c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3cd: checkcast rip/breeze/inject/ջ
      // 3d0: astore 48
      // 3d2: aload 48
      // 3d4: instanceof rip/breeze/inject/չ
      // 3d7: iload 42
      // 3d9: lload 5
      // 3db: lconst_0
      // 3dc: lcmp
      // 3dd: iflt 5c4
      // 3e0: lload 5
      // 3e2: lconst_0
      // 3e3: lcmp
      // 3e4: ifle 3ec
      // 3e7: ifne 5a0
      // 3ea: iload 42
      // 3ec: lload 5
      // 3ee: lconst_0
      // 3ef: lcmp
      // 3f0: iflt 419
      // 3f3: ifne 417
      // 3f6: goto 3fd
      // 3f9: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fc: athrow
      // 3fd: ifeq 40e
      // 400: goto 407
      // 403: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 406: athrow
      // 407: lload 5
      // 409: lconst_0
      // 40a: lcmp
      // 40b: ifgt 3bc
      // 40e: aload 48
      // 410: bipush 0
      // 411: anewarray 4
      // 414: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 417: iload 42
      // 419: lload 5
      // 41b: lconst_0
      // 41c: lcmp
      // 41d: ifle 426
      // 420: ifne 496
      // 423: sipush 172
      // 426: if_icmplt 491
      // 429: goto 430
      // 42c: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42f: athrow
      // 430: aload 48
      // 432: bipush 0
      // 433: anewarray 4
      // 436: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 439: iload 42
      // 43b: lload 5
      // 43d: lconst_0
      // 43e: lcmp
      // 43f: iflt 498
      // 442: ifne 496
      // 445: goto 44c
      // 448: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44b: athrow
      // 44c: sipush 177
      // 44f: if_icmpgt 491
      // 452: goto 459
      // 455: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 458: athrow
      // 459: aload 46
      // 45b: new rip/breeze/inject/մ
      // 45e: dup
      // 45f: sipush 167
      // 462: aload 45
      // 464: invokespecial rip/breeze/inject/մ.<init> (ILrip/breeze/inject/ճ;)V
      // 467: lload 33
      // 469: bipush 2
      // 46a: anewarray 4
      // 46d: dup_x2
      // 46e: dup_x2
      // 46f: pop
      // 470: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 473: bipush 1
      // 474: swap
      // 475: aastore
      // 476: dup_x1
      // 477: swap
      // 478: bipush 0
      // 479: swap
      // 47a: aastore
      // 47b: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 47e: iload 42
      // 480: lload 5
      // 482: lconst_0
      // 483: lcmp
      // 484: ifle 3c3
      // 487: ifeq 3bc
      // 48a: goto 491
      // 48d: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 490: athrow
      // 491: aload 48
      // 493: instanceof rip/breeze/inject/ի
      // 496: iload 42
      // 498: ifne 505
      // 49b: ifeq 4ed
      // 49e: goto 4a5
      // 4a1: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a4: athrow
      // 4a5: aload 48
      // 4a7: checkcast rip/breeze/inject/ի
      // 4aa: astore 49
      // 4ac: aload 40
      // 4ae: aload 49
      // 4b0: getfield rip/breeze/inject/ի.int_ç_2 I
      // 4b3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4b6: aload 49
      // 4b8: getfield rip/breeze/inject/ի.int_ç_2 I
      // 4bb: iload 39
      // 4bd: iadd
      // 4be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4c1: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4c6: pop
      // 4c7: aload 49
      // 4c9: aload 40
      // 4cb: aload 49
      // 4cd: getfield rip/breeze/inject/ի.int_ç_2 I
      // 4d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4d8: checkcast java/lang/Integer
      // 4db: invokevirtual java/lang/Integer.intValue ()I
      // 4de: putfield rip/breeze/inject/ի.int_ç_2 I
      // 4e1: iload 42
      // 4e3: lload 5
      // 4e5: lconst_0
      // 4e6: lcmp
      // 4e7: ifle 561
      // 4ea: ifeq 544
      // 4ed: aload 48
      // 4ef: iload 42
      // 4f1: ifne 50a
      // 4f4: goto 4fb
      // 4f7: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fa: athrow
      // 4fb: instanceof rip/breeze/inject/ո
      // 4fe: goto 505
      // 501: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 504: athrow
      // 505: ifeq 544
      // 508: aload 48
      // 50a: checkcast rip/breeze/inject/ո
      // 50d: astore 49
      // 50f: aload 40
      // 511: aload 49
      // 513: getfield rip/breeze/inject/ո.int_ç_2 I
      // 516: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 519: aload 49
      // 51b: getfield rip/breeze/inject/ո.int_ç_2 I
      // 51e: iload 39
      // 520: iadd
      // 521: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 524: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 529: pop
      // 52a: aload 49
      // 52c: aload 40
      // 52e: aload 49
      // 530: getfield rip/breeze/inject/ո.int_ç_2 I
      // 533: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 536: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 53b: checkcast java/lang/Integer
      // 53e: invokevirtual java/lang/Integer.intValue ()I
      // 541: putfield rip/breeze/inject/ո.int_ç_2 I
      // 544: aload 46
      // 546: aload 48
      // 548: lload 33
      // 54a: bipush 2
      // 54b: anewarray 4
      // 54e: dup_x2
      // 54f: dup_x2
      // 550: pop
      // 551: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 554: bipush 1
      // 555: swap
      // 556: aastore
      // 557: dup_x1
      // 558: swap
      // 559: bipush 0
      // 55a: swap
      // 55b: aastore
      // 55c: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 55f: iload 42
      // 561: lload 5
      // 563: lconst_0
      // 564: lcmp
      // 565: ifle 588
      // 568: ifeq 3bc
      // 56b: aload 46
      // 56d: aload 45
      // 56f: lload 33
      // 571: bipush 2
      // 572: anewarray 4
      // 575: dup_x2
      // 576: dup_x2
      // 577: pop
      // 578: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57b: bipush 1
      // 57c: swap
      // 57d: aastore
      // 57e: dup_x1
      // 57f: swap
      // 580: bipush 0
      // 581: swap
      // 582: aastore
      // 583: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 586: iload 42
      // 588: lload 5
      // 58a: lconst_0
      // 58b: lcmp
      // 58c: iflt 599
      // 58f: ifne 7e7
      // 592: aload 41
      // 594: invokeinterface java/util/List.isEmpty ()Z 1
      // 599: goto 5a0
      // 59c: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59f: athrow
      // 5a0: ifne 716
      // 5a3: iload 39
      // 5a5: aload 40
      // 5a7: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 5ac: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
      // 5b1: invokedynamic applyAsInt ()Ljava/util/function/ToIntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)I, rip/breeze/classtransform/ր.lambda$wrappedInline_Inner0 (Ljava/lang/Integer;)I, (Ljava/lang/Integer;)I ]
      // 5b6: invokeinterface java/util/stream/Stream.mapToInt (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream; 2
      // 5bb: invokeinterface java/util/stream/IntStream.max ()Ljava/util/OptionalInt; 1
      // 5c0: bipush 0
      // 5c1: invokevirtual java/util/OptionalInt.orElse (I)I
      // 5c4: iadd
      // 5c5: istore 47
      // 5c7: aload 44
      // 5c9: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 5cc: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 5cf: iload 42
      // 5d1: ifne 62e
      // 5d4: ifne 625
      // 5d7: goto 5de
      // 5da: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5dd: athrow
      // 5de: aload 46
      // 5e0: new rip/breeze/inject/ի
      // 5e3: dup
      // 5e4: aload 44
      // 5e6: bipush 54
      // 5e8: lload 13
      // 5ea: bipush 2
      // 5eb: anewarray 4
      // 5ee: dup_x2
      // 5ef: dup_x2
      // 5f0: pop
      // 5f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f4: bipush 1
      // 5f5: swap
      // 5f6: aastore
      // 5f7: dup_x1
      // 5f8: swap
      // 5f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5fc: bipush 0
      // 5fd: swap
      // 5fe: aastore
      // 5ff: invokevirtual rip/breeze/inject/MathUtil3.calculate_3 ([Ljava/lang/Object;)I
      // 602: iload 47
      // 604: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 607: lload 33
      // 609: bipush 2
      // 60a: anewarray 4
      // 60d: dup_x2
      // 60e: dup_x2
      // 60f: pop
      // 610: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 613: bipush 1
      // 614: swap
      // 615: aastore
      // 616: dup_x1
      // 617: swap
      // 618: bipush 0
      // 619: swap
      // 61a: aastore
      // 61b: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 61e: goto 625
      // 621: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 624: athrow
      // 625: aload 41
      // 627: invokeinterface java/util/List.size ()I 1
      // 62c: bipush 1
      // 62d: isub
      // 62e: istore 48
      // 630: iload 48
      // 632: iflt 6bd
      // 635: aload 41
      // 637: iload 48
      // 639: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 63e: checkcast rip/breeze/classtransform/վ
      // 641: astore 49
      // 643: aload 46
      // 645: new rip/breeze/inject/ի
      // 648: dup
      // 649: aload 49
      // 64b: bipush 1
      // 64c: anewarray 4
      // 64f: dup_x1
      // 650: swap
      // 651: bipush 0
      // 652: swap
      // 653: aastore
      // 654: invokestatic rip/breeze/classtransform/վ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 657: bipush 21
      // 659: lload 13
      // 65b: bipush 2
      // 65c: anewarray 4
      // 65f: dup_x2
      // 660: dup_x2
      // 661: pop
      // 662: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 665: bipush 1
      // 666: swap
      // 667: aastore
      // 668: dup_x1
      // 669: swap
      // 66a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66d: bipush 0
      // 66e: swap
      // 66f: aastore
      // 670: invokevirtual rip/breeze/inject/MathUtil3.calculate_3 ([Ljava/lang/Object;)I
      // 673: aload 49
      // 675: bipush 1
      // 676: anewarray 4
      // 679: dup_x1
      // 67a: swap
      // 67b: bipush 0
      // 67c: swap
      // 67d: aastore
      // 67e: invokestatic rip/breeze/classtransform/վ.method_002 ([Ljava/lang/Object;)I
      // 681: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 684: lload 33
      // 686: bipush 2
      // 687: anewarray 4
      // 68a: dup_x2
      // 68b: dup_x2
      // 68c: pop
      // 68d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 690: bipush 1
      // 691: swap
      // 692: aastore
      // 693: dup_x1
      // 694: swap
      // 695: bipush 0
      // 696: swap
      // 697: aastore
      // 698: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 69b: iinc 48 -1
      // 69e: iload 42
      // 6a0: lload 5
      // 6a2: lconst_0
      // 6a3: lcmp
      // 6a4: iflt 6ac
      // 6a7: ifne 7e7
      // 6aa: iload 42
      // 6ac: ifeq 630
      // 6af: lload 5
      // 6b1: lconst_0
      // 6b2: lcmp
      // 6b3: ifle 69e
      // 6b6: goto 6bd
      // 6b9: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6bc: athrow
      // 6bd: lload 5
      // 6bf: lconst_0
      // 6c0: lcmp
      // 6c1: ifle 7e7
      // 6c4: aload 44
      // 6c6: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 6c9: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 6cc: ifne 716
      // 6cf: aload 46
      // 6d1: new rip/breeze/inject/ի
      // 6d4: dup
      // 6d5: aload 44
      // 6d7: bipush 21
      // 6d9: lload 13
      // 6db: bipush 2
      // 6dc: anewarray 4
      // 6df: dup_x2
      // 6e0: dup_x2
      // 6e1: pop
      // 6e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e5: bipush 1
      // 6e6: swap
      // 6e7: aastore
      // 6e8: dup_x1
      // 6e9: swap
      // 6ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6ed: bipush 0
      // 6ee: swap
      // 6ef: aastore
      // 6f0: invokevirtual rip/breeze/inject/MathUtil3.calculate_3 ([Ljava/lang/Object;)I
      // 6f3: iload 47
      // 6f5: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 6f8: lload 33
      // 6fa: bipush 2
      // 6fb: anewarray 4
      // 6fe: dup_x2
      // 6ff: dup_x2
      // 700: pop
      // 701: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 704: bipush 1
      // 705: swap
      // 706: aastore
      // 707: dup_x1
      // 708: swap
      // 709: bipush 0
      // 70a: swap
      // 70b: aastore
      // 70c: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 70f: goto 716
      // 712: invokestatic rip/breeze/classtransform/ր.method_007 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 715: athrow
      // 716: aload 2
      // 717: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 71a: aload 3
      // 71b: aload 46
      // 71d: lload 31
      // 71f: bipush 3
      // 720: anewarray 4
      // 723: dup_x2
      // 724: dup_x2
      // 725: pop
      // 726: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 729: bipush 2
      // 72a: swap
      // 72b: aastore
      // 72c: dup_x1
      // 72d: swap
      // 72e: bipush 1
      // 72f: swap
      // 730: aastore
      // 731: dup_x1
      // 732: swap
      // 733: bipush 0
      // 734: swap
      // 735: aastore
      // 736: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 739: aload 2
      // 73a: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 73d: lload 37
      // 73f: aload 3
      // 740: bipush 2
      // 741: anewarray 4
      // 744: dup_x1
      // 745: swap
      // 746: bipush 1
      // 747: swap
      // 748: aastore
      // 749: dup_x2
      // 74a: dup_x2
      // 74b: pop
      // 74c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74f: bipush 0
      // 750: swap
      // 751: aastore
      // 752: invokevirtual rip/breeze/inject/թ.method_020 ([Ljava/lang/Object;)V
      // 755: aload 2
      // 756: aload 2
      // 757: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 75a: aload 4
      // 75c: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 75f: lload 19
      // 761: dup2_x1
      // 762: pop2
      // 763: bipush 3
      // 764: anewarray 4
      // 767: dup_x1
      // 768: swap
      // 769: bipush 2
      // 76a: swap
      // 76b: aastore
      // 76c: dup_x2
      // 76d: dup_x2
      // 76e: pop
      // 76f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 772: bipush 1
      // 773: swap
      // 774: aastore
      // 775: dup_x1
      // 776: swap
      // 777: bipush 0
      // 778: swap
      // 779: aastore
      // 77a: invokestatic rip/breeze/classtransform/ր.method_004 ([Ljava/lang/Object;)Ljava/util/List;
      // 77d: putfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 780: aload 2
      // 781: aload 2
      // 782: getfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 785: aload 4
      // 787: getfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 78a: lload 15
      // 78c: dup2_x1
      // 78d: pop2
      // 78e: iload 39
      // 790: aload 40
      // 792: bipush 5
      // 793: anewarray 4
      // 796: dup_x1
      // 797: swap
      // 798: bipush 4
      // 799: swap
      // 79a: aastore
      // 79b: dup_x1
      // 79c: swap
      // 79d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7a0: bipush 3
      // 7a1: swap
      // 7a2: aastore
      // 7a3: dup_x1
      // 7a4: swap
      // 7a5: bipush 2
      // 7a6: swap
      // 7a7: aastore
      // 7a8: dup_x2
      // 7a9: dup_x2
      // 7aa: pop
      // 7ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7ae: bipush 1
      // 7af: swap
      // 7b0: aastore
      // 7b1: dup_x1
      // 7b2: swap
      // 7b3: bipush 0
      // 7b4: swap
      // 7b5: aastore
      // 7b6: invokestatic rip/breeze/classtransform/ր.method_005 ([Ljava/lang/Object;)Ljava/util/List;
      // 7b9: putfield rip/breeze/inject/BreezeClass12.list_æ Ljava/util/List;
      // 7bc: aload 2
      // 7bd: aload 2
      // 7be: getfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 7c1: lload 7
      // 7c3: dup2_x1
      // 7c4: pop2
      // 7c5: aload 4
      // 7c7: getfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 7ca: bipush 3
      // 7cb: anewarray 4
      // 7ce: dup_x1
      // 7cf: swap
      // 7d0: bipush 2
      // 7d1: swap
      // 7d2: aastore
      // 7d3: dup_x1
      // 7d4: swap
      // 7d5: bipush 1
      // 7d6: swap
      // 7d7: aastore
      // 7d8: dup_x2
      // 7d9: dup_x2
      // 7da: pop
      // 7db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7de: bipush 0
      // 7df: swap
      // 7e0: aastore
      // 7e1: invokestatic rip/breeze/classtransform/ր.method_006 ([Ljava/lang/Object;)Ljava/util/List;
      // 7e4: putfield rip/breeze/inject/BreezeClass12.list_ö Ljava/util/List;
      // 7e7: return
      // try (507 -> 512): 517 java/lang/Throwable
      // try (395 -> 403): 404 java/lang/Throwable
      // try (301 -> 335): 336 java/lang/Throwable
      // try (294 -> 304): 305 java/lang/Throwable
      // try (278 -> 287): 292 java/lang/Throwable
      // try (174 -> 180): 181 java/lang/Throwable
      // try (340 -> 519): 520 java/lang/Throwable
      // try (542 -> 560): 561 java/lang/Throwable
      // try (554 -> 564): 565 java/lang/Throwable
      // try (575 -> 583): 584 java/lang/Throwable
      // try (581 -> 596): 597 java/lang/Throwable
      // try (586 -> 601): 602 java/lang/Throwable
      // try (599 -> 632): 633 java/lang/Throwable
      // try (637 -> 640): 641 java/lang/Throwable
      // try (646 -> 675): 676 java/lang/Throwable
      // try (672 -> 679): 680 java/lang/Throwable
      // try (730 -> 756): 757 java/lang/Throwable
      // try (771 -> 777): 778 java/lang/Throwable
      // try (776 -> 820): 821 java/lang/Throwable
      // try (835 -> 900): 905 java/lang/Throwable
      // try (907 -> 955): 956 java/lang/Throwable
   }

   private static List invoke_4(Object[] var0) {
      List var1 = (List)var0[0];
      long var2 = (Long)var0[1];
      List var4 = (List)var0[2];
      var2 = encKey_a_2 ^ var2;
      int var10000 = MathUtil3.getValue_6();
      ArrayList var5 = new ArrayList();
      int var6 = var10000;
      List var8 = var1;
      if (var6 != 0) {
         if (var1 != null) {
            var5.addAll(var1);
         }

         var8 = var4;
      }

      if (var8 != null) {
         var5.addAll(var4);
      }

      return var5;
   }

   private static List invoke_5(Object[] var0) {
      List var1 = (List)var0[0];
      long var2 = (Long)var0[1];
      List var4 = (List)var0[2];
      int var5 = (Integer)var0[3];
      Map var6 = (Map)var0[4];
      var2 = encKey_a_2 ^ var2;
      int var10000 = MathUtil3.getValue_5();
      ArrayList var7 = new ArrayList();
      int var8 = var10000;
      List var12 = var1;
      if (var8 == 0) {
         if (var1 != null) {
            var7.addAll(var1);
         }

         var12 = var4;
      }

      if (var8 == 0) {
         if (var12 == null) {
            return var7;
         }

         var12 = var4;
      }

      for (rip.breeze.inject.է var10 : var12) {
         label44: {
            label43: {
               label59: {
                  var10000 = var8;
                  if (var2 > 0L) {
                     if (var8 == 0) {
                        if (!var6.containsKey(var10.int_ú_2)) {
                           break label59;
                        }

                        var10.int_ú_2 = (Integer)var6.get(var10.int_ú_2);
                     }

                     var10000 = var8;
                  }

                  if (var2 < 0L) {
                     break label44;
                  }

                  if (var10000 == 0) {
                     break label43;
                  }
               }

               var10.int_ú_2 += var5;
            }

            var7.add(var10);
            var10000 = var8;
         }

         if (var10000 != 0) {
            break;
         }
      }

      return var7;
   }

   private static List invoke_6(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      List var4 = (List)var0[2];
      var1 = encKey_a_2 ^ var1;
      int var10000 = MathUtil3.getValue_5();
      HashSet var5 = new HashSet();
      int var6 = var10000;
      List var8 = var3;
      if (var6 == 0) {
         if (var3 != null) {
            var5.addAll(var3);
         }

         var8 = var4;
      }

      if (var8 != null) {
         var5.addAll(var4);
      }

      return new ArrayList(var5);
   }

   private static int lambda$wrappedInline_Inner0(Integer var0) {
      return var0;
   }

   private static Throwable invoke_7(Throwable var0) {
      return var0;
   }
}
