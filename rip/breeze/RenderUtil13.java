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

public class RenderUtil13 extends UIPanel {
   private final String string_h;
   private final int fieldInt_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static String[] arr_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public RenderUtil13(String var1, int var2, int var3) {
      this.string_h = var1;
      this.fieldInt_i = var2;
      this.c = var3;
      this.d = var3;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      boolean var10 = false;
      if (this.dataBuilder15_j.calculateDouble(var6) != 0.0) {
         var10 = true;
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_j.getDouble(var8) * 2.0)));
      }

      if (this.string_h == null
         || this.string_h.isEmpty()
         || !BreezeContext.iRenderer_b.drawTextInputSelected(this.string_h, this.a, this.b, this.c, this.d, this.c / 2.0F, false)) {
         BreezeContext.iRenderer_b
            .drawTextAt(
               "account_circle",
               this.a,
               this.b,
               this.c / 40.0F,
               BreezeContext.authSession_c.getColor("cloud.profile-picture")
            );
      }

      if (var10) {
         BreezeContext.iRenderer_b.frameEnd();
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      if (Math.hypot(var1 - this.c(), var2 - this.d()) < this.c / 2.0F && var3 == 0) {
         this.dataBuilder15_j.toggle(var6, true);
         return true;
      } else {
         return super.isValid(var1, var2, var3);
      }
   }

   public void decrypt(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.a(var1, var2) && this.dataBuilder15_j.isBool_e() && var3 == 0) {
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$mouseReleased_Inner0);
      }

      if (var3 == 0) {
         this.dataBuilder15_j.toggle(var6, false);
      }

      super.noOp(var1, var2, var3);
   }

   private void lambda$mouseReleased_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new RenderUtil4(this.fieldInt_i));
   }

   public static void initialize(String[] var0) {
      arr_l = var0;
   }

   public static String[] decrypt_1() {
      return arr_l;
   }

   static {
      initialize(null);
      long var0 = 115850506236652L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = ":Ó^%\r\u0091ràÊ]Ð\u0094\u0081º:¾É#\u0004x\u0098²\u0099ñcê\u0081\u009bS\u008f\u008djø\u00868¬&\u0013£÷\u0018+\u0099½\u009a\u001b!\u0093\u008c\u0014üYÖßwq-OÌlk³Þb\u0098";
      int var7 = ":Ó^%\r\u0091ràÊ]Ð\u0094\u0081º:¾É#\u0004x\u0098²\u0099ñcê\u0081\u009bS\u008f\u008djø\u00868¬&\u0013£÷\u0018+\u0099½\u009a\u001b!\u0093\u008c\u0014üYÖßwq-OÌlk³Þb\u0098"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_N = var4;
            CONST_O = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7312;
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
            throw new RuntimeException("rip/breeze/en", var10);
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
         throw new RuntimeException("rip/breeze/en" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
