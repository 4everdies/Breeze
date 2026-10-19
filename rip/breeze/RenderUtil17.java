package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil17 extends Lambda14 {
   private final UserInfo userInfo_h;
   private final float fieldFloat_i;
   private final int fieldInt_j;
   private final List<RenderUtil19_x> list_k = new ArrayList<>();
   private final RenderUtil14 dataBuilder128_l;
   private final rip.breeze.client.AnimationTimer dataBuilder15_m = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_n = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public RenderUtil17(UserInfo var1, float var2, int var3) {
      this.userInfo_h = var1;
      this.fieldFloat_i = var2;
      this.fieldInt_j = var3;
      this.d = 80.0F;
      this.dataBuilder128_l = new RenderUtil14(var2, var3);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 22603910165621L;
      long var10 = var4 ^ 46241641281725L;
      int var10000 = ImageUtil34.getValue_2();
      boolean var12 = this.a(var1, var2);
      int var13 = var10000;
      boolean var14 = this.dataBuilder15_n.calculateDouble(var6) != 0.0;
      this.dataBuilder15_m.toggle(var8, var12);
      this.dataBuilder15_n.toggle(var8, this.dataBuilder15_n.isBool_e() && var12);
      Color var15 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.layer-one"),
         BreezeContext.authSession_c.getColor("default.hovered"),
         (float)this.dataBuilder15_m.getDouble(var10)
      );
      if (var14) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_n.getDouble(var10) * 2.0)));
      }

      super.a(var1, var2, var3);
      BreezeContext.iRenderer_b.strokeRoundedRect(this, BreezeContext.authSession_c.getFloat("cloud.corner-radius"), var15);
      this.dataBuilder128_l.calculate(var1, var2, var3);
      if (this.userInfo_h.string_b == null
         || this.userInfo_h.string_b.isEmpty()
         || !BreezeContext.iRenderer_b.drawTextInputSelected(this.userInfo_h.string_b, this.a + 13.0F, this.b + 13.0F, 54.0F, 54.0F, 32.0F, false)) {
         BreezeContext.iRenderer_b
            .drawTextAt(
               "account_circle",
               this.a + 13.0F,
               this.b + 13.0F,
               1.35F,
               BreezeContext.authSession_c.getColor("cloud.profile-picture")
            );
      }

      boolean var16 = this.userInfo_h.userRole_c != UserRole.REGULAR && this.userInfo_h.userRole_c != UserRole.PLUS;
      float var17 = var16 ? BreezeContext.iRenderer_b.measureText(this.userInfo_h.userRole_c.name, EnumType32.SOURCE_SANS, 14.0F) + 4.0F : 0.0F;
      float var18 = this.a + this.c - 13.0F - (this.a + 75.0F) - var17;
      String var19 = this.userInfo_h.string_a;
      float var20 = BreezeContext.iRenderer_b.measureText(var19, EnumType32.SOURCE_SANS, 20.0F);
      if (var20 > var18) {
         while (
            !var19.isEmpty()
               && BreezeContext.iRenderer_b.measureText(var19 + "...", EnumType32.SOURCE_SANS, 20.0F) > var18
         ) {
            var19 = var19.substring(0, var19.length() - 1);
            if (var13 != 0) {
               break;
            }
         }

         var19 = var19 + "...";
         var20 = BreezeContext.iRenderer_b.measureText(var19, EnumType32.SOURCE_SANS, 20.0F);
      }

      BreezeContext.iRenderer_b.drawText(var19, this.a + 75.0F, this.b + 14.0F, Color.WHITE, EnumType32.SOURCE_SANS, 20.0F);
      if (var16) {
         BreezeContext.iRenderer_b
            .drawText(
               this.userInfo_h.userRole_c.name, this.a + 75.0F + var20 + 2.0F, this.b + 19.0F, this.userInfo_h.userRole_c.color, EnumType32.SOURCE_SANS, 14.0F
            );
      }

      StringBuilder var21 = new StringBuilder();
      boolean var22 = true;

      for (RenderUtil19_x var24 : this.list_k) {
         if (!var22) {
            var21.append(",");
         }

         var22 = false;
         var21.append(var24.getString_b());
         if (var13 != 0) {
            break;
         }
      }

      BreezeContext.iRenderer_b
         .drawText(
            var21.toString(),
            this.a + 75.0F,
            this.b + 54.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            13.0F
         );
      if (var14) {
         BreezeContext.iRenderer_b.frameEnd();
      }

      if (LicenseState.checkCondition()) {
         ImageUtil34.initialize_2(++var13);
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder15_n.toggle(var6, true);
         return true;
      } else {
         return false;
      }
   }

   public void decrypt(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.dataBuilder15_n.isBool_e() && var3 == 0) {
         this.dataBuilder15_n.toggle(var6, false);
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$mouseReleased_Inner0);
      }
   }

   public void calculate_2() {
      super.g();
      this.dataBuilder128_l.a(this.a + 75.0F, this.b + 33.0F, this.dataBuilder128_l.c, this.dataBuilder128_l.d);
   }

   private void lambda$mouseReleased_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new RenderUtil4(this.userInfo_h.fieldInt_d));
   }

   static {
      long var0 = 27628823832354L;
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
      String var6 = "b0\u0083e\u008e<®\u0094\u007f\rÝOpZ\u0003\u001f\u0095Èå-¥\u0082óG´Âë%XB\u0018e«ÌÞ\u00ad\u00957|® \u0094eö\u0015ÕÎ \u0010XZq\nØ[\u0083\r\u0011E\u0083\u0004l-]Ç'÷£¶\u0019¦^¾\u0010{I° ø2äÚÀ»L\u0018©¾\u009e¢(7ÙMîôº±\u001c\u001añÀ\u0002Öq_¡\u0005 ÉQ#Ýð\u008dZÅÆÊÙ\u0083(:á»ÕÍÿó\u0017¥\u0010ÕDý|R·%gb´+£Óßúp(Þ];·©øe\u0017_\u0002ö`\u008eÒGÿáötaã&\u007f\t\u0005\u009c¾,'\u009a\u0080¸Ã+*\u008c=Ceh à4\u0082!§r\u0093ç\tÆ!YÐcã\u000fQ§µx4\u001dËK2(G½Ð\u0091g±";
      int var7 = "b0\u0083e\u008e<®\u0094\u007f\rÝOpZ\u0003\u001f\u0095Èå-¥\u0082óG´Âë%XB\u0018e«ÌÞ\u00ad\u00957|® \u0094eö\u0015ÕÎ \u0010XZq\nØ[\u0083\r\u0011E\u0083\u0004l-]Ç'÷£¶\u0019¦^¾\u0010{I° ø2äÚÀ»L\u0018©¾\u009e¢(7ÙMîôº±\u001c\u001añÀ\u0002Öq_¡\u0005 ÉQ#Ýð\u008dZÅÆÊÙ\u0083(:á»ÕÍÿó\u0017¥\u0010ÕDý|R·%gb´+£Óßúp(Þ];·©øe\u0017_\u0002ö`\u008eÒGÿáötaã&\u007f\t\u0005\u009c¾,'\u009a\u0080¸Ã+*\u008c=Ceh à4\u0082!§r\u0093ç\tÆ!YÐcã\u000fQ§µx4\u001dËK2(G½Ð\u0091g±"
         .length();
      char var8 = '(';
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
                     CONST_P = var4;
                     CONST_Q = new String[9];
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

                  var6 = "ÿ\u009a\u00053S\u008aúÏ´\u00adw\u0002ô\u009dÏã(»¶ïµµ¡Ôò\u0003Öc/\u0084ô\u0097Î\u0088\u0013 Ò\u009eú\u009cwj-=ë\u0090:\u0006ä%\"ÊºIõ]Ô";
                  var7 = "ÿ\u009a\u00053S\u008aúÏ´\u00adw\u0002ô\u009dÏã(»¶ïµµ¡Ôò\u0003Öc/\u0084ô\u0097Î\u0088\u0013 Ò\u009eú\u009cwj-=ë\u0090:\u0006ä%\"ÊºIõ]Ô"
                     .length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22852;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ex", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/ex" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
