package rip.breeze.inject;

final class BreezeClass6 extends BreezeClass7 {
   private final Util139 dataBuilder4_ý;
   private final int int_ü;
   private final int int_û;
   private int int_ú;
   private û û_ù;
   private û û_ø;
   private û û_ö;
   private û û_õ;
   private õ õ_ô;

   BreezeClass6(long var1, Util139 var3, String var4, String var5, String var6) {
      var1 = 133338888329105L ^ var1;
      long var7 = var1 ^ 44913912657625L;
      long var9 = var1 ^ 26815041046138L;
      super(589824, var7);
      this.dataBuilder4_ý = var3;
      int var10000 = Util140.getValue();
      this.int_ü = var3.calculate_6(new Object[]{var9, var4});
      int var11 = var10000;
      BreezeClass6 var13 = this;
      int var10001 = var3.calculate_6(new Object[]{var9, var5});
      if (var11 == 0) {
         this.int_û = var10001;
         if (var6 == null) {
            return;
         }

         var13 = this;
         var10001 = var3.calculate_6(new Object[]{var9, var6});
      }

      var13.int_ú = var10001;
   }

   @Override
   public ü getÜ(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      long var6 = var3 ^ 46497875203994L;
      if (var5) {
         Util139 var8 = this.dataBuilder4_ý;
         û var9 = this.û_ù;
         return this.û_ù = û.method_001(new Object[]{var6, var8, var2, var9});
      } else {
         Util139 var10002 = this.dataBuilder4_ý;
         û var10004 = this.û_ø;
         return this.û_ø = û.method_001(new Object[]{var6, var10002, var2, var10004});
      }
   }

   @Override
   public ü getÜ_2(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var2 ^ 132867335935067L;
      if (var7) {
         û var10 = this.û_ö;
         Object[] var11 = new Object[]{null, this.dataBuilder4_ý, var4, var5, var6, var10};
         var11[0] = var8;
         return this.û_ö = û.method_002(var11);
      } else {
         û var10006 = this.û_õ;
         Object[] var10008 = new Object[]{null, this.dataBuilder4_ý, var4, var5, var6, var10006};
         var10008[0] = var8;
         return this.û_õ = û.method_002(var10008);
      }
   }

   public void invoke_3(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      var2.õ_ý_2 = this.õ_ô;
      this.õ_ô = var2;
   }

   public void invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   int calculate(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 133338888329105L ^ var2;
      long var4 = var2 ^ 110381144204595L;
      long var6 = var2 ^ 67973049659149L;
      long var8 = var2 ^ 39299126372060L;
      int var10000 = Util140.getValue();
      int var10 = 6;
      int var11 = var10000;
      Util139 var10001 = this.dataBuilder4_ý;
      Object[] var10006 = new Object[]{null, null, null, this.int_ú};
      var10006[2] = 0;
      var10006[1] = var4;
      var10006[0] = var10001;
      var10 += õ.method_013(var10006);
      û var10002 = this.û_ù;
      û var10003 = this.û_ø;
      û var10004 = this.û_ö;
      û var10005 = this.û_õ;
      var10000 = var10 + û.method_004(new Object[]{var8, var10002, var10003, var10004, var10005});
      if (var11 == 0) {
         var10 = var10000;
         if (this.õ_ô != null) {
            var10 += this.õ_ô.method_011(new Object[]{this.dataBuilder4_ý, var6});
         }

         var10000 = var10;
      }

      return var10000;
   }

   void calculate_2(Object[] var1) {
      ð var2 = (ð)var1[0];
      long var3 = (Long)var1[1];
      var3 = 133338888329105L ^ var3;
      long var5 = var3 ^ 107325807513532L;
      long var7 = var3 ^ 129807731915617L;
      long var9 = var3 ^ 124924804316258L;
      long var11 = var3 ^ 12325857981740L;
      long var13 = var3 ^ 108228527210208L;
      int var10001 = this.int_ü;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      ð var10000 = var2.method_004(var10004);
      var10001 = this.int_û;
      var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      var10000.method_004(var10004);
      int var18 = Util140.getValue();
      int var15 = 0;
      int var16 = var18;
      BreezeClass6 var19 = this;
      if (var16 == 0) {
         if (this.int_ú != 0) {
            var15++;
         }

         var19 = this;
      }

      û var20 = var19.û_ù;
      var10001 = var16;
      if (var3 > 0L) {
         if (var16 == 0) {
            if (var19.û_ù != null) {
               var15++;
            }

            var20 = this.û_ø;
         }

         var10001 = var16;
      }

      if (var3 >= 0L) {
         if (var10001 == 0) {
            if (var20 != null) {
               var15++;
            }

            var20 = this.û_ö;
         }

         var10001 = var16;
      }

      label78: {
         if (var10001 == 0) {
            if (var20 != null) {
               var15++;
            }

            var21 = this;
            if (var16 != 0) {
               break label78;
            }

            var20 = this.û_õ;
         }

         if (var20 != null) {
            var15++;
         }

         var21 = this;
      }

      õ var22 = var21.õ_ô;
      var10001 = var16;
      if (var3 >= 0L) {
         if (var16 == 0) {
            if (var21.õ_ô != null) {
               var15 += this.õ_ô.method_010(new Object[]{var9});
            }

            var10004 = new Object[]{null, var5};
            var10004[0] = var15;
            var2.method_004(var10004);
            Util139 var23 = this.dataBuilder4_ý;
            int var10002 = this.int_ú;
            Object[] var10006 = new Object[]{null, null, null, var2, var11};
            var10006[2] = var10002;
            var10006[1] = 0;
            var10006[0] = var23;
            õ.method_016(var10006);
            û var10005 = this.û_õ;
            û.method_006(new Object[]{this.dataBuilder4_ý, this.û_ù, this.û_ø, this.û_ö, var7, var10005, var2});
            var22 = this.õ_ô;
         }

         var10001 = var16;
      }

      if (var10001 == 0) {
         if (var22 == null) {
            return;
         }

         var22 = this.õ_ô;
      }

      var22.method_014(new Object[]{this.dataBuilder4_ý, var2, var13});
   }

   final void invoke_3(Object[] var1) {
      ñ var2 = (ñ)var1[0];
      long var3 = (Long)var1[1];
      var3 = 133338888329105L ^ var3;
      long var5 = var3 ^ 100471452219007L;
      var2.processNullable(new Object[]{this.õ_ô, var5});
   }
}
