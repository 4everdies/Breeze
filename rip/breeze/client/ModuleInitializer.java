package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed.EnumPartType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.StringDecryptor;

public final class ModuleInitializer {
   public final Map<BlockPos, IBlockState> map_a = new HashMap<>();

   public ModuleInitializer() {
      EventBus.processAll(this);
   }

   public void initialize() {
      BreezeClient.getCloudSyncWorker().update(this, Collections.singleton(Blocks.bed));
   }

   @EventListener
   public void processAll(PreTickEventEvent var1) {
      long var2 = 121362747025318L;
      boolean var4 = ConfigManager.isValid();
      if (BreezeClient.CONST_A.theWorld == null) {
         if (!this.map_a.isEmpty()) {
            this.map_a.clear();
         }
      } else {
         this.map_a.clear();

         for (BlockUtil9 var6 : BreezeClient.getCloudSyncWorker().getCollection()) {
            Iterator var7 = var6.getBlockData(Blocks.bed).entrySet().iterator();

            while (true) {
               if (var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  IBlockState var9 = (IBlockState)var8.getValue();
                  if (var9.getValue(BlockBed.PART) != EnumPartType.FOOT) {
                     continue;
                  }

                  long var10 = (Long)var8.getKey();
                  this.map_a.put(new BlockPos(CloudSyncWorker.getValue_3(var10), CloudSyncWorker.getValue_4(var10), CloudSyncWorker.getValue_5(var10)), var9);
                  if (!var4) {
                     continue;
                  }
               }

               if (var4) {
                  return;
               }
               break;
            }
         }
      }
   }

   @EventListener
   public void initialize_2(WorldChangedEventEvent var1) {
      this.map_a.clear();
   }
}
