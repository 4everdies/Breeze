package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

class ModeSetting implements IBreezeInterface, IMarker3 {
   static final ModeSetting CONST_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public boolean checkCondition(long var1, String var3) {
      char var4 = var3.charAt(0);
      char var10000 = var4;
      if (var1 >= 0L) {
         if (var4 != '+') {
            if (var1 < 0L) {
               return (boolean)var4;
            }

            if (var4 != '-') {
               byte var5 = Character.isDigit(var4);
               if (var1 <= 0L) {
                  return (boolean)var5;
               }

               if (var5 == 0) {
                  return false;
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
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
      // 023: bipush 1
      // 024: istore 9
      // 026: bipush 0
      // 027: istore 10
      // 029: bipush 0
      // 02a: istore 11
      // 02c: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 02f: bipush 0
      // 030: istore 12
      // 032: bipush 0
      // 033: istore 13
      // 035: ldc ""
      // 037: astore 14
      // 039: astore 15
      // 03b: new java/lang/StringBuilder
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuilder.<init> ()V
      // 042: astore 16
      // 044: aload 2
      // 045: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 048: istore 17
      // 04a: iload 17
      // 04c: aload 1
      // 04d: invokevirtual java/lang/String.length ()I
      // 050: if_icmpge 24f
      // 053: aload 1
      // 054: iload 17
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: istore 18
      // 05b: aload 1
      // 05c: invokevirtual java/lang/String.length ()I
      // 05f: lload 3
      // 060: lconst_0
      // 061: lcmp
      // 062: iflt 06d
      // 065: iload 17
      // 067: bipush 1
      // 068: iadd
      // 069: if_icmple 070
      // 06c: bipush 1
      // 06d: goto 071
      // 070: bipush 0
      // 071: istore 19
      // 073: iload 18
      // 075: invokestatic java/lang/Character.isDigit (C)Z
      // 078: lload 3
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 0de
      // 07e: ifeq 0dc
      // 081: aload 16
      // 083: iload 18
      // 085: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 088: pop
      // 089: bipush 0
      // 08a: istore 9
      // 08c: bipush 1
      // 08d: istore 12
      // 08f: aload 14
      // 091: invokevirtual java/lang/String.isEmpty ()Z
      // 094: lload 3
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 0c1
      // 09a: ifeq 0ad
      // 09d: sipush 31579
      // 0a0: ldc2_w 7548670645441253706
      // 0a3: lload 3
      // 0a4: lxor
      // 0a5: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 0a8: astore 14
      // 0aa: bipush 1
      // 0ab: istore 10
      // 0ad: iload 19
      // 0af: istore 13
      // 0b1: aload 14
      // 0b3: sipush 19166
      // 0b6: ldc2_w 5536134154029228235
      // 0b9: lload 3
      // 0ba: lxor
      // 0bb: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 0be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c1: lload 3
      // 0c2: lconst_0
      // 0c3: lcmp
      // 0c4: ifle 0cb
      // 0c7: ifne 0ce
      // 0ca: bipush 1
      // 0cb: goto 0cf
      // 0ce: bipush 0
      // 0cf: istore 11
      // 0d1: aload 15
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 24c
      // 0d9: ifnull 244
      // 0dc: iload 18
      // 0de: lload 3
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iflt 0f8
      // 0e4: bipush 43
      // 0e6: if_icmpeq 0f6
      // 0e9: iload 18
      // 0eb: bipush 45
      // 0ed: lload 3
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 136
      // 0f3: if_icmpne 132
      // 0f6: iload 9
      // 0f8: lload 3
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 134
      // 0fe: ifeq 132
      // 101: iload 19
      // 103: lload 3
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 134
      // 109: ifeq 132
      // 10c: bipush 0
      // 10d: istore 9
      // 10f: bipush 0
      // 110: istore 12
      // 112: iload 18
      // 114: lload 3
      // 115: lconst_0
      // 116: lcmp
      // 117: iflt 248
      // 11a: bipush 45
      // 11c: if_icmpne 244
      // 11f: aload 16
      // 121: bipush 45
      // 123: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 126: pop
      // 127: aload 15
      // 129: lload 3
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 24c
      // 12f: ifnull 244
      // 132: iload 18
      // 134: bipush 46
      // 136: lload 3
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 18b
      // 13c: if_icmpne 181
      // 13f: iload 10
      // 141: lload 3
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 183
      // 147: ifeq 181
      // 14a: iload 19
      // 14c: lload 3
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: ifle 183
      // 152: ifeq 181
      // 155: aload 16
      // 157: bipush 46
      // 159: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 15c: pop
      // 15d: sipush 30761
      // 160: ldc2_w 6048881280293196345
      // 163: lload 3
      // 164: lxor
      // 165: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 168: astore 14
      // 16a: bipush 0
      // 16b: istore 12
      // 16d: bipush 0
      // 16e: istore 10
      // 170: bipush 0
      // 171: istore 11
      // 173: bipush 0
      // 174: istore 13
      // 176: aload 15
      // 178: lload 3
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 24c
      // 17e: ifnull 244
      // 181: iload 18
      // 183: lload 3
      // 184: lconst_0
      // 185: lcmp
      // 186: iflt 19d
      // 189: bipush 69
      // 18b: if_icmpeq 19b
      // 18e: iload 18
      // 190: bipush 101
      // 192: lload 3
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 1ea
      // 198: if_icmpne 1e0
      // 19b: iload 11
      // 19d: lload 3
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: iflt 1e2
      // 1a3: ifeq 1e0
      // 1a6: iload 19
      // 1a8: lload 3
      // 1a9: lconst_0
      // 1aa: lcmp
      // 1ab: ifle 1e2
      // 1ae: ifeq 1e0
      // 1b1: aload 16
      // 1b3: bipush 69
      // 1b5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1b8: pop
      // 1b9: sipush 11354
      // 1bc: ldc2_w 7751550155714758222
      // 1bf: lload 3
      // 1c0: lxor
      // 1c1: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 1c4: astore 14
      // 1c6: bipush 0
      // 1c7: istore 12
      // 1c9: bipush 1
      // 1ca: istore 9
      // 1cc: bipush 0
      // 1cd: istore 10
      // 1cf: bipush 0
      // 1d0: istore 11
      // 1d2: bipush 0
      // 1d3: istore 13
      // 1d5: aload 15
      // 1d7: lload 3
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: iflt 24c
      // 1dd: ifnull 244
      // 1e0: iload 18
      // 1e2: lload 3
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: iflt 227
      // 1e8: bipush 95
      // 1ea: if_icmpne 225
      // 1ed: iload 13
      // 1ef: lload 3
      // 1f0: lconst_0
      // 1f1: lcmp
      // 1f2: iflt 227
      // 1f5: ifeq 225
      // 1f8: iload 19
      // 1fa: lload 3
      // 1fb: lconst_0
      // 1fc: lcmp
      // 1fd: iflt 227
      // 200: ifeq 225
      // 203: aload 1
      // 204: iload 17
      // 206: bipush 1
      // 207: iadd
      // 208: invokevirtual java/lang/String.charAt (I)C
      // 20b: invokestatic java/lang/Character.isDigit (C)Z
      // 20e: lload 3
      // 20f: lconst_0
      // 210: lcmp
      // 211: iflt 227
      // 214: ifeq 225
      // 217: bipush 0
      // 218: istore 13
      // 21a: aload 15
      // 21c: lload 3
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: iflt 24c
      // 222: ifnull 244
      // 225: iload 12
      // 227: lload 3
      // 228: lconst_0
      // 229: lcmp
      // 22a: ifle 238
      // 22d: ifne 234
      // 230: ldc ""
      // 232: astore 14
      // 234: aload 2
      // 235: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 238: lload 3
      // 239: lconst_0
      // 23a: lcmp
      // 23b: iflt 265
      // 23e: pop
      // 23f: aload 15
      // 241: ifnull 24f
      // 244: aload 2
      // 245: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 248: istore 17
      // 24a: aload 15
      // 24c: ifnull 04a
      // 24f: aload 14
      // 251: sipush 7764
      // 254: ldc2_w 5804507963705209922
      // 257: lload 3
      // 258: lxor
      // 259: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 25c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25f: lload 3
      // 260: lconst_0
      // 261: lcmp
      // 262: iflt 059
      // 265: lload 3
      // 266: lconst_0
      // 267: lcmp
      // 268: ifle 287
      // 26b: ifeq 277
      // 26e: aload 16
      // 270: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 273: invokestatic java/lang/Long.valueOf (Ljava/lang/String;)Ljava/lang/Long;
      // 276: areturn
      // 277: aload 14
      // 279: sipush 26899
      // 27c: ldc2_w 8799240024613208833
      // 27f: lload 3
      // 280: lxor
      // 281: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 284: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 287: lload 3
      // 288: lconst_0
      // 289: lcmp
      // 28a: iflt 2af
      // 28d: ifeq 299
      // 290: aload 16
      // 292: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 295: invokestatic java/lang/Double.valueOf (Ljava/lang/String;)Ljava/lang/Double;
      // 298: areturn
      // 299: aload 14
      // 29b: sipush 11354
      // 29e: ldc2_w 7751550155714758222
      // 2a1: lload 3
      // 2a2: lxor
      // 2a3: invokestatic rip/breeze/client/ModeSetting.buildString_2 (IJ)Ljava/lang/String;
      // 2a6: lload 3
      // 2a7: lconst_0
      // 2a8: lcmp
      // 2a9: iflt 2b9
      // 2ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2af: ifeq 2d7
      // 2b2: aload 16
      // 2b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b7: ldc "E"
      // 2b9: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 2bc: astore 17
      // 2be: aload 17
      // 2c0: bipush 0
      // 2c1: aaload
      // 2c2: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 2c5: ldc2_w 10.0
      // 2c8: aload 17
      // 2ca: bipush 1
      // 2cb: aaload
      // 2cc: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 2cf: invokestatic java/lang/Math.pow (DD)D
      // 2d2: dmul
      // 2d3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2d6: areturn
      // 2d7: new rip/breeze/client/StringBuilderUtil
      // 2da: dup
      // 2db: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 2de: astore 17
      // 2e0: aload 17
      // 2e2: aload 5
      // 2e4: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 2e7: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 2ea: iload 6
      // 2ec: swap
      // 2ed: aload 16
      // 2ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f2: aload 5
      // 2f4: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 2f7: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 2fa: iload 7
      // 2fc: swap
      // 2fd: iload 8
      // 2ff: i2b
      // 300: swap
      // 301: invokevirtual rip/breeze/client/StringBuilderUtil.update_9 (ILjava/lang/String;Ljava/lang/String;IBI)V
      // 304: aload 17
      // 306: areturn
   }

   @Override
   public String toString() {
      long var1 = 27670189136963L;
      return buildString_2(24258, 764888105986699882L ^ var1);
   }

   static {
      long var0 = 85113178192805L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "\u0085%\u000f§oG\u0003\u0099æ\u0018C5Ðq?`\u0010\u0089ZBîzhB!¥\u0005¸Kê\u0005\u0097\u0093\u0010\u0015ÓD\"\u0081Ì°Ê\u001d7Ð#;§\u000b{\u0010='\u008d1÷gª\u0018=÷Ô`$°c. \u0019V\u0000\u009c\t?|é\u008dV\u0080\u008b\u0019zi]<\u009b\u008b2Ý%S\u0005Q\u0084¸ÝØeÌ\u0004";
      int var7 = "\u0085%\u000f§oG\u0003\u0099æ\u0018C5Ðq?`\u0010\u0089ZBîzhB!¥\u0005¸Kê\u0005\u0097\u0093\u0010\u0015ÓD\"\u0081Ì°Ê\u001d7Ð#;§\u000b{\u0010='\u008d1÷gª\u0018=÷Ô`$°c. \u0019V\u0000\u009c\t?|é\u008dV\u0080\u008b\u0019zi]<\u009b\u008b2Ý%S\u0005Q\u0084¸ÝØeÌ\u0004"
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
                     CONST_C = var4;
                     CONST_D = new String[7];
                     CONST_A = new ModeSetting();
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

                  var6 = "íÖâÌ\u0093Ë\u0096£fN]´W0\u0099²'*o\u0005Â\f\u0015\u008c\u0010\u0001\u001eZt-ÒCÎ>\rým\u000e¥¨0";
                  var7 = "íÖâÌ\u0093Ë\u0096£fN]´W0\u0099²'*o\u0005Â\f\u0015\u008c\u0010\u0001\u001eZt-ÒCÎ>\rým\u000e¥¨0".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12520;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/cG", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }
}
