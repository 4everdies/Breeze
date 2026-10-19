package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RenderUtil37<T extends Enum<T>> extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h;
   private final GenericSetting<T[]> dataBuilder54_i;
   private final List<ImageUtil24<T>> list_j;
   public LicenseState licenseState_k;
   private static String string_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public RenderUtil37(rip.breeze.client.AnimationTimer var1, GenericSetting<T[]> var2, List<T> var3) {
      long var4 = 133877861802657L;
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.dataBuilder15_h = var1;
      this.dataBuilder54_i = var2;
      this.list_j = new ArrayList<>();
      String var10000 = getString();
      Iterator var6 = var3.iterator();
      String var7 = var10000;

      while (var6.hasNext()) {
         Enum var8 = (Enum)var6.next();
         this.list_j.add(new ImageUtil24<>(RenderUtil27.CONST_G.apply(var8), (T)var8));
         if (var7 != null) {
            break;
         }
      }
   }

   public void processNullable(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      String var10000 = getString();
      BreezeContext.iRenderer_b.frameBegin();
      String var8 = var10000;
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_h.getDouble(var6), this.c(), this.d());
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

      for (ImageUtil24 var10 : this.list_j) {
         var10.fieldBool_h = this.dataBuilder54_i.checkCondition(var10.object_i);
         var10.calculate(var1, var2, var3);
         if (var8 != null) {
            break;
         }
      }

      BreezeContext.iRenderer_b.frameEnd();
   }

   public void calculate() {
      long var1 = 62740630596709L;
      float var3 = 5.0F;
      String var10000 = getString();
      Iterator var4 = this.list_j.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         ImageUtil24 var6 = (ImageUtil24)var4.next();
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
      String var8 = getString();
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

      for (ImageUtil24 var10 : this.list_j) {
         if (var10.a(var1, var2)) {
            this.processNullable_2(var10.object_i);
            return true;
         }

         if (var8 != null) {
            break;
         }
      }

      return true;
   }

   private void processNullable_2(T var1) {
      long var2 = 99856000199198L;
      Enum[] var4 = (Enum[])this.dataBuilder54_i.getObject_m();
      String var10000 = getString();
      Class var5 = this.dataBuilder54_i.object_d.getClass().getComponentType();
      String var6 = var10000;
      if (var4 == null) {
         Enum[] var11 = (Enum[])Array.newInstance(var5, 1);
         var11[0] = var1;
         this.dataBuilder54_i.processAll(var11);
      } else {
         ArrayList var7 = new ArrayList<>(Arrays.asList(var4));
         boolean var8 = false;
         int var9 = 0;

         while (var9 < var7.size()) {
            if (var7.get(var9) == var1) {
               var8 = true;
               var7.remove(var9);
               if (var6 == null) {
                  break;
               }
            }

            var9++;
            if (var6 != null) {
               break;
            }
         }

         if (!var8) {
            var7.add(var1);
         }

         Enum[] var12 = (Enum[])Array.newInstance(var5, var7.size());
         int var10 = 0;

         while (var10 < var7.size()) {
            var12[var10] = (Enum)var7.get(var10);
            var10++;
            if (var6 != null) {
               break;
            }
         }

         this.dataBuilder54_i.processAll(var12);
      }
   }

   public static void initialize(String var0) {
      string_l = var0;
   }

   public static String getString() {
      return string_l;
   }

   static {
      long var0 = 39822215820986L;
      initialize(null);
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
      String var6 = "B5Ì\u0092/3\u0086a\u0010Õç:§\u0012§i;6\u0002>Óñyz\u0084\u0083Ü\u0095GÉ\u0082.Ð§ègUcI8(ªçÿéwJ\u009f6¹Lïè\u0081c±_À!!©0\u0083\n¸\u001dê3û´?\u0088¼3CÄOé\u0015\u0081H(ÚFD\u0002\u0004\b\\\u0083æ;öÞÄa&ó\u0080\u0003 þºB\u00adª*ö.\u009a0úké}6_¸Õ\u0013\u0013¬";
      int var7 = "B5Ì\u0092/3\u0086a\u0010Õç:§\u0012§i;6\u0002>Óñyz\u0084\u0083Ü\u0095GÉ\u0082.Ð§ègUcI8(ªçÿéwJ\u009f6¹Lïè\u0081c±_À!!©0\u0083\n¸\u001dê3û´?\u0088¼3CÄOé\u0015\u0081H(ÚFD\u0002\u0004\b\\\u0083æ;öÞÄa&ó\u0080\u0003 þºB\u00adª*ö.\u009a0úké}6_¸Õ\u0013\u0013¬"
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
                     CONST_O = new String[5];
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

                  var6 = "\u001d\u0091o\u000bm\u0013#¼U \u0014ú¼w·>ñ\u0015ÏÄ\u000f_Inner3°\u00ad\u001a¾TÒ\u009f\u0001s(ÁP\u001d(Ôm\u009f\t½\u008e\u0005ª\bE6'\u0012\"¸nH/U\u0010\tâ\u008e\u0000p\u0099ÿ\u008a`Èò²ì#/Ç";
                  var7 = "\u001d\u0091o\u000bm\u0013#¼U \u0014ú¼w·>ñ\u0015ÏÄ\u000f_Inner3°\u00ad\u001a¾TÒ\u009f\u0001s(ÁP\u001d(Ôm\u009f\t½\u008e\u0005ª\bE6'\u0012\"¸nH/U\u0010\tâ\u008e\u0000p\u0099ÿ\u008a`Èò²ì#/Ç"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16828;
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
            throw new RuntimeException("rip/breeze/d5", var10);
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
         throw new RuntimeException("rip/breeze/d5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
