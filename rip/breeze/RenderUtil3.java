package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil3 extends RenderUtil50 {
   private final StringDecryptHelper6 stringDecryptHelper6_p;
   private final RenderUtil13_x dataBuilder129_q;
   private final ImageUtil2 breezeUtil110_r;
   private final ImageUtil2 breezeUtil110_s;
   private final ImageUtil2 breezeUtil110_t;
   private final ConfigUtil2 dataBuilder103_u;
   private ConfigUtil2_x breezeUtil98_v;
   private final List<ConfigUtil2_x> cloudSetting;
   private final List<ConfigUtil2_x> list_x;
   private static String string_y;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public RenderUtil3() {
      long var1 = 47334480513810L;
      short var10001 = 3343;
      long var10002 = 197959277752682449L ^ var1;
      super("Cloud");
      this.cloudSetting = new ArrayList<>();
      this.list_x = new ArrayList<>();
      this.dataBuilder129_q = new RenderUtil13_x();
      String var10000 = getString_2();
      short var10004 = 7060;
      long var10005 = 2271932938183053644L ^ var1;
      this.stringDecryptHelper6_p = new StringDecryptHelper6("Search...", new LicenseState(), null);
      this.stringDecryptHelper6_p.processAll(new Util134(50.0F, 15.0F));
      this.stringDecryptHelper6_p.clamp_9(30);
      this.stringDecryptHelper6_p.update_3(true);
      LicenseState var4 = new LicenseState();
      byte var6 = 33;
      long var10006 = 2361690290648681211L ^ var1;
      this.breezeUtil110_r = new ImageUtil2(var4, "refresh", this::initialize_2);
      LicenseState var5 = new LicenseState();
      short var7 = 8113;
      var10006 = 4381953761737938277L ^ var1;
      this.breezeUtil110_s = new ImageUtil2(var5, "arrow_forward", this::calculate_3);
      String var3 = var10000;
      this.breezeUtil110_t = new ImageUtil2(new LicenseState(), "arrow_forward", this::calculate_4);
      this.dataBuilder103_u = new ConfigUtil2(this.stringDecryptHelper6_p);
      this.a(new UIPanel[]{this.stringDecryptHelper6_p, this.dataBuilder129_q, this.breezeUtil110_r, this.breezeUtil110_s, this.breezeUtil110_t});
      this.update(this.dataBuilder103_u);
      this.initialize();
      if (var3 != null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   @Override
   public boolean isValid() {
      return true;
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.a(var1, var2, var3);
      this.breezeUtil110_s.a(!this.isValid_3());
      this.breezeUtil110_t.a(!this.checkCondition());
      this.breezeUtil110_r.a(!this.breezeUtil98_v.isValid());
      this.calculate_2();
   }

   public void calculate() {
      long var1 = 62740630596709L;
      super.g();
      this.stringDecryptHelper6_p.a(this.m.fieldFloat_a + this.m.fieldFloat_c / 2.0F - 150.0F, this.m.fieldFloat_b + 15.0F, 300.0F, this.m.fieldFloat_d - 30.0F);
      getString_2();
      this.dataBuilder129_q.a(this.m.fieldFloat_a + this.m.fieldFloat_c - this.m.fieldFloat_d + 30.0F, this.m.fieldFloat_b + 15.0F, this.m.fieldFloat_d - 45.0F, this.m.fieldFloat_d - 30.0F);
      this.breezeUtil110_s.a(this.m.fieldFloat_a + 20.0F, this.m.fieldFloat_b + 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_t.a(this.breezeUtil110_s.a() + 5.0F, this.breezeUtil110_s.b, this.breezeUtil110_s.c, this.breezeUtil110_s.d);
      this.breezeUtil110_r.a(this.breezeUtil110_t.a() + 5.0F, this.breezeUtil110_t.b, this.breezeUtil110_t.c, this.breezeUtil110_t.d);
      this.dataBuilder103_u.a(this);
      if (this.breezeUtil98_v != this.dataBuilder103_u) {
         this.breezeUtil98_v.a(this);
      }

      if (LicenseState.checkCondition()) {
         initialize_3("rsdaWb");
      }
   }

   private void calculate_2() {
      long var1 = 132777294012715L;
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this.stringDecryptHelper6_p,
            BreezeContext.authSession_c.getFloat("textbox.corner-radius"),
            BreezeContext.authSession_c.getFloat("textbox.border-thickness"),
            BreezeContext.authSession_c.getColor("textbox.border")
         );
      BreezeContext.iRenderer_b
         .drawTextAt(
            "search",
            this.stringDecryptHelper6_p.a + 10.0F,
            this.stringDecryptHelper6_p.b + 10.0F,
            1.3F,
            BreezeContext.authSession_c.getColor("icon.color")
         );
   }

   @Override
   public boolean isValid_2(UIPanel var1) {
      return true;
   }

   public void initialize() {
      this.cloudSetting.clear();
      this.list_x.clear();
   }

   public void update(ConfigUtil2_x var1) {
      this.processNullable(var1, true);
   }

   public void processNullable(ConfigUtil2_x var1, boolean var2) {
      long var3 = 44511481417701L;
      if (this.breezeUtil98_v != var1) {
         if (this.breezeUtil98_v != null) {
            if (var2) {
               this.cloudSetting.add(this.breezeUtil98_v);
            }

            this.list_x.clear();
            this.c(this.breezeUtil98_v);
            this.breezeUtil98_v.h();
         }

         this.breezeUtil98_v = var1;
         this.breezeUtil98_v.a(this);
         this.b(this.breezeUtil98_v);
         this.breezeUtil98_v.noOp();
      }
   }

   public void processNullable_2() {
      long var1 = 110155718802899L;
      this.initialize();
      if (this.breezeUtil98_v != this.dataBuilder103_u) {
         if (this.breezeUtil98_v != null) {
            this.c(this.breezeUtil98_v);
            this.breezeUtil98_v.h();
         }

         this.breezeUtil98_v = this.dataBuilder103_u;
         this.breezeUtil98_v.a(this);
         this.b(this.breezeUtil98_v);
         this.breezeUtil98_v.noOp();
      }

      this.initialize();
   }

   public void calculate_3() {
      long var1 = 87686484559873L;
      if (this.cloudSetting.isEmpty()) {
         this.processNullable_2();
      } else {
         ConfigUtil2_x var3 = this.breezeUtil98_v;
         ConfigUtil2_x var4 = this.cloudSetting.remove(this.cloudSetting.size() - 1);
         if (var3 != null) {
            var3.h();
            this.c(var3);
            this.list_x.add(var3);
         }

         this.breezeUtil98_v = var4;
         this.breezeUtil98_v.a(this);
         this.b(this.breezeUtil98_v);
      }
   }

   public boolean isValid_3() {
      long var1 = 116647071953593L;
      return this.breezeUtil98_v != this.dataBuilder103_u;
   }

   public void calculate_4() {
      long var1 = 109961804800503L;
      if (this.checkCondition()) {
         ConfigUtil2_x var3 = this.breezeUtil98_v;
         ConfigUtil2_x var4 = this.list_x.remove(this.list_x.size() - 1);
         if (var3 != null) {
            var3.h();
            this.c(var3);
            this.cloudSetting.add(var3);
         }

         this.breezeUtil98_v = var4;
         this.breezeUtil98_v.a(this);
         this.b(this.breezeUtil98_v);
      }
   }

   public boolean checkCondition() {
      long var1 = 7239058791396L;
      return !this.list_x.isEmpty();
   }

   public void initialize_2() {
      this.list_x.clear();
      this.breezeUtil98_v.noOp_2();
   }

   public boolean checkCondition_2(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (super.a(var1, var2, var3, var4)) {
         var4 = true;
      }

      return var4;
   }

   public String getString() {
      long var1 = 11960387023038L;
      return "share";
   }

   public static void initialize_3(String var0) {
      string_y = var0;
   }

   public static String getString_2() {
      return string_y;
   }

   static {
      initialize_3(null);
      long var0 = 2902619360684L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "À\"H\b69[¶ëlÊ2{S¥\u0085yÙgq\u0082J\u001c\u0098O\u007fWÚëÐOX&t¢\u0011ô\u0012\u0010s\u0010\u001c¡´Ö\u001e¹\u001c\nÜDú\u001aÑs\u0014N \u009c\\\u0012÷îè¦Oð»FpÜ+µzè~_!S\u008f+_Î\u0011 -Ö{e¤\u0010ÖÃ°|LsÇ\u001ck¸¡|\r6\u0090\u008e Ã»£]uÚkÃyêX\u001eýdÆì\u0003Â6\u009c\rç\u0097ÌjÐù\u009e)\t\u009fê\u0018«O\u009c`q¶^¤\u0098 \u0093 \u0094\u008eje\u00966«\u00adï\u0082\u0001\u00838ý\u009d\u0089óÏ\u001a\nyek\u0019\u0081V ÔÚl½ËÛÓ+ñÐÒÈN9ÓVå¹ñ\u0086ÛJ]UTÄ°)\u0094\u009eRDX¥ V0>\u008fÄ(©\u00100e\u0005Ú0ûÑË\u0017N·\fÑ\u0000\u000b/\u0010gá\u0007³E®\u0090C\u00ad«èn]ôUv";
      int var7 = "À\"H\b69[¶ëlÊ2{S¥\u0085yÙgq\u0082J\u001c\u0098O\u007fWÚëÐOX&t¢\u0011ô\u0012\u0010s\u0010\u001c¡´Ö\u001e¹\u001c\nÜDú\u001aÑs\u0014N \u009c\\\u0012÷îè¦Oð»FpÜ+µzè~_!S\u008f+_Î\u0011 -Ö{e¤\u0010ÖÃ°|LsÇ\u001ck¸¡|\r6\u0090\u008e Ã»£]uÚkÃyêX\u001eýdÆì\u0003Â6\u009c\rç\u0097ÌjÐù\u009e)\t\u009fê\u0018«O\u009c`q¶^¤\u0098 \u0093 \u0094\u008eje\u00966«\u00adï\u0082\u0001\u00838ý\u009d\u0089óÏ\u001a\nyek\u0019\u0081V ÔÚl½ËÛÓ+ñÐÒÈN9ÓVå¹ñ\u0086ÛJ]UTÄ°)\u0094\u009eRDX¥ V0>\u008fÄ(©\u00100e\u0005Ú0ûÑË\u0017N·\fÑ\u0000\u000b/\u0010gá\u0007³E®\u0090C\u00ad«èn]ôUv"
         .length();
      char var8 = '(';
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
                     CONST_E = var4;
                     CONST_F = new String[11];
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

                  var6 = "q-õª.jâñO¥\\\u0018½Q$½«gª\u0088P_\u001e§\u0018ØµæcA2\u000epÒN:Ô\u001e¿ëop\\£\u008e\u0084ä\u009b\u008d";
                  var7 = "q-õª.jâñO¥\\\u0018½Q$½«gª\u0088P_\u001e§\u0018ØµæcA2\u000epÒN:Ô\u001e¿ëop\\£\u008e\u0084ä\u009b\u008d".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 463;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ds", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/ds" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
