package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.inject.BreezeClass12;

public class µ implements â {
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   @Override
   public List invoke_1(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 8356124185124L;
      long var9 = var4 ^ 100218346529821L;
      ArrayList var11 = new ArrayList();
      int var10000 = BreezeClass7.getValue_2();
      int var12 = 0;
      rip.breeze.inject.ջ[] var13 = var3.թ_ê.method_010(new Object[]{var9});
      int var14 = var10000;

      for (rip.breeze.inject.ջ var17 : var13) {
         label83: {
            label80: {
               var19 = var17;
               int var10001 = var14;
               if (var4 >= 0L) {
                  if (var14 != 0) {
                     break label80;
                  }

                  var10001 = 0;
               }

               if (var17.method_004(new Object[var10001]) != 183) {
                  break label83;
               }

               var19 = var17;
            }

            rip.breeze.inject.կ var18 = (rip.breeze.inject.կ)var19;
            String var10003 = var18.string_æ_2;
            String var10004 = var18.string_å_2;
            var10000 = this.method_001(new Object[]{var18.string_ç_2, var7, var10003, var10004, var6.target()});
            int var21 = var14;
            if (var4 > 0L) {
               if (var14 == 0) {
                  if (var10000 == 0) {
                     break label83;
                  }

                  var10000 = var6.ordinal();
               }

               var21 = var14;
            }

            label81: {
               if (var4 > 0L) {
                  if (var21 != 0) {
                     break label81;
                  }

                  var21 = -1;
               }

               label82: {
                  if (var4 >= 0L) {
                     if (var10000 == var21) {
                        break label82;
                     }

                     var10000 = var6.ordinal();
                     var21 = var14;
                  }

                  if (var4 >= 0L) {
                     if (var21 != 0) {
                        break label81;
                     }

                     var21 = var12;
                  }

                  if (var10000 != var21) {
                     break label81;
                  }
               }

               var11.add(var17);
            }

            var12++;
         }

         if (var14 != 0) {
            break;
         }
      }

      return var11;
   }

   @Override
   public ý invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      ò var4 = (ò)var1[1];
      Class var5 = (Class)var1[2];
      Map var6 = (Map)var1[3];
      Method var7 = (Method)var1[4];
      ó var8 = (ó)var1[5];
      rip.breeze.inject.é var9 = (rip.breeze.inject.é)var1[6];
      rip.breeze.inject.é var10 = (rip.breeze.inject.é)var1[7];
      long var11 = var2 ^ 113380444803944L;
      int var10000 = BreezeClass7.getValue_2();
      String var13 = (String)var6.get(((String)null));
      int var14 = var10000;
      String var17 = var13;
      if (var14 == 0) {
         if (var13 == null) {
            return null;
         }

         var17 = var13;
      }

      ց var15 = MathUtil3.getՑ(new Object[]{var17, var11});
      if (var15 != null) {
         return ý.MEMBER;
      }

      boolean var18 = var13.startsWith("(");
      int var10001 = var14;
      if (var2 > 0L) {
         if (var14 == 0) {
            if (var18) {
               return ý.DESCRIPTOR;
            }

            var18 = var13.startsWith("L");
         }

         var10001 = var14;
      }

      if (var10001 == 0) {
         if (!var18 || var14 != 0) {
            return ý.CLASS;
         }

         var18 = var13.endsWith(";");
      }

      if (var18) {
         var13 = var13.substring(1, var13.length() - 1);
         var6.put(((String)null), var13);
      }

      return ý.CLASS;
   }

   private boolean check_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      var3 = encKey_a_2 ^ var3;
      long var8 = var3 ^ 33286639799987L;
      long var10 = var3 ^ 17933680857136L;
      long var12 = var3 ^ 87146802456552L;
      long var14 = var3 ^ 74317017270972L;
      int var16 = BreezeClass7.getValue();
      String var10000 = var5;
      if (var16 != 0) {
         boolean var22 = var5.equals(((String)null));
         if (var3 <= 0L) {
            return var22;
         }

         if (!var22) {
            return false;
         }

         var10000 = var7;
      }

      ց var17 = MathUtil3.getՑ(new Object[]{var10000, var8});
      ց var23 = var17;
      if (var16 != 0) {
         if (var17 == null) {
            boolean var24 = var7.startsWith("(");
            int var10001 = var16;
            if (var3 >= 0L) {
               if (var16 != 0) {
                  if (var24) {
                     var10000 = var6;
                     if (var16 != 0) {
                        boolean var26 = var6.equals(var7);
                        if (var3 < 0L) {
                           return var26;
                        }

                        if (var26) {
                           return true;
                        }

                        var10000 = var7;
                     }

                     rip.breeze.inject.MathUtil3 var18 = ջ.method_003(new Object[]{var10, var10000});
                     rip.breeze.inject.MathUtil3[] var19 = ջ.method_004(new Object[]{var7, var14});
                     rip.breeze.inject.MathUtil3[] var20 = ջ.method_004(new Object[]{var6, var14});
                     boolean var27 = var2.equals(var18.buildString_3(new Object[0]));
                     var10001 = var16;
                     if (var3 >= 0L) {
                        if (var16 != 0) {
                           if (!var27) {
                              return false;
                           }

                           var27 = Arrays.equals(var19, var20);
                        }

                        var10001 = var16;
                     }

                     if (var10001 == 0) {
                        return var27;
                     }

                     if (var27) {
                        return true;
                     }

                     return false;
                  }

                  var24 = var7.startsWith("L");
               }

               var10001 = var16;
            }

            if (var10001 != 0) {
               if (var24) {
                  boolean var29 = var7.endsWith(";");
                  if (var16 == 0) {
                     return var29;
                  }

                  if (var29) {
                     var7 = var7.substring(1, var7.length() - 1);
                  }
               }

               var24 = var2.equals(MathUtil3.buildString_2(new Object[]{var7}));
            }

            return var24;
         }

         var23 = var17;
      }

      return var23.method_006(new Object[]{var2, var5, var12, var6});
   }

   static {
      long var0 = 123273420108629L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "·NXI\u0095\u0084Nßä\u0019H(^ã¸\u0091\u0010l\u0080\u001b&\u009cÞ[w\u0089\u001bWØÏ-t\u00ad\u0010yÏÍXè\u0010rú^úü\u001fä[U\u0095";
      int var7 = "·NXI\u0095\u0084Nßä\u0019H(^ã¸\u0091\u0010l\u0080\u001b&\u009cÞ[w\u0089\u001bWØÏ-t\u00ad\u0010yÏÍXè\u0010rú^úü\u001fä[U\u0095".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = method_002(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_2(byte[] var0) {
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

   private static String invoke_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8657;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/µ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_002(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_4(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_003(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_5(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_004".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/µ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
