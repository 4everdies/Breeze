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
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.Include;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Freecam", b = "Disconnects the camera from the player and lets you look around freely.", d = rip.breeze.ModuleCategory.MISC, c = "spectator")
public class Freecam extends BreezeModule {
   private final GenericSetting<Double> speedSetting;
   private FakeEntity clientUtil122_o;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public Freecam() {
      long var1 = 28745054508321L;
      super();
      short var10002 = 2306;
      long var10003 = 7135649835317642063L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Speed");
      var10002 = 9967;
      var10003 = 5196471330467802275L ^ var1;
      this.speedSetting = var10001.getDataBuilder50_3("How fast the camera can move.")
         .getDataBuilder50_4(1.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.2, 2.0))
         .getDataBuilder54();
   }

   @Override
   public void processNullable() {
      long var1 = 73912092874623L;
      if (BreezeContext.moduleBase_a == null
         || BreezeContext.moduleBase_a.getModuleByClass(FreeLook.class) == null
         || BreezeContext.moduleBase_a.getModuleByClass(FreeLook.class).f()) {
         this.b(false);
      }
   }

   public void processNullable_2() {
      long var1 = 23436370995847L;
      if (BreezeClient.CONST_A.thePlayer != null) {
         BreezeClient.CONST_A.setRenderViewEntity(BreezeClient.CONST_A.thePlayer);
         BreezeClient.CONST_A.thePlayer.movementInput = new MovementInputFromOptions(BreezeClient.CONST_A.gameSettings);
      }

      if (this.clientUtil122_o != null) {
         this.clientUtil122_o = null;
      }
   }

   @EventListener
   public void update(WorldChangedEventEvent var1) {
      this.b(false);
   }

   @EventListener
   public void processNullable_3(PreTickEventEvent var1) {
      long var2 = 138948026815967L;
      if (BreezeClient.CONST_A.thePlayer.ticksExisted == 0) {
         this.b(false);
      } else {
         if (this.clientUtil122_o != null) {
            this.clientUtil122_o.calculate(this.speedSetting.getObject_m());
         }
      }
   }

   @EventListener
   public void processNullable_4(AngleUpdateEventEvent var1) {
      long var2 = 38737711045568L;
      if (this.clientUtil122_o != null && !var1.g) {
         this.clientUtil122_o.calculate_2(var1.getFloat_h(), var1.getFloat_i());
         var1.a();
      }
   }

   @EventListener
   @Include
   public void processNullable_5(Render2DEventEvent var1) {
      long var2 = 114202218663872L;
      if (BreezeClient.CONST_A.thePlayer != null) {
         if (this.clientUtil122_o == null) {
            this.clientUtil122_o = new FakeEntity(this, BreezeClient.CONST_A.theWorld);
            this.clientUtil122_o
               .applyRotation(
                  BreezeClient.CONST_A.thePlayer.posX,
                  BreezeClient.CONST_A.thePlayer.posY,
                  BreezeClient.CONST_A.thePlayer.posZ,
                  BreezeClient.CONST_A.thePlayer.rotationYaw,
                  BreezeClient.CONST_A.thePlayer.rotationPitch
               );
            BreezeClient.CONST_A.setRenderViewEntity(this.clientUtil122_o);
            MovementInput var4 = new MovementInput();
            var4.sneak = BreezeClient.CONST_A.thePlayer.movementInput.sneak;
            BreezeClient.CONST_A.thePlayer.movementInput = var4;
         }
      }
   }

   @EventListener
   public void processNullable_6(MouseClickedEventEvent var1) {
      long var2 = 62699379186094L;
      if (this.clientUtil122_o != null) {
         var1.a();
      }
   }

   static {
      long var0 = 112475474230787L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "ß\u001b<!\u001d5Áªp2\u0012\u0014Úéy}_í\u0092%´$G\u0007\u0086Ø\u001dñAËSÖþ'êÝ\u0011¼\u0091\u009c\u001d\u0096\u0096Jy¤Kµ\u0010\u001d\u0098\u0006mþËÒú¤S¥·\u0004\u00858¯";
      int var7 = "ß\u001b<!\u001d5Áªp2\u0012\u0014Úéy}_í\u0092%´$G\u0007\u0086Ø\u001dñAËSÖþ'êÝ\u0011¼\u0091\u009c\u001d\u0096\u0096Jy¤Kµ\u0010\u001d\u0098\u0006mþËÒú¤S¥·\u0004\u00858¯"
         .length();
      char var8 = '0';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_Q = var4;
            CONST_R = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8045;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dN", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/client/dN" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
