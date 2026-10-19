package rip.breeze.client;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ImageUtil18 {
   private static final int[][] CONST_A = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
   private static final float[][] CONST_B = new float[][]{
      {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F},
      {1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F},
      {0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F},
      {0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F},
      {0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F},
      {0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F}
   };
   public final float[] arr_c;
   public final float[] arr_d;
   public final float[][] arr_e;
   public final float fieldFloat_f;
   public final float fieldFloat_g;
   public final float fieldFloat_h;
   public final float fieldFloat_i;
   public final float fieldFloat_j;
   public final float fieldFloat_k;

   private ImageUtil18(float[] var1, float[] var2, float[][] var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.arr_c = var1;
      this.arr_d = var2;
      this.arr_e = var3;
      this.fieldFloat_f = var4;
      this.fieldFloat_g = var5;
      this.fieldFloat_h = var6;
      this.fieldFloat_i = var7;
      this.fieldFloat_j = var8;
      this.fieldFloat_k = var9;
   }

   public static ImageUtil18 clamp(long[] var0, IFunctional var1, int var2, int var3) {
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      float var6 = Float.MAX_VALUE;
      float var7 = Float.MAX_VALUE;
      float var8 = Float.MAX_VALUE;
      float var9 = -Float.MAX_VALUE;
      float var10 = -Float.MAX_VALUE;
      float var11 = -Float.MAX_VALUE;

      for (long var15 : var0) {
         int var17 = CloudSyncWorker.getValue_3(var15);
         int var18 = CloudSyncWorker.getValue_4(var15);
         int var19 = CloudSyncWorker.getValue_5(var15);
         var6 = Math.min(var6, var17);
         var7 = Math.min(var7, var18);
         var8 = Math.min(var8, var19);
         var9 = Math.max(var9, var17 + 1);
         var10 = Math.max(var10, var18 + 1);
         var11 = Math.max(var11, var19 + 1);

         for (int var20 = 0; var20 < CONST_A.length; var20++) {
            int[] var21 = CONST_A[var20];
            if (!var1.test(var17 + var21[0], var18 + var21[1], var19 + var21[2])) {
               float[] var22 = CONST_B[var20];

               for (byte var23 = 0; var23 < var22.length; var23 += 3) {
                  var4.add(var17 + var22[var23]);
                  var4.add(var18 + var22[var23 + 1]);
                  var4.add(var19 + var22[var23 + 2]);
               }
            }
         }
      }

      Set[] var27 = new Set[]{new HashSet(), new HashSet(), new HashSet()};

      for (long var25 : var0) {
         int var34 = CloudSyncWorker.getValue_3(var25);
         int var36 = CloudSyncWorker.getValue_4(var25);
         int var38 = CloudSyncWorker.getValue_5(var25);

         for (int var39 = 0; var39 <= 1; var39++) {
            for (int var40 = 0; var40 <= 1; var40++) {
               var27[0].add(CloudSyncWorker.getLong_2(var34, var36 + var39, var38 + var40));
               var27[1].add(CloudSyncWorker.getLong_2(var34 + var39, var36, var38 + var40));
               var27[2].add(CloudSyncWorker.getLong_2(var34 + var39, var36 + var40, var38));
            }
         }
      }

      for (int var29 = 0; var29 < 3; var29++) {
         for (long var32 : var27[var29]) {
            int var33 = CloudSyncWorker.getValue_3(var32);
            int var35 = CloudSyncWorker.getValue_4(var32);
            int var37 = CloudSyncWorker.getValue_5(var32);
            if (checkCondition(var29, var33, var35, var37, var1, var2, var3)) {
               var5.add((float)var33);
               var5.add((float)var35);
               var5.add((float)var37);
               var5.add((float)(var29 == 0 ? var33 + 1 : var33));
               var5.add((float)(var29 == 1 ? var35 + 1 : var35));
               var5.add((float)(var29 == 2 ? var37 + 1 : var37));
            }
         }
      }

      return new ImageUtil18(toFloatArray(var4), toFloatArray(var5), computeMatrix(var0), var6, var7, var8, var9, var10, var11);
   }

   private static boolean checkCondition(int var0, int var1, int var2, int var3, IFunctional var4, int var5, int var6) {
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      boolean var15 = false;

      for (int var16 = 0; var16 <= 1; var16++) {
         for (int var17 = 0; var17 <= 1; var17++) {
            int var18 = var0 == 0 ? var1 : var1 - var16;
            int var19 = var0 == 0 ? var2 - var16 : (var0 == 1 ? var2 : var2 - var17);
            int var20 = var0 == 2 ? var3 : var3 - var17;
            if (var4.test(var18, var19, var20)) {
               var11++;
               if (var16 == 0 && var17 == 0) {
                  var7 = true;
               } else if (var16 == 0) {
                  var8 = true;
               } else if (var17 == 0) {
                  var9 = true;
               } else {
                  var10 = true;
               }

               if (!var15 || var18 < var12 || var18 == var12 && var20 < var14 || var18 == var12 && var20 == var14 && var19 < var13) {
                  var12 = var18;
                  var13 = var19;
                  var14 = var20;
                  var15 = true;
               }
            }
         }
      }

      if (var11 == 0 || var11 == 4) {
         return false;
      } else {
         return var11 != 2 || var7 && var10 || var8 && var9 ? var12 >> 4 == var5 && var14 >> 4 == var6 : false;
      }
   }

   private static float[][] computeMatrix(long[] var0) {
      HashSet var1 = new HashSet();

      for (long var5 : var0) {
         var1.add(var5);
      }

      ArrayList var27 = new ArrayList();
      ArrayDeque var28 = new ArrayDeque();

      while (!var1.isEmpty()) {
         long var7 = (Long)var1.iterator().next();
         var1.remove(var7);
         var28.add(var7);
         double var9 = 0.0;
         double var11 = 0.0;
         double var13 = 0.0;
         int var15 = 0;

         while (!var28.isEmpty()) {
            long var16 = (Long)var28.poll();
            int var18 = CloudSyncWorker.getValue_3(var16);
            int var19 = CloudSyncWorker.getValue_4(var16);
            int var20 = CloudSyncWorker.getValue_5(var16);
            var9 += var18 + 0.5;
            var11 += var19 + 0.5;
            var13 += var20 + 0.5;
            var15++;

            for (int[] var24 : CONST_A) {
               long var25 = CloudSyncWorker.getLong_2(var18 + var24[0], var19 + var24[1], var20 + var24[2]);
               if (var1.remove(var25)) {
                  var28.add(var25);
               }
            }
         }

         var27.add(new float[]{(float)(var9 / var15), (float)(var11 / var15), (float)(var13 / var15), var15});
      }

      return var27.toArray(new float[0][]);
   }

   private static float[] toFloatArray(List<Float> var0) {
      float[] var1 = new float[var0.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (Float)var0.get(var2);
      }

      return var1;
   }
}
