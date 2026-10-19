package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class MathUtil18 extends RenderUtil43<SkinLoader> {
   private static final int CONST_N;
   private static final int CONST_O;
   private final List<RenderUtil8> list_p;
   private int fieldInt_q;
   private float fieldFloat_r;
   private boolean fieldBool_s;
   private float fieldFloat_t;
   private int fieldInt_u;
   private final MathUtil6 dataBuilder118_v;
   private final rip.breeze.client.AnimationTimer dataBuilder15_w;
   private static int fieldInt_x;

   public MathUtil18(GenericSetting<SkinLoader> var1) {
      long var2 = 98462096040033L;
      int var10000 = getValue();
      super(var1);
      int var4 = var10000;
      this.list_p = new ArrayList<>();
      this.fieldInt_q = -1;
      this.fieldBool_s = false;
      this.fieldInt_u = -1;
      this.dataBuilder15_w = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      int var5 = 0;

      while (var5 < 9) {
         this.list_p.add(new RenderUtil8(this, ((SkinLoader)var1.getObject_m()).arr_b[var5]));
         var5++;
         if (var4 != 0) {
            break;
         }
      }

      this.dataBuilder118_v = new MathUtil6(this, this.dataBuilder15_w);
   }

   public boolean isValid(RenderUtil8 var1) {
      long var2 = 81337924653124L;
      return this.fieldInt_q == -1 ? false : var1 == this.list_p.get(this.fieldInt_q);
   }

   public boolean isValid_2() {
      long var1 = 10107456631669L;
      return this.fieldInt_q != -1;
   }

   public boolean isValid_3(RenderUtil8 var1) {
      long var2 = 65776915607466L;
      return this.fieldInt_u != -1 && var1 == this.list_p.get(this.fieldInt_u);
   }

   public void update(WorldUtil6 var1) {
      long var2 = 119157060772033L;
      int var4 = getValue_2();
      if (this.fieldInt_u != -1) {
         List var5;
         label35: {
            var5 = ((SkinLoader)this.k.getObject_m()).arr_b[this.fieldInt_u];
            if (var1 == WorldUtil6.EMPTY) {
               var5.clear();
               var5.add(WorldUtil6.EMPTY);
               if (var4 != 0) {
                  break label35;
               }
            }

            if (var5.contains(var1)) {
               var5.remove(var1);
               if (!var5.isEmpty()) {
                  break label35;
               }

               var5.add(WorldUtil6.EMPTY);
               if (var4 != 0) {
                  break label35;
               }
            }

            if (var5.size() == 1 && var5.get(0) == WorldUtil6.EMPTY) {
               var5.set(0, var1);
               if (var4 != 0) {
                  break label35;
               }
            }

            var5.add(var1);
         }

         this.list_p.get(this.fieldInt_u).setList_l(var5);
         this.dataBuilder118_v.clamp(this.fieldInt_u, (SkinLoader)this.k.getObject_m());
      }
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      this.f = true;
      int var10000 = getValue();
      this.absValue(var1, var3);
      int var8 = var10000;
      if (!this.dataBuilder15_w.isBool_e()) {
         this.fieldInt_u = -1;
      }

      label35: {
         if (this.dataBuilder15_w.getDouble(var6) > 1.0E-4) {
            BreezeContext.guiPanelSettings_f.update(this.dataBuilder118_v);
            if (var8 == 0) {
               break label35;
            }
         }

         this.fieldInt_u = -1;
         BreezeContext.guiPanelSettings_f.update_1(this.dataBuilder118_v);
      }

      for (RenderUtil8 var10 : this.list_p) {
         if (this.fieldInt_q == -1 || this.fieldInt_q != this.list_p.indexOf(var10) || var8 != 0) {
            var10.calculate(var1, var2, var3);
            if (var8 != 0) {
               break;
            }
         }
      }

      if (this.fieldInt_q != -1) {
         this.list_p.get(this.fieldInt_q).calculate(var1, var2, var3);
      }
   }

   private void absValue(float var1, float var2) {
      long var3 = 11728725255711L;
      long var5 = var3 ^ 7646198001448L;
      int var7 = getValue_2();
      if (this.fieldInt_q != -1) {
         this.dataBuilder15_w.toggle(var5, false);
         this.fieldInt_u = -1;
         float var8 = var1 - this.fieldFloat_r;
         float var9 = MathUtil1.clamp(var8 - this.a - 10.0F, 0.0F, 496.0F);
         int var10 = MathUtil1.clamp_2((int)(var9 / 62.0F + 0.5F), 0, 8);
         if (!this.fieldBool_s) {
            if (var10 == this.fieldInt_q && !(Math.abs(var1 - this.fieldFloat_t) > 5.0F)) {
               return;
            }

            this.fieldBool_s = true;
            if (var7 == 0) {
               return;
            }
         }

         this.list_p.get(this.fieldInt_q).a = var9 + this.a + 10.0F;
         if (this.fieldInt_q != var10) {
            this.list_p.add(var10, this.list_p.remove(this.fieldInt_q));
            this.fieldInt_q = var10;
         }
      }

      int var11 = 0;

      while (var11 < this.list_p.size()) {
         if (var11 != this.fieldInt_q || var7 == 0) {
            float var12 = this.a + 10.0F + 62 * var11;
            this.list_p.get(var11).a = (float)MathUtil1.calculateDouble_2(this.list_p.get(var11).a, var12, 20.0, var2);
         }

         var11++;
         if (var7 == 0) {
            break;
         }
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      int var6 = getValue_2();
      if (this.k.fieldBool_k) {
         return super.a(var1, var2, var3);
      }

      if (var3 == 0 && this.fieldInt_q != -1) {
         this.fieldInt_q = -1;
         return true;
      }

      int var7 = 0;

      while (var7 < this.list_p.size()) {
         if (var3 == 0 && this.list_p.get(var7).a(var1, var2)) {
            this.fieldInt_q = var7;
            this.fieldBool_s = false;
            this.fieldFloat_t = var1;
            this.fieldFloat_r = var1 - this.list_p.get(var7).a;
            return true;
         }

         var7++;
         if (var6 == 0) {
            break;
         }
      }

      return false;
   }

   public void calculate(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      int var8 = getValue_2();
      if (var3 == 0 && this.fieldInt_q != -1) {
         label26: {
            if (!this.fieldBool_s) {
               this.fieldInt_u = this.fieldInt_q;
               this.dataBuilder118_v.a = this.a + 10.0F + 62 * this.fieldInt_u;
               this.dataBuilder118_v.b = this.b() + 10.0F;
               this.dataBuilder118_v.clamp(this.fieldInt_q, (SkinLoader)this.k.getObject_m());
               this.dataBuilder118_v.calculate();
               this.dataBuilder15_w.toggle(var6, true);
               if (var8 != 0) {
                  break label26;
               }
            }

            int var9 = 0;

            while (var9 < this.list_p.size()) {
               ((SkinLoader)this.k.getObject_m()).arr_b[var9] = this.list_p.get(var9).getList_l();
               var9++;
               if (var8 == 0) {
                  break;
               }
            }
         }

         this.fieldInt_q = -1;
      }
   }

   @Override
   public void calculate_2() {
      long var1 = 62740630596709L;
      float var3 = 10.0F;
      int var10000 = getValue();
      int var4 = 0;
      int var5 = var10000;

      while (var4 < this.list_p.size()) {
         label21: {
            if (var4 == this.fieldInt_q) {
               this.list_p.get(var4).c = 52.0F;
               this.list_p.get(var4).d = 52.0F;
               this.list_p.get(var4).b = this.b + 5.0F;
               if (var5 == 0) {
                  break label21;
               }
            }

            this.list_p.get(var4).a(this.a + var3, this.b + 5.0F, 52.0F, 52.0F);
         }

         var3 += 62.0F;
         var4++;
         if (var5 != 0) {
            break;
         }
      }

      if (this.fieldInt_u != -1) {
         this.dataBuilder118_v.a = this.a + 10.0F + 62 * this.fieldInt_u;
         this.dataBuilder118_v.b = this.b() + 10.0F;
         this.dataBuilder118_v.calculate();
      }
   }

   public void decrypt() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      BreezeContext.guiPanelSettings_f.update_1(this.dataBuilder118_v);
      this.dataBuilder15_w.toggle(var3, false);
      this.fieldInt_u = -1;
   }

   public void decrypt_1(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 60.0F);
   }

   public boolean isValid_4(float var1) {
      return true;
   }

   public static void initialize(int var0) {
      fieldInt_x = var0;
   }

   public static int getValue() {
      return fieldInt_x;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 62 : 0;
   }

   static {
      long var0 = 10220653078314L;
      initialize(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "»mèvt\u00981s\u0000×]è§°ÅE";
      int var7 = "»mèvt\u00981s\u0000×]è§°ÅE".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_N = (int)var4[0];
      CONST_O = (int)var4[1];
   }
}
