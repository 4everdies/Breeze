package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public class StringDecryptHelper3 {
   public final long fieldLong_a;
   public final String string_b;
   public final boolean fieldBool_c;
   public final int fieldInt_d;
   public final long fieldLong_e;
   public final long fieldLong_f;
   public final String string_g;
   public final boolean fieldBool_h;
   public final Color color_i;
   public final Color color_j;
   public final Color color_k;
   public final Color color_l;
   public final Color color_m;
   public final Color color_n;
   public final boolean fieldBool_o;
   public final float fieldFloat_p;
   public final float fieldFloat_q;
   public final String string_r;
   private static final String[] CONST_T;
   private static final String[] CONST_U;
   private static final Map CONST_V = new HashMap(13);
   private static final long[] CONST_W;
   private static final Long[] CONST_X;
   private static final Map CONST_Y;

   public StringDecryptHelper3(UserTheme var1) {
      long var2 = 44465775808375L;
      long var4 = var2 ^ 70501799103115L;
      long var10001 = var2 ^ 65824779579440L;
      int var6 = (int)((var2 ^ 65824779579440L) >>> 48);
      int var7 = (int)((var2 ^ 65824779579440L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 108187004187626L;
      long var11 = var2 ^ 31907636703192L;
      long var13 = var2 ^ 1842967640108L;
      long var15 = var2 ^ 99548189722372L;
      super();
      int[] var10000 = RenderUtil19_x.values();
      this.fieldLong_a = var1.getDataBuilder2_2("id").getLong(var4);
      this.string_b = var1.getDataBuilder2_2("name").buildString((char)var6, var7, (short)var8);
      int[] var17 = var10000;
      this.fieldBool_c = var1.isValid("bookmarked")
         && var1.getDataBuilder2_2("bookmarked").isValid_5(var13);
      this.fieldInt_d = var1.getDataBuilder2_2("downloads").getValue(var9);
      this.fieldLong_e = var1.getDataBuilder2_2("created").getLong(var4)
         * -9172160665868673659L;
      this.fieldLong_f = var1.getDataBuilder2_2("last-updated").getLong(var4)
         * -4107931280218380918L;
      this.string_g = var1.isValid("share-code")
            && !var1.getDataBuilder2_2("share-code").isValid_4()
         ? var1.getDataBuilder2_2("share-code").buildString((char)var6, var7, (short)var8)
         : "XXXXXXXXXX";
      this.fieldBool_h = var1.isValid("private")
         && var1.getDataBuilder2_2("private").isValid_5(var13);
      UserTheme var18 = var1.getUserTheme("preview");
      this.color_i = this.getColor(var18.getDataBuilder2_2("accent").getBreezeIterable(var11));
      this.color_j = this.getColor(var18.getDataBuilder2_2("text-primary").getBreezeIterable(var11));
      this.color_k = this.getColor(var18.getDataBuilder2_2("text-secondary").getBreezeIterable(var11));
      this.color_l = this.getColor(var18.getDataBuilder2_2("layer-zero").getBreezeIterable(var11));
      this.color_m = this.getColor(var18.getDataBuilder2_2("layer-one").getBreezeIterable(var11));
      this.color_n = this.getColor(var18.getDataBuilder2_2("border").getBreezeIterable(var11));
      this.fieldBool_o = var18.getDataBuilder2_2("square-design").isValid_5(var13);
      this.fieldFloat_p = var18.getDataBuilder2_2("corner-radius").getFloat(var15);
      this.fieldFloat_q = var18.getDataBuilder2_2("border-thickness").getFloat(var15);
      if (var18.isValid("background-img")) {
         this.string_r = var18.getDataBuilder2_2("background-img").buildString((char)var6, var7, (short)var8);
         if (var17 == null) {
            return;
         }

         LicenseState.toggle(LicenseState.isValid_2());
      }

      this.string_r = null;
   }

   private Color getColor(BreezeIterable var1) {
      long var2 = 8080572376825L;
      long var4 = var2 ^ 84991607626340L;
      new Random();
      int var7 = var1.getDataBuilder2(0).getValue(var4);
      int var8 = var1.getDataBuilder2(1).getValue(var4);
      int var9 = var1.getDataBuilder2(2).getValue(var4);
      int var10 = var1.getDataBuilder2(3).getValue(var4);
      return new Color(var7, var8, var9, var10);
   }

   static {
      long var0 = 115563189348287L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[24];
      int var5 = 0;
      String var6 = "iÓ\u0012=®¢Ñ<ëØÞ\"s> ¢Ý<M\"\u0081¶\u001dâ»\u0097m/ê\u0006\u0005ø åV`;S¯V\u0098Õi©·MÛº\u009cR\u0005H\u007f\u008f¼µ\u008b\u000bÖ>/<W7² \u0014\tÚ¯\u0018ËÕx3\u001efBZ+û[Õß8h×¸Å N±J\u001d÷}óA\u0010<\u0098\u0083 g\rGUôA)usz\u0010\u0080\u0010]ëNTJ\u0006*²p(ytý7\u001e©\u0010\u000e\u0095£YKöAéÂ¤92ðþ8,\u0010+Êß9T\nÖwzÿÑ WÇDt\u0018\u0012é6\u000bð\u0091>\u0001\u0000wÏ\u009b÷@ä9\u0085\u0016\u0018\u0091º\nZ; \u000f]\u008c\u0087\u007f¤\u009b&9\u0084]\u0096Ö\u0081ZÌðH×®Ø\u009aØ½^Êu\n\u0015A>À §\u0083íÓ¹Ó¯$µ{\u0017\r( tÌÝ\u0096|µ\u0000ª|Ûã±ÓOmcvï\u0018G\\N?1a`\r,Ú¬\u00990\u009e\u0097\u0098³ÃUR+õ\u001c,\u0018óäÔ\u0095 \u0094®S\f§r\fvn\u0015ÛRX\t\u001c\u0014\u0096¾\u00ad oh\\$½\u009b§ Á\u008cSN\u000e \r¥V¤PK\u0013\u000f\u00ad~ùe\u009d©\u0007Æ/L\u0018\rR\u0001Â\u0090c«rxc¶&ù·(\u0088\u0000£TÑ9\u0082Ìð\u0010±ÿ\r<ê:H|Íù¢³\u0086{î¸\u0010VL<\u009fTb\u0097 \u0082Ûç\u00029\u0090c©\u0010í\u0089\u0012ß³u^ÓÛ\u0087ÛÞ ¦j` \u0091g\u008e\u0014'q{]ô\n»F\u001dÖ\bâ4\u0090\u0016O\u0085e\u008dxPn\u009f\u0080\u0005´.b\u0018\u000bÓÎ*`ÂzÀÃý<u'a§#²\u0081\u008c9Èªf\u0006\u0010±f\u009d\u0084á³jR¦\fox\u0092\u009bðJ\u0018\u008bD\u0016\u0099¢Lk\u009bÜ\u0080R7\u009f*þ®7Àq¢\u009aT\u0007\u0002 £7ÑmÇ\u008dÐ\nÜ\u009déc,\u0094öü\u0083Ò\u0081\b\u007f\u000eïáÃ#\u0097ÆÇGì\u00ad";
      int var7 = "iÓ\u0012=®¢Ñ<ëØÞ\"s> ¢Ý<M\"\u0081¶\u001dâ»\u0097m/ê\u0006\u0005ø åV`;S¯V\u0098Õi©·MÛº\u009cR\u0005H\u007f\u008f¼µ\u008b\u000bÖ>/<W7² \u0014\tÚ¯\u0018ËÕx3\u001efBZ+û[Õß8h×¸Å N±J\u001d÷}óA\u0010<\u0098\u0083 g\rGUôA)usz\u0010\u0080\u0010]ëNTJ\u0006*²p(ytý7\u001e©\u0010\u000e\u0095£YKöAéÂ¤92ðþ8,\u0010+Êß9T\nÖwzÿÑ WÇDt\u0018\u0012é6\u000bð\u0091>\u0001\u0000wÏ\u009b÷@ä9\u0085\u0016\u0018\u0091º\nZ; \u000f]\u008c\u0087\u007f¤\u009b&9\u0084]\u0096Ö\u0081ZÌðH×®Ø\u009aØ½^Êu\n\u0015A>À §\u0083íÓ¹Ó¯$µ{\u0017\r( tÌÝ\u0096|µ\u0000ª|Ûã±ÓOmcvï\u0018G\\N?1a`\r,Ú¬\u00990\u009e\u0097\u0098³ÃUR+õ\u001c,\u0018óäÔ\u0095 \u0094®S\f§r\fvn\u0015ÛRX\t\u001c\u0014\u0096¾\u00ad oh\\$½\u009b§ Á\u008cSN\u000e \r¥V¤PK\u0013\u000f\u00ad~ùe\u009d©\u0007Æ/L\u0018\rR\u0001Â\u0090c«rxc¶&ù·(\u0088\u0000£TÑ9\u0082Ìð\u0010±ÿ\r<ê:H|Íù¢³\u0086{î¸\u0010VL<\u009fTb\u0097 \u0082Ûç\u00029\u0090c©\u0010í\u0089\u0012ß³u^ÓÛ\u0087ÛÞ ¦j` \u0091g\u008e\u0014'q{]ô\n»F\u001dÖ\bâ4\u0090\u0016O\u0085e\u008dxPn\u009f\u0080\u0005´.b\u0018\u000bÓÎ*`ÂzÀÃý<u'a§#²\u0081\u008c9Èªf\u0006\u0010±f\u009d\u0084á³jR¦\fox\u0092\u009bðJ\u0018\u008bD\u0016\u0099¢Lk\u009bÜ\u0080R7\u009f*þ®7Àq¢\u009aT\u0007\u0002 £7ÑmÇ\u008dÐ\nÜ\u009déc,\u0094öü\u0083Ò\u0081\b\u007f\u000eïáÃ#\u0097ÆÇGì\u00ad"
         .length();
      char var8 = ' ';
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
                     CONST_T = var4;
                     CONST_U = new String[24];
                     CONST_Y = new HashMap(13);
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
                     String var15 = "6\u00912É®q\f\u0084¢\u0084îý²l¤©";
                     int var16 = "6\u00912É®q\f\u0084¢\u0084îý²l¤©".length();
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

                     CONST_W = var13;
                     CONST_X = new Long[2];
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

                  var6 = "Å\u0014\u0001¯\u0007Q\u001dó\u0098â\u0090|\u0089¹\u0016\u0092\u0003\u0084\u008aÕÐ±\u0013£ä.\n\u0081\u009cB£ÿ wø¬u@+õÃ\u0098\u00adg\u001eJÃ\u0096`vÌª\u0003^U#\u0003XaâÍòåèì";
                  var7 = "Å\u0014\u0001¯\u0007Q\u001dó\u0098â\u0090|\u0089¹\u0016\u0092\u0003\u0084\u008aÕÐ±\u0013£ä.\n\u0081\u009cB£ÿ wø¬u@+õÃ\u0098\u00adg\u001eJÃ\u0096`vÌª\u0003^U#\u0003XaâÍòåèì"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5654;
      if (CONST_U[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_V.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_V.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/Y", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_T[var3].getBytes("ISO-8859-1");
         CONST_U[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_U[var3];
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
         throw new RuntimeException("rip/breeze/Y" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7945;
      if (CONST_X[var3] == null) {
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
         long var5 = CONST_W[var3];
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
         Object[] var9 = (Object[])CONST_Y.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/Y", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_X[var3] = var14;
      }

      return CONST_X[var3];
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
         throw new RuntimeException("rip/breeze/Y" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
