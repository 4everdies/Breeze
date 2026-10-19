package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "ToggleUI",
   b = "Navigate and toggle modules from the HUD with arrow keys.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"toggle", "quick", "switch", "navigate", "tabgui"}
)
public class ToggleUI extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private static final rip.breeze.ModuleCategory[] CONST_N;
   private static final int CONST_O;
   private static final int CONST_P;
   private final GenericSetting<Double> roundingSetting;
   private final ModuleManager moduleManager_r;
   private final rip.breeze.RotationUtil8 dataBuilder14_s;
   private int fieldInt_t;
   private int fieldInt_u;
   private boolean fieldBool_v;
   private float fieldFloat_w;
   private final float[] arr_x;
   private final AnimationTimer dataBuilder15_y;
   private long fieldLong_z;
   private final ArrayList<BreezeModule> arrayList_A;
   private final ArrayList<rip.breeze.ImageUtil15> arrayList_B;
   private int fieldInt_C;
   private int fieldInt_D;
   private int fieldInt_E;
   private long fieldLong_F;
   private static final String[] CONST_H;
   private static final String[] CONST_I;
   private static final Map CONST_J = new HashMap(13);
   private static final long[] CONST_K;
   private static final Integer[] CONST_L;
   private static final Map CONST_M;
   private static final long eka_1;

   public ToggleUI() {
      long var1 = 20835498621813L;
      super(false, false);
      short var10002 = 20547;
      long var10003 = 2461948146944096258L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 8138;
      var10003 = 5423748756579514249L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the panels.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder54();
      this.moduleManager_r = BreezeClient.getModuleManager();
      this.dataBuilder14_s = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.LEFT, rip.breeze.AimYawMode2.CENTER, 10.0, 0.0);
      this.fieldInt_t = 0;
      this.fieldInt_u = 0;
      this.fieldBool_v = false;
      this.fieldFloat_w = 0.0F;
      this.arr_x = new float[CONST_P];
      this.dataBuilder15_y = new AnimationTimer(200.0F, false, EnumType3.QUART_OUT);
      this.fieldLong_z = System.nanoTime();
      this.arrayList_A = new ArrayList<>();
      this.arrayList_B = new ArrayList<>();
      this.fieldInt_C = -1;
      this.fieldInt_D = -1422429354;
      this.fieldInt_E = 930632217;
      this.fieldLong_F = -9223372036854775808L;
   }

   public int calculate() {
      long var1 = 103577559919591L;
      this.processNullable();
      int var3 = this.calculate_5() + this.fieldInt_D + 2 * this.calculate_6() + 5 * BreezeClient.getModuleManager().fieldInt_l;
      return this.fieldBool_v ? var3 + this.calculate_8() + this.fieldInt_E + 2 * this.calculate_6() : var3;
   }

   public int calculate_2() {
      return CONST_P * this.calculate_7();
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_s;
   }

   public void calculate_3(List<Util8> var1) {
      long var2 = 123025407946278L;
      long var4 = var2 ^ 102503777889241L;
      this.processNullable();
      float var6 = this.calculateFloat();
      int var7 = this.calculate_5() + this.fieldInt_D + 2 * this.calculate_6() + 5 * this.moduleManager_r.fieldInt_l;
      var1.add(new Util8(this.dataBuilder14_s.clamp_2(), this.dataBuilder14_s.clamp_3(), var7, this.calculate_2(), var6));
      if (this.fieldBool_v || this.dataBuilder15_y.getDouble(var4) > 0.01) {
         int var8 = (int)((this.fieldInt_E + 2 * this.calculate_6() + 5 * this.moduleManager_r.fieldInt_l) * this.dataBuilder15_y.getDouble(var4));
         int var9 = this.dataBuilder14_s.clamp_2() + var7 + this.calculate_8();
         int var10 = this.getValue() * this.calculate_7();
         var1.add(new Util8(var9, this.dataBuilder14_s.clamp_3(), var8, var10, var6));
      }
   }

   public void clamp() {
      long var1 = 83095202467719L;
      long var3 = var1 ^ 78948317546160L;
      long var5 = var1 ^ 133371837500024L;
      int[] var10000 = ModuleList.values();
      this.processNullable();
      long var7 = System.nanoTime();
      float var9 = Math.min((float)(var7 - this.fieldLong_z) / 1000000.0F, 100.0F);
      this.fieldLong_z = var7;
      float var10 = (float)(1.0 - Math.pow(0.5, var9 / 30.0F));
      int var11 = 0;
      int[] var12 = var10000;

      while (var11 < CONST_P) {
         this.arr_x[var11] = this.arr_x[var11] + ((var11 == this.fieldInt_t ? 1.0F : 0.0F) - this.arr_x[var11]) * var10;
         var11++;
         if (var12 == null) {
            break;
         }
      }

      this.fieldFloat_w = this.fieldFloat_w + (this.fieldInt_u - this.fieldFloat_w) * var10;
      this.dataBuilder15_y.toggle(var3, this.fieldBool_v);
      Color var30 = Color.WHITE;
      Color var13 = new Color(220, 220, 220, 255);
      Color var14 = new Color(0, 0, 0, 70);
      int var15 = this.dataBuilder14_s.clamp_2();
      int var16 = this.dataBuilder14_s.clamp_3();
      float var17 = this.calculateFloat();
      int var18 = this.calculate_5() + this.fieldInt_D + 2 * this.calculate_6() + 5 * this.moduleManager_r.fieldInt_l;
      int var19 = 0;

      while (var19 < CONST_P) {
         int var20 = var16 + var19 * this.calculate_7();
         float var21 = this.arr_x[var19];
         if (var21 > 0.005F) {
            int var22 = var21 >= 0.99F ? var18 : Math.min(var18, (int)Math.ceil(var21 * var18));
            float var23 = var19 == 0 ? var17 : 0.0F;
            float var24 = var19 == CONST_P - 1 ? var17 : 0.0F;
            if (var22 > 0) {
               RenderUtil28.render_3(var15, var20, var22, this.calculate_7(), var23, var23, var24, var24, 1.0F);
            }
         }

         float var34 = var21 * 5.0F * this.moduleManager_r.fieldInt_l;
         float var36 = var15 + this.calculate_6() + var34;
         float var38 = var20 + (this.calculate_7() - this.moduleManager_r.fieldInt_k) * 0.5F;
         this.moduleManager_r.dataBuilder46_j.calculate(var36, var38, this.getString(var19), var30, false);
         var19++;
         if (var12 == null) {
            break;
         }
      }

      float var31 = (float)this.dataBuilder15_y.getDouble(var5);
      if (var31 > 0.01F) {
         int var32 = this.fieldInt_E + 2 * this.calculate_6() + 5 * this.moduleManager_r.fieldInt_l;
         int var33 = var15 + var18 + this.calculate_8();
         int var35 = (int)(var31 * var32);
         if (var35 < 2) {
            var35 = 2;
         }

         int var37 = this.getValue();
         if (this.fieldBool_v && var37 > 0) {
            float var39 = this.fieldFloat_w;
            float var25 = var16 + var39 * this.calculate_7();
            var25 = Math.max(var16, Math.min(var16 + (var37 - 1) * this.calculate_7(), var25));
            float var26 = var39 < 0.5F ? var17 : 0.0F;
            float var27 = var39 < 0.5F ? var17 : 0.0F;
            float var28 = var39 > var37 - 1.5F ? var17 : 0.0F;
            float var29 = var39 > var37 - 1.5F ? var17 : 0.0F;
            RenderUtil28.render_1(var33, var25, var35, this.calculate_7(), var26, var27, var28, var29, var14);
         }

         if (var31 > 0.5F) {
            float var40 = (var31 - 0.5F) / 0.5F;
            if (this.isValid()) {
               int var42 = 0;

               while (var42 < var37) {
                  label109: {
                     rip.breeze.ImageUtil15 var44 = this.arrayList_B.get(var42);
                     float var46 = var42 == this.fieldInt_u ? 5.0F * this.moduleManager_r.fieldInt_l : 0.0F;
                     float var48 = var16 + var42 * this.calculate_7() + (this.calculate_7() - this.moduleManager_r.fieldInt_k) * 0.5F;
                     if (var44.isValid()) {
                        String var50 = RenderUtil18_x.ACCENT + RenderUtil18_x.GLOW.toString() + var44.getString_m();
                        this.moduleManager_r.dataBuilder46_j.calculate(var33 + this.calculate_6() + var46, var48, var50, var30, false);
                        if (var12 != null) {
                           break label109;
                        }
                     }

                     Color var51 = new Color(var13.getRed(), var13.getGreen(), var13.getBlue(), (int)(var13.getAlpha() * var40));
                     this.moduleManager_r.dataBuilder46_j.calculate(var33 + this.calculate_6() + var46, var48, var44.getString_m(), var51, false);
                  }

                  var42++;
                  if (var12 == null) {
                     break;
                  }
               }

               if (var12 != null) {
                  return;
               }
            }

            int var43 = 0;

            while (var43 < var37) {
               label94: {
                  BreezeModule var45 = this.arrayList_A.get(var43);
                  float var47 = var43 == this.fieldInt_u ? 5.0F * this.moduleManager_r.fieldInt_l : 0.0F;
                  float var49 = var16 + var43 * this.calculate_7() + (this.calculate_7() - this.moduleManager_r.fieldInt_k) * 0.5F;
                  if (var45.isValid()) {
                     String var52 = RenderUtil18_x.ACCENT + RenderUtil18_x.GLOW.toString() + var45.moduleName;
                     this.moduleManager_r.dataBuilder46_j.calculate(var33 + this.calculate_6() + var47, var49, var52, var30, false);
                     if (var12 != null) {
                        break label94;
                     }
                  }

                  Color var53 = new Color(var13.getRed(), var13.getGreen(), var13.getBlue(), (int)(var13.getAlpha() * var40));
                  this.moduleManager_r.dataBuilder46_j.calculate(var33 + this.calculate_6() + var47, var49, var45.moduleName, var53, false);
               }

               var43++;
               if (var12 == null) {
                  break;
               }
            }
         }
      }
   }

   @EventListener
   public void calculate_4(KeyPressedEvent var1) {
      long var2 = 105092174134704L;
      int[] var4 = ModuleList.values();
      if (BreezeClient.CONST_A.currentScreen == null) {
         switch (var1.fieldInt_h) {
            case 200:
               if (this.fieldBool_v) {
                  if (this.fieldInt_u <= 0) {
                     break;
                  }

                  this.fieldInt_u--;
                  if (var4 != null) {
                     break;
                  }
               }

               this.fieldInt_t = (this.fieldInt_t - 1 + CONST_P) % CONST_P;
               this.processNullable_2();
               if (var4 != null) {
                  break;
               }
            case 208:
               if (this.fieldBool_v) {
                  if (this.fieldInt_u >= this.getValue() - 1) {
                     break;
                  }

                  this.fieldInt_u++;
                  if (var4 != null) {
                     break;
                  }
               }

               this.fieldInt_t = (this.fieldInt_t + 1) % CONST_P;
               this.processNullable_2();
               if (var4 != null) {
                  break;
               }
            case 203:
               if (!this.fieldBool_v) {
                  break;
               }

               this.fieldBool_v = false;
               if (var4 != null) {
                  break;
               }
            case 205:
               if (!this.fieldBool_v && this.getValue() > 0) {
                  this.fieldBool_v = true;
                  this.fieldInt_u = 0;
                  this.fieldFloat_w = 0.0F;
                  if (var4 != null) {
                     break;
                  }
               }
            case 28:
               if (this.fieldBool_v && !var1.fieldBool_i && this.getValue() > 0) {
                  if (this.isValid()) {
                     this.arrayList_B.get(this.fieldInt_u).update_4();
                     if (var4 != null) {
                        return;
                     }
                  }

                  this.arrayList_A.get(this.fieldInt_u).processAll();
               }
         }
      }
   }

   private boolean isValid() {
      long var1 = 50659672037064L;
      return this.fieldInt_t == CONST_O;
   }

   private String getString(int var1) {
      long var2 = 133421442881354L;
      return var1 < CONST_N.length ? CONST_N[var1].name : "Scripts";
   }

   private int getValue() {
      long var1 = 105883758633590L;
      return this.isValid() ? this.arrayList_B.size() : this.arrayList_A.size();
   }

   private void processNullable() {
      long var1 = 57604044357811L;
      int[] var10000 = ModuleList.values();
      long var3 = Minecraft.getSystemTime();
      int[] var5 = var10000;
      if (var3 != this.fieldLong_F) {
         label64: {
            this.fieldLong_F = var3;
            if (this.isValid()) {
               this.clamp_3();
               if (var5 != null) {
                  break label64;
               }
            }

            if (this.fieldInt_C != this.fieldInt_t) {
               this.clamp_2();
            }
         }

         int var6 = 60;
         int var7 = 0;

         while (var7 < CONST_P) {
            int var8 = this.moduleManager_r.dataBuilder46_j.clamp_8(this.getString(var7));
            if (var8 > var6) {
               var6 = var8;
            }

            var7++;
            if (var5 == null) {
               break;
            }
         }

         label69: {
            this.fieldInt_D = var6;
            var7 = 60;
            if (this.isValid()) {
               for (rip.breeze.ImageUtil15 var9 : this.arrayList_B) {
                  int var10 = this.moduleManager_r.dataBuilder46_j.clamp_8(var9.getString_m());
                  if (var10 > var7) {
                     var7 = var10;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               if (var5 != null) {
                  break label69;
               }
            }

            for (BreezeModule var14 : this.arrayList_A) {
               int var15 = this.moduleManager_r.dataBuilder46_j.clamp_8(var14.moduleName);
               if (var15 > var7) {
                  var7 = var15;
               }

               if (var5 == null) {
                  break;
               }
            }
         }

         this.fieldInt_E = var7;
      }
   }

   private void processNullable_2() {
      long var1 = 34932121932463L;
      int[] var3 = ModuleList.values();
      if (this.isValid()) {
         this.clamp_3();
         if (var3 != null) {
            return;
         }
      }

      this.clamp_2();
   }

   private void clamp_2() {
      long var1 = 61849815863283L;
      int[] var10000 = ModuleList.values();
      this.arrayList_A.clear();
      int[] var3 = var10000;

      for (BreezeModule var5 : BreezeContext.moduleBase_a.getAllModules()) {
         if (var5.categories.contains(CONST_N[this.fieldInt_t]) && !(var5 instanceof ToggleUI)) {
            this.arrayList_A.add(var5);
         }

         if (var3 == null) {
            break;
         }
      }

      this.arrayList_A.sort(Comparator.comparing(ToggleUI::lambda$buildModulesForCurrent_Inner0));
      this.fieldInt_C = this.fieldInt_t;
      this.fieldInt_u = Math.min(this.fieldInt_u, Math.max(0, this.arrayList_A.size() - 1));
   }

   private void clamp_3() {
      this.arrayList_B.clear();
      this.arrayList_B.addAll(BreezeContext.dataBuilder15_j.getList_3());
      this.arrayList_B.sort(Comparator.comparing(rip.breeze.ImageUtil15::getString_m));
      this.fieldInt_C = CONST_O;
      this.fieldInt_u = Math.min(this.fieldInt_u, Math.max(0, this.arrayList_B.size() - 1));
   }

   private int calculate_5() {
      return 3 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_6() {
      return 6 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_7() {
      return this.moduleManager_r.fieldInt_k + 7 * this.moduleManager_r.fieldInt_l;
   }

   private int calculate_8() {
      return 5 * this.moduleManager_r.fieldInt_l;
   }

   private float calculateFloat() {
      return (float)(3.0F * this.moduleManager_r.fieldInt_l * this.roundingSetting.getObject_m());
   }

   private static String lambda$buildModulesForCurrent_Inner0(BreezeModule var0) {
      return var0.moduleName;
   }

   static {
      long var0 = 139404629442774L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "úË%@¥ÛËAºCVFbFé®Ô·ÚÝû_<7<þ\n\u0019\u008a\u0013\u0002Ñ\u0010øèì\u001c¢\u0014fey°º³ü*Þê8U[\u0097\u001cÄÈ\u0017¡ßÀqÕF½¬à\u009dä÷iýqÈó²8\u0004\u0093N\u0002w\u0085Z\u009bÍ*Ï\u0098\u000eý&ÌÎ\u0017!Þ\u008e¯\u0090oHBÄ\\\u000e×";
      int var7 = "úË%@¥ÛËAºCVFbFé®Ô·ÚÝû_<7<þ\n\u0019\u008a\u0013\u0002Ñ\u0010øèì\u001c¢\u0014fey°º³ü*Þê8U[\u0097\u001cÄÈ\u0017¡ßÀqÕF½¬à\u009dä÷iýqÈó²8\u0004\u0093N\u0002w\u0085Z\u009bÍ*Ï\u0098\u000eý&ÌÎ\u0017!Þ\u008e¯\u0090oHBÄ\\\u000e×"
         .length();
      char var8 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var34 = buildString(var10).intern();
         int var10001 = -1;
         var4[var5++] = var34;
         if ((var9 += var8) >= var7) {
            CONST_H = var4;
            CONST_I = new String[3];
            CONST_M = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var13 = new long[2];
            int var14 = 0;
            String var15 = "\u000b.\u0013*LGNÙAåò?0k4\u0083";
            int var16 = "\u000b.\u0013*LGNÙAåò?0k4\u0083".length();
            byte var17 = 0;

            do {
               var10001 = var17;
               var17 += 8;
               byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
               var10001 = var14++;
               long var19 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte[] var21 = var11.doFinal(
                  new byte[]{
                     (byte)(var19 >>> 56),
                     (byte)(var19 >>> 48),
                     (byte)(var19 >>> 40),
                     (byte)(var19 >>> 32),
                     (byte)(var19 >>> 24),
                     (byte)(var19 >>> 16),
                     (byte)(var19 >>> 8),
                     (byte)var19
                  }
               );
               long var10004 = (var21[0] & 255L) << 56
                  | (var21[1] & 255L) << 48
                  | (var21[2] & 255L) << 40
                  | (var21[3] & 255L) << 32
                  | (var21[4] & 255L) << 24
                  | (var21[5] & 255L) << 16
                  | (var21[6] & 255L) << 8
                  | var21[7] & 255L;
               byte var40 = -1;
               var13[var10001] = var10004;
            } while (var17 < var16);

            CONST_K = var13;
            CONST_L = new Integer[2];
            Cipher var22;
            var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var23 = 1; var23 < 8; var23++) {
               var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var24 = -4391700006714720931L;
            byte[] var26 = var22.doFinal(
               new byte[]{
                  (byte)(var24 >>> 56),
                  (byte)(var24 >>> 48),
                  (byte)(var24 >>> 40),
                  (byte)(var24 >>> 32),
                  (byte)(var24 >>> 24),
                  (byte)(var24 >>> 16),
                  (byte)(var24 >>> 8),
                  (byte)var24
               }
            );
            long var38 = (var26[0] & 255L) << 56
               | (var26[1] & 255L) << 48
               | (var26[2] & 255L) << 40
               | (var26[3] & 255L) << 32
               | (var26[4] & 255L) << 24
               | (var26[5] & 255L) << 16
               | (var26[6] & 255L) << 8
               | var26[7] & 255L;
            byte var33 = -1;
            -9223372036854775808L = var38;
            CONST_N = new rip.breeze.ModuleCategory[]{
               rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MOVEMENT, rip.breeze.ModuleCategory.MISC, rip.breeze.ModuleCategory.VISUAL
            };
            CONST_O = CONST_N.length;
            CONST_P = CONST_N.length + 1;
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4916;
      if (CONST_I[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_J.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dD", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_H[var3].getBytes("ISO-8859-1");
         CONST_I[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_I[var3];
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
         throw new RuntimeException("rip/breeze/client/dD" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25739;
      if (CONST_L[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_K[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_M.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_M.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/dD", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_L[var3] = var15;
      }

      return CONST_L[var3];
   }

   private static int getValue_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/dD" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
