package rip.breeze.inject;

public class BreezeClass5 extends BreezeClass7 {
   protected final ք ք_ý;

   public BreezeClass5(BreezeClass7 var1, ք var2, long var3) {
      var3 = 3336293823600L ^ var3;
      long var5 = var3 ^ 112041382794847L;
      this(var5, 589824, var1, var2);
   }

   protected BreezeClass5(long var1, int var3, BreezeClass7 var4, ք var5) {
      var1 = 3336293823600L ^ var1;
      long var6 = var1 ^ 124674410143482L;
      super(var3, var4, var6);
      this.ք_ý = var5;
   }

   public ü getÜ_3(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      boolean var5 = (Boolean)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 96317205111899L;
      long var10 = var3 ^ 66723186923859L;
      String var10001 = this.ք_ý.method_006(new Object[]{var8, var2});
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = var6;
      var10005[0] = var10001;
      ü var12 = super.getÜ(var10005);
      return var12 == null ? null : this.getÜ_4(new Object[]{var2, var10, var12});
   }

   public ü getÜ_4(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var2 ^ 129481164859184L;
      long var10 = var2 ^ 34039860238904L;
      long var12 = var2 ^ 0L;
      Object[] var10007 = new Object[]{null, null, var5, this.ք_ý.method_006(new Object[]{var8, var6}), var7};
      var10007[1] = var4;
      var10007[0] = var12;
      ü var14 = super.getÜ_2(var10007);
      return var14 == null ? null : this.getÜ_4(new Object[]{var6, var10, var14});
   }

   @Deprecated
   protected ü getÜ_3(Object[] var1) {
      ü var2 = (ü)var1[0];
      long var3 = (Long)var1[1];
      var3 = 3336293823600L ^ var3;
      long var5 = var3 ^ 21994323520639L;
      return new ú(this.ÿ, null, var2, var5, this.ք_ý);
   }

   protected ü getÜ_4(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      ü var5 = (ü)var1[2];
      var3 = 3336293823600L ^ var3;
      long var6 = var3 ^ 87204876708892L;
      long var8 = var3 ^ 97065438704659L;
      long var10 = var3 ^ 15889922612113L;
      return new ú(this.ÿ, var2, var5, var8, this.ք_ý).method_003(new Object[]{var10, this.getÜ_3(new Object[]{var5, var6})});
   }
}
