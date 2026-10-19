package rip.breeze.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public abstract class PlayerUtil8 {
   private static String string_b;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public boolean isValid() {
      return this instanceof BreezeIterable;
   }

   public boolean isValid_2() {
      return this instanceof UserTheme;
   }

   public boolean isValid_3() {
      return this instanceof Util138;
   }

   public boolean isValid_4() {
      return this instanceof Util40;
   }

   public UserTheme getUserTheme(long var1) {
      var1 = 57052037861173L ^ var1;

      try {
         if (this.isValid_2()) {
            return (UserTheme)this;
         }
      } catch (IllegalStateException var3) {
         throw getIllegalStateException(var3);
      }

      throw new IllegalStateException(buildString_3(24124, 7043517626798061218L ^ var1) + this);
   }

   public BreezeIterable getBreezeIterable(long var1) {
      var1 = 57052037861173L ^ var1;

      try {
         if (this.isValid()) {
            return (BreezeIterable)this;
         }
      } catch (IllegalStateException var3) {
         throw getIllegalStateException(var3);
      }

      throw new IllegalStateException(buildString_3(27866, 7806892385410421720L ^ var1) + this);
   }

   public Util138 getDataBuilder3(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 57052037861173L;

      try {
         if (this.isValid_3()) {
            return (Util138)this;
         }
      } catch (IllegalStateException var6) {
         throw getIllegalStateException(var6);
      }

      throw new IllegalStateException(buildString_3(10751, 4155951581390199700L ^ var4) + this);
   }

   public boolean isValid_5(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   Boolean getBoolean() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public Number getNumber(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public String buildString(char var1, int var2, short var3) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public double getDouble(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public float getFloat(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public long getLong(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public int getValue(long var1) {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   @Override
   public String toString() {
      long var1 = 100602905107663L;
      long var3 = var1 ^ 13618810504041L;
      long var5 = var1 ^ 23455082909526L;

      try {
         java.io.StringWriter var7 = new java.io.StringWriter();
         Util135 var8 = new Util135(var3, var7);
         var8.setBool_h(true);
         Util102.updateCallSiteContext(this, var5, var8);
         return var7.toString();
      } catch (IOException var9) {
         throw new AssertionError(var9);
      }
   }

   public static void initialize(String var0) {
      string_b = var0;
   }

   public static String getString() {
      return string_b;
   }

   static {
      initialize("j80KGb");
      long var0 = 126300220861285L;
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
      String var6 = "&\\§Ö\u0013ÍT -\u00936\u001c\u001cT\u001cö\u008fzÒmÓ.Fu\u0099Üu\u00007þ·\u0005Ë\u008eû\u0098\b~DQ(¯!\u0099\u0082\u009fCyfË\u0093!h\u0004n\u0011\u0085ß£/Ä¼¿<\u0098ö\u001f¨\"\u0094´\u008b\f¸\n\u0093:r*¥H(\u0003k]\u0007s\u008cH¤¾å\u0017èÀ\u0015Ú\u001aG\u0089i½/Zÿ\u0091Ñ@Jp~Ei§sr«\u0080É®Ð\u009e";
      int var7 = "&\\§Ö\u0013ÍT -\u00936\u001c\u001cT\u001cö\u008fzÒmÓ.Fu\u0099Üu\u00007þ·\u0005Ë\u008eû\u0098\b~DQ(¯!\u0099\u0082\u009fCyfË\u0093!h\u0004n\u0011\u0085ß£/Ä¼¿<\u0098ö\u001f¨\"\u0094´\u008b\f¸\n\u0093:r*¥H(\u0003k]\u0007s\u008cH¤¾å\u0017èÀ\u0015Ú\u001aG\u0089i½/Zÿ\u0091Ñ@Jp~Ei§sr«\u0080É®Ð\u009e"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString_2(var10).intern();
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

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20634;
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
            throw new RuntimeException("rip/breeze/client/a2", var10);
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
         CONST_H[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
   }
}
