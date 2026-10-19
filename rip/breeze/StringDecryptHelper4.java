package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class StringDecryptHelper4 {
   private String string_a;
   private String string_b;
   private String string_c;
   private String string_d;
   private long fieldLong_e;
   private String string_f;
   private String string_g;
   private long fieldLong_h;
   private String string_i;
   private long fieldLong_j;
   private String string_k;
   private long fieldLong_l;
   private long fieldLong_m = System.currentTimeMillis();
   private long fieldLong_n = this.fieldLong_m;
   private boolean fieldBool_o;
   private static boolean fieldBool_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public String getString_a() {
      return this.string_a;
   }

   public String getString_b() {
      return this.string_b;
   }

   public String getString_c() {
      return this.string_c;
   }

   public String getString_d() {
      return this.string_d;
   }

   public long getLong_e() {
      return this.fieldLong_e;
   }

   public String getString_f() {
      return this.string_f;
   }

   public String getString_g() {
      return this.string_g;
   }

   public long getLong_h() {
      return this.fieldLong_h;
   }

   public String getString_i() {
      return this.string_i;
   }

   public long getLong_j() {
      return this.fieldLong_j;
   }

   public String getString_k() {
      return this.string_k;
   }

   public long getLong_l() {
      return this.fieldLong_l;
   }

   public long getLong_m() {
      return this.fieldLong_m;
   }

   public long getLong_n() {
      return this.fieldLong_n;
   }

   public boolean isBool_o() {
      return this.fieldBool_o;
   }

   public void setString_a(String var1) {
      this.string_a = var1;
   }

   public void setString_b(String var1) {
      this.string_b = var1;
   }

   public void setString_c(String var1) {
      this.string_c = var1;
   }

   public void setString_d(String var1) {
      this.string_d = var1;
   }

   public void setLong_e(long var1) {
      this.fieldLong_e = var1;
   }

   public void setString_f(String var1) {
      this.string_f = var1;
   }

   public void setString_g(String var1) {
      this.string_g = var1;
   }

   public void setLong_h(long var1) {
      this.fieldLong_h = var1;
   }

   public void setString_i(String var1) {
      this.string_i = var1;
   }

   public void setLong_j(long var1) {
      this.fieldLong_j = var1;
   }

   public void setString_k(String var1) {
      this.string_k = var1;
   }

   public void setLong_l(long var1) {
      this.fieldLong_l = var1;
   }

   public void setLong_n(long var1) {
      this.fieldLong_n = var1;
   }

   public void setBool_o(boolean var1) {
      this.fieldBool_o = var1;
   }

   public UserTheme getUserTheme() {
      long var1 = 112767889650028L;
      long var3 = var1 ^ 37624871294676L;
      long var5 = var1 ^ 59485816367107L;
      long var7 = var1 ^ 29463125037005L;
      UserTheme var9 = new UserTheme();
      LicenseState[] var10000 = RenderUtil18_x.values();
      var9.update("uuid", this.string_a, var5);
      var9.update("username", this.string_b, var5);
      var9.update("ms_access_token", this.string_c, var5);
      var9.update("ms_refresh_token", this.string_d, var5);
      var9.runCloudJob(var3, "ms_expires_at", this.fieldLong_e);
      var9.update("xbl_token", this.string_f, var5);
      var9.update("xbl_uhs", this.string_g, var5);
      var9.runCloudJob(var3, "xbl_expires_at", this.fieldLong_h);
      var9.update("xsts_token", this.string_i, var5);
      var9.runCloudJob(var3, "xsts_expires_at", this.fieldLong_j);
      var9.update("mc_access_token", this.string_k, var5);
      var9.runCloudJob(var3, "mc_expires_at", this.fieldLong_l);
      LicenseState[] var10 = var10000;
      var9.runCloudJob(var3, "created_at", this.fieldLong_m);
      var9.runCloudJob(var3, "last_validated_at", this.fieldLong_n);
      var9.update_1("valid", this.fieldBool_o, var7);
      if (var10 != null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }

      return var9;
   }

   public static StringDecryptHelper4 isActive(UserTheme var0) {
      long var1 = 87314490978435L;
      StringDecryptHelper4 var3 = new StringDecryptHelper4();
      var3.string_a = getString(var0, "uuid");
      var3.string_b = getString(var0, "username");
      RenderUtil18_x.values();
      var3.string_c = getString(var0, "ms_access_token");
      var3.string_d = getString(var0, "ms_refresh_token");
      var3.fieldLong_e = getLong(var0, "ms_expires_at");
      var3.string_f = getString(var0, "xbl_token");
      var3.string_g = getString(var0, "xbl_uhs");
      var3.fieldLong_h = getLong(var0, "xbl_expires_at");
      var3.string_i = getString(var0, "xsts_token");
      var3.fieldLong_j = getLong(var0, "xsts_expires_at");
      var3.string_k = getString(var0, "mc_access_token");
      var3.fieldLong_l = getLong(var0, "mc_expires_at");
      var3.fieldLong_m = getLong_2(var0, "created_at", System.currentTimeMillis());
      var3.fieldLong_n = getLong_2(var0, "last_validated_at", var3.fieldLong_m);
      var3.fieldBool_o = checkCondition(var0, "valid");
      if (!LicenseState.isValid_2()) {
         RenderUtil18_x.initialize(new LicenseState[1]);
      }

      return var3;
   }

   private static String getString(UserTheme var0, String var1) {
      long var2 = 28177170570868L;
      long var10001 = var2 ^ 11057299005747L;
      int var4 = (int)((var2 ^ 11057299005747L) >>> 48);
      int var5 = (int)((var2 ^ 11057299005747L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return var0.isValid(var1) && !var0.getDataBuilder2_2(var1).isValid_4() ? var0.getDataBuilder2_2(var1).buildString((char)var4, var5, (short)var6) : null;
   }

   private static long getLong(UserTheme var0, String var1) {
      long var2 = 25258724916893L;
      long var4 = var2 ^ 139187091667809L;
      return var0.isValid(var1) && !var0.getDataBuilder2_2(var1).isValid_4() ? var0.getDataBuilder2_2(var1).getLong(var4) : 0L;
   }

   private static long getLong_2(UserTheme var0, String var1, long var2) {
      long var4 = 107428992581309L;
      long var6 = var4 ^ 10835238091585L;
      return var0.isValid(var1) && !var0.getDataBuilder2_2(var1).isValid_4() ? var0.getDataBuilder2_2(var1).getLong(var6) : var2;
   }

   private static boolean checkCondition(UserTheme var0, String var1) {
      long var2 = 119595510919255L;
      long var4 = var2 ^ 75971937568524L;
      return var0.isValid(var1) && !var0.getDataBuilder2_2(var1).isValid_4() && var0.getDataBuilder2_2(var1).isValid_5(var4);
   }

   public static void toggle(boolean var0) {
      fieldBool_p = var0;
   }

   public static boolean isValid() {
      return fieldBool_p;
   }

   public static boolean checkCondition_2() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      long var0 = 25980191544116L;
      toggle(true);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[30];
      int var5 = 0;
      String var6 = "iYiú\r©Ø÷zx\u0083\u0089\u0089vM¡ >r·J\tÒKD\u0010\u0015Eä×\u0087§k\u0006j\b(úÌTß)%\u00adëfÈ§`\u0018Áîõ½\u008d\u0090ö\u0015\u0084Ï\u009cK\u008br\t\\øÏe\u009a\u0006\u0084- \u0018ä\u0007è>F\u0001W{\u0097\u008a\u0091yÑUÅ\u0083;íã1Päêà\u0018ß=×\u009fîX\u008cú\u000f\u008eþÒx\u0085¨\u0088tîÆªN8u\u0093 \u001f,\u0004u\t>@\u0004F.e¤x\u0012 \"\nxi\u008aìÊ\u0000íæ \\à\u0001Ñú\u0001 wO½Gíkp¹;ä¦§\n\u00ad\u0019\u008bE\u0014®+.o\u0019®±½(&öëÐw(RÛ±#44\u0080\u0017Qaº=¯\"\u008fB\u001cgÎCàL\u000e¿¸F2pÅ\u0081K\u0001\r\u0018%x\u0000IÞÐ\u0010Là[\nUp\u0000¨Ö\u0082»iË\u0018\u0091¡(W|þ°\u0012L\u00071\u008dÞx!ÊÛÿ¡\u0014\u0080£\u0082\u0096ç1ÓÚñ\u0014K\u008a#GÂ±JMøÔ\u009f½ï Í\u0013Ã}åQ¯ü¼£\u0080ù\u0095n¹\u0001\\\u0017.\u008b\u0095\u001d\u0095\u0081õ\t>$V\u009bá? ¾U$zyª]Þ\bä]ü÷\u0091/Ì®Íì\u0014çîí3Ðé ö\u0001\u001bWí øØÊ\u0014\u009b§xÕ °ýæ¹oÆÜ\u0085\u0090\rMÃ7ù\u0084óre©¸/!o\u0010G\u001eÓÙ\u0099nê2-Ü+¢\u0089B¾Y\u0010ç\"hý7\u0086\u0091ËO\u0017\u0084U-@Ú\u0096 \u0084þU\t \u0090$O®TØk6)ñÐ\u008eö\u0007T\u0014ÝC3ôm_uÒ@øB\u0010c\u0089/-'\u0093e\\\u0004ânq¢]LÑ §H\u0099NJWàiFvÈ½p\u008dÚãáF\u009bðJèuFê\u0083G8\u0089Ó\u001c½\u0018\u0018s¼qh¬¤¬ïÕýòÕÖ@Øq+\u0085~wâñ\u0002 5ysÈ\u001bpmO'Ù¯2\u008f¢\u008bÖp¾\u008aR<\u0016\u009cÂs8l\u0003µÇàÄ(.kÐû¢mr¦öý½+-ªuc2Ò1QÌ±±\u0012\u0016\u008a1+y¿:í¿Ë8\u0001$ì\u0093\u0010\u0010WÞb&b\bC£Ö¹«;v\u0002\u0004\u0000 \u0013E;|¿w\u0083RRIWY\u009d¼Q:\u0014\u001cJßÎ}\u0003ì\u00936\u008a\u008a\u0087Ø\u008f\u0093\u0018ÕÇ\u0013\u0081[ý\u0081\u008bGx\u008f3vû\u0093\u009dw<pú¼â\u008dÔ\u0018~½/\u0010£Â+\u0088¤(¦s«+\u0004_bküÔBaØæ\u0018´v<ñ\"ï2`\u0093\u000f9L¸\"\u0005\u009a+3@ëõõ°A\u0018\u0084ÚÆ|Îë\u0001aLÉjbýK\u009dæ\u008a¡ô\u008a¨=0î\u0018¤ÑL6V²/»\u0005þ@Ý@OT\u0080\u000e®\u000f.\u0006F(\u0012";
      int var7 = "iYiú\r©Ø÷zx\u0083\u0089\u0089vM¡ >r·J\tÒKD\u0010\u0015Eä×\u0087§k\u0006j\b(úÌTß)%\u00adëfÈ§`\u0018Áîõ½\u008d\u0090ö\u0015\u0084Ï\u009cK\u008br\t\\øÏe\u009a\u0006\u0084- \u0018ä\u0007è>F\u0001W{\u0097\u008a\u0091yÑUÅ\u0083;íã1Päêà\u0018ß=×\u009fîX\u008cú\u000f\u008eþÒx\u0085¨\u0088tîÆªN8u\u0093 \u001f,\u0004u\t>@\u0004F.e¤x\u0012 \"\nxi\u008aìÊ\u0000íæ \\à\u0001Ñú\u0001 wO½Gíkp¹;ä¦§\n\u00ad\u0019\u008bE\u0014®+.o\u0019®±½(&öëÐw(RÛ±#44\u0080\u0017Qaº=¯\"\u008fB\u001cgÎCàL\u000e¿¸F2pÅ\u0081K\u0001\r\u0018%x\u0000IÞÐ\u0010Là[\nUp\u0000¨Ö\u0082»iË\u0018\u0091¡(W|þ°\u0012L\u00071\u008dÞx!ÊÛÿ¡\u0014\u0080£\u0082\u0096ç1ÓÚñ\u0014K\u008a#GÂ±JMøÔ\u009f½ï Í\u0013Ã}åQ¯ü¼£\u0080ù\u0095n¹\u0001\\\u0017.\u008b\u0095\u001d\u0095\u0081õ\t>$V\u009bá? ¾U$zyª]Þ\bä]ü÷\u0091/Ì®Íì\u0014çîí3Ðé ö\u0001\u001bWí øØÊ\u0014\u009b§xÕ °ýæ¹oÆÜ\u0085\u0090\rMÃ7ù\u0084óre©¸/!o\u0010G\u001eÓÙ\u0099nê2-Ü+¢\u0089B¾Y\u0010ç\"hý7\u0086\u0091ËO\u0017\u0084U-@Ú\u0096 \u0084þU\t \u0090$O®TØk6)ñÐ\u008eö\u0007T\u0014ÝC3ôm_uÒ@øB\u0010c\u0089/-'\u0093e\\\u0004ânq¢]LÑ §H\u0099NJWàiFvÈ½p\u008dÚãáF\u009bðJèuFê\u0083G8\u0089Ó\u001c½\u0018\u0018s¼qh¬¤¬ïÕýòÕÖ@Øq+\u0085~wâñ\u0002 5ysÈ\u001bpmO'Ù¯2\u008f¢\u008bÖp¾\u008aR<\u0016\u009cÂs8l\u0003µÇàÄ(.kÐû¢mr¦öý½+-ªuc2Ò1QÌ±±\u0012\u0016\u008a1+y¿:í¿Ë8\u0001$ì\u0093\u0010\u0010WÞb&b\bC£Ö¹«;v\u0002\u0004\u0000 \u0013E;|¿w\u0083RRIWY\u009d¼Q:\u0014\u001cJßÎ}\u0003ì\u00936\u008a\u008a\u0087Ø\u008f\u0093\u0018ÕÇ\u0013\u0081[ý\u0081\u008bGx\u008f3vû\u0093\u009dw<pú¼â\u008dÔ\u0018~½/\u0010£Â+\u0088¤(¦s«+\u0004_bküÔBaØæ\u0018´v<ñ\"ï2`\u0093\u000f9L¸\"\u0005\u009a+3@ëõõ°A\u0018\u0084ÚÆ|Îë\u0001aLÉjbýK\u009dæ\u008a¡ô\u008a¨=0î\u0018¤ÑL6V²/»\u0005þ@Ý@OT\u0080\u000e®\u000f.\u0006F(\u0012"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_R = var4;
                     CONST_S = new String[30];
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

                  var6 = "<Õ\u0081\u001eÐ{¥\u0015ò1\t@\u001d)¤Ü\u0092\u001568\u0095cî:´½\u0098Ò\u009bGÉÏÀ\u008aåIDO\u0087\u0093 JA\u0006~ý\u000f(´snb\u0096Õy\u00121JÜís\u0018 c`««@æ*¦é;";
                  var7 = "<Õ\u0081\u001eÐ{¥\u0015ò1\t@\u001d)¤Ü\u0092\u001568\u0095cî:´½\u0098Ò\u009bGÉÏÀ\u008aåIDO\u0087\u0093 JA\u0006~ý\u000f(´snb\u0096Õy\u00121JÜís\u0018 c`««@æ*¦é;"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31247;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eS", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
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
         throw new RuntimeException("rip/breeze/eS" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
