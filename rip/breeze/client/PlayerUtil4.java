package rip.breeze.client;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

final class PlayerUtil4 extends Util64<PlayerUtil8> {
   private static final String CONST_C;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public PlayerUtil8 getDataBuilder2(RotationUtil9 var1, int var2, short var3, int var4) throws IOException {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ 134253339518330L;
      long var7 = var5 ^ 123890130565594L;
      long var10001 = var5 ^ 6064026345318L;
      int var9 = (int)((var5 ^ 6064026345318L) >>> 48);
      int var10 = (int)((var5 ^ 6064026345318L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = var5 ^ 82214619406744L;
      long var14 = var5 ^ 106963633871526L;
      var10001 = var5 ^ 134253339518330L;
      int var16 = (int)((var5 ^ 134253339518330L) >>> 32);
      int var17 = (int)((var5 ^ 134253339518330L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var5 ^ 128628207299735L;
      long var21 = var5 ^ 54707960595565L;
      long var23 = var5 ^ 42705886346333L;
      var10001 = var5 ^ 83526775811337L;
      int var25 = (int)((var5 ^ 83526775811337L) >>> 32);
      int var26 = (int)((var5 ^ 83526775811337L) << 32 >>> 48);
      int var27 = (int)(var10001 << 48 >>> 48);
      long var28 = var5 ^ 115060121524418L;
      long var30 = var5 ^ 9942318588022L;
      long var32 = var5 ^ 21468406073785L;
      long var34 = var5 ^ 106924558774084L;
      long var36 = var5 ^ 86119816541532L;
      long var38 = var5 ^ 70515580602300L;
      long var40 = var5 ^ 47112220443858L;
      LicenseState[] var42 = HttpUtil4.values();

      label86: {
         label73: {
            label74: {
               try {
                  switch (Util108.CONST_A[var1.getEnum10Val(var14).ordinal()]) {
                     case 1:
                        break label86;
                     case 2:
                        return new Util138(var1.checkCondition_2(var34), var23);
                     case 3:
                        return new Util138(var7, var1.buildString_2((short)var9, (short)var10, var11));
                     case 4:
                        break label73;
                     case 5:
                        break;
                     case 6:
                        break label74;
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     default:
                        throw new IllegalArgumentException();
                  }
               } catch (IOException var46) {
                  throw getIOException(var46);
               }

               BreezeIterable var44 = new BreezeIterable();
               var1.calculate(var12);

               label48:
               while (true) {
                  BreezeIterable var47;
                  if (var1.checkCondition(var30)) {
                     var47 = var44;
                  } else {
                     var1.calculate_2(var28);
                     var47 = var44;
                     if (var3 > 0) {
                        return var44;
                     }
                  }

                  do {
                     var47.processNullable(var36, this.getDataBuilder2(var1, var16, (short)var17, var18));
                     if (var42 == null) {
                        continue label48;
                     }

                     var1.calculate_2(var28);
                     var47 = var44;
                  } while (var3 <= 0);

                  return var44;
               }
            }

            UserTheme var45 = new UserTheme();
            var1.processAll(var21);

            label37:
            while (true) {
               UserTheme var10000;
               if (var1.checkCondition(var30)) {
                  var10000 = var45;
               } else {
                  var1.calculate_3(var25, (char)var26, var27);
                  var10000 = var45;
                  if (var4 >= 0) {
                     return var45;
                  }
               }

               do {
                  var10000.processNullable(var1.buildString(var32), var38, this.getDataBuilder2(var1, var16, (short)var17, var18));
                  if (var42 == null) {
                     continue label37;
                  }

                  var1.calculate_3(var25, (char)var26, var27);
                  var10000 = var45;
               } while (var4 < 0);

               return var45;
            }
         }

         var1.calculate_7(var19);
         return Util40.CONST_A;
      }

      String var43 = var1.buildString_2((short)var9, (short)var10, var11);
      return new Util138(var40, new NumberConverter(var43));
   }

   public void processAll(long param1, Util135 param3, char param4, PlayerUtil8 param5) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: lload 1
      // 001: bipush 16
      // 003: lshl
      // 004: iload 4
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 48
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic rip/breeze/client/PlayerUtil4.134253339518330L J
      // 011: lxor
      // 012: lstore 6
      // 014: lload 6
      // 016: dup2
      // 017: ldc2_w 96379309912385
      // 01a: lxor
      // 01b: lstore 8
      // 01d: dup2
      // 01e: ldc2_w 54485646778315
      // 021: lxor
      // 022: dup2
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 10
      // 029: dup2
      // 02a: bipush 16
      // 02c: lshl
      // 02d: bipush 32
      // 02f: lushr
      // 030: l2i
      // 031: istore 11
      // 033: dup2
      // 034: bipush 48
      // 036: lshl
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 12
      // 03d: pop2
      // 03e: dup2
      // 03f: ldc2_w 83942802491512
      // 042: lxor
      // 043: lstore 13
      // 045: dup2
      // 046: ldc2_w 120619988429817
      // 049: lxor
      // 04a: lstore 15
      // 04c: dup2
      // 04d: ldc2_w 28730422482877
      // 050: lxor
      // 051: lstore 17
      // 053: dup2
      // 054: ldc2_w 13189616752599
      // 057: lxor
      // 058: lstore 19
      // 05a: dup2
      // 05b: ldc2_w 104428969088906
      // 05e: lxor
      // 05f: lstore 21
      // 061: dup2
      // 062: ldc2_w 2112520344755
      // 065: lxor
      // 066: lstore 23
      // 068: dup2
      // 069: ldc2_w 36330142455029
      // 06c: lxor
      // 06d: lstore 25
      // 06f: dup2
      // 070: ldc2_w 53302571214355
      // 073: lxor
      // 074: dup2
      // 075: bipush 48
      // 077: lushr
      // 078: l2i
      // 079: istore 27
      // 07b: dup2
      // 07c: bipush 16
      // 07e: lshl
      // 07f: bipush 16
      // 081: lushr
      // 082: lstore 28
      // 084: pop2
      // 085: dup2
      // 086: ldc2_w 134447879605577
      // 089: lxor
      // 08a: dup2
      // 08b: bipush 48
      // 08d: lushr
      // 08e: l2i
      // 08f: istore 30
      // 091: dup2
      // 092: bipush 16
      // 094: lshl
      // 095: bipush 32
      // 097: lushr
      // 098: l2i
      // 099: istore 31
      // 09b: dup2
      // 09c: bipush 48
      // 09e: lshl
      // 09f: bipush 48
      // 0a1: lushr
      // 0a2: l2i
      // 0a3: istore 32
      // 0a5: pop2
      // 0a6: dup2
      // 0a7: ldc2_w 77822540131938
      // 0aa: lxor
      // 0ab: lstore 33
      // 0ad: dup2
      // 0ae: ldc2_w 25662301421603
      // 0b1: lxor
      // 0b2: lstore 35
      // 0b4: dup2
      // 0b5: ldc2_w 58908193858562
      // 0b8: lxor
      // 0b9: dup2
      // 0ba: bipush 56
      // 0bc: lushr
      // 0bd: l2i
      // 0be: istore 37
      // 0c0: dup2
      // 0c1: bipush 8
      // 0c3: lshl
      // 0c4: bipush 32
      // 0c6: lushr
      // 0c7: l2i
      // 0c8: istore 38
      // 0ca: dup2
      // 0cb: bipush 40
      // 0cd: lshl
      // 0ce: bipush 40
      // 0d0: lushr
      // 0d1: l2i
      // 0d2: istore 39
      // 0d4: pop2
      // 0d5: dup2
      // 0d6: ldc2_w 15031729417866
      // 0d9: lxor
      // 0da: lstore 40
      // 0dc: dup2
      // 0dd: ldc2_w 134253339518330
      // 0e0: lxor
      // 0e1: dup2
      // 0e2: bipush 16
      // 0e4: lushr
      // 0e5: lstore 42
      // 0e7: dup2
      // 0e8: bipush 48
      // 0ea: lshl
      // 0eb: bipush 48
      // 0ed: lushr
      // 0ee: l2i
      // 0ef: istore 44
      // 0f1: pop2
      // 0f2: pop2
      // 0f3: invokestatic rip/breeze/client/HttpUtil4.values ()[Lrip/breeze/LicenseState;
      // 0f6: astore 45
      // 0f8: aload 5
      // 0fa: ifnull 111
      // 0fd: aload 5
      // 0ff: invokevirtual rip/breeze/client/PlayerUtil8.isValid_4 ()Z
      // 102: iload 4
      // 104: ifle 129
      // 107: ifeq 124
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 110: athrow
      // 111: aload 3
      // 112: lload 25
      // 114: invokevirtual rip/breeze/client/Util135.getDataBuilder19_9 (J)Lrip/breeze/client/Util135;
      // 117: pop
      // 118: aload 45
      // 11a: ifnull 2d0
      // 11d: goto 124
      // 120: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 123: athrow
      // 124: aload 5
      // 126: invokevirtual rip/breeze/client/PlayerUtil8.isValid_3 ()Z
      // 129: iload 4
      // 12b: ifle 1d5
      // 12e: ifeq 1d0
      // 131: goto 138
      // 134: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 137: athrow
      // 138: aload 5
      // 13a: iload 30
      // 13c: i2c
      // 13d: iload 31
      // 13f: iload 32
      // 141: i2c
      // 142: invokevirtual rip/breeze/client/PlayerUtil8.getDataBuilder3 (CIC)Lrip/breeze/client/Util138;
      // 145: astore 46
      // 147: aload 46
      // 149: invokevirtual rip/breeze/client/Util138.isValid_2 ()Z
      // 14c: lload 1
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: iflt 17f
      // 152: ifeq 174
      // 155: aload 3
      // 156: aload 46
      // 158: lload 13
      // 15a: invokevirtual rip/breeze/client/Util138.getNumber (J)Ljava/lang/Number;
      // 15d: lload 21
      // 15f: invokevirtual rip/breeze/client/Util135.getDataBuilder19_13 (Ljava/lang/Number;J)Lrip/breeze/client/Util135;
      // 162: pop
      // 163: aload 45
      // 165: iload 4
      // 167: iflt 1cd
      // 16a: ifnull 1cb
      // 16d: goto 174
      // 170: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 173: athrow
      // 174: lload 1
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 1c4
      // 17a: aload 46
      // 17c: invokevirtual rip/breeze/client/Util138.isValid ()Z
      // 17f: ifeq 1ab
      // 182: goto 189
      // 185: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 188: athrow
      // 189: aload 3
      // 18a: aload 46
      // 18c: lload 19
      // 18e: invokevirtual rip/breeze/client/Util138.checkCondition (J)Z
      // 191: lload 23
      // 193: dup2_x1
      // 194: pop2
      // 195: invokevirtual rip/breeze/client/Util135.getDataBuilder19_10 (JZ)Lrip/breeze/client/Util135;
      // 198: pop
      // 199: aload 45
      // 19b: lload 1
      // 19c: lconst_0
      // 19d: lcmp
      // 19e: iflt 1cd
      // 1a1: ifnull 1cb
      // 1a4: goto 1ab
      // 1a7: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 1aa: athrow
      // 1ab: aload 3
      // 1ac: aload 46
      // 1ae: iload 10
      // 1b0: i2c
      // 1b1: iload 11
      // 1b3: iload 12
      // 1b5: i2s
      // 1b6: invokevirtual rip/breeze/client/Util138.getString (CIS)Ljava/lang/String;
      // 1b9: iload 37
      // 1bb: i2b
      // 1bc: iload 38
      // 1be: iload 39
      // 1c0: invokevirtual rip/breeze/client/Util135.getDataBuilder19_8 (Ljava/lang/String;BII)Lrip/breeze/client/Util135;
      // 1c3: pop
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ca: athrow
      // 1cb: aload 45
      // 1cd: ifnull 2d0
      // 1d0: aload 5
      // 1d2: invokevirtual rip/breeze/client/PlayerUtil8.isValid ()Z
      // 1d5: iload 4
      // 1d7: ifle 234
      // 1da: ifeq 22f
      // 1dd: goto 1e4
      // 1e0: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e3: athrow
      // 1e4: aload 3
      // 1e5: lload 40
      // 1e7: invokevirtual rip/breeze/client/Util135.getDataBuilder19 (J)Lrip/breeze/client/Util135;
      // 1ea: pop
      // 1eb: aload 5
      // 1ed: lload 35
      // 1ef: invokevirtual rip/breeze/client/PlayerUtil8.getBreezeIterable (J)Lrip/breeze/client/BreezeIterable;
      // 1f2: invokevirtual rip/breeze/client/BreezeIterable.iterator ()Ljava/util/Iterator;
      // 1f5: astore 46
      // 1f7: aload 46
      // 1f9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1fe: ifeq 21e
      // 201: aload 46
      // 203: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 208: checkcast rip/breeze/client/PlayerUtil8
      // 20b: astore 47
      // 20d: aload 0
      // 20e: lload 42
      // 210: aload 3
      // 211: iload 44
      // 213: i2c
      // 214: aload 47
      // 216: invokevirtual rip/breeze/client/PlayerUtil4.processAll (JLrip/breeze/client/Util135;CLrip/breeze/client/PlayerUtil8;)V
      // 219: aload 45
      // 21b: ifnull 1f7
      // 21e: aload 3
      // 21f: lload 33
      // 221: invokevirtual rip/breeze/client/Util135.getDataBuilder19_2 (J)Lrip/breeze/client/Util135;
      // 224: pop
      // 225: aload 45
      // 227: iload 4
      // 229: iflt 208
      // 22c: ifnull 2d0
      // 22f: aload 5
      // 231: invokevirtual rip/breeze/client/PlayerUtil8.isValid_2 ()Z
      // 234: ifeq 2ac
      // 237: goto 23e
      // 23a: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 23d: athrow
      // 23e: aload 3
      // 23f: iload 27
      // 241: i2c
      // 242: lload 28
      // 244: invokevirtual rip/breeze/client/Util135.getDataBuilder19_3 (CJ)Lrip/breeze/client/Util135;
      // 247: pop
      // 248: aload 5
      // 24a: lload 17
      // 24c: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 24f: invokevirtual rip/breeze/client/UserTheme.getColors ()Ljava/util/Set;
      // 252: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 257: astore 46
      // 259: aload 46
      // 25b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 260: ifeq 29a
      // 263: aload 46
      // 265: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26a: checkcast java/util/Map$Entry
      // 26d: astore 47
      // 26f: aload 3
      // 270: aload 47
      // 272: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 277: checkcast java/lang/String
      // 27a: lload 8
      // 27c: invokevirtual rip/breeze/client/Util135.getDataBuilder19_7 (Ljava/lang/String;J)Lrip/breeze/client/Util135;
      // 27f: pop
      // 280: aload 0
      // 281: lload 42
      // 283: aload 3
      // 284: aload 47
      // 286: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 28b: iload 44
      // 28d: i2c
      // 28e: swap
      // 28f: checkcast rip/breeze/client/PlayerUtil8
      // 292: invokevirtual rip/breeze/client/PlayerUtil4.processAll (JLrip/breeze/client/Util135;CLrip/breeze/client/PlayerUtil8;)V
      // 295: aload 45
      // 297: ifnull 259
      // 29a: aload 3
      // 29b: lload 15
      // 29d: invokevirtual rip/breeze/client/Util135.getDataBuilder19_4 (J)Lrip/breeze/client/Util135;
      // 2a0: pop
      // 2a1: aload 45
      // 2a3: lload 1
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: ifle 26a
      // 2a9: ifnull 2d0
      // 2ac: new java/lang/IllegalArgumentException
      // 2af: dup
      // 2b0: new java/lang/StringBuilder
      // 2b3: dup
      // 2b4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b7: getstatic rip/breeze/client/PlayerUtil4.CONST_C Ljava/lang/String;
      // 2ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bd: aload 5
      // 2bf: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2c5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c8: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 2cb: athrow
      // 2cc: invokestatic rip/breeze/client/PlayerUtil4.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 2cf: athrow
      // 2d0: return
      // try (160 -> 167): 168 java/io/IOException
      // try (162 -> 176): 177 java/io/IOException
      // try (170 -> 184): 185 java/io/IOException
      // try (195 -> 213): 214 java/io/IOException
      // try (202 -> 223): 224 java/io/IOException
      // try (216 -> 241): 242 java/io/IOException
      // try (226 -> 258): 259 java/io/IOException
      // try (261 -> 268): 269 java/io/IOException
      // try (296 -> 307): 308 java/io/IOException
      // try (348 -> 371): 371 java/io/IOException
   }

   static {
      long var0 = 80408067427232L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("øa6Ê\u008dS\u0081/ÞÛGqI\u008b\u0093#".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
   }

   private static IOException getIOException(IOException var0) {
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
}
