package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil19 extends Util28 {
   private final StringDecryptHelper4 stringDecryptHelper4_j;
   private final RenderUtil31 dataBuilder44_k;
   private final RenderUtil31 dataBuilder44_l;
   private final ImageUtil2 breezeUtil110_m;
   private final rip.breeze.client.AnimationTimer dataBuilder15_n;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public RenderUtil19(StringDecryptHelper4 var1) {
      long var2 = 37766702838026L;
      super();
      this.dataBuilder15_n = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_o = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
      this.stringDecryptHelper4_j = var1;
      this.d = 80.0F;
      this.dataBuilder44_k = new RenderUtil31(var1.getString_b(), 22, "default.text-secondary");
      this.dataBuilder44_l = new RenderUtil31(var1.getString_a(), 16, "default.text-tertiary");
      this.breezeUtil110_m = new ImageUtil2(
         new LicenseState(),
         "delete",
         this::initialize,
         false,
         "Delete the account."
      );
      this.a(new UIPanel[]{this.dataBuilder44_k, this.dataBuilder44_l, this.breezeUtil110_m});
   }

   private void initialize() {
      BreezeContext.microsoftAuth_k.processNullable(this.stringDecryptHelper4_j);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 22603910165621L;
      long var10 = var4 ^ 46241641281725L;
      boolean var12 = this.a(var1, var2);
      boolean var13 = this.dataBuilder15_o.calculateDouble(var6) != 0.0;
      this.dataBuilder15_n.toggle(var8, var12);
      this.dataBuilder15_o.toggle(var8, this.dataBuilder15_o.isBool_e() && var12);
      if (var13) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_o.getDouble(var10) * 2.0)));
      }

      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_n.getDouble(var10)
            )
         );
      String var14 = this.stringDecryptHelper4_j.getString_a();
      int var15 = (int)(this.d - 20.0F);
      HttpUtil3.processNullable(var14, var15);
      if (!BreezeContext.iRenderer_b
         .drawTextInputSelected(
            HttpUtil3.buildString(var14, var15),
            this.a + 10.0F,
            this.b + 10.0F,
            var15,
            var15,
            BreezeContext.authSession_c.getFloat("default.corner-radius::div;2"),
            false
         )) {
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.a + 10.0F,
               this.b + 10.0F,
               this.d - 20.0F,
               this.d - 20.0F,
               BreezeContext.authSession_c.getFloat("default.corner-radius::div;2"),
               RenderUtil1.getColor_2(
                  BreezeContext.authSession_c.getColor("default.layer-one"),
                  BreezeContext.authSession_c.getColor("default.hovered")
               )
            );
      }

      super.processNullable(var1, var2, var3);
      if (var13) {
         BreezeContext.iRenderer_b.frameEnd();
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      long var7 = var5 ^ 81104409656066L;
      if (var4) {
         return false;
      } else if (super.checkCondition(var1, var2, var3, var4)) {
         return true;
      } else if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder15_o.toggle(var7, !this.dataBuilder15_o.isBool_e());
         return true;
      } else {
         return false;
      }
   }

   public void update(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.dataBuilder15_o.isBool_e() && var3 == 0) {
         this.dataBuilder15_o.toggle(var6, false);
         BreezeContext.settingGroup_d
            .setStrings(this.stringDecryptHelper4_j.getString_b(), this.stringDecryptHelper4_j.getString_a(), this.stringDecryptHelper4_j.getString_k());
      }

      super.processNullable_2(var1, var2, var3);
   }

   public StringDecryptHelper4 getStringDecryptHelper4_j() {
      return this.stringDecryptHelper4_j;
   }

   public void calculate_2() {
      this.dataBuilder44_k.a(this.a + this.d, this.b + 18.0F, this.c - this.d - 60.0F, 22.0F);
      this.dataBuilder44_l.a(this.a + this.d, this.b + 45.0F, this.c - this.d - 20.0F, 16.0F);
      this.breezeUtil110_m.a(this.a() - 35.0F, this.b + 8.0F, 28.0F, 28.0F);
   }

   static {
      long var0 = 139506550216350L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "`\u001cr9Þº2Q÷à\u001b k÷Ç¼\u0089ñ|Ç\r\u008cõºr\u0086PÝ~_Ë\u0081¾Ë½#¯_Òâÿ\u0001â\b\u008dli\u0088\u0081\u0007\u0004\u0010Tc\u007f©0uÆå\u001dýË\u0097õÄ\u00ad!ÀhèÚ`*V\u008eÜæ\u0092\u0088K\u00922sk\u001bKí\u009aw@\u0088\u0006¹öä°UïËÕ\u008b\u0096&ê8ûð\u001e]\u001bÝ\u009b\u0019*\u008aO\u0082¯\u0089z£WÙ\u0006s±ªnàÏ\u001b\u0080\u0001/Óvz¡hr¡\u0004#h`\u000eg«\u0003FÙå²e÷!´ûÞëÞ(ø\u0012ßzgA:óá\u0017D.BÉ?9\u008eN\u009cb\nFÍÿ\u0016\u0084,Þb¯ÀÐP¾:g Ì\u001bj(ï[(\u0006ÜäÔR\u009bVL\u008d@Ñà³\rÒ©ò\u0089S\u009eË\fH£\u0000\u009ft\rÐ\u0091U\u0081\u0010I\u0016©Ð\u0018h\u008f\u0007^Êåé\u0001Ý\u0007t\u0004ÊXj·ì\u0098Q\u0085\u0084Ìo^(DSÃikt\u0015r&~ÈpÛ ¥Ú®\u008bk#Ø]E \u0096¿\u000bÏ}\u0014Nv'9hÑÎAè\u0093(O\u0081´-Ûj¦\u0003M/JÑh»\u0016\u0095Û_[ñÒÈ\u0004D\nÎ\u00ad«Ãky\u0012^áØà\u0080wx[\u0018\u007f\u0081\u009dn±ëµ¿6k®\u007f$Z\u0086µÁE\u0013øz}æx";
      int var7 = "`\u001cr9Þº2Q÷à\u001b k÷Ç¼\u0089ñ|Ç\r\u008cõºr\u0086PÝ~_Ë\u0081¾Ë½#¯_Òâÿ\u0001â\b\u008dli\u0088\u0081\u0007\u0004\u0010Tc\u007f©0uÆå\u001dýË\u0097õÄ\u00ad!ÀhèÚ`*V\u008eÜæ\u0092\u0088K\u00922sk\u001bKí\u009aw@\u0088\u0006¹öä°UïËÕ\u008b\u0096&ê8ûð\u001e]\u001bÝ\u009b\u0019*\u008aO\u0082¯\u0089z£WÙ\u0006s±ªnàÏ\u001b\u0080\u0001/Óvz¡hr¡\u0004#h`\u000eg«\u0003FÙå²e÷!´ûÞëÞ(ø\u0012ßzgA:óá\u0017D.BÉ?9\u008eN\u009cb\nFÍÿ\u0016\u0084,Þb¯ÀÐP¾:g Ì\u001bj(ï[(\u0006ÜäÔR\u009bVL\u008d@Ñà³\rÒ©ò\u0089S\u009eË\fH£\u0000\u009ft\rÐ\u0091U\u0081\u0010I\u0016©Ð\u0018h\u008f\u0007^Êåé\u0001Ý\u0007t\u0004ÊXj·ì\u0098Q\u0085\u0084Ìo^(DSÃikt\u0015r&~ÈpÛ ¥Ú®\u008bk#Ø]E \u0096¿\u000bÏ}\u0014Nv'9hÑÎAè\u0093(O\u0081´-Ûj¦\u0003M/JÑh»\u0016\u0095Û_[ñÒÈ\u0004D\nÎ\u00ad«Ãky\u0012^áØà\u0080wx[\u0018\u007f\u0081\u009dn±ëµ¿6k®\u007f$Z\u0086µÁE\u0013øz}æx"
         .length();
      char var8 = '8';
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
                     CONST_Q = var4;
                     CONST_R = new String[11];
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

                  var6 = ";\u00ad\u000b\u0086S4¾VZ\u009aá\u009aá\bäíÇ®\u001b\u009e\u001dyrH\u0010\u0094\u008eÑA\u0019°z\u0010\u009fGµ\u001aÆÛ\u001a['\u001e2\u009dÿ\u0005\u0096\u000e";
                  var7 = ";\u00ad\u000b\u0086S4¾VZ\u009aá\u009aá\bäíÇ®\u001b\u009e\u001dyrH\u0010\u0094\u008eÑA\u0019°z\u0010\u009fGµ\u001aÆÛ\u001a['\u001e2\u009dÿ\u0005\u0096\u000e"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13802;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c0", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/c0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
