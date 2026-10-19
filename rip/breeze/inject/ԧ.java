package rip.breeze.inject;

import java.util.ArrayList;
import java.util.List;

final class ԧ {

   private ԧ() {
   }

   static List invoke_1(Object[] var0) {
      List var1 = (List)var0[0];
      long var2 = (Long)var0[1];
      Object var4 = var0[2];
      var2 = encKey_a_2 ^ var2;
      List var5 = var1 == null ? new ArrayList(1) : var1;
      var5.add(var4);
      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static List invoke_2(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      boolean var10000 = BreezeClass12.checkCondition();
      ArrayList var4 = new ArrayList(var1);
      boolean var5 = var10000;
      int var6 = 0;

      label24:
      while (true) {
         if (var6 < var1) {
            var8 = var4;
            if (!var5) {
               break;
            }

            var4.add(null);
            var6++;
            if (var5) {
               continue;
            }
         }

         while (var2 < 0L) {
            if (var5) {
               continue label24;
            }
         }

         var8 = var4;
         break;
      }

      return var8;
   }

   static List invoke_3(Object[] var0) {
      long var1 = (Long)var0[0];
      Object[] var3 = (Object[])var0[1];
      var1 = encKey_a_2 ^ var1;
      boolean var4 = BreezeClass12.isValid();
      if (var3 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var3.length);
      Object[] var6 = var3;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            Object var9 = var6[var8];
            if (var1 >= 0L) {
               var10000 = var5;
               if (var4) {
                  break;
               }

               var5.add(var9);
               var8++;
            }

            if (!var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_4(Object[] var0) {
      long var1 = (Long)var0[0];
      byte[] var3 = (byte[])var0[1];
      var1 = encKey_a_2 ^ var1;
      byte var4 = BreezeClass12.checkCondition();
      if (var3 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var3.length);
      byte[] var6 = var3;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            byte var9 = var6[var8];
            var10000 = var5;
            byte var10001 = var4;
            if (var1 > 0L) {
               if (var4 == 0) {
                  break;
               }

               var10001 = var9;
            }

            var5.add(var10001);
            var8++;
            if (var4 != 0) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_5(Object[] var0) {
      boolean[] var1 = (boolean[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      boolean var4 = BreezeClass12.isValid();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      boolean[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            boolean var9 = var6[var8];
            var10000 = var5;
            boolean var10001 = var4;
            if (var2 > 0L) {
               if (var4) {
                  break;
               }

               var10001 = var9;
            }

            var5.add(var10001);
            var8++;
            if (!var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_6(Object[] var0) {
      long var1 = (Long)var0[0];
      short[] var3 = (short[])var0[1];
      var1 = encKey_a_2 ^ var1;
      byte var4 = BreezeClass12.isValid();
      if (var3 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var3.length);
      short[] var6 = var3;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            short var9 = var6[var8];
            var10000 = var5;
            short var10001 = var4;
            if (var1 >= 0L) {
               if (var4 != 0) {
                  break;
               }

               var10001 = var9;
            }

            var5.add(var10001);
            var8++;
            if (var4 == 0) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_7(Object[] var0) {
      char[] var1 = (char[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      byte var4 = BreezeClass12.checkCondition();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      char[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            char var9 = var6[var8];
            var10000 = var5;
            char var10001 = (char)var4;
            if (var2 >= 0L) {
               if (var4 == 0) {
                  break;
               }

               var10001 = var9;
            }

            var5.add(var10001);
            var8++;
            if (var4 != 0) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_8(Object[] var0) {
      int[] var1 = (int[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      byte var4 = BreezeClass12.isValid();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      int[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            int var9 = var6[var8];
            var10000 = var5;
            int var10001 = var4;
            if (var2 > 0L) {
               if (var4 != 0) {
                  break;
               }

               var10001 = var9;
            }

            var5.add(var10001);
            var8++;
            if (var4 == 0) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_9(Object[] var0) {
      float[] var1 = (float[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      boolean var4 = BreezeClass12.checkCondition();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      float[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            float var9 = var6[var8];
            if (var2 > 0L) {
               var10000 = var5;
               if (!var4) {
                  break;
               }

               var5.add(var9);
               var8++;
            }

            if (var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_10(Object[] var0) {
      long[] var1 = (long[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      boolean var4 = BreezeClass12.checkCondition();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      long[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            long var9 = var6[var8];
            if (var2 >= 0L) {
               var10000 = var5;
               if (!var4) {
                  break;
               }

               var5.add(var9);
               var8++;
            }

            if (var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   static List invoke_11(Object[] var0) {
      double[] var1 = (double[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      boolean var4 = BreezeClass12.isValid();
      if (var1 == null) {
         return new ArrayList();
      }

      ArrayList var5 = new ArrayList(var1.length);
      double[] var6 = var1;
      int var7 = var6.length;
      int var8 = 0;

      ArrayList var10000;
      while (true) {
         if (var8 < var7) {
            double var9 = var6[var8];
            if (var2 >= 0L) {
               var10000 = var5;
               if (var4) {
                  break;
               }

               var5.add(var9);
               var8++;
            }

            if (!var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static List invoke_12(Object[] var0) {
      int var1 = (Integer)var0[0];
      Object[] var2 = (Object[])var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      boolean var10000 = BreezeClass12.isValid();
      ArrayList var5 = new ArrayList(var1);
      boolean var6 = var10000;
      int var7 = 0;

      label24:
      while (true) {
         if (var7 < var1) {
            var9 = var5;
            if (var6) {
               break;
            }

            var5.add(var2[var7]);
            var7++;
            if (!var6) {
               continue;
            }
         }

         while (var3 <= 0L) {
            if (!var6) {
               continue label24;
            }
         }

         var9 = var5;
         break;
      }

      return var9;
   }
}
