package rip.breeze.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import rip.breeze.LicenseState;

public final class HttpUtil4 {
   public static final Util64<Class> CONST_A = new Util142().a();
   public static final IMarker2 CONST_B = getIMarker2(Class.class, CONST_A);
   public static final Util64<BitSet> CONST_C = new BreezeColor().a();
   public static final IMarker2 CONST_D = getIMarker2(BitSet.class, CONST_C);
   public static final Util64<Boolean> CONST_E = new Util59();
   public static final Util64<Boolean> CONST_F = new Util60();
   public static final IMarker2 CONST_G = getIMarker2_2(boolean.class, Boolean.class, CONST_E);
   public static final Util64<Number> CONST_H = new Util61();
   public static final IMarker2 CONST_I = getIMarker2_2(byte.class, Byte.class, CONST_H);
   public static final Util64<Number> CONST_J = new Util62();
   public static final IMarker2 CONST_K = getIMarker2_2(short.class, Short.class, CONST_J);
   public static final Util64<Number> CONST_L = new Util63();
   public static final IMarker2 CONST_M = getIMarker2_2(int.class, Integer.class, CONST_L);
   public static final Util64<AtomicInteger> CONST_N = new Util65().a();
   public static final IMarker2 CONST_O = getIMarker2(AtomicInteger.class, CONST_N);
   public static final Util64<AtomicBoolean> CONST_P = new Util66().a();
   public static final IMarker2 CONST_Q = getIMarker2(AtomicBoolean.class, CONST_P);
   public static final Util64<AtomicIntegerArray> CONST_R = new Util82().a();
   public static final IMarker2 CONST_S = getIMarker2(AtomicIntegerArray.class, CONST_R);
   public static final Util64<Number> CONST_T = new Util83();
   public static final Util64<Number> CONST_U = new Util85();
   public static final Util64<Number> CONST_V = new Util86();
   public static final Util64<Number> CONST_W = new Util87();
   public static final IMarker2 CONST_X = getIMarker2(Number.class, CONST_W);
   public static final Util64<Character> CONST_Y = new Util88();
   public static final IMarker2 CONST_Z = getIMarker2_2(char.class, Character.class, CONST_Y);
   public static final Util64<String> CONST_A_2 = new Util89();
   public static final Util64<BigDecimal> CONST_B_2 = new Util90();
   public static final Util64<BigInteger> CONST_C_2 = new Util91();
   public static final IMarker2 CONST_D_2 = getIMarker2(String.class, CONST_A_2);
   public static final Util64<StringBuilder> CONST_E_2 = new Util92();
   public static final IMarker2 CONST_F_2 = getIMarker2(StringBuilder.class, CONST_E_2);
   public static final Util64<StringBuffer> CONST_G_2 = new Util93();
   public static final IMarker2 CONST_H_2 = getIMarker2(StringBuffer.class, CONST_G_2);
   public static final Util64<URL> CONST_I_2 = new HttpUtil1();
   public static final IMarker2 CONST_J_2 = getIMarker2(URL.class, CONST_I_2);
   public static final Util64<URI> CONST_K_2 = new Util95();
   public static final IMarker2 CONST_L_2 = getIMarker2(URI.class, CONST_K_2);
   public static final Util64<InetAddress> CONST_M_2 = new Util41();
   public static final IMarker2 CONST_N_2 = getIMarker2_4(InetAddress.class, CONST_M_2);
   public static final Util64<UUID> CONST_O_2 = new Util46();
   public static final IMarker2 CONST_P_2 = getIMarker2(UUID.class, CONST_O_2);
   public static final Util64<Currency> CONST_Q_2 = new Util51().a();
   public static final IMarker2 CONST_R_2 = getIMarker2(Currency.class, CONST_Q_2);
   public static final IMarker2 CONST_S_2 = new Lambda7();
   public static final Util64<Calendar> CONST_T_2 = new Util140();
   public static final IMarker2 CONST_U_2 = getIMarker2_3(Calendar.class, GregorianCalendar.class, CONST_T_2);
   public static final Util64<Locale> CONST_V_2 = new HttpUtil();
   public static final IMarker2 CONST_W_2 = getIMarker2(Locale.class, CONST_V_2);
   public static final Util64<PlayerUtil8> CONST_X_2 = new PlayerUtil4();
   public static final IMarker2 CONST_Y_2 = getIMarker2_4(PlayerUtil8.class, CONST_X_2);
   public static final IMarker2 CONST_Z_2 = new Lambda8();
   private static LicenseState[] arr_aa;

   public static <TT> IMarker2 getIMarker2(Class<TT> var0, Util64<TT> var1) {
      return new Util104(var0, var1);
   }

   public static <TT> IMarker2 getIMarker2_2(Class<TT> var0, Class<TT> var1, Util64<? super TT> var2) {
      return new Util105(var0, var1, var2);
   }

   public static <TT> IMarker2 getIMarker2_3(Class<TT> var0, Class<? extends TT> var1, Util64<? super TT> var2) {
      return new Util106(var0, var1, var2);
   }

   public static <T1> IMarker2 getIMarker2_4(Class<T1> var0, Util64<T1> var1) {
      return new Util107(var0, var1);
   }

   static {
      initialize(null);
   }

   public static void initialize(LicenseState[] var0) {
      arr_aa = var0;
   }

   public static LicenseState[] values() {
      return arr_aa;
   }
}
