package rip.breeze.inject;

final class ñ {
   private static final int CONST_Ÿ = 6;
   private int int_þ;
   private õ[] arr_ý = new õ[6];

   void processNullable(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:34 from source 18_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/õ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/ñ.encKey_a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 23438736584061
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 101052959137133
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2c: aload 2
      // 2d: astore 9
      // 2f: istore 10
      // 31: aload 9
      // 33: ifnull 84
      // 36: aload 0
      // 37: aload 9
      // 39: iload 10
      // 3b: ifne 61
      // 3e: lload 5
      // 40: bipush 2
      // 41: anewarray 4
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 1
      // 4b: swap
      // 4c: aastore
      // 4d: dup_x1
      // 4e: swap
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: invokevirtual rip/breeze/inject/ñ.checkCondition ([Ljava/lang/Object;)Z
      // 55: lload 3
      // 56: lconst_0
      // 57: lcmp
      // 58: ifle 81
      // 5b: ifne 78
      // 5e: aload 0
      // 5f: aload 9
      // 61: lload 7
      // 63: bipush 2
      // 64: anewarray 4
      // 67: dup_x2
      // 68: dup_x2
      // 69: pop
      // 6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d: bipush 1
      // 6e: swap
      // 6f: aastore
      // 70: dup_x1
      // 71: swap
      // 72: bipush 0
      // 73: swap
      // 74: aastore
      // 75: invokevirtual rip/breeze/inject/ñ.calculate ([Ljava/lang/Object;)V
      // 78: aload 9
      // 7a: getfield rip/breeze/inject/õ.õ_ý_2 Lrip/breeze/inject/õ;
      // 7d: astore 9
      // 7f: iload 10
      // 81: ifeq 31
      // 84: lload 3
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle 7f
      // 8a: return
   }

   õ[] invoke_2(Object[] var1) {
      õ[] var2 = new õ[this.int_þ];
      System.arraycopy(this.arr_ý, 0, var2, 0, this.int_þ);
      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private boolean checkCondition(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a ^ var3;
      int var10000 = Util140.getValue();
      int var5 = 0;
      int var6 = var10000;

      label38:
      while (true) {
         if (var5 < this.int_þ) {
            var8 = this.arr_ý[var5].string_ÿ_2.equals(var2.string_ÿ_2);
            int var10001 = var6;
            if (var3 >= 0L) {
               if (var6 != 0) {
                  break;
               }

               var10001 = var6;
            }

            if (var10001 != 0) {
               return var8;
            }

            if (var8) {
               return true;
            }

            var5++;
            if (var6 == 0) {
               continue;
            }
         }

         while (var3 < 0L) {
            if (var6 == 0) {
               continue label38;
            }
         }

         var8 = false;
         break;
      }

      return var8;
   }

   private void calculate(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a ^ var3;
      int var5 = Util140.getValue_2();
      ñ var10000 = this;
      if (var5 != 0) {
         label15: {
            int var8 = this.int_þ;
            int var10001 = this.arr_ý.length;
            if (var3 >= 0L) {
               if (this.int_þ < var10001) {
                  break label15;
               }

               var8 = this.arr_ý.length;
               var10001 = 6;
            }

            õ[] var6 = new õ[var8 + var10001];
            System.arraycopy(this.arr_ý, 0, var6, 0, this.int_þ);
            this.arr_ý = var6;
         }

         var10000 = this;
      }

      var10000.arr_ý[this.int_þ++] = var2;
   }
}
