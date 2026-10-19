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
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "NoRender",
   b = "Disables rendering for some parts of the game, can improve performance or remove annoying effects.",
   d = {rip.breeze.ModuleCategory.VISUAL, rip.breeze.ModuleCategory.MISC}
)
public class NoRender extends BreezeModule {
   private final GenericSetting<Boolean> armorSetting;
   private final GenericSetting<Boolean> fireSetting;
   private final GenericSetting<Boolean> hurtCamSetting;
   private final GenericSetting<Boolean> gUIBackgroundSetting;
   private final GenericSetting<Boolean> particlesSetting;
   private final GenericSetting<Boolean> weatherSetting;
   private final GenericSetting<Boolean> blockOutlinesSetting;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public NoRender() {
      long var1 = 63150535306614L;
      super(false, false);
      short var10002 = 24803;
      long var10003 = 852562165640488241L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Armor");
      var10002 = 15175;
      var10003 = 6072964075881512596L ^ var1;
      this.armorSetting = var10001.getDataBuilder50_3("Stops the armor from rendering on other players.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 24433;
      var10003 = 8216328319955294880L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Fire");
      var10002 = 9283;
      var10003 = 2655250370017272222L ^ var1;
      this.fireSetting = var10001.getDataBuilder50_3("Stops the fire overlay from rendering on your screen.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 24335;
      var10003 = 4755624927590800089L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "HurtCam");
      var10002 = 878;
      var10003 = 175298386925029044L ^ var1;
      this.hurtCamSetting = var10001.getDataBuilder50_3("Stops the hurt camera effect from rendering.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 20525;
      var10003 = 2940549210248992243L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "GUIBackground");
      var10002 = 2306;
      var10003 = 2181574535722503390L ^ var1;
      this.gUIBackgroundSetting = var10001.getDataBuilder50_3("Stops the dirt background from rendering when in GUIs.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 7517;
      var10003 = 2304894052807415942L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Particles");
      var10002 = 17345;
      var10003 = 5675739608955799064L ^ var1;
      this.particlesSetting = var10001.getDataBuilder50_3("Stops particles from rendering entirely.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 3228;
      var10003 = 3209649126429493580L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Weather");
      var10002 = 29041;
      var10003 = 4452723858923189417L ^ var1;
      this.weatherSetting = var10001.getDataBuilder50_3("Stops weather (rain and/or snow) from rendering.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 5238;
      var10003 = 5107188916248711593L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "BlockOutlines");
      var10002 = 31236;
      var10003 = 7460934053822758867L ^ var1;
      this.blockOutlinesSetting = var10001.getDataBuilder50_3("Stops the outline rendering around the block you're pointing at.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
   }

   @KeepParameters
   @Override
   public boolean isValid() {
      return this.fireSetting.getObject_m();
   }

   @KeepParameters
   @Override
   public boolean isValid_2() {
      return this.hurtCamSetting.getObject_m();
   }

   @KeepParameters
   public boolean isValid_3() {
      return this.gUIBackgroundSetting.getObject_m();
   }

   @KeepParameters
   public boolean isValid_4() {
      return this.particlesSetting.getObject_m();
   }

   @KeepParameters
   public boolean isValid_5() {
      return this.weatherSetting.getObject_m();
   }

   @KeepParameters
   public boolean isValid_6() {
      return this.blockOutlinesSetting.getObject_m();
   }

   @KeepParameters
   public boolean isValid_7() {
      return this.armorSetting.getObject_m();
   }

   static {
      long var0 = 45595950013449L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "ó\fuÎ\u008bVù²\u0007\u009e» G\r\u009e\befíì@:òÒ\u0000\u009eR¸d-[½h&k\u008bè\u0001Ù¶âÕ»:¦(\rûj\u0090\u009ei\u0011\u0081ñí£-\u0004÷´ÏºÅñh1z\bÝ ¼\u0086PÕúx\rø( :\u008e¤¸VË f\u008bÎõvþ\u0087Ð³æ\u0092å»q\u00adÅz\u0080é8\u0007\u0012Ýf\u0015XW\u009a!Ñ ñPXOð\u0010(r1³~n\u0014R3+\u0081z!I\u0005ÊmlLãÖÇ}\u001c%<ýU¢å\u008f\u0003³Ã\rñ\"rA\u0082\u001aþíå\u0014ý/ÓÑxOê\u0091/\u0001Ò\u0010Óç3È\bRj¸\u00065vÊ6×2K\u0017ß\tgH\u001ar\u0000À<À¢\u0017DÄ!VW\u0085ªchñ\u0089}aKË´\u0099~/ÍGs\u0085ñè\u0017·¢tÖè¶\fä&Ð\u0093F\u0099ù\u009fC\"®\u0013\tXÀ \u001c\u0010U4F¬|lÓ\u0007ÐæX\u0006½ f\u0014\u0097\u0002Ô\u0016ï\u009a.Vñ:¢²¶Ã Ex3m¿Ú3Q¤Þ\u008aº\u008e\u008a3 Ö¾\u0012L\u0091!ú!,PÓt\tª\u008a.£\u001fm\u0012!æ\u0091ÅÊ\u0085\u0097\u0085ìµ<ÏX#)>ú\u0001\u0014Gû£eø1@Bô\u0098¦q\u0007îÏµ\u009f\u008b~\u001f\\\u008dzvÛ\u009f\u0085¡è\u001c<E\u0089/[\u0002ÌÜÿ\u009bxHû\u0084Ú\u001eïL\u001faÛi³\u008c°4wüó&Ö{hd[\u009d_ÃÀ°&\u0007§bõ\u0087\u0019\u0015l*kÓX\u00adòÇ\u0093'ªFàh\u001e´å\r#Uu´Ö\u0014±xËîX\u009eÇ¨\u0082.ÝRtóº\u0010û}jvpo\bÏÑ\niÝww\u0091Üu\"P\u001fÄOmúÐGµ\u0081ïè\u0006\u0092c)E-*þ1Ë¸\u008b\u0015-(ÊQ cðL>á\u0010O\u0019Bb°ü þ5(°ç\u0093\u0089DDX#Ða\u0098×{;ä\u008d§\u00882$1Rü{Ò\u0002ïF\n\u0010SÞìnéÆ[\u0099§r\u001a\u0002¨\u0091\u0087í\u0007\u008ddæ,i6Àò\u007fæÑ³Øâ\u009aõ¯åÅ<JKôZ\u00111\u0015î\u001aãx\u0001|è®\u0012T©c\u0001\u0017×ºt:\u009fe3\u0010>õº`,\u000fÈ\u00821-&ßnÃà\r\u0010¤\u0010~Íßý1áMÞ¡-X{ÿc";
      int var7 = "ó\fuÎ\u008bVù²\u0007\u009e» G\r\u009e\befíì@:òÒ\u0000\u009eR¸d-[½h&k\u008bè\u0001Ù¶âÕ»:¦(\rûj\u0090\u009ei\u0011\u0081ñí£-\u0004÷´ÏºÅñh1z\bÝ ¼\u0086PÕúx\rø( :\u008e¤¸VË f\u008bÎõvþ\u0087Ð³æ\u0092å»q\u00adÅz\u0080é8\u0007\u0012Ýf\u0015XW\u009a!Ñ ñPXOð\u0010(r1³~n\u0014R3+\u0081z!I\u0005ÊmlLãÖÇ}\u001c%<ýU¢å\u008f\u0003³Ã\rñ\"rA\u0082\u001aþíå\u0014ý/ÓÑxOê\u0091/\u0001Ò\u0010Óç3È\bRj¸\u00065vÊ6×2K\u0017ß\tgH\u001ar\u0000À<À¢\u0017DÄ!VW\u0085ªchñ\u0089}aKË´\u0099~/ÍGs\u0085ñè\u0017·¢tÖè¶\fä&Ð\u0093F\u0099ù\u009fC\"®\u0013\tXÀ \u001c\u0010U4F¬|lÓ\u0007ÐæX\u0006½ f\u0014\u0097\u0002Ô\u0016ï\u009a.Vñ:¢²¶Ã Ex3m¿Ú3Q¤Þ\u008aº\u008e\u008a3 Ö¾\u0012L\u0091!ú!,PÓt\tª\u008a.£\u001fm\u0012!æ\u0091ÅÊ\u0085\u0097\u0085ìµ<ÏX#)>ú\u0001\u0014Gû£eø1@Bô\u0098¦q\u0007îÏµ\u009f\u008b~\u001f\\\u008dzvÛ\u009f\u0085¡è\u001c<E\u0089/[\u0002ÌÜÿ\u009bxHû\u0084Ú\u001eïL\u001faÛi³\u008c°4wüó&Ö{hd[\u009d_ÃÀ°&\u0007§bõ\u0087\u0019\u0015l*kÓX\u00adòÇ\u0093'ªFàh\u001e´å\r#Uu´Ö\u0014±xËîX\u009eÇ¨\u0082.ÝRtóº\u0010û}jvpo\bÏÑ\niÝww\u0091Üu\"P\u001fÄOmúÐGµ\u0081ïè\u0006\u0092c)E-*þ1Ë¸\u008b\u0015-(ÊQ cðL>á\u0010O\u0019Bb°ü þ5(°ç\u0093\u0089DDX#Ða\u0098×{;ä\u008d§\u00882$1Rü{Ò\u0002ïF\n\u0010SÞìnéÆ[\u0099§r\u001a\u0002¨\u0091\u0087í\u0007\u008ddæ,i6Àò\u007fæÑ³Øâ\u009aõ¯åÅ<JKôZ\u00111\u0015î\u001aãx\u0001|è®\u0012T©c\u0001\u0017×ºt:\u009fe3\u0010>õº`,\u000fÈ\u00821-&ßnÃà\r\u0010¤\u0010~Íßý1áMÞ¡-X{ÿc"
         .length();
      char var8 = 'P';
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
                     CONST_V = var4;
                     CONST_W = new String[14];
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

                  var6 = "SÕ#â|Âû\\F\u008fV\u000f\u0012FÆZp\u0093ôW\u0089¸!Çÿø7tÕë:\t&Tä¼5ªr\u0016\u0012\u0098®ù\u0082¿P\"Ã\u00ad\u0002\r\u0094?0\u0090]\u001a2¿|èð81õw·æÆãZÒ\u0017\\2\u0085\u0010\u0018\u0092¼Q!\u0092*\u0014`AóHfûíN\u008e\u0087D{ÓÛ¯s9\u0091Í\u0084mO?é\\¿D&ÖÑÓ8Ö)ùÛ@Þ±{3Öa";
                  var7 = "SÕ#â|Âû\\F\u008fV\u000f\u0012FÆZp\u0093ôW\u0089¸!Çÿø7tÕë:\t&Tä¼5ªr\u0016\u0012\u0098®ù\u0082¿P\"Ã\u00ad\u0002\r\u0094?0\u0090]\u001a2¿|èð81õw·æÆãZÒ\u0017\\2\u0085\u0010\u0018\u0092¼Q!\u0092*\u0014`AóHfûíN\u008e\u0087D{ÓÛ¯s9\u0091Í\u0084mO?é\\¿D&ÖÑÓ8Ö)ùÛ@Þ±{3Öa"
                     .length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26796;
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
            throw new RuntimeException("rip/breeze/client/d_", var10);
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
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/client/d_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
