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
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public class ImageUtil16 {
   private static String string_b;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public static void processAll() {
      long var0 = 3947893067967L;
      int var10000 = MicrosoftAuth.getValue();
      Iterator var2 = BreezeContext.moduleBase_a.getAllModules().iterator();
      int var3 = var10000;

      while (var2.hasNext()) {
         BreezeModule var4 = (BreezeModule)var2.next();
         var4.l();
         if (var3 != 0) {
            break;
         }
      }
   }

   public static UserTheme getUserTheme(DateUtil var0) {
      long var1 = 85941494585699L;
      long var3 = var1 ^ 33793284276236L;
      long var5 = var1 ^ 39816540463452L;
      int var10000 = MicrosoftAuth.getValue();
      UserTheme var7 = new UserTheme();
      int var8 = var10000;

      for (GenericSetting var10 : var0.list_a) {
         var7.update(var10.string_b, var10.toString(), var3);
         if (var8 != 0) {
            break;
         }
      }

      for (DateUtil var12 : var0.list_b) {
         var7.processNullable(var12.getString(), var5, getUserTheme(var12));
         if (var8 != 0) {
            break;
         }
      }

      if (var0 instanceof IBreezeInterface2) {
         short var10001 = 17231;
         long var10002 = 8908274928252714373L ^ var1;
         var7.processNullable("_hud_position", var5, ((IBreezeInterface2)var0).getData().getDataBuilder2());
      }

      return var7;
   }

   public static UserTheme getUserTheme_2() {
      long var0 = 57320127265820L;
      long var2 = var0 ^ 103623389561891L;
      int var10000 = MicrosoftAuth.getValue();
      UserTheme var4 = new UserTheme();
      int var5 = var10000;

      for (BreezeModule var7 : BreezeContext.moduleBase_a.getAllModules()) {
         var4.processNullable(var7.getString_2(), var2, getUserTheme(var7));
         if (var5 != 0) {
            break;
         }
      }

      return var4;
   }

   public static UserTheme getUserTheme_3() {
      long var0 = 6590056495003L;
      long var2 = var0 ^ 53242495042600L;
      long var4 = var0 ^ 123012417867684L;
      int var10000 = MicrosoftAuth.getValue();
      UserTheme var6 = getUserTheme_2();
      short var10002 = 2011;
      long var10003 = 824799020976560110L ^ var0;
      var6.processNullable("client-settings", var4, getUserTheme(BreezeContext.iKeybindSettings_e.getKeyBinding()));
      int var7 = var10000;
      BreezeIterable var8 = new BreezeIterable();

      for (BreezeModule var10 : BreezeContext.moduleBase_a.getAllModules()) {
         if (var10.categories.contains(ModuleCategory.FAVORITE)) {
            var8.processAll_2(var10.getString_2(), var2);
         }

         if (var7 != 0) {
            break;
         }
      }

      short var10001 = 30927;
      long var12 = 9006254794842515705L ^ var0;
      var6.processNullable("_favourites", var4, var8);
      if (BreezeContext.dataBuilder15_j != null) {
         var10001 = 23390;
         long var13 = 4248119032179788653L ^ var0;
         var6.processNullable("_cloud_scripts", var4, BreezeContext.dataBuilder15_j.getBreezeIterable());
      }

      return var6;
   }

   public static void processAll_1(UserTheme var0) {
      long var1 = 101334487070847L;
      long var10001 = var1 ^ 87442283939640L;
      int var3 = (int)((var1 ^ 87442283939640L) >>> 48);
      int var4 = (int)((var1 ^ 87442283939640L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var10000 = MicrosoftAuth.getValue();
      Iterator var6 = BreezeContext.moduleBase_a.getAllModules().iterator();
      int var7 = var10000;

      while (var6.hasNext()) {
         BreezeModule var8 = (BreezeModule)var6.next();
         if (var0.isValid(var8.getString_2()) && var0.getDataBuilder2_2(var8.getString_2()).isValid_2()) {
            UserTheme var9 = var0.getUserTheme(var8.getString_2());
            processNullable(var8, var9);
         }

         if (var7 != 0) {
            break;
         }
      }

      if (var0.isValid("_favourites")
         && var0.getDataBuilder2_2("_favourites").isValid()) {
         for (rip.breeze.client.PlayerUtil8 var12 : var0.getBreezeIterable("_favourites")) {
            for (BreezeModule var10 : BreezeContext.moduleBase_a.getAllModules()) {
               if (var10.getString_2().equals(var12.buildString((char)var3, var4, (short)var5))) {
                  var10.categories.add(ModuleCategory.FAVORITE);
                  if (var7 == 0) {
                     break;
                  }
               }

               if (var7 != 0) {
                  break;
               }
            }

            if (var7 != 0) {
               break;
            }
         }
      }
   }

   public static void processNullable(DateUtil var0, UserTheme var1) {
      long var2 = 30033465916710L;
      long var10001 = var2 ^ 9888328450657L;
      int var4 = (int)((var2 ^ 9888328450657L) >>> 48);
      int var5 = (int)((var2 ^ 9888328450657L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      int var7 = MicrosoftAuth.getValue();
      if (var1 != null) {
         for (GenericSetting var9 : var0.list_a) {
            if (var1.isValid(var9.string_b)) {
               var9.processAll_2(var1.getDataBuilder2_2(var9.string_b).buildString((char)var4, var5, (short)var6));
            }

            if (var7 != 0) {
               break;
            }
         }

         for (DateUtil var11 : var0.list_b) {
            if (var1.isValid(var11.getString()) && var1.getDataBuilder2_2(var11.getString()).isValid_2()) {
               processNullable(var11, var1.getUserTheme(var11.getString()));
            }

            if (var7 != 0) {
               break;
            }
         }

         if (var0 instanceof IBreezeInterface2 && var1.isValid("_hud_position")) {
            ((IBreezeInterface2)var0).getData().update(var1.getDataBuilder2_2("_hud_position"));
         }
      }
   }

   public static void initialize(String var0) {
      string_b = var0;
   }

   public static String getString() {
      return string_b;
   }

   static {
      initialize("jnVoQb");
      long var0 = 122342131221557L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "\u0007ÖUÓ\u009dÂØ\u009dXà<\u0018\u0005\u0087ôÔ(2øÇ\u000fÃ0¡Ö\u00adWU\u001a\u008bÄ¸ 8éFz\u0093Ð\u0013ÑtH¦9S¼ÞP¤\u008fSYsµ\u0010ÀjÜaÜÑ\u0007Ý\u001a\u0018º~B\u0000\u0006Jìö?'lÕ³ÔäÌ÷¿cAØ\f\u0083Q\u0018 ¬\u000f¼i}Í£\u00ad2#b~\"$ÏÞ\\ÊjÀ\u0011oB";
      int var7 = "\u0007ÖUÓ\u009dÂØ\u009dXà<\u0018\u0005\u0087ôÔ(2øÇ\u000fÃ0¡Ö\u00adWU\u001a\u008bÄ¸ 8éFz\u0093Ð\u0013ÑtH¦9S¼ÞP¤\u008fSYsµ\u0010ÀjÜaÜÑ\u0007Ý\u001a\u0018º~B\u0000\u0006Jìö?'lÕ³ÔäÌ÷¿cAØ\f\u0083Q\u0018 ¬\u000f¼i}Í£\u00ad2#b~\"$ÏÞ\\ÊjÀ\u0011oB"
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
                     CONST_C = var4;
                     CONST_D = new String[6];
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

                  var6 = "[Z\u0084ÕÍø\u0097©(®»$é[\u0098nÜÅ¾_\u0093SÖÔ \u0006K¯\u0082i¾¾\u0003ÌËáiùv\u0006\u0088\u0082ßó-Èóq7ÔË\u000e<Áq\b\u0088";
                  var7 = "[Z\u0084ÕÍø\u0097©(®»$é[\u0098nÜÅ¾_\u0093SÖÔ \u0006K¯\u0082i¾¾\u0003ÌËáiùv\u0006\u0088\u0082ßó-Èóq7ÔË\u000e<Áq\b\u0088".length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10156;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aw", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/aw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
