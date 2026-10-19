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
import rip.breeze.client.UserTheme;

public final class RotationUtil8 {
   private final IBreezeInterface2 iBreezeInterface2_a;
   private double double_b;
   private double double_c;
   public final rip.breeze.client.AnimationTimer dataBuilder15_d = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.LINEAR);
   public final rip.breeze.client.AnimationTimer dataBuilder15_e = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.LINEAR);
   private AimYawMode2 aimYawMode2_f = AimYawMode2.CENTER;
   private AimYawMode aimYawMode_g = AimYawMode.CENTER;
   private static String string_h;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   public RotationUtil8(IBreezeInterface2 var1) {
      this.iBreezeInterface2_a = var1;
      this.double_b = 0.052083333333333336;
      this.double_c = 0.052083333333333336;
   }

   public RotationUtil8(IBreezeInterface2 var1, AimYawMode var2, AimYawMode2 var3, double var4, double var6) {
      long var8 = 35494020550899L;
      BreezeModule.decrypt();
      super();
      this.dataBuilder15_d = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_e = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.LINEAR);
      this.aimYawMode2_f = AimYawMode2.CENTER;
      this.aimYawMode_g = AimYawMode.CENTER;
      this.iBreezeInterface2_a = var1;
      this.aimYawMode_g = var2;
      this.aimYawMode2_f = var3;
      this.double_b = var4 / 1920.0;
      this.double_c = var6 / 1920.0;
      if (!LicenseState.isValid_2()) {
         BreezeModule.initialize_2(new int[1]);
      }
   }

   private static double calculateDouble(int var0, int var1) {
      long var2 = 25970984506524L;
      return var1 <= 0 ? 0.0 : (double)var0 / var1;
   }

   private static int calculate(double var0, int var2) {
      return (int)Math.round(var0 * var2);
   }

   public void clamp(int var1, int var2) {
      long var3 = 108005146923896L;
      int var5 = this.iBreezeInterface2_a.getFirst();
      int[] var10000 = BreezeModule.decrypt();
      int var6 = this.iBreezeInterface2_a.getSecond();
      int var7 = BreezeContext.settingGroup_d.getOrder();
      int[] var8 = var10000;
      int var9 = BreezeContext.settingGroup_d.getCount();
      int var10 = Math.max(0, var7 - var5);
      int var11 = Math.max(0, var9 - var6);
      int var12 = MathUtil1.clamp_2(var1, 0, var10);
      int var13 = MathUtil1.clamp_2(var2, 0, var11);
      int var14 = (int)(var7 * 0.2F);
      int var15 = (int)(var7 * 0.8F);
      int var16 = (int)(var9 * 0.2F);
      int var17 = (int)(var9 * 0.8F);
      boolean var18 = var12 < var14;
      boolean var19 = var12 + var5 > var15;
      boolean var20 = var13 < var16;
      boolean var21 = var13 + var6 > var17;
      if (var18 && var19) {
         int var22 = var12;
         int var23 = var7 - (var12 + var5);
         var18 = var22 <= var23;
         var19 = !var18;
      }

      if (var20 && var21) {
         int var35 = var13;
         int var37 = var9 - (var13 + var6);
         var20 = var35 <= var37;
         var21 = !var20;
      }

      label115: {
         if (var18) {
            this.aimYawMode_g = AimYawMode.LEFT;
            if (var8 == null) {
               break label115;
            }

            LicenseState.toggle(LicenseState.isValid_2());
         }

         if (var19) {
            this.aimYawMode_g = AimYawMode.RIGHT;
            if (var8 == null) {
               break label115;
            }
         }

         this.aimYawMode_g = AimYawMode.CENTER;
      }

      label117: {
         if (var20) {
            this.aimYawMode2_f = AimYawMode2.TOP;
            if (var8 == null) {
               break label117;
            }
         }

         if (var21) {
            this.aimYawMode2_f = AimYawMode2.BOTTOM;
            if (var8 == null) {
               break label117;
            }
         }

         this.aimYawMode2_f = AimYawMode2.CENTER;
      }

      int var36 = var10 / 2;
      int var38 = var11 / 2;
      switch (Util24.CONST_A[this.aimYawMode_g.ordinal()]) {
         case 1:
            this.double_b = calculateDouble(var12, var7);
            this.double_b = MathUtil1.clamp_3(this.double_b, 0.0, 1.0);
            if (var8 == null) {
               break;
            }
         case 2:
            int var24 = var10 - var12;
            this.double_b = calculateDouble(var24, var7);
            this.double_b = MathUtil1.clamp_3(this.double_b, 0.0, 1.0);
            if (var8 == null) {
               break;
            }
         case 3:
            int var39 = var12 - var36;
            this.double_b = calculateDouble(var39, var7);
            int var25 = var36;
            int var26 = -(var10 - var36);
            double var27 = calculateDouble(var26, var7);
            double var29 = calculateDouble(var25, var7);
            this.double_b = MathUtil1.clamp_3(this.double_b, var27, var29);
      }

      switch (Util24.CONST_B[this.aimYawMode2_f.ordinal()]) {
         case 1:
            this.double_c = calculateDouble(var13, var7);
            double var31 = calculateDouble(var11, var7);
            this.double_c = MathUtil1.clamp_3(this.double_c, 0.0, var31);
            if (var8 == null) {
               break;
            }
         case 2:
            int var40 = var11 - var13;
            this.double_c = calculateDouble(var40, var7);
            double var33 = calculateDouble(var11, var7);
            this.double_c = MathUtil1.clamp_3(this.double_c, 0.0, var33);
            if (var8 == null) {
               break;
            }
         case 3:
            int var41 = var13 - var38;
            this.double_c = calculateDouble(var41, var7);
            int var42 = var38;
            int var43 = -(var11 - var38);
            double var44 = calculateDouble(var43, var7);
            double var45 = calculateDouble(var42, var7);
            this.double_c = MathUtil1.clamp_3(this.double_c, var44, var45);
      }
   }

   public int clamp_2() {
      long var1 = 116908166742158L;
      int var3 = this.iBreezeInterface2_a.getFirst();
      int var4 = BreezeContext.settingGroup_d.getOrder();
      int var5 = Math.max(0, var4 - var3);
      switch (Util24.CONST_A[this.aimYawMode_g.ordinal()]) {
         case 1:
            int var10 = calculate(this.double_b, var4);
            return MathUtil1.clamp_2(var10, 0, var5);
         case 2:
            int var9 = calculate(this.double_b, var4);
            int var11 = var5 - var9;
            return MathUtil1.clamp_2(var11, 0, var5);
         case 3:
         default:
            int var6 = var5 / 2;
            int var7 = calculate(this.double_b, var4);
            int var8 = var6 + var7;
            return MathUtil1.clamp_2(var8, 0, var5);
      }
   }

   public int clamp_3() {
      long var1 = 31108540284091L;
      int var3 = this.iBreezeInterface2_a.getSecond();
      int var4 = BreezeContext.settingGroup_d.getOrder();
      int var5 = BreezeContext.settingGroup_d.getCount();
      int var6 = Math.max(0, var5 - var3);
      switch (Util24.CONST_B[this.aimYawMode2_f.ordinal()]) {
         case 1:
            int var11 = calculate(this.double_c, var4);
            return MathUtil1.clamp_2(var11, 0, var6);
         case 2:
            int var10 = calculate(this.double_c, var4);
            int var12 = var6 - var10;
            return MathUtil1.clamp_2(var12, 0, var6);
         case 3:
         default:
            int var7 = var6 / 2;
            int var8 = calculate(this.double_c, var4);
            int var9 = var7 + var8;
            return MathUtil1.clamp_2(var9, 0, var6);
      }
   }

   public boolean isValid(float var1, float var2) {
      long var3 = 9757784658721L;
      int var5 = this.clamp_2();
      int var6 = this.clamp_3();
      int var7 = this.iBreezeInterface2_a.getFirst();
      int var8 = this.iBreezeInterface2_a.getSecond();
      return var1 > var5 && var1 < var5 + var7 && var2 > var6 && var2 < var6 + var8;
   }

   public float calculateFloat() {
      long var1 = 129716873445111L;
      long var3 = var1 ^ 78219958057736L;
      return (float)(1.0 - this.dataBuilder15_d.getDouble(var3) * 0.15F - this.dataBuilder15_e.getDouble(var3) * 0.15F);
   }

   public AimYawMode2 getAimYawMode2_f() {
      return this.aimYawMode2_f;
   }

   public AimYawMode getAimYawMode_g() {
      return this.aimYawMode_g;
   }

   public rip.breeze.client.PlayerUtil8 getDataBuilder2() {
      long var1 = 15197380202159L;
      long var3 = var1 ^ 80700311431447L;
      long var5 = var1 ^ 102562317981632L;
      UserTheme var7 = new UserTheme();
      short var10002 = 7812;
      long var10003 = 1838639056299582289L ^ var1;
      var7.runCloudJob(var3, "xvw", this.double_b);
      var10002 = 4634;
      var10003 = 5447349841416155086L ^ var1;
      var7.runCloudJob(var3, "yvw", this.double_c);
      short var10001 = 4580;
      long var10 = 6136800038573567028L ^ var1;
      var7.update("xAlignment", this.aimYawMode_g.name(), var5);
      var10001 = 30890;
      long var11 = 1343080533397800313L ^ var1;
      var7.update("yAlignment", this.aimYawMode2_f.name(), var5);
      return var7;
   }

   public void update(rip.breeze.client.PlayerUtil8 var1) {
      long var2 = 42693990220050L;
      long var10001 = var2 ^ 58800253976149L;
      int var4 = (int)((var2 ^ 58800253976149L) >>> 48);
      int var5 = (int)((var2 ^ 58800253976149L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 33905537152547L;
      long var9 = var2 ^ 13139623288400L;
      if (var1.isValid_2()) {
         UserTheme var11 = var1.getUserTheme(var7);
         if (var11.isValid("xvw")) {
            this.double_b = var11.getDataBuilder2_2("xvw").getDouble(var9);
         }

         if (var11.isValid("yvw")) {
            this.double_c = var11.getDataBuilder2_2("yvw").getDouble(var9);
         }

         if (var11.isValid("xAlignment")) {
            this.aimYawMode_g = AimYawMode.valueOf(
               var11.getDataBuilder2_2("xAlignment").buildString((char)var4, var5, (short)var6)
            );
         }

         if (var11.isValid("yAlignment")) {
            this.aimYawMode2_f = AimYawMode2.valueOf(
               var11.getDataBuilder2_2("yAlignment").buildString((char)var4, var5, (short)var6)
            );
         }
      }
   }

   public static void initialize(String var0) {
      string_h = var0;
   }

   public static String getString() {
      return string_h;
   }

   static {
      long var0 = 104876643556209L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "\u001b\u0095N\u0081[u\u0091\u0080>\u0095Ö\u0097\u001e\u00ad\\V\u009dSã\u0019¾K(<\u0010ô=Âobðù\u0090Ë\u0001\u001d\u009bÖ¦à\u0092\u0010}#\n\u001a\u0082l\u0085\\Vò\t\u001a°yYÙ YMÍx×±·jÖÂ\u0089Ùn\u009aö¥^\u0098\u0001\u0094Ñoí\u009aÇ'!\u009aIù@\u008f d\u008b\u0018\u0000\u0003\u008b\u0003jo6þ\u0096\u0091\u0014ÕG\bB\\ñ[Ùn¤X!\u0016mz\u0013\bk\u0018`\u001e'\u0001 RêÅ\u001eG\u0002}Ò,ºÃï\u009c¶\u009fWù\u008dY";
      int var7 = "\u001b\u0095N\u0081[u\u0091\u0080>\u0095Ö\u0097\u001e\u00ad\\V\u009dSã\u0019¾K(<\u0010ô=Âobðù\u0090Ë\u0001\u001d\u009bÖ¦à\u0092\u0010}#\n\u001a\u0082l\u0085\\Vò\t\u001a°yYÙ YMÍx×±·jÖÂ\u0089Ùn\u009aö¥^\u0098\u0001\u0094Ñoí\u009aÇ'!\u009aIù@\u008f d\u008b\u0018\u0000\u0003\u008b\u0003jo6þ\u0096\u0091\u0014ÕG\bB\\ñ[Ùn¤X!\u0016mz\u0013\bk\u0018`\u001e'\u0001 RêÅ\u001eG\u0002}Ò,ºÃï\u009c¶\u009fWù\u008dY"
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
                     CONST_K = new String[8];
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

                  var6 = "Ø\u009eOb\u0004ó$-g\u0098 $h ªN\u0010°¤úIëÏ«ç\u0002Ù¯¬i\u001dîÇ";
                  var7 = "Ø\u009eOb\u0004ó$-g\u0098 $h ªN\u0010°¤úIëÏ«ç\u0002Ù¯¬i\u001dîÇ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13180;
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
            throw new RuntimeException("rip/breeze/aA", var10);
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
         throw new RuntimeException("rip/breeze/aA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
