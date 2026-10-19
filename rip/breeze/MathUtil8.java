package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MathUtil8 extends Util28 {
   public boolean fieldBool_j;
   private boolean fieldBool_k;
   private float fieldFloat_l;
   private float fieldFloat_m;
   private float fieldFloat_n;
   private int fieldInt_o;
   private int fieldInt_p;
   private boolean fieldBool_q;
   private Consumer<Integer> consumer_r;
   private LicenseState licenseState_s;
   private LicenseState licenseState_t;
   private boolean fieldBool_u;
   private boolean fieldBool_v;
   private float fieldFloat_w;
   private float fieldFloat_x;
   private float fieldFloat_y;
   private final boolean fieldBool_z;
   private final int fieldInt_A;
   private final Queue<Runnable> queue_B;
   private static int[] arr_C;
   private static final String CONST_E;
   private static final long cipher_key_1;

   public MathUtil8(Consumer<Integer> var1, boolean var2, int var3) {
      long var4 = 8358600383853L;
      super();
      this.fieldBool_j = true;
      this.fieldBool_k = false;
      this.fieldInt_o = (int)/*CIPHER_KEY_F*/ 0L;
      this.fieldInt_p = 0;
      this.fieldBool_q = false;
      this.fieldBool_u = false;
      this.fieldBool_v = false;
      this.fieldFloat_y = 10.0F;
      this.queue_B = new ConcurrentLinkedQueue<>();
      this.consumer_r = var1;
      this.fieldBool_z = var2;
      this.fieldInt_A = var3;
   }

   public MathUtil8(Consumer<Integer> var1) {
      this(var1, true, 245);
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      this.processNullable();
      this.fieldFloat_x = var2;
      if (this.fieldFloat_l > this.fieldFloat_n - this.d * 2.0F && this.fieldBool_j && !this.fieldBool_k && this.consumer_r != null) {
         this.fieldBool_k = true;
         this.consumer_r.accept(this.j().size());
      }

      if (this.fieldFloat_l != this.fieldFloat_m || this.fieldBool_v) {
         this.fieldFloat_m = (float)MathUtil1.calculateDouble_2(this.fieldFloat_m, this.fieldFloat_l, this.fieldBool_v ? 50.0 : 13.0, var3);
         if (Math.abs(this.fieldFloat_l - this.fieldFloat_m) < 1.0F) {
            this.fieldFloat_m = this.fieldFloat_l;
         }

         this.clamp_3();
      }

      BreezeContext.iRenderer_b.renderInRect(this.a, this.b + this.fieldInt_p, this.c, this.d - this.fieldInt_p * 2, this::lambda$draw_Inner0);
      this.absValue(var1, var2, var3);
   }

// DUPLICATE METHOD absValue REMOVED
      if (this.fieldBool_u) {
         BreezeContext.iRenderer_b.strokeRoundedRect(this.licenseState_t, 5.0F, BreezeContext.authSession_c.getColor(CONST_E));
      }
   }

   private void toggle() {
      long var1 = 88645361008676L;
      if (!(this.fieldFloat_n <= this.d) && this.fieldBool_q) {
         this.fieldBool_u = true;
         float var3 = 10.0F;
         byte var4 = 40;
         this.licenseState_s = new LicenseState(this.a + this.c - 10.0F - this.fieldFloat_y / 2.0F, this.b + this.fieldFloat_y, 10.0F, this.d - this.fieldFloat_y * 2.0F);
         float var5 = Math.max(40.0F, this.d / this.fieldFloat_n * (this.licenseState_s.fieldFloat_d - this.fieldFloat_y * 2.0F));
         float var6 = this.fieldFloat_n - this.d;
         float var7 = this.b + this.fieldFloat_y + var5 / 2.0F + this.fieldFloat_m / var6 * (this.d - this.fieldFloat_y * 2.0F - var5);
         if (this.fieldBool_v) {
            float var8 = this.fieldFloat_x - this.fieldFloat_w;
            var7 = Math.max(this.b + this.fieldFloat_y + var5 / 2.0F, Math.min(this.b + this.d - this.fieldFloat_y - var5 / 2.0F, var8));
            this.fieldFloat_l = (var7 - this.b - this.fieldFloat_y - var5 / 2.0F) / (this.d - this.fieldFloat_y * 2.0F - var5) * var6;
         }

         this.licenseState_t = new LicenseState(this.a + this.c - 10.0F - this.fieldFloat_y / 2.0F, var7 - var5 / 2.0F, 10.0F, var5);
      } else {
         this.fieldBool_u = false;
         this.fieldBool_v = false;
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      long var2 = 94253235202450L;
      return var1.b + var1.d > this.b && var1.b < this.b + this.d;
   }

// DUPLICATE METHOD toggle REMOVED
      this.clamp_3();
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (super.checkCondition_5(var1, var2, var3)) {
         return true;
      }

      this.fieldFloat_l = this.fieldFloat_l - var3 * BreezeContext.iKeybindSettings_e.getX();
      this.fieldFloat_l = Math.max(0.0F, Math.min(this.fieldFloat_l, this.fieldFloat_n - this.d));
      return true;
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.fieldBool_u && this.licenseState_t.isValid(var1, var2)) {
         this.fieldBool_v = true;
         this.fieldFloat_w = var2 - this.licenseState_t.fieldFloat_b - this.licenseState_t.fieldFloat_d / 2.0F;
         return true;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public void toggle_2(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      if (this.fieldBool_v) {
         this.fieldBool_v = false;
      }

      super.processNullable_2(var1, var2, var3);
   }

   private void clamp_3() {
      long var1 = 114632839181774L;
      int[] var10000 = decrypt();
      float var3 = this.c - this.fieldInt_o;
      int[] var4 = var10000;
      if (this.fieldBool_q) {
         var3 -= 5.0F;
      }

      int var5 = this.fieldBool_z ? Math.max(1, (int)(var3 / (this.fieldInt_A + this.fieldInt_o))) : 1;
      float var6 = var3 / var5 - this.fieldInt_o;
      float[] var7 = new float[var5];
      float[] var8 = new float[var5];
      int var9 = 0;

      while (var9 < var5) {
         var8[var9] = (int)(this.a + this.fieldInt_o + (var6 + this.fieldInt_o) * var9);
         var7[var9] = this.fieldInt_p;
         var9++;
         if (var4 != null) {
            break;
         }
      }

      label47:
      for (UIPanel var10 : this.j()) {
         int var11 = 0;
         int var12 = 1;

         while (true) {
            if (var12 < var5) {
               if (var7[var12] < var7[var11]) {
                  var11 = var12;
               }

               var12++;
               if (var4 == null) {
                  continue;
               }
            }

            var10.drawColoredQuad(var8[var11], this.b + var7[var11] - (int)this.fieldFloat_m, var6, var10.d);
            var7[var11] += var10.d + this.fieldInt_o;
            if (var4 != null) {
               break label47;
            }
            break;
         }
      }

      this.fieldFloat_n = 0.0F;

      for (float var17 : var7) {
         this.fieldFloat_n = Math.max(this.fieldFloat_n, var17);
         if (var4 != null) {
            break;
         }
      }

      this.fieldFloat_l = Math.max(0.0F, Math.min(this.fieldFloat_l, this.fieldFloat_n - this.d));
      this.toggle();
   }

   private void processNullable() {
      long var1 = 6967589593454L;
      int[] var3 = decrypt();
      if (!this.queue_B.isEmpty()) {
         Runnable var4;
         while ((var4 = this.queue_B.poll()) != null) {
            var4.run();
            if (var3 != null) {
               break;
            }
         }

         this.clamp_3();
      }
   }

   public void update(Collection<? extends UIPanel> var1) {
      UIPanel[] var2 = var1.toArray(new UIPanel[0]);
      this.queue_B.add(this::lambda$addElements_Inner1);
   }

   @Override
   public void initialize(UIPanel var1) {
      this.queue_B.add(this::lambda$addElement_Inner2);
   }

   @Override
   public void initialize_2(UIPanel var1) {
      this.queue_B.add(this::lambda$removeElement_Inner3);
   }

   @Override
   public void initialize_3() {
      this.queue_B.add(this::lambda$clear_Inner4);
   }

   public void update_1(Collection<? extends UIPanel> var1) {
      UIPanel[] var2 = var1.toArray(new UIPanel[0]);
      this.queue_B.add(this::lambda$setElements_Inner5);
   }

   public void toggle_3(boolean var1) {
      long var2 = 108646531319139L;
      boolean var4 = this.fieldBool_q;
      this.fieldBool_q = var1;
      if (var4 != var1) {
         this.toggle();
      }
   }

   public void setIndex(int var1) {
      long var2 = 31526971152421L;
      int var4 = this.fieldInt_p;
      this.fieldInt_p = var1;
      if (var4 != var1) {
         this.clamp_3();
      }
   }

   public void initialize_4(int var1) {
      this.fieldInt_o = var1;
      this.clamp_3();
   }

   public void update_2(float var1) {
      long var2 = 129450371801993L;
      float var4 = this.fieldFloat_y;
      this.fieldFloat_y = var1;
      if (var4 != this.fieldFloat_y) {
         this.clamp_3();
      }
   }

   public int getValue() {
      return this.j().size();
   }

   public void toggle_4() {
      this.fieldBool_k = false;
      this.fieldBool_v = false;
      this.fieldBool_j = false;
   }

   public void clamp_4(float var1) {
      label13: {
         long var2 = 130745301254825L;
         int[] var10000 = decrypt();
         this.processNullable();
         int[] var4 = var10000;
         if (var1 > this.fieldFloat_l + this.d) {
            this.fieldFloat_l = var1 - this.d;
            if (var4 == null) {
               break label13;
            }
         }

         if (var1 < this.fieldFloat_l) {
            this.fieldFloat_l = var1;
         }
      }

      this.fieldFloat_l = Math.max(0.0F, Math.min(this.fieldFloat_l, this.fieldFloat_n - this.d));
      this.fieldFloat_m = this.fieldFloat_l;
      this.clamp_3();
   }

   public boolean isBool_k() {
      return this.fieldBool_k;
   }

   public void setBool_k() {
      this.fieldBool_k = true;
   }

   private void lambda$setElements_Inner5(UIPanel[] var1) {
      this.fieldBool_v = false;
      this.l();
      this.fieldFloat_l = 0.0F;
      this.fieldFloat_m = 100.0F;
      this.a(var1);
      this.fieldBool_k = false;
   }

   private void lambda$clear_Inner4() {
      this.fieldBool_v = false;
      this.l();
      this.fieldFloat_n = 0.0F;
      this.fieldFloat_l = 0.0F;
      this.fieldFloat_m = 0.0F;
      this.fieldBool_u = false;
   }

   private void lambda$removeElement_Inner3(UIPanel var1) {
      this.fieldBool_v = false;
      this.c(var1);
      this.fieldBool_k = false;
   }

   private void lambda$addElement_Inner2(UIPanel var1) {
      this.fieldBool_v = false;
      this.a(new UIPanel[]{var1});
      this.fieldBool_k = false;
   }

   private void lambda$addElements_Inner1(UIPanel[] var1) {
      this.fieldBool_v = false;
      this.a(var1);
      this.fieldBool_k = false;
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      super.processNullable(var1, var2, var3);
   }

   public static void initialize_5(int[] var0) {
      arr_C = var0;
   }

   public static int[] decrypt() {
      return arr_C;
   }

   static {
      long var0 = 7228988310081L;
      initialize_5(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\f&}°Döý£\u0097\u00068¨Â\tc\u008a".getBytes("ISO-8859-1"));
      String var12 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_E = var12;
      Cipher var5;
      var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var0 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var7 = -5738087152633207451L;
      byte[] var9 = var5.doFinal(
         new byte[]{
            (byte)(var7 >>> 56),
            (byte)(var7 >>> 48),
            (byte)(var7 >>> 40),
            (byte)(var7 >>> 32),
            (byte)(var7 >>> 24),
            (byte)(var7 >>> 16),
            (byte)(var7 >>> 8),
            (byte)var7
         }
      );
      long var14 = (var9[0] & 255L) << 56
         | (var9[1] & 255L) << 48
         | (var9[2] & 255L) << 40
         | (var9[3] & 255L) << 32
         | (var9[4] & 255L) << 24
         | (var9[5] & 255L) << 16
         | (var9[6] & 255L) << 8
         | var9[7] & 255L;
      var10001 = -1;
      /*CIPHER_KEY_F*/ 0L = var14;
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
