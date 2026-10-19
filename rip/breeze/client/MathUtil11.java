package rip.breeze.client;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public final class MathUtil11 {
   private static final ImageUtil15<?> CONST_A;
   private final ThreadLocal<Map<ImageUtil15<?>, be<?>>> threadLocal_b;
   private final Map<ImageUtil15<?>, Util64<?>> map_c;
   private final List<IMarker2> list_d;
   private final Util68 clientUtil23_e;
   private final Util69 clientUtil24_f;
   private final IMarker iMarker_g;
   private final boolean fieldBool_h;
   private final boolean fieldBool_i;
   private final boolean fieldBool_j;
   private final boolean fieldBool_k;
   private final boolean fieldBool_l;
   private final Util119 clientUtil8_m;
   private static LicenseState[] arr_n;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public MathUtil11() {
      long var1 = 20542458549895L;
      long var3 = (var1 ^ 113149066689935L) >>> 16;
      int var5 = (int)((var1 ^ 113149066689935L) << 48 >>> 48);
      this(
         Util69.CONST_A,
         EnumType6.IDENTITY,
         Collections.emptyMap(),
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         var3,
         EnumType14.DEFAULT,
         Collections.emptyList(),
         (short)var5
      );
   }

   MathUtil11(
      Util69 var1,
      IMarker var2,
      Map var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      long var11,
      EnumType14 var13,
      List var14,
      short var15
   ) {
      long var16 = (var11 << 16 | (long)var15 << 48 >>> 48) ^ 78671405987151L;
      long var18 = var16 ^ 71976029025158L;
      long var10001 = var16 ^ 43714037330061L;
      int var20 = (int)((var16 ^ 43714037330061L) >>> 32);
      int var21 = (int)((var16 ^ 43714037330061L) << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var16 ^ 26050988247904L;
      super();
      this.threadLocal_b = new ThreadLocal<>();
      this.map_c = new ConcurrentHashMap<>();
      this.clientUtil23_e = new Util68(var3);
      this.clientUtil24_f = var1;
      this.iMarker_g = var2;
      this.fieldBool_h = var4;
      this.fieldBool_j = var6;
      this.fieldBool_i = var7;
      this.fieldBool_k = var8;
      this.fieldBool_l = var9;
      ArrayList var25 = new ArrayList();
      var25.add(HttpUtil4.CONST_Y_2);
      var25.add(Util79.CONST_A);
      var25.add(var1);
      var25.addAll(var14);
      var25.add(HttpUtil4.CONST_D_2);
      var25.add(HttpUtil4.CONST_M);
      var25.add(HttpUtil4.CONST_G);
      var25.add(HttpUtil4.CONST_I);
      var25.add(HttpUtil4.CONST_K);
      Util64 var26 = getClientUtil2_3(var18, var13);
      var25.add(HttpUtil4.getIMarker2_2(long.class, Long.class, var26));
      var25.add(HttpUtil4.getIMarker2_2(double.class, Double.class, this.getClientUtil2(var10, var23)));
      var25.add(HttpUtil4.getIMarker2_2(float.class, Float.class, this.getClientUtil2_2(var20, var10, var21, (char)var22)));
      var25.add(HttpUtil4.CONST_X);
      var25.add(HttpUtil4.CONST_O);
      var25.add(HttpUtil4.CONST_Q);
      var25.add(HttpUtil4.getIMarker2(AtomicLong.class, getClientUtil2_4(var26)));
      var25.add(HttpUtil4.getIMarker2(AtomicLongArray.class, getClientUtil2_5(var26)));
      var25.add(HttpUtil4.CONST_S);
      var25.add(HttpUtil4.CONST_Z);
      var25.add(HttpUtil4.CONST_F_2);
      var25.add(HttpUtil4.CONST_H_2);
      var25.add(HttpUtil4.getIMarker2(BigDecimal.class, HttpUtil4.CONST_B_2));
      var25.add(HttpUtil4.getIMarker2(BigInteger.class, HttpUtil4.CONST_C_2));
      var25.add(HttpUtil4.CONST_J_2);
      var25.add(HttpUtil4.CONST_L_2);
      var25.add(HttpUtil4.CONST_P_2);
      var25.add(HttpUtil4.CONST_R_2);
      var25.add(HttpUtil4.CONST_W_2);
      var25.add(HttpUtil4.CONST_N_2);
      var25.add(HttpUtil4.CONST_D);
      var25.add(Util78.CONST_A);
      var25.add(HttpUtil4.CONST_U_2);
      var25.add(Util81.CONST_A);
      var25.add(Util80.CONST_A);
      var25.add(HttpUtil4.CONST_S_2);
      var25.add(Util77.CONST_A);
      var25.add(HttpUtil4.CONST_B);
      var25.add(new Util113(this.clientUtil23_e));
      var25.add(new Util124(this.clientUtil23_e, var5));
      this.clientUtil8_m = new Util119(this.clientUtil23_e);
      var25.add(this.clientUtil8_m);
      var25.add(HttpUtil4.CONST_Z_2);
      var25.add(new Util72(this.clientUtil23_e, var2, var1, this.clientUtil8_m));
      this.list_d = Collections.unmodifiableList(var25);
   }

   private Util64 getClientUtil2(boolean var1, long var2) {
      var2 = 78671405987151L ^ var2;

      try {
         if (var1) {
            return HttpUtil4.CONST_V;
         }
      } catch (IllegalArgumentException var4) {
         throw getException(var4);
      }

      return new Util84(this);
   }

   private Util64 getClientUtil2_2(int var1, boolean var2, int var3, char var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ 78671405987151L;

      try {
         if (var2) {
            return HttpUtil4.CONST_U;
         }
      } catch (IllegalArgumentException var7) {
         throw getException(var7);
      }

      return new Util73(this);
   }

   static void processAll(long param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/MathUtil11.78671405987151L J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: dload 2
      // 07: invokestatic java/lang/Double.isNaN (D)Z
      // 0a: ifne 1b
      // 0d: dload 2
      // 0e: invokestatic java/lang/Double.isInfinite (D)Z
      // 11: ifeq 51
      // 14: goto 1b
      // 17: invokestatic rip/breeze/client/MathUtil11.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: new java/lang/IllegalArgumentException
      // 1e: dup
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: invokespecial java/lang/StringBuilder.<init> ()V
      // 26: dload 2
      // 27: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 2a: sipush 21977
      // 2d: ldc2_w 4285536859756727429
      // 30: lload 0
      // 31: lxor
      // 32: invokestatic rip/breeze/client/MathUtil11.buildString_3 (IJ)Ljava/lang/String;
      // 35: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38: sipush 11270
      // 3b: ldc2_w 1559639149148829016
      // 3e: lload 0
      // 3f: lxor
      // 40: invokestatic rip/breeze/client/MathUtil11.buildString_3 (IJ)Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4c: athrow
      // 4d: invokestatic rip/breeze/client/MathUtil11.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: return
      // try (4 -> 10): 11 java/lang/IllegalArgumentException
      // try (7 -> 35): 35 java/lang/IllegalArgumentException
   }

   private static Util64 getClientUtil2_3(long var0, EnumType14 var2) {
      var0 = 78671405987151L ^ var0;

      try {
         if (var2 == EnumType14.DEFAULT) {
            return HttpUtil4.CONST_T;
         }
      } catch (IllegalArgumentException var3) {
         throw getException(var3);
      }

      return new Util54();
   }

   private static Util64<AtomicLong> getClientUtil2_4(Util64<Number> var0) {
      return new Util74(var0).a();
   }

   private static Util64<AtomicLongArray> getClientUtil2_5(Util64<Number> var0) {
      return new Util75(var0).a();
   }

   public String buildString(PlayerUtil8 var1, int var2, byte var3, int var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ 78671405987151L;
      long var10001 = var5 ^ 34741123660976L;
      int var7 = (int)((var5 ^ 34741123660976L) >>> 48);
      int var8 = (int)((var5 ^ 34741123660976L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      java.io.StringWriter var10 = new java.io.StringWriter();
      this.processAll_2(var1, (char)var7, var8, var10, (short)var9);
      return var10.toString();
   }

   public void processAll_2(PlayerUtil8 var1, char var2, int var3, Appendable var4, short var5) throws AuthException {
      long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ 78671405987151L;
      long var8 = var6 ^ 27360065935376L;
      long var10 = var6 ^ 49502936665433L;
      long var12 = var6 ^ 71125900423297L;

      try {
         Util135 var14 = this.getDataBuilder19(Util102.getWriter(var4, var10), var8);
         this.processAll_3(var12, var1, var14);
      } catch (IOException var15) {
         throw new AuthException(var15);
      }
   }

   public Util135 getDataBuilder19(Writer var1, long var2) throws IOException {
      var2 = 78671405987151L ^ var2;
      long var4 = var2 ^ 123260240815238L;
      long var6 = var2 ^ 96748950023431L;

      try {
         if (this.fieldBool_j) {
            var1.write(buildString_3(30885, 157697022754751042L ^ var2));
         }
      } catch (IOException var10) {
         throw getException(var10);
      }

      Util135 var8 = new Util135(var4, var1);

      try {
         if (var2 < 0L) {
            return var8;
         }

         if (this.fieldBool_k) {
            var8.processAll(var6, buildString_3(6530, 7037384421225653090L ^ var2));
         }
      } catch (IOException var9) {
         throw getException(var9);
      }

      var8.setBool_k(this.fieldBool_h);
      return var8;
   }

   public void processAll_3(long var1, PlayerUtil8 var3, Util135 var4) throws AuthException {
      var1 = 78671405987151L ^ var1;
      long var5 = var1 ^ 54422141239336L;
      boolean var7 = var4.isBool_h();
      var4.setBool_h(true);
      boolean var8 = var4.isBool_i();
      var4.setBool_i(this.fieldBool_i);
      boolean var9 = var4.isBool_k();
      var4.setBool_k(this.fieldBool_h);

      try {
         Util102.updateCallSiteContext(var3, var5, var4);
      } catch (IOException var14) {
         throw new AuthException(var14);
      } finally {
         var4.setBool_h(var7);
         var4.setBool_i(var8);
         var4.setBool_k(var9);
      }
   }

   @Override
   public String toString() {
      long var1 = 46307606250136L;
      return buildString_3(17118, 5805241283520315780L ^ var1)
         + this.fieldBool_h
         + buildString_3(24802, 2042289151583249343L ^ var1)
         + this.list_d
         + buildString_3(17107, 1596304676394058127L ^ var1)
         + this.clientUtil23_e
         + "}";
   }

   static {
      long var0 = 10106690198774L;
      long var2 = var0 ^ 34315762918498L;
      initialize(null);
      Cipher var4;
      Cipher var10000 = var4 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var5 = 1; var5 < 8; var5++) {
         var10003[var5] = (byte)(var0 << var5 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var6 = new String[7];
      int var7 = 0;
      String var8 = "¥LÔÆ\u0091:\u0018/(Ú\u0088Ó\ne'$Ð\u0088Ã<\u001a½ï\u0096õ\u0086\u001c\u00128ÄØí\u0003\u0012ë}\u0084!F©¿RÕf\u0000sX(\u0015*c»ý\u009f·£<-Ðk}dØë/\u009cSÝçsZ\u0004Æ/\u0017<Ñð\u0002UõÕ\u0013\u0094?$0s\u00019\u0092Xu2a(\u009då¾òò\u0003ÓáCó\u008e\u0013ÊÞü\u009b\\í´Í\u0094Â\u0088î¦\u0001Ö\u009c¨_µ¸\u0010¢e\u0006\u008b\u000e\u0089I±Á\u000e$¬\u0006\u0000\u0016Ë\u0080.ßîVE`èöåÁÁd\u009f\u0080sçqG\u000bÊTC«IU\u007frª\u008cÝ&\u0018L}ç}]äûHvi\u0001+bi¾â\u0091\fe\u0014?V\u009afýù=~?ì~È%ä\u0093Îüd0×zkø-\u0088!t\u0084\u001f\u00172«±\r\u001e\u000f\b\u009e\u0004ë'©z\u008b·Û/a\u0086÷úH|D\u007f|õÀÑ)Ä\u001dA(ÓÁJ\u0093ÚY\u0015\u001b&_Ú\u000f(qf¦C¹NÙ~\u0097wY\u001bïtzdWØã[\u001f\u0095±9\u0002÷\u0096ÑõÜ\u0094èP<ØkÍ\u009aÿ\u0087 6õg\u0080o¤Êjk\r\u0099|\u001fä5(\u0094\u001fý\u001f\u000f^&ý8úq=B\u008as\u0095";
      int var9 = "¥LÔÆ\u0091:\u0018/(Ú\u0088Ó\ne'$Ð\u0088Ã<\u001a½ï\u0096õ\u0086\u001c\u00128ÄØí\u0003\u0012ë}\u0084!F©¿RÕf\u0000sX(\u0015*c»ý\u009f·£<-Ðk}dØë/\u009cSÝçsZ\u0004Æ/\u0017<Ñð\u0002UõÕ\u0013\u0094?$0s\u00019\u0092Xu2a(\u009då¾òò\u0003ÓáCó\u008e\u0013ÊÞü\u009b\\í´Í\u0094Â\u0088î¦\u0001Ö\u009c¨_µ¸\u0010¢e\u0006\u008b\u000e\u0089I±Á\u000e$¬\u0006\u0000\u0016Ë\u0080.ßîVE`èöåÁÁd\u009f\u0080sçqG\u000bÊTC«IU\u007frª\u008cÝ&\u0018L}ç}]äûHvi\u0001+bi¾â\u0091\fe\u0014?V\u009afýù=~?ì~È%ä\u0093Îüd0×zkø-\u0088!t\u0084\u001f\u00172«±\r\u001e\u000f\b\u009e\u0004ë'©z\u008b·Û/a\u0086÷úH|D\u007f|õÀÑ)Ä\u001dA(ÓÁJ\u0093ÚY\u0015\u001b&_Ú\u000f(qf¦C¹NÙ~\u0097wY\u001bïtzdWØã[\u001f\u0095±9\u0002÷\u0096ÑõÜ\u0094èP<ØkÍ\u009aÿ\u0087 6õg\u0080o¤Êjk\r\u0099|\u001fä5(\u0094\u001fý\u001f\u000f^&ý8úq=B\u008as\u0095"
         .length();
      char var10 = 128;
      int var14 = -1;

      label27:
      while (true) {
         String var15 = var8.substring(++var14, var14 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var12 = var4.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = buildString_2(var12).intern();
            switch (var10001) {
               case 0:
                  var6[var7++] = var21;
                  if ((var14 += var10) >= var9) {
                     CONST_P = var6;
                     CONST_Q = new String[7];
                     CONST_A = ImageUtil15.getDataBuilder17(var2, Object.class);
                     return;
                  }

                  var10 = var8.charAt(var14);
                  break;
               default:
                  var6[var7++] = var21;
                  if ((var14 += var10) < var9) {
                     var10 = var8.charAt(var14);
                     continue label27;
                  }

                  var8 = "²acËþW\u008b7M\u009e\u0092\u000e9\u000b\u0010Á Ä\u0007£\u0097É\nzm\u00859.\u00adäN£w è;\u0012\u008e\u0012«\u0010´¢Yû½©G\u0086\u0005\u008dV0\u0098dû½";
                  var9 = "²acËþW\u008b7M\u009e\u0092\u000e9\u000b\u0010Á Ä\u0007£\u0097É\nzm\u00859.\u00adäN£w è;\u0012\u008e\u0012«\u0010´¢Yû½©G\u0086\u0005\u008dV0\u0098dû½"
                     .length();
                  var10 = '(';
                  var14 = -1;
            }

            var15 = var8.substring(++var14, var14 + var10);
            var10001 = 0;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_n = var0;
   }

   public static LicenseState[] values() {
      return arr_n;
   }

   private static Exception getException(Exception var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16833;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/aZ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
   }
}
