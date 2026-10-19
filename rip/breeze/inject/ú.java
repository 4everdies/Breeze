package rip.breeze.inject;

public class ú extends ü {
   protected final String string_ü_2;
   protected final ք ք_û_2;

   @Deprecated
   public ú(long var1, ü var3, ք var4) {
      var1 = encKey_b_2 ^ var1;
      long var5 = var1 ^ 42051222148769L;
      this(null, var3, var4, var5);
   }

   public ú(String var1, ü var2, ք var3, long var4) {
      var4 = encKey_b_2 ^ var4;
      long var6 = var4 ^ 26466999145088L;
      this(589824, var1, var2, var6, var3);
   }

   @Deprecated
   protected ú(long var1, int var3, ü var4, ք var5) {
      var1 = encKey_b_2 ^ var1;
      long var6 = var1 ^ 58741426390303L;
      this(var3, null, var4, var6, var5);
   }

   protected ú(int var1, String var2, ü var3, long var4, ք var6) {
      var4 = encKey_b_2 ^ var4;
      long var7 = var4 ^ 30989124449853L;
      super(var7, var1, var3);
      this.string_ü_2 = var2;
      this.ք_û_2 = var6;
   }

   @Override
   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      Object var5 = var1[2];
      long var6 = var2 ^ 121782129505411L;
      long var8 = var2 ^ 121904120513580L;
      long var10 = var2 ^ 0L;
      super.method_001(new Object[]{var10, this.method_004(new Object[]{var4, var6}), this.ք_û_2.method_011(new Object[]{var5, var8})});
   }

   @Override
   public void invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      long var7 = var3 ^ 0L;
      long var9 = var3 ^ 46717186422501L;
      long var11 = var3 ^ 57752204970791L;
      super.method_002(new Object[]{this.method_004(new Object[]{var2, var9}), var7, this.ք_û_2.method_006(new Object[]{var11, var5}), var6});
   }

   @Override
   public ü invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 82313909444878L;
      long var10 = var4 ^ 26580744106517L;
      long var12 = var4 ^ 7522721976279L;
      int[] var10000 = ք.method_020();
      ü var14 = super.method_003(new Object[]{this.method_004(new Object[]{var2, var10}), this.ք_û_2.method_006(new Object[]{var12, var3}), var6});
      int[] var15 = var10000;
      ü var16 = var14;
      if (var15 != null) {
         if (var14 == null) {
            return null;
         }

         var16 = var14;
      }

      return var16 == this.þ ? this : this.method_002(new Object[]{var3, var14, var8});
   }

   @Override
   public ü invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 60051034981858L;
      long var7 = var2 ^ 0L;
      long var9 = var2 ^ 110416160200441L;
      int[] var10000 = ք.method_020();
      ü var11 = super.method_004(new Object[]{var7, this.method_004(new Object[]{var4, var9})});
      int[] var12 = var10000;
      ü var13 = var11;
      if (var12 != null) {
         if (var11 == null) {
            return null;
         }

         var13 = var11;
      }

      return var13 == this.þ ? this : this.method_002(new Object[]{null, var11, var5});
   }

   @Deprecated
   protected ü invoke_1(Object[] var1) {
      ü var2 = (ü)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 110009483281471L;
      return new ú(this.ÿ, null, var2, var5, this.ք_û_2);
   }

   protected ü invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      ü var3 = (ü)var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_b_2 ^ var4;
      long var6 = var4 ^ 26931813046157L;
      long var8 = var4 ^ 35517029990940L;
      long var10 = var4 ^ 130262402592158L;
      return new ú(this.ÿ, var2, var3, var8, this.ք_û_2).method_003(new Object[]{var10, this.method_001(new Object[]{var3, var6})});
   }

   @Override
   final ü invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      ü var4 = (ü)var1[1];
      var2 = encKey_b_2 ^ var2;
      int[] var5 = ք.method_020();
      ü var10000 = var4;
      if (var5 != null) {
         if (var4.getClass() == this.getClass()) {
            ú var6 = (ú)var4;
            if (var5 == null) {
               return var6;
            }

            if (var6.ÿ == this.ÿ) {
               if (var5 == null) {
                  return var6.þ;
               }

               if (var6.þ == this.þ) {
                  if (var5 == null) {
                     return var6;
                  }

                  if (var6.ք_û_2 == this.ք_û_2) {
                     return this;
                  }
               }
            }
         }

         var10000 = var4;
      }

      return var10000;
   }

   private String invoke_4(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 36180508061543L;
      int[] var7 = ք.method_020();
      String var10000 = this.string_ü_2;
      if (var7 != null) {
         if (this.string_ü_2 == null) {
            return var2;
         }

         String var10002 = this.string_ü_2;
         var10000 = this.ք_û_2.method_003(new Object[]{var5, var10002, var2});
      }

      return var10000;
   }
}
