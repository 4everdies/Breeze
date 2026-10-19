package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import rip.breeze.StringDecryptor;

public final class RenderUtil25 {
   private static final int CONST_A;
   private static final int CONST_B;
   private static final float CONST_C = 0.735F;
   private static final Map<String, MathUtil10> CONST_D;
   private static final List<RenderUtil8_x> CONST_E;
   private static volatile boolean fieldBool_f;

   private RenderUtil25() {
   }

   public static MathUtil2 clamp(EnumType21 var0, float var1) {
      processAll_2();
      EnumType28 var2 = getEnum_PRODUCT(var0);
      float var3 = var2.string_a == null ? var1 * 0.735F : var1;
      int var4 = calculate(var3);
      String var5 = var2.name() + "@" + var4;
      MathUtil10 var6 = CONST_D.get(var5);
      if (var6 == null) {
         var6 = var2.string_a == null ? MathUtil10.clamp(var4) : MathUtil10.getDataBuilder46_2(var2.string_a, var4, true);
         CONST_D.put(var5, var6);
      }

      float var7 = var3 / Math.max(1.0F, var6.getValue());
      return new MathUtil2(var6, var7, null);
   }

   private static EnumType28 getEnum_PRODUCT(EnumType21 var0) {
      if (var0 == EnumType21.INGAME) {
         return EnumType28.INGAME;
      }

      switch (Util52.CONST_A[BreezeClient.getKeybindSettings().getEnum_INGAME().ordinal()]) {
         case 1:
            return EnumType28.PRODUCT;
         case 2:
            return EnumType28.PRODUCT_THIN;
         case 3:
         default:
            return EnumType28.INGAME;
      }
   }

   private static int calculate(float var0) {
      int var1 = Math.round(var0 / 2.0F) * 2;
      if (var1 < 10) {
         var1 = 10;
      }

      if (var1 > 48) {
         var1 = 48;
      }

      return var1;
   }

   public static void initialize() {
      processAll_2();
      CONST_E.clear();
   }

   public static void processNullable(MathUtil2 var0, float var1, float var2, String var3, Color var4, boolean var5) {
      if (var0 != null && var3 != null && !var3.isEmpty()) {
         CONST_E.add(new RenderUtil8_x(var0, var1, var2, var3, var4, var5));
      }
   }

   public static void processAll() {
      if (!CONST_E.isEmpty()) {
         LinkedHashMap var0 = new LinkedHashMap();

         for (RenderUtil8_x var2 : CONST_E) {
            var0.computeIfAbsent(MathUtil2.getDataBuilder46_a(var2.clientUtil91_a), RenderUtil25::lambda$end_Inner0).add(var2);
         }

         for (Entry var7 : var0.entrySet()) {
            MathUtil10 var3 = (MathUtil10)var7.getKey();
            var3.processAll();

            for (RenderUtil8_x var5 : (List)var7.getValue()) {
               var3.render();
               GL11.glTranslatef(var5.fieldFloat_b, var5.fieldFloat_c, 0.0F);
               GL11.glScalef(MathUtil2.getFloat_b(var5.clientUtil91_a), MathUtil2.getFloat_b(var5.clientUtil91_a), 1.0F);
               var3.calculate(0.0F, 0.0F, var5.string_d, var5.color_e, var5.fieldBool_f);
               var3.render_1();
            }

            var3.toggle();
         }

         CONST_E.clear();
      }
   }

   public static void toggle() {
      fieldBool_f = true;
   }

   public static void toggle_2() {
      for (MathUtil10 var1 : CONST_D.values()) {
         var1.toggle_2();
      }

      CONST_D.clear();
      CONST_E.clear();
      fieldBool_f = false;
   }

   private static void processAll_2() {
      if (fieldBool_f) {
         fieldBool_f = false;

         for (MathUtil10 var1 : CONST_D.values()) {
            var1.toggle_2();
         }

         CONST_D.clear();
         CONST_E.clear();
      }
   }

   private static List lambda$end_Inner0(MathUtil10 var0) {
      return new ArrayList<>();
   }

   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-1409531395739889885L, -8456417613790600891L, MethodHandles.lookup().lookupClass())
            .decryptKey(259133392681613L)
         ^ 139698233222739L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "\u0007uMâ¿¿b'®4\u0099¯\u001f\fB/";
      int var7 = "\u0007uMâ¿¿b'®4\u0099¯\u001f\fB/".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_B = (int)var4[1];
      CONST_A = (int)var4[0];
      CONST_D = new LinkedHashMap<>();
      CONST_E = new ArrayList<>();
      fieldBool_f = false;
   }
}
