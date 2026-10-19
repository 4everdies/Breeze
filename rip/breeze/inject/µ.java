package rip.breeze.inject;

final class µ {
   final ª ª_ÿ_2;
   final ª ª_þ_2;
   final ª ª_ý_2;
   final int int_ü_2;
   final String string_û_2;
   µ µ_ú_2;

   µ(ª var1, ª var2, ª var3, int var4, String var5) {
      this.ª_ÿ_2 = var1;
      this.ª_þ_2 = var2;
      this.ª_ý_2 = var3;
      this.int_ü_2 = var4;
      this.string_û_2 = var5;
   }

   µ(µ var1, ª var2, ª var3) {
      this(var2, var3, var1.ª_ý_2, var1.int_ü_2, var1.string_û_2);
      this.µ_ú_2 = var1.µ_ú_2;
   }

   static µ invoke_1(Object[] var0) {
      µ var1 = (µ)var0[0];
      ª var2 = (ª)var0[1];
      long var3 = (Long)var0[2];
      ª var5 = (ª)var0[3];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 90766518994764L;
      int var8 = Util140.getValue_2();
      µ var10000 = var1;
      if (var8 != 0) {
         if (var1 == null) {
            return null;
         }

         var1.µ_ú_2 = method_001(new Object[]{var1.µ_ú_2, var2, var6, var5});
         var10000 = var1;
      }

      int var9;
      int var10;
      int var11;
      label63: {
         var9 = var10000.ª_ÿ_2.int_ê_2;
         var10 = var1.ª_þ_2.int_ê_2;
         var11 = var2.int_ê_2;
         ª var14 = var5;
         if (var8 != 0) {
            if (var5 == null) {
               var15 = Integer.MAX_VALUE;
               break label63;
            }

            var14 = var5;
         }

         var15 = var14.int_ê_2;
      }

      int var12 = var15;
      int var16 = var11;
      int var10001 = var10;
      int var10002 = var8;
      if (var3 >= 0L) {
         if (var8 != 0) {
            if (var11 >= var10) {
               return var1;
            }

            var16 = var12;
            var10001 = var9;
         }

         var10002 = var8;
      }

      if (var3 > 0L) {
         if (var10002 != 0) {
            if (var16 <= var10001) {
               return var1;
            }

            var16 = var11;
            var10001 = var9;
         }

         var10002 = var8;
      }

      if (var10002 != 0) {
         if (var16 <= var10001) {
            if (var12 >= var10) {
               return var1.µ_ú_2;
            }

            return new µ(var1, var5, var1.ª_þ_2);
         }

         var16 = var12;
         var10001 = var10;
      }

      if (var16 >= var10001) {
         return new µ(var1, var1.ª_ÿ_2, var2);
      }

      var1.µ_ú_2 = new µ(var1, var5, var1.ª_þ_2);
      return new µ(var1, var1.ª_ÿ_2, var2);
   }

   static int invoke_2(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/inject/µ
      // 11: astore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/µ.encKey_a_2 J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: istore 5
      // 21: aload 3
      // 22: astore 6
      // 24: aload 6
      // 26: ifnull 38
      // 29: iinc 4 1
      // 2c: aload 6
      // 2e: getfield rip/breeze/inject/µ.µ_ú_2 Lrip/breeze/inject/µ;
      // 31: astore 6
      // 33: iload 5
      // 35: ifne 24
      // 38: iload 4
      // 3a: lload 1
      // 3b: lconst_0
      // 3c: lcmp
      // 3d: iflt 35
      // 40: ireturn
   }

   static int invoke_3(Object[] var0) {
      µ var1 = (µ)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 63515117731640L;
      return 2 + 8 * method_002(new Object[]{var4, var1});
   }

   static void invoke_4(Object[] param0) {
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
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/inject/µ
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/ð
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic rip/breeze/inject/µ.encKey_a_2 J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 54140845192556
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 41151567860986
      // 02c: lxor
      // 02d: lstore 7
      // 02f: pop2
      // 030: aload 2
      // 031: lload 7
      // 033: aload 1
      // 034: bipush 2
      // 035: anewarray 4
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
      // 046: invokestatic rip/breeze/inject/µ.method_002 ([Ljava/lang/Object;)I
      // 049: lload 5
      // 04b: bipush 2
      // 04c: anewarray 4
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 1
      // 056: swap
      // 057: aastore
      // 058: dup_x1
      // 059: swap
      // 05a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 063: pop
      // 064: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 067: aload 1
      // 068: astore 9
      // 06a: istore 10
      // 06c: aload 9
      // 06e: ifnull 104
      // 071: aload 2
      // 072: aload 9
      // 074: getfield rip/breeze/inject/µ.ª_ÿ_2 Lrip/breeze/inject/ª;
      // 077: getfield rip/breeze/inject/ª.int_ê_2 I
      // 07a: lload 5
      // 07c: bipush 2
      // 07d: anewarray 4
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 1
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 0
      // 08f: swap
      // 090: aastore
      // 091: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 094: aload 9
      // 096: getfield rip/breeze/inject/µ.ª_þ_2 Lrip/breeze/inject/ª;
      // 099: getfield rip/breeze/inject/ª.int_ê_2 I
      // 09c: lload 5
      // 09e: bipush 2
      // 09f: anewarray 4
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0b6: aload 9
      // 0b8: getfield rip/breeze/inject/µ.ª_ý_2 Lrip/breeze/inject/ª;
      // 0bb: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0be: lload 5
      // 0c0: bipush 2
      // 0c1: anewarray 4
      // 0c4: dup_x2
      // 0c5: dup_x2
      // 0c6: pop
      // 0c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0d8: aload 9
      // 0da: getfield rip/breeze/inject/µ.int_ü_2 I
      // 0dd: lload 5
      // 0df: bipush 2
      // 0e0: anewarray 4
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f1: bipush 0
      // 0f2: swap
      // 0f3: aastore
      // 0f4: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0f7: pop
      // 0f8: aload 9
      // 0fa: getfield rip/breeze/inject/µ.µ_ú_2 Lrip/breeze/inject/µ;
      // 0fd: astore 9
      // 0ff: iload 10
      // 101: ifne 06c
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 0ff
      // 10a: return
   }
}
