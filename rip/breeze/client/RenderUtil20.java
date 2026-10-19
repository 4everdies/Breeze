package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class RenderUtil20 implements IBreezeInterface, IMarker3 {
   static final RenderUtil20 CONST_A;
   static final RenderUtil20 CONST_B;
   private static final Pattern CONST_C;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public boolean checkCondition(long var1, String var3) {
      String[] var4 = Util28.values();
      int var10000 = var3.length();
      if (var1 >= 0L) {
         if (var10000 < 5) {
            return false;
         }

         var10000 = 0;
      }

      int var5 = var10000;

      label54:
      while (true) {
         char var7;
         if (var5 < 5) {
            var7 = var3.charAt(var5);
         } else {
            var7 = 1;
            if (var1 > 0L) {
               return true;
            }
         }

         do {
            char var6 = var7;
            if (var1 > 0L) {
               if (var5 < 4) {
                  boolean var8 = Character.isDigit(var6);
                  if (var1 <= 0L) {
                     return var8;
                  }

                  if (!var8) {
                     return false;
                  }
               } else {
                  if (var1 <= 0L) {
                     return (boolean)var6;
                  }

                  if (var6 != '-') {
                     return false;
                  }
               }
            } else if (var5 != 4) {
               return false;
            }

            var5++;
            if (var4 == null) {
               continue label54;
            }

            var7 = 1;
         } while (var1 <= 0L);

         return true;
      }
   }

   public Object getObject(String param1, AtomicInteger param2, long param3, Util112 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: lload 3
      // 001: dup2
      // 002: ldc2_w 54184182294855
      // 005: lxor
      // 006: dup2
      // 007: bipush 32
      // 009: lushr
      // 00a: l2i
      // 00b: istore 6
      // 00d: dup2
      // 00e: bipush 32
      // 010: lshl
      // 011: bipush 40
      // 013: lushr
      // 014: l2i
      // 015: istore 7
      // 017: dup2
      // 018: bipush 56
      // 01a: lshl
      // 01b: bipush 56
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 8
      // 021: pop2
      // 022: pop2
      // 023: new java/lang/StringBuilder
      // 026: dup
      // 027: invokespecial java/lang/StringBuilder.<init> ()V
      // 02a: astore 9
      // 02c: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 02f: aload 2
      // 030: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 033: istore 10
      // 035: astore 11
      // 037: iload 10
      // 039: aload 1
      // 03a: invokevirtual java/lang/String.length ()I
      // 03d: if_icmpge 0fe
      // 040: aload 1
      // 041: iload 10
      // 043: invokevirtual java/lang/String.charAt (I)C
      // 046: istore 12
      // 048: lload 3
      // 049: lconst_0
      // 04a: lcmp
      // 04b: iflt 0d0
      // 04e: iload 12
      // 050: invokestatic java/lang/Character.isDigit (C)Z
      // 053: ifne 0c8
      // 056: iload 12
      // 058: bipush 45
      // 05a: if_icmpeq 0c8
      // 05d: goto 064
      // 060: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: lload 3
      // 065: lconst_0
      // 066: lcmp
      // 067: iflt 0d0
      // 06a: iload 12
      // 06c: bipush 43
      // 06e: if_icmpeq 0c8
      // 071: goto 078
      // 074: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: lload 3
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 0d0
      // 07e: iload 12
      // 080: bipush 58
      // 082: if_icmpeq 0c8
      // 085: goto 08c
      // 088: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: lload 3
      // 08d: lconst_0
      // 08e: lcmp
      // 08f: iflt 0d0
      // 092: iload 12
      // 094: bipush 46
      // 096: if_icmpeq 0c8
      // 099: goto 0a0
      // 09c: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: lload 3
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: ifle 0d0
      // 0a6: iload 12
      // 0a8: bipush 84
      // 0aa: if_icmpeq 0c8
      // 0ad: goto 0b4
      // 0b0: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: iload 12
      // 0b6: lload 3
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0e6
      // 0bc: bipush 90
      // 0be: if_icmpne 0e2
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 9
      // 0ca: iload 12
      // 0cc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0cf: pop
      // 0d0: aload 11
      // 0d2: lload 3
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 0fb
      // 0d8: ifnull 0f3
      // 0db: goto 0e2
      // 0de: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: aload 2
      // 0e3: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 0e6: pop
      // 0e7: aload 11
      // 0e9: ifnull 0fe
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 2
      // 0f4: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 0f7: istore 10
      // 0f9: aload 11
      // 0fb: ifnull 037
      // 0fe: aload 9
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: lload 3
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 041
      // 109: astore 10
      // 10b: getstatic rip/breeze/client/RenderUtil20.CONST_C Ljava/util/regex/Pattern;
      // 10e: aload 10
      // 110: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 113: astore 12
      // 115: aload 12
      // 117: lload 3
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 152
      // 11d: invokevirtual java/util/regex/Matcher.matches ()Z
      // 120: ifne 150
      // 123: new rip/breeze/client/StringBuilderUtil
      // 126: dup
      // 127: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 12a: astore 13
      // 12c: aload 13
      // 12e: aload 5
      // 130: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 133: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 136: iload 6
      // 138: swap
      // 139: aload 10
      // 13b: aload 5
      // 13d: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 140: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 143: iload 7
      // 145: swap
      // 146: iload 8
      // 148: i2b
      // 149: swap
      // 14a: invokevirtual rip/breeze/client/StringBuilderUtil.update_9 (ILjava/lang/String;Ljava/lang/String;IBI)V
      // 14d: aload 13
      // 14f: areturn
      // 150: aload 12
      // 152: bipush 1
      // 153: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 156: astore 13
      // 158: sipush 32322
      // 15b: aload 12
      // 15d: bipush 3
      // 15e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 161: astore 14
      // 163: ldc2_w 7902604520056138842
      // 166: lload 3
      // 167: lxor
      // 168: aload 12
      // 16a: bipush 2
      // 16b: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 16e: astore 15
      // 170: invokestatic rip/breeze/client/RenderUtil20.buildString_2 (IJ)Ljava/lang/String;
      // 173: astore 16
      // 175: aload 15
      // 177: lload 3
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 1e2
      // 17d: ifnull 1ca
      // 180: aload 15
      // 182: invokevirtual java/lang/String.isEmpty ()Z
      // 185: lload 3
      // 186: lconst_0
      // 187: lcmp
      // 188: iflt 1e7
      // 18b: ifne 1ca
      // 18e: goto 195
      // 191: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: new java/lang/StringBuilder
      // 198: dup
      // 199: invokespecial java/lang/StringBuilder.<init> ()V
      // 19c: aload 16
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: sipush 30243
      // 1a4: ldc2_w 2170356383816197176
      // 1a7: lload 3
      // 1a8: lxor
      // 1a9: invokestatic rip/breeze/client/RenderUtil20.buildString_2 (IJ)Ljava/lang/String;
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b2: astore 16
      // 1b4: new java/lang/StringBuilder
      // 1b7: dup
      // 1b8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bb: aload 13
      // 1bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c0: aload 15
      // 1c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c8: astore 13
      // 1ca: new java/lang/StringBuilder
      // 1cd: dup
      // 1ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d1: aload 16
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: ldc "Z"
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1de: astore 16
      // 1e0: ldc "Z"
      // 1e2: aload 14
      // 1e4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e7: lload 3
      // 1e8: lconst_0
      // 1e9: lcmp
      // 1ea: ifle 221
      // 1ed: ifeq 21a
      // 1f0: new java/lang/StringBuilder
      // 1f3: dup
      // 1f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f7: aload 13
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: sipush 3158
      // 1ff: ldc2_w 8180862886867951183
      // 202: lload 3
      // 203: lxor
      // 204: invokestatic rip/breeze/client/RenderUtil20.buildString_2 (IJ)Ljava/lang/String;
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20d: lload 3
      // 20e: lconst_0
      // 20f: lcmp
      // 210: iflt 21c
      // 213: astore 13
      // 215: aload 11
      // 217: ifnull 248
      // 21a: aload 14
      // 21c: ldc ":"
      // 21e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 221: ifeq 248
      // 224: goto 22b
      // 227: invokestatic rip/breeze/client/RenderUtil20.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: new java/lang/StringBuilder
      // 22e: dup
      // 22f: invokespecial java/lang/StringBuilder.<init> ()V
      // 232: aload 13
      // 234: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 237: aload 14
      // 239: ldc ":"
      // 23b: ldc ""
      // 23d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 246: astore 13
      // 248: new java/text/SimpleDateFormat
      // 24b: dup
      // 24c: aload 16
      // 24e: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;)V
      // 251: astore 17
      // 253: aload 17
      // 255: bipush 0
      // 256: invokevirtual java/text/SimpleDateFormat.setLenient (Z)V
      // 259: aload 17
      // 25b: aload 13
      // 25d: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 260: areturn
      // 261: astore 17
      // 263: new rip/breeze/client/StringBuilderUtil
      // 266: dup
      // 267: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 26a: astore 18
      // 26c: aload 18
      // 26e: aload 5
      // 270: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 273: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 276: iload 6
      // 278: swap
      // 279: aload 10
      // 27b: aload 5
      // 27d: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 280: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 283: iload 7
      // 285: swap
      // 286: iload 8
      // 288: i2b
      // 289: swap
      // 28a: invokevirtual rip/breeze/client/StringBuilderUtil.update_9 (ILjava/lang/String;Ljava/lang/String;IBI)V
      // 28d: aload 18
      // 28f: areturn
      // try (261 -> 267): 268 java/lang/Exception
      // try (189 -> 202): 203 java/lang/Exception
      // try (105 -> 123): 124 java/lang/Exception
      // try (95 -> 115): 116 java/lang/Exception
      // try (85 -> 102): 103 java/lang/Exception
      // try (75 -> 92): 93 java/lang/Exception
      // try (65 -> 82): 83 java/lang/Exception
      // try (55 -> 72): 73 java/lang/Exception
      // try (49 -> 62): 63 java/lang/Exception
      // try (42 -> 52): 53 java/lang/Exception
      // try (282 -> 293): 294 java/lang/Exception
   }

   private RenderUtil20() {
   }

   @Override
   public String toString() {
      long var1 = 19799202186789L;
      return buildString_2(13150, 5137591209966910873L ^ var1);
   }

   RenderUtil20(Lambda12 var1) {
      this();
   }

   static {
      long var0 = 115582983799202L;
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
      String var6 = "\u0002\u0012÷M-\u0082!èi%vÿ7\u0003\u0002}'è9\u0002uÀ¹þ\u0083øLf¶×%m±åÑÎ\u00873\"\u0085\u0010wéþ\u0000\u0000\u008cÕ<áwë\u0080LeÏ\u0011 \u0004\u009b*oï\u00050?\u0086Ô\u009bv\u009c¡ÕàÛ\n\u0086næ\u008c$L\u0096\bó\u0013\u0090\u0015¥Ï";
      int var7 = "\u0002\u0012÷M-\u0082!èi%vÿ7\u0003\u0002}'è9\u0002uÀ¹þ\u0083øLf¶×%m±åÑÎ\u00873\"\u0085\u0010wéþ\u0000\u0000\u008cÕ<áwë\u0080LeÏ\u0011 \u0004\u009b*oï\u00050?\u0086Ô\u009bv\u009c¡ÕàÛ\n\u0086næ\u008c$L\u0096\bó\u0013\u0090\u0015¥Ï"
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
                     CONST_F = new String[5];
                     CONST_A = new RenderUtil20();
                     CONST_B = new Lambda9(null);
                     CONST_C = Pattern.compile(buildString_2(29813, 3069531753556229427L ^ var0));
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

                  var6 = "H\u008c\rÂ$#\u00178\n¬@9¹\u0002á9¨ç}ÔX\u0093\u0085\"\u009bé\u0098\u008a÷\u0004F¥\u0092\u0086øA\u0086Ã~ö©ÌúÚ<YÒ;Ü\u0001\u0003{¿74íL\u00adÜä\u008cìÒ*\u0015ôü¿M\u001a^\u0099uI\u0080á6ËÅñ=J·u¯6Ì\f!5Ñ\u0082\u001bÒ\tÜX ¤\u0004ç\u009c¡aÍÞ¦$&PÙ\\oqï\u0001(\u009c\u009d»Z\u0001\u001e¯à\u0002Ï\u0006W®¥Pìñ3\u0001\u0015ÎËfËÄ o\u0089U\u008e+\u001bÑ³\u0096ÚÙU'_¾)\u0081Ô}`Z1UÖâ¼Ç\bÌ\u001b¬\u009cÀ\u0088ø>Ä¼ìP´f";
                  var7 = "H\u008c\rÂ$#\u00178\n¬@9¹\u0002á9¨ç}ÔX\u0093\u0085\"\u009bé\u0098\u008a÷\u0004F¥\u0092\u0086øA\u0086Ã~ö©ÌúÚ<YÒ;Ü\u0001\u0003{¿74íL\u00adÜä\u008cìÒ*\u0015ôü¿M\u001a^\u0099uI\u0080á6ËÅñ=J·u¯6Ì\f!5Ñ\u0082\u001bÒ\tÜX ¤\u0004ç\u009c¡aÍÞ¦$&PÙ\\oqï\u0001(\u009c\u009d»Z\u0001\u001e¯à\u0002Ï\u0006W®¥Pìñ3\u0001\u0015ÎËfËÄ o\u0089U\u008e+\u001bÑ³\u0096ÚÙU'_¾)\u0081Ô}`Z1UÖâ¼Ç\bÌ\u001b¬\u009cÀ\u0088ø>Ä¼ìP´f"
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18656;
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
            throw new RuntimeException("rip/breeze/client/cv", var10);
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
}
