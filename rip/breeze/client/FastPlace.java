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
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "FastPlace",
   b = "Lowers the delay between block placements when holding down right click.",
   d = rip.breeze.ModuleCategory.MISC,
   c = {"fast", "place", "rightclick", "rightclickplace", "rightclicking", "rightclickingplace"}
)
public class FastPlace extends BreezeModule {
   private final GenericSetting<rip.breeze.RangeValue> delaySetting;
   private final GenericSetting<Integer> initialDelaySetting;
   private final GenericSetting<RenderUtil20_x[]> itemsSetting;
   private final Util133 dataBuilder112_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   public FastPlace() {
      long var1 = 119251611825444L;
      super();
      short var10002 = 26873;
      long var10003 = 4825184430728367649L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Delay");
      var10002 = 32319;
      var10003 = 6109645684768004320L ^ var1;
      this.delaySetting = var10001.getDataBuilder50_3("The delay in between placing blocks, in ticks.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(2.0, 4.0))
         .clamp(rip.breeze.RangeValue.getPredicate_3(1, 4))
         .getDataBuilder54();
      var10002 = 5567;
      var10003 = 737856791475958627L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "InitialDelay");
      var10002 = 28086;
      var10003 = 9098995475084036975L ^ var1;
      this.initialDelaySetting = var10001.getDataBuilder50_3("The amount of time you have to hold down the place key before FastPlace starts placing faster.")
         .getDataBuilder50_4(0)
         .clamp(rip.breeze.RenderUtil27.getPredicate(0, 500, 10))
         .getDataBuilder54();
      var10002 = 21184;
      var10003 = 6680195680090485790L ^ var1;
      var10001 = GenericSetting.<RenderUtil20_x[]>getDataBuilder50(this, "Items").getDataBuilder50_4(new RenderUtil20_x[]{RenderUtil20_x.BLOCKS});
      var10002 = 21547;
      var10003 = 6915426207227212534L ^ var1;
      this.itemsSetting = var10001.getDataBuilder50_3("The items to activate FastPlace on.").getDataBuilder54();
      this.dataBuilder112_q = new Util133();
   }

