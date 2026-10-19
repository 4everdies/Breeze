package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import rip.breeze.StringDecryptor;

public final class BlockUtil9 {
   public final int fieldInt_a;
   public final int fieldInt_b;
   private final Map<Block, Map<Long, IBlockState>> map_c = new ConcurrentHashMap<>();
   public int fieldInt_d;

   BlockUtil9(int var1, int var2) {
      this.fieldInt_a = var1;
      this.fieldInt_b = var2;
   }

   public boolean isValid() {
      return this.map_c.isEmpty();
   }

   public Set<Block> getBlockSet() {
      return this.map_c.keySet();
   }

   public Map<Long, IBlockState> getBlockData(Block var1) {
      long var2 = 48379449136593L;
      Map var4 = this.map_c.get(var1);
      return var4 == null ? Collections.emptyMap() : var4;
   }

   public boolean checkCondition(long var1, Block var3) {
      long var4 = 85201308380901L;
      Map var6 = this.map_c.get(var3);
      return var6 != null && var6.containsKey(var1);
   }

   void processAll(long var1, IBlockState var3) {
      this.map_c.computeIfAbsent(var3.getBlock(), BlockUtil9::lambda$put_Inner0).put(var1, var3);
   }

   void processAll_1(BlockPos var1, IBlockState var2) {
      this.processAll(CloudSyncWorker.getLong_2(var1.getX(), var1.getY(), var1.getZ()), var2);
   }

   boolean checkCondition_2(BlockPos var1) {
      long var2 = 64195493998391L;
      long var4 = CloudSyncWorker.getLong_2(var1.getX(), var1.getY(), var1.getZ());
      Iterator var6 = this.map_c.values().iterator();

      while (var6.hasNext()) {
         Map var7 = (Map)var6.next();
         if (var7.remove(var4) != null) {
            if (var7.isEmpty()) {
               var6.remove();
            }

            return true;
         }
      }

      return false;
   }

   private static Map lambda$put_Inner0(Block var0) {
      return new ConcurrentHashMap<>();
   }
}
