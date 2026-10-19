package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.BaseEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(
   name = "MotionEvent",
   description = "Gets called when the player's motion is updated, you can use this event to override the movement.",
   cancellable = true,
   example = "script.addListener(\"MotionEvent\", (event) => {\n    // make the player 50% faster    event.x *= 1.5;\n    event.z *= 1.5;\n});"
)
public final class MotionEventEvent extends BaseEvent {
   public double double_h;
   public double double_i;
   public double double_j;
   private Priority priority_k;
   private static final String CONST_M;

   @KeepParameters
   public MotionEventEvent(double var1, double var3, double var5, Priority var7) {
      this.priority_k = var7;
      this.double_h = var1;
      this.double_i = var3;
      this.double_j = var5;
   }

   @JSGetter(value = "x", description = "The amount to move the player in the x direction.")
   public double getDouble_h() {
      return this.double_h;
   }

   @JSGetter(value = "y", description = "The amount to move the player in the y direction.")
   public double getDouble_i() {
      return this.double_i;
   }

   @JSGetter(value = "z", description = "The amount to move the player in the z direction.")
   public double getDouble_j() {
      return this.double_j;
   }

   @JSSetter("x")
   public void setDouble_h(double var1) {
      this.double_h = var1;
   }

   @JSSetter("y")
   public void setDouble_i(double var1) {
      this.double_i = var1;
   }

   @JSSetter("z")
   public void setDouble_j(double var1) {
      this.double_j = var1;
   }

   public Priority getPriority_k() {
      return this.priority_k;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_M;
   }

   static {
      long var0 = 110429665990250L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u00adÃ\u009dÃ\u001fÏUfÆ\u0097áïí>¿è".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_M = var5;
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
