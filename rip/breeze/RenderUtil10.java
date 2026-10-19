package rip.breeze;

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

public class RenderUtil10 extends UIPanel {
   private final ImageUtil18 dataBuilder41_h;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   public RenderUtil10(ImageUtil18 var1) {
      this.dataBuilder41_h = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      String var6 = this.dataBuilder41_h.getString("panel.background-img");
      int var10000 = RenderUtil9.getValue_2();
      float var7 = this.c / 1000.0F;
      int var8 = var10000;
      if (!var6.isEmpty()) {
         IRenderer var16 = BreezeContext.iRenderer_b;
         String var10002 = "<@breeze>";
         CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
         Object[] var10004 = rip.breeze.client.MathUtil8.noArgs();
         Method var10006 = rip.breeze.client.MathUtil8.getMethod_3(-195514426581545329L, var4);
         Object[] var10005 = var10004;
         CloudAuthService var19 = var10003;
         Method var17 = var10006;

         try {
            var18 = (String)var17.invoke(var19, var10005);
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         var16.drawTextInputSelected(
            var6.replace(var10002, var18),
            this.a,
            this.b,
            this.c,
            this.d,
            this.dataBuilder41_h.getFloat("panel.corner-radius") * var7,
            false
         );
      }

      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            this.dataBuilder41_h.getFloat("panel.corner-radius") * var7,
            this.dataBuilder41_h.getColor_2("panel.background")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this,
            this.dataBuilder41_h.getFloat("panel.corner-radius") * var7,
            this.dataBuilder41_h.getFloat("panel.border-thickness") * var7,
            this.dataBuilder41_h.getColor_2("panel.border")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 30.0F * var7,
            this.b() - 160.0F * var7,
            250.0F * var7,
            130.0F * var7,
            this.dataBuilder41_h.getFloat("user-info.corner-radius") * var7,
            this.dataBuilder41_h.getColor_2("user-info.background")
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.a + 30.0F * var7,
            this.b() - 60.0F * var7,
            250.0F * var7,
            30.0F * var7,
            new float[]{
               0.0F,
               0.0F,
               this.dataBuilder41_h.getFloat("user-info.corner-radius") * var7,
               this.dataBuilder41_h.getFloat("user-info.corner-radius") * var7
            },
            this.dataBuilder41_h.getColor_2("user-info.icon-bar")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 45.0F * var7,
            this.b() - 145.0F * var7,
            70.0F * var7,
            70.0F * var7,
            35.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-tertiary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 130.0F * var7,
            this.b() - 140.0F * var7,
            90.0F * var7,
            18.0F * var7,
            9.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-primary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 130.0F * var7,
            this.b() - 110.0F * var7,
            50.0F * var7,
            12.0F * var7,
            6.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-secondary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 30.0F * var7,
            this.b + 30.0F * var7,
            120.0F * var7,
            60.0F * var7,
            20.0F * var7,
            this.dataBuilder41_h.getColor_2("default.accent")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 160.0F * var7,
            this.b + 40.0F * var7,
            80.0F * var7,
            20.0F * var7,
            10.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-primary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 160.0F * var7,
            this.b + 65.0F * var7,
            40.0F * var7,
            16.0F * var7,
            8.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-tertiary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 30.0F * var7,
            this.b + 170.0F * var7,
            140.0F * var7,
            25.0F * var7,
            15.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-tertiary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 30.0F * var7,
            this.b + 210.0F * var7,
            250.0F * var7,
            30.0F * var7,
            15.0F * var7,
            this.dataBuilder41_h.getColor_2("tab.selected")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 30.0F * var7,
            this.b + 255.0F * var7,
            80.0F * var7,
            25.0F * var7,
            15.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-tertiary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 470.0F * var7,
            this.b + 30.0F * var7,
            350.0F * var7,
            40.0F * var7,
            20.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-tertiary")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 475.0F * var7,
            this.b + 35.0F * var7,
            30.0F * var7,
            30.0F * var7,
            15.0F * var7,
            this.dataBuilder41_h.getColor_2("default.text-primary")
         );
      float[] var9 = new float[]{40.0F * var7, 30.0F * var7, 60.0F * var7, 10.0F * var7};
      float[] var10 = new float[]{230.0F * var7, 90.0F * var7, 190.0F * var7, 300.0F * var7};
      float var11 = this.dataBuilder41_h.getFloat("module.corner-radius") * var7;
      int var12 = 0;

      while (var12 < 4) {
         boolean var13 = var12 == 2;
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.a + 330.0F * var7,
               this.b + (100 + var12 * 100) * var7,
               640.0F * var7,
               80.0F * var7,
               var11,
               var13
                  ? this.dataBuilder41_h.getColor_2("module.background-hovered")
                  : this.dataBuilder41_h.getColor_2("module.background")
            );
         BreezeContext.iRenderer_b
            .fillGradientRectSimple(
               this.a + 940.0F * var7,
               this.b + (100 + var12 * 100) * var7,
               30.0F * var7,
               80.0F * var7,
               new float[]{0.0F, var11, var11, 0.0F},
               var13
                  ? this.dataBuilder41_h.getColor_2("module.edit-background-hovered")
                  : this.dataBuilder41_h.getColor_2("module.edit-background")
            );
         int var14 = 0;

         while (var14 < 3) {
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  this.a + 951.0F * var7,
                  this.b + (116 + var12 * 100 + var14 * 20) * var7,
                  7.0F * var7,
                  7.0F * var7,
                  3.5F * var7,
                  var13
                     ? this.dataBuilder41_h.getColor_2("module.text-hovered")
                     : this.dataBuilder41_h.getColor_2("module.text")
               );
            var14++;
            if (var8 != 0) {
               LicenseState.toggle(LicenseState.checkCondition());
               break;
            }
         }

