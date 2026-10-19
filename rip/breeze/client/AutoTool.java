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
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "AutoTool", b = "Automatically selects the best tool for the block you are breaking.", d = rip.breeze.ModuleCategory.MISC)
public class AutoTool extends BreezeModule {
   private final GenericSetting<Boolean> switchBackSetting;
   private final GenericSetting<Boolean> combatPauseSetting;
   private final GenericSetting<rip.breeze.RangeValue> delaySetting;
   private final GenericSetting<Boolean> sneakOnlySetting;
   private final Util133 dataBuilder112_r;
   private int fieldInt_s;
   private int fieldInt_t;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public AutoTool() {
      long var1 = 34034481172202L;
      super();
      short var10002 = 423;
      long var10003 = 4189151418104685229L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "SwitchBack");
      var10002 = 13135;
      var10003 = 674802824774160452L ^ var1;
      this.switchBackSetting = var10001.getDataBuilder50_3("Switch back to the previous slot after mining.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 7610;
      var10003 = 6501277127227489970L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "CombatPause");
      var10002 = 32387;
      var10003 = 6009761867580693898L ^ var1;
      this.combatPauseSetting = var10001.getDataBuilder50_3("Pauses the module when you are in combat.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 7155;
      var10003 = 8480827468354238718L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Delay");
      var10002 = 24089;
      var10003 = 3099974322789088533L ^ var1;
      this.delaySetting = var10001.getDataBuilder50_3("The delay between switching tools.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(100.0, 250.0))
         .clamp(rip.breeze.RangeValue.getPredicate_3(0, 500))
         .getDataBuilder54();
      var10002 = 24954;
      var10003 = 4224056905469182581L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SneakOnly");
      var10002 = 9071;
      var10003 = 3086558717960552545L ^ var1;
      this.sneakOnlySetting = var10001.getDataBuilder50_3("Only switch tools when sneaking.").getDataBuilder50_4(false).getDataBuilder54();
      this.dataBuilder112_r = new Util133();
      this.fieldInt_s = -1;
   }

   private void openScreen() {
      long var1 = 63732709586027L;
      if (this.fieldInt_s == -1) {
         this.dataBuilder112_r.getDataBuilder112();
      } else if (!this.switchBackSetting.getObject_m()) {
         this.fieldInt_s = -1;
         this.dataBuilder112_r.getDataBuilder112();
      } else {
         if (this.dataBuilder112_r.isValid(this.fieldInt_t)) {
            BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_s;
            this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
            this.fieldInt_s = -1;
            this.dataBuilder112_r.getDataBuilder112();
         }
      }
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 113052909810972L;
      int var10000 = AntiBot.getValue();
      boolean var4 = PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindAttack);
      int var5 = var10000;
      if (!var4 || BreezeClient.CONST_A.currentScreen != null) {
         this.openScreen();
      } else if (this.combatPauseSetting.getObject_m() && BreezeClient.getThemeManager().getEntity() != null) {
         this.openScreen();
      } else {
         int var6 = -1;
         if (BreezeClient.CONST_A.objectMouseOver == null
            || BreezeClient.CONST_A.objectMouseOver.getBlockPos() == null
            || BreezeClient.getThemeManager().getEntity() != null) {
            if (this.fieldInt_s != -1) {
               this.openScreen();
               return;
            }

            var6 = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
         }

         float var7 = 1.0F;
         if (var6 == -1) {
            int var8 = 0;

            while (var8 < 9) {
               if (BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var8) != null || var5 != 0) {
                  float var9 = BreezeClient.CONST_A
                     .thePlayer
                     .inventory
                     .getStackInSlot(var8)
                     .getStrVsBlock(BreezeClient.CONST_A.theWorld.getBlockState(BreezeClient.CONST_A.objectMouseOver.getBlockPos()).getBlock());
                  if (var9 > var7) {
                     var7 = var9;
                     var6 = var8;
                  }
               }

               var8++;
               if (var5 != 0) {
                  break;
               }
            }
         }

         if (var6 != -1) {
            if (!this.sneakOnlySetting.getObject_m() || BreezeClient.CONST_A.thePlayer.isSneaking()) {
               if (this.dataBuilder112_r.isValid(this.fieldInt_t)) {
                  if (this.fieldInt_s == -1) {
                     this.fieldInt_s = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                  }

                  this.dataBuilder112_r.getDataBuilder112();
                  this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
                  if (BreezeClient.CONST_A.thePlayer.inventory.currentItem == var6) {
                     return;
                  }

                  BreezeClient.CONST_A.thePlayer.inventory.currentItem = var6;
                  if (var5 == 0) {
                     return;
                  }
               }

               if (BreezeClient.CONST_A.thePlayer.inventory.currentItem == var6) {
                  this.dataBuilder112_r.getDataBuilder112();
               }
            }
         }
      }
   }

   static {
      long var0 = 14140834002403L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "é'\u0098\u008coªY*5i ò\u007f\u009fØÐTg|§Ó{©LÄá\u009aåP9\u008a8¿î¢\u0013\u008bt]o\u008dùz\u001eO\u008bjå\u0002Oå\u0096.×·\bt\u008a¯,Z\\\u008c¶\u0010åÍ³\u0097éj\u000eØ\u0004é-\u0096äÑþ,@ªaÈéa\u001fk\u009fO\u009e\u001f¡\u009fI\u0001À,Ó\u008f{a6çZBH\u000e\u0000\u0096i«X\u0000R\fÜ\u007fé¡M#{2ô@eq¿,ÃX³ÏBàôE0µÏÚºiF æ<S\u008eë!)9ùeéMÿ¦Hì\u0014ôò\u008a\u0085Ü/^O£ÿ\u0097{\\»v ^;G«\u0002\u0000\u008d¼±\u0019O\fn(ÍÆj\u001ee!Y5\u001di\u001c\u0013å´ \u008f5ÔP7·Ñb\u000f\u0010ú/\ró\u009e\u000b\u009d\u0005ø¶|aÀ§\néí\u0085\u0096îáb\u0083S¼é,\u008c<\n\u008c_ÛEÌ\u0004b9\u0015²c\u0013Ð@Ï»\u0096\u0013ÄSMÇÞ±\u009bXð\u0082©\u0014dòÆÒ\u0016\u0086Ûi\u0088í\u008fî^\u0093";
      int var7 = "é'\u0098\u008coªY*5i ò\u007f\u009fØÐTg|§Ó{©LÄá\u009aåP9\u008a8¿î¢\u0013\u008bt]o\u008dùz\u001eO\u008bjå\u0002Oå\u0096.×·\bt\u008a¯,Z\\\u008c¶\u0010åÍ³\u0097éj\u000eØ\u0004é-\u0096äÑþ,@ªaÈéa\u001fk\u009fO\u009e\u001f¡\u009fI\u0001À,Ó\u008f{a6çZBH\u000e\u0000\u0096i«X\u0000R\fÜ\u007fé¡M#{2ô@eq¿,ÃX³ÏBàôE0µÏÚºiF æ<S\u008eë!)9ùeéMÿ¦Hì\u0014ôò\u008a\u0085Ü/^O£ÿ\u0097{\\»v ^;G«\u0002\u0000\u008d¼±\u0019O\fn(ÍÆj\u001ee!Y5\u001di\u001c\u0013å´ \u008f5ÔP7·Ñb\u000f\u0010ú/\ró\u009e\u000b\u009d\u0005ø¶|aÀ§\néí\u0085\u0096îáb\u0083S¼é,\u008c<\n\u008c_ÛEÌ\u0004b9\u0015²c\u0013Ð@Ï»\u0096\u0013ÄSMÇÞ±\u009bXð\u0082©\u0014dòÆÒ\u0016\u0086Ûi\u0088í\u008fî^\u0093"
         .length();
      char var8 = '@';
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
                     CONST_W = new String[8];
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

                  var6 = "õ%\u00105ì\u0089¿×m\u001b«IêðìG\u008fwLbfè\u0007U\u001cû\t÷\r:ltH\u008e\u0014Î\u0081øïGrË!R2@\u0018<x\u0014àJ{\u0018\u0003\u0083>Ü1ã\u0016Iè»\u001f\u0016ÙââC\u0015¬ôäÞð¸NáO#$\u001a\u008eSe\u000f)Ý\\¯\u007fÎm\u0080Ù|ivÎì\u007f3\u00943";
                  var7 = "õ%\u00105ì\u0089¿×m\u001b«IêðìG\u008fwLbfè\u0007U\u001cû\t÷\r:ltH\u008e\u0014Î\u0081øïGrË!R2@\u0018<x\u0014àJ{\u0018\u0003\u0083>Ü1ã\u0016Iè»\u001f\u0016ÙââC\u0015¬ôäÞð¸NáO#$\u001a\u008eSe\u000f)Ý\\¯\u007fÎm\u0080Ù|ivÎì\u007f3\u00943"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11750;
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
            throw new RuntimeException("rip/breeze/client/dI", var10);
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
         throw new RuntimeException("rip/breeze/client/dI" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
