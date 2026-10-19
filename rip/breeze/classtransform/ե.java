package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.BreezeClass12;

public class ե extends RuntimeException {
   private final String string_ÿ;
   private final String string_þ;
   private final String string_ý;
   private final String string_ü;
   private final Collection<String> collection_û;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public ե(BreezeClass12 param1, rip.breeze.inject.é param2, long param3, String param5, Collection param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/ե.encKey_a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: invokestatic rip/breeze/classtransform/գ.getString ()Ljava/lang/String;
      // 09: aload 0
      // 0a: invokespecial java/lang/RuntimeException.<init> ()V
      // 0d: aload 0
      // 0e: sipush 18334
      // 11: ldc2_w 7008885018291895158
      // 14: lload 3
      // 15: lxor
      // 16: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ե.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: putfield rip/breeze/classtransform/ե.string_ÿ Ljava/lang/String;
      // 1e: aload 0
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: invokespecial java/lang/StringBuilder.<init> ()V
      // 26: aload 1
      // 27: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d: aload 1
      // 2e: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 31: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 37: putfield rip/breeze/classtransform/ե.string_þ Ljava/lang/String;
      // 3a: aload 0
      // 3b: aload 2
      // 3c: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 3f: putfield rip/breeze/classtransform/ե.string_ý Ljava/lang/String;
      // 42: aload 0
      // 43: aload 5
      // 45: putfield rip/breeze/classtransform/ե.string_ü Ljava/lang/String;
      // 48: astore 7
      // 4a: aload 0
      // 4b: aload 6
      // 4d: putfield rip/breeze/classtransform/ե.collection_û Ljava/util/Collection;
      // 50: aload 7
      // 52: ifnull 6e
      // 55: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 58: ifeq 6a
      // 5b: goto 62
      // 5e: invokestatic rip/breeze/classtransform/ե.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 61: athrow
      // 62: bipush 0
      // 63: goto 6b
      // 66: invokestatic rip/breeze/classtransform/ե.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 69: athrow
      // 6a: bipush 1
      // 6b: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 6e: return
      // try (34 -> 41): 42 rip/breeze/classtransform/ե
      // try (39 -> 46): 46 rip/breeze/classtransform/ե
   }

   @Override
   public String getMessage() {
      long var1 = 63049692042852L;
      String var10000 = գ.getString();
      String var3 = this.string_ÿ
         + null /* removed */
         + this.string_þ
         + null /* removed */
         + this.string_ý
         + null /* removed */
         + this.string_ü
         + "'";
      String var4 = var10000;

      label42: {
         try {
            var9 = this.collection_û;
            if (var4 != null) {
               break label42;
            }

            if (this.collection_û.isEmpty()) {
               return var3;
            }
         } catch (ե var8) {
            throw getԵ(var8);
         }

         var3 = var3 + null /* removed */;
         var9 = this.collection_û;
      }

      for (String var6 : var9) {
         var3 = var3 + var6 + null /* removed */;

         try {
            if (var4 != null) {
               return var3 + ")";
            }

            if (var4 != null) {
               break;
            }
         } catch (ե var7) {
            throw getԵ(var7);
         }
      }

      var3 = var3.substring(0, var3.length() - 2);
      return var3 + ")";
   }

   static {
      long var0 = 43344304222501L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "4\u009aÚMmVbq]\u0004)Øiê\u0019d(\u0011ÃÊ 2¥©\u0005\u008féë¨{âc\u0089(è\u009c9\\g@\u0012L 9Z?ÿ2Âôo7@\u001cÒìA\u0010®¸\u001c\u0019ckæ\u0017g,\u0006èØ\u0081¡¤\u0010Ã?\u0011\u00ad\u0091\u009d\u008e0õ~#\u009fË§ùp";
      int var7 = "4\u009aÚMmVbq]\u0004)Øiê\u0019d(\u0011ÃÊ 2¥©\u0005\u008féë¨{âc\u0089(è\u009c9\\g@\u0012L 9Z?ÿ2Âôo7@\u001cÒìA\u0010®¸\u001c\u0019ckæ\u0017g,\u0006èØ\u0081¡¤\u0010Ã?\u0011\u00ad\u0091\u009d\u008e0õ~#\u009fË§ùp"
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
                     CONST_B = var4;
                     CONST_C = new String[6];
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

                  var6 = "#ç^\u0087\u0016\u000bTR\u0094AkGG)5¤£Ì\u009bghð!\u008ff§28ÒùÜÍ\u0085*!¢\u0081\u0086üp(\u0016f\u0092ùI\f\bçê\u0015\u00811¦\u0099¢#B\u0085Úk-¦\u001aÖzGÓª\r\u0016tmák«\u0007yÍ?n";
                  var7 = "#ç^\u0087\u0016\u000bTR\u0094AkGG)5¤£Ì\u009bghð!\u008ff§28ÒùÜÍ\u0085*!¢\u0081\u0086üp(\u0016f\u0092ùI\f\bçê\u0015\u00811¦\u0099¢#B\u0085Úk-¦\u001aÖzGÓª\r\u0016tmák«\u0007yÍ?n"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static ե getԵ(ե var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6315;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/ե", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/ե" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
