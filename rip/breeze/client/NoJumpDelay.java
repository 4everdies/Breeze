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

@ModuleInfo(a = "NoJumpDelay", b = "Removes the jump delay, so holding down space button times jumps perfectly.", d = rip.breeze.ModuleCategory.MOVEMENT)
public class NoJumpDelay extends BreezeModule {
   private final GenericSetting<Integer> delaySetting;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public NoJumpDelay() {
      long var1 = 47141878203430L;
      super();
      short var10002 = 16650;
      long var10003 = 7945071700398176722L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Delay");
      var10002 = 11852;
      var10003 = 5659040573046494869L ^ var1;
      this.delaySetting = var10001.getDataBuilder50_3("The delay in ticks between jumps, the minecraft default is 10.")
         .getDataBuilder50_4(1)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(1, 10))
         .getDataBuilder54();
   }

   @EventListener
   public void processAll(PreTickEventEvent var1) {
      long var2 = 54581579291473L;
      if (MinecraftAccessor.getValue_7(BreezeClient.CONST_A.thePlayer) == 10) {
         MinecraftAccessor.initialize_73(BreezeClient.CONST_A.thePlayer, this.delaySetting.getObject_m());
      }
   }

   static {
      long var0 = 25331866718999L;
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
      String var6 = "Ö\u0093\u007fÌ\u0090\u0094|ï\u0001\u001d\nc}\u001a\f¹\u0013\u0000È±f ¦è5_Ì\u0016Ê¢ÿ\f\u0018\rèZÌ\u0003(M79¶>.-<\u009dç²L¶Ýüß\u0006)\"+K\u001eg\u0018®§K\u0002ü\u0013@»¸ #\u009f\u001aóôxq\u008eêm\"]\u000e[¹,æ\u0007Â5vC]\u0010øz³k\u001c\u0092É[\u001f¹/¡v\u0084ìE";
      int var7 = "Ö\u0093\u007fÌ\u0090\u0094|ï\u0001\u001d\nc}\u001a\f¹\u0013\u0000È±f ¦è5_Ì\u0016Ê¢ÿ\f\u0018\rèZÌ\u0003(M79¶>.-<\u009dç²L¶Ýüß\u0006)\"+K\u001eg\u0018®§K\u0002ü\u0013@»¸ #\u009f\u001aóôxq\u008eêm\"]\u000e[¹,æ\u0007Â5vC]\u0010øz³k\u001c\u0092É[\u001f¹/¡v\u0084ìE"
         .length();
      char var8 = '`';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_P = var4;
            CONST_Q = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15615;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dW", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/client/dW" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
