package rip.breeze.inject;

abstract class BreezeClass3 {
   static final int CONST_Ÿ = 7;
   static final int CONST_Þ = 9;
   static final int CONST_Ý = 10;
   static final int CONST_Ü = 11;
   static final int CONST_Û = 8;
   static final int CONST_Ú = 3;
   static final int CONST_Ù = 4;
   static final int CONST_Ø = 5;
   static final int CONST_Ö = 6;
   static final int CONST_Õ = 12;
   static final int CONST_Ô = 1;
   static final int CONST_Ó = 15;
   static final int CONST_Ò = 16;
   static final int CONST_Ñ = 17;
   static final int CONST_Ð = 18;
   static final int CONST_Ï = 19;
   static final int CONST_Î = 20;
   static final int CONST_Í = 64;
   static final int CONST_Ì = 128;
   static final int CONST_Ë = 129;
   static final int CONST_Ê = 130;
   static final int CONST_É = 131;
   final int int_è;
   final int int_ç;
   final String string_æ;
   final String string_å;
   final String string_ä;
   final long long_ã;
   int int_â;

   BreezeClass3(int var1, int var2, String var3, String var4, String var5, long var6) {
      this.int_è = var1;
      this.int_ç = var2;
      this.string_æ = var3;
      this.string_å = var4;
      this.string_ä = var5;
      this.long_ã = var6;
   }

   int getValue(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 91241192446458L ^ var2;
      long var4 = var2 ^ 106063711880519L;
      int var6 = Util140.getValue_2();
      int var10000 = this.int_â;
      if (var6 != 0) {
         if (this.int_â == 0) {
            String var10002 = this.string_ä;
            this.int_â = MathUtil3.clamp_4(new Object[]{var4, var10002});
         }

         var10000 = this.int_â;
      }

      return var10000;
   }
}
