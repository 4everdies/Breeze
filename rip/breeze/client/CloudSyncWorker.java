package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.StringDecryptor;

public final class CloudSyncWorker {
   private static final int CONST_A;
   private static final int CONST_B;
   private final Map<Object, Set<Block>> map_c = new ConcurrentHashMap<>();
   private volatile boolean[] arr_d = new boolean[4096];
   private volatile boolean fieldBool_e;
   private final Map<Long, BlockUtil9> map_f = new ConcurrentHashMap<>();
   private final Set<Long> set_g = ConcurrentHashMap.newKeySet();
   private final Set<Long> set_h = ConcurrentHashMap.newKeySet();
   private volatile boolean fieldBool_i;
   private static int[] arr_j;
   private static final long[] CONST_L;
   private static final Long[] CONST_M;
   private static final Map CONST_N;

   public CloudSyncWorker() {
      EventBus.processAll(this);
   }

   public void update(Object var1, Set<Block> var2) {
      long var3 = 121803637125519L;
      if (var2.isEmpty()) {
         this.processNullable(var1);
      } else {
         this.map_c.put(var1, new HashSet<>(var2));
         this.toggle();
      }
   }

   public void processNullable(Object var1) {
      long var2 = 65921783886107L;
      if (this.map_c.remove(var1) != null) {
         this.toggle();
      }
   }

   public BlockUtil9 getDataBuilder30(int var1, int var2) {
      return this.map_f.get(getLong(var1, var2));
   }

   public Collection<BlockUtil9> getCollection() {
      return this.map_f.values();
   }

   public boolean checkCondition(int var1, int var2, int var3, Block var4) {
      long var5 = 70648020374468L;
      BlockUtil9 var7 = this.map_f.get(getLong(var1 >> 4, var3 >> 4));
      return var7 != null && var7.checkCondition(getLong_2(var1, var2, var3), var4);
   }

   private void toggle() {
      long var1 = 10418814382554L;
      boolean var10000 = ConfigManager.checkCondition_3();
      boolean[] var3 = new boolean[4096];
      boolean var4 = false;
      Iterator var5 = this.map_c.values().iterator();
      boolean var6 = var10000;

      label28:
      while (var5.hasNext()) {
         Set var7 = (Set)var5.next();
         Iterator var8 = var7.iterator();

         while (true) {
            if (var8.hasNext()) {
               Block var9 = (Block)var8.next();
               int var10 = Block.getIdFromBlock(var9);
               if (var10 < 0 || var10 >= 4096) {
                  continue;
               }

               var3[var10] = true;
               var4 = true;
               if (var6) {
                  continue;
               }
            }

            if (!var6) {
               break label28;
            }
            break;
         }
      }

      this.arr_d = var3;
      this.fieldBool_e = var4;
      this.fieldBool_i = true;
   }

   private boolean checkCondition_2(Block var1) {
      long var2 = 39072229272502L;
      int var4 = Block.getIdFromBlock(var1);
      boolean[] var5 = this.arr_d;
      return var4 >= 0 && var4 < var5.length && var5[var4];
   }

   @EventListener
   public void processNullable_2(PacketReceiveEventEvent var1) {
      long var2 = 105510217229322L;
      boolean var4 = ConfigManager.checkCondition_3();
      if (this.fieldBool_e) {
         Packet var5 = var1.packet_h;
         if (var5 instanceof S21PacketChunkData) {
            label41: {
               S21PacketChunkData var6 = (S21PacketChunkData)var5;
               long var7 = getLong(var6.getChunkX(), var6.getChunkZ());
               byte[] var9 = var6.getExtractedDataBytes();
               if (var9 == null || var9.length == 0) {
                  this.set_h.add(var7);
                  if (var4) {
                     break label41;
                  }
               }

               this.set_g.add(var7);
            }

            if (var4) {
               return;
            }
         }

         if (var5 instanceof S26PacketMapChunkBulk) {
            S26PacketMapChunkBulk var11 = (S26PacketMapChunkBulk)var5;
            int var10 = 0;

            while (var10 < var11.getChunkCount()) {
               this.set_g.add(getLong(var11.getChunkX(var10), var11.getChunkZ(var10)));
               var10++;
               if (!var4) {
                  break;
               }
            }
         }
      }
   }

