package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class à {
   static final int CONST_Ÿ_2 = 0;
   static final int CONST_Þ_2 = 64;
   static final int CONST_Ý_2 = 128;
   static final int CONST_Ü_2 = 247;
   static final int CONST_Û_2 = 248;
   static final int CONST_Ú_2 = 251;
   static final int CONST_Ù_2 = 252;
   static final int CONST_Ø_2 = 255;
   static final int CONST_Ö_2 = 0;
   static final int CONST_Õ_2 = 1;
   static final int CONST_Ô_2 = 2;
   static final int CONST_Ó_2 = 3;
   static final int CONST_Ò_2 = 4;
   static final int CONST_Ñ_2 = 5;
   static final int CONST_Ð_2 = 6;
   static final int CONST_Ï_2 = 7;
   static final int CONST_Î_2 = 8;
   private static final int CONST_Í_2 = 9;
   private static final int CONST_Ì_2 = 10;
   private static final int CONST_Ë_2 = 11;
   private static final int CONST_Ê_2 = 12;
   private static final int CONST_É_2 = 6;
   private static final int CONST_È_2 = 4;
   private static final int CONST_Ç_2 = 2;
   private static final int CONST_Æ_2 = 20;
   private static final int CONST_Å_2 = 26;
   private static final int CONST_Ä_2 = 22;
   private static final int CONST_Ã_2 = 20;
   private static final int CONST_Â_2 = -67108864;
   private static final int CONST_Á_2 = 62914560;
   private static final int CONST_À_2 = 1048575;
   private static final int CONST_SS_2 = 67108864;
   private static final int CONST_º_2 = -67108864;
   private static final int CONST_Μ_2 = 4194304;
   private static final int CONST_ª_2 = 8388608;
   private static final int CONST_Z_2 = 12582912;
   private static final int CONST_Y_2 = 16777216;
   private static final int CONST_X_2 = 20971520;
   private static final int CONST_W_2 = 25165824;
   private static final int CONST_V_2 = 1048576;
   private static final int CONST_U_2 = 4194304;
   private static final int CONST_T_2 = 4194313;
   private static final int CONST_S_2 = 4194314;
   private static final int CONST_R_2 = 4194315;
   private static final int CONST_Q_2 = 4194316;
   private static final int CONST_P_2 = 4194305;
   private static final int CONST_O_2 = 4194306;
   private static final int CONST_N_2 = 4194308;
   private static final int CONST_M_2 = 4194307;
   private static final int CONST_L_2 = 4194309;
   private static final int CONST_K_2 = 4194310;
   ª ª_j_2;
   private int[] arr_i_2;
   private int[] arr_h_2;
   private int[] arr_g_2;
   private int[] arr_f_2;
   private short short_e_2;
   private short short_d_2;
   private int int_c_2;
   private int[] arr_b_2;
   private static final String[] CONST_A_2;
   private static final String[] CONST_B_2;
   private static final Map CONST_C_2 = new HashMap(13);

   à(ª var1) {
      this.ª_j_2 = var1;
   }

   final void invoke_1(Object[] var1) {
      à var2 = (à)var1[0];
      this.arr_i_2 = var2.arr_i_2;
      this.arr_h_2 = var2.arr_h_2;
      this.short_e_2 = 0;
      this.arr_g_2 = var2.arr_g_2;
      this.arr_f_2 = var2.arr_f_2;
      this.short_d_2 = var2.short_d_2;
      this.int_c_2 = var2.int_c_2;
      this.arr_b_2 = var2.arr_b_2;
   }

   static int invoke_2(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Object
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 106130547073543
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 3367697902706
      // 02c: lxor
      // 02d: lstore 7
      // 02f: dup2
      // 030: ldc2_w 90348991699330
      // 033: lxor
      // 034: lstore 9
      // 036: dup2
      // 037: ldc2_w 64921030593355
      // 03a: lxor
      // 03b: lstore 11
      // 03d: pop2
      // 03e: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 041: istore 13
      // 043: aload 2
      // 044: instanceof java/lang/Integer
      // 047: iload 13
      // 049: ifne 075
      // 04c: ifeq 065
      // 04f: goto 056
      // 052: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 055: athrow
      // 056: ldc 4194304
      // 058: aload 2
      // 059: checkcast java/lang/Integer
      // 05c: invokevirtual java/lang/Integer.intValue ()I
      // 05f: ior
      // 060: ireturn
      // 061: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 064: athrow
      // 065: aload 2
      // 066: iload 13
      // 068: ifne 0bd
      // 06b: instanceof java/lang/String
      // 06e: goto 075
      // 071: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 074: athrow
      // 075: ifeq 0bc
      // 078: aload 2
      // 079: checkcast java/lang/String
      // 07c: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 07f: lload 5
      // 081: bipush 1
      // 082: anewarray 4
      // 085: dup_x2
      // 086: dup_x2
      // 087: pop
      // 088: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: invokevirtual rip/breeze/inject/MathUtil3.buildString_5 ([Ljava/lang/Object;)Ljava/lang/String;
      // 091: astore 14
      // 093: aload 1
      // 094: lload 7
      // 096: aload 14
      // 098: bipush 0
      // 099: bipush 4
      // 09a: anewarray 4
      // 09d: dup_x1
      // 09e: swap
      // 09f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a2: bipush 3
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 2
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: invokestatic rip/breeze/inject/à.method_004 ([Ljava/lang/Object;)I
      // 0bb: ireturn
      // 0bc: aload 2
      // 0bd: checkcast rip/breeze/inject/ª
      // 0c0: astore 14
      // 0c2: aload 14
      // 0c4: getfield rip/breeze/inject/ª.short_í_2 S
      // 0c7: bipush 4
      // 0c8: iand
      // 0c9: iload 13
      // 0cb: ifne 12b
      // 0ce: ifeq 107
      // 0d1: goto 0d8
      // 0d4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d7: athrow
      // 0d8: ldc 12582912
      // 0da: aload 1
      // 0db: ldc ""
      // 0dd: aload 14
      // 0df: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0e2: lload 9
      // 0e4: bipush 3
      // 0e5: anewarray 4
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 2
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f6: bipush 1
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: invokevirtual rip/breeze/inject/Util139.getValue_7 ([Ljava/lang/Object;)I
      // 101: ior
      // 102: ireturn
      // 103: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 106: athrow
      // 107: ldc 16777216
      // 109: aload 1
      // 10a: ldc ""
      // 10c: aload 14
      // 10e: lload 11
      // 110: bipush 3
      // 111: anewarray 4
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 2
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 1
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 0
      // 125: swap
      // 126: aastore
      // 127: invokevirtual rip/breeze/inject/Util139.getValue_8 ([Ljava/lang/Object;)I
      // 12a: ior
      // 12b: ireturn
      // try (42 -> 47): 48 java/lang/IllegalArgumentException
      // try (46 -> 56): 56 java/lang/IllegalArgumentException
      // try (58 -> 62): 63 java/lang/IllegalArgumentException
      // try (115 -> 122): 123 java/lang/IllegalArgumentException
      // try (121 -> 154): 154 java/lang/IllegalArgumentException
   }

   static int invoke_3(Object[] var0) {
      long var1 = (Long)var0[0];
      Util139 var3 = (Util139)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 96876895152606L;
      return 8388608 | var3.getValue_6(new Object[]{var5, var4});
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static int invoke_4(Object[] var0) {
      Util139 var1 = (Util139)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      int var5 = (Integer)var0[3];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 58053341817073L;
      long var8 = var2 ^ 46984628656934L;
      long var10 = var2 ^ 61322107331389L;
      int var12 = Util140.getValue();

      label212: {
         try {
            char var10000 = var4.charAt(var5);
            if (var12 != 0) {
               return var10000;
            }

            switch (var10000) {
               case 'B':
               case 'C':
               case 'I':
               case 'S':
               case 'Z':
                  return 4194305;
               case 'D':
                  return 4194307;
               case 'E':
               case 'G':
               case 'H':
               case 'K':
               case 'M':
               case 'N':
               case 'O':
               case 'P':
               case 'Q':
               case 'R':
               case 'T':
               case 'U':
               case 'W':
               case 'X':
               case 'Y':
               default:
                  throw new IllegalArgumentException(method_006(new Object[]{var8, var4.substring(var5)}));
               case 'F':
                  return 4194306;
               case 'J':
                  return 4194308;
               case 'L':
                  break label212;
               case 'V':
                  return 0;
               case '[':
            }
         } catch (IllegalArgumentException var21) {
            throw method_026(var21);
         }

         int var14 = var5 + 1;

         label213: {
            label173: {
               label174: {
                  label175: {
                     label176: {
                        label177: {
                           label178: {
                              label179: {
                                 int var24;
                                 label137: {
                                    label136:
                                    while (true) {
                                       if (var4.charAt(var14) == '[') {
                                          try {
                                             var14++;
                                          } catch (IllegalArgumentException var17) {
                                             throw method_026(var17);
                                          }

                                          do {
                                             try {
                                                var24 = var12;
                                                if (var2 < 0L) {
                                                   break label137;
                                                }

                                                if (var12 != 0) {
                                                   break label136;
                                                }

                                                if (var12 == 0) {
                                                   continue label136;
                                                }
                                             } catch (IllegalArgumentException var20) {
                                                throw method_026(var20);
                                             }
                                          } while (var2 < 0L);
                                       }

                                       label122: {
                                          try {
                                             var24 = var4.charAt(var14);
                                             if (var12 != 0) {
                                                break label122;
                                             }

                                             switch (var24) {
                                                case 66:
                                                   break label179;
                                                case 67:
                                                   break label136;
                                                case 68:
                                                   break label174;
                                                case 69:
                                                case 71:
                                                case 72:
                                                case 75:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                default:
                                                   break label213;
                                                case 70:
                                                   break label176;
                                                case 73:
                                                   break label177;
                                                case 74:
                                                   break label175;
                                                case 76:
                                                   break label173;
                                                case 83:
                                                   break label178;
                                                case 90:
                                             }
                                          } catch (IllegalArgumentException var19) {
                                             throw method_026(var19);
                                          }

                                          var24 = 4194313;
                                       }

                                       int var15 = var24;
                                       if (var2 < 0L) {
                                          return var12;
                                       }

                                       if (var12 == 0) {
                                          return var14 - var5 << 26 | var15;
                                       }
                                       break;
                                    }

                                    var24 = 4194315;
                                 }

                                 int var27 = var24;
                                 if (var2 < 0L) {
                                    return var12;
                                 }

                                 if (var12 == 0) {
                                    return var14 - var5 << 26 | var27;
                                 }
                              }

                              int var28 = 4194314;
                              if (var2 < 0L) {
                                 return var12;
                              }

                              if (var12 == 0) {
                                 return var14 - var5 << 26 | var28;
                              }
                           }

                           int var29 = 4194316;
                           if (var2 < 0L) {
                              return var12;
                           }

                           if (var12 == 0) {
                              return var14 - var5 << 26 | var29;
                           }
                        }

                        int var30 = 4194305;
                        if (var2 < 0L) {
                           return var12;
                        }

                        if (var12 == 0) {
                           return var14 - var5 << 26 | var30;
                        }
                     }

                     int var31 = 4194306;
                     if (var2 < 0L) {
                        return var12;
                     }

                     if (var12 == 0) {
                        return var14 - var5 << 26 | var31;
                     }
                  }

                  int var32 = 4194308;
                  if (var2 < 0L) {
                     return var12;
                  }

                  if (var12 == 0) {
                     return var14 - var5 << 26 | var32;
                  }
               }

               int var33 = 4194307;
               if (var2 < 0L) {
                  return var12;
               }

               if (var12 == 0) {
                  return var14 - var5 << 26 | var33;
               }
            }

            String var13 = var4.substring(var14 + 1, var4.length() - 1);
            int var34 = 8388608 | var1.getValue_6(new Object[]{var6, var13});

            try {
               if (var2 < 0L) {
                  return var12;
               }

               if (var12 != 0) {
                  break label213;
               }
            } catch (IllegalArgumentException var18) {
               throw method_026(var18);
            }

            return var14 - var5 << 26 | var34;
         }

         try {
            throw new IllegalArgumentException(method_005(new Object[]{var10, var4.substring(var14)}));
         } catch (IllegalArgumentException var16) {
            throw method_026(var16);
         }
      }

      String var23 = var4.substring(var5 + 1, var4.length() - 1);
      return 8388608 | var1.getValue_6(new Object[]{var6, var23});
   }

   private static String invoke_5(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = encKey_a_2 ^ var1;
      return method_028(24147, 2337011410946447072L ^ var1) + var3;
   }

   private static String invoke_6(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = encKey_a_2 ^ var1;
      return method_028(3227, 5577165461679209521L ^ var1) + var3;
   }

   final void invoke_7(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Integer
      // 02b: invokevirtual java/lang/Integer.intValue ()I
      // 02e: istore 7
      // 030: pop
      // 031: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 034: lload 5
      // 036: lxor
      // 037: lstore 5
      // 039: lload 5
      // 03b: dup2
      // 03c: ldc2_w 127729292378293
      // 03f: lxor
      // 040: lstore 8
      // 042: dup2
      // 043: ldc2_w 55364417955656
      // 046: lxor
      // 047: lstore 10
      // 049: dup2
      // 04a: ldc2_w 26101069418176
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 135097598975284
      // 054: lxor
      // 055: lstore 14
      // 057: pop2
      // 058: aload 0
      // 059: iload 7
      // 05b: newarray 10
      // 05d: putfield rip/breeze/inject/à.arr_i_2 [I
      // 060: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 063: aload 0
      // 064: bipush 0
      // 065: newarray 10
      // 067: putfield rip/breeze/inject/à.arr_h_2 [I
      // 06a: istore 16
      // 06c: bipush 0
      // 06d: istore 17
      // 06f: iload 3
      // 070: bipush 8
      // 072: iand
      // 073: iload 16
      // 075: ifeq 08e
      // 078: ifne 0e6
      // 07b: goto 082
      // 07e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 081: athrow
      // 082: iload 3
      // 083: ldc_w 262144
      // 086: iand
      // 087: goto 08e
      // 08a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: lload 5
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 0c9
      // 095: ifne 0d3
      // 098: aload 0
      // 099: getfield rip/breeze/inject/à.arr_i_2 [I
      // 09c: iload 17
      // 09e: iinc 17 1
      // 0a1: ldc 8388608
      // 0a3: aload 2
      // 0a4: aload 2
      // 0a5: bipush 0
      // 0a6: anewarray 4
      // 0a9: invokevirtual rip/breeze/inject/Util139.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ac: lload 10
      // 0ae: dup2_x1
      // 0af: pop2
      // 0b0: bipush 2
      // 0b1: anewarray 4
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 1
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 0c5: ior
      // 0c6: iastore
      // 0c7: iload 16
      // 0c9: ifne 0e6
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0d7: iload 17
      // 0d9: iinc 17 1
      // 0dc: ldc 4194310
      // 0de: iastore
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: lload 14
      // 0e8: aload 4
      // 0ea: bipush 2
      // 0eb: anewarray 4
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 1
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 0ff: astore 18
      // 101: aload 18
      // 103: arraylength
      // 104: istore 19
      // 106: bipush 0
      // 107: istore 20
      // 109: iload 20
      // 10b: iload 19
      // 10d: if_icmpge 1be
      // 110: aload 18
      // 112: iload 20
      // 114: aaload
      // 115: astore 21
      // 117: aload 2
      // 118: aload 21
      // 11a: lload 8
      // 11c: bipush 1
      // 11d: anewarray 4
      // 120: dup_x2
      // 121: dup_x2
      // 122: pop
      // 123: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 126: bipush 0
      // 127: swap
      // 128: aastore
      // 129: invokevirtual rip/breeze/inject/MathUtil3.buildString_5 ([Ljava/lang/Object;)Ljava/lang/String;
      // 12c: lload 12
      // 12e: dup2_x1
      // 12f: pop2
      // 130: bipush 0
      // 131: bipush 4
      // 132: anewarray 4
      // 135: dup_x1
      // 136: swap
      // 137: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13a: bipush 3
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 2
      // 140: swap
      // 141: aastore
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 1
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: invokestatic rip/breeze/inject/à.method_004 ([Ljava/lang/Object;)I
      // 153: istore 22
      // 155: lload 5
      // 157: lconst_0
      // 158: lcmp
      // 159: ifle 16d
      // 15c: aload 0
      // 15d: getfield rip/breeze/inject/à.arr_i_2 [I
      // 160: iload 17
      // 162: iinc 17 1
      // 165: iload 22
      // 167: iload 16
      // 169: ifeq 1b5
      // 16c: iastore
      // 16d: iload 22
      // 16f: ldc 4194308
      // 171: lload 5
      // 173: lconst_0
      // 174: lcmp
      // 175: iflt 1c9
      // 178: iload 16
      // 17a: ifeq 1c9
      // 17d: goto 184
      // 180: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 183: athrow
      // 184: if_icmpeq 1a3
      // 187: goto 18e
      // 18a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d: athrow
      // 18e: iload 22
      // 190: lload 5
      // 192: lconst_0
      // 193: lcmp
      // 194: ifle 1bb
      // 197: ldc 4194307
      // 199: if_icmpne 1b6
      // 19c: goto 1a3
      // 19f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: getfield rip/breeze/inject/à.arr_i_2 [I
      // 1a7: iload 17
      // 1a9: iinc 17 1
      // 1ac: ldc 4194304
      // 1ae: goto 1b5
      // 1b1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b4: athrow
      // 1b5: iastore
      // 1b6: iinc 20 1
      // 1b9: iload 16
      // 1bb: ifne 109
      // 1be: iload 17
      // 1c0: lload 5
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: ifle 1da
      // 1c7: iload 7
      // 1c9: if_icmpge 1eb
      // 1cc: aload 0
      // 1cd: getfield rip/breeze/inject/à.arr_i_2 [I
      // 1d0: iload 17
      // 1d2: iinc 17 1
      // 1d5: ldc 4194304
      // 1d7: iastore
      // 1d8: iload 16
      // 1da: ifne 1be
      // 1dd: lload 5
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: iflt 1eb
      // 1e4: goto 1eb
      // 1e7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ea: athrow
      // 1eb: return
      // try (64 -> 70): 71 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
      // try (79 -> 116): 117 java/lang/IllegalArgumentException
      // try (84 -> 125): 126 java/lang/IllegalArgumentException
      // try (202 -> 222): 223 java/lang/IllegalArgumentException
      // try (213 -> 226): 227 java/lang/IllegalArgumentException
      // try (225 -> 236): 237 java/lang/IllegalArgumentException
      // try (229 -> 244): 245 java/lang/IllegalArgumentException
      // try (257 -> 266): 271 java/lang/IllegalArgumentException
   }

   final void invoke_8(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast [Ljava/lang/Object;
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Integer
      // 02b: invokevirtual java/lang/Integer.intValue ()I
      // 02e: istore 7
      // 030: dup
      // 031: bipush 5
      // 032: aaload
      // 033: checkcast [Ljava/lang/Object;
      // 036: astore 8
      // 038: pop
      // 039: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 03c: lload 5
      // 03e: lxor
      // 03f: lstore 5
      // 041: lload 5
      // 043: dup2
      // 044: ldc2_w 21488009431077
      // 047: lxor
      // 048: lstore 9
      // 04a: pop2
      // 04b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 04e: bipush 0
      // 04f: istore 11
      // 051: bipush 0
      // 052: istore 12
      // 054: istore 13
      // 056: iload 12
      // 058: iload 3
      // 059: if_icmpge 0e6
      // 05c: lload 5
      // 05e: lconst_0
      // 05f: lcmp
      // 060: iflt 094
      // 063: aload 0
      // 064: getfield rip/breeze/inject/à.arr_i_2 [I
      // 067: iload 11
      // 069: iinc 11 1
      // 06c: aload 2
      // 06d: aload 4
      // 06f: iload 12
      // 071: aaload
      // 072: lload 9
      // 074: bipush 3
      // 075: anewarray 4
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 2
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: bipush 1
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: bipush 0
      // 089: swap
      // 08a: aastore
      // 08b: invokestatic rip/breeze/inject/à.method_002 ([Ljava/lang/Object;)I
      // 08e: iload 13
      // 090: ifeq 0dd
      // 093: iastore
      // 094: iload 13
      // 096: ifeq 125
      // 099: goto 0a0
      // 09c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09f: athrow
      // 0a0: aload 4
      // 0a2: iload 12
      // 0a4: aaload
      // 0a5: getstatic rip/breeze/inject/IFunctional.CONST_Ը Ljava/lang/Integer;
      // 0a8: if_acmpeq 0cb
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: lload 5
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: iflt 0e1
      // 0b9: aload 4
      // 0bb: iload 12
      // 0bd: aaload
      // 0be: getstatic rip/breeze/inject/IFunctional.CONST_Թ Ljava/lang/Integer;
      // 0c1: if_acmpne 0de
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0cf: iload 11
      // 0d1: iinc 11 1
      // 0d4: ldc 4194304
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: iastore
      // 0de: iinc 12 1
      // 0e1: iload 13
      // 0e3: ifne 056
      // 0e6: iload 11
      // 0e8: lload 5
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 0e3
      // 0ef: aload 0
      // 0f0: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0f3: arraylength
      // 0f4: if_icmpge 122
      // 0f7: aload 0
      // 0f8: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0fb: iload 11
      // 0fd: iinc 11 1
      // 100: ldc 4194304
      // 102: iastore
      // 103: iload 13
      // 105: lload 5
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 126
      // 10c: ifeq 125
      // 10f: iload 13
      // 111: ifne 0e6
      // 114: lload 5
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 103
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 121: athrow
      // 122: bipush 0
      // 123: istore 12
      // 125: bipush 0
      // 126: istore 14
      // 128: iload 14
      // 12a: iload 7
      // 12c: if_icmpge 176
      // 12f: iload 13
      // 131: lload 5
      // 133: lconst_0
      // 134: lcmp
      // 135: ifle 18c
      // 138: ifeq 18b
      // 13b: aload 8
      // 13d: iload 14
      // 13f: aaload
      // 140: getstatic rip/breeze/inject/IFunctional.CONST_Ը Ljava/lang/Integer;
      // 143: iload 13
      // 145: ifeq 168
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14e: athrow
      // 14f: if_acmpeq 16b
      // 152: goto 159
      // 155: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 158: athrow
      // 159: aload 8
      // 15b: iload 14
      // 15d: aaload
      // 15e: getstatic rip/breeze/inject/IFunctional.CONST_Թ Ljava/lang/Integer;
      // 161: goto 168
      // 164: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 167: athrow
      // 168: if_acmpne 16e
      // 16b: iinc 12 1
      // 16e: iinc 14 1
      // 171: iload 13
      // 173: ifne 128
      // 176: aload 0
      // 177: iload 7
      // 179: iload 12
      // 17b: iadd
      // 17c: newarray 10
      // 17e: putfield rip/breeze/inject/à.arr_h_2 [I
      // 181: bipush 0
      // 182: istore 14
      // 184: lload 5
      // 186: lconst_0
      // 187: lcmp
      // 188: ifle 12f
      // 18b: bipush 0
      // 18c: istore 15
      // 18e: iload 15
      // 190: iload 7
      // 192: if_icmpge 21f
      // 195: lload 5
      // 197: lconst_0
      // 198: lcmp
      // 199: ifle 1cd
      // 19c: aload 0
      // 19d: getfield rip/breeze/inject/à.arr_h_2 [I
      // 1a0: iload 14
      // 1a2: iinc 14 1
      // 1a5: aload 2
      // 1a6: aload 8
      // 1a8: iload 15
      // 1aa: aaload
      // 1ab: lload 9
      // 1ad: bipush 3
      // 1ae: anewarray 4
      // 1b1: dup_x2
      // 1b2: dup_x2
      // 1b3: pop
      // 1b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b7: bipush 2
      // 1b8: swap
      // 1b9: aastore
      // 1ba: dup_x1
      // 1bb: swap
      // 1bc: bipush 1
      // 1bd: swap
      // 1be: aastore
      // 1bf: dup_x1
      // 1c0: swap
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: invokestatic rip/breeze/inject/à.method_002 ([Ljava/lang/Object;)I
      // 1c7: iload 13
      // 1c9: ifeq 216
      // 1cc: iastore
      // 1cd: iload 13
      // 1cf: ifeq 230
      // 1d2: goto 1d9
      // 1d5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d8: athrow
      // 1d9: aload 8
      // 1db: iload 15
      // 1dd: aaload
      // 1de: getstatic rip/breeze/inject/IFunctional.CONST_Ը Ljava/lang/Integer;
      // 1e1: if_acmpeq 204
      // 1e4: goto 1eb
      // 1e7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ea: athrow
      // 1eb: lload 5
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: ifle 21a
      // 1f2: aload 8
      // 1f4: iload 15
      // 1f6: aaload
      // 1f7: getstatic rip/breeze/inject/IFunctional.CONST_Թ Ljava/lang/Integer;
      // 1fa: if_acmpne 217
      // 1fd: goto 204
      // 200: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 203: athrow
      // 204: aload 0
      // 205: getfield rip/breeze/inject/à.arr_h_2 [I
      // 208: iload 14
      // 20a: iinc 14 1
      // 20d: ldc 4194304
      // 20f: goto 216
      // 212: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 215: athrow
      // 216: iastore
      // 217: iinc 15 1
      // 21a: iload 13
      // 21c: ifne 18e
      // 21f: aload 0
      // 220: bipush 0
      // 221: putfield rip/breeze/inject/à.short_d_2 S
      // 224: aload 0
      // 225: bipush 0
      // 226: putfield rip/breeze/inject/à.int_c_2 I
      // 229: lload 5
      // 22b: lconst_0
      // 22c: lcmp
      // 22d: ifle 195
      // 230: return
      // try (54 -> 92): 93 java/lang/IllegalArgumentException
      // try (89 -> 100): 101 java/lang/IllegalArgumentException
      // try (95 -> 112): 113 java/lang/IllegalArgumentException
      // try (103 -> 120): 121 java/lang/IllegalArgumentException
      // try (136 -> 150): 155 java/lang/IllegalArgumentException
      // try (164 -> 176): 177 java/lang/IllegalArgumentException
      // try (170 -> 180): 181 java/lang/IllegalArgumentException
      // try (179 -> 187): 188 java/lang/IllegalArgumentException
      // try (212 -> 250): 251 java/lang/IllegalArgumentException
      // try (247 -> 258): 259 java/lang/IllegalArgumentException
      // try (253 -> 270): 271 java/lang/IllegalArgumentException
      // try (261 -> 278): 279 java/lang/IllegalArgumentException
   }

   final int invoke_9(Object[] var1) {
      return this.arr_h_2.length;
   }

   private int invoke_10(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: pop
      // 17: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 20: istore 5
      // 22: aload 0
      // 23: getfield rip/breeze/inject/à.arr_g_2 [I
      // 26: ifnull 46
      // 29: iload 4
      // 2b: iload 5
      // 2d: ifeq 57
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rip/breeze/inject/à.arr_g_2 [I
      // 3b: arraylength
      // 3c: if_icmplt 50
      // 3f: goto 46
      // 42: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: ldc 20971520
      // 48: iload 4
      // 4a: ior
      // 4b: ireturn
      // 4c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield rip/breeze/inject/à.arr_g_2 [I
      // 54: iload 4
      // 56: iaload
      // 57: istore 6
      // 59: iload 6
      // 5b: iload 5
      // 5d: ifeq 7b
      // 60: ifne 79
      // 63: goto 6a
      // 66: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield rip/breeze/inject/à.arr_g_2 [I
      // 6e: iload 4
      // 70: ldc 20971520
      // 72: iload 4
      // 74: ior
      // 75: dup_x2
      // 76: iastore
      // 77: istore 6
      // 79: iload 6
      // 7b: ireturn
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
      // try (23 -> 33): 34 java/lang/IllegalArgumentException
      // try (29 -> 40): 40 java/lang/IllegalArgumentException
      // try (47 -> 51): 52 java/lang/IllegalArgumentException
   }

   private void invoke_11(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 5
      // 20: pop
      // 21: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 24: lload 3
      // 25: lxor
      // 26: lstore 3
      // 27: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2a: istore 6
      // 2c: aload 0
      // 2d: getfield rip/breeze/inject/à.arr_g_2 [I
      // 30: iload 6
      // 32: ifeq 52
      // 35: ifnonnull 4e
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 10
      // 42: newarray 10
      // 44: putfield rip/breeze/inject/à.arr_g_2 [I
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/à.arr_g_2 [I
      // 52: arraylength
      // 53: istore 7
      // 55: iload 6
      // 57: lload 3
      // 58: lconst_0
      // 59: lcmp
      // 5a: iflt 61
      // 5d: ifeq 96
      // 60: iload 2
      // 61: iload 7
      // 63: if_icmplt 8e
      // 66: goto 6d
      // 69: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: iload 2
      // 6e: bipush 1
      // 6f: iadd
      // 70: bipush 2
      // 71: iload 7
      // 73: imul
      // 74: invokestatic java/lang/Math.max (II)I
      // 77: newarray 10
      // 79: astore 8
      // 7b: aload 0
      // 7c: getfield rip/breeze/inject/à.arr_g_2 [I
      // 7f: bipush 0
      // 80: aload 8
      // 82: bipush 0
      // 83: iload 7
      // 85: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 88: aload 0
      // 89: aload 8
      // 8b: putfield rip/breeze/inject/à.arr_g_2 [I
      // 8e: aload 0
      // 8f: getfield rip/breeze/inject/à.arr_g_2 [I
      // 92: iload 2
      // 93: iload 5
      // 95: iastore
      // 96: return
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 38): 39 java/lang/IllegalArgumentException
      // try (45 -> 54): 55 java/lang/IllegalArgumentException
   }

   private void invoke_12(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: pop
      // 17: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 20: istore 5
      // 22: aload 0
      // 23: getfield rip/breeze/inject/à.arr_f_2 [I
      // 26: iload 5
      // 28: ifeq 48
      // 2b: ifnonnull 44
      // 2e: goto 35
      // 31: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 0
      // 36: bipush 10
      // 38: newarray 10
      // 3a: putfield rip/breeze/inject/à.arr_f_2 [I
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rip/breeze/inject/à.arr_f_2 [I
      // 48: arraylength
      // 49: istore 6
      // 4b: aload 0
      // 4c: getfield rip/breeze/inject/à.short_d_2 S
      // 4f: lload 2
      // 50: lconst_0
      // 51: lcmp
      // 52: ifle a7
      // 55: iload 6
      // 57: iload 5
      // 59: ifeq a5
      // 5c: if_icmplt 8a
      // 5f: goto 66
      // 62: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: aload 0
      // 67: getfield rip/breeze/inject/à.short_d_2 S
      // 6a: bipush 1
      // 6b: iadd
      // 6c: bipush 2
      // 6d: iload 6
      // 6f: imul
      // 70: invokestatic java/lang/Math.max (II)I
      // 73: newarray 10
      // 75: astore 7
      // 77: aload 0
      // 78: getfield rip/breeze/inject/à.arr_f_2 [I
      // 7b: bipush 0
      // 7c: aload 7
      // 7e: bipush 0
      // 7f: iload 6
      // 81: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 84: aload 0
      // 85: aload 7
      // 87: putfield rip/breeze/inject/à.arr_f_2 [I
      // 8a: aload 0
      // 8b: getfield rip/breeze/inject/à.arr_f_2 [I
      // 8e: aload 0
      // 8f: dup
      // 90: getfield rip/breeze/inject/à.short_d_2 S
      // 93: dup_x1
      // 94: bipush 1
      // 95: iadd
      // 96: i2s
      // 97: putfield rip/breeze/inject/à.short_d_2 S
      // 9a: iload 4
      // 9c: iastore
      // 9d: aload 0
      // 9e: getfield rip/breeze/inject/à.short_e_2 S
      // a1: aload 0
      // a2: getfield rip/breeze/inject/à.short_d_2 S
      // a5: iadd
      // a6: i2s
      // a7: istore 7
      // a9: lload 2
      // aa: lconst_0
      // ab: lcmp
      // ac: ifle c4
      // af: iload 7
      // b1: aload 0
      // b2: getfield rip/breeze/inject/à.ª_j_2 Lrip/breeze/inject/ª;
      // b5: getfield rip/breeze/inject/ª.short_æ_2 S
      // b8: if_icmple cb
      // bb: aload 0
      // bc: getfield rip/breeze/inject/à.ª_j_2 Lrip/breeze/inject/ª;
      // bf: iload 7
      // c1: putfield rip/breeze/inject/ª.short_æ_2 S
      // c4: goto cb
      // c7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ca: athrow
      // cb: return
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 32): 33 java/lang/IllegalArgumentException
      // try (39 -> 49): 50 java/lang/IllegalArgumentException
      // try (91 -> 104): 105 java/lang/IllegalArgumentException
   }

   private void invoke_13(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util139
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
      // 01b: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 15627576306399
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 100961733356881
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 99033270342275
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 03b: istore 12
      // 03d: aload 5
      // 03f: bipush 0
      // 040: invokevirtual java/lang/String.charAt (I)C
      // 043: iload 12
      // 045: ifeq 074
      // 048: bipush 40
      // 04a: if_icmpne 077
      // 04d: goto 054
      // 050: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: aload 5
      // 056: lload 8
      // 058: bipush 2
      // 059: anewarray 4
      // 05c: dup_x2
      // 05d: dup_x2
      // 05e: pop
      // 05f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 062: bipush 1
      // 063: swap
      // 064: aastore
      // 065: dup_x1
      // 066: swap
      // 067: bipush 0
      // 068: swap
      // 069: aastore
      // 06a: invokestatic rip/breeze/inject/MathUtil3.clamp_2 ([Ljava/lang/Object;)I
      // 06d: goto 074
      // 070: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: goto 078
      // 077: bipush 0
      // 078: istore 13
      // 07a: aload 2
      // 07b: lload 6
      // 07d: aload 5
      // 07f: iload 13
      // 081: bipush 4
      // 082: anewarray 4
      // 085: dup_x1
      // 086: swap
      // 087: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08a: bipush 3
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 2
      // 090: swap
      // 091: aastore
      // 092: dup_x2
      // 093: dup_x2
      // 094: pop
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: bipush 1
      // 099: swap
      // 09a: aastore
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: invokestatic rip/breeze/inject/à.method_004 ([Ljava/lang/Object;)I
      // 0a3: istore 14
      // 0a5: iload 14
      // 0a7: iload 12
      // 0a9: lload 3
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: iflt 0f2
      // 0af: ifeq 0f0
      // 0b2: ifeq 12f
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: iload 14
      // 0bf: iload 12
      // 0c1: ifeq 113
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: lload 10
      // 0cd: dup2_x1
      // 0ce: pop2
      // 0cf: bipush 2
      // 0d0: anewarray 4
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0e7: iload 14
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: ldc 4194308
      // 0f2: lload 3
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: ifle 0ff
      // 0f8: if_icmpeq 109
      // 0fb: iload 14
      // 0fd: ldc 4194307
      // 0ff: if_icmpne 12f
      // 102: goto 109
      // 105: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 108: athrow
      // 109: aload 0
      // 10a: ldc 4194304
      // 10c: goto 113
      // 10f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 112: athrow
      // 113: lload 10
      // 115: dup2_x1
      // 116: pop2
      // 117: bipush 2
      // 118: anewarray 4
      // 11b: dup_x1
      // 11c: swap
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: bipush 1
      // 121: swap
      // 122: aastore
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 12f: return
      // try (38 -> 45): 46 java/lang/IllegalArgumentException
      // try (43 -> 65): 66 java/lang/IllegalArgumentException
      // try (102 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 117): 118 java/lang/IllegalArgumentException
      // try (113 -> 140): 141 java/lang/IllegalArgumentException
      // try (143 -> 152): 153 java/lang/IllegalArgumentException
      // try (149 -> 157): 158 java/lang/IllegalArgumentException
   }

   private int invoke_14(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 15: istore 4
      // 17: aload 0
      // 18: getfield rip/breeze/inject/à.short_d_2 S
      // 1b: iload 4
      // 1d: ifeq 50
      // 20: ifle 40
      // 23: goto 2a
      // 26: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/à.arr_f_2 [I
      // 2e: aload 0
      // 2f: dup
      // 30: getfield rip/breeze/inject/à.short_d_2 S
      // 33: bipush 1
      // 34: isub
      // 35: i2s
      // 36: dup_x1
      // 37: putfield rip/breeze/inject/à.short_d_2 S
      // 3a: iaload
      // 3b: ireturn
      // 3c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: ldc 25165824
      // 42: aload 0
      // 43: dup
      // 44: getfield rip/breeze/inject/à.short_e_2 S
      // 47: bipush 1
      // 48: isub
      // 49: i2s
      // 4a: dup_x1
      // 4b: putfield rip/breeze/inject/à.short_e_2 S
      // 4e: ineg
      // 4f: ior
      // 50: ireturn
      // try (14 -> 19): 20 java/lang/IllegalArgumentException
      // try (18 -> 34): 34 java/lang/IllegalArgumentException
   }

   private void invoke_15(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: pop
      // 17: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 20: istore 5
      // 22: aload 0
      // 23: iload 5
      // 25: ifeq 68
      // 28: getfield rip/breeze/inject/à.short_d_2 S
      // 2b: iload 4
      // 2d: if_icmplt 4f
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: dup
      // 39: getfield rip/breeze/inject/à.short_d_2 S
      // 3c: iload 4
      // 3e: isub
      // 3f: i2s
      // 40: putfield rip/breeze/inject/à.short_d_2 S
      // 43: iload 5
      // 45: ifne 6c
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dup
      // 51: getfield rip/breeze/inject/à.short_e_2 S
      // 54: iload 4
      // 56: aload 0
      // 57: getfield rip/breeze/inject/à.short_d_2 S
      // 5a: isub
      // 5b: isub
      // 5c: i2s
      // 5d: putfield rip/breeze/inject/à.short_e_2 S
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67: athrow
      // 68: bipush 0
      // 69: putfield rip/breeze/inject/à.short_d_2 S
      // 6c: return
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
      // try (23 -> 38): 39 java/lang/IllegalArgumentException
      // try (29 -> 52): 53 java/lang/IllegalArgumentException
   }

   private void invoke_16(Object[] param1) {
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
      // 012: pop
      // 013: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 71039766961256
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 34458630800060
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 02c: aload 2
      // 02d: bipush 0
      // 02e: invokevirtual java/lang/String.charAt (I)C
      // 031: istore 9
      // 033: istore 10
      // 035: iload 9
      // 037: bipush 40
      // 039: iload 10
      // 03b: ifne 098
      // 03e: if_icmpne 08d
      // 041: goto 048
      // 044: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 047: athrow
      // 048: aload 0
      // 049: lload 7
      // 04b: aload 2
      // 04c: bipush 2
      // 04d: anewarray 4
      // 050: dup_x1
      // 051: swap
      // 052: bipush 1
      // 053: swap
      // 054: aastore
      // 055: dup_x2
      // 056: dup_x2
      // 057: pop
      // 058: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: invokestatic rip/breeze/inject/MathUtil3.clamp_4 ([Ljava/lang/Object;)I
      // 061: bipush 2
      // 062: ishr
      // 063: bipush 1
      // 064: isub
      // 065: lload 5
      // 067: dup2_x1
      // 068: pop2
      // 069: bipush 2
      // 06a: anewarray 4
      // 06d: dup_x1
      // 06e: swap
      // 06f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 072: bipush 1
      // 073: swap
      // 074: aastore
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 081: iload 10
      // 083: ifeq 106
      // 086: goto 08d
      // 089: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: iload 9
      // 08f: bipush 74
      // 091: goto 098
      // 094: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 097: athrow
      // 098: lload 3
      // 099: lconst_0
      // 09a: lcmp
      // 09b: iflt 0b8
      // 09e: iload 10
      // 0a0: ifne 0b8
      // 0a3: if_icmpeq 0bb
      // 0a6: goto 0ad
      // 0a9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: iload 9
      // 0af: bipush 68
      // 0b1: goto 0b8
      // 0b4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b7: athrow
      // 0b8: if_icmpne 0e3
      // 0bb: aload 0
      // 0bc: lload 5
      // 0be: bipush 2
      // 0bf: bipush 2
      // 0c0: anewarray 4
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 0
      // 0d2: swap
      // 0d3: aastore
      // 0d4: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0d7: iload 10
      // 0d9: ifeq 106
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: lload 5
      // 0e6: bipush 1
      // 0e7: bipush 2
      // 0e8: anewarray 4
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f0: bipush 1
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: return
      // try (33 -> 38): 39 java/lang/IllegalArgumentException
      // try (37 -> 84): 85 java/lang/IllegalArgumentException
      // try (41 -> 89): 90 java/lang/IllegalArgumentException
      // try (92 -> 99): 100 java/lang/IllegalArgumentException
      // try (98 -> 104): 105 java/lang/IllegalArgumentException
      // try (107 -> 129): 130 java/lang/IllegalArgumentException
      // try (108 -> 151): 152 java/lang/IllegalArgumentException
   }

   private void invoke_17(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 1f: istore 5
      // 21: aload 0
      // 22: getfield rip/breeze/inject/à.arr_b_2 [I
      // 25: iload 5
      // 27: ifne 46
      // 2a: ifnonnull 42
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 2
      // 36: newarray 10
      // 38: putfield rip/breeze/inject/à.arr_b_2 [I
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rip/breeze/inject/à.arr_b_2 [I
      // 46: arraylength
      // 47: istore 6
      // 49: lload 3
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: ifle 99
      // 4f: aload 0
      // 50: iload 5
      // 52: ifne 89
      // 55: getfield rip/breeze/inject/à.int_c_2 I
      // 58: iload 6
      // 5a: if_icmplt 88
      // 5d: goto 64
      // 60: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 63: athrow
      // 64: aload 0
      // 65: getfield rip/breeze/inject/à.int_c_2 I
      // 68: bipush 1
      // 69: iadd
      // 6a: bipush 2
      // 6b: iload 6
      // 6d: imul
      // 6e: invokestatic java/lang/Math.max (II)I
      // 71: newarray 10
      // 73: astore 7
      // 75: aload 0
      // 76: getfield rip/breeze/inject/à.arr_b_2 [I
      // 79: bipush 0
      // 7a: aload 7
      // 7c: bipush 0
      // 7d: iload 6
      // 7f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 82: aload 0
      // 83: aload 7
      // 85: putfield rip/breeze/inject/à.arr_b_2 [I
      // 88: aload 0
      // 89: getfield rip/breeze/inject/à.arr_b_2 [I
      // 8c: aload 0
      // 8d: dup
      // 8e: getfield rip/breeze/inject/à.int_c_2 I
      // 91: dup_x1
      // 92: bipush 1
      // 93: iadd
      // 94: putfield rip/breeze/inject/à.int_c_2 I
      // 97: iload 2
      // 98: iastore
      // 99: return
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 32): 33 java/lang/IllegalArgumentException
      // try (39 -> 49): 50 java/lang/IllegalArgumentException
   }

   private int invoke_18(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 32263786896522
      // 02c: lxor
      // 02d: lstore 6
      // 02f: pop2
      // 030: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 033: istore 8
      // 035: iload 3
      // 036: iload 8
      // 038: ifeq 090
      // 03b: ldc 4194310
      // 03d: if_icmpeq 088
      // 040: goto 047
      // 043: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 046: athrow
      // 047: iload 3
      // 048: ldc_w -4194304
      // 04b: iand
      // 04c: iload 8
      // 04e: ifeq 090
      // 051: goto 058
      // 054: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: lload 4
      // 05a: lconst_0
      // 05b: lcmp
      // 05c: ifle 089
      // 05f: ldc 12582912
      // 061: if_icmpeq 088
      // 064: goto 06b
      // 067: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: iload 3
      // 06c: ldc_w -4194304
      // 06f: iand
      // 070: iload 8
      // 072: ifeq 1cb
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: ldc 16777216
      // 07e: if_icmpne 1ca
      // 081: goto 088
      // 084: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 087: athrow
      // 088: bipush 0
      // 089: goto 090
      // 08c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08f: athrow
      // 090: istore 9
      // 092: iload 9
      // 094: aload 0
      // 095: getfield rip/breeze/inject/à.int_c_2 I
      // 098: if_icmpge 1ca
      // 09b: aload 0
      // 09c: getfield rip/breeze/inject/à.arr_b_2 [I
      // 09f: iload 9
      // 0a1: iaload
      // 0a2: istore 10
      // 0a4: iload 10
      // 0a6: ldc -67108864
      // 0a8: iand
      // 0a9: istore 11
      // 0ab: iload 10
      // 0ad: ldc 62914560
      // 0af: iand
      // 0b0: istore 12
      // 0b2: iload 10
      // 0b4: ldc 1048575
      // 0b6: iand
      // 0b7: istore 13
      // 0b9: iload 12
      // 0bb: iload 8
      // 0bd: lload 4
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 0c9
      // 0c4: ifeq 1cb
      // 0c7: ldc 20971520
      // 0c9: iload 8
      // 0cb: lload 4
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 10b
      // 0d2: ifeq 109
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: if_icmpne 0fe
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: iload 11
      // 0e8: aload 0
      // 0e9: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0ec: iload 13
      // 0ee: iaload
      // 0ef: iadd
      // 0f0: istore 10
      // 0f2: iload 8
      // 0f4: lload 4
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: iflt 132
      // 0fb: ifne 131
      // 0fe: iload 12
      // 100: ldc 25165824
      // 102: goto 109
      // 105: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 108: athrow
      // 109: iload 8
      // 10b: lload 4
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 136
      // 112: ifeq 134
      // 115: if_icmpne 131
      // 118: goto 11f
      // 11b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11e: athrow
      // 11f: iload 11
      // 121: aload 0
      // 122: getfield rip/breeze/inject/à.arr_h_2 [I
      // 125: aload 0
      // 126: getfield rip/breeze/inject/à.arr_h_2 [I
      // 129: arraylength
      // 12a: iload 13
      // 12c: isub
      // 12d: iaload
      // 12e: iadd
      // 12f: istore 10
      // 131: iload 3
      // 132: iload 10
      // 134: iload 8
      // 136: lload 4
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 156
      // 13d: ifeq 154
      // 140: if_icmpne 1c2
      // 143: goto 14a
      // 146: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 149: athrow
      // 14a: iload 3
      // 14b: ldc 4194310
      // 14d: goto 154
      // 150: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 153: athrow
      // 154: iload 8
      // 156: ifeq 1c0
      // 159: if_icmpne 18d
      // 15c: goto 163
      // 15f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 162: athrow
      // 163: ldc 8388608
      // 165: aload 2
      // 166: aload 2
      // 167: bipush 0
      // 168: anewarray 4
      // 16b: invokevirtual rip/breeze/inject/Util139.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 16e: lload 6
      // 170: dup2_x1
      // 171: pop2
      // 172: bipush 2
      // 173: anewarray 4
      // 176: dup_x1
      // 177: swap
      // 178: bipush 1
      // 179: swap
      // 17a: aastore
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 0
      // 182: swap
      // 183: aastore
      // 184: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 187: ior
      // 188: ireturn
      // 189: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18c: athrow
      // 18d: ldc 8388608
      // 18f: aload 2
      // 190: aload 2
      // 191: iload 3
      // 192: ldc 1048575
      // 194: iand
      // 195: bipush 1
      // 196: anewarray 4
      // 199: dup_x1
      // 19a: swap
      // 19b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_22 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 1a4: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1a7: lload 6
      // 1a9: dup2_x1
      // 1aa: pop2
      // 1ab: bipush 2
      // 1ac: anewarray 4
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 1c0: ior
      // 1c1: ireturn
      // 1c2: iinc 9 1
      // 1c5: iload 8
      // 1c7: ifne 092
      // 1ca: iload 3
      // 1cb: ireturn
      // try (31 -> 36): 37 java/lang/IllegalArgumentException
      // try (34 -> 44): 45 java/lang/IllegalArgumentException
      // try (39 -> 53): 54 java/lang/IllegalArgumentException
      // try (47 -> 61): 62 java/lang/IllegalArgumentException
      // try (56 -> 66): 67 java/lang/IllegalArgumentException
      // try (64 -> 70): 71 java/lang/IllegalArgumentException
      // try (95 -> 109): 110 java/lang/IllegalArgumentException
      // try (102 -> 113): 114 java/lang/IllegalArgumentException
      // try (123 -> 131): 132 java/lang/IllegalArgumentException
      // try (134 -> 141): 142 java/lang/IllegalArgumentException
      // try (157 -> 164): 165 java/lang/IllegalArgumentException
      // try (163 -> 169): 170 java/lang/IllegalArgumentException
      // try (172 -> 175): 176 java/lang/IllegalArgumentException
      // try (174 -> 204): 204 java/lang/IllegalArgumentException
   }

   void invoke_19(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 0000: aload 1
      // 0001: dup
      // 0002: bipush 0
      // 0003: aaload
      // 0004: checkcast java/lang/Integer
      // 0007: invokevirtual java/lang/Integer.intValue ()I
      // 000a: istore 2
      // 000b: dup
      // 000c: bipush 1
      // 000d: aaload
      // 000e: checkcast java/lang/Integer
      // 0011: invokevirtual java/lang/Integer.intValue ()I
      // 0014: istore 3
      // 0015: dup
      // 0016: bipush 2
      // 0017: aaload
      // 0018: checkcast java/lang/Long
      // 001b: invokevirtual java/lang/Long.longValue ()J
      // 001e: lstore 4
      // 0020: dup
      // 0021: bipush 3
      // 0022: aaload
      // 0023: checkcast rip/breeze/inject/BreezeClass3
      // 0026: astore 6
      // 0028: dup
      // 0029: bipush 4
      // 002a: aaload
      // 002b: checkcast rip/breeze/inject/Util139
      // 002e: astore 7
      // 0030: pop
      // 0031: lload 4
      // 0033: dup2
      // 0034: ldc2_w 54899257973640
      // 0037: lxor
      // 0038: lstore 8
      // 003a: dup2
      // 003b: ldc2_w 112323732333111
      // 003e: lxor
      // 003f: lstore 10
      // 0041: dup2
      // 0042: ldc2_w 47435953190994
      // 0045: lxor
      // 0046: lstore 12
      // 0048: dup2
      // 0049: ldc2_w 65682686724617
      // 004c: lxor
      // 004d: lstore 14
      // 004f: dup2
      // 0050: ldc2_w 104025456838789
      // 0053: lxor
      // 0054: lstore 16
      // 0056: dup2
      // 0057: ldc2_w 76096278824944
      // 005a: lxor
      // 005b: lstore 18
      // 005d: dup2
      // 005e: ldc2_w 12181436783014
      // 0061: lxor
      // 0062: lstore 20
      // 0064: dup2
      // 0065: ldc2_w 70570549873244
      // 0068: lxor
      // 0069: lstore 22
      // 006b: dup2
      // 006c: ldc2_w 50174153153519
      // 006f: lxor
      // 0070: lstore 24
      // 0072: dup2
      // 0073: ldc2_w 61157723864870
      // 0076: lxor
      // 0077: lstore 26
      // 0079: pop2
      // 007a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 007d: istore 28
      // 007f: iload 2
      // 0080: tableswitch 6729 0 199 816 828 869 869 869 869 869 869 869 910 910 980 980 980 1021 1021 869 869 1091 6729 6729 869 910 980 1021 1788 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 4315 1857 4482 1955 2053 4315 4315 4315 2176 2534 2176 2534 2176 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 6729 2960 3000 2960 3000 2960 2960 2960 2960 3040 3080 3120 3211 3352 3543 3713 3933 4203 4315 4384 4482 4551 4315 4384 4482 4551 4315 4384 4482 4551 4315 4384 4482 4551 4315 4384 4482 4551 816 816 816 816 4315 4649 4315 4649 4315 4649 4315 4384 4315 4384 4315 4384 4747 4797 4895 4964 4315 4482 1955 5062 4797 4964 4315 1857 4482 816 816 816 5131 4315 4315 5131 5131 3040 3040 3040 3040 3040 3040 3080 3080 3080 3080 3080 3080 3080 3080 816 5200 5200 3040 3040 3040 3080 3040 3080 3040 816 5224 5274 5315 5393 5454 5454 5454 5454 5670 5749 5832 6283 5062 3040 6471 5062 3040 3040 6729 6651 3040 3040
      // 03b0: iload 28
      // 03b2: ifeq 1ad5
      // 03b5: goto 03bc
      // 03b8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03bb: athrow
      // 03bc: aload 0
      // 03bd: lload 22
      // 03bf: ldc 4194309
      // 03c1: bipush 2
      // 03c2: anewarray 4
      // 03c5: dup_x1
      // 03c6: swap
      // 03c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03ca: bipush 1
      // 03cb: swap
      // 03cc: aastore
      // 03cd: dup_x2
      // 03ce: dup_x2
      // 03cf: pop
      // 03d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03d3: bipush 0
      // 03d4: swap
      // 03d5: aastore
      // 03d6: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 03d9: iload 28
      // 03db: ifeq 1ad5
      // 03de: goto 03e5
      // 03e1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03e4: athrow
      // 03e5: aload 0
      // 03e6: lload 22
      // 03e8: ldc 4194305
      // 03ea: bipush 2
      // 03eb: anewarray 4
      // 03ee: dup_x1
      // 03ef: swap
      // 03f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03f3: bipush 1
      // 03f4: swap
      // 03f5: aastore
      // 03f6: dup_x2
      // 03f7: dup_x2
      // 03f8: pop
      // 03f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03fc: bipush 0
      // 03fd: swap
      // 03fe: aastore
      // 03ff: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0402: iload 28
      // 0404: ifeq 1ad5
      // 0407: goto 040e
      // 040a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 040d: athrow
      // 040e: aload 0
      // 040f: lload 22
      // 0411: ldc 4194308
      // 0413: bipush 2
      // 0414: anewarray 4
      // 0417: dup_x1
      // 0418: swap
      // 0419: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 041c: bipush 1
      // 041d: swap
      // 041e: aastore
      // 041f: dup_x2
      // 0420: dup_x2
      // 0421: pop
      // 0422: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0425: bipush 0
      // 0426: swap
      // 0427: aastore
      // 0428: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 042b: aload 0
      // 042c: lload 22
      // 042e: ldc 4194304
      // 0430: bipush 2
      // 0431: anewarray 4
      // 0434: dup_x1
      // 0435: swap
      // 0436: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0439: bipush 1
      // 043a: swap
      // 043b: aastore
      // 043c: dup_x2
      // 043d: dup_x2
      // 043e: pop
      // 043f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0442: bipush 0
      // 0443: swap
      // 0444: aastore
      // 0445: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0448: iload 28
      // 044a: ifeq 1ad5
      // 044d: goto 0454
      // 0450: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0453: athrow
      // 0454: aload 0
      // 0455: lload 22
      // 0457: ldc 4194306
      // 0459: bipush 2
      // 045a: anewarray 4
      // 045d: dup_x1
      // 045e: swap
      // 045f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0462: bipush 1
      // 0463: swap
      // 0464: aastore
      // 0465: dup_x2
      // 0466: dup_x2
      // 0467: pop
      // 0468: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 046b: bipush 0
      // 046c: swap
      // 046d: aastore
      // 046e: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0471: iload 28
      // 0473: ifeq 1ad5
      // 0476: goto 047d
      // 0479: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 047c: athrow
      // 047d: aload 0
      // 047e: lload 22
      // 0480: ldc 4194307
      // 0482: bipush 2
      // 0483: anewarray 4
      // 0486: dup_x1
      // 0487: swap
      // 0488: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 048b: bipush 1
      // 048c: swap
      // 048d: aastore
      // 048e: dup_x2
      // 048f: dup_x2
      // 0490: pop
      // 0491: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0494: bipush 0
      // 0495: swap
      // 0496: aastore
      // 0497: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 049a: aload 0
      // 049b: lload 22
      // 049d: ldc 4194304
      // 049f: bipush 2
      // 04a0: anewarray 4
      // 04a3: dup_x1
      // 04a4: swap
      // 04a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04a8: bipush 1
      // 04a9: swap
      // 04aa: aastore
      // 04ab: dup_x2
      // 04ac: dup_x2
      // 04ad: pop
      // 04ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04b1: bipush 0
      // 04b2: swap
      // 04b3: aastore
      // 04b4: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 04b7: iload 28
      // 04b9: ifeq 1ad5
      // 04bc: goto 04c3
      // 04bf: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04c2: athrow
      // 04c3: aload 6
      // 04c5: getfield rip/breeze/inject/BreezeClass3.int_ç I
      // 04c8: lload 4
      // 04ca: lconst_0
      // 04cb: lcmp
      // 04cc: ifle 053b
      // 04cf: tableswitch 673 3 17 77 188 118 229 299 380 673 673 673 673 673 673 542 461 623
      // 0518: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 051b: athrow
      // 051c: aload 0
      // 051d: lload 22
      // 051f: ldc 4194305
      // 0521: bipush 2
      // 0522: anewarray 4
      // 0525: dup_x1
      // 0526: swap
      // 0527: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 052a: bipush 1
      // 052b: swap
      // 052c: aastore
      // 052d: dup_x2
      // 052e: dup_x2
      // 052f: pop
      // 0530: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0533: bipush 0
      // 0534: swap
      // 0535: aastore
      // 0536: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0539: iload 28
      // 053b: ifeq 1ad5
      // 053e: goto 0545
      // 0541: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0544: athrow
      // 0545: aload 0
      // 0546: lload 22
      // 0548: ldc 4194308
      // 054a: bipush 2
      // 054b: anewarray 4
      // 054e: dup_x1
      // 054f: swap
      // 0550: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0553: bipush 1
      // 0554: swap
      // 0555: aastore
      // 0556: dup_x2
      // 0557: dup_x2
      // 0558: pop
      // 0559: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055c: bipush 0
      // 055d: swap
      // 055e: aastore
      // 055f: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0562: aload 0
      // 0563: lload 22
      // 0565: ldc 4194304
      // 0567: bipush 2
      // 0568: anewarray 4
      // 056b: dup_x1
      // 056c: swap
      // 056d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0570: bipush 1
      // 0571: swap
      // 0572: aastore
      // 0573: dup_x2
      // 0574: dup_x2
      // 0575: pop
      // 0576: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0579: bipush 0
      // 057a: swap
      // 057b: aastore
      // 057c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 057f: iload 28
      // 0581: ifeq 1ad5
      // 0584: goto 058b
      // 0587: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058a: athrow
      // 058b: aload 0
      // 058c: lload 22
      // 058e: ldc 4194306
      // 0590: bipush 2
      // 0591: anewarray 4
      // 0594: dup_x1
      // 0595: swap
      // 0596: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0599: bipush 1
      // 059a: swap
      // 059b: aastore
      // 059c: dup_x2
      // 059d: dup_x2
      // 059e: pop
      // 059f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a2: bipush 0
      // 05a3: swap
      // 05a4: aastore
      // 05a5: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 05a8: iload 28
      // 05aa: ifeq 1ad5
      // 05ad: goto 05b4
      // 05b0: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05b3: athrow
      // 05b4: aload 0
      // 05b5: lload 22
      // 05b7: ldc 4194307
      // 05b9: bipush 2
      // 05ba: anewarray 4
      // 05bd: dup_x1
      // 05be: swap
      // 05bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05c2: bipush 1
      // 05c3: swap
      // 05c4: aastore
      // 05c5: dup_x2
      // 05c6: dup_x2
      // 05c7: pop
      // 05c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05cb: bipush 0
      // 05cc: swap
      // 05cd: aastore
      // 05ce: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 05d1: aload 0
      // 05d2: lload 22
      // 05d4: ldc 4194304
      // 05d6: bipush 2
      // 05d7: anewarray 4
      // 05da: dup_x1
      // 05db: swap
      // 05dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05df: bipush 1
      // 05e0: swap
      // 05e1: aastore
      // 05e2: dup_x2
      // 05e3: dup_x2
      // 05e4: pop
      // 05e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05e8: bipush 0
      // 05e9: swap
      // 05ea: aastore
      // 05eb: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 05ee: iload 28
      // 05f0: ifeq 1ad5
      // 05f3: goto 05fa
      // 05f6: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05f9: athrow
      // 05fa: aload 0
      // 05fb: ldc 8388608
      // 05fd: aload 7
      // 05ff: lload 8
      // 0601: sipush 14182
      // 0604: ldc2_w 6778350934759845614
      // 0607: lload 4
      // 0609: lxor
      // 060a: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 060d: bipush 2
      // 060e: anewarray 4
      // 0611: dup_x1
      // 0612: swap
      // 0613: bipush 1
      // 0614: swap
      // 0615: aastore
      // 0616: dup_x2
      // 0617: dup_x2
      // 0618: pop
      // 0619: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061c: bipush 0
      // 061d: swap
      // 061e: aastore
      // 061f: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 0622: ior
      // 0623: lload 22
      // 0625: dup2_x1
      // 0626: pop2
      // 0627: bipush 2
      // 0628: anewarray 4
      // 062b: dup_x1
      // 062c: swap
      // 062d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0630: bipush 1
      // 0631: swap
      // 0632: aastore
      // 0633: dup_x2
      // 0634: dup_x2
      // 0635: pop
      // 0636: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0639: bipush 0
      // 063a: swap
      // 063b: aastore
      // 063c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 063f: iload 28
      // 0641: ifeq 1ad5
      // 0644: goto 064b
      // 0647: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 064a: athrow
      // 064b: aload 0
      // 064c: ldc 8388608
      // 064e: aload 7
      // 0650: lload 8
      // 0652: sipush 7717
      // 0655: ldc2_w 4971875911888635820
      // 0658: lload 4
      // 065a: lxor
      // 065b: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 065e: bipush 2
      // 065f: anewarray 4
      // 0662: dup_x1
      // 0663: swap
      // 0664: bipush 1
      // 0665: swap
      // 0666: aastore
      // 0667: dup_x2
      // 0668: dup_x2
      // 0669: pop
      // 066a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066d: bipush 0
      // 066e: swap
      // 066f: aastore
      // 0670: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 0673: ior
      // 0674: lload 22
      // 0676: dup2_x1
      // 0677: pop2
      // 0678: bipush 2
      // 0679: anewarray 4
      // 067c: dup_x1
      // 067d: swap
      // 067e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0681: bipush 1
      // 0682: swap
      // 0683: aastore
      // 0684: dup_x2
      // 0685: dup_x2
      // 0686: pop
      // 0687: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068a: bipush 0
      // 068b: swap
      // 068c: aastore
      // 068d: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0690: iload 28
      // 0692: ifeq 1ad5
      // 0695: goto 069c
      // 0698: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069b: athrow
      // 069c: aload 0
      // 069d: ldc 8388608
      // 069f: aload 7
      // 06a1: lload 8
      // 06a3: sipush 23539
      // 06a6: ldc2_w 2019926237819290236
      // 06a9: lload 4
      // 06ab: lxor
      // 06ac: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 06af: bipush 2
      // 06b0: anewarray 4
      // 06b3: dup_x1
      // 06b4: swap
      // 06b5: bipush 1
      // 06b6: swap
      // 06b7: aastore
      // 06b8: dup_x2
      // 06b9: dup_x2
      // 06ba: pop
      // 06bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06be: bipush 0
      // 06bf: swap
      // 06c0: aastore
      // 06c1: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 06c4: ior
      // 06c5: lload 22
      // 06c7: dup2_x1
      // 06c8: pop2
      // 06c9: bipush 2
      // 06ca: anewarray 4
      // 06cd: dup_x1
      // 06ce: swap
      // 06cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06d2: bipush 1
      // 06d3: swap
      // 06d4: aastore
      // 06d5: dup_x2
      // 06d6: dup_x2
      // 06d7: pop
      // 06d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06db: bipush 0
      // 06dc: swap
      // 06dd: aastore
      // 06de: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 06e1: iload 28
      // 06e3: ifeq 1ad5
      // 06e6: goto 06ed
      // 06e9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06ec: athrow
      // 06ed: aload 0
      // 06ee: ldc 8388608
      // 06f0: aload 7
      // 06f2: lload 8
      // 06f4: sipush 22345
      // 06f7: ldc2_w 3216994259880660686
      // 06fa: lload 4
      // 06fc: lxor
      // 06fd: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 0700: bipush 2
      // 0701: anewarray 4
      // 0704: dup_x1
      // 0705: swap
      // 0706: bipush 1
      // 0707: swap
      // 0708: aastore
      // 0709: dup_x2
      // 070a: dup_x2
      // 070b: pop
      // 070c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 070f: bipush 0
      // 0710: swap
      // 0711: aastore
      // 0712: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 0715: ior
      // 0716: lload 22
      // 0718: dup2_x1
      // 0719: pop2
      // 071a: bipush 2
      // 071b: anewarray 4
      // 071e: dup_x1
      // 071f: swap
      // 0720: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0723: bipush 1
      // 0724: swap
      // 0725: aastore
      // 0726: dup_x2
      // 0727: dup_x2
      // 0728: pop
      // 0729: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 072c: bipush 0
      // 072d: swap
      // 072e: aastore
      // 072f: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0732: iload 28
      // 0734: ifeq 1ad5
      // 0737: goto 073e
      // 073a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073d: athrow
      // 073e: aload 0
      // 073f: aload 7
      // 0741: aload 6
      // 0743: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 0746: lload 20
      // 0748: dup2_x1
      // 0749: pop2
      // 074a: bipush 3
      // 074b: anewarray 4
      // 074e: dup_x1
      // 074f: swap
      // 0750: bipush 2
      // 0751: swap
      // 0752: aastore
      // 0753: dup_x2
      // 0754: dup_x2
      // 0755: pop
      // 0756: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0759: bipush 1
      // 075a: swap
      // 075b: aastore
      // 075c: dup_x1
      // 075d: swap
      // 075e: bipush 0
      // 075f: swap
      // 0760: aastore
      // 0761: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 0764: iload 28
      // 0766: ifeq 1ad5
      // 0769: goto 0770
      // 076c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 076f: athrow
      // 0770: new java/lang/AssertionError
      // 0773: dup
      // 0774: invokespecial java/lang/AssertionError.<init> ()V
      // 0777: athrow
      // 0778: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 077b: athrow
      // 077c: aload 0
      // 077d: aload 0
      // 077e: lload 14
      // 0780: iload 3
      // 0781: bipush 2
      // 0782: anewarray 4
      // 0785: dup_x1
      // 0786: swap
      // 0787: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 078a: bipush 1
      // 078b: swap
      // 078c: aastore
      // 078d: dup_x2
      // 078e: dup_x2
      // 078f: pop
      // 0790: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0793: bipush 0
      // 0794: swap
      // 0795: aastore
      // 0796: invokevirtual rip/breeze/inject/à.method_010 ([Ljava/lang/Object;)I
      // 0799: lload 22
      // 079b: dup2_x1
      // 079c: pop2
      // 079d: bipush 2
      // 079e: anewarray 4
      // 07a1: dup_x1
      // 07a2: swap
      // 07a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07a6: bipush 1
      // 07a7: swap
      // 07a8: aastore
      // 07a9: dup_x2
      // 07aa: dup_x2
      // 07ab: pop
      // 07ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07af: bipush 0
      // 07b0: swap
      // 07b1: aastore
      // 07b2: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 07b5: iload 28
      // 07b7: lload 4
      // 07b9: lconst_0
      // 07ba: lcmp
      // 07bb: iflt 0819
      // 07be: ifeq 1ad5
      // 07c1: aload 0
      // 07c2: lload 10
      // 07c4: bipush 2
      // 07c5: bipush 2
      // 07c6: anewarray 4
      // 07c9: dup_x1
      // 07ca: swap
      // 07cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07ce: bipush 1
      // 07cf: swap
      // 07d0: aastore
      // 07d1: dup_x2
      // 07d2: dup_x2
      // 07d3: pop
      // 07d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d7: bipush 0
      // 07d8: swap
      // 07d9: aastore
      // 07da: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 07dd: aload 0
      // 07de: lload 22
      // 07e0: ldc 4194308
      // 07e2: bipush 2
      // 07e3: anewarray 4
      // 07e6: dup_x1
      // 07e7: swap
      // 07e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07eb: bipush 1
      // 07ec: swap
      // 07ed: aastore
      // 07ee: dup_x2
      // 07ef: dup_x2
      // 07f0: pop
      // 07f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f4: bipush 0
      // 07f5: swap
      // 07f6: aastore
      // 07f7: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 07fa: aload 0
      // 07fb: lload 22
      // 07fd: ldc 4194304
      // 07ff: bipush 2
      // 0800: anewarray 4
      // 0803: dup_x1
      // 0804: swap
      // 0805: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0808: bipush 1
      // 0809: swap
      // 080a: aastore
      // 080b: dup_x2
      // 080c: dup_x2
      // 080d: pop
      // 080e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0811: bipush 0
      // 0812: swap
      // 0813: aastore
      // 0814: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0817: iload 28
      // 0819: ifeq 1ad5
      // 081c: goto 0823
      // 081f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0822: athrow
      // 0823: aload 0
      // 0824: lload 10
      // 0826: bipush 2
      // 0827: bipush 2
      // 0828: anewarray 4
      // 082b: dup_x1
      // 082c: swap
      // 082d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0830: bipush 1
      // 0831: swap
      // 0832: aastore
      // 0833: dup_x2
      // 0834: dup_x2
      // 0835: pop
      // 0836: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0839: bipush 0
      // 083a: swap
      // 083b: aastore
      // 083c: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 083f: aload 0
      // 0840: lload 22
      // 0842: ldc 4194307
      // 0844: bipush 2
      // 0845: anewarray 4
      // 0848: dup_x1
      // 0849: swap
      // 084a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 084d: bipush 1
      // 084e: swap
      // 084f: aastore
      // 0850: dup_x2
      // 0851: dup_x2
      // 0852: pop
      // 0853: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0856: bipush 0
      // 0857: swap
      // 0858: aastore
      // 0859: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 085c: aload 0
      // 085d: lload 22
      // 085f: ldc 4194304
      // 0861: bipush 2
      // 0862: anewarray 4
      // 0865: dup_x1
      // 0866: swap
      // 0867: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 086a: bipush 1
      // 086b: swap
      // 086c: aastore
      // 086d: dup_x2
      // 086e: dup_x2
      // 086f: pop
      // 0870: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0873: bipush 0
      // 0874: swap
      // 0875: aastore
      // 0876: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0879: iload 28
      // 087b: ifeq 1ad5
      // 087e: goto 0885
      // 0881: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0884: athrow
      // 0885: aload 0
      // 0886: lload 10
      // 0888: bipush 1
      // 0889: bipush 2
      // 088a: anewarray 4
      // 088d: dup_x1
      // 088e: swap
      // 088f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0892: bipush 1
      // 0893: swap
      // 0894: aastore
      // 0895: dup_x2
      // 0896: dup_x2
      // 0897: pop
      // 0898: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089b: bipush 0
      // 089c: swap
      // 089d: aastore
      // 089e: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 08a1: aload 0
      // 08a2: lload 16
      // 08a4: bipush 1
      // 08a5: anewarray 4
      // 08a8: dup_x2
      // 08a9: dup_x2
      // 08aa: pop
      // 08ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08ae: bipush 0
      // 08af: swap
      // 08b0: aastore
      // 08b1: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 08b4: istore 29
      // 08b6: aload 0
      // 08b7: iload 29
      // 08b9: ldc 4194309
      // 08bb: iload 28
      // 08bd: ifne 08d7
      // 08c0: if_icmpne 08d3
      // 08c3: goto 08ca
      // 08c6: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c9: athrow
      // 08ca: iload 29
      // 08cc: goto 08d8
      // 08cf: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d2: athrow
      // 08d3: ldc -67108864
      // 08d5: iload 29
      // 08d7: iadd
      // 08d8: lload 22
      // 08da: dup2_x1
      // 08db: pop2
      // 08dc: bipush 2
      // 08dd: anewarray 4
      // 08e0: dup_x1
      // 08e1: swap
      // 08e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e5: bipush 1
      // 08e6: swap
      // 08e7: aastore
      // 08e8: dup_x2
      // 08e9: dup_x2
      // 08ea: pop
      // 08eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08ee: bipush 0
      // 08ef: swap
      // 08f0: aastore
      // 08f1: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 08f4: iload 28
      // 08f6: lload 4
      // 08f8: lconst_0
      // 08f9: lcmp
      // 08fa: ifle 093c
      // 08fd: ifeq 1ad5
      // 0900: aload 0
      // 0901: lload 16
      // 0903: bipush 1
      // 0904: anewarray 4
      // 0907: dup_x2
      // 0908: dup_x2
      // 0909: pop
      // 090a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 090d: bipush 0
      // 090e: swap
      // 090f: aastore
      // 0910: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0913: istore 29
      // 0915: aload 0
      // 0916: iload 3
      // 0917: lload 12
      // 0919: iload 29
      // 091b: bipush 3
      // 091c: anewarray 4
      // 091f: dup_x1
      // 0920: swap
      // 0921: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0924: bipush 2
      // 0925: swap
      // 0926: aastore
      // 0927: dup_x2
      // 0928: dup_x2
      // 0929: pop
      // 092a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092d: bipush 1
      // 092e: swap
      // 092f: aastore
      // 0930: dup_x1
      // 0931: swap
      // 0932: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0935: bipush 0
      // 0936: swap
      // 0937: aastore
      // 0938: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 093b: iload 3
      // 093c: iload 28
      // 093e: ifne 0972
      // 0941: ifle 1ad5
      // 0944: goto 094b
      // 0947: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094a: athrow
      // 094b: aload 0
      // 094c: iload 3
      // 094d: bipush 1
      // 094e: isub
      // 094f: lload 14
      // 0951: dup2_x1
      // 0952: pop2
      // 0953: bipush 2
      // 0954: anewarray 4
      // 0957: dup_x1
      // 0958: swap
      // 0959: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 095c: bipush 1
      // 095d: swap
      // 095e: aastore
      // 095f: dup_x2
      // 0960: dup_x2
      // 0961: pop
      // 0962: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0965: bipush 0
      // 0966: swap
      // 0967: aastore
      // 0968: invokevirtual rip/breeze/inject/à.method_010 ([Ljava/lang/Object;)I
      // 096b: goto 0972
      // 096e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0971: athrow
      // 0972: istore 30
      // 0974: iload 28
      // 0976: lload 4
      // 0978: lconst_0
      // 0979: lcmp
      // 097a: iflt 09e7
      // 097d: ifne 09e5
      // 0980: iload 30
      // 0982: ldc 4194308
      // 0984: if_icmpeq 09b6
      // 0987: goto 098e
      // 098a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 098d: athrow
      // 098e: iload 30
      // 0990: ldc 4194307
      // 0992: iload 28
      // 0994: lload 4
      // 0996: lconst_0
      // 0997: lcmp
      // 0998: ifle 0a08
      // 099b: ifne 09ff
      // 099e: goto 09a5
      // 09a1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09a4: athrow
      // 09a5: lload 4
      // 09a7: lconst_0
      // 09a8: lcmp
      // 09a9: iflt 09f8
      // 09ac: if_icmpne 09f1
      // 09af: goto 09b6
      // 09b2: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09b5: athrow
      // 09b6: aload 0
      // 09b7: iload 3
      // 09b8: bipush 1
      // 09b9: isub
      // 09ba: lload 12
      // 09bc: ldc 4194304
      // 09be: bipush 3
      // 09bf: anewarray 4
      // 09c2: dup_x1
      // 09c3: swap
      // 09c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09c7: bipush 2
      // 09c8: swap
      // 09c9: aastore
      // 09ca: dup_x2
      // 09cb: dup_x2
      // 09cc: pop
      // 09cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d0: bipush 1
      // 09d1: swap
      // 09d2: aastore
      // 09d3: dup_x1
      // 09d4: swap
      // 09d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d8: bipush 0
      // 09d9: swap
      // 09da: aastore
      // 09db: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 09de: goto 09e5
      // 09e1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09e4: athrow
      // 09e5: iload 28
      // 09e7: lload 4
      // 09e9: lconst_0
      // 09ea: lcmp
      // 09eb: iflt 0a5c
      // 09ee: ifeq 0a5a
      // 09f1: iload 30
      // 09f3: ldc 62914560
      // 09f5: iand
      // 09f6: ldc 20971520
      // 09f8: goto 09ff
      // 09fb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09fe: athrow
      // 09ff: lload 4
      // 0a01: lconst_0
      // 0a02: lcmp
      // 0a03: iflt 0a23
      // 0a06: iload 28
      // 0a08: ifne 0a23
      // 0a0b: if_icmpeq 0a26
      // 0a0e: goto 0a15
      // 0a11: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a14: athrow
      // 0a15: iload 30
      // 0a17: ldc 62914560
      // 0a19: iand
      // 0a1a: ldc 25165824
      // 0a1c: goto 0a23
      // 0a1f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a22: athrow
      // 0a23: if_icmpne 0a5a
      // 0a26: aload 0
      // 0a27: iload 3
      // 0a28: bipush 1
      // 0a29: isub
      // 0a2a: iload 30
      // 0a2c: ldc 1048576
      // 0a2e: ior
      // 0a2f: lload 12
      // 0a31: dup2_x1
      // 0a32: pop2
      // 0a33: bipush 3
      // 0a34: anewarray 4
      // 0a37: dup_x1
      // 0a38: swap
      // 0a39: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a3c: bipush 2
      // 0a3d: swap
      // 0a3e: aastore
      // 0a3f: dup_x2
      // 0a40: dup_x2
      // 0a41: pop
      // 0a42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a45: bipush 1
      // 0a46: swap
      // 0a47: aastore
      // 0a48: dup_x1
      // 0a49: swap
      // 0a4a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a4d: bipush 0
      // 0a4e: swap
      // 0a4f: aastore
      // 0a50: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 0a53: goto 0a5a
      // 0a56: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a59: athrow
      // 0a5a: iload 28
      // 0a5c: lload 4
      // 0a5e: lconst_0
      // 0a5f: lcmp
      // 0a60: iflt 0ae6
      // 0a63: ifeq 1ad5
      // 0a66: aload 0
      // 0a67: lload 10
      // 0a69: bipush 1
      // 0a6a: bipush 2
      // 0a6b: anewarray 4
      // 0a6e: dup_x1
      // 0a6f: swap
      // 0a70: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a73: bipush 1
      // 0a74: swap
      // 0a75: aastore
      // 0a76: dup_x2
      // 0a77: dup_x2
      // 0a78: pop
      // 0a79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7c: bipush 0
      // 0a7d: swap
      // 0a7e: aastore
      // 0a7f: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0a82: aload 0
      // 0a83: lload 16
      // 0a85: bipush 1
      // 0a86: anewarray 4
      // 0a89: dup_x2
      // 0a8a: dup_x2
      // 0a8b: pop
      // 0a8c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8f: bipush 0
      // 0a90: swap
      // 0a91: aastore
      // 0a92: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0a95: istore 29
      // 0a97: aload 0
      // 0a98: iload 3
      // 0a99: lload 12
      // 0a9b: iload 29
      // 0a9d: bipush 3
      // 0a9e: anewarray 4
      // 0aa1: dup_x1
      // 0aa2: swap
      // 0aa3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0aa6: bipush 2
      // 0aa7: swap
      // 0aa8: aastore
      // 0aa9: dup_x2
      // 0aaa: dup_x2
      // 0aab: pop
      // 0aac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aaf: bipush 1
      // 0ab0: swap
      // 0ab1: aastore
      // 0ab2: dup_x1
      // 0ab3: swap
      // 0ab4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ab7: bipush 0
      // 0ab8: swap
      // 0ab9: aastore
      // 0aba: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 0abd: aload 0
      // 0abe: iload 3
      // 0abf: bipush 1
      // 0ac0: iadd
      // 0ac1: lload 12
      // 0ac3: ldc 4194304
      // 0ac5: bipush 3
      // 0ac6: anewarray 4
      // 0ac9: dup_x1
      // 0aca: swap
      // 0acb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ace: bipush 2
      // 0acf: swap
      // 0ad0: aastore
      // 0ad1: dup_x2
      // 0ad2: dup_x2
      // 0ad3: pop
      // 0ad4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad7: bipush 1
      // 0ad8: swap
      // 0ad9: aastore
      // 0ada: dup_x1
      // 0adb: swap
      // 0adc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0adf: bipush 0
      // 0ae0: swap
      // 0ae1: aastore
      // 0ae2: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 0ae5: iload 3
      // 0ae6: iload 28
      // 0ae8: ifne 0b1c
      // 0aeb: ifle 1ad5
      // 0aee: goto 0af5
      // 0af1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0af4: athrow
      // 0af5: aload 0
      // 0af6: iload 3
      // 0af7: bipush 1
      // 0af8: isub
      // 0af9: lload 14
      // 0afb: dup2_x1
      // 0afc: pop2
      // 0afd: bipush 2
      // 0afe: anewarray 4
      // 0b01: dup_x1
      // 0b02: swap
      // 0b03: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b06: bipush 1
      // 0b07: swap
      // 0b08: aastore
      // 0b09: dup_x2
      // 0b0a: dup_x2
      // 0b0b: pop
      // 0b0c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0f: bipush 0
      // 0b10: swap
      // 0b11: aastore
      // 0b12: invokevirtual rip/breeze/inject/à.method_010 ([Ljava/lang/Object;)I
      // 0b15: goto 0b1c
      // 0b18: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1b: athrow
      // 0b1c: istore 30
      // 0b1e: iload 28
      // 0b20: lload 4
      // 0b22: lconst_0
      // 0b23: lcmp
      // 0b24: iflt 0b91
      // 0b27: ifne 0b8f
      // 0b2a: iload 30
      // 0b2c: ldc 4194308
      // 0b2e: if_icmpeq 0b60
      // 0b31: goto 0b38
      // 0b34: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b37: athrow
      // 0b38: iload 30
      // 0b3a: ldc 4194307
      // 0b3c: iload 28
      // 0b3e: lload 4
      // 0b40: lconst_0
      // 0b41: lcmp
      // 0b42: iflt 0bb2
      // 0b45: ifne 0ba9
      // 0b48: goto 0b4f
      // 0b4b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b4e: athrow
      // 0b4f: lload 4
      // 0b51: lconst_0
      // 0b52: lcmp
      // 0b53: ifle 0ba2
      // 0b56: if_icmpne 0b9b
      // 0b59: goto 0b60
      // 0b5c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b5f: athrow
      // 0b60: aload 0
      // 0b61: iload 3
      // 0b62: bipush 1
      // 0b63: isub
      // 0b64: lload 12
      // 0b66: ldc 4194304
      // 0b68: bipush 3
      // 0b69: anewarray 4
      // 0b6c: dup_x1
      // 0b6d: swap
      // 0b6e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b71: bipush 2
      // 0b72: swap
      // 0b73: aastore
      // 0b74: dup_x2
      // 0b75: dup_x2
      // 0b76: pop
      // 0b77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7a: bipush 1
      // 0b7b: swap
      // 0b7c: aastore
      // 0b7d: dup_x1
      // 0b7e: swap
      // 0b7f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b82: bipush 0
      // 0b83: swap
      // 0b84: aastore
      // 0b85: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 0b88: goto 0b8f
      // 0b8b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b8e: athrow
      // 0b8f: iload 28
      // 0b91: lload 4
      // 0b93: lconst_0
      // 0b94: lcmp
      // 0b95: ifle 0c06
      // 0b98: ifeq 0c04
      // 0b9b: iload 30
      // 0b9d: ldc 62914560
      // 0b9f: iand
      // 0ba0: ldc 20971520
      // 0ba2: goto 0ba9
      // 0ba5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ba8: athrow
      // 0ba9: lload 4
      // 0bab: lconst_0
      // 0bac: lcmp
      // 0bad: ifle 0bcd
      // 0bb0: iload 28
      // 0bb2: ifne 0bcd
      // 0bb5: if_icmpeq 0bd0
      // 0bb8: goto 0bbf
      // 0bbb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bbe: athrow
      // 0bbf: iload 30
      // 0bc1: ldc 62914560
      // 0bc3: iand
      // 0bc4: ldc 25165824
      // 0bc6: goto 0bcd
      // 0bc9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bcc: athrow
      // 0bcd: if_icmpne 0c04
      // 0bd0: aload 0
      // 0bd1: iload 3
      // 0bd2: bipush 1
      // 0bd3: isub
      // 0bd4: iload 30
      // 0bd6: ldc 1048576
      // 0bd8: ior
      // 0bd9: lload 12
      // 0bdb: dup2_x1
      // 0bdc: pop2
      // 0bdd: bipush 3
      // 0bde: anewarray 4
      // 0be1: dup_x1
      // 0be2: swap
      // 0be3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be6: bipush 2
      // 0be7: swap
      // 0be8: aastore
      // 0be9: dup_x2
      // 0bea: dup_x2
      // 0beb: pop
      // 0bec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bef: bipush 1
      // 0bf0: swap
      // 0bf1: aastore
      // 0bf2: dup_x1
      // 0bf3: swap
      // 0bf4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bf7: bipush 0
      // 0bf8: swap
      // 0bf9: aastore
      // 0bfa: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 0bfd: goto 0c04
      // 0c00: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c03: athrow
      // 0c04: iload 28
      // 0c06: lload 4
      // 0c08: lconst_0
      // 0c09: lcmp
      // 0c0a: ifle 0c2e
      // 0c0d: ifeq 1ad5
      // 0c10: aload 0
      // 0c11: lload 10
      // 0c13: bipush 3
      // 0c14: bipush 2
      // 0c15: anewarray 4
      // 0c18: dup_x1
      // 0c19: swap
      // 0c1a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c1d: bipush 1
      // 0c1e: swap
      // 0c1f: aastore
      // 0c20: dup_x2
      // 0c21: dup_x2
      // 0c22: pop
      // 0c23: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c26: bipush 0
      // 0c27: swap
      // 0c28: aastore
      // 0c29: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0c2c: iload 28
      // 0c2e: ifeq 1ad5
      // 0c31: goto 0c38
      // 0c34: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c37: athrow
      // 0c38: aload 0
      // 0c39: lload 10
      // 0c3b: bipush 4
      // 0c3c: bipush 2
      // 0c3d: anewarray 4
      // 0c40: dup_x1
      // 0c41: swap
      // 0c42: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c45: bipush 1
      // 0c46: swap
      // 0c47: aastore
      // 0c48: dup_x2
      // 0c49: dup_x2
      // 0c4a: pop
      // 0c4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c4e: bipush 0
      // 0c4f: swap
      // 0c50: aastore
      // 0c51: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0c54: iload 28
      // 0c56: ifeq 1ad5
      // 0c59: goto 0c60
      // 0c5c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c5f: athrow
      // 0c60: aload 0
      // 0c61: lload 10
      // 0c63: bipush 1
      // 0c64: bipush 2
      // 0c65: anewarray 4
      // 0c68: dup_x1
      // 0c69: swap
      // 0c6a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c6d: bipush 1
      // 0c6e: swap
      // 0c6f: aastore
      // 0c70: dup_x2
      // 0c71: dup_x2
      // 0c72: pop
      // 0c73: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c76: bipush 0
      // 0c77: swap
      // 0c78: aastore
      // 0c79: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0c7c: iload 28
      // 0c7e: ifeq 1ad5
      // 0c81: goto 0c88
      // 0c84: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c87: athrow
      // 0c88: aload 0
      // 0c89: lload 10
      // 0c8b: bipush 2
      // 0c8c: bipush 2
      // 0c8d: anewarray 4
      // 0c90: dup_x1
      // 0c91: swap
      // 0c92: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c95: bipush 1
      // 0c96: swap
      // 0c97: aastore
      // 0c98: dup_x2
      // 0c99: dup_x2
      // 0c9a: pop
      // 0c9b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9e: bipush 0
      // 0c9f: swap
      // 0ca0: aastore
      // 0ca1: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 0ca4: iload 28
      // 0ca6: ifeq 1ad5
      // 0ca9: goto 0cb0
      // 0cac: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0caf: athrow
      // 0cb0: aload 0
      // 0cb1: lload 16
      // 0cb3: bipush 1
      // 0cb4: anewarray 4
      // 0cb7: dup_x2
      // 0cb8: dup_x2
      // 0cb9: pop
      // 0cba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cbd: bipush 0
      // 0cbe: swap
      // 0cbf: aastore
      // 0cc0: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0cc3: istore 29
      // 0cc5: aload 0
      // 0cc6: lload 22
      // 0cc8: iload 29
      // 0cca: bipush 2
      // 0ccb: anewarray 4
      // 0cce: dup_x1
      // 0ccf: swap
      // 0cd0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cd3: bipush 1
      // 0cd4: swap
      // 0cd5: aastore
      // 0cd6: dup_x2
      // 0cd7: dup_x2
      // 0cd8: pop
      // 0cd9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cdc: bipush 0
      // 0cdd: swap
      // 0cde: aastore
      // 0cdf: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0ce2: aload 0
      // 0ce3: lload 22
      // 0ce5: iload 29
      // 0ce7: bipush 2
      // 0ce8: anewarray 4
      // 0ceb: dup_x1
      // 0cec: swap
      // 0ced: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cf0: bipush 1
      // 0cf1: swap
      // 0cf2: aastore
      // 0cf3: dup_x2
      // 0cf4: dup_x2
      // 0cf5: pop
      // 0cf6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf9: bipush 0
      // 0cfa: swap
      // 0cfb: aastore
      // 0cfc: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0cff: iload 28
      // 0d01: lload 4
      // 0d03: lconst_0
      // 0d04: lcmp
      // 0d05: ifle 0d33
      // 0d08: ifeq 1ad5
      // 0d0b: aload 0
      // 0d0c: lload 16
      // 0d0e: bipush 1
      // 0d0f: anewarray 4
      // 0d12: dup_x2
      // 0d13: dup_x2
      // 0d14: pop
      // 0d15: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d18: bipush 0
      // 0d19: swap
      // 0d1a: aastore
      // 0d1b: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0d1e: istore 29
      // 0d20: aload 0
      // 0d21: lload 16
      // 0d23: bipush 1
      // 0d24: anewarray 4
      // 0d27: dup_x2
      // 0d28: dup_x2
      // 0d29: pop
      // 0d2a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2d: bipush 0
      // 0d2e: swap
      // 0d2f: aastore
      // 0d30: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0d33: istore 31
      // 0d35: aload 0
      // 0d36: lload 22
      // 0d38: iload 29
      // 0d3a: bipush 2
      // 0d3b: anewarray 4
      // 0d3e: dup_x1
      // 0d3f: swap
      // 0d40: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d43: bipush 1
      // 0d44: swap
      // 0d45: aastore
      // 0d46: dup_x2
      // 0d47: dup_x2
      // 0d48: pop
      // 0d49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d4c: bipush 0
      // 0d4d: swap
      // 0d4e: aastore
      // 0d4f: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0d52: aload 0
      // 0d53: lload 22
      // 0d55: iload 31
      // 0d57: bipush 2
      // 0d58: anewarray 4
      // 0d5b: dup_x1
      // 0d5c: swap
      // 0d5d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d60: bipush 1
      // 0d61: swap
      // 0d62: aastore
      // 0d63: dup_x2
      // 0d64: dup_x2
      // 0d65: pop
      // 0d66: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d69: bipush 0
      // 0d6a: swap
      // 0d6b: aastore
      // 0d6c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0d6f: aload 0
      // 0d70: lload 22
      // 0d72: iload 29
      // 0d74: bipush 2
      // 0d75: anewarray 4
      // 0d78: dup_x1
      // 0d79: swap
      // 0d7a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d7d: bipush 1
      // 0d7e: swap
      // 0d7f: aastore
      // 0d80: dup_x2
      // 0d81: dup_x2
      // 0d82: pop
      // 0d83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d86: bipush 0
      // 0d87: swap
      // 0d88: aastore
      // 0d89: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0d8c: iload 28
      // 0d8e: lload 4
      // 0d90: lconst_0
      // 0d91: lcmp
      // 0d92: ifle 0dd5
      // 0d95: ifeq 1ad5
      // 0d98: aload 0
      // 0d99: lload 16
      // 0d9b: bipush 1
      // 0d9c: anewarray 4
      // 0d9f: dup_x2
      // 0da0: dup_x2
      // 0da1: pop
      // 0da2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da5: bipush 0
      // 0da6: swap
      // 0da7: aastore
      // 0da8: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0dab: istore 29
      // 0dad: aload 0
      // 0dae: lload 16
      // 0db0: bipush 1
      // 0db1: anewarray 4
      // 0db4: dup_x2
      // 0db5: dup_x2
      // 0db6: pop
      // 0db7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dba: bipush 0
      // 0dbb: swap
      // 0dbc: aastore
      // 0dbd: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0dc0: istore 31
      // 0dc2: aload 0
      // 0dc3: lload 16
      // 0dc5: bipush 1
      // 0dc6: anewarray 4
      // 0dc9: dup_x2
      // 0dca: dup_x2
      // 0dcb: pop
      // 0dcc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dcf: bipush 0
      // 0dd0: swap
      // 0dd1: aastore
      // 0dd2: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0dd5: istore 32
      // 0dd7: aload 0
      // 0dd8: lload 22
      // 0dda: iload 29
      // 0ddc: bipush 2
      // 0ddd: anewarray 4
      // 0de0: dup_x1
      // 0de1: swap
      // 0de2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de5: bipush 1
      // 0de6: swap
      // 0de7: aastore
      // 0de8: dup_x2
      // 0de9: dup_x2
      // 0dea: pop
      // 0deb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dee: bipush 0
      // 0def: swap
      // 0df0: aastore
      // 0df1: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0df4: aload 0
      // 0df5: lload 22
      // 0df7: iload 32
      // 0df9: bipush 2
      // 0dfa: anewarray 4
      // 0dfd: dup_x1
      // 0dfe: swap
      // 0dff: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e02: bipush 1
      // 0e03: swap
      // 0e04: aastore
      // 0e05: dup_x2
      // 0e06: dup_x2
      // 0e07: pop
      // 0e08: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0b: bipush 0
      // 0e0c: swap
      // 0e0d: aastore
      // 0e0e: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0e11: aload 0
      // 0e12: lload 22
      // 0e14: iload 31
      // 0e16: bipush 2
      // 0e17: anewarray 4
      // 0e1a: dup_x1
      // 0e1b: swap
      // 0e1c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e1f: bipush 1
      // 0e20: swap
      // 0e21: aastore
      // 0e22: dup_x2
      // 0e23: dup_x2
      // 0e24: pop
      // 0e25: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e28: bipush 0
      // 0e29: swap
      // 0e2a: aastore
      // 0e2b: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0e2e: aload 0
      // 0e2f: lload 22
      // 0e31: iload 29
      // 0e33: bipush 2
      // 0e34: anewarray 4
      // 0e37: dup_x1
      // 0e38: swap
      // 0e39: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3c: bipush 1
      // 0e3d: swap
      // 0e3e: aastore
      // 0e3f: dup_x2
      // 0e40: dup_x2
      // 0e41: pop
      // 0e42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e45: bipush 0
      // 0e46: swap
      // 0e47: aastore
      // 0e48: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0e4b: iload 28
      // 0e4d: lload 4
      // 0e4f: lconst_0
      // 0e50: lcmp
      // 0e51: iflt 0ef7
      // 0e54: ifeq 1ad5
      // 0e57: aload 0
      // 0e58: lload 16
      // 0e5a: bipush 1
      // 0e5b: anewarray 4
      // 0e5e: dup_x2
      // 0e5f: dup_x2
      // 0e60: pop
      // 0e61: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e64: bipush 0
      // 0e65: swap
      // 0e66: aastore
      // 0e67: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0e6a: istore 29
      // 0e6c: aload 0
      // 0e6d: lload 16
      // 0e6f: bipush 1
      // 0e70: anewarray 4
      // 0e73: dup_x2
      // 0e74: dup_x2
      // 0e75: pop
      // 0e76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e79: bipush 0
      // 0e7a: swap
      // 0e7b: aastore
      // 0e7c: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0e7f: istore 31
      // 0e81: aload 0
      // 0e82: lload 22
      // 0e84: iload 31
      // 0e86: bipush 2
      // 0e87: anewarray 4
      // 0e8a: dup_x1
      // 0e8b: swap
      // 0e8c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e8f: bipush 1
      // 0e90: swap
      // 0e91: aastore
      // 0e92: dup_x2
      // 0e93: dup_x2
      // 0e94: pop
      // 0e95: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e98: bipush 0
      // 0e99: swap
      // 0e9a: aastore
      // 0e9b: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0e9e: aload 0
      // 0e9f: lload 22
      // 0ea1: iload 29
      // 0ea3: bipush 2
      // 0ea4: anewarray 4
      // 0ea7: dup_x1
      // 0ea8: swap
      // 0ea9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eac: bipush 1
      // 0ead: swap
      // 0eae: aastore
      // 0eaf: dup_x2
      // 0eb0: dup_x2
      // 0eb1: pop
      // 0eb2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb5: bipush 0
      // 0eb6: swap
      // 0eb7: aastore
      // 0eb8: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0ebb: aload 0
      // 0ebc: lload 22
      // 0ebe: iload 31
      // 0ec0: bipush 2
      // 0ec1: anewarray 4
      // 0ec4: dup_x1
      // 0ec5: swap
      // 0ec6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ec9: bipush 1
      // 0eca: swap
      // 0ecb: aastore
      // 0ecc: dup_x2
      // 0ecd: dup_x2
      // 0ece: pop
      // 0ecf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed2: bipush 0
      // 0ed3: swap
      // 0ed4: aastore
      // 0ed5: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0ed8: aload 0
      // 0ed9: lload 22
      // 0edb: iload 29
      // 0edd: bipush 2
      // 0ede: anewarray 4
      // 0ee1: dup_x1
      // 0ee2: swap
      // 0ee3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ee6: bipush 1
      // 0ee7: swap
      // 0ee8: aastore
      // 0ee9: dup_x2
      // 0eea: dup_x2
      // 0eeb: pop
      // 0eec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eef: bipush 0
      // 0ef0: swap
      // 0ef1: aastore
      // 0ef2: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0ef5: iload 28
      // 0ef7: lload 4
      // 0ef9: lconst_0
      // 0efa: lcmp
      // 0efb: iflt 0f3e
      // 0efe: ifeq 1ad5
      // 0f01: aload 0
      // 0f02: lload 16
      // 0f04: bipush 1
      // 0f05: anewarray 4
      // 0f08: dup_x2
      // 0f09: dup_x2
      // 0f0a: pop
      // 0f0b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0e: bipush 0
      // 0f0f: swap
      // 0f10: aastore
      // 0f11: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0f14: istore 29
      // 0f16: aload 0
      // 0f17: lload 16
      // 0f19: bipush 1
      // 0f1a: anewarray 4
      // 0f1d: dup_x2
      // 0f1e: dup_x2
      // 0f1f: pop
      // 0f20: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f23: bipush 0
      // 0f24: swap
      // 0f25: aastore
      // 0f26: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0f29: istore 31
      // 0f2b: aload 0
      // 0f2c: lload 16
      // 0f2e: bipush 1
      // 0f2f: anewarray 4
      // 0f32: dup_x2
      // 0f33: dup_x2
      // 0f34: pop
      // 0f35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f38: bipush 0
      // 0f39: swap
      // 0f3a: aastore
      // 0f3b: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0f3e: istore 32
      // 0f40: aload 0
      // 0f41: lload 22
      // 0f43: iload 31
      // 0f45: bipush 2
      // 0f46: anewarray 4
      // 0f49: dup_x1
      // 0f4a: swap
      // 0f4b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f4e: bipush 1
      // 0f4f: swap
      // 0f50: aastore
      // 0f51: dup_x2
      // 0f52: dup_x2
      // 0f53: pop
      // 0f54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f57: bipush 0
      // 0f58: swap
      // 0f59: aastore
      // 0f5a: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0f5d: aload 0
      // 0f5e: lload 22
      // 0f60: iload 29
      // 0f62: bipush 2
      // 0f63: anewarray 4
      // 0f66: dup_x1
      // 0f67: swap
      // 0f68: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f6b: bipush 1
      // 0f6c: swap
      // 0f6d: aastore
      // 0f6e: dup_x2
      // 0f6f: dup_x2
      // 0f70: pop
      // 0f71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f74: bipush 0
      // 0f75: swap
      // 0f76: aastore
      // 0f77: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0f7a: aload 0
      // 0f7b: lload 22
      // 0f7d: iload 32
      // 0f7f: bipush 2
      // 0f80: anewarray 4
      // 0f83: dup_x1
      // 0f84: swap
      // 0f85: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f88: bipush 1
      // 0f89: swap
      // 0f8a: aastore
      // 0f8b: dup_x2
      // 0f8c: dup_x2
      // 0f8d: pop
      // 0f8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f91: bipush 0
      // 0f92: swap
      // 0f93: aastore
      // 0f94: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0f97: aload 0
      // 0f98: lload 22
      // 0f9a: iload 31
      // 0f9c: bipush 2
      // 0f9d: anewarray 4
      // 0fa0: dup_x1
      // 0fa1: swap
      // 0fa2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fa5: bipush 1
      // 0fa6: swap
      // 0fa7: aastore
      // 0fa8: dup_x2
      // 0fa9: dup_x2
      // 0faa: pop
      // 0fab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fae: bipush 0
      // 0faf: swap
      // 0fb0: aastore
      // 0fb1: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0fb4: aload 0
      // 0fb5: lload 22
      // 0fb7: iload 29
      // 0fb9: bipush 2
      // 0fba: anewarray 4
      // 0fbd: dup_x1
      // 0fbe: swap
      // 0fbf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc2: bipush 1
      // 0fc3: swap
      // 0fc4: aastore
      // 0fc5: dup_x2
      // 0fc6: dup_x2
      // 0fc7: pop
      // 0fc8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fcb: bipush 0
      // 0fcc: swap
      // 0fcd: aastore
      // 0fce: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 0fd1: iload 28
      // 0fd3: lload 4
      // 0fd5: lconst_0
      // 0fd6: lcmp
      // 0fd7: ifle 102f
      // 0fda: ifeq 1ad5
      // 0fdd: aload 0
      // 0fde: lload 16
      // 0fe0: bipush 1
      // 0fe1: anewarray 4
      // 0fe4: dup_x2
      // 0fe5: dup_x2
      // 0fe6: pop
      // 0fe7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fea: bipush 0
      // 0feb: swap
      // 0fec: aastore
      // 0fed: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 0ff0: istore 29
      // 0ff2: aload 0
      // 0ff3: lload 16
      // 0ff5: bipush 1
      // 0ff6: anewarray 4
      // 0ff9: dup_x2
      // 0ffa: dup_x2
      // 0ffb: pop
      // 0ffc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fff: bipush 0
      // 1000: swap
      // 1001: aastore
      // 1002: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 1005: istore 31
      // 1007: aload 0
      // 1008: lload 16
      // 100a: bipush 1
      // 100b: anewarray 4
      // 100e: dup_x2
      // 100f: dup_x2
      // 1010: pop
      // 1011: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1014: bipush 0
      // 1015: swap
      // 1016: aastore
      // 1017: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 101a: istore 32
      // 101c: aload 0
      // 101d: lload 16
      // 101f: bipush 1
      // 1020: anewarray 4
      // 1023: dup_x2
      // 1024: dup_x2
      // 1025: pop
      // 1026: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1029: bipush 0
      // 102a: swap
      // 102b: aastore
      // 102c: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 102f: istore 33
      // 1031: aload 0
      // 1032: lload 22
      // 1034: iload 31
      // 1036: bipush 2
      // 1037: anewarray 4
      // 103a: dup_x1
      // 103b: swap
      // 103c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 103f: bipush 1
      // 1040: swap
      // 1041: aastore
      // 1042: dup_x2
      // 1043: dup_x2
      // 1044: pop
      // 1045: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1048: bipush 0
      // 1049: swap
      // 104a: aastore
      // 104b: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 104e: aload 0
      // 104f: lload 22
      // 1051: iload 29
      // 1053: bipush 2
      // 1054: anewarray 4
      // 1057: dup_x1
      // 1058: swap
      // 1059: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 105c: bipush 1
      // 105d: swap
      // 105e: aastore
      // 105f: dup_x2
      // 1060: dup_x2
      // 1061: pop
      // 1062: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1065: bipush 0
      // 1066: swap
      // 1067: aastore
      // 1068: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 106b: aload 0
      // 106c: lload 22
      // 106e: iload 33
      // 1070: bipush 2
      // 1071: anewarray 4
      // 1074: dup_x1
      // 1075: swap
      // 1076: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1079: bipush 1
      // 107a: swap
      // 107b: aastore
      // 107c: dup_x2
      // 107d: dup_x2
      // 107e: pop
      // 107f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1082: bipush 0
      // 1083: swap
      // 1084: aastore
      // 1085: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1088: aload 0
      // 1089: lload 22
      // 108b: iload 32
      // 108d: bipush 2
      // 108e: anewarray 4
      // 1091: dup_x1
      // 1092: swap
      // 1093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1096: bipush 1
      // 1097: swap
      // 1098: aastore
      // 1099: dup_x2
      // 109a: dup_x2
      // 109b: pop
      // 109c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 109f: bipush 0
      // 10a0: swap
      // 10a1: aastore
      // 10a2: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 10a5: aload 0
      // 10a6: lload 22
      // 10a8: iload 31
      // 10aa: bipush 2
      // 10ab: anewarray 4
      // 10ae: dup_x1
      // 10af: swap
      // 10b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10b3: bipush 1
      // 10b4: swap
      // 10b5: aastore
      // 10b6: dup_x2
      // 10b7: dup_x2
      // 10b8: pop
      // 10b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10bc: bipush 0
      // 10bd: swap
      // 10be: aastore
      // 10bf: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 10c2: aload 0
      // 10c3: lload 22
      // 10c5: iload 29
      // 10c7: bipush 2
      // 10c8: anewarray 4
      // 10cb: dup_x1
      // 10cc: swap
      // 10cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10d0: bipush 1
      // 10d1: swap
      // 10d2: aastore
      // 10d3: dup_x2
      // 10d4: dup_x2
      // 10d5: pop
      // 10d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10d9: bipush 0
      // 10da: swap
      // 10db: aastore
      // 10dc: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 10df: iload 28
      // 10e1: lload 4
      // 10e3: lconst_0
      // 10e4: lcmp
      // 10e5: ifle 1151
      // 10e8: ifeq 1ad5
      // 10eb: aload 0
      // 10ec: lload 16
      // 10ee: bipush 1
      // 10ef: anewarray 4
      // 10f2: dup_x2
      // 10f3: dup_x2
      // 10f4: pop
      // 10f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f8: bipush 0
      // 10f9: swap
      // 10fa: aastore
      // 10fb: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 10fe: istore 29
      // 1100: aload 0
      // 1101: lload 16
      // 1103: bipush 1
      // 1104: anewarray 4
      // 1107: dup_x2
      // 1108: dup_x2
      // 1109: pop
      // 110a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110d: bipush 0
      // 110e: swap
      // 110f: aastore
      // 1110: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 1113: istore 31
      // 1115: aload 0
      // 1116: lload 22
      // 1118: iload 29
      // 111a: bipush 2
      // 111b: anewarray 4
      // 111e: dup_x1
      // 111f: swap
      // 1120: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1123: bipush 1
      // 1124: swap
      // 1125: aastore
      // 1126: dup_x2
      // 1127: dup_x2
      // 1128: pop
      // 1129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 112c: bipush 0
      // 112d: swap
      // 112e: aastore
      // 112f: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1132: aload 0
      // 1133: lload 22
      // 1135: iload 31
      // 1137: bipush 2
      // 1138: anewarray 4
      // 113b: dup_x1
      // 113c: swap
      // 113d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1140: bipush 1
      // 1141: swap
      // 1142: aastore
      // 1143: dup_x2
      // 1144: dup_x2
      // 1145: pop
      // 1146: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1149: bipush 0
      // 114a: swap
      // 114b: aastore
      // 114c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 114f: iload 28
      // 1151: lload 4
      // 1153: lconst_0
      // 1154: lcmp
      // 1155: iflt 1196
      // 1158: ifeq 1ad5
      // 115b: aload 0
      // 115c: lload 10
      // 115e: bipush 2
      // 115f: bipush 2
      // 1160: anewarray 4
      // 1163: dup_x1
      // 1164: swap
      // 1165: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1168: bipush 1
      // 1169: swap
      // 116a: aastore
      // 116b: dup_x2
      // 116c: dup_x2
      // 116d: pop
      // 116e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1171: bipush 0
      // 1172: swap
      // 1173: aastore
      // 1174: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1177: aload 0
      // 1178: lload 22
      // 117a: ldc 4194305
      // 117c: bipush 2
      // 117d: anewarray 4
      // 1180: dup_x1
      // 1181: swap
      // 1182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1185: bipush 1
      // 1186: swap
      // 1187: aastore
      // 1188: dup_x2
      // 1189: dup_x2
      // 118a: pop
      // 118b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118e: bipush 0
      // 118f: swap
      // 1190: aastore
      // 1191: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1194: iload 28
      // 1196: ifeq 1ad5
      // 1199: goto 11a0
      // 119c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 119f: athrow
      // 11a0: aload 0
      // 11a1: lload 10
      // 11a3: bipush 4
      // 11a4: bipush 2
      // 11a5: anewarray 4
      // 11a8: dup_x1
      // 11a9: swap
      // 11aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11ad: bipush 1
      // 11ae: swap
      // 11af: aastore
      // 11b0: dup_x2
      // 11b1: dup_x2
      // 11b2: pop
      // 11b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b6: bipush 0
      // 11b7: swap
      // 11b8: aastore
      // 11b9: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 11bc: aload 0
      // 11bd: lload 22
      // 11bf: ldc 4194308
      // 11c1: bipush 2
      // 11c2: anewarray 4
      // 11c5: dup_x1
      // 11c6: swap
      // 11c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11ca: bipush 1
      // 11cb: swap
      // 11cc: aastore
      // 11cd: dup_x2
      // 11ce: dup_x2
      // 11cf: pop
      // 11d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d3: bipush 0
      // 11d4: swap
      // 11d5: aastore
      // 11d6: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 11d9: aload 0
      // 11da: lload 22
      // 11dc: ldc 4194304
      // 11de: bipush 2
      // 11df: anewarray 4
      // 11e2: dup_x1
      // 11e3: swap
      // 11e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11e7: bipush 1
      // 11e8: swap
      // 11e9: aastore
      // 11ea: dup_x2
      // 11eb: dup_x2
      // 11ec: pop
      // 11ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f0: bipush 0
      // 11f1: swap
      // 11f2: aastore
      // 11f3: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 11f6: iload 28
      // 11f8: ifeq 1ad5
      // 11fb: goto 1202
      // 11fe: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1201: athrow
      // 1202: aload 0
      // 1203: lload 10
      // 1205: bipush 2
      // 1206: bipush 2
      // 1207: anewarray 4
      // 120a: dup_x1
      // 120b: swap
      // 120c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120f: bipush 1
      // 1210: swap
      // 1211: aastore
      // 1212: dup_x2
      // 1213: dup_x2
      // 1214: pop
      // 1215: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1218: bipush 0
      // 1219: swap
      // 121a: aastore
      // 121b: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 121e: aload 0
      // 121f: lload 22
      // 1221: ldc 4194306
      // 1223: bipush 2
      // 1224: anewarray 4
      // 1227: dup_x1
      // 1228: swap
      // 1229: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 122c: bipush 1
      // 122d: swap
      // 122e: aastore
      // 122f: dup_x2
      // 1230: dup_x2
      // 1231: pop
      // 1232: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1235: bipush 0
      // 1236: swap
      // 1237: aastore
      // 1238: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 123b: iload 28
      // 123d: ifeq 1ad5
      // 1240: goto 1247
      // 1243: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1246: athrow
      // 1247: aload 0
      // 1248: lload 10
      // 124a: bipush 4
      // 124b: bipush 2
      // 124c: anewarray 4
      // 124f: dup_x1
      // 1250: swap
      // 1251: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1254: bipush 1
      // 1255: swap
      // 1256: aastore
      // 1257: dup_x2
      // 1258: dup_x2
      // 1259: pop
      // 125a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125d: bipush 0
      // 125e: swap
      // 125f: aastore
      // 1260: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1263: aload 0
      // 1264: lload 22
      // 1266: ldc 4194307
      // 1268: bipush 2
      // 1269: anewarray 4
      // 126c: dup_x1
      // 126d: swap
      // 126e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1271: bipush 1
      // 1272: swap
      // 1273: aastore
      // 1274: dup_x2
      // 1275: dup_x2
      // 1276: pop
      // 1277: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 127a: bipush 0
      // 127b: swap
      // 127c: aastore
      // 127d: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1280: aload 0
      // 1281: lload 22
      // 1283: ldc 4194304
      // 1285: bipush 2
      // 1286: anewarray 4
      // 1289: dup_x1
      // 128a: swap
      // 128b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 128e: bipush 1
      // 128f: swap
      // 1290: aastore
      // 1291: dup_x2
      // 1292: dup_x2
      // 1293: pop
      // 1294: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1297: bipush 0
      // 1298: swap
      // 1299: aastore
      // 129a: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 129d: iload 28
      // 129f: ifeq 1ad5
      // 12a2: goto 12a9
      // 12a5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a8: athrow
      // 12a9: aload 0
      // 12aa: lload 10
      // 12ac: bipush 3
      // 12ad: bipush 2
      // 12ae: anewarray 4
      // 12b1: dup_x1
      // 12b2: swap
      // 12b3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12b6: bipush 1
      // 12b7: swap
      // 12b8: aastore
      // 12b9: dup_x2
      // 12ba: dup_x2
      // 12bb: pop
      // 12bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12bf: bipush 0
      // 12c0: swap
      // 12c1: aastore
      // 12c2: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 12c5: aload 0
      // 12c6: lload 22
      // 12c8: ldc 4194308
      // 12ca: bipush 2
      // 12cb: anewarray 4
      // 12ce: dup_x1
      // 12cf: swap
      // 12d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12d3: bipush 1
      // 12d4: swap
      // 12d5: aastore
      // 12d6: dup_x2
      // 12d7: dup_x2
      // 12d8: pop
      // 12d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12dc: bipush 0
      // 12dd: swap
      // 12de: aastore
      // 12df: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 12e2: aload 0
      // 12e3: lload 22
      // 12e5: ldc 4194304
      // 12e7: bipush 2
      // 12e8: anewarray 4
      // 12eb: dup_x1
      // 12ec: swap
      // 12ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12f0: bipush 1
      // 12f1: swap
      // 12f2: aastore
      // 12f3: dup_x2
      // 12f4: dup_x2
      // 12f5: pop
      // 12f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f9: bipush 0
      // 12fa: swap
      // 12fb: aastore
      // 12fc: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 12ff: iload 28
      // 1301: ifeq 1ad5
      // 1304: goto 130b
      // 1307: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 130a: athrow
      // 130b: aload 0
      // 130c: iload 3
      // 130d: lload 12
      // 130f: ldc 4194305
      // 1311: bipush 3
      // 1312: anewarray 4
      // 1315: dup_x1
      // 1316: swap
      // 1317: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 131a: bipush 2
      // 131b: swap
      // 131c: aastore
      // 131d: dup_x2
      // 131e: dup_x2
      // 131f: pop
      // 1320: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1323: bipush 1
      // 1324: swap
      // 1325: aastore
      // 1326: dup_x1
      // 1327: swap
      // 1328: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 132b: bipush 0
      // 132c: swap
      // 132d: aastore
      // 132e: invokevirtual rip/breeze/inject/à.method_011 ([Ljava/lang/Object;)V
      // 1331: iload 28
      // 1333: ifeq 1ad5
      // 1336: goto 133d
      // 1339: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 133c: athrow
      // 133d: aload 0
      // 133e: lload 10
      // 1340: bipush 1
      // 1341: bipush 2
      // 1342: anewarray 4
      // 1345: dup_x1
      // 1346: swap
      // 1347: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 134a: bipush 1
      // 134b: swap
      // 134c: aastore
      // 134d: dup_x2
      // 134e: dup_x2
      // 134f: pop
      // 1350: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1353: bipush 0
      // 1354: swap
      // 1355: aastore
      // 1356: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1359: aload 0
      // 135a: lload 22
      // 135c: ldc 4194308
      // 135e: bipush 2
      // 135f: anewarray 4
      // 1362: dup_x1
      // 1363: swap
      // 1364: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1367: bipush 1
      // 1368: swap
      // 1369: aastore
      // 136a: dup_x2
      // 136b: dup_x2
      // 136c: pop
      // 136d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1370: bipush 0
      // 1371: swap
      // 1372: aastore
      // 1373: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1376: aload 0
      // 1377: lload 22
      // 1379: ldc 4194304
      // 137b: bipush 2
      // 137c: anewarray 4
      // 137f: dup_x1
      // 1380: swap
      // 1381: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1384: bipush 1
      // 1385: swap
      // 1386: aastore
      // 1387: dup_x2
      // 1388: dup_x2
      // 1389: pop
      // 138a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 138d: bipush 0
      // 138e: swap
      // 138f: aastore
      // 1390: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1393: iload 28
      // 1395: ifeq 1ad5
      // 1398: goto 139f
      // 139b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 139e: athrow
      // 139f: aload 0
      // 13a0: lload 10
      // 13a2: bipush 1
      // 13a3: bipush 2
      // 13a4: anewarray 4
      // 13a7: dup_x1
      // 13a8: swap
      // 13a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13ac: bipush 1
      // 13ad: swap
      // 13ae: aastore
      // 13af: dup_x2
      // 13b0: dup_x2
      // 13b1: pop
      // 13b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b5: bipush 0
      // 13b6: swap
      // 13b7: aastore
      // 13b8: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 13bb: aload 0
      // 13bc: lload 22
      // 13be: ldc 4194306
      // 13c0: bipush 2
      // 13c1: anewarray 4
      // 13c4: dup_x1
      // 13c5: swap
      // 13c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13c9: bipush 1
      // 13ca: swap
      // 13cb: aastore
      // 13cc: dup_x2
      // 13cd: dup_x2
      // 13ce: pop
      // 13cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13d2: bipush 0
      // 13d3: swap
      // 13d4: aastore
      // 13d5: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 13d8: iload 28
      // 13da: ifeq 1ad5
      // 13dd: goto 13e4
      // 13e0: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13e3: athrow
      // 13e4: aload 0
      // 13e5: lload 10
      // 13e7: bipush 1
      // 13e8: bipush 2
      // 13e9: anewarray 4
      // 13ec: dup_x1
      // 13ed: swap
      // 13ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13f1: bipush 1
      // 13f2: swap
      // 13f3: aastore
      // 13f4: dup_x2
      // 13f5: dup_x2
      // 13f6: pop
      // 13f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13fa: bipush 0
      // 13fb: swap
      // 13fc: aastore
      // 13fd: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1400: aload 0
      // 1401: lload 22
      // 1403: ldc 4194307
      // 1405: bipush 2
      // 1406: anewarray 4
      // 1409: dup_x1
      // 140a: swap
      // 140b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 140e: bipush 1
      // 140f: swap
      // 1410: aastore
      // 1411: dup_x2
      // 1412: dup_x2
      // 1413: pop
      // 1414: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1417: bipush 0
      // 1418: swap
      // 1419: aastore
      // 141a: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 141d: aload 0
      // 141e: lload 22
      // 1420: ldc 4194304
      // 1422: bipush 2
      // 1423: anewarray 4
      // 1426: dup_x1
      // 1427: swap
      // 1428: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 142b: bipush 1
      // 142c: swap
      // 142d: aastore
      // 142e: dup_x2
      // 142f: dup_x2
      // 1430: pop
      // 1431: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1434: bipush 0
      // 1435: swap
      // 1436: aastore
      // 1437: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 143a: iload 28
      // 143c: ifeq 1ad5
      // 143f: goto 1446
      // 1442: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1445: athrow
      // 1446: aload 0
      // 1447: lload 10
      // 1449: bipush 1
      // 144a: bipush 2
      // 144b: anewarray 4
      // 144e: dup_x1
      // 144f: swap
      // 1450: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1453: bipush 1
      // 1454: swap
      // 1455: aastore
      // 1456: dup_x2
      // 1457: dup_x2
      // 1458: pop
      // 1459: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145c: bipush 0
      // 145d: swap
      // 145e: aastore
      // 145f: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1462: aload 0
      // 1463: lload 22
      // 1465: ldc 4194305
      // 1467: bipush 2
      // 1468: anewarray 4
      // 146b: dup_x1
      // 146c: swap
      // 146d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1470: bipush 1
      // 1471: swap
      // 1472: aastore
      // 1473: dup_x2
      // 1474: dup_x2
      // 1475: pop
      // 1476: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1479: bipush 0
      // 147a: swap
      // 147b: aastore
      // 147c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 147f: iload 28
      // 1481: ifeq 1ad5
      // 1484: goto 148b
      // 1487: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 148a: athrow
      // 148b: aload 0
      // 148c: lload 10
      // 148e: bipush 4
      // 148f: bipush 2
      // 1490: anewarray 4
      // 1493: dup_x1
      // 1494: swap
      // 1495: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1498: bipush 1
      // 1499: swap
      // 149a: aastore
      // 149b: dup_x2
      // 149c: dup_x2
      // 149d: pop
      // 149e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a1: bipush 0
      // 14a2: swap
      // 14a3: aastore
      // 14a4: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 14a7: aload 0
      // 14a8: lload 22
      // 14aa: ldc 4194305
      // 14ac: bipush 2
      // 14ad: anewarray 4
      // 14b0: dup_x1
      // 14b1: swap
      // 14b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14b5: bipush 1
      // 14b6: swap
      // 14b7: aastore
      // 14b8: dup_x2
      // 14b9: dup_x2
      // 14ba: pop
      // 14bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14be: bipush 0
      // 14bf: swap
      // 14c0: aastore
      // 14c1: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 14c4: iload 28
      // 14c6: ifeq 1ad5
      // 14c9: goto 14d0
      // 14cc: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14cf: athrow
      // 14d0: new java/lang/IllegalArgumentException
      // 14d3: dup
      // 14d4: sipush 16031
      // 14d7: ldc2_w 2292215154022688533
      // 14da: lload 4
      // 14dc: lxor
      // 14dd: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 14e0: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 14e3: athrow
      // 14e4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14e7: athrow
      // 14e8: aload 0
      // 14e9: aload 7
      // 14eb: aload 6
      // 14ed: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 14f0: lload 20
      // 14f2: dup2_x1
      // 14f3: pop2
      // 14f4: bipush 3
      // 14f5: anewarray 4
      // 14f8: dup_x1
      // 14f9: swap
      // 14fa: bipush 2
      // 14fb: swap
      // 14fc: aastore
      // 14fd: dup_x2
      // 14fe: dup_x2
      // 14ff: pop
      // 1500: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1503: bipush 1
      // 1504: swap
      // 1505: aastore
      // 1506: dup_x1
      // 1507: swap
      // 1508: bipush 0
      // 1509: swap
      // 150a: aastore
      // 150b: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 150e: iload 28
      // 1510: lload 4
      // 1512: lconst_0
      // 1513: lcmp
      // 1514: iflt 1539
      // 1517: ifeq 1ad5
      // 151a: aload 0
      // 151b: aload 6
      // 151d: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1520: lload 26
      // 1522: bipush 2
      // 1523: anewarray 4
      // 1526: dup_x2
      // 1527: dup_x2
      // 1528: pop
      // 1529: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152c: bipush 1
      // 152d: swap
      // 152e: aastore
      // 152f: dup_x1
      // 1530: swap
      // 1531: bipush 0
      // 1532: swap
      // 1533: aastore
      // 1534: invokevirtual rip/breeze/inject/à.method_016 ([Ljava/lang/Object;)V
      // 1537: iload 28
      // 1539: ifeq 1ad5
      // 153c: goto 1543
      // 153f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1542: athrow
      // 1543: aload 0
      // 1544: lload 10
      // 1546: bipush 1
      // 1547: bipush 2
      // 1548: anewarray 4
      // 154b: dup_x1
      // 154c: swap
      // 154d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1550: bipush 1
      // 1551: swap
      // 1552: aastore
      // 1553: dup_x2
      // 1554: dup_x2
      // 1555: pop
      // 1556: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1559: bipush 0
      // 155a: swap
      // 155b: aastore
      // 155c: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 155f: aload 0
      // 1560: aload 7
      // 1562: aload 6
      // 1564: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1567: lload 20
      // 1569: dup2_x1
      // 156a: pop2
      // 156b: bipush 3
      // 156c: anewarray 4
      // 156f: dup_x1
      // 1570: swap
      // 1571: bipush 2
      // 1572: swap
      // 1573: aastore
      // 1574: dup_x2
      // 1575: dup_x2
      // 1576: pop
      // 1577: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157a: bipush 1
      // 157b: swap
      // 157c: aastore
      // 157d: dup_x1
      // 157e: swap
      // 157f: bipush 0
      // 1580: swap
      // 1581: aastore
      // 1582: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 1585: iload 28
      // 1587: ifeq 1ad5
      // 158a: goto 1591
      // 158d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1590: athrow
      // 1591: aload 0
      // 1592: aload 6
      // 1594: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1597: lload 26
      // 1599: bipush 2
      // 159a: anewarray 4
      // 159d: dup_x2
      // 159e: dup_x2
      // 159f: pop
      // 15a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a3: bipush 1
      // 15a4: swap
      // 15a5: aastore
      // 15a6: dup_x1
      // 15a7: swap
      // 15a8: bipush 0
      // 15a9: swap
      // 15aa: aastore
      // 15ab: invokevirtual rip/breeze/inject/à.method_016 ([Ljava/lang/Object;)V
      // 15ae: aload 0
      // 15af: lload 16
      // 15b1: bipush 1
      // 15b2: anewarray 4
      // 15b5: dup_x2
      // 15b6: dup_x2
      // 15b7: pop
      // 15b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15bb: bipush 0
      // 15bc: swap
      // 15bd: aastore
      // 15be: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 15c1: pop
      // 15c2: iload 28
      // 15c4: ifeq 1ad5
      // 15c7: goto 15ce
      // 15ca: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15cd: athrow
      // 15ce: aload 0
      // 15cf: aload 6
      // 15d1: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 15d4: lload 26
      // 15d6: bipush 2
      // 15d7: anewarray 4
      // 15da: dup_x2
      // 15db: dup_x2
      // 15dc: pop
      // 15dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e0: bipush 1
      // 15e1: swap
      // 15e2: aastore
      // 15e3: dup_x1
      // 15e4: swap
      // 15e5: bipush 0
      // 15e6: swap
      // 15e7: aastore
      // 15e8: invokevirtual rip/breeze/inject/à.method_016 ([Ljava/lang/Object;)V
      // 15eb: iload 28
      // 15ed: ifne 169a
      // 15f0: goto 15f7
      // 15f3: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f6: athrow
      // 15f7: iload 2
      // 15f8: sipush 184
      // 15fb: if_icmpeq 1674
      // 15fe: goto 1605
      // 1601: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1604: athrow
      // 1605: aload 0
      // 1606: lload 16
      // 1608: bipush 1
      // 1609: anewarray 4
      // 160c: dup_x2
      // 160d: dup_x2
      // 160e: pop
      // 160f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1612: bipush 0
      // 1613: swap
      // 1614: aastore
      // 1615: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 1618: istore 29
      // 161a: iload 28
      // 161c: lload 4
      // 161e: lconst_0
      // 161f: lcmp
      // 1620: ifle 169c
      // 1623: ifne 169a
      // 1626: iload 2
      // 1627: sipush 183
      // 162a: if_icmpne 1674
      // 162d: goto 1634
      // 1630: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1633: athrow
      // 1634: lload 4
      // 1636: lconst_0
      // 1637: lcmp
      // 1638: iflt 169a
      // 163b: aload 6
      // 163d: getfield rip/breeze/inject/BreezeClass3.string_å Ljava/lang/String;
      // 1640: bipush 0
      // 1641: invokevirtual java/lang/String.charAt (I)C
      // 1644: bipush 60
      // 1646: if_icmpne 1674
      // 1649: goto 1650
      // 164c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 164f: athrow
      // 1650: aload 0
      // 1651: iload 29
      // 1653: lload 24
      // 1655: bipush 2
      // 1656: anewarray 4
      // 1659: dup_x2
      // 165a: dup_x2
      // 165b: pop
      // 165c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 165f: bipush 1
      // 1660: swap
      // 1661: aastore
      // 1662: dup_x1
      // 1663: swap
      // 1664: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1667: bipush 0
      // 1668: swap
      // 1669: aastore
      // 166a: invokevirtual rip/breeze/inject/à.method_017 ([Ljava/lang/Object;)V
      // 166d: goto 1674
      // 1670: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1673: athrow
      // 1674: aload 0
      // 1675: aload 7
      // 1677: aload 6
      // 1679: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 167c: lload 20
      // 167e: dup2_x1
      // 167f: pop2
      // 1680: bipush 3
      // 1681: anewarray 4
      // 1684: dup_x1
      // 1685: swap
      // 1686: bipush 2
      // 1687: swap
      // 1688: aastore
      // 1689: dup_x2
      // 168a: dup_x2
      // 168b: pop
      // 168c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 168f: bipush 1
      // 1690: swap
      // 1691: aastore
      // 1692: dup_x1
      // 1693: swap
      // 1694: bipush 0
      // 1695: swap
      // 1696: aastore
      // 1697: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 169a: iload 28
      // 169c: lload 4
      // 169e: lconst_0
      // 169f: lcmp
      // 16a0: iflt 16eb
      // 16a3: ifeq 1ad5
      // 16a6: aload 0
      // 16a7: aload 6
      // 16a9: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 16ac: lload 26
      // 16ae: bipush 2
      // 16af: anewarray 4
      // 16b2: dup_x2
      // 16b3: dup_x2
      // 16b4: pop
      // 16b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b8: bipush 1
      // 16b9: swap
      // 16ba: aastore
      // 16bb: dup_x1
      // 16bc: swap
      // 16bd: bipush 0
      // 16be: swap
      // 16bf: aastore
      // 16c0: invokevirtual rip/breeze/inject/à.method_016 ([Ljava/lang/Object;)V
      // 16c3: aload 0
      // 16c4: aload 7
      // 16c6: aload 6
      // 16c8: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 16cb: lload 20
      // 16cd: dup2_x1
      // 16ce: pop2
      // 16cf: bipush 3
      // 16d0: anewarray 4
      // 16d3: dup_x1
      // 16d4: swap
      // 16d5: bipush 2
      // 16d6: swap
      // 16d7: aastore
      // 16d8: dup_x2
      // 16d9: dup_x2
      // 16da: pop
      // 16db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16de: bipush 1
      // 16df: swap
      // 16e0: aastore
      // 16e1: dup_x1
      // 16e2: swap
      // 16e3: bipush 0
      // 16e4: swap
      // 16e5: aastore
      // 16e6: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 16e9: iload 28
      // 16eb: ifeq 1ad5
      // 16ee: goto 16f5
      // 16f1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16f4: athrow
      // 16f5: aload 0
      // 16f6: ldc 12582912
      // 16f8: aload 7
      // 16fa: aload 6
      // 16fc: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 16ff: iload 3
      // 1700: lload 18
      // 1702: bipush 3
      // 1703: anewarray 4
      // 1706: dup_x2
      // 1707: dup_x2
      // 1708: pop
      // 1709: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 170c: bipush 2
      // 170d: swap
      // 170e: aastore
      // 170f: dup_x1
      // 1710: swap
      // 1711: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1714: bipush 1
      // 1715: swap
      // 1716: aastore
      // 1717: dup_x1
      // 1718: swap
      // 1719: bipush 0
      // 171a: swap
      // 171b: aastore
      // 171c: invokevirtual rip/breeze/inject/Util139.getValue_7 ([Ljava/lang/Object;)I
      // 171f: ior
      // 1720: lload 22
      // 1722: dup2_x1
      // 1723: pop2
      // 1724: bipush 2
      // 1725: anewarray 4
      // 1728: dup_x1
      // 1729: swap
      // 172a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 172d: bipush 1
      // 172e: swap
      // 172f: aastore
      // 1730: dup_x2
      // 1731: dup_x2
      // 1732: pop
      // 1733: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1736: bipush 0
      // 1737: swap
      // 1738: aastore
      // 1739: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 173c: iload 28
      // 173e: ifeq 1ad5
      // 1741: goto 1748
      // 1744: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1747: athrow
      // 1748: aload 0
      // 1749: lload 16
      // 174b: bipush 1
      // 174c: anewarray 4
      // 174f: dup_x2
      // 1750: dup_x2
      // 1751: pop
      // 1752: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1755: bipush 0
      // 1756: swap
      // 1757: aastore
      // 1758: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 175b: pop
      // 175c: iload 28
      // 175e: lload 4
      // 1760: lconst_0
      // 1761: lcmp
      // 1762: iflt 17cf
      // 1765: ifne 17cd
      // 1768: goto 176f
      // 176b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 176e: athrow
      // 176f: lload 4
      // 1771: lconst_0
      // 1772: lcmp
      // 1773: iflt 17c6
      // 1776: iload 3
      // 1777: tableswitch 392 4 11 49 98 266 308 140 182 224 350
      // 17a4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17a7: athrow
      // 17a8: aload 0
      // 17a9: lload 22
      // 17ab: ldc_w 71303177
      // 17ae: bipush 2
      // 17af: anewarray 4
      // 17b2: dup_x1
      // 17b3: swap
      // 17b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17b7: bipush 1
      // 17b8: swap
      // 17b9: aastore
      // 17ba: dup_x2
      // 17bb: dup_x2
      // 17bc: pop
      // 17bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17c0: bipush 0
      // 17c1: swap
      // 17c2: aastore
      // 17c3: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 17c6: goto 17cd
      // 17c9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17cc: athrow
      // 17cd: iload 28
      // 17cf: lload 4
      // 17d1: lconst_0
      // 17d2: lcmp
      // 17d3: ifle 17f9
      // 17d6: ifeq 1ad5
      // 17d9: aload 0
      // 17da: lload 22
      // 17dc: ldc_w 71303179
      // 17df: bipush 2
      // 17e0: anewarray 4
      // 17e3: dup_x1
      // 17e4: swap
      // 17e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17e8: bipush 1
      // 17e9: swap
      // 17ea: aastore
      // 17eb: dup_x2
      // 17ec: dup_x2
      // 17ed: pop
      // 17ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f1: bipush 0
      // 17f2: swap
      // 17f3: aastore
      // 17f4: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 17f7: iload 28
      // 17f9: ifeq 1ad5
      // 17fc: goto 1803
      // 17ff: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1802: athrow
      // 1803: aload 0
      // 1804: lload 22
      // 1806: ldc_w 71303178
      // 1809: bipush 2
      // 180a: anewarray 4
      // 180d: dup_x1
      // 180e: swap
      // 180f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1812: bipush 1
      // 1813: swap
      // 1814: aastore
      // 1815: dup_x2
      // 1816: dup_x2
      // 1817: pop
      // 1818: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181b: bipush 0
      // 181c: swap
      // 181d: aastore
      // 181e: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1821: iload 28
      // 1823: ifeq 1ad5
      // 1826: goto 182d
      // 1829: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 182c: athrow
      // 182d: aload 0
      // 182e: lload 22
      // 1830: ldc_w 71303180
      // 1833: bipush 2
      // 1834: anewarray 4
      // 1837: dup_x1
      // 1838: swap
      // 1839: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 183c: bipush 1
      // 183d: swap
      // 183e: aastore
      // 183f: dup_x2
      // 1840: dup_x2
      // 1841: pop
      // 1842: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1845: bipush 0
      // 1846: swap
      // 1847: aastore
      // 1848: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 184b: iload 28
      // 184d: ifeq 1ad5
      // 1850: goto 1857
      // 1853: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1856: athrow
      // 1857: aload 0
      // 1858: lload 22
      // 185a: ldc_w 71303169
      // 185d: bipush 2
      // 185e: anewarray 4
      // 1861: dup_x1
      // 1862: swap
      // 1863: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1866: bipush 1
      // 1867: swap
      // 1868: aastore
      // 1869: dup_x2
      // 186a: dup_x2
      // 186b: pop
      // 186c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 186f: bipush 0
      // 1870: swap
      // 1871: aastore
      // 1872: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1875: iload 28
      // 1877: ifeq 1ad5
      // 187a: goto 1881
      // 187d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1880: athrow
      // 1881: aload 0
      // 1882: lload 22
      // 1884: ldc_w 71303170
      // 1887: bipush 2
      // 1888: anewarray 4
      // 188b: dup_x1
      // 188c: swap
      // 188d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1890: bipush 1
      // 1891: swap
      // 1892: aastore
      // 1893: dup_x2
      // 1894: dup_x2
      // 1895: pop
      // 1896: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1899: bipush 0
      // 189a: swap
      // 189b: aastore
      // 189c: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 189f: iload 28
      // 18a1: ifeq 1ad5
      // 18a4: goto 18ab
      // 18a7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18aa: athrow
      // 18ab: aload 0
      // 18ac: lload 22
      // 18ae: ldc_w 71303171
      // 18b1: bipush 2
      // 18b2: anewarray 4
      // 18b5: dup_x1
      // 18b6: swap
      // 18b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18ba: bipush 1
      // 18bb: swap
      // 18bc: aastore
      // 18bd: dup_x2
      // 18be: dup_x2
      // 18bf: pop
      // 18c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c3: bipush 0
      // 18c4: swap
      // 18c5: aastore
      // 18c6: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 18c9: iload 28
      // 18cb: ifeq 1ad5
      // 18ce: goto 18d5
      // 18d1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d4: athrow
      // 18d5: aload 0
      // 18d6: lload 22
      // 18d8: ldc_w 71303172
      // 18db: bipush 2
      // 18dc: anewarray 4
      // 18df: dup_x1
      // 18e0: swap
      // 18e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18e4: bipush 1
      // 18e5: swap
      // 18e6: aastore
      // 18e7: dup_x2
      // 18e8: dup_x2
      // 18e9: pop
      // 18ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18ed: bipush 0
      // 18ee: swap
      // 18ef: aastore
      // 18f0: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 18f3: iload 28
      // 18f5: ifeq 1ad5
      // 18f8: goto 18ff
      // 18fb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18fe: athrow
      // 18ff: new java/lang/IllegalArgumentException
      // 1902: dup
      // 1903: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 1906: athrow
      // 1907: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 190a: athrow
      // 190b: aload 6
      // 190d: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1910: astore 30
      // 1912: aload 0
      // 1913: lload 16
      // 1915: bipush 1
      // 1916: anewarray 4
      // 1919: dup_x2
      // 191a: dup_x2
      // 191b: pop
      // 191c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 191f: bipush 0
      // 1920: swap
      // 1921: aastore
      // 1922: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 1925: pop
      // 1926: iload 28
      // 1928: lload 4
      // 192a: lconst_0
      // 192b: lcmp
      // 192c: ifle 19c4
      // 192f: ifne 19c2
      // 1932: aload 30
      // 1934: bipush 0
      // 1935: invokevirtual java/lang/String.charAt (I)C
      // 1938: bipush 91
      // 193a: if_icmpne 197f
      // 193d: goto 1944
      // 1940: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1943: athrow
      // 1944: aload 0
      // 1945: aload 7
      // 1947: aload 30
      // 1949: bipush 1
      // 194a: anewarray 4
      // 194d: dup_x1
      // 194e: swap
      // 194f: bipush 0
      // 1950: swap
      // 1951: aastore
      // 1952: invokestatic rip/breeze/inject/à.method_020 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1955: lload 20
      // 1957: dup2_x1
      // 1958: pop2
      // 1959: bipush 3
      // 195a: anewarray 4
      // 195d: dup_x1
      // 195e: swap
      // 195f: bipush 2
      // 1960: swap
      // 1961: aastore
      // 1962: dup_x2
      // 1963: dup_x2
      // 1964: pop
      // 1965: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1968: bipush 1
      // 1969: swap
      // 196a: aastore
      // 196b: dup_x1
      // 196c: swap
      // 196d: bipush 0
      // 196e: swap
      // 196f: aastore
      // 1970: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 1973: iload 28
      // 1975: ifeq 1ad5
      // 1978: goto 197f
      // 197b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 197e: athrow
      // 197f: aload 0
      // 1980: ldc_w 75497472
      // 1983: aload 7
      // 1985: lload 8
      // 1987: aload 30
      // 1989: bipush 2
      // 198a: anewarray 4
      // 198d: dup_x1
      // 198e: swap
      // 198f: bipush 1
      // 1990: swap
      // 1991: aastore
      // 1992: dup_x2
      // 1993: dup_x2
      // 1994: pop
      // 1995: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1998: bipush 0
      // 1999: swap
      // 199a: aastore
      // 199b: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 199e: ior
      // 199f: lload 22
      // 19a1: dup2_x1
      // 19a2: pop2
      // 19a3: bipush 2
      // 19a4: anewarray 4
      // 19a7: dup_x1
      // 19a8: swap
      // 19a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19ac: bipush 1
      // 19ad: swap
      // 19ae: aastore
      // 19af: dup_x2
      // 19b0: dup_x2
      // 19b1: pop
      // 19b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b5: bipush 0
      // 19b6: swap
      // 19b7: aastore
      // 19b8: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 19bb: goto 19c2
      // 19be: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19c1: athrow
      // 19c2: iload 28
      // 19c4: ifeq 1ad5
      // 19c7: aload 6
      // 19c9: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 19cc: astore 34
      // 19ce: aload 0
      // 19cf: lload 16
      // 19d1: bipush 1
      // 19d2: anewarray 4
      // 19d5: dup_x2
      // 19d6: dup_x2
      // 19d7: pop
      // 19d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19db: bipush 0
      // 19dc: swap
      // 19dd: aastore
      // 19de: invokevirtual rip/breeze/inject/à.method_014 ([Ljava/lang/Object;)I
      // 19e1: pop
      // 19e2: iload 28
      // 19e4: lload 4
      // 19e6: lconst_0
      // 19e7: lcmp
      // 19e8: ifle 1a71
      // 19eb: ifne 1a6f
      // 19ee: aload 34
      // 19f0: bipush 0
      // 19f1: invokevirtual java/lang/String.charAt (I)C
      // 19f4: bipush 91
      // 19f6: if_icmpne 1a2d
      // 19f9: goto 1a00
      // 19fc: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19ff: athrow
      // 1a00: aload 0
      // 1a01: aload 7
      // 1a03: lload 20
      // 1a05: aload 34
      // 1a07: bipush 3
      // 1a08: anewarray 4
      // 1a0b: dup_x1
      // 1a0c: swap
      // 1a0d: bipush 2
      // 1a0e: swap
      // 1a0f: aastore
      // 1a10: dup_x2
      // 1a11: dup_x2
      // 1a12: pop
      // 1a13: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a16: bipush 1
      // 1a17: swap
      // 1a18: aastore
      // 1a19: dup_x1
      // 1a1a: swap
      // 1a1b: bipush 0
      // 1a1c: swap
      // 1a1d: aastore
      // 1a1e: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 1a21: iload 28
      // 1a23: ifeq 1ad5
      // 1a26: goto 1a2d
      // 1a29: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a2c: athrow
      // 1a2d: aload 0
      // 1a2e: ldc 8388608
      // 1a30: aload 7
      // 1a32: lload 8
      // 1a34: aload 34
      // 1a36: bipush 2
      // 1a37: anewarray 4
      // 1a3a: dup_x1
      // 1a3b: swap
      // 1a3c: bipush 1
      // 1a3d: swap
      // 1a3e: aastore
      // 1a3f: dup_x2
      // 1a40: dup_x2
      // 1a41: pop
      // 1a42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a45: bipush 0
      // 1a46: swap
      // 1a47: aastore
      // 1a48: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 1a4b: ior
      // 1a4c: lload 22
      // 1a4e: dup2_x1
      // 1a4f: pop2
      // 1a50: bipush 2
      // 1a51: anewarray 4
      // 1a54: dup_x1
      // 1a55: swap
      // 1a56: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a59: bipush 1
      // 1a5a: swap
      // 1a5b: aastore
      // 1a5c: dup_x2
      // 1a5d: dup_x2
      // 1a5e: pop
      // 1a5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a62: bipush 0
      // 1a63: swap
      // 1a64: aastore
      // 1a65: invokevirtual rip/breeze/inject/à.method_012 ([Ljava/lang/Object;)V
      // 1a68: goto 1a6f
      // 1a6b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a6e: athrow
      // 1a6f: iload 28
      // 1a71: lload 4
      // 1a73: lconst_0
      // 1a74: lcmp
      // 1a75: iflt 1abf
      // 1a78: ifeq 1ad5
      // 1a7b: aload 0
      // 1a7c: lload 10
      // 1a7e: iload 3
      // 1a7f: bipush 2
      // 1a80: anewarray 4
      // 1a83: dup_x1
      // 1a84: swap
      // 1a85: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a88: bipush 1
      // 1a89: swap
      // 1a8a: aastore
      // 1a8b: dup_x2
      // 1a8c: dup_x2
      // 1a8d: pop
      // 1a8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a91: bipush 0
      // 1a92: swap
      // 1a93: aastore
      // 1a94: invokevirtual rip/breeze/inject/à.method_015 ([Ljava/lang/Object;)V
      // 1a97: aload 0
      // 1a98: aload 7
      // 1a9a: aload 6
      // 1a9c: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 1a9f: lload 20
      // 1aa1: dup2_x1
      // 1aa2: pop2
      // 1aa3: bipush 3
      // 1aa4: anewarray 4
      // 1aa7: dup_x1
      // 1aa8: swap
      // 1aa9: bipush 2
      // 1aaa: swap
      // 1aab: aastore
      // 1aac: dup_x2
      // 1aad: dup_x2
      // 1aae: pop
      // 1aaf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab2: bipush 1
      // 1ab3: swap
      // 1ab4: aastore
      // 1ab5: dup_x1
      // 1ab6: swap
      // 1ab7: bipush 0
      // 1ab8: swap
      // 1ab9: aastore
      // 1aba: invokevirtual rip/breeze/inject/à.method_013 ([Ljava/lang/Object;)V
      // 1abd: iload 28
      // 1abf: ifeq 1ad5
      // 1ac2: goto 1ac9
      // 1ac5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ac8: athrow
      // 1ac9: new java/lang/IllegalArgumentException
      // 1acc: dup
      // 1acd: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 1ad0: athrow
      // 1ad1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ad4: athrow
      // 1ad5: return
      // try (74 -> 78): 79 java/lang/IllegalArgumentException
      // try (76 -> 102): 103 java/lang/IllegalArgumentException
      // try (81 -> 126): 127 java/lang/IllegalArgumentException
      // try (105 -> 169): 170 java/lang/IllegalArgumentException
      // try (129 -> 193): 194 java/lang/IllegalArgumentException
      // try (172 -> 236): 237 java/lang/IllegalArgumentException
      // try (196 -> 246): 246 java/lang/IllegalArgumentException
      // try (239 -> 269): 270 java/lang/IllegalArgumentException
      // try (248 -> 312): 313 java/lang/IllegalArgumentException
      // try (272 -> 336): 337 java/lang/IllegalArgumentException
      // try (315 -> 379): 380 java/lang/IllegalArgumentException
      // try (339 -> 428): 429 java/lang/IllegalArgumentException
      // try (382 -> 477): 478 java/lang/IllegalArgumentException
      // try (431 -> 526): 527 java/lang/IllegalArgumentException
      // try (480 -> 575): 576 java/lang/IllegalArgumentException
      // try (529 -> 607): 608 java/lang/IllegalArgumentException
      // try (578 -> 614): 614 java/lang/IllegalArgumentException
      // try (616 -> 720): 721 java/lang/IllegalArgumentException
      // try (661 -> 782): 783 java/lang/IllegalArgumentException
      // try (817 -> 823): 824 java/lang/IllegalArgumentException
      // try (822 -> 828): 828 java/lang/IllegalArgumentException
      // try (871 -> 901): 902 java/lang/IllegalArgumentException
      // try (900 -> 927): 928 java/lang/IllegalArgumentException
      // try (931 -> 940): 941 java/lang/IllegalArgumentException
      // try (937 -> 951): 952 java/lang/IllegalArgumentException
      // try (943 -> 959): 960 java/lang/IllegalArgumentException
      // try (954 -> 990): 991 java/lang/IllegalArgumentException
      // try (993 -> 1003): 1004 java/lang/IllegalArgumentException
      // try (1006 -> 1013): 1014 java/lang/IllegalArgumentException
      // try (1012 -> 1020): 1021 java/lang/IllegalArgumentException
      // try (1023 -> 1056): 1057 java/lang/IllegalArgumentException
      // try (1097 -> 1155): 1156 java/lang/IllegalArgumentException
      // try (1154 -> 1181): 1182 java/lang/IllegalArgumentException
      // try (1185 -> 1194): 1195 java/lang/IllegalArgumentException
      // try (1191 -> 1205): 1206 java/lang/IllegalArgumentException
      // try (1197 -> 1213): 1214 java/lang/IllegalArgumentException
      // try (1208 -> 1244): 1245 java/lang/IllegalArgumentException
      // try (1247 -> 1257): 1258 java/lang/IllegalArgumentException
      // try (1260 -> 1267): 1268 java/lang/IllegalArgumentException
      // try (1266 -> 1274): 1275 java/lang/IllegalArgumentException
      // try (1277 -> 1310): 1311 java/lang/IllegalArgumentException
      // try (1313 -> 1340): 1341 java/lang/IllegalArgumentException
      // try (1319 -> 1364): 1365 java/lang/IllegalArgumentException
      // try (1343 -> 1388): 1389 java/lang/IllegalArgumentException
      // try (1367 -> 1412): 1413 java/lang/IllegalArgumentException
      // try (2128 -> 2212): 2213 java/lang/IllegalArgumentException
      // try (2172 -> 2274): 2275 java/lang/IllegalArgumentException
      // try (2215 -> 2317): 2318 java/lang/IllegalArgumentException
      // try (2277 -> 2379): 2380 java/lang/IllegalArgumentException
      // try (2320 -> 2441): 2442 java/lang/IllegalArgumentException
      // try (2382 -> 2472): 2473 java/lang/IllegalArgumentException
      // try (2444 -> 2534): 2535 java/lang/IllegalArgumentException
      // try (2475 -> 2577): 2578 java/lang/IllegalArgumentException
      // try (2537 -> 2639): 2640 java/lang/IllegalArgumentException
      // try (2580 -> 2682): 2683 java/lang/IllegalArgumentException
      // try (2642 -> 2725): 2726 java/lang/IllegalArgumentException
      // try (2685 -> 2737): 2737 java/lang/IllegalArgumentException
      // try (2739 -> 2793): 2794 java/lang/IllegalArgumentException
      // try (2772 -> 2844): 2845 java/lang/IllegalArgumentException
      // try (2796 -> 2881): 2882 java/lang/IllegalArgumentException
      // try (2847 -> 2905): 2906 java/lang/IllegalArgumentException
      // try (2884 -> 2911): 2912 java/lang/IllegalArgumentException
      // try (2927 -> 2936): 2937 java/lang/IllegalArgumentException
      // try (2933 -> 2949): 2950 java/lang/IllegalArgumentException
      // try (2939 -> 2971): 2972 java/lang/IllegalArgumentException
      // try (3001 -> 3055): 3056 java/lang/IllegalArgumentException
      // try (3007 -> 3108): 3109 java/lang/IllegalArgumentException
      // try (3058 -> 3130): 3131 java/lang/IllegalArgumentException
      // try (3111 -> 3139): 3139 java/lang/IllegalArgumentException
      // try (3133 -> 3160): 3161 java/lang/IllegalArgumentException
      // try (3163 -> 3190): 3191 java/lang/IllegalArgumentException
      // try (3169 -> 3214): 3215 java/lang/IllegalArgumentException
      // try (3193 -> 3238): 3239 java/lang/IllegalArgumentException
      // try (3217 -> 3262): 3263 java/lang/IllegalArgumentException
      // try (3241 -> 3286): 3287 java/lang/IllegalArgumentException
      // try (3265 -> 3310): 3311 java/lang/IllegalArgumentException
      // try (3289 -> 3334): 3335 java/lang/IllegalArgumentException
      // try (3313 -> 3341): 3341 java/lang/IllegalArgumentException
      // try (3346 -> 3370): 3371 java/lang/IllegalArgumentException
      // try (3365 -> 3409): 3410 java/lang/IllegalArgumentException
      // try (3373 -> 3452): 3453 java/lang/IllegalArgumentException
      // try (3460 -> 3484): 3485 java/lang/IllegalArgumentException
      // try (3479 -> 3513): 3514 java/lang/IllegalArgumentException
      // try (3487 -> 3556): 3557 java/lang/IllegalArgumentException
      // try (3559 -> 3613): 3614 java/lang/IllegalArgumentException
      // try (3565 -> 3620): 3620 java/lang/IllegalArgumentException
   }

   private static String invoke_20(Object[] var0) {
      String var1 = (String)var0[0];
      return "[" + var1;
   }

   private int invoke_21(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 5
      // 020: pop
      // 021: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 024: lload 3
      // 025: lxor
      // 026: lstore 3
      // 027: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 02a: iload 2
      // 02b: ldc -67108864
      // 02d: iand
      // 02e: istore 6
      // 030: istore 7
      // 032: iload 2
      // 033: ldc 62914560
      // 035: iand
      // 036: istore 8
      // 038: iload 8
      // 03a: ldc 20971520
      // 03c: iload 7
      // 03e: ifeq 0ca
      // 041: if_icmpne 0b4
      // 044: goto 04b
      // 047: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04a: athrow
      // 04b: iload 6
      // 04d: aload 0
      // 04e: getfield rip/breeze/inject/à.arr_i_2 [I
      // 051: iload 2
      // 052: ldc 1048575
      // 054: iand
      // 055: iaload
      // 056: iadd
      // 057: istore 9
      // 059: iload 2
      // 05a: ldc 1048576
      // 05c: iand
      // 05d: iload 7
      // 05f: ifeq 0b3
      // 062: ifeq 0b1
      // 065: goto 06c
      // 068: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06b: athrow
      // 06c: iload 9
      // 06e: iload 7
      // 070: ifeq 0af
      // 073: goto 07a
      // 076: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: lload 3
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: iflt 0a8
      // 080: ldc 4194308
      // 082: if_icmpeq 0a6
      // 085: goto 08c
      // 088: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08b: athrow
      // 08c: iload 9
      // 08e: iload 7
      // 090: ifeq 0b3
      // 093: goto 09a
      // 096: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 099: athrow
      // 09a: ldc 4194307
      // 09c: if_icmpne 0b1
      // 09f: goto 0a6
      // 0a2: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: ldc 4194304
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ae: athrow
      // 0af: istore 9
      // 0b1: iload 9
      // 0b3: ireturn
      // 0b4: iload 8
      // 0b6: iload 7
      // 0b8: lload 3
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0c3
      // 0be: ifeq 13a
      // 0c1: ldc 25165824
      // 0c3: goto 0ca
      // 0c6: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c9: athrow
      // 0ca: if_icmpne 139
      // 0cd: iload 6
      // 0cf: aload 0
      // 0d0: getfield rip/breeze/inject/à.arr_h_2 [I
      // 0d3: iload 5
      // 0d5: iload 2
      // 0d6: ldc 1048575
      // 0d8: iand
      // 0d9: isub
      // 0da: iaload
      // 0db: iadd
      // 0dc: istore 9
      // 0de: iload 2
      // 0df: ldc 1048576
      // 0e1: iand
      // 0e2: iload 7
      // 0e4: ifeq 138
      // 0e7: ifeq 136
      // 0ea: goto 0f1
      // 0ed: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: iload 9
      // 0f3: iload 7
      // 0f5: ifeq 134
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: lload 3
      // 100: lconst_0
      // 101: lcmp
      // 102: ifle 12d
      // 105: ldc 4194308
      // 107: if_icmpeq 12b
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: iload 9
      // 113: iload 7
      // 115: ifeq 138
      // 118: goto 11f
      // 11b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11e: athrow
      // 11f: ldc 4194307
      // 121: if_icmpne 136
      // 124: goto 12b
      // 127: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: ldc 4194304
      // 12d: goto 134
      // 130: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 133: athrow
      // 134: istore 9
      // 136: iload 9
      // 138: ireturn
      // 139: iload 2
      // 13a: ireturn
      // try (34 -> 39): 40 java/lang/IllegalArgumentException
      // try (51 -> 57): 58 java/lang/IllegalArgumentException
      // try (56 -> 63): 64 java/lang/IllegalArgumentException
      // try (60 -> 72): 73 java/lang/IllegalArgumentException
      // try (66 -> 78): 79 java/lang/IllegalArgumentException
      // try (75 -> 83): 84 java/lang/IllegalArgumentException
      // try (81 -> 87): 88 java/lang/IllegalArgumentException
      // try (93 -> 101): 102 java/lang/IllegalArgumentException
      // try (116 -> 122): 123 java/lang/IllegalArgumentException
      // try (121 -> 128): 129 java/lang/IllegalArgumentException
      // try (125 -> 137): 138 java/lang/IllegalArgumentException
      // try (131 -> 143): 144 java/lang/IllegalArgumentException
      // try (140 -> 148): 149 java/lang/IllegalArgumentException
      // try (146 -> 152): 153 java/lang/IllegalArgumentException
   }

   final boolean check_22(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/Util139
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/inject/à
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Integer
      // 021: invokevirtual java/lang/Integer.intValue ()I
      // 024: istore 6
      // 026: pop
      // 027: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 25076258679902
      // 032: lxor
      // 033: lstore 7
      // 035: dup2
      // 036: ldc2_w 128620586173439
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 128104068277027
      // 040: lxor
      // 041: lstore 11
      // 043: pop2
      // 044: bipush 0
      // 045: istore 13
      // 047: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 04a: aload 0
      // 04b: getfield rip/breeze/inject/à.arr_i_2 [I
      // 04e: arraylength
      // 04f: istore 14
      // 051: istore 15
      // 053: aload 0
      // 054: getfield rip/breeze/inject/à.arr_h_2 [I
      // 057: arraylength
      // 058: istore 16
      // 05a: aload 5
      // 05c: iload 15
      // 05e: ifne 077
      // 061: getfield rip/breeze/inject/à.arr_i_2 [I
      // 064: ifnonnull 081
      // 067: goto 06e
      // 06a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06d: athrow
      // 06e: aload 5
      // 070: goto 077
      // 073: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 076: athrow
      // 077: iload 14
      // 079: newarray 10
      // 07b: putfield rip/breeze/inject/à.arr_i_2 [I
      // 07e: bipush 1
      // 07f: istore 13
      // 081: bipush 0
      // 082: istore 17
      // 084: iload 17
      // 086: iload 14
      // 088: if_icmpge 1d6
      // 08b: aload 0
      // 08c: getfield rip/breeze/inject/à.arr_g_2 [I
      // 08f: iload 15
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: iflt 09c
      // 097: ifne 2e0
      // 09a: iload 15
      // 09c: lload 2
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: ifle 14f
      // 0a2: ifne 14d
      // 0a5: goto 0ac
      // 0a8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ab: athrow
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: ifle 146
      // 0b2: ifnull 142
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: iload 17
      // 0be: iload 15
      // 0c0: ifne 150
      // 0c3: goto 0ca
      // 0c6: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield rip/breeze/inject/à.arr_g_2 [I
      // 0ce: arraylength
      // 0cf: if_icmpge 142
      // 0d2: goto 0d9
      // 0d5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield rip/breeze/inject/à.arr_g_2 [I
      // 0dd: iload 17
      // 0df: iaload
      // 0e0: istore 18
      // 0e2: iload 18
      // 0e4: iload 15
      // 0e6: ifne 135
      // 0e9: ifne 107
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield rip/breeze/inject/à.arr_i_2 [I
      // 0f7: iload 17
      // 0f9: iaload
      // 0fa: istore 19
      // 0fc: iload 15
      // 0fe: lload 2
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 13f
      // 104: ifeq 137
      // 107: aload 0
      // 108: iload 18
      // 10a: lload 7
      // 10c: iload 16
      // 10e: bipush 3
      // 10f: anewarray 4
      // 112: dup_x1
      // 113: swap
      // 114: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 117: bipush 2
      // 118: swap
      // 119: aastore
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 1
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: invokevirtual rip/breeze/inject/à.method_021 ([Ljava/lang/Object;)I
      // 12e: goto 135
      // 131: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 134: athrow
      // 135: istore 19
      // 137: lload 2
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 152
      // 13d: iload 15
      // 13f: ifeq 152
      // 142: aload 0
      // 143: getfield rip/breeze/inject/à.arr_i_2 [I
      // 146: goto 14d
      // 149: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14c: athrow
      // 14d: iload 17
      // 14f: iaload
      // 150: istore 19
      // 152: aload 0
      // 153: iload 15
      // 155: ifne 16d
      // 158: getfield rip/breeze/inject/à.arr_b_2 [I
      // 15b: ifnull 192
      // 15e: goto 165
      // 161: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 164: athrow
      // 165: aload 0
      // 166: goto 16d
      // 169: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16c: athrow
      // 16d: aload 4
      // 16f: iload 19
      // 171: lload 9
      // 173: bipush 3
      // 174: anewarray 4
      // 177: dup_x2
      // 178: dup_x2
      // 179: pop
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: bipush 2
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: bipush 1
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 0
      // 18b: swap
      // 18c: aastore
      // 18d: invokevirtual rip/breeze/inject/à.method_018 ([Ljava/lang/Object;)I
      // 190: istore 19
      // 192: iload 13
      // 194: aload 4
      // 196: lload 11
      // 198: iload 19
      // 19a: aload 5
      // 19c: getfield rip/breeze/inject/à.arr_i_2 [I
      // 19f: iload 17
      // 1a1: bipush 5
      // 1a2: anewarray 4
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1aa: bipush 4
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: bipush 3
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b7: bipush 2
      // 1b8: swap
      // 1b9: aastore
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 1
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: invokestatic rip/breeze/inject/à.method_023 ([Ljava/lang/Object;)Z
      // 1cb: ior
      // 1cc: istore 13
      // 1ce: iinc 17 1
      // 1d1: iload 15
      // 1d3: ifeq 084
      // 1d6: iload 6
      // 1d8: iload 15
      // 1da: lload 2
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: iflt 0c0
      // 1e0: lload 2
      // 1e1: lconst_0
      // 1e2: lcmp
      // 1e3: iflt 2d6
      // 1e6: ifne 2d4
      // 1e9: ifle 2ca
      // 1ec: goto 1f3
      // 1ef: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f2: athrow
      // 1f3: bipush 0
      // 1f4: istore 17
      // 1f6: iload 17
      // 1f8: iload 14
      // 1fa: if_icmpge 260
      // 1fd: iload 13
      // 1ff: aload 4
      // 201: aload 0
      // 202: getfield rip/breeze/inject/à.arr_i_2 [I
      // 205: iload 17
      // 207: iaload
      // 208: lload 11
      // 20a: dup2_x1
      // 20b: pop2
      // 20c: aload 5
      // 20e: getfield rip/breeze/inject/à.arr_i_2 [I
      // 211: iload 17
      // 213: bipush 5
      // 214: anewarray 4
      // 217: dup_x1
      // 218: swap
      // 219: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21c: bipush 4
      // 21d: swap
      // 21e: aastore
      // 21f: dup_x1
      // 220: swap
      // 221: bipush 3
      // 222: swap
      // 223: aastore
      // 224: dup_x1
      // 225: swap
      // 226: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 229: bipush 2
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: invokestatic rip/breeze/inject/à.method_023 ([Ljava/lang/Object;)Z
      // 23d: ior
      // 23e: istore 13
      // 240: iinc 17 1
      // 243: iload 15
      // 245: lload 2
      // 246: lconst_0
      // 247: lcmp
      // 248: ifle 2c9
      // 24b: ifne 2c7
      // 24e: iload 15
      // 250: ifeq 1f6
      // 253: lload 2
      // 254: lconst_0
      // 255: lcmp
      // 256: iflt 243
      // 259: goto 260
      // 25c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25f: athrow
      // 260: aload 5
      // 262: iload 15
      // 264: lload 2
      // 265: lconst_0
      // 266: lcmp
      // 267: ifle 284
      // 26a: ifne 283
      // 26d: getfield rip/breeze/inject/à.arr_h_2 [I
      // 270: ifnonnull 28c
      // 273: goto 27a
      // 276: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 279: athrow
      // 27a: aload 5
      // 27c: goto 283
      // 27f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 282: athrow
      // 283: bipush 1
      // 284: newarray 10
      // 286: putfield rip/breeze/inject/à.arr_h_2 [I
      // 289: bipush 1
      // 28a: istore 13
      // 28c: iload 13
      // 28e: aload 4
      // 290: lload 11
      // 292: iload 6
      // 294: aload 5
      // 296: getfield rip/breeze/inject/à.arr_h_2 [I
      // 299: bipush 0
      // 29a: bipush 5
      // 29b: anewarray 4
      // 29e: dup_x1
      // 29f: swap
      // 2a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a3: bipush 4
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: bipush 3
      // 2a9: swap
      // 2aa: aastore
      // 2ab: dup_x1
      // 2ac: swap
      // 2ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b0: bipush 2
      // 2b1: swap
      // 2b2: aastore
      // 2b3: dup_x2
      // 2b4: dup_x2
      // 2b5: pop
      // 2b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b9: bipush 1
      // 2ba: swap
      // 2bb: aastore
      // 2bc: dup_x1
      // 2bd: swap
      // 2be: bipush 0
      // 2bf: swap
      // 2c0: aastore
      // 2c1: invokestatic rip/breeze/inject/à.method_023 ([Ljava/lang/Object;)Z
      // 2c4: ior
      // 2c5: istore 13
      // 2c7: iload 13
      // 2c9: ireturn
      // 2ca: aload 0
      // 2cb: getfield rip/breeze/inject/à.arr_h_2 [I
      // 2ce: arraylength
      // 2cf: aload 0
      // 2d0: getfield rip/breeze/inject/à.short_e_2 S
      // 2d3: iadd
      // 2d4: iload 15
      // 2d6: ifne 2f5
      // 2d9: istore 17
      // 2db: aload 5
      // 2dd: getfield rip/breeze/inject/à.arr_h_2 [I
      // 2e0: ifnonnull 2f4
      // 2e3: aload 5
      // 2e5: iload 17
      // 2e7: aload 0
      // 2e8: getfield rip/breeze/inject/à.short_d_2 S
      // 2eb: iadd
      // 2ec: newarray 10
      // 2ee: putfield rip/breeze/inject/à.arr_h_2 [I
      // 2f1: bipush 1
      // 2f2: istore 13
      // 2f4: bipush 0
      // 2f5: istore 19
      // 2f7: iload 19
      // 2f9: iload 17
      // 2fb: if_icmpge 39c
      // 2fe: aload 0
      // 2ff: getfield rip/breeze/inject/à.arr_h_2 [I
      // 302: iload 19
      // 304: iaload
      // 305: istore 18
      // 307: iload 15
      // 309: lload 2
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: ifle 399
      // 30f: ifne 397
      // 312: aload 0
      // 313: getfield rip/breeze/inject/à.arr_b_2 [I
      // 316: iload 15
      // 318: lload 2
      // 319: lconst_0
      // 31a: lcmp
      // 31b: iflt 3b4
      // 31e: ifne 3b2
      // 321: goto 328
      // 324: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 327: athrow
      // 328: ifnull 358
      // 32b: goto 332
      // 32e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 331: athrow
      // 332: aload 0
      // 333: aload 4
      // 335: iload 18
      // 337: lload 9
      // 339: bipush 3
      // 33a: anewarray 4
      // 33d: dup_x2
      // 33e: dup_x2
      // 33f: pop
      // 340: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 343: bipush 2
      // 344: swap
      // 345: aastore
      // 346: dup_x1
      // 347: swap
      // 348: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34b: bipush 1
      // 34c: swap
      // 34d: aastore
      // 34e: dup_x1
      // 34f: swap
      // 350: bipush 0
      // 351: swap
      // 352: aastore
      // 353: invokevirtual rip/breeze/inject/à.method_018 ([Ljava/lang/Object;)I
      // 356: istore 18
      // 358: iload 13
      // 35a: aload 4
      // 35c: lload 11
      // 35e: iload 18
      // 360: aload 5
      // 362: getfield rip/breeze/inject/à.arr_h_2 [I
      // 365: iload 19
      // 367: bipush 5
      // 368: anewarray 4
      // 36b: dup_x1
      // 36c: swap
      // 36d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 370: bipush 4
      // 371: swap
      // 372: aastore
      // 373: dup_x1
      // 374: swap
      // 375: bipush 3
      // 376: swap
      // 377: aastore
      // 378: dup_x1
      // 379: swap
      // 37a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37d: bipush 2
      // 37e: swap
      // 37f: aastore
      // 380: dup_x2
      // 381: dup_x2
      // 382: pop
      // 383: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 386: bipush 1
      // 387: swap
      // 388: aastore
      // 389: dup_x1
      // 38a: swap
      // 38b: bipush 0
      // 38c: swap
      // 38d: aastore
      // 38e: invokestatic rip/breeze/inject/à.method_023 ([Ljava/lang/Object;)Z
      // 391: ior
      // 392: istore 13
      // 394: iinc 19 1
      // 397: iload 15
      // 399: ifeq 2f7
      // 39c: bipush 0
      // 39d: lload 2
      // 39e: lconst_0
      // 39f: lcmp
      // 3a0: ifle 305
      // 3a3: istore 19
      // 3a5: iload 19
      // 3a7: aload 0
      // 3a8: getfield rip/breeze/inject/à.short_d_2 S
      // 3ab: if_icmpge 46b
      // 3ae: aload 0
      // 3af: getfield rip/breeze/inject/à.arr_f_2 [I
      // 3b2: iload 19
      // 3b4: iaload
      // 3b5: istore 18
      // 3b7: aload 0
      // 3b8: iload 18
      // 3ba: lload 7
      // 3bc: iload 16
      // 3be: bipush 3
      // 3bf: anewarray 4
      // 3c2: dup_x1
      // 3c3: swap
      // 3c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c7: bipush 2
      // 3c8: swap
      // 3c9: aastore
      // 3ca: dup_x2
      // 3cb: dup_x2
      // 3cc: pop
      // 3cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d0: bipush 1
      // 3d1: swap
      // 3d2: aastore
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d8: bipush 0
      // 3d9: swap
      // 3da: aastore
      // 3db: invokevirtual rip/breeze/inject/à.method_021 ([Ljava/lang/Object;)I
      // 3de: iload 15
      // 3e0: ifne 46d
      // 3e3: istore 20
      // 3e5: iload 15
      // 3e7: lload 2
      // 3e8: lconst_0
      // 3e9: lcmp
      // 3ea: iflt 468
      // 3ed: ifne 466
      // 3f0: aload 0
      // 3f1: getfield rip/breeze/inject/à.arr_b_2 [I
      // 3f4: ifnull 424
      // 3f7: goto 3fe
      // 3fa: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3fd: athrow
      // 3fe: aload 0
      // 3ff: aload 4
      // 401: iload 20
      // 403: lload 9
      // 405: bipush 3
      // 406: anewarray 4
      // 409: dup_x2
      // 40a: dup_x2
      // 40b: pop
      // 40c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 40f: bipush 2
      // 410: swap
      // 411: aastore
      // 412: dup_x1
      // 413: swap
      // 414: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 417: bipush 1
      // 418: swap
      // 419: aastore
      // 41a: dup_x1
      // 41b: swap
      // 41c: bipush 0
      // 41d: swap
      // 41e: aastore
      // 41f: invokevirtual rip/breeze/inject/à.method_018 ([Ljava/lang/Object;)I
      // 422: istore 20
      // 424: iload 13
      // 426: aload 4
      // 428: lload 11
      // 42a: iload 20
      // 42c: aload 5
      // 42e: getfield rip/breeze/inject/à.arr_h_2 [I
      // 431: iload 17
      // 433: iload 19
      // 435: iadd
      // 436: bipush 5
      // 437: anewarray 4
      // 43a: dup_x1
      // 43b: swap
      // 43c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 43f: bipush 4
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 3
      // 445: swap
      // 446: aastore
      // 447: dup_x1
      // 448: swap
      // 449: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 44c: bipush 2
      // 44d: swap
      // 44e: aastore
      // 44f: dup_x2
      // 450: dup_x2
      // 451: pop
      // 452: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 455: bipush 1
      // 456: swap
      // 457: aastore
      // 458: dup_x1
      // 459: swap
      // 45a: bipush 0
      // 45b: swap
      // 45c: aastore
      // 45d: invokestatic rip/breeze/inject/à.method_023 ([Ljava/lang/Object;)Z
      // 460: ior
      // 461: istore 13
      // 463: iinc 19 1
      // 466: iload 15
      // 468: ifeq 3a5
      // 46b: iload 13
      // 46d: ireturn
      // try (54 -> 59): 60 java/lang/IllegalArgumentException
      // try (57 -> 63): 64 java/lang/IllegalArgumentException
      // try (76 -> 90): 91 java/lang/IllegalArgumentException
      // try (84 -> 98): 99 java/lang/IllegalArgumentException
      // try (93 -> 104): 105 java/lang/IllegalArgumentException
      // try (101 -> 111): 112 java/lang/IllegalArgumentException
      // try (119 -> 123): 124 java/lang/IllegalArgumentException
      // try (131 -> 163): 164 java/lang/IllegalArgumentException
      // try (167 -> 175): 176 java/lang/IllegalArgumentException
      // try (181 -> 186): 187 java/lang/IllegalArgumentException
      // try (184 -> 190): 191 java/lang/IllegalArgumentException
      // try (262 -> 274): 275 java/lang/IllegalArgumentException
      // try (328 -> 337): 342 java/lang/IllegalArgumentException
      // try (344 -> 353): 354 java/lang/IllegalArgumentException
      // try (351 -> 357): 358 java/lang/IllegalArgumentException
      // try (439 -> 453): 454 java/lang/IllegalArgumentException
      // try (445 -> 457): 458 java/lang/IllegalArgumentException
      // try (574 -> 583): 584 java/lang/IllegalArgumentException
   }

   private static boolean check_23(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast [I
      // 023: astore 5
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Integer
      // 02b: invokevirtual java/lang/Integer.intValue ()I
      // 02e: istore 6
      // 030: pop
      // 031: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 034: lload 2
      // 035: lxor
      // 036: lstore 2
      // 037: lload 2
      // 038: dup2
      // 039: ldc2_w 32090429914198
      // 03c: lxor
      // 03d: lstore 7
      // 03f: dup2
      // 040: ldc2_w 88095550374728
      // 043: lxor
      // 044: lstore 9
      // 046: pop2
      // 047: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 04a: aload 5
      // 04c: iload 6
      // 04e: iaload
      // 04f: istore 11
      // 051: istore 12
      // 053: iload 11
      // 055: iload 12
      // 057: ifeq 06e
      // 05a: iload 4
      // 05c: if_icmpne 06c
      // 05f: goto 066
      // 062: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 065: athrow
      // 066: bipush 0
      // 067: ireturn
      // 068: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06b: athrow
      // 06c: iload 4
      // 06e: istore 13
      // 070: iload 4
      // 072: ldc_w 67108863
      // 075: iand
      // 076: iload 12
      // 078: lload 2
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 0b5
      // 07e: ifeq 0b3
      // 081: ldc 4194309
      // 083: if_icmpne 0b1
      // 086: goto 08d
      // 089: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: iload 11
      // 08f: iload 12
      // 091: ifeq 0af
      // 094: goto 09b
      // 097: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09a: athrow
      // 09b: ldc 4194309
      // 09d: if_icmpne 0ad
      // 0a0: goto 0a7
      // 0a3: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a6: athrow
      // 0a7: bipush 0
      // 0a8: ireturn
      // 0a9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: ldc 4194309
      // 0af: istore 13
      // 0b1: iload 11
      // 0b3: iload 12
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 0dc
      // 0bb: ifeq 0da
      // 0be: ifne 0d5
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: aload 5
      // 0ca: iload 6
      // 0cc: iload 13
      // 0ce: iastore
      // 0cf: bipush 1
      // 0d0: ireturn
      // 0d1: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d4: athrow
      // 0d5: iload 11
      // 0d7: ldc -67108864
      // 0d9: iand
      // 0da: iload 12
      // 0dc: lload 2
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: ifle 116
      // 0e2: ifeq 114
      // 0e5: ifne 112
      // 0e8: goto 0ef
      // 0eb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: iload 11
      // 0f1: ldc 62914560
      // 0f3: iand
      // 0f4: ldc 8388608
      // 0f6: lload 2
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 326
      // 0fc: iload 12
      // 0fe: ifeq 326
      // 101: goto 108
      // 104: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 107: athrow
      // 108: if_icmpne 30f
      // 10b: goto 112
      // 10e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 111: athrow
      // 112: iload 13
      // 114: ldc 4194309
      // 116: iload 12
      // 118: lload 2
      // 119: lconst_0
      // 11a: lcmp
      // 11b: ifle 145
      // 11e: ifeq 13d
      // 121: if_icmpne 131
      // 124: goto 12b
      // 127: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: bipush 0
      // 12c: ireturn
      // 12d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 130: athrow
      // 131: iload 13
      // 133: ldc_w -4194304
      // 136: iand
      // 137: iload 11
      // 139: ldc_w -4194304
      // 13c: iand
      // 13d: lload 2
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 20f
      // 143: iload 12
      // 145: ifeq 20c
      // 148: if_icmpne 201
      // 14b: goto 152
      // 14e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 151: athrow
      // 152: iload 11
      // 154: ldc 62914560
      // 156: iand
      // 157: lload 2
      // 158: lconst_0
      // 159: lcmp
      // 15a: ifle 1c9
      // 15d: ldc 8388608
      // 15f: iload 12
      // 161: ifeq 1c8
      // 164: goto 16b
      // 167: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16a: athrow
      // 16b: if_icmpne 1ba
      // 16e: goto 175
      // 171: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 174: athrow
      // 175: iload 13
      // 177: ldc -67108864
      // 179: iand
      // 17a: ldc 8388608
      // 17c: ior
      // 17d: aload 1
      // 17e: iload 13
      // 180: ldc 1048575
      // 182: iand
      // 183: lload 9
      // 185: dup2_x1
      // 186: pop2
      // 187: iload 11
      // 189: ldc 1048575
      // 18b: iand
      // 18c: bipush 3
      // 18d: anewarray 4
      // 190: dup_x1
      // 191: swap
      // 192: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 195: bipush 2
      // 196: swap
      // 197: aastore
      // 198: dup_x1
      // 199: swap
      // 19a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: invokevirtual rip/breeze/inject/Util139.calculate_7 ([Ljava/lang/Object;)I
      // 1ac: ior
      // 1ad: istore 14
      // 1af: iload 12
      // 1b1: lload 2
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: iflt 395
      // 1b7: ifne 393
      // 1ba: ldc -67108864
      // 1bc: iload 13
      // 1be: ldc -67108864
      // 1c0: iand
      // 1c1: goto 1c8
      // 1c4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: iadd
      // 1c9: istore 15
      // 1cb: iload 15
      // 1cd: ldc 8388608
      // 1cf: ior
      // 1d0: aload 1
      // 1d1: lload 7
      // 1d3: sipush 8892
      // 1d6: ldc2_w 6901893488216038639
      // 1d9: lload 2
      // 1da: lxor
      // 1db: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 1de: bipush 2
      // 1df: anewarray 4
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: bipush 1
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x2
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ed: bipush 0
      // 1ee: swap
      // 1ef: aastore
      // 1f0: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 1f3: ior
      // 1f4: istore 14
      // 1f6: iload 12
      // 1f8: lload 2
      // 1f9: lconst_0
      // 1fa: lcmp
      // 1fb: iflt 395
      // 1fe: ifne 393
      // 201: iload 13
      // 203: ldc -67108864
      // 205: goto 20c
      // 208: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20b: athrow
      // 20c: iand
      // 20d: iload 12
      // 20f: ifeq 24b
      // 212: ifne 23f
      // 215: goto 21c
      // 218: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21b: athrow
      // 21c: iload 13
      // 21e: ldc 62914560
      // 220: iand
      // 221: iload 12
      // 223: ifeq 302
      // 226: goto 22d
      // 229: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22c: athrow
      // 22d: lload 2
      // 22e: lconst_0
      // 22f: lcmp
      // 230: ifle 2fb
      // 233: ldc 8388608
      // 235: if_icmpne 2f9
      // 238: goto 23f
      // 23b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23e: athrow
      // 23f: iload 13
      // 241: ldc -67108864
      // 243: iand
      // 244: goto 24b
      // 247: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24a: athrow
      // 24b: istore 15
      // 24d: iload 15
      // 24f: iload 12
      // 251: ifeq 287
      // 254: ifeq 282
      // 257: goto 25e
      // 25a: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25d: athrow
      // 25e: iload 13
      // 260: ldc 62914560
      // 262: iand
      // 263: ldc 8388608
      // 265: iload 12
      // 267: ifeq 286
      // 26a: goto 271
      // 26d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 270: athrow
      // 271: if_icmpeq 282
      // 274: goto 27b
      // 277: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27a: athrow
      // 27b: ldc -67108864
      // 27d: iload 15
      // 27f: iadd
      // 280: istore 15
      // 282: iload 11
      // 284: ldc -67108864
      // 286: iand
      // 287: istore 16
      // 289: iload 16
      // 28b: iload 12
      // 28d: ifeq 2ec
      // 290: ifeq 2be
      // 293: goto 29a
      // 296: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 299: athrow
      // 29a: iload 11
      // 29c: ldc 62914560
      // 29e: iand
      // 29f: ldc 8388608
      // 2a1: iload 12
      // 2a3: ifeq 2eb
      // 2a6: goto 2ad
      // 2a9: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ac: athrow
      // 2ad: if_icmpeq 2be
      // 2b0: goto 2b7
      // 2b3: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b6: athrow
      // 2b7: ldc -67108864
      // 2b9: iload 16
      // 2bb: iadd
      // 2bc: istore 16
      // 2be: iload 15
      // 2c0: iload 16
      // 2c2: invokestatic java/lang/Math.min (II)I
      // 2c5: ldc 8388608
      // 2c7: ior
      // 2c8: aload 1
      // 2c9: lload 7
      // 2cb: sipush 23964
      // 2ce: ldc2_w 6955283036890670025
      // 2d1: lload 2
      // 2d2: lxor
      // 2d3: invokestatic rip/breeze/inject/à.method_028 (IJ)Ljava/lang/String;
      // 2d6: bipush 2
      // 2d7: anewarray 4
      // 2da: dup_x1
      // 2db: swap
      // 2dc: bipush 1
      // 2dd: swap
      // 2de: aastore
      // 2df: dup_x2
      // 2e0: dup_x2
      // 2e1: pop
      // 2e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 2eb: ior
      // 2ec: istore 14
      // 2ee: iload 12
      // 2f0: lload 2
      // 2f1: lconst_0
      // 2f2: lcmp
      // 2f3: iflt 395
      // 2f6: ifne 393
      // 2f9: ldc 4194304
      // 2fb: goto 302
      // 2fe: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 301: athrow
      // 302: istore 14
      // 304: iload 12
      // 306: lload 2
      // 307: lconst_0
      // 308: lcmp
      // 309: iflt 395
      // 30c: ifne 393
      // 30f: iload 11
      // 311: iload 12
      // 313: ifeq 391
      // 316: goto 31d
      // 319: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31c: athrow
      // 31d: ldc 4194309
      // 31f: goto 326
      // 322: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 325: athrow
      // 326: lload 2
      // 327: lconst_0
      // 328: lcmp
      // 329: ifle 336
      // 32c: if_icmpne 388
      // 32f: iload 13
      // 331: ldc -67108864
      // 333: iand
      // 334: iload 12
      // 336: ifeq 376
      // 339: goto 340
      // 33c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33f: athrow
      // 340: lload 2
      // 341: lconst_0
      // 342: lcmp
      // 343: ifle 36f
      // 346: ifne 36d
      // 349: goto 350
      // 34c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34f: athrow
      // 350: iload 13
      // 352: ldc 62914560
      // 354: iand
      // 355: iload 12
      // 357: ifeq 376
      // 35a: goto 361
      // 35d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 360: athrow
      // 361: ldc 8388608
      // 363: if_icmpne 379
      // 366: goto 36d
      // 369: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36c: athrow
      // 36d: iload 13
      // 36f: goto 376
      // 372: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 375: athrow
      // 376: goto 37b
      // 379: ldc 4194304
      // 37b: istore 14
      // 37d: iload 12
      // 37f: lload 2
      // 380: lconst_0
      // 381: lcmp
      // 382: iflt 395
      // 385: ifne 393
      // 388: ldc 4194304
      // 38a: goto 391
      // 38d: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 390: athrow
      // 391: istore 14
      // 393: iload 14
      // 395: iload 12
      // 397: lload 2
      // 398: lconst_0
      // 399: lcmp
      // 39a: ifle 3a2
      // 39d: ifeq 3ba
      // 3a0: iload 11
      // 3a2: if_icmpeq 3b9
      // 3a5: goto 3ac
      // 3a8: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ab: athrow
      // 3ac: aload 5
      // 3ae: iload 6
      // 3b0: iload 14
      // 3b2: iastore
      // 3b3: bipush 1
      // 3b4: ireturn
      // 3b5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b8: athrow
      // 3b9: bipush 0
      // 3ba: ireturn
      // try (50 -> 55): 56 java/lang/IllegalArgumentException
      // try (53 -> 60): 60 java/lang/IllegalArgumentException
      // try (64 -> 75): 76 java/lang/IllegalArgumentException
      // try (73 -> 81): 82 java/lang/IllegalArgumentException
      // try (78 -> 86): 87 java/lang/IllegalArgumentException
      // try (84 -> 91): 91 java/lang/IllegalArgumentException
      // try (96 -> 103): 104 java/lang/IllegalArgumentException
      // try (102 -> 112): 112 java/lang/IllegalArgumentException
      // try (117 -> 124): 125 java/lang/IllegalArgumentException
      // try (123 -> 137): 138 java/lang/IllegalArgumentException
      // try (127 -> 141): 142 java/lang/IllegalArgumentException
      // try (145 -> 153): 154 java/lang/IllegalArgumentException
      // try (152 -> 158): 158 java/lang/IllegalArgumentException
      // try (166 -> 173): 174 java/lang/IllegalArgumentException
      // try (172 -> 186): 187 java/lang/IllegalArgumentException
      // try (176 -> 190): 191 java/lang/IllegalArgumentException
      // try (232 -> 242): 243 java/lang/IllegalArgumentException
      // try (274 -> 282): 283 java/lang/IllegalArgumentException
      // try (285 -> 289): 290 java/lang/IllegalArgumentException
      // try (288 -> 297): 298 java/lang/IllegalArgumentException
      // try (292 -> 306): 307 java/lang/IllegalArgumentException
      // try (300 -> 312): 313 java/lang/IllegalArgumentException
      // try (316 -> 320): 321 java/lang/IllegalArgumentException
      // try (319 -> 329): 330 java/lang/IllegalArgumentException
      // try (323 -> 333): 334 java/lang/IllegalArgumentException
      // try (344 -> 348): 349 java/lang/IllegalArgumentException
      // try (347 -> 357): 358 java/lang/IllegalArgumentException
      // try (351 -> 361): 362 java/lang/IllegalArgumentException
      // try (397 -> 404): 405 java/lang/IllegalArgumentException
      // try (408 -> 417): 418 java/lang/IllegalArgumentException
      // try (414 -> 421): 422 java/lang/IllegalArgumentException
      // try (424 -> 434): 435 java/lang/IllegalArgumentException
      // try (429 -> 442): 443 java/lang/IllegalArgumentException
      // try (437 -> 450): 451 java/lang/IllegalArgumentException
      // try (445 -> 455): 456 java/lang/IllegalArgumentException
      // try (453 -> 459): 460 java/lang/IllegalArgumentException
      // try (465 -> 472): 473 java/lang/IllegalArgumentException
      // try (476 -> 485): 486 java/lang/IllegalArgumentException
      // try (483 -> 494): 494 java/lang/IllegalArgumentException
   }

   final void invoke_24(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/MathUtil11
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 57052935982226
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 87143750309030
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 02c: aload 0
      // 02d: getfield rip/breeze/inject/à.arr_i_2 [I
      // 030: astore 9
      // 032: bipush 0
      // 033: istore 10
      // 035: istore 11
      // 037: bipush 0
      // 038: istore 12
      // 03a: bipush 0
      // 03b: istore 13
      // 03d: iload 13
      // 03f: aload 9
      // 041: arraylength
      // 042: if_icmpge 0e1
      // 045: aload 9
      // 047: iload 11
      // 049: lload 3
      // 04a: lconst_0
      // 04b: lcmp
      // 04c: iflt 054
      // 04f: ifne 0e5
      // 052: iload 13
      // 054: iaload
      // 055: istore 14
      // 057: iload 13
      // 059: iload 14
      // 05b: iload 11
      // 05d: lload 3
      // 05e: lconst_0
      // 05f: lcmp
      // 060: iflt 068
      // 063: ifne 094
      // 066: ldc 4194308
      // 068: if_icmpeq 08c
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: iload 14
      // 074: iload 11
      // 076: ifne 094
      // 079: goto 080
      // 07c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07f: athrow
      // 080: ldc 4194307
      // 082: if_icmpne 097
      // 085: goto 08c
      // 088: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08b: athrow
      // 08c: bipush 2
      // 08d: goto 094
      // 090: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: goto 098
      // 097: bipush 1
      // 098: iadd
      // 099: istore 13
      // 09b: iload 14
      // 09d: lload 3
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: ifle 0da
      // 0a3: ldc 4194304
      // 0a5: iload 11
      // 0a7: ifne 0d6
      // 0aa: if_icmpne 0c9
      // 0ad: goto 0b4
      // 0b0: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: iinc 12 1
      // 0b7: iload 11
      // 0b9: lload 3
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 0de
      // 0bf: ifeq 0dc
      // 0c2: goto 0c9
      // 0c5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c8: athrow
      // 0c9: iload 10
      // 0cb: iload 12
      // 0cd: bipush 1
      // 0ce: iadd
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d5: athrow
      // 0d6: iadd
      // 0d7: istore 10
      // 0d9: bipush 0
      // 0da: istore 12
      // 0dc: iload 11
      // 0de: ifeq 03d
      // 0e1: aload 0
      // 0e2: getfield rip/breeze/inject/à.arr_h_2 [I
      // 0e5: astore 14
      // 0e7: bipush 0
      // 0e8: istore 15
      // 0ea: bipush 0
      // 0eb: istore 13
      // 0ed: iload 13
      // 0ef: aload 14
      // 0f1: arraylength
      // 0f2: if_icmpge 15a
      // 0f5: aload 14
      // 0f7: iload 13
      // 0f9: iaload
      // 0fa: istore 16
      // 0fc: iload 13
      // 0fe: iload 11
      // 100: lload 3
      // 101: lconst_0
      // 102: lcmp
      // 103: iflt 10b
      // 106: ifne 19b
      // 109: iload 16
      // 10b: iload 11
      // 10d: ifne 14b
      // 110: goto 117
      // 113: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 116: athrow
      // 117: lload 3
      // 118: lconst_0
      // 119: lcmp
      // 11a: ifle 144
      // 11d: ldc 4194308
      // 11f: if_icmpeq 143
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: iload 16
      // 12b: iload 11
      // 12d: ifne 14b
      // 130: goto 137
      // 133: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 136: athrow
      // 137: ldc 4194307
      // 139: if_icmpne 14e
      // 13c: goto 143
      // 13f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 142: athrow
      // 143: bipush 2
      // 144: goto 14b
      // 147: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14a: athrow
      // 14b: goto 14f
      // 14e: bipush 1
      // 14f: iadd
      // 150: istore 13
      // 152: iinc 15 1
      // 155: iload 11
      // 157: ifeq 0ed
      // 15a: aload 2
      // 15b: aload 0
      // 15c: getfield rip/breeze/inject/à.ª_j_2 Lrip/breeze/inject/ª;
      // 15f: getfield rip/breeze/inject/ª.int_ê_2 I
      // 162: lload 5
      // 164: dup2_x1
      // 165: pop2
      // 166: iload 10
      // 168: iload 15
      // 16a: bipush 4
      // 16b: anewarray 4
      // 16e: dup_x1
      // 16f: swap
      // 170: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 173: bipush 3
      // 174: swap
      // 175: aastore
      // 176: dup_x1
      // 177: swap
      // 178: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17b: bipush 2
      // 17c: swap
      // 17d: aastore
      // 17e: dup_x1
      // 17f: swap
      // 180: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: invokevirtual rip/breeze/inject/MathUtil11.calculate_19 ([Ljava/lang/Object;)I
      // 192: istore 16
      // 194: lload 3
      // 195: lconst_0
      // 196: lcmp
      // 197: iflt 0fc
      // 19a: bipush 0
      // 19b: istore 13
      // 19d: iload 10
      // 19f: iinc 10 -1
      // 1a2: ifle 226
      // 1a5: aload 9
      // 1a7: iload 13
      // 1a9: iaload
      // 1aa: istore 17
      // 1ac: iload 13
      // 1ae: iload 17
      // 1b0: iload 11
      // 1b2: lload 3
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: ifle 1bd
      // 1b8: ifne 1fb
      // 1bb: ldc 4194308
      // 1bd: lload 3
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: ifle 262
      // 1c3: iload 11
      // 1c5: ifne 262
      // 1c8: goto 1cf
      // 1cb: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ce: athrow
      // 1cf: if_icmpeq 1f3
      // 1d2: goto 1d9
      // 1d5: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d8: athrow
      // 1d9: iload 17
      // 1db: iload 11
      // 1dd: ifne 1fb
      // 1e0: goto 1e7
      // 1e3: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e6: athrow
      // 1e7: ldc 4194307
      // 1e9: if_icmpne 1fe
      // 1ec: goto 1f3
      // 1ef: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f2: athrow
      // 1f3: bipush 2
      // 1f4: goto 1fb
      // 1f7: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fa: athrow
      // 1fb: goto 1ff
      // 1fe: bipush 1
      // 1ff: iadd
      // 200: istore 13
      // 202: aload 2
      // 203: iload 16
      // 205: iinc 16 1
      // 208: iload 17
      // 20a: bipush 2
      // 20b: anewarray 4
      // 20e: dup_x1
      // 20f: swap
      // 210: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 213: bipush 1
      // 214: swap
      // 215: aastore
      // 216: dup_x1
      // 217: swap
      // 218: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21b: bipush 0
      // 21c: swap
      // 21d: aastore
      // 21e: invokevirtual rip/breeze/inject/MathUtil11.clamp ([Ljava/lang/Object;)V
      // 221: iload 11
      // 223: ifeq 19d
      // 226: bipush 0
      // 227: lload 3
      // 228: lconst_0
      // 229: lcmp
      // 22a: ifle 1aa
      // 22d: istore 13
      // 22f: iload 15
      // 231: iinc 15 -1
      // 234: ifle 2b8
      // 237: aload 14
      // 239: iload 13
      // 23b: iaload
      // 23c: istore 17
      // 23e: iload 11
      // 240: lload 3
      // 241: lconst_0
      // 242: lcmp
      // 243: ifle 24b
      // 246: ifne 2d1
      // 249: iload 13
      // 24b: iload 17
      // 24d: iload 11
      // 24f: ifne 28d
      // 252: goto 259
      // 255: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 258: athrow
      // 259: ldc 4194308
      // 25b: goto 262
      // 25e: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 261: athrow
      // 262: lload 3
      // 263: lconst_0
      // 264: lcmp
      // 265: ifle 26f
      // 268: if_icmpeq 285
      // 26b: iload 17
      // 26d: iload 11
      // 26f: ifne 28d
      // 272: goto 279
      // 275: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 278: athrow
      // 279: ldc 4194307
      // 27b: if_icmpne 290
      // 27e: goto 285
      // 281: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 284: athrow
      // 285: bipush 2
      // 286: goto 28d
      // 289: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28c: athrow
      // 28d: goto 291
      // 290: bipush 1
      // 291: iadd
      // 292: istore 13
      // 294: aload 2
      // 295: iload 16
      // 297: iinc 16 1
      // 29a: iload 17
      // 29c: bipush 2
      // 29d: anewarray 4
      // 2a0: dup_x1
      // 2a1: swap
      // 2a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a5: bipush 1
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: invokevirtual rip/breeze/inject/MathUtil11.clamp ([Ljava/lang/Object;)V
      // 2b3: iload 11
      // 2b5: ifeq 22f
      // 2b8: aload 2
      // 2b9: lload 7
      // 2bb: bipush 1
      // 2bc: anewarray 4
      // 2bf: dup_x2
      // 2c0: dup_x2
      // 2c1: pop
      // 2c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c5: bipush 0
      // 2c6: swap
      // 2c7: aastore
      // 2c8: invokevirtual rip/breeze/inject/MathUtil11.calculate_20 ([Ljava/lang/Object;)V
      // 2cb: lload 3
      // 2cc: lconst_0
      // 2cd: lcmp
      // 2ce: ifle 2d1
      // 2d1: return
      // try (52 -> 62): 63 java/lang/IllegalArgumentException
      // try (60 -> 68): 69 java/lang/IllegalArgumentException
      // try (65 -> 73): 74 java/lang/IllegalArgumentException
      // try (71 -> 77): 78 java/lang/IllegalArgumentException
      // try (84 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 103): 104 java/lang/IllegalArgumentException
      // try (96 -> 110): 111 java/lang/IllegalArgumentException
      // try (134 -> 144): 145 java/lang/IllegalArgumentException
      // try (141 -> 153): 154 java/lang/IllegalArgumentException
      // try (147 -> 159): 160 java/lang/IllegalArgumentException
      // try (156 -> 164): 165 java/lang/IllegalArgumentException
      // try (162 -> 168): 169 java/lang/IllegalArgumentException
      // try (229 -> 244): 245 java/lang/IllegalArgumentException
      // try (237 -> 248): 249 java/lang/IllegalArgumentException
      // try (247 -> 254): 255 java/lang/IllegalArgumentException
      // try (251 -> 259): 260 java/lang/IllegalArgumentException
      // try (257 -> 263): 264 java/lang/IllegalArgumentException
      // try (304 -> 314): 315 java/lang/IllegalArgumentException
      // try (310 -> 318): 319 java/lang/IllegalArgumentException
      // try (321 -> 329): 330 java/lang/IllegalArgumentException
      // try (326 -> 334): 335 java/lang/IllegalArgumentException
      // try (332 -> 338): 339 java/lang/IllegalArgumentException
   }

   static void invoke_25(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/Util139
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 3
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast rip/breeze/inject/ð
      // 022: astore 5
      // 024: pop
      // 025: getstatic rip/breeze/inject/à.encKey_a_2 J
      // 028: lload 3
      // 029: lxor
      // 02a: lstore 3
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 103444532036692
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 124000797188786
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 57835409139259
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 75698369406310
      // 045: lxor
      // 046: lstore 12
      // 048: pop2
      // 049: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 04c: iload 2
      // 04d: ldc -67108864
      // 04f: iand
      // 050: bipush 26
      // 052: ishr
      // 053: istore 14
      // 055: istore 15
      // 057: iload 14
      // 059: iload 15
      // 05b: ifeq 073
      // 05e: ifne 22e
      // 061: goto 068
      // 064: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: iload 2
      // 069: ldc 1048575
      // 06b: iand
      // 06c: goto 073
      // 06f: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 072: athrow
      // 073: istore 16
      // 075: iload 15
      // 077: lload 3
      // 078: lconst_0
      // 079: lcmp
      // 07a: iflt 0dc
      // 07d: ifeq 0da
      // 080: iload 2
      // 081: ldc 62914560
      // 083: iand
      // 084: lookupswitch 409 4 4194304 48 8388608 97 12582912 220 16777216 317
      // 0b0: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: aload 5
      // 0b6: iload 16
      // 0b8: lload 12
      // 0ba: bipush 2
      // 0bb: anewarray 4
      // 0be: dup_x2
      // 0bf: dup_x2
      // 0c0: pop
      // 0c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c4: bipush 1
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x1
      // 0c8: swap
      // 0c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cc: bipush 0
      // 0cd: swap
      // 0ce: aastore
      // 0cf: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0d2: pop
      // 0d3: goto 0da
      // 0d6: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d9: athrow
      // 0da: iload 15
      // 0dc: lload 3
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: iflt 22b
      // 0e2: ifne 229
      // 0e5: aload 5
      // 0e7: bipush 7
      // 0e9: lload 12
      // 0eb: bipush 2
      // 0ec: anewarray 4
      // 0ef: dup_x2
      // 0f0: dup_x2
      // 0f1: pop
      // 0f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 103: aload 1
      // 104: aload 1
      // 105: iload 16
      // 107: bipush 1
      // 108: anewarray 4
      // 10b: dup_x1
      // 10c: swap
      // 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_22 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 116: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 119: lload 6
      // 11b: bipush 2
      // 11c: anewarray 4
      // 11f: dup_x2
      // 120: dup_x2
      // 121: pop
      // 122: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125: bipush 1
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 130: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 133: lload 10
      // 135: bipush 2
      // 136: anewarray 4
      // 139: dup_x2
      // 13a: dup_x2
      // 13b: pop
      // 13c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13f: bipush 1
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 14d: pop
      // 14e: iload 15
      // 150: lload 3
      // 151: lconst_0
      // 152: lcmp
      // 153: iflt 22b
      // 156: ifne 229
      // 159: goto 160
      // 15c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: aload 5
      // 162: bipush 8
      // 164: lload 12
      // 166: bipush 2
      // 167: anewarray 4
      // 16a: dup_x2
      // 16b: dup_x2
      // 16c: pop
      // 16d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 170: bipush 1
      // 171: swap
      // 172: aastore
      // 173: dup_x1
      // 174: swap
      // 175: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 178: bipush 0
      // 179: swap
      // 17a: aastore
      // 17b: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 17e: aload 1
      // 17f: iload 16
      // 181: bipush 1
      // 182: anewarray 4
      // 185: dup_x1
      // 186: swap
      // 187: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18a: bipush 0
      // 18b: swap
      // 18c: aastore
      // 18d: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_22 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 190: getfield rip/breeze/inject/BreezeClass3.long_ã J
      // 193: l2i
      // 194: lload 10
      // 196: bipush 2
      // 197: anewarray 4
      // 19a: dup_x2
      // 19b: dup_x2
      // 19c: pop
      // 19d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a0: bipush 1
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a8: bipush 0
      // 1a9: swap
      // 1aa: aastore
      // 1ab: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1ae: pop
      // 1af: iload 15
      // 1b1: lload 3
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: iflt 22b
      // 1b7: ifne 229
      // 1ba: goto 1c1
      // 1bd: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c0: athrow
      // 1c1: aload 5
      // 1c3: bipush 8
      // 1c5: lload 12
      // 1c7: bipush 2
      // 1c8: anewarray 4
      // 1cb: dup_x2
      // 1cc: dup_x2
      // 1cd: pop
      // 1ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1df: pop
      // 1e0: aload 1
      // 1e1: iload 16
      // 1e3: bipush 1
      // 1e4: anewarray 4
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ec: bipush 0
      // 1ed: swap
      // 1ee: aastore
      // 1ef: invokevirtual rip/breeze/inject/Util139.getª ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 1f2: lload 8
      // 1f4: aload 5
      // 1f6: bipush 2
      // 1f7: anewarray 4
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 1
      // 1fd: swap
      // 1fe: aastore
      // 1ff: dup_x2
      // 200: dup_x2
      // 201: pop
      // 202: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: invokevirtual rip/breeze/inject/ª.method_006 ([Ljava/lang/Object;)V
      // 20b: iload 15
      // 20d: lload 3
      // 20e: lconst_0
      // 20f: lcmp
      // 210: iflt 22b
      // 213: ifne 229
      // 216: goto 21d
      // 219: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21c: athrow
      // 21d: new java/lang/AssertionError
      // 220: dup
      // 221: invokespecial java/lang/AssertionError.<init> ()V
      // 224: athrow
      // 225: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 228: athrow
      // 229: iload 15
      // 22b: ifne 401
      // 22e: new java/lang/StringBuilder
      // 231: dup
      // 232: invokespecial java/lang/StringBuilder.<init> ()V
      // 235: astore 16
      // 237: iload 14
      // 239: iinc 14 -1
      // 23c: ifle 264
      // 23f: aload 16
      // 241: bipush 91
      // 243: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 246: pop
      // 247: iload 15
      // 249: lload 3
      // 24a: lconst_0
      // 24b: lcmp
      // 24c: iflt 2b3
      // 24f: ifeq 2b2
      // 252: iload 15
      // 254: ifne 237
      // 257: lload 3
      // 258: lconst_0
      // 259: lcmp
      // 25a: ifle 247
      // 25d: goto 264
      // 260: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 263: athrow
      // 264: iload 2
      // 265: ldc 62914560
      // 267: iand
      // 268: ldc 8388608
      // 26a: lload 3
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: iflt 2b5
      // 270: iload 15
      // 272: ifeq 2b5
      // 275: if_icmpne 2b2
      // 278: goto 27f
      // 27b: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27e: athrow
      // 27f: aload 16
      // 281: bipush 76
      // 283: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 286: aload 1
      // 287: iload 2
      // 288: ldc 1048575
      // 28a: iand
      // 28b: bipush 1
      // 28c: anewarray 4
      // 28f: dup_x1
      // 290: swap
      // 291: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 294: bipush 0
      // 295: swap
      // 296: aastore
      // 297: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_22 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 29a: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: bipush 59
      // 2a2: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2a5: pop
      // 2a6: iload 15
      // 2a8: ifne 3a8
      // 2ab: goto 2b2
      // 2ae: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b1: athrow
      // 2b2: iload 2
      // 2b3: ldc 1048575
      // 2b5: iand
      // 2b6: lload 3
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: ifle 306
      // 2bc: tableswitch 224 1 12 144 164 204 184 224 224 224 224 64 84 104 124
      // 2fc: aload 16
      // 2fe: bipush 90
      // 300: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 303: pop
      // 304: iload 15
      // 306: ifne 3a8
      // 309: goto 310
      // 30c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30f: athrow
      // 310: aload 16
      // 312: bipush 66
      // 314: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 317: pop
      // 318: iload 15
      // 31a: ifne 3a8
      // 31d: goto 324
      // 320: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 323: athrow
      // 324: aload 16
      // 326: bipush 67
      // 328: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 32b: pop
      // 32c: iload 15
      // 32e: ifne 3a8
      // 331: goto 338
      // 334: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 337: athrow
      // 338: aload 16
      // 33a: bipush 83
      // 33c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 33f: pop
      // 340: iload 15
      // 342: ifne 3a8
      // 345: goto 34c
      // 348: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34b: athrow
      // 34c: aload 16
      // 34e: bipush 73
      // 350: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 353: pop
      // 354: iload 15
      // 356: ifne 3a8
      // 359: goto 360
      // 35c: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35f: athrow
      // 360: aload 16
      // 362: bipush 70
      // 364: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 367: pop
      // 368: iload 15
      // 36a: ifne 3a8
      // 36d: goto 374
      // 370: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 373: athrow
      // 374: aload 16
      // 376: bipush 74
      // 378: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 37b: pop
      // 37c: iload 15
      // 37e: ifne 3a8
      // 381: goto 388
      // 384: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 387: athrow
      // 388: aload 16
      // 38a: bipush 68
      // 38c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 38f: pop
      // 390: iload 15
      // 392: ifne 3a8
      // 395: goto 39c
      // 398: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39b: athrow
      // 39c: new java/lang/AssertionError
      // 39f: dup
      // 3a0: invokespecial java/lang/AssertionError.<init> ()V
      // 3a3: athrow
      // 3a4: invokestatic rip/breeze/inject/à.method_026 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a7: athrow
      // 3a8: aload 5
      // 3aa: bipush 7
      // 3ac: lload 12
      // 3ae: bipush 2
      // 3af: anewarray 4
      // 3b2: dup_x2
      // 3b3: dup_x2
      // 3b4: pop
      // 3b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b8: bipush 1
      // 3b9: swap
      // 3ba: aastore
      // 3bb: dup_x1
      // 3bc: swap
      // 3bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c0: bipush 0
      // 3c1: swap
      // 3c2: aastore
      // 3c3: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 3c6: aload 1
      // 3c7: aload 16
      // 3c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3cc: lload 6
      // 3ce: bipush 2
      // 3cf: anewarray 4
      // 3d2: dup_x2
      // 3d3: dup_x2
      // 3d4: pop
      // 3d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d8: bipush 1
      // 3d9: swap
      // 3da: aastore
      // 3db: dup_x1
      // 3dc: swap
      // 3dd: bipush 0
      // 3de: swap
      // 3df: aastore
      // 3e0: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 3e3: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 3e6: lload 10
      // 3e8: bipush 2
      // 3e9: anewarray 4
      // 3ec: dup_x2
      // 3ed: dup_x2
      // 3ee: pop
      // 3ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f2: bipush 1
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x1
      // 3f6: swap
      // 3f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3fa: bipush 0
      // 3fb: swap
      // 3fc: aastore
      // 3fd: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 400: pop
      // 401: return
      // try (54 -> 58): 59 java/lang/IllegalArgumentException
      // try (57 -> 64): 65 java/lang/IllegalArgumentException
      // try (68 -> 78): 78 java/lang/IllegalArgumentException
      // try (74 -> 100): 101 java/lang/IllegalArgumentException
      // try (103 -> 182): 183 java/lang/IllegalArgumentException
      // try (109 -> 241): 242 java/lang/IllegalArgumentException
      // try (185 -> 298): 299 java/lang/IllegalArgumentException
      // try (244 -> 305): 305 java/lang/IllegalArgumentException
      // try (316 -> 328): 333 java/lang/IllegalArgumentException
      // try (335 -> 346): 347 java/lang/IllegalArgumentException
      // try (345 -> 372): 373 java/lang/IllegalArgumentException
      // try (377 -> 389): 390 java/lang/IllegalArgumentException
      // try (383 -> 398): 399 java/lang/IllegalArgumentException
      // try (392 -> 407): 408 java/lang/IllegalArgumentException
      // try (401 -> 416): 417 java/lang/IllegalArgumentException
      // try (410 -> 425): 426 java/lang/IllegalArgumentException
      // try (419 -> 434): 435 java/lang/IllegalArgumentException
      // try (428 -> 443): 444 java/lang/IllegalArgumentException
      // try (437 -> 452): 453 java/lang/IllegalArgumentException
      // try (446 -> 459): 459 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 15895753626137L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "Ê\u0088´\u0015uÿ\u000e\u0017Ï¶\u007fÂpÿ¯*¼¥\u0007¿\u001e\u0000ýë´BÂÊ\u008d\u0084ÐÕ\u0085ËgÊs¶×Ýý\u008eiÏ^½}\u001b8´\u007fÀ\u0092Ã\u000bW-#æ\u007f\u0081\n\u0082\u0088\u0095\u0006w:SJ6É\u001fFâùÄ\u0086\u0097[\u008bÐ\u001fÁ\u0005\u0081!`\u0013e\u000e\u0095ü\u000160\u001dnVëq\u000f\u0092ñs(\u0004w¥\u0096\u008a6\u009d@QlÏS\u0019]GÂÝ¢u\u0014sz\u0013ëÏ»¡\u0001Äu½5¥°RtyDCõ(!e=È±\u00189C\u0082[¸Z¸ÂCþG\u001aÎ®\\å7¸lðõÿnq+Go\u00ad%ú²ÎBÁ(KÐÍèlÇ¯x\\\u0081#å\u001cÆ\u008c\u001aÚ*z£\u0097÷\u0004ñ\u0003~ÿeb÷\u001eqóºwÂl\u0000\u008a\u009dX\u008f¿©\f\u0007´ÞßÓæ\"I½\u008d#\u0011À¦|(È¿bUpHáán\u009b¨g?L@îØ\b[ÀU\r\u0086Ò\u001d\u0081¤\byvÝµF¥>\u0092w6a §í\u0094¨\u00060x'yz\u0001·¡MEÕ\u0004ªÒ,£±ä\u0081>\u0098=Á()?_!ô×;\u0092\u0017IõI]0#Ã\u0001ïØ1,·Wr¥\u001e\u0094µ\u009fù \u001eà8£-óß'Ù";
      int var7 = "Ê\u0088´\u0015uÿ\u000e\u0017Ï¶\u007fÂpÿ¯*¼¥\u0007¿\u001e\u0000ýë´BÂÊ\u008d\u0084ÐÕ\u0085ËgÊs¶×Ýý\u008eiÏ^½}\u001b8´\u007fÀ\u0092Ã\u000bW-#æ\u007f\u0081\n\u0082\u0088\u0095\u0006w:SJ6É\u001fFâùÄ\u0086\u0097[\u008bÐ\u001fÁ\u0005\u0081!`\u0013e\u000e\u0095ü\u000160\u001dnVëq\u000f\u0092ñs(\u0004w¥\u0096\u008a6\u009d@QlÏS\u0019]GÂÝ¢u\u0014sz\u0013ëÏ»¡\u0001Äu½5¥°RtyDCõ(!e=È±\u00189C\u0082[¸Z¸ÂCþG\u001aÎ®\\å7¸lðõÿnq+Go\u00ad%ú²ÎBÁ(KÐÍèlÇ¯x\\\u0081#å\u001cÆ\u008c\u001aÚ*z£\u0097÷\u0004ñ\u0003~ÿeb÷\u001eqóºwÂl\u0000\u008a\u009dX\u008f¿©\f\u0007´ÞßÓæ\"I½\u008d#\u0011À¦|(È¿bUpHáán\u009b¨g?L@îØ\b[ÀU\r\u0086Ò\u001d\u0081¤\byvÝµF¥>\u0092w6a §í\u0094¨\u00060x'yz\u0001·¡MEÕ\u0004ªÒ,£±ä\u0081>\u0098=Á()?_!ô×;\u0092\u0017IõI]0#Ã\u0001ïØ1,·Wr¥\u001e\u0094µ\u009fù \u001eà8£-óß'Ù"
         .length();
      char var8 = '0';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_027(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = " x\u008f\u001b%\u009fN«ÃÈë\u0097.1]¿ÓLó\u001c\u001b \u009d\u000fëþÀ\u009ae{\u0084\"8z6-\u009bl`Vü y+*qGÆvì¿è¦xJ1³l\u001cîE0^\u009a:ª@_f\u008fâÿ\tP\"\u0092@va\u0091VRóà~cå\u0089<";
            var7 = " x\u008f\u001b%\u009fN«ÃÈë\u0097.1]¿ÓLó\u001c\u001b \u009d\u000fëþÀ\u009ae{\u0084\"8z6-\u009bl`Vü y+*qGÆvì¿è¦xJ1³l\u001cîE0^\u009a:ª@_f\u008fâÿ\tP\"\u0092@va\u0091VRóà~cå\u0089<"
               .length();
            var8 = ' ';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_027(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_A_2 = var4;
                  CONST_B_2 = new String[9];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException invoke_26(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_27(byte[] var0) {
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

   private static String invoke_28(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1905;
      if (CONST_B_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/à", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A_2[var3].getBytes("ISO-8859-1");
         CONST_B_2[var3] = method_027(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B_2[var3];
   }
}
