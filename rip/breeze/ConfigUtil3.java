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
import rip.breeze.client.EnumType3;

class ConfigUtil3 extends Util28 {
   private final RenderUtil15[] arr_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   final RenderUtil13_x dataBuilder129_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public ConfigUtil3(RenderUtil13_x var1) {
      long var2 = 68263437444351L;
      this.dataBuilder129_l = var1;
      super();
      this.arr_j = new RenderUtil15[5];
      this.dataBuilder15_k = new rip.breeze.client.AnimationTimer(100.0F, false, EnumType3.SINE_OUT);
      short var10005 = 3804;
      long var10006 = 5862341119083435632L ^ var2;
      short var8 = 16814;
      long var10007 = 2859017465742366984L ^ var2;
      this.arr_j[0] = new RenderUtil15(var1, "home", "Home", true);
      var10005 = 5937;
      var10006 = 8021262130247126940L ^ var2;
      short var10 = 21438;
      var10007 = 3671267404476418836L ^ var2;
      this.arr_j[1] = new RenderUtil15(var1, "profile", "Profile", true);
      var10005 = 23264;
      var10006 = 7203025234271699525L ^ var2;
      short var12 = 11708;
      var10007 = 3412683782583383316L ^ var2;
      this.arr_j[2] = new RenderUtil15(var1, "add-config", "Create Config", false);
      var10005 = 15678;
      var10006 = 1308264244733863326L ^ var2;
      short var14 = 8818;
      var10007 = 7616831240912534224L ^ var2;
      this.arr_j[3] = new RenderUtil15(var1, "add-theme", "Create Theme", false);
      var10005 = 31262;
      var10006 = 5226824050411938481L ^ var2;
      short var16 = 26242;
      var10007 = 5804397931403886121L ^ var2;
      this.arr_j[4] = new RenderUtil15(var1, "add-script", "Submit Script", false);
      this.a(this.arr_j);
   }

   void processAll() {
      long var1 = 104942293657675L;
      long var3 = var1 ^ 91462440608124L;
      boolean var5 = !this.dataBuilder15_k.isBool_e();
      this.dataBuilder15_k.toggle(var3, var5);
      if (var5) {
         BreezeContext.guiPanelSettings_f.update(this);
      }
   }

   void calculate() {
      long var1 = 113639685710611L;
      long var3 = var1 ^ 54682121576759L;
      if (this.dataBuilder15_k.calculateDouble(var3) == 0.0 && this.f) {
         this.processAll();
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         this.processAll();
         return false;
      } else if (!this.a(var1, var2)) {
         this.processAll();
         return true;
      } else if (super.checkCondition(var1, var2, var3, var4)) {
         this.processAll();
         return true;
      } else {
         return true;
      }
   }

