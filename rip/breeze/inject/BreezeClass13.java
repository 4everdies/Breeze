package rip.breeze.inject;

public class BreezeClass13 extends Util140 {
   protected final ք ք_û;

   public BreezeClass13(Util140 var1, ք var2, long var3) {
      var3 = 54136930109416L ^ var3;
      long var5 = var3 ^ 55925357852579L;
      this(589824, var1, var5, var2);
   }

   protected BreezeClass13(int var1, Util140 var2, long var3, ք var5) {
      var3 = 54136930109416L ^ var3;
      long var6 = var3 ^ 80572542417598L;
      super(var6, var1, var2);
      this.ք_û = var5;
   }

   public ü getÜ_8(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 30748859317491L;
      long var6 = var2 ^ 0L;
      int[] var10000 = ք.method_020();
      ü var8 = super.getÜ(new Object[]{var6});
      int[] var9 = var10000;
      ü var10 = var8;
      if (var9 != null) {
         var10 = var8 == null ? var8 : this.getÜ_9(new Object[]{null, var8, var4});
      }

      return var10;
   }

   public ü getÜ_9(Object[] var1) {
      String var2 = (String)var1[0];
      boolean var3 = (Boolean)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 137179803009437L;
      long var8 = var4 ^ 98289801445047L;
      long var10 = var4 ^ 0L;
      int[] var10000 = ք.method_020();
      String var10002 = this.ք_û.method_006(new Object[]{var8, var2});
      Object[] var10006 = new Object[]{null, null, var10};
      var10006[1] = var3;
      var10006[0] = var10002;
      ü var12 = super.getÜ_2(var10006);
      int[] var13 = var10000;
      ü var14 = var12;
      if (var13 != null) {
         var14 = var12 == null ? var12 : this.getÜ_9(new Object[]{var2, var12, var6});
      }

      return var14;
   }

   @Override
   public ü getÜ_3(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var5 ^ 133321102451375L;
      long var10 = var5 ^ 102144878124421L;
      long var12 = var5 ^ 0L;
      int[] var10000 = ք.method_020();
      String var10004 = this.ք_û.method_006(new Object[]{var10, var4});
      Object[] var10008 = new Object[]{null, null, null, null, var7};
      var10008[3] = var12;
      var10008[2] = var10004;
      var10008[1] = var3;
      var10008[0] = var2;
      ü var14 = super.getÜ_3(var10008);
      int[] var15 = var10000;
      ü var16 = var14;
      if (var15 != null) {
         var16 = var14 == null ? var14 : this.getÜ_9(new Object[]{var4, var14, var8});
      }

      return var16;
   }

   @Override
   public ü getÜ_4(Object[] var1) {
      int var2 = (Integer)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      boolean var6 = (Boolean)var1[3];
      long var7 = var4 ^ 131290173099871L;
      long var9 = var4 ^ 0L;
      long var11 = var4 ^ 91049716330613L;
      int[] var10000 = ք.method_020();
      String var10003 = this.ք_û.method_006(new Object[]{var11, var3});
      Object[] var10007 = new Object[]{null, null, null, var6};
      var10007[2] = var9;
      var10007[1] = var10003;
      var10007[0] = var2;
      ü var13 = super.getÜ_4(var10007);
      int[] var14 = var10000;
      ü var15 = var13;
      if (var14 != null) {
         var15 = var13 == null ? var13 : this.getÜ_9(new Object[]{var3, var13, var7});
      }

      return var15;
   }

   public void invoke_9(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      Object[] var6 = (Object[])var1[3];
      int var7 = (Integer)var1[4];
      Object[] var8 = (Object[])var1[5];
      long var9 = var3 ^ 37628850621216L;
      long var11 = var3 ^ 0L;
      Object[] var10009 = new Object[]{null, var9, var6};
      var10009[0] = var5;
      Object[] var10004 = this.method_001(var10009);
      Object[] var10011 = new Object[]{null, var9, var8};
      var10011[0] = var7;
      Object[] var10008 = new Object[]{null, null, null, var10004, var7, this.method_001(var10011)};
      var10008[2] = var5;
      var10008[1] = var11;
      var10008[0] = var2;
      super.processAll_5(var10008);
   }

