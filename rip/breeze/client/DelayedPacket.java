package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import rip.breeze.ScriptObject;
import rip.breeze.StringDecryptor;

@ScriptObject(name = "DelayedPacket", description = "A packet that is delayed until we release it.", group = "breeze/spoof")
public class DelayedPacket extends rip.breeze.HttpUtil4 {
   public Packet packet_g;
   public long fieldLong_h;
   public EnumType19 enum_IN_i;
   public HashSet<IBreezeInterface3> hashSet_j = new HashSet<>();
   public HashSet<IBreezeInterface3> hashSet_k = new HashSet<>();
   public NetworkManager networkManager_l;
   private static String[] arr_m;
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);

   public DelayedPacket(Packet var1, long var2, EnumType19 var4, HashSet<IBreezeInterface3> var5, NetworkManager var6) {
      this.packet_g = var1;
      this.fieldLong_h = var2;
      this.enum_IN_i = var4;
      this.hashSet_j = var5;
      this.networkManager_l = var6;
   }

   private boolean isValid() {
      this.hashSet_j.removeAll(this.hashSet_k);
      this.hashSet_k.clear();
      return this.hashSet_j.isEmpty();
   }

   public boolean isValid_2(IBreezeInterface3 var1) {
      return this.hashSet_j.contains(var1);
   }

   @JSFunction(value = "direction", description = "Returns the direction of the packet, either IN or OUT.", forceType = "PacketDirection")
   public String getString() {
      long var1 = 48681584431821L;
      return this.enum_IN_i == EnumType19.CONST_IN
         ? "IN"
         : "OUT";
   }

   @JSGetter(value = "time", description = "The original time this packet was send.")
   public long getLong_h() {
      return this.fieldLong_h;
   }

   @JSGetter(value = "packet", description = "The packet that has been delayed.")
   public rip.breeze.PacketUtil14<?> getDataBuilder26() {
      return new rip.breeze.PacketUtil14(this.packet_g);
   }

   @JSFunction(
      value = "hasAged",
      description = "Checks if this packet has aged beyond the specified time.",
      params = "The number of milliseconds.",
      returns = "True if this packet has aged beyond the given time, false otherwise."
   )
   public boolean isValid_3(long var1) {
      long var3 = 2091472083036L;
      return System.currentTimeMillis() - this.fieldLong_h > var1;
   }

   public void update(IBreezeInterface3 var1) {
      long var2 = 55719176274669L;
      if (!this.hashSet_k.contains(var1)) {
         this.hashSet_k.add(var1);
      }
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "DelayedPacket";
   }

   static boolean isValid_4(DelayedPacket var0) {
      return var0.isValid();
   }

   public static void initialize(String[] var0) {
      arr_m = var0;
   }

   public static String[] getStringArray() {
      return arr_m;
   }

   static {
      String[] var10000 = new String[2];
      initialize(var10000);
      long var0 = 61209841048463L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "\u007f¥ë5Wâ\u0099\u0098VOln\u009fä\u008f;ûÉ\u009dÛY¿\u0012å\u0010~2å\u0091ñXÈ%^Æ\u0087%´º©\u008f\u0010|ÅÃy-³\u00805\u0086\u009fÛ¥d8\u000bW";
      int var7 = "\u007f¥ë5Wâ\u0099\u0098VOln\u009fä\u008f;ûÉ\u009dÛY¿\u0012å\u0010~2å\u0091ñXÈ%^Æ\u0087%´º©\u008f\u0010|ÅÃy-³\u00805\u0086\u009fÛ¥d8\u000bW"
         .length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_O = var4;
            CONST_P = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28824;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/de", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/client/de" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
