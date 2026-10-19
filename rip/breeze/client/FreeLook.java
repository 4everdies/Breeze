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
import net.minecraft.util.MathHelper;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "FreeLook", b = "Allows you to look around freely.", d = rip.breeze.ModuleCategory.MISC, c = {"free", "look", "freelook", "third", "camera"})
public class FreeLook extends BreezeModule {
   private final GenericSetting<EnumType16> perspectiveSetting;
   private final GenericSetting<Boolean> invertYawSetting;
   private final GenericSetting<Boolean> invertPitchSetting;
   private final GenericSetting<Boolean> noClipSetting;
   private final GenericSetting<Boolean> hideHandSetting;
   private final GenericSetting<Boolean> dataBuilder54_s;
   private float fieldFloat_t;
   private float fieldFloat_u;
   private float fieldFloat_v;
   private float fieldFloat_w;
   private AnimationTimer dataBuilder15_x;
   private static int[] arr_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);

   public FreeLook() {
      long var1 = 80502879203094L;
      super();
      short var10002 = 14935;
      long var10003 = 1509722850684398546L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Perspective");
      var10002 = 20199;
      var10003 = 3803182436479475555L ^ var1;
      this.perspectiveSetting = var10001.getDataBuilder50_3("The perspective of your camera when in free look.")
         .getDataBuilder50_4(EnumType16.BACK)
         .getDataBuilder54();
      var10002 = 18563;
      var10003 = 3176120606228322561L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "InvertYaw");
      var10002 = 12103;
      var10003 = 2224181999345794764L ^ var1;
      this.invertYawSetting = var10001.getDataBuilder50_3("Inverts your yaw (side-to-side) when in free look.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 3469;
      var10003 = 1557834964544838666L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "InvertPitch");
      var10002 = 11727;
      var10003 = 2627704791881120839L ^ var1;
      this.invertPitchSetting = var10001.getDataBuilder50_3("Inverts your pitch (up-down) when in free look.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 9701;
      var10003 = 875514365579129964L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "NoClip");
      var10002 = 16672;
      var10003 = 1718165770967453862L ^ var1;
      this.noClipSetting = var10001.getDataBuilder50_3("Prevents the camera from colliding with blocks when in free look.")
         .getDataBuilder50_4(false)
         .getDataBuilder50_9(FreeLook::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 25493;
      var10003 = 1716357750090314261L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Animates the transition between perspectives.");
      var10002 = 21953;
      var10003 = 3161978916881466432L ^ var1;
      this.hideHandSetting = var10001.getDataBuilder50_3("HideHand").getDataBuilder50_4(true).getDataBuilder50_9(FreeLook::lambda$new_Inner1).getDataBuilder54();
      this.dataBuilder54_s = GenericSetting.<Boolean>getDataBuilder50(this, "HideHand")
         .getDataBuilder50_3("Hide your hand when in free look from a third person perspective.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.dataBuilder15_x = new AnimationTimer(300.0F, false, EnumType3.CUBIC_IN_OUT);
   }

   @Override
   public String getString() {
      return this.perspectiveSetting.formatter.apply(this.perspectiveSetting.getObject_m());
   }

   @Override
   public void processNullable() {
      long var1 = 23436370995847L;
      if (BreezeClient.CONST_A.thePlayer != null) {
         this.dataBuilder15_x = new AnimationTimer(500.0F, false, EnumType3.CIRC_OUT);
      }
   }

   public void processNullable_2() {
      long var1 = 73912092874623L;
      long var3 = var1 ^ 87306121813576L;
      if (BreezeClient.CONST_A.thePlayer != null) {
         this.fieldFloat_t = this.fieldFloat_v = BreezeClient.CONST_A.thePlayer.rotationYaw;
         this.fieldFloat_u = this.fieldFloat_w = BreezeClient.CONST_A.thePlayer.rotationPitch;
         this.dataBuilder15_x.toggle(var3, this.hideHandSetting.getObject_m());
      }
   }

   @EventListener(a = rip.breeze.Priority.HIGHEST)
   public void calculate(AngleUpdateEventEvent var1) {
      long var2 = 43497245411845L;
      var1.a();
      this.fieldFloat_w = this.fieldFloat_u;
      this.fieldFloat_v = this.fieldFloat_t;
      float var4 = var1.getFloat_h();
      float var5 = var1.getFloat_i();
      if (this.invertPitchSetting.getObject_m()) {
         var5 *= -1.0F;
      }

      if (this.invertYawSetting.getObject_m()) {
         var4 *= -1.0F;
      }

      this.fieldFloat_t = (float)(this.fieldFloat_t + var4 * 0.15);
      this.fieldFloat_u = (float)(this.fieldFloat_u - var5 * 0.15);
      this.fieldFloat_u = MathHelper.clamp_float(this.fieldFloat_u, -90.0F, 90.0F);
   }

   @EventListener
   public void applyRotation(RenderHandEventEvent var1) {
      long var2 = 53180373888082L;
      if (this.dataBuilder54_s.getObject_m()) {
         var1.a();
      }
   }

   @KeepParameters
   public float getFloat() {
      long var1 = 52218234769053L;
      return this.f() ? this.fieldFloat_t : BreezeClient.CONST_A.getRenderViewEntity().rotationYaw;
   }

   @KeepParameters
   public float getFloat_2() {
      long var1 = 1639459799541L;
      return this.f() ? this.fieldFloat_v : BreezeClient.CONST_A.getRenderViewEntity().prevRotationYaw;
   }

   @KeepParameters
   public float getFloat_3() {
      long var1 = 108873319097126L;
      return this.f() ? this.fieldFloat_w : BreezeClient.CONST_A.getRenderViewEntity().prevRotationPitch;
   }

   public float calculateFloat() {
      return this.fieldFloat_u - (this.fieldFloat_u - this.fieldFloat_w) * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
   }

   public float calculateFloat_2() {
      return this.fieldFloat_t - (this.fieldFloat_t - this.fieldFloat_v) * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
   }

   @KeepParameters
   public float getFloat_4() {
      long var1 = 23027618699476L;
      return this.f() ? this.fieldFloat_u : BreezeClient.CONST_A.getRenderViewEntity().rotationPitch;
   }

   @KeepParameters
   public double calculateDouble() {
      long var1 = 1380939296521L;
      long var3 = var1 ^ 56760519666422L;
      return !this.hideHandSetting.getObject_m() ? 1.0 : 0.3 + this.dataBuilder15_x.getDouble(var3) * 0.7;
   }

   @KeepParameters
   public int getValue() {
      long var1 = 36286144261241L;
      return !this.f() ? BreezeClient.CONST_A.gameSettings.thirdPersonView : this.perspectiveSetting.getObject_m().ordinal();
   }

   @KeepParameters
   public boolean checkCondition() {
      long var1 = 114877658301358L;
      return this.f() && this.noClipSetting.getObject_m();
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 4710036224822L;
      return var0.getObject("Perspective", EnumType16.class) != EnumType16.FIRST;
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 97727557374721L;
      return var0.getObject("Perspective", EnumType16.class) != EnumType16.FIRST;
   }

   public static void initialize(int[] var0) {
      arr_y = var0;
   }

   public static int[] values() {
      return arr_y;
   }

   static {
      int[] var10000 = new int[2];
      long var0 = 14313817178823L;
      initialize(var10000);
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[13];
      int var5 = 0;
      String var6 = "æçèCi2i\u0011û ¡zµ Þ©Pt\u0006FEV2-\u0083ð\n®L\u0001\u00ad\u0086w§\u0011\u0001qô-\u000e÷ \\ÈZ\u0010d>ZÎKÔ\u009bðÍ¬Î\u0091\u009c\f\u0088V\u0082á»´\u008bÔ·p\u0019ÿx FN=+t\u0007\u009bn4mDpaË¸¦-\u0018Hay\u001b0 \u0088h:ß\u0096Iw%×ç\u007fÍ¬ïÄ¿U\tS\u009c\t>Yb\u0003WÊg-uEªp\u009cÿ\u0097$T¯óº$b+\u0014+l¨\u001côÐOgöiÛå\u001a3Û?CÐÈ\u008dgX[TJÍ5\u007f?(eÓbõ\u000e®¹\u001e\u0013\u0094IVo\\7¸[4äöÔÙüózÒÊ6\u001dÞ\u007fvÕyHß\u008cLôí\u0090\u0098\u0013\\«\u0018/0ë+,àÛ\n\u00adH2þF©ìUï\u0016Q\u000eþ¿Ð\u0005`b´ÛÔ=\u008cïÄåà-`²HFöT\u008bCc\u009d®Ùæ6üm!\u0080\u009edp14èÐ*#3\u009aý\u0098Ø¾\u00ad?¢\u008aº\u0080Ä\u001dF)ÍÆTý\r)\u0018Ð\u000f\u008eá~:Y¹Ý\ff\u0001:ç!©lÒ\u0012iÈß\u001fí\u0098\u009füKU¬áÚdþ\u0012 !\u0088¹\u008cW)$Ï{\u0082\u0092\u000eq%`\u0097ñþîIÏ\u0081uÑ\u0012¤r¥,ij(x:\u00adXâpH\\p\u0012\u0011\u0003»\"ä\u0099ªbÌòù\u0016Z\u00adæ\u001b±Ã\u0002þ¨Wº½â\u001bÅ7ãDÑ®læ\u009dèÌnþÓ¡'!~¸¹³\u0014Zy²¶\u0012ð9×òÙ\u0090»CÇêx\u009eÿ\u008eT\u0095\"/È\u0005wKÕ\u008e\u009a}½\u0019\u009c½)Ôù\r\u001eG\u0013¶\u0005¸È\u0094?µ1×mp\u009e\u0017Vy{+ñ%aM\u0018Ö\u0002A$\u00ad\u0086Ê\u001f\u001fqé\u0092\u0007\u0097ö:Ðx\u000f`\u009bP\u0019ðP&']ºAp.+Xê~¦hê`\u009e\u0099|\u0010ü\u0014Dx\u0003\u008d\u0085c\u008aù\u00950\u009aeÛ!J©Ðv¨\u0095\u0019<\u0094Å8Ý6wEu\r¸°Îp\u0015§Ú´m].Eà\u007f[Ú\u0016\u0012Áî,\u008e{Hl\u0082\u0015u\u0010M¡\u008c%½\u0092\u0084ÿOôAQþP1+\u0018úøe×\u0088¦\u0001èõgt°\u0017üÞ\u008e²\u0087,\u0014 ¯Ç»";
      int var7 = "æçèCi2i\u0011û ¡zµ Þ©Pt\u0006FEV2-\u0083ð\n®L\u0001\u00ad\u0086w§\u0011\u0001qô-\u000e÷ \\ÈZ\u0010d>ZÎKÔ\u009bðÍ¬Î\u0091\u009c\f\u0088V\u0082á»´\u008bÔ·p\u0019ÿx FN=+t\u0007\u009bn4mDpaË¸¦-\u0018Hay\u001b0 \u0088h:ß\u0096Iw%×ç\u007fÍ¬ïÄ¿U\tS\u009c\t>Yb\u0003WÊg-uEªp\u009cÿ\u0097$T¯óº$b+\u0014+l¨\u001côÐOgöiÛå\u001a3Û?CÐÈ\u008dgX[TJÍ5\u007f?(eÓbõ\u000e®¹\u001e\u0013\u0094IVo\\7¸[4äöÔÙüózÒÊ6\u001dÞ\u007fvÕyHß\u008cLôí\u0090\u0098\u0013\\«\u0018/0ë+,àÛ\n\u00adH2þF©ìUï\u0016Q\u000eþ¿Ð\u0005`b´ÛÔ=\u008cïÄåà-`²HFöT\u008bCc\u009d®Ùæ6üm!\u0080\u009edp14èÐ*#3\u009aý\u0098Ø¾\u00ad?¢\u008aº\u0080Ä\u001dF)ÍÆTý\r)\u0018Ð\u000f\u008eá~:Y¹Ý\ff\u0001:ç!©lÒ\u0012iÈß\u001fí\u0098\u009füKU¬áÚdþ\u0012 !\u0088¹\u008cW)$Ï{\u0082\u0092\u000eq%`\u0097ñþîIÏ\u0081uÑ\u0012¤r¥,ij(x:\u00adXâpH\\p\u0012\u0011\u0003»\"ä\u0099ªbÌòù\u0016Z\u00adæ\u001b±Ã\u0002þ¨Wº½â\u001bÅ7ãDÑ®læ\u009dèÌnþÓ¡'!~¸¹³\u0014Zy²¶\u0012ð9×òÙ\u0090»CÇêx\u009eÿ\u008eT\u0095\"/È\u0005wKÕ\u008e\u009a}½\u0019\u009c½)Ôù\r\u001eG\u0013¶\u0005¸È\u0094?µ1×mp\u009e\u0017Vy{+ñ%aM\u0018Ö\u0002A$\u00ad\u0086Ê\u001f\u001fqé\u0092\u0007\u0097ö:Ðx\u000f`\u009bP\u0019ðP&']ºAp.+Xê~¦hê`\u009e\u0099|\u0010ü\u0014Dx\u0003\u008d\u0085c\u008aù\u00950\u009aeÛ!J©Ðv¨\u0095\u0019<\u0094Å8Ý6wEu\r¸°Îp\u0015§Ú´m].Eà\u007f[Ú\u0016\u0012Áî,\u008e{Hl\u0082\u0015u\u0010M¡\u008c%½\u0092\u0084ÿOôAQþP1+\u0018úøe×\u0088¦\u0001èõgt°\u0017üÞ\u008e²\u0087,\u0014 ¯Ç»"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_A = var4;
                     CONST_B = new String[13];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Ì\u0019.°6¼{\u0011Su4 Ñ¨\u000fçDM\u0013\u0005ût g\u0095b\n\u001e\u0017äÍ\u009eIpQbeÐQ?\u009cJWº×OF¸F\u009a-Ö`ÿF Gá¤Þ\u0093\u007fUúK0\u0018Eî\u000f\u0007ò\u008eæÊ±ÃÇþD\u0015YKÐÇ\rpÅ L²\u0099\u009d\u008b\u0016X5RCumv\nõ\u0014»\u0012xßÌ\u0097\u001a$!ÈB\u0096ÚÁd\f";
                  var7 = "Ì\u0019.°6¼{\u0011Su4 Ñ¨\u000fçDM\u0013\u0005ût g\u0095b\n\u001e\u0017äÍ\u009eIpQbeÐQ?\u009cJWº×OF¸F\u009a-Ö`ÿF Gá¤Þ\u0093\u007fUúK0\u0018Eî\u000f\u0007ò\u008eæÊ±ÃÇþD\u0015YKÐÇ\rpÅ L²\u0099\u009d\u008b\u0016X5RCumv\nõ\u0014»\u0012xßÌ\u0097\u001a$!ÈB\u0096ÚÁd\f"
                     .length();
                  var8 = 'X';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32406;
      if (CONST_B[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dM", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_B[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B[var3];
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
         throw new RuntimeException("rip/breeze/client/dM" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
