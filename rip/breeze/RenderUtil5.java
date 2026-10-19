package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil5 extends ConfigUtil2_x {
   protected final MathUtil8 dataBuilder33_l;
   private rip.breeze.client.AnimationTimer dataBuilder15_m = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private UIPanel breezeUtil78_n;
   protected int fieldInt_o;
   protected int fieldInt_p;
   private static int[] arr_q;
   private static final String[] CONST_L;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil5() {
      super(true);
      this.dataBuilder33_l = new MathUtil8(null);
      this.dataBuilder33_l.fieldBool_j = false;
      this.dataBuilder33_l.toggle_3(true);
      this.dataBuilder33_l.initialize_4(15);
      this.dataBuilder33_l.setIndex(5);
      this.b(this.dataBuilder33_l);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      this.f = true;
      int[] var10000 = decrypt();
      Iterator var8 = this.j().iterator();
      int[] var9 = var10000;

      while (var8.hasNext()) {
         label26: {
            UIPanel var10 = (UIPanel)var8.next();
            if (this.isValid(var10)) {
               if (var10 == this.breezeUtil78_n) {
                  BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder15_m.getDouble(var6));
               }

               var10.toggle(var1, var2, var3);
               if (var10 != this.breezeUtil78_n) {
                  break label26;
               }

               BreezeContext.iRenderer_b.setGlobalAlpha(1.0F);
               if (var9 != null) {
                  break label26;
               }
            }

            if (var10.fieldBool_f) {
               var10.toggle_2();
            }
         }

         if (var9 == null) {
            break;
         }
      }

      BreezeContext.iRenderer_b
         .drawRect(
            this.dataBuilder33_l.a() - BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
            this.b,
            BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
            this.d,
            BreezeContext.authSession_c.getColor("panel.separator")
         );
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      super.g();
      this.dataBuilder33_l.a(this.a, this.b + this.fieldInt_o, 250.0F, this.d - this.fieldInt_o - this.fieldInt_p);
      if (this.breezeUtil78_n != null) {
         this.breezeUtil78_n.drawColoredQuad(this.a + 250.0F, this.b, this.c - 250.0F, this.d);
      }
   }

   public void calculate_3(UIPanel var1) {
      long var2 = 86993477501671L;
      long var4 = var2 ^ 73943049948112L;
      if (var1 != this.breezeUtil78_n) {
         this.dataBuilder15_m = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.LINEAR);
         this.dataBuilder15_m.toggle(var4, true);
         if (this.breezeUtil78_n != null) {
            this.c(this.breezeUtil78_n);
            this.breezeUtil78_n.toggle_2();
         }

         this.breezeUtil78_n = var1;
         this.breezeUtil78_n.drawColoredQuad(this.a + 250.0F, this.b, this.c - 250.0F, this.d);
         this.b(this.breezeUtil78_n);
      }
   }

   public UIPanel getBreezeUtil78_n() {
      return this.breezeUtil78_n;
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   public static void initialize(int[] var0) {
      arr_q = var0;
   }

   public static int[] decrypt() {
      return arr_q;
   }

   static {
      int[] var10000 = new int[3];
      long var0 = 76550569623664L;
      initialize(var10000);
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "MBÜè\u001b\në]q©Fiý`Cc¡õ\u0015ý8Ï¯ß¦\u0086c)lKm¿\u0015\u009e%\t\u0086uÌSPXµ\u0097þ¨\u0012# \u001dÕá\u0016´fè!¨í¾¬ä\u0087V\u0081$ë\u0007$Ø0ÙPzÐNø)è¬\u00848\u001dÑ\u007fs\u0011\u0092\u0094KÖÉ\u0080eÂ\nz,¦\u008a_&Å\u008c&ÆO\u008f\u0090(~ \u007f\u009c:ó\u0014É¨¿\u0085öêa#\u001d]Ñõ¾±\u0093v\u001eàf\u0087ý";
      int var7 = "MBÜè\u001b\në]q©Fiý`Cc¡õ\u0015ý8Ï¯ß¦\u0086c)lKm¿\u0015\u009e%\t\u0086uÌSPXµ\u0097þ¨\u0012# \u001dÕá\u0016´fè!¨í¾¬ä\u0087V\u0081$ë\u0007$Ø0ÙPzÐNø)è¬\u00848\u001dÑ\u007fs\u0011\u0092\u0094KÖÉ\u0080eÂ\nz,¦\u008a_&Å\u008c&ÆO\u008f\u0090(~ \u007f\u009c:ó\u0014É¨¿\u0085öêa#\u001d]Ñõ¾±\u0093v\u001eàf\u0087ý"
         .length();
      char var8 = '0';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_L = var4;
            CONST_N = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10581;
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
            throw new RuntimeException("rip/breeze/dy", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
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
         throw new RuntimeException("rip/breeze/dy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
