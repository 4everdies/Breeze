package rip.breeze;

import java.awt.Color;
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

class BlockUtil9 extends Util28 {
   private final RenderUtil19_x enum4Val_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   private final rip.breeze.client.AnimationTimer dataBuilder15_l;
   final PreTickEvent dataBuilder29_m;
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);

   public BlockUtil9(PreTickEvent var1, RenderUtil19_x var2) {
      this.dataBuilder29_m = var1;
      this.dataBuilder15_k = new rip.breeze.client.AnimationTimer(250.0F, false, EnumType3.SINE_OUT);
      this.dataBuilder15_l = new rip.breeze.client.AnimationTimer(100.0F, true, EnumType3.LINEAR);
      this.enum4Val_j = var2;
      this.c = BreezeContext.iRenderer_b.measureText(var2.getString_b(), EnumType32.SOURCE_SANS, 20.0F) + 16.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.processNullable(var1, var2, var3);
      this.dataBuilder15_l.toggle(var6, !this.a(var1, var2) && !(Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(this.enum4Val_j));
      this.dataBuilder15_k.toggle(var6, (Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(this.enum4Val_j));
      Color var10 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.text"),
         BreezeContext.authSession_c.getColor("tag.text-hovered"),
         (float)this.dataBuilder15_l.getDouble(var8)
      );
      Color var11 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.background"),
         BreezeContext.authSession_c.getColor("tag.background-selected"),
         (float)this.dataBuilder15_k.getDouble(var8)
      );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(this.a, this.b, this.c, this.d, BreezeContext.authSession_c.getFloat("tag.corner-radius"), var11);
      BreezeContext.iRenderer_b.drawText(this.enum4Val_j.getString_b(), this.a + 8.0F, this.b + 9.0F, var10, EnumType32.SOURCE_SANS, 20.0F);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      int[] var6 = MathUtil8.decrypt();
      if (!this.a(var1, var2)) {
         return false;
      }

      if (var3 == 0) {
         if ((Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(this.enum4Val_j)) {
            boolean var7 = false;

            for (RenderUtil19_x var11 : RenderUtil19_x.values()) {
               if (var11 != this.enum4Val_j && (Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(var11)) {
                  var7 = true;
                  if (var6 == null) {
                     break;
                  }
               }

               if (var6 != null) {
                  break;
               }
            }

            if (!var7) {
               return true;
            }
         }

         PreTickEvent.getHashMap_j(this.dataBuilder29_m).put(this.enum4Val_j, !(Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(this.enum4Val_j));
         PreTickEvent.getDataBuilder103_l(this.dataBuilder29_m).processAll();
         if (var6 == null) {
            return true;
         }
      }

      if (var3 == 1) {
         boolean var12 = false;

         for (RenderUtil19_x var16 : RenderUtil19_x.values()) {
            if (var16 != this.enum4Val_j || var6 != null) {
               if (!var12 && (Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(var16)) {
                  var12 = true;
               }

               PreTickEvent.getHashMap_j(this.dataBuilder29_m).put(var16, false);
            }

            if (var6 != null) {
               break;
            }
         }

         if (!var12 && (Boolean)PreTickEvent.getHashMap_j(this.dataBuilder29_m).get(this.enum4Val_j)) {
            return true;
         }

         PreTickEvent.getHashMap_j(this.dataBuilder29_m).put(this.enum4Val_j, true);
         PreTickEvent.getDataBuilder103_l(this.dataBuilder29_m).processAll();
      }

      return true;
   }

   static {
      long var0 = 18274876977941L;
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
      String var6 = "ùV»\u0015µWÉ±÷]ne\u0095K\u001boún®\u0019\u0090\u0082:X(¶Ù\u0091\u0098\u000e\u0080õ\u0082\u0012`\u001f¼ÿ\tØî+ô54:Õ\"6\u0007\u0093V}\"¬ÀÇë\u0089,xú\u0003ÛÓ Àä±TÃK¸/ÅbÄ®\u0000\u0093Zí9Ä{çÊû¨\u00916a» \u008e=¡ ";
      int var7 = "ùV»\u0015µWÉ±÷]ne\u0095K\u001boún®\u0019\u0090\u0082:X(¶Ù\u0091\u0098\u000e\u0080õ\u0082\u0012`\u001f¼ÿ\tØî+ô54:Õ\"6\u0007\u0093V}\"¬ÀÇë\u0089,xú\u0003ÛÓ Àä±TÃK¸/ÅbÄ®\u0000\u0093Zí9Ä{çÊû¨\u00916a» \u008e=¡ "
         .length();
      char var8 = 24;
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
                     CONST_O = var4;
                     CONST_P = new String[5];
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

                  var6 = "\\{ð²è\u008aJñK\u001f\b\u0013õcÆ)Àó3VÎùµ\\D¸\u0086\u00953\u0088â¡R¥$Ë\u00821·9(Ô¿¬x\u001e\u0004Øäºxl×\u008c\u0097u,&\u0085\"2\u0013\u0084\u0087¥+¼IúÝHê/\u009chÑä´\u008a,¢";
                  var7 = "\\{ð²è\u008aJñK\u001f\b\u0013õcÆ)Àó3VÎùµ\\D¸\u0086\u00953\u0088â¡R¥$Ë\u00821·9(Ô¿¬x\u001e\u0004Øäºxl×\u008c\u0097u,&\u0085\"2\u0013\u0084\u0087¥+¼IúÝHê/\u009chÑä´\u008a,¢"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4504;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c3", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/c3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
