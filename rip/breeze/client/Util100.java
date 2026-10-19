package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;

class Util100 implements IBreezeInterface {
   static final Util100 CONST_A;
   private static final String CONST_B;

   public boolean isValid(long var1, String var3) {
      return var3.startsWith(CONST_B);
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
      // 002: ldc2_w 88622662033979
      // 005: lxor
      // 006: dup2
      // 007: bipush 32
      // 009: lushr
      // 00a: l2i
      // 00b: istore 6
      // 00d: dup2
      // 00e: bipush 32
      // 010: lshl
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 7
      // 017: dup2
      // 018: bipush 48
      // 01a: lshl
      // 01b: bipush 48
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 8
      // 021: pop2
      // 022: pop2
      // 023: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 026: aload 5
      // 028: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 02b: astore 9
      // 02d: astore 10
      // 02f: aload 9
      // 031: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 034: istore 11
      // 036: aload 2
      // 037: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 03a: istore 12
      // 03c: aload 2
      // 03d: bipush 3
      // 03e: invokevirtual java/util/concurrent/atomic/AtomicInteger.addAndGet (I)I
      // 041: istore 13
      // 043: bipush -1
      // 044: istore 14
      // 046: aload 1
      // 047: iload 13
      // 049: invokevirtual java/lang/String.charAt (I)C
      // 04c: bipush 10
      // 04e: if_icmpne 05d
      // 051: aload 2
      // 052: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 055: istore 13
      // 057: aload 9
      // 059: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 05c: pop
      // 05d: iload 13
      // 05f: istore 15
      // 061: iload 15
      // 063: aload 1
      // 064: invokevirtual java/lang/String.length ()I
      // 067: if_icmpge 0e9
      // 06a: aload 1
      // 06b: iload 15
      // 06d: invokevirtual java/lang/String.charAt (I)C
      // 070: istore 16
      // 072: iload 16
      // 074: bipush 10
      // 076: lload 3
      // 077: lconst_0
      // 078: lcmp
      // 079: ifle 08f
      // 07c: if_icmpne 085
      // 07f: aload 9
      // 081: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 084: pop
      // 085: iload 16
      // 087: lload 3
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 0e2
      // 08d: bipush 39
      // 08f: if_icmpne 0de
      // 092: aload 1
      // 093: invokevirtual java/lang/String.length ()I
      // 096: lload 3
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 0e2
      // 09c: iload 15
      // 09e: bipush 2
      // 09f: iadd
      // 0a0: if_icmple 0de
      // 0a3: aload 1
      // 0a4: iload 15
      // 0a6: bipush 1
      // 0a7: iadd
      // 0a8: invokevirtual java/lang/String.charAt (I)C
      // 0ab: lload 3
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: ifle 0e2
      // 0b1: bipush 39
      // 0b3: if_icmpne 0de
      // 0b6: aload 1
      // 0b7: iload 15
      // 0b9: bipush 2
      // 0ba: iadd
      // 0bb: invokevirtual java/lang/String.charAt (I)C
      // 0be: lload 3
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 0e2
      // 0c4: bipush 39
      // 0c6: if_icmpne 0de
      // 0c9: iload 15
      // 0cb: istore 14
      // 0cd: aload 2
      // 0ce: bipush 2
      // 0cf: invokevirtual java/util/concurrent/atomic/AtomicInteger.addAndGet (I)I
      // 0d2: lload 3
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 0f1
      // 0d8: pop
      // 0d9: aload 10
      // 0db: ifnull 0e9
      // 0de: aload 2
      // 0df: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 0e2: istore 15
      // 0e4: aload 10
      // 0e6: ifnull 061
      // 0e9: iload 14
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 070
      // 0f1: bipush -1
      // 0f2: if_icmpne 120
      // 0f5: new rip/breeze/client/StringBuilderUtil
      // 0f8: dup
      // 0f9: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 0fc: astore 15
      // 0fe: aload 15
      // 100: aload 5
      // 102: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 105: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 108: aload 1
      // 109: iload 12
      // 10b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10e: iload 6
      // 110: swap
      // 111: iload 7
      // 113: i2s
      // 114: swap
      // 115: iload 8
      // 117: swap
      // 118: iload 11
      // 11a: invokevirtual rip/breeze/client/StringBuilderUtil.update_11 (Ljava/lang/String;ISILjava/lang/String;I)V
      // 11d: aload 15
      // 11f: areturn
      // 120: aload 1
      // 121: iload 13
      // 123: iload 14
      // 125: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 128: areturn
   }

   private Util100() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "|JL".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 126;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      } else {
         var6 = 126;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            CONST_B = var9;
            CONST_A = new Util100();
            return;
         }

         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 37;
               break;
            case 1:
               var23 = 19;
               break;
            case 2:
               var23 = 21;
               break;
            case 3:
               var23 = 109;
               break;
            case 4:
               var23 = 39;
               break;
            case 5:
               var23 = 100;
               break;
            default:
               var23 = 35;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               CONST_B = var8;
               CONST_A = new Util100();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}
