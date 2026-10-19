package rip.breeze.inject;

public abstract class ԟ<V extends ԏ> {
   protected final int int_ÿ_2;
   private static String[] arr_þ_2;

   protected ԟ(int var1) {
      this.int_ÿ_2 = var1;
   }

   public abstract ԏ invoke_9(Object[] var1);

   public ԏ invoke_10(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      MathUtil3 var6 = (MathUtil3)var1[3];
      var4 = encKey_C_2 ^ var4;
      long var7 = var4 ^ 113993810777789L;
      return this.method_009(new Object[]{var7, var6});
   }

   public ԏ invoke_11(Object[] var1) {
      MathUtil3 var2 = (MathUtil3)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      long var6 = (var3 << 8 | (long)var5 << 56 >>> 56) ^ encKey_C_2;
      long var8 = var6 ^ 52075140329421L;
      return this.method_009(new Object[]{var8, var2});
   }

   public ԏ invoke_12(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = encKey_C_2 ^ var2;
      long var5 = var2 ^ 96293450307606L;
      return this.method_009(new Object[]{var5, null});
   }

   public ԏ invoke_13(Object[] var1) {
      long var2 = (Long)var1[0];
      ա var4 = (ա)var1[1];
      ԡ var5 = (ԡ)var1[2];
      MathUtil3 var6 = (MathUtil3)var1[3];
      var2 = encKey_C_2 ^ var2;
      long var7 = var2 ^ 27669666339565L;
      return this.method_009(new Object[]{var7, var6});
   }

   public abstract ԏ invoke_8(Object[] var1) throws ÿ;

   public abstract ԏ invoke_7(Object[] var1) throws ÿ;

   public abstract ԏ invoke_6(Object[] var1) throws ÿ;

   public abstract ԏ invoke_5(Object[] var1) throws ÿ;

   public abstract ԏ invoke_4(Object[] var1) throws ÿ;

   public abstract ԏ invoke_3(Object[] var1) throws ÿ;

   public abstract void invoke_2(Object[] var1) throws ÿ;

   public abstract ԏ invoke_1(Object[] var1);

   public static void execute_14(String[] var0) {
      arr_þ_2 = var0;
   }

   public static String[] invoke_15() {
      return arr_þ_2;
   }

   static {
      if (method_015() != null) {
         method_014(new String[2]);
      }
   }
}
