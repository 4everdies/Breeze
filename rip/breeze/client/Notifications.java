package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(a = "Notifications", d = rip.breeze.ModuleCategory.HUD, b = "Shows notifications.")
public class Notifications extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final CopyOnWriteArrayList<Util120> copyOnWriteArrayList_n;
   private final GenericSetting<Double> dataBuilder54_o;
   private final GenericSetting<Boolean> dataBuilder54_p;
   private final GenericSetting<Double> roundingSetting;
   private final ModuleManager moduleManager_r;
   private final rip.breeze.RotationUtil8 dataBuilder14_s;
   private int fieldInt_t;
   private static final Util120 CONST_U;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);
   private static final long eka_1;

   public Notifications() {
      long var1 = 128737175986782L;
      super(false, false);
      this.copyOnWriteArrayList_n = new CopyOnWriteArrayList<>();
      short var10002 = 21323;
      long var10003 = 7957668248656782273L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Stay Time");
      var10002 = 6345;
      var10003 = 4317764598169299015L ^ var1;
      this.dataBuilder54_o = var10001.getDataBuilder50_3("How long each notification stays on screen (seconds).")
         .getDataBuilder50_4(2.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.5, 10.0))
         .getDataBuilder54();
      var10002 = 7530;
      var10003 = 1961962429709020641L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Toggle Notifications");
      var10002 = 27333;
      var10003 = 3336016089233365578L ^ var1;
      this.dataBuilder54_p = var10001.getDataBuilder50_3("Show a notification when a module is toggled.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 26887;
      var10003 = 6057034857962838415L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 1296;
      var10003 = 2342537132039861660L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("How much to round the corners.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder54();
      this.moduleManager_r = BreezeClient.getModuleManager();
      this.dataBuilder14_s = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.RIGHT, rip.breeze.AimYawMode2.BOTTOM, 10.0, 10.0);
      this.fieldInt_t = -1;
   }

   public void processAll(String var1, String var2) {
      this.calculate(new Util120(var1, var2));
   }

   public void processAll_1(String var1, String var2, Object var3) {
      this.calculate(new Util120(var1, var2, var3));
   }

   private void calculate(Util120 var1) {
      long var2 = 35679515829491L;
      int[] var4 = ModuleList.values();
      if (this.f()) {
         if (BreezeClient.CONST_A.thePlayer != null) {
            if (var1.object_c != null) {
               for (Util120 var6 : this.copyOnWriteArrayList_n) {
                  if (var1.object_c.equals(var6.object_c)
                     && !var6.dataBuilder112_g.isValid(this.dataBuilder54_o.getObject_m().intValue() * 1000L)
                     && var6.dataBuilder15_h.isBool_e()) {
                     var6.string_a = var1.string_a;
                     var6.dataBuilder112_g.getDataBuilder112();
                     var6.fieldBool_j = false;
                     return;
                  }

                  if (var4 == null) {
                     break;
                  }
               }
            }

            this.copyOnWriteArrayList_n.add(var1);
         }
      }
   }

   public boolean checkCondition() {
      long var1 = 30127923647919L;
      return this.dataBuilder54_p.getObject_m() && this.f();
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_s;
   }

   public int getValue() {
      long var1 = 103577559919591L;
      this.clamp_3(CONST_U);
      int var3 = CONST_U.fieldInt_d;
      int[] var10000 = ModuleList.values();
      Iterator var4 = this.copyOnWriteArrayList_n.iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         Util120 var6 = (Util120)var4.next();
         if (var6.fieldInt_d > var3) {
            var3 = var6.fieldInt_d;
         }

         if (var5 == null) {
            break;
         }
      }

      return var3;
   }

   public int clamp() {
      return Math.max(1, this.copyOnWriteArrayList_n.size()) * this.calculate_6();
   }

   public void calculate_2(List<Util8> var1) {
      long var2 = 123025407946278L;
      long var4 = var2 ^ 102503777889241L;
      int[] var6 = ModuleList.values();
      if (this.checkCondition_2()) {
         this.clamp_3(CONST_U);
         int var13 = this.isValid() ? this.dataBuilder14_s.clamp_2() + this.getValue() - CONST_U.fieldInt_d : this.dataBuilder14_s.clamp_2();
         int var14 = this.isValid_2() ? this.dataBuilder14_s.clamp_3() + this.clamp() - this.calculate_5() : this.dataBuilder14_s.clamp_3();
         var1.add(new Util8(var13, var14, CONST_U.fieldInt_d, this.calculate_5(), this.calculateFloat()));
      } else {
         this.calculate_4();

         for (Util120 var8 : this.copyOnWriteArrayList_n) {
            this.clamp_3(var8);
            float var9 = (float)var8.dataBuilder15_h.getDouble(var4);
            if (!(var9 <= 0.001F)) {
               int var10 = (int)(var9 * var8.fieldInt_d);
               int var11 = this.isValid() ? this.dataBuilder14_s.clamp_2() + this.getValue() - var10 : this.dataBuilder14_s.clamp_2();
               int var12 = (int)var8.fieldFloat_e;
               var1.add(new Util8(var11, var12, var10, this.calculate_5(), this.calculateFloat()));
               if (var6 == null) {
                  break;
               }
            }
         }
      }
   }

   public void clamp_2() {
      long var1 = 83095202467719L;
      long var3 = var1 ^ 32377568054691L;
      long var5 = var1 ^ 133371837500024L;
      int[] var7 = ModuleList.values();
      if (this.checkCondition_2()) {
         this.clamp_3(CONST_U);
         boolean var21 = this.isValid();
         int var22 = CONST_U.fieldInt_d;
         int var23 = var21 ? this.dataBuilder14_s.clamp_2() + this.getValue() - var22 : this.dataBuilder14_s.clamp_2();
         int var24 = this.isValid_2() ? this.dataBuilder14_s.clamp_3() + this.clamp() - this.calculate_5() : this.dataBuilder14_s.clamp_3();
         float var25 = this.calculateFloat();
         int var26 = this.calculate_8();
         int var27 = var21 ? var23 : var23 + var22 - var26;
         this.processNullable(var27, var24, var26, var25, 0.0F, var21);
         this.calculate_3(CONST_U, var23, var24);
      } else {
         boolean var8 = this.isValid();

         for (Util120 var10 : this.copyOnWriteArrayList_n) {
            float var11 = (float)var10.dataBuilder15_h.getDouble(var5);
            float var12 = (float)var10.dataBuilder15_i.calculateDouble(var3);
            if (!(var11 <= 0.001F)) {
               int var13 = (int)(var11 * var10.fieldInt_d);
               int var14 = var8 ? this.dataBuilder14_s.clamp_2() + this.getValue() - var13 : this.dataBuilder14_s.clamp_2();
               int var15 = (int)var10.fieldFloat_e;
               float var16 = this.calculateFloat();
               float var17 = var16 * Math.max(0.0F, 1.0F - var12 * 2.0F);
               if (var12 != 0.0F) {
                  this.calculate_3(var10, var14, var15);
               }

               this.moduleManager_r.initialize_5();
               int var18 = this.calculate_8();
               int var19 = Math.max(var18, (int)(var10.fieldInt_d * (1.0F - var12) + var18));
               var19 = Math.min(var19, var13);
               if (var19 > 1) {
                  int var20 = var8 ? var14 : var14 + var13 - var19;
                  this.processNullable(var20, var15, var19, var16, var17, var8);
               }

               if (var7 == null) {
                  break;
               }
            }
         }
      }
   }

   private void processNullable(int var1, int var2, int var3, float var4, float var5, boolean var6) {
      long var7 = 105627496541333L;
      int[] var9 = ModuleList.values();
      if (var6) {
         RenderUtil28.render_3(var1, var2, var3, this.calculate_5(), var4, var5, var5, var4, 1.0F);
         if (var9 != null) {
            return;
         }
      }

      RenderUtil28.render_3(var1, var2, var3, this.calculate_5(), var5, var4, var4, var5, 1.0F);
   }

   private void calculate_3(Util120 var1, int var2, int var3) {
      Color var4 = new Color(255, 255, 255, 255);
      Color var5 = new Color(190, 190, 190, 255);
      int var6 = this.moduleManager_r.fieldInt_k;
      int var7 = (int)(var2 + this.calculate_7() * 0.5F + this.calculate_8());
      int var8 = var3 + (this.calculate_5() / 2 - var6) - this.moduleManager_r.fieldInt_l;
      int var9 = var3 + this.calculate_5() / 2 + this.moduleManager_r.fieldInt_l;
      this.moduleManager_r.dataBuilder46_j.calculate(var7, var8, RenderUtil18_x.GLOW + var1.string_b, var4, false);
      this.moduleManager_r.dataBuilder46_j.calculate(var7, var9, var1.string_a, var5, false);
   }

   private void calculate_4() {
      long var1 = 119443566264210L;
      long var3 = var1 ^ 64061553360310L;
      long var5 = var1 ^ 106637951809189L;
      long var7 = var1 ^ 103886932130413L;
      int[] var10000 = ModuleList.values();
      long var9 = (long)(this.dataBuilder54_o.getObject_m() * 1000.0);
      boolean var11 = this.isValid_2();
      int[] var12 = var10000;
      int var13 = var11 ? this.dataBuilder14_s.clamp_3() + this.clamp() - this.calculate_5() : this.dataBuilder14_s.clamp_3();

      for (Util120 var15 : this.copyOnWriteArrayList_n) {
         if (!var15.fieldBool_j && var15.dataBuilder15_h.isBool_e() && var15.dataBuilder15_h.calculateDouble(var3) == 1.0 && !var15.dataBuilder15_i.isBool_e()) {
            var15.dataBuilder15_i.toggle(var5, true);
         }

         if (!var15.fieldBool_j && var15.dataBuilder15_h.isBool_e() && var15.dataBuilder112_g.isValid(var9)) {
            var15.fieldBool_j = true;
            var15.dataBuilder15_i.toggle(var5, false);
         }

         if (var15.fieldBool_j && var15.dataBuilder15_i.calculateDouble(var3) < 0.01) {
            var15.dataBuilder15_h.toggle(var5, false);
         }

         if (!var15.fieldBool_f) {
            var15.fieldFloat_e = var13;
            var15.fieldBool_f = true;
         }

         label44: {
            var15.fieldFloat_e = var15.fieldFloat_e + (var13 - var15.fieldFloat_e) * 0.25F;
            float var16 = (float)var15.dataBuilder15_h.getDouble(var7);
            if (var11) {
               var13 -= (int)(var16 * this.calculate_6());
               if (var12 != null) {
                  break label44;
               }
            }

            var13 += (int)(var16 * this.calculate_6());
         }

         if (var12 == null) {
            break;
         }
      }

      this.copyOnWriteArrayList_n.removeIf(Notifications::lambda$tickNotifications_Inner0);
   }

   private void clamp_3(Util120 var1) {
      long var2 = 19385007752059L;
      int[] var4 = ModuleList.values();
      if (this.moduleManager_r.fieldInt_l != this.fieldInt_t) {
         this.fieldInt_t = this.moduleManager_r.fieldInt_l;

         for (Util120 var6 : this.copyOnWriteArrayList_n) {
            var6.fieldInt_d = 0;
            if (var4 == null) {
               break;
            }
         }

         CONST_U.fieldInt_d = 0;
      }

      if (var1.fieldInt_d == 0) {
         int var7 = this.moduleManager_r.dataBuilder46_j.clamp_8(var1.string_b);
         int var8 = this.moduleManager_r.dataBuilder46_j.clamp_8(var1.string_a);
         var1.fieldInt_d = (int)(Math.max(var7, var8) + this.calculate_7() * 1.5F + this.calculate_8());
      }
   }

   private boolean checkCondition_2() {
      long var1 = 36592987569108L;
      return BreezeClient.getClickGUI() != null && BreezeClient.getClickGUI().isBool_f();
   }

   private boolean isValid() {
      long var1 = 129458221576385L;
      rip.breeze.AimYawMode var3 = this.dataBuilder14_s.getAimYawMode_g();
      if (var3 == rip.breeze.AimYawMode.RIGHT) {
         return true;
      } else {
         return var3 == rip.breeze.AimYawMode.LEFT ? false : this.dataBuilder14_s.clamp_2() + this.getValue() / 2 > BreezeClient.CONST_A.displayWidth / 2;
      }
   }

   private boolean isValid_2() {
      long var1 = 84392414808090L;
      rip.breeze.AimYawMode2 var3 = this.dataBuilder14_s.getAimYawMode2_f();
      if (var3 == rip.breeze.AimYawMode2.BOTTOM) {
         return true;
      } else {
         return var3 == rip.breeze.AimYawMode2.TOP ? false : this.dataBuilder14_s.clamp_3() + this.clamp() / 2 > BreezeClient.CONST_A.displayHeight / 2;
      }
   }

   private int calculate_5() {
      return 30 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_6() {
      return 33 * this.moduleManager_r.fieldInt_l;
   }

   private float calculateFloat() {
      return 2.5F * this.moduleManager_r.fieldInt_l * this.roundingSetting.getObject_m().floatValue();
   }

   private int calculate_7() {
      return 8 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_8() {
      return 5 * this.moduleManager_r.fieldInt_l;
   }

   private static boolean lambda$tickNotifications_Inner0(Util120 var0) {
      long var1 = 22816539566256L;
      long var3 = var1 ^ 72709548253844L;
      return !var0.dataBuilder15_h.isBool_e() && var0.dataBuilder15_h.calculateDouble(var3) < 0.001;
   }

   static {
      long var0 = 135787650443351L;
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
      String var6 = ";6w¦\u001ejøWi\u001eéå6qÕ\u0099`\u001bÅ%C\u0013¤!\u009a;S¯\u0001Å,QÐêY\u0083Aò+\u0090ö1wPHg-þ²C\u001fì\u0093C\rÖü²\u0003\u0001N£3V\u0088ã±H@\u000f\u0006 \u0011\u0010y·\u0085`pBõn£h\u009b÷Çç`ã¨\u001d\u001f\bi'\u00016\u001dú\u009b¢\u0092i^\u001e=ª\u0000\u0013Ñ¦ãm\u0093dÔA\u000bæV\u0005¤9B\u0085ÈD.ØukÚýÈÑ;E\u0001tbÌÎ´\u009cøÖR\u0083hn\u0091Ky·Æ\u0085Ñ?iêæï¢KÍîjDb]Reú5GXd\u0001Bü7×Ür\u0010ÏÉ\u0003ëÚÍP.5gÈóÒ\u0011át8z\u000bÃ\u0015<\u001e\u0011\u008fçsUñ´¢\u0015\u0007#\u009akTA¢î\u008dÄÚz\u0011Â\f\u009eU\u009a¬ý\u008dð3þÒ¨¿wC\"n]F¨bË88\u001eÛü(8(ÖyÚúÙ\u0012\u001faÁ¾\t®\u008bd\u0004\u009eù\u009cÉ}@\u0007þ¨\u0085Ó²Tì\u0006/\u0091i\b{\u001c@à %÷áCJ\u007f\u0090¡«Âh\u009eIL¦¶J|\u0012\u0091\u000f\u0019î¬\u0092××þ%\u000f¢1";
      int var7 = ";6w¦\u001ejøWi\u001eéå6qÕ\u0099`\u001bÅ%C\u0013¤!\u009a;S¯\u0001Å,QÐêY\u0083Aò+\u0090ö1wPHg-þ²C\u001fì\u0093C\rÖü²\u0003\u0001N£3V\u0088ã±H@\u000f\u0006 \u0011\u0010y·\u0085`pBõn£h\u009b÷Çç`ã¨\u001d\u001f\bi'\u00016\u001dú\u009b¢\u0092i^\u001e=ª\u0000\u0013Ñ¦ãm\u0093dÔA\u000bæV\u0005¤9B\u0085ÈD.ØukÚýÈÑ;E\u0001tbÌÎ´\u009cøÖR\u0083hn\u0091Ky·Æ\u0085Ñ?iêæï¢KÍîjDb]Reú5GXd\u0001Bü7×Ür\u0010ÏÉ\u0003ëÚÍP.5gÈóÒ\u0011át8z\u000bÃ\u0015<\u001e\u0011\u008fçsUñ´¢\u0015\u0007#\u009akTA¢î\u008dÄÚz\u0011Â\f\u009eU\u009a¬ý\u008dð3þÒ¨¿wC\"n]F¨bË88\u001eÛü(8(ÖyÚúÙ\u0012\u001faÁ¾\t®\u008bd\u0004\u009eù\u009cÉ}@\u0007þ¨\u0085Ó²Tì\u0006/\u0091i\b{\u001c@à %÷áCJ\u007f\u0090¡«Âh\u009eIL¦¶J|\u0012\u0091\u000f\u0019î¬\u0092××þ%\u000f¢1"
         .length();
      char var8 = 'X';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_W = var4;
                     CONST_X = new String[8];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 1474921273085483265L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     1000L = var30;
                     short var31 = 14101;
                     long var33 = 1845059486439361941L ^ var0;
                     short var34 = 24038;
                     long var10004 = 3319768955787683682L ^ var0;
                     CONST_U = new Util120("Example notification", "Breeze");
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "\u0003Ç\u0085[æM \u007fëÙ=\u008bø ? \u0013\u0083\u0089j\u001c\u001bð¦\u008dóês¾\u0080\u007fçÐ\u0095ÕHm3ÿ°\u0018}&\u0010ZU\ttc¯Á\u0082è\u0011[z?\"¿?|;~¶7";
                  var7 = "\u0003Ç\u0085[æM \u007fëÙ=\u008bø ? \u0013\u0083\u0089j\u001c\u001bð¦\u008dóês¾\u0080\u007fçÐ\u0095ÕHm3ÿ°\u0018}&\u0010ZU\ttc¯Á\u0082è\u0011[z?\"¿?|;~¶7"
                     .length();
                  var8 = '(';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4817;
      if (CONST_X[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Y.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dz", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_W[var3].getBytes("ISO-8859-1");
         CONST_X[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_X[var3];
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
         throw new RuntimeException("rip/breeze/client/dz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
