package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "SubGroup", description = "A sub group of settings.", group = "breeze/settings")
public class SubGroup extends Util135 {
   public final ConditionsSetting dataBuilder53_i;
   private static final String CONST_K;

   public SubGroup(ConditionsSetting var1) {
      this.dataBuilder53_i = var1;
   }

   @JSConstructor(params = "The name of the subgroup.")
   public SubGroup(String var1) {
      long var2 = 114289822872663L;
      super();
      ImageUtil15 var4 = BreezeContext.dataBuilder15_j.getDataBuilder17_f();
      if (var4 == null) {
         throw Context.reportRuntimeError(CONST_K);
      }

      this.dataBuilder53_i = new ConditionsSetting(var4.dataBuilder51_k, var1);
   }

   @JSFunction("getName")
   public String getString() {
      return this.dataBuilder53_i.string;
   }

   static {
      long var0 = 1624379453955L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "µ\u0013'Í\u0099\u0081\"÷Jª¸\u00906\u007f¿åE\u009aÅÚÇpµULk~HY_\u0014)ü¹ÙueS\u0006\u0017°>\u0099ÐÝ^Uz]{df4kw\u0017t\u0001ér\u008d\u0010¸Ö"
            .getBytes("ISO-8859-1")
      );
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_K = var5;
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
}
