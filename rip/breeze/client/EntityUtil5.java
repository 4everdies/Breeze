package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public final class EntityUtil5 {
   private static final long eka_1;
   private static final int CONST_B;
   private static final long eka_2;
   private static final double CONST_D = 0.2;
   private static final long eka_3;
   private static final long eka_4;
   private static final long eka_6 = -1L;
   private static final long eka_5;
   private final ArrayDeque<long[]> arrayDeque_i;
   private final ArrayDeque<long[]> arrayDeque_j;
   private volatile double double_k;
   private volatile long fieldLong_l;
   private volatile long fieldLong_m;
   private volatile long fieldLong_n;
   private volatile double double_o;
   private volatile long fieldLong_p;
   private Object object_q;
   private volatile long fieldLong_r;
   private volatile long fieldLong_s;
   private volatile double double_t;
   private static LicenseState[] arr_u;
   private static final long[] CONST_W;
   private static final Long[] CONST_X;
   private static final Map CONST_Y;

   public EntityUtil5() {
      long var1 = 38586150094613L;
      super();
      this.arrayDeque_i = new ArrayDeque<>();
      this.arrayDeque_j = new ArrayDeque<>();
      this.double_k = -1.0;
      this.fieldLong_l = -1L;
      this.fieldLong_m = -1L;
      this.fieldLong_n = 0L;
      this.double_o = 0.0;
      this.fieldLong_p = -1L;
      this.fieldLong_r = 0L;
      this.fieldLong_s = 0L;
      this.double_t = 20.0;
   }

   void processAll(Packet<?> var1) {
      long var2 = 139526901115980L;
      boolean var4 = ConfigManager.checkCondition_3();
      if (var1 instanceof C0EPacketClickWindow) {
         C0EPacketClickWindow var5 = (C0EPacketClickWindow)var1;
         int var6 = var5.getWindowId();
         int var7 = var5.getSlotId();
         if (var7 < 0) {
            return;
         }

         int var8 = this.getHeldItem(var6, var7) ? 1 : 0;
         synchronized (this.arrayDeque_j) {
            this.arrayDeque_j.addLast(new long[]{System.currentTimeMillis(), var6, var7, var8, var5.getActionNumber()});

            while (this.arrayDeque_j.size() > 32) {
               this.arrayDeque_j.removeFirst();
               if (!var4) {
                  break;
               }
            }
         }
      }
   }

   private boolean getHeldItem(int var1, int var2) {
      long var3 = 40504914590664L;

      try {
         if (BreezeClient.CONST_A.thePlayer == null) {
            return true;
         }

         if (BreezeClient.CONST_A.thePlayer.inventory.getItemStack() != null) {
            return true;
         }

         try {
            if (BreezeClient.CONST_A.thePlayer.openContainer == null || BreezeClient.CONST_A.thePlayer.openContainer.windowId != var1) {
               return true;
            }
         } catch (Exception var7) {
            throw getException(var7);
         }

         try {
            if (var2 < 0 || var2 >= BreezeClient.CONST_A.thePlayer.openContainer.inventorySlots.size()) {
               return true;
            }
         } catch (Exception var6) {
            throw getException(var6);
         }

         return BreezeClient.CONST_A.thePlayer.openContainer.getSlot(var2).getHasStack();
      } catch (Exception var8) {
         return true;
      }
   }

   void calculate(Packet<?> var1) {
      long var2 = 98652854829033L;
      boolean var10000 = ConfigManager.checkCondition_3();
      long var4 = System.currentTimeMillis();
      boolean var6 = var10000;
      if (this.fieldLong_r != 0L && var4 - this.fieldLong_r > 2005459878809403872L) {
         long var7 = var4 - this.fieldLong_r;
         if (var7 >= 8368602775284006539L && var7 <= 30000L) {
            this.double_t = this.double_t * 0.8 + 1000.0 / var7 * 0.2;
         }

         this.fieldLong_s = var4;
      }

      this.fieldLong_r = var4;
      if (var1 instanceof S32PacketConfirmTransaction) {
         S32PacketConfirmTransaction var9 = (S32PacketConfirmTransaction)var1;
         long var10 = this.getLong(var4, var9.getWindowId(), var9.getActionNumber());
         if (var10 >= 0L) {
            this.clamp(var4 - var10, var4);
         }

         if (var6) {
            return;
         }
      }

      if (var1 instanceof S2FPacketSetSlot) {
         S2FPacketSetSlot var15 = (S2FPacketSetSlot)var1;
         int var12 = var15.func_149175_c();
         long var13 = var12 == -1 ? this.getLong_3(var4) : this.getLong_2(var4, var12, var15.func_149173_d());
         if (var13 >= 0L) {
            this.clamp(var4 - var13, var4);
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private long getLong(long var1, int var3, int var4) {
      long var5 = 106846074115139L;
      boolean var10000 = ConfigManager.isValid();
      ArrayDeque var7 = this.arrayDeque_j;
      synchronized (this.arrayDeque_j){} // $VF: monitorenter 
      boolean var8 = var10000;

      try {
         this.calculate_2(var1);
         Iterator var9 = this.arrayDeque_j.iterator();

         while (var9.hasNext()) {
            long[] var10 = (long[])var9.next();
            if (var10[1] == var3 && var10[4] == var4) {
               var9.remove();
               long var14 = var10[0];
               // $VF: monitorexit
               return var14;
            }

            if (var8) {
               break;
            }
         }

         long var15 = -1L;
         // $VF: monitorexit
         return var15;
      } finally {
         // $VF: monitorexit
      }
   }

   private void calculate_2(long var1) {
      long var3 = 93767864142806L;
      boolean var10000 = ConfigManager.isValid();
      Iterator var5 = this.arrayDeque_j.iterator();
      boolean var6 = var10000;

      while (var5.hasNext()) {
         if (var1 - ((long[])var5.next())[0] > 500L) {
            var5.remove();
            if (var6) {
               break;
            }
         }
      }
   }

   private long getLong_2(long var1, int var3, int var4) {
      long var5 = 93611684204563L;
      synchronized (this.arrayDeque_j) {
         this.calculate_2(var1);
         if (this.arrayDeque_j.size() != 1) {
            return -2L;
         }

         long[] var8 = this.arrayDeque_j.peekFirst();
         if (var8[1] != var3 || var8[2] != var4) {
            return -1L;
         }

         if (!this.isValid(var1 - var8[0])) {
            return -1L;
         }

         this.arrayDeque_j.removeFirst();
         return var8[0];
      }
   }

   private long getLong_3(long var1) {
      long var3 = 103526376861908L;
      synchronized (this.arrayDeque_j) {
         this.calculate_2(var1);
         if (this.arrayDeque_j.size() != 1) {
            return -8032841893929655497L;
         }

         long[] var6 = this.arrayDeque_j.peekFirst();
         if (var6[3] != 1L) {
            return -1L;
         }

         if (!this.isValid(var1 - var6[0])) {
            return -1L;
         }

         this.arrayDeque_j.removeFirst();
         return var6[0];
      }
   }

   private boolean isValid(long var1) {
      long var3 = 31162413201529L;
      return var1 < 8L ? false : this.double_k <= 0.0 || var1 >= this.double_k * 0.5;
   }

   private void clamp(long var1, long var3) {
      long var5 = 105818493629829L;
      boolean var7 = ConfigManager.checkCondition_3();
      if (var1 >= 0L && var1 <= 3058922697385332790L) {
         synchronized (this.arrayDeque_i) {
            this.arrayDeque_i.addLast(new long[]{var3, var1});
            long var9 = var3 - 5543981578672792923L;

            while (!this.arrayDeque_i.isEmpty() && (this.arrayDeque_i.size() > 20 || ((long[])this.arrayDeque_i.peekFirst())[0] < var9)) {
               this.arrayDeque_i.removeFirst();
               if (!var7) {
                  break;
               }
            }

            long var11 = -8989716679686728385L;

            for (long[] var14 : this.arrayDeque_i) {
               var11 = Math.min(var11, var14[1]);
               if (!var7) {
                  break;
               }
            }

            this.fieldLong_l = var11;
            if (this.fieldLong_p >= 0L) {
               double var15 = Math.abs(var1 - this.fieldLong_p);
               this.double_o = this.double_o <= 0.0 ? var15 : this.double_o + (var15 - this.double_o) / 16.0;
            }

            this.fieldLong_p = var1;
            this.double_k = this.double_k < 0.0 ? var11 : this.double_k * 0.8 + var11 * 0.2;
            this.fieldLong_m = var1;
            this.fieldLong_n = var3;
         }
      }
   }

   void processAll_2() {
      long var1 = 98517470424696L;
      NetHandlerPlayClient var3 = BreezeClient.CONST_A.getNetHandler();
      if (var3 != this.object_q) {
         this.object_q = var3;
         this.processAll_3();
      }

      synchronized (this.arrayDeque_j) {
         this.calculate_2(System.currentTimeMillis());
      }
   }

   public void processAll_3() {
      long var1 = 80181510786747L;
      synchronized (this.arrayDeque_j) {
         this.arrayDeque_j.clear();
      }

      synchronized (this.arrayDeque_i) {
         this.arrayDeque_i.clear();
      }

      this.double_k = -1.0;
      this.fieldLong_l = -1L;
      this.fieldLong_m = -1L;
      this.fieldLong_n = 0L;
      this.double_o = 0.0;
      this.fieldLong_p = -1L;
      this.fieldLong_r = 0L;
      this.fieldLong_s = 0L;
      this.double_t = 20.0;
   }

   public int getValue() {
      long var1 = 127371842198896L;
      if (BreezeClient.getKeybindSettings().isValid_5()) {
         return this.getValue_2();
      } else if (BreezeClient.CONST_A.thePlayer != null && BreezeClient.CONST_A.getNetHandler() != null) {
         NetworkPlayerInfo var3 = BreezeClient.CONST_A.getNetHandler().getPlayerInfo(BreezeClient.CONST_A.thePlayer.getUniqueID());
         return var3 != null ? var3.getResponseTime() : -1;
      } else {
         return -1;
      }
   }

   public int getValue_2() {
      long var1 = 7074760813435L;
      return this.double_k < 0.0 ? -1 : (int)Math.round(this.double_k);
   }

   public long getLong_4() {
      long var1 = 121932873419614L;
      return this.fieldLong_n == 0L ? -1L : System.currentTimeMillis() - this.fieldLong_n;
   }

   public int getValue_3() {
      return (int)this.fieldLong_l;
   }

   public int getValue_4() {
      return (int)this.fieldLong_m;
   }

   public int getValue_5() {
      return (int)Math.round(this.double_o);
   }

   public double getDouble_t() {
      return this.double_t;
   }

   public long getLong_5() {
      long var1 = 99488350166221L;
      return this.fieldLong_s == 0L ? -1L : System.currentTimeMillis() - this.fieldLong_s;
   }

   public static void initialize(LicenseState[] var0) {
      arr_u = var0;
   }

   public static LicenseState[] values() {
      return arr_u;
   }

   static {
      LicenseState[] var10000 = new LicenseState[5];
      long var0 = 104047187678535L;
      initialize(var10000);
      Cipher var2;
      Cipher var21 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var21.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var6 = -6118374195134811691L;
      byte[] var8 = var2.doFinal(
         new byte[]{
            (byte)(var6 >>> 56),
            (byte)(var6 >>> 48),
            (byte)(var6 >>> 40),
            (byte)(var6 >>> 32),
            (byte)(var6 >>> 24),
            (byte)(var6 >>> 16),
            (byte)(var6 >>> 8),
            (byte)var6
         }
      );
      long var27 = (var8[0] & 255L) << 56
         | (var8[1] & 255L) << 48
         | (var8[2] & 255L) << 40
         | (var8[3] & 255L) << 32
         | (var8[4] & 255L) << 24
         | (var8[5] & 255L) << 16
         | (var8[6] & 255L) << 8
         | var8[7] & 255L;
      int var10001 = -1;
      long var4 = var27;
      CONST_B = (int)var4;
      CONST_Y = new HashMap(13);
      Cipher var9;
      Cipher var22 = var9 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var10 = 1; var10 < 8; var10++) {
         var10003[var10] = (byte)(var0 << var10 * 8 >>> 56);
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var11 = new long[17];
      int var12 = 0;
      String var13 = "®\u0087 !é\u000foBM¬\u009eúÿ(\u0099{\u00959×ò2Nö\u0000Î\u0018\u0086\u0095öæÖ?¿\u0081}PØI»ßçz\u0003\u0015\u0001Â_\u0011TE&´ûKÜ\u0000Î°%Ô\u001a.8\u0016LzÓeRMIyXË$Ë8\u0017z\u0018<\u008e\u007f\u008fÜ7Ý\u009côe5m£Ñ4LM\u001d\u001f²\u007f|çJü~\u0088\u0005n\u0018\\õ¾pµ¨\u0006^\u0086¾";
      int var14 = "®\u0087 !é\u000foBM¬\u009eúÿ(\u0099{\u00959×ò2Nö\u0000Î\u0018\u0086\u0095öæÖ?¿\u0081}PØI»ßçz\u0003\u0015\u0001Â_\u0011TE&´ûKÜ\u0000Î°%Ô\u001a.8\u0016LzÓeRMIyXË$Ë8\u0017z\u0018<\u008e\u007f\u008fÜ7Ý\u009côe5m£Ñ4LM\u001d\u001f²\u007f|çJü~\u0088\u0005n\u0018\\õ¾pµ¨\u0006^\u0086¾"
         .length();
      byte var15 = 0;

      label29:
      while (true) {
         var10001 = var15;
         var15 += 8;
         byte[] var16 = var13.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var23 = var11;
         var10001 = var12++;
         long var29 = (var16[0] & 255L) << 56
            | (var16[1] & 255L) << 48
            | (var16[2] & 255L) << 40
            | (var16[3] & 255L) << 32
            | (var16[4] & 255L) << 24
            | (var16[5] & 255L) << 16
            | (var16[6] & 255L) << 8
            | var16[7] & 255L;
         byte var32 = -1;

         while (true) {
            long var17 = var29;
            byte[] var19 = var9.doFinal(
               new byte[]{
                  (byte)(var17 >>> 56),
                  (byte)(var17 >>> 48),
                  (byte)(var17 >>> 40),
                  (byte)(var17 >>> 32),
                  (byte)(var17 >>> 24),
                  (byte)(var17 >>> 16),
                  (byte)(var17 >>> 8),
                  (byte)var17
               }
            );
            long var34 = (var19[0] & 255L) << 56
               | (var19[1] & 255L) << 48
               | (var19[2] & 255L) << 40
               | (var19[3] & 255L) << 32
               | (var19[4] & 255L) << 24
               | (var19[5] & 255L) << 16
               | (var19[6] & 255L) << 8
               | var19[7] & 255L;
            switch (var32) {
               case 0:
                  var23[var10001] = var34;
                  if (var15 >= var14) {
                     CONST_W = var11;
                     CONST_X = new Long[17];
                     return;
                  }
                  break;
               default:
                  var23[var10001] = var34;
                  if (var15 < var14) {
                     continue label29;
                  }

                  var13 = "\u001eVÊP\u008f\u001f£\u0005\u0003t}ãQ2Wª";
                  var14 = "\u001eVÊP\u008f\u001f£\u0005\u0003t}ãQ2Wª".length();
                  var15 = 0;
            }

            byte var26 = var15;
            var15 += 8;
            var16 = var13.substring(var26, var15).getBytes("ISO-8859-1");
            var23 = var11;
            var10001 = var12++;
            var29 = (var16[0] & 255L) << 56
               | (var16[1] & 255L) << 48
               | (var16[2] & 255L) << 40
               | (var16[3] & 255L) << 32
               | (var16[4] & 255L) << 24
               | (var16[5] & 255L) << 16
               | (var16[6] & 255L) << 8
               | var16[7] & 255L;
            var32 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
      return var0;
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32708;
      if (CONST_X[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_W[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_Y.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/eq", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_X[var3] = var14;
      }

      return CONST_X[var3];
   }

   private static long getLong_6(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong_6".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/eq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
