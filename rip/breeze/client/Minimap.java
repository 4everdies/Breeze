package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.player.EntityPlayer;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil1;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "Minimap",
   b = "Shows nearby enemy positions on a draggable radar panel.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"minimap", "radar", "map", "enemies", "positions"}
)
public class Minimap extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Double> sizeSetting;
   private final GenericSetting<Double> roundingSetting;
   private final GenericSetting<Double> rangeSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final GenericSetting<Boolean> teamColorsSetting;
   private final rip.breeze.RotationUtil8 dataBuilder14_s;
   private static final String[] CONST_U;
   private static final String[] CONST_V;
   private static final Map CONST_W = new HashMap(13);

   public Minimap() {
      long var1 = 8509901178070L;
      super(false, false);
      short var10002 = 28653;
      long var10003 = 5985697342313408848L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Size");
      var10002 = 9347;
      var10003 = 3817353011898180157L ^ var1;
      this.sizeSetting = var10001.getDataBuilder50_3("Size of the radar panel in GUI pixels.")
         .getDataBuilder50_4(150.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(80.0, 300.0))
         .getDataBuilder54();
      var10002 = 15424;
      var10003 = 1901295590941817595L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 21940;
      var10003 = 6321643011460141826L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the panel.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder54();
      var10002 = 4874;
      var10003 = 7844944178318595504L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 26550;
      var10003 = 3151536624032555273L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("Range in blocks to show enemies.")
         .getDataBuilder50_4(64.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(16.0, 256.0))
         .getDataBuilder54();
      var10002 = 29328;
      var10003 = 567049090800170028L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 27765;
      var10003 = 1014032912509709004L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The default dot color for enemies with no team assigned.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(230, 34, 100))
         .getDataBuilder54();
      var10002 = 725;
      var10003 = 3883295491365946477L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "TeamColors");
      var10002 = 622;
      var10003 = 316126325431256281L ^ var1;
      this.teamColorsSetting = var10001.getDataBuilder50_3("Color enemy dots using their assigned team color.").getDataBuilder50_4(true).getDataBuilder54();
      this.dataBuilder14_s = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.LEFT, rip.breeze.AimYawMode2.BOTTOM, 10.0, 10.0);
   }

   public int getValue() {
      return (int)this.sizeSetting.getObject_m().doubleValue();
   }

   public int getValue_2() {
      return (int)this.sizeSetting.getObject_m().doubleValue();
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_s;
   }

   public void processPlayers(List<Util8> var1) {
      var1.add(new Util8(this.dataBuilder14_s.clamp_2(), this.dataBuilder14_s.clamp_3(), this.getValue(), this.getValue_2(), this.calculateFloat()));
   }

   public void absValue() {
      long var1 = 83095202467719L;
      int[] var3 = ModuleList.values();
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         int var4 = this.dataBuilder14_s.clamp_2();
         int var5 = this.dataBuilder14_s.clamp_3();
         int var6 = this.getValue();
         int var7 = this.getValue_2();
         float var8 = var4 + var6 * 0.5F;
         float var9 = var5 + var7 * 0.5F;
         float var10 = var6 * 0.5F;
         float var11 = var7 * 0.5F;
         float var12 = (float)this.rangeSetting.getObject_m().doubleValue();
         float var13 = (float)Math.toRadians(BreezeClient.CONST_A.getRenderManager().playerViewY);
         float var14 = (float)Math.sin(var13);
         float var15 = (float)Math.cos(var13);

         for (EntityPlayer var17 : new ArrayList(BreezeClient.CONST_A.theWorld.playerEntities)) {
            if (AntiBot.isInvisible_2(var17)) {
               float var18 = (float)(var17.posX - BreezeClient.CONST_A.thePlayer.posX);
               float var19 = (float)(var17.posZ - BreezeClient.CONST_A.thePlayer.posZ);
               if (!(var18 * var18 + var19 * var19 > var12 * var12)) {
                  float var20 = -var18 * var14 + var19 * var15;
                  float var21 = -(var18 * var15 + var19 * var14);
                  float var22 = var8 + var21 / var12 * var10;
                  float var23 = var9 - var20 / var12 * var11;
                  float var24 = Math.max(Math.abs(var21) / var10, Math.abs(var20) / var11);
                  float var25 = Math.min(1.0F, Math.max(0.0F, (1.0F - var24) / 0.1F));
                  float var26 = 3.0F;
                  Color var27 = this.getDistance(var17, var12);
                  var27 = RenderUtil1.getColor_7(var27, (int)(var27.getAlpha() * var25));
                  RenderUtil28.calculate_3(
                     var22 - var26,
                     var23 - var26,
                     var26 * 2.0F,
                     var26 * 2.0F,
                     var26,
                     var27,
                     var26 * 0.7F,
                     RenderUtil1.getColor_7(var27, (int)(var27.getAlpha() * var25))
                  );
                  if (var3 == null) {
                     break;
                  }
               }
            }
         }

         RenderUtil28.calculate_4(var8, var9, 3.0F, Color.WHITE);
      }
   }

   private float calculateFloat() {
      return (float)(6.0 * this.sizeSetting.getObject_m() / 30.0 * this.roundingSetting.getObject_m());
   }

   private Color getDistance(EntityPlayer var1, float var2) {
      long var3 = 98965575678944L;
      Color var5 = BreezeClient.getAltManager().getColor(var1, this.teamColorsSetting.getObject_m());
      var5 = var5 == null ? this.colorSetting.getObject_m() : RenderUtil1.getColor_7(var5, this.colorSetting.getObject_m().getAlpha());
      float var6 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var1);
      int var7 = (int)(255.0F * (1.0F - Math.min(1.0F, Math.max(0.0F, (var6 - 10.0F) / (var2 - 10.0F)))));
      return RenderUtil1.getColor_7(var5, var7);
   }

   static {
      long var0 = 35160019192808L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "\u009b\u008aL·{áÀ\u0004\u009a\u00adÝúÔ$ÎÃrxü<æÔKÙ»\u001dpù\u0010T\u001c\tÏÙà9z\u009aß*?ú%\u0096\u0006\u009f;ý÷¦\u0015\rG\u000e¤z@\u0018¯\u001e\u0087\u0011ì²¾\nº\\\u0086\u008b\u0096\u0000\u000biÄÂ{c\u0010Oûª[YÀ\tñ\nðyõâ\\\u0094\u0002M®\u001a×je\u009c¸lÃÖ\b\u009bÌ.Z>©nn½\u0001*¬ú \u0010\u0098¤a°¹Ç5Ì<Î\"\r2¡E¤\u0010\r;ª³¦\\è©\u00168\u0006Ñ\u001cêTì\u0010Å\u0099º¨%Ï¤òì\u009e:\u0010$¼í\u009c\u0018æ@ò\u009eð!JNðÀþ\u0005HFêæ\u0098\u000b\u0093\r\u0092¥»J Kó\u009c#\u0019º¦\u008dÿº\"\u0090\u009c\"\\5\u008aþE°*\f\u008a¢\u0097\u0006¯\u007fø\u008c¹Ú`ùü´5\u001d<s®Wîg\u000f ¼¾ã%u\u0085ô(\u008ahj ÛÉÉ\u0004\rçÓ^ÔË\u007fÎ¼äu\"\u009f\u0004\u0018\u009eÁ0mÚ\u0088¨\u0095\u008b\u00960RÄ\u0080£ª\f«m\u009b®\u0087ó:¶^¤Ê\rVê\u001f$\u001b\u0014v\u0015-f`\u0081P^KNRûõ«\u0088ïÒ";
      int var7 = "\u009b\u008aL·{áÀ\u0004\u009a\u00adÝúÔ$ÎÃrxü<æÔKÙ»\u001dpù\u0010T\u001c\tÏÙà9z\u009aß*?ú%\u0096\u0006\u009f;ý÷¦\u0015\rG\u000e¤z@\u0018¯\u001e\u0087\u0011ì²¾\nº\\\u0086\u008b\u0096\u0000\u000biÄÂ{c\u0010Oûª[YÀ\tñ\nðyõâ\\\u0094\u0002M®\u001a×je\u009c¸lÃÖ\b\u009bÌ.Z>©nn½\u0001*¬ú \u0010\u0098¤a°¹Ç5Ì<Î\"\r2¡E¤\u0010\r;ª³¦\\è©\u00168\u0006Ñ\u001cêTì\u0010Å\u0099º¨%Ï¤òì\u009e:\u0010$¼í\u009c\u0018æ@ò\u009eð!JNðÀþ\u0005HFêæ\u0098\u000b\u0093\r\u0092¥»J Kó\u009c#\u0019º¦\u008dÿº\"\u0090\u009c\"\\5\u008aþE°*\f\u008a¢\u0097\u0006¯\u007fø\u008c¹Ú`ùü´5\u001d<s®Wîg\u000f ¼¾ã%u\u0085ô(\u008ahj ÛÉÉ\u0004\rçÓ^ÔË\u007fÎ¼äu\"\u009f\u0004\u0018\u009eÁ0mÚ\u0088¨\u0095\u008b\u00960RÄ\u0080£ª\f«m\u009b®\u0087ó:¶^¤Ê\rVê\u001f$\u001b\u0014v\u0015-f`\u0081P^KNRûõ«\u0088ïÒ"
         .length();
      char var8 = '8';
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
                     CONST_U = var4;
                     CONST_V = new String[10];
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

                  var6 = "ÆxT¹\u0007\u009e3â\u0089ë\u001a~ýÊ´d¢\u001e7\u0012\u008aFr\u0012¿£Á+÷·ânv0$\f\u00129zN¤M4'<~Ë=\u0012\u0082Û\"\r°\u009fWXû\u009bÐjÒàqÍz;\u0011â\u0011eIÑ]º\u0001\u0007aR\u008b\u0001Öý\td\u008f¿\u008e\fp\u000e\u0095íô\u0011Lï<ü\u0016¦lNH{Pç X\u00186;\u0092m\u0080©JN\tÍ\u008e\u0095`¢\u008a±\u001d7TÐpñ\u0088Ò\u0019ØÍß/\u008b\u0014\u0094ç¸\u001a";
                  var7 = "ÆxT¹\u0007\u009e3â\u0089ë\u001a~ýÊ´d¢\u001e7\u0012\u008aFr\u0012¿£Á+÷·ânv0$\f\u00129zN¤M4'<~Ë=\u0012\u0082Û\"\r°\u009fWXû\u009bÐjÒàqÍz;\u0011â\u0011eIÑ]º\u0001\u0007aR\u008b\u0001Öý\td\u008f¿\u008e\fp\u000e\u0095íô\u0011Lï<ü\u0016¦lNH{Pç X\u00186;\u0092m\u0080©JN\tÍ\u008e\u0095`¢\u008a±\u001d7TÐpñ\u0088Ò\u0019ØÍß/\u008b\u0014\u0094ç¸\u001a"
                     .length();
                  var8 = '8';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17000;
      if (CONST_V[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_W.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dx", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_U[var3].getBytes("ISO-8859-1");
         CONST_V[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_V[var3];
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
         throw new RuntimeException("rip/breeze/client/dx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
