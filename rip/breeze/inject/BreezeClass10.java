package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class BreezeClass10 extends BreezeClass11 {
   private final Util139 dataBuilder4_ý;
   private final int int_ü;
   private final int int_û;
   private final int int_ú;
   private int int_ù;
   private final ð ð_ø;
   private int int_ö;
   private final ð ð_õ;
   private int int_ô;
   private final ð ð_ó;
   private int int_ò;
   private final ð ð_ñ;
   private int int_ð;
   private final ð ð_ï;
   private int int_î;
   private final ð ð_í;
   private int int_ì;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   BreezeClass10(long var1, Util139 var3, int var4, int var5, int var6) {
      var1 = 24920406406056L ^ var1;
      long var7 = var1 ^ 108682647019973L;
      super(var7, 589824);
      this.dataBuilder4_ý = var3;
      this.int_ü = var4;
      this.int_û = var5;
      this.int_ú = var6;
      this.ð_ø = new ð();
      this.ð_õ = new ð();
      this.ð_ó = new ð();
      this.ð_ñ = new ð();
      this.ð_ï = new ð();
      this.ð_í = new ð();
   }

   public void invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 27524775242231L;
      this.int_ì = this.dataBuilder4_ý.getBreezeClass3_2(new Object[]{var2, var5}).int_è;
   }

   public void calculate(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 32463093925091L;
      long var7 = var3 ^ 103761742529211L;
      ð var10000 = this.ð_í;
      int var10001 = this.dataBuilder4_ý.getBreezeClass3_18(new Object[]{var2, var7}).int_è;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      var10000.method_004(var10004);
      this.int_î++;
   }

   public void calculate_9(Object[] var1) {
      long var7;
      int var15;
      ð var10000;
      label18: {
         String var2 = (String)var1[0];
         int var3 = (Integer)var1[1];
         long var4 = (Long)var1[2];
         String var6 = (String)var1[3];
         var7 = var4 ^ 32142121860992L;
         long var9 = var4 ^ 82005233838349L;
         long var11 = var4 ^ 109467590819132L;
         int var13 = Util140.getValue_2();
         var10000 = this.ð_ø;
         Util139 var10001 = this.dataBuilder4_ý;
         String var10002 = var2;
         if (var13 != 0) {
            var15 = this.dataBuilder4_ý.getBreezeClass3_17(new Object[]{var9, var2}).int_è;
            Object[] var10004 = new Object[]{null, var7};
            var10004[0] = var15;
            var10000 = var10000.method_004(var10004);
            var15 = var3;
            if (var4 <= 0L) {
               break label18;
            }

            var10004 = new Object[]{null, var7};
            var10004[0] = var3;
            var10000 = var10000.method_004(var10004);
            if (var6 == null) {
               var15 = 0;
               break label18;
            }

            var10001 = this.dataBuilder4_ý;
            var10002 = var6;
         }

         var15 = var10001.calculate_6(new Object[]{var11, var10002});
      }

      Object[] var17 = new Object[]{null, var7};
      var17[0] = var15;
      var10000.method_004(var17);
      this.int_ù++;
   }

   public void calculate_3(Object... var1) {
      long var4;
      label39: {
         String var2 = (String)var1[0];
         int var3 = (Integer)var1[1];
         var4 = (Long)var1[2];
         String[] var6 = (String[])var1[3];
         long var7 = var4 ^ 51516882402430L;
         long var9 = var4 ^ 119856357259814L;
         long var11 = var4 ^ 133540371884787L;
         int var10000 = Util140.getValue_2();
         ð var10001 = this.ð_õ;
         int var10002 = this.dataBuilder4_ý.getBreezeClass3_18(new Object[]{var2, var9}).int_è;
         Object[] var10005 = new Object[]{null, var7};
         var10005[0] = var10002;
         var10001 = var10001.method_004(var10005);
         var10005 = new Object[]{null, var7};
         var10005[0] = var3;
         var10001.method_004(var10005);
         int var13 = var10000;
         String[] var18 = var6;
         if (var13 != 0) {
            if (var6 == null) {
               ð var19 = this.ð_õ;
               Object[] var10004 = new Object[]{null, var7};
               var10004[0] = 0;
               var19.method_004(var10004);
               if (var4 < 0L) {
                  return;
               }

               if (var13 != 0) {
                  break label39;
               }
            }

            ð var20 = this.ð_õ;
            int var24 = var6.length;
            Object[] var26 = new Object[]{null, var7};
            var26[0] = var24;
            var20.method_004(var26);
            var18 = var6;
         }

         String[] var14 = var18;
         int var15 = var14.length;
         int var16 = 0;

         while (var16 < var15) {
            String var17 = var14[var16];
            ð var21 = this.ð_õ;
            int var25 = this.dataBuilder4_ý.getBreezeClass3_17(new Object[]{var11, var17}).int_è;
            Object[] var27 = new Object[]{null, var7};
            var27[0] = var25;
            var21.method_004(var27);
            var16++;
            var10000 = var13;
            if (var4 > 0L) {
               if (var13 == 0) {
                  return;
               }

               var10000 = var13;
            }

            if (var10000 == 0) {
               break;
            }
         }
      }

      this.int_ö++;
      if (var4 >= 0L) {
      }
   }

   public void calculate_4(Object... var1) {
      long var2;
      label39: {
         var2 = (Long)var1[0];
         String var4 = (String)var1[1];
         int var5 = (Integer)var1[2];
         String[] var6 = (String[])var1[3];
         long var7 = var2 ^ 115943133310686L;
         long var9 = var2 ^ 46916404963462L;
         long var11 = var2 ^ 69122705733715L;
         int var10000 = Util140.getValue_2();
         ð var10001 = this.ð_ó;
         int var10002 = this.dataBuilder4_ý.getBreezeClass3_18(new Object[]{var4, var9}).int_è;
         Object[] var10005 = new Object[]{null, var7};
         var10005[0] = var10002;
         var10001 = var10001.method_004(var10005);
         var10005 = new Object[]{null, var7};
         var10005[0] = var5;
         var10001.method_004(var10005);
         int var13 = var10000;
         String[] var18 = var6;
         if (var13 != 0) {
            if (var6 == null) {
               ð var19 = this.ð_ó;
               Object[] var10004 = new Object[]{null, var7};
               var10004[0] = 0;
               var19.method_004(var10004);
               if (var2 < 0L) {
                  return;
               }

               if (var13 != 0) {
                  break label39;
               }
            }

            ð var20 = this.ð_ó;
            int var24 = var6.length;
            Object[] var26 = new Object[]{null, var7};
            var26[0] = var24;
            var20.method_004(var26);
            var18 = var6;
         }

         String[] var14 = var18;
         int var15 = var14.length;
         int var16 = 0;

         while (var16 < var15) {
            String var17 = var14[var16];
            ð var21 = this.ð_ó;
            int var25 = this.dataBuilder4_ý.getBreezeClass3_17(new Object[]{var11, var17}).int_è;
            Object[] var27 = new Object[]{null, var7};
            var27[0] = var25;
            var21.method_004(var27);
            var16++;
            var10000 = var13;
            if (var2 >= 0L) {
               if (var13 == 0) {
                  return;
               }

               var10000 = var13;
            }

            if (var10000 == 0) {
               break;
            }
         }
      }

      this.int_ô++;
      if (var2 > 0L) {
      }
   }

   public void calculate_5(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      int var5 = (Integer)var1[3];
      long var6 = (long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48;
      long var8 = var6 ^ 138435750103471L;
      long var10 = var6 ^ 25721488010176L;
      ð var10000 = this.ð_ñ;
      int var10001 = this.dataBuilder4_ý.getBreezeClass3_2(new Object[]{var4, var8}).int_è;
      Object[] var10004 = new Object[]{null, var10};
      var10004[0] = var10001;
      var10000.method_004(var10004);
      this.int_ò++;
   }

   public void calculate_6(Object... var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String[] var5 = (String[])var1[2];
      long var6 = var2 ^ 44241862396176L;
      long var8 = var2 ^ 73323848166271L;
      ð var10000 = this.ð_ï;
      int var10001 = this.dataBuilder4_ý.getBreezeClass3_2(new Object[]{var4, var6}).int_è;
      Object[] var10004 = new Object[]{null, var8};
      var10004[0] = var10001;
      var10000.method_004(var10004);
      var10000 = this.ð_ï;
      var10001 = var5.length;
      var10004 = new Object[]{null, var8};
      var10004[0] = var10001;
      var10000.method_004(var10004);
      String[] var10 = var5;
      int var16 = Util140.getValue_2();
      int var11 = var10.length;
      int var12 = 0;
      int var13 = var16;

      while (true) {
         if (var12 < var11) {
            String var14 = var10[var12];
            var10000 = this.ð_ï;
            var10001 = this.dataBuilder4_ý.getBreezeClass3_2(new Object[]{var14, var6}).int_è;
            var10004 = new Object[]{null, var8};
            var10004[0] = var10001;
            var10000.method_004(var10004);
            var12++;
            int var18 = var13;
            if (var2 >= 0L) {
               if (var13 == 0) {
                  break;
               }

               var18 = var13;
            }

            if (var18 != 0) {
               continue;
            }
         }

         this.int_ð++;
         if (var2 >= 0L) {
         }
         break;
      }
   }

   public void invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   int calculate_7(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 24920406406056L ^ var2;
      int var4 = Util140.getValue();
      int var10001 = this.int_î;
      if (var4 == 0) {
         var10001 = this.int_î > 0 ? 1 : 0;
      }

      int var10000 = 1 + var10001;
      var10001 = this.int_ì;
      if (var4 == 0) {
         var10001 = this.int_ì > 0 ? 1 : 0;
      }

      return var10000 + var10001;
   }

   int calculate_8(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 24920406406056L ^ var2;
      long var4 = var2 ^ 31223294314931L;
      int var10000 = Util140.getValue_2();
      this.dataBuilder4_ý.calculate_6(new Object[]{var4, buildString_2(32376, 6714399252047656880L ^ var2)});
      int var6 = var10000;
      int var7 = 22 + this.ð_ø.int_þ_2 + this.ð_õ.int_þ_2 + this.ð_ó.int_þ_2 + this.ð_ñ.int_þ_2 + this.ð_ï.int_þ_2;
      var10000 = this.int_î;
      if (var6 != 0) {
         if (this.int_î > 0) {
            this.dataBuilder4_ý.calculate_6(new Object[]{var4, buildString_2(8792, 5210220185758903186L ^ var2)});
            var7 += 8 + this.ð_í.int_þ_2;
         }

         var10000 = this.int_ì;
      }

      if (var6 != 0) {
         if (var10000 > 0) {
            this.dataBuilder4_ý.calculate_6(new Object[]{var4, buildString_2(18311, 2103477493628292681L ^ var2)});
            var7 += 8;
         }

         var10000 = var7;
      }

      return var10000;
   }

   void calculate_9(Object[] var1) {
      ð var2 = (ð)var1[0];
      long var3 = (Long)var1[1];
      var3 = 24920406406056L ^ var3;
      long var5 = var3 ^ 5868771650481L;
      long var7 = var3 ^ 79344987421326L;
      long var9 = var3 ^ 136213496375565L;
      long var11 = var3 ^ 1017214298129L;
      int var10000 = Util140.getValue();
      int var13 = 16 + this.ð_ø.int_þ_2 + this.ð_õ.int_þ_2 + this.ð_ó.int_þ_2 + this.ð_ñ.int_þ_2 + this.ð_ï.int_þ_2;
      int var10002 = this.dataBuilder4_ý.calculate_6(new Object[]{var9, buildString_2(28225, 5010364043839604534L ^ var3)});
      Object[] var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      ð var10001 = var2.method_004(var10005);
      var10005 = new Object[]{null, var7};
      var10005[0] = var13;
      var10001 = var10001.method_007(var10005);
      var10002 = this.int_ü;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      var10002 = this.int_û;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      var10002 = this.int_ú;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      var10002 = this.int_ù;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      byte[] var45 = this.ð_ø.arr_ÿ_2;
      int var10004 = this.ð_ø.int_þ_2;
      Object[] var10007 = new Object[]{null, null, null, var11};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = var45;
      var10001 = var10001.method_012(var10007);
      var10002 = this.int_ö;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      byte[] var47 = this.ð_õ.arr_ÿ_2;
      var10004 = this.ð_õ.int_þ_2;
      var10007 = new Object[]{null, null, null, var11};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = var47;
      var10001 = var10001.method_012(var10007);
      var10002 = this.int_ô;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      byte[] var49 = this.ð_ó.arr_ÿ_2;
      var10004 = this.ð_ó.int_þ_2;
      var10007 = new Object[]{null, null, null, var11};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = var49;
      var10001 = var10001.method_012(var10007);
      var10002 = this.int_ò;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      byte[] var51 = this.ð_ñ.arr_ÿ_2;
      var10004 = this.ð_ñ.int_þ_2;
      var10007 = new Object[]{null, null, null, var11};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = var51;
      var10001 = var10001.method_012(var10007);
      var10002 = this.int_ð;
      var10005 = new Object[]{null, var5};
      var10005[0] = var10002;
      var10001 = var10001.method_004(var10005);
      byte[] var53 = this.ð_ï.arr_ÿ_2;
      var10004 = this.ð_ï.int_þ_2;
      var10007 = new Object[]{null, null, null, var11};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = var53;
      var10001.method_012(var10007);
      int var14 = var10000;
      var10000 = this.int_î;
      if (var14 == 0) {
         if (this.int_î > 0) {
            int var35 = this.dataBuilder4_ý.calculate_6(new Object[]{var9, buildString_2(8051, 2982978940765566466L ^ var3)});
            Object[] var58 = new Object[]{null, var5};
            var58[0] = var35;
            ð var17 = var2.method_004(var58);
            int var36 = 2 + this.ð_í.int_þ_2;
            Object[] var59 = new Object[]{null, var7};
            var59[0] = var36;
            ð var18 = var17.method_007(var59);
            int var37 = this.int_î;
            Object[] var60 = new Object[]{null, var5};
            var60[0] = var37;
            ð var19 = var18.method_004(var60);
            byte[] var38 = this.ð_í.arr_ÿ_2;
            int var10003 = this.ð_í.int_þ_2;
            Object[] var10006 = new Object[]{null, null, null, var11};
            var10006[2] = var10003;
            var10006[1] = 0;
            var10006[0] = var38;
            var19.method_012(var10006);
         }

         var10000 = this.int_ì;
      }

      if (var10000 > 0) {
         int var39 = this.dataBuilder4_ý.calculate_6(new Object[]{var9, buildString_2(8744, 6153177700808674141L ^ var3)});
         Object[] var61 = new Object[]{null, var5};
         var61[0] = var39;
         ð var20 = var2.method_004(var61);
         Object[] var62 = new Object[]{null, var7};
         var62[0] = 2;
         ð var21 = var20.method_007(var62);
         int var40 = this.int_ì;
         Object[] var63 = new Object[]{null, var5};
         var63[0] = var40;
         var21.method_004(var63);
      }
   }

   static {
      long var0 = 76007249857980L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = " XêTk'${÷µÈ\u0004\u001f\u0005:B\u0081&~\nK_£¸ \u0087Êò\u0011\b\u001btY×éÕEg|çMÞá»©ÿ\u0005a\u0004]ý\u009bë\u0003\u0012hl\u0010_\u0013£´5<ó7.ß_Dö2\u0002Ý\u0010e\u0080d\u00935ÃUðE\rlu\u009b \u0092ô";
      int var7 = " XêTk'${÷µÈ\u0004\u001f\u0005:B\u0081&~\nK_£¸ \u0087Êò\u0011\b\u001btY×éÕEg|çMÞá»©ÿ\u0005a\u0004]ý\u009bë\u0003\u0012hl\u0010_\u0013£´5<ó7.ß_Dö2\u0002Ý\u0010e\u0080d\u00935ÃUðE\rlu\u009b \u0092ô"
         .length();
      char var8 = '\u0018';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = buildString(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "û\u0082\u0014L\u0013äÇkþ-c©³ÙgI0\u007fëãõ#º¦cpÄP\u0004Ë\u0004\u0003 \u00858\u0095|sì\u0082ÈÐÎ\u001aÀ\bÇ\u008bÒ[A\u008bÉX\u009cö\u009e\u00175»À\u008b\u001b¦\u0007";
            var7 = "û\u0082\u0014L\u0013äÇkþ-c©³ÙgI0\u007fëãõ#º¦cpÄP\u0004Ë\u0004\u0003 \u00858\u0095|sì\u0082ÈÐÎ\u001aÀ\bÇ\u008bÒ[A\u008bÉX\u009cö\u009e\u00175»À\u008b\u001b¦\u0007"
               .length();
            var8 = ' ';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = buildString(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_D = var4;
                  CONST_E = new String[6];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String buildString(byte[] var0) {
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19585;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/m", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
   }
}
