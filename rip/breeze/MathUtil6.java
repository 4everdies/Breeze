package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MathUtil6 extends UIPanel {
   private static final float CONST_H = 10.0F;
   private static final float CONST_I = 40.0F;
   private final MathUtil18 dataBuilder84_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   private final ArrayList<RenderUtil7> arrayList_l;
   private final ArrayList<RenderUtil7> arrayList_m;
   private float fieldFloat_n;
   private float fieldFloat_o;
   private float fieldFloat_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public MathUtil6(MathUtil18 var1, rip.breeze.client.AnimationTimer var2) {
      long var3 = 83638737505129L;
      int var10000 = MathUtil18.getValue_2();
      super();
      int var5 = var10000;
      this.arrayList_l = new ArrayList<>();
      this.arrayList_m = new ArrayList<>();
      this.dataBuilder84_j = var1;
      this.dataBuilder15_k = var2;
      this.c = 250.0F;
      this.d = 300.0F;

      for (WorldUtil6 var9 : WorldUtil6.values()) {
         this.arrayList_m.add(new RenderUtil7(var9));
         if (var5 == 0) {
            break;
         }
      }
   }

   public void clamp(int var1, SkinLoader var2) {
      long var3 = 4464624048957L;
      this.arrayList_l.clear();
      int var10000 = MathUtil18.getValue_2();
      List var5 = var2.arr_b[var1];
      Iterator var6 = this.arrayList_m.iterator();
      int var7 = var10000;

      while (var6.hasNext()) {
         RenderUtil7 var8 = (RenderUtil7)var6.next();
         WorldUtil6 var9 = var8.getEnum16Val_h();
         if (var9.exclusive) {
            boolean var10 = false;
            int var11 = 0;

            while (var11 < var2.arr_b.length) {
               if (var11 != var1 && var2.arr_b[var11].contains(var9)) {
                  var10 = true;
                  if (var7 != 0) {
                     break;
                  }
               }

               var11++;
               if (var7 == 0) {
                  break;
               }
            }

            if (var10 && var7 != 0) {
               continue;
            }
         }

         var8.setInt_j(var9 == WorldUtil6.EMPTY ? 0 : var5.indexOf(var9) + 1);
         this.arrayList_l.add(var8);
         if (var7 == 0) {
            break;
         }
      }

      this.fieldFloat_p = this.arrayList_l.size() * 40.0F + 20.0F;
      if (this.fieldFloat_p <= this.d) {
         this.fieldFloat_o = 0.0F;
         this.fieldFloat_n = 0.0F;
         if (var7 != 0) {
            return;
         }
      }

      this.fieldFloat_n = Math.max(0.0F, Math.min(this.fieldFloat_o, this.fieldFloat_p - this.d));
      this.fieldFloat_o = this.fieldFloat_n;
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      int var8 = MathUtil18.getValue_2();
      if (this.fieldFloat_n != this.fieldFloat_o) {
         this.fieldFloat_o = (float)MathUtil1.calculateDouble_2(this.fieldFloat_o, this.fieldFloat_n, 13.0, var3);
         if (Math.abs(this.fieldFloat_n - this.fieldFloat_o) < 1.0F) {
            this.fieldFloat_o = this.fieldFloat_n;
         }

         this.calculate();
      }

      BreezeContext.iRenderer_b.frameBegin();
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_k.getDouble(var6), this.c(), this.d());
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
      BreezeContext.iRenderer_b.renderInRect(this.a + 10.0F, this.b + 10.0F, this.c - 20.0F, this.d - 20.0F, this::lambda$draw_Inner0);
      BreezeContext.iRenderer_b.frameEnd();
      if (!LicenseState.isValid_2()) {
         MathUtil18.initialize(++var8);
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      long var7 = var5 ^ 81104409656066L;
      int var9 = MathUtil18.getValue();
      if (!this.dataBuilder15_k.isBool_e()) {
         return var4;
      }

      if (var4) {
         this.dataBuilder15_k.toggle(var7, false);
         return true;
      }

      if (!this.a(var1, var2)) {
         this.dataBuilder15_k.toggle(var7, false);
         return false;
      }

      for (RenderUtil7 var11 : this.arrayList_l) {
         if (var11.a(var1, var2)) {
            this.dataBuilder84_j.update(var11.getEnum16Val_h());
            return true;
         }

         if (var9 != 0) {
            break;
         }
      }

      return true;
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (!this.dataBuilder15_k.isBool_e()) {
         return false;
      }

      this.fieldFloat_n = this.fieldFloat_n - var3 * BreezeContext.iKeybindSettings_e.getX();
      this.fieldFloat_n = Math.max(0.0F, Math.min(this.fieldFloat_n, Math.max(0.0F, this.fieldFloat_p - this.d)));
      return true;
   }

   public void calculate() {
      long var1 = 62740630596709L;
      float var3 = this.b + 10.0F - this.fieldFloat_o;
      int var10000 = MathUtil18.getValue_2();
      Iterator var4 = this.arrayList_l.iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         RenderUtil7 var6 = (RenderUtil7)var4.next();
         var6.a(this.a + 10.0F, var3, this.c - 20.0F, 40.0F);
         var3 += 40.0F;
         if (var5 == 0) {
            break;
         }
      }
   }

   private void lambda$draw_Inner0(float var1, float var2, float var3) {
      long var4 = 37868641358653L;
      int var10000 = MathUtil18.getValue();
      Iterator var6 = this.arrayList_l.iterator();
      int var7 = var10000;

      while (var6.hasNext()) {
         RenderUtil7 var8 = (RenderUtil7)var6.next();
         var8.calculate(var1, var2, var3);
         if (var7 != 0) {
            break;
         }
      }
   }

   static {
      long var0 = 71845796997522L;
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
      String var6 = "Ú³²Ý\u0016\r6f9yÊ\u0098Ö\u0095³Ívåº^p\u000bá\u0083\u0097ÊyzÀ\u009cÏ\fëXÅ&Ä\u0099\u000f\u0007(7\u009c\u0087\u0092<.l\u0011\u00ad\fÏ\u001f15¶£\u008d\u0080¾\u001a(«Ðh\u001aç\u0010+i×\u0018\u0093DóïèpÑ±ì(H¬\u0019Ë\u0085¹ñÁÿðÈ\u0080óY\u000f]Ä(~·â8Ç\u009dÍ¶ö`Îò§uÊ\u0082äCcTXr";
      int var7 = "Ú³²Ý\u0016\r6f9yÊ\u0098Ö\u0095³Ívåº^p\u000bá\u0083\u0097ÊyzÀ\u009cÏ\fëXÅ&Ä\u0099\u000f\u0007(7\u009c\u0087\u0092<.l\u0011\u00ad\fÏ\u001f15¶£\u008d\u0080¾\u001a(«Ðh\u001aç\u0010+i×\u0018\u0093DóïèpÑ±ì(H¬\u0019Ë\u0085¹ñÁÿðÈ\u0080óY\u000f]Ä(~·â8Ç\u009dÍ¶ö`Îò§uÊ\u0082äCcTXr"
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
                     CONST_R = var4;
                     CONST_S = new String[5];
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

                  var6 = "òÅ\u0084\u001cG,Á\u00000y¼âÉ>\u0006\\ÅO±½\u0005\u0090\t;¨4Å=]§#z:¡YQV¶©3 w\u0094\u001d*{Ux\u001b¼\u008b%\u0015\u0082[b\u0082Ë© 4A\u0096õ´í&·´#\u008a\u0086ì";
                  var7 = "òÅ\u0084\u001cG,Á\u00000y¼âÉ>\u0006\\ÅO±½\u0005\u0090\t;¨4Å=]§#z:¡YQV¶©3 w\u0094\u001d*{Ux\u001b¼\u008b%\u0015\u0082[b\u0082Ë© 4A\u0096õ´í&·´#\u008a\u0086ì"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20047;
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
            throw new RuntimeException("rip/breeze/ec", var10);
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
         throw new RuntimeException("rip/breeze/ec" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
