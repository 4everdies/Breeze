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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.LicenseState;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "ModuleList",
   b = "Shows a list of enabled modules on the screen.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"list", "modules", "enabled", "array", "arraylist", "modulelist"}
)
public class ModuleList extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Double> roundingSetting;
   private final GenericSetting<Boolean> dataBuilder54_p;
   private final GenericSetting<Boolean> metadataSetting;
   private final GenericSetting<Boolean> watermarkSetting;
   private final GenericSetting<EnumType25> categoriesSetting;
   private final GenericSetting<ModuleCategory[]> dataBuilder54_t;
   private final ModuleManager moduleManager_u;
   private final rip.breeze.RotationUtil8 dataBuilder14_v;
   private final Map<BreezeModule, ConfigUtil4> map_w;
   private final Map<rip.breeze.ImageUtil15, ConfigUtil3_x> map_x;
   private static final int CONST_Y;
   private static final String CONST_Z;
   private static final float CONST_A = 550.0F;
   private final ArrayList<Util118> arrayList_B;
   private final Object object_C;
   private int value;
   private int value_2;
   private int fieldInt_F;
   private String string_G;
   private long fieldLong_H;
   private boolean fieldBool_I;
   private boolean fieldBool_J;
   private boolean fieldBool_K;
   private boolean fieldBool_L;
   private MathUtil10 dataBuilder46_M;
   private EnumType25 enum_OFF_N;
   private static int[] arr_O;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);
   private static final long eka_1;

   public ModuleList() {
      long var1 = 37343803372805L;
      super(false, false);
      short var10002 = 2028;
      long var10003 = 9189146275263989313L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Background");
      var10002 = 12260;
      var10003 = 2530479245100838470L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Whether to draw a background behind the list.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 14942;
      var10003 = 7696396568699993072L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 10513;
      var10003 = 6776999403719977136L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("How much to round the corners for the background.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 32749;
      var10003 = 7950525141323333214L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Makes the module names glow.");
      var10002 = 18791;
      var10003 = 6918509885369190603L ^ var1;
      this.dataBuilder54_p = var10001.getDataBuilder50_3("lowercase").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 5243;
      var10003 = 1311274878512420305L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Makes the module names and metadata lowercase.");
      var10002 = 699;
      var10003 = 8120800339419054857L ^ var1;
      this.metadataSetting = var10001.getDataBuilder50_3("Metadata").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 25124;
      var10003 = 6552394620180603779L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Show metadata next to the module.");
      var10002 = 14675;
      var10003 = 6764978795823134963L ^ var1;
      this.watermarkSetting = var10001.getDataBuilder50_3("Watermark").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 21914;
      var10003 = 8047975191106720817L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Adds a watermark to the list.");
      var10002 = 14559;
      var10003 = 211558695337621883L ^ var1;
      this.categoriesSetting = var10001.getDataBuilder50_3("Categories").getDataBuilder50_4(EnumType25.OFF).getDataBuilder54();
      var10002 = 27337;
      var10003 = 2166124830654212970L ^ var1;
      this.dataBuilder54_t = GenericSetting.<ModuleCategory[]>getDataBuilder50(this, "Which categories to display in the list.")
         .getDataBuilder50_3("Which categories to display in the list.")
         .getDataBuilder50_4(new ModuleCategory[]{ModuleCategory.COMBAT, ModuleCategory.MOVEMENT, ModuleCategory.MISC, ModuleCategory.SCRIPTS})
         .getDataBuilder54();
      this.moduleManager_u = BreezeClient.getModuleManager();
      this.dataBuilder14_v = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.RIGHT, rip.breeze.AimYawMode2.TOP, 10.0, 10.0);
      this.map_w = new HashMap<>();
      int[] var10000 = values();
      this.map_x = new HashMap<>();
      this.arrayList_B = new ArrayList<>();
      this.object_C = new Object();
      this.value = 0;
      this.value_2 = 0;
      int[] var3 = var10000;
      this.fieldInt_F = 0;
      this.string_G = "";
      this.fieldLong_H = -9223372036854775808L;
      this.fieldBool_I = true;
      this.fieldBool_J = false;
      this.fieldBool_K = true;
      this.fieldBool_L = false;
      this.dataBuilder46_M = null;
      this.enum_OFF_N = EnumType25.OFF;
      this.fieldBool_J = this.dataBuilder54_p.getObject_m();
      this.fieldBool_K = this.watermarkSetting.getObject_m();
      this.fieldBool_L = this.metadataSetting.getObject_m();
      this.dataBuilder46_M = this.moduleManager_u.dataBuilder46_j;
      this.enum_OFF_N = this.categoriesSetting.getObject_m();
      if (var3 == null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public int getValue() {
      this.clamp();
      return this.value;
   }

   public int getValue_2() {
      this.clamp();
      return this.value_2;
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_v;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void clamp() {
      long var1 = 100883276108958L;
      int[] var10000 = values();
      Object var3 = this.object_C;
      synchronized (this.object_C){} // $VF: monitorenter 
      int[] var4 = var10000;

      try {
         boolean var5 = false;
         if (this.dataBuilder46_M != this.moduleManager_u.dataBuilder46_j) {
            this.dataBuilder46_M = this.moduleManager_u.dataBuilder46_j;
            this.fieldBool_I = true;
            var5 = true;
         }

         boolean var6 = this.dataBuilder54_p.getObject_m();
         boolean var7 = this.watermarkSetting.getObject_m();
         boolean var8 = this.metadataSetting.getObject_m();
         if (var6 != this.fieldBool_J || var7 != this.fieldBool_K || var8 != this.fieldBool_L) {
            this.fieldBool_J = var6;
            this.fieldBool_K = var7;
            this.fieldBool_L = var8;
            this.fieldBool_I = true;
            var5 = true;
         }

         EnumType25 var9 = this.categoriesSetting.getObject_m();
         if (var9 != this.enum_OFF_N) {
            this.enum_OFF_N = var9;
            this.fieldBool_I = true;
            var5 = true;
         }

         long var10 = Minecraft.getSystemTime();
         if (!var5 && var10 == this.fieldLong_H) {
            // $VF: monitorexit
         } else {
            this.fieldLong_H = var10;
            this.toggle();
            this.arrayList_B.clear();

            for (ConfigUtil4 var13 : this.map_w.values()) {
               if (this.checkCondition(var13)) {
                  if (var13.e) {
                     var13.c = this.moduleManager_u.dataBuilder46_j.clamp_8(var13.b);
                     var13.e = false;
                  }

                  this.arrayList_B.add(var13);
                  if (var4 == null) {
                     break;
                  }
               }
            }

            for (ConfigUtil3_x var21 : this.map_x.values()) {
               if (this.checkCondition(var21)) {
                  if (var21.e) {
                     var21.c = this.moduleManager_u.dataBuilder46_j.clamp_8(var21.b);
                     var21.e = false;
                  }

                  this.arrayList_B.add(var21);
                  if (var4 == null) {
                     break;
                  }
               }
            }

            this.arrayList_B.sort(ModuleList::lambda$rebuildFrameCacheIfNeeded_Inner1);
            int var20 = 0;
            int var22 = this.calculate_2() * 2;

            for (Util118 var15 : this.arrayList_B) {
               var20 = Math.max(var20, var15.fieldInt_c + var22);
               if (var4 == null) {
                  break;
               }
            }

            label170: {
               this.value = var20;
               int var23 = this.arrayList_B.size();
               this.value_2 = var23 == 0 ? 0 : var23 * this.calculate_4();
               this.fieldInt_F = 0;
               if (var9 == EnumType25.LOGO) {
                  this.fieldInt_F = (int)(80.0F * this.moduleManager_u.fieldInt_l * 8.0F / 11.0F);
                  this.value = Math.max(this.value, (int)(80.0F * this.moduleManager_u.fieldInt_l));
                  this.value_2 = this.value_2 + this.fieldInt_F;
                  if (var4 != null) {
                     break label170;
                  }
               }

               if (var9 == EnumType25.TEXT) {
                  this.string_G = this.buildString_3();
                  int var24 = this.moduleManager_u.dataBuilder46_j.clamp_8(this.string_G) + this.calculate_2() * 2;
                  this.fieldInt_F = this.calculate_4();
                  this.value = Math.max(this.value, var24);
                  this.value_2 = this.value_2 + this.fieldInt_F;
                  if (var4 != null) {
                     break label170;
                  }
               }

               this.string_G = "";
            }

            // $VF: monitorexit
         }
      } finally {
         // $VF: monitorexit
      }
   }

   private void toggle() {
      long var1 = 116976107323625L;
      long var3 = var1 ^ 112412535146974L;
      int[] var10000 = values();
      Iterator var5 = BreezeContext.moduleBase_a.getAllModules().iterator();
      int[] var6 = var10000;

      while (var5.hasNext()) {
         BreezeModule var7 = (BreezeModule)var5.next();
         boolean var8 = false;

         for (ModuleCategory var12 : this.dataBuilder54_t.getObject_m()) {
            if (var12.moduleCategory_a != null && var7.categories.contains(var12.moduleCategory_a)) {
               var8 = true;
               if (var6 != null) {
                  break;
               }
            }

            if (var6 == null) {
               break;
            }
         }

         if (!var8) {
            this.map_w.remove(var7);
            if (var6 != null) {
               continue;
            }
         }

         ConfigUtil4 var18 = this.map_w.get(var7);
         if (var18 == null) {
            var18 = new ConfigUtil4(this, var7);
            this.map_w.put(var7, var18);
            var18.a.toggle(var3, false);
            var18.d = true;
            var18.e = true;
         }

         var18.a.toggle(var3, var7.isValid());
         String var21 = this.watermarkSetting.getObject_m() ? getString(var7.getString_2()) : "";
         boolean var24 = !var21.equals(var18.string_h);
         if (this.fieldBool_I || var18.d || var24) {
            var18.b = this.buildString(var7);
            var18.string_h = var21;
            var18.d = false;
            var18.e = true;
         }

         if (var6 == null) {
            break;
         }
      }

      boolean var13 = false;

      for (ModuleCategory var22 : this.dataBuilder54_t.getObject_m()) {
         if (var22 == ModuleCategory.SCRIPTS) {
            var13 = true;
            if (var6 != null) {
               break;
            }
         }

         if (var6 == null) {
            break;
         }
      }

      label123: {
         if (!var13) {
            this.map_x.clear();
            if (var6 != null) {
               break label123;
            }
         }

         List var15 = BreezeContext.dataBuilder15_j.getList_3();

         for (rip.breeze.ImageUtil15 var20 : var15) {
            ConfigUtil3_x var23 = this.map_x.get(var20);
            if (var23 == null) {
               var23 = new ConfigUtil3_x(this, var20);
               this.map_x.put(var20, var23);
            }

            var23.a.toggle(var3, var20.isValid());
            String var25 = this.watermarkSetting.getObject_m() ? getString(var20.getString()) : "";
            boolean var26 = !var25.equals(var23.string_h);
            if (this.fieldBool_I || var23.d || var26) {
               var23.b = this.buildString_2(var20);
               var23.string_h = var25;
               var23.d = false;
               var23.e = true;
            }

            if (var6 == null) {
               break;
            }
         }

         this.map_x.keySet().retainAll(var15);
      }

      this.fieldBool_I = false;
   }

   private static String getString(String var0) {
      long var1 = 99503822177090L;
      return var0 == null ? "" : var0;
   }

   public void clamp_2(List<Util8> var1) {
      long var2 = 123025407946278L;
      long var4 = var2 ^ 102503777889241L;
      int[] var6 = values();
      if (this.backgroundSetting.getObject_m()) {
         this.clamp();
         Util118[] var8;
         int var9;
         int var10;
         int var11;
         int var12;
         synchronized (this.object_C) {
            if (this.arrayList_B.isEmpty() && this.fieldInt_F == 0) {
               return;
            }

            var8 = this.arrayList_B.toArray(new Util118[0]);
            var9 = var8.length;
            var10 = this.value;
            var11 = this.value_2;
            var12 = this.fieldInt_F;
         }

         int var48 = Minecraft.getMinecraft().displayWidth;
         int var13 = Minecraft.getMinecraft().displayHeight;
         boolean var14 = this.dataBuilder14_v.clamp_3() + var11 / 2 < var13 / 2;
         boolean var15 = this.dataBuilder14_v.clamp_2() + var10 / 2 > var48 / 2;
         int var16 = this.dataBuilder14_v.clamp_2();
         int var17 = this.dataBuilder14_v.clamp_3();
         int var18 = this.calculate_4();
         float var19 = (float)(3.0F * this.moduleManager_u.fieldInt_l * this.roundingSetting.getObject_m());
         float var20 = 12.0F * this.moduleManager_u.fieldInt_l;
         boolean var21 = this.categoriesSetting.getObject_m() == EnumType25.TEXT && var12 > 0;
         int var22 = var14 ? var12 : 0;
         if (var19 < 0.5F) {
            int var49 = 0;

            while (var49 < var9) {
               Util118 var51 = var8[var49];
               float var52 = (float)var51.dataBuilder15_a.getDouble(var4);
               if (!(var52 <= 0.001F)) {
                  int var53 = Math.max(1, Math.round((var51.fieldInt_c + this.calculate_2() * 2) * var52));
                  float var54 = var20 * (1.0F - var52);
                  float var55 = var15 ? var54 : -var54;
                  int var57 = (int)((var15 ? var16 + var10 - var53 : var16) + var55);
                  int var59 = var14 ? var17 + var22 + var49 * var18 : var17 + (var9 - 1 - var49) * var18;
                  var1.add(new Util8(var57, var59, var53, var18, 0.0F));
               }

               var49++;
               if (var6 == null) {
                  break;
               }
            }

            if (var21) {
               var49 = var14 ? var17 : var17 + var9 * var18;
               var1.add(new Util8(var16, var49, var10, var12, 0.0F));
            }
         } else {
            float[] var23 = new float[var9];
            int[] var24 = new int[var9];
            int[] var25 = new int[var9];
            int[] var26 = new int[var9];
            float[] var27 = new float[var9];
            boolean[] var28 = new boolean[var9];
            int var29 = 0;

            while (var29 < var9) {
               label285: {
                  Util118 var30 = var8[var29];
                  float var31 = (float)var30.dataBuilder15_a.getDouble(var4);
                  int var32 = var14 ? var17 + var22 + var29 * var18 : var17 + (var9 - 1 - var29) * var18;
                  var25[var29] = var32;
                  if (var31 <= 0.001F) {
                     var28[var29] = false;
                     var23[var29] = 0.0F;
                     var24[var29] = 0;
                     var26[var29] = 0;
                     var27[var29] = 0.0F;
                     if (var6 != null) {
                        break label285;
                     }
                  }

                  var28[var29] = true;
                  int var33 = var30.fieldInt_c + this.calculate_2() * 2;
                  float var34 = var33 * var31;
                  var23[var29] = Math.max(1.0F, var34);
                  int var35 = Math.max(1, Math.round(var23[var29]));
                  var24[var29] = var35;
                  float var36 = var20 * (1.0F - var31);
                  float var37 = var15 ? var36 : -var36;
                  int var38 = (int)((var15 ? var16 + this.getValue() - var35 : var16) + var37);
                  var26[var29] = var38;
                  var27[var29] = Math.max(0.0F, Math.min(var35, var18) / 2.0F - 1.0F);
               }

               var29++;
               if (var6 == null) {
                  break;
               }
            }

            float[] var56 = new float[var9];
            float[] var58 = new float[var9];
            float[] var60 = new float[var9];
            float[] var61 = new float[var9];
            int var62 = -1;
            int var63 = -1;
            int var64 = 0;

            while (var64 < var9) {
               if (var28[var64]) {
                  var62 = var64;
                  if (var6 != null) {
                     break;
                  }
               }

               var64++;
               if (var6 == null) {
                  break;
               }
            }

            var64 = var9 - 1;

            while (var64 >= 0) {
               if (var28[var64]) {
                  var63 = var64;
                  if (var6 != null) {
                     break;
                  }
               }

               var64--;
               if (var6 == null) {
                  break;
               }
            }

            if (var62 == -1) {
               if (var21) {
                  float var69 = Math.max(0.0F, Math.min(var10, var12) / 2.0F - 1.0F);
                  float var71 = Math.min(var19, var69);
                  var1.add(new Util8(var16, var17, var10, var12, var71, var71, var71, var71));
               }
            } else {
               if (!var21 || !var14) {
                  float var66 = Math.min(var19, var27[var62]);
                  var56[var62] = var66;
                  var58[var62] = var66;
               }

               if (!var21 || var14) {
                  float var67 = Math.min(var19, var27[var63]);
                  var61[var63] = var67;
                  var60[var63] = var67;
               }

               float var68 = 0.75F * this.moduleManager_u.fieldInt_l;
               int var70 = var62;
               int var72 = var62 + 1;

               while (var72 <= var63) {
                  if (var28[var72]) {
                     int var74 = var70;
                     int var39 = var72;
                     float var40 = var23[var74] - var23[var39];
                     label212:
                     if (Math.abs(var40) > var68) {
                        float var41 = clamp_3(var19, var18, Math.abs(var24[var74] - var24[var39]));
                        if (var40 > 0.0F) {
                           if (var15) {
                              var61[var74] = Math.max(var61[var74], var41);
                              if (var6 != null) {
                                 break label212;
                              }
                           }

                           var60[var74] = Math.max(var60[var74], var41);
                           if (var6 != null) {
                              break label212;
                           }
                        }

                        if (var15) {
                           var56[var39] = Math.max(var56[var39], var41);
                           if (var6 != null) {
                              break label212;
                           }
                        }

                        var58[var39] = Math.max(var58[var39], var41);
                     }

                     var70 = var72;
                  }

                  var72++;
                  if (var6 == null) {
                     break;
                  }
               }

               float var73 = 0.0F;
               float var75 = 0.0F;
               float var76 = 0.0F;
               float var77 = 0.0F;
               if (var21 && var62 != -1) {
                  float var78 = var10 - var23[var62];
                  label195:
                  if (var78 > var68) {
                     float var42 = clamp_3(var19, Math.min(var18, var12), var10 - var24[var62]);
                     if (var14) {
                        if (var15) {
                           var73 = var42;
                           var56[var62] = Math.max(var56[var62], var42);
                           if (var6 != null) {
                              break label195;
                           }
                        }

                        var75 = var42;
                        var58[var62] = Math.max(var58[var62], var42);
                        if (var6 != null) {
                           break label195;
                        }
                     }

                     if (var15) {
                        var76 = var42;
                        var56[var62] = Math.max(var56[var62], var42);
                        if (var6 != null) {
                           break label195;
                        }
                     }

                     var77 = var42;
                     var58[var62] = Math.max(var58[var62], var42);
                  }
               }

               int var79 = 0;

               while (var79 < var9) {
                  label178:
                  if (var28[var79]) {
                     float var81 = var27[var79];
                     float var43 = Math.min(var56[var79], var81);
                     float var44 = Math.min(var58[var79], var81);
                     float var45 = Math.min(var60[var79], var81);
                     float var46 = Math.min(var61[var79], var81);
                     if (var14) {
                        var1.add(new Util8(var26[var79], var25[var79], var24[var79], var18, var43, var44, var45, var46));
                        if (var6 != null) {
                           break label178;
                        }
                     }

                     var1.add(new Util8(var26[var79], var25[var79], var24[var79], var18, var46, var45, var44, var43));
                  }

                  var79++;
                  if (var6 == null) {
                     break;
                  }
               }

               if (var21) {
                  float var80 = Math.max(0.0F, Math.min(var10, var12) / 2.0F - 1.0F);
                  float var82 = Math.min(var19, var80);
                  int var83 = var14 ? var17 : var17 + var9 * var18;
                  if (var14) {
                     var1.add(new Util8(var16, var83, var10, var12, var82, var82, var75, var73));
                     if (var6 != null) {
                        return;
                     }
                  }

                  var1.add(new Util8(var16, var83, var10, var12, var76, var77, var82, var82));
               }
            }
         }
      }
   }

   private static float clamp_3(float var0, int var1, int var2) {
      float var3 = Math.max(0.0F, var1 * 0.5F - 1.0F);
      return Math.min(var0, Math.min(var3, var2));
   }

   public void calculate() {
      long var1 = 83095202467719L;
      long var3 = var1 ^ 133371837500024L;
      int[] var10000 = values();
      this.clamp();
      int[] var5 = var10000;
      Util118[] var7;
      int var8;
      int var9;
      int var10;
      String var11;
      synchronized (this.object_C) {
         if (this.arrayList_B.isEmpty() && this.fieldInt_F == 0) {
            return;
         }

         var7 = this.arrayList_B.toArray(new Util118[0]);
         var8 = this.value;
         var9 = this.value_2;
         var10 = this.fieldInt_F;
         var11 = this.string_G;
      }

      if (var8 > 0 && var9 > 0) {
         int var35 = Minecraft.getMinecraft().displayWidth;
         int var12 = Minecraft.getMinecraft().displayHeight;
         int var13 = this.dataBuilder14_v.clamp_2();
         int var14 = this.dataBuilder14_v.clamp_3();
         int var15 = var8;
         int var16 = var9;
         boolean var17 = var14 + var16 / 2 < var12 / 2;
         boolean var18 = var13 + var15 / 2 > var35 / 2;
         int var19 = var17 ? var14 + var10 : var14 + var16 - var10 - this.calculate_4();
         float var20 = 12.0F * this.moduleManager_u.fieldInt_l;

         for (Util118 var24 : var7) {
            label147: {
               float var25 = (float)var24.dataBuilder15_a.getDouble(var3);
               if (var25 <= 0.001F) {
                  var19 = var17 ? var19 + this.calculate_4() : var19 - this.calculate_4();
                  if (var5 != null) {
                     break label147;
                  }
               }

               float var26 = var20 * (1.0F - var25);
               float var27 = var18 ? var26 : -var26;
               int var28 = (int)(255.0F * var25);
               Color var29 = new Color(255, 255, 255, var28);
               int var30 = var24.fieldInt_c + this.calculate_2() * 2;
               int var31 = var18 ? var13 + var15 - var30 : var13;
               int var32 = var18 ? var31 + var30 - this.calculate_2() - var24.fieldInt_c : var31 + this.calculate_2();
               int var33 = var19 + this.calculate_3();
               this.moduleManager_u.dataBuilder46_j.calculate(var32 + var27, var33, var24.string_b, var29, !this.backgroundSetting.getObject_m());
               var19 = var17 ? var19 + this.calculate_4() : var19 - this.calculate_4();
            }

            if (var5 == null) {
               break;
            }
         }

         if (var10 > 0) {
            EnumType25 var36 = this.categoriesSetting.getObject_m();
            int var37 = var17 ? var14 : var14 + var16 - var10;
            if (var36 == EnumType25.LOGO) {
               float var38 = 80.0F * this.moduleManager_u.fieldInt_l / 550.0F;
               int var40 = (int)(var38 * 550.0F);
               int var42 = var18 ? var13 + var15 - var40 : var13;
               if (!this.backgroundSetting.getObject_m()) {
                  RenderUtil28.processNullable_4(
                     "svgs/breeze-arraylist.svg",
                     var42 - (var18 ? -1 : this.moduleManager_u.fieldInt_l * 3) + 0.5F,
                     var37 - this.moduleManager_u.fieldInt_l * 3 + 0.5F,
                     var38,
                     Color.BLACK
                  );
               }

               RenderUtil28.calculate_14(
                  "svgs/breeze-arraylist.svg",
                  var42 - (var18 ? 0 : this.moduleManager_u.fieldInt_l * 3),
                  var37 - this.moduleManager_u.fieldInt_l * 3,
                  var38,
                  1.0F,
                  this.dataBuilder54_p.getObject_m() ? 2 : 0
               );
            } else if (var36 == EnumType25.TEXT && !var11.isEmpty()) {
               int var39 = this.moduleManager_u.dataBuilder46_j.clamp_8(var11);
               int var41 = var18 ? var13 + var15 - this.calculate_2() - var39 : var13 + this.calculate_2();
               this.moduleManager_u
                  .dataBuilder46_j
                  .calculate(var41, var37 + this.calculate_3(), var11, new Color(255, 255, 255, 255), !this.backgroundSetting.getObject_m());
            }
         }

         this.processNullable();
      }
   }

   private boolean checkCondition(Util118 var1) {
      long var2 = 140032639059813L;
      long var4 = var2 ^ 85237707866778L;
      return var1.isReady() || var1.dataBuilder15_a.getDouble(var4) > 0.001F;
   }

   private void processNullable() {
      long var1 = 7253486757207L;
      long var3 = var1 ^ 57478565437608L;
      int[] var10000 = values();
      Iterator var5 = this.map_w.entrySet().iterator();
      int[] var6 = var10000;

      while (var5.hasNext()) {
         ConfigUtil4 var7 = (ConfigUtil4)((Entry)var5.next()).getValue();
         if (!var7.dataBuilder52_g.isValid() && var7.a.getDouble(var3) <= 0.001F) {
            var5.remove();
         }

         if (var6 == null) {
            break;
         }
      }

      Iterator var9 = this.map_x.entrySet().iterator();

      while (var9.hasNext()) {
         ConfigUtil3_x var8 = (ConfigUtil3_x)((Entry)var9.next()).getValue();
         if (!var8.dataBuilder17_g.isValid() && var8.a.getDouble(var3) <= 0.001F) {
            var9.remove();
         }

         if (var6 == null) {
            break;
         }
      }
   }

   private String buildString(BreezeModule var1) {
      long var2 = 23787862776564L;
      StringBuilder var4 = new StringBuilder();
      if (this.dataBuilder54_p.getObject_m()) {
         var4.append(RenderUtil18_x.GLOW);
      }

      var4.append(RenderUtil18_x.ACCENT);
      var4.append(this.metadataSetting.getObject_m() ? var1.getString_2().toLowerCase() : var1.getString_2()).append(RenderUtil18_x.RESET);
      if (!this.watermarkSetting.getObject_m()) {
         return var4.toString();
      }

      String var5 = var1.getString_2();
      if (var5 != null && !var5.isEmpty()) {
         var4.append(RenderUtil18_x.SECONDARY).append(" ").append(this.metadataSetting.getObject_m() ? var5.toLowerCase() : var5).append(RenderUtil18_x.RESET);
      }

      return var4.toString();
   }

   private String buildString_2(rip.breeze.ImageUtil15 var1) {
      long var2 = 31334127063085L;
      StringBuilder var4 = new StringBuilder();
      if (this.dataBuilder54_p.getObject_m()) {
         var4.append(RenderUtil18_x.GLOW);
      }

      var4.append(RenderUtil18_x.ACCENT);
      var4.append(this.metadataSetting.getObject_m() ? var1.getString_m().toLowerCase() : var1.getString_m()).append(RenderUtil18_x.RESET);
      if (!this.watermarkSetting.getObject_m()) {
         return var4.toString();
      }

      String var5 = var1.getString();
      if (var5 != null && !var5.isEmpty()) {
         var4.append(RenderUtil18_x.SECONDARY).append(" ").append(this.metadataSetting.getObject_m() ? var5.toLowerCase() : var5).append(RenderUtil18_x.RESET);
      }

      return var4.toString();
   }

   private String buildString_3() {
      long var1 = 20148339825580L;
      StringBuilder var3 = new StringBuilder();
      if (this.dataBuilder54_p.getObject_m()) {
         var3.append(RenderUtil18_x.GLOW);
      }

      var3.append(RenderUtil18_x.ACCENT).append("breeze").append(RenderUtil18_x.RESET);
      var3.append(RenderUtil18_x.SECONDARY).append(rip.breeze.Util140.buildString_3()).append(RenderUtil18_x.RESET);
      return var3.toString();
   }

   private int calculate_2() {
      return 2 * this.moduleManager_u.fieldInt_l;
   }

   private int calculate_3() {
      return 2 * this.moduleManager_u.fieldInt_l;
   }

   private int calculate_4() {
      return this.moduleManager_u.fieldInt_k + 4 * this.moduleManager_u.fieldInt_l;
   }

   private static int lambda$rebuildFrameCacheIfNeeded_Inner1(Util118 var0, Util118 var1) {
      return Integer.compare(var1.fieldInt_c, var0.fieldInt_c);
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.backgroundSetting.getObject_m();
   }

   static String getString_2(ModuleList var0, BreezeModule var1) {
      return var0.buildString(var1);
   }

   static GenericSetting getWatermarkSetting(ModuleList var0) {
      return var0.watermarkSetting;
   }

   static String getString_3(String var0) {
      return getString(var0);
   }

   static String getString_4(ModuleList var0, rip.breeze.ImageUtil15 var1) {
      return var0.buildString_2(var1);
   }

   public static void initialize(int[] var0) {
      arr_O = var0;
   }

   public static int[] values() {
      return arr_O;
   }

   static {
      int[] var10000 = new int[3];
      long var0 = 113961002765468L;
      initialize(var10000);
      Cipher var2;
      Cipher var25 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "4Î\u0080{Ä\u009e£RZ±üC\u0016Z@QûøÚÜW!\u0012ªÕ\u0084w\u009aíª\u008a :ÄÙ(\u0001§K»Ó\u008b\u001c\u0014Ì¨O\u00895ÛÒ<^d\u0004¿8pä\u0098=1dZîä\u00ad(ï\u0086ä·ÏÖ\u0006\u008cza\u0088\u0087\u00186d^ØÚ8°ùuÎ=\u009f£{B¶{àÊÓ~Øcz@0\u0012~T}fcj/é\u0014S\u001a½òb\u0092§0\"\u009b\u008d[\u0093\u0019]\u0015;\u007fïûTvxÑµw<cÝ,:ïÏÚ¶\u0086w(\f\u008a]µ¡®\u00857pi\u0094Y\u0012«ÅXÄ\u0013 |\u0019÷\u008dû\u0099µ\u009b\u0085Ø\u0019(4F(Ð\u00ad`]ô\\\u0097~$¬mU-k\u0088D\u008f\u0010ÝÃÎ³8\u0012Ñ´\u009bïYÚþí\u001eô\u009eìxÎ\u0001ÉA\u0088:\u000fù\u008d re\u0086\u0082ç¥³HU\u0080.f\u0084ÊÆ\\;\u0005\u0097\u0095Åë\r0¶Ý[ûzxÈÈ¹R\b(\u0006\u0014]½\u0004éhbcLs¦Zô\u0084\u001aß]ccìô\u008d®2\u0017*s\u0017\u0011h.\"¦`Ý \u0081^\u001d#-Ë` ÜÂ9\u001c|\u009aÏIÀÖ°V%Ýêe>«W\u001fªp\bä0\u001bÿ8è+ø^\u009eDâ\u0093\u008a6È)b6ì÷\u0012¨q\u009dò¼Á)\u0092'Ø\u001f&\u0011d\u000f%i¿`L^\u001cFäK?\u0001\u00050¯d\u009cÆßHÑTôþmZ£8Ð>\u0002¥è\u0093ä\u0004\u0091¬\u001bÊ\u008e%Ö\u009c\u0016ñ\u0083Þå3Ïô¸Þ©Óy\u000eªÒ\u0091X ;Z¾4\u008eèÏ£-}KK\u0082q\u001d(CëÌ¿e;buÕØå)h@`{\u0018q ?k\u0018Á'\raÄã`ÅEäuË÷ò&à(\u009fù\u0010âìÎû\u0005°¥÷Ànã·x\u00067¨P\u009eâ\u009d¿ õ9\u001cï\u008bX\u001cR\u0019»Ó¯\u0000?4ãÍ Ô\u001fà\u0016\u001a55Î¼Y\u008f\u0080d\u0004\u008c\u009dÎ\u0001e\u0093ÈVäZð\u009e\u0085\u0083\u009c²)9Kÿ\u008cwånY~ÖX\u0003^g\r\u0089]\u0094\u008bU¦zÏl¢½ ÜÒ\u0085ôK¢\u0000\u0083¼~¾YG\u000b]^V,,£]ô2Z»6¶áíÞ!±8ùe\u0091²\bÑ\u0080>\u008bvÞ5\u00ad(\u0011\u0019Ì¼\u009ce\u001c½\u0004ò\u0099bùÃR\u0006ÿ\u000f\u0000wØ£Ñ\u0081\u000eç¨\u0092\u001b\u0014\u001cás\u0007\u0089\u0095ß}<û#\u00030IZçNk×A-Ue§\u0012Ô`ð\u008e«ÌG\u0007\u001f«$R>è<%\u0005^¯#=Å*À¹²âÜô¿õdXBù\u001b |ï$³o¶J\u0083D\u0001iu\u001cú\u0081\u0096\u0098\u0099õO\u001b;Ç×µ\u0006QHM\u0092\u0018Ê";
      int var7 = "4Î\u0080{Ä\u009e£RZ±üC\u0016Z@QûøÚÜW!\u0012ªÕ\u0084w\u009aíª\u008a :ÄÙ(\u0001§K»Ó\u008b\u001c\u0014Ì¨O\u00895ÛÒ<^d\u0004¿8pä\u0098=1dZîä\u00ad(ï\u0086ä·ÏÖ\u0006\u008cza\u0088\u0087\u00186d^ØÚ8°ùuÎ=\u009f£{B¶{àÊÓ~Øcz@0\u0012~T}fcj/é\u0014S\u001a½òb\u0092§0\"\u009b\u008d[\u0093\u0019]\u0015;\u007fïûTvxÑµw<cÝ,:ïÏÚ¶\u0086w(\f\u008a]µ¡®\u00857pi\u0094Y\u0012«ÅXÄ\u0013 |\u0019÷\u008dû\u0099µ\u009b\u0085Ø\u0019(4F(Ð\u00ad`]ô\\\u0097~$¬mU-k\u0088D\u008f\u0010ÝÃÎ³8\u0012Ñ´\u009bïYÚþí\u001eô\u009eìxÎ\u0001ÉA\u0088:\u000fù\u008d re\u0086\u0082ç¥³HU\u0080.f\u0084ÊÆ\\;\u0005\u0097\u0095Åë\r0¶Ý[ûzxÈÈ¹R\b(\u0006\u0014]½\u0004éhbcLs¦Zô\u0084\u001aß]ccìô\u008d®2\u0017*s\u0017\u0011h.\"¦`Ý \u0081^\u001d#-Ë` ÜÂ9\u001c|\u009aÏIÀÖ°V%Ýêe>«W\u001fªp\bä0\u001bÿ8è+ø^\u009eDâ\u0093\u008a6È)b6ì÷\u0012¨q\u009dò¼Á)\u0092'Ø\u001f&\u0011d\u000f%i¿`L^\u001cFäK?\u0001\u00050¯d\u009cÆßHÑTôþmZ£8Ð>\u0002¥è\u0093ä\u0004\u0091¬\u001bÊ\u008e%Ö\u009c\u0016ñ\u0083Þå3Ïô¸Þ©Óy\u000eªÒ\u0091X ;Z¾4\u008eèÏ£-}KK\u0082q\u001d(CëÌ¿e;buÕØå)h@`{\u0018q ?k\u0018Á'\raÄã`ÅEäuË÷ò&à(\u009fù\u0010âìÎû\u0005°¥÷Ànã·x\u00067¨P\u009eâ\u009d¿ õ9\u001cï\u008bX\u001cR\u0019»Ó¯\u0000?4ãÍ Ô\u001fà\u0016\u001a55Î¼Y\u008f\u0080d\u0004\u008c\u009dÎ\u0001e\u0093ÈVäZð\u009e\u0085\u0083\u009c²)9Kÿ\u008cwånY~ÖX\u0003^g\r\u0089]\u0094\u008bU¦zÏl¢½ ÜÒ\u0085ôK¢\u0000\u0083¼~¾YG\u000b]^V,,£]ô2Z»6¶áíÞ!±8ùe\u0091²\bÑ\u0080>\u008bvÞ5\u00ad(\u0011\u0019Ì¼\u009ce\u001c½\u0004ò\u0099bùÃR\u0006ÿ\u000f\u0000wØ£Ñ\u0081\u000eç¨\u0092\u001b\u0014\u001cás\u0007\u0089\u0095ß}<û#\u00030IZçNk×A-Ue§\u0012Ô`ð\u008e«ÌG\u0007\u001f«$R>è<%\u0005^¯#=Å*À¹²âÜô¿õdXBù\u001b |ï$³o¶J\u0083D\u0001iu\u001cú\u0081\u0096\u0098\u0099õO\u001b;Ç×µ\u0006QHM\u0092\u0018Ê"
         .length();
      char var8 = 'P';
      int var24 = -1;

      label49:
      while (true) {
         String var26 = var6.substring(++var24, var24 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var26.getBytes("ISO-8859-1"));
            String var38 = buildString_4(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var38;
                  if ((var24 += var8) >= var7) {
                     CONST_Q = var4;
                     CONST_R = new String[18];
                     short var28 = 30735;
                     long var34 = 185998036328136761L ^ var0;
                     CONST_Z = "svgs/breeze-arraylist.svg";
                     Cipher var11;
                     Cipher var29 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var29.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 8913797290337863662L;
                     byte[] var17 = var11.doFinal(
                        new byte[]{
                           (byte)(var15 >>> 56),
                           (byte)(var15 >>> 48),
                           (byte)(var15 >>> 40),
                           (byte)(var15 >>> 32),
                           (byte)(var15 >>> 24),
                           (byte)(var15 >>> 16),
                           (byte)(var15 >>> 8),
                           (byte)var15
                        }
                     );
                     long var42 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     var10001 = -1;
                     long var13 = var42;
                     CONST_Y = (int)var13;
                     Cipher var18;
                     Cipher var30 = var18 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var19 = 1; var19 < 8; var19++) {
                        var10003[var19] = (byte)(var0 << var19 * 8 >>> 56);
                     }

                     var30.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var20 = 9067615696411066763L;
                     byte[] var22 = var18.doFinal(
                        new byte[]{
                           (byte)(var20 >>> 56),
                           (byte)(var20 >>> 48),
                           (byte)(var20 >>> 40),
                           (byte)(var20 >>> 32),
                           (byte)(var20 >>> 24),
                           (byte)(var20 >>> 16),
                           (byte)(var20 >>> 8),
                           (byte)var20
                        }
                     );
                     long var44 = (var22[0] & 255L) << 56
                        | (var22[1] & 255L) << 48
                        | (var22[2] & 255L) << 40
                        | (var22[3] & 255L) << 32
                        | (var22[4] & 255L) << 24
                        | (var22[5] & 255L) << 16
                        | (var22[6] & 255L) << 8
                        | var22[7] & 255L;
                     var10001 = -1;
                     -9223372036854775808L = var44;
                     return;
                  }

                  var8 = var6.charAt(var24);
                  break;
               default:
                  var4[var5++] = var38;
                  if ((var24 += var8) < var7) {
                     var8 = var6.charAt(var24);
                     continue label49;
                  }

                  var6 = "kns\u001a7À÷\u0001FfüâÆ®¦\u001d·ò°n4%Ô\u0017¯7ô\t\u0082ñõO©\u007f´1Ñ\u0086ö\u008bg5oÄüWi\u008aw&O>Ã5.¢%oÚbv\tÙ¬ø)x\\Í\u0082¶l.Òúûþ½þø\u0010OÁ©Ð\u008eð\u0017¬\u00841Ê{YËÊÀ";
                  var7 = "kns\u001a7À÷\u0001FfüâÆ®¦\u001d·ò°n4%Ô\u0017¯7ô\t\u0082ñõO©\u007f´1Ñ\u0086ö\u008bg5oÄüWi\u008aw&O>Ã5.¢%oÚbv\tÙ¬ø)x\\Í\u0082¶l.Òúûþ½þø\u0010OÁ©Ð\u008eð\u0017¬\u00841Ê{YËÊÀ"
                     .length();
                  var8 = 'P';
                  var24 = -1;
            }

            var26 = var6.substring(++var24, var24 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_4(byte[] var0) {
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

   private static String buildString_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13479;
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
            throw new RuntimeException("rip/breeze/client/dy", var10);
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
         CONST_R[var3] = buildString_4(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_5(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/dy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
