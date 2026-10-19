package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.nanovg.NanoVG;
import rip.breeze.BreezeContext;
import rip.breeze.CloudAuthService;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.GuiPanelSettings;
import rip.breeze.IRenderer;
import rip.breeze.KeepParameters;
import rip.breeze.KeyBind;
import rip.breeze.LicenseState;
import rip.breeze.NanoVGRenderer;
import rip.breeze.StringDecryptor;

public class ClickGUI extends GuiScreen {
   private final GuiPanelSettings guiPanelSettings_a;
   private final ModuleManager moduleManager_b;
   private final Framebuffer framebuffer_c;
   private final GuiRenderer guiRenderer_d;
   private final KeyBind keyBind_e;
   private boolean fieldBool_f;
   private long fieldLong_g;
   private float fieldFloat_h;
   private float fieldFloat_i;
   private float fieldFloat_j;
   private float fieldFloat_k;
   private float fieldFloat_l;
   private int fieldInt_m;
   private long fieldLong_n;
   private boolean fieldBool_o;
   public boolean fieldBool_p;
   private static boolean fieldBool_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long eka_1;

   public ClickGUI(GuiPanelSettings var1, ModuleManager var2) {
      long var3 = 83869518324670L;
      super();
      this.keyBind_e = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_P());
      this.fieldBool_f = false;
      this.fieldBool_o = false;
      boolean var10000 = isValid();
      this.mc = Minecraft.getMinecraft();
      boolean var5 = var10000;
      this.guiPanelSettings_a = var1;
      this.moduleManager_b = var2;
      this.framebuffer_c = new Framebuffer(this.mc.displayWidth, this.mc.displayHeight, true);
      this.guiRenderer_d = new GuiRenderer();
      EventBus.processAll(this);
      if (!var5) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   @KeepParameters
   public void func_73863_a(int var1, int var2, float var3) {
      try {
         long var4 = 103021926262659L;
         float var6 = this.calculateFloat();
         boolean var10000 = checkCondition();
         this.calculate_2();
         boolean var7 = var10000;
         if (this.guiPanelSettings_a.isActive()) {
            this.fieldBool_f = true;
         }

         label26: {
            ItemIconCache.processAll();
            BreezeContext.iRenderer_b.endFrame();
            DrawUtils.calculate(2, 2);
            if (this.fieldBool_f) {
               this.moduleManager_b.calculate(this.fieldFloat_h, this.fieldFloat_i);
               if (!var7) {
                  break label26;
               }
            }

            this.processAll();
            this.guiPanelSettings_a.calculate(this.fieldFloat_h, this.fieldFloat_i, var6);
         }

         BreezeContext.iRenderer_b.beginFrame();
         if (!LicenseState.isValid_2()) {
            toggle(!var7);
         }
      } catch (Throwable var9) {
         System.err.print("[BREEZE-NVG] drawScreen exception swallowed: ");
         System.err.println(var9.toString());
         var9.printStackTrace(System.err);
      }
   }

   @KeepParameters
   public void func_73864_a(int var1, int var2, int var3) {
      long var4 = 85857248863614L;
      boolean var6 = checkCondition();
      if (this.fieldBool_f) {
         this.moduleManager_b.calculate_2(this.fieldFloat_h, this.fieldFloat_i, var3);
         if (!var6) {
            return;
         }
      }

      this.guiPanelSettings_a.checkCondition(this.fieldFloat_h, this.fieldFloat_i, var3);
   }

   @KeepParameters
   public void func_146286_b(int var1, int var2, int var3) {
      long var4 = 26824023491930L;
      boolean var6 = checkCondition();
      if (this.fieldBool_f) {
         this.moduleManager_b.render(this.fieldFloat_h, this.fieldFloat_i, var3);
         if (!var6) {
            return;
         }
      }

      this.guiPanelSettings_a.checkCondition_2(this.fieldFloat_h, this.fieldFloat_i, var3);
   }

