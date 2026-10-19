package rip.breeze;

import rip.breeze.client.UserTheme;

public class PlayerUtil2 extends ImageUtil15 {
   private final StringDecryptHelper2 stringDecryptHelper2_A;
   private final UserInfo userInfo_B;
   private UserTheme userTheme_C = new UserTheme();

   public PlayerUtil2(StringDecryptHelper2 var1, UserInfo var2, String var3) {
      super(var1.string_b, var3, var1.string_c);
      this.stringDecryptHelper2_A = var1;
      this.userInfo_B = var2;
   }

   public long getLong() {
      return this.stringDecryptHelper2_A.fieldLong_a;
   }

   public StringDecryptHelper2 getStringDecryptHelper2_A() {
      return this.stringDecryptHelper2_A;
   }

   public UserInfo getUserInfo_B() {
      return this.userInfo_B;
   }

   public UserTheme getUserTheme() {
      return this.userTheme_C;
   }

   public void processAll(UserTheme var1) {
      this.userTheme_C = var1 == null ? new UserTheme() : var1;
   }
}