   public void processAll() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      super.processNullable_3();
      this.dataBuilder15_k.toggle(var3, false);
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      long var2 = 94253235202450L;
      long var4 = var2 ^ 3678302743478L;
      return this.dataBuilder15_k.calculateDouble(var4) > 0.0;
   }

   public void processAll_1(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      if (this.dataBuilder15_k.calculateDouble(var6) == 0.0 && !this.dataBuilder15_k.isBool_e()) {
         this.processAll();
      } else {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner0);
      }
   }

   public void calculate() {
      long var1 = 62740630596709L;
      float var3 = 35.0F;
      float var4 = 5.0F;
      float var5 = this.arr_j.length * 35.0F + (this.arr_j.length + 1) * 5.0F;
      int[] var10000 = MathUtil8.decrypt();
      this.d = var5;
      int[] var6 = var10000;
      int var7 = 0;

      while (var7 < this.arr_j.length) {
         this.arr_j[var7].a(this.a + 5.0F, this.b + 5.0F + var7 * 40.0F, 190.0F, 35.0F);
         var7++;
         if (var6 != null) {
            break;
         }
      }
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      long var4 = 85946984943889L;
      long var6 = var4 ^ 137391834141934L;
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_k.getDouble(var6) / 2.0F + 0.5F, this.c(), this.d());
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            BreezeContext.authSession_c.getColor("drawer.background")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            BreezeContext.authSession_c.getFloat("drawer.border-thickness"),
            BreezeContext.authSession_c.getColor("drawer.border")
         );
      super.processNullable(var1, var2, var3);
   }

   static {
      long var0 = 114179554354220L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "É\u0086(ÂG\u0003¢=)V\u009a´Q\\,\f\u0018å\r\u0099×ãÜÈÉ|Â»\u0089\u0016\u009dä-+Ñ;,|fh¦(\u0000¤Äí<§7¢qÓJ\u0082tF\u0084\u0007)Å¨\roF\u009a°h½ \u0093x\u0087Å\u008c#·o\u0091RÑFÉ\u0018VÂ·x³\f(ë±èyå\u008f(æÇÚ(\u000fÿ\u0017½Úó ZùXÊØ/\u0097Y\u0082\bkê$¿þ\u0000íþD\u001f\u0017\u0091\u0000B;\u0017Ä$kÄþ¦(ì\\nK\u0002=\u0091íTSÝç\u008b\u001eT\u0098|\u008915\u008c\u0093YÞ\u0081\u0018qÔ¹ÉláP\u009c1¹\u008e\\Uô P\u00180÷\u009e\u0091Yë@Ð*â¸d:Å>\u0004í\u0089[Øþ>|\u0015\u0086ÎÐ\u008a\u0005Ä(\fivþeQ[üôH\u0098-3Û  æHDçw9\u001b6¤i·\\\u0005fÐ¤ü@Ç\u0080AL\\+(IqG\\\u009f{\u0084/\u009b`£ÏÛÓD£o¯ï\u009d³î\u0097zg¯\u0002=P´\u008fÅë\u00ad}\u0002\u0089ÓÙ(\u0018[C\u0006YzÖµ×yAÜQ\u0017³J\nGäVÖÄÿùÄ\u0010\u001fÿX³«®û\u0089v±dìo\u0094Q5\u0010\u009b;_\u0005Þ\u0087l\f\u0007Â\f\u0082S\f2\"\u0010V{èo\u0017{¯µ\u0084VwÒÈ\u0015wæ";
      int var7 = "É\u0086(ÂG\u0003¢=)V\u009a´Q\\,\f\u0018å\r\u0099×ãÜÈÉ|Â»\u0089\u0016\u009dä-+Ñ;,|fh¦(\u0000¤Äí<§7¢qÓJ\u0082tF\u0084\u0007)Å¨\roF\u009a°h½ \u0093x\u0087Å\u008c#·o\u0091RÑFÉ\u0018VÂ·x³\f(ë±èyå\u008f(æÇÚ(\u000fÿ\u0017½Úó ZùXÊØ/\u0097Y\u0082\bkê$¿þ\u0000íþD\u001f\u0017\u0091\u0000B;\u0017Ä$kÄþ¦(ì\\nK\u0002=\u0091íTSÝç\u008b\u001eT\u0098|\u008915\u008c\u0093YÞ\u0081\u0018qÔ¹ÉláP\u009c1¹\u008e\\Uô P\u00180÷\u009e\u0091Yë@Ð*â¸d:Å>\u0004í\u0089[Øþ>|\u0015\u0086ÎÐ\u008a\u0005Ä(\fivþeQ[üôH\u0098-3Û  æHDçw9\u001b6¤i·\\\u0005fÐ¤ü@Ç\u0080AL\\+(IqG\\\u009f{\u0084/\u009b`£ÏÛÓD£o¯ï\u009d³î\u0097zg¯\u0002=P´\u008fÅë\u00ad}\u0002\u0089ÓÙ(\u0018[C\u0006YzÖµ×yAÜQ\u0017³J\nGäVÖÄÿùÄ\u0010\u001fÿX³«®û\u0089v±dìo\u0094Q5\u0010\u009b;_\u0005Þ\u0087l\f\u0007Â\f\u0082S\f2\"\u0010V{èo\u0017{¯µ\u0084VwÒÈ\u0015wæ"
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
                     CONST_N = var4;
                     CONST_O = new String[15];
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

                  var6 = "\u000b\u001bè\u0015¶\u0088²\u00156aÝ'ÄÁQò#Ñ\\×?ñ´\\ \u0099ÜEÁç\n]×düëHë°÷I\u009bTF\r\u0003e¹`öa²C@\u0085\u009f\u0083";
                  var7 = "\u000b\u001bè\u0015¶\u0088²\u00156aÝ'ÄÁQò#Ñ\\×?ñ´\\ \u0099ÜEÁç\n]×düëHë°÷I\u009bTF\r\u0003e¹`öa²C@\u0085\u009f\u0083".length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31833;
      if (CONST_O[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c9", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
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
         throw new RuntimeException("rip/breeze/c9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
