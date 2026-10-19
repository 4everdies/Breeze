package rip.breeze.inject;

import java.util.List;

public class ì extends î {
   protected final ք ք_ü_2;
   protected String string_û_2;

   public ì(î var1, ք var2, long var3) {
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 2835678440568L;
      this(589824, var5, var1, var2);
   }

   protected ì(int var1, long var2, î var4, ք var5) {
      var2 = encKey_b_2 ^ var2;
      long var6 = var2 ^ 91050845008601L;
      super(var1, var4, var6);
      this.ք_ü_2 = var5;
   }

   @Override
   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      String var6 = (String)var1[4];
      String[] var7 = (String[])var1[5];
      long var8 = (Long)var1[6];
      long var10 = var8 ^ 134229390951160L;
      long var12 = var8 ^ 0L;
      long var14 = var8 ^ 19146928492920L;
      long var16 = var8 ^ 13363492353719L;
      this.string_û_2 = var4;
      String var10003 = this.ք_ü_2.method_008(new Object[]{var10, var4});
      ք var10004 = this.ք_ü_2;
      Object[] var10009 = new Object[]{null, null, false};
      var10009[1] = var16;
      var10009[0] = var5;
      var10009 = new Object[]{
         null,
         null,
         var10003,
         var10004.method_012(var10009),
         this.ք_ü_2.method_008(new Object[]{var10, var6}),
         var7 == null ? null : this.ք_ü_2.method_009(new Object[]{var7, var14}),
         var12
      };
      var10009[1] = var3;
      var10009[0] = var2;
      super.method_001(var10009);
   }

   @Override
   public BreezeClass11 invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 0L;
      long var9 = var5 ^ 9075229933118L;
      String var10001 = this.ք_ü_2.method_018(new Object[]{var2});
      Object[] var10006 = new Object[]{null, null, var4, var7};
      var10006[1] = var3;
      var10006[0] = var10001;
      BreezeClass11 var11 = super.method_003(var10006);
      return var11 == null ? null : this.method_005(new Object[]{var9, var11});
   }

   @Override
   public ü invoke_6(Object[] var1) {
      String var2 = (String)var1[0];
      boolean var3 = (Boolean)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 76744058662509L;
      long var10 = var4 ^ 88967235510156L;
      String var10001 = this.ք_ü_2.method_006(new Object[]{var10, var2});
      Object[] var10005 = new Object[]{null, null, var6};
      var10005[1] = var3;
      var10005[0] = var10001;
      ü var12 = super.method_006(var10005);
      return var12 == null ? null : this.method_004(new Object[]{var8, var2, var12});
   }

   @Override
   public ü invoke_7(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var3 ^ 0L;
      long var10 = var3 ^ 139491618130399L;
      long var12 = var3 ^ 118730050500670L;
      Object[] var10007 = new Object[]{null, null, var5, this.ք_ü_2.method_006(new Object[]{var12, var6}), var7};
      var10007[1] = var8;
      var10007[0] = var2;
      ü var14 = super.method_007(var10007);
      return var14 == null ? null : this.method_004(new Object[]{var10, var6, var14});
   }

   @Override
   public void invoke_8(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 0L;
      int[] var7 = ք.method_020();
      if (var7 != null) {
         label36: {
            õ var10000 = var2;
            if (var3 > 0L) {
               if (!(var2 instanceof ô)) {
                  break label36;
               }

               var10000 = var2;
            }

            ô var8 = (ô)var10000;
            List var9 = var8.list_û;
            int var10 = 0;

            while (var10 < var9.size()) {
               var9.set(var10, this.ք_ü_2.method_018(new Object[]{(String)var9.get(var10)}));
               var10++;
               int[] var11 = var7;
               if (var3 > 0L) {
                  if (var7 == null) {
                     return;
                  }

                  var11 = var7;
               }

               if (var11 == null) {
                  break;
               }
            }
         }

         super.method_008(new Object[]{var2, var5});
         if (var3 > 0L) {
         }
      }
   }

   @Override
   public BreezeClass7 invoke_12(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 0L;
      long var9 = var5 ^ 21304509090987L;
      long var11 = var5 ^ 28529408288480L;
      long var13 = var5 ^ 93414851337685L;
      String var10001 = this.ք_ü_2.method_016(new Object[]{this.string_û_2, var2, var3});
      String var10002 = this.ք_ü_2.method_006(new Object[]{var9, var3});
      ք var10003 = this.ք_ü_2;
      Object[] var10008 = new Object[]{null, null, true};
      var10008[1] = var11;
      var10008[0] = var4;
      BreezeClass7 var15 = super.method_012(new Object[]{var10001, var10002, var10003.method_012(var10008), var7});
      return var15 == null ? null : this.method_006(new Object[]{var15, var13});
   }

   @Override
   public ä invoke_13(Object[] var1) {
      int var2 = (Integer)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      Object var6 = var1[4];
      long var7 = (Long)var1[5];
      long var9 = var7 ^ 39239679640665L;
      long var11 = var7 ^ 135966346492786L;
      long var13 = var7 ^ 37039728708055L;
      long var15 = var7 ^ 124502298448185L;
      long var17 = var7 ^ 111394077898271L;
      long var19 = var7 ^ 0L;
      String var10004 = this.string_û_2;
      String var10002 = this.ք_ü_2.method_004(new Object[]{var9, var10004, var3, var4});
      String var10003 = this.ք_ü_2.method_006(new Object[]{var11, var4});
      ք var22 = this.ք_ü_2;
      Object[] var10009 = new Object[]{null, null, true};
      var10009[1] = var15;
      var10009[0] = var5;
      Object[] var10008 = new Object[]{
         null, var10002, var10003, var22.method_012(var10009), var6 == null ? null : this.ք_ü_2.method_011(new Object[]{var6, var17}), var19
      };
      var10008[0] = var2;
      ä var21 = super.method_013(var10008);
      return var21 == null ? null : this.method_001(new Object[]{var13, var21});
   }

   @Override
   public Util140 invoke_14(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      String[] var8 = (String[])var1[5];
      long var9 = var3 ^ 88115626108660L;
      long var11 = var3 ^ 85814052882698L;
      long var13 = var3 ^ 112737753590700L;
      long var15 = var3 ^ 0L;
      long var17 = var3 ^ 126518823809138L;
      long var19 = var3 ^ 121358166333373L;
      String var21 = this.ք_ü_2.method_010(new Object[]{var11, var6});
      String var10002 = this.ք_ü_2.method_001(new Object[]{this.string_û_2, var5, var9, var6});
      ք var10004 = this.ք_ü_2;
      Object[] var10009 = new Object[]{null, null, false};
      var10009[1] = var19;
      var10009[0] = var7;
      String var27 = var10004.method_012(var10009);
      String[] var22 = var8 == null ? null : this.ք_ü_2.method_009(new Object[]{var8, var17});
      String var23 = var27;
      String var24 = var21;
      String var25 = var10002;
      Object[] var10008 = new Object[]{null, var15, var25, var24, var23, var22};
      var10008[0] = var2;
      Util140 var26 = super.method_014(var10008);
      return var26 == null ? null : this.method_002(new Object[]{var13, var26});
   }

   @Override
   public void invoke_11(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      int var7 = (Integer)var1[4];
      long var8 = var5 ^ 132338916712246L;
      long var10 = var5 ^ 0L;
      long var12 = var5 ^ 58675643273198L;
      String var10001 = this.ք_ü_2.method_008(new Object[]{var8, var2});
      String var10002 = var3 == null ? null : this.ք_ü_2.method_008(new Object[]{var8, var3});
      String var10003 = var4 == null ? null : this.ք_ü_2.method_015(new Object[]{var12, var2, var3, var4});
      Object[] var10007 = new Object[]{null, null, null, null, var7};
      var10007[3] = var10;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var10001;
      super.method_011(var10007);
   }

   @Override
   public void invoke_5(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      long var7 = var3 ^ 106532524484138L;
      long var9 = var3 ^ 139415342221780L;
      long var11 = var3 ^ 44720049480492L;
      long var13 = var3 ^ 0L;
      super.method_005(
         new Object[]{
            this.ք_ü_2.method_008(new Object[]{var11, var2}),
            var13,
            var5 == null ? null : this.ք_ü_2.method_001(new Object[]{var2, var5, var7, var6}),
            var6 == null ? null : this.ք_ü_2.method_010(new Object[]{var9, var6})
         }
      );
   }

   @Override
   public void invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      long var7 = var2 ^ 52886430793169L;
      super.method_004(new Object[]{var5, this.ք_ü_2.method_008(new Object[]{var7, var4})});
   }

   @Override
   public void invoke_9(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 42380724238603L;
      super.method_009(new Object[]{this.ք_ü_2.method_008(new Object[]{var7, var2}), var5});
   }

   @Override
   public void invoke_10(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      long var7 = var2 ^ 5567361350775L;
      super.method_010(new Object[]{var5, this.ք_ü_2.method_008(new Object[]{var7, var4})});
   }

   protected ä invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      ä var4 = (ä)var1[1];
      var2 = encKey_b_2 ^ var2;
      long var5 = var2 ^ 124106772478563L;
      return new â(this.ÿ, var5, var4, this.ք_ü_2);
   }

   protected Util140 invoke_2(Object[] var1) {
      long var2 = (Long)var1[0];
      Util140 var4 = (Util140)var1[1];
      var2 = encKey_b_2 ^ var2;
      long var5 = var2 ^ 122265505890682L;
      return new BreezeClass13(this.ÿ, var4, var5, this.ք_ü_2);
   }

   @Deprecated
   protected ü invoke_3(Object[] var1) {
      ü var2 = (ü)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 48091107056246L;
      return new ú(this.ÿ, null, var2, var5, this.ք_ü_2);
   }

   protected ü invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      ü var5 = (ü)var1[2];
      var2 = encKey_b_2 ^ var2;
      long var6 = var2 ^ 16366644778748L;
      long var8 = var2 ^ 31718357253320L;
      long var10 = var2 ^ 82383489831754L;
      return new ú(this.ÿ, var4, var5, var8, this.ք_ü_2).method_003(new Object[]{var10, this.method_003(new Object[]{var5, var6})});
   }

   protected BreezeClass11 invoke_5(Object[] var1) {
      long var2 = (Long)var1[0];
      BreezeClass11 var4 = (BreezeClass11)var1[1];
      var2 = encKey_b_2 ^ var2;
      long var5 = var2 ^ 78641710703020L;
      return new BreezeClass9(this.ÿ, var5, var4, this.ք_ü_2);
   }

   protected BreezeClass7 invoke_6(Object[] var1) {
      BreezeClass7 var2 = (BreezeClass7)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 8593909813632L;
      return new BreezeClass5(var5, this.ÿ, var2, this.ք_ü_2);
   }
}
