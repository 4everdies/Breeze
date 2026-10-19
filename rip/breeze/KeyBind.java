package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class KeyBind {
   public static final Function<String, KeyBind> CONST_A;
   public static final KeyBind CONST_B;
   public static final KeyBind CONST_C;
   public static final KeyBind CONST_D;
   public static final KeyBind CONST_E;
   public static final KeyBind CONST_F;
   public static final KeyBind CONST_G;
   public static final KeyBind CONST_H;
   public static final KeyBind CONST_I;
   public static final KeyBind CONST_J;
   public static final KeyBind CONST_K;
   public static final KeyBind CONST_L;
   public static final KeyBind CONST_M;
   public static final KeyBind CONST_N;
   public static final KeyBind CONST_O;
   public static final KeyBind CONST_P;
   public static final KeyBind CONST_Q;
   public static final KeyBind CONST_R;
   public static final KeyBind CONST_S;
   public static final KeyBind CONST_T;
   public static final KeyBind CONST_U;
   public static final KeyBind CONST_V;
   public static final KeyBind CONST_W;
   public static final KeyBind CONST_X;
   public static final KeyBind CONST_Y;
   public static final KeyBind CONST_Z;
   public static final KeyBind CONST_A_2;
   public static final KeyBind CONST_B_2;
   public static final KeyBind CONST_C_2;
   public static final KeyBind CONST_D_2;
   public static final KeyBind CONST_E_2;
   public static final KeyBind CONST_F_2;
   public static final KeyBind CONST_G_2;
   public static final KeyBind CONST_H_2;
   public static final KeyBind CONST_I_2;
   public static final KeyBind CONST_J_2;
   public static final KeyBind CONST_K_2;
   public static final KeyBind CONST_L_2;
   public static final KeyBind CONST_M_2;
   public static final KeyBind CONST_N_2;
   public static final KeyBind CONST_O_2;
   public static final KeyBind CONST_P_2;
   public static final KeyBind CONST_Q_2;
   public static final KeyBind CONST_R_2;
   public static final KeyBind CONST_S_2;
   public static final KeyBind CONST_T_2;
   public static final KeyBind CONST_U_2;
   public static final KeyBind CONST_V_2;
   public static final KeyBind CONST_W_2;
   public static final KeyBind CONST_X_2;
   public static final KeyBind CONST_Y_2;
   public static final KeyBind CONST_Z_2;
   public static final KeyBind CONST_AA;
   public static final KeyBind CONST_AB;
   public static final KeyBind CONST_AC;
   public static final KeyBind CONST_AD;
   public static final KeyBind CONST_AE;
   public static final KeyBind CONST_AF;
   public static final KeyBind CONST_AG;
   public static final KeyBind CONST_AH;
   public static final KeyBind CONST_AI;
   public static final KeyBind CONST_AJ;
   public static final KeyBind CONST_AK;
   public static final KeyBind CONST_AL;
   public static final KeyBind CONST_AM;
   public static final KeyBind CONST_AN;
   public static final KeyBind CONST_AO;
   public static final KeyBind CONST_AP;
   public static final KeyBind CONST_AQ;
   public static final KeyBind CONST_AR;
   public static final KeyBind CONST_AS;
   public static final KeyBind CONST_AT;
   public static final KeyBind CONST_AU;
   public static final KeyBind CONST_AV;
   public static final KeyBind CONST_AW;
   public static final KeyBind CONST_AX;
   public static final KeyBind CONST_AY;
   public static final KeyBind CONST_AZ;
   public static final KeyBind CONST_AA_2;
   public static final KeyBind CONST_AB_2;
   public static final KeyBind CONST_AC_2;
   public static final KeyBind CONST_AD_2;
   public static final KeyBind CONST_AE_2;
   public static final KeyBind CONST_AF_2;
   public static final KeyBind CONST_AG_2;
   public static final KeyBind CONST_AH_2;
   public static final KeyBind CONST_AI_2;
   public final int int_aJ;
   private static int[] arr_aK;
   private static final String[] CONST_CB;
   private static final String[] CONST_DB;
   private static final Map CONST_EB = new HashMap(13);

   public KeyBind(int var1) {
      this.int_aJ = var1;
   }

   public KeyBind() {
      this(BreezeContext.iKeyCodeProvider_g.getKeyCode());
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 114085722494854L;
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof KeyBind)) {
         return false;
      }

      KeyBind var4 = (KeyBind)var1;
      return var4.int_aJ == this.int_aJ;
   }

   public boolean checkCondition() {
      long var1 = 9540961582152L;
      return this.isValid()
         ? BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_117(this.int_aJ * -1 - 2)
         : BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_116(this.int_aJ);
   }

   @Override
   public int hashCode() {
      return this.int_aJ * 31;
   }

   @Override
   public String toString() {
      return String.valueOf(this.int_aJ);
   }

   public boolean isValid() {
      long var1 = 13880965705816L;
      return this.int_aJ < -1;
   }

   public String buildString() {
      long var1 = 113338165206411L;
      if (this.isValid()) {
         switch (this.int_aJ * -1 - 1) {
            case 1:
               return "Left Mouse";
            case 2:
               return "Right Mouse";
            case 3:
               return "Middle Mouse";
            default:
               return "Mouse " + (this.int_aJ * -1 - 1);
         }
      } else {
         String var3 = BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_113(this.int_aJ);
         return !var3.isEmpty() ? var3 : String.format("Key:  %d", this.int_aJ);
      }
   }

   private static KeyBind lambda$static_Inner0(String var0) {
      return new KeyBind(Integer.decode(var0));
   }

   static {
      initialize(null);
      long var0 = 108704740571601L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "¤\u001cc\u008d\u0014·Òp§Ì\u0010\bw5\u0088?â\"³t;þ\u0086üAÓßÏ\u0016\u0087\rº\u0018ä¢/î]<¿ºóa¦\u001b:\u008d^\u009dº\b\u009aOÌþ\u0004\b\u0010/\t\u0003\u0001¿Ú\u0090p+Ì*\u0010æµ\u0011¤";
      int var7 = "¤\u001cc\u008d\u0014·Òp§Ì\u0010\bw5\u0088?â\"³t;þ\u0086üAÓßÏ\u0016\u0087\rº\u0018ä¢/î]<¿ºóa¦\u001b:\u008d^\u009dº\b\u009aOÌþ\u0004\b\u0010/\t\u0003\u0001¿Ú\u0090p+Ì*\u0010æµ\u0011¤"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_CB = var4;
                     CONST_DB = new String[5];
                     CONST_A = KeyBind::lambda$static_Inner0;
                     CONST_B = new KeyBind(-2);
                     CONST_C = new KeyBind(-3);
                     CONST_D = new KeyBind(-4);
                     CONST_E = new KeyBind(-5);
                     CONST_F = new KeyBind(-6);
                     CONST_G = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode());
                     CONST_H = new KeyBind(BreezeContext.iKeyCodeProvider_g.getModifiedKeyCode());
                     CONST_I = new KeyBind(BreezeContext.iKeyCodeProvider_g.getModifiers());
                     CONST_J = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_2());
                     CONST_K = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_3());
                     CONST_L = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_4());
                     CONST_M = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_5());
                     CONST_N = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_6());
                     CONST_O = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_7());
                     CONST_P = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_8());
                     CONST_Q = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_9());
                     CONST_R = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_0());
                     CONST_S = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_MINUS());
                     CONST_T = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_EQUALS());
                     CONST_U = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_BACK());
                     CONST_V = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_TAB());
                     CONST_W = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_Q());
                     CONST_X = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_W());
                     CONST_Y = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_E());
                     CONST_Z = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_R());
                     CONST_A_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_T());
                     CONST_B_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_Y());
                     CONST_C_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_U());
                     CONST_D_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_I());
                     CONST_E_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_O());
                     CONST_F_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_P());
                     CONST_G_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_LBRACKET());
                     CONST_H_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_RBRACKET());
                     CONST_I_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_RETURN());
                     CONST_J_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_LCONTROL());
                     CONST_K_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_A());
                     CONST_L_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_S());
                     CONST_M_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_D());
                     CONST_N_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F());
                     CONST_O_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_G());
                     CONST_P_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_H());
                     CONST_Q_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_J());
                     CONST_R_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_K());
                     CONST_S_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_L());
                     CONST_T_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_SEMICOLON());
                     CONST_U_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_APOSTROPHE());
                     CONST_V_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_GRAVE());
                     CONST_W_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_LSHIFT());
                     CONST_X_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_BACKSLASH());
                     CONST_Y_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_Z());
                     CONST_Z_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_X());
                     CONST_AA = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_C());
                     CONST_AB = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_V());
                     CONST_AC = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_B());
                     CONST_AD = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_N());
                     CONST_AE = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_M());
                     CONST_AF = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_COMMA());
                     CONST_AG = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_PERIOD());
                     CONST_AH = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_SLASH());
                     CONST_AI = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_RSHIFT());
                     CONST_AJ = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_MULTIPLY());
                     CONST_AK = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_LMENU());
                     CONST_AL = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_SPACE());
                     CONST_AM = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_CAPITAL());
                     CONST_AN = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F1());
                     CONST_AO = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F2());
                     CONST_AP = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F3());
                     CONST_AQ = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F4());
                     CONST_AR = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F5());
                     CONST_AS = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F6());
                     CONST_AT = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F7());
                     CONST_AU = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F8());
                     CONST_AV = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F9());
                     CONST_AW = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_F10());
                     CONST_AX = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMLOCK());
                     CONST_AY = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_SCROLL());
                     CONST_AZ = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD7());
                     CONST_AA_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD8());
                     CONST_AB_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD9());
                     CONST_AC_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_SUBTRACT());
                     CONST_AD_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD4());
                     CONST_AE_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD5());
                     CONST_AF_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD6());
                     CONST_AG_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_ADD());
                     CONST_AH_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD1());
                     CONST_AI_2 = new KeyBind(BreezeContext.iKeyCodeProvider_g.getKeyCode_NUMPAD2());
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Õy\u000b\u007fÐx24¶8/Z\u0010\u009fÆ°É\u0000å»©Ë¨Ï\u0087\u0088çî¶Úb)\u0018èê\u0016\\¼\u001f\u0097\brFDéÆÁ{©EGi\u0086\u0093¥û(";
                  var7 = "Õy\u000b\u007fÐx24¶8/Z\u0010\u009fÆ°É\u0000å»©Ë¨Ï\u0087\u0088çî¶Úb)\u0018èê\u0016\\¼\u001f\u0097\brFDéÆÁ{©EGi\u0086\u0093¥û("
                     .length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_aK = var0;
   }

   public static int[] values() {
      return arr_aK;
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27325;
      if (CONST_DB[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_EB.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_EB.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cH", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_CB[var3].getBytes("ISO-8859-1");
         CONST_DB[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_DB[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/cH" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
