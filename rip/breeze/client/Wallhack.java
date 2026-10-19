package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "Wallhack",
   b = "Fades every block except the ones you select, letting you see them through terrain.",
   d = {rip.breeze.ModuleCategory.VISUAL, rip.breeze.ModuleCategory.MISC},
   c = {"xray", "ore", "ores", "seethrough"}
)
public class Wallhack extends BreezeModule {
   private volatile boolean fieldBool_n;
   private final GenericSetting<Integer> opacitySetting;
   private final GenericSetting<Boolean> brightnessSetting;
   private final GenericSetting<rip.breeze.ConfigMap> dataBuilder54_q;
   private final AnimationTimer dataBuilder15_r;
   private volatile Set<Block> set_s;
   private static final String[] CONST_U;
   private static final String[] CONST_V;
   private static final Map CONST_W = new HashMap(13);

   public Wallhack() {
      long var1 = 94449142014813L;
      super();
      this.fieldBool_n = false;
      short var10002 = 31670;
      long var10003 = 7732289580070324184L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Opacity");
      var10002 = 26674;
      var10003 = 6681496065351636052L ^ var1;
      this.opacitySetting = var10001.getDataBuilder50_3("How visible the rest of the world stays. At 0 it disappears entirely.")
         .getDataBuilder50_4(45)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 255))
         .getDataBuilder54();
      var10002 = 17871;
      var10003 = 5685248084696168867L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Brightness");
      var10002 = 18444;
      var10003 = 3434066828668630124L ^ var1;
      this.brightnessSetting = var10001.getDataBuilder50_3("Lights the selected blocks up, so the ones buried in the dark aren't black on black.")
         .getDataBuilder50_4(true)
         .getDataBuilder50_10(this::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 20780;
      var10003 = 8120329632433696077L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The blocks that stay solid and visible through everything else.");
      var10002 = 5803;
      var10003 = 704240718980360911L ^ var1;
      var10001 = var10001.getDataBuilder50_3("minecraft:coal_ore");
      String[] var10004 = new String[8];
      short var10007 = 4318;
      long var10008 = 7454251232989457593L ^ var1;
      var10004[0] = "minecraft:iron_ore";
      var10007 = 8310;
      var10008 = 864069213029899291L ^ var1;
      var10004[1] = "minecraft:gold_ore";
      var10007 = 10303;
      var10008 = 2113505244892238928L ^ var1;
      var10004[2] = "minecraft:diamond_ore";
      var10007 = 17537;
      var10008 = 7629797643714558187L ^ var1;
      var10004[3] = "minecraft:emerald_ore";
      var10007 = 25935;
      var10008 = 2364995555306756390L ^ var1;
      var10004[4] = "minecraft:lapis_ore";
      var10007 = 22225;
      var10008 = 6312530497732897466L ^ var1;
      var10004[5] = "minecraft:redstone_ore";
      var10007 = 181;
      var10008 = 8224405203322649821L ^ var1;
      var10004[6] = "minecraft:quartz_ore";
      var10004[7] = "minecraft:quartz_ore";
      this.dataBuilder54_q = var10001.getDataBuilder50_4(new rip.breeze.ConfigMap(var10004)).getDataBuilder50_10(this::lambda$new_Inner1).getDataBuilder54();
      this.dataBuilder15_r = new AnimationTimer(400.0F, false, EnumType3.QUINT_IN);
      this.set_s = Collections.emptySet();
   }

   protected void toggle() {
      this.processAll();
      if (!this.fieldBool_n) {
         this.fieldBool_n = true;
         this.calculate();
      }
   }

   @Override
   protected void noOp() {
   }

   @KeepParameters
   public boolean isBool_n() {
      return this.fieldBool_n;
   }

   @KeepParameters
   public boolean isValid(Block var1) {
      return this.set_s.contains(var1);
   }

   @KeepParameters
   @Override
   public boolean isValid_2() {
      return this.brightnessSetting.getObject_m();
   }

   public float calculateFloat() {
      long var1 = 109954394033377L;
      long var3 = var1 ^ 114754193704406L;
      long var5 = var1 ^ 95514978732318L;
      this.dataBuilder15_r.toggle(var3, this.f());
      float var7 = (float)this.dataBuilder15_r.getDouble(var5);
      if (this.fieldBool_n && !this.f() && var7 <= 0.001F) {
         this.fieldBool_n = false;
         this.calculate();
      }

      return MathUtil1.calculateFloat(1.0F, this.opacitySetting.getObject_m().intValue() / 255.0F, var7);
   }

   private void processAll() {
      Set var1 = Collections.newSetFromMap(new IdentityHashMap());

      for (String var3 : this.dataBuilder54_q.getObject_m().getList_c()) {
         Block var4 = Block.getBlockFromName(var3);
         if (var4 != null && var4 != Blocks.air) {
            var1.add(var4);
            if (var4 == Blocks.redstone_ore) {
               var1.add(Blocks.lit_redstone_ore);
            }
         }
      }

      this.set_s = var1;
   }

   private void calculate() {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.renderGlobal != null && BreezeClient.CONST_A.thePlayer != null) {
         int var1 = (BreezeClient.CONST_A.gameSettings.renderDistanceChunks + 1) * 16;
         int var2 = MathHelper.floor_double(BreezeClient.CONST_A.thePlayer.posX);
         int var3 = MathHelper.floor_double(BreezeClient.CONST_A.thePlayer.posZ);
         BreezeClient.CONST_A.renderGlobal.markBlockRangeForRenderUpdate(var2 - var1, 0, var3 - var1, var2 + var1, 255, var3 + var1);
      }
   }

   private void lambda$new_Inner1(rip.breeze.ConfigMap var1) {
      this.processAll();
      if (this.fieldBool_n) {
         this.calculate();
      }
   }

   private void lambda$new_Inner0(Boolean var1) {
      if (this.fieldBool_n) {
         this.calculate();
      }
   }

   static {
      long var0 = 108751585450745L;
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
      String var6 = "Ål\u0082zTÏúÏ\u0010ýh{³=\fÅ\u0005nLâaÝ\u001bß¾È\u0014\u0090ëÅ\u0015\u0092(Ý\u009f¯´\u0017\u0005ÝvØ°\u0088 \u0011=¡Ä--~÷jÑ\u0002\\\u00ad¨\tq&b«õÞ2Bí§X\tÕ\u0010±\u0081òE¬ÄfÍÒ4.ûú¥ö\u009f(ùîÁ _\u008fÄV41]X\u0010\u009fÍ\u001d\u001d©ô\u000fRt\u001b%©\u000bâÛ\u008f\u0080º«9\u001c\u0082×\u0016Wè\u0012(!I°|\u000e\u009886²w=ôA5ñ\u0097VÐ\u000b\"«¼KN\u0081°\u0095\u0098¸\u0098ùt®°Ñ\u001e?ÐÑ\u0080(â\b\u0014è«\u001c¦Dëª\u0097q\u0014¨¿oónXYÔa\u0089ÅÆNH\u001e\bH(¤#\\\u0095\u008d<â\bä æÌ\u0000l\u001b\u0012?áÊ\u000bnDË\u0091h\bì\u0099nR\u0000ª,TÙ\u009d\u00983É?X\u008a(\\ãÐ\u0010ÅpÝ\u0000þ\u0084[P^;=ê2Q£\fZ+};t£Câû³èeÖ\u009cTê¦/k\u0019`\u0010÷\u0091ðò©.\u0084\u0086EÛÜ7\n+óÎ\u0081@ÈC\u0084bØ¸'{wR%\r\u008b@\u0015I~\u0010#áÝV\u0094+\nG0¯\u0095¦¹S\u0010cÒ\u0000N1®§\u008d\u0082VÝ'¾½\u0096µHæEL°Õr7dU\u0087\u0084|\\þz\u0000\rM\u0017z_(\u001d¡ô¼\u0012(\u0015U \u0006Q\fVuò*\u0096\u0084\u009aÍ?\u0091þÄ§\u008cð\tÇ3¤P\u0097¦iXvv*º±\u001a_¸©±pë\u001b\u0089dç[\u0085/RÝl\u001eï\u008dò°µ\u008bÂ\u0095\u0097ðª5Åõ\u000f¥5¶\u0097\u008dZå@8´\u0019\u007fBÉY\u0014\u0082\u0084\u001dhúéÛúMä\u0015W\t¬D|\u0005Ñ°õ FµqVv\u0014RfÚaÍd6T¡ITób¼\u001bê\u009a´p\u0007\u0005¾\u0084U\u0097½ª\u0012\u008fx]T\u0084ÜQ\u001awÁ\u0097>T©(ê\u0006\u0084¦\u0093[·aÆbÊü¸ü\u009e°¬õ\u0090\\Â+¿\u0015\u001f \u0081å0g\u001aoaôÞ\u0002^µñd";
      int var7 = "Ål\u0082zTÏúÏ\u0010ýh{³=\fÅ\u0005nLâaÝ\u001bß¾È\u0014\u0090ëÅ\u0015\u0092(Ý\u009f¯´\u0017\u0005ÝvØ°\u0088 \u0011=¡Ä--~÷jÑ\u0002\\\u00ad¨\tq&b«õÞ2Bí§X\tÕ\u0010±\u0081òE¬ÄfÍÒ4.ûú¥ö\u009f(ùîÁ _\u008fÄV41]X\u0010\u009fÍ\u001d\u001d©ô\u000fRt\u001b%©\u000bâÛ\u008f\u0080º«9\u001c\u0082×\u0016Wè\u0012(!I°|\u000e\u009886²w=ôA5ñ\u0097VÐ\u000b\"«¼KN\u0081°\u0095\u0098¸\u0098ùt®°Ñ\u001e?ÐÑ\u0080(â\b\u0014è«\u001c¦Dëª\u0097q\u0014¨¿oónXYÔa\u0089ÅÆNH\u001e\bH(¤#\\\u0095\u008d<â\bä æÌ\u0000l\u001b\u0012?áÊ\u000bnDË\u0091h\bì\u0099nR\u0000ª,TÙ\u009d\u00983É?X\u008a(\\ãÐ\u0010ÅpÝ\u0000þ\u0084[P^;=ê2Q£\fZ+};t£Câû³èeÖ\u009cTê¦/k\u0019`\u0010÷\u0091ðò©.\u0084\u0086EÛÜ7\n+óÎ\u0081@ÈC\u0084bØ¸'{wR%\r\u008b@\u0015I~\u0010#áÝV\u0094+\nG0¯\u0095¦¹S\u0010cÒ\u0000N1®§\u008d\u0082VÝ'¾½\u0096µHæEL°Õr7dU\u0087\u0084|\\þz\u0000\rM\u0017z_(\u001d¡ô¼\u0012(\u0015U \u0006Q\fVuò*\u0096\u0084\u009aÍ?\u0091þÄ§\u008cð\tÇ3¤P\u0097¦iXvv*º±\u001a_¸©±pë\u001b\u0089dç[\u0085/RÝl\u001eï\u008dò°µ\u008bÂ\u0095\u0097ðª5Åõ\u000f¥5¶\u0097\u008dZå@8´\u0019\u007fBÉY\u0014\u0082\u0084\u001dhúéÛúMä\u0015W\t¬D|\u0005Ñ°õ FµqVv\u0014RfÚaÍd6T¡ITób¼\u001bê\u009a´p\u0007\u0005¾\u0084U\u0097½ª\u0012\u008fx]T\u0084ÜQ\u001awÁ\u0097>T©(ê\u0006\u0084¦\u0093[·aÆbÊü¸ü\u009e°¬õ\u0090\\Â+¿\u0015\u001f \u0081å0g\u001aoaôÞ\u0002^µñd"
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
                     CONST_U = var4;
                     CONST_V = new String[14];
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

                  var6 = "\u0081u\u0087\u0010é\u0018Ë\u008e*¾´7\u008b°\u0096íÿ÷è§Ä \u0088¦·«0\u0003\u009d\u0089ß§0-ØGÊþ±½áÂ³;\u008b,dû®MDeíÿu\u0012Ñ\u0001=Íz\u0089d½®¡û3X\u0092Ùîôþ\u0019\u007f0\u001dPÚ\\\u0002\u0004*\u001b©\u001c(â\u0099SF@¨'AÂ\\Ã(m\u0083Îf ©Á\u0002R\u0003¹\u000b£1*ª\u0006\u008eÖrÏÂ\u0091IÇfBÁBþT[\u001f\u0007ÃB\u0010½z×7Õ\u0088ðO}Z\u008aüI\u009f1u";
                  var7 = "\u0081u\u0087\u0010é\u0018Ë\u008e*¾´7\u008b°\u0096íÿ÷è§Ä \u0088¦·«0\u0003\u009d\u0089ß§0-ØGÊþ±½áÂ³;\u008b,dû®MDeíÿu\u0012Ñ\u0001=Íz\u0089d½®¡û3X\u0092Ùîôþ\u0019\u007f0\u001dPÚ\\\u0002\u0004*\u001b©\u001c(â\u0099SF@¨'AÂ\\Ã(m\u0083Îf ©Á\u0002R\u0003¹\u000b£1*ª\u0006\u008eÖrÏÂ\u0091IÇfBÁBþT[\u001f\u0007ÃB\u0010½z×7Õ\u0088ðO}Z\u008aüI\u009f1u"
                     .length();
                  var8 = 136;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7985;
      if (CONST_V[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_W.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/ee", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_U[var3].getBytes("ISO-8859-1");
         CONST_V[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_V[var3];
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
         throw new RuntimeException("rip/breeze/client/ee" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
