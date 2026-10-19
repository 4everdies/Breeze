package rip.breeze;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class BreezeTask implements Runnable {
   final File file_a;
   final MicrosoftAuth microsoftAuth_b;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   BreezeTask(MicrosoftAuth var1, File var2) {
      this.microsoftAuth_b = var1;
      this.file_a = var2;
   }

   @Override
   public void run() {
      long var1 = 75672817917778L;

      try {
         as var3 = as.a(this.file_a);
         if (!var3.a) {
            MicrosoftAuth.update_4(this.microsoftAuth_b, "Cookie file has no Microsoft session cookies (export from login.live.com or login.microsoftonline.com)");
            return;
         }

         MicrosoftAuth.getString_3(this.microsoftAuth_b, MicrosoftAuth.getString_4(this.microsoftAuth_b, 16));
         MicrosoftAuth.update_5(this.microsoftAuth_b);
         String var4 = MicrosoftAuth.getString_5(this.microsoftAuth_b);
         String var5 = MicrosoftAuth.getString_6(var3.b);
         String var6 = MicrosoftAuth.getString_7(this.microsoftAuth_b, var4, var5);
         if (var6 == null) {
            MicrosoftAuth.update_4(this.microsoftAuth_b, "Cookie sign-in failed — session may be expired or account needs re-login");
            return;
         }

         Util11 var7 = MicrosoftAuth.getBreezeUtil114_3(this.microsoftAuth_b, var6, MicrosoftAuth.getString_8(this.microsoftAuth_b));
         Util13 var8 = MicrosoftAuth.getBreezeUtil116_2(this.microsoftAuth_b, var7.string_a);
         Util14 var9 = MicrosoftAuth.getBreezeUtil117_2(this.microsoftAuth_b, var8.string_a);
         Util10 var10 = MicrosoftAuth.getBreezeUtil113_2(this.microsoftAuth_b, var9.string_a, var8.string_b);
         Util12 var11 = this.microsoftAuth_b.getBreezeUtil115(var10.string_a);
         if (var11 == null) {
            MicrosoftAuth.update_4(this.microsoftAuth_b, "Could not resolve Minecraft profile from cookie login");
            return;
         }

         StringDecryptHelper4 var12 = new StringDecryptHelper4();
         var12.setString_a(var11.string_a);
         var12.setString_b(var11.string_b);
         var12.setString_c(var7.string_a);
         var12.setString_d(var7.string_b);
         var12.setLong_e(MicrosoftAuth.getLong_2(var7.fieldLong_c));
         var12.setString_f(var8.string_a);
         var12.setString_g(var8.string_b);
         var12.setLong_h(var8.fieldLong_c);
         var12.setString_i(var9.string_a);
         var12.setLong_j(var9.fieldLong_b);
         var12.setString_k(var10.string_a);
         var12.setLong_l(MicrosoftAuth.getLong_2(var10.fieldLong_b));
         var12.setBool_o(true);
         var12.setLong_n(System.currentTimeMillis());
         MicrosoftAuth.update_6(this.microsoftAuth_b, var12, true);
      } catch (Exception var13) {
         MicrosoftAuth.update_4(this.microsoftAuth_b, "Cookie login failed:" + var13.getMessage());
      }
   }

   static {
      long var0 = 49269214479998L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "\u007f8¨d¯0¼QCIn¾k4\u008d£\u0088þÖ³:\u0011\u0098N\u0088/õ\u001e\"m\u000f\u0007\u008d=H`ä Þ\u0002Kr\u0087ZÈíøwN\ngí¿Þ\u008eÁN\u000fø\t\u009e\u000bw\u001eT\u0007#\u0002¼&\u0007P ¶},®SrÛð²w!=^\u0015¸\u0015Ë£Ü\u0019\u0015Ï¿(\u0006\n|æ\u0094PS7¤\u0083Ê\u0098\u0097/ù\u008d-s´«\u0017kì\u0012íÞ\u0086\u0012æúE\u008a\u0007{\u001fÚòÊ¹s.Áã³!{Ý\u0081\u0087qr\u0010ø^\r´;2_\u0086\u0093\u008b,(\u0013q\u001b»fÓ¼ÄÝ¸ù¤\u0007\u008b;TJ\u001eÊ\u0000J¢dñ%d·Îo®\u0093\f\u009e8\u000b6Uw\u0094½";
      int var7 = "\u007f8¨d¯0¼QCIn¾k4\u008d£\u0088þÖ³:\u0011\u0098N\u0088/õ\u001e\"m\u000f\u0007\u008d=H`ä Þ\u0002Kr\u0087ZÈíøwN\ngí¿Þ\u008eÁN\u000fø\t\u009e\u000bw\u001eT\u0007#\u0002¼&\u0007P ¶},®SrÛð²w!=^\u0015¸\u0015Ë£Ü\u0019\u0015Ï¿(\u0006\n|æ\u0094PS7¤\u0083Ê\u0098\u0097/ù\u008d-s´«\u0017kì\u0012íÞ\u0086\u0012æúE\u008a\u0007{\u001fÚòÊ¹s.Áã³!{Ý\u0081\u0087qr\u0010ø^\r´;2_\u0086\u0093\u008b,(\u0013q\u001b»fÓ¼ÄÝ¸ù¤\u0007\u008b;TJ\u001eÊ\u0000J¢dñ%d·Îo®\u0093\f\u009e8\u000b6Uw\u0094½"
         .length();
      char var8 = 160;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_D = var4;
                     CONST_E = new String[4];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = ".¿Á)2,J\u0097BZ¯\u0098!\u009d\u0080\u0096Á_e¹\u000bG\u0019}Z¹:£\u008cÍn©a3!:ÚM¢\u008cs«ý¬V\u008b\f¡ÒpjØÿ<ÈÏ®¿o\u0096öÃ\u0087\u0083\u001eËL0_\u0087\u009eGbê\nÀ\u009aù[2Î´\u0094\bêH\u0097Fh½·á\u0012*\u0085¤`íÎ\u0000Ö«íùº¬AznO3\u009c«\n \f×X(gÀ\u0005F>\u0002ÑÂÓ`»A\"~\u008aÙÚë¼ôÂà±\u0082ÒÓQÐ%©6÷à\u0017¬ðn\u0014¼ã\u009b1\u0002mÆ\u0094ü{\u0006\u008djr\u009dD\"~\"É\u009eû#78£þ\u008f\b\u009b\u00ad\u009c@\u00ad\u008a°\u0091í±\u0014)Jó¡¥°[µ\u000b; f \"0µi{!õÐ¡I\u0011\u0086bý.";
                  var7 = ".¿Á)2,J\u0097BZ¯\u0098!\u009d\u0080\u0096Á_e¹\u000bG\u0019}Z¹:£\u008cÍn©a3!:ÚM¢\u008cs«ý¬V\u008b\f¡ÒpjØÿ<ÈÏ®¿o\u0096öÃ\u0087\u0083\u001eËL0_\u0087\u009eGbê\nÀ\u009aù[2Î´\u0094\bêH\u0097Fh½·á\u0012*\u0085¤`íÎ\u0000Ö«íùº¬AznO3\u009c«\n \f×X(gÀ\u0005F>\u0002ÑÂÓ`»A\"~\u008aÙÚë¼ôÂà±\u0082ÒÓQÐ%©6÷à\u0017¬ðn\u0014¼ã\u009b1\u0002mÆ\u0094ü{\u0006\u008djr\u009dD\"~\"É\u009eû#78£þ\u008f\b\u009b\u00ad\u009c@\u00ad\u008a°\u0091í±\u0014)Jó¡¥°[µ\u000b; f \"0µi{!õÐ¡I\u0011\u0086bý."
                     .length();
                  var8 = 128;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9623;
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
            throw new RuntimeException("rip/breeze/an", var10);
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

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
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
         throw new RuntimeException("rip/breeze/an" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
