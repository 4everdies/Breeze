package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil11_x extends UIPanel {
   private final String string_h;
   private final int fieldInt_i;
   private String[] arr_j;
   private static int[] arr_k;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil11_x(String var1, int var2) {
      long var3 = 139654658740110L;
      super();
      this.string_h = var1 == null ? "" : var1;
      this.fieldInt_i = var2;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      int var6 = RenderUtil9.getValue();
      if (this.arr_j == null) {
         this.clamp();
      }

      float var7 = this.b;

      for (String var11 : this.arr_j) {
         BreezeContext.iRenderer_b
            .drawText(
               var11,
               this.a,
               var7,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               this.fieldInt_i
            );
         var7 += this.fieldInt_i + 2;
         if (var6 == 0) {
            break;
         }
      }
   }

   public void clamp() {
      long var1 = 62740630596709L;
      int var10000 = RenderUtil9.getValue_2();
      EnumType32 var3 = EnumType32.SOURCE_SANS;
      int var4 = var10000;
      int var5 = this.fieldInt_i + 2;
      int var6 = Math.max(1, (int)Math.floor(this.d / var5));
      List var7 = getList(this.string_h, this.fieldInt_i, this.c);
      if (var7.size() > var6) {
         ArrayList var8 = new ArrayList(var7.subList(0, var6));
         String var9 = (String)var8.get(var6 - 1);
         var8.set(var6 - 1, this.buildString(var9, var3));
         this.arr_j = var8.toArray(new String[0]);
         if (var4 == 0) {
            return;
         }
      }

      this.arr_j = var7.toArray(new String[0]);
   }

   public float getFloat() {
      return calculateFloat(this.string_h, this.fieldInt_i, this.c);
   }

   public static float calculateFloat(String var0, int var1, float var2) {
      long var3 = 77178123242814L;
      if (var0 != null && !var0.isEmpty()) {
         int var5 = var1 + 2;
         int var6 = getList(var0, var1, var2).size();
         return (float)var6 * var5;
      } else {
         return 0.0F;
      }
   }

   private static void calculate_2(String var0, List<String> var1, EnumType32 var2, int var3, float var4) {
      long var5 = 66518413019286L;
      int var10000 = RenderUtil9.getValue();
      int var7 = 0;
      int var8 = var10000;

      while (var7 < var0.length()) {
         int var9 = var7 + 1;
         int var10 = var0.length();
         int var11 = var9;

         while (var9 <= var10) {
            label28: {
               int var12 = var9 + var10 >>> 1;
               String var13 = var0.substring(var7, var12);
               float var14 = BreezeContext.iRenderer_b.measureText(var13, var2, var3);
               if (var14 <= var4) {
                  var11 = var12;
                  var9 = var12 + 1;
                  if (var8 != 0) {
                     break label28;
                  }
               }

               var10 = var12 - 1;
            }

            if (var8 == 0) {
               break;
            }
         }

         if (var11 == var7) {
            var11 = var7 + 1;
         }

         var1.add(var0.substring(var7, var11));
         var7 = var11;
         if (var8 == 0) {
            break;
         }
      }
   }

   private String buildString(String var1, EnumType32 var2) {
      long var3 = 106704260297089L;
      int var10000 = RenderUtil9.getValue_2();
      String var5 = "...";
      float var6 = BreezeContext.iRenderer_b.measureText("...", var2, this.fieldInt_i);
      int var7 = var10000;
      if (BreezeContext.iRenderer_b.measureText(var1, var2, this.fieldInt_i) <= this.c
         && BreezeContext.iRenderer_b.measureText(var1 + "...", var2, this.fieldInt_i) <= this.c) {
         return var1 + "...";
      }

      int var8 = var1.length();

      while (var8 > 0) {
         String var9 = var1.substring(0, var8);
         float var10 = BreezeContext.iRenderer_b.measureText(var9, var2, this.fieldInt_i);
         if (var10 + var6 <= this.c) {
            return var9 + "...";
         }

         var8--;
         if (var7 != 0) {
            break;
         }
      }

      return var6 <= this.c ? "..." : ".";
   }

   private static List<String> getList(String var0, int var1, float var2) {
      long var3 = 119571072519911L;
      int var10000 = RenderUtil9.getValue_2();
      EnumType32 var5 = EnumType32.SOURCE_SANS;
      int var6 = var10000;
      ArrayList var7 = new ArrayList();
      StringBuilder var8 = new StringBuilder();
      String[] var9 = var0.split("\n");
      int var10 = 0;

      while (var10 < var9.length) {
         String var21 = var9[var10];
         short var10002 = 26678;
         long var10003 = 4405314829248941189L ^ var3;
         String var11 = var21.replace("\t", "    ");
         int var12 = 0;

         while (var12 < var11.length() && var11.charAt(var12) == ' ') {
            var12++;
            if (var6 != 0) {
               break;
            }
         }

         String var13 = var11.substring(0, var12);
         String var14 = var11.substring(var12);
         String[] var15 = var14.isEmpty() ? new String[]{var13} : var14.split(" ");
         if (!var13.isEmpty()) {
            var15[0] = var13 + var15[0];
         }

         int var16 = 0;

         while (var16 < var15.length) {
            label80: {
               String var17 = var15[var16];
               float var18 = BreezeContext.iRenderer_b.measureText(var17, var5, var1);
               if (var8.length() == 0) {
                  if (var18 <= var2) {
                     var8.append(var17);
                     if (var6 == 0) {
                        break label80;
                     }
                  }

                  calculate_2(var17, var7, var5, var1, var2);
                  var8.setLength(0);
                  if (var6 == 0) {
                     break label80;
                  }
               }

               String var19 = var8 + " " + var17;
               float var20 = BreezeContext.iRenderer_b.measureText(var19, var5, var1);
               if (var20 <= var2) {
                  var8.setLength(0);
                  var8.append(var19);
                  if (var6 == 0) {
                     break label80;
                  }
               }

               if (var18 <= var2) {
                  var7.add(var8.toString());
                  var8.setLength(0);
                  var8.append(var17);
                  if (var6 == 0) {
                     break label80;
                  }
               }

               var7.add(var8.toString());
               var8.setLength(0);
               calculate_2(var17, var7, var5, var1, var2);
            }

            var16++;
            if (var6 != 0) {
               break;
            }
         }

         if (var8.length() > 0) {
            var7.add(var8.toString());
            var8.setLength(0);
         }

         var10++;
         if (var6 != 0) {
            break;
         }
      }

      return var7;
   }

   public static void initialize(int[] var0) {
      arr_k = var0;
   }

   public static int[] decrypt() {
      return arr_k;
   }

   static {
      int[] var10000 = new int[4];
      initialize(var10000);
      long var0 = 34613866440814L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "N{&\u0095\u0083+¦«R\u001e©\u008có\u0096ø\u001e\u0010¤Õý\u008b\u0013û¦fº\u0018¶õºæùp";
      int var7 = "N{&\u0095\u0083+¦«R\u001e©\u008có\u0096ø\u001e\u0010¤Õý\u008b\u0013û¦fº\u0018¶õºæùp".length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_M = var4;
                     CONST_N = new String[4];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "F\u008cDöRã»Ý\u0015º\u0087!5\u0082BR(W\u009dñ\u0017ÒT >S\u0082)\t L¶D¿¦\u0000\u0018¯Î³ï+2jí\u0083\u0085f\u0000\u0010çÍÜh\u008biQ";
                  var7 = "F\u008cDöRã»Ý\u0015º\u0087!5\u0082BR(W\u009dñ\u0017ÒT >S\u0082)\t L¶D¿¦\u0000\u0018¯Î³ï+2jí\u0083\u0085f\u0000\u0010çÍÜh\u008biQ"
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10838;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_O.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eg", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/eg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
