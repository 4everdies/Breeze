package rip.breeze;

import java.awt.Desktop;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class FileUtil2 extends RenderUtil50 {
   private final Map<ImageUtil15, RenderUtil42> scriptingSetting;
   private final ImageUtil2 breezeUtil110_q;
   private final ImageUtil2 breezeUtil110_r;
   private final ImageUtil2 breezeUtil110_s;
   private LicenseState licenseState_t;
   private RenderUtil42 dataBuilder71_u;
   private boolean fieldBool_v;
   private float fieldFloat_w;
   private int fieldInt_x;
   private static LicenseState[] arr_y;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public FileUtil2() {
      long var1 = 98819270482377L;
      short var10001 = 21084;
      long var10002 = 295966606987079L ^ var1;
      super("Scripting");
      this.scriptingSetting = new HashMap<>();
      this.licenseState_t = new LicenseState();
      LicenseState[] var10000 = decrypt();
      this.dataBuilder71_u = null;
      LicenseState[] var3 = var10000;
      this.fieldBool_v = false;
      this.fieldFloat_w = 0.0F;
      this.fieldInt_x = 0;
      LicenseState var10003 = new LicenseState();
      short var10004 = 383;
      long var10005 = 3198410755904756842L ^ var1;
      Runnable var9 = this::processAll_2;
      short var10007 = 9415;
      long var10008 = 4489502523962751443L ^ var1;
      this.breezeUtil110_q = new ImageUtil2(var10003, "help", var9, true, "directory");
      var10003 = new LicenseState();
      var10004 = 32597;
      var10005 = 7036010369285628485L ^ var1;
      Runnable var11 = this::processAll_3;
      var10007 = 27013;
      var10008 = 1940627520924890258L ^ var1;
      this.breezeUtil110_r = new ImageUtil2(var10003, "Open the breeze scripting folder.", var11, true, "Install the breeze scripting extension for VSCode.");
      this.breezeUtil110_s = new ImageUtil2(
         new LicenseState(), "extension", this::processAll, true, "Install the breeze scripting extension for VSCode."
      );

      for (ImageUtil15 var5 : BreezeContext.dataBuilder15_j.getList_3()) {
         RenderUtil42 var6 = new RenderUtil42(var5, this);
         this.scriptingSetting.put(var5, var6);
         if (var3 != null) {
            break;
         }
      }
   }

   private void processAll() {
      long var1 = 29288081403434L;

      try {
         Desktop.getDesktop().browse(new URI("https://marketplace.visualstudio.com/items?itemName=BreezeDevelopment.breezescript"));
      } catch (Exception var4) {
      }
   }

   private void processAll_2() {
      long var1 = 89883542732451L;

      try {
         Desktop.getDesktop().browse(new URI("https://scripting.breeze.rip"));
      } catch (Exception var4) {
      }
   }

   private void processAll_3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/FileUtil2.126068161461803L J
      // 03: ldc2_w 17938728029150
      // 06: lxor
      // 07: lstore 1
      // 08: getstatic rip/breeze/BreezeContext.dataBuilder15_j Lrip/breeze/AnimationTimer;
      // 0b: invokevirtual rip/breeze/AnimationTimer.getFile_d ()Ljava/io/File;
      // 0e: invokevirtual java/io/File.exists ()Z
      // 11: ifne 61
      // 14: getstatic rip/breeze/BreezeContext.dataBuilder15_j Lrip/breeze/AnimationTimer;
      // 17: invokevirtual rip/breeze/AnimationTimer.getFile_d ()Ljava/io/File;
      // 1a: invokevirtual java/io/File.mkdirs ()Z
      // 1d: ifne 61
      // 20: goto 27
      // 23: invokestatic rip/breeze/FileUtil2.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: getstatic rip/breeze/BreezeContext.guiPanelSettings_f Lrip/breeze/GuiPanelSettings;
      // 2a: sipush 2290
      // 2d: ldc2_w 2211853598493178326
      // 30: lload 1
      // 31: lxor
      // 32: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/FileUtil2.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: new java/lang/StringBuilder
      // 3a: dup
      // 3b: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e: getstatic rip/breeze/RenderUtil18_x.RED Lrip/breeze/RenderUtil18_x;
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 44: sipush 24583
      // 47: ldc2_w 3075603912257016109
      // 4a: lload 1
      // 4b: lxor
      // 4c: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/FileUtil2.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: invokevirtual rip/breeze/GuiPanelSettings.processAll (Ljava/lang/String;Ljava/lang/String;)V
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/FileUtil2.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: invokestatic java/awt/Desktop.getDesktop ()Ljava/awt/Desktop;
      // 64: getstatic rip/breeze/BreezeContext.dataBuilder15_j Lrip/breeze/AnimationTimer;
      // 67: invokevirtual rip/breeze/AnimationTimer.getFile_d ()Ljava/io/File;
      // 6a: invokevirtual java/awt/Desktop.open (Ljava/io/File;)V
      // 6d: goto 71
      // 70: astore 3
      // 71: return
      // try (8 -> 34): 35 java/lang/Exception
      // try (4 -> 12): 13 java/lang/Exception
      // try (4 -> 41): 42 java/lang/Exception
   }

   private void toggle() {
      long var1 = 94123435901596L;
      LicenseState[] var3 = decrypt();
      if (BreezeContext.dataBuilder15_j.checkCondition()) {
         List var4 = BreezeContext.dataBuilder15_j.getList_3();

         for (ImageUtil15 var6 : var4) {
            if (!this.scriptingSetting.containsKey(var6)) {
               RenderUtil42 var7 = new RenderUtil42(var6, this);
               var7.update_1();
               this.scriptingSetting.put(var6, var7);
            }

            if (var3 != null) {
               break;
            }
         }

         Iterator var8 = this.scriptingSetting.values().iterator();

         while (var8.hasNext()) {
            RenderUtil42 var9 = (RenderUtil42)var8.next();
            if (!var4.contains(var9.getDataBuilder17_j())) {
               if (var9 == this.dataBuilder71_u) {
                  var9.update_2();
                  this.dataBuilder71_u = null;
                  this.fieldBool_v = false;
               }

               var8.remove();
            }

            if (var3 != null) {
               break;
            }
         }

         this.calculate(false);
      }
   }

   public void calculate(boolean var1) {
      long var2 = 26354956065104L;
      float var4 = 0.0F;
      LicenseState[] var10000 = decrypt();
      float var5 = 0.0F;
      LicenseState[] var6 = var10000;
      this.fieldInt_x = this.scriptingSetting.size() * 90;

      for (RenderUtil42 var8 : this.scriptingSetting.values()) {
         var8.a(this.licenseState_t.fieldFloat_a + 10.0F, this.licenseState_t.fieldFloat_b + var4 - this.fieldFloat_w, this.licenseState_t.fieldFloat_c - 20.0F, 80.0F);
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

   public void update(RenderUtil6_x var1) {
      super.b(var1);
   }

   public void update_1(RenderUtil6_x var1) {
      super.c(var1);
   }

   public void processNullable(ImageUtil15 var1) {
      long var2 = 107721923873014L;
      RenderUtil42 var4 = this.scriptingSetting.get(var1);
      if (var4 == null) {
         this.toggle();
         var4 = this.scriptingSetting.get(var1);
         if (var4 == null) {
            return;
         }
      }

      if (var4 == this.dataBuilder71_u) {
         this.fieldBool_v = false;
      } else {
         this.fieldFloat_w = 0.0F;
         this.calculate(false);
         this.toggle_2(var4);
      }
   }

   public void toggle_2(RenderUtil42 var1) {
      long var2 = 75190586480678L;
      if (this.dataBuilder71_u != null && this.dataBuilder71_u != var1) {
         this.dataBuilder71_u.update_2();
      }

      this.dataBuilder71_u = var1;
      this.fieldBool_v = this.dataBuilder71_u == null;
   }

   public void setBool_v() {
      this.fieldBool_v = true;
   }

   public RenderUtil42 getDataBuilder71_u() {
      return this.dataBuilder71_u;
   }

   public boolean isBool_v() {
      return this.fieldBool_v;
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      this.breezeUtil110_s.calculate(var1, var2, var3);
      LicenseState[] var10000 = decrypt();
      this.breezeUtil110_r.calculate(var1, var2, var3);
      LicenseState[] var8 = var10000;
      this.breezeUtil110_q.calculate(var1, var2, var3);
      this.toggle();

      for (ImageUtil15 var10 : this.scriptingSetting.keySet()) {
         RenderUtil42 var11 = this.scriptingSetting.get(var10);
         if (var11 != this.dataBuilder71_u || var8 != null) {
            var11.absValue(var1, var2, var3);
            if (var8 != null) {
               break;
            }
         }
      }

      if (this.dataBuilder71_u != null) {
         this.dataBuilder71_u.absValue(var1, var2, var3);
      }

      LicenseState var12 = new LicenseState(this.licenseState_t.fieldFloat_a, this.licenseState_t.fieldFloat_b, this.licenseState_t.fieldFloat_c, this.licenseState_t.fieldFloat_d);
      if (this.dataBuilder71_u != null) {
         var12.fieldFloat_d = Math.max(0.0F, this.dataBuilder71_u.getLicenseState_x().fieldFloat_b - this.licenseState_t.fieldFloat_b - 2.0F);
      }

      if (this.dataBuilder71_u == null || this.dataBuilder71_u.dataBuilder15_t.getDouble(var6) != 1.0) {
         BreezeContext.iRenderer_b.renderWithBounds(var12, this::lambda$draw_Inner0);
      }

      if (this.dataBuilder71_u != null) {
         this.dataBuilder71_u.clamp(var1, var2, var3);
      }

      if (this.dataBuilder71_u != null && this.dataBuilder71_u.dataBuilder15_t.getDouble(var6) != 1.0) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)(1.0 - this.dataBuilder71_u.dataBuilder15_t.getDouble(var6)));
         BreezeContext.iRenderer_b.renderWithBounds(this.licenseState_t, this::lambda$draw_Inner1);
         BreezeContext.iRenderer_b.frameEnd();
      }

      if (this.dataBuilder71_u == null) {
         super.a(var1, var2, var3);
         if (var8 == null) {
            return;
         }
      }

      if (this.d(this.dataBuilder71_u.breezeUtil97_v)) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder71_u.dataBuilder15_u.getDouble(var6));
         this.dataBuilder71_u.breezeUtil97_v.processAll(var1, var2, var3);
         BreezeContext.iRenderer_b.frameEnd();
      }
   }

   public void processNullable_2() {
      long var1 = 67137573248254L;
      super.h();
      if (this.dataBuilder71_u != null) {
         this.dataBuilder71_u.h();
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   public boolean isValid_2() {
      return true;
   }

   public boolean checkCondition(int var1) {
      long var2 = 45508263211567L;
      if (super.a(var1)) {
         return true;
      } else if (var1 == BreezeContext.iKeyCodeProvider_g.getModifiedKeyCode() && this.dataBuilder71_u != null) {
         this.setBool_v();
         return true;
      } else {
         return false;
      }
   }

   public boolean checkCondition_2(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      LicenseState[] var7 = decrypt();
      if (this.breezeUtil110_s.a(var1, var2, var3, var4)) {
         var4 = true;
      }

      if (this.breezeUtil110_r.a(var1, var2, var3, var4)) {
         var4 = true;
      }

      if (this.breezeUtil110_q.a(var1, var2, var3, var4)) {
         var4 = true;
      }

      if (this.dataBuilder71_u == null) {
         for (RenderUtil42 var9 : this.scriptingSetting.values()) {
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

      if (this.dataBuilder71_u.checkCondition(var1, var2, var3, var4)) {
         var4 = true;
      }

      return super.a(var1, var2, var3, var4);
   }

   public void update_2(float var1, float var2, int var3) {
      super.b(var1, var2, var3);
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (super.b(var1, var2, var3)) {
         return true;
      } else if (this.licenseState_t.isValid(var1, var2) && this.dataBuilder71_u == null) {
         this.fieldFloat_w = this.fieldFloat_w - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_w = Math.max(0.0F, Math.min(this.fieldFloat_w, this.fieldInt_x - this.licenseState_t.fieldFloat_d));
         this.calculate(false);
         return true;
      } else {
         return false;
      }
   }

   public void calculate_2() {
      this.licenseState_t = new LicenseState(this.a, this.b + 10.0F, this.c, this.d - 20.0F);
      this.breezeUtil110_s.a(this.m.calculateFloat() - 65.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_r.a(this.m.calculateFloat() - 115.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_q.a(this.m.calculateFloat() - 165.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.calculate(true);
   }

   public String getString() {
      long var1 = 11960387023038L;
      return "script";
   }

   private void lambda$draw_Inner1(float var1, float var2, float var3) {
      long var4 = 133695813171671L;
      LicenseState[] var10000 = decrypt();
      boolean var6 = false;
      Iterator var7 = this.scriptingSetting.values().iterator();
      LicenseState[] var8 = var10000;

      while (var7.hasNext()) {
         RenderUtil42 var9 = (RenderUtil42)var7.next();
         if (var9 == this.dataBuilder71_u) {
            var6 = true;
            if (var8 == null) {
               continue;
            }
         }

         if (var6 || var8 != null) {
            var9.clamp(var1, var2, var3);
            if (var8 != null) {
               break;
            }
         }
      }
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      long var4 = 31643585283974L;
      LicenseState[] var10000 = decrypt();
      Iterator var6 = this.scriptingSetting.values().iterator();
      LicenseState[] var7 = var10000;

      while (var6.hasNext()) {
         RenderUtil42 var8 = (RenderUtil42)var6.next();
         if (var8 == this.dataBuilder71_u && var7 == null) {
            break;
         }

         var8.clamp(var1, var2, var3);
         if (var7 != null) {
            break;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_y = var0;
   }

   public static LicenseState[] decrypt() {
      return arr_y;
   }

   static {
      long var0 = 62607897924227L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "¸Â·\u0087/_v]åó©º«\u0004\u0092Ün~ÂrËËÕl\u0011L\u008c\u008aþm6PX\u0017}ÖÝ¦Kg^À}\u0000:ùp\u0019\u0005\u0093ÈÞÏb+ì\u001eI\u000f´N\u00adø}\nµý»ÆüfÇ*Ä4Bcø\u0081ºg¶°\u001bUÇ\u009aâÊ9rF\u008eÁp\u0003Ù¯\u0084ß_ô9F\u00877eaê\u0092-ð<<áª\"7 148ïrv{ÄÒTÁ\u0088Ò«âq\u0003&®\u00053öv¼\u001c§\u0094×\u0002NÛÀ\u008d-Æ²\u0080\u0012ß\u0005\u0088OH[C« ÷Ä>1z}÷\u0083í\u0081\u0006\u0019\u0018÷!þ\u0098\rÏ|·\u0017\u0010¯\u008aK¶»\u00adß\u001dÅôùÊ\u009a}@zofý1\u001fÀÛRK\u0000\u0016\u009fº[\u007fªVÝ\u0096,Í/\u0094µeë«\u0004\u001bv\u009cé\u0096\"½¾ìÿÅ\u0017±mitWÐQ\tmú÷+®óÍì©\u001cr\u0080¼µ¬8\u0001óeÖ\u008bèâ\u0089Ö\bì\u0095IÛ4Anü~p\u0094\u0086\u0089\u0094ÅC5õ\u0017©#h\\\u009d\u0017é\u009bJq,Ey4\u0012@å\u008f\u0004 \u008bïC\u0005Øé\\\u0010\u0089©Ë¶yè\u0089\u001f¼°æÕ\u0012#b\u008c8|%jßô\u001cesc\u0010oM\u0085Pe×øß8^\u0098rpú.W\u000bÇõ\tôUe\u0004ô'\u0003\u008clö\u0007ÿ\f¼\u000f{\u001eX\u0091\u0089\u0017üÊ×\u000e\u001f\u0018\u009eM\u0095Øü¤-]\u008f|Ý\u0081\u0082«©k«A$¬^\u0093l7\u0088E\bÙ÷Æ:WO\u0099cD\u008dU¸¹K!\u0091\\o'\u001bk\u0014²Ò\u0099Akßv3Õ\u0010#\b7¦ì·7\u0096ò³Û\u008b¨>\u0010gVà\u008cì\f\u009d\u0084Ë#Ü\u0012\u001d¯Í\u0096\u000eµ-Õx¶G¯\u009b\u000fZM\u0001?Å\u0003\u009c]B\u0092å}¶à\u009e7ë\u008cs\\\u009c)÷ö\u0015\")V.\f§ò£:<$u%Ý\u0019j\u0086Ò\u0015\u000b»\u009a;:Îk\u0081%\u0014ÞÝøÓµìÐ";
      int var7 = "¸Â·\u0087/_v]åó©º«\u0004\u0092Ün~ÂrËËÕl\u0011L\u008c\u008aþm6PX\u0017}ÖÝ¦Kg^À}\u0000:ùp\u0019\u0005\u0093ÈÞÏb+ì\u001eI\u000f´N\u00adø}\nµý»ÆüfÇ*Ä4Bcø\u0081ºg¶°\u001bUÇ\u009aâÊ9rF\u008eÁp\u0003Ù¯\u0084ß_ô9F\u00877eaê\u0092-ð<<áª\"7 148ïrv{ÄÒTÁ\u0088Ò«âq\u0003&®\u00053öv¼\u001c§\u0094×\u0002NÛÀ\u008d-Æ²\u0080\u0012ß\u0005\u0088OH[C« ÷Ä>1z}÷\u0083í\u0081\u0006\u0019\u0018÷!þ\u0098\rÏ|·\u0017\u0010¯\u008aK¶»\u00adß\u001dÅôùÊ\u009a}@zofý1\u001fÀÛRK\u0000\u0016\u009fº[\u007fªVÝ\u0096,Í/\u0094µeë«\u0004\u001bv\u009cé\u0096\"½¾ìÿÅ\u0017±mitWÐQ\tmú÷+®óÍì©\u001cr\u0080¼µ¬8\u0001óeÖ\u008bèâ\u0089Ö\bì\u0095IÛ4Anü~p\u0094\u0086\u0089\u0094ÅC5õ\u0017©#h\\\u009d\u0017é\u009bJq,Ey4\u0012@å\u008f\u0004 \u008bïC\u0005Øé\\\u0010\u0089©Ë¶yè\u0089\u001f¼°æÕ\u0012#b\u008c8|%jßô\u001cesc\u0010oM\u0085Pe×øß8^\u0098rpú.W\u000bÇõ\tôUe\u0004ô'\u0003\u008clö\u0007ÿ\f¼\u000f{\u001eX\u0091\u0089\u0017üÊ×\u000e\u001f\u0018\u009eM\u0095Øü¤-]\u008f|Ý\u0081\u0082«©k«A$¬^\u0093l7\u0088E\bÙ÷Æ:WO\u0099cD\u008dU¸¹K!\u0091\\o'\u001bk\u0014²Ò\u0099Akßv3Õ\u0010#\b7¦ì·7\u0096ò³Û\u008b¨>\u0010gVà\u008cì\f\u009d\u0084Ë#Ü\u0012\u001d¯Í\u0096\u000eµ-Õx¶G¯\u009b\u000fZM\u0001?Å\u0003\u009c]B\u0092å}¶à\u009e7ë\u008cs\\\u009c)÷ö\u0015\")V.\f§ò£:<$u%Ý\u0019j\u0086Ò\u0015\u000b»\u009a;:Îk\u0081%\u0014ÞÝøÓµìÐ"
         .length();
      char var8 = ' ';
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
                     CONST_F = new String[12];
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

                  var6 = "¢àÔ\\ájKL\u001aäýÊ\u0086\nªF\u0010R\u0085JJT2?c\u008e\u00062R£\töÂ";
                  var7 = "¢àÔ\\ájKL\u001aäýÊ\u0086\nªF\u0010R\u0085JJT2?c\u008e\u00062R£\töÂ".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17626;
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
            throw new RuntimeException("rip/breeze/du", var10);
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
         throw new RuntimeException("rip/breeze/du" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
