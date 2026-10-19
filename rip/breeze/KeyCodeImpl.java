package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class KeyCodeImpl implements IKeyCodeProvider {
   private static final String CONST_B;

   public int getValue() {
      return 0;
   }

   public int getValue_2() {
      return 1;
   }

   public int getValue_3() {
      return 2;
   }

   public int getValue_4() {
      return 3;
   }

   public int getValue_5() {
      return 4;
   }

   public int getValue_6() {
      return 5;
   }

   public int getValue_7() {
      return 6;
   }

   public int getValue_8() {
      return 7;
   }

   public int getValue_9() {
      return 8;
   }

   public int getValue_10() {
      return 9;
   }

   public int getValue_11() {
      return 10;
   }

   public int getValue_12() {
      return 11;
   }

   public int getValue_13() {
      return 12;
   }

   public int getValue_14() {
      return 13;
   }

   public int getValue_15() {
      return 14;
   }

   public int getValue_16() {
      return 15;
   }

   public int getValue_17() {
      return 16;
   }

   public int getValue_18() {
      return 17;
   }

   public int getValue_19() {
      return 18;
   }

   public int getValue_20() {
      return 19;
   }

   public int getValue_21() {
      return 20;
   }

   public int getValue_22() {
      return 21;
   }

   public int getValue_23() {
      return 22;
   }

   public int getValue_24() {
      return 23;
   }

   public int getValue_25() {
      return 24;
   }

   public int getValue_26() {
      return 25;
   }

   public int getValue_27() {
      return 26;
   }

   public int getValue_28() {
      return 27;
   }

   public int getValue_29() {
      return 28;
   }

   public int getValue_30() {
      return 29;
   }

   public int getValue_31() {
      return 30;
   }

   public int getValue_32() {
      return 31;
   }

   public int getValue_33() {
      return 32;
   }

   public int getValue_34() {
      return 33;
   }

   public int getValue_35() {
      return 34;
   }

   public int getValue_36() {
      return 35;
   }

   public int getValue_37() {
      return 36;
   }

   public int getValue_38() {
      return 37;
   }

   public int getValue_39() {
      return 38;
   }

   public int getValue_40() {
      return 39;
   }

   public int getValue_41() {
      return 40;
   }

   public int getValue_42() {
      return 41;
   }

   public int getValue_43() {
      return 42;
   }

   public int getValue_44() {
      return 43;
   }

   public int getValue_45() {
      return 44;
   }

   public int getValue_46() {
      return 45;
   }

   public int getValue_47() {
      return 46;
   }

   public int getValue_48() {
      return 47;
   }

   public int getValue_49() {
      return 48;
   }

   public int getValue_50() {
      return 49;
   }

   public int getValue_51() {
      return 50;
   }

   public int getValue_52() {
      return 51;
   }

   public int getValue_53() {
      return 52;
   }

   public int getValue_54() {
      return 53;
   }

   public int getValue_55() {
      return 54;
   }

   public int getValue_56() {
      return 56;
   }

   public int getValue_57() {
      return 57;
   }

   public int getValue_58() {
      return 58;
   }

   public int getValue_59() {
      return 59;
   }

   public int getValue_60() {
      return 60;
   }

   public int getValue_61() {
      return 61;
   }

   public int getValue_62() {
      return 62;
   }

   public int getValue_63() {
      return 63;
   }

   public int getValue_64() {
      return 64;
   }

   public int getValue_65() {
      return 65;
   }

   public int getValue_66() {
      return 66;
   }

   public int getValue_67() {
      return 67;
   }

   public int getValue_68() {
      return 68;
   }

   public int getValue_69() {
      return 87;
   }

   public int getValue_70() {
      return 88;
   }

   public int getValue_71() {
      return 100;
   }

   public int getValue_72() {
      return 101;
   }

   public int getValue_73() {
      return 102;
   }

   public int getValue_74() {
      return 103;
   }

   public int getValue_75() {
      return 104;
   }

   public int getValue_76() {
      return 105;
   }

   public int getValue_77() {
      return 113;
   }

   public int getValue_78() {
      return 203;
   }

   public int getValue_79() {
      return 205;
   }

   public int getValue_80() {
      return 200;
   }

   public int getValue_81() {
      return 208;
   }

   public int getValue_82() {
      return 55;
   }

   public int getValue_83() {
      return 69;
   }

   public int getValue_84() {
      return 71;
   }

   public int getValue_85() {
      return 72;
   }

   public int getValue_86() {
      return 73;
   }

   public int getValue_87() {
      return 74;
   }

   public int getValue_88() {
      return 75;
   }

   public int getValue_89() {
      return 76;
   }

   public int getValue_90() {
      return 77;
   }

   public int getValue_91() {
      return 79;
   }

   public int getValue_92() {
      return 80;
   }

   public int getValue_93() {
      return 81;
   }

   public int getValue_94() {
      return 82;
   }

   public int getValue_95() {
      return 83;
   }

   public int getValue_96() {
      return 141;
   }

   public int getValue_97() {
      return 156;
   }

   public int getValue_98() {
      return 157;
   }

   public int getValue_99() {
      return 181;
   }

   public int getValue_100() {
      return 56;
   }

   public int getValue_101() {
      return 70;
   }

   public int getValue_102() {
      return 183;
   }

   public int getValue_103() {
      return 197;
   }

   public int getValue_104() {
      return 199;
   }

   public int getValue_105() {
      return 201;
   }

   public int getValue_106() {
      return 207;
   }

   public int getValue_107() {
      return 209;
   }

   public int getValue_108() {
      return 210;
   }

   public int getValue_109() {
      return 211;
   }

   public int getValue_110() {
      return 219;
   }

   public int getValue_111() {
      return 220;
   }

   public int getValue_112() {
      return 220;
   }

   public int getValue_113() {
      return 221;
   }

   public String getString(int var1) {
      long var2 = 50875104718560L;
      String var4 = Keyboard.getKeyName(var1);
      return var4 != null ? var4 : CONST_B;
   }

   public boolean checkCondition() {
      long var1 = 62718586583358L;
      return Keyboard.isKeyDown(this.getValue_98()) || Keyboard.isKeyDown(this.getValue_30());
   }

   public boolean checkCondition_2() {
      long var1 = 43180374811694L;
      return Keyboard.isKeyDown(this.getValue_55()) || Keyboard.isKeyDown(this.getValue_43());
   }

   public boolean isValid(int var1) {
      return Keyboard.isKeyDown(var1);
   }

   public boolean isValid_2(int var1) {
      return Mouse.isButtonDown(var1);
   }

   static {
      long var0 = 41141545801486L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Käò.n`.\u00ad".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_B = var5;
   }

   private static String buildString(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
