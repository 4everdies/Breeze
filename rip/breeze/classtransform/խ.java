package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.BreezeClass13;
import rip.breeze.inject.ù;

public class խ {
   private static final String CONST_B_2;

   public static BreezeClass12 invoke_1(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      BreezeClass12 var3 = (BreezeClass12)var0[2];
      long var4 = (Long)var0[3];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 116465622251037L;
      return method_003(new Object[]{var1.string_ú_2, var2.string_ú_2, var2, var6, var3});
   }

   public static rip.breeze.inject.á invoke_2(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      long var3 = (Long)var0[2];
      rip.breeze.inject.á var5 = (rip.breeze.inject.á)var0[3];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 104332433408945L;
      String var10002 = var2.string_ú_2;
      return method_004(new Object[]{var1.string_ú_2, var6, var10002, var2, var5});
   }

   public static BreezeClass12 invoke_3(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[2];
      long var4 = (Long)var0[3];
      BreezeClass12 var6 = (BreezeClass12)var0[4];
      var4 = encKey_a_2 ^ var4;
      long var7 = var4 ^ 139356378971005L;
      long var9 = var4 ^ 73901097730205L;
      long var10001 = var4 ^ 117099063782440L;
      int var11 = (int)((var4 ^ 117099063782440L) >>> 32);
      int var12 = (int)((var4 ^ 117099063782440L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var4 ^ 131800748940191L;
      long var16 = var4 ^ 105566029927963L;
      long var18 = var4 ^ 36072132201654L;
      ô.method_016();
      ô var20 = new ô(var1, var2);

      String[] var33;
      BreezeClass12 var10000;
      int var10002;
      String var10003;
      String var10004;
      String var10005;
      label29: {
         try {
            var10000 = new BreezeClass12();
            var32 = var10000;
            var10002 = var6.int_û;
            String var10007 = var6.string_ù;
            var10003 = var20.method_001(new Object[]{var1, var6.string_ú, var9, var10007});
            String var10006 = var6.string_ù;
            var10004 = var20.ÿ(new Object[]{var14, var10006});
            var10005 = var6.string_ø;
            if (var6.list_ö == null) {
               var33 = null;
               break label29;
            }
         } catch (RuntimeException var30) {
            throw method_008(var30);
         }

         var33 = var20.ü(new Object[]{var6.list_ö.toArray(new String[0]), var16});
      }

      String[] var22 = var33;
      String var23 = var10005;
      String var24 = var10004;
      String var25 = var10003;
      int var26 = var10002;
      /* constructor call removed */
      BreezeClass12 var27 = var10000;
      BreezeClass13 var28 = new BreezeClass13(var27, var20, var18);

      try {
         var6.toggle(new Object[]{var7, var28});
         var3.list_ä_2.add(var27);
         if (var4 >= 0L && !rip.breeze.inject.ջ.method_013()) {
            ô.method_015("eNu75");
         }

         return var27;
      } catch (RuntimeException var29) {
         throw method_008(var29);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static rip.breeze.inject.á invoke_4(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      rip.breeze.inject.é var5 = (rip.breeze.inject.é)var0[3];
      rip.breeze.inject.á var6 = (rip.breeze.inject.á)var0[4];
      var2 = encKey_a_2 ^ var2;
      long var7 = var2 ^ 106235261487316L;
      long var9 = var2 ^ 66816662358808L;
      long var11 = var2 ^ 85145796736230L;
      long var13 = var2 ^ 110904201901107L;
      long var15 = var2 ^ 121286504455800L;
      long var17 = var2 ^ 12318827212345L;
      long var19 = var2 ^ 131458090798412L;
      long var21 = var2 ^ 140619786425972L;
      long var23 = var2 ^ 134394630584670L;
      String var10000 = ô.method_016();
      ô var25 = new ô(var1, var4);
      String var26 = var10000;

      Object var73;
      rip.breeze.inject.á var10001;
      int var10002;
      String var10003;
      String var10004;
      String var10005;
      label250: {
         try {
            var59 = new rip.breeze.inject.á();
            var10001 = var59;
            var10002 = var6.int_ý_2;
            var73 = var6.string_ü_2;
            String var10007 = var6.string_û_2;
            var10003 = var25.method_004(new Object[]{var9, var1, var73, var10007});
            var73 = var6.string_û_2;
            var10004 = var25.ÿ(new Object[]{var13, var73});
            var73 = var6.string_ú_2;
            Object[] var10010 = new Object[]{null, null, true};
            var10010[1] = var15;
            var10010[0] = var73;
            var10005 = var25.ù(var10010);
            if (var6.object_ù_2 == null) {
               var73 = null;
               break label250;
            }
         } catch (RuntimeException var51) {
            throw method_008(var51);
         }

         var73 = (Object[])var25.ú(new Object[]{var6.object_ù_2, var23});
      }

      Object var27 = var73;
      String var28 = var10005;
      String var29 = var10004;
      String var30 = var10003;
      /* constructor call removed */
      rip.breeze.inject.á var31 = var59;
      rip.breeze.inject.â var32 = new rip.breeze.inject.â(var7, var31, var25);

      label241: {
         label240: {
            label255: {
               label238: {
                  label237: {
                     label256: {
                        label235: {
                           label234: {
                              label257: {
                                 try {
                                    var60 = var6.list_õ_2;
                                    var66 = var26;
                                    if (var2 < 0L) {
                                       break label235;
                                    }

                                    if (var26 == null) {
                                       break label234;
                                    }

                                    if (var6.list_õ_2 == null) {
                                       break label257;
                                    }
                                 } catch (RuntimeException var50) {
                                    throw method_008(var50);
                                 }

                                 label227:
                                 for (rip.breeze.inject.ø var34 : var6.list_õ_2) {
                                    try {
                                       var10002 = var34.int_ú;
                                       Object[] var10008 = new Object[]{null, null, var34.և_ù, var34.ü, true};
                                       var10008[1] = var17;
                                       var10008[0] = var10002;
                                       var34.ö(new Object[]{var11, var32.method_002(var10008)});
                                    } catch (RuntimeException var41) {
                                       throw method_008(var41);
                                    }

                                    do {
                                       try {
                                          var10000 = var26;
                                          if (var2 > 0L) {
                                             if (var26 == null) {
                                                break label256;
                                             }

                                             var10000 = var26;
                                          }

                                          if (var10000 != null) {
                                             continue label227;
                                          }
                                       } catch (RuntimeException var49) {
                                          throw method_008(var49);
                                       }
                                    } while (var2 < 0L);

                                    label214: {
                                       try {
                                          var62 = rip.breeze.inject.ջ.method_012();
                                          if (var2 <= 0L) {
                                             break label214;
                                          }

                                          if (var62) {
                                             var62 = false;
                                             break label214;
                                          }
                                       } catch (RuntimeException var48) {
                                          throw method_008(var48);
                                       }

                                       var62 = true;
                                    }

                                    rip.breeze.inject.ջ.method_011(var62);
                                    break;
                                 }
                              }

                              var60 = var6.list_ô_2;
                           }

                           try {
                              var66 = var26;
                           } catch (RuntimeException var40) {
                              throw method_008(var40);
                           }
                        }

                        try {
                           if (var2 < 0L) {
                              break label238;
                           }

                           if (var66 == null) {
                              break label237;
                           }

                           if (var60 == null) {
                              break label256;
                           }
                        } catch (RuntimeException var47) {
                           throw method_008(var47);
                        }

                        label191:
                        for (rip.breeze.inject.ø var56 : var6.list_ô_2) {
                           try {
                              var10002 = var56.int_ú;
                              Object[] var76 = new Object[]{null, null, var56.և_ù, var56.ü, false};
                              var76[1] = var17;
                              var76[0] = var10002;
                              var56.ö(new Object[]{var11, var32.method_002(var76)});
                           } catch (RuntimeException var39) {
                              throw method_008(var39);
                           }

                           while (true) {
                              try {
                                 var10000 = var26;
                                 if (var2 >= 0L) {
                                    if (var26 == null) {
                                       break label255;
                                    }

                                    var10000 = var26;
                                 }

                                 if (var10000 != null) {
                                    break;
                                 }
                              } catch (RuntimeException var46) {
                                 throw method_008(var46);
                              }

                              if (var2 >= 0L) {
                                 break label191;
                              }
                           }
                        }
                     }

                     var60 = var6.list_ø_2;
                  }

                  try {
                     var66 = var26;
                  } catch (RuntimeException var38) {
                     throw method_008(var38);
                  }
               }

               try {
                  if (var2 <= 0L) {
                     break label241;
                  }

                  if (var66 == null) {
                     break label240;
                  }

                  if (var60 == null) {
                     break label255;
                  }
               } catch (RuntimeException var45) {
                  throw method_008(var45);
               }

               label164:
               for (ù var57 : var6.list_ø_2) {
                  try {
                     String var69 = var57.string_ü_2;
                     var73 = new Object[]{null, null, true};
                     var73[1] = var19;
                     var73[0] = var69;
                     var57.method_002(new Object[]{var11, var32.method_001(var73)});
                  } catch (RuntimeException var37) {
                     throw method_008(var37);
                  }

                  while (true) {
                     try {
                        var10000 = var26;
                        if (var2 > 0L) {
                           if (var26 == null) {
                              return var31;
                           }

                           var10000 = var26;
                        }

                        if (var10000 != null) {
                           break;
                        }
                     } catch (RuntimeException var44) {
                        throw method_008(var44);
                     }

                     if (var2 >= 0L) {
                        break label164;
                     }
                  }
               }
            }

            var60 = var6.list_ö_2;
         }

         try {
            var66 = var26;
         } catch (RuntimeException var36) {
            throw method_008(var36);
         }
      }

      label142: {
         label265: {
            try {
               if (var66 == null) {
                  break label142;
               }

               if (var60 == null) {
                  break label265;
               }
            } catch (RuntimeException var43) {
               throw method_008(var43);
            }

            label135:
            for (ù var58 : var6.list_ö_2) {
               try {
                  String var70 = var58.string_ü_2;
                  var73 = new Object[]{null, null, false};
                  var73[1] = var19;
                  var73[0] = var70;
                  var58.method_002(new Object[]{var11, var32.method_001(var73)});
               } catch (RuntimeException var35) {
                  throw method_008(var35);
               }

               while (true) {
                  try {
                     var10000 = var26;
                     if (var2 > 0L) {
                        if (var26 == null) {
                           return var31;
                        }

                        var10000 = var26;
                     }

                     if (var10000 != null) {
                        break;
                     }
                  } catch (RuntimeException var42) {
                     throw method_008(var42);
                  }

                  if (var2 > 0L) {
                     break label135;
                  }
               }
            }
         }

         var60 = var5.list_å_2;
      }

      var60.add(var31);
      return var31;
   }

   public static rip.breeze.inject.é invoke_5(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      rip.breeze.inject.é var5 = (rip.breeze.inject.é)var0[3];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 132084159799387L;
      return method_006(new Object[]{var5, new ô(var1, var2), var6});
   }

   public static rip.breeze.inject.é invoke_6(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      ô var2 = (ô)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 52202396392621L;
      long var7 = var3 ^ 63289678342490L;
      long var9 = var3 ^ 59683182009763L;
      rip.breeze.inject.é var11 = new rip.breeze.inject.é(var5);
      rip.breeze.inject.ì var12 = new rip.breeze.inject.ì(var11, var2, var7);
      var1.method_002(new Object[]{var9, var12});
      return var11;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static void invoke_7(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      String var10000 = ô.method_016();
      Field[] var5 = rip.breeze.inject.é.class.getDeclaredFields();
      int var6 = var5.length;
      String var7 = var10000;
      int var8 = 0;

      while (var8 < var6) {
         Field var9 = var5[var8];

         label89: {
            String var10001;
            label80: {
               label79: {
                  label78: {
                     try {
                        var18 = Modifier.isStatic(var9.getModifiers());
                        var10001 = var7;
                        if (var3 <= 0L) {
                           break label80;
                        }

                        if (var7 == null) {
                           break label79;
                        }

                        if (!var18) {
                           break label78;
                        }
                     } catch (Throwable var16) {
                        throw method_008(var16);
                     }

                     if (var3 > 0L) {
                        break label89;
                     }
                  }

                  var18 = Modifier.isFinal(var9.getModifiers());
               }

               try {
                  var10001 = var7;
               } catch (Throwable var13) {
                  throw method_008(var13);
               }
            }

            label91: {
               label64: {
                  label63: {
                     try {
                        if (var10001 == null) {
                           break label64;
                        }

                        if (!var18) {
                           break label63;
                        }
                     } catch (Throwable var15) {
                        throw method_008(var15);
                     }

                     if (var3 > 0L) {
                        break label89;
                     }
                  }

                  try {
                     if (var3 <= 0L) {
                        break label89;
                     }

                     var19 = var9;
                     if (var7 == null) {
                        break label91;
                     }

                     var18 = Modifier.isPublic(var9.getModifiers());
                  } catch (Throwable var14) {
                     throw method_008(var14);
                  }
               }

               if (!var18) {
                  break label89;
               }

               try {
                  var19 = var9;
               } catch (Throwable var12) {
                  throw new RuntimeException(CONST_B_2, var12);
               }
            }

            try {
               var19.set(var1, var9.get(var2));
            } catch (Throwable var11) {
               throw new RuntimeException(CONST_B_2, var11);
            }
         }

         var8++;
         if (var7 == null) {
            break;
         }
      }
   }

   static {
      long var0 = 69955158621916L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("XÇ»ÎX£yI*c\u001e\u001f\u001e\u0094\r\u0088\u0088u\u009e¼³\u0097$\u009b¼o4\u0080pº+Z".getBytes("ISO-8859-1"));
      String var5 = method_009(var4).intern();
      byte var10001 = -1;
      CONST_B_2 = var5;
   }

   private static Throwable invoke_8(Throwable var0) {
      return var0;
   }

   private static String invoke_9(byte[] var0) {
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
}
