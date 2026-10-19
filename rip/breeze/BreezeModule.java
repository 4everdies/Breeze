package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class BreezeModule extends DateUtil {
   public final Set<ModuleCategory> categories;
   public String moduleName;
   public String description;
   public Set<String> aliases;
   public String string_h;
   private boolean active;
   private final GenericSetting<KeyBind> holdSetting;
   private final GenericSetting<Boolean> enabledSetting;
   private final GenericSetting<Boolean> enabledSetting_2;
   private static int[] arr_m;
   private static final String[] CONST_EB;
   private static final String[] CONST_FB;
   private static final Map CONST_GB = new HashMap(13);

   public BreezeModule(boolean var1, boolean var2) {
      long var3;
      int[] var5;
      label19: {
         var3 = 13609905711297L;
         super();
         this.categories = new HashSet<>();
         this.active = false;
         int[] var10000 = decrypt();
         short var10003 = 18084;
         long var10004 = 2726331179689606382L ^ var3;
         BlockUtil10 var10002 = GenericSetting.getDataBuilder50(this, "Enabled");
         var10003 = 31944;
         var10004 = 63591095612425856L ^ var3;
         this.enabledSetting_2 = var10002.getDataBuilder50_3("Congratulations, you have just found this hidden setting!")
            .getDataBuilder50_4(false)
            .getDataBuilder50_9(BreezeModule::lambda$new_Inner0)
            .getDataBuilder50_10(this::lambda$new_Inner1)
            .getDataBuilder54();
         var5 = var10000;
         if (var1) {
            short var7 = 25285;
            long var12 = 5962211933664073868L ^ var3;
            BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Hold");
            short var8 = 28337;
            long var13 = 957329563538117887L ^ var3;
            this.holdSetting = var10001.getDataBuilder50_3("... I've run out of funny things to put here...")
               .getDataBuilder50_4(new KeyBind())
               .getDataBuilder54();
            if (var5 == null) {
               break label19;
            }
         }

         this.holdSetting = null;
      }

      if (var2) {
         short var9 = 28885;
         long var14 = 8447478559541807770L ^ var3;
         BlockUtil10 var6 = GenericSetting.getDataBuilder50(this, "Enabled");
         var9 = 23070;
         var14 = 1454364040565809237L ^ var3;
         this.enabledSetting = var6.getDataBuilder50_3("Congratulations, you have just found this hidden setting!")
            .getDataBuilder50_4(false)
            .getDataBuilder54();
         if (var5 == null) {
            return;
         }
      }

      this.enabledSetting = null;
   }

   public BreezeModule() {
      this(true, true);
   }

   public String getString_2() {
      return this.moduleName;
   }

   protected void noOp() {
   }

   protected void noOp_2() {
   }

   public String getString_2() {
      return null;
   }

   private void initialize() {
      EventBus.processAll(this);
      this.noOp();
   }

   private void initialize() {
      EventBus.processAll_3(this);
      this.noOp_2();
   }

   public final void processAll() {
      long var1 = 81633672595895L;
      this.enabledSetting_2.processAll(!this.enabledSetting_2.getObject_m());
   }

   public final boolean isValid() {
      Object var10000 = this.enabledSetting_2.getObject_m();
      return var10000 != null ? (Boolean)var10000 : false;
   }

   public final void initialize(boolean var1) {
      this.enabledSetting_2.processAll(var1);
   }

   public final KeyBind getKeyBind() {
      long var1 = 94806440886789L;
      return this.holdSetting == null ? KeyBind.CONST_G : this.holdSetting.getObject_m();
   }

   public final boolean isValid_2() {
      long var1 = 29079943018176L;
      return this.enabledSetting == null ? false : this.enabledSetting.getObject_m();
   }

   private void lambda$new_Inner1(Boolean var1) {
      long var2 = 37429843587437L;
      int[] var4 = decrypt();
      if (var1 && !this.active) {
         this.initialize();
         this.active = true;
         if (var4 == null) {
            return;
         }
      }

      if (!var1 && this.active) {
         this.initialize();
         this.active = false;
      }
   }

   private static boolean lambda$new_Inner0(DateUtil var0) {
      return false;
   }

   public static void initialize_2(int[] var0) {
      arr_m = var0;
   }

   public static int[] decrypt() {
      return arr_m;
   }

   static {
      long var0 = 107162754193247L;
      initialize_2(null);
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
      String var6 = "*Éñg¯,Ä\u0081È\u009dâ+óTê´¨\u0014;\u0091{Ól õ9)Ûã:Mw\u001bì\u0091¶\u000b´=p\u0082\u0010{ãómî\u0001Nx)\bí\u0086'\u0092\u0006#He\u0099sÈ\"ÂTo\n1Á\u0012\u0014\u0010e¿\u0006îzÔ \u0096ë\u009f\u0016Uª»\u009au\u0010¨gjâÄ$æEõõ\u0081[9\u0016xihçgOÓ@J\u0083í;\u0099ó\u001cw%ó\u00109`ýÜÆ.0\u0011SÐ6Bòf¸ªD'\nJ[\u001a\u001d©\u008f¿\u0086ÄH¶\u0089þødÃ\u008d\u0096Cê\u0098åOg\"¦þ\u0088\tjÒ\u0012Ú$g \u0007Uätc-ó\u009cÃ\u0001êÏ\u0097f\u000eÈl\u009e\u009d{!\u007fÂ\u001aa\u0018ÐÉ>Ä\u0081¶t";
      int var7 = "*Éñg¯,Ä\u0081È\u009dâ+óTê´¨\u0014;\u0091{Ól õ9)Ûã:Mw\u001bì\u0091¶\u000b´=p\u0082\u0010{ãómî\u0001Nx)\bí\u0086'\u0092\u0006#He\u0099sÈ\"ÂTo\n1Á\u0012\u0014\u0010e¿\u0006îzÔ \u0096ë\u009f\u0016Uª»\u009au\u0010¨gjâÄ$æEõõ\u0081[9\u0016xihçgOÓ@J\u0083í;\u0099ó\u001cw%ó\u00109`ýÜÆ.0\u0011SÐ6Bòf¸ªD'\nJ[\u001a\u001d©\u008f¿\u0086ÄH¶\u0089þødÃ\u008d\u0096Cê\u0098åOg\"¦þ\u0088\tjÒ\u0012Ú$g \u0007Uätc-ó\u009cÃ\u0001êÏ\u0097f\u000eÈl\u009e\u009d{!\u007fÂ\u001aa\u0018ÐÉ>Ä\u0081¶t"
         .length();
      char var8 = 'H';
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
                     CONST_EB = var4;
                     CONST_FB = new String[6];
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

                  var6 = "»<ag\u0095Má\u0019\u001bÀþ\u0017\u0086íß\u00158\u001c\\\u008fÏà-(\u0090tï]ÜÁ\u0080ÿ wN°´üµj[\u0000Õ\u001fÂYYÆ\u0017¸\u0084M\u009f¿\u009aê\u008ac\u0085\u0087\\ëº\u0081©\u001bc\u008d\u0082PL\u008fþ";
                  var7 = "»<ag\u0095Má\u0019\u001bÀþ\u0017\u0086íß\u00158\u001c\\\u008fÏà-(\u0090tï]ÜÁ\u0080ÿ wN°´üµj[\u0000Õ\u001fÂYYÆ\u0017¸\u0084M\u009f¿\u009aê\u008ac\u0085\u0087\\ëº\u0081©\u001bc\u008d\u0082PL\u008fþ"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21130;
      if (CONST_FB[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_GB.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_GB.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cv", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_EB[var3].getBytes("ISO-8859-1");
         CONST_FB[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_FB[var3];
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
         throw new RuntimeException("rip/breeze/cv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
