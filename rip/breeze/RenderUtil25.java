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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil25 extends Util28 {
   private static final String CONST_J;
   private static final String CONST_K;
   private boolean fieldBool_l;
   private long fieldLong_m;
   private String string_n;
   private RenderUtil19_x enum4Val_o;
   private String string_p;
   private rip.breeze.client.AnimationTimer dataBuilder15_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private final RenderUtil12 dataBuilder124_s;
   private final ImageUtil2 breezeUtil110_t;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public RenderUtil25(String var1, boolean var2, RenderUtil19_x var3, long var4) {
      long var6 = 116331117827162L;
      MathUtil8.decrypt();
      super();
      this.string_p = "";
      this.dataBuilder15_q = new rip.breeze.client.AnimationTimer(400.0F, true, EnumType3.LINEAR);
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.string_n = var1.substring(0, 5) + "-" + var1.substring(5);
      this.fieldBool_l = var2;
      this.fieldLong_m = var4;
      this.enum4Val_o = var3;
      this.dataBuilder124_s = new RenderUtil12(
         var2 ? "This is your share-code." : "This is the share-code.", new LicenseState()
      );
      this.b(this.dataBuilder124_s);
      this.breezeUtil110_t = new ImageUtil2(
         new LicenseState(),
         "refresh",
         this::processAll,
         false,
         String.format("Generate a new share-code for your %s.", var3.getString_a().toLowerCase())
      );
      if (var2) {
         this.b(this.breezeUtil110_t);
      }

      if (LicenseState.checkCondition()) {
         MathUtil8.initialize_5(new int[2]);
      }
   }

   private void processAll() {
      long var1 = 43645692121438L;
      if (this.fieldBool_l) {
         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs4(this.fieldLong_m, this.enum4Val_o, this::initialize, this::update);
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-7974635699021287945L, var1);
         Object[] var10002 = var10001;
         CloudAuthService var5 = var10000;
         Method var4 = var10003;

         try {
            var4.invoke(var5, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   private void initialize(String var1) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$refreshCallback_Inner0);
   }

   private void update(String var1) {
      long var2 = 138140746760876L;
      BreezeContext.guiPanelSettings_f.processAll("Failed regenerating share-code", RenderUtil18_x.RED + var1);
   }

   public void processAll_2(String var1, boolean var2) {
      long var3 = 57898111917111L;
      this.string_n = var1.substring(0, 5) + "-" + var1.substring(5);
      int[] var10000 = MathUtil8.decrypt();
      this.fieldBool_l = var2;
      int[] var5 = var10000;
      this.dataBuilder124_s.initialize(var2 ? "This is your share-code." : "This is the share-code.");
      if (!var2) {
         this.c(this.breezeUtil110_t);
         if (var5 == null) {
            return;
         }
      }

      if (!this.d(this.breezeUtil110_t)) {
         this.b(this.breezeUtil110_t);
      }
   }

   public void calculate(float var1, float var2, float var3) {
      int[] var10;
      label39: {
         long var4 = 27283383647554L;
         long var6 = var4 ^ 22603910165621L;
         long var8 = var4 ^ 46241641281725L;
         var10 = MathUtil8.decrypt();
         this.dataBuilder15_r.toggle(var6, this.a(var1, var2) && (!this.fieldBool_l || !this.breezeUtil110_t.a(var1, var2)));
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               this,
               BreezeContext.authSession_c.getFloat("button.corner-radius"),
               BreezeContext.authSession_c.getColor("default.layer-two")
            );
         Color var11 = RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            (float)this.dataBuilder15_r.getDouble(var8)
         );
         if (!this.string_p.isEmpty() && this.dataBuilder15_q.getDouble(var8) != 1.0) {
            if (this.dataBuilder15_q.getDouble(var8) < 0.5) {
               BreezeContext.iRenderer_b
                  .drawText(
                     this.string_p,
                     this.c() - BreezeContext.iRenderer_b.measureText(this.string_p, EnumType32.SOURCE_CODE_PRO, 22.0F) / 2.0F,
                     this.b + 13.0F,
                     RenderUtil1.getColor_7(var11, (int)(255.0 * (1.0 - this.dataBuilder15_q.getDouble(var8) * 2.0))),
                     EnumType32.SOURCE_CODE_PRO,
                     22.0F
                  );
               if (var10 == null) {
                  break label39;
               }
            }

            BreezeContext.iRenderer_b
               .drawText(
                  this.string_n,
                  this.c() - BreezeContext.iRenderer_b.measureText(this.string_n, EnumType32.SOURCE_CODE_PRO, 22.0F) / 2.0F,
                  this.b + 13.0F,
                  RenderUtil1.getColor_7(var11, (int)(255.0 * ((this.dataBuilder15_q.getDouble(var8) - 0.5) * 2.0))),
                  EnumType32.SOURCE_CODE_PRO,
                  22.0F
               );
            if (var10 == null) {
               break label39;
            }
         }

         BreezeContext.iRenderer_b
            .drawText(
               this.string_n,
               this.c() - BreezeContext.iRenderer_b.measureText(this.string_n, EnumType32.SOURCE_CODE_PRO, 22.0F) / 2.0F,
               this.b + 13.0F,
               var11,
               EnumType32.SOURCE_CODE_PRO,
               22.0F
            );
      }

      if (this.fieldBool_l) {
         this.breezeUtil110_t.calculate(var1, var2, var3);
      }

      if (!this.fieldBool_l || !this.breezeUtil110_t.a(var1, var2)) {
         this.dataBuilder124_s.update(var1, var2, var3);
         if (var10 == null) {
            return;
         }
      }

      this.dataBuilder124_s.update(-10.0F, -10.0F, var3);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2)) {
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.string_n), null);
         BreezeContext.guiPanelSettings_f
            .processAll(
               "Copied",
               "The share code"
                  + RenderUtil18_x.ACCENT
                  + this.string_n
                  + RenderUtil18_x.RESET
                  + "  has been copied to your clipboard successfully."
            );
         return true;
      } else {
         return false;
      }
   }

   public void calculate_2() {
      this.dataBuilder124_s.a(this);
      this.breezeUtil110_t.a(this.a() - 25.0F, this.b - 10.0F, 35.0F, 35.0F);
   }

   private void lambda$refreshCallback_Inner0(String var1) {
      long var2 = 36122004340017L;
      long var4 = var2 ^ 48948758082566L;
      this.string_p = this.string_n;
      this.string_n = var1.substring(0, 5) + "-" + var1.substring(5);
      this.dataBuilder15_q = new rip.breeze.client.AnimationTimer(600.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_q.toggle(var4, true);
   }

   static {
      long var0 = 130156579672159L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "*·\u007f$\f\u0087-%)ú\u0080Aê\u0002¤fðU.B÷ö»íÅÁ\u00940_ZY\u0002{Í\u00ad·Ñ £)U\u008cC%c~\u0000ÍÿÏ¥8\u0018$Yí\u000f¥+ðD\u00ad\u001dÚ\u0010Ú\u008b8\u00146Ô-a!\u009a}6;ý2âz+Í;\u0014\u0080+T\u0089,§çfÄy7\u001dI¶\\\u009azÈ\u008e\u0017Ëßý(\u000b\u0010\u000f®\u0092\u0000\u0086ÎX\u0089Ó¯Sx\u008f\u0092¨\tTáÂVá\u0006Ã\u007fwZH\u009eá2\f\u0091\bý\u001fl\u0082`\u0096\bÉ8ÝÝ@zÂ\u009c0 ¶\u000eô@¡1È\u0088²\u001a3\u008b\u0000ÖîyPfy\u0086±FÆ\u008a\u001f\u0081\u0084\u0006\u009ftÅÏ\u0082Ô$\u001eàGâÎÇ1&9÷\f\u008b(7\u0085¦!Ì\u0093Ó\u001cC.=vB\u0006PËû\u0092ú[\u0084³V\u0093O¾ÕGP#Ù\u008bm\u0007ï\u0090*½ñy¨5û\u009d9aíÕ¯»exÂ\u0087\u009b\u0018b£J\u0007Ü\u000b¾\u008eh8%¼$´Ý\u001a´ýÐ±\u0098¯\u001f(·8\b=\u000f3\u0098à\u0087^1÷´ý\u0007\b¥ÃéêW\u0092a\u0010Ú\t×\f0 \u0012â!\u0087K8Ó\u0012½Y¶¬O|1~VªØ\\ï®\u009f\"ÎÙVFÏä³:³\u009b&óà\u0095¢\\)\u001f(\u007fnBGnN\u0010¼\u0091¾{\\û'Ò3\u0099\u001dp^£ Y[wfÌ§y¿`²%\u0090ÆËô\u0084\u008fÀ\u008aÃÀ\u000b9Ý|É Ç8!XSOX\u0010{\u0007@º\u000bJôµV\u0013\u0005g\u0011©¾ò\u0098\u00ad\u0014\u0001\u0016\u0011¤Ë¡\u0081ºíUTÚ\u007f¯û8É\u0086-lËT®L\u0095ÃKþ×ý\u0001Ô \u009b\u001b\u0097È\u001e\u008fS\u008a\u0000*XB×§ººe\u0083e¤Hbâå±\u0002¡9ñ\u007füåö\u0012z\u009a_\u0011C\u0081\f\u0002\u0091\u0094Z\fù\u0090N\\Ï/\u0014+\u007fi\u0019g\u001aXA§\u000eÚ¬[Á\u0094¼ýY\u009f\u009ay|HÀÄ\u0084\u0099\u001cFöÖN\u0012J¸\u0083%Õçt»\u00adÀÞ¹`:f\u00ad;Kñf1=±\u00880i\u0099St\r5¨ä¼O\u009d\u0095\u0094É'\u009dE\u001fy_{Àª {ÊÛ\u0098Ø¬\u0001\u0005\u0090aÞ\u0085Þ.z_\u0016Ä\u0085\u00046S.Å¸\u008e</M,gÏ¾\u007f-\u0012c7\t±PoÝJ>\u001bÑä\u0003Ã°\u0088´\u0004ºìU\u001eg¬ï}\u0006W\u0099\u0086#OÝ=ü\u0012rkV×\u0091µÇ\u0085ÁpÕ\u0097Ñs8\u001dagß\u0084 Nt\u001d\u008ef¤F¥Í7Ñ¾<Ã\u0004\u0096g?\u0011\u009caóm¯¹¬\u0090\u0015@ÌÙ±'¼±zµY¯:¾â\u0089to2Ã³tñÕ¾P¨L\u0090«\u0084(\u001e\u0003Jøu514ú\u0011Sý*{µ3c%ÿµnò§Ööi\rm\u001cÀe1[¤F¹ôw<\u0087¨Ô9\u00ad=\u0099\u00050þ\u000e\u0082\u001aËM\u000bý\rÝc\u0087úí¤\u00adB\u0083q¦\u0091Hìæ´\u0088F´\u0087}a\u0096\"Ö\u0011\u00140\"3ÆOCUS,94b\u008aNY6Qx¾ÐÂ.1ß\u000b\u008a\u0085\u0010Ë\n\ng·mõ\u0010I¡¶¤õTÉ\u0004\u0082\u009f\u008bV\u0094<öqð;PÖ8à\u0006c\u001cÂ^¤Uo,Lô©a>Þqð\u0095zº°\u000bW;\u008d\u0084x\u0011ÛÈµPI·h[©D\u001fñÎ°¸ï;Ä_åPß\u009c\u000f\u0002AN\u0016ô\u0093FÍóÃ\u0010;hE¬X©_\u009f5^Ä\"ÔCµÔÙêè¤þæ\u0088/\fØ\u001e\u008d\t\u0091§¥î¿*äÉÓ\nÄ}Á+Ôµ?Ý8hì\u0087³0\b\u0017\u0016\u001bÁá\u0010h¶p°c\u000b\u001dC·\u0091Ëî@Ð\u0012¹»ì\u0089\u0089#½¯\u0019\u0093=·+\u008d\u0090\u009an4( :ö\u0001÷Ý´\u0090v\u009e\u0017-çÃ,ò\u009bnTµ2baça\u0011\u0082µg*ÐIÿzß§ý|«:\u0010%HÜAÆéZÄþ¡\u009b\u009fhdÓ#@\u0080f@\u008cýU+Ëø{\u0006·uG\u0091s\u00951è´9±\u0094AÑ\u0084U\b\u0095\nÇÇS\u0014ÙÝ+ª½6¤ÄSp\u008bn4¢\\Êe-O{Z0\bÇF\u0099Û\\\u001a 8HÃK¶%ø\u007f>ØAÏ\u0081)Sðb\u001cym  ¿\u0097ÿ@Ù?>§\u0092|\u009f\u0005¹KfhNK$\u0004-Z÷\u009e°Ô\u0094Üíï:\u000e»áD";
      int var7 = "*·\u007f$\f\u0087-%)ú\u0080Aê\u0002¤fðU.B÷ö»íÅÁ\u00940_ZY\u0002{Í\u00ad·Ñ £)U\u008cC%c~\u0000ÍÿÏ¥8\u0018$Yí\u000f¥+ðD\u00ad\u001dÚ\u0010Ú\u008b8\u00146Ô-a!\u009a}6;ý2âz+Í;\u0014\u0080+T\u0089,§çfÄy7\u001dI¶\\\u009azÈ\u008e\u0017Ëßý(\u000b\u0010\u000f®\u0092\u0000\u0086ÎX\u0089Ó¯Sx\u008f\u0092¨\tTáÂVá\u0006Ã\u007fwZH\u009eá2\f\u0091\bý\u001fl\u0082`\u0096\bÉ8ÝÝ@zÂ\u009c0 ¶\u000eô@¡1È\u0088²\u001a3\u008b\u0000ÖîyPfy\u0086±FÆ\u008a\u001f\u0081\u0084\u0006\u009ftÅÏ\u0082Ô$\u001eàGâÎÇ1&9÷\f\u008b(7\u0085¦!Ì\u0093Ó\u001cC.=vB\u0006PËû\u0092ú[\u0084³V\u0093O¾ÕGP#Ù\u008bm\u0007ï\u0090*½ñy¨5û\u009d9aíÕ¯»exÂ\u0087\u009b\u0018b£J\u0007Ü\u000b¾\u008eh8%¼$´Ý\u001a´ýÐ±\u0098¯\u001f(·8\b=\u000f3\u0098à\u0087^1÷´ý\u0007\b¥ÃéêW\u0092a\u0010Ú\t×\f0 \u0012â!\u0087K8Ó\u0012½Y¶¬O|1~VªØ\\ï®\u009f\"ÎÙVFÏä³:³\u009b&óà\u0095¢\\)\u001f(\u007fnBGnN\u0010¼\u0091¾{\\û'Ò3\u0099\u001dp^£ Y[wfÌ§y¿`²%\u0090ÆËô\u0084\u008fÀ\u008aÃÀ\u000b9Ý|É Ç8!XSOX\u0010{\u0007@º\u000bJôµV\u0013\u0005g\u0011©¾ò\u0098\u00ad\u0014\u0001\u0016\u0011¤Ë¡\u0081ºíUTÚ\u007f¯û8É\u0086-lËT®L\u0095ÃKþ×ý\u0001Ô \u009b\u001b\u0097È\u001e\u008fS\u008a\u0000*XB×§ººe\u0083e¤Hbâå±\u0002¡9ñ\u007füåö\u0012z\u009a_\u0011C\u0081\f\u0002\u0091\u0094Z\fù\u0090N\\Ï/\u0014+\u007fi\u0019g\u001aXA§\u000eÚ¬[Á\u0094¼ýY\u009f\u009ay|HÀÄ\u0084\u0099\u001cFöÖN\u0012J¸\u0083%Õçt»\u00adÀÞ¹`:f\u00ad;Kñf1=±\u00880i\u0099St\r5¨ä¼O\u009d\u0095\u0094É'\u009dE\u001fy_{Àª {ÊÛ\u0098Ø¬\u0001\u0005\u0090aÞ\u0085Þ.z_\u0016Ä\u0085\u00046S.Å¸\u008e</M,gÏ¾\u007f-\u0012c7\t±PoÝJ>\u001bÑä\u0003Ã°\u0088´\u0004ºìU\u001eg¬ï}\u0006W\u0099\u0086#OÝ=ü\u0012rkV×\u0091µÇ\u0085ÁpÕ\u0097Ñs8\u001dagß\u0084 Nt\u001d\u008ef¤F¥Í7Ñ¾<Ã\u0004\u0096g?\u0011\u009caóm¯¹¬\u0090\u0015@ÌÙ±'¼±zµY¯:¾â\u0089to2Ã³tñÕ¾P¨L\u0090«\u0084(\u001e\u0003Jøu514ú\u0011Sý*{µ3c%ÿµnò§Ööi\rm\u001cÀe1[¤F¹ôw<\u0087¨Ô9\u00ad=\u0099\u00050þ\u000e\u0082\u001aËM\u000bý\rÝc\u0087úí¤\u00adB\u0083q¦\u0091Hìæ´\u0088F´\u0087}a\u0096\"Ö\u0011\u00140\"3ÆOCUS,94b\u008aNY6Qx¾ÐÂ.1ß\u000b\u008a\u0085\u0010Ë\n\ng·mõ\u0010I¡¶¤õTÉ\u0004\u0082\u009f\u008bV\u0094<öqð;PÖ8à\u0006c\u001cÂ^¤Uo,Lô©a>Þqð\u0095zº°\u000bW;\u008d\u0084x\u0011ÛÈµPI·h[©D\u001fñÎ°¸ï;Ä_åPß\u009c\u000f\u0002AN\u0016ô\u0093FÍóÃ\u0010;hE¬X©_\u009f5^Ä\"ÔCµÔÙêè¤þæ\u0088/\fØ\u001e\u008d\t\u0091§¥î¿*äÉÓ\nÄ}Á+Ôµ?Ý8hì\u0087³0\b\u0017\u0016\u001bÁá\u0010h¶p°c\u000b\u001dC·\u0091Ëî@Ð\u0012¹»ì\u0089\u0089#½¯\u0019\u0093=·+\u008d\u0090\u009an4( :ö\u0001÷Ý´\u0090v\u009e\u0017-çÃ,ò\u009bnTµ2baça\u0011\u0082µg*ÐIÿzß§ý|«:\u0010%HÜAÆéZÄþ¡\u009b\u009fhdÓ#@\u0080f@\u008cýU+Ëø{\u0006·uG\u0091s\u00951è´9±\u0094AÑ\u0084U\b\u0095\nÇÇS\u0014ÙÝ+ª½6¤ÄSp\u008bn4¢\\Êe-O{Z0\bÇF\u0099Û\\\u001a 8HÃK¶%ø\u007f>ØAÏ\u0081)Sðb\u001cym  ¿\u0097ÿ@Ù?>§\u0092|\u009f\u0005¹KfhNK$\u0004-Z÷\u009e°Ô\u0094Üíï:\u000e»áD"
         .length();
      char var8 = 160;
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
                     CONST_V = var4;
                     CONST_W = new String[16];
                     CONST_J = "This is your share-code.";
                     CONST_K = "This is the share-code.";
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

                  var6 = "\u0081\u009a?Ðñ\u00126¹?Dâi\u0093¶\u00195\u001c:tÊÀ\u008dZLè\u0085¡\u009dÊl>1ÎË£Bß¤\u0096¢¨\u00adéÐÐ\u0095\u0095ÕÀ\u0080±â_Jwnèî\u0015\u0010Åqæw³é}\u008agÄ\u0018\u0007«Yh§oÑµZrÿ\u001d¹[\u0007L<´<\u0093\u0087Ö\u0088,Ðî\u000f\u0092j/å\u000b¨·ë$¦2À¶m«\u0083¤âñÄ½\u0013d\u009f Þ\u0087Òâ]ò\u0090\r²È\\°\\\u008cÊ21:¼¯Âg<¥\u0001cÊ{\u000f+·,¬ñÂ\u0014é\u0098ª&\u0097¸@1Üë¼\u001d\u008fNÈñxò¥o?Lµ5Ö\u0083\u0089@Í\u0014\u0090\u008aÍúìÞÄÎÏi\u0010\u001esïFj\u0017\u0000\u0094w";
                  var7 = "\u0081\u009a?Ðñ\u00126¹?Dâi\u0093¶\u00195\u001c:tÊÀ\u008dZLè\u0085¡\u009dÊl>1ÎË£Bß¤\u0096¢¨\u00adéÐÐ\u0095\u0095ÕÀ\u0080±â_Jwnèî\u0015\u0010Åqæw³é}\u008agÄ\u0018\u0007«Yh§oÑµZrÿ\u001d¹[\u0007L<´<\u0093\u0087Ö\u0088,Ðî\u000f\u0092j/å\u000b¨·ë$¦2À¶m«\u0083¤âñÄ½\u0013d\u009f Þ\u0087Òâ]ò\u0090\r²È\\°\\\u008cÊ21:¼¯Âg<¥\u0001cÊ{\u000f+·,¬ñÂ\u0014é\u0098ª&\u0097¸@1Üë¼\u001d\u008fNÈñxò¥o?Lµ5Ö\u0083\u0089@Í\u0014\u0090\u008aÍúìÞÄÎÏi\u0010\u001esïFj\u0017\u0000\u0094w"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20468;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c8", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/c8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
