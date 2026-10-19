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

public final class MathUtil10 extends RenderUtil32 {
   private final String string_p;
   private final ConditionsSetting dataBuilder53_q;
   protected boolean fieldBool_r;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public MathUtil10(LicenseState var1, ConditionsSetting var2) {
      super(var1, var2.a, var2.b);
      this.string_p = var2.string;
      this.dataBuilder53_q = var2;
      this.fieldBool_r = var2.isValid();
   }

   public boolean isValid() {
      return this.dataBuilder53_q.isValid();
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a,
            this.b,
            this.c,
            this.d,
            BreezeContext.authSession_c.getFloat("setting-group-panel.corner-radius"),
            BreezeContext.authSession_c.getColor("setting-group-panel.background")
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.string_p,
            this.a + 10.0F,
            this.b - 35.0F,
            BreezeContext.authSession_c.getColor("setting-group-panel.text"),
            EnumType32.SOURCE_SANS,
            24.0F
         );
      super.absValue(var1, var2, var3);
   }

   public void initialize() {
      super.clamp();
      this.d = this.n();
   }

   public boolean checkCondition() {
      long var1 = 24219290497340L;
      int var3 = RenderUtil9.getValue();
      if (this.fieldBool_r != this.isValid()) {
         this.initialize();
         return true;
      }

      for (RenderUtil43 var5 : this.j) {
         if (var5.fieldBool_l != var5.dataBuilder54_k.isValid_4()) {
            this.initialize();
            return true;
         }

         if (var3 == 0) {
            break;
         }
      }

      for (MathUtil10 var7 : this.k) {
         if (var7.checkCondition()) {
            this.initialize();
            return true;
         }

         if (var3 == 0) {
            break;
         }
      }

      return false;
   }

   static {
      long var0 = 126566350439228L;
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
      String var6 = "ÍýÂ3²\u0006éòº\u0089/¡ÿßòs\u0011¬ÒÄ¡ÛÖ\u001d\u00adK£\u0013Ø!\u001c/*¿½^\u0088º\u007feO¢zW ±xá@&jÈMí~n\u0018n§\u008a\u0087GC®Ëaß\u0000Î+¤6éDÞW¦M\u0018þ\u0018¸ÿ\nÃ\bAÄ\u0095JmÇq\u00ad=\u0091ÜnÎ\u009cÐ\u0098M{DT'W¥ÿ\u0013QN0\u0084M\u0012ãp\u0099æC\r÷\u0093Ð¹ë:\u0012\u0097î1\u0095Á/?S@B\u0093ÖG\u0015Þ@´r¼éõØ\u0090`ïüÿ²\u0005ÏS°";
      int var7 = "ÍýÂ3²\u0006éòº\u0089/¡ÿßòs\u0011¬ÒÄ¡ÛÖ\u001d\u00adK£\u0013Ø!\u001c/*¿½^\u0088º\u007feO¢zW ±xá@&jÈMí~n\u0018n§\u008a\u0087GC®Ëaß\u0000Î+¤6éDÞW¦M\u0018þ\u0018¸ÿ\nÃ\bAÄ\u0095JmÇq\u00ad=\u0091ÜnÎ\u009cÐ\u0098M{DT'W¥ÿ\u0013QN0\u0084M\u0012ãp\u0099æC\r÷\u0093Ð¹ë:\u0012\u0097î1\u0095Á/?S@B\u0093ÖG\u0015Þ@´r¼éõØ\u0090`ïüÿ²\u0005ÏS°"
         .length();
      char var8 = '0';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_V = var4;
            CONST_W = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2950;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cZ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/cZ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
