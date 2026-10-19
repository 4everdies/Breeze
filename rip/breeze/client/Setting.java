package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

class Setting implements IBreezeInterface, IMarker3 {
   static final Setting CONST_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public boolean checkCondition(long var1, String var3) {
      boolean var10000 = var3.startsWith(buildString_2(12042, 6393313478519544386L ^ var1));
      if (var1 >= 0L) {
         if (!var10000) {
            var10000 = var3.startsWith(buildString_2(21373, 4784152909732095543L ^ var1));
            if (var1 < 0L) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public Object getObject(String var1, AtomicInteger var2, long var3, Util112 var5) {
      var1 = var1.substring(var2.get());
      Boolean var6 = var1.startsWith(buildString_2(4642, 3261378879553380100L ^ var3)) ? Boolean.TRUE : Boolean.FALSE;
      int var7 = var6 == Boolean.TRUE ? 4 : 5;
      var2.addAndGet(var7 - 1);
      return var6;
   }

   private Setting() {
   }

   @Override
   public String toString() {
      long var1 = 31258230415272L;
      return buildString_2(26662, 8670081232860782674L ^ var1);
   }

   static {
      long var0 = 117291349771515L;
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
      String var6 = "\u0019\u00174\u007f¯×É!;&\u0089\u0003¤ð\u0013º\u0010ÐpxÃOI|7\u0005þð\u0013¶ò\u008e)";
      int var7 = "\u0019\u00174\u007f¯×É!;&\u0089\u0003¤ð\u0013º\u0010ÐpxÃOI|7\u0005þð\u0013¶ò\u008e)".length();
      char var8 = 16;
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
                     CONST_C = var4;
                     CONST_D = new String[4];
                     CONST_A = new Setting();
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

                  var6 = "\u008e¶\nÙ\u0016+\u008eÅÕ«\f¹öX,÷\u0010\u008d:°\u0094F+uË».ÿeG¿¾ö";
                  var7 = "\u008e¶\nÙ\u0016+\u008eÅÕ«\f¹öX,÷\u0010\u008d:°\u0094F+uË».ÿeG¿¾ö".length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6111;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/cp", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }
}
