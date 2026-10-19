package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.BaseEvent;
import rip.breeze.KeepParameters;
import rip.breeze.RotationUtils;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(name = "RenderEntityEvent", description = "Gets called when an entity is rendered.", cancellable = false)
public class RenderEntityEventEvent extends BaseEvent {
   public final ModelBase modelBase_h;
   public final Entity entity_i;
   public final float fieldFloat_j;
   public final float fieldFloat_k;
   public final float fieldFloat_l;
   public final float fieldFloat_m;
   public final float fieldFloat_n;
   public final float fieldFloat_o;
   private static final String CONST_Q;

   @KeepParameters
   public RenderEntityEventEvent(ModelBase var1, Entity var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.modelBase_h = var1;
      this.entity_i = var2;
      this.fieldFloat_j = var3;
      this.fieldFloat_k = var4;
      this.fieldFloat_l = var5;
      this.fieldFloat_m = var6;
      this.fieldFloat_n = var7;
      this.fieldFloat_o = var8;
   }

   @JSFunction(value = "getEntity", description = "Gets the entity that is being rendered.")
   public RotationUtils getRotationUtils() {
      return rip.breeze.StringBuilderUtil.getDataBuilder12(this.entity_i);
   }

   @JSFunction(value = "renderModel", description = "Renders the entity's model to the world.")
   public void processAll() {
      this.modelBase_h.render(this.entity_i, this.fieldFloat_j, this.fieldFloat_k, this.fieldFloat_l, this.fieldFloat_m, this.fieldFloat_n, this.fieldFloat_o);
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 25584663127017L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("nç\"é9\f0P´\u0094\u001fe:¯Â¸ªs°VV°Z²".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_Q = var5;
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