   private Object[] invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      Object[] var5 = (Object[])var1[2];
      var3 = 54136930109416L ^ var3;
      long var6 = var3 ^ 101679933595920L;
      int[] var8 = ք.method_020();
      Object[] var10000 = var5;
      if (var8 != null) {
         if (var5 != null) {
            Object[] var9 = null;
            int var10 = 0;

            int[] var10001;
            label61: {
               while (true) {
                  if (var10 < var2) {
                     var10000 = var5;
                     var10001 = var8;
                     if (var3 < 0L) {
                        break label61;
                     }

                     if (var8 == null) {
                        break;
                     }

                     label74: {
                        var10001 = var8;
                        if (var3 > 0L) {
                           if (var8 != null) {
                              if (!(var5[var10] instanceof String)) {
                                 break label74;
                              }

                              var10000 = var9;
                           }

                           var10001 = var8;
                        }

                        if (var10001 != null) {
                           if (var10000 == null) {
                              var9 = new Object[var2];
                              System.arraycopy(var5, 0, var9, 0, var2);
                           }

                           var10000 = var9;
                        }

                        var10000[var10] = this.ք_û.method_008(new Object[]{var6, (String)var5[var10]});
                     }

                     var10++;
                     if (var8 != null) {
                        continue;
                     }
                  }

                  if (var3 <= 0L) {
                     return var9;
                  }

                  var10000 = var9;
                  break;
               }

               var10001 = var8;
            }

            if (var10001 == null) {
               return var10000;
            }

            if (var10000 == null) {
               return var5;
            }

            return var9;
         }

         var10000 = var5;
      }

