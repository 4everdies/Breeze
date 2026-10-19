package rip.breeze.client;

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
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rip.breeze.StringDecryptor;

public class PacketUtil14 {
   private static int fieldInt_b;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public static boolean isValid(KeyBinding var0) {
      long var1 = 117585941787843L;
      int var3 = var0.getKeyCode();
      if (var3 < 0) {
         int var4 = 100 + var3;
         return var4 >= 0 && var4 < Mouse.getButtonCount() ? Mouse.isButtonDown(var4) : false;
      } else {
         return var3 < Keyboard.getKeyCount() ? Keyboard.isKeyDown(var3) : false;
      }
   }

   public static String buildString(KeyBinding var0) {
      long var1 = 18646917596956L;
      boolean var10000 = BlockUtil7.isValid();
      int var3 = var0.getKeyCode();
      boolean var4 = var10000;
      if (var3 >= 0) {
         return Keyboard.getKeyName(var3);
      }

      int var5 = 100 + var3;
      String var6 = Mouse.getButtonName(var5);
      byte var7 = -1;
      switch (var6.hashCode()) {
         case 959335230:
            if (!var6.equals("BUTTON0")) {
               break;
            }

            var7 = 0;
            if (var4) {
               break;
            }
         case 959335231:
            if (var6.equals("BUTTON1")) {
               var7 = 1;
            }
      }

      switch (var7) {
         case 0:
            return "LMB";
         case 1:
            return "RMB";
         default:
            return "?";
      }
   }

   public static void initialize(int var0) {
      fieldInt_b = var0;
   }

   public static int getValue() {
      return fieldInt_b;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 79 : 0;
   }

   static {
      initialize(43);
      long var0 = 107870590083766L;
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
      String var6 = "\u0004\r\"\u001b\u0098Ô\u009d/ôh\u0016F\u0013Æ8¡\u0010/õêxÜ¯1h\u0094É\bZ'Dh]";
      int var7 = "\u0004\r\"\u001b\u0098Ô\u009d/ôh\u0016F\u0013Æ8¡\u0010/õêxÜ¯1h\u0094É\bZ'Dh]".length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_C = var4;
                     CONST_D = new String[4];
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

                  var6 = "B ´[\u008b\u0014áKT\u0095\u0084¾ÜMÄ\u007f\u0010ó[\u001aÖÁ¾¸F3*F¯u¥ÅË";
                  var7 = "B ´[\u008b\u0014áKT\u0095\u0084¾ÜMÄ\u007f\u0010ó[\u001aÖÁ¾¸F3*F¯u¥ÅË".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3148;
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
            throw new RuntimeException("rip/breeze/client/e8", var10);
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
         CONST_D[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/client/e8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
