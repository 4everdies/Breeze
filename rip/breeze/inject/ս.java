package rip.breeze.inject;

import java.util.ArrayList;

public class ս extends վ {
   private final վ վ_ú_2;
   private final ք ք_ù_2;
   private ArrayList<String> arrayList_ø_2;

   public ս(վ var1, long var2, ք var4) {
      var2 = encKey_a_2 ^ var2;
      long var10001 = var2 ^ 88099819387510L;
      int var5 = (int)((var2 ^ 88099819387510L) >>> 32);
      int var6 = (int)((var2 ^ 88099819387510L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      this(589824, var5, (short)var6, var1, var4, var7);
   }

   protected ս(int var1, int var2, short var3, վ var4, ք var5, int var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ encKey_a_2;
      long var9 = var7 ^ 44791285508893L;
      super(var1, var9);
      this.arrayList_ø_2 = new ArrayList<>();
      this.վ_ú_2 = var4;
      this.ք_ù_2 = var5;
   }

   @Override
   public void invoke_12(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 43715898075173L;
      long var7 = var2 ^ 0L;
      this.arrayList_ø_2.add(var4);
      this.վ_ú_2.method_012(new Object[]{var7, this.ք_ù_2.method_008(new Object[]{var5, var4})});
   }

   @Override
   public void invoke_13(Object[] var1) {
      long var7;
      String var13;
      int var16;
      label14: {
         long var2 = (Long)var1[0];
         String var4 = (String)var1[1];
         long var5 = var2 ^ 40707377222967L;
         var7 = var2 ^ 0L;
         String var9 = this.arrayList_ø_2.remove(this.arrayList_ø_2.size() - 1);
         String var10 = method_001(new Object[]{var9, var4});
         int[] var10000 = ք.method_020();
         this.arrayList_ø_2.add(var10);
         int[] var11 = var10000;
         String var12 = method_002(new Object[]{this.ք_ù_2.method_008(new Object[]{var5, var9})});
         var13 = this.ք_ù_2.method_008(new Object[]{var5, var10});
         var16 = var13.startsWith(var12);
         if (var11 != null) {
            if (var16 != 0) {
               var16 = var12.length();
               break label14;
            }

            var16 = var13.lastIndexOf(36);
         }

         var16 += 1;
      }

      int var14 = var16;
      this.վ_ú_2.method_013(new Object[]{var7, var13.substring(var14)});
   }

   private static String invoke_1(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      return var1 + "$" + var2;
   }

   private static String invoke_2(Object[] var0) {
      String var1 = (String)var0[0];
      return var1 + "$";
   }

   @Override
   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      this.վ_ú_2.method_001(new Object[]{var5, var4});
   }

   @Override
   public void invoke_10(Object[] var1) {
      String var2 = (String)var1[0];
      this.վ_ú_2.method_010(new Object[]{var2});
   }

   @Override
   public վ invoke_11(Object[] var1) {
      this.վ_ú_2.method_011(new Object[0]);
      return this;
   }

   @Override
   public void invoke_9(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.վ_ú_2.method_009(new Object[]{var2});
   }

   @Override
   public վ invoke_2(Object[] var1) {
      this.վ_ú_2.method_002(new Object[0]);
      return this;
   }

   @Override
   public վ invoke_8(Object[] var1) {
      this.վ_ú_2.method_008(new Object[0]);
      return this;
   }

   @Override
   public վ invoke_5(Object[] var1) {
      this.վ_ú_2.method_005(new Object[0]);
      return this;
   }

   @Override
   public վ invoke_3(Object[] var1) {
      this.վ_ú_2.method_003(new Object[0]);
      return this;
   }

   @Override
   public վ invoke_6(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      this.վ_ú_2.method_006(new Object[]{var4});
      return this;
   }

   @Override
   public վ invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      this.վ_ú_2.method_007(new Object[]{var4});
      return this;
   }

   @Override
   public վ invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      this.վ_ú_2.method_004(new Object[]{var4});
      return this;
   }

   @Override
   public void invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      this.վ_ú_2.method_014(new Object[]{var4});
   }

   @Override
   public վ invoke_15(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      long var5 = var2 ^ 0L;
      վ var10000 = this.վ_ú_2;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var5;
      var10000.method_015(var10004);
      return this;
   }

   @Override
   public void invoke_16(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      this.վ_ú_2.method_016(new Object[]{var4});
      this.arrayList_ø_2.remove(this.arrayList_ø_2.size() - 1);
   }
}
