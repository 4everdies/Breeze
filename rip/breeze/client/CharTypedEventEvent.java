package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.CancellableEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(name = "CharTypedEvent", description = "Gets called when a character is typed.", cancellable = false)
public class CharTypedEventEvent extends CancellableEvent {
   public final char char_g;
   private static final String CONST_I;

   @KeepParameters
   public CharTypedEventEvent(char var1) {
      this.char_g = var1;
   }

   @JSFunction("getChar")
   public String buildString() {
      return String.valueOf(this.char_g);
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_I;
   }

   static {
      long var0 = 92375047422874L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\\\u0081deÕ¹ã)\u0018\u0093\u0016Â\u0005n\u0094ú".getBytes("ISO-8859-1"));
      String var5 = buildString_2(var4).intern();
      byte var10001 = -1;
      CONST_I = var5;
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
}
