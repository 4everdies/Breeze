package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil32 extends Util28 {
   protected final ArrayList<RenderUtil43<?>> arrayList_j = new ArrayList<>();
   protected final ArrayList<MathUtil10> arrayList_k = new ArrayList<>();
   private double double_l = 0.0;
   private double double_m = 0.0;
   private float fieldFloat_n = 0.0F;
   private static int fieldInt_o;
   private static final String CONST_U;

   public RenderUtil32(LicenseState var1, List<GenericSetting<?>> var2, List<DateUtil> var3) {
      super(var1);
      this.processNullable(var2, var3);
   }

   public void processNullable(List<GenericSetting<?>> var1, List<DateUtil> var2) {
      long var3 = 51491614292142L;
      int var10000 = RenderUtil9.getValue_2();
      Iterator var5 = this.arrayList_j.iterator();
      int var6 = var10000;

      while (var5.hasNext()) {
         RenderUtil43 var7 = (RenderUtil43)var5.next();
         var7.h();
         if (var6 != 0) {
            break;
         }
      }

      for (MathUtil10 var14 : this.arrayList_k) {
         var14.h();
         if (var6 != 0) {
            break;
         }
      }

      this.arrayList_j.clear();
      this.arrayList_k.clear();
      this.l();

      for (GenericSetting var15 : var1) {
         label142: {
            if (var15.object_d instanceof Boolean) {
               if (var15.string_b.equals(CONST_U)) {
                  this.arrayList_j.add(new RenderUtil16_x(var15));
                  if (var6 == 0) {
                     break label142;
                  }
               }

               this.arrayList_j.add(new ImageUtil27(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof Integer) {
               this.arrayList_j.add(new MathUtil15(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof Double) {
               this.arrayList_j.add(new MathUtil14(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof StringOption) {
               this.arrayList_j.add(new ImageUtil31(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof Enum) {
               this.arrayList_j.add(new ImageUtil30(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof KeyBind) {
               this.arrayList_j.add(new ImageUtil28(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof RangeValue) {
               this.arrayList_j.add(new MathUtil16(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof BreezeColor) {
               this.arrayList_j.add(new MathUtil17(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof SkinLoader) {
               this.arrayList_j.add(new MathUtil18(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (var15.object_d instanceof ConfigMap) {
               this.arrayList_j.add(new RenderUtil44(var15));
               if (var6 == 0) {
                  break label142;
               }
            }

            if (checkCondition_3(var15.object_d)) {
               this.arrayList_j.add(new ImageUtil29(var15));
            }
         }

         if (var6 != 0) {
            break;
         }
      }

      if (var2 != null) {
         for (DateUtil var16 : var2) {
            if (var16 instanceof ConditionsSetting) {
               ConditionsSetting var8 = (ConditionsSetting)var16;
               this.arrayList_k.add(new MathUtil10(new LicenseState(), var8));
            }

            if (var6 != 0) {
               break;
            }
         }
      }

      for (RenderUtil43 var17 : this.arrayList_j) {
         this.b(var17);
         if (var6 != 0) {
            break;
         }
      }

      for (MathUtil10 var18 : this.arrayList_k) {
         this.b(var18);
         if (var6 != 0) {
            break;
         }
      }
   }

   public boolean checkCondition(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      super.checkCondition_5(var1, var2, var3);
      if (this.a(var1, var2)) {
         this.double_l = -(var3 * BreezeContext.iKeybindSettings_e.getX()) + this.double_l;
         this.double_l = MathUtil1.clamp_3(this.double_l, 0.0, this.fieldFloat_n - this.d);
         return true;
      } else {
         return false;
      }
   }

   public void clamp() {
      long var1 = 62740630596709L;
      int var10000 = RenderUtil9.getValue_2();
      float var3 = 5.0F;
      float var4 = this.c / 2.0F - 15.0F;
      int var5 = 0;
      int var6 = var10000;

      while (var5 < this.arrayList_j.size()) {
         RenderUtil43 var7 = this.arrayList_j.get(var5);
         var7.fieldBool_l = var7.dataBuilder54_k.isValid_4();
         label50:
         if (var7.fieldBool_l || var6 != 0) {
            boolean var8 = !var7.checkCondition(var4)
               && var5 + 1 < this.arrayList_j.size()
               && this.arrayList_j.get(var5 + 1).dataBuilder54_k.isValid_4()
               && !this.arrayList_j.get(var5 + 1).checkCondition(var4);
            if (var8) {
               var7.calculate_3(this.a + 10.0F, (int)(this.b + var3 - this.double_m), this.c / 2.0F - 15.0F, 0.0F);
               RenderUtil43 var9 = this.arrayList_j.get(var5 + 1);
               var9.fieldBool_l = var9.dataBuilder54_k.isValid_4();
               var9.calculate_3(this.a + this.c / 2.0F + 5.0F, (int)(this.b + var3 - this.double_m), this.c / 2.0F - 15.0F, 0.0F);
               var3 += Math.max(var7.d, var9.d) + 5.0F;
               var5++;
               if (var6 == 0) {
                  break label50;
               }
            }

            var7.calculate_3(this.a + 10.0F, (int)(this.b + var3 - this.double_m), this.c - 20.0F, 0.0F);
            var3 += var7.d + 5.0F;
         }

         var5++;
         if (var6 != 0) {
            break;
         }
      }

      for (MathUtil10 var12 : this.arrayList_k) {
         if (!var12.isValid()) {
            var12.fieldBool_r = false;
            if (var6 == 0) {
               continue;
            }
         }

         var12.fieldBool_r = true;
         var3 += 35.0F;
         var12.a(this.a + 10.0F, (int)(this.b + var3 - this.double_m), this.c - 20.0F, 0.0F);
         var3 += var12.n() + 35.0F;
         if (var6 != 0) {
            break;
         }
      }

      this.fieldFloat_n = var3;
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      this.f = true;
      int var10000 = RenderUtil9.getValue();
      Iterator var6 = new ArrayList<>(this.arrayList_j).iterator();
      int var7 = var10000;

      while (var6.hasNext()) {
         RenderUtil43 var8 = (RenderUtil43)var6.next();
         if (var8.fieldBool_l != var8.dataBuilder54_k.isValid_4()) {
            this.clamp();
            if (var7 != 0) {
               break;
            }
         }

         if (var7 == 0) {
            break;
         }
      }

      for (MathUtil10 var10 : new ArrayList<>(this.arrayList_k)) {
         if (var10.checkCondition()) {
            this.clamp();
            if (var7 != 0) {
               break;
            }
         }

         if (var7 == 0) {
            break;
         }
      }

      if (this.double_l != this.double_m) {
         this.double_m = (float)MathUtil1.calculateDouble_2(this.double_m, this.double_l, 13.0, var3);
         if (Math.abs(this.double_l - this.double_m) < 1.0) {
            this.double_m = this.double_l;
         }

         this.clamp();
      }

      BreezeContext.iRenderer_b.renderWithBounds(this, this::lambda$draw_Inner0);
   }

   public boolean checkCondition_2(UIPanel var1) {
      long var2 = 94253235202450L;
      if (var1 instanceof MathUtil10 && !((MathUtil10)var1).fieldBool_r) {
         return false;
      } else if (var1 instanceof RenderUtil43) {
         boolean var4 = ((RenderUtil43)var1).getDataBuilder54_k().isValid_4();
         boolean var5 = var1.b - this.b < this.d && var1.b() - this.b > 0.0F;
         return var4 && var5;
      } else {
         return var1.b - this.b < this.d && var1.b() - this.b > 0.0F;
      }
   }

   public float getFloat_n() {
      return this.fieldFloat_n;
   }

   private static boolean checkCondition_3(Object var0) {
      long var1 = 64734331918759L;
      if (var0 == null) {
         return false;
      }

      Class var3 = var0.getClass();
      return var3.isArray() && Enum.class.isAssignableFrom(var3.getComponentType());
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      super.processNullable(var1, var2, var3);
   }

   public static void initialize(int var0) {
      fieldInt_o = var0;
   }

   public static int getValue() {
      return fieldInt_o;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 87 : 0;
   }

   static {
      long var0 = 139579310211274L;
      initialize(98);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("^¶Û\u009b\u0088±34".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_U = var5;
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
