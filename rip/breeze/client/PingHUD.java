package rip.breeze.client;

import java.awt.Color;
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
   a = "PingHUD",
   b = "Displays your real ping, measured from server window-click confirmations.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"ping", "latency", "ms", "hud", "delay"}
)
public class PingHUD extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Double> roundingSetting;
   private final GenericSetting<Boolean> jitterSetting;
   private final GenericSetting<Boolean> dataBuilder54_q;
   private final ModuleManager moduleManager_r;
   private final rip.breeze.RotationUtil8 dataBuilder14_s;
   private static final String CONST_T;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public PingHUD() {
      long var1 = 48801964092245L;
      super(false, false);
      short var10002 = 21344;
      long var10003 = 8041219434013028367L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Background");
      var10002 = 21937;
      var10003 = 314418180274550480L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Draw a background behind the component.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 15155;
      var10003 = 8236723919961364568L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 7839;
      var10003 = 697833786277084665L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the background.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 6652;
      var10003 = 2844985437604919952L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Colour the value from green (low) to red (high).");
      var10002 = 18218;
      var10003 = 6351550354955953218L ^ var1;
      this.jitterSetting = var10001.getDataBuilder50_3("Jitter").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 7881;
      var10003 = 3783642311498743207L ^ var1;
      this.dataBuilder54_q = GenericSetting.<Boolean>getDataBuilder50(this, "Show the measured jitter (±ms) next to the ping.")
         .getDataBuilder50_3("Show the measured jitter (±ms) next to the ping.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.moduleManager_r = BreezeClient.getModuleManager();
      this.dataBuilder14_s = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.LEFT, rip.breeze.AimYawMode2.TOP, 5.0, 5.0);
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_s;
   }

   private int calculate_3() {
      return 6 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_4() {
      return 4 * this.moduleManager_r.fieldInt_l;
   }

   private int getValue() {
      return BreezeClient.getConfigManager().getDataBuilder31_j().getValue();
   }

   private boolean checkCondition() {
      long var1 = 96662274338103L;
      return BreezeClient.getClickGUI() != null && BreezeClient.getClickGUI().isBool_f();
   }

   private String buildString() {
      long var1 = 99889125003835L;
      int var3 = this.getValue();
      if (var3 < 0) {
         return this.checkCondition() ? "42ms" : "--";
      } else {
         return var3 + "ms";
      }
   }

   private String buildString_2() {
      long var1 = 48605222543387L;
      if (!this.dataBuilder54_q.getObject_m()) {
         return "";
      }

      int var3 = BreezeClient.getConfigManager().getDataBuilder31_j().getValue_5();
      return this.getValue() < 0 && !this.checkCondition() ? "" : "  +-" + (this.getValue() < 0 ? 3 : var3);
   }

   public int calculate_3() {
      long var1 = 103577559919591L;
      return this.calculate_3()
         + this.moduleManager_r.dataBuilder46_j.clamp_8("Ping:")
         + this.moduleManager_r.fieldInt_l * 4
         + this.moduleManager_r.dataBuilder46_j.clamp_8(this.buildString())
         + this.moduleManager_r.dataBuilder46_j.clamp_8(this.buildString_2())
         + this.calculate_3();
   }

   public int calculate_4() {
      return this.calculate_4() + this.moduleManager_r.fieldInt_k + this.calculate_4();
   }

   public void calculate_5(List<Util8> var1) {
      long var2 = 123025407946278L;
      if (this.backgroundSetting.getObject_m()) {
         int var4 = (int)(5 * this.moduleManager_r.fieldInt_l * this.roundingSetting.getObject_m());
         var1.add(new Util8(this.dataBuilder14_s.clamp_2(), this.dataBuilder14_s.clamp_3(), this.calculate_3(), this.calculate_4(), var4));
      }
   }

   public void calculate_6() {
      long var1 = 83095202467719L;
      int var3 = this.dataBuilder14_s.clamp_2() + this.calculate_3();
      int var4 = this.dataBuilder14_s.clamp_3() + this.calculate_4();
      String var5 = this.buildString();
      boolean var6 = this.getValue() >= 0 || this.checkCondition();
      Color var7 = !var6 ? Color.GRAY : (this.jitterSetting.getObject_m() ? clamp(this.getValue() < 0 ? 42 : this.getValue()) : Color.WHITE);
      this.moduleManager_r.dataBuilder46_j.update(var3, var4, "Ping:", Color.LIGHT_GRAY);
      int var8 = var3 + this.moduleManager_r.fieldInt_l * 4 + this.moduleManager_r.dataBuilder46_j.clamp_8("Ping:");
      this.moduleManager_r.dataBuilder46_j.update(var8, var4, var5, var7);
      String var9 = this.buildString_2();
      if (!var9.isEmpty()) {
         int var10 = var8 + this.moduleManager_r.dataBuilder46_j.clamp_8(var5);
         this.moduleManager_r.dataBuilder46_j.update(var10, var4, var9, new Color(140, 140, 140));
      }
   }

   private static Color clamp(int var0) {
      long var1 = 11447004924406L;
      float var3 = Math.min(1.0F, Math.max(0.0F, var0 / 250.0F));
      if (var3 <= 0.5F) {
         float var5 = var3 * 2.0F;
         return new Color((int)(255.0F * var5), 220, 60);
      } else {
         float var4 = (var3 - 0.5F) * 2.0F;
         return new Color(255, (int)(220.0F * (1.0F - var4)), 60);
      }
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.backgroundSetting.getObject_m();
   }

   static {
      long var0 = 49405492493398L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "R\u009b?¹\u008b·\u0011*fÌ§\u0018ÿº\u0084\u0081\u0010Z¹«\u0095Ç\u0017¨_¡ÑÂ¹\u009bó\u0093\u007f ÓT\u0087þ\u007f\u0081Ö#\u001d§9Kßa^¨?5aÊ\u001e\u0082©wÂMG\u0099º\u008fC\u0091\u0010²ÿ\u0086\u0005\u008f ÷Ø\u0081ú%ÁßÂ\\\u009c\u0010IéÛ²\\\u009eÛøÍs1éã\u0080\u0095eXZ\u0097ü>óNÒÃ*\u0006F§ªòÃh¯aW\u0012\u0001\u007fðÐh¥f\u0089\\\u0090\u0015c\u0087\u0012Â?üRYÙ¯Æ\u0005õ\u0087ü\u0005îá\u001e\u008e\u0099×|M1éc\u0086Èô^Ç[LëÑ\u0017¼,sMã¸\u009eá¨¡7#\u0088à(DE4ó] ì'ý\u009boã©¼\u001a\u007fcp\u001feû¼q\u0098\u0084N\u0003¬¢\u009b'Þ©?:G\n\u0099\u0010*9\u0092:\u009a£\u0003\u008e¿ªrñÐ)cB\u0010\u0086\u0012/\u009biu\u009bÍè·y\r2\rÔ P\u0089ÊmL©\u0000\"¸Ô\u0017\u008eH\u0096\u007f¨¯û*A8\u0019\rci\\\u0099u\u0096§YHB\u0096\u0092h¬z)\u001b6.°\u001f\u0092Ú\u009d¤]«\u0001Ï\u0014\u0084\u000e2¦l\u00978õ³´L\u001f~$BÓ|ÄlXA-ªÞï\u0089`%\u0010W»[çCíV<\u001c©ix\u0086Þ¯î@õ8ÎmS\u0015\u001a0Ù\u008a$ê¢`Å[i\u0087§\u000bG\u009b1÷+¢\u009c\u009fÃ¸ìKiùk¬\u007fÊ\u0089\u0094U¡\u00155=!´\u008e\u009dN\u0090ùôfF¨+Va\u0090þ\u008f\u0096Ó@\u0012jð\u0010uË\u008d\nêK\u0005GÚp~Ú=Ý«P\u001f\u0090\u0007¨\u000e)ßR½ÿ\u00adG\u0007×¸¤'\u009fÕ\b=\u0099[z}\u001c\u0016¿Ýß\f´!²×\u008a¿ì\u009dÛ|l\u0086f";
      int var7 = "R\u009b?¹\u008b·\u0011*fÌ§\u0018ÿº\u0084\u0081\u0010Z¹«\u0095Ç\u0017¨_¡ÑÂ¹\u009bó\u0093\u007f ÓT\u0087þ\u007f\u0081Ö#\u001d§9Kßa^¨?5aÊ\u001e\u0082©wÂMG\u0099º\u008fC\u0091\u0010²ÿ\u0086\u0005\u008f ÷Ø\u0081ú%ÁßÂ\\\u009c\u0010IéÛ²\\\u009eÛøÍs1éã\u0080\u0095eXZ\u0097ü>óNÒÃ*\u0006F§ªòÃh¯aW\u0012\u0001\u007fðÐh¥f\u0089\\\u0090\u0015c\u0087\u0012Â?üRYÙ¯Æ\u0005õ\u0087ü\u0005îá\u001e\u008e\u0099×|M1éc\u0086Èô^Ç[LëÑ\u0017¼,sMã¸\u009eá¨¡7#\u0088à(DE4ó] ì'ý\u009boã©¼\u001a\u007fcp\u001feû¼q\u0098\u0084N\u0003¬¢\u009b'Þ©?:G\n\u0099\u0010*9\u0092:\u009a£\u0003\u008e¿ªrñÐ)cB\u0010\u0086\u0012/\u009biu\u009bÍè·y\r2\rÔ P\u0089ÊmL©\u0000\"¸Ô\u0017\u008eH\u0096\u007f¨¯û*A8\u0019\rci\\\u0099u\u0096§YHB\u0096\u0092h¬z)\u001b6.°\u001f\u0092Ú\u009d¤]«\u0001Ï\u0014\u0084\u000e2¦l\u00978õ³´L\u001f~$BÓ|ÄlXA-ªÞï\u0089`%\u0010W»[çCíV<\u001c©ix\u0086Þ¯î@õ8ÎmS\u0015\u001a0Ù\u008a$ê¢`Å[i\u0087§\u000bG\u009b1÷+¢\u009c\u009fÃ¸ìKiùk¬\u007fÊ\u0089\u0094U¡\u00155=!´\u008e\u009dN\u0090ùôfF¨+Va\u0090þ\u008f\u0096Ó@\u0012jð\u0010uË\u008d\nêK\u0005GÚp~Ú=Ý«P\u001f\u0090\u0007¨\u000e)ßR½ÿ\u00adG\u0007×¸¤'\u009fÕ\b=\u0099[z}\u001c\u0016¿Ýß\f´!²×\u008a¿ì\u009dÛ|l\u0086f"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var21 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var21;
                  if ((var12 += var8) >= var7) {
                     CONST_V = var4;
                     CONST_W = new String[15];
                     short var15 = 21045;
                     long var19 = 9183770468195395158L ^ var0;
                     CONST_T = "Ping:";
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var21;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "hè·\u008e\u0099\u009e\u0001äÿZc¾[]o$\u0010Óµõ.°Qºoí).)\u0099®ÑÌ";
                  var7 = "hè·\u008e\u0099\u009e\u0001äÿZc¾[]o$\u0010Óµõ.°Qºoí).)\u0099®ÑÌ".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18488;
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
            throw new RuntimeException("rip/breeze/client/dA", var10);
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
         CONST_W[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/dA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
