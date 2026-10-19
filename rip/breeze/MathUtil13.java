package rip.breeze;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MathUtil13 extends Util28 {
   private static final float CONST_J = 20.0F;
   private static final float CONST_K = 60.0F;
   private static final float CONST_L = 10.0F;
   private static final float CONST_M = 10.0F;
   private static final float CONST_N = 20.0F;
   private static final EnumType32 CONST_O;
   private static final int CONST_P;
   private static final int CONST_Q;
   private final ImageUtil15 dataBuilder17_r;
   private final RenderUtil6_x breezeUtil97_s;
   private final ImageUtil2 breezeUtil110_t;
   private LicenseState licenseState_u;
   private float fieldFloat_v;
   private float fieldFloat_w;
   private float fieldFloat_x;
   private float fieldFloat_y;
   private float fieldFloat_z;
   private float fieldFloat_A;
   private float fieldFloat_B;
   private boolean fieldBool_C;
   private boolean fieldBool_D;
   private float fieldFloat_E;
   private LicenseState licenseState_F;
   private boolean fieldBool_G;
   private int fieldInt_H;
   private int fieldInt_I;
   private boolean fieldBool_J;
   private final List<RenderUtil1_x> list_K;
   private String string_L;
   private static final String[] CONST_O_2;
   private static final String[] CONST_P_2;
   private static final Map CONST_Q_2 = new HashMap(13);

   public MathUtil13(RenderUtil6_x var1, ImageUtil15 var2) {
      long var3 = 21427843905695L;
      super();
      this.breezeUtil110_t = new ImageUtil2(new LicenseState(), "arrow_back", this::initialize, true);
      this.licenseState_u = new LicenseState();
      this.fieldFloat_z = 0.0F;
      this.fieldFloat_A = 0.0F;
      this.fieldFloat_B = 0.0F;
      this.fieldBool_C = false;
      this.fieldBool_D = false;
      this.fieldFloat_E = 0.0F;
      this.licenseState_F = new LicenseState();
      this.fieldBool_G = false;
      this.fieldInt_H = -1;
      this.fieldInt_I = -1;
      this.fieldBool_J = false;
      this.list_K = new ArrayList<>();
      this.string_L = "";
      this.dataBuilder17_r = var2;
      this.breezeUtil97_s = var1;
      this.b(this.breezeUtil110_t);
   }

   private void initialize() {
      this.breezeUtil97_s.update(false, false);
   }

   public void calculate_3() {
      this.fieldFloat_z = 0.0F;
      this.fieldFloat_A = 100.0F;
      this.fieldBool_G = false;
      this.fieldInt_H = -1;
      this.fieldInt_I = -1;
      this.fieldBool_J = false;
   }

   public void update(float var1, float var2, float var3) {
      this.calculate(var1, var2, var3, 0.0F);
   }

   public void calculate(float var1, float var2, float var3, float var4) {
      long var5 = 42574671277168L;
      BreezeContext.iRenderer_b.setDimensions(0.0F, -var4);
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_u,
            BreezeContext.authSession_c.getFloat("default.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      this.fieldFloat_v = this.licenseState_u.fieldFloat_a + 20.0F;
      this.fieldFloat_w = this.licenseState_u.fieldFloat_b + 20.0F;
      this.fieldFloat_x = this.licenseState_u.fieldFloat_c - 40.0F;
      this.fieldFloat_y = this.licenseState_u.fieldFloat_d - 40.0F;
      BreezeContext.iRenderer_b.renderInRect(this.fieldFloat_v, this.fieldFloat_w, this.fieldFloat_x, this.fieldFloat_y, this::lambda$draw_Inner0);
      if (this.fieldBool_C) {
         BreezeContext.iRenderer_b
            .strokeRoundedRect(this.licenseState_F, 5.0F, BreezeContext.authSession_c.getColor("default.accent"));
      }

      BreezeContext.iRenderer_b.setDimensions(0.0F, var4);
      if (var4 < 60.0F) {
         BreezeContext.iRenderer_b.renderInRect(this.a, this.b, this.c, 60.0F - var4, this::lambda$draw_Inner1);
      }
   }

   private boolean isValid() {
      long var1 = 114838188874743L;
      return this.fieldInt_H != -1 && this.fieldInt_I != -1 && this.fieldInt_H != this.fieldInt_I;
   }

   private int calculate_2(float var1, float var2) {
      long var3 = 90256847296885L;
      LicenseState[] var5 = FileUtil2.decrypt();
      if (this.list_K.isEmpty()) {
         return 0;
      }

      for (RenderUtil1_x var7 : this.list_K) {
         float var8 = var7.fieldFloat_c - this.fieldFloat_A;
         if (var2 >= var8 && var2 < var8 + 20.0F) {
            if (var7.string_b.isEmpty()) {
               return var7.fieldInt_d;
            }

            float var9 = this.fieldFloat_v + 10.0F;
            float[] var10 = this.measureText(var7.string_a, var9);
            if (var1 <= var10[0]) {
               return var7.fieldInt_d;
            }

            int var11 = 0;

            while (var11 < var7.string_b.length()) {
               if (var1 < (var10[var11] + var10[var11 + 1]) * 0.5F) {
                  return var7.fieldInt_d + var11;
               }

               var11++;
               if (var5 != null) {
                  break;
               }
            }

            return var7.fieldInt_e;
         }

         if (var5 != null) {
            break;
         }
      }

      RenderUtil1_x var12 = this.list_K.get(0);
      return var2 < var12.fieldFloat_c - this.fieldFloat_A ? 0 : this.list_K.get(this.list_K.size() - 1).fieldInt_e;
   }

   private float[] measureText(String var1, float var2) {
      long var3 = 65974005972543L;
      String var5 = buildString(var1);
      int var6 = var5.length();
      LicenseState[] var10000 = FileUtil2.decrypt();
      float[] var7 = new float[var6 + 1];
      LicenseState[] var8 = var10000;
      var7[0] = var2;
      int var9 = var1.length();
      int var10 = 0;

      while (var10 + 1 < var9 && var1.charAt(var10) == 167) {
         var10 += 2;
         if (var8 != null) {
            break;
         }
      }

      int var11 = 0;

      while (var11 < var6) {
         var10++;

         while (true) {
            if (var10 + 1 < var9 && var1.charAt(var10) == 167) {
               var10 += 2;
               if (var8 == null) {
                  continue;
               }
            }

            var7[var11 + 1] = var2 + BreezeContext.iRenderer_b.measureTextHeight(var1.substring(0, var10), CONST_O, 18.0F);
            var11++;
            if (var8 != null) {
               return var7;
            }
            break;
         }
      }

      return var7;
   }

   private static String buildString(String var0) {
      long var1 = 20195139874375L;
      LicenseState[] var10000 = FileUtil2.decrypt();
      StringBuilder var3 = new StringBuilder(var0.length());
      LicenseState[] var4 = var10000;
      int var5 = 0;

      while (var5 < var0.length()) {
         label19: {
            if (var0.charAt(var5) == 167 && var5 + 1 < var0.length()) {
               var5++;
               if (var4 == null) {
                  break label19;
               }
            }

            var3.append(var0.charAt(var5));
         }

         var5++;
         if (var4 != null) {
            break;
         }
      }

      return var3.toString();
   }

   private void clamp(float var1, float var2, float var3, float var4) {
      long var5 = 12607580205060L;
      if (this.fieldFloat_B <= var2) {
         this.fieldBool_C = false;
         this.fieldBool_D = false;
      } else {
         this.fieldBool_C = true;
         float var7 = this.licenseState_u.fieldFloat_a + this.licenseState_u.fieldFloat_c - 10.0F - 10.0F;
         float var8 = var1 + 10.0F;
         float var9 = var1 + var2 - 10.0F;
         float var10 = var9 - var8;
         float var11 = Math.max(40.0F, var2 / this.fieldFloat_B * var10);
         float var12 = var8 + var11 / 2.0F;
         float var13 = var9 - var11 / 2.0F;
         float var14 = Math.max(1.0F, var13 - var12);
         float var15 = var4 > 0.0F ? var3 / var4 : 0.0F;
         this.licenseState_F = new LicenseState(var7, var12 + var15 * var14 - var11 / 2.0F, 10.0F, var11);
      }
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      float var6 = Math.max(0.0F, this.fieldFloat_B - this.fieldFloat_y);
      this.fieldFloat_z = this.fieldFloat_z - var3 * BreezeContext.iKeybindSettings_e.getX();
      this.fieldFloat_z = MathUtil1.clamp(this.fieldFloat_z, 0.0F, var6);
      this.fieldBool_G = Math.abs(this.fieldFloat_z - var6) < 0.5F;
      return true;
   }

   public boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      LicenseState[] var6 = FileUtil2.decrypt();
      if (this.fieldBool_C && this.licenseState_F != null && this.licenseState_F.isValid(var1, var2)) {
         this.fieldBool_D = true;
         this.fieldFloat_E = var2 - (this.licenseState_F.fieldFloat_b + this.licenseState_F.fieldFloat_d / 2.0F);
         this.fieldBool_G = false;
         return true;
      }

      if (var3 == 0 && this.licenseState_u.isValid(var1, var2)) {
         label23: {
            int var7 = this.calculate_2(var1, var2);
            if (BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_115() && this.fieldInt_H != -1) {
               this.fieldInt_I = var7;
               if (var6 == null) {
                  break label23;
               }
            }

            this.fieldInt_H = var7;
            this.fieldInt_I = var7;
         }

         this.fieldBool_J = true;
         return true;
      } else {
         return super.a(var1, var2, var3);
      }
   }

   public void clamp_3(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      if (this.fieldBool_D) {
         this.fieldBool_D = false;
         float var6 = Math.max(0.0F, this.fieldFloat_B - this.fieldFloat_y);
         if (Math.abs(this.fieldFloat_z - var6) < 0.5F) {
            this.fieldBool_G = true;
         }
      }

      this.fieldBool_J = false;
      super.processNullable_2(var1, var2, var3);
   }

   public boolean clamp_4(int var1) {
      long var2 = 45508263211567L;
      if (var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_C() && BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_114() && this.isValid()) {
         int var4 = Math.max(0, Math.min(Math.min(this.fieldInt_H, this.fieldInt_I), this.string_L.length()));
         int var5 = Math.max(0, Math.min(Math.max(this.fieldInt_H, this.fieldInt_I), this.string_L.length()));
         if (var4 < var5) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.string_L.substring(var4, var5)), null);
         }

         return true;
      } else if (var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_A() && BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_114()) {
         this.fieldInt_H = 0;
         this.fieldInt_I = this.string_L.length();
         return true;
      } else {
         return super.checkCondition_3(var1);
      }
   }

   public void calculate_3() {
      this.fieldBool_D = false;
      this.licenseState_u = new LicenseState(this.a + 20.0F, this.b + 60.0F, this.c - 40.0F, this.d - 60.0F);
      this.breezeUtil110_t.a(this.a() - 70.0F, this.b + 12.0F, 40.0F, 40.0F);
      this.fieldFloat_v = this.licenseState_u.fieldFloat_a + 20.0F;
      this.fieldFloat_w = this.licenseState_u.fieldFloat_b + 20.0F;
      this.fieldFloat_x = this.licenseState_u.fieldFloat_c - 40.0F;
      this.fieldFloat_y = this.licenseState_u.fieldFloat_d - 40.0F;
   }

   @Override
   public boolean isValid_2(UIPanel var1) {
      return true;
   }

   private void lambda$draw_Inner1(float var1, float var2, float var3) {
      long var4 = 101703963144929L;
      LicenseState[] var10000 = FileUtil2.decrypt();
      BreezeContext.iRenderer_b
         .drawText(
            "Logs:",
            this.a + 30.0F,
            this.b + 20.0F,
            BreezeContext.authSession_c.getColor("default.text-primary"),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      LicenseState[] var6 = var10000;

      for (UIPanel var8 : this.j()) {
         var8.toggle(var1, var2, var3);
         if (var6 != null) {
            break;
         }
      }
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      long var4 = 128859809632871L;
      LicenseState[] var10000 = FileUtil2.decrypt();
      int var6 = Math.max(0, (int)this.fieldFloat_x);
      int var7 = 0;
      LicenseState[] var8 = var10000;

      for (ImageUtil11 var10 : this.dataBuilder17_r.arrayList_z) {
         if (!var10.fieldBool_d) {
            var10.calculate(var6);
         }

         var7 += var10.arrayList_b.size();
         if (var8 != null) {
            break;
         }
      }

      this.fieldFloat_B = var7 * 20.0F;
      float var26 = Math.max(0.0F, this.fieldFloat_B - this.fieldFloat_y);
      if (var26 == 0.0F && this.fieldFloat_A == 0.0F) {
         this.fieldBool_G = true;
      }

      if (this.fieldBool_G && !this.fieldBool_D && this.fieldFloat_B > 0.0F) {
         this.fieldFloat_z = var26;
      }

      this.fieldFloat_z = MathUtil1.clamp(this.fieldFloat_z, 0.0F, var26);
      if (this.fieldFloat_z != this.fieldFloat_A || this.fieldBool_D) {
         this.fieldFloat_A = (float)MathUtil1.calculateDouble_2(this.fieldFloat_A, this.fieldFloat_z, !this.fieldBool_D && !this.fieldBool_G ? 13.0 : 50.0, var1);
         if (Math.abs(this.fieldFloat_z - this.fieldFloat_A) < 0.5F) {
            this.fieldFloat_A = this.fieldFloat_z;
         }
      }

      this.list_K.clear();
      StringBuilder var27 = new StringBuilder();
      int var11 = 0;

      label133:
      for (ImageUtil11 var13 : this.dataBuilder17_r.arrayList_z) {
         Iterator var14 = var13.arrayList_b.iterator();

         while (true) {
            if (var14.hasNext()) {
               String var15 = (String)var14.next();
               String var16 = buildString(var15);
               int var17 = var27.length();
               var27.append(var16);
               int var18 = var27.length();
               var27.append('\n');
               this.list_K.add(new RenderUtil1_x(var15, var16, this.fieldFloat_w + var11 * 20.0F, var17, var18, var13.color_e));
               var11++;
               if (var8 == null) {
                  continue;
               }
            }

            if (var8 != null) {
               break label133;
            }
            break;
         }
      }

      this.string_L = var27.toString();
      if (this.fieldBool_J) {
         this.fieldInt_I = this.calculate_2(var2, var3);
      }

      if (this.isValid()) {
         int var28 = Math.min(this.fieldInt_H, this.fieldInt_I);
         int var30 = Math.max(this.fieldInt_H, this.fieldInt_I);
         Color var33 = BreezeContext.authSession_c.getColor("textbox.selection");

         for (RenderUtil1_x var39 : this.list_K) {
            float var41 = var39.fieldFloat_c - this.fieldFloat_A;
            if (!(var41 + 20.0F < this.fieldFloat_w) && !(var41 > this.fieldFloat_w + this.fieldFloat_y)) {
               int var43 = Math.max(var28, var39.fieldInt_d);
               int var19 = Math.min(var30, var39.fieldInt_e);
               float var20 = this.fieldFloat_v + 10.0F;
               if (var43 >= var19) {
                  if (var28 > var39.fieldInt_e || var30 <= var39.fieldInt_e || var39.string_b.isEmpty()) {
                     continue;
                  }

                  float[] var21 = this.measureText(var39.string_a, var20);
                  float var22 = var21[var39.string_b.length()];
                  BreezeContext.iRenderer_b.fillRoundedRectFull(var22, var41 - 0.5F, 6.0F, 21.0F, 1.0F, var33);
                  if (var8 == null) {
                     continue;
                  }
               }

               float[] var45 = this.measureText(var39.string_a, var20);
               int var46 = Math.max(0, Math.min(var43 - var39.fieldInt_d, var39.string_b.length()));
               int var23 = Math.max(0, Math.min(var19 - var39.fieldInt_d, var39.string_b.length()));
               if (var46 < var23) {
                  float var24 = var45[var46];
                  float var25 = var45[var23];
                  if (var25 <= var24) {
                     var25 = var24 + 2.0F;
                  }

                  BreezeContext.iRenderer_b.fillRoundedRectFull(var24, var41 - 0.5F, var25 - var24, 21.0F, 3.0F, var33);
               }

               if (var8 != null) {
                  break;
               }
            }
         }
      }

      float var29 = this.fieldFloat_w - this.fieldFloat_A;

      label98:
      for (ImageUtil11 var34 : this.dataBuilder17_r.arrayList_z) {
         int var37 = 0;

         while (true) {
            if (var37 < var34.arrayList_b.size()) {
               label164: {
                  if (var29 + 18.0F < this.fieldFloat_w) {
                     var29 += 20.0F;
                     if (var8 == null) {
                        break label164;
                     }
                  }

                  if (var29 > this.fieldFloat_w + this.fieldFloat_y) {
                     break label98;
                  }

                  BreezeContext.iRenderer_b.drawTextCentered(var34.arrayList_b.get(var37), this.fieldFloat_v + 10.0F, var29, var34.color_e, CONST_O, 18.0F);
                  var29 += 20.0F;
               }

               var37++;
               if (var8 == null) {
                  continue;
               }
            }

            if (var8 != null) {
               break label98;
            }
            break;
         }
      }

      this.clamp(this.fieldFloat_w, this.fieldFloat_y, this.fieldFloat_A, var26);
      if (this.fieldBool_C && this.fieldBool_D) {
         float var32 = this.fieldFloat_w + 10.0F;
         float var35 = this.fieldFloat_w + this.fieldFloat_y - 10.0F;
         float var38 = var32 + this.licenseState_F.fieldFloat_d / 2.0F;
         float var40 = var35 - this.licenseState_F.fieldFloat_d / 2.0F;
         float var42 = MathUtil1.clamp(var3 - this.fieldFloat_E, var38, var40);
         float var44 = var40 > var38 ? (var42 - var38) / (var40 - var38) : 0.0F;
         this.fieldFloat_z = var44 * var26;
         this.licenseState_F.fieldFloat_b = var42 - this.licenseState_F.fieldFloat_d / 2.0F;
         this.fieldBool_G = false;
      }
   }

   static {
      long var0 = 129495768812763L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "k\u001d¿¶\u0085?l\u0011\u0084´£¦sHû\u0090\u001e!ê¬½Ø¾\u00ad3ÜU=Ô£ÄËZ¥\u0080ÓÍam\u009a(/8«~;\u0091\u000e#\u0000\u009bÍ\u0081l\u001a\u008b\u00139ú\u0011¼\u001a [\u007fâ\\\u0087Ø\\=´\f-#Ç\u0098øîî\t ¬æn%yCÆ{=}\u0013\u009c'FÏÝßñé\u0018[ÕH\u001aX%n\u0089'EQô(¶ïPV³a\u009d\f$|ñ°ÚÜ¥Î3\bû\u0085\u001bøïÍ\u008atû/î×\u008a\u008e÷@»î÷\u0092ÜZ\u0018¢wæ»6 ù\t\röö\\aQ\u0015mæ·Ü×»¹ï¬";
      int var7 = "k\u001d¿¶\u0085?l\u0011\u0084´£¦sHû\u0090\u001e!ê¬½Ø¾\u00ad3ÜU=Ô£ÄËZ¥\u0080ÓÍam\u009a(/8«~;\u0091\u000e#\u0000\u009bÍ\u0081l\u001a\u008b\u00139ú\u0011¼\u001a [\u007fâ\\\u0087Ø\\=´\f-#Ç\u0098øîî\t ¬æn%yCÆ{=}\u0013\u009c'FÏÝßñé\u0018[ÕH\u001aX%n\u0089'EQô(¶ïPV³a\u009d\f$|ñ°ÚÜ¥Î3\bû\u0085\u001bøïÍ\u008atû/î×\u008a\u008e÷@»î÷\u0092ÜZ\u0018¢wæ»6 ù\t\röö\\aQ\u0015mæ·Ü×»¹ï¬"
         .length();
      char var8 = '(';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_O_2 = var4;
                     CONST_P_2 = new String[7];
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
                     String var15 = "\u001b\u0018Æ.\u0004ëÀ\u0011M¢ø\tõØ\u001dÂ";
                     int var16 = "\u001b\u0018Æ.\u0004ëÀ\u0011M¢ø\tõØ\u001dÂ".length();
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
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_Q = (int)var13[0];
                     CONST_P = (int)var13[1];
                     CONST_O = EnumType32.SOURCE_CODE_PRO;
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "µ\u0088ÆËåæÓnß\u0010P\u0091½\u0006ÊÙcñyF¢û\u0089×z\u0094bHøv\u00831¢§\u0087o\u009a\u008e¬m\u0097\u008e,Ø^þ©\u0080\u0010\u0082\u001f¶\fÑ´\u0095«'\u0004Fj\u0087Ã\u0082[";
                  var7 = "µ\u0088ÆËåæÓnß\u0010P\u0091½\u0006ÊÙcñyF¢û\u0089×z\u0094bHøv\u00831¢§\u0087o\u009a\u008e¬m\u0097\u008e,Ø^þ©\u0080\u0010\u0082\u001f¶\fÑ´\u0095«'\u0004Fj\u0087Ã\u0082["
                     .length();
                  var8 = '0';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24894;
      if (CONST_P_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dK", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O_2[var3].getBytes("ISO-8859-1");
         CONST_P_2[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P_2[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/dK" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