   @EventListener
   public void processAll(PreTickEventEvent var1) {
      long var2 = 17646386446574L;
      boolean var4 = ConfigManager.checkCondition_3();
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         if (!this.fieldBool_e) {
            if (!this.map_f.isEmpty()) {
               this.map_f.clear();
            }

            this.set_g.clear();
            this.set_h.clear();
         } else {
            if (this.fieldBool_i) {
               this.fieldBool_i = false;
               this.map_f.clear();
               this.calculate_2();
            }

            Iterator var5 = this.set_h.iterator();

            while (var5.hasNext()) {
               long var6 = (Long)var5.next();
               var5.remove();
               if (this.getChunk(getValue(var6), getValue_2(var6)) == null) {
                  if (this.map_f.remove(var6) != null) {
                     this.calculate_4(getValue(var6), getValue_2(var6));
                  }

                  this.set_g.remove(var6);
                  if (!var4) {
                     break;
                  }
               }
            }

            int var12 = 12;
            Iterator var8 = this.set_g.iterator();

            while (var8.hasNext() && var12 > 0) {
               long var9 = (Long)var8.next();
               Chunk var11 = this.getChunk(getValue(var9), getValue_2(var9));
               if (var11 != null) {
                  var8.remove();
                  this.calculate(var11);
                  var12--;
                  if (!var4) {
                     break;
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void processNullable_3(ScriptRenderEvent var1) {
      long var2 = 133502040641337L;
      if (this.fieldBool_e && BreezeClient.CONST_A.theWorld != null) {
         BlockPos var4 = var1.blockPos_g;
         long var5 = getLong(var4.getX() >> 4, var4.getZ() >> 4);
         boolean var7 = this.checkCondition_2(var1.iBlockState_h.getBlock());
         BlockUtil9 var8 = this.map_f.get(var5);
         if (!var7) {
            if (var8 != null) {
               if (var8.checkCondition_2(var4)) {
                  if (var8.isValid()) {
                     this.map_f.remove(var5);
                  }

                  this.calculate_3(var4);
               }
            }
         } else {
            if (var8 == null) {
               var8 = new BlockUtil9(var4.getX() >> 4, var4.getZ() >> 4);
               this.map_f.put(var5, var8);
            }

            var8.processAll_1(var4, var1.iBlockState_h);
            this.calculate_3(var4);
         }
      }
   }

   @EventListener
   public void processAll(WorldChangedEventEvent var1) {
      this.map_f.clear();
      this.set_g.clear();
      this.set_h.clear();
   }

   private void calculate(Chunk var1) {
      long var2 = 138151071790975L;
      boolean[] var4 = this.arr_d;
      long var5 = getLong(var1.xPosition, var1.zPosition);
      boolean var10000 = ConfigManager.isValid();
      BlockUtil9 var7 = new BlockUtil9(var1.xPosition, var1.zPosition);
      int var8 = var1.xPosition << 4;
      int var9 = var1.zPosition << 4;
      boolean var10 = var10000;

      for (ExtendedBlockStorage var14 : var1.getBlockStorageArray()) {
         if (var14 != null && !var14.isEmpty()) {
            char[] var15 = var14.getData();
            int var16 = var14.getYLocation();
            int var17 = 0;

            while (var17 < var15.length) {
               char var18 = var15[var17];
               if (var18 != 0) {
                  int var19 = var18 >> 4;
                  if (var19 < var4.length && var4[var19]) {
                     int var20 = var17 & 15;
                     int var21 = var17 >> 4 & 15;
                     int var22 = var17 >> 8 & 15;
                     var7.processAll(getLong_2(var8 + var20, var16 + var22, var9 + var21), var14.get(var20, var22, var21));
                  }
               }

               var17++;
               if (var10) {
                  break;
               }
            }
         }

         if (var10) {
            break;
         }
      }

      BlockUtil9 var23 = var7.isValid() ? this.map_f.remove(var5) : this.map_f.put(var5, var7);
      if (var23 != null || !var7.isValid()) {
         this.calculate_4(var1.xPosition, var1.zPosition);
      }
   }

   private void calculate_2() {
      long var1 = 106129609646583L;
      int var3 = BreezeClient.CONST_A.gameSettings.renderDistanceChunks + 2;
      int var4 = MathHelper.floor_double(BreezeClient.CONST_A.thePlayer.posX) >> 4;
      int var5 = MathHelper.floor_double(BreezeClient.CONST_A.thePlayer.posZ) >> 4;
      boolean var10000 = ConfigManager.isValid();
      int var6 = var4 - var3;
      boolean var7 = var10000;

      while (var6 <= var4 + var3) {
         int var8 = var5 - var3;

         while (true) {
            if (var8 <= var5 + var3) {
               if (this.getChunk(var6, var8) != null) {
                  this.set_g.add(getLong(var6, var8));
               }

               var8++;
               if (!var7) {
                  continue;
               }
            }

            var6++;
            if (var7) {
               return;
            }
            break;
         }
      }
   }

   private Chunk getChunk(int var1, int var2) {
      long var3 = 119748216962869L;
      if (BreezeClient.CONST_A.theWorld == null) {
         return null;
      } else {
         IChunkProvider var5 = BreezeClient.CONST_A.theWorld.getChunkProvider();
         if (var5 != null && var5.chunkExists(var1, var2)) {
            Chunk var6 = var5.provideChunk(var1, var2);
            return var6 != null && !var6.isEmpty() ? var6 : null;
         } else {
            return null;
         }
      }
   }

   private void calculate_3(BlockPos var1) {
      long var2 = 45329677670390L;
      int var4 = var1.getX() >> 4;
      int var5 = var1.getZ() >> 4;
      this.calculate_5(var4, var5);
      int var6 = var1.getX() & 15;
      int var7 = var1.getZ() & 15;
      if (var6 == 0) {
         this.calculate_5(var4 - 1, var5);
      }

      if (var6 == 15) {
         this.calculate_5(var4 + 1, var5);
      }

      if (var7 == 0) {
         this.calculate_5(var4, var5 - 1);
      }

      if (var7 == 15) {
         this.calculate_5(var4, var5 + 1);
      }
   }

   private void calculate_4(int var1, int var2) {
      this.calculate_5(var1 - 1, var2);
      this.calculate_5(var1 + 1, var2);
      this.calculate_5(var1, var2 - 1);
      this.calculate_5(var1, var2 + 1);
   }

   private void calculate_5(int var1, int var2) {
      long var3 = 130994253241558L;
      BlockUtil9 var5 = this.map_f.get(getLong(var1, var2));
      if (var5 != null) {
         var5.fieldInt_d++;
      }
   }

   public static long getLong(int var0, int var1) {
      long var2 = 125938165869536L;
      return var0 & 4294967295L | (var1 & 4294967295L) << 32;
   }

   public static int getValue(long var0) {
      long var2 = 12157173911150L;
      return (int)(var0 & 4294967295L);
   }

   public static int getValue_2(long var0) {
      return (int)(var0 >>> 32);
   }

   public static long getLong_2(int var0, int var1, int var2) {
      long var3 = 92173563992117L;
      return (var0 & 67108863L) << 38
         | (var1 & 4095L) << 26
         | var2 & 67108863L;
   }

   public static int getValue_3(long var0) {
      return (int)(var0 << 0 >> 38);
   }

   public static int getValue_4(long var0) {
      return (int)(var0 << 26 >> 52);
   }

   public static int getValue_5(long var0) {
      return (int)(var0 << 38 >> 38);
   }

   public static void initialize(int[] var0) {
      arr_j = var0;
   }

   public static int[] values() {
      return arr_j;
   }

   static {
      long var0 = 110083981718039L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "±\u0001\u0095\u001cÿy\u001c\u0094]¤\u00ad\u0089ûÎ8\u001a";
      int var7 = "±\u0001\u0095\u001cÿy\u001c\u0094]¤\u00ad\u0089ûÎ8\u001a".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var34 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_A = (int)var4[0];
      CONST_B = (int)var4[1];
      CONST_N = new HashMap(13);
      Cipher var13;
      var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var0 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var15 = new long[5];
      int var16 = 0;
      String var17 = "ü\u0091®¡°X\u0086û¯\nÏ\u0014\u008d_\n\u009ds1\u001f\u0005\u0083]\u000e-";
      int var18 = "ü\u0091®¡°X\u0086û¯\nÏ\u0014\u008d_\n\u009ds1\u001f\u0005\u0083]\u000e-".length();
      byte var19 = 0;

      label31:
      while (true) {
         int var28 = var19;
         var19 += 8;
         byte[] var20 = var17.substring(var28, var19).getBytes("ISO-8859-1");
         long[] var26 = var15;
         var28 = var16++;
         long var32 = (var20[0] & 255L) << 56
            | (var20[1] & 255L) << 48
            | (var20[2] & 255L) << 40
            | (var20[3] & 255L) << 32
            | (var20[4] & 255L) << 24
            | (var20[5] & 255L) << 16
            | (var20[6] & 255L) << 8
            | var20[7] & 255L;
         byte var36 = -1;

         while (true) {
            long var21 = var32;
            byte[] var23 = var13.doFinal(
               new byte[]{
                  (byte)(var21 >>> 56),
                  (byte)(var21 >>> 48),
                  (byte)(var21 >>> 40),
                  (byte)(var21 >>> 32),
                  (byte)(var21 >>> 24),
                  (byte)(var21 >>> 16),
                  (byte)(var21 >>> 8),
                  (byte)var21
               }
            );
            long var39 = (var23[0] & 255L) << 56
               | (var23[1] & 255L) << 48
               | (var23[2] & 255L) << 40
               | (var23[3] & 255L) << 32
               | (var23[4] & 255L) << 24
               | (var23[5] & 255L) << 16
               | (var23[6] & 255L) << 8
               | var23[7] & 255L;
            switch (var36) {
               case 0:
                  var26[var28] = var39;
                  if (var19 >= var18) {
                     CONST_L = var15;
                     CONST_M = new Long[5];
                     return;
                  }
                  break;
               default:
                  var26[var28] = var39;
                  if (var19 < var18) {
                     continue label31;
                  }

                  var17 = "\u009a\u0016µÛæ\u008fºØtÂh\u009e v^\u000b";
                  var18 = "\u009a\u0016µÛæ\u008fºØtÂh\u009e v^\u000b".length();
                  var19 = 0;
            }

            byte var30 = var19;
            var19 += 8;
            var20 = var17.substring(var30, var19).getBytes("ISO-8859-1");
            var26 = var15;
            var28 = var16++;
            var32 = (var20[0] & 255L) << 56
               | (var20[1] & 255L) << 48
               | (var20[2] & 255L) << 40
               | (var20[3] & 255L) << 32
               | (var20[4] & 255L) << 24
               | (var20[5] & 255L) << 16
               | (var20[6] & 255L) << 8
               | var20[7] & 255L;
            var36 = 0;
         }
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22936;
      if (CONST_M[var3] == null) {
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
         long var5 = CONST_L[var3];
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
         Object[] var9 = (Object[])CONST_N.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/eh", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_M[var3] = var14;
      }

      return CONST_M[var3];
   }

   private static long getLong_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getLong_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/eh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
