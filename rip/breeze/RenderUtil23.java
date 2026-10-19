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

class RenderUtil23 extends Util28 {
   private final rip.breeze.client.AnimationTimer dataBuilder15_j;
   final EntityUtil5 dataBuilder31_k;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   RenderUtil23(EntityUtil5 var1) {
      long var2 = 73960011923994L;
      int[] var10000 = MathUtil8.decrypt();
      this.dataBuilder31_k = var1;
      super();
      int[] var4 = var10000;
      this.dataBuilder15_j = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.SINE_OUT);

      for (RotationUtil1_x var8 : RotationUtil1_x.values()) {
         this.b(new ImageUtil7(this, var8));
         if (var4 != null) {
            break;
         }
      }
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      if (this.dataBuilder15_j.calculateDouble(var6) == 0.0 && !this.dataBuilder15_j.isBool_e()) {
         this.update();
      } else {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner0);
      }
   }

   public void calculate() {
      long var1 = 62740630596709L;
      float var3 = 30.0F;
      int[] var10000 = MathUtil8.decrypt();
      float var4 = 5.0F;
      float var5 = this.j().size() * 30.0F + (this.j().size() + 1) * 5.0F;
      int[] var6 = var10000;
      this.d = var5;
      int var7 = 0;

      while (var7 < this.j().size()) {
         ((UIPanel)this.j().get(var7)).drawColoredQuad(this.a + 5.0F, this.b + 5.0F + var7 * 35.0F, 170.0F, 30.0F);
         var7++;
         if (var6 != null) {
            break;
         }
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      long var2 = 94253235202450L;
      long var4 = var2 ^ 3678302743478L;
      return this.dataBuilder15_j.calculateDouble(var4) > 0.0;
   }

   public void update() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      super.processNullable_3();
      this.dataBuilder15_j.toggle(var3, false);
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         this.processAll();
         return false;
      } else if (!this.a(var1, var2)) {
         this.processAll();
         return true;
      } else {
         super.checkCondition(var1, var2, var3, var4);
         return true;
      }
   }

   void processAll() {
      long var1 = 2527699356927L;
      long var3 = var1 ^ 15470689617352L;
      boolean var5 = !this.dataBuilder15_j.isBool_e();
      this.dataBuilder15_j.toggle(var3, var5);
      if (var5) {
         BreezeContext.guiPanelSettings_f.update(this);
      }
   }

   void calculate() {
      long var1 = 106275220075720L;
      long var3 = var1 ^ 59688264300268L;
      if (this.dataBuilder15_j.calculateDouble(var3) == 0.0 && this.f) {
         this.update();
      }
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      long var4 = 120497094783103L;
      long var6 = var4 ^ 104769192342912L;
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_j.getDouble(var6) / 2.0F + 0.5F, this.c(), this.d());
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            BreezeContext.authSession_c.getColor("drawer.background")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            BreezeContext.authSession_c.getFloat("drawer.border-thickness"),
            BreezeContext.authSession_c.getColor("drawer.border")
         );
      super.processNullable(var1, var2, var3);
   }

   static rip.breeze.client.AnimationTimer getDataBuilder15_j(RenderUtil23 var0) {
      return var0.dataBuilder15_j;
   }

   static {
      long var0 = 41301615558813L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "Ê\u001aG!År¹éÃ$N\u00847B)Æø\u001a\u000e¸°m\u008a/{óR´Y%ÛîÖæ\u001cÉÚ\u0098\u0088\u007f(\u0017 Ýad\u0004ÎT\u0015{\u0088ãö\u0001\u0007¯\u0096æ½\u008eD\u008a\u008bÆÿ\u001e\u001b\u0088Ðäq\u0002V\u001dâ\u0089ÒVø\u00160*ç\u0012\u0004VÓ?\u001f*@½\t&\u0094íoÌ\býi¬\u0017Ôþh(O\u0000C¹\u0006 þ<\f<Cþ¬÷\u0099wï~¬\r\u007fé";
      int var7 = "Ê\u001aG!År¹éÃ$N\u00847B)Æø\u001a\u000e¸°m\u008a/{óR´Y%ÛîÖæ\u001cÉÚ\u0098\u0088\u007f(\u0017 Ýad\u0004ÎT\u0015{\u0088ãö\u0001\u0007¯\u0096æ½\u008eD\u008a\u008bÆÿ\u001e\u001b\u0088Ðäq\u0002V\u001dâ\u0089ÒVø\u00160*ç\u0012\u0004VÓ?\u001f*@½\t&\u0094íoÌ\býi¬\u0017Ôþh(O\u0000C¹\u0006 þ<\f<Cþ¬÷\u0099wï~¬\r\u007fé"
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
                     CONST_M = var4;
                     CONST_N = new String[5];
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

                  var6 = " h9\u0015\u0089Ee\u0093¦fdy\u0015\u0016\u001eæ¥¬ã¡U¼=Î5RrQ\u001dºu\u009d(7\u0093ë]ÕÛq\u0003í\u0087]\u0014\u009e¯\u009dÅ\u0094\u0097N/Å¯\u0010\u0095\u008eõ\u001e\u0081Ö<¼\u008fey2M\u009cûÐO";
                  var7 = " h9\u0015\u0089Ee\u0093¦fdy\u0015\u0016\u001eæ¥¬ã¡U¼=Î5RrQ\u001dºu\u009d(7\u0093ë]ÕÛq\u0003í\u0087]\u0014\u009e¯\u009dÅ\u0094\u0097N/Å¯\u0010\u0095\u008eõ\u001e\u0081Ö<¼\u008fey2M\u009cûÐO"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7652;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_O.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c5", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
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
         throw new RuntimeException("rip/breeze/c5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
