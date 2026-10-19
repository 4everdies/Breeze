package rip.breeze;

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
import rip.breeze.client.UserTheme;

public class UserInfo {
   public final String string_a;
   public final String string_b;
   public final UserRole userRole_c;
   public final int fieldInt_d;
   public final boolean fieldBool_e;
   public final float fieldFloat_f;
   public final int fieldInt_g;
   public final int fieldInt_h;
   public final long fieldLong_i;
   private static int fieldInt_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);
   private static final long eka_1;

   public UserInfo(String var1, String var2, UserRole var3, int var4) {
      this.string_b = var2;
      this.string_a = var1;
      this.userRole_c = var3;
      this.fieldInt_d = var4;
      this.fieldBool_e = false;
      this.fieldFloat_f = 0.0F;
      this.fieldInt_g = 0;
      this.fieldInt_h = 0;
      this.fieldLong_i = 0L;
   }

   public UserInfo(UserTheme var1) {
      long var2 = 99385137677548L;
      long var4 = var2 ^ 55035235352848L;
      long var10001 = var2 ^ 81145346456491L;
      int var6 = (int)((var2 ^ 81145346456491L) >>> 48);
      int var7 = (int)((var2 ^ 81145346456491L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 18099644561521L;
      long var11 = var2 ^ 44645235739807L;
      int[] var10000 = RenderUtil19_x.values();
      super();
      int[] var13 = var10000;
      this.string_a = var1.getDataBuilder2_2("username").buildString((char)var6, var7, (short)var8);
      this.string_b = var1.isValid("avatar")
         ? var1.getDataBuilder2_2("avatar").buildString((char)var6, var7, (short)var8)
         : null;
      this.userRole_c = UserRole.getUserRole_2(var1.getDataBuilder2_2("role").getValue(var9));
      this.fieldInt_d = var1.getDataBuilder2_2("id").getValue(var9);
      if (var1.isValid("rating")) {
         this.fieldBool_e = true;
         this.fieldFloat_f = var1.getDataBuilder2_2("rating").getFloat(var11);
         this.fieldInt_g = var1.getDataBuilder2_2("rating-count").getValue(var9);
         this.fieldInt_h = var1.getDataBuilder2_2("downloads").getValue(var9);
         this.fieldLong_i = var1.getDataBuilder2_2("created").getLong(var4) * 1000L;
         if (var13 == null) {
            return;
         }
      }

      this.fieldBool_e = false;
      this.fieldFloat_f = 0.0F;
      this.fieldInt_g = 0;
      this.fieldInt_h = 0;
      this.fieldLong_i = 0L;
   }

   public static void initialize(int var0) {
      fieldInt_j = var0;
   }

   public static int getValue() {
      return fieldInt_j;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 83 : 0;
   }

   static {
      long var0 = 22605071600026L;
      initialize(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "+A\u0015· \u008f\u0012ø\u0002Å¨uæ\u0018Ð¾ÈW\u0007\u009bu¹\u009e0\u0010urô&6§MÏH´\u001cd8\u001aþì\u0010SÉ@'É\u008bt;¢\f\u0090±\u000f\u009a\u001eº\u0010\u0081\u0018¶4¢Ð{õ\u0097@p\u0088\u0087©aw\u0010HâªÌ\u007fG&A\u0081\u0087·Þ\u008a\u0017¥¢\u0018¬>\u0097\f\u0086\u00002e\u0004&Yt4ê:@±\u0016ö£·J{\u0094\u00105Á\t\\\u0004nbý{AD\u00193ME\u009d\u0010\u001134ï¦&\u0015Rc\u0015`¼E5Ã\u0017";
      int var7 = "+A\u0015· \u008f\u0012ø\u0002Å¨uæ\u0018Ð¾ÈW\u0007\u009bu¹\u009e0\u0010urô&6§MÏH´\u001cd8\u001aþì\u0010SÉ@'É\u008bt;¢\f\u0090±\u000f\u009a\u001eº\u0010\u0081\u0018¶4¢Ð{õ\u0097@p\u0088\u0087©aw\u0010HâªÌ\u007fG&A\u0081\u0087·Þ\u008a\u0017¥¢\u0018¬>\u0097\f\u0086\u00002e\u0004&Yt4ê:@±\u0016ö£·J{\u0094\u00105Á\t\\\u0004nbý{AD\u00193ME\u009d\u0010\u001134ï¦&\u0015Rc\u0015`¼E5Ã\u0017"
         .length();
      char var8 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_L = var4;
                     CONST_M = new String[10];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -3337500103757729289L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     1000L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "eoÞ\u0018\u0000Úm6k\\ü\u0081CÙÌf¡H;\u001a®óý1ºÖìþ\u0010¾£4\u0010fF\nÀÞa~À%zW2ßÔi\u0093";
                  var7 = "eoÞ\u0018\u0000Úm6k\\ü\u0081CÙÌf¡H;\u001a®óý1ºÖìþ\u0010¾£4\u0010fF\nÀÞa~À%zW2ßÔi\u0093".length();
                  var8 = ' ';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6012;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/Z", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
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
         throw new RuntimeException("rip/breeze/Z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
