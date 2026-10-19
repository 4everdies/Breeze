package rip.breeze;

import java.awt.Color;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ImageUtil11 {
   public String string_a;
   public ArrayList<String> arrayList_b;
   public int fieldInt_c;
   public boolean fieldBool_d;
   public final Color color_e;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public ImageUtil11(String var1, Color var2) {
      long var3 = 84520777406923L;
      super();
      this.arrayList_b = new ArrayList<>();
      this.fieldBool_d = false;
      ZoneId var5 = ZoneId.systemDefault();
      Instant var6 = Instant.now();
      ZonedDateTime var7 = var6.atZone(var5);
      DateTimeFormatter var8 = DateTimeFormatter.ofPattern("[HH:mm:ss:SSS]");
      this.string_a = RenderUtil18_x.ACCENT
         + "["
         + RenderUtil18_x.TERTIARY
         + var8.format(var7)
         + RenderUtil18_x.ACCENT
         + "]"
         + RenderUtil18_x.RESET
         + var1;
      this.color_e = var2;
   }

   public ImageUtil11(String var1) {
      long var2 = 47427715488363L;
      this(var1, BreezeContext.authSession_c.getColor("default.text-secondary"));
   }

   public ImageUtil11(Exception var1) {
      this(var1.getMessage(), Color.RED);
   }

   public void calculate(int var1) {
      this.fieldBool_d = true;
      this.arrayList_b.clear();

      for (String var5 : this.string_a.split("\n")) {
         if (!(BreezeContext.iRenderer_b.measureText(var5, EnumType32.SOURCE_CODE_PRO, 18.0F) > var1)) {
            this.arrayList_b.add(var5);
         } else {
            String[] var6 = var5.split(" ");
            StringBuilder var7 = new StringBuilder();

            for (Serializable var11 : var6) {
               if (BreezeContext.iRenderer_b.measureText(var7 + var11, EnumType32.SOURCE_CODE_PRO, 18.0F) > var1) {
                  this.arrayList_b.add(var7.toString());
                  var7 = new StringBuilder();
               }

               var7.append(var11).append(" ");
            }

            this.arrayList_b.add(var7.toString());
         }
      }

      this.fieldInt_c = this.arrayList_b.size() * 20;
   }

   static {
      long var0 = 8392912944031L;
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
      String var6 = "+U\b&ÃÜÄT\u0098³~¯tà&Ä[\u0084\u0016vÂ:c\u0099(n<õÐPä\u0010\n\u000fÛ³HP\u001f¤Ñ+\u0093³à©¹¸ãO\u0081\b\u001aÎ\u0014\u0082h\u008b2Âs\u0013ß`Ñ\u0010k\u0088úãy\u0004\b\u001fQTÖ\u0015\u009dëÖn";
      int var7 = "+U\b&ÃÜÄT\u0098³~¯tà&Ä[\u0084\u0016vÂ:c\u0099(n<õÐPä\u0010\n\u000fÛ³HP\u001f¤Ñ+\u0093³à©¹¸ãO\u0081\b\u001aÎ\u0014\u0082h\u008b2Âs\u0013ß`Ñ\u0010k\u0088úãy\u0004\b\u001fQTÖ\u0015\u009dëÖn"
         .length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_G = var4;
            CONST_H = new String[3];
            return;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9111;
      if (CONST_H[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_I.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aD", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_G[var3].getBytes("ISO-8859-1");
         CONST_H[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/aD" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