      return var10000;
   }

   public void invoke_14(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      long var8 = var3 ^ 91111741699613L;
      long var10 = var3 ^ 130178370803506L;
      long var12 = var3 ^ 11839213504822L;
      long var14 = var3 ^ 0L;
      Object[] var10007 = new Object[]{
         null,
         var14,
         this.ք_û.method_008(new Object[]{var10, var5}),
         this.ք_û.method_004(new Object[]{var8, var5, var6, var7}),
         this.ք_û.method_006(new Object[]{var12, var7})
      };
      var10007[0] = var2;
      super.processAll_10(var10007);
   }

   public void processNullable(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      boolean var8 = (Boolean)var1[5];
      long var9 = var2 ^ 41764237407319L;
      long var11 = var2 ^ 65781152652201L;
      long var13 = var2 ^ 0L;
      long var15 = var2 ^ 120618878398801L;
      int[] var17 = ք.method_020();
      BreezeClass13 var10000 = this;
      if (var17 != null) {
         label17: {
            int var18 = this.þ;
            int var10001 = 327680;
            if (var2 >= 0L) {
               if (this.þ >= 327680) {
                  break label17;
               }

               var18 = var4;
               var10001 = 256;
            }

            if ((var18 & var10001) == 0) {
               Object[] var10008 = new Object[]{null, null, var5, var6, var7, var8};
               var10008[1] = var4;
               var10008[0] = var13;
               super.processAll_12(var10008);
               return;
            }
         }

         var10000 = this;
      }

      Object[] var19 = new Object[]{
         null,
         null,
         this.ք_û.method_008(new Object[]{var15, var5}),
         this.ք_û.method_001(new Object[]{var5, var6, var9, var7}),
         this.ք_û.method_010(new Object[]{var11, var7}),
         var8
      };
      var19[1] = var4;
      var19[0] = var13;
      var10000.processAll_12(var19);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void processNullable_2(Object... var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      º var6 = (º)var1[3];
      Object[] var7 = (Object[])var1[4];
      long var8 = var4 ^ 120945055129574L;
      long var10 = var4 ^ 131809451201990L;
      long var12 = var4 ^ 74519879773271L;
      long var14 = var4 ^ 0L;
      int[] var10000 = ք.method_020();
      Object[] var16 = new Object[var7.length];
      int[] var17 = var10000;
      int var18 = 0;

      while (true) {
         if (var18 < var7.length) {
            var16[var18] = this.ք_û.method_011(new Object[]{var7[var18], var12});
            var18++;
            var10000 = var17;
            if (var4 >= 0L) {
               if (var17 == null) {
                  return;
               }

               var10000 = var17;
            }

            if (var10000 != null) {
               continue;
            }
         }

         do {
            super.processAll_13(
               this.ք_û.method_002(new Object[]{var2, var3, var8}),
               this.ք_û.method_010(new Object[]{var10, var3}),
               var14,
               (º)this.ք_û.method_011(new Object[]{var6, var12}),
               var16
            );
            if (var4 >= 0L) {
               return;
            }

            var10000 = var17;
            if (var4 >= 0L) {
               if (var17 == null) {
                  return;
               }

               var10000 = var17;
            }
         } while (var10000 == null);
      }
   }

   public void invoke_13(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      long var6 = var3 ^ 100546693345207L;
      long var8 = var3 ^ 0L;
      Object[] var10005 = new Object[]{null, var8, this.ք_û.method_008(new Object[]{var6, var5})};
      var10005[0] = var2;
      super.processAll_9(var10005);
   }

   public void invoke_19(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 37817270646637L;
      super.processAll_16(new Object[]{this.ք_û.method_011(new Object[]{var2, var7}), var5});
   }

   public void invoke_23(Object[] var1) {
      String var2 = (String)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 42418637086335L;
      String var10001 = this.ք_û.method_006(new Object[]{var8, var2});
      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = var3;
      var10005[0] = var10001;
      super.processAll_20(var10005);
   }

   @Override
   public ü getÜ_5(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var5 ^ 95457965879669L;
      long var10 = var5 ^ 0L;
      long var12 = var5 ^ 126953931361887L;
      int[] var10000 = ք.method_020();
      String var10004 = this.ք_û.method_006(new Object[]{var12, var4});
      Object[] var10008 = new Object[]{null, null, null, null, var7};
      var10008[3] = var10;
      var10008[2] = var10004;
      var10008[1] = var3;
      var10008[0] = var2;
      ü var14 = super.getÜ_5(var10008);
      int[] var15 = var10000;
      ü var16 = var14;
      if (var15 != null) {
         var16 = var14 == null ? var14 : this.getÜ_9(new Object[]{var4, var14, var8});
      }

      return var16;
   }

   @Override
   public void processAll(Object[] var1) {
      ª var2 = (ª)var1[0];
      ª var3 = (ª)var1[1];
      ª var4 = (ª)var1[2];
      String var5 = (String)var1[3];
      long var6 = (Long)var1[4];
      long var8 = var6 ^ 39930102369720L;
      long var10 = var6 ^ 0L;
      super.processAll_21(new Object[]{var2, var3, var4, var5 == null ? null : this.ք_û.method_008(new Object[]{var8, var5}), var10});
   }

   @Override
   public ü getÜ_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var3 ^ 50145062540860L;
      long var10 = var3 ^ 9053916702998L;
      long var12 = var3 ^ 0L;
      int[] var10000 = ք.method_020();
      Object[] var10008 = new Object[]{null, null, var5, this.ք_û.method_006(new Object[]{var10, var6}), var7};
      var10008[1] = var12;
      var10008[0] = var2;
      ü var14 = super.getÜ_6(var10008);
      int[] var15 = var10000;
      ü var16 = var14;
      if (var15 != null) {
         var16 = var14 == null ? var14 : this.getÜ_9(new Object[]{var6, var14, var8});
      }

      return var16;
   }

   public void invoke_27(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      ª var5 = (ª)var1[3];
      long var6 = (Long)var1[4];
      ª var8 = (ª)var1[5];
      int var9 = (Integer)var1[6];
      long var10 = var6 ^ 0L;
      long var12 = var6 ^ 20409372460913L;
      long var14 = var6 ^ 26513905298746L;
      String var10002 = this.ք_û.method_006(new Object[]{var12, var3});
      ք var10003 = this.ք_û;
      Object[] var10008 = new Object[]{null, null, true};
      var10008[1] = var14;
      var10008[0] = var4;
      String var16 = var10003.method_012(var10008);
      Object[] var10009 = new Object[]{null, null, null, null, null, var8, var9};
      var10009[4] = var10;
      var10009[3] = var5;
      var10009[2] = var16;
      var10009[1] = var10002;
      var10009[0] = var2;
      super.processAll_22(var10009);
   }

   @Override
   public ü getÜ_7(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      long var4 = (Long)var1[2];
      ª[] var6 = (ª[])var1[3];
      ª[] var7 = (ª[])var1[4];
      int[] var8 = (int[])var1[5];
      String var9 = (String)var1[6];
      boolean var10 = (Boolean)var1[7];
      long var11 = var4 ^ 61340975757747L;
      long var13 = var4 ^ 20260548707993L;
      long var15 = var4 ^ 0L;
      int[] var10000 = ք.method_020();
      Object[] var10011 = new Object[]{null, null, null, var6, var7, var8, this.ք_û.method_006(new Object[]{var13, var9}), var10};
      var10011[2] = var15;
      var10011[1] = var3;
      var10011[0] = var2;
      ü var17 = super.getÜ_7(var10011);
      int[] var18 = var10000;
      ü var19 = var17;
      if (var18 != null) {
         var19 = var17 == null ? var17 : this.getÜ_9(new Object[]{var9, var17, var11});
      }

      return var19;
   }

   @Deprecated
   protected ü getÜ_8(Object[] var1) {
      ü var2 = (ü)var1[0];
      long var3 = (Long)var1[1];
      var3 = 54136930109416L ^ var3;
      long var5 = var3 ^ 94566784667749L;
      return new ú(this.þ, null, var2, var5, this.ք_û);
   }

   protected ü getÜ_9(Object[] var1) {
      String var2 = (String)var1[0];
      ü var3 = (ü)var1[1];
      long var4 = (Long)var1[2];
      var4 = 54136930109416L ^ var4;
      long var6 = var4 ^ 40554605249961L;
      long var8 = var4 ^ 74616151314980L;
      long var10 = var4 ^ 126264473561643L;
      return new ú(this.þ, var2, var3, var6, this.ք_û).method_003(new Object[]{var10, this.getÜ_8(new Object[]{var3, var8})});
   }
}
