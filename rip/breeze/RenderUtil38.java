package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RenderUtil38<T extends Enum<T>> extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h;
   private final GenericSetting<T> dataBuilder54_i;
   private final List<ImageUtil25<T>> list_j;
   public LicenseState licenseState_k;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil38(rip.breeze.client.AnimationTimer var1, GenericSetting<T> var2, List<T> var3) {
      long var4 = 124963473411229L;
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.dataBuilder15_h = var1;
      String var10000 = RenderUtil39.getString();
      this.list_j = new ArrayList<>();
      String var6 = var10000;

      for (Enum var8 : var3) {
         this.list_j.add(new ImageUtil25<>(RenderUtil27.CONST_G.apply(var8), (T)var8, var8 == var2.getObject_m()));
         if (var6 != null) {
            break;
         }
      }

      this.dataBuilder54_i = var2;
   }

   public void processNullable(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      BreezeContext.iRenderer_b.frameBegin();
      String var10000 = RenderUtil39.getString();
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_h.getDouble(var6), this.c(), this.d());
      String var8 = var10000;
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

      for (ImageUtil25 var10 : this.list_j) {
         var10.calculate(var1, var2, var3);
         if (var8 != null) {
            break;
         }
      }

      BreezeContext.iRenderer_b.frameEnd();
   }

   public void calculate() {
      long var1 = 62740630596709L;
      String var10000 = RenderUtil39.getString();
      float var3 = 5.0F;
      Iterator var4 = this.list_j.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         ImageUtil25 var6 = (ImageUtil25)var4.next();
         var6.a(this.a + 5.0F, this.b + var3, this.c - 10.0F, 30.0F);
         var3 += 31.0F;
         if (var5 != null) {
            break;
         }
      }
   }

   public void calculate_2(float var1, float var2, float var3, float var4) {
      super.drawColoredQuad(var1, var2, var3, 9 + 31 * this.list_j.size());
   }

   public void processAll() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      this.dataBuilder15_h.toggle(var3, false);
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      String var8 = RenderUtil39.getString();
      if (this.licenseState_k.isValid(var1, var2)) {
         return false;
      }

      if (!this.a(var1, var2)) {
         this.dataBuilder15_h.toggle(var6, false);
         return false;
      }

      if (this.dataBuilder54_i.fieldBool_k) {
         return true;
      }

      for (ImageUtil25 var10 : this.list_j) {
         if (var10.a(var1, var2)) {
            this.dataBuilder15_h.toggle(var6, false);
            this.dataBuilder54_i.processAll(var10.object_i);
            return true;
         }

         if (var8 != null) {
            break;
         }
      }

      return true;
   }

   static {
      long var0 = 119017602636397L;
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
      String var6 = "oVi@_¬\ntxËÕ\u000f \u001fÌDÁbc\u0095ò\u0094Ë\u0016\u00973êbDÄ\u0089»0!Û\u000b:ë|.0\u0089(\u0007ïéN\tÿ¡Ò\u0086\u0015@y¯zÁÛ0³5Nû]\nà\n\u0006Äî\u001e\u0005>\u001bû Ãüt¡(Ob,\u0083æêÛO\u00adëa\u008aÏ.Y·=\u008eJI¡\u0091E\u000bJWî\u009b.\u0011µ-\u0098\u0080\u0082öá\u001e°U";
      int var7 = "oVi@_¬\ntxËÕ\u000f \u001fÌDÁbc\u0095ò\u0094Ë\u0016\u00973êbDÄ\u0089»0!Û\u000b:ë|.0\u0089(\u0007ïéN\tÿ¡Ò\u0086\u0015@y¯zÁÛ0³5Nû]\nà\n\u0006Äî\u001e\u0005>\u001bû Ãüt¡(Ob,\u0083æêÛO\u00adëa\u008aÏ.Y·=\u008eJI¡\u0091E\u000bJWî\u009b.\u0011µ-\u0098\u0080\u0082öá\u001e°U"
         .length();
      char var8 = ' ';
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

                  var6 = "\u0006¼\u009ffJ>i\u0003N\u0011\u000eÙ\u0001N\u0096Ô³£ü\u009a\u009cqtó\u0087[\u009b\u0093>\u00950îD\u0005\u001a?ÈXËÚ(c3\u0010\u0098î?\tpÝ\u001e\u0099Øó\u0018ù5·\u0007Å z:\u008aM¡\u008dnÎñ{\u0002lô\u001f¹\u009e75ãõ";
                  var7 = "\u0006¼\u009ffJ>i\u0003N\u0011\u000eÙ\u0001N\u0096Ô³£ü\u009a\u009cqtó\u0087[\u009b\u0093>\u00950îD\u0005\u001a?ÈXËÚ(c3\u0010\u0098î?\tpÝ\u001e\u0099Øó\u0018ù5·\u0007Å z:\u008aM¡\u008dnÎñ{\u0002lô\u001f¹\u009e75ãõ"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1702;
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
            throw new RuntimeException("rip/breeze/d7", var10);
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
         throw new RuntimeException("rip/breeze/d7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
