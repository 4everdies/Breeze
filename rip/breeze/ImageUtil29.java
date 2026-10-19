package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public final class ImageUtil29<T extends Enum<T>> extends RenderUtil43<T[]> {
   private final RenderUtil37<T> dataBuilder58_n;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o;
   private final rip.breeze.client.AnimationTimer dataBuilder15_p;
   private static final int CONST_Q;
   private LicenseState licenseState_r;
   private LicenseState licenseState_s;
   private final float noneSetting;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public ImageUtil29(GenericSetting<?> var1) {
      long var2 = 70742077717646L;
      super(var1);
      this.dataBuilder15_o = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      this.dataBuilder15_p = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.licenseState_r = new LicenseState();
      this.licenseState_s = new LicenseState();
      String var10000 = RenderUtil37.getString();
      Class var4 = this.k.object_d.getClass().getComponentType();
      Enum[] var5 = var4.asSubclass(Enum.class).getEnumConstants();
      String var6 = var10000;
      ArrayList var7 = new ArrayList();
      short var10001 = 25224;
      long var10002 = 7270574576138991988L ^ var2;
      float var8 = BreezeContext.iRenderer_b.measureText("None", EnumType32.SOURCE_SANS, 22.0F);

      for (Enum var12 : var5) {
         var8 = Math.max(var8, BreezeContext.iRenderer_b.measureText(RenderUtil27.CONST_G.apply(var12), EnumType32.SOURCE_SANS, 22.0F));
         if (this.k.isValid_2((T)this.toArray(var4, (T)var12))) {
            var7.add(var12);
         }

         if (var6 != null) {
            break;
         }
      }

      this.noneSetting = Math.max(220.0F, var8 + 28.0F);
      this.dataBuilder58_n = new RenderUtil37<>(this.dataBuilder15_o, this.k, var7);
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      super.calculate(var1, var2, var3);
      String var10000 = RenderUtil37.getString();
      this.dataBuilder15_p.toggle(var6, this.licenseState_r.isValid(var1, var2));
      String var12 = var10000;
      Color var13 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.text-tertiary"),
         BreezeContext.authSession_c.getColor("default.text-primary"),
         (float)Math.max(this.dataBuilder15_o.getDouble(var10), this.dataBuilder15_p.getDouble(var10))
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_r,
            BreezeContext.authSession_c.getFloat("button.corner-radius"),
            RenderUtil1.clamp(
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.layer-one"),
                  BreezeContext.authSession_c.getColor("default.hovered"),
                  (float)this.dataBuilder15_p.getDouble(var10)
               ),
               BreezeContext.authSession_c.getColor("default.accent"),
               (float)this.dataBuilder15_o.calculateDouble(var8)
            )
         );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(this.licenseState_s, 4.0F, BreezeContext.authSession_c.getColor("default.accent"));
      BreezeContext.iRenderer_b
         .drawGlow(
            this.licenseState_r.calculateFloat() - 15.0F,
            this.licenseState_r.calculateFloat_4(),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            (float)Math.max(1.0, this.dataBuilder15_o.getDouble(var10))
         );
      String var14 = this.buildString();
      BreezeContext.iRenderer_b.drawText(var14, this.licenseState_r.fieldFloat_a + 10.0F, this.b + 12.0F, var13, EnumType32.SOURCE_SANS, 22.0F);
      if (!this.dataBuilder15_o.isBool_e() && this.dataBuilder58_n.f && this.dataBuilder15_o.calculateDouble(var8) == 0.0) {
         this.dataBuilder58_n.processAll();
      }

      if (var12 != null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   private String buildString() {
      long var1 = 46910999555807L;
      String var10000 = RenderUtil37.getString();
      Enum[] var3 = (Enum[])this.k().getObject_m();
      String var4 = var10000;
      if (var3 != null && var3.length != 0) {
         if (var3.length > 2) {
            return var3.length + " selected";
         }

         StringBuilder var5 = new StringBuilder();
         int var6 = 0;

         while (var6 < var3.length) {
            if (var6 > 0) {
               var5.append(",");
            }

            var5.append(RenderUtil27.CONST_G.apply(var3[var6]));
            var6++;
            if (var4 != null) {
               break;
            }
         }

         return var5.toString();
      } else {
         return "None";
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      if (this.licenseState_r.isValid(var1, var2)) {
         this.dataBuilder15_o.toggle(var6, !this.dataBuilder15_o.isBool_e());
         if (this.dataBuilder15_o.isBool_e()) {
            BreezeContext.guiPanelSettings_f.update(this.dataBuilder58_n);
         }

         return true;
      } else {
         return false;
      }
   }

   private T[] toArray(Class<?> var1, T var2) {
      Enum[] var3 = (Enum[])Array.newInstance(var1, 1);
      var3[0] = var2;
      return (T[])var3;
   }

   public void calculate() {
      this.licenseState_r = new LicenseState(this.a() - this.noneSetting - 10.0F, this.b + 5.0F, this.noneSetting, 35.0F);
      this.licenseState_s = new LicenseState(
         this.licenseState_r.calculateFloat() - 25.0F, this.licenseState_r.fieldFloat_b + 5.0F, 20.0F, this.licenseState_r.fieldFloat_d - 10.0F
      );
      this.dataBuilder58_n.calculate_2(this.licenseState_r.fieldFloat_a, this.licenseState_r.calculateFloat_2() + 10.0F, this.licenseState_r.fieldFloat_c, 0.0F);
      this.dataBuilder58_n.licenseState_k = this.licenseState_r;
      super.calculate_2();
   }

   public void decrypt(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public void initialize() {
      super.h();
      this.dataBuilder58_n.processAll();
   }

   public boolean checkCondition_2(float var1) {
      long var2 = 69880200093113L;
      return BreezeContext.iKeybindSettings_e.isToggle()
         ? true
         : BreezeContext.iRenderer_b.measureText(this.k.string_b, EnumType32.SOURCE_SANS, 22.0F) + this.noneSetting + 30.0F > var1;
   }

   static {
      long var0 = 786343776486L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "«\fÈ86H\u0095\u0003Z£+no~ü*\u0018rÞ\u0099Âðÿ\u0002'MÆmèÖ\u0091\u009e\u008f\u000e\u0004°¤hÂOð(øÝ ö/¯kúV\u0004\u009aà¾÷\"/ýÚ\u001aàl\u000eIXþé \u0085\u009dÜh\u008fü\u009dHvÏªÛC\u00188ÉñµTØO\u0085¸¿¬\u009f;\rØ¨\"¦VõÐbÌz(éØ\u001a\u0010° ä'¿t\u008f\u001fRß\u001d\u0089z\u008aô&Fyç~õ\u0012¥0ëç¤Ð\u008bÍ\u0014-\u008bGj\u0097\u0010/[ú\u001a¥\u0007\u0097½¥D\u000fð¼üèY\u0010Ì#\\`û\u0090«¥>Ý½É«\u007fgA \u0093Ó\u0091?\u0017\u0019ò¾:Tù\u0095\tâ\u009dô'*\u009d¦üÏäó§\u000e\u0014\u0083Ö\u0012¡Í\u0018\u0098õ\u0001ùým/\u0090Êi«W:ïò\u00ad\u0082:,FvÆ\u0013û(AÒÌ\u008b.õ^\u0099\u00927µgü&!H\rüü¾©\u008aõC\u0004Jsu\u0002SÕ´\u0091£\u001bÒþ\u0011\u0097~";
      int var7 = "«\fÈ86H\u0095\u0003Z£+no~ü*\u0018rÞ\u0099Âðÿ\u0002'MÆmèÖ\u0091\u009e\u008f\u000e\u0004°¤hÂOð(øÝ ö/¯kúV\u0004\u009aà¾÷\"/ýÚ\u001aàl\u000eIXþé \u0085\u009dÜh\u008fü\u009dHvÏªÛC\u00188ÉñµTØO\u0085¸¿¬\u009f;\rØ¨\"¦VõÐbÌz(éØ\u001a\u0010° ä'¿t\u008f\u001fRß\u001d\u0089z\u008aô&Fyç~õ\u0012¥0ëç¤Ð\u008bÍ\u0014-\u008bGj\u0097\u0010/[ú\u001a¥\u0007\u0097½¥D\u000fð¼üèY\u0010Ì#\\`û\u0090«¥>Ý½É«\u007fgA \u0093Ó\u0091?\u0017\u0019ò¾:Tù\u0095\tâ\u009dô'*\u009d¦üÏäó§\u000e\u0014\u0083Ö\u0012¡Í\u0018\u0098õ\u0001ùým/\u0090Êi«W:ïò\u00ad\u0082:,FvÆ\u0013û(AÒÌ\u008b.õ^\u0099\u00927µgü&!H\rüü¾©\u008aõC\u0004Jsu\u0002SÕ´\u0091£\u001bÒþ\u0011\u0097~"
         .length();
      char var8 = 16;
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var19 += var8) >= var7) {
                     CONST_V = var4;
                     CONST_W = new String[12];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -787865898397949773L;
                     byte[] var17 = var11.doFinal(
                        new byte[]{
                           (byte)(var15 >>> 56),
                           (byte)(var15 >>> 48),
                           (byte)(var15 >>> 40),
                           (byte)(var15 >>> 32),
                           (byte)(var15 >>> 24),
                           (byte)(var15 >>> 16),
                           (byte)(var15 >>> 8),
                           (byte)var15
                        }
                     );
                     long var32 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     var10001 = -1;
                     long var13 = var32;
                     CONST_Q = (int)var13;
                     return;
                  }

                  var8 = var6.charAt(var19);
                  break;
               default:
                  var4[var5++] = var28;
                  if ((var19 += var8) < var7) {
                     var8 = var6.charAt(var19);
                     continue label37;
                  }

                  var6 = "ö§¸eÿ\u0006ª\u009b^\u000b{\u009bz\u0002,\u008f\u008a°\"'È*öÊöñº)\u0086ÓW\u0010e\u0088Æ}\u0001\u008f\u0006?(»ã\u0084=ýW]\u0013þ»Fåsf¨»öÚÚÔôþ8º^ÄX-\u001f%&í\u0089°²]êÝ\u001e)";
                  var7 = "ö§¸eÿ\u0006ª\u009b^\u000b{\u009bz\u0002,\u008f\u008a°\"'È*öÊöñº)\u0086ÓW\u0010e\u0088Æ}\u0001\u008f\u0006?(»ã\u0084=ýW]\u0013þ»Fåsf¨»öÚÚÔôþ8º^ÄX-\u001f%&í\u0089°²]êÝ\u001e)"
                     .length();
                  var8 = '(';
                  var19 = -1;
            }

            var20 = var6.substring(++var19, var19 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26487;
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
            throw new RuntimeException("rip/breeze/dW", var10);
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
         CONST_W[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/dW" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
