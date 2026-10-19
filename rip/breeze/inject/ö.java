package rip.breeze.inject;

import java.util.List;

public class ö extends ø {
   public List<ճ> list_ø;
   public List<ճ> list_ö;
   public List<Integer> list_õ;

   public ö(int var1, և var2, ճ[] var3, ճ[] var4, long var5, int[] var7, String var8) {
      var5 = encKey_c ^ var5;
      long var9 = var5 ^ 33219653024426L;
      this(var9, 589824, var1, var2, var3, var4, var7, var8);
   }

   public ö(long var1, int var3, int var4, և var5, ճ[] var6, ճ[] var7, int[] var8, String var9) {
      var1 = encKey_c ^ var1;
      long var10 = var1 ^ 54459447524513L;
      long var12 = var1 ^ 72415542735123L;
      long var14 = var1 ^ 6780632839862L;
      super(var14, var3, var4, var5, var9);
      this.list_ø = ԧ.method_003(new Object[]{var10, var6});
      this.list_ö = ԧ.method_003(new Object[]{var10, var7});
      this.list_õ = ԧ.method_008(new Object[]{var8, var12});
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      Util140 var4 = (Util140)var1[1];
      boolean var5 = (Boolean)var1[2];
      var2 = encKey_c ^ var2;
      long var6 = var2 ^ 5669939067453L;
      long var8 = var2 ^ 48683435935349L;
      long var10 = var2 ^ 69166371585137L;
      ª[] var12 = new ª[this.list_ø.size()];
      boolean var10000 = BreezeClass12.isValid();
      ª[] var13 = new ª[this.list_ö.size()];
      int[] var14 = new int[this.list_õ.size()];
      int var15 = 0;
      boolean var16 = var10000;
      int var17 = var12.length;

      while (true) {
         if (var15 < var17) {
            var12[var15] = this.list_ø.get(var15).method_001(new Object[]{var8});
            var13[var15] = this.list_ö.get(var15).method_001(new Object[]{var8});
            var14[var15] = this.list_õ.get(var15);
            var15++;
            var10000 = var16;
            if (var2 >= 0L) {
               if (var16) {
                  return;
               }

               var10000 = var16;
            }

            if (!var10000) {
               continue;
            }
         }

         do {
            int var10002 = this.ú;
            և var10003 = this.ù;
            Object[] var10011 = new Object[]{null, null, null, var12, var13, var14, this.ü, var5};
            var10011[2] = var10;
            var10011[1] = var10003;
            var10011[0] = var10002;
            this.ö(new Object[]{var6, var4.getÜ_7(var10011)});
            if (var2 >= 0L) {
               return;
            }

            var10000 = var16;
            if (var2 >= 0L) {
               if (var16) {
                  return;
               }

               var10000 = var16;
            }
         } while (var10000);
      }
   }
}
