package rip.breeze.inject;

public class â extends ä {
   protected final ք ք_ý_2;

   public â(long var1, ä var3, ք var4) {
      var1 = encKey_b_2 ^ var1;
      long var5 = var1 ^ 9998006295477L;
      this(589824, var5, var3, var4);
   }

   protected â(int var1, long var2, ä var4, ք var5) {
      var2 = encKey_b_2 ^ var2;
      long var6 = var2 ^ 131431509752913L;
      super(var1, var4, var6);
      this.ք_ý_2 = var5;
   }

   @Override
   public ü invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 106949206710193L;
      long var10 = var3 ^ 21245546527103L;
      String var10001 = this.ք_ý_2.method_006(new Object[]{var10, var2});
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = var6;
      var10005[0] = var10001;
      ü var12 = super.method_001(var10005);
      return var12 == null ? null : this.method_002(new Object[]{var2, var8, var12});
   }

   @Override
   public ü invoke_2(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var3 ^ 0L;
      long var10 = var3 ^ 32977948406980L;
      long var12 = var3 ^ 123050123008522L;
      Object[] var10007 = new Object[]{null, null, var5, this.ք_ý_2.method_006(new Object[]{var12, var6}), var7};
      var10007[1] = var8;
      var10007[0] = var2;
      ü var14 = super.method_002(var10007);
      return var14 == null ? null : this.method_002(new Object[]{var6, var10, var14});
   }

   @Deprecated
   @Override
   protected ü invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      ü var4 = (ü)var1[1];
      var2 = encKey_b_2 ^ var2;
      long var5 = var2 ^ 136643342658422L;
      return new ú(this.ÿ, null, var4, var5, this.ք_ý_2);
   }

   @Override
   protected ü invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      ü var5 = (ü)var1[2];
      var3 = encKey_b_2 ^ var3;
      long var6 = var3 ^ 68345792297171L;
      long var8 = var3 ^ 101590545812595L;
      long var10 = var3 ^ 11343070127089L;
      return new ú(this.ÿ, var2, var5, var8, this.ք_ý_2).method_003(new Object[]{var10, this.method_001(new Object[]{var6, var5})});
   }
}
