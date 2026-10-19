package rip.breeze.inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ԥ<V extends ԏ> implements IFunctional {
   private final ԟ<V> ԟ_þ_2;
   private թ թ_ý_2;
   private int int_ê_2;
   private List<ա>[] arr_é_2;
   private ԡ<V>[] arr_æ_2;
   private ԑ[] arr_ϯ_2;
   private boolean[] arr_ϭ_2;
   private int[] arr_ϫ_2;
   private int int_ϩ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public ԥ(ԟ<V> var1) {
      this.ԟ_þ_2 = var1;
   }

   public ԡ[] invoke_1(Object[] param1) throws ÿ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/inject/BreezeClass12
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 97197349694677
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 70770770085622
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 30787484676529
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 58491712046772
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 10877315324494
      // 043: lxor
      // 044: lstore 14
      // 046: dup2
      // 047: ldc2_w 125047159805681
      // 04a: lxor
      // 04b: dup2
      // 04c: bipush 48
      // 04e: lushr
      // 04f: l2i
      // 050: istore 16
      // 052: dup2
      // 053: bipush 16
      // 055: lshl
      // 056: bipush 32
      // 058: lushr
      // 059: l2i
      // 05a: istore 17
      // 05c: dup2
      // 05d: bipush 48
      // 05f: lshl
      // 060: bipush 48
      // 062: lushr
      // 063: l2i
      // 064: istore 18
      // 066: pop2
      // 067: dup2
      // 068: ldc2_w 111374301947398
      // 06b: lxor
      // 06c: lstore 19
      // 06e: dup2
      // 06f: ldc2_w 14731793692184
      // 072: lxor
      // 073: lstore 21
      // 075: dup2
      // 076: ldc2_w 60262637962452
      // 079: lxor
      // 07a: lstore 23
      // 07c: dup2
      // 07d: ldc2_w 95878748863036
      // 080: lxor
      // 081: lstore 25
      // 083: dup2
      // 084: ldc2_w 49414070725714
      // 087: lxor
      // 088: lstore 27
      // 08a: dup2
      // 08b: ldc2_w 48461056944238
      // 08e: lxor
      // 08f: lstore 29
      // 091: dup2
      // 092: ldc2_w 5583440846684
      // 095: lxor
      // 096: lstore 31
      // 098: dup2
      // 099: ldc2_w 60744463330031
      // 09c: lxor
      // 09d: lstore 33
      // 09f: dup2
      // 0a0: ldc2_w 97892747538014
      // 0a3: lxor
      // 0a4: lstore 35
      // 0a6: pop2
      // 0a7: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 0aa: astore 37
      // 0ac: aload 5
      // 0ae: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0b1: sipush 1280
      // 0b4: iand
      // 0b5: aload 37
      // 0b7: ifnonnull 128
      // 0ba: ifeq 0d5
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: bipush 0
      // 0c6: anewarray 105
      // 0c9: putfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 0cc: aload 0
      // 0cd: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 0d0: areturn
      // 0d1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: aload 5
      // 0d8: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 0db: putfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 0e3: bipush 0
      // 0e4: anewarray 5
      // 0e7: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 0ea: putfield rip/breeze/inject/ԥ.int_ê_2 I
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 0f2: anewarray 122
      // 0f5: putfield rip/breeze/inject/ԥ.arr_é_2 [Ljava/util/List;
      // 0f8: aload 0
      // 0f9: aload 0
      // 0fa: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 0fd: anewarray 105
      // 100: putfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 103: aload 0
      // 104: aload 0
      // 105: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 108: anewarray 126
      // 10b: putfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 10e: aload 0
      // 10f: aload 0
      // 110: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 113: newarray 4
      // 115: putfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 118: aload 0
      // 119: aload 0
      // 11a: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 11d: newarray 10
      // 11f: putfield rip/breeze/inject/ԥ.arr_ϫ_2 [I
      // 122: aload 0
      // 123: bipush 0
      // 124: putfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 127: bipush 0
      // 128: istore 38
      // 12a: iload 38
      // 12c: aload 5
      // 12e: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 131: invokeinterface java/util/List.size ()I 1
      // 136: if_icmpge 1f5
      // 139: aload 5
      // 13b: getfield rip/breeze/inject/BreezeClass12.list_é Ljava/util/List;
      // 13e: iload 38
      // 140: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 145: checkcast rip/breeze/inject/ա
      // 148: astore 39
      // 14a: aload 0
      // 14b: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 14e: aload 39
      // 150: getfield rip/breeze/inject/ա.ճ_ÿ_2 Lrip/breeze/inject/ճ;
      // 153: lload 29
      // 155: bipush 2
      // 156: anewarray 5
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 1
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: bipush 0
      // 165: swap
      // 166: aastore
      // 167: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 16a: istore 40
      // 16c: aload 0
      // 16d: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 170: aload 39
      // 172: getfield rip/breeze/inject/ա.ճ_þ_2 Lrip/breeze/inject/ճ;
      // 175: lload 29
      // 177: bipush 2
      // 178: anewarray 5
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 18c: istore 41
      // 18e: aload 37
      // 190: ifnonnull 21b
      // 193: iload 40
      // 195: istore 42
      // 197: iload 42
      // 199: iload 41
      // 19b: if_icmpge 1e7
      // 19e: aload 0
      // 19f: getfield rip/breeze/inject/ԥ.arr_é_2 [Ljava/util/List;
      // 1a2: iload 42
      // 1a4: aaload
      // 1a5: astore 43
      // 1a7: aload 43
      // 1a9: aload 37
      // 1ab: ifnonnull 145
      // 1ae: aload 37
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 1ab
      // 1b6: ifnonnull 1d7
      // 1b9: ifnonnull 1d5
      // 1bc: goto 1c3
      // 1bf: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: new java/util/ArrayList
      // 1c6: dup
      // 1c7: invokespecial java/util/ArrayList.<init> ()V
      // 1ca: astore 43
      // 1cc: aload 0
      // 1cd: getfield rip/breeze/inject/ԥ.arr_é_2 [Ljava/util/List;
      // 1d0: iload 42
      // 1d2: aload 43
      // 1d4: aastore
      // 1d5: aload 43
      // 1d7: aload 39
      // 1d9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1de: pop
      // 1df: iinc 42 1
      // 1e2: aload 37
      // 1e4: ifnull 197
      // 1e7: iinc 38 1
      // 1ea: aload 37
      // 1ec: lload 2
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: iflt 190
      // 1f2: ifnull 12a
      // 1f5: aload 0
      // 1f6: aload 5
      // 1f8: getfield rip/breeze/inject/BreezeClass12.int_ç I
      // 1fb: lload 6
      // 1fd: bipush 2
      // 1fe: anewarray 5
      // 201: dup_x2
      // 202: dup_x2
      // 203: pop
      // 204: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 207: bipush 1
      // 208: swap
      // 209: aastore
      // 20a: dup_x1
      // 20b: swap
      // 20c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: invokevirtual rip/breeze/inject/ԥ.method_008 ([Ljava/lang/Object;)V
      // 215: lload 2
      // 216: lconst_0
      // 217: lcmp
      // 218: iflt 21b
      // 21b: aload 0
      // 21c: aload 4
      // 21e: aload 5
      // 220: lload 19
      // 222: bipush 3
      // 223: anewarray 5
      // 226: dup_x2
      // 227: dup_x2
      // 228: pop
      // 229: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22c: bipush 2
      // 22d: swap
      // 22e: aastore
      // 22f: dup_x1
      // 230: swap
      // 231: bipush 1
      // 232: swap
      // 233: aastore
      // 234: dup_x1
      // 235: swap
      // 236: bipush 0
      // 237: swap
      // 238: aastore
      // 239: invokevirtual rip/breeze/inject/ԥ.method_010 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 23c: astore 38
      // 23e: aload 0
      // 23f: lload 31
      // 241: bipush 0
      // 242: aload 38
      // 244: aconst_null
      // 245: bipush 4
      // 246: anewarray 5
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 3
      // 24c: swap
      // 24d: aastore
      // 24e: dup_x1
      // 24f: swap
      // 250: bipush 2
      // 251: swap
      // 252: aastore
      // 253: dup_x1
      // 254: swap
      // 255: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 258: bipush 1
      // 259: swap
      // 25a: aastore
      // 25b: dup_x2
      // 25c: dup_x2
      // 25d: pop
      // 25e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 267: aload 0
      // 268: aload 4
      // 26a: aload 5
      // 26c: bipush 2
      // 26d: anewarray 5
      // 270: dup_x1
      // 271: swap
      // 272: bipush 1
      // 273: swap
      // 274: aastore
      // 275: dup_x1
      // 276: swap
      // 277: bipush 0
      // 278: swap
      // 279: aastore
      // 27a: invokevirtual rip/breeze/inject/ԥ.method_013 ([Ljava/lang/Object;)V
      // 27d: goto 2dc
      // 280: astore 39
      // 282: new rip/breeze/inject/ÿ
      // 285: dup
      // 286: aload 0
      // 287: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 28a: bipush 0
      // 28b: lload 33
      // 28d: bipush 2
      // 28e: anewarray 5
      // 291: dup_x2
      // 292: dup_x2
      // 293: pop
      // 294: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 297: bipush 1
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29f: bipush 0
      // 2a0: swap
      // 2a1: aastore
      // 2a2: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 2a5: aload 39
      // 2a7: invokevirtual java/lang/RuntimeException.getMessage ()Ljava/lang/String;
      // 2aa: iload 16
      // 2ac: i2c
      // 2ad: iload 17
      // 2af: iload 18
      // 2b1: i2s
      // 2b2: bipush 4
      // 2b3: anewarray 5
      // 2b6: dup_x1
      // 2b7: swap
      // 2b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2bb: bipush 3
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x1
      // 2bf: swap
      // 2c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2c3: bipush 2
      // 2c4: swap
      // 2c5: aastore
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2cb: bipush 1
      // 2cc: swap
      // 2cd: aastore
      // 2ce: dup_x1
      // 2cf: swap
      // 2d0: bipush 0
      // 2d1: swap
      // 2d2: aastore
      // 2d3: invokestatic rip/breeze/inject/ԥ.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2d6: aload 39
      // 2d8: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2db: athrow
      // 2dc: aload 0
      // 2dd: getfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 2e0: ifle e70
      // 2e3: aload 0
      // 2e4: getfield rip/breeze/inject/ԥ.arr_ϫ_2 [I
      // 2e7: aload 0
      // 2e8: dup
      // 2e9: getfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 2ec: bipush 1
      // 2ed: isub
      // 2ee: dup_x1
      // 2ef: putfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 2f2: iaload
      // 2f3: istore 39
      // 2f5: aload 0
      // 2f6: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 2f9: iload 39
      // 2fb: aaload
      // 2fc: astore 40
      // 2fe: aload 0
      // 2ff: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 302: iload 39
      // 304: aaload
      // 305: astore 41
      // 307: aload 0
      // 308: aload 37
      // 30a: ifnonnull e71
      // 30d: getfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 310: iload 39
      // 312: bipush 0
      // 313: bastore
      // 314: aconst_null
      // 315: astore 42
      // 317: aload 5
      // 319: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 31c: iload 39
      // 31e: lload 33
      // 320: bipush 2
      // 321: anewarray 5
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 1
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x1
      // 32e: swap
      // 32f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 332: bipush 0
      // 333: swap
      // 334: aastore
      // 335: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 338: astore 42
      // 33a: aload 42
      // 33c: bipush 0
      // 33d: anewarray 5
      // 340: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 343: istore 43
      // 345: aload 42
      // 347: bipush 0
      // 348: anewarray 5
      // 34b: invokevirtual rip/breeze/inject/ջ.method_001 ([Ljava/lang/Object;)I
      // 34e: istore 44
      // 350: aload 37
      // 352: lload 2
      // 353: lconst_0
      // 354: lcmp
      // 355: iflt 40f
      // 358: ifnonnull 407
      // 35b: iload 44
      // 35d: bipush 8
      // 35f: if_icmpeq 397
      // 362: goto 369
      // 365: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: iload 44
      // 36b: bipush 15
      // 36d: lload 2
      // 36e: lconst_0
      // 36f: lcmp
      // 370: iflt 394
      // 373: aload 37
      // 375: ifnonnull 394
      // 378: goto 37f
      // 37b: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: if_icmpeq 397
      // 382: goto 389
      // 385: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: iload 44
      // 38b: bipush 14
      // 38d: goto 394
      // 390: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 393: athrow
      // 394: if_icmpne 412
      // 397: aload 38
      // 399: aload 40
      // 39b: lload 35
      // 39d: bipush 2
      // 39e: anewarray 5
      // 3a1: dup_x2
      // 3a2: dup_x2
      // 3a3: pop
      // 3a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a7: bipush 1
      // 3a8: swap
      // 3a9: aastore
      // 3aa: dup_x1
      // 3ab: swap
      // 3ac: bipush 0
      // 3ad: swap
      // 3ae: aastore
      // 3af: invokevirtual rip/breeze/inject/ԡ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 3b2: pop
      // 3b3: aload 0
      // 3b4: iload 39
      // 3b6: bipush 1
      // 3b7: iadd
      // 3b8: lload 31
      // 3ba: dup2_x1
      // 3bb: pop2
      // 3bc: aload 40
      // 3be: aload 41
      // 3c0: bipush 4
      // 3c1: anewarray 5
      // 3c4: dup_x1
      // 3c5: swap
      // 3c6: bipush 3
      // 3c7: swap
      // 3c8: aastore
      // 3c9: dup_x1
      // 3ca: swap
      // 3cb: bipush 2
      // 3cc: swap
      // 3cd: aastore
      // 3ce: dup_x1
      // 3cf: swap
      // 3d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d3: bipush 1
      // 3d4: swap
      // 3d5: aastore
      // 3d6: dup_x2
      // 3d7: dup_x2
      // 3d8: pop
      // 3d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dc: bipush 0
      // 3dd: swap
      // 3de: aastore
      // 3df: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 3e2: aload 0
      // 3e3: iload 39
      // 3e5: iload 39
      // 3e7: bipush 1
      // 3e8: iadd
      // 3e9: bipush 2
      // 3ea: anewarray 5
      // 3ed: dup_x1
      // 3ee: swap
      // 3ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f2: bipush 1
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x1
      // 3f6: swap
      // 3f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3fa: bipush 0
      // 3fb: swap
      // 3fc: aastore
      // 3fd: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 400: goto 407
      // 403: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 406: athrow
      // 407: lload 2
      // 408: lconst_0
      // 409: lcmp
      // 40a: ifle 451
      // 40d: aload 37
      // 40f: ifnull be2
      // 412: aload 38
      // 414: aload 40
      // 416: lload 35
      // 418: bipush 2
      // 419: anewarray 5
      // 41c: dup_x2
      // 41d: dup_x2
      // 41e: pop
      // 41f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 422: bipush 1
      // 423: swap
      // 424: aastore
      // 425: dup_x1
      // 426: swap
      // 427: bipush 0
      // 428: swap
      // 429: aastore
      // 42a: invokevirtual rip/breeze/inject/ԡ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 42d: aload 42
      // 42f: aload 0
      // 430: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 433: lload 25
      // 435: dup2_x1
      // 436: pop2
      // 437: bipush 3
      // 438: anewarray 5
      // 43b: dup_x1
      // 43c: swap
      // 43d: bipush 2
      // 43e: swap
      // 43f: aastore
      // 440: dup_x2
      // 441: dup_x2
      // 442: pop
      // 443: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 446: bipush 1
      // 447: swap
      // 448: aastore
      // 449: dup_x1
      // 44a: swap
      // 44b: bipush 0
      // 44c: swap
      // 44d: aastore
      // 44e: invokevirtual rip/breeze/inject/ԡ.method_016 ([Ljava/lang/Object;)V
      // 451: aload 41
      // 453: ifnonnull 465
      // 456: goto 45d
      // 459: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45c: athrow
      // 45d: aconst_null
      // 45e: goto 46e
      // 461: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 464: athrow
      // 465: new rip/breeze/inject/ԑ
      // 468: dup
      // 469: aload 41
      // 46b: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ԑ;)V
      // 46e: astore 41
      // 470: aload 42
      // 472: instanceof rip/breeze/inject/մ
      // 475: aload 37
      // 477: lload 2
      // 478: lconst_0
      // 479: lcmp
      // 47a: ifle 635
      // 47d: ifnonnull 633
      // 480: ifeq 627
      // 483: goto 48a
      // 486: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 489: athrow
      // 48a: aload 42
      // 48c: checkcast rip/breeze/inject/մ
      // 48f: astore 45
      // 491: iload 43
      // 493: aload 37
      // 495: ifnonnull 54d
      // 498: sipush 167
      // 49b: if_icmpeq 52d
      // 49e: goto 4a5
      // 4a1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a4: athrow
      // 4a5: iload 43
      // 4a7: aload 37
      // 4a9: ifnonnull 54d
      // 4ac: goto 4b3
      // 4af: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b2: athrow
      // 4b3: sipush 168
      // 4b6: if_icmpeq 52d
      // 4b9: goto 4c0
      // 4bc: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bf: athrow
      // 4c0: aload 38
      // 4c2: iload 43
      // 4c4: aconst_null
      // 4c5: bipush 2
      // 4c6: anewarray 5
      // 4c9: dup_x1
      // 4ca: swap
      // 4cb: bipush 1
      // 4cc: swap
      // 4cd: aastore
      // 4ce: dup_x1
      // 4cf: swap
      // 4d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d3: bipush 0
      // 4d4: swap
      // 4d5: aastore
      // 4d6: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 4d9: aload 0
      // 4da: iload 39
      // 4dc: bipush 1
      // 4dd: iadd
      // 4de: lload 31
      // 4e0: dup2_x1
      // 4e1: pop2
      // 4e2: aload 38
      // 4e4: aload 41
      // 4e6: bipush 4
      // 4e7: anewarray 5
      // 4ea: dup_x1
      // 4eb: swap
      // 4ec: bipush 3
      // 4ed: swap
      // 4ee: aastore
      // 4ef: dup_x1
      // 4f0: swap
      // 4f1: bipush 2
      // 4f2: swap
      // 4f3: aastore
      // 4f4: dup_x1
      // 4f5: swap
      // 4f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4f9: bipush 1
      // 4fa: swap
      // 4fb: aastore
      // 4fc: dup_x2
      // 4fd: dup_x2
      // 4fe: pop
      // 4ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 502: bipush 0
      // 503: swap
      // 504: aastore
      // 505: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 508: aload 0
      // 509: iload 39
      // 50b: iload 39
      // 50d: bipush 1
      // 50e: iadd
      // 50f: bipush 2
      // 510: anewarray 5
      // 513: dup_x1
      // 514: swap
      // 515: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 518: bipush 1
      // 519: swap
      // 51a: aastore
      // 51b: dup_x1
      // 51c: swap
      // 51d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 520: bipush 0
      // 521: swap
      // 522: aastore
      // 523: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 526: goto 52d
      // 529: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52c: athrow
      // 52d: aload 0
      // 52e: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 531: aload 45
      // 533: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 536: lload 29
      // 538: bipush 2
      // 539: anewarray 5
      // 53c: dup_x2
      // 53d: dup_x2
      // 53e: pop
      // 53f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 542: bipush 1
      // 543: swap
      // 544: aastore
      // 545: dup_x1
      // 546: swap
      // 547: bipush 0
      // 548: swap
      // 549: aastore
      // 54a: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 54d: istore 46
      // 54f: aload 38
      // 551: iload 43
      // 553: aload 45
      // 555: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 558: bipush 2
      // 559: anewarray 5
      // 55c: dup_x1
      // 55d: swap
      // 55e: bipush 1
      // 55f: swap
      // 560: aastore
      // 561: dup_x1
      // 562: swap
      // 563: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 566: bipush 0
      // 567: swap
      // 568: aastore
      // 569: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 56c: aload 37
      // 56e: lload 2
      // 56f: lconst_0
      // 570: lcmp
      // 571: iflt 5cb
      // 574: ifnonnull 5c9
      // 577: iload 43
      // 579: sipush 168
      // 57c: if_icmpne 5d4
      // 57f: goto 586
      // 582: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 585: athrow
      // 586: aload 0
      // 587: lload 31
      // 589: iload 46
      // 58b: aload 38
      // 58d: new rip/breeze/inject/ԑ
      // 590: dup
      // 591: aload 45
      // 593: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 596: aload 5
      // 598: getfield rip/breeze/inject/BreezeClass12.int_ç I
      // 59b: aload 45
      // 59d: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ճ;ILrip/breeze/inject/մ;)V
      // 5a0: bipush 4
      // 5a1: anewarray 5
      // 5a4: dup_x1
      // 5a5: swap
      // 5a6: bipush 3
      // 5a7: swap
      // 5a8: aastore
      // 5a9: dup_x1
      // 5aa: swap
      // 5ab: bipush 2
      // 5ac: swap
      // 5ad: aastore
      // 5ae: dup_x1
      // 5af: swap
      // 5b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b3: bipush 1
      // 5b4: swap
      // 5b5: aastore
      // 5b6: dup_x2
      // 5b7: dup_x2
      // 5b8: pop
      // 5b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5bc: bipush 0
      // 5bd: swap
      // 5be: aastore
      // 5bf: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 5c2: goto 5c9
      // 5c5: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c8: athrow
      // 5c9: aload 37
      // 5cb: lload 2
      // 5cc: lconst_0
      // 5cd: lcmp
      // 5ce: iflt 624
      // 5d1: ifnull 606
      // 5d4: aload 0
      // 5d5: lload 31
      // 5d7: iload 46
      // 5d9: aload 38
      // 5db: aload 41
      // 5dd: bipush 4
      // 5de: anewarray 5
      // 5e1: dup_x1
      // 5e2: swap
      // 5e3: bipush 3
      // 5e4: swap
      // 5e5: aastore
      // 5e6: dup_x1
      // 5e7: swap
      // 5e8: bipush 2
      // 5e9: swap
      // 5ea: aastore
      // 5eb: dup_x1
      // 5ec: swap
      // 5ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f0: bipush 1
      // 5f1: swap
      // 5f2: aastore
      // 5f3: dup_x2
      // 5f4: dup_x2
      // 5f5: pop
      // 5f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f9: bipush 0
      // 5fa: swap
      // 5fb: aastore
      // 5fc: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 5ff: goto 606
      // 602: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 605: athrow
      // 606: aload 0
      // 607: iload 39
      // 609: iload 46
      // 60b: bipush 2
      // 60c: anewarray 5
      // 60f: dup_x1
      // 610: swap
      // 611: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 614: bipush 1
      // 615: swap
      // 616: aastore
      // 617: dup_x1
      // 618: swap
      // 619: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 61c: bipush 0
      // 61d: swap
      // 61e: aastore
      // 61f: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 622: aload 37
      // 624: ifnull be2
      // 627: aload 42
      // 629: instanceof rip/breeze/inject/հ
      // 62c: goto 633
      // 62f: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 632: athrow
      // 633: aload 37
      // 635: lload 2
      // 636: lconst_0
      // 637: lcmp
      // 638: iflt 7b1
      // 63b: ifnonnull 7a9
      // 63e: ifeq 79d
      // 641: goto 648
      // 644: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 647: athrow
      // 648: aload 42
      // 64a: checkcast rip/breeze/inject/հ
      // 64d: astore 45
      // 64f: aload 0
      // 650: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 653: aload 45
      // 655: getfield rip/breeze/inject/հ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 658: lload 29
      // 65a: bipush 2
      // 65b: anewarray 5
      // 65e: dup_x2
      // 65f: dup_x2
      // 660: pop
      // 661: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 664: bipush 1
      // 665: swap
      // 666: aastore
      // 667: dup_x1
      // 668: swap
      // 669: bipush 0
      // 66a: swap
      // 66b: aastore
      // 66c: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 66f: istore 46
      // 671: aload 38
      // 673: iload 43
      // 675: aload 45
      // 677: getfield rip/breeze/inject/հ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 67a: bipush 2
      // 67b: anewarray 5
      // 67e: dup_x1
      // 67f: swap
      // 680: bipush 1
      // 681: swap
      // 682: aastore
      // 683: dup_x1
      // 684: swap
      // 685: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 688: bipush 0
      // 689: swap
      // 68a: aastore
      // 68b: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 68e: aload 0
      // 68f: lload 31
      // 691: iload 46
      // 693: aload 38
      // 695: aload 41
      // 697: bipush 4
      // 698: anewarray 5
      // 69b: dup_x1
      // 69c: swap
      // 69d: bipush 3
      // 69e: swap
      // 69f: aastore
      // 6a0: dup_x1
      // 6a1: swap
      // 6a2: bipush 2
      // 6a3: swap
      // 6a4: aastore
      // 6a5: dup_x1
      // 6a6: swap
      // 6a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6aa: bipush 1
      // 6ab: swap
      // 6ac: aastore
      // 6ad: dup_x2
      // 6ae: dup_x2
      // 6af: pop
      // 6b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6b3: bipush 0
      // 6b4: swap
      // 6b5: aastore
      // 6b6: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 6b9: aload 0
      // 6ba: iload 39
      // 6bc: iload 46
      // 6be: bipush 2
      // 6bf: anewarray 5
      // 6c2: dup_x1
      // 6c3: swap
      // 6c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c7: bipush 1
      // 6c8: swap
      // 6c9: aastore
      // 6ca: dup_x1
      // 6cb: swap
      // 6cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6cf: bipush 0
      // 6d0: swap
      // 6d1: aastore
      // 6d2: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 6d5: bipush 0
      // 6d6: istore 47
      // 6d8: iload 47
      // 6da: aload 45
      // 6dc: getfield rip/breeze/inject/հ.list_å_2 Ljava/util/List;
      // 6df: invokeinterface java/util/List.size ()I 1
      // 6e4: if_icmpge 798
      // 6e7: aload 45
      // 6e9: getfield rip/breeze/inject/հ.list_å_2 Ljava/util/List;
      // 6ec: iload 47
      // 6ee: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6f3: checkcast rip/breeze/inject/ճ
      // 6f6: astore 48
      // 6f8: aload 0
      // 6f9: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 6fc: aload 48
      // 6fe: lload 29
      // 700: bipush 2
      // 701: anewarray 5
      // 704: dup_x2
      // 705: dup_x2
      // 706: pop
      // 707: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70a: bipush 1
      // 70b: swap
      // 70c: aastore
      // 70d: dup_x1
      // 70e: swap
      // 70f: bipush 0
      // 710: swap
      // 711: aastore
      // 712: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 715: istore 46
      // 717: aload 38
      // 719: iload 43
      // 71b: aload 48
      // 71d: bipush 2
      // 71e: anewarray 5
      // 721: dup_x1
      // 722: swap
      // 723: bipush 1
      // 724: swap
      // 725: aastore
      // 726: dup_x1
      // 727: swap
      // 728: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 72b: bipush 0
      // 72c: swap
      // 72d: aastore
      // 72e: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 731: aload 0
      // 732: lload 31
      // 734: iload 46
      // 736: aload 38
      // 738: aload 41
      // 73a: bipush 4
      // 73b: anewarray 5
      // 73e: dup_x1
      // 73f: swap
      // 740: bipush 3
      // 741: swap
      // 742: aastore
      // 743: dup_x1
      // 744: swap
      // 745: bipush 2
      // 746: swap
      // 747: aastore
      // 748: dup_x1
      // 749: swap
      // 74a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 74d: bipush 1
      // 74e: swap
      // 74f: aastore
      // 750: dup_x2
      // 751: dup_x2
      // 752: pop
      // 753: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 756: bipush 0
      // 757: swap
      // 758: aastore
      // 759: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 75c: aload 0
      // 75d: iload 39
      // 75f: iload 46
      // 761: bipush 2
      // 762: anewarray 5
      // 765: dup_x1
      // 766: swap
      // 767: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 76a: bipush 1
      // 76b: swap
      // 76c: aastore
      // 76d: dup_x1
      // 76e: swap
      // 76f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 772: bipush 0
      // 773: swap
      // 774: aastore
      // 775: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 778: iinc 47 1
      // 77b: aload 37
      // 77d: lload 2
      // 77e: lconst_0
      // 77f: lcmp
      // 780: ifle 788
      // 783: ifnonnull be2
      // 786: aload 37
      // 788: ifnull 6d8
      // 78b: lload 2
      // 78c: lconst_0
      // 78d: lcmp
      // 78e: ifle 77b
      // 791: goto 798
      // 794: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 797: athrow
      // 798: aload 37
      // 79a: ifnull be2
      // 79d: aload 42
      // 79f: instanceof rip/breeze/inject/խ
      // 7a2: goto 7a9
      // 7a5: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a8: athrow
      // 7a9: lload 2
      // 7aa: lconst_0
      // 7ab: lcmp
      // 7ac: iflt 91c
      // 7af: aload 37
      // 7b1: ifnonnull 91c
      // 7b4: ifeq 913
      // 7b7: goto 7be
      // 7ba: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7bd: athrow
      // 7be: aload 42
      // 7c0: checkcast rip/breeze/inject/խ
      // 7c3: astore 45
      // 7c5: aload 0
      // 7c6: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 7c9: aload 45
      // 7cb: getfield rip/breeze/inject/խ.ճ_å_2 Lrip/breeze/inject/ճ;
      // 7ce: lload 29
      // 7d0: bipush 2
      // 7d1: anewarray 5
      // 7d4: dup_x2
      // 7d5: dup_x2
      // 7d6: pop
      // 7d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7da: bipush 1
      // 7db: swap
      // 7dc: aastore
      // 7dd: dup_x1
      // 7de: swap
      // 7df: bipush 0
      // 7e0: swap
      // 7e1: aastore
      // 7e2: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 7e5: istore 46
      // 7e7: aload 38
      // 7e9: iload 43
      // 7eb: aload 45
      // 7ed: getfield rip/breeze/inject/խ.ճ_å_2 Lrip/breeze/inject/ճ;
      // 7f0: bipush 2
      // 7f1: anewarray 5
      // 7f4: dup_x1
      // 7f5: swap
      // 7f6: bipush 1
      // 7f7: swap
      // 7f8: aastore
      // 7f9: dup_x1
      // 7fa: swap
      // 7fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7fe: bipush 0
      // 7ff: swap
      // 800: aastore
      // 801: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 804: aload 0
      // 805: lload 31
      // 807: iload 46
      // 809: aload 38
      // 80b: aload 41
      // 80d: bipush 4
      // 80e: anewarray 5
      // 811: dup_x1
      // 812: swap
      // 813: bipush 3
      // 814: swap
      // 815: aastore
      // 816: dup_x1
      // 817: swap
      // 818: bipush 2
      // 819: swap
      // 81a: aastore
      // 81b: dup_x1
      // 81c: swap
      // 81d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 820: bipush 1
      // 821: swap
      // 822: aastore
      // 823: dup_x2
      // 824: dup_x2
      // 825: pop
      // 826: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 829: bipush 0
      // 82a: swap
      // 82b: aastore
      // 82c: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 82f: aload 0
      // 830: iload 39
      // 832: iload 46
      // 834: bipush 2
      // 835: anewarray 5
      // 838: dup_x1
      // 839: swap
      // 83a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 83d: bipush 1
      // 83e: swap
      // 83f: aastore
      // 840: dup_x1
      // 841: swap
      // 842: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 845: bipush 0
      // 846: swap
      // 847: aastore
      // 848: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 84b: bipush 0
      // 84c: istore 47
      // 84e: iload 47
      // 850: aload 45
      // 852: getfield rip/breeze/inject/խ.list_ä_2 Ljava/util/List;
      // 855: invokeinterface java/util/List.size ()I 1
      // 85a: if_icmpge 90e
      // 85d: aload 45
      // 85f: getfield rip/breeze/inject/խ.list_ä_2 Ljava/util/List;
      // 862: iload 47
      // 864: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 869: checkcast rip/breeze/inject/ճ
      // 86c: astore 48
      // 86e: aload 38
      // 870: iload 43
      // 872: aload 48
      // 874: bipush 2
      // 875: anewarray 5
      // 878: dup_x1
      // 879: swap
      // 87a: bipush 1
      // 87b: swap
      // 87c: aastore
      // 87d: dup_x1
      // 87e: swap
      // 87f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 882: bipush 0
      // 883: swap
      // 884: aastore
      // 885: invokevirtual rip/breeze/inject/ԡ.method_002 ([Ljava/lang/Object;)V
      // 888: aload 0
      // 889: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 88c: aload 48
      // 88e: lload 29
      // 890: bipush 2
      // 891: anewarray 5
      // 894: dup_x2
      // 895: dup_x2
      // 896: pop
      // 897: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 89a: bipush 1
      // 89b: swap
      // 89c: aastore
      // 89d: dup_x1
      // 89e: swap
      // 89f: bipush 0
      // 8a0: swap
      // 8a1: aastore
      // 8a2: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 8a5: istore 46
      // 8a7: aload 0
      // 8a8: lload 31
      // 8aa: iload 46
      // 8ac: aload 38
      // 8ae: aload 41
      // 8b0: bipush 4
      // 8b1: anewarray 5
      // 8b4: dup_x1
      // 8b5: swap
      // 8b6: bipush 3
      // 8b7: swap
      // 8b8: aastore
      // 8b9: dup_x1
      // 8ba: swap
      // 8bb: bipush 2
      // 8bc: swap
      // 8bd: aastore
      // 8be: dup_x1
      // 8bf: swap
      // 8c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8c3: bipush 1
      // 8c4: swap
      // 8c5: aastore
      // 8c6: dup_x2
      // 8c7: dup_x2
      // 8c8: pop
      // 8c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8cc: bipush 0
      // 8cd: swap
      // 8ce: aastore
      // 8cf: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // 8d2: aload 0
      // 8d3: lload 2
      // 8d4: lconst_0
      // 8d5: lcmp
      // 8d6: ifle be3
      // 8d9: iload 39
      // 8db: iload 46
      // 8dd: bipush 2
      // 8de: anewarray 5
      // 8e1: dup_x1
      // 8e2: swap
      // 8e3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8e6: bipush 1
      // 8e7: swap
      // 8e8: aastore
      // 8e9: dup_x1
      // 8ea: swap
      // 8eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8ee: bipush 0
      // 8ef: swap
      // 8f0: aastore
      // 8f1: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // 8f4: iinc 47 1
      // 8f7: aload 37
      // 8f9: ifnonnull be2
      // 8fc: aload 37
      // 8fe: ifnull 84e
      // 901: lload 2
      // 902: lconst_0
      // 903: lcmp
      // 904: ifle 8f7
      // 907: goto 90e
      // 90a: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90d: athrow
      // 90e: aload 37
      // 910: ifnull be2
      // 913: iload 43
      // 915: goto 91c
      // 918: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91b: athrow
      // 91c: sipush 169
      // 91f: aload 37
      // 921: lload 2
      // 922: lconst_0
      // 923: lcmp
      // 924: iflt a53
      // 927: ifnonnull a51
      // 92a: if_icmpne a45
      // 92d: goto 934
      // 930: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 933: athrow
      // 934: aload 41
      // 936: ifnonnull 959
      // 939: goto 940
      // 93c: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93f: athrow
      // 940: new rip/breeze/inject/ÿ
      // 943: dup
      // 944: aload 42
      // 946: sipush 8162
      // 949: ldc2_w 8721887208279428395
      // 94c: lload 2
      // 94d: lxor
      // 94e: invokestatic rip/breeze/inject/ԥ.method_023 (IJ)Ljava/lang/String;
      // 951: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;)V
      // 954: athrow
      // 955: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 958: athrow
      // 959: bipush 0
      // 95a: istore 45
      // 95c: iload 45
      // 95e: aload 41
      // 960: getfield rip/breeze/inject/ԑ.list_ý_2 Ljava/util/List;
      // 963: invokeinterface java/util/List.size ()I 1
      // 968: if_icmpge a3a
      // 96b: aload 41
      // 96d: getfield rip/breeze/inject/ԑ.list_ý_2 Ljava/util/List;
      // 970: iload 45
      // 972: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 977: checkcast rip/breeze/inject/մ
      // 97a: astore 46
      // 97c: aload 0
      // 97d: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 980: aload 46
      // 982: lload 29
      // 984: bipush 2
      // 985: anewarray 5
      // 988: dup_x2
      // 989: dup_x2
      // 98a: pop
      // 98b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98e: bipush 1
      // 98f: swap
      // 990: aastore
      // 991: dup_x1
      // 992: swap
      // 993: bipush 0
      // 994: swap
      // 995: aastore
      // 996: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 999: istore 47
      // 99b: aload 37
      // 99d: lload 2
      // 99e: lconst_0
      // 99f: lcmp
      // 9a0: ifle a37
      // 9a3: ifnonnull a35
      // 9a6: aload 0
      // 9a7: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 9aa: iload 47
      // 9ac: aaload
      // 9ad: aload 37
      // 9af: ifnonnull 2fc
      // 9b2: lload 2
      // 9b3: lconst_0
      // 9b4: lcmp
      // 9b5: ifle 2fc
      // 9b8: goto 9bf
      // 9bb: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9be: athrow
      // 9bf: ifnull a32
      // 9c2: aload 0
      // 9c3: iload 47
      // 9c5: bipush 1
      // 9c6: iadd
      // 9c7: aload 0
      // 9c8: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 9cb: iload 47
      // 9cd: aaload
      // 9ce: aload 38
      // 9d0: aload 0
      // 9d1: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 9d4: iload 47
      // 9d6: aaload
      // 9d7: aload 41
      // 9d9: getfield rip/breeze/inject/ԑ.arr_þ_2 [Z
      // 9dc: lload 21
      // 9de: dup2_x1
      // 9df: pop2
      // 9e0: bipush 6
      // 9e2: anewarray 5
      // 9e5: dup_x1
      // 9e6: swap
      // 9e7: bipush 5
      // 9e8: swap
      // 9e9: aastore
      // 9ea: dup_x2
      // 9eb: dup_x2
      // 9ec: pop
      // 9ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f0: bipush 4
      // 9f1: swap
      // 9f2: aastore
      // 9f3: dup_x1
      // 9f4: swap
      // 9f5: bipush 3
      // 9f6: swap
      // 9f7: aastore
      // 9f8: dup_x1
      // 9f9: swap
      // 9fa: bipush 2
      // 9fb: swap
      // 9fc: aastore
      // 9fd: dup_x1
      // 9fe: swap
      // 9ff: bipush 1
      // a00: swap
      // a01: aastore
      // a02: dup_x1
      // a03: swap
      // a04: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a07: bipush 0
      // a08: swap
      // a09: aastore
      // a0a: invokevirtual rip/breeze/inject/ԥ.method_020 ([Ljava/lang/Object;)V
      // a0d: aload 0
      // a0e: iload 39
      // a10: iload 47
      // a12: bipush 1
      // a13: iadd
      // a14: bipush 2
      // a15: anewarray 5
      // a18: dup_x1
      // a19: swap
      // a1a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a1d: bipush 1
      // a1e: swap
      // a1f: aastore
      // a20: dup_x1
      // a21: swap
      // a22: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a25: bipush 0
      // a26: swap
      // a27: aastore
      // a28: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // a2b: goto a32
      // a2e: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a31: athrow
      // a32: iinc 45 1
      // a35: aload 37
      // a37: ifnull 95c
      // a3a: aload 37
      // a3c: lload 2
      // a3d: lconst_0
      // a3e: lcmp
      // a3f: ifle 977
      // a42: ifnull be2
      // a45: iload 43
      // a47: sipush 191
      // a4a: goto a51
      // a4d: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a50: athrow
      // a51: aload 37
      // a53: lload 2
      // a54: lconst_0
      // a55: lcmp
      // a56: ifle a7a
      // a59: ifnonnull a72
      // a5c: if_icmpeq be2
      // a5f: goto a66
      // a62: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a65: athrow
      // a66: iload 43
      // a68: sipush 172
      // a6b: goto a72
      // a6e: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a71: athrow
      // a72: lload 2
      // a73: lconst_0
      // a74: lcmp
      // a75: iflt a93
      // a78: aload 37
      // a7a: ifnonnull a93
      // a7d: if_icmplt a96
      // a80: goto a87
      // a83: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a86: athrow
      // a87: iload 43
      // a89: sipush 177
      // a8c: goto a93
      // a8f: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a92: athrow
      // a93: if_icmple be2
      // a96: lload 2
      // a97: lconst_0
      // a98: lcmp
      // a99: iflt bc4
      // a9c: aload 41
      // a9e: ifnull b95
      // aa1: goto aa8
      // aa4: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa7: athrow
      // aa8: aload 42
      // aaa: instanceof rip/breeze/inject/ի
      // aad: aload 37
      // aaf: lload 2
      // ab0: lconst_0
      // ab1: lcmp
      // ab2: ifle b6e
      // ab5: ifnonnull b6c
      // ab8: goto abf
      // abb: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // abe: athrow
      // abf: ifeq b60
      // ac2: goto ac9
      // ac5: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac8: athrow
      // ac9: aload 42
      // acb: checkcast rip/breeze/inject/ի
      // ace: getfield rip/breeze/inject/ի.int_ç_2 I
      // ad1: istore 45
      // ad3: lload 2
      // ad4: lconst_0
      // ad5: lcmp
      // ad6: iflt ae7
      // ad9: aload 41
      // adb: getfield rip/breeze/inject/ԑ.arr_þ_2 [Z
      // ade: iload 45
      // ae0: bipush 1
      // ae1: aload 37
      // ae3: ifnonnull b54
      // ae6: bastore
      // ae7: iload 43
      // ae9: bipush 22
      // aeb: if_icmpeq b43
      // aee: goto af5
      // af1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af4: athrow
      // af5: iload 43
      // af7: bipush 24
      // af9: aload 37
      // afb: lload 2
      // afc: lconst_0
      // afd: lcmp
      // afe: ifle b28
      // b01: ifnonnull b20
      // b04: goto b0b
      // b07: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0a: athrow
      // b0b: if_icmpeq b43
      // b0e: goto b15
      // b11: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b14: athrow
      // b15: iload 43
      // b17: bipush 55
      // b19: goto b20
      // b1c: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1f: athrow
      // b20: lload 2
      // b21: lconst_0
      // b22: lcmp
      // b23: ifle b40
      // b26: aload 37
      // b28: ifnonnull b40
      // b2b: if_icmpeq b43
      // b2e: goto b35
      // b31: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b34: athrow
      // b35: iload 43
      // b37: bipush 57
      // b39: goto b40
      // b3c: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3f: athrow
      // b40: if_icmpne b55
      // b43: aload 41
      // b45: getfield rip/breeze/inject/ԑ.arr_þ_2 [Z
      // b48: iload 45
      // b4a: bipush 1
      // b4b: iadd
      // b4c: bipush 1
      // b4d: goto b54
      // b50: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b53: athrow
      // b54: bastore
      // b55: lload 2
      // b56: lconst_0
      // b57: lcmp
      // b58: ifle bc4
      // b5b: aload 37
      // b5d: ifnull b95
      // b60: aload 42
      // b62: instanceof rip/breeze/inject/ո
      // b65: goto b6c
      // b68: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6b: athrow
      // b6c: aload 37
      // b6e: ifnonnull b8a
      // b71: ifeq b95
      // b74: goto b7b
      // b77: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7a: athrow
      // b7b: aload 42
      // b7d: checkcast rip/breeze/inject/ո
      // b80: getfield rip/breeze/inject/ո.int_ç_2 I
      // b83: goto b8a
      // b86: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b89: athrow
      // b8a: istore 45
      // b8c: aload 41
      // b8e: getfield rip/breeze/inject/ԑ.arr_þ_2 [Z
      // b91: iload 45
      // b93: bipush 1
      // b94: bastore
      // b95: aload 0
      // b96: iload 39
      // b98: bipush 1
      // b99: iadd
      // b9a: lload 31
      // b9c: dup2_x1
      // b9d: pop2
      // b9e: aload 38
      // ba0: aload 41
      // ba2: bipush 4
      // ba3: anewarray 5
      // ba6: dup_x1
      // ba7: swap
      // ba8: bipush 3
      // ba9: swap
      // baa: aastore
      // bab: dup_x1
      // bac: swap
      // bad: bipush 2
      // bae: swap
      // baf: aastore
      // bb0: dup_x1
      // bb1: swap
      // bb2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bb5: bipush 1
      // bb6: swap
      // bb7: aastore
      // bb8: dup_x2
      // bb9: dup_x2
      // bba: pop
      // bbb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bbe: bipush 0
      // bbf: swap
      // bc0: aastore
      // bc1: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // bc4: aload 0
      // bc5: iload 39
      // bc7: iload 39
      // bc9: bipush 1
      // bca: iadd
      // bcb: bipush 2
      // bcc: anewarray 5
      // bcf: dup_x1
      // bd0: swap
      // bd1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bd4: bipush 1
      // bd5: swap
      // bd6: aastore
      // bd7: dup_x1
      // bd8: swap
      // bd9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bdc: bipush 0
      // bdd: swap
      // bde: aastore
      // bdf: invokevirtual rip/breeze/inject/ԥ.method_016 ([Ljava/lang/Object;)V
      // be2: aload 0
      // be3: getfield rip/breeze/inject/ԥ.arr_é_2 [Ljava/util/List;
      // be6: iload 39
      // be8: aaload
      // be9: astore 45
      // beb: aload 45
      // bed: aload 37
      // bef: ifnonnull bfe
      // bf2: ifnull df5
      // bf5: goto bfc
      // bf8: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bfb: athrow
      // bfc: aload 45
      // bfe: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // c03: astore 46
      // c05: aload 46
      // c07: invokeinterface java/util/Iterator.hasNext ()Z 1
      // c0c: ifeq df5
      // c0f: aload 46
      // c11: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c16: checkcast rip/breeze/inject/ա
      // c19: astore 47
      // c1b: aload 37
      // c1d: lload 2
      // c1e: lconst_0
      // c1f: lcmp
      // c20: ifle e6d
      // c23: ifnonnull e6b
      // c26: aload 47
      // c28: getfield rip/breeze/inject/ա.string_ü_2 Ljava/lang/String;
      // c2b: aload 37
      // c2d: ifnonnull c68
      // c30: goto c37
      // c33: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c36: athrow
      // c37: ifnonnull c5c
      // c3a: goto c41
      // c3d: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c40: athrow
      // c41: sipush 20042
      // c44: ldc2_w 7875085649517681798
      // c47: lload 2
      // c48: lxor
      // c49: invokestatic rip/breeze/inject/ԥ.method_023 (IJ)Ljava/lang/String;
      // c4c: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // c4f: astore 48
      // c51: lload 2
      // c52: lconst_0
      // c53: lcmp
      // c54: ifle c6d
      // c57: aload 37
      // c59: ifnull c6d
      // c5c: aload 47
      // c5e: getfield rip/breeze/inject/ա.string_ü_2 Ljava/lang/String;
      // c61: goto c68
      // c64: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c67: athrow
      // c68: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // c6b: astore 48
      // c6d: aload 0
      // c6e: aload 37
      // c70: lload 2
      // c71: lconst_0
      // c72: lcmp
      // c73: iflt cc4
      // c76: ifnonnull cae
      // c79: lload 12
      // c7b: iload 39
      // c7d: aload 47
      // c7f: bipush 3
      // c80: anewarray 5
      // c83: dup_x1
      // c84: swap
      // c85: bipush 2
      // c86: swap
      // c87: aastore
      // c88: dup_x1
      // c89: swap
      // c8a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c8d: bipush 1
      // c8e: swap
      // c8f: aastore
      // c90: dup_x2
      // c91: dup_x2
      // c92: pop
      // c93: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c96: bipush 0
      // c97: swap
      // c98: aastore
      // c99: invokevirtual rip/breeze/inject/ԥ.method_018 ([Ljava/lang/Object;)Z
      // c9c: ifeq df0
      // c9f: goto ca6
      // ca2: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ca5: athrow
      // ca6: aload 0
      // ca7: goto cae
      // caa: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cad: athrow
      // cae: lload 14
      // cb0: aload 40
      // cb2: bipush 2
      // cb3: anewarray 5
      // cb6: dup_x1
      // cb7: swap
      // cb8: bipush 1
      // cb9: swap
      // cba: aastore
      // cbb: dup_x2
      // cbc: dup_x2
      // cbd: pop
      // cbe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cc1: bipush 0
      // cc2: swap
      // cc3: aastore
      // cc4: invokevirtual rip/breeze/inject/ԥ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // cc7: astore 49
      // cc9: aload 49
      // ccb: bipush 0
      // ccc: anewarray 5
      // ccf: invokevirtual rip/breeze/inject/ԡ.method_013 ([Ljava/lang/Object;)V
      // cd2: aload 0
      // cd3: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // cd6: lload 27
      // cd8: aload 47
      // cda: aload 49
      // cdc: aload 48
      // cde: bipush 4
      // cdf: anewarray 5
      // ce2: dup_x1
      // ce3: swap
      // ce4: bipush 3
      // ce5: swap
      // ce6: aastore
      // ce7: dup_x1
      // ce8: swap
      // ce9: bipush 2
      // cea: swap
      // ceb: aastore
      // cec: dup_x1
      // ced: swap
      // cee: bipush 1
      // cef: swap
      // cf0: aastore
      // cf1: dup_x2
      // cf2: dup_x2
      // cf3: pop
      // cf4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cf7: bipush 0
      // cf8: swap
      // cf9: aastore
      // cfa: invokevirtual rip/breeze/inject/ԟ.method_013 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // cfd: astore 50
      // cff: aload 49
      // d01: aload 50
      // d03: lload 8
      // d05: bipush 2
      // d06: anewarray 5
      // d09: dup_x2
      // d0a: dup_x2
      // d0b: pop
      // d0c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d0f: bipush 1
      // d10: swap
      // d11: aastore
      // d12: dup_x1
      // d13: swap
      // d14: bipush 0
      // d15: swap
      // d16: aastore
      // d17: invokevirtual rip/breeze/inject/ԡ.method_015 ([Ljava/lang/Object;)V
      // d1a: aload 0
      // d1b: aload 0
      // d1c: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // d1f: aload 47
      // d21: getfield rip/breeze/inject/ա.ճ_ý_2 Lrip/breeze/inject/ճ;
      // d24: lload 29
      // d26: bipush 2
      // d27: anewarray 5
      // d2a: dup_x2
      // d2b: dup_x2
      // d2c: pop
      // d2d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d30: bipush 1
      // d31: swap
      // d32: aastore
      // d33: dup_x1
      // d34: swap
      // d35: bipush 0
      // d36: swap
      // d37: aastore
      // d38: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // d3b: lload 31
      // d3d: dup2_x1
      // d3e: pop2
      // d3f: aload 49
      // d41: aload 41
      // d43: bipush 4
      // d44: anewarray 5
      // d47: dup_x1
      // d48: swap
      // d49: bipush 3
      // d4a: swap
      // d4b: aastore
      // d4c: dup_x1
      // d4d: swap
      // d4e: bipush 2
      // d4f: swap
      // d50: aastore
      // d51: dup_x1
      // d52: swap
      // d53: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d56: bipush 1
      // d57: swap
      // d58: aastore
      // d59: dup_x2
      // d5a: dup_x2
      // d5b: pop
      // d5c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d5f: bipush 0
      // d60: swap
      // d61: aastore
      // d62: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // d65: aload 0
      // d66: lload 14
      // d68: aload 38
      // d6a: bipush 2
      // d6b: anewarray 5
      // d6e: dup_x1
      // d6f: swap
      // d70: bipush 1
      // d71: swap
      // d72: aastore
      // d73: dup_x2
      // d74: dup_x2
      // d75: pop
      // d76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d79: bipush 0
      // d7a: swap
      // d7b: aastore
      // d7c: invokevirtual rip/breeze/inject/ԥ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // d7f: astore 49
      // d81: aload 49
      // d83: bipush 0
      // d84: anewarray 5
      // d87: invokevirtual rip/breeze/inject/ԡ.method_013 ([Ljava/lang/Object;)V
      // d8a: aload 49
      // d8c: aload 50
      // d8e: lload 8
      // d90: bipush 2
      // d91: anewarray 5
      // d94: dup_x2
      // d95: dup_x2
      // d96: pop
      // d97: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d9a: bipush 1
      // d9b: swap
      // d9c: aastore
      // d9d: dup_x1
      // d9e: swap
      // d9f: bipush 0
      // da0: swap
      // da1: aastore
      // da2: invokevirtual rip/breeze/inject/ԡ.method_015 ([Ljava/lang/Object;)V
      // da5: aload 0
      // da6: aload 0
      // da7: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // daa: aload 47
      // dac: getfield rip/breeze/inject/ա.ճ_ý_2 Lrip/breeze/inject/ճ;
      // daf: lload 29
      // db1: bipush 2
      // db2: anewarray 5
      // db5: dup_x2
      // db6: dup_x2
      // db7: pop
      // db8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dbb: bipush 1
      // dbc: swap
      // dbd: aastore
      // dbe: dup_x1
      // dbf: swap
      // dc0: bipush 0
      // dc1: swap
      // dc2: aastore
      // dc3: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // dc6: lload 31
      // dc8: dup2_x1
      // dc9: pop2
      // dca: aload 49
      // dcc: aload 41
      // dce: bipush 4
      // dcf: anewarray 5
      // dd2: dup_x1
      // dd3: swap
      // dd4: bipush 3
      // dd5: swap
      // dd6: aastore
      // dd7: dup_x1
      // dd8: swap
      // dd9: bipush 2
      // dda: swap
      // ddb: aastore
      // ddc: dup_x1
      // ddd: swap
      // dde: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // de1: bipush 1
      // de2: swap
      // de3: aastore
      // de4: dup_x2
      // de5: dup_x2
      // de6: pop
      // de7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dea: bipush 0
      // deb: swap
      // dec: aastore
      // ded: invokevirtual rip/breeze/inject/ԥ.method_019 ([Ljava/lang/Object;)V
      // df0: aload 37
      // df2: ifnull c05
      // df5: lload 2
      // df6: lconst_0
      // df7: lcmp
      // df8: ifle e6b
      // dfb: goto e6b
      // dfe: astore 43
      // e00: new rip/breeze/inject/ÿ
      // e03: dup
      // e04: aload 43
      // e06: getfield rip/breeze/inject/ÿ.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // e09: lload 10
      // e0b: iload 39
      // e0d: aload 43
      // e0f: invokevirtual rip/breeze/inject/ÿ.getMessage ()Ljava/lang/String;
      // e12: bipush 3
      // e13: anewarray 5
      // e16: dup_x1
      // e17: swap
      // e18: bipush 2
      // e19: swap
      // e1a: aastore
      // e1b: dup_x1
      // e1c: swap
      // e1d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e20: bipush 1
      // e21: swap
      // e22: aastore
      // e23: dup_x2
      // e24: dup_x2
      // e25: pop
      // e26: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e29: bipush 0
      // e2a: swap
      // e2b: aastore
      // e2c: invokestatic rip/breeze/inject/ԥ.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // e2f: aload 43
      // e31: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;Ljava/lang/Throwable;)V
      // e34: athrow
      // e35: astore 43
      // e37: new rip/breeze/inject/ÿ
      // e3a: dup
      // e3b: aload 42
      // e3d: iload 39
      // e3f: aload 43
      // e41: invokevirtual java/lang/RuntimeException.getMessage ()Ljava/lang/String;
      // e44: lload 23
      // e46: dup2_x1
      // e47: pop2
      // e48: bipush 3
      // e49: anewarray 5
      // e4c: dup_x1
      // e4d: swap
      // e4e: bipush 2
      // e4f: swap
      // e50: aastore
      // e51: dup_x2
      // e52: dup_x2
      // e53: pop
      // e54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e57: bipush 1
      // e58: swap
      // e59: aastore
      // e5a: dup_x1
      // e5b: swap
      // e5c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e5f: bipush 0
      // e60: swap
      // e61: aastore
      // e62: invokestatic rip/breeze/inject/ԥ.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // e65: aload 43
      // e67: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;Ljava/lang/Throwable;)V
      // e6a: athrow
      // e6b: aload 37
      // e6d: ifnull 2dc
      // e70: aload 0
      // e71: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // e74: areturn
      // try (233 -> 240): 241 java/lang/RuntimeException
      // try (111 -> 122): 122 java/lang/RuntimeException
      // try (105 -> 112): 113 java/lang/RuntimeException
      // try (290 -> 362): 363 java/lang/RuntimeException
      // try (1815 -> 1844): 1845 java/lang/RuntimeException
      // try (1808 -> 1840): 1841 java/lang/RuntimeException
      // try (1795 -> 1803): 1804 java/lang/RuntimeException
      // try (1777 -> 1785): 1786 java/lang/RuntimeException
      // try (1771 -> 1781): 1782 java/lang/RuntimeException
      // try (1754 -> 1758): 1759 java/lang/RuntimeException
      // try (1678 -> 1685): 1686 java/lang/RuntimeException
      // try (1676 -> 1679): 1680 java/lang/RuntimeException
      // try (1665 -> 1673): 1674 java/lang/RuntimeException
      // try (1654 -> 1661): 1662 java/lang/RuntimeException
      // try (1645 -> 1651): 1652 java/lang/RuntimeException
      // try (1639 -> 1646): 1647 java/lang/RuntimeException
      // try (1630 -> 1636): 1637 java/lang/RuntimeException
      // try (1619 -> 1631): 1632 java/lang/RuntimeException
      // try (1612 -> 1627): 1628 java/lang/RuntimeException
      // try (1602 -> 1616): 1617 java/lang/RuntimeException
      // try (1583 -> 1595): 1596 java/lang/RuntimeException
      // try (1574 -> 1591): 1592 java/lang/RuntimeException
      // try (1573 -> 1580): 1581 java/lang/RuntimeException
      // try (1564 -> 1570): 1571 java/lang/RuntimeException
      // try (1558 -> 1565): 1566 java/lang/RuntimeException
      // try (1549 -> 1555): 1556 java/lang/RuntimeException
      // try (1543 -> 1550): 1551 java/lang/RuntimeException
      // try (1532 -> 1540): 1541 java/lang/RuntimeException
      // try (1451 -> 1526): 1527 java/lang/RuntimeException
      // try (1432 -> 1444): 1449 java/lang/RuntimeException
      // try (1382 -> 1397): 1397 java/lang/RuntimeException
      // try (1378 -> 1384): 1385 java/lang/RuntimeException
      // try (1371 -> 1379): 1380 java/lang/RuntimeException
      // try (1365 -> 1368): 1369 java/lang/RuntimeException
      // try (1300 -> 1358): 1363 java/lang/RuntimeException
      // try (1149 -> 1156): 1157 java/lang/RuntimeException
      // try (1142 -> 1146): 1147 java/lang/RuntimeException
      // try (1060 -> 1135): 1140 java/lang/RuntimeException
      // try (926 -> 933): 934 java/lang/RuntimeException
      // try (901 -> 923): 924 java/lang/RuntimeException
      // try (861 -> 898): 899 java/lang/RuntimeException
      // try (814 -> 858): 859 java/lang/RuntimeException
      // try (790 -> 817): 818 java/lang/RuntimeException
      // try (689 -> 766): 767 java/lang/RuntimeException
      // try (683 -> 691): 692 java/lang/RuntimeException
      // try (678 -> 686): 687 java/lang/RuntimeException
      // try (675 -> 680): 681 java/lang/RuntimeException
      // try (660 -> 669): 670 java/lang/RuntimeException
      // try (602 -> 653): 653 java/lang/RuntimeException
      // try (596 -> 648): 649 java/lang/RuntimeException
      // try (518 -> 593): 594 java/lang/RuntimeException
      // try (509 -> 515): 516 java/lang/RuntimeException
      // try (498 -> 510): 511 java/lang/RuntimeException
      // try (492 -> 506): 507 java/lang/RuntimeException
      // try (486 -> 495): 496 java/lang/RuntimeException
      // try (455 -> 2066): 2071 rip/breeze/inject/ÿ
      // try (455 -> 2066): 2104 java/lang/RuntimeException
   }

   private static String invoke_2(Object[] var0) {
      String var1 = (String)var0[0];
      int var2 = (Integer)var0[1];
      int var3 = (Integer)var0[2];
      int var4 = (Integer)var0[3];
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ encKey_A_2;
      return method_023(30680, 9159818461303456532L ^ var5) + var1;
   }

   private static String invoke_3(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_A_2 ^ var1;
      return method_023(23561, 7771615124365627271L ^ var1) + var3 + method_023(22920, 1793318190957742595L ^ var1) + var4;
   }

   private static String invoke_4(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_A_2 ^ var2;
      return method_023(15684, 5981259997883882411L ^ var2) + var1 + method_023(22948, 8318885708513066830L ^ var2) + var4;
   }

   public ԡ[] invoke_5(Object[] var1) throws ÿ {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      BreezeClass12 var5 = (BreezeClass12)var1[2];
      var2 = encKey_A_2 ^ var2;
      long var6 = var2 ^ 31941838578928L;
      long var8 = var2 ^ 4243724420623L;
      long var10 = var2 ^ 29310705291513L;
      var5.int_ç = method_006(new Object[]{var5, var10});
      var5.int_è = -1;
      this.method_001(new Object[]{var6, var4, var5});
      var5.int_è = method_007(new Object[]{this.arr_æ_2, var8});
      return this.arr_æ_2;
   }

   private static int invoke_6(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/inject/BreezeClass12
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 13754970826334
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 35678624566302
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 02c: aload 1
      // 02d: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 030: lload 6
      // 032: dup2_x1
      // 033: pop2
      // 034: bipush 2
      // 035: anewarray 5
      // 038: dup_x1
      // 039: swap
      // 03a: bipush 1
      // 03b: swap
      // 03c: aastore
      // 03d: dup_x2
      // 03e: dup_x2
      // 03f: pop
      // 040: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 043: bipush 0
      // 044: swap
      // 045: aastore
      // 046: invokestatic rip/breeze/inject/MathUtil3.clamp_4 ([Ljava/lang/Object;)I
      // 049: bipush 2
      // 04a: ishr
      // 04b: istore 8
      // 04d: astore 9
      // 04f: aload 1
      // 050: aload 9
      // 052: ifnonnull 070
      // 055: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 058: bipush 8
      // 05a: iand
      // 05b: ifeq 06f
      // 05e: goto 065
      // 061: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: iinc 8 -1
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 1
      // 070: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 073: lload 4
      // 075: bipush 1
      // 076: anewarray 5
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: invokevirtual rip/breeze/inject/թ.method_008 ([Ljava/lang/Object;)Ljava/util/ListIterator;
      // 085: astore 10
      // 087: aload 10
      // 089: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08e: ifeq 1bd
      // 091: aload 10
      // 093: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 098: checkcast rip/breeze/inject/ջ
      // 09b: astore 11
      // 09d: aload 11
      // 09f: instanceof rip/breeze/inject/ի
      // 0a2: aload 9
      // 0a4: lload 2
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: iflt 0af
      // 0aa: ifnonnull 1bf
      // 0ad: aload 9
      // 0af: lload 2
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: ifle 18f
      // 0b5: ifnonnull 18d
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: ifeq 181
      // 0c2: goto 0c9
      // 0c5: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: aload 11
      // 0cb: checkcast rip/breeze/inject/ի
      // 0ce: getfield rip/breeze/inject/ի.int_ç_2 I
      // 0d1: istore 12
      // 0d3: aload 11
      // 0d5: bipush 0
      // 0d6: anewarray 5
      // 0d9: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0dc: aload 9
      // 0de: ifnonnull 164
      // 0e1: bipush 22
      // 0e3: if_icmpeq 15c
      // 0e6: goto 0ed
      // 0e9: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 11
      // 0ef: bipush 0
      // 0f0: anewarray 5
      // 0f3: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0f6: aload 9
      // 0f8: ifnonnull 164
      // 0fb: goto 102
      // 0fe: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: lload 2
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 15d
      // 108: bipush 24
      // 10a: if_icmpeq 15c
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 11
      // 116: bipush 0
      // 117: anewarray 5
      // 11a: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 11d: aload 9
      // 11f: ifnonnull 164
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 15d
      // 12f: bipush 55
      // 131: if_icmpeq 15c
      // 134: goto 13b
      // 137: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 11
      // 13d: bipush 0
      // 13e: anewarray 5
      // 141: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 144: aload 9
      // 146: ifnonnull 164
      // 149: goto 150
      // 14c: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: bipush 57
      // 152: if_icmpne 167
      // 155: goto 15c
      // 158: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: bipush 2
      // 15d: goto 164
      // 160: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: goto 168
      // 167: bipush 1
      // 168: istore 13
      // 16a: iload 8
      // 16c: iload 12
      // 16e: iload 13
      // 170: iadd
      // 171: invokestatic java/lang/Math.max (II)I
      // 174: istore 8
      // 176: aload 9
      // 178: lload 2
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 1ba
      // 17e: ifnull 1b8
      // 181: aload 11
      // 183: instanceof rip/breeze/inject/ո
      // 186: goto 18d
      // 189: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: aload 9
      // 18f: ifnonnull 1ab
      // 192: ifeq 1b8
      // 195: goto 19c
      // 198: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: aload 11
      // 19e: checkcast rip/breeze/inject/ո
      // 1a1: getfield rip/breeze/inject/ո.int_ç_2 I
      // 1a4: goto 1ab
      // 1a7: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aa: athrow
      // 1ab: istore 12
      // 1ad: iload 8
      // 1af: iload 12
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: invokestatic java/lang/Math.max (II)I
      // 1b6: istore 8
      // 1b8: aload 9
      // 1ba: ifnull 087
      // 1bd: iload 8
      // 1bf: ireturn
      // try (52 -> 59): 60 java/lang/RuntimeException
      // try (55 -> 63): 64 java/lang/RuntimeException
      // try (87 -> 101): 102 java/lang/RuntimeException
      // try (95 -> 105): 106 java/lang/RuntimeException
      // try (112 -> 120): 121 java/lang/RuntimeException
      // try (118 -> 129): 130 java/lang/RuntimeException
      // try (123 -> 138): 139 java/lang/RuntimeException
      // try (132 -> 147): 148 java/lang/RuntimeException
      // try (141 -> 156): 157 java/lang/RuntimeException
      // try (150 -> 165): 166 java/lang/RuntimeException
      // try (159 -> 170): 171 java/lang/RuntimeException
      // try (168 -> 174): 175 java/lang/RuntimeException
      // try (186 -> 194): 195 java/lang/RuntimeException
      // try (197 -> 200): 201 java/lang/RuntimeException
      // try (199 -> 206): 207 java/lang/RuntimeException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static int invoke_7(Object[] var0) {
      ԡ[] var1 = (ԡ[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_A_2 ^ var2;
      long var4 = var2 ^ 45204076127399L;
      int var6 = 0;
      String[] var10000 = ԟ.method_015();
      ԡ[] var7 = var1;
      int var8 = var7.length;
      String[] var9 = var10000;
      int var10 = 0;

      while (var10 < var8) {
         ԡ var11 = var7[var10];

         label66: {
            label65: {
               label74: {
                  try {
                     var10000 = var9;
                     if (var2 < 0L) {
                        break label66;
                     }

                     if (var9 != null) {
                        break label65;
                     }

                     if (var11 == null) {
                        break label74;
                     }
                  } catch (RuntimeException var16) {
                     throw method_021(var16);
                  }

                  int var12 = 0;
                  int var13 = 0;

                  label57:
                  while (var13 < var11.method_010(new Object[0])) {
                     var12 += var11.method_011(new Object[]{var13}).method_001(new Object[]{var4});

                     try {
                        var13++;
                     } catch (RuntimeException var14) {
                        throw method_021(var14);
                     }

                     while (true) {
                        try {
                           var10000 = var9;
                           if (var2 >= 0L) {
                              if (var9 != null) {
                                 break label65;
                              }

                              var10000 = var9;
                           }

                           if (var10000 == null) {
                              break;
                           }
                        } catch (RuntimeException var15) {
                           throw method_021(var15);
                        }

                        if (var2 >= 0L) {
                           break label57;
                        }
                     }
                  }

                  var6 = Math.max(var6, var12);
               }

               var10++;
            }

            var10000 = var9;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var6;
   }

   private void invoke_8(Object[] param1) throws ÿ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 122123368784873
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 77977758889035
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: new rip/breeze/inject/ԑ
      // 02f: dup
      // 030: aconst_null
      // 031: iload 2
      // 032: aconst_null
      // 033: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ճ;ILrip/breeze/inject/մ;)V
      // 036: astore 9
      // 038: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 03b: new java/util/ArrayList
      // 03e: dup
      // 03f: invokespecial java/util/ArrayList.<init> ()V
      // 042: astore 10
      // 044: astore 11
      // 046: aload 0
      // 047: bipush 0
      // 048: aload 9
      // 04a: aload 10
      // 04c: lload 5
      // 04e: bipush 4
      // 04f: anewarray 5
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 3
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 2
      // 05e: swap
      // 05f: aastore
      // 060: dup_x1
      // 061: swap
      // 062: bipush 1
      // 063: swap
      // 064: aastore
      // 065: dup_x1
      // 066: swap
      // 067: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06a: bipush 0
      // 06b: swap
      // 06c: aastore
      // 06d: invokevirtual rip/breeze/inject/ԥ.method_009 ([Ljava/lang/Object;)V
      // 070: new java/util/HashMap
      // 073: dup
      // 074: invokespecial java/util/HashMap.<init> ()V
      // 077: astore 12
      // 079: aload 10
      // 07b: invokeinterface java/util/List.isEmpty ()Z 1
      // 080: ifne 13f
      // 083: aload 10
      // 085: bipush 0
      // 086: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 08b: checkcast rip/breeze/inject/մ
      // 08e: astore 13
      // 090: aload 12
      // 092: aload 13
      // 094: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 097: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09c: checkcast rip/breeze/inject/ԑ
      // 09f: astore 14
      // 0a1: aload 14
      // 0a3: aload 11
      // 0a5: ifnonnull 12f
      // 0a8: ifnonnull 126
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: new rip/breeze/inject/ԑ
      // 0b5: dup
      // 0b6: aload 13
      // 0b8: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 0bb: iload 2
      // 0bc: aload 13
      // 0be: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ճ;ILrip/breeze/inject/մ;)V
      // 0c1: astore 14
      // 0c3: aload 12
      // 0c5: aload 13
      // 0c7: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 0ca: aload 14
      // 0cc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d1: pop
      // 0d2: aload 0
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 0d7: aload 13
      // 0d9: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 0dc: lload 7
      // 0de: bipush 2
      // 0df: anewarray 5
      // 0e2: dup_x2
      // 0e3: dup_x2
      // 0e4: pop
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: bipush 1
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 0f3: aload 14
      // 0f5: aload 10
      // 0f7: lload 5
      // 0f9: bipush 4
      // 0fa: anewarray 5
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 3
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 1
      // 10e: swap
      // 10f: aastore
      // 110: dup_x1
      // 111: swap
      // 112: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: invokevirtual rip/breeze/inject/ԥ.method_009 ([Ljava/lang/Object;)V
      // 11b: aload 11
      // 11d: lload 3
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 13c
      // 123: ifnull 13a
      // 126: aload 14
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: getfield rip/breeze/inject/ԑ.list_ý_2 Ljava/util/List;
      // 132: aload 13
      // 134: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 139: pop
      // 13a: aload 11
      // 13c: ifnull 079
      // 13f: bipush 0
      // 140: istore 13
      // 142: iload 13
      // 144: aload 0
      // 145: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 148: if_icmpge 19e
      // 14b: aload 0
      // 14c: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 14f: iload 13
      // 151: aaload
      // 152: lload 3
      // 153: lconst_0
      // 154: lcmp
      // 155: iflt 181
      // 158: aload 11
      // 15a: ifnonnull 181
      // 15d: ifnull 196
      // 160: goto 167
      // 163: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: aload 0
      // 168: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 16b: iload 13
      // 16d: aload 11
      // 16f: ifnonnull 194
      // 172: goto 179
      // 175: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: aaload
      // 17a: goto 181
      // 17d: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: getfield rip/breeze/inject/ԑ.ճ_ÿ_2 Lrip/breeze/inject/ճ;
      // 184: ifnonnull 196
      // 187: aload 0
      // 188: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 18b: iload 13
      // 18d: goto 194
      // 190: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: aconst_null
      // 195: aastore
      // 196: iinc 13 1
      // 199: aload 11
      // 19b: ifnull 142
      // 19e: lload 3
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: ifle 14b
      // 1a4: return
      // try (90 -> 94): 95 rip/breeze/inject/ÿ
      // try (105 -> 168): 169 rip/breeze/inject/ÿ
      // try (183 -> 194): 195 rip/breeze/inject/ÿ
      // try (193 -> 202): 203 rip/breeze/inject/ÿ
      // try (197 -> 206): 207 rip/breeze/inject/ÿ
      // try (209 -> 214): 215 rip/breeze/inject/ÿ
   }

   private void invoke_9(Object[] param1) throws ÿ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/ԑ
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/List
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: pop
      // 026: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 029: lload 5
      // 02b: lxor
      // 02c: lstore 5
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 55654740635888
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 30132107880274
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 325237548499
      // 042: lxor
      // 043: lstore 11
      // 045: pop2
      // 046: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 049: new java/util/ArrayList
      // 04c: dup
      // 04d: invokespecial java/util/ArrayList.<init> ()V
      // 050: astore 13
      // 052: astore 14
      // 054: aload 13
      // 056: iload 2
      // 057: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 05d: pop
      // 05e: aload 13
      // 060: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 063: ifne 481
      // 066: aload 13
      // 068: aload 13
      // 06a: invokevirtual java/util/ArrayList.size ()I
      // 06d: bipush 1
      // 06e: isub
      // 06f: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
      // 072: checkcast java/lang/Integer
      // 075: invokevirtual java/lang/Integer.intValue ()I
      // 078: istore 15
      // 07a: iload 15
      // 07c: lload 5
      // 07e: lconst_0
      // 07f: lcmp
      // 080: ifle 094
      // 083: aload 14
      // 085: ifnonnull 094
      // 088: iflt 09b
      // 08b: goto 092
      // 08e: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: iload 15
      // 094: aload 0
      // 095: getfield rip/breeze/inject/ԥ.int_ê_2 I
      // 098: if_icmplt 0b4
      // 09b: new rip/breeze/inject/ÿ
      // 09e: dup
      // 09f: aconst_null
      // 0a0: sipush 2360
      // 0a3: ldc2_w 4595043732592710860
      // 0a6: lload 5
      // 0a8: lxor
      // 0a9: invokestatic rip/breeze/inject/ԥ.method_023 (IJ)Ljava/lang/String;
      // 0ac: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;)V
      // 0af: athrow
      // 0b0: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: lload 5
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0ed
      // 0bc: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 0bf: iload 15
      // 0c1: aload 14
      // 0c3: ifnonnull 0e3
      // 0c6: aaload
      // 0c7: ifnull 0dd
      // 0ca: goto 0d1
      // 0cd: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 14
      // 0d3: ifnull 05e
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 0e1: iload 15
      // 0e3: new rip/breeze/inject/ԑ
      // 0e6: dup
      // 0e7: aload 3
      // 0e8: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ԑ;)V
      // 0eb: aastore
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 0f0: iload 15
      // 0f2: lload 11
      // 0f4: bipush 2
      // 0f5: anewarray 5
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 10c: astore 16
      // 10e: aload 16
      // 110: instanceof rip/breeze/inject/մ
      // 113: aload 14
      // 115: lload 5
      // 117: lconst_0
      // 118: lcmp
      // 119: iflt 1b9
      // 11c: ifnonnull 1b7
      // 11f: ifeq 1ab
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 16
      // 12b: aload 14
      // 12d: ifnonnull 171
      // 130: goto 137
      // 133: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: lload 5
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 16a
      // 13e: bipush 0
      // 13f: anewarray 5
      // 142: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 145: sipush 168
      // 148: if_icmpne 168
      // 14b: goto 152
      // 14e: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: aload 4
      // 154: aload 16
      // 156: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15b: pop
      // 15c: aload 14
      // 15e: ifnull 355
      // 161: goto 168
      // 164: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 16
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: checkcast rip/breeze/inject/մ
      // 174: astore 17
      // 176: aload 13
      // 178: aload 0
      // 179: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 17c: aload 17
      // 17e: getfield rip/breeze/inject/մ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 181: lload 9
      // 183: bipush 2
      // 184: anewarray 5
      // 187: dup_x2
      // 188: dup_x2
      // 189: pop
      // 18a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18d: bipush 1
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 0
      // 193: swap
      // 194: aastore
      // 195: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 198: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 19e: lload 5
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: ifle 1b0
      // 1a5: pop
      // 1a6: aload 14
      // 1a8: ifnull 355
      // 1ab: aload 16
      // 1ad: instanceof rip/breeze/inject/խ
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 14
      // 1b9: ifnonnull 2a5
      // 1bc: ifeq 28d
      // 1bf: goto 1c6
      // 1c2: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c5: athrow
      // 1c6: aload 16
      // 1c8: checkcast rip/breeze/inject/խ
      // 1cb: astore 17
      // 1cd: aload 0
      // 1ce: aload 0
      // 1cf: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 1d2: aload 17
      // 1d4: getfield rip/breeze/inject/խ.ճ_å_2 Lrip/breeze/inject/ճ;
      // 1d7: lload 9
      // 1d9: bipush 2
      // 1da: anewarray 5
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 1
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x1
      // 1e7: swap
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 1ee: aload 3
      // 1ef: aload 4
      // 1f1: lload 7
      // 1f3: bipush 4
      // 1f4: anewarray 5
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 3
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: bipush 2
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 1
      // 208: swap
      // 209: aastore
      // 20a: dup_x1
      // 20b: swap
      // 20c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: invokevirtual rip/breeze/inject/ԥ.method_009 ([Ljava/lang/Object;)V
      // 215: aload 17
      // 217: getfield rip/breeze/inject/խ.list_ä_2 Ljava/util/List;
      // 21a: invokeinterface java/util/List.size ()I 1
      // 21f: bipush 1
      // 220: isub
      // 221: istore 18
      // 223: iload 18
      // 225: iflt 281
      // 228: aload 17
      // 22a: getfield rip/breeze/inject/խ.list_ä_2 Ljava/util/List;
      // 22d: iload 18
      // 22f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 234: checkcast rip/breeze/inject/ճ
      // 237: astore 19
      // 239: aload 13
      // 23b: lload 5
      // 23d: lconst_0
      // 23e: lcmp
      // 23f: ifle 35c
      // 242: aload 0
      // 243: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 246: aload 19
      // 248: lload 9
      // 24a: bipush 2
      // 24b: anewarray 5
      // 24e: dup_x2
      // 24f: dup_x2
      // 250: pop
      // 251: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 254: bipush 1
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 0
      // 25a: swap
      // 25b: aastore
      // 25c: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 25f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 262: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 265: pop
      // 266: iinc 18 -1
      // 269: aload 14
      // 26b: ifnonnull 355
      // 26e: aload 14
      // 270: ifnull 223
      // 273: lload 5
      // 275: lconst_0
      // 276: lcmp
      // 277: ifle 269
      // 27a: goto 281
      // 27d: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: lload 5
      // 283: lconst_0
      // 284: lcmp
      // 285: ifle 28d
      // 288: aload 14
      // 28a: ifnull 355
      // 28d: aload 16
      // 28f: aload 14
      // 291: ifnonnull 2aa
      // 294: goto 29b
      // 297: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: instanceof rip/breeze/inject/հ
      // 29e: goto 2a5
      // 2a1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a4: athrow
      // 2a5: ifeq 355
      // 2a8: aload 16
      // 2aa: checkcast rip/breeze/inject/հ
      // 2ad: astore 17
      // 2af: aload 0
      // 2b0: aload 0
      // 2b1: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 2b4: aload 17
      // 2b6: getfield rip/breeze/inject/հ.ճ_ç_2 Lrip/breeze/inject/ճ;
      // 2b9: lload 9
      // 2bb: bipush 2
      // 2bc: anewarray 5
      // 2bf: dup_x2
      // 2c0: dup_x2
      // 2c1: pop
      // 2c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c5: bipush 1
      // 2c6: swap
      // 2c7: aastore
      // 2c8: dup_x1
      // 2c9: swap
      // 2ca: bipush 0
      // 2cb: swap
      // 2cc: aastore
      // 2cd: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 2d0: aload 3
      // 2d1: aload 4
      // 2d3: lload 7
      // 2d5: bipush 4
      // 2d6: anewarray 5
      // 2d9: dup_x2
      // 2da: dup_x2
      // 2db: pop
      // 2dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2df: bipush 3
      // 2e0: swap
      // 2e1: aastore
      // 2e2: dup_x1
      // 2e3: swap
      // 2e4: bipush 2
      // 2e5: swap
      // 2e6: aastore
      // 2e7: dup_x1
      // 2e8: swap
      // 2e9: bipush 1
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f1: bipush 0
      // 2f2: swap
      // 2f3: aastore
      // 2f4: invokevirtual rip/breeze/inject/ԥ.method_009 ([Ljava/lang/Object;)V
      // 2f7: aload 17
      // 2f9: getfield rip/breeze/inject/հ.list_å_2 Ljava/util/List;
      // 2fc: invokeinterface java/util/List.size ()I 1
      // 301: bipush 1
      // 302: isub
      // 303: istore 18
      // 305: iload 18
      // 307: iflt 355
      // 30a: aload 17
      // 30c: getfield rip/breeze/inject/հ.list_å_2 Ljava/util/List;
      // 30f: iload 18
      // 311: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 316: checkcast rip/breeze/inject/ճ
      // 319: astore 19
      // 31b: aload 13
      // 31d: aload 0
      // 31e: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 321: aload 19
      // 323: lload 9
      // 325: bipush 2
      // 326: anewarray 5
      // 329: dup_x2
      // 32a: dup_x2
      // 32b: pop
      // 32c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32f: bipush 1
      // 330: swap
      // 331: aastore
      // 332: dup_x1
      // 333: swap
      // 334: bipush 0
      // 335: swap
      // 336: aastore
      // 337: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 33a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 340: pop
      // 341: iinc 18 -1
      // 344: aload 14
      // 346: ifnonnull 05e
      // 349: aload 14
      // 34b: lload 5
      // 34d: lconst_0
      // 34e: lcmp
      // 34f: iflt 072
      // 352: ifnull 305
      // 355: aload 0
      // 356: getfield rip/breeze/inject/ԥ.arr_é_2 [Ljava/util/List;
      // 359: iload 15
      // 35b: aaload
      // 35c: astore 17
      // 35e: aload 17
      // 360: aload 14
      // 362: ifnonnull 371
      // 365: ifnull 3d6
      // 368: goto 36f
      // 36b: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36e: athrow
      // 36f: aload 17
      // 371: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 376: astore 18
      // 378: aload 18
      // 37a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37f: ifeq 3d6
      // 382: aload 18
      // 384: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 389: checkcast rip/breeze/inject/ա
      // 38c: astore 19
      // 38e: aload 13
      // 390: aload 0
      // 391: getfield rip/breeze/inject/ԥ.թ_ý_2 Lrip/breeze/inject/թ;
      // 394: aload 19
      // 396: getfield rip/breeze/inject/ա.ճ_ý_2 Lrip/breeze/inject/ճ;
      // 399: lload 9
      // 39b: bipush 2
      // 39c: anewarray 5
      // 39f: dup_x2
      // 3a0: dup_x2
      // 3a1: pop
      // 3a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a5: bipush 1
      // 3a6: swap
      // 3a7: aastore
      // 3a8: dup_x1
      // 3a9: swap
      // 3aa: bipush 0
      // 3ab: swap
      // 3ac: aastore
      // 3ad: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 3b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b3: lload 5
      // 3b5: lconst_0
      // 3b6: lcmp
      // 3b7: ifle 478
      // 3ba: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3bd: pop
      // 3be: aload 14
      // 3c0: ifnonnull 46f
      // 3c3: aload 14
      // 3c5: ifnull 378
      // 3c8: lload 5
      // 3ca: lconst_0
      // 3cb: lcmp
      // 3cc: iflt 3be
      // 3cf: goto 3d6
      // 3d2: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: aload 16
      // 3d8: bipush 0
      // 3d9: anewarray 5
      // 3dc: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 3df: aload 14
      // 3e1: ifnonnull 47b
      // 3e4: tableswitch 139 167 191 120 139 120 120 120 120 120 120 120 120 120 139 139 139 139 139 139 139 139 139 139 139 139 139 120
      // 458: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45b: athrow
      // 45c: aload 14
      // 45e: lload 5
      // 460: lconst_0
      // 461: lcmp
      // 462: iflt 47e
      // 465: ifnull 47c
      // 468: goto 46f
      // 46b: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46e: athrow
      // 46f: aload 13
      // 471: iload 15
      // 473: bipush 1
      // 474: iadd
      // 475: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 478: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 47b: pop
      // 47c: aload 14
      // 47e: ifnull 05e
      // 481: lload 5
      // 483: lconst_0
      // 484: lcmp
      // 485: iflt 066
      // 488: return
      // try (65 -> 73): 74 rip/breeze/inject/ÿ
      // try (77 -> 90): 90 rip/breeze/inject/ÿ
      // try (92 -> 103): 104 rip/breeze/inject/ÿ
      // try (101 -> 108): 109 rip/breeze/inject/ÿ
      // try (140 -> 149): 150 rip/breeze/inject/ÿ
      // try (148 -> 155): 156 rip/breeze/inject/ÿ
      // try (152 -> 167): 168 rip/breeze/inject/ÿ
      // try (158 -> 176): 177 rip/breeze/inject/ÿ
      // try (170 -> 180): 181 rip/breeze/inject/ÿ
      // try (185 -> 217): 218 rip/breeze/inject/ÿ
      // try (220 -> 223): 224 rip/breeze/inject/ÿ
      // try (293 -> 325): 330 rip/breeze/inject/ÿ
      // try (332 -> 341): 342 rip/breeze/inject/ÿ
      // try (338 -> 345): 346 rip/breeze/inject/ÿ
      // try (453 -> 457): 458 rip/breeze/inject/ÿ
      // try (470 -> 502): 507 rip/breeze/inject/ÿ
      // try (509 -> 516): 516 rip/breeze/inject/ÿ
      // try (515 -> 524): 525 rip/breeze/inject/ÿ
   }

   private ԡ invoke_10(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/BreezeClass12
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 85016931569540
      // 029: lxor
      // 02a: dup2
      // 02b: bipush 8
      // 02d: lushr
      // 02e: lstore 6
      // 030: dup2
      // 031: bipush 56
      // 033: lshl
      // 034: bipush 56
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 86369627566135
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 58936293750879
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 67647451915498
      // 04d: lxor
      // 04e: lstore 13
      // 050: dup2
      // 051: ldc2_w 53370073248758
      // 054: lxor
      // 055: lstore 15
      // 057: dup2
      // 058: ldc2_w 7866286486212
      // 05b: lxor
      // 05c: lstore 17
      // 05e: dup2
      // 05f: ldc2_w 6199729010420
      // 062: lxor
      // 063: lstore 19
      // 065: dup2
      // 066: ldc2_w 31266060788771
      // 069: lxor
      // 06a: lstore 21
      // 06c: pop2
      // 06d: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 070: aload 0
      // 071: aload 3
      // 072: getfield rip/breeze/inject/BreezeClass12.int_ç I
      // 075: aload 3
      // 076: getfield rip/breeze/inject/BreezeClass12.int_è I
      // 079: lload 21
      // 07b: dup2_x1
      // 07c: pop2
      // 07d: bipush 3
      // 07e: anewarray 5
      // 081: dup_x1
      // 082: swap
      // 083: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: invokevirtual rip/breeze/inject/ԥ.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 09d: astore 23
      // 09f: astore 24
      // 0a1: bipush 0
      // 0a2: istore 25
      // 0a4: aload 3
      // 0a5: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0a8: bipush 8
      // 0aa: iand
      // 0ab: aload 24
      // 0ad: ifnonnull 0bb
      // 0b0: ifne 0be
      // 0b3: goto 0ba
      // 0b6: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: goto 0bf
      // 0be: bipush 0
      // 0bf: istore 26
      // 0c1: iload 26
      // 0c3: ifeq 125
      // 0c6: aload 2
      // 0c7: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 0ca: astore 27
      // 0cc: aload 23
      // 0ce: iload 25
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 0d4: iload 26
      // 0d6: iload 25
      // 0d8: lload 19
      // 0da: aload 27
      // 0dc: bipush 4
      // 0dd: anewarray 5
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 3
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 2
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: invokevirtual rip/breeze/inject/ԟ.method_010 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 101: lload 9
      // 103: dup2_x1
      // 104: pop2
      // 105: bipush 3
      // 106: anewarray 5
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 2
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x2
      // 10f: dup_x2
      // 110: pop
      // 111: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 114: bipush 1
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: invokevirtual rip/breeze/inject/ԡ.method_008 ([Ljava/lang/Object;)V
      // 122: iinc 25 1
      // 125: aload 3
      // 126: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 129: lload 15
      // 12b: dup2_x1
      // 12c: pop2
      // 12d: bipush 2
      // 12e: anewarray 5
      // 131: dup_x1
      // 132: swap
      // 133: bipush 1
      // 134: swap
      // 135: aastore
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 142: astore 27
      // 144: aload 27
      // 146: astore 28
      // 148: aload 28
      // 14a: arraylength
      // 14b: istore 29
      // 14d: bipush 0
      // 14e: istore 30
      // 150: iload 30
      // 152: iload 29
      // 154: if_icmpge 24c
      // 157: aload 28
      // 159: iload 30
      // 15b: aaload
      // 15c: astore 31
      // 15e: aload 23
      // 160: iload 25
      // 162: aload 0
      // 163: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 166: iload 26
      // 168: iload 25
      // 16a: lload 19
      // 16c: aload 31
      // 16e: bipush 4
      // 16f: anewarray 5
      // 172: dup_x1
      // 173: swap
      // 174: bipush 3
      // 175: swap
      // 176: aastore
      // 177: dup_x2
      // 178: dup_x2
      // 179: pop
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: bipush 2
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: bipush 1
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18d: bipush 0
      // 18e: swap
      // 18f: aastore
      // 190: invokevirtual rip/breeze/inject/ԟ.method_010 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 193: lload 9
      // 195: dup2_x1
      // 196: pop2
      // 197: bipush 3
      // 198: anewarray 5
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 2
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 1
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x1
      // 1aa: swap
      // 1ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: invokevirtual rip/breeze/inject/ԡ.method_008 ([Ljava/lang/Object;)V
      // 1b4: iinc 25 1
      // 1b7: aload 24
      // 1b9: lload 4
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: ifle 249
      // 1c0: ifnonnull 247
      // 1c3: aload 31
      // 1c5: lload 17
      // 1c7: bipush 1
      // 1c8: anewarray 5
      // 1cb: dup_x2
      // 1cc: dup_x2
      // 1cd: pop
      // 1ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 1d7: bipush 2
      // 1d8: lload 4
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: ifle 259
      // 1df: aload 24
      // 1e1: ifnonnull 259
      // 1e4: goto 1eb
      // 1e7: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: if_icmpne 244
      // 1ee: goto 1f5
      // 1f1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: aload 23
      // 1f7: iload 25
      // 1f9: aload 0
      // 1fa: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 1fd: lload 11
      // 1ff: iload 25
      // 201: bipush 2
      // 202: anewarray 5
      // 205: dup_x1
      // 206: swap
      // 207: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20a: bipush 1
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x2
      // 20e: dup_x2
      // 20f: pop
      // 210: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 213: bipush 0
      // 214: swap
      // 215: aastore
      // 216: invokevirtual rip/breeze/inject/ԟ.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 219: lload 9
      // 21b: dup2_x1
      // 21c: pop2
      // 21d: bipush 3
      // 21e: anewarray 5
      // 221: dup_x1
      // 222: swap
      // 223: bipush 2
      // 224: swap
      // 225: aastore
      // 226: dup_x2
      // 227: dup_x2
      // 228: pop
      // 229: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22c: bipush 1
      // 22d: swap
      // 22e: aastore
      // 22f: dup_x1
      // 230: swap
      // 231: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 234: bipush 0
      // 235: swap
      // 236: aastore
      // 237: invokevirtual rip/breeze/inject/ԡ.method_008 ([Ljava/lang/Object;)V
      // 23a: iinc 25 1
      // 23d: goto 244
      // 240: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: iinc 30 1
      // 247: aload 24
      // 249: ifnull 150
      // 24c: lload 4
      // 24e: lconst_0
      // 24f: lcmp
      // 250: iflt 319
      // 253: iload 25
      // 255: aload 3
      // 256: getfield rip/breeze/inject/BreezeClass12.int_ç I
      // 259: if_icmpge 2ca
      // 25c: aload 23
      // 25e: lload 4
      // 260: lconst_0
      // 261: lcmp
      // 262: ifle 31b
      // 265: iload 25
      // 267: aload 0
      // 268: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 26b: lload 11
      // 26d: iload 25
      // 26f: bipush 2
      // 270: anewarray 5
      // 273: dup_x1
      // 274: swap
      // 275: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 278: bipush 1
      // 279: swap
      // 27a: aastore
      // 27b: dup_x2
      // 27c: dup_x2
      // 27d: pop
      // 27e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 281: bipush 0
      // 282: swap
      // 283: aastore
      // 284: invokevirtual rip/breeze/inject/ԟ.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 287: lload 9
      // 289: dup2_x1
      // 28a: pop2
      // 28b: bipush 3
      // 28c: anewarray 5
      // 28f: dup_x1
      // 290: swap
      // 291: bipush 2
      // 292: swap
      // 293: aastore
      // 294: dup_x2
      // 295: dup_x2
      // 296: pop
      // 297: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29a: bipush 1
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a2: bipush 0
      // 2a3: swap
      // 2a4: aastore
      // 2a5: invokevirtual rip/breeze/inject/ԡ.method_008 ([Ljava/lang/Object;)V
      // 2a8: iinc 25 1
      // 2ab: aload 24
      // 2ad: ifnonnull 319
      // 2b0: goto 2b7
      // 2b3: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b6: athrow
      // 2b7: aload 24
      // 2b9: ifnull 24c
      // 2bc: lload 4
      // 2be: lconst_0
      // 2bf: lcmp
      // 2c0: iflt 319
      // 2c3: goto 2ca
      // 2c6: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: aload 23
      // 2cc: aload 0
      // 2cd: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 2d0: aload 3
      // 2d1: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 2d4: lload 13
      // 2d6: bipush 2
      // 2d7: anewarray 5
      // 2da: dup_x2
      // 2db: dup_x2
      // 2dc: pop
      // 2dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e0: bipush 1
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 2eb: lload 6
      // 2ed: iload 8
      // 2ef: i2b
      // 2f0: bipush 3
      // 2f1: anewarray 5
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f9: bipush 2
      // 2fa: swap
      // 2fb: aastore
      // 2fc: dup_x2
      // 2fd: dup_x2
      // 2fe: pop
      // 2ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 302: bipush 1
      // 303: swap
      // 304: aastore
      // 305: dup_x1
      // 306: swap
      // 307: bipush 0
      // 308: swap
      // 309: aastore
      // 30a: invokevirtual rip/breeze/inject/ԟ.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/ԏ;
      // 30d: bipush 1
      // 30e: anewarray 5
      // 311: dup_x1
      // 312: swap
      // 313: bipush 0
      // 314: swap
      // 315: aastore
      // 316: invokevirtual rip/breeze/inject/ԡ.method_003 ([Ljava/lang/Object;)V
      // 319: aload 23
      // 31b: areturn
      // try (102 -> 109): 110 java/lang/RuntimeException
      // try (216 -> 301): 302 java/lang/RuntimeException
      // try (282 -> 305): 306 java/lang/RuntimeException
      // try (304 -> 355): 356 java/lang/RuntimeException
      // try (368 -> 422): 423 java/lang/RuntimeException
      // try (369 -> 427): 432 java/lang/RuntimeException
   }

   public ԡ[] invoke_11(Object[] var1) {
      return this.arr_æ_2;
   }

   public List invoke_12(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_é_2[var2];
   }

   protected void invoke_13(Object[] var1) throws ÿ {
      String var2 = (String)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
   }

   protected ԡ invoke_14(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      var3 = encKey_A_2 ^ var3;
      long var6 = var3 ^ 20469306274540L;
      return new ԡ(var2, var5, var6);
   }

   protected ԡ invoke_15(Object[] var1) {
      long var2 = (Long)var1[0];
      ԡ var4 = (ԡ)var1[1];
      var2 = encKey_A_2 ^ var2;
      long var5 = var2 ^ 62592297162928L;
      return new ԡ(var5, var4);
   }

   protected void invoke_16(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
   }

   protected boolean check_17(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      return true;
   }

   protected boolean check_18(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      ա var5 = (ա)var1[2];
      var2 = encKey_A_2 ^ var2;
      long var6 = var2 ^ 48102302424618L;
      Object[] var10004 = new Object[]{null, this.թ_ý_2.method_006(new Object[]{var5.ճ_ý_2, var6})};
      var10004[0] = var4;
      return this.method_017(var10004);
   }

   private void invoke_19(Object[] param1) throws ÿ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast rip/breeze/inject/ԡ
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast rip/breeze/inject/ԑ
      // 024: astore 6
      // 026: pop
      // 027: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 82043822931766
      // 032: lxor
      // 033: lstore 7
      // 035: dup2
      // 036: ldc2_w 117600359715498
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 68621976843746
      // 040: lxor
      // 041: lstore 11
      // 043: pop2
      // 044: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 047: aload 0
      // 048: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 04b: iload 4
      // 04d: aaload
      // 04e: astore 13
      // 050: astore 14
      // 052: aload 13
      // 054: aload 14
      // 056: ifnonnull 095
      // 059: ifnonnull 08c
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 0
      // 064: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 067: iload 4
      // 069: aload 0
      // 06a: lload 11
      // 06c: aload 5
      // 06e: bipush 2
      // 06f: anewarray 5
      // 072: dup_x1
      // 073: swap
      // 074: bipush 1
      // 075: swap
      // 076: aastore
      // 077: dup_x2
      // 078: dup_x2
      // 079: pop
      // 07a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: invokevirtual rip/breeze/inject/ԥ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 083: aastore
      // 084: bipush 1
      // 085: istore 15
      // 087: aload 14
      // 089: ifnull 0b9
      // 08c: aload 13
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 5
      // 097: aload 0
      // 098: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 09b: lload 7
      // 09d: bipush 3
      // 09e: anewarray 5
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 2
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: invokevirtual rip/breeze/inject/ԡ.method_020 ([Ljava/lang/Object;)Z
      // 0b7: istore 15
      // 0b9: aload 0
      // 0ba: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 0bd: iload 4
      // 0bf: aaload
      // 0c0: astore 16
      // 0c2: aload 16
      // 0c4: aload 14
      // 0c6: ifnonnull 10c
      // 0c9: ifnonnull 103
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: lload 2
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 12f
      // 0d9: aload 6
      // 0db: ifnull 12f
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 0e9: iload 4
      // 0eb: new rip/breeze/inject/ԑ
      // 0ee: dup
      // 0ef: aload 6
      // 0f1: invokespecial rip/breeze/inject/ԑ.<init> (Lrip/breeze/inject/ԑ;)V
      // 0f4: aastore
      // 0f5: bipush 1
      // 0f6: istore 15
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 12f
      // 0fe: aload 14
      // 100: ifnull 12f
      // 103: aload 6
      // 105: goto 10c
      // 108: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: ifnull 12f
      // 10f: iload 15
      // 111: aload 16
      // 113: aload 6
      // 115: lload 9
      // 117: bipush 2
      // 118: anewarray 5
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 0
      // 127: swap
      // 128: aastore
      // 129: invokevirtual rip/breeze/inject/ԑ.method_001 ([Ljava/lang/Object;)Z
      // 12c: ior
      // 12d: istore 15
      // 12f: iload 15
      // 131: lload 2
      // 132: lconst_0
      // 133: lcmp
      // 134: iflt 166
      // 137: aload 14
      // 139: ifnonnull 166
      // 13c: ifeq 18a
      // 13f: goto 146
      // 142: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: aload 0
      // 147: lload 2
      // 148: lconst_0
      // 149: lcmp
      // 14a: iflt 179
      // 14d: getfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 150: iload 4
      // 152: aload 14
      // 154: ifnonnull 176
      // 157: goto 15e
      // 15a: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: baload
      // 15f: goto 166
      // 162: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: ifne 18a
      // 169: aload 0
      // 16a: getfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 16d: iload 4
      // 16f: goto 176
      // 172: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: bipush 1
      // 177: bastore
      // 178: aload 0
      // 179: getfield rip/breeze/inject/ԥ.arr_ϫ_2 [I
      // 17c: aload 0
      // 17d: dup
      // 17e: getfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 181: dup_x1
      // 182: bipush 1
      // 183: iadd
      // 184: putfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 187: iload 4
      // 189: iastore
      // 18a: return
      // try (49 -> 53): 54 rip/breeze/inject/ÿ
      // try (80 -> 83): 84 rip/breeze/inject/ÿ
      // try (116 -> 120): 121 rip/breeze/inject/ÿ
      // try (119 -> 129): 130 rip/breeze/inject/ÿ
      // try (142 -> 149): 150 rip/breeze/inject/ÿ
      // try (174 -> 182): 183 rip/breeze/inject/ÿ
      // try (181 -> 194): 195 rip/breeze/inject/ÿ
      // try (185 -> 198): 199 rip/breeze/inject/ÿ
      // try (201 -> 205): 206 rip/breeze/inject/ÿ
   }

   private void invoke_20(Object[] param1) throws ÿ {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/ԡ
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast rip/breeze/inject/ԡ
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/inject/ԑ
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Long
      // 028: invokevirtual java/lang/Long.longValue ()J
      // 02b: lstore 6
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast [Z
      // 033: astore 8
      // 035: pop
      // 036: getstatic rip/breeze/inject/ԥ.encKey_A_2 J
      // 039: lload 6
      // 03b: lxor
      // 03c: lstore 6
      // 03e: lload 6
      // 040: dup2
      // 041: ldc2_w 73579982853746
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 108306391432174
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 59496854183078
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 49032633437591
      // 059: lxor
      // 05a: lstore 15
      // 05c: pop2
      // 05d: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 060: aload 4
      // 062: lload 15
      // 064: aload 3
      // 065: aload 8
      // 067: bipush 3
      // 068: anewarray 5
      // 06b: dup_x1
      // 06c: swap
      // 06d: bipush 2
      // 06e: swap
      // 06f: aastore
      // 070: dup_x1
      // 071: swap
      // 072: bipush 1
      // 073: swap
      // 074: aastore
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokevirtual rip/breeze/inject/ԡ.method_021 ([Ljava/lang/Object;)Z
      // 081: pop
      // 082: aload 0
      // 083: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 086: iload 2
      // 087: aaload
      // 088: astore 17
      // 08a: astore 18
      // 08c: aload 17
      // 08e: aload 18
      // 090: ifnonnull 0ce
      // 093: ifnonnull 0c5
      // 096: goto 09d
      // 099: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield rip/breeze/inject/ԥ.arr_æ_2 [Lrip/breeze/inject/ԡ;
      // 0a1: iload 2
      // 0a2: aload 0
      // 0a3: lload 13
      // 0a5: aload 4
      // 0a7: bipush 2
      // 0a8: anewarray 5
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 1
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: invokevirtual rip/breeze/inject/ԥ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/ԡ;
      // 0bc: aastore
      // 0bd: bipush 1
      // 0be: istore 19
      // 0c0: aload 18
      // 0c2: ifnull 0f2
      // 0c5: aload 17
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 4
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/inject/ԥ.ԟ_þ_2 Lrip/breeze/inject/ԟ;
      // 0d4: lload 9
      // 0d6: bipush 3
      // 0d7: anewarray 5
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 2
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 1
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: invokevirtual rip/breeze/inject/ԡ.method_020 ([Ljava/lang/Object;)Z
      // 0f0: istore 19
      // 0f2: aload 0
      // 0f3: getfield rip/breeze/inject/ԥ.arr_ϯ_2 [Lrip/breeze/inject/ԑ;
      // 0f6: iload 2
      // 0f7: aaload
      // 0f8: astore 20
      // 0fa: aload 20
      // 0fc: aload 18
      // 0fe: ifnonnull 10d
      // 101: ifnull 130
      // 104: goto 10b
      // 107: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: aload 5
      // 10d: ifnull 130
      // 110: iload 19
      // 112: aload 20
      // 114: aload 5
      // 116: lload 11
      // 118: bipush 2
      // 119: anewarray 5
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 1
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 0
      // 128: swap
      // 129: aastore
      // 12a: invokevirtual rip/breeze/inject/ԑ.method_001 ([Ljava/lang/Object;)Z
      // 12d: ior
      // 12e: istore 19
      // 130: iload 19
      // 132: lload 6
      // 134: lconst_0
      // 135: lcmp
      // 136: ifle 168
      // 139: aload 18
      // 13b: ifnonnull 168
      // 13e: ifeq 18a
      // 141: goto 148
      // 144: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 0
      // 149: lload 6
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 17a
      // 150: getfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 153: iload 2
      // 154: aload 18
      // 156: ifnonnull 177
      // 159: goto 160
      // 15c: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: baload
      // 161: goto 168
      // 164: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: ifne 18a
      // 16b: aload 0
      // 16c: getfield rip/breeze/inject/ԥ.arr_ϭ_2 [Z
      // 16f: iload 2
      // 170: goto 177
      // 173: invokestatic rip/breeze/inject/ԥ.method_021 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: bipush 1
      // 178: bastore
      // 179: aload 0
      // 17a: getfield rip/breeze/inject/ԥ.arr_ϫ_2 [I
      // 17d: aload 0
      // 17e: dup
      // 17f: getfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 182: dup_x1
      // 183: bipush 1
      // 184: iadd
      // 185: putfield rip/breeze/inject/ԥ.int_ϩ_2 I
      // 188: iload 2
      // 189: iastore
      // 18a: return
      // try (88 -> 92): 93 rip/breeze/inject/ÿ
      // try (119 -> 122): 123 rip/breeze/inject/ÿ
      // try (155 -> 159): 160 rip/breeze/inject/ÿ
      // try (185 -> 193): 194 rip/breeze/inject/ÿ
      // try (192 -> 205): 206 rip/breeze/inject/ÿ
      // try (196 -> 209): 210 rip/breeze/inject/ÿ
      // try (212 -> 216): 217 rip/breeze/inject/ÿ
   }

   static {
      long var0 = 8736268491484L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "¥\u0091îð¡\u0099º^úï(9\u009c§W\u0084\u001c\u008buF<¸(+\u001dÔyy'cÎ\u0088ábÐ\u008c±Ö\u0087ê\u0083\u000fÆ¥\u009c^ËÍ¢\r\u009flÆÚÑ\u0005(ü÷`\u0017b\u0089\u0000yÌj\u0003³\n@B0l>^Úåû-¼½6D9|:IÌ_SX\u0006ÿ\"iW(/ø¯W×\u0083ä0\u0083ýg\u0081>ÆÇl®_H\u0089ñZ\u009dë8VpcÞ¸]¸©\u0013\u0090\u0014´\u009e4]\u0010N£`å]4\u0091¹|±x\"Ydß¡@\u0005³\u0003\u0094®p÷õçç/\u00858HÇ,\u0014¡\u001a\u0082kY\u0082\u0089é\u009b\u0097@o2Y\u000b8\u001fO\u00ad\u008a\u0093'\u0017\u0018j»\f)×VppÊ\u0082\u0012Ý#HØ\u0016Cö\u0081\"¼\u008dBPVn\\ÝÐØêmÿ¸bPCã\u001a\u0092\u0011°àomB`è,%S\u0003\u008asub\u0000\u0005\u001ci\u008emÒ\u001a\u0010°új\u008f\u0007\u0016Z½õßö@2YD£§\u0091ç\u000f{\u009dàD\fTz}\u0089jPmùÛÏmG\u0093e";
      int var7 = "¥\u0091îð¡\u0099º^úï(9\u009c§W\u0084\u001c\u008buF<¸(+\u001dÔyy'cÎ\u0088ábÐ\u008c±Ö\u0087ê\u0083\u000fÆ¥\u009c^ËÍ¢\r\u009flÆÚÑ\u0005(ü÷`\u0017b\u0089\u0000yÌj\u0003³\n@B0l>^Úåû-¼½6D9|:IÌ_SX\u0006ÿ\"iW(/ø¯W×\u0083ä0\u0083ýg\u0081>ÆÇl®_H\u0089ñZ\u009dë8VpcÞ¸]¸©\u0013\u0090\u0014´\u009e4]\u0010N£`å]4\u0091¹|±x\"Ydß¡@\u0005³\u0003\u0094®p÷õçç/\u00858HÇ,\u0014¡\u001a\u0082kY\u0082\u0089é\u009b\u0097@o2Y\u000b8\u001fO\u00ad\u008a\u0093'\u0017\u0018j»\f)×VppÊ\u0082\u0012Ý#HØ\u0016Cö\u0081\"¼\u008dBPVn\\ÝÐØêmÿ¸bPCã\u001a\u0092\u0011°àomB`è,%S\u0003\u008asub\u0000\u0005\u001ci\u008emÒ\u001a\u0010°új\u008f\u0007\u0016Z½õßö@2YD£§\u0091ç\u000f{\u009dàD\fTz}\u0089jPmùÛÏmG\u0093e"
         .length();
      char var8 = '8';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_022(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "Þs\"è\u0096}¤äD\u0080`<\u001dN>\u007f-\u0001Æz\u0091\u001b\u0001\u00970\u009bLI\r´\u0093^&,\u0003X\"Û*\u001d\u0010¥.í¤6º\u0010ÕÖ6\u009f\u0017Hd×p";
            var7 = "Þs\"è\u0096}¤äD\u0080`<\u001dN>\u007f-\u0001Æz\u0091\u001b\u0001\u00970\u009bLI\r´\u0093^&,\u0003X\"Û*\u001d\u0010¥.í¤6º\u0010ÕÖ6\u009f\u0017Hd×p"
               .length();
            var8 = '(';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_022(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_B_2 = var4;
                  CONST_C_2 = new String[8];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static Exception invoke_21(Exception var0) {
      return var0;
   }

   private static String invoke_22(byte[] var0) {
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

   private static String invoke_23(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18631;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ԥ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_022(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }
}
