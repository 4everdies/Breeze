package rip.breeze.inject;

public class BreezeClass9 extends BreezeClass11 {
   protected final ք ք_ý;

   public BreezeClass9(BreezeClass11 var1, long var2, ք var4) {
      var2 = 126903041987119L ^ var2;
      long var5 = var2 ^ 98119378615041L;
      this(589824, var5, var1, var4);
   }

   protected BreezeClass9(int var1, long var2, BreezeClass11 var4, ք var5) {
      var2 = 126903041987119L ^ var2;
      long var6 = var2 ^ 118546411048542L;
      super(var6, var1, var4);
      this.ք_ý = var5;
   }

   public void invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 122613867252334L;
      long var7 = var3 ^ 0L;
      super.processAll(new Object[]{this.ք_ý.method_008(new Object[]{var5, var2}), var7});
   }

   public void invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 0L;
      super.processAll_2(new Object[]{this.ք_ý.method_017(new Object[]{var2}), var5});
   }

   public void invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      String var6 = (String)var1[3];
      long var7 = var4 ^ 0L;
      String var10001 = this.ք_ý.method_018(new Object[]{var2});
      Object[] var10006 = new Object[]{null, null, var7, var6};
      var10006[1] = var3;
      var10006[0] = var10001;
      super.processAll_3(var10006);
   }

   public void processNullable(Object... var1) {
      String var2;
      int var3;
      long var4;
      long var7;
      String[] var9;
      label34: {
         var2 = (String)var1[0];
         var3 = (Integer)var1[1];
         var4 = (Long)var1[2];
         String[] var6 = (String[])var1[3];
         var7 = var4 ^ 0L;
         int[] var10000 = ք.method_020();
         var9 = null;
         int[] var10 = var10000;
         String[] var12 = var6;
         if (var10 != null) {
            if (var6 == null) {
               break label34;
            }

            var12 = new String[var6.length];
         }

         var9 = var12;
         int var11 = 0;

         while (var11 < var6.length) {
            var9[var11] = this.ք_ý.method_018(new Object[]{var6[var11]});
            var11++;
            var10000 = var10;
            if (var4 >= 0L) {
               if (var10 == null) {
                  return;
               }

               var10000 = var10;
            }

            if (var10000 == null) {
               break;
            }
         }
      }

      String var10001 = this.ք_ý.method_017(new Object[]{var2});
      Object[] var10006 = new Object[]{null, null, var7, var9};
      var10006[1] = var3;
      var10006[0] = var10001;
      super.processAll_4(var10006);
      if (var4 >= 0L) {
      }
   }

   public void processNullable_2(Object... var1) {
      long var2;
      String var4;
      int var5;
      long var7;
      String[] var9;
      label34: {
         var2 = (Long)var1[0];
         var4 = (String)var1[1];
         var5 = (Integer)var1[2];
         String[] var6 = (String[])var1[3];
         var7 = var2 ^ 0L;
         int[] var10000 = ք.method_020();
         var9 = null;
         int[] var10 = var10000;
         String[] var12 = var6;
         if (var10 != null) {
            if (var6 == null) {
               break label34;
            }

            var12 = new String[var6.length];
         }

         var9 = var12;
         int var11 = 0;

         while (var11 < var6.length) {
            var9[var11] = this.ք_ý.method_018(new Object[]{var6[var11]});
            var11++;
            var10000 = var10;
            if (var2 >= 0L) {
               if (var10 == null) {
                  return;
               }

               var10000 = var10;
            }

            if (var10000 == null) {
               break;
            }
         }
      }

      Object[] var10006 = new Object[]{null, this.ք_ý.method_017(new Object[]{var4}), var5, var9};
      var10006[0] = var7;
      super.processAll_5(var10006);
      if (var2 >= 0L) {
      }
   }

   public void invoke_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      int var5 = (Integer)var1[3];
      long var6 = (long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48;
      long var10001 = var6 ^ 0L;
      int var8 = (int)((var6 ^ 0L) >>> 48);
      int var9 = (int)((var6 ^ 0L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var6 ^ 12527576967734L;
      String var13 = this.ք_ý.method_008(new Object[]{var11, var4});
      char var10003 = (char)var8;
      Object[] var10006 = new Object[]{null, null, var13, var10};
      var10006[1] = var9;
      var10006[0] = Integer.valueOf(var10003);
      super.processAll_6(var10006);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void processNullable_3(Object... var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String[] var5 = (String[])var1[2];
      long var6 = var2 ^ 104110075275913L;
      long var8 = var2 ^ 0L;
      String[] var10 = new String[var5.length];
      int[] var10000 = ք.method_020();
      int var11 = 0;
      int[] var12 = var10000;

      while (true) {
         if (var11 < var5.length) {
            var10[var11] = this.ք_ý.method_008(new Object[]{var6, var5[var11]});
            var11++;
            var10000 = var12;
            if (var2 >= 0L) {
               if (var12 == null) {
                  return;
               }

               var10000 = var12;
            }

            if (var10000 != null) {
               continue;
            }
         }

         do {
            super.processAll_7(var8, this.ք_ý.method_008(new Object[]{var6, var4}), var10);
            if (var2 >= 0L) {
               return;
            }

            var10000 = var12;
            if (var2 >= 0L) {
               if (var12 == null) {
                  return;
               }

               var10000 = var12;
            }
         } while (var10000 == null);
      }
   }
}
