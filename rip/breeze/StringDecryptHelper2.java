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

public class StringDecryptHelper2 {
   public final long fieldLong_a;
   public final String string_b;
   public final String string_c;
   public float fieldFloat_d;
   public int fieldInt_e;
   public final int fieldInt_f;
   public final long fieldLong_g;
   public final long fieldLong_h;
   public final String string_i;
   public final String string_j;
   public final boolean fieldBool_k;
   public final boolean fieldBool_l;
   public final boolean fieldBool_m;
   public final RenderUtil20_x enum5Val_n;
   public final String string_o;
   private static int fieldInt_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);
   private static final long[] CONST_U;
   private static final Long[] CONST_V;
   private static final Map CONST_W;

   public StringDecryptHelper2(UserTheme var1) {
      long var2 = 77570174989230L;
      long var4 = var2 ^ 51551197279826L;
      long var10001 = var2 ^ 93605840981225L;
      int var6 = (int)((var2 ^ 93605840981225L) >>> 48);
      int var7 = (int)((var2 ^ 93605840981225L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 13853274935091L;
      long var11 = var2 ^ 57679632448477L;
      long var13 = var2 ^ 122395043185909L;
      super();
      this.string_b = var1.getDataBuilder2_2("name").buildString((char)var6, var7, (short)var8);
      this.string_c = var1.getDataBuilder2_2("description").buildString((char)var6, var7, (short)var8);
      this.fieldInt_f = var1.getDataBuilder2_2("downloads").getValue(var9);
      this.fieldLong_g = Long.parseLong(var1.getDataBuilder2_2("last-updated").buildString((char)var6, var7, (short)var8))
         * 1000L;
      RenderUtil19_x.values();
      this.fieldLong_h = Long.parseLong(var1.getDataBuilder2_2("created").buildString((char)var6, var7, (short)var8))
         * 1000L;
      this.string_i = var1.getDataBuilder2_2("breeze-version").buildString((char)var6, var7, (short)var8);
      this.fieldFloat_d = var1.getDataBuilder2_2("rating").getFloat(var11);
      this.fieldInt_e = var1.getDataBuilder2_2("rating-count").getValue(var9);
      this.fieldLong_a = var1.getDataBuilder2_2("id").getLong(var4);
      this.string_j = var1.isValid("share-code")
            && !var1.getDataBuilder2_2("share-code").isValid_4()
         ? var1.getDataBuilder2_2("share-code").buildString((char)var6, var7, (short)var8)
         : "XXXXXXXXXX";
      this.fieldBool_k = var1.isValid("bookmarked")
         && var1.getDataBuilder2_2("bookmarked").isValid_5(var13);
      this.fieldBool_l = var1.isValid("private")
         && var1.getDataBuilder2_2("private").isValid_5(var13);
      this.fieldBool_m = var1.isValid("closed-source")
         && var1.getDataBuilder2_2("closed-source").isValid_5(var13);
      this.enum5Val_n = var1.isValid("approval-status")
            && !var1.getDataBuilder2_2("approval-status").isValid_4()
         ? RenderUtil20_x.getEnum5Val(var1.getDataBuilder2_2("approval-status").buildString((char)var6, var7, (short)var8))
         : RenderUtil20_x.APPROVED;
      this.string_o = var1.isValid("denial-comment")
            && !var1.getDataBuilder2_2("denial-comment").isValid_4()
         ? var1.getDataBuilder2_2("denial-comment").buildString((char)var6, var7, (short)var8)
         : null;
      if (LicenseState.checkCondition()) {
         RenderUtil19_x.initialize(new int[1]);
      }
   }

   public static void initialize(int var0) {
      fieldInt_p = var0;
   }

   public static int getValue() {
      return fieldInt_p;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 77 : 0;
   }

   static {
      initialize(47);
      long var0 = 48977258673926L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[22];
      int var5 = 0;
      String var6 = "\u00116\u0006\u008f\u00ad\u009bQ=f¶viI¤\u0019\u0092 \u001a¾¶9Ê\u001f¥\u00036Y2ÔÚ´Iå\\\u009b¶\u009dFi\u000fÕç@ªþi#¾\u009f ¬§0\u0005VYìO\u000e\u0002\u0099ÓE'Ü\u0019\u009b¿öÂ \u0086m«R¯\u0000yr\u0018éS\u0010F'QtVf3Ê§\u008b\u0086\u000bÿ\u008c.W è7·^º\u001e×æÒ¶3¡\fþ&\u0005¤C*\u000e\u0019õ\u0080Ä^·\u0015\u00adæ#>?\u0018a\u0001\b\u0098\u0015\u0090æÛË¹\u008d¼Ð*á\u0097eÐØ¶\u0081Å§>\u0010ÒØÉWÇÇ\u008e\u0007\u0015\u0098\u000eéC\u0084\u0004ó ±¡\u0088¸\u009cÜþé*¸1¥Å\u008c]\u008b¹³uì£¶á\"hÔ×HsIj\u0087\u0010Ð°'Ó\u0094\u00159¿«¶d·¿\u008cÛ½ ¯îû\u0006\u009cì»\u008e!ÍX4\u0019\u0012\u0096\u0096VM\u0015-\u0085é Ò\u0086\u0084{\u009d}õÌ7 Õ\u0019\u009dS\u0010øó'\u0018ÚK³áøg\u001dâl\u0018º®G&\u0004\u000e\u0084¤rÍr¶\u0092\u0018\u0010\u0012Ù1À:·¸pm$â\nÃû\u0019m¬\u00137ðÛR{\u0018AF³:ûjPá¸ \u0092ªÑ³Øÿ&\u0017*\u009b\u0000Ì]± ©õ\u0094\u0098Í\\¿lÖ_Ú\u0094~\u001cv½\u001c\u0017\u0011îÌ\u0094{§\u0007E RÎPÛÉ\u0018ÜIc\u000e\u000bF\u0098ô\u008aê\u0015bÝ\u009aõIû\u000f\u0090ô-JÕñ\u0010l0½#ÖÄ\u001b\u0090ÿx3\u0094\u0080Ý\u0091¬\u0018OIªuz,\u0094$ý\u0085\u0087RíEÔM\n¦mIËg\u009bõ ½ÿ\u009dàì´\u0019\u0012¸4(5Î\u0091\u0089ÿ^\u0005\u0005\u0087´\u001a<lË\u0090ì.\f\\¾¥ \u009b\u0088ôM¶ÄÂ\u009b\u00ade±cÃÉÊ\u0006\u008a_d\u008d\u009dKÿê0\u007f¡\u0013å\u0012Ò´ þÈ>\u0018¥Y\u0007B?Í¦ \u000f\u0014\u001cÃx\u009b¾\f\u0000Kú\u001f<õv\u008e\u0017ò 0";
      int var7 = "\u00116\u0006\u008f\u00ad\u009bQ=f¶viI¤\u0019\u0092 \u001a¾¶9Ê\u001f¥\u00036Y2ÔÚ´Iå\\\u009b¶\u009dFi\u000fÕç@ªþi#¾\u009f ¬§0\u0005VYìO\u000e\u0002\u0099ÓE'Ü\u0019\u009b¿öÂ \u0086m«R¯\u0000yr\u0018éS\u0010F'QtVf3Ê§\u008b\u0086\u000bÿ\u008c.W è7·^º\u001e×æÒ¶3¡\fþ&\u0005¤C*\u000e\u0019õ\u0080Ä^·\u0015\u00adæ#>?\u0018a\u0001\b\u0098\u0015\u0090æÛË¹\u008d¼Ð*á\u0097eÐØ¶\u0081Å§>\u0010ÒØÉWÇÇ\u008e\u0007\u0015\u0098\u000eéC\u0084\u0004ó ±¡\u0088¸\u009cÜþé*¸1¥Å\u008c]\u008b¹³uì£¶á\"hÔ×HsIj\u0087\u0010Ð°'Ó\u0094\u00159¿«¶d·¿\u008cÛ½ ¯îû\u0006\u009cì»\u008e!ÍX4\u0019\u0012\u0096\u0096VM\u0015-\u0085é Ò\u0086\u0084{\u009d}õÌ7 Õ\u0019\u009dS\u0010øó'\u0018ÚK³áøg\u001dâl\u0018º®G&\u0004\u000e\u0084¤rÍr¶\u0092\u0018\u0010\u0012Ù1À:·¸pm$â\nÃû\u0019m¬\u00137ðÛR{\u0018AF³:ûjPá¸ \u0092ªÑ³Øÿ&\u0017*\u009b\u0000Ì]± ©õ\u0094\u0098Í\\¿lÖ_Ú\u0094~\u001cv½\u001c\u0017\u0011îÌ\u0094{§\u0007E RÎPÛÉ\u0018ÜIc\u000e\u000bF\u0098ô\u008aê\u0015bÝ\u009aõIû\u000f\u0090ô-JÕñ\u0010l0½#ÖÄ\u001b\u0090ÿx3\u0094\u0080Ý\u0091¬\u0018OIªuz,\u0094$ý\u0085\u0087RíEÔM\n¦mIËg\u009bõ ½ÿ\u009dàì´\u0019\u0012¸4(5Î\u0091\u0089ÿ^\u0005\u0005\u0087´\u001a<lË\u0090ì.\f\\¾¥ \u009b\u0088ôM¶ÄÂ\u009b\u00ade±cÃÉÊ\u0006\u008a_d\u008d\u009dKÿê0\u007f¡\u0013å\u0012Ò´ þÈ>\u0018¥Y\u0007B?Í¦ \u000f\u0014\u001cÃx\u009b¾\f\u0000Kú\u001f<õv\u008e\u0017ò 0"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_R = var4;
                     CONST_S = new String[22];
                     CONST_W = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "\u000b¥\u0088ã«·©|\u007fü\r<Ö\u009dF°";
                     int var16 = "\u000b¥\u0088ã«·©|\u007fü\r<Ö\u009dF°".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_U = var13;
                     CONST_V = new Long[2];
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = ")¾¯v\u0088\u008da\to\u000b\u000bê\u0005÷ÅÁ\u007f84\u0012qßPK\u0010\u001dÞ\u001aµ}\u007f\u0015oÅ\u0082uz×ÔO\u0099";
                  var7 = ")¾¯v\u0088\u008da\to\u000b\u000bê\u0005÷ÅÁ\u007f84\u0012qßPK\u0010\u001dÞ\u001aµ}\u007f\u0015oÅ\u0082uz×ÔO\u0099".length();
                  var8 = 24;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22526;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/X", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/X" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27790;
      if (CONST_V[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_U[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_W.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/X", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_V[var3] = var14;
      }

      return CONST_V[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/X" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