   public void func_146281_b() {
      this.guiPanelSettings_a.toggle();
      this.fieldBool_p = false;
      this.fieldBool_f = false;
   }

   @KeepParameters
   public void func_146282_l() {
      long var1 = 54295146713259L;
      boolean var3 = isValid();
      if (Keyboard.getEventKeyState()) {
         if (Keyboard.getEventCharacter() != 0) {
            this.guiPanelSettings_a.checkCondition_3(Keyboard.getEventCharacter());
         }

         int var4 = Keyboard.getEventKey();
         if (!this.fieldBool_f && this.guiPanelSettings_a.checkCondition_4(var4)) {
            return;
         }

         if (var4 == this.keyBind_e.int_aJ) {
            this.fieldBool_o = true;
         }

         label34:
         if (var4 == BreezeContext.iKeybindSettings_e.getMode().int_aJ || var4 == BreezeContext.iKeyCodeProvider_g.getModifiedKeyCode()) {
            if (this.fieldBool_f) {
               this.fieldBool_f = false;
               return;
            }

            if (this.mc.currentScreen == this) {
               this.mc.displayGuiScreen(null);
               if (var3) {
                  break label34;
               }
            }

            this.onGuiClosed();
         }

         if (var3) {
            return;
         }
      }

      this.guiPanelSettings_a.checkCondition_5(Keyboard.getEventKey());
   }

   @EventListener
   public void openGui(KeyPressedEvent var1) {
      long var2 = 86311899828985L;
      if (var1.fieldInt_h == 211) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.fieldLong_n > 250L) {
            this.fieldInt_m = 0;
         }

