package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.EnumChatFormatting;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "AutoGG", b = "Send \"GG\" at the end of a game.", c = "hypixel", d = rip.breeze.ModuleCategory.MISC)
public class AutoGG extends BreezeModule {
   private final GenericSetting<String> textSetting;
   private final List<String> list_o;
   private final Util133 dataBuilder112_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);
   private static final long eka_1;

   public AutoGG() {
      long var1 = 103015483413941L;
      super();
      short var10002 = 12783;
      long var10003 = 4091250978045079719L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Text");
      var10002 = 14186;
      var10003 = 1651045511189280301L ^ var1;
      var10001 = var10001.getDataBuilder50_3("The text to send when the game ends.");
      var10002 = 28687;
      var10003 = 5796842098465206594L ^ var1;
      this.textSetting = var10001.getDataBuilder50_4("gg").clamp(AutoGG::lambda$new_Inner0).getDataBuilder54();
      String[] var4 = new String[16];
      short var10004 = 14397;
      long var10005 = 8146127397482707318L ^ var1;
      var4[0] = "1st Place - ";
      var10004 = 13003;
      var10005 = 2675176422460011399L ^ var1;
      var4[1] = "Winner: ";
      var10004 = 737;
      var10005 = 6918488826356761509L ^ var1;
      var4[2] = "Damage Dealt - ";
      var10004 = 19301;
      var10005 = 7761439832074570275L ^ var1;
      var4[3] = "Winning Team - ";
      var10004 = 21633;
      var10005 = 599600652602496450L ^ var1;
      var4[4] = "1st - ";
      var10004 = 25131;
      var10005 = 6050557833200198513L ^ var1;
      var4[5] = "Winners: ";
      var10004 = 27935;
      var10005 = 8436042808850246746L ^ var1;
      var4[6] = "Winner: ";
      var10004 = 19341;
      var10005 = 8900697733177756365L ^ var1;
      var4[7] = "Winning Team: ";
      var10004 = 21728;
      var10005 = 7131277674884617647L ^ var1;
      var4[8] = " won the game!";
      var10004 = 26186;
      var10005 = 6710737964822652683L ^ var1;
      var4[9] = "Top Seeker: ";
      var10004 = 10542;
      var10005 = 8025021569509304437L ^ var1;
      var4[10] = "1st Place: ";
      var10004 = 8979;
      var10005 = 5846022862518985309L ^ var1;
      var4[11] = "Last team standing!";
      var10004 = 10544;
      var10005 = 4524424020233070713L ^ var1;
      var4[12] = "Winner #1 (";
      var10004 = 19971;
      var10005 = 4922233324993728329L ^ var1;
      var4[13] = "Top Survivors";
      var4[14] = "Top Survivors";
      var4[15] = "";
      this.list_o = Arrays.asList(var4);
      this.dataBuilder112_p = new Util133();
   }

   @EventListener
   public void sendPacket(PacketReceiveEventEvent var1) {
      long var2 = 110178812842665L;
      if (var1.getPacket_h() instanceof S02PacketChat) {
         S02PacketChat var4 = var1.getPacket_h();
         String var5 = EnumChatFormatting.getTextWithoutFormattingCodes(var4.getChatComponent().getFormattedText());
         if (this.isValid(var5) && this.dataBuilder112_p.isValid(1000L)) {
            this.dataBuilder112_p.getDataBuilder112();
            BreezeClient.CONST_A.thePlayer.sendChatMessage(this.textSetting.getObject_m());
         }
      }
   }

   private boolean isValid(String var1) {
      return this.list_o.stream().anyMatch(var1::contains);
   }

   private static boolean lambda$new_Inner0(String var0) {
      long var1 = 132424744374019L;
      return var0 != null && var0.length() < 100;
   }

   static {
      long var0 = 93140844329567L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "tÊB³c\u0004R\u009cÎ¤gITp6`©¸0Á'\u0012÷\u009a\u00188{FÞm °\u0085\u0000à\u0093\u009fN¬Ý5¢\t\u0081Îì&¿\u0084\u0010iÉ#é\u0000:«û®¼\"N®úèR(î=÷\"\u008d\u0090Z\u0097\u008f\\y$rÅè\u0015hì\u001f\u009f \r\u0005\"ô04³+@·WÅµî}3\u0018¼\u0096 ÷\u0096óé\u009e'4m¬ân\u0014\u009f\u0083ù\u001e\u0094\u0013\u009ftï@î\u009f¸\u001b\u0002ÿ7z\"\u0013\u0018\u000fí\u008dÄýWì6Bõ2\u0091\b\u008b8\u0015þ½ZG]á\u001d\u0016 ò`\u001d\u001bZþ\u0003]¬ôlb\u0005,\u0099Üê\\Ì6\u000e¢¬+§ó\u0082ô@¼ÛZ\u0010ÿè:¸÷\u001aªÀqP¨\u0094\u0010=ªå\u0018È§wkçfõS\u0012Ë°Æ\u009c«%Yu¾M8<ª\u001b0\u0018àyé\u0018+\u0086(Hvt\u008d.\n\u00883pÃúÑ&\u0083C©\u0085\u0018<ÙÏL\u0012N§¤oÛÍ\u00adÕÜ\\h¤\u0099®,ÙÂø\u0089\u0018K\u009cRO\u008b\u000b-µ:Û\u0015\u001b\u00adöPn\u0084Eq\u0098òÅì( åÙÄ²ôÕ÷LkG5\u0092\u001f\u00192L\u0018æ2Y\u0086ø\u008a½\r\u007f)ü(µÕà@\u0007=\u0001ß\u0004\u0019ã\u0089~\u0003Ê\u0083\u0091ë~5òAÖ\u0010þmøÑ\u0007@!|\u0098\u008bKâxßáÌT\u0083\b[jrR¥\u0003zäoîù©í\u0007;3Å\u0010Q÷\fà\u0090ëC \u0082vÐ±ôeqÑ¹ÙTwÞ\u009aãÊÅÜv+,%\u0094ê\u001c\u008fw;\u0083bp~ \u0016ßKÕAÎO\u0081\u001c\t¹\u0093\u00adkàÛÂ\u0014d\u001c¿\u008aoìíù\u001b7ôC\u0004l";
      int var7 = "tÊB³c\u0004R\u009cÎ¤gITp6`©¸0Á'\u0012÷\u009a\u00188{FÞm °\u0085\u0000à\u0093\u009fN¬Ý5¢\t\u0081Îì&¿\u0084\u0010iÉ#é\u0000:«û®¼\"N®úèR(î=÷\"\u008d\u0090Z\u0097\u008f\\y$rÅè\u0015hì\u001f\u009f \r\u0005\"ô04³+@·WÅµî}3\u0018¼\u0096 ÷\u0096óé\u009e'4m¬ân\u0014\u009f\u0083ù\u001e\u0094\u0013\u009ftï@î\u009f¸\u001b\u0002ÿ7z\"\u0013\u0018\u000fí\u008dÄýWì6Bõ2\u0091\b\u008b8\u0015þ½ZG]á\u001d\u0016 ò`\u001d\u001bZþ\u0003]¬ôlb\u0005,\u0099Üê\\Ì6\u000e¢¬+§ó\u0082ô@¼ÛZ\u0010ÿè:¸÷\u001aªÀqP¨\u0094\u0010=ªå\u0018È§wkçfõS\u0012Ë°Æ\u009c«%Yu¾M8<ª\u001b0\u0018àyé\u0018+\u0086(Hvt\u008d.\n\u00883pÃúÑ&\u0083C©\u0085\u0018<ÙÏL\u0012N§¤oÛÍ\u00adÕÜ\\h¤\u0099®,ÙÂø\u0089\u0018K\u009cRO\u008b\u000b-µ:Û\u0015\u001b\u00adöPn\u0084Eq\u0098òÅì( åÙÄ²ôÕ÷LkG5\u0092\u001f\u00192L\u0018æ2Y\u0086ø\u008a½\r\u007f)ü(µÕà@\u0007=\u0001ß\u0004\u0019ã\u0089~\u0003Ê\u0083\u0091ë~5òAÖ\u0010þmøÑ\u0007@!|\u0098\u008bKâxßáÌT\u0083\b[jrR¥\u0003zäoîù©í\u0007;3Å\u0010Q÷\fà\u0090ëC \u0082vÐ±ôeqÑ¹ÙTwÞ\u009aãÊÅÜv+,%\u0094ê\u001c\u008fw;\u0083bp~ \u0016ßKÕAÎO\u0081\u001c\t¹\u0093\u00adkàÛÂ\u0014d\u001c¿\u008aoìíù\u001b7ôC\u0004l"
         .length();
      char var8 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_R = var4;
                     CONST_S = new String[18];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -4322360658143465813L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     1000L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "¼\u00ad)c\u0089¸XÆþñª\u0004SæÔ*\u00181^\u0083\u0085;\u008f(¬§\u001b(¡É\u0019z%$.UõL=\u0010Õ";
                  var7 = "¼\u00ad)c\u0089¸XÆþñª\u0004SæÔ*\u00181^\u0083\u0085;\u008f(¬§\u001b(¡É\u0019z%$.UõL=\u0010Õ".length();
                  var8 = 16;
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5375;
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
            throw new RuntimeException("rip/breeze/client/dG", var10);
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
         throw new RuntimeException("rip/breeze/client/dG" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
