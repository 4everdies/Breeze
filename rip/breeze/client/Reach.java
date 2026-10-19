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

@ModuleInfo(a = "Reach", b = "Increases your reach.", d = rip.breeze.ModuleCategory.COMBAT, c = {"reach", "reach", "reach", "killaura", "range"})
public class Reach extends BreezeModule {
   private static final Random CONST_N;
   private final GenericSetting<rip.breeze.RangeValue> reachSetting;
   private final GenericSetting<Integer> chanceSetting;
   private final GenericSetting<Boolean> sprintSetting;
   private final GenericSetting<Boolean> wallReachSetting;
   private final GenericSetting<Double> blockReachSetting;
   private float fieldFloat_t;
   private static int fieldInt_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);

   public Reach() {
      long var1 = 16877674270247L;
      super();
      short var10002 = 32239;
      long var10003 = 5723207313088511784L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Reach");
      var10002 = 25314;
      var10003 = 8494007654708469798L ^ var1;
      this.reachSetting = var10001.getDataBuilder50_3("The reach distance to use, in blocks. (vanilla is 3 blocks.)")
         .getDataBuilder50_4(new rip.breeze.RangeValue(3.0, 3.25, 0.05))
         .clamp(rip.breeze.RangeValue.getPredicate(3.0, 6.0, 0.05))
         .getDataBuilder54();
      var10002 = 31870;
      var10003 = 7272525689744391859L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 7415;
      var10003 = 7005054006067076668L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("The chance (out of 100%) that extra reach will be added.")
         .getDataBuilder50_4(60)
         .clamp(rip.breeze.RenderUtil27.getPredicate(1, 100, 1))
         .getDataBuilder54();
      var10002 = 15662;
      var10003 = 7124087010530836455L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Sprint");
      var10002 = 12663;
      var10003 = 3085417856481899449L ^ var1;
      this.sprintSetting = var10001.getDataBuilder50_3("Only adds extra reach while you are sprinting.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 16342;
      var10003 = 7590833948164472083L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "WallReach");
      var10002 = 27485;
      var10003 = 744940500890675601L ^ var1;
      this.wallReachSetting = var10001.getDataBuilder50_3("Allows you to hit players through walls.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 26526;
      var10003 = 2863108624902186326L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "BlockReach");
      var10002 = 22750;
      var10003 = 4793036950396819985L ^ var1;
      this.blockReachSetting = var10001.getDataBuilder50_3(
            "The reach distance to use, for blocks. (vanilla is 4.5 blocks.)\nBlocks reach is not affected by the chance and sprint checks."
         )
         .getDataBuilder50_4(4.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(4.5, 8.0, 0.05F))
         .getDataBuilder54();
      this.fieldFloat_t = 3.0F;
   }

   public String buildString() {
      long var1 = 94639785842642L;
      return this.fieldFloat_t != -1.0F ? null : String.format("%.1f", this.fieldFloat_t);
   }

   @KeepParameters
   public float getAngle() {
      long var1 = 87210164086032L;
      return !this.f()
            || CONST_N.nextInt(100) >= this.chanceSetting.getObject_m()
            || BreezeClient.CONST_A.thePlayer == null
            || !BreezeClient.CONST_A.thePlayer.isSprinting() && this.sprintSetting.getObject_m()
         ? 3.0F
         : (float)this.reachSetting.getObject_m().calculateDouble_2();
   }

   @KeepParameters
   public float getFloat() {
      long var1 = 134659575275995L;
      return this.f() ? this.blockReachSetting.getObject_m().floatValue() : 4.5F;
   }

   @KeepParameters
   public boolean checkCondition() {
      long var1 = 3418816797032L;
      return this.f() && this.wallReachSetting.getObject_m();
   }

   public double getDouble() {
      return this.reachSetting.getObject_m().double_d;
   }

   static {
      long var0 = 78340877335926L;
      initialize(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "ó*VÕ{¢2v\u009dÓ§wv\u0014c|PÈ\bÁÎSX}Çy2 ùH\u0083ÑÅ®à\u0019\u0094S¶\u0018p\u0086â\u0097\u0015>B\u0014³\u0087Í©~lóø\u0097¾\u0018\u000bÆ\u007f\u0012?\u009aé,\u007f\t\u0012§[Õµ#Ú§\u008e£\u0010Z«#\u001e\u00ad%zc=\u0095³\u0098ô)\u0019øÿÀ¸\u0082£*Ä¹.r(x¸Àö\u0097¸\u0017äÜa¿¸ã|(\u0018:>\n|ÀD+}Vô®g\u0017\u009b\"ã4X\u009d1\u0091¦\u001d6ª5'M\u0013×ôç\u0090dÿ\u0005È\u0090m\u0092µâ³~\u009d/}-F\u0084|8\u0095>É3\u008fw\u0085¤{ç®!Ók2-T\u001a&ä\u000e}ó^H\u001bA}\u000fÐ\u0096\u0010\u0091®\u000eÊt1ruýxó©Ð5W\u001a\u008bz\u001b|U\u0007\u0085µe\u0011æOep\u001c[g$¹ÑÆiÄ$îÒC¨\u0011\u000b\byáËi0v·Ø\u0089\u00007úl\u000b\u0091ÑG\u0005ä\u0093\u000b#{\u0093_.ÖC\u001cT²êi}½6PdH/d\u0012sº«r\u0002jy\u0016Pµdð\u0012Â¸`\u0096\u0099J\u000bJ\u008fÌ©-\u00adý\u0092¯\u008f\u008f\u0090åÞÓS%Ïí¨|\n\u008bª¦±PFcyyç>ß\u0083s3\u0084æõí4d\u0090R\rj¨H\u0013\u009d\u009a&öÌ\u0010\u0002L\u0091ò\u0082)µ\u0089\u001e]\u001aót6ÿd\u0018½\u0082¸Lÿå/\u0088þû\u0006\u0097\u009a3ùíR\u0004ßÊ\u008fÞ]àhç\u0089¸·\u0088\u0091\u0085c-°¿ô¿\u0080Ó;¡-ÐI.|eO§\u0081¤ö\u001dÕ°EÊ±çË-å¦Ü\u008f{h\u0011«Çü\u008cÀR\u009dãÐ\u0093Öä¯Ü\u0011\u0002\u000eù\u008c:\u009f\"\u0018ñZÃ'6\u0082MoT¤,¹Õ*$\u0093ËÛVXíLß\u0092\u00147j§\u0080-K\u008b\u0083@\u001d1\f\u0010âI\u0013³\u0015¨Àöõ±=\u001d\u0082t\u0019\u0088\u0018,\u0089ÊC®£\u0089<®o#»Ó\r¡à\u000bY¬1O³ÑD";
      int var7 = "ó*VÕ{¢2v\u009dÓ§wv\u0014c|PÈ\bÁÎSX}Çy2 ùH\u0083ÑÅ®à\u0019\u0094S¶\u0018p\u0086â\u0097\u0015>B\u0014³\u0087Í©~lóø\u0097¾\u0018\u000bÆ\u007f\u0012?\u009aé,\u007f\t\u0012§[Õµ#Ú§\u008e£\u0010Z«#\u001e\u00ad%zc=\u0095³\u0098ô)\u0019øÿÀ¸\u0082£*Ä¹.r(x¸Àö\u0097¸\u0017äÜa¿¸ã|(\u0018:>\n|ÀD+}Vô®g\u0017\u009b\"ã4X\u009d1\u0091¦\u001d6ª5'M\u0013×ôç\u0090dÿ\u0005È\u0090m\u0092µâ³~\u009d/}-F\u0084|8\u0095>É3\u008fw\u0085¤{ç®!Ók2-T\u001a&ä\u000e}ó^H\u001bA}\u000fÐ\u0096\u0010\u0091®\u000eÊt1ruýxó©Ð5W\u001a\u008bz\u001b|U\u0007\u0085µe\u0011æOep\u001c[g$¹ÑÆiÄ$îÒC¨\u0011\u000b\byáËi0v·Ø\u0089\u00007úl\u000b\u0091ÑG\u0005ä\u0093\u000b#{\u0093_.ÖC\u001cT²êi}½6PdH/d\u0012sº«r\u0002jy\u0016Pµdð\u0012Â¸`\u0096\u0099J\u000bJ\u008fÌ©-\u00adý\u0092¯\u008f\u008f\u0090åÞÓS%Ïí¨|\n\u008bª¦±PFcyyç>ß\u0083s3\u0084æõí4d\u0090R\rj¨H\u0013\u009d\u009a&öÌ\u0010\u0002L\u0091ò\u0082)µ\u0089\u001e]\u001aót6ÿd\u0018½\u0082¸Lÿå/\u0088þû\u0006\u0097\u009a3ùíR\u0004ßÊ\u008fÞ]àhç\u0089¸·\u0088\u0091\u0085c-°¿ô¿\u0080Ó;¡-ÐI.|eO§\u0081¤ö\u001dÕ°EÊ±çË-å¦Ü\u008f{h\u0011«Çü\u008cÀR\u009dãÐ\u0093Öä¯Ü\u0011\u0002\u000eù\u008c:\u009f\"\u0018ñZÃ'6\u0082MoT¤,¹Õ*$\u0093ËÛVXíLß\u0092\u00147j§\u0080-K\u008b\u0083@\u001d1\f\u0010âI\u0013³\u0015¨Àöõ±=\u001d\u0082t\u0019\u0088\u0018,\u0089ÊC®£\u0089<®o#»Ó\r¡à\u000bY¬1O³ÑD"
         .length();
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
                     CONST_W = var4;
                     CONST_X = new String[11];
                     CONST_N = new Random();
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

                  var6 = "C\u001bõ\f8Ñºø¡¤ñ¬f{ò*)¼P\u009a8owï\nÔ'»\u0098ÐViC\t\u001b\u0000 Èý\u0015[EªríB\u0094~)Ç´\u0013¡>\u0014»È\u0090þa\u001d\u009d{Ð)LëWÀ\u0006,^\u0002´\u0004¸Ï\u008fåE¿(aa\u0098%kl\u0005Â9¬\u0094\u009aÕ\u0099\u000f\u0099]\u001fÙÈ,C\u0010\u0006\u008câ\u008d\u0085\u0086ñ\u0093ôÌl_^Ü\u009ax";
                  var7 = "C\u001bõ\f8Ñºø¡¤ñ¬f{ò*)¼P\u009a8owï\nÔ'»\u0098ÐViC\t\u001b\u0000 Èý\u0015[EªríB\u0094~)Ç´\u0013¡>\u0014»È\u0090þa\u001d\u009d{Ð)LëWÀ\u0006,^\u0002´\u0004¸Ï\u008fåE¿(aa\u0098%kl\u0005Â9¬\u0094\u009aÕ\u0099\u000f\u0099]\u001fÙÈ,C\u0010\u0006\u008câ\u008d\u0085\u0086ñ\u0093ôÌl_^Ü\u009ax"
                     .length();
                  var8 = 'h';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int var0) {
      fieldInt_u = var0;
   }

   public static int getValue() {
      return fieldInt_u;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 112 : 0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3306;
      if (CONST_X[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Y.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dt", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_W[var3].getBytes("ISO-8859-1");
         CONST_X[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_X[var3];
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
         throw new RuntimeException("rip/breeze/client/dt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