         this.fieldLong_n = var4;
         if (++this.fieldInt_m >= 5) {
            this.fieldInt_m = 0;
            if (this.mc.theWorld != null && this.mc.currentScreen == null) {
               this.mc.displayGuiScreen(this);
               var1.a();
            }

            return;
         }
      }

      if (var1.fieldInt_h == BreezeContext.iKeybindSettings_e.getMode().int_aJ) {
         if (this.mc.theWorld != null && this.mc.currentScreen == null) {
            this.mc.displayGuiScreen(this);
         }

         var1.a();
      }
   }

   private void calculate() {
      long var1 = 18029740981601L;
      boolean var10000 = checkCondition();
      BreezeContext.iRenderer_b.endFrame();
      NanoVG.nnvgBeginFrame(((NanoVGRenderer)BreezeContext.iRenderer_b).getLong_F(), 1300.0F, 900.0F, 1.0F);
      boolean var3 = var10000;
      String var4 = BreezeContext.authSession_c.getString("panel.background-img");
      if (!var4.isEmpty()) {
         IRenderer var12 = BreezeContext.iRenderer_b;
         String var10002 = "<@breeze>";
         CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
         Object[] var10004 = MathUtil8.noArgs();
         Method var10006 = MathUtil8.getMethod_3(9037154485877149356L, var1);
         Object[] var10005 = var10004;
         CloudAuthService var15 = var10003;
         Method var13 = var10006;

         try {
            var14 = (String)var13.invoke(var15, var10005);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var12.drawTextInputSelected(
            var4.replace(var10002, var14),
            100.0F,
            100.0F,
            1000.0F,
            700.0F,
            BreezeContext.authSession_c.getFloat("panel.corner-radius"),
            false
         );
      }

      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            100.0F,
            100.0F,
            1000.0F,
            700.0F,
            BreezeContext.authSession_c.getFloat("panel.corner-radius"),
            BreezeContext.authSession_c.getColor("panel.background")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectGradient(
            100.0F,
            100.0F,
            1000.0F,
            700.0F,
            BreezeContext.authSession_c.getFloat("panel.corner-radius"),
            BreezeContext.authSession_c.getFloat("panel.border-thickness"),
            BreezeContext.authSession_c.getColor("panel.border")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            130.0F,
            640.0F,
            250.0F,
            130.0F,
            BreezeContext.authSession_c.getFloat("user-info.corner-radius"),
            BreezeContext.authSession_c.getColor("user-info.background")
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            130.0F,
            740.0F,
            250.0F,
            30.0F,
            new float[]{
               0.0F,
               0.0F,
               BreezeContext.authSession_c.getFloat("user-info.corner-radius"),
               BreezeContext.authSession_c.getFloat("user-info.corner-radius")
            },
            BreezeContext.authSession_c.getColor("user-info.icon-bar")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(145.0F, 655.0F, 70.0F, 70.0F, 35.0F, BreezeContext.authSession_c.getColor("default.text-tertiary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(230.0F, 660.0F, 90.0F, 18.0F, 9.0F, BreezeContext.authSession_c.getColor("default.text-primary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(230.0F, 690.0F, 50.0F, 12.0F, 6.0F, BreezeContext.authSession_c.getColor("default.text-secondary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(130.0F, 130.0F, 120.0F, 60.0F, 20.0F, BreezeContext.authSession_c.getColor("default.accent"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(260.0F, 140.0F, 80.0F, 20.0F, 10.0F, BreezeContext.authSession_c.getColor("default.text-primary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(260.0F, 165.0F, 40.0F, 16.0F, 8.0F, BreezeContext.authSession_c.getColor("default.text-tertiary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(130.0F, 270.0F, 140.0F, 25.0F, 15.0F, BreezeContext.authSession_c.getColor("default.text-tertiary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(130.0F, 310.0F, 250.0F, 30.0F, 15.0F, BreezeContext.authSession_c.getColor("tab.selected"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(130.0F, 355.0F, 80.0F, 25.0F, 15.0F, BreezeContext.authSession_c.getColor("default.text-tertiary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(570.0F, 130.0F, 350.0F, 40.0F, 20.0F, BreezeContext.authSession_c.getColor("default.text-tertiary"));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(575.0F, 135.0F, 30.0F, 30.0F, 15.0F, BreezeContext.authSession_c.getColor("default.text-primary"));
      float[] var5 = new float[]{40.0F, 30.0F, 60.0F, 10.0F};
      float[] var6 = new float[]{230.0F, 90.0F, 190.0F, 300.0F};
      float var7 = BreezeContext.authSession_c.getFloat("module.corner-radius");
      int var8 = 0;

      while (var8 < 4) {
         boolean var9 = var8 == 2;
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               430.0F,
               200 + var8 * 100,
               640.0F,
               80.0F,
               var7,
               var9
                  ? BreezeContext.authSession_c.getColor("module.background-hovered")
                  : BreezeContext.authSession_c.getColor("module.background")
            );
         BreezeContext.iRenderer_b
            .fillGradientRectSimple(
               1040.0F,
               200 + var8 * 100,
               30.0F,
               80.0F,
               new float[]{0.0F, var7, var7, 0.0F},
               var9
                  ? BreezeContext.authSession_c.getColor("module.edit-background-hovered")
                  : BreezeContext.authSession_c.getColor("module.edit-background")
            );
         int var10 = 0;

         while (var10 < 3) {
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  1051.0F,
                  216 + var8 * 100 + var10 * 20,
                  7.0F,
                  7.0F,
                  3.5F,
                  var9
                     ? BreezeContext.authSession_c.getColor("module.text-hovered")
                     : BreezeContext.authSession_c.getColor("module.text")
               );
            var10++;
            if (var3) {
               break;
            }
         }

         label67: {
            BreezeContext.iRenderer_b
               .fillGradientRectSimple(
                  430.0F,
                  200 + var8 * 100,
                  75.0F,
                  80.0F,
                  new float[]{var7, 0.0F, 0.0F, var7},
                  var9
                     ? BreezeContext.authSession_c.getColor("module.edit-background-hovered")
                     : BreezeContext.authSession_c.getColor("module.edit-background")
               );
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  520.0F,
                  215 + var8 * 100,
                  80.0F + var5[var8],
                  20.0F,
                  10.0F,
                  var9
                     ? BreezeContext.authSession_c.getColor("module.text-hovered")
                     : BreezeContext.authSession_c.getColor("module.text")
               );
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  520.0F,
                  245 + var8 * 100,
                  200.0F + var6[var8],
                  18.0F,
                  9.0F,
                  var9
                     ? BreezeContext.authSession_c.getColor("module.description-hovered")
                     : BreezeContext.authSession_c.getColor("module.description")
               );
            if (var9) {
               BreezeContext.iRenderer_b
                  .drawAnimatedIcon(470.0F, 240 + var8 * 100, BreezeContext.authSession_c.getColor("module.tick"), 1.0F);
               BreezeContext.iRenderer_b
                  .drawGlowCircle(
                     470.0F, 240 + var8 * 100, 24.0F, BreezeContext.authSession_c.getColor("module.tick"), 1.0F
                  );
               if (!var3) {
                  break label67;
               }
            }

            BreezeContext.iRenderer_b
               .fillCircle(470.0F, 240 + var8 * 100, 5.0F, BreezeContext.authSession_c.getColor("module.tick"));
         }

         var8++;
         if (var3) {
            break;
         }
      }

      NanoVG.nnvgEndFrame(((NanoVGRenderer)BreezeContext.iRenderer_b).getLong_F());
      BreezeContext.iRenderer_b.beginFrame();
   }

   private float calculateFloat() {
      long var1 = 4544980979771L;
      this.fieldFloat_h = Mouse.getX();
      this.fieldFloat_i = this.mc.displayHeight - Mouse.getY();
      if (this.guiPanelSettings_a.getFloat_p() < 0.8) {
         this.fieldFloat_h *= 1.5F;
         this.fieldFloat_h = this.fieldFloat_h - this.mc.displayWidth / 4.0F;
         this.fieldFloat_i *= 1.5F;
         this.fieldFloat_i = this.fieldFloat_i - this.mc.displayHeight / 4.0F;
      }

      long var3 = System.nanoTime();
      float var5 = (float)(var3 - this.fieldLong_g) / 1.0E9F;
      this.fieldLong_g = var3;
      return var5;
   }

   private void calculate_2() {
      long var1 = 50778828612045L;
      float var3 = Mouse.getDWheel();
      if (var3 != 0.0F) {
         this.guiPanelSettings_a.checkCondition_6(this.fieldFloat_h, this.fieldFloat_i, var3 / 5.0F);
      }
   }

   private void processAll() {
      long var1 = 77704840762471L;
      if (this.framebuffer_c.framebufferWidth != this.mc.displayWidth
         || this.framebuffer_c.framebufferHeight != this.mc.displayHeight
         || this.guiPanelSettings_a.getFloat_p() != this.fieldFloat_j
         || BreezeContext.authSession_c.getFloat("panel.corner-radius") != this.fieldFloat_k
         || BreezeContext.authSession_c.getFloat("panel.border-thickness") != this.fieldFloat_l) {
         int[] var3 = FontManager.values();
         this.guiPanelSettings_a.calculate_3();
         this.fieldFloat_j = BreezeContext.iKeybindSettings_e.getY();
         this.fieldFloat_k = BreezeContext.authSession_c.getFloat("panel.corner-radius");
         this.fieldFloat_l = BreezeContext.authSession_c.getFloat("panel.border-thickness");
         this.framebuffer_c.deleteFramebuffer();
         this.framebuffer_c.createBindFramebuffer(this.mc.displayWidth, this.mc.displayHeight);
         this.framebuffer_c.framebufferClear();
         this.framebuffer_c.bindFramebuffer(true);
         BreezeContext.iRenderer_b.executeWithAlpha(this.fieldFloat_j < 0.8 ? 0.6666667F : 1.0F, this::lambda$handleShadow_Inner0);
         FontManager.render(var3);
      }

      GlStateManager.clear(256);
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, this.mc.displayWidth, this.mc.displayHeight, 0.0, 1000.0, 3000.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.loadIdentity();
      GlStateManager.translate(0.0F, 0.0F, -2000.0F);
      this.mc.mcProfiler.startSection("shadow");
      this.guiRenderer_d.calculate(20, 255, this.framebuffer_c, Color.BLACK);
      GlStateManager.enableBlend();
      this.mc.mcProfiler.endSection();
   }

   public boolean isBool_f() {
      return this.fieldBool_f;
   }

   public boolean func_73868_f() {
      return false;
   }

   private void lambda$handleShadow_Inner0() {
      long var1 = 308104229879L;
      NanoVG.nvgShapeAntiAlias(((NanoVGRenderer)BreezeContext.iRenderer_b).getLong_F(), false);
      float var3 = BreezeContext.authSession_c.getFloat("panel.border-thickness") / 2.0F - 1.0F;
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.guiPanelSettings_a.getLicenseState_i().fieldFloat_a - var3,
            this.guiPanelSettings_a.getLicenseState_i().fieldFloat_b - var3,
            this.guiPanelSettings_a.getLicenseState_i().fieldFloat_c + var3 * 2.0F,
            this.guiPanelSettings_a.getLicenseState_i().fieldFloat_d + var3 * 2.0F,
            BreezeContext.authSession_c.getFloat("panel.corner-radius"),
            Color.BLACK
         );
   }

   public static void toggle(boolean var0) {
      fieldBool_q = var0;
   }

   public static boolean isValid() {
      return fieldBool_q;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      long var0 = 76307103603045L;
      toggle(true);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[35];
      int var5 = 0;
      String var6 = "\u0010\u0019çbr\u0094ãàÜÿò\u0096\u0000Ë·JGy\"¸@\fT½ì¢\u001fYìl\r\u0018ãoü\u008bñ5f\u007f(Þ\u007fÀ{f}¦ý\r\u0091\r\u0085µÃþ;\u0094Hê2\u0088¼\u009dúå¶\"\u0013\u0014\u0086n\u000bY\u0098dsf¦SÄ8\u008eòÍn\u0098 xÁÄ÷k°\u0090\u008c\u0095\u0019 ø}\u0083ò£Þ\u001e.Â6¤kAÑD\u0094z\t÷R\u0098Õ*k\u0017¸þ\u0094¢äºu\u0006¼9\u008axqå ãÏµ\u008b\u0094\u0019\u0092k'O8×\u0099V3ö\u0080À\u001c´¾ô\u0088r\u0081yÀÜ¯+\u0013\u0018\u0010û²C¬ØÛ©ÏÏìÓ\u0019ÙÆ;¦(+×z\u0093=Ô\u0081¼ºó?ùBÉÚu\u009d]\u0083ö\u008d\u0085sÚjqÍ\u0006\u0081Mx\b\u0098uM«T\u000f>30\u0087¦Í\u0090Ì×ÕÓ1Îò0\u0090\\\u0088.B\tõ\u008b§³\u0007X\u000ep_YÐ°´\b±\u008eóIº\u0013Êë\u008f%«\\\tÝðv(\u0093Í\u00061\u0081Tt î:\u008dI8\u0091»\u0084t\u009f\u0099ÈÄ \u0003¡A¸\u0007ÇáU÷]|¯á\u00059\u0013\u008cv\u0018@\u0018>\u0085H\u0099t\u009cl\u001a-\u000b,n¹\u0000ã\u0013Ö!Ôá\bÙ(\u00126\u0016LÕcK]HþµÀ²Ä?×ìç51&/§\u001b¸¶°èµºw²:ÄßiÈ\u0095\u0014 (Pj_{\u0010[)V\n6$£Á3û\u0083¢] \u0011;ìâ%¹ÛË\u001eÐÜÚ¦\u009a\u0096ö\f_8\u0012ý8Z¼t>]ðâyÊÌ\u0082sF'1n\u0093ýo·È½^ç2\u0004ø×\u009e/Y\u0084û\u0017ýÈïÈ£\u008d«\u009aÔ\u0011®u\u0085\u0004Â*×°\u001b\u001e?](R4\u0001\u001f\u0096y\\þ©Bæ\u0013È\u0089a±Öjß@\u0080Ml/&>¼îÓnV=S\nlPx÷\u009a\u008a(\u0091\fjÇ+²\u0099¡\u008c\u000f>]\u008a\u0088\u0082o\\¤·µÀ\rË&\u000b?+È\u0016××¥ÍøØ-Øn\u0086\u008b ½Rçø\u001d0\u007fÄÅ\u00948Â\u0096\u0019\u0018-ýÉN\u0013õÏ\u008d\u008aÆ\u0011;\n¹Ý\u0089'(¼\u009b±\u009b´º\u0007\u0081Ø\u0004^\u0082;\u0093IúÒùÀÔ\u0088±1q¡RPpÆæ\u0098\u0096~$ù¹Ly:\u0010(DwÃ\u0001¨\u0011ºI6íM~$¥´\r\u0099èµ\u009eç \u0087\u0006\u0007À¡\u00adJÒÆû5\u0000\u009cÜ@;`ô(·8\u0005wn\u0006ïgþí\u0092Àh\u000b\u0010ù\u001dµ.H-¬\\\u0001Ãûóu ¼T\u000b\u00adÌ4\u001eÖ\të\u009a\u0018%\u0000\bû\u001a\u0011G;oU$\u007fUFÝý±ÿåè\u008aûbä\u0018½4@[\u0084à37\u0097e\u009cã¦\u0094~7\u0085Ùäq\u0006=ê\u009c0Õæw\u007f/\u0098\nff\u0094È`¦Ô\t\u0007\u0015ÊAI\u0019\u001f\u0087\u0007\u008b\u0093È\u0080ªL!\u00163\u009csÈ¦\u009c\u0095èz\"`JG_\u008d©(¯àé®Ì\u000fEI¿g÷\u0016Óµ\u001eÍ]Lô\u000b;\u0087!Ôå|\rvÄ\u0006ÓÓ\u0015W×Ø\"Ì§\u0010(\u0007\u0012ÿa¬d\u0000\u0095\u0083\f2\u0081we©Ìo\u0082R\u001aíîqðpÔe|\u001f\u0085\u0010ß\u0000¯á^ätñ»(j}l¨\u0081\u0094ÑÉ<\u008b)O·û2\u0018]\u0097¥~añ¯+òÐÍ.\u0084OpWb\u0098\u008b¸§úî\u00948³CËo³º\u009f¨¬ÉÂøEF\u009dÎËêÜH\r\u00adÜ¢÷\u0098NÍF\fg6cô¢ÛÖ6jM\u009e×elÙøÐ;vH\u0013\u0082\u009e\u008fðÈ(sbñ8\u00ad\u009bÉ\u0087!K\u009bè\nr\f[ðù\u008dzR\u001f6Cþ|ðÏÙÚ\u0000\u0090ºº\\´#-\u008aÑ(Pëe\"¥\u000b\u0003WºÀ@Éì©ÔR\u0005X)ã\u0086K\u0083\u009aEA¿\u009a K\u0007\u00adæ\u009dWÔE's\u0014()X\u008a\u0083¶JÔõö\u0000\u008e:\u0090û\biºâ>\t$\u000b\rÁcÄàïÄT®{2S®¥\u007f\u0096\u0093ç ®ÿ½IÇ\u0088äV2¢\u0093¸|\u0094mÏ\u0089ºªåsÆù^qÏ=m|·ªí \u0084ÆÂÈ¬).Ú\u000e¸  ÷_ÖÎ¶\u0010kÂ\u0093T>5TGßNÊàAd07\u0085¤\u009f\u0095³âuÿV4ÿüUÌÖ¤K¼IVh\rîûR¬Õ4Jù*í5óæ\u008fª\u0083[ö²x\u0095;Â\u008a¯ Á´¦©\u008fÝþõ[Ñó\u0016\fv\u007fØ8.\u0007\u0098Ñ\u0010\u0084ññ\u0091W©>iãô &°ùÌ\u0097¯þ ÃZ\u0089r\u008e:1Ò}k\u008dÎÅ¶&Cìlû±ÑjK\u0090";
      int var7 = "\u0010\u0019çbr\u0094ãàÜÿò\u0096\u0000Ë·JGy\"¸@\fT½ì¢\u001fYìl\r\u0018ãoü\u008bñ5f\u007f(Þ\u007fÀ{f}¦ý\r\u0091\r\u0085µÃþ;\u0094Hê2\u0088¼\u009dúå¶\"\u0013\u0014\u0086n\u000bY\u0098dsf¦SÄ8\u008eòÍn\u0098 xÁÄ÷k°\u0090\u008c\u0095\u0019 ø}\u0083ò£Þ\u001e.Â6¤kAÑD\u0094z\t÷R\u0098Õ*k\u0017¸þ\u0094¢äºu\u0006¼9\u008axqå ãÏµ\u008b\u0094\u0019\u0092k'O8×\u0099V3ö\u0080À\u001c´¾ô\u0088r\u0081yÀÜ¯+\u0013\u0018\u0010û²C¬ØÛ©ÏÏìÓ\u0019ÙÆ;¦(+×z\u0093=Ô\u0081¼ºó?ùBÉÚu\u009d]\u0083ö\u008d\u0085sÚjqÍ\u0006\u0081Mx\b\u0098uM«T\u000f>30\u0087¦Í\u0090Ì×ÕÓ1Îò0\u0090\\\u0088.B\tõ\u008b§³\u0007X\u000ep_YÐ°´\b±\u008eóIº\u0013Êë\u008f%«\\\tÝðv(\u0093Í\u00061\u0081Tt î:\u008dI8\u0091»\u0084t\u009f\u0099ÈÄ \u0003¡A¸\u0007ÇáU÷]|¯á\u00059\u0013\u008cv\u0018@\u0018>\u0085H\u0099t\u009cl\u001a-\u000b,n¹\u0000ã\u0013Ö!Ôá\bÙ(\u00126\u0016LÕcK]HþµÀ²Ä?×ìç51&/§\u001b¸¶°èµºw²:ÄßiÈ\u0095\u0014 (Pj_{\u0010[)V\n6$£Á3û\u0083¢] \u0011;ìâ%¹ÛË\u001eÐÜÚ¦\u009a\u0096ö\f_8\u0012ý8Z¼t>]ðâyÊÌ\u0082sF'1n\u0093ýo·È½^ç2\u0004ø×\u009e/Y\u0084û\u0017ýÈïÈ£\u008d«\u009aÔ\u0011®u\u0085\u0004Â*×°\u001b\u001e?](R4\u0001\u001f\u0096y\\þ©Bæ\u0013È\u0089a±Öjß@\u0080Ml/&>¼îÓnV=S\nlPx÷\u009a\u008a(\u0091\fjÇ+²\u0099¡\u008c\u000f>]\u008a\u0088\u0082o\\¤·µÀ\rË&\u000b?+È\u0016××¥ÍøØ-Øn\u0086\u008b ½Rçø\u001d0\u007fÄÅ\u00948Â\u0096\u0019\u0018-ýÉN\u0013õÏ\u008d\u008aÆ\u0011;\n¹Ý\u0089'(¼\u009b±\u009b´º\u0007\u0081Ø\u0004^\u0082;\u0093IúÒùÀÔ\u0088±1q¡RPpÆæ\u0098\u0096~$ù¹Ly:\u0010(DwÃ\u0001¨\u0011ºI6íM~$¥´\r\u0099èµ\u009eç \u0087\u0006\u0007À¡\u00adJÒÆû5\u0000\u009cÜ@;`ô(·8\u0005wn\u0006ïgþí\u0092Àh\u000b\u0010ù\u001dµ.H-¬\\\u0001Ãûóu ¼T\u000b\u00adÌ4\u001eÖ\të\u009a\u0018%\u0000\bû\u001a\u0011G;oU$\u007fUFÝý±ÿåè\u008aûbä\u0018½4@[\u0084à37\u0097e\u009cã¦\u0094~7\u0085Ùäq\u0006=ê\u009c0Õæw\u007f/\u0098\nff\u0094È`¦Ô\t\u0007\u0015ÊAI\u0019\u001f\u0087\u0007\u008b\u0093È\u0080ªL!\u00163\u009csÈ¦\u009c\u0095èz\"`JG_\u008d©(¯àé®Ì\u000fEI¿g÷\u0016Óµ\u001eÍ]Lô\u000b;\u0087!Ôå|\rvÄ\u0006ÓÓ\u0015W×Ø\"Ì§\u0010(\u0007\u0012ÿa¬d\u0000\u0095\u0083\f2\u0081we©Ìo\u0082R\u001aíîqðpÔe|\u001f\u0085\u0010ß\u0000¯á^ätñ»(j}l¨\u0081\u0094ÑÉ<\u008b)O·û2\u0018]\u0097¥~añ¯+òÐÍ.\u0084OpWb\u0098\u008b¸§úî\u00948³CËo³º\u009f¨¬ÉÂøEF\u009dÎËêÜH\r\u00adÜ¢÷\u0098NÍF\fg6cô¢ÛÖ6jM\u009e×elÙøÐ;vH\u0013\u0082\u009e\u008fðÈ(sbñ8\u00ad\u009bÉ\u0087!K\u009bè\nr\f[ðù\u008dzR\u001f6Cþ|ðÏÙÚ\u0000\u0090ºº\\´#-\u008aÑ(Pëe\"¥\u000b\u0003WºÀ@Éì©ÔR\u0005X)ã\u0086K\u0083\u009aEA¿\u009a K\u0007\u00adæ\u009dWÔE's\u0014()X\u008a\u0083¶JÔõö\u0000\u008e:\u0090û\biºâ>\t$\u000b\rÁcÄàïÄT®{2S®¥\u007f\u0096\u0093ç ®ÿ½IÇ\u0088äV2¢\u0093¸|\u0094mÏ\u0089ºªåsÆù^qÏ=m|·ªí \u0084ÆÂÈ¬).Ú\u000e¸  ÷_ÖÎ¶\u0010kÂ\u0093T>5TGßNÊàAd07\u0085¤\u009f\u0095³âuÿV4ÿüUÌÖ¤K¼IVh\rîûR¬Õ4Jù*í5óæ\u008fª\u0083[ö²x\u0095;Â\u008a¯ Á´¦©\u008fÝþõ[Ñó\u0016\fv\u007fØ8.\u0007\u0098Ñ\u0010\u0084ññ\u0091W©>iãô &°ùÌ\u0097¯þ ÃZ\u0089r\u008e:1Ò}k\u008dÎÅ¶&Cìlû±ÑjK\u0090"
         .length();
      char var8 = '(';
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
                     CONST_S = var4;
                     CONST_T = new String[35];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 963654218750168783L;
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
                     250L = var30;
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

                  var6 = "°jµ\u0084®MQ\u009f2\fÍ hò¾H\u000e\u0094|Õ3D´(«>î\u009e\u000bÊ\u0006óªBÈ)\u0018\u0000v×(ZÂ¥¹îr\u000b<W\t#<\u0012P\u000f\u001b\u0011L\u0080È\u0084\u0014ÎXú¶Ìì\u0094{§_Ãd.\u00987Ö\u00adñ";
                  var7 = "°jµ\u0084®MQ\u009f2\fÍ hò¾H\u000e\u0094|Õ3D´(«>î\u009e\u000bÊ\u0006óªBÈ)\u0018\u0000v×(ZÂ¥¹îr\u000b<W\t#<\u0012P\u000f\u001b\u0011L\u0080È\u0084\u0014ÎXú¶Ìì\u0094{§_Ãd.\u00987Ö\u00adñ"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6446;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fU", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/fU" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
