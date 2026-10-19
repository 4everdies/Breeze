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
import rip.breeze.client.EnumType3;

class RenderUtil15 extends UIPanel {
   private final String string_h;
   private final String string_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j;
   private final boolean fieldBool_k;
   final RenderUtil13_x dataBuilder129_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   RenderUtil15(RenderUtil13_x var1, String var2, String var3, boolean var4) {
      this.dataBuilder129_l = var1;
      this.dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.string_h = var2;
      this.string_i = var3;
      this.fieldBool_k = var4;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4;
      long var8;
      boolean var11;
      label47: {
         var4 = 27283383647554L;
         long var6 = var4 ^ 22603910165621L;
         var8 = var4 ^ 46241641281725L;
         int[] var10000 = MathUtil8.decrypt();
         super.toggle(var1, var2, var3);
         int[] var10 = var10000;
         var11 = this.string_h.equals("back") && !BreezeContext.guiPanelSettings_f.dataBuilder100_r.isValid_3();
         this.dataBuilder15_j.toggle(var6, !var11 && this.a(var1, var2));
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               this,
               BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
               RenderUtil1.getColor_7(
                  BreezeContext.authSession_c.getColor("drawer.hovered"),
                  (int)(
                     BreezeContext.authSession_c.getColor("drawer.hovered").getAlpha()
                        * this.dataBuilder15_j.getDouble(var8)
                  )
               )
            );
         if (this.fieldBool_k) {
            BreezeContext.iRenderer_b
               .drawTextAt(
                  this.string_h,
                  this.a + 5.0F,
                  this.b + 2.0F,
                  1.3F,
                  var11
                     ? BreezeContext.authSession_c.getColor("default.text-tertiary")
                     : BreezeContext.authSession_c.getColor("default.text-primary")
               );
            if (var10 == null) {
               break label47;
            }
         }

         BreezeContext.iRenderer_b
            .drawTextColored(
               "icons/" + this.string_h + ".png",
               this.a + 5.0F,
               this.b + 2.0F,
               30.0F,
               30.0F,
               var11
                  ? BreezeContext.authSession_c.getColor("default.text-tertiary")
                  : BreezeContext.authSession_c.getColor("default.text-primary")
            );
      }

