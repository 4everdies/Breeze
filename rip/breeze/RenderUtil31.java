package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil31 extends Util28 {
   private final RenderUtil12 dataBuilder124_j;
   private final int fieldInt_k;
   private final String string_l;
   private final Supplier<Color> supplier_m;
   private String string_n;
   private String string_o;
   private static String[] arr_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public RenderUtil31(String var1, int var2, Supplier<Color> var3) {
      long var4 = 94380035191893L;
      super();
      this.string_o = var1;
      this.fieldInt_k = var2;
      short var10001 = 10660;
      long var10002 = 7767398983114009496L ^ var4;
      this.string_l = "default.text-secondary";
      this.dataBuilder124_j = new RenderUtil12(var1, new LicenseState());
      this.string_n = var1;
      this.supplier_m = var3;
      this.b(this.dataBuilder124_j);
   }

   public RenderUtil31(String var1, int var2, String var3) {
      this.string_o = var1;
      this.fieldInt_k = var2;
      this.string_l = var3;
      this.dataBuilder124_j = new RenderUtil12(var1, new LicenseState());
      this.string_n = var1;
      this.supplier_m = null;
      this.b(this.dataBuilder124_j);
   }

   public void update(String var1) {
      long var2 = 44805807051636L;
      if (!var1.equals(this.string_o)) {
         this.string_o = var1;
         this.dataBuilder124_j.initialize(var1);
         this.calculate();
      }
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.processNullable(var1, var2, var3);
      Color var6 = this.supplier_m != null ? this.supplier_m.get() : BreezeContext.authSession_c.getColor(this.string_l);
      BreezeContext.iRenderer_b.drawText(this.string_n, this.a, this.b, var6, EnumType32.SOURCE_SANS, this.fieldInt_k);
   }

   public boolean checkCondition(UIPanel var1) {
      long var2 = 94253235202450L;
      return !this.string_o.equals(this.string_n);
   }

   public void calculate() {
      long var1 = 62740630596709L;
      int var10000 = RenderUtil9.getValue_2();
      super.processNullable_4();
      int var3 = var10000;
      this.dataBuilder124_j.a(this.a, this.b - 2.0F, this.c, this.fieldInt_k + 4);
      float var4 = BreezeContext.iRenderer_b.measureText(this.string_o, EnumType32.SOURCE_SANS, this.fieldInt_k);
      if (var4 > this.c) {
         this.string_n = this.string_o;

         while (var4 > this.c && !this.string_n.isEmpty()) {
            this.string_n = this.string_n.substring(0, this.string_n.length() - 1);
            var4 = BreezeContext.iRenderer_b
               .measureText(this.string_n + "...", EnumType32.SOURCE_SANS, this.fieldInt_k);
            if (var3 != 0) {
               break;
            }
         }

         this.string_n = this.string_n + "...";
         if (var3 == 0) {
            return;
         }
      }

      this.string_n = this.string_o;
   }

   public static void initialize(String[] var0) {
      arr_p = var0;
   }

   public static String[] decrypt() {
      return arr_p;
   }

   static {
      long var0 = 49688149445361L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "W\u0080)*<Ãã·õwý\u0013p\u0093\u0089\u0011\u0010ÍÄ/ÛS·\u0007R\u009dù\u0013\u0080%;Ä\u0016(da}\u0017ë£\u009dáÉÓoBw\u0013\u007fÄ/ôóvçì'×~¶¨N\u009d¤\u000eWVù\u0097î£räÉ";
      int var7 = "W\u0080)*<Ãã·õwý\u0013p\u0093\u0089\u0011\u0010ÍÄ/ÛS·\u0007R\u009dù\u0013\u0080%;Ä\u0016(da}\u0017ë£\u009dáÉÓoBw\u0013\u007fÄ/ôóvçì'×~¶¨N\u009d¤\u000eWVù\u0097î£räÉ"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_R = var4;
            CONST_S = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13931;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cX", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/cX" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
