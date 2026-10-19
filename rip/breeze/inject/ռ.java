package rip.breeze.inject;

public class ռ extends վ {
   private final StringBuilder stringBuilder_ú_2;
   private boolean bool_ù_2;
   private boolean bool_ø_2;
   private int int_ö_2;

   public ռ(long var1) {
      var1 = encKey_a_2 ^ var1;
      long var3 = var1 ^ 6930360170939L;
      this(var3, new StringBuilder());
   }

   private ռ(long var1, StringBuilder var3) {
      var1 = encKey_a_2 ^ var1;
      long var4 = var1 ^ 114794753857012L;
      super(589824, var4);
      this.int_ö_2 = 1;
      this.stringBuilder_ú_2 = var3;
   }

   @Override
   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      ջ[] var5 = վ.method_019();
      if (var2 >= 0L) {
         ռ var10000 = this;
         if (var5 != null) {
            if (!this.bool_ù_2) {
               this.bool_ù_2 = true;
               this.stringBuilder_ú_2.append('<');
            }

            this.stringBuilder_ú_2.append(var4);
            var10000 = this;
         }

         var10000.stringBuilder_ú_2.append(':');
      }
   }

   @Override
   public վ invoke_2(Object[] var1) {
      return this;
   }

   @Override
   public վ invoke_3(Object[] var1) {
      this.stringBuilder_ú_2.append(':');
      return this;
   }

   @Override
   public վ invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 19038392299202L;
      this.method_001(new Object[]{var4});
      return this;
   }

   @Override
   public վ invoke_5(Object[] var1) {
      return this;
   }

   @Override
   public վ invoke_6(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 74941132574134L;
      ջ[] var10000 = վ.method_019();
      this.method_001(new Object[]{var4});
      ջ[] var6 = var10000;
      ռ var7 = this;
      if (var6 != null) {
         if (!this.bool_ø_2) {
            this.bool_ø_2 = true;
            this.stringBuilder_ú_2.append('(');
         }

         var7 = this;
      }

      return var7;
   }

   @Override
   public վ invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 103351156461031L;
      ջ[] var10000 = վ.method_019();
      this.method_001(new Object[]{var4});
      ջ[] var6 = var10000;
      ռ var7 = this;
      if (var6 != null) {
         if (!this.bool_ø_2) {
            this.stringBuilder_ú_2.append('(');
         }

         this.stringBuilder_ú_2.append(')');
         var7 = this;
      }

      return var7;
   }

   @Override
   public վ invoke_8(Object[] var1) {
      this.stringBuilder_ú_2.append('^');
      return this;
   }

   @Override
   public void invoke_9(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.stringBuilder_ú_2.append((char)var2);
   }

   @Override
   public void invoke_10(Object[] var1) {
      String var2 = (String)var1[0];
      this.stringBuilder_ú_2.append('T');
      this.stringBuilder_ú_2.append(var2);
      this.stringBuilder_ú_2.append(';');
   }

   @Override
   public վ invoke_11(Object[] var1) {
      this.stringBuilder_ú_2.append('[');
      return this;
   }

   @Override
   public void invoke_12(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      this.stringBuilder_ú_2.append('L');
      this.stringBuilder_ú_2.append(var4);
      this.int_ö_2 <<= 1;
   }

   @Override
   public void invoke_13(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 109830874132882L;
      վ.method_019();
      this.method_002(new Object[]{var5});
      this.stringBuilder_ú_2.append('.');
      this.stringBuilder_ú_2.append(var4);
      this.int_ö_2 <<= 1;
      if (ջ.method_012()) {
         վ.method_018(new ջ[3]);
      }
   }

   @Override
   public void invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
      ջ[] var4 = վ.method_019();
      if (var2 >= 0L) {
         ռ var10000 = this;
         if (var4 != null) {
            if ((this.int_ö_2 & 1) == 0) {
               this.int_ö_2 |= 1;
               this.stringBuilder_ú_2.append('<');
            }

            var10000 = this;
         }

         var10000.stringBuilder_ú_2.append('*');
      }
   }

   @Override
   public վ invoke_15(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      long var5 = var2 ^ 24749206044457L;
      ջ[] var7 = վ.method_019();
      int var10000 = this.int_ö_2 & 1;
      if (var7 != null) {
         if (var10000 == 0) {
            this.int_ö_2 |= 1;
            this.stringBuilder_ú_2.append('<');
         }

         var10000 = var4;
      }

      int var10001 = 61;
      if (var7 != null) {
         if (var10000 != 61) {
            this.stringBuilder_ú_2.append((char)var4);
         }

         if (var7 == null) {
            return this;
         }

         var10000 = this.int_ö_2;
         var10001 = Integer.MIN_VALUE;
      }

      return (var10000 & var10001) == 0 ? this : new ռ(var5, this.stringBuilder_ú_2);
   }

   @Override
   public void invoke_16(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 43218048882792L;
      this.method_002(new Object[]{var4});
      this.stringBuilder_ú_2.append(';');
   }

   @Override
   public String toString() {
      return this.stringBuilder_ú_2.toString();
   }

   private void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      ջ[] var4 = վ.method_019();
      ռ var10000 = this;
      if (var4 != null) {
         if (!this.bool_ù_2) {
            return;
         }

         this.bool_ù_2 = false;
         var10000 = this;
      }

      var10000.stringBuilder_ú_2.append('>');
   }

   private void invoke_2(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      ջ[] var4 = վ.method_019();
      ռ var10000 = this;
      if (var4 != null) {
         if ((this.int_ö_2 & 1) == 1) {
            this.stringBuilder_ú_2.append('>');
         }

         var10000 = this;
      }

      var10000.int_ö_2 >>>= 1;
   }
}
