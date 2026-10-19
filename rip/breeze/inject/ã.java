package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class ã extends ä {
   private final Util139 dataBuilder4_ý_2;
   private final int int_ü_2;
   private final int int_û_2;
   private final int int_ú_2;
   private int int_ù_2;
   private int int_ø_2;
   private û û_ö_2;
   private û û_õ_2;
   private û û_ô_2;
   private û û_ó_2;
   private õ õ_ò_2;
   private static final String[] CONST_F_2;
   private static final String[] CONST_G_2;
   private static final Map CONST_H_2 = new HashMap(13);

   ã(Util139 var1, long var2, int var4, String var5, String var6, String var7, Object var8) {
      var2 = encKey_b_2 ^ var2;
      long var9 = var2 ^ 98470982315954L;
      long var11 = var2 ^ 108650490813166L;
      long var13 = var2 ^ 49881746406211L;
      super(589824, var9);
      int var10000 = Util140.getValue_2();
      this.dataBuilder4_ý_2 = var1;
      this.int_ü_2 = var4;
      this.int_û_2 = var1.calculate_6(new Object[]{var11, var5});
      int var15 = var10000;
      this.int_ú_2 = var1.calculate_6(new Object[]{var11, var6});
      var10000 = (int)var7;
      if (var15 != 0) {
         if (var7 != null) {
            this.int_ù_2 = var1.calculate_6(new Object[]{var11, var7});
         }

         var10000 = (int)var8;
      }

      if (var10000 != null) {
         this.int_ø_2 = var1.getBreezeClass3(new Object[]{var8, var13}).int_è;
      }
   }

   @Override
   public ü invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      long var6 = var3 ^ 121500948400830L;
      if (var5) {
         Util139 var8 = this.dataBuilder4_ý_2;
         û var9 = this.û_ö_2;
         return this.û_ö_2 = û.method_001(new Object[]{var6, var8, var2, var9});
      } else {
         Util139 var10002 = this.dataBuilder4_ý_2;
         û var10004 = this.û_õ_2;
         return this.û_õ_2 = û.method_001(new Object[]{var6, var10002, var2, var10004});
      }
   }

   @Override
   public ü invoke_2(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var3 ^ 108840617339233L;
      if (var7) {
         û var10 = this.û_ô_2;
         Object[] var11 = new Object[]{null, this.dataBuilder4_ý_2, var2, var5, var6, var10};
         var11[0] = var8;
         return this.û_ô_2 = û.method_002(var11);
      } else {
         û var10006 = this.û_ó_2;
         Object[] var10008 = new Object[]{null, this.dataBuilder4_ý_2, var2, var5, var6, var10006};
         var10008[0] = var8;
         return this.û_ó_2 = û.method_002(var10008);
      }
   }

   @Override
   public void invoke_3(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      var2.õ_ý_2 = this.õ_ò_2;
      this.õ_ò_2 = var2;
   }

   @Override
   public void invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   int invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_b_2 ^ var2;
      long var4 = var2 ^ 35678790734642L;
      long var6 = var2 ^ 133887891904780L;
      long var8 = var2 ^ 113975734931677L;
      long var10 = var2 ^ 41810423071801L;
      int var10000 = Util140.getValue_2();
      int var12 = 8;
      int var13 = var10000;
      var10000 = this.int_ø_2;
      if (var13 != 0) {
         if (this.int_ø_2 != 0) {
            this.dataBuilder4_ý_2.calculate_6(new Object[]{var10, method_005(18116, 6754502619419693928L ^ var2)});
            var12 += 8;
         }

         Util139 var10001 = this.dataBuilder4_ý_2;
         int var10003 = this.int_ü_2;
         Object[] var10006 = new Object[]{null, null, null, this.int_ù_2};
         var10006[2] = var10003;
         var10006[1] = var4;
         var10006[0] = var10001;
         var12 += õ.method_013(var10006);
         û var10002 = this.û_ö_2;
         û var18 = this.û_õ_2;
         û var10004 = this.û_ô_2;
         û var10005 = this.û_ó_2;
         var10000 = var12 + û.method_004(new Object[]{var8, var10002, var18, var10004, var10005});
      }

      if (var13 != 0) {
         var12 = var10000;
         if (this.õ_ò_2 != null) {
            var12 += this.õ_ò_2.method_011(new Object[]{this.dataBuilder4_ý_2, var6});
         }

         var10000 = var12;
      }

      return var10000;
   }

   void invoke_2(Object[] var1) {
      ð var2 = (ð)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 110248622392759L;
      long var7 = var3 ^ 127366364377450L;
      long var9 = var3 ^ 45332813517960L;
      long var11 = var3 ^ 127851241010793L;
      long var13 = var3 ^ 16407500341031L;
      long var15 = var3 ^ 114036074312939L;
      long var17 = var3 ^ 29624585520907L;
      int var19 = Util140.getValue();
      int var10000 = this.dataBuilder4_ý_2.getValue(new Object[0]);
      if (var19 == 0) {
         var10000 = var10000 < 49 ? 1 : 0;
      }

      int var20 = var10000;
      var10000 = var20;
      if (var19 == 0) {
         var10000 = var20 != 0 ? 4096 : 0;
      }

      int var21 = var10000;
      int var10001 = this.int_ü_2 & ~var21;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      ð var25 = var2.method_004(var10004);
      var10001 = this.int_û_2;
      var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      ð var26 = var25.method_004(var10004);
      var10001 = this.int_ú_2;
      var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      var26.method_004(var10004);
      int var22 = 0;
      var10000 = this.int_ø_2;
      var10001 = var19;
      if (var3 > 0L) {
         if (var19 == 0) {
            if (this.int_ø_2 != 0) {
               var22++;
            }

            var10000 = this.int_ü_2 & 4096;
         }

         var10001 = var19;
      }

      label143: {
         label142:
         if (var10001 == 0) {
            if (var10000 != 0) {
               var10000 = var20;
               var10001 = var19;
               if (var3 < 0L) {
                  break label143;
               }

               if (var19 != 0) {
                  break label142;
               }

               if (var20 != 0) {
                  var22++;
               }
            }

            var10000 = this.int_ù_2;
         }

         var10001 = var19;
      }

      label151: {
         if (var10001 == 0) {
            if (var10000 != 0) {
               var22++;
            }

            var28 = this;
            if (var19 != 0) {
               break label151;
            }

            var10000 = this.int_ü_2 & 131072;
         }

         if (var10000 != 0) {
            var22++;
         }

         var28 = this;
      }

      û var29 = var28.û_ö_2;
      var10001 = var19;
      if (var3 >= 0L) {
         if (var19 == 0) {
            if (var28.û_ö_2 != null) {
               var22++;
            }

            var29 = this.û_õ_2;
         }

         var10001 = var19;
      }

      if (var3 >= 0L) {
         if (var10001 == 0) {
            if (var29 != null) {
               var22++;
            }

            var29 = this.û_ô_2;
         }

         var10001 = var19;
      }

      label122: {
         label153: {
            if (var10001 == 0) {
               if (var29 != null) {
                  var22++;
               }

               var30 = this;
               var10001 = var19;
               if (var3 <= 0L) {
                  break label122;
               }

               if (var19 != 0) {
                  break label153;
               }

               var29 = this.û_ó_2;
            }

            if (var29 != null) {
               var22++;
            }

            var30 = this;
         }

         var10001 = var19;
      }

      if (var3 > 0L) {
         if (var10001 == 0) {
            if (var30.õ_ò_2 != null) {
               var22 += this.õ_ò_2.method_010(new Object[]{var11});
            }

            var10004 = new Object[]{null, var5};
            var10004[0] = var22;
            var2.method_004(var10004);
            var30 = this;
         }

         var10001 = var19;
      }

      if (var10001 == 0) {
         if (var30.int_ø_2 != 0) {
            var10001 = this.dataBuilder4_ý_2.calculate_6(new Object[]{var17, method_005(20331, 7860621336382183924L ^ var3)});
            var10004 = new Object[]{null, var5};
            var10004[0] = var10001;
            ð var31 = var2.method_004(var10004);
            var10004 = new Object[]{null, var9};
            var10004[0] = 2;
            ð var32 = var31.method_007(var10004);
            var10001 = this.int_ø_2;
            var10004 = new Object[]{null, var5};
            var10004[0] = var10001;
            var32.method_004(var10004);
         }

         Util139 var33 = this.dataBuilder4_ý_2;
         var10001 = this.int_ü_2;
         int var10002 = this.int_ù_2;
         Object[] var10006 = new Object[]{null, null, null, var2, var13};
         var10006[2] = var10002;
         var10006[1] = var10001;
         var10006[0] = var33;
         õ.method_016(var10006);
         û var10005 = this.û_ó_2;
         û.method_006(new Object[]{this.dataBuilder4_ý_2, this.û_ö_2, this.û_õ_2, this.û_ô_2, var7, var10005, var2});
         var30 = this;
      }

      õ var34 = var30.õ_ò_2;
      if (var19 == 0) {
         if (var30.õ_ò_2 == null) {
            return;
         }

         var34 = this.õ_ò_2;
      }

      var34.method_014(new Object[]{this.dataBuilder4_ý_2, var2, var15});
   }

   @Override
   final void invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      ñ var4 = (ñ)var1[1];
      var2 = encKey_b_2 ^ var2;
      long var5 = var2 ^ 10270855113275L;
      var4.processNullable(new Object[]{this.õ_ò_2, var5});
   }

   static {
      long var0 = 83610537189900L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "g·a¥Ù;\u0001p\u001af\u0015\u0011rÃ¦»W¼\"\u0094£\u0017\u0081h\u0018\r¨ªªj\u0012\u009d¸¤&dD>¢\u0014ÂßáÁäy5¿\u0093";
      int var7 = "g·a¥Ù;\u0001p\u001af\u0015\u0011rÃ¦»W¼\"\u0094£\u0017\u0081h\u0018\r¨ªªj\u0012\u009d¸¤&dD>¢\u0014ÂßáÁäy5¿\u0093".length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_004(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_F_2 = var4;
            CONST_G_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_4(byte[] var0) {
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

   private static String invoke_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23917;
      if (CONST_G_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ã", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F_2[var3].getBytes("ISO-8859-1");
         CONST_G_2[var3] = method_004(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G_2[var3];
   }
}
