package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.CancellableEvent;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;
import rip.breeze.VecUtil1;

@ScriptEvent(name = "PostAttackEvent", description = "KillAura calls this after attacking, you can use this to script a custom autoblock.", cancellable = false)
public class PostAttackEventEvent extends CancellableEvent {
   public boolean fieldBool_g;
   public boolean fieldBool_h;
   public Vec3 vec3_i;
   private static final String CONST_K;

   public PostAttackEventEvent(boolean var1, boolean var2, Vec3 var3) {
      this.fieldBool_g = var1;
      this.fieldBool_h = var2;
      this.vec3_i = var3;
   }

   @JSGetter(value = "attacked", description = "If the KillAura send an attack packet.")
   public boolean isBool_g() {
      return this.fieldBool_g;
   }

   @JSSetter("attack")
   public void setBool_g(boolean var1) {
      this.fieldBool_g = var1;
   }

   @JSGetter(value = "swung", description = "If the KillAura send a animation packet.")
   public boolean isBool_h() {
      return this.fieldBool_h;
   }

   @JSSetter("swing")
   public void setBool_h(boolean var1) {
      this.fieldBool_h = var1;
   }

   @JSGetter(value = "hitVec", description = "The hitVector that was used for the attack.")
   public VecUtil1 getBreezeUtil81() {
      return (VecUtil1)VecUtil1.b(this.vec3_i);
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_K;
   }

   static {
      long var0 = 74937341232900L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ä:T\u0080Ô×ãø\u0080=¥p\u0001&ïÀ".getBytes("ISO-8859-1"));
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
