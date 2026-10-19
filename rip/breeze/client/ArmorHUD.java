package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "ArmorHUD",
   b = "Displays your equipped armor and held item.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"armor", "equipment", "durability", "items", "hud"}
)
public class ArmorHUD extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> horizontalSetting;
   private final GenericSetting<Boolean> dataBuilder54_o;
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Double> roundingSetting;
   private final ModuleManager moduleManager_r;
   private final rip.breeze.RotationUtil8 dataBuilder14_s;
   private static final String[] CONST_U;
   private static final String[] CONST_V;
   private static final Map CONST_W = new HashMap(13);

   public ArmorHUD() {
      long var1 = 43463629078987L;
      super(false, false);
      short var10002 = 11606;
      long var10003 = 6328268775137644516L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Horizontal");
      var10002 = 29017;
      var10003 = 2405868619493331951L ^ var1;
      this.horizontalSetting = var10001.getDataBuilder50_3("Display armor slots in a row instead of a column.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 31435;
      var10003 = 5019660744335546491L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Held Item");
      var10002 = 30300;
      var10003 = 8474049038420727016L ^ var1;
      this.dataBuilder54_o = var10001.getDataBuilder50_3("Show the currently held item next to / below the armor.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 2002;
      var10003 = 3981617375305901415L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Background");
      var10002 = 13055;
      var10003 = 5321153094067589192L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Draw a background behind the items.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 27076;
      var10003 = 8660703047133383543L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 8141;
      var10003 = 3032209106686590332L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the background.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      this.moduleManager_r = BreezeClient.getModuleManager();
      this.dataBuilder14_s = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.LEFT, rip.breeze.AimYawMode2.BOTTOM, 10.0, 10.0);
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_s;
   }

   public int calculate() {
      long var1 = 103577559919591L;
      int var3 = this.getValue();
      return this.horizontalSetting.getObject_m()
         ? 2 * this.calculate_5() + var3 * this.clamp() + (var3 - 1) * this.calculate_4()
         : 2 * this.calculate_5() + this.clamp();
   }

   public int calculate_2() {
      long var1 = 84746312045769L;
      int var3 = this.getValue();
      return this.horizontalSetting.getObject_m()
         ? 2 * this.calculate_5() + this.clamp()
         : 2 * this.calculate_5() + var3 * this.clamp() + (var3 - 1) * this.calculate_4();
   }

   public void calculate_3(List<Util8> var1) {
      long var2 = 123025407946278L;
      if (this.backgroundSetting.getObject_m()) {
         float var4 = (float)(3.0F * this.moduleManager_r.fieldInt_l * this.roundingSetting.getObject_m());
         var1.add(new Util8(this.dataBuilder14_s.clamp_2(), this.dataBuilder14_s.clamp_3(), this.calculate(), this.calculate_2(), var4));
      }
   }

   public void updateRotation() {
      long var1 = 83095202467719L;
      int[] var3 = ModuleList.values();
      if (BreezeClient.CONST_A.thePlayer != null) {
         int var4 = this.dataBuilder14_s.clamp_2() + this.calculate_5();
         int var5 = this.dataBuilder14_s.clamp_3() + this.calculate_5();
         int var6 = this.clamp();
         int var7 = var6 + this.calculate_4();
         boolean var8 = this.horizontalSetting.getObject_m();
         int var9 = 3;

         while (var9 >= 0) {
            label25: {
               RenderUtil28.calculate_12(BreezeClient.CONST_A.thePlayer.getCurrentArmor(var9), var4, var5, var6, true);
               if (var8) {
                  var4 += var7;
                  if (var3 != null) {
                     break label25;
                  }
               }

               var5 += var7;
            }

            var9--;
            if (var3 == null) {
               break;
            }
         }

         if (this.dataBuilder54_o.getObject_m()) {
            RenderUtil28.calculate_12(BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem(), var4, var5, var6, true);
         }
      }
   }

   private int getValue() {
      long var1 = 111645136614551L;
      return this.dataBuilder54_o.getObject_m() ? 5 : 4;
   }

   private int clamp() {
      return Math.max(1, 16 * this.moduleManager_r.fieldInt_l);
   }

   private int calculate_4() {
      return 2 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_5() {
      return 4 * this.moduleManager_r.fieldInt_l;
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.backgroundSetting.getObject_m();
   }

   static {
      long var0 = 130670506346268L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "_\u0099¨§W\u0012·³»Ü<âw\u009a\u0092cmæ\u0088§MâãÒø\u0005\u0090ép/½ÜcÕ\u008a\u0092¹G)DÍ;}®¶þ/7òw\u0005\u0082,Æ\u0085ç}\u001f\u009a`»>\u008eÝ\u0099\u008a#]\u0003ø÷Ø\u007f2J\u0081\u0018\u009fW,S\u0005\u000f\u0090¹\u0082(\u0081@¢\u0092\\q·¸é+\u009e\u0006§è\u0017\t\u0007\u001cX \\\u0000:¿x¡(D0x!¸<\u0088ÐÌT\u001ctÞ\u0012\u0095£Ó\u0095\u009b\u00adÑ\u0088Î0IÍ\u0002Eüµ!P~\u0001ö\u0091sg%X\u009cbÞ\u0001°øò¦!\u001b¦A\tûa^È.\u0080>à9,¨¬ð\u0083d×k\u008f«!\u001e\\\u0087\u0010Ö\u0096ø\u009e×eêO×ë\u0088\u0004ÚÔô\u000bCU×,\u009fý\n\u0018\u008cEfÛË³0h\rÝªá´\u0081\u008e:\u0096\u0086éíV\u0000\u000eÉëâØ\u0018\u0096@ØÁ 3\u0013Ã&l\u00018òc\u0014!Ìx:ø\rë°ò w7\u008c¤[Ä«³ûó¶\u0088»»KYq¤ÒÂ²HÞ0m\rEï®vV_ Äu^´ú<öZÛÈá?\u0019nr:\u0084u\u0098\u0019rä\u0019ÆwÐ\u008e¥*\u0087f|";
      int var7 = "_\u0099¨§W\u0012·³»Ü<âw\u009a\u0092cmæ\u0088§MâãÒø\u0005\u0090ép/½ÜcÕ\u008a\u0092¹G)DÍ;}®¶þ/7òw\u0005\u0082,Æ\u0085ç}\u001f\u009a`»>\u008eÝ\u0099\u008a#]\u0003ø÷Ø\u007f2J\u0081\u0018\u009fW,S\u0005\u000f\u0090¹\u0082(\u0081@¢\u0092\\q·¸é+\u009e\u0006§è\u0017\t\u0007\u001cX \\\u0000:¿x¡(D0x!¸<\u0088ÐÌT\u001ctÞ\u0012\u0095£Ó\u0095\u009b\u00adÑ\u0088Î0IÍ\u0002Eüµ!P~\u0001ö\u0091sg%X\u009cbÞ\u0001°øò¦!\u001b¦A\tûa^È.\u0080>à9,¨¬ð\u0083d×k\u008f«!\u001e\\\u0087\u0010Ö\u0096ø\u009e×eêO×ë\u0088\u0004ÚÔô\u000bCU×,\u009fý\n\u0018\u008cEfÛË³0h\rÝªá´\u0081\u008e:\u0096\u0086éíV\u0000\u000eÉëâØ\u0018\u0096@ØÁ 3\u0013Ã&l\u00018òc\u0014!Ìx:ø\rë°ò w7\u008c¤[Ä«³ûó¶\u0088»»KYq¤ÒÂ²HÞ0m\rEï®vV_ Äu^´ú<öZÛÈá?\u0019nr:\u0084u\u0098\u0019rä\u0019ÆwÐ\u008e¥*\u0087f|"
         .length();
      char var8 = 'X';
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
                     CONST_V = new String[8];
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

                  var6 = "¹ì§\u001bkúòp[é \u0002\u0086P\u0006ÐªuÖ±iÚbã\u0093bSÌtY\u0013Ð@Gô\u001båçáP-¦¦Þ¯7\u0004\n¬ \u0093Ðn\u009cb\u0086\bÒaß&\u008b»Z}Ø<á78\nX\u00905mN\u0007\u0090\u0012\u0016>\u000bj\u001fb\u0095§2G%\u0010@\u0097Üjó\u0017";
                  var7 = "¹ì§\u001bkúòp[é \u0002\u0086P\u0006ÐªuÖ±iÚbã\u0093bSÌtY\u0013Ð@Gô\u001båçáP-¦¦Þ¯7\u0004\n¬ \u0093Ðn\u009cb\u0086\bÒaß&\u008b»Z}Ø<á78\nX\u00905mN\u0007\u0090\u0012\u0016>\u000bj\u001fb\u0095§2G%\u0010@\u0097Üjó\u0017"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9085;
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
            throw new RuntimeException("rip/breeze/client/dv", var10);
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
         throw new RuntimeException("rip/breeze/client/dv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
