package rip.breeze.client;

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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "AntiInvis",
   b = "Makes invisible enemies appear as ghosts instead of making them fully invisible.",
   d = {rip.breeze.ModuleCategory.MISC, rip.breeze.ModuleCategory.VISUAL}
)
public class AntiInvis extends BreezeModule {
   private final GenericSetting<Boolean> playerOnlySetting;
   private final GenericSetting<Double> transparencySetting;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public AntiInvis() {
      long var1 = 49668302967086L;
      super();
      short var10002 = 3668;
      long var10003 = 6735583781742183755L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "PlayerOnly");
      var10002 = 20265;
      var10003 = 7238366904446436405L ^ var1;
      this.playerOnlySetting = var10001.getDataBuilder50_3("Only apply to invisible players (not mobs)").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 27393;
      var10003 = 8589824459601829919L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Transparency");
      var10002 = 21792;
      var10003 = 2629576902382706237L ^ var1;
      this.transparencySetting = var10001.getDataBuilder50_3("How transparent the models are")
         .getDataBuilder50_4(0.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(0.01, 1.0, 0.01))
         .getDataBuilder54();
   }

   @KeepParameters
   public boolean checkCondition(EntityLivingBase var1) {
      return this.f()
         && (var1 instanceof EntityPlayer || !this.playerOnlySetting.getObject_m())
         && var1 instanceof EntityPlayer
         && AntiBot.isInvisible((EntityPlayer)var1);
   }

   @KeepParameters
   public float getFloat() {
      return this.transparencySetting.getObject_m().floatValue();
   }

   static {
      long var0 = 73131919957519L;
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
      String var6 = "\u0013Á\u001e1Ø\u009ct9\u0085_º\u0096v\u0080T¢Q±gÙs\\²m\u009aV\u007fÌ\u000e\rµ]\u0018§Þ\u0012\u0080;è{¶\n3q(A±O\fð\u0089>Äà\u0082X8";
      int var7 = "\u0013Á\u001e1Ø\u009ct9\u0085_º\u0096v\u0080T¢Q±gÙs\\²m\u009aV\u007fÌ\u000e\rµ]\u0018§Þ\u0012\u0080;è{¶\n3q(A±O\fð\u0089>Äà\u0082X8".length();
      char var8 = ' ';
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
                     CONST_Q = var4;
                     CONST_R = new String[4];
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

                  var6 = "ùaÍ[{Ë\u0099\t&³¤¯\u0002z\u0086Òrßnh·yà\u0093öËUäÅ¦\u001f*\\¡Î\u0080ÉÂë\u007f\u000f0\u0013d#cq`\u008cek¶xkÒ\u0013\u008bjî\u0015\u0015¨\u0099XþéÌ\u0002g\u0012mv8\u009a¦\u0081}}îBÐi%Ï\u009ct¿© 7L(\u0010cSkTà\u008d¼À\f± FÏFp¢6-Í\u001ce[\u0006é\u0096¢Ú\u0001\u0010ºÃ=\u000fü\u001c\u0093";
                  var7 = "ùaÍ[{Ë\u0099\t&³¤¯\u0002z\u0086Òrßnh·yà\u0093öËUäÅ¦\u001f*\\¡Î\u0080ÉÂë\u007f\u000f0\u0013d#cq`\u008cek¶xkÒ\u0013\u008bjî\u0015\u0015¨\u0099XþéÌ\u0002g\u0012mv8\u009a¦\u0081}}îBÐi%Ï\u009ct¿© 7L(\u0010cSkTà\u008d¼À\f± FÏFp¢6-Í\u001ce[\u0006é\u0096¢Ú\u0001\u0010ºÃ=\u000fü\u001c\u0093"
                     .length();
                  var8 = 'H';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6704;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d2", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/client/d2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
