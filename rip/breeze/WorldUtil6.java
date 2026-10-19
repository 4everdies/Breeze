package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum WorldUtil6 {
   EMPTY,
   SWORD,
   PICKAXE,
   AXE,
   BLOCKS,
   ROD,
   GAPPLE,
   PEARL,
   BOW,
   FOOD,
   THROWABLE,
   SHEARS,
   FIREBALL,
   POTION_SPEED,
   POTION_HEAL,
   POTION_STRENGTH;

   public final boolean exclusive;
   public final String name;
   public final String texture;
   private static final WorldUtil6[] CONST_A;
   private static int fieldInt_b;

   WorldUtil6(boolean var3, String var4, String var5) {
      this.exclusive = var3;
      this.name = var4;
      this.texture = var5;
   }

   public static WorldUtil6 getEnum16Val(String var0) {
      long var1 = 76211046348339L;
      String[] var10000 = RangeValue.values();
      WorldUtil6[] var3 = values();
      String[] var4 = var10000;

      for (WorldUtil6 var7 : var3) {
         if (var7.name.equalsIgnoreCase(var0)) {
            return var7;
         }

         if (var4 != null) {
            break;
         }
      }

      return EMPTY;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 139791892824135L;
      if (getValue() != 0) {
         initialize(31);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[47];
      int var5 = 0;
      String var6 = "Öâ-¯\u0090J\u001chjöÀÁúØ\u008aó\b×(n'½\tWï\u0010»=aæ@~\u001d¨\u0098I:¨B\u0092\u0013y\b¤¯;x\"Rº\u0010\b'Ù\u0090þ\u008e\u0019\u0014\u009f\u0010~\u001f\u008dªH\u001a\u0013G3'\u0007Hi§~\u009e\b\u0093ß\u009a-\u001cµ{.\u0010®[bÁy\u0092þ÷ÝÖL\u0081NÕ\u0092Ï\b\u001eÓ`ªõ\u001fGþ\u0010©lº\u000fK¢{?ì<î\u0001Àüþ)\u0010ÌBÍ\u008a·éE8\u0098j\u0014jz\u0012\u008a\u000e\bÝÕj\u0088\u0086Á\u009d$\u0010óPø[üz`\u0087\u0019\u001c\u0014v£\u009adö\bÀØ\u0093õg\u0017®U\u0010B\u0080×?HE\u0013K)\u009eÃ\u0013o>p`\u0010zÑmôo¦òÅZ\u0090çzù\u0004\u0096¿\bldó¸}/Ð×\bãÑ¨Õ\u0019ßÇA\u0010ç<\u008cxÕX<·2tn\u001eS«/W\u0010°\r%@!1»a¹<ÿ\u0098Õò®Ô\b\u000e\u008f8y\u00053lÿ\b)ÿÌÅHn\u009aÂ\u0010Vc¬\bÿ\u001ag\u0082nð\u0089^\u0085[\u0080,\u0010\réð>ñ³ÖW#2.®@Îè\u0086\b¥uîYbº\u0003æ\b\u0011\u0089\r\tàòÀ¯\u0010\"\u0084äbRÚ\u0097ÉgK$-©KSã\bwÇpw¨\u0087MË\b\u0085SÎ\u0006³\fþÅ\u0010R4\u0084\u008dîçÑ\u0097i\\\u00ad\u0092~\u0007\u001b\u001b\u0010Z\u008c\u0017Û85{'\u0010\u008akÈ^Rý\u000b\u0010\u009a\u008cúØK|¨\u0084û<@P\u0017y\u0088ð\bbÒQS9<c¶\u0010ü\\\u0098ê¹\u009aº@ìQ¯\u008e\u009f\u001a\u0092\u009d\b\"¾2\u0099\u0016'l\u0002\b~ò¥mEZC£\b\u0004~v|l$»3\b>\u0086wÐå>ió\u0010\u0018|XÍ*\u0094\u0080Ô½å´¶&~O\"\u0010O\bLC-Õöw.úó^\rã;W\u0010±»\u0011¤.Ö\u0005ÕÞét¶\u0017SÊ¸\b\u0087ªE\u008c\u009ezãg\b\u00141A\u0006ÂlüL\u0010©lº\u000fK¢{?ü\u001aû£P\u0015z\u001e\u0010¯\u00849=\u008a¼áÒÈþõ\u0017\u009d+³<";
      int var7 = "Öâ-¯\u0090J\u001chjöÀÁúØ\u008aó\b×(n'½\tWï\u0010»=aæ@~\u001d¨\u0098I:¨B\u0092\u0013y\b¤¯;x\"Rº\u0010\b'Ù\u0090þ\u008e\u0019\u0014\u009f\u0010~\u001f\u008dªH\u001a\u0013G3'\u0007Hi§~\u009e\b\u0093ß\u009a-\u001cµ{.\u0010®[bÁy\u0092þ÷ÝÖL\u0081NÕ\u0092Ï\b\u001eÓ`ªõ\u001fGþ\u0010©lº\u000fK¢{?ì<î\u0001Àüþ)\u0010ÌBÍ\u008a·éE8\u0098j\u0014jz\u0012\u008a\u000e\bÝÕj\u0088\u0086Á\u009d$\u0010óPø[üz`\u0087\u0019\u001c\u0014v£\u009adö\bÀØ\u0093õg\u0017®U\u0010B\u0080×?HE\u0013K)\u009eÃ\u0013o>p`\u0010zÑmôo¦òÅZ\u0090çzù\u0004\u0096¿\bldó¸}/Ð×\bãÑ¨Õ\u0019ßÇA\u0010ç<\u008cxÕX<·2tn\u001eS«/W\u0010°\r%@!1»a¹<ÿ\u0098Õò®Ô\b\u000e\u008f8y\u00053lÿ\b)ÿÌÅHn\u009aÂ\u0010Vc¬\bÿ\u001ag\u0082nð\u0089^\u0085[\u0080,\u0010\réð>ñ³ÖW#2.®@Îè\u0086\b¥uîYbº\u0003æ\b\u0011\u0089\r\tàòÀ¯\u0010\"\u0084äbRÚ\u0097ÉgK$-©KSã\bwÇpw¨\u0087MË\b\u0085SÎ\u0006³\fþÅ\u0010R4\u0084\u008dîçÑ\u0097i\\\u00ad\u0092~\u0007\u001b\u001b\u0010Z\u008c\u0017Û85{'\u0010\u008akÈ^Rý\u000b\u0010\u009a\u008cúØK|¨\u0084û<@P\u0017y\u0088ð\bbÒQS9<c¶\u0010ü\\\u0098ê¹\u009aº@ìQ¯\u008e\u009f\u001a\u0092\u009d\b\"¾2\u0099\u0016'l\u0002\b~ò¥mEZC£\b\u0004~v|l$»3\b>\u0086wÐå>ió\u0010\u0018|XÍ*\u0094\u0080Ô½å´¶&~O\"\u0010O\bLC-Õöw.úó^\rã;W\u0010±»\u0011¤.Ö\u0005ÕÞét¶\u0017SÊ¸\b\u0087ªE\u008c\u009ezãg\b\u00141A\u0006ÂlüL\u0010©lº\u000fK¢{?ü\u001aû£P\u0015z\u001e\u0010¯\u00849=\u008a¼áÒÈþõ\u0017\u009d+³<"
         .length();
      char var8 = 16;
      int var12 = -1;

      label32:
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
                     EMPTY = new WorldUtil6(false, var4[20], null);
                     SWORD = new WorldUtil6(true, var4[25], var4[12]);
                     PICKAXE = new WorldUtil6(true, var4[24], var4[15]);
                     AXE = new WorldUtil6(true, var4[4], var4[13]);
                     BLOCKS = new WorldUtil6(false, var4[16], var4[7]);
                     ROD = new WorldUtil6(true, var4[27], var4[28]);
                     GAPPLE = new WorldUtil6(true, var4[2], var4[0]);
                     PEARL = new WorldUtil6(true, var4[6], var4[23]);
                     BOW = new WorldUtil6(true, var4[42], var4[17]);
                     FOOD = new WorldUtil6(true, var4[21], var4[19]);
                     THROWABLE = new WorldUtil6(true, var4[10], var4[18]);
                     SHEARS = new WorldUtil6(true, var4[46], var4[39]);
                     FIREBALL = new WorldUtil6(true, var4[14], var4[31]);
                     POTION_SPEED = new WorldUtil6(false, var4[26], var4[44]);
                     POTION_HEAL = new WorldUtil6(false, var4[33], var4[38]);
                     POTION_STRENGTH = new WorldUtil6(false, var4[5], var4[22]);
                     CONST_A = new WorldUtil6[]{
                        EMPTY,
                        SWORD,
                        PICKAXE,
                        AXE,
                        BLOCKS,
                        ROD,
                        GAPPLE,
                        PEARL,
                        BOW,
                        FOOD,
                        THROWABLE,
                        SHEARS,
                        FIREBALL,
                        POTION_SPEED,
                        POTION_HEAL,
                        POTION_STRENGTH
                     };
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label32;
                  }

                  var6 = "À³ð}\u0013bÏL\b1¸\u0003'\u0004\u0090©\b";
                  var7 = "À³ð}\u0013bÏL\b1¸\u0003'\u0004\u0090©\b".length();
                  var8 = '\b';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
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
      return var0 == 0 ? 60 : 0;
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
}