      BreezeContext.iRenderer_b
         .drawText(
            this.string_i,
            this.a + 40.0F,
            this.b + 8.0F,
            var11
               ? BreezeContext.authSession_c.getColor("default.text-disabled")
               : RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.text-tertiary"),
                  BreezeContext.authSession_c.getColor("default.text-primary"),
                  (float)this.dataBuilder15_j.getDouble(var8)
               ),
            EnumType32.SOURCE_SANS,
            20.0F
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      int[] var6 = MathUtil8.decrypt();
      if (this.a(var1, var2) && var3 == 0) {
         BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
         String var7 = this.string_h;
         byte var8 = -1;
         switch (var7.hashCode()) {
            case -309425751:
               if (!var7.equals("profile")) {
                  break;
               }

               var8 = 0;
               if (var6 == null) {
                  break;
               }
            case 3208415:
               if (!var7.equals("home")) {
                  break;
               }

               var8 = 1;
               if (var6 == null) {
                  break;
               }
            case 171748846:
               if (!var7.equals("add-config")) {
                  break;
               }

               var8 = 2;
               if (var6 == null) {
                  break;
               }
            case -1087355491:
               if (!var7.equals("add-theme")) {
                  break;
               }

               var8 = 3;
               if (var6 == null) {
                  break;
               }
            case 618855287:
               if (var7.equals("add-script")) {
                  var8 = 4;
               }
         }

         switch (var8) {
            case 0:
               RenderUtil3 var10000 = BreezeContext.guiPanelSettings_f.dataBuilder100_r;
               RenderUtil4 var10001 = new RenderUtil4();
               CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
               Object[] var10004 = rip.breeze.client.MathUtil8.noArgs();
               Method var10006 = rip.breeze.client.MathUtil8.getMethod_3(-4998366923031119184L, var4);
               Object[] var10005 = var10004;
               CloudAuthService var12 = var10003;
               Method var10 = var10006;

               try {
                  var11 = (UserInfo)var10.invoke(var12, var10005);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               /* constructor call removed */
               var10000.update(var10001);
               if (var6 == null) {
                  break;
               }
            case 1:
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable_2();
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize_2();
               if (var6 == null) {
                  break;
               }
            case 2:
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new ImageUtil26());
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
               if (var6 == null) {
                  break;
               }
            case 3:
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new MathUtil12());
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
               if (var6 == null) {
                  break;
               }
            case 4:
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new ImageUtil12());
               BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
         }

         return true;
      } else {
         return super.isValid(var1, var2, var3);
      }
   }

   static {
      long var0 = 95875215879846L;
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
      String var6 = "ÏÔßü¼\u0012\u0081©C13wÐ:F|Ó\u0010Âdúw\u0087oò³0\u0097\u009dÍØï,ªü¸ål«ó\u0010g:×a6;¹Ë\u0005Õ>KÁ\u0096~\n\u00104\u0091wÐ([~l\u0083G xÉ4,Ì(çÏ¯Õ\u008efíÙö¹\u00ad.%A1½\u0007=b!Ïj¼øoý@ìI\u0012g\u0083ÊäÜÙ\u0082æz¦\u0010\u0000\u00866$\u0016óãñìpî\u008a0¢\u009eÁ0Ï3\u0084¸ú?ÍóZvÿ-ZÈÖI\u0080\u008fqUzZ6z¿\u0091\u0083L\u009eóÉð2#\u0019Ï\u0007BþE\u0081¹ÞwºnÊ\u00130Êa\u009e»·=ó¾ê\nðão.\u0011\u008bJ}i\u0082ç\u000e(Ç°\u0004fTIc\u008fp\u0011òE0÷íÜW«,óhëzÄ\u0098 \u009eê!±w\u0011\u0089öKx\u008a+\u0003c\u008a·ÆNóBB$\u0090\nÑ\u0016Íg×|\u001f\u0017 d¦í>Êì\u009fzà¼\u000f:]\u00015\nú¨\u0093£éÝuJO\u008eÈ¼\r¾óÅ\u0010b¡µÜ+\n²w^\u0089ë\u0091\u0086µä, S¦\u001eW÷\u0014;nÔh\u0082ì\u0096;\"E\u0013sÉë<pøf\u0095{ûÕy¾\rÝ\u0010* ¦Vw\u00840Ì\u0004Ò®ÁC¯\u001e\u008c ¤Òì·j¨\u0081\u0005J\u001b\u008eÕýÒ½nþFÍ+b\u00adÍF2 c¶oò/á\u0018ÅQS2JÄñt8Ó0(I`.ÅRì\u001f¼@\u0088Ý\u00ad";
      int var7 = "ÏÔßü¼\u0012\u0081©C13wÐ:F|Ó\u0010Âdúw\u0087oò³0\u0097\u009dÍØï,ªü¸ål«ó\u0010g:×a6;¹Ë\u0005Õ>KÁ\u0096~\n\u00104\u0091wÐ([~l\u0083G xÉ4,Ì(çÏ¯Õ\u008efíÙö¹\u00ad.%A1½\u0007=b!Ïj¼øoý@ìI\u0012g\u0083ÊäÜÙ\u0082æz¦\u0010\u0000\u00866$\u0016óãñìpî\u008a0¢\u009eÁ0Ï3\u0084¸ú?ÍóZvÿ-ZÈÖI\u0080\u008fqUzZ6z¿\u0091\u0083L\u009eóÉð2#\u0019Ï\u0007BþE\u0081¹ÞwºnÊ\u00130Êa\u009e»·=ó¾ê\nðão.\u0011\u008bJ}i\u0082ç\u000e(Ç°\u0004fTIc\u008fp\u0011òE0÷íÜW«,óhëzÄ\u0098 \u009eê!±w\u0011\u0089öKx\u008a+\u0003c\u008a·ÆNóBB$\u0090\nÑ\u0016Íg×|\u001f\u0017 d¦í>Êì\u009fzà¼\u000f:]\u00015\nú¨\u0093£éÝuJO\u008eÈ¼\r¾óÅ\u0010b¡µÜ+\n²w^\u0089ë\u0091\u0086µä, S¦\u001eW÷\u0014;nÔh\u0082ì\u0096;\"E\u0013sÉë<pøf\u0095{ûÕy¾\rÝ\u0010* ¦Vw\u00840Ì\u0004Ò®ÁC¯\u001e\u008c ¤Òì·j¨\u0081\u0005J\u001b\u008eÕýÒ½nþFÍ+b\u00adÍF2 c¶oò/á\u0018ÅQS2JÄñt8Ó0(I`.ÅRì\u001f¼@\u0088Ý\u00ad"
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
                     CONST_N = var4;
                     CONST_O = new String[16];
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

                  var6 = "À¼Ù7N\u0083m\u0098\u00ad\u0096a®X1d=S¼â\u0097ýé\u0096âc\u0081ãt\u0094¦\u0007\u000f+NU\u0016JE»c ®\u0005ZÉ\u009c´,¿Ò\u0095\u0095i\u0082S¿styÓÀ:\u001a¿ûÆf\u0099®\r0ìü";
                  var7 = "À¼Ù7N\u0083m\u0098\u00ad\u0096a®X1d=S¼â\u0097ýé\u0096âc\u0081ãt\u0094¦\u0007\u000f+NU\u0016JE»c ®\u0005ZÉ\u009c´,¿Ò\u0095\u0095i\u0082S¿styÓÀ:\u001a¿ûÆf\u0099®\r0ìü"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27850;
      if (CONST_O[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/er", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
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
         throw new RuntimeException("rip/breeze/er" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
