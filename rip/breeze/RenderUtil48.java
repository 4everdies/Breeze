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

public class RenderUtil48 extends Util28 {
   private final UserInfo userInfo_j;
   private final RenderUtil13 dataBuilder126_k;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil48(UserInfo var1) {
      this.userInfo_j = var1;
      this.d = 50.0F;
      this.dataBuilder126_k = new RenderUtil13(var1.string_b, var1.fieldInt_d, 34);
      this.b(this.dataBuilder126_k);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .fillGradientRect(
            this,
            new float[]{
               0.0F,
               0.0F,
               BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
               BreezeContext.authSession_c.getFloat("cloud.corner-radius")
            },
            BreezeContext.authSession_c.getColor("default.layer-two")
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.userInfo_j.string_a,
            this.a + 50.0F,
            this.b + 16.0F,
            BreezeContext.authSession_c.getColor("default.text-primary"),
            EnumType32.SOURCE_SANS,
            20.0F
         );
      if (this.userInfo_j.userRole_c != UserRole.REGULAR && this.userInfo_j.userRole_c != UserRole.PLUS) {
         BreezeContext.iRenderer_b
            .drawText(
               this.userInfo_j.userRole_c.name,
               this.a + 50.0F + BreezeContext.iRenderer_b.measureText(this.userInfo_j.string_a, EnumType32.SOURCE_SANS, 20.0F) + 2.0F,
               this.b + 22.0F,
               this.userInfo_j.userRole_c.color,
               EnumType32.SOURCE_SANS,
               13.0F
            );
      }

      super.processNullable(var1, var2, var3);
   }

   public void calculate_2() {
      super.processNullable_4();
      this.dataBuilder126_k.a(this.a + 8.0F, this.b + 8.0F, 34.0F, 34.0F);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   static {
      long var0 = 15408134803237L;
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
      String var6 = "Ð\u0088\u0006æÅ~vù·3½Fâ(PïÙ\u008c\u001eò9,§NõV-\u0092âÔk\u0093¸`\u0099.]Òé³0p{¦nm\u008f~9±\u0083\u0096Ý¼¯\b;N_Oû.\u001d¨ \u0087Ä\u0098q\u008bhò\u0018oHy\u009d§\u008ckÊ\u0099\u0004²\u0012µa\u0006\u0091";
      int var7 = "Ð\u0088\u0006æÅ~vù·3½Fâ(PïÙ\u008c\u001eò9,§NõV-\u0092âÔk\u0093¸`\u0099.]Òé³0p{¦nm\u008f~9±\u0083\u0096Ý¼¯\b;N_Oû.\u001d¨ \u0087Ä\u0098q\u008bhò\u0018oHy\u009d§\u008ckÊ\u0099\u0004²\u0012µa\u0006\u0091"
         .length();
      char var8 = '(';
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
                     CONST_M = var4;
                     CONST_N = new String[4];
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

                  var6 = "®\u009eÕ$\u0003\u0016e\f\u0013Rª\nÀ\u009a4}ò(\u000b2uë6Êê¬Y!¯\u0010m8E\u0098{Z\"\u008a¼g ®ïdWk\b;²×¶5||øÎØÀ\u009c\u0090_ÌãZË\u001aÇÝ8;\\o\u0088";
                  var7 = "®\u009eÕ$\u0003\u0016e\f\u0013Rª\nÀ\u009a4}ò(\u000b2uë6Êê¬Y!¯\u0010m8E\u0098{Z\"\u008a¼g ®ïdWk\b;²×¶5||øÎØÀ\u009c\u0090_ÌãZË\u001aÇÝ8;\\o\u0088"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11741;
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
            throw new RuntimeException("rip/breeze/dj", var10);
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
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
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
         throw new RuntimeException("rip/breeze/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
