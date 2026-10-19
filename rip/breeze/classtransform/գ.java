package rip.breeze.classtransform;

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
import rip.breeze.inject.BreezeClass12;

public class գ extends RuntimeException {
   private final String string_ÿ;
   private final String string_þ;
   private final String string_ý;
   private final String string_ü;
   private String string_û;
   private static String string_ú;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public static գ getԳ(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var0[2];
      byte var5 = (Boolean)var0[3];
      var2 = encKey_a ^ var2;
      long var6 = var2 ^ 63969241255821L;
      long var8 = var2 ^ 37661487857413L;
      long var10 = var2 ^ 84049709936290L;
      long var12 = var2 ^ 7443186990773L;
      String var14 = getString();

      գ var10000;
      գ var10001;
      BreezeClass12 var10002;
      rip.breeze.inject.é var10003;
      StringBuilder var10004;
      String var10005;
      label55: {
         try {
            var10000 = new գ();
            var10001 = var10000;
            var10002 = var1;
            var10003 = var4;
            var10004 = new StringBuilder().append(null /* removed */);
            if (var5 != 0) {
               var10005 = "";
               break label55;
            }
         } catch (գ var17) {
            throw getԳ_9(var17);
         }

         var10005 = null /* removed */;
      }

      label63: {
         /* constructor call removed */
         var20 = և.getև_2(new Object[]{var1, var12});
         int var21 = var5;
         if (var14 == null) {
            try {
               if (var21 != 0) {
                  var22 = var1.int_û | 8;
                  break label63;
               }
            } catch (գ var16) {
               throw getԳ_9(var16);
            }

            var21 = var1.int_û;
         }

         var22 = var21 & -9;
      }

      try {
         Object[] var23 = new Object[]{null, var6};
         var23[0] = var22;
         var10000 = var10000.getԳ_7(new Object[]{var10, var20.getև_3(var23)});
         if (var2 >= 0L) {
            if (!rip.breeze.inject.ջ.method_012()) {
               return var10000;
            }

            initialize("UgU8Z");
         }
      } catch (գ var15) {
         throw getԳ_9(var15);
      }

      if (var2 < 0L) {
         throw getԳ_9(var10000);
      } else {
         return var10000;
      }
   }

   public static գ getԳ_2(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var0[2];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 99400422654903L;
      long var7 = var2 ^ 78688984127394L;
      long var9 = var2 ^ 45770702194181L;
      long var11 = var2 ^ 108939898033682L;
      գ var10000 = new գ(var1, var4, var7, null /* removed */);
      և var10001 = և.getև_2(new Object[]{var1, var11});
      rip.breeze.inject.MathUtil3 var10003 = rip.breeze.inject.MathUtil3.CONST_Ð;
      return var10000.getԳ_7(new Object[]{var9, var10001.getև_4(new Object[]{var5, var10003})});
   }

