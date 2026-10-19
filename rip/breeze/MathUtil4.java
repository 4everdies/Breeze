package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MathUtil4 extends RenderUtil50 {
   private final RenderUtil15_x dataBuilder69_p;
   private final StringDecryptHelper6 stringDecryptHelper6_q;
   private final ArrayList<RenderUtil41> modulesSetting;
   private final ArrayList<RenderUtil41> arrayList_s;
   private LicenseState licenseState_t;
   private RenderUtil41 dataBuilder68_u;
   private boolean fieldBool_v;
   private float fieldFloat_w;
   private int fieldInt_x;
   private String string_y;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public MathUtil4() {
      long var1 = 89388420624578L;
      LicenseState[] var10000 = RenderUtil15_x.values();
      short var10002 = 25443;
      long var10003 = 8610074442305908100L ^ var1;
      super("Modules");
      this.modulesSetting = new ArrayList<>();
      this.arrayList_s = new ArrayList<>();
      this.licenseState_t = new LicenseState();
      this.dataBuilder68_u = null;
      this.fieldBool_v = false;
      this.fieldFloat_w = 0.0F;
      this.fieldInt_x = 0;
      this.string_y = "";
      LicenseState[] var3 = var10000;

      for (BreezeModule var5 : BreezeContext.moduleBase_a.getAllModules()) {
         this.modulesSetting.add(new RenderUtil41(var5, this));
         if (var3 != null) {
            break;
         }
      }

      short var6 = 16530;
      long var10004 = 52098168703848052L ^ var1;
      this.stringDecryptHelper6_q = new StringDecryptHelper6("Search...", new LicenseState(), this::calculate);
      this.stringDecryptHelper6_q.processAll(new Util134(50.0F, 15.0F));
      this.stringDecryptHelper6_q.update_3(true);
      this.dataBuilder69_p = new RenderUtil15_x(this);
      this.processNullable();
   }

   private void calculate(String var1) {
      long var2 = 28422750642658L;
      LicenseState[] var10000 = RenderUtil15_x.values();
      this.string_y = var1;
      LicenseState[] var4 = var10000;
      this.stringDecryptHelper6_q.setString_k(var1);
      if (var1.isEmpty()) {
         this.stringDecryptHelper6_q.setString_k("Search...");
         this.processNullable();
      } else {
         this.fieldBool_v = true;
         if (this.dataBuilder69_p.getModuleCategory_m() != ModuleCategory.ALL) {
            this.dataBuilder69_p.initialize(ModuleCategory.ALL);
         }

         List var5 = BreezeContext.moduleBase_a.getList(var1.toLowerCase());
         HashSet var6 = new HashSet<>(this.arrayList_s);
         this.arrayList_s.clear();
         int var7 = var5.size() - 1;

         label46:
         while (var7 >= 0) {
            BreezeModule var8 = (BreezeModule)var5.get(var7);
            Iterator var9 = this.modulesSetting.iterator();

            while (true) {
               if (var9.hasNext()) {
                  RenderUtil41 var10 = (RenderUtil41)var9.next();
                  if (var10.getDataBuilder52_j() != var8) {
                     continue;
                  }

                  this.arrayList_s.add(var10);
               }

               var7--;
               if (var4 != null) {
                  break label46;
               }
               break;
            }
         }

         this.fieldFloat_w = 0.0F;
         this.calculate_2(false);
         float var11 = 0.0F;
         this.fieldInt_x = this.arrayList_s.size() * 90;

         for (RenderUtil41 var13 : this.arrayList_s) {
            var13.a(this.licenseState_t.fieldFloat_a + 10.0F, this.licenseState_t.fieldFloat_b + var11 - this.fieldFloat_w, this.licenseState_t.fieldFloat_c - 20.0F, 80.0F);
            if (!var6.contains(var13)) {
               var13.setLicenseState_x(var13);
               var13.calculate();
            }

            var11 += var13.d + 10.0F;
            if (var4 != null) {
               break;
            }
         }
      }
   }

   public void processNullable() {
      long var1 = 80501245303454L;
      LicenseState[] var10000 = RenderUtil15_x.values();
      this.arrayList_s.clear();
      LicenseState[] var3 = var10000;

      for (RenderUtil41 var5 : this.modulesSetting) {
         if (var5.getDataBuilder52_j().categories.contains(this.dataBuilder69_p.getModuleCategory_m())) {
            this.arrayList_s.add(var5);
         }

         if (var3 != null) {
            break;
         }
      }

      this.arrayList_s.sort(Comparator.comparing(MathUtil4::lambda$selectionChanged_Inner0));
      this.fieldFloat_w = 0.0F;
      this.calculate_2(true);
   }

   public void calculate_2(boolean var1) {
      long var2 = 110018072287969L;
      float var4 = 0.0F;
      float var5 = 0.0F;
      LicenseState[] var10000 = RenderUtil15_x.values();
      this.fieldInt_x = this.arrayList_s.size() * 90;
      LicenseState[] var6 = var10000;

      for (RenderUtil41 var8 : this.arrayList_s) {
         var8.update(this.licenseState_t.fieldFloat_a + 10.0F, this.licenseState_t.fieldFloat_b + var4 - this.fieldFloat_w, this.licenseState_t.fieldFloat_c - 20.0F, 80.0F);
         if (var1) {
            var8.setLicenseState_x(
               new LicenseState(this.licenseState_t.fieldFloat_a + 10.0F, this.licenseState_t.fieldFloat_b - this.d + var5, this.licenseState_t.fieldFloat_c - 20.0F, 80.0F)
            );
         }

         var4 += var8.d + 10.0F;
         var5 += var8.d + 100.0F;
         if (var6 != null) {
            break;
         }
      }
   }

   public void update(RenderUtil32 var1) {
      super.b(var1);
   }

   public void update_1(RenderUtil32 var1) {
      super.c(var1);
   }

   public void processAll(RenderUtil41 var1) {
      long var2 = 61972160041339L;
      this.dataBuilder68_u = var1;
      this.fieldBool_v = this.dataBuilder68_u == null;
      if (this.dataBuilder68_u != null) {
         this.dataBuilder68_u.calculate();
      }
   }

   public void setBool_v() {
      this.fieldBool_v = true;
   }

   public RenderUtil41 getDataBuilder68_u() {
      return this.dataBuilder68_u;
   }

   public boolean isBool_v() {
      return this.fieldBool_v;
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      LicenseState[] var8 = RenderUtil15_x.values();
      float var9 = this.licenseState_t.isValid(var1, var2) ? var1 : -1.0F;
      float var10 = this.licenseState_t.isValid(var1, var2) ? var2 : -1.0F;
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this.stringDecryptHelper6_q,
            BreezeContext.authSession_c.getFloat("textbox.corner-radius"),
            BreezeContext.authSession_c.getFloat("textbox.border-thickness"),
            BreezeContext.authSession_c.getColor("textbox.border")
         );
      BreezeContext.iRenderer_b
         .drawTextAt(
            "search",
            this.stringDecryptHelper6_q.a + 10.0F,
            this.stringDecryptHelper6_q.b + 10.0F,
            1.3F,
            BreezeContext.authSession_c.getColor("icon.color")
         );
      if (!this.stringDecryptHelper6_q.isValid_2()) {
         this.stringDecryptHelper6_q.clamp_8("");
         this.string_y = "";
      }

      this.stringDecryptHelper6_q.update(var1, var2, var3);

      for (RenderUtil41 var12 : this.arrayList_s) {
         if (var12 != this.dataBuilder68_u || var8 != null) {
            var12.absValue(var9, var10, var3);
            if (var8 != null) {
               break;
            }
         }
      }

      if (this.dataBuilder68_u != null) {
         this.dataBuilder68_u.absValue(var1, var2, var3);
      }

      LicenseState var13 = new LicenseState(this.licenseState_t.fieldFloat_a, this.licenseState_t.fieldFloat_b, this.licenseState_t.fieldFloat_c, this.licenseState_t.fieldFloat_d);
      if (this.dataBuilder68_u != null) {
         var13.fieldFloat_d = Math.max(0.0F, this.dataBuilder68_u.getLicenseState_x().fieldFloat_b - this.licenseState_t.fieldFloat_b - 2.0F);
      }

      if (this.dataBuilder68_u == null || this.dataBuilder68_u.dataBuilder15_s.getDouble(var6) != 1.0) {
         BreezeContext.iRenderer_b.renderWithBounds(var13, this::lambda$draw_Inner1);
      }

      if (this.dataBuilder68_u != null) {
         this.dataBuilder68_u.clamp(var1, var2, var3);
      }

      if (this.dataBuilder68_u != null && this.dataBuilder68_u.dataBuilder15_s.getDouble(var6) != 1.0) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)(1.0 - this.dataBuilder68_u.dataBuilder15_s.getDouble(var6)));
         BreezeContext.iRenderer_b.renderWithBounds(this.licenseState_t, this::lambda$draw_Inner2);
         BreezeContext.iRenderer_b.frameEnd();
      }

      if (this.dataBuilder68_u == null) {
         if (this.checkCondition(this.dataBuilder69_p)) {
            this.dataBuilder69_p.absValue(var1, var2, var3);
         }

         super.a(var9, var10, var3);
         if (var8 == null) {
            return;
         }
      }

      LicenseState var14 = new LicenseState(this.m);
      var14.fieldFloat_d = Math.max(this.m.fieldFloat_d, this.dataBuilder68_u.getLicenseState_x().fieldFloat_b - this.m.fieldFloat_b);
      BreezeContext.iRenderer_b.renderWithBounds(var14, this::lambda$draw_Inner3);
      if (this.d(this.dataBuilder68_u.dataBuilder45_v)) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder68_u.dataBuilder15_t.getDouble(var6));
         this.dataBuilder68_u.dataBuilder45_v.absValue(var1, var2, var3);
         BreezeContext.iRenderer_b.frameEnd();
      }
   }

   public void processNullable_2() {
      long var1 = 67137573248254L;
      super.h();
      if (this.dataBuilder68_u != null) {
         this.dataBuilder68_u.h();
      }
   }

   public boolean checkCondition(UIPanel var1) {
      long var2 = 94253235202450L;
      long var4 = var2 ^ 3678302743478L;
      if (var1 == this.dataBuilder69_p && this.dataBuilder68_u != null && this.dataBuilder68_u.dataBuilder15_s.calculateDouble(var4) == 1.0) {
         return false;
      } else {
         return !(var1 instanceof RenderUtil41)
            ? true
            : ((RenderUtil41)var1).getLicenseState_x().calculateFloat_2() > this.b
               && ((RenderUtil41)var1).getLicenseState_x().fieldFloat_b < this.licenseState_t.calculateFloat_2();
      }
   }

   @Override
   public boolean isValid() {
      return true;
   }

   @Override
   public boolean checkCondition_2(char var1) {
      long var2 = 56489760968752L;
      if (this.stringDecryptHelper6_q.clamp_2(var1)) {
         if (this.stringDecryptHelper6_q.isValid_2() && !this.string_y.equals(this.stringDecryptHelper6_q.getString_j())) {
            this.calculate(this.stringDecryptHelper6_q.getString_j());
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   @Override
   public boolean checkCondition_3(int var1) {
      long var2 = 45508263211567L;
      if (this.stringDecryptHelper6_q.clamp(var1)) {
         if (this.stringDecryptHelper6_q.isValid_2() && !this.string_y.equals(this.stringDecryptHelper6_q.getString_j())) {
            this.calculate(this.stringDecryptHelper6_q.getString_j());
         }

         return true;
      } else if (super.a(var1)) {
         return true;
      } else if (var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_F() && BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_114()) {
         this.stringDecryptHelper6_q.update_2();
         this.dataBuilder69_p.initialize(ModuleCategory.ALL);
         return true;
      } else if (var1 == BreezeContext.iKeyCodeProvider_g.getModifiedKeyCode() && this.dataBuilder68_u != null) {
         this.setBool_v();
         return true;
      } else {
         return false;
      }
   }

   public boolean checkCondition_4(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      LicenseState[] var7 = RenderUtil15_x.values();
      if (this.stringDecryptHelper6_q.absValue(var1, var2, var3, var4)) {
         var4 = true;
      }

      if (this.dataBuilder68_u == null) {
         if (this.dataBuilder69_p.a(var1, var2, var3, var4)) {
            var4 = true;
         }

         if (!this.licenseState_t.isValid(var1, var2)) {
            return super.a(var1, var2, var3, var4);
         }

         for (RenderUtil41 var9 : this.arrayList_s) {
            if (var9.checkCondition(var1, var2, var3, var4)) {
               var4 = true;
            }

            if (var7 != null) {
               break;
            }
         }

         if (var7 == null) {
            return super.a(var1, var2, var3, var4);
         }
      }

      if (this.dataBuilder68_u.checkCondition(var1, var2, var3, var4)) {
         var4 = true;
      }

      return super.a(var1, var2, var3, var4);
   }

   public void update_2(float var1, float var2, int var3) {
      super.b(var1, var2, var3);
      this.stringDecryptHelper6_q.toggle(var1, var2, var3);
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (super.b(var1, var2, var3)) {
         return true;
      } else if (this.licenseState_t.isValid(var1, var2) && this.dataBuilder68_u == null) {
         this.fieldFloat_w = this.fieldFloat_w - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_w = Math.max(0.0F, Math.min(this.fieldFloat_w, this.fieldInt_x - this.licenseState_t.fieldFloat_d));
         this.calculate_2(false);
         return true;
      } else {
         return false;
      }
   }

   public void calculate_3() {
      long var1 = 62740630596709L;
      this.stringDecryptHelper6_q.a(this.m.fieldFloat_a + this.m.fieldFloat_c / 2.0F - 150.0F, this.m.fieldFloat_b + 15.0F, 300.0F, this.m.fieldFloat_d - 30.0F);
      this.dataBuilder69_p.a(this.a + 10.0F, this.b, this.c - 20.0F, RenderUtil15_x.fieldInt_j);
      this.licenseState_t = new LicenseState(this.a, this.b + RenderUtil15_x.fieldInt_j, this.c, this.d - RenderUtil15_x.fieldInt_j - 15.0F);
      this.calculate_2(true);
      if (this.dataBuilder68_u != null) {
         this.dataBuilder68_u.calculate();
      }
   }

   public String getString() {
      long var1 = 11960387023038L;
      return "tune";
   }

   private void lambda$draw_Inner3(float var1, float var2, float var3) {
      long var4 = 67465228175739L;
      this.stringDecryptHelper6_q.update(var1, var2, var3);
      if (this.checkCondition(this.dataBuilder69_p)) {
         this.dataBuilder69_p.absValue(var1, var2, var3);
      }
   }

   private void lambda$draw_Inner2(float var1, float var2, float var3) {
      long var4 = 8321877721029L;
      boolean var6 = false;
      LicenseState[] var10000 = RenderUtil15_x.values();
      Iterator var7 = this.arrayList_s.iterator();
      LicenseState[] var8 = var10000;

      while (var7.hasNext()) {
         RenderUtil41 var9 = (RenderUtil41)var7.next();
         if (var9 == this.dataBuilder68_u) {
            var6 = true;
            if (var8 == null) {
               continue;
            }
         }

         if (var6 || var8 != null) {
            if (this.checkCondition(var9)) {
               var9.clamp(var1, var2, var3);
            }

            if (var8 != null) {
               break;
            }
         }
      }
   }

   private void lambda$draw_Inner1(float var1, float var2, float var3) {
      long var4 = 36447271111839L;
      LicenseState[] var10000 = RenderUtil15_x.values();
      Iterator var6 = this.arrayList_s.iterator();
      LicenseState[] var7 = var10000;

      while (var6.hasNext()) {
         RenderUtil41 var8 = (RenderUtil41)var6.next();
         if (this.checkCondition(var8) || var7 != null) {
            if (var8 == this.dataBuilder68_u && var7 == null) {
               break;
            }

            var8.clamp(var1, var2, var3);
            if (var7 != null) {
               break;
            }
         }
      }
   }

   private static String lambda$selectionChanged_Inner0(RenderUtil41 var0) {
      return var0.getDataBuilder52_j().moduleName;
   }

   static {
      long var0 = 35502897846702L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "DI³4{§*¡w>gj\u0018ÿ±X\u0018¯µ \u008c©Sh¯È\u0082«\u0098\u0085ßð\u0080%m\\\u0018\u0015\u0083\u0003m(OÐb\u008csÛzé¯ \u001d.\u0080ø7Ù-Km\u001d\u001a0o9\r\u0087\u0001ûTv\u0091©Iû\u0003\u0084eº\u008e(8¨T÷\u001dÉ\u008aº`ÞÙÝØ\u0016#kE\u0007n\u0017¼L%oO\u0000í¶Ç\u0083zYÈ@%czF\u008b\u001f±Î\bödlþ\t×Qâ×és\u0084W\u0095 \u0096a#J£R@N\u0015C\u0015Ò`ízÿ\u008b\u0000Óz\u0013¿'~zSyöXí\u00195\u0018®)\u009e\b'¹½õBþ\u0086fmeÒÈï¡\u001båiÐ$ø\u0010\u0092_Ãcø\u000e:×\r#\u0097E\u0006\u009d®{";
      int var7 = "DI³4{§*¡w>gj\u0018ÿ±X\u0018¯µ \u008c©Sh¯È\u0082«\u0098\u0085ßð\u0080%m\\\u0018\u0015\u0083\u0003m(OÐb\u008csÛzé¯ \u001d.\u0080ø7Ù-Km\u001d\u001a0o9\r\u0087\u0001ûTv\u0091©Iû\u0003\u0084eº\u008e(8¨T÷\u001dÉ\u008aº`ÞÙÝØ\u0016#kE\u0007n\u0017¼L%oO\u0000í¶Ç\u0083zYÈ@%czF\u008b\u001f±Î\bödlþ\t×Qâ×és\u0084W\u0095 \u0096a#J£R@N\u0015C\u0015Ò`ízÿ\u008b\u0000Óz\u0013¿'~zSyöXí\u00195\u0018®)\u009e\b'¹½õBþ\u0086fmeÒÈï¡\u001båiÐ$ø\u0010\u0092_Ãcø\u000e:×\r#\u0097E\u0006\u009d®{"
         .length();
      char var8 = 16;
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
                     CONST_E = var4;
                     CONST_F = new String[9];
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

                  var6 = "\u0098E\u009a\u0084\u008fÛC¤\u001cxÒzÌ\u001d\u0084±J\u0081\u009eªîîæýQ\u008c\tHû\u0015Æ8\u0010Úï\u0015C©/q\u0091Êþå\u0092\u009bÄ\u0016\u009d";
                  var7 = "\u0098E\u009a\u0084\u008fÛC¤\u001cxÒzÌ\u001d\u0084±J\u0081\u009eªîîæýQ\u008c\tHû\u0015Æ8\u0010Úï\u0015C©/q\u0091Êþå\u0092\u009bÄ\u0016\u009d"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15907;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dt", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/dt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
