package rip.breeze.inject;

import java.util.ListIterator;

final class ը implements ListIterator {
   ջ ջ_ÿ_2;
   ջ ջ_þ_2;
   ջ ջ_ý_2;
   final թ թ_ü_2;

   ը(թ param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 09: aload 0
      // 0a: aload 1
      // 0b: putfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 0e: istore 5
      // 10: aload 0
      // 11: invokespecial java/lang/Object.<init> ()V
      // 14: iload 2
      // 15: iload 5
      // 17: ifne 1e
      // 1a: iflt 3b
      // 1d: iload 2
      // 1e: aload 1
      // 1f: bipush 0
      // 20: anewarray 4
      // 23: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 26: lload 3
      // 27: lconst_0
      // 28: lcmp
      // 29: ifle 50
      // 2c: iload 5
      // 2e: ifne 50
      // 31: if_icmple 47
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3a: athrow
      // 3b: new java/lang/IndexOutOfBoundsException
      // 3e: dup
      // 3f: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 42: athrow
      // 43: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 46: athrow
      // 47: iload 2
      // 48: aload 1
      // 49: bipush 0
      // 4a: anewarray 4
      // 4d: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 50: if_icmpne 70
      // 53: aload 0
      // 54: aconst_null
      // 55: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 58: aload 0
      // 59: aload 1
      // 5a: bipush 0
      // 5b: anewarray 4
      // 5e: invokevirtual rip/breeze/inject/թ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 61: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 64: iload 5
      // 66: ifeq b9
      // 69: goto 70
      // 6c: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 6f: athrow
      // 70: aload 1
      // 71: bipush 0
      // 72: anewarray 4
      // 75: invokevirtual rip/breeze/inject/թ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 78: astore 6
      // 7a: bipush 0
      // 7b: istore 7
      // 7d: iload 7
      // 7f: iload 2
      // 80: if_icmpge aa
      // 83: aload 6
      // 85: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 88: astore 6
      // 8a: iinc 7 1
      // 8d: iload 5
      // 8f: lload 3
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt 9a
      // 95: ifne b0
      // 98: iload 5
      // 9a: ifeq 7d
      // 9d: lload 3
      // 9e: lconst_0
      // 9f: lcmp
      // a0: ifle 8d
      // a3: goto aa
      // a6: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // a9: athrow
      // aa: aload 0
      // ab: aload 6
      // ad: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // b0: aload 0
      // b1: aload 6
      // b3: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // b6: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // b9: return
      // try (16 -> 27): 28 java/lang/IndexOutOfBoundsException
      // try (26 -> 34): 34 java/lang/IndexOutOfBoundsException
      // try (41 -> 53): 54 java/lang/IndexOutOfBoundsException
      // try (69 -> 78): 83 java/lang/IndexOutOfBoundsException
   }

   @Override
   public boolean hasNext() {
      long var1 = 20959767783664L;

      try {
         if (this.ջ_ÿ_2 != null) {
            return true;
         }
      } catch (IndexOutOfBoundsException var3) {
         throw method_001(var3);
      }

      return false;
   }