   public static գ getԳ_3(Object... param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/BreezeClass12
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/é
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 3
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast [Ljava/lang/Class;
      // 1f: astore 5
      // 21: pop
      // 22: getstatic rip/breeze/classtransform/գ.encKey_a J
      // 25: lload 3
      // 26: lxor
      // 27: lstore 3
      // 28: lload 3
      // 29: dup2
      // 2a: ldc2_w 51828721206910
      // 2d: lxor
      // 2e: lstore 6
      // 30: dup2
      // 31: ldc2_w 66039415916976
      // 34: lxor
      // 35: lstore 8
      // 37: pop2
      // 38: invokestatic rip/breeze/classtransform/գ.getString ()Ljava/lang/String;
      // 3b: aload 5
      // 3d: arraylength
      // 3e: anewarray 143
      // 41: astore 10
      // 43: astore 11
      // 45: bipush 0
      // 46: istore 12
      // 48: iload 12
      // 4a: aload 5
      // 4c: arraylength
      // 4d: if_icmpge 7b
      // 50: aload 10
      // 52: iload 12
      // 54: aload 5
      // 56: iload 12
      // 58: aaload
      // 59: lload 8
      // 5b: dup2_x1
      // 5c: pop2
      // 5d: bipush 2
      // 5e: anewarray 94
      // 61: dup_x1
      // 62: swap
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 72: aastore
      // 73: iinc 12 1
      // 76: aload 11
      // 78: ifnull 48
      // 7b: lload 3
      // 7c: lconst_0
      // 7d: lcmp
      // 7e: ifle 76
      // 81: aload 1
      // 82: aload 2
      // 83: lload 6
      // 85: aload 10
      // 87: bipush 4
      // 88: anewarray 94
      // 8b: dup_x1
      // 8c: swap
      // 8d: bipush 3
      // 8e: swap
      // 8f: aastore
      // 90: dup_x2
      // 91: dup_x2
      // 92: pop
      // 93: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 96: bipush 2
      // 97: swap
      // 98: aastore
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 1
      // 9c: swap
      // 9d: aastore
      // 9e: dup_x1
      // 9f: swap
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: invokestatic rip/breeze/classtransform/գ.getԳ_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // a6: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static գ getԳ_4(Object... var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      long var3 = (Long)var0[2];
      rip.breeze.inject.MathUtil3[] var5 = (rip.breeze.inject.MathUtil3[])var0[3];
      var3 = encKey_a ^ var3;
      long var6 = var3 ^ 65935746897552L;
      long var8 = var3 ^ 92835049595956L;
      long var10 = var3 ^ 117831729231411L;
      long var12 = var3 ^ 5614342072212L;
      long var14 = var3 ^ 87614803933059L;
      String var10000 = getString();
      String var16 = null /* removed */;
      String var17 = var10000;

      label53: {
         label58: {
            label51: {
               label59: {
                  try {
                     var24 = var5.length;
                     if (var17 != null) {
                        break label58;
                     }

                     if (var24 != 0) {
                        break label59;
                     }
                  } catch (գ var22) {
                     throw getԳ_9(var22);
                  }

                  var16 = var16 + null /* removed */;

                  try {
                     var10000 = var17;
                     if (var3 < 0L) {
                        break label51;
                     }

                     if (var17 == null) {
                        throw new գ(var1, var2, var10, var16)
                           .getԳ_7(new Object[]{var12, և.getև_2(new Object[]{var1, var14}).getև_6(new Object[]{null, var6}).getև_7(var8, var5)});
                     }
                  } catch (գ var21) {
                     throw getԳ_9(var21);
                  }
               }

               try {
                  var10000 = var16 + null /* removed */;
               } catch (գ var18) {
                  throw getԳ_9(var18);
               }
            }

            try {
               if (var17 != null) {
                  break label53;
               }
            } catch (գ var20) {
               throw getԳ_9(var20);
            }

            var16 = var10000;
            var24 = var5.length;
         }

         try {
            if (var24 == 1) {
               throw new գ(var1, var2, var10, var16)
                  .getԳ_7(new Object[]{var12, և.getև_2(new Object[]{var1, var14}).getև_6(new Object[]{null, var6}).getև_7(var8, var5)});
            }

            var10000 = var16 + "s";
         } catch (գ var19) {
            throw getԳ_9(var19);
         }
      }

      var16 = var10000;
      throw new գ(var1, var2, var10, var16)
         .getԳ_7(new Object[]{var12, և.getև_2(new Object[]{var1, var14}).getև_6(new Object[]{null, var6}).getև_7(var8, var5)});
   }

   public static գ getԳ_5(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var0[2];
      rip.breeze.inject.é var5 = (rip.breeze.inject.é)var0[3];
      var2 = encKey_a ^ var2;
      long var6 = var2 ^ 113655308707521L;
      return new գ(var1, var4, var6, null /* removed */ + var5.string_ú_2 + "'");
   }

   public static գ getԳ_6(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var0[2];
      rip.breeze.inject.é var5 = (rip.breeze.inject.é)var0[3];
      var1 = encKey_a ^ var1;
      long var6 = var1 ^ 45791224434549L;
      return new գ(var3, var4, var6, null /* removed */ + var5.string_ú_2 + "'");
   }

   public գ(rip.breeze.inject.á var1, rip.breeze.inject.é var2, long var3, String var5) {
      var3 = encKey_a ^ var3;
      super();
      this.string_ÿ = null /* removed */;
      this.string_þ = var1.string_ü_2 + ":" + var1.string_û_2;
      this.string_ý = var2.string_ú_2;
      this.string_ü = var5;
   }

   public գ(BreezeClass12 var1, rip.breeze.inject.é var2, long var3, String var5) {
      var3 = encKey_a ^ var3;
      super();
      this.string_ÿ = null /* removed */;
      this.string_þ = var1.string_ú + var1.string_ù;
      this.string_ý = var2.string_ú_2;
      this.string_ü = var5;
   }

   public գ getԳ_7(Object[] var1) {
      long var2 = (Long)var1[0];
      և var4 = (և)var1[1];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 37419758183337L;
      return this.getԳ_8(new Object[]{var4.buildString(new Object[]{var5})});
   }

   public գ getԳ_8(Object[] var1) {
      String var2 = (String)var1[0];
      this.string_û = var2;
      return this;
   }

   @Override
   public String getMessage() {
      long var1 = 86351570667685L;
      String var10000 = getString();
      String var3 = this.string_ÿ
         + null /* removed */
         + this.string_þ
         + null /* removed */
         + this.string_ý
         + null /* removed */
         + this.string_ü;
      String var4 = var10000;

      try {
         if (var4 != null) {
            return this.string_û;
         }

         if (this.string_û == null) {
            return var3;
         }
      } catch (գ var5) {
         throw getԳ_9(var5);
      }

      return var3 + null /* removed */ + this.string_û;
   }

   public static void initialize(String var0) {
      string_ú = var0;
   }

   public static String getString() {
      return string_ú;
   }

   static {
      long var0 = 13919185668548L;
      initialize(null);
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
      String var6 = "\u0007Æ·Ô\u009a\u0003Ô\u009e\u0001bbqfµrÃ]\u008eV7Ü\rí\u0012\u0093Éâ\u0016Y×?ö\u0095\u007f\u0016c\u008f&#F8'nVq\r(V0XNôÌ¿¬\u0098¹[\u001fÍß\u0088,6\fëÔ1â¿ÊÑ\u009fÔSß\u0089Ï\fÁL\u001dF4H\u000e\u008d]ÈAy/\u0080\u0093âü\u0084\u0010\u009a\u00942\u0080£#]ã±Õ\bqQ\u009dC\u008d\u0010¸TNzÖ\u001d¥·\u0015Ó\u008a\u001fÛLFy\u0018#¯K\u0099\u008d\u000e\u0087¼Î8uN\u009f\u001eðxú²\u000b\u009c,ÿ@:(ª\\\u0002Þýì\u008aþ\u0006\u0098e\u009a.òv\u0083]\u0019¶sÄ}»Gó1W\u0010\u0086à«Vi\u00164\u001d\u0088Æ¨Õ(\u0016/ä\u001b\u0089fý\u0087,Mú>Ïb¶hTrÿ÷4¹®¦\u008dW±ðMOÜ\u001e\u000fa\u0003\u0011\u000bï\u000eË\u0010j< ú\u00166\u00047\u0089Ò\u0083ùü.h\u001d8\u0083ìó>Ô\u000fF\u00897\u00ad\u0094\"·§\n\u0016Vp\u0096\u00adíÏb|Á^k\u0090ªÙw\u00904o\u008cû\u0001¾ÙD<vÖ¿Ëkq¯\"\u001aáÄö\u0085I/\u0010þ`?\u0085sév\u009d`\u001f\u0097\u0004¥nA. \\\u001f=\u0089>£ïGvþ \u0019âÛ»Ö\u0083yêè¤S\u0083\u009ecûûïC\u001c\u00875 ¥\u001c©¿î\u001ep`mSLÃ_\u009bo©ö\u0097# F\u001fÔí`¾´±Ø\u0087\u0000+\u0010RØ{BË%'|Z·`@üfî^";
      int var7 = "\u0007Æ·Ô\u009a\u0003Ô\u009e\u0001bbqfµrÃ]\u008eV7Ü\rí\u0012\u0093Éâ\u0016Y×?ö\u0095\u007f\u0016c\u008f&#F8'nVq\r(V0XNôÌ¿¬\u0098¹[\u001fÍß\u0088,6\fëÔ1â¿ÊÑ\u009fÔSß\u0089Ï\fÁL\u001dF4H\u000e\u008d]ÈAy/\u0080\u0093âü\u0084\u0010\u009a\u00942\u0080£#]ã±Õ\bqQ\u009dC\u008d\u0010¸TNzÖ\u001d¥·\u0015Ó\u008a\u001fÛLFy\u0018#¯K\u0099\u008d\u000e\u0087¼Î8uN\u009f\u001eðxú²\u000b\u009c,ÿ@:(ª\\\u0002Þýì\u008aþ\u0006\u0098e\u009a.òv\u0083]\u0019¶sÄ}»Gó1W\u0010\u0086à«Vi\u00164\u001d\u0088Æ¨Õ(\u0016/ä\u001b\u0089fý\u0087,Mú>Ïb¶hTrÿ÷4¹®¦\u008dW±ðMOÜ\u001e\u000fa\u0003\u0011\u000bï\u000eË\u0010j< ú\u00166\u00047\u0089Ò\u0083ùü.h\u001d8\u0083ìó>Ô\u000fF\u00897\u00ad\u0094\"·§\n\u0016Vp\u0096\u00adíÏb|Á^k\u0090ªÙw\u00904o\u008cû\u0001¾ÙD<vÖ¿Ëkq¯\"\u001aáÄö\u0085I/\u0010þ`?\u0085sév\u009d`\u001f\u0097\u0004¥nA. \\\u001f=\u0089>£ïGvþ \u0019âÛ»Ö\u0083yêè¤S\u0083\u009ecûûïC\u001c\u00875 ¥\u001c©¿î\u001ep`mSLÃ_\u009bo©ö\u0097# F\u001fÔí`¾´±Ø\u0087\u0000+\u0010RØ{BË%'|Z·`@üfî^"
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
                     CONST_B = var4;
                     CONST_C = new String[15];
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

                  var6 = "þ¿\u0007\u001b~U£~<\u0007\u0099B¥$\u009a?\u0010ý\u0001¸¹=\u0081óÚ«\u0015Çíé&CN";
                  var7 = "þ¿\u0007\u001b~U£~<\u0007\u0099B¥$\u009a?\u0010ý\u0001¸¹=\u0081óÚ«\u0015Çíé&CN".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static գ getԳ_9(գ var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13741;
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
            throw new RuntimeException("rip/breeze/classtransform/գ", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/գ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