         label73: {
            BreezeContext.iRenderer_b
               .fillGradientRectSimple(
                  this.a + 330.0F * var7,
                  this.b + (100 + var12 * 100) * var7,
                  75.0F * var7,
                  80.0F * var7,
                  new float[]{var11, 0.0F, 0.0F, var11},
                  var13
                     ? this.dataBuilder41_h.getColor_2("module.edit-background-hovered")
                     : this.dataBuilder41_h.getColor_2("module.edit-background")
               );
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  this.a + 420.0F * var7,
                  this.b + (115 + var12 * 100) * var7,
                  80.0F * var7 + var9[var12],
                  20.0F * var7,
                  10.0F * var7,
                  var13
                     ? this.dataBuilder41_h.getColor_2("module.text-hovered")
                     : this.dataBuilder41_h.getColor_2("module.text")
               );
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  this.a + 420.0F * var7,
                  this.b + (145 + var12 * 100) * var7,
                  200.0F * var7 + var10[var12],
                  18.0F * var7,
                  9.0F * var7,
                  var13
                     ? this.dataBuilder41_h.getColor_2("module.description-hovered")
                     : this.dataBuilder41_h.getColor_2("module.description")
               );
            if (var13) {
               BreezeContext.iRenderer_b
                  .drawAnimatedIcon(
                     this.a + 370.0F * var7,
                     this.b + (140 + var12 * 100) * var7,
                     this.dataBuilder41_h.getColor_2("module.tick"),
                     var7
                  );
               BreezeContext.iRenderer_b
                  .drawGlowCircle(
                     this.a + 370.0F * var7,
                     this.b + (140 + var12 * 100) * var7,
                     24.0F * var7,
                     this.dataBuilder41_h.getColor_2("module.tick"),
                     1.0F
                  );
               if (var8 == 0) {
                  break label73;
               }
            }

            BreezeContext.iRenderer_b
               .fillCircle(
                  this.a + 370.0F * var7,
                  this.b + (140 + var12 * 100) * var7,
                  5.0F * var7,
                  this.dataBuilder41_h.getColor_2("module.tick")
               );
         }

         var12++;
         if (var8 != 0) {
            break;
         }
      }
   }

   public void calculate_2(float var1, float var2, float var3, float var4) {
      super.drawColoredQuad(var1, var2, var3, var3 * 0.7F);
   }

   static {
      long var0 = 73330609278012L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[33];
      int var5 = 0;
      String var6 = "Â\u0015ºµ¦ûå\u0091|uÌ\u009d\u009b\u009f\u0019\"ç\u0085\u0014\u001cÅj\u009e\u00160£³`Ü\u008b|\u0006öjóÛ\bK.\u001fU_\u0096;©òDº4\u0081\u0080ºy]\u009dUû \u00196»1\u0018RP\u0083\u0085¯qt÷9\u0000(ëãö\u0000\u0095Z\u009f7\u000f\u0098¾]7\u0084íáJnVC\u0092Õ\u0082gÖ¡Þô6´\u008etWÕLM$j³9(«½óà;{\u001bq\u00905h¢]IPÀ\u0017Ï\u001d5½ðO\u0080r-\u0093\\§¨ÒIk\u001f½±÷¤\u0005®8_ê)ü\n\u009aÉÃÚ²É\u009d\u00133\u0085\u0089\u0099#§ªÞ69L(p\\s\u0092jÀU\u008a1Ùt\u0095c\u0017Aä4f\u0099µ\u0007\u00858ÿö1d\u0082 \r\u0082(O^®úmújÊ\u000b9Ùs\u0016\u009bª\u001a\u0013\u008d¸\u001d\u0001\u0080¡\u0095¹r¦\u0081r7¡piÃ\u0000{iHÂâ ó¸$¸Öø%¸½Äµ³ø¥¶\u0089ö1à:\u0085,»V\u0003i4b|·¡#(\u0086\u0018\u0089G\u000b\u0010Z\b·ËMh\u009aYÒ5\u0089\u008bBYç\t¾\u0090Ð#o\u001a\u0084\u0084ãò\u001e\u00ad\u008eøO\u0080Hä(\u0004o\u009bP¯WÞØÆ\u009fª\n¹xFXN\u0094Iè6\u001eLÿi¸(!¹Éä\u0002\u008a_ÄÝÆçef8Í\rÆ\u0004¼ói\u008b©zFKÛ\u008d\u001fkûâ\u009cGÍ\f\u0093\u009a\u0012Å/Áí_\u0012¯ì\u00ad\u0085\b«ÈoÚÁO\u0016õ£ð{\u0087Ûé¾\u0093\u0014åmÑ(\u0096ÓÛ=\u0007\u000bI\u0012áþäûÌ¿g_Inner9\u008b[öÍYÛy½\u001c\u009d'&©kvñ\u0092#\u0017Ç§OB(\u008e!=\u0090\fK¢\u0093§\u0012f@êÉ\u008b\"7³c\u0011ãÓM\\hèÅ7\u0085e_ïO\b2\u000f°íf\u0000 \u0003\u0097pÓ!!Þõ\u0087þ|Ïåci\u009c\u00128\u0095A¹gtv*\u000féí\u009e\u0018\u0003b(Ôæ\u000eË\u007f<FÖË¬¾A\u0004Ù|(\u00ad¸^v\u0017èþ\u001bbmAS¢#\u009cC,°ô\u008f\u0004é®\u001705+{ÌÐ\u001cg£4\u008c\u0080£G\u0094\u0017:Ó\u0000óóvùi\u001b\u0092®èð\u0089@\u001d\u000b|\tõìi]Ç\u008fR\u009d\u0090gÝ§)\u0011(/Úþ1»ï¿\u0016\u0082~;(û3|fÀO\u0096!×Yõ}û\r*ÚõLf®êH²á\u0007B¥\u00920\u0014w\u00045§N}ÔqÞø\u0014Û\u001bÎ+^ª\fsÆËZ\t\u0088u\u00adÌ9d.±²dèR\u0096¡OqñfK\u0098S\u0097SÄ(È²HK\u001b\u0011\u0095ÇÒ\f,û9S/\u008dîWáq\u008d\u0005\tÐÂem\u0097\u008b\u0089\u0010þj\u0095}T^\u0013úÒ Jf\u00835á\u007fÚf5 \u0097=ÕiÚ\u0001L\u0087.5ªl«ÔHÆ\u0017ê\f0U\u0000(\u0013\u0005\u001ca\u0085°\f©Õß\u008a\u0019óü÷\u0093,ì2°\u0011\u00ad\u009a8ü\u009f\u001eh\u0085Ù\"\u007f¯¾+ÞüL\u0099\u0007 ãéë\u001eè\\í\u0001Æ\u009fèu\u0080µøA\u000bÒÆÒf\u001a\u008b`\u000fæÎÊ\u008fRo<(g\u009e¹\u008bãë\u0017âËô\u0012\u0003.8Â#äÖR³D\u0018¹?ó~v,Ö\u0089[1[ýãÊ\u007fÓ\u0092¥(ó»J\u0092\u009a6\u0099\u009a\u0099«\u009bt}xÊìiiÅ÷¯+I³^>\"ÒÜÌ¶o\u000ez·¢,ÑzÃ Ý)l\u008f«º|ìÔÚíÞ=Þ\ts6<ùÂÜ½\u0085ª\u0091\u0087!3\bk>\u00880WYøõ\u000b¸Ý\u001d¡¼×\u008dY\u008ajFn} (í\u0091\u0090Fãé\u0019ñ\u0000\u009d7ÞI.Ö|è\u000e¦5k\u0015\u008e¨hQÄ*(?æï\u0095ãol\u001en`yö\n¢B\u0005{\\V0\u000e\"¥T¥Ö÷\u0082\t¸SNàÞl ÐÇ\t\u0083(ù·:tßÐ\u001fû\u0011Ì×%Æf9}\u0094aQ\tkÐ\u009cñ\u0006\u0016§ñ¹U\u0090\u008b]{?èiO\u008bI\u0018\r¢´ñæ]\u009b©C\u000fô2}nj(\u0004Ö8Ò\u0019\u0001¿0 ú\u001a\u0088ê\u0086\u0000{é^¡\u0019\u0081¼\u0003\u0018ß6<Q\u001e®\u0012©\u0099²\u008b\u001f'\u0013bfµ('Ô;Ö¢èE\u0006bì\u0018\b\"\u008drëM\u0080a\u008a\u007f\u0003\u0093ÿy[jÓ#\u008f\u0018/I×À³Ü§ÅL8]\u001aª{à,\u00ad WåK\u0090ùR6\u009bp\u0000î\u009c\u009bùâ\u0013\u001bLè\u0007´ú}¹\u001fOz\u0004TYþ\u009d\u0098\u009aÅ\u000f\u0012Eæ!\u009e¤\u0092¬Ô¹Áú";
      int var7 = "Â\u0015ºµ¦ûå\u0091|uÌ\u009d\u009b\u009f\u0019\"ç\u0085\u0014\u001cÅj\u009e\u00160£³`Ü\u008b|\u0006öjóÛ\bK.\u001fU_\u0096;©òDº4\u0081\u0080ºy]\u009dUû \u00196»1\u0018RP\u0083\u0085¯qt÷9\u0000(ëãö\u0000\u0095Z\u009f7\u000f\u0098¾]7\u0084íáJnVC\u0092Õ\u0082gÖ¡Þô6´\u008etWÕLM$j³9(«½óà;{\u001bq\u00905h¢]IPÀ\u0017Ï\u001d5½ðO\u0080r-\u0093\\§¨ÒIk\u001f½±÷¤\u0005®8_ê)ü\n\u009aÉÃÚ²É\u009d\u00133\u0085\u0089\u0099#§ªÞ69L(p\\s\u0092jÀU\u008a1Ùt\u0095c\u0017Aä4f\u0099µ\u0007\u00858ÿö1d\u0082 \r\u0082(O^®úmújÊ\u000b9Ùs\u0016\u009bª\u001a\u0013\u008d¸\u001d\u0001\u0080¡\u0095¹r¦\u0081r7¡piÃ\u0000{iHÂâ ó¸$¸Öø%¸½Äµ³ø¥¶\u0089ö1à:\u0085,»V\u0003i4b|·¡#(\u0086\u0018\u0089G\u000b\u0010Z\b·ËMh\u009aYÒ5\u0089\u008bBYç\t¾\u0090Ð#o\u001a\u0084\u0084ãò\u001e\u00ad\u008eøO\u0080Hä(\u0004o\u009bP¯WÞØÆ\u009fª\n¹xFXN\u0094Iè6\u001eLÿi¸(!¹Éä\u0002\u008a_ÄÝÆçef8Í\rÆ\u0004¼ói\u008b©zFKÛ\u008d\u001fkûâ\u009cGÍ\f\u0093\u009a\u0012Å/Áí_\u0012¯ì\u00ad\u0085\b«ÈoÚÁO\u0016õ£ð{\u0087Ûé¾\u0093\u0014åmÑ(\u0096ÓÛ=\u0007\u000bI\u0012áþäûÌ¿g_Inner9\u008b[öÍYÛy½\u001c\u009d'&©kvñ\u0092#\u0017Ç§OB(\u008e!=\u0090\fK¢\u0093§\u0012f@êÉ\u008b\"7³c\u0011ãÓM\\hèÅ7\u0085e_ïO\b2\u000f°íf\u0000 \u0003\u0097pÓ!!Þõ\u0087þ|Ïåci\u009c\u00128\u0095A¹gtv*\u000féí\u009e\u0018\u0003b(Ôæ\u000eË\u007f<FÖË¬¾A\u0004Ù|(\u00ad¸^v\u0017èþ\u001bbmAS¢#\u009cC,°ô\u008f\u0004é®\u001705+{ÌÐ\u001cg£4\u008c\u0080£G\u0094\u0017:Ó\u0000óóvùi\u001b\u0092®èð\u0089@\u001d\u000b|\tõìi]Ç\u008fR\u009d\u0090gÝ§)\u0011(/Úþ1»ï¿\u0016\u0082~;(û3|fÀO\u0096!×Yõ}û\r*ÚõLf®êH²á\u0007B¥\u00920\u0014w\u00045§N}ÔqÞø\u0014Û\u001bÎ+^ª\fsÆËZ\t\u0088u\u00adÌ9d.±²dèR\u0096¡OqñfK\u0098S\u0097SÄ(È²HK\u001b\u0011\u0095ÇÒ\f,û9S/\u008dîWáq\u008d\u0005\tÐÂem\u0097\u008b\u0089\u0010þj\u0095}T^\u0013úÒ Jf\u00835á\u007fÚf5 \u0097=ÕiÚ\u0001L\u0087.5ªl«ÔHÆ\u0017ê\f0U\u0000(\u0013\u0005\u001ca\u0085°\f©Õß\u008a\u0019óü÷\u0093,ì2°\u0011\u00ad\u009a8ü\u009f\u001eh\u0085Ù\"\u007f¯¾+ÞüL\u0099\u0007 ãéë\u001eè\\í\u0001Æ\u009fèu\u0080µøA\u000bÒÆÒf\u001a\u008b`\u000fæÎÊ\u008fRo<(g\u009e¹\u008bãë\u0017âËô\u0012\u0003.8Â#äÖR³D\u0018¹?ó~v,Ö\u0089[1[ýãÊ\u007fÓ\u0092¥(ó»J\u0092\u009a6\u0099\u009a\u0099«\u009bt}xÊìiiÅ÷¯+I³^>\"ÒÜÌ¶o\u000ez·¢,ÑzÃ Ý)l\u008f«º|ìÔÚíÞ=Þ\ts6<ùÂÜ½\u0085ª\u0091\u0087!3\bk>\u00880WYøõ\u000b¸Ý\u001d¡¼×\u008dY\u008ajFn} (í\u0091\u0090Fãé\u0019ñ\u0000\u009d7ÞI.Ö|è\u000e¦5k\u0015\u008e¨hQÄ*(?æï\u0095ãol\u001en`yö\n¢B\u0005{\\V0\u000e\"¥T¥Ö÷\u0082\t¸SNàÞl ÐÇ\t\u0083(ù·:tßÐ\u001fû\u0011Ì×%Æf9}\u0094aQ\tkÐ\u009cñ\u0006\u0016§ñ¹U\u0090\u008b]{?èiO\u008bI\u0018\r¢´ñæ]\u009b©C\u000fô2}nj(\u0004Ö8Ò\u0019\u0001¿0 ú\u001a\u0088ê\u0086\u0000{é^¡\u0019\u0081¼\u0003\u0018ß6<Q\u001e®\u0012©\u0099²\u008b\u001f'\u0013bfµ('Ô;Ö¢èE\u0006bì\u0018\b\"\u008drëM\u0080a\u008a\u007f\u0003\u0093ÿy[jÓ#\u008f\u0018/I×À³Ü§ÅL8]\u001aª{à,\u00ad WåK\u0090ùR6\u009bp\u0000î\u009c\u009bùâ\u0013\u001bLè\u0007´ú}¹\u001fOz\u0004TYþ\u009d\u0098\u009aÅ\u000f\u0012Eæ!\u009e¤\u0092¬Ô¹Áú"
         .length();
      char var8 = 24;
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
                     CONST_J = var4;
                     CONST_K = new String[33];
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

                  var6 = "vÌ\u0083\u0014\u001cÁî)$\u0082×EÅþ/ã\u0013÷Ï\u0001ZaG\u0016¯\u0099\u00844ÌÄÁs\u00817YGmª£ø i\u008f<Í×VùÙ|ø\u0086Æ\u0000É*MæÐ~³aøzÀmþ\u001a)í\u0017\t=";
                  var7 = "vÌ\u0083\u0014\u001cÁî)$\u0082×EÅþ/ã\u0013÷Ï\u0001ZaG\u0016¯\u0099\u00844ÌÄÁs\u00817YGmª£ø i\u008f<Í×VùÙ|ø\u0086Æ\u0000É*MæÐ~³aøzÀmþ\u001a)í\u0017\t="
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25754;
      if (CONST_K[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_L.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ei", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_J[var3].getBytes("ISO-8859-1");
         CONST_K[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_K[var3];
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
         throw new RuntimeException("rip/breeze/ei" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