   @Override
   public Object next() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 44952908075373
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 10: iload 3
      // 11: ifne 2e
      // 14: ifnonnull 2a
      // 17: goto 1e
      // 1a: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1d: athrow
      // 1e: new java/util/NoSuchElementException
      // 21: dup
      // 22: invokespecial java/util/NoSuchElementException.<init> ()V
      // 25: athrow
      // 26: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 2e: astore 4
      // 30: aload 0
      // 31: aload 4
      // 33: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 36: aload 0
      // 37: aload 4
      // 39: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 3c: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 3f: aload 0
      // 40: aload 4
      // 42: putfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 45: aload 4
      // 47: areturn
      // try (6 -> 11): 12 java/lang/IndexOutOfBoundsException
      // try (10 -> 18): 18 java/lang/IndexOutOfBoundsException
   }

   @Override
   public void remove() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 129720560560811
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 57158767443298
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 13: istore 5
      // 15: aload 0
      // 16: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 19: iload 5
      // 1b: ifeq 3f
      // 1e: ifnull 99
      // 21: goto 28
      // 24: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 27: athrow
      // 28: aload 0
      // 29: iload 5
      // 2b: ifeq 65
      // 2e: goto 35
      // 31: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 34: athrow
      // 35: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 43: if_acmpne 5d
      // 46: aload 0
      // 47: aload 0
      // 48: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 4b: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 4e: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 51: iload 5
      // 53: ifne 6f
      // 56: goto 5d
      // 59: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: goto 65
      // 61: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 69: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 6c: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 6f: aload 0
      // 70: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 73: aload 0
      // 74: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 77: lload 3
      // 78: dup2_x1
      // 79: pop2
      // 7a: bipush 2
      // 7b: anewarray 4
      // 7e: dup_x1
      // 7f: swap
      // 80: bipush 1
      // 81: swap
      // 82: aastore
      // 83: dup_x2
      // 84: dup_x2
      // 85: pop
      // 86: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: invokevirtual rip/breeze/inject/թ.method_020 ([Ljava/lang/Object;)V
      // 8f: aload 0
      // 90: aconst_null
      // 91: putfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 94: iload 5
      // 96: ifne a5
      // 99: new java/lang/IllegalStateException
      // 9c: dup
      // 9d: invokespecial java/lang/IllegalStateException.<init> ()V
      // a0: athrow
      // a1: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // a4: athrow
      // a5: return
      // try (12 -> 17): 18 java/lang/IndexOutOfBoundsException
      // try (16 -> 23): 24 java/lang/IndexOutOfBoundsException
      // try (20 -> 27): 28 java/lang/IndexOutOfBoundsException
      // try (30 -> 40): 41 java/lang/IndexOutOfBoundsException
      // try (33 -> 44): 45 java/lang/IndexOutOfBoundsException
      // try (51 -> 82): 82 java/lang/IndexOutOfBoundsException
   }

   @Override
   public boolean hasPrevious() {
      long var1 = 100281286217459L;

      try {
         if (this.ջ_þ_2 != null) {
            return true;
         }
      } catch (IndexOutOfBoundsException var3) {
         throw method_001(var3);
      }

      return false;
   }

   @Override
   public Object previous() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 42266519625182
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 10: iload 3
      // 11: ifne 2e
      // 14: ifnonnull 2a
      // 17: goto 1e
      // 1a: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1d: athrow
      // 1e: new java/util/NoSuchElementException
      // 21: dup
      // 22: invokespecial java/util/NoSuchElementException.<init> ()V
      // 25: athrow
      // 26: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 2e: astore 4
      // 30: aload 0
      // 31: aload 4
      // 33: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 36: aload 0
      // 37: aload 4
      // 39: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 3c: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 3f: aload 0
      // 40: aload 4
      // 42: putfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 45: aload 4
      // 47: areturn
      // try (6 -> 11): 12 java/lang/IndexOutOfBoundsException
      // try (10 -> 18): 18 java/lang/IndexOutOfBoundsException
   }

   @Override
   public int nextIndex() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 102043855864519
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 96306164829065
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 13: istore 5
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 39
      // 1b: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 1e: ifnonnull 38
      // 21: goto 28
      // 24: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 2c: bipush 0
      // 2d: anewarray 4
      // 30: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 33: ireturn
      // 34: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 37: athrow
      // 38: aload 0
      // 39: iload 5
      // 3b: ifne 72
      // 3e: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 41: getfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 44: ifnonnull 71
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 52: aload 0
      // 53: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 56: lload 3
      // 57: bipush 1
      // 58: anewarray 4
      // 5b: dup_x2
      // 5c: dup_x2
      // 5d: pop
      // 5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61: bipush 0
      // 62: swap
      // 63: aastore
      // 64: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 67: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 6a: goto 71
      // 6d: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 70: athrow
      // 71: aload 0
      // 72: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 75: getfield rip/breeze/inject/ջ.int_é_2 I
      // 78: ireturn
      // try (12 -> 17): 18 java/lang/IndexOutOfBoundsException
      // try (15 -> 26): 26 java/lang/IndexOutOfBoundsException
      // try (29 -> 34): 35 java/lang/IndexOutOfBoundsException
      // try (31 -> 53): 54 java/lang/IndexOutOfBoundsException
   }

   @Override
   public int previousIndex() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 65850883732189
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 53592399625107
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 13: istore 5
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 2f
      // 1b: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 1e: ifnonnull 2e
      // 21: goto 28
      // 24: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 27: athrow
      // 28: bipush -1
      // 29: ireturn
      // 2a: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: iload 5
      // 31: ifne 68
      // 34: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 37: getfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 3a: ifnonnull 67
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 48: aload 0
      // 49: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 4c: lload 3
      // 4d: bipush 1
      // 4e: anewarray 4
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 5d: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 66: athrow
      // 67: aload 0
      // 68: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 6b: getfield rip/breeze/inject/ջ.int_é_2 I
      // 6e: ireturn
      // try (12 -> 17): 18 java/lang/IndexOutOfBoundsException
      // try (15 -> 22): 22 java/lang/IndexOutOfBoundsException
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (27 -> 49): 50 java/lang/IndexOutOfBoundsException
   }

   @Override
   public void add(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 76059362704704
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 126251573743912
      // 0d: lxor
      // 0e: lstore 4
      // 10: dup2
      // 11: ldc2_w 37013544088381
      // 14: lxor
      // 15: lstore 6
      // 17: dup2
      // 18: ldc2_w 129780464947130
      // 1b: lxor
      // 1c: lstore 8
      // 1e: pop2
      // 1f: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 22: istore 10
      // 24: aload 0
      // 25: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 28: iload 10
      // 2a: ifeq 84
      // 2d: ifnull 6d
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 3b: aload 0
      // 3c: getfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 3f: lload 4
      // 41: dup2_x1
      // 42: pop2
      // 43: aload 1
      // 44: checkcast rip/breeze/inject/ջ
      // 47: bipush 3
      // 48: anewarray 4
      // 4b: dup_x1
      // 4c: swap
      // 4d: bipush 2
      // 4e: swap
      // 4f: aastore
      // 50: dup_x1
      // 51: swap
      // 52: bipush 1
      // 53: swap
      // 54: aastore
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 61: iload 10
      // 63: ifne e1
      // 66: goto 6d
      // 69: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: iload 10
      // 70: ifeq c3
      // 73: goto 7a
      // 76: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 79: athrow
      // 7a: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 83: athrow
      // 84: ifnull bb
      // 87: aload 0
      // 88: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 8b: aload 0
      // 8c: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 8f: aload 1
      // 90: checkcast rip/breeze/inject/ջ
      // 93: lload 6
      // 95: bipush 3
      // 96: anewarray 4
      // 99: dup_x2
      // 9a: dup_x2
      // 9b: pop
      // 9c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f: bipush 2
      // a0: swap
      // a1: aastore
      // a2: dup_x1
      // a3: swap
      // a4: bipush 1
      // a5: swap
      // a6: aastore
      // a7: dup_x1
      // a8: swap
      // a9: bipush 0
      // aa: swap
      // ab: aastore
      // ac: invokevirtual rip/breeze/inject/թ.method_016 ([Ljava/lang/Object;)V
      // af: iload 10
      // b1: ifne e1
      // b4: goto bb
      // b7: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // ba: athrow
      // bb: aload 0
      // bc: goto c3
      // bf: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // c2: athrow
      // c3: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // c6: aload 1
      // c7: checkcast rip/breeze/inject/ջ
      // ca: lload 8
      // cc: bipush 2
      // cd: anewarray 4
      // d0: dup_x2
      // d1: dup_x2
      // d2: pop
      // d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d6: bipush 1
      // d7: swap
      // d8: aastore
      // d9: dup_x1
      // da: swap
      // db: bipush 0
      // dc: swap
      // dd: aastore
      // de: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // e1: aload 0
      // e2: aload 1
      // e3: checkcast rip/breeze/inject/ջ
      // e6: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // e9: aload 0
      // ea: aconst_null
      // eb: putfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // ee: return
      // try (20 -> 25): 26 java/lang/IndexOutOfBoundsException
      // try (24 -> 59): 60 java/lang/IndexOutOfBoundsException
      // try (28 -> 65): 66 java/lang/IndexOutOfBoundsException
      // try (62 -> 69): 70 java/lang/IndexOutOfBoundsException
      // try (72 -> 102): 103 java/lang/IndexOutOfBoundsException
      // try (73 -> 106): 107 java/lang/IndexOutOfBoundsException
   }

   @Override
   public void set(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/ը.encKey_a_2 J
      // 03: ldc2_w 24736202746307
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 36169482450433
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 14: istore 6
      // 16: aload 0
      // 17: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 1a: iload 6
      // 1c: ifne 68
      // 1f: ifnull 97
      // 22: goto 29
      // 25: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield rip/breeze/inject/ը.թ_ü_2 Lrip/breeze/inject/թ;
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 31: aload 1
      // 32: checkcast rip/breeze/inject/ջ
      // 35: lload 4
      // 37: bipush 3
      // 38: anewarray 4
      // 3b: dup_x2
      // 3c: dup_x2
      // 3d: pop
      // 3e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41: bipush 2
      // 42: swap
      // 43: aastore
      // 44: dup_x1
      // 45: swap
      // 46: bipush 1
      // 47: swap
      // 48: aastore
      // 49: dup_x1
      // 4a: swap
      // 4b: bipush 0
      // 4c: swap
      // 4d: aastore
      // 4e: invokevirtual rip/breeze/inject/թ.method_011 ([Ljava/lang/Object;)V
      // 51: aload 0
      // 52: iload 6
      // 54: ifne 8b
      // 57: goto 5e
      // 5a: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 5d: athrow
      // 5e: getfield rip/breeze/inject/ը.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 61: goto 68
      // 64: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 67: athrow
      // 68: aload 0
      // 69: getfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 6c: if_acmpne 83
      // 6f: aload 0
      // 70: aload 1
      // 71: checkcast rip/breeze/inject/ջ
      // 74: putfield rip/breeze/inject/ը.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 77: iload 6
      // 79: ifeq a3
      // 7c: goto 83
      // 7f: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 82: athrow
      // 83: aload 0
      // 84: goto 8b
      // 87: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 8a: athrow
      // 8b: aload 1
      // 8c: checkcast rip/breeze/inject/ջ
      // 8f: putfield rip/breeze/inject/ը.ջ_ÿ_2 Lrip/breeze/inject/ջ;
      // 92: iload 6
      // 94: ifeq a3
      // 97: new java/lang/IllegalStateException
      // 9a: dup
      // 9b: invokespecial java/lang/IllegalStateException.<init> ()V
      // 9e: athrow
      // 9f: invokestatic rip/breeze/inject/ը.method_001 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // a2: athrow
      // a3: return
      // try (12 -> 17): 18 java/lang/IndexOutOfBoundsException
      // try (16 -> 50): 51 java/lang/IndexOutOfBoundsException
      // try (20 -> 54): 55 java/lang/IndexOutOfBoundsException
      // try (57 -> 66): 67 java/lang/IndexOutOfBoundsException
      // try (60 -> 70): 71 java/lang/IndexOutOfBoundsException
      // try (73 -> 82): 82 java/lang/IndexOutOfBoundsException
   }

   private static IndexOutOfBoundsException invoke_1(IndexOutOfBoundsException var0) {
      return var0;
   }
}
