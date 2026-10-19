package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "HitBoxes", b = "Increases the size of hitboxes.", d = rip.breeze.ModuleCategory.COMBAT, c = {"hitbox", "hitboxes", "size", "range"})
public class HitBoxes extends BreezeModule {
   static final Random CONST_N;
   private final GenericSetting<Integer> chanceSetting;
   private final GenericSetting<rip.breeze.RangeValue> sizeSetting;
   private rip.breeze.RangeValue dataBuilder39_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   public HitBoxes() {
      long var1 = 36713388633627L;
      super();
      short var10002 = 16551;
      long var10003 = 571525367365864042L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 9663;
      var10003 = 6887133665533783921L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("When the mouse hovers over a player's hitbox, the probability that it will be larger, in percent.")
         .getDataBuilder50_4(60)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(1, 100))
         .getDataBuilder54();
      var10002 = 3467;
      var10003 = 2716589100151129927L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Size");
      var10002 = 2731;
      var10003 = 7081567605235171428L ^ var1;
      this.sizeSetting = var10001.getDataBuilder50_3("How much extra size to add to hitboxes, in blocks.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.05, 0.25))
         .clamp(rip.breeze.RangeValue.getPredicate_2(0.0, 0.25))
         .getDataBuilder50_10(this::lambda$new_Inner0)
         .getDataBuilder54();
      this.dataBuilder39_q = this.sizeSetting.object_d;
   }

   @KeepParameters
   public double getDouble() {
      long var1 = 8778760864385L;
      return this.f() && CONST_N.nextInt(100) >= this.chanceSetting.getObject_m() ? this.dataBuilder39_q.calculateDouble_2() : 0.0;
   }

   private void lambda$new_Inner0(rip.breeze.RangeValue var1) {
      this.dataBuilder39_q = var1;
   }

   static {
      long var0 = 122374685309086L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "àä\u0010<Ñ{CÓïÉ#ðW\u0005Aê\u0010+%\u0019!2ÞÍe¥!©xRUëé";
      int var7 = "àä\u0010<Ñ{CÓïÉ#ðW\u0005Aê\u0010+%\u0019!2ÞÍe¥!©xRUëé".length();
      char var8 = 16;
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var19 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[4];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -5389010592026458084L;
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
                     CONST_N = new Random(var13);
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

                  var6 = "5{$Rí¢B\u0084yÛÓ(VJ\u0086}\n ÿâðU\u007fÛYö¿Êê\u00ad×\u0086mnî¸q÷G\u0002WB\"7Cþ\u0095¸:½q\u0013\u0000\u0097}ZÉ\\\u000f1\nZF\u0092Sx\u0007^\u0003@ó\u009dÆ&úäº\u0019W` \u001cêÄ\u0098\u0017õcÌ×®â\u0095]\by\u0002\u0099¼zV Íme\u0005¢>\u0087J\u0019\u001aýÀ11>\u001cSØÕ*¹%è\u000f\u0080ùâÀ£¨8äCR°\u0015\u00ad!HÈ~ú@U¿\u0098g\u0086BÍúf\u0098òÓ\u000e\t\u009cF\u0098%Eö\u0090\u0007[\u0099·\u0015\u001a\u008b27\tn\u0014UH_EÌBh?²\u0090EíÊ¿¦\u001aÖ5r*6¾\u0094³Ý`,Gß¾0A\u00841a\nÁ¸ýD\u0000ð\u0083<g\u007fà\u0002ð7\u000b4§\u00846%\u0083¿\u0017ÖÒQï";
                  var7 = "5{$Rí¢B\u0084yÛÓ(VJ\u0086}\n ÿâðU\u007fÛYö¿Êê\u00ad×\u0086mnî¸q÷G\u0002WB\"7Cþ\u0095¸:½q\u0013\u0000\u0097}ZÉ\\\u000f1\nZF\u0092Sx\u0007^\u0003@ó\u009dÆ&úäº\u0019W` \u001cêÄ\u0098\u0017õcÌ×®â\u0095]\by\u0002\u0099¼zV Íme\u0005¢>\u0087J\u0019\u001aýÀ11>\u001cSØÕ*¹%è\u000f\u0080ùâÀ£¨8äCR°\u0015\u00ad!HÈ~ú@U¿\u0098g\u0086BÍúf\u0098òÓ\u000e\t\u009cF\u0098%Eö\u0090\u0007[\u0099·\u0015\u001a\u008b27\tn\u0014UH_EÌBh?²\u0090EíÊ¿¦\u001aÖ5r*6¾\u0094³Ý`,Gß¾0A\u00841a\nÁ¸ýD\u0000ð\u0083<g\u007fà\u0002ð7\u000b4§\u00846%\u0083¿\u0017ÖÒQï"
                     .length();
                  var8 = 'P';
                  var19 = -1;
            }

            var20 = var6.substring(++var19, var19 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9430;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dm", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/dm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
