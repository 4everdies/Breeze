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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.ColorMode2;
import rip.breeze.KeybindSettings;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

public class ModuleManager {
   private final boolean fieldBool_a;
   public static final long cipher_key_mm;
   private final MathUtil10[] arr_c;
   private final MathUtil10[] arr_d;
   private final MathUtil10[] arr_e;
   private final FontManager fontManager_f;
   private final FontManager fontManager_g;
   private final FontManager fontManager_h;
   public FontManager fontManager_i;
   public MathUtil10 dataBuilder46_j;
   public int fieldInt_k;
   public int fieldInt_l;
   private ArrayList<rip.breeze.IBreezeInterface> arrayList_m;
   private rip.breeze.IBreezeInterface2 iBreezeInterface2_n;
   private int fieldInt_o;
   private int fieldInt_p;
   private static String string_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long[] CONST_V;
   private static final Integer[] CONST_W;
   private static final Map CONST_X;

   public ModuleManager() {
      long var1 = 79706271738959L;
      super();
      BreezeClient.getBreezeClient().moduleManager_e = this;
      this.fieldBool_a = true;
      boolean var10000 = ConfigManager.isValid();
      MathUtil10[] var10002 = new MathUtil10[4];
      short var10005 = 22986;
      long var10006 = 6368679604956835343L ^ var1;
      var10002[0] = MathUtil10.getDataBuilder46_2("ProductSans-Medium", 10, true);
      var10005 = 28344;
      var10006 = 7861069277644560748L ^ var1;
      var10002[1] = MathUtil10.getDataBuilder46_2("ProductSans-Medium", 20, true);
      var10005 = 28344;
      var10006 = 7861069277644560748L ^ var1;
      var10002[2] = MathUtil10.getDataBuilder46_2("ProductSans-Medium", 30, true);
      var10005 = 28344;
      var10006 = 7861069277644560748L ^ var1;
      var10002[3] = MathUtil10.getDataBuilder46_2("ProductSans-Medium", 40, true);
      this.arr_c = var10002;
      var10002 = new MathUtil10[4];
      var10005 = 18827;
      var10006 = 2897243327626264150L ^ var1;
      var10002[0] = MathUtil10.getDataBuilder46_2("ProductSans-Regular", 10, true);
      var10005 = 14611;
      var10006 = 6016247511471279833L ^ var1;
      var10002[1] = MathUtil10.getDataBuilder46_2("ProductSans-Regular", 20, true);
      var10005 = 14611;
      var10006 = 6016247511471279833L ^ var1;
      var10002[2] = MathUtil10.getDataBuilder46_2("ProductSans-Regular", 30, true);
      var10005 = 14611;
      var10006 = 6016247511471279833L ^ var1;
      var10002[3] = MathUtil10.getDataBuilder46_2("ProductSans-Regular", 40, true);
      this.arr_d = var10002;
      boolean var3 = var10000;
      this.arr_e = new MathUtil10[]{MathUtil10.clamp(8), MathUtil10.clamp(16), MathUtil10.clamp(24), MathUtil10.clamp(32)};
      short var10003 = 13989;
      long var10004 = 8772812073698378100L ^ var1;
      short var7 = 15568;
      long var19 = 5111874089194048280L ^ var1;
      this.fontManager_f = new FontManager("font/rainbow.fsh", "font/vertex.vsh");
      var10003 = 16580;
      var10004 = 1626816972589217566L ^ var1;
      short var9 = 1749;
      long var20 = 6128851524467421470L ^ var1;
      this.fontManager_g = new FontManager("font/pulse.fsh", "font/vertex.vsh");
      var10003 = 28527;
      var10004 = 6062062013321975992L ^ var1;
      short var11 = 1749;
      long var21 = 6128851524467421470L ^ var1;
      this.fontManager_h = new FontManager("font/gradient.fsh", "font/vertex.vsh");
      this.fontManager_i = this.fontManager_f;
      this.dataBuilder46_j = this.arr_c[1];
      this.fieldInt_k = 1630875294;
      this.fieldInt_l = 1083463252;
      this.arrayList_m = new ArrayList<>();
      this.iBreezeInterface2_n = null;
      this.fieldInt_o = 0;
      this.fieldInt_p = 0;
      if (var3) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public void openScreen() {
      long var1 = 87946509466124L;
      boolean var10000 = ConfigManager.isValid();
      Iterator var3 = BreezeContext.moduleBase_a.getAllModules().iterator();
      boolean var4 = var10000;

      while (var3.hasNext()) {
         BreezeModule var5 = (BreezeModule)var3.next();
         if (var5 instanceof rip.breeze.IBreezeInterface) {
            this.arrayList_m.add((rip.breeze.IBreezeInterface)var5);
         }

         if (var4) {
            break;
         }
      }
   }

   public void initialize(rip.breeze.IBreezeInterface var1) {
      this.arrayList_m.add(var1);
   }

   public void initialize_2(rip.breeze.IBreezeInterface var1) {
      this.arrayList_m.remove(var1);
   }

   public void processAll() {
      long var1 = 77966084317221L;
      boolean var3 = ConfigManager.checkCondition_3();
      if (BreezeClient.CONST_A.currentScreen != BreezeClient.getClickGUI() || !BreezeClient.getClickGUI().isBool_f()) {
         KeybindSettings var4 = BreezeClient.getKeybindSettings();
         this.iBreezeInterface2_n = null;
         ArrayList var5 = new ArrayList();

         for (rip.breeze.IBreezeInterface var7 : this.arrayList_m) {
            if (var7.isEnabled()) {
               var5.add(var7);
            }

            if (!var3) {
               break;
            }
         }

         if (!var5.isEmpty()) {
            BreezeContext.iRenderer_b.endFrame();
            BreezeClient.CONST_A.mcProfiler.startSection("breezeHud");
            BreezeClient.CONST_A.mcProfiler.startSection("4sT�5x5");
            this.calculate_4();
            this.render_2();
            this.calculate_3();
            BreezeClient.CONST_A.mcProfiler.endStartSection("background");
            BreezeClient.CONST_A.mcProfiler.startSection("collect");
            ArrayList var11 = new ArrayList();

            for (rip.breeze.IBreezeInterface var8 : var5) {
               var8.processQueue(var11);
               if (!var3) {
                  break;
               }
            }

            if (!var11.isEmpty()) {
               BreezeClient.CONST_A.mcProfiler.endStartSection("draw");
               ConfigUtil3.clamp_6(var11, 5.0F, var4.getFloat_5(), var4.getColor_4(), new Color(0, 0, 0, 255), var4.getValue_4(), 4);
            }

            BreezeClient.CONST_A.mcProfiler.endSection();
            BreezeClient.CONST_A.mcProfiler.endStartSection("render");
            this.dataBuilder46_j.processAll();

            for (rip.breeze.IBreezeInterface var14 : var5) {
               rip.breeze.IBreezeInterface var10000 = var14;

               try {
                  var10000.clear();
               } finally {
                  ;
               }

               if (!var3) {
                  break;
               }
            }

            BreezeClient.CONST_A.mcProfiler.endStartSection("font");
            this.dataBuilder46_j.toggle();
            BreezeClient.CONST_A.mcProfiler.endSection();
            BreezeClient.CONST_A.mcProfiler.endSection();
            BreezeContext.iRenderer_b.beginFrame();
         }
      }
   }

   public void calculate(float var1, float var2) {
      long var3 = 50777035542103L;
      long var5 = var3 ^ 120303784347871L;
      boolean var10000 = ConfigManager.isValid();
      ArrayList var7 = new ArrayList();
      Iterator var8 = this.arrayList_m.iterator();
      boolean var9 = var10000;

      while (var8.hasNext()) {
         rip.breeze.IBreezeInterface var10 = (rip.breeze.IBreezeInterface)var8.next();
         if (var10.isEnabled()) {
            var7.add(var10);
         }

         if (var9) {
            break;
         }
      }

      if (!var7.isEmpty()) {
         this.render_2();
         this.calculate_4();
         this.calculate_3();
         KeybindSettings var18 = BreezeClient.getKeybindSettings();
         if (this.iBreezeInterface2_n != null) {
            this.iBreezeInterface2_n.getData().clamp((int)var1 - this.fieldInt_o, (int)var2 - this.fieldInt_p);
         }

         ArrayList var19 = new ArrayList();
         ArrayList var11 = new ArrayList();

         for (rip.breeze.IBreezeInterface var13 : var7) {
            if (var13 instanceof rip.breeze.IBreezeInterface2) {
               rip.breeze.IBreezeInterface2 var14 = (rip.breeze.IBreezeInterface2)var13;
               boolean var15 = var14.isValid();
               var14.getData().dataBuilder15_d.toggle(var5, var15 && var14.getData().isValid(var1, var2));
               var14.getData().dataBuilder15_e.toggle(var5, var15 && this.iBreezeInterface2_n == var13);
               if (var15 && var14.getData().calculateFloat() != 1.0F) {
                  var11.add(var14);
                  if (!var9) {
                     continue;
                  }
               }
            }

            var13.processQueue(var19);
            if (var9) {
               break;
            }
         }

         if (!var19.isEmpty()) {
            ConfigUtil3.clamp_6(var19, 0.0F, var18.getFloat_5(), var18.getColor_4(), new Color(0, 0, 0, 255), 0.0F, 4);
         }

         for (rip.breeze.IBreezeInterface2 var22 : var11) {
            var19.clear();
            var22.a(var19);
            if (var19.isEmpty()) {
               var19.add(new Util8(var22.getData().clamp_2(), var22.getData().clamp_3(), var22.getFirst(), var22.getSecond(), 3 * this.fieldInt_l));
            }

            ConfigUtil3.clamp_6(var19, 0.0F, var18.getFloat_5() * var22.getData().calculateFloat(), var18.getColor_4(), new Color(0, 0, 0, 255), 0.0F, 4);
            if (var9) {
               break;
            }
         }

         this.dataBuilder46_j.processAll();

         for (rip.breeze.IBreezeInterface var23 : var7) {
            rip.breeze.IBreezeInterface var24 = var23;

            try {
               var24.clear();
            } finally {
               ;
            }

            if (var9) {
               break;
            }
         }

         this.dataBuilder46_j.toggle();
      }
   }

   public void calculate_2(float var1, float var2, int var3) {
      long var4 = 59753757916149L;
      boolean var6 = ConfigManager.isValid();
      if (var3 == 0) {
         if (this.iBreezeInterface2_n != null) {
            this.iBreezeInterface2_n = null;
         }

         for (rip.breeze.IBreezeInterface var8 : this.arrayList_m) {
            if (var8.isEnabled() && var8 instanceof rip.breeze.IBreezeInterface2) {
               rip.breeze.IBreezeInterface2 var9 = (rip.breeze.IBreezeInterface2)var8;
               if (var9.isValid()) {
                  if (var9.getData().isValid(var1, var2)) {
                     this.iBreezeInterface2_n = var9;
                     this.fieldInt_o = (int)(var1 - this.iBreezeInterface2_n.getData().clamp_2());
                     this.fieldInt_p = (int)(var2 - this.iBreezeInterface2_n.getData().clamp_3());
                     if (!var6) {
                        break;
                     }
                  }

                  if (var6) {
                     break;
                  }
               }
            }
         }
      }
   }

   public void render(float var1, float var2, int var3) {
      long var4 = 60801282850549L;
      if (var3 == 0) {
         this.iBreezeInterface2_n = null;
      }
   }

   public void render_1() {
      long var1 = 111401099734157L;
      MathUtil10[] var3 = this.arr_c;
      boolean var10000 = ConfigManager.checkCondition_3();
      int var4 = var3.length;
      int var5 = 0;
      boolean var6 = var10000;

      while (var5 < var4) {
         MathUtil10 var7 = var3[var5];
         var7.toggle_2();
         var5++;
         if (!var6) {
            break;
         }
      }

      for (MathUtil10 var14 : this.arr_d) {
         var14.toggle_2();
         if (!var6) {
            break;
         }
      }

      for (MathUtil10 var15 : this.arr_e) {
         var15.toggle_2();
         if (!var6) {
            break;
         }
      }

      RenderUtil25.toggle_2();
   }

   public void initialize_3() {
      this.dataBuilder46_j.processAll_2();
      GL11.glPushMatrix();
   }

   public void initialize_4() {
      this.dataBuilder46_j.processAll_2();
      GL11.glPopMatrix();
   }

   public void initialize_5() {
      this.dataBuilder46_j.processAll_2();
   }

   private void calculate_3() {
      long var1 = 71093346168798L;
      boolean var10000 = ConfigManager.isValid();
      KeybindSettings var3 = BreezeClient.getKeybindSettings();
      boolean var4 = var10000;
      float var5 = var3.getFloat_4();
      float var6 = (float)(System.nanoTime() - 1126854724334L) * 1.0E-10F * var5;
      ColorMode2 var7 = BreezeClient.getKeybindSettings().getColorMode2();
      switch (Util122.CONST_A[var7.ordinal()]) {
         case 1:
            this.fontManager_i = this.fontManager_f;
            this.fontManager_f.initialize();
            this.fontManager_f.drawString("time", var6);
            this.fontManager_f.drawString("saturation", var3.getFloat());
            this.fontManager_f.drawString("brightness", var3.getFloat_2());
            this.fontManager_f.drawString("size", var3.getValue());
            this.fontManager_f.drawString("texture", 0);
            this.fontManager_f.bind();
            if (!var4) {
               return;
            }
         case 2:
            this.fontManager_i = this.fontManager_h;
            this.fontManager_h.initialize();
            this.fontManager_h.drawString("time", var6);
            this.fontManager_h.drawString("size", var3.getValue_2());
            Color[] var8 = var3.clamp();
            int var9 = 0;

            while (var9 < var8.length) {
               this.fontManager_h
                  .drawString(
                     "colors[" + var9 + "]",
                     var8[var9].getRed() / 255.0F,
                     var8[var9].getGreen() / 255.0F,
                     var8[var9].getBlue() / 255.0F
                  );
               var9++;
               if (var4) {
                  break;
               }
            }

            this.fontManager_h.drawString("colorCount", var8.length);
            this.fontManager_h.drawString("texture", 0);
            this.fontManager_h.bind();
            if (!var4) {
               return;
            }
         case 3:
            this.fontManager_i = this.fontManager_g;
            this.fontManager_g.initialize();
            this.fontManager_g.drawString("time", var6);
            this.fontManager_g.drawString("size", var3.getValue_3());
            float var10 = var3.getFloat_3();
            this.fontManager_g.drawString("minMul", 1.0F - var10);
            this.fontManager_g.drawString("maxMul", 1.0F + var10);
            Color var11 = var3.getColor();
            this.fontManager_g
               .drawString("baseColor", var11.getRed() / 255.0F, var11.getGreen() / 255.0F, var11.getBlue() / 255.0F);
            this.fontManager_g.drawString("texture", 0);
            this.fontManager_g.bind();
            if (!var4) {
               return;
            }
      }

      this.fontManager_i = null;
   }

   private void calculate_4() {
      long var1 = 56607850713295L;
      int var3 = BreezeClient.getKeybindSettings().getPriority2().scaleIDX;
      boolean var10000 = ConfigManager.isValid();
      this.fieldInt_l = var3 + 1;
      boolean var4 = var10000;
      this.fieldInt_k = this.fieldInt_l * 8;
      switch (Util122.CONST_B[BreezeClient.getKeybindSettings().getEnum_INGAME().ordinal()]) {
         case 1:
            this.dataBuilder46_j = this.arr_c[var3];
            if (!var4) {
               break;
            }
         case 2:
            this.dataBuilder46_j = this.arr_d[var3];
            if (!var4) {
               break;
            }
         case 3:
            this.dataBuilder46_j = this.arr_e[var3];
      }
   }

   private void render_2() {
      GlStateManager.clear(256);
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, 0.0, 1000.0, 3000.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.loadIdentity();
      GlStateManager.translate(0.0F, 0.0F, -2000.0F);
   }

   static {
      initialize_6("VEZkF");
      long var0 = 92574366768416L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[29];
      int var5 = 0;
      String var6 = "N3èÒû\u008en òì×j\u009f\u0010\u009al(ðPjø\u0099ï1\u0098%°ö\"?'\u009c\u008aÄõW@}\u0019Ø^:¤±»\u0083eÕ@sÈs\u000f&!<\u008a\u0010\u0017Áq\u009aa\u0094§XÎÈd³\u009c0@\u000b úÐÛ¼\u0090µ÷V1dF±·£2CÌË?°62\n}<ÞG|t½g:\u0010\u001a\u0099Ý63R¿äh/iàmãp5\u0010«LdRi\u009bM\u009fvq\u0085\u0091Ì8+G\u0018µ\u008fä\u0099\u0094Dá|k\u0018äýª}&\u0005-¥èRÒð*9 X\u0013Á\u0092fá¥\u009bÅ\u0015îì\u0083ì¡:å\u0092Sá\u0019»!Mÿ\u0087Á\u009b?\u0014ÓS(\u0012MTE>\u0089\u0002Ü¾¹\u0090r\u001a¤\u008ab-\u0085¤\u0099NÆxå,¤T\u0000W{¹êL\u0088\u0084\u001fìpf: c\u008f\u0087\u001adqöéô\u0018ä×ãµ\u009ac)ÈT@Uàz\u0082(J5º\u0016\u009f¬= vÿs,':Ò¢f(§é2\u0000Ó\u0014q;\u001dw0Ê\u000e¾D6\u009dâ)6ë\u0089(\u0004\u000e2x\u000e ¶\u0093\u0007SfÀÂÍ\u009eCeä\u00046c\u0092VDC4/¤å\u0092\n?ÍkþüW\u001e\u0011Z\u0010õ\u0083½ä¼]\u0095·Ò$`ªá¯?ù(oÄ\\ØC±\u0095ÌÒî±.\u009dÚ\nL®5¤\u008d¦\u0003w\u0081êÇS\u0091\u0016\u001c\u0089\u0015tI\u0007øÓÑþû\u0010:\u001afXÑPX\u0018gGZµÌgÖº\u0010*Ý+â\u007fÛÉõWOf]õÉð\u000e\u0010\u0081»\u001dh&\u008d8L\u008e\"\u0082®FÇJö\u0018SÚl\r6dßÛä\u001a\u009d=¡ùÁT\u008eE®\u0019Ñ\u0010ÿ\u009a\u0010\u001aO»SÝ\u0084\u008fRþ7°\nc3n\"\u0010-\u00035\u0014{Øüt\u008eáw=|²Sä \u009f\u0003R\n¢{a\u0016îO>¶\u009eFx«VÀÉ\u00953\u00adýñø'óI½ç¡Î\u0010\t\u001d°\u0017)ùÌä=Å\f/Ñ\f».(}Ôÿ\u0082´3©\u0012\"·«\u00805o£\u001aª>ÊÑ\u009aì\u00884\u0096éC¯\u0001%_\u0018½CÙ;'\u008bsf ~'köÓ,¼\u0090\u008a¶Î[=^°@Käõ\u0019,\u0016Ù\u0085ÃYí\u0003£I\\Â\u0010|Mj\u0006Eó{²&Þçú\u009eÉÚâ(ºº`ç\u0010¹¼ \fïI\u00167:\u0005\u000eNÊx\b\u008f%\f-\u001cwÝR\u00ad\b)×¼Æ×\u0082p\u009eM\u0090\u0010¶(çû2\u001b\u009dVÛj-\níl¶\u001f";
      int var7 = "N3èÒû\u008en òì×j\u009f\u0010\u009al(ðPjø\u0099ï1\u0098%°ö\"?'\u009c\u008aÄõW@}\u0019Ø^:¤±»\u0083eÕ@sÈs\u000f&!<\u008a\u0010\u0017Áq\u009aa\u0094§XÎÈd³\u009c0@\u000b úÐÛ¼\u0090µ÷V1dF±·£2CÌË?°62\n}<ÞG|t½g:\u0010\u001a\u0099Ý63R¿äh/iàmãp5\u0010«LdRi\u009bM\u009fvq\u0085\u0091Ì8+G\u0018µ\u008fä\u0099\u0094Dá|k\u0018äýª}&\u0005-¥èRÒð*9 X\u0013Á\u0092fá¥\u009bÅ\u0015îì\u0083ì¡:å\u0092Sá\u0019»!Mÿ\u0087Á\u009b?\u0014ÓS(\u0012MTE>\u0089\u0002Ü¾¹\u0090r\u001a¤\u008ab-\u0085¤\u0099NÆxå,¤T\u0000W{¹êL\u0088\u0084\u001fìpf: c\u008f\u0087\u001adqöéô\u0018ä×ãµ\u009ac)ÈT@Uàz\u0082(J5º\u0016\u009f¬= vÿs,':Ò¢f(§é2\u0000Ó\u0014q;\u001dw0Ê\u000e¾D6\u009dâ)6ë\u0089(\u0004\u000e2x\u000e ¶\u0093\u0007SfÀÂÍ\u009eCeä\u00046c\u0092VDC4/¤å\u0092\n?ÍkþüW\u001e\u0011Z\u0010õ\u0083½ä¼]\u0095·Ò$`ªá¯?ù(oÄ\\ØC±\u0095ÌÒî±.\u009dÚ\nL®5¤\u008d¦\u0003w\u0081êÇS\u0091\u0016\u001c\u0089\u0015tI\u0007øÓÑþû\u0010:\u001afXÑPX\u0018gGZµÌgÖº\u0010*Ý+â\u007fÛÉõWOf]õÉð\u000e\u0010\u0081»\u001dh&\u008d8L\u008e\"\u0082®FÇJö\u0018SÚl\r6dßÛä\u001a\u009d=¡ùÁT\u008eE®\u0019Ñ\u0010ÿ\u009a\u0010\u001aO»SÝ\u0084\u008fRþ7°\nc3n\"\u0010-\u00035\u0014{Øüt\u008eáw=|²Sä \u009f\u0003R\n¢{a\u0016îO>¶\u009eFx«VÀÉ\u00953\u00adýñø'óI½ç¡Î\u0010\t\u001d°\u0017)ùÌä=Å\f/Ñ\f».(}Ôÿ\u0082´3©\u0012\"·«\u00805o£\u001aª>ÊÑ\u009aì\u00884\u0096éC¯\u0001%_\u0018½CÙ;'\u008bsf ~'köÓ,¼\u0090\u008a¶Î[=^°@Käõ\u0019,\u0016Ù\u0085ÃYí\u0003£I\\Â\u0010|Mj\u0006Eó{²&Þçú\u009eÉÚâ(ºº`ç\u0010¹¼ \fïI\u00167:\u0005\u000eNÊx\b\u008f%\f-\u001cwÝR\u00ad\b)×¼Æ×\u0082p\u009eM\u0090\u0010¶(çû2\u001b\u009dVÛj-\níl¶\u001f"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[29];
                     CONST_X = new HashMap(13);
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
                     String var15 = "çå4½\u0019\nð\u0002h´w\u0095\u0005Ý=0";
                     int var16 = "çå4½\u0019\nð\u0002h´w\u0095\u0005Ý=0".length();
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

                     CONST_V = var13;
                     CONST_W = new Integer[2];
                     1126854724334L = System.nanoTime();
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

                  var6 = "\u0084\u0091åÐHÌTä\u009eÏ\u008fÃKå¢\u0001\u0018Î\u0099\u0018o_õðü\u0080\u001cKB£Q\u008aôçÞ#\u0003¤Jp\u0094";
                  var7 = "\u0084\u0091åÐHÌTä\u009eÏ\u008fÃKå¢\u0001\u0018Î\u0099\u0018o_õðü\u0080\u001cKB£Q\u008aôçÞ#\u0003¤Jp\u0094".length();
                  var8 = 16;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize_6(String var0) {
      string_q = var0;
   }

   public static String getString() {
      return string_q;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5164;
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
            throw new RuntimeException("rip/breeze/client/em", var10);
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
         throw new RuntimeException("rip/breeze/client/em" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26686;
      if (CONST_W[var3] == null) {
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
         long var5 = CONST_V[var3];
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
         Object[] var9 = (Object[])CONST_X.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/em", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_W[var3] = var15;
      }

      return CONST_W[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/em" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