   @EventListener
   public void update() {
      long var1 = 122997829121573L;
      if (!PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindUseItem)) {
         this.dataBuilder112_q.getDataBuilder112();
      }
   }

   @KeepParameters
   public int getValue() {
      long var1 = 131909365456129L;
      if (BreezeClient.isValid()) {
         return 4;
      } else if (!this.f()) {
         return 4;
      } else if (!this.dataBuilder112_q.isValid(this.initialDelaySetting.getObject_m().intValue())) {
         return 4;
      } else {
         int var3 = (int)this.delaySetting.getObject_m().calculateDouble_2();
         if (this.itemsSetting.checkCondition(RenderUtil20_x.ALL)) {
            return var3;
         } else {
            ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventory.getCurrentItem();
            if (var4 == null) {
               return this.itemsSetting.checkCondition(RenderUtil20_x.FIST) ? var3 : 4;
            } else if (var4.getItem() instanceof ItemBlock) {
               return this.itemsSetting.checkCondition(RenderUtil20_x.BLOCKS) ? var3 : 4;
            } else if (!this.itemsSetting.checkCondition(RenderUtil20_x.THROWABLES)
               || !(var4.getItem() instanceof ItemSnowball) && !(var4.getItem() instanceof ItemEgg)) {
               return this.itemsSetting.checkCondition(RenderUtil20_x.EXP_BOTTLES) && var4.getItem() instanceof ItemExpBottle ? var3 : 4;
            } else {
               return var3;
            }
         }
      }
   }

   static {
      long var0 = 93540241235073L;
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
      String var6 = "\u000f\u000f8\u009b\u0087\u007f\u009ew±\u0086/úøe³6öð&°\u0019¼úÜ\bÚ'\b\u009a\u009dÂx@\u0089u\u000b¶/\u0015\u0093x\u0089\fW\u009b\u0084R,PÆó\u008bä\rqR]«h×\u0092Ópÿf¸Söß\u009cÛy>×\u0016s57D¸\u0019udDµÿñ@k>c`§\u0093r\u008aï\u0010\u0017Ï=ÎjÏ3Ãó\"\u009eçn\u0004\u001bÏPSsó\u0083\u001e\u000fcÒ\u009b[\u009e}é\"\u0099ä\"\u009f²Óör\u0019wZ\u009câ\u0093üë,¿\nÊ<;\u008b1 \u0093H\u0099·\u0097W³\u008c©\u0016G¡u*@\u0085wÞéB?çKÊ:\u0015\u0082âY\u009fm*\u001b3Ó¯6©HmÏ";
      int var7 = "\u000f\u000f8\u009b\u0087\u007f\u009ew±\u0086/úøe³6öð&°\u0019¼úÜ\bÚ'\b\u009a\u009dÂx@\u0089u\u000b¶/\u0015\u0093x\u0089\fW\u009b\u0084R,PÆó\u008bä\rqR]«h×\u0092Ópÿf¸Söß\u009cÛy>×\u0016s57D¸\u0019udDµÿñ@k>c`§\u0093r\u008aï\u0010\u0017Ï=ÎjÏ3Ãó\"\u009eçn\u0004\u001bÏPSsó\u0083\u001e\u000fcÒ\u009b[\u009e}é\"\u0099ä\"\u009f²Óör\u0019wZ\u009câ\u0093üë,¿\nÊ<;\u008b1 \u0093H\u0099·\u0097W³\u008c©\u0016G¡u*@\u0085wÞéB?çKÊ:\u0015\u0082âY\u009fm*\u001b3Ó¯6©HmÏ"
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
                     CONST_S = var4;
                     CONST_T = new String[6];
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

                  var6 = "\u0081\u0012ÌT\u008f\\\u009c\u000ey\u008b£Ó\u0015\\-\u0084\u0098#òwf\u0097\u009d\u0006Ü\u0098\u0090£ÎW|³±0ã=ö\u0014m\u0000oÆâ5\b\u0003\u009cXR\u0004\u0080\u009a´×\u009fl\u0084\u0005ÐRÈ{÷Ãý7ßÝ«ÕC[ñ\u0091M{¸ 6\u0085\u009eDºf\r\u000e«ú\n\u0087\u0091bÿ\u009d\u009a\u0093ëýóÕn®fÑ´QÈ\u0091\u0095\";ëã$+EH\u0097-³ü]\f p\u0013+³ç?©¸ã¿ßM`á°\u001c\u0012V\u009bÜ@\u0097,¬´¦\u0091½]©4ûz\u009fÕí\f\b3Ov\u001cß\u0095\u0013";
                  var7 = "\u0081\u0012ÌT\u008f\\\u009c\u000ey\u008b£Ó\u0015\\-\u0084\u0098#òwf\u0097\u009d\u0006Ü\u0098\u0090£ÎW|³±0ã=ö\u0014m\u0000oÆâ5\b\u0003\u009cXR\u0004\u0080\u009a´×\u009fl\u0084\u0005ÐRÈ{÷Ãý7ßÝ«ÕC[ñ\u0091M{¸ 6\u0085\u009eDºf\r\u000e«ú\n\u0087\u0091bÿ\u009d\u009a\u0093ëýóÕn®fÑ´QÈ\u0091\u0095\";ëã$+EH\u0097-³ü]\f p\u0013+³ç?©¸ã¿ßM`á°\u001c\u0012V\u009bÜ@\u0097,¬´¦\u0091½]©4ûz\u009fÕí\f\b3Ov\u001cß\u0095\u0013"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5112;
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
            throw new RuntimeException("rip/breeze/client/dL", var10);
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
         throw new RuntimeException("rip/breeze/client/dL" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
