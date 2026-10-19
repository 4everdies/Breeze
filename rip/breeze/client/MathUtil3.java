package rip.breeze.client;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public final class MathUtil3 {
   private Util69 clientUtil24_a;
   private EnumType14 enum_DEFAULT2_b;
   private IMarker iMarker_c;
   private final Map<Type, a1<?>> map_d;
   private final List<IMarker2> list_e;
   private final List<IMarker2> list_f;
   private boolean fieldBool_g;
   private String string_h;
   private int fieldInt_i;
   private int fieldInt_j;
   private boolean fieldBool_k;
   private boolean fieldBool_l;
   private boolean fieldBool_m;
   private boolean fieldBool_n;
   private boolean fieldBool_o;
   private boolean fieldBool_p;
   private static final long[] CONST_R;
   private static final Integer[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public MathUtil3() {
      long var1 = 13895394061368L;
      super();
      this.clientUtil24_a = Util69.CONST_A;
      this.enum_DEFAULT2_b = EnumType14.DEFAULT;
      this.iMarker_c = EnumType6.IDENTITY;
      this.map_d = new HashMap<>();
      this.list_e = new ArrayList<>();
      this.list_f = new ArrayList<>();
      Util64.getStringArray();
      this.fieldBool_g = false;
      this.fieldInt_i = decrypt(1962, 8706528096909405233L ^ var1);
      this.fieldInt_j = decrypt(29980, 5188231828797644422L ^ var1);
      this.fieldBool_k = false;
      this.fieldBool_l = false;
      this.fieldBool_m = true;
      this.fieldBool_n = false;
      this.fieldBool_o = false;
      this.fieldBool_p = false;
      if (!LicenseState.isValid_2()) {
         Util64.initialize(new String[4]);
      }
   }

   public MathUtil3 isActive() {
      this.fieldBool_n = true;
      return this;
   }

   public MathUtil3 isActive_2() {
      this.fieldBool_m = false;
      return this;
   }

   public MathUtil11 getDataBuilder5(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ 84546175309811L;
      long var6 = var4 ^ 76300454123270L;
      long var8 = (var4 ^ 103222031269174L) >>> 16;
      int var10 = (int)((var4 ^ 103222031269174L) << 48 >>> 48);
      String[] var10000 = Util64.getStringArray();
      ArrayList var11 = new ArrayList(this.list_e.size() + this.list_f.size() + 3);
      var11.addAll(this.list_e);
      String[] var12 = var10000;
      Collections.reverse(var11);
      Collections.reverse(this.list_f);
      var11.addAll(this.list_f);
      this.processNullable(this.string_h, var6, this.fieldInt_i, this.fieldInt_j, var11);
      MathUtil11 var13 = new MathUtil11(
         this.clientUtil24_a,
         this.iMarker_c,
         this.map_d,
         this.fieldBool_g,
         this.fieldBool_k,
         this.fieldBool_o,
         this.fieldBool_m,
         this.fieldBool_n,
         this.fieldBool_p,
         this.fieldBool_l,
         var8,
         this.enum_DEFAULT2_b,
         var11,
         (short)var10
      );
      if (var12 != null) {
         boolean var10001 = LicenseState.isValid_2();
         if (var1 >= 0) {
            ;
         }

         LicenseState.toggle(var10001);
      }

      return var13;
   }

   private void processNullable(String var1, long var2, int var4, int var5, List var6) {
      DateUtil var13;
      DateUtil var14;
      DateUtil var15;
      label44: {
         long var10;
         String[] var12;
         int var10000;
         label39: {
            var2 = 84546175309811L ^ var2;
            long var10001 = var2 ^ 21469540177868L;
            int var7 = (int)((var2 ^ 21469540177868L) >>> 32);
            int var8 = (int)((var2 ^ 21469540177868L) << 32 >>> 48);
            int var9 = (int)(var10001 << 48 >>> 48);
            var10 = var2 ^ 136018174019259L;
            var12 = Util64.getStringArray();
            if (var1 != null) {
               var10000 = "".equals(var1.trim());
               if (var2 < 0L) {
                  break label39;
               }

               if (var10000 == 0) {
                  var13 = new DateUtil(var7, Date.class, (char)var8, var1, (char)var9);
                  var14 = new DateUtil(var7, Timestamp.class, (char)var8, var1, (char)var9);
                  var15 = new DateUtil(var7, java.sql.Date.class, (char)var8, var1, (char)var9);
                  if (var2 < 0L) {
                     return;
                  }

                  if (var12 == null) {
                     break label44;
                  }
               }
            }

            var10000 = var4;
         }

         byte var17 = 2;
         if (var2 >= 0L) {
            if (var10000 == 2) {
               return;
            }

            var10000 = var5;
            var17 = 2;
         }

         if (var10000 == var17) {
            return;
         }

         var13 = new DateUtil(Date.class, var4, var10, var5);
         var14 = new DateUtil(Timestamp.class, var4, var10, var5);
         var15 = new DateUtil(java.sql.Date.class, var4, var10, var5);
         if (var2 <= 0L) {
            return;
         }

         if (var12 != null) {
            return;
         }
      }

      var6.add(HttpUtil4.getIMarker2(Date.class, var13));
      var6.add(HttpUtil4.getIMarker2(Timestamp.class, var14));
      var6.add(HttpUtil4.getIMarker2(java.sql.Date.class, var15));
   }

   static {
      long var0 = 139145621779390L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "-D®bCúw@·SiijÂïh";
      int var7 = "-D®bCúw@·SiijÂïh".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_R = var4;
      CONST_S = new Integer[2];
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18339;
      if (CONST_S[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_R[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_T.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/a0", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_S[var3] = var15;
      }

      return CONST_S[var3];
   }
}
