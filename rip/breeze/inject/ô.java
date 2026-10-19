package rip.breeze.inject;

import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ô extends õ {
   public String string_ü;
   public List<String> list_û;
   public List<byte[]> list_ú;
   private static final String CONST_F;

   public ô(String var1, List var2, long var3, List var5) {
      var3 = encKey_b ^ var3;
      super(CONST_F);
      this.string_ü = var1;
      this.list_û = var2;
      this.list_ú = var5;
   }

   public ô(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ encKey_b;
      long var6 = var4 ^ 88037881662489L;
      this(null, null, var6, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   protected õ getÕ(Object[] var1) {
      ï var2 = (ï)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      char[] var5 = (char[])var1[3];
      int var6 = (Integer)var1[4];
      ª[] var7 = (ª[])var1[5];
      long var8 = (Long)var1[6];
      long var10 = var8 ^ 51832911273449L;
      long var12 = var8 ^ 70107827769151L;
      long var14 = var8 ^ 49541045912589L;
      int var16 = var3;
      Object[] var10005 = new Object[]{null, var16, var5};
      var10005[0] = var12;
      String var17 = var2.method_041(var10005);
      var16 += 2;
      int[] var10000 = ք.method_020();
      int var18 = var2.method_037(new Object[]{var16});
      var16 += 2;
      ArrayList var19 = new ArrayList(var18);
      ArrayList var20 = new ArrayList(var18);
      int var21 = 0;
      int[] var22 = var10000;

      while (var21 < var18) {
         var10005 = new Object[]{null, var5, var10};
         var10005[0] = var16;
         String var23 = var2.method_046(var10005);
         var16 += 2;
         var19.add(var23);
         int var24 = var2.method_037(new Object[]{var16});
         var16 += 2;
         byte[] var25 = new byte[var24];
         int var26 = 0;

         label45:
         while (true) {
            if (var26 < var24) {
               var25[var26] = (byte)var2.method_035(new Object[]{var16});
               var16++;
               var26++;
               var10000 = var22;
               if (var8 < 0L) {
                  break;
               }

               if (var22 == null) {
                  var10000 = var22;
                  break;
               }

               if (var22 != null) {
                  continue;
               }
            }

            do {
               var20.add(var25);
               if (var8 > 0L) {
                  var21++;
                  var10000 = var22;
                  break label45;
               }

               var10000 = var22;
               if (var8 < 0L) {
                  break label45;
               }

               if (var22 == null) {
                  var10000 = var22;
                  break label45;
               }
            } while (var22 == null);
         }

         if (var10000 == null) {
            break;
         }
      }

      return new ô(var17, var19, var14, var20);
   }

   protected ð getÐ(Object[] var1) {
      long var2 = (Long)var1[0];
      í var4 = (í)var1[1];
      byte[] var5 = (byte[])var1[2];
      int var6 = (Integer)var1[3];
      int var7 = (Integer)var1[4];
      int var8 = (Integer)var1[5];
      long var9 = var2 ^ 92151399982130L;
      long var11 = var2 ^ 117137887468086L;
      long var13 = var2 ^ 127327687432681L;
      long var15 = var2 ^ 122268903725462L;
      int[] var10000 = ք.method_020();
      ð var17 = new ð();
      int[] var18 = var10000;
      int var10001 = var4.method_007(new Object[]{this.string_ü, var13});
      Object[] var10004 = new Object[]{null, var11};
      var10004[0] = var10001;
      var17.method_004(var10004);
      List var23 = this.list_û;
      if (var18 != null) {
         if (this.list_û == null) {
            var10004 = new Object[]{null, var11};
            var10004[0] = 0;
            var17.method_004(var10004);
            if (var18 != null) {
               return var17;
            }
         }

         var23 = this.list_û;
      }

      int var19 = var23.size();
      var10004 = new Object[]{null, var11};
      var10004[0] = var19;
      var17.method_004(var10004);
      int var20 = 0;

      while (var20 < var19) {
         String var21 = this.list_û.get(var20);
         byte[] var22 = this.list_ú.get(var20);
         if (var2 > 0L) {
            var10001 = var4.method_010(new Object[]{var9, var21});
            var10004 = new Object[]{null, var11};
            var10004[0] = var10001;
            ð var24 = var17.method_004(var10004);
            var10001 = var22.length;
            var10004 = new Object[]{null, var11};
            var10004[0] = var10001;
            ð var25 = var24.method_004(var10004);
            int var10003 = var22.length;
            Object[] var10006 = new Object[]{null, null, null, var15};
            var10006[2] = var10003;
            var10006[1] = 0;
            var10006[0] = var22;
            ð var26 = var25.method_012(var10006);
            if (var18 == null) {
               return var26;
            }

            var20++;
         }

         if (var18 == null) {
            break;
         }
      }

      return var17;
   }

   static {
      long var0 = 97196858156027L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("½ ²\u001d¬©i½©¥R{\\ûÄÄ".getBytes("ISO-8859-1"));
      CONST_F = buildString(var5).intern();
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
