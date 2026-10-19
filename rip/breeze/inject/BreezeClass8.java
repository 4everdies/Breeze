package rip.breeze.inject;

import java.util.List;

public class BreezeClass8 extends BreezeClass11 {
   public String string_ý;
   public int int_ü;
   public String string_û;
   public String string_ú;
   public List<String> list_ù;
   public List<գ> list_ø;
   public List<զ> list_ö;
   public List<ե> list_õ;
   public List<String> list_ô;
   public List<դ> list_ó;

   public BreezeClass8(String param1, int param2, String param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/BreezeClass8.45057752859932L J
      // 03: lload 4
      // 05: lxor
      // 06: lstore 4
      // 08: lload 4
      // 0a: dup2
      // 0b: ldc2_w 73181480750073
      // 0e: lxor
      // 0f: lstore 6
      // 11: pop2
      // 12: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 15: aload 0
      // 16: lload 6
      // 18: ldc 589824
      // 1a: invokespecial rip/breeze/inject/BreezeClass11.<init> (JI)V
      // 1d: istore 8
      // 1f: aload 0
      // 20: iload 8
      // 22: ifne 4b
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: ldc rip/breeze/inject/BreezeClass8
      // 2a: if_acmpeq 40
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 33: athrow
      // 34: new java/lang/IllegalStateException
      // 37: dup
      // 38: invokespecial java/lang/IllegalStateException.<init> ()V
      // 3b: athrow
      // 3c: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: putfield rip/breeze/inject/BreezeClass8.string_ý Ljava/lang/String;
      // 45: aload 0
      // 46: iload 2
      // 47: putfield rip/breeze/inject/BreezeClass8.int_ü I
      // 4a: aload 0
      // 4b: aload 3
      // 4c: putfield rip/breeze/inject/BreezeClass8.string_û Ljava/lang/String;
      // 4f: return
      // try (16 -> 22): 23 java/lang/IllegalStateException
      // try (19 -> 29): 29 java/lang/IllegalStateException
   }

   public BreezeClass8(int var1, String var2, int var3, String var4, List var5, List var6, List var7, List var8, List var9, long var10) {
      var10 = 45057752859932L ^ var10;
      long var12 = var10 ^ 95160391542625L;
      super(var12, var1);
      this.string_ý = var2;
      this.int_ü = var3;
      this.string_û = var4;
      this.list_ø = var5;
      this.list_ö = var6;
      this.list_õ = var7;
      this.list_ô = var8;
      this.list_ó = var9;
   }

   @Override
   public void processAll_7(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      this.string_ú = var2;
   }

   @Override
   public void processAll(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 16: istore 5
      // 18: lload 3
      // 19: lconst_0
      // 1a: lcmp
      // 1b: ifle 4f
      // 1e: aload 0
      // 1f: getfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 22: iload 5
      // 24: ifeq 48
      // 27: ifnonnull 44
      // 2a: goto 31
      // 2d: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 30: athrow
      // 31: aload 0
      // 32: new java/util/ArrayList
      // 35: dup
      // 36: bipush 5
      // 37: invokespecial java/util/ArrayList.<init> (I)V
      // 3a: putfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 48: aload 2
      // 49: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4e: pop
      // 4f: return
      // try (15 -> 24): 25 java/lang/IllegalStateException
      // try (23 -> 33): 34 java/lang/IllegalStateException
   }

   @Override
   public void processAll_2(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: pop
      // 26: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 29: istore 7
      // 2b: lload 4
      // 2d: lconst_0
      // 2e: lcmp
      // 2f: iflt 6d
      // 32: aload 0
      // 33: getfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 36: iload 7
      // 38: ifeq 5c
      // 3b: ifnonnull 58
      // 3e: goto 45
      // 41: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: aload 0
      // 46: new java/util/ArrayList
      // 49: dup
      // 4a: bipush 5
      // 4b: invokespecial java/util/ArrayList.<init> (I)V
      // 4e: putfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 51: goto 58
      // 54: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 5c: new rip/breeze/inject/գ
      // 5f: dup
      // 60: aload 2
      // 61: iload 3
      // 62: aload 6
      // 64: invokespecial rip/breeze/inject/գ.<init> (Ljava/lang/String;ILjava/lang/String;)V
      // 67: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6c: pop
      // 6d: return
      // try (26 -> 35): 36 java/lang/IllegalStateException
      // try (34 -> 44): 45 java/lang/IllegalStateException
   }

   @Override
   public void processAll_3(Object... param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast [Ljava/lang/String;
      // 23: astore 6
      // 25: pop
      // 26: lload 4
      // 28: dup2
      // 29: ldc2_w 81610045886150
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 33: istore 9
      // 35: aload 0
      // 36: getfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 39: iload 9
      // 3b: ifeq 5f
      // 3e: ifnonnull 5b
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 47: athrow
      // 48: aload 0
      // 49: new java/util/ArrayList
      // 4c: dup
      // 4d: bipush 5
      // 4e: invokespecial java/util/ArrayList.<init> (I)V
      // 51: putfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 54: goto 5b
      // 57: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 5f: new rip/breeze/inject/զ
      // 62: dup
      // 63: aload 2
      // 64: iload 3
      // 65: lload 7
      // 67: aload 6
      // 69: bipush 2
      // 6a: anewarray 45
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 1
      // 70: swap
      // 71: aastore
      // 72: dup_x2
      // 73: dup_x2
      // 74: pop
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: bipush 0
      // 79: swap
      // 7a: aastore
      // 7b: invokestatic rip/breeze/inject/ԧ.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 7e: invokespecial rip/breeze/inject/զ.<init> (Ljava/lang/String;ILjava/util/List;)V
      // 81: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 86: pop
      // 87: return
      // try (32 -> 37): 38 java/lang/IllegalStateException
      // try (36 -> 46): 47 java/lang/IllegalStateException
   }

   @Override
   public void processAll_4(Object... param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast [Ljava/lang/String;
      // 24: astore 6
      // 26: pop
      // 27: lload 2
      // 28: dup2
      // 29: ldc2_w 14916319992934
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 33: istore 9
      // 35: aload 0
      // 36: getfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 39: iload 9
      // 3b: ifne 5f
      // 3e: ifnonnull 5b
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 47: athrow
      // 48: aload 0
      // 49: new java/util/ArrayList
      // 4c: dup
      // 4d: bipush 5
      // 4e: invokespecial java/util/ArrayList.<init> (I)V
      // 51: putfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 54: goto 5b
      // 57: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 5f: new rip/breeze/inject/ե
      // 62: dup
      // 63: aload 4
      // 65: iload 5
      // 67: lload 7
      // 69: aload 6
      // 6b: bipush 2
      // 6c: anewarray 45
      // 6f: dup_x1
      // 70: swap
      // 71: bipush 1
      // 72: swap
      // 73: aastore
      // 74: dup_x2
      // 75: dup_x2
      // 76: pop
      // 77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a: bipush 0
      // 7b: swap
      // 7c: aastore
      // 7d: invokestatic rip/breeze/inject/ԧ.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 80: invokespecial rip/breeze/inject/ե.<init> (Ljava/lang/String;ILjava/util/List;)V
      // 83: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 88: pop
      // 89: return
      // try (32 -> 37): 38 java/lang/IllegalStateException
      // try (36 -> 46): 47 java/lang/IllegalStateException
   }

   @Override
   public void processAll_5(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/String
      // 1b: astore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Integer
      // 23: invokevirtual java/lang/Integer.intValue ()I
      // 26: istore 5
      // 28: pop
      // 29: iload 2
      // 2a: i2l
      // 2b: bipush 48
      // 2d: lshl
      // 2e: iload 3
      // 2f: i2l
      // 30: bipush 32
      // 32: lshl
      // 33: bipush 16
      // 35: lushr
      // 36: lor
      // 37: iload 5
      // 39: i2l
      // 3a: bipush 48
      // 3c: lshl
      // 3d: bipush 48
      // 3f: lushr
      // 40: lor
      // 41: lstore 6
      // 43: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 46: istore 8
      // 48: aload 0
      // 49: getfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 4c: iload 8
      // 4e: ifne 72
      // 51: ifnonnull 6e
      // 54: goto 5b
      // 57: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: new java/util/ArrayList
      // 5f: dup
      // 60: bipush 5
      // 61: invokespecial java/util/ArrayList.<init> (I)V
      // 64: putfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 67: goto 6e
      // 6a: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 72: aload 4
      // 74: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 79: pop
      // 7a: return
      // try (46 -> 51): 52 java/lang/IllegalStateException
      // try (50 -> 60): 61 java/lang/IllegalStateException
   }

   @Override
   public void processAll_6(Object... param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast [Ljava/lang/String;
      // 19: astore 5
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 42141906524615
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 28: istore 8
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 2e: iload 8
      // 30: ifne 54
      // 33: ifnonnull 50
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: new java/util/ArrayList
      // 41: dup
      // 42: bipush 5
      // 43: invokespecial java/util/ArrayList.<init> (I)V
      // 46: putfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 54: new rip/breeze/inject/դ
      // 57: dup
      // 58: aload 4
      // 5a: lload 6
      // 5c: aload 5
      // 5e: bipush 2
      // 5f: anewarray 45
      // 62: dup_x1
      // 63: swap
      // 64: bipush 1
      // 65: swap
      // 66: aastore
      // 67: dup_x2
      // 68: dup_x2
      // 69: pop
      // 6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: invokestatic rip/breeze/inject/ԧ.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 73: invokespecial rip/breeze/inject/դ.<init> (Ljava/lang/String;Ljava/util/List;)V
      // 76: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7b: pop
      // 7c: return
      // try (26 -> 31): 32 java/lang/IllegalStateException
      // try (30 -> 40): 41 java/lang/IllegalStateException
   }

   public void invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   @Override
   public void processAll_7(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/î
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/BreezeClass8.45057752859932L J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 5833081340470
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 131796459265951
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 4565507000486
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 104783898419071
      // 033: lxor
      // 034: dup2
      // 035: bipush 48
      // 037: lushr
      // 038: l2i
      // 039: istore 11
      // 03b: dup2
      // 03c: bipush 16
      // 03e: lshl
      // 03f: bipush 32
      // 041: lushr
      // 042: l2i
      // 043: istore 12
      // 045: dup2
      // 046: bipush 48
      // 048: lshl
      // 049: bipush 48
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 13
      // 04f: pop2
      // 050: dup2
      // 051: ldc2_w 65611779407655
      // 054: lxor
      // 055: lstore 14
      // 057: dup2
      // 058: ldc2_w 49329302772651
      // 05b: lxor
      // 05c: lstore 16
      // 05e: dup2
      // 05f: ldc2_w 110764564375099
      // 062: lxor
      // 063: lstore 18
      // 065: dup2
      // 066: ldc2_w 94206886572124
      // 069: lxor
      // 06a: lstore 20
      // 06c: pop2
      // 06d: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 070: aload 2
      // 071: aload 0
      // 072: getfield rip/breeze/inject/BreezeClass8.string_ý Ljava/lang/String;
      // 075: aload 0
      // 076: getfield rip/breeze/inject/BreezeClass8.int_ü I
      // 079: aload 0
      // 07a: getfield rip/breeze/inject/BreezeClass8.string_û Ljava/lang/String;
      // 07d: lload 9
      // 07f: bipush 4
      // 080: anewarray 45
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 3
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: bipush 2
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x1
      // 09a: swap
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: invokevirtual rip/breeze/inject/î.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass11;
      // 0a1: astore 22
      // 0a3: istore 23
      // 0a5: aload 22
      // 0a7: ifnonnull 0af
      // 0aa: return
      // 0ab: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: lload 3
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: iflt 0ed
      // 0b6: iload 23
      // 0b8: ifeq 0ed
      // 0bb: getfield rip/breeze/inject/BreezeClass8.string_ú Ljava/lang/String;
      // 0be: ifnull 0ec
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c7: athrow
      // 0c8: aload 22
      // 0ca: aload 0
      // 0cb: getfield rip/breeze/inject/BreezeClass8.string_ú Ljava/lang/String;
      // 0ce: lload 14
      // 0d0: bipush 2
      // 0d1: anewarray 45
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 1
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: invokevirtual rip/breeze/inject/BreezeClass11.processAll ([Ljava/lang/Object;)V
      // 0e5: goto 0ec
      // 0e8: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 0f0: iload 23
      // 0f2: lload 3
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 167
      // 0f8: ifeq 165
      // 0fb: ifnull 161
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 104: athrow
      // 105: bipush 0
      // 106: istore 24
      // 108: aload 0
      // 109: getfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 10c: invokeinterface java/util/List.size ()I 1
      // 111: istore 25
      // 113: iload 24
      // 115: iload 25
      // 117: if_icmpge 161
      // 11a: aload 22
      // 11c: aload 0
      // 11d: getfield rip/breeze/inject/BreezeClass8.list_ù Ljava/util/List;
      // 120: iload 24
      // 122: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 127: checkcast java/lang/String
      // 12a: lload 20
      // 12c: bipush 2
      // 12d: anewarray 45
      // 130: dup_x2
      // 131: dup_x2
      // 132: pop
      // 133: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 136: bipush 1
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: invokevirtual rip/breeze/inject/BreezeClass11.processAll_2 ([Ljava/lang/Object;)V
      // 141: iinc 24 1
      // 144: iload 23
      // 146: lload 3
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 151
      // 14c: ifeq 1d6
      // 14f: iload 23
      // 151: ifne 113
      // 154: lload 3
      // 155: lconst_0
      // 156: lcmp
      // 157: ifle 144
      // 15a: goto 161
      // 15d: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 160: athrow
      // 161: aload 0
      // 162: getfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 165: iload 23
      // 167: lload 3
      // 168: lconst_0
      // 169: lcmp
      // 16a: iflt 1dc
      // 16d: ifeq 1da
      // 170: ifnull 1d6
      // 173: goto 17a
      // 176: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 179: athrow
      // 17a: bipush 0
      // 17b: istore 24
      // 17d: aload 0
      // 17e: getfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 181: invokeinterface java/util/List.size ()I 1
      // 186: istore 25
      // 188: iload 24
      // 18a: iload 25
      // 18c: if_icmpge 1d6
      // 18f: aload 0
      // 190: lload 3
      // 191: lconst_0
      // 192: lcmp
      // 193: iflt 24c
      // 196: getfield rip/breeze/inject/BreezeClass8.list_ø Ljava/util/List;
      // 199: iload 24
      // 19b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1a0: checkcast rip/breeze/inject/գ
      // 1a3: aload 22
      // 1a5: lload 5
      // 1a7: bipush 2
      // 1a8: anewarray 45
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x1
      // 1b5: swap
      // 1b6: bipush 0
      // 1b7: swap
      // 1b8: aastore
      // 1b9: invokevirtual rip/breeze/inject/գ.method_001 ([Ljava/lang/Object;)V
      // 1bc: iinc 24 1
      // 1bf: iload 23
      // 1c1: ifeq 24b
      // 1c4: iload 23
      // 1c6: ifne 188
      // 1c9: lload 3
      // 1ca: lconst_0
      // 1cb: lcmp
      // 1cc: ifle 1bf
      // 1cf: goto 1d6
      // 1d2: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: getfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 1da: iload 23
      // 1dc: lload 3
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 251
      // 1e2: ifeq 24f
      // 1e5: ifnull 24b
      // 1e8: goto 1ef
      // 1eb: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ee: athrow
      // 1ef: bipush 0
      // 1f0: istore 24
      // 1f2: aload 0
      // 1f3: getfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 1f6: invokeinterface java/util/List.size ()I 1
      // 1fb: istore 25
      // 1fd: iload 24
      // 1ff: iload 25
      // 201: if_icmpge 24b
      // 204: aload 0
      // 205: lload 3
      // 206: lconst_0
      // 207: lcmp
      // 208: iflt 2c1
      // 20b: getfield rip/breeze/inject/BreezeClass8.list_ö Ljava/util/List;
      // 20e: iload 24
      // 210: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 215: checkcast rip/breeze/inject/զ
      // 218: aload 22
      // 21a: lload 7
      // 21c: bipush 2
      // 21d: anewarray 45
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 1
      // 227: swap
      // 228: aastore
      // 229: dup_x1
      // 22a: swap
      // 22b: bipush 0
      // 22c: swap
      // 22d: aastore
      // 22e: invokevirtual rip/breeze/inject/զ.processAll ([Ljava/lang/Object;)V
      // 231: iinc 24 1
      // 234: iload 23
      // 236: ifeq 2c0
      // 239: iload 23
      // 23b: ifne 1fd
      // 23e: lload 3
      // 23f: lconst_0
      // 240: lcmp
      // 241: iflt 234
      // 244: goto 24b
      // 247: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 24a: athrow
      // 24b: aload 0
      // 24c: getfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 24f: iload 23
      // 251: lload 3
      // 252: lconst_0
      // 253: lcmp
      // 254: ifle 2c6
      // 257: ifeq 2c4
      // 25a: ifnull 2c0
      // 25d: goto 264
      // 260: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 263: athrow
      // 264: bipush 0
      // 265: istore 24
      // 267: aload 0
      // 268: getfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 26b: invokeinterface java/util/List.size ()I 1
      // 270: istore 25
      // 272: iload 24
      // 274: iload 25
      // 276: if_icmpge 2c0
      // 279: aload 0
      // 27a: lload 3
      // 27b: lconst_0
      // 27c: lcmp
      // 27d: ifle 346
      // 280: getfield rip/breeze/inject/BreezeClass8.list_õ Ljava/util/List;
      // 283: iload 24
      // 285: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 28a: checkcast rip/breeze/inject/ե
      // 28d: lload 18
      // 28f: aload 22
      // 291: bipush 2
      // 292: anewarray 45
      // 295: dup_x1
      // 296: swap
      // 297: bipush 1
      // 298: swap
      // 299: aastore
      // 29a: dup_x2
      // 29b: dup_x2
      // 29c: pop
      // 29d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a0: bipush 0
      // 2a1: swap
      // 2a2: aastore
      // 2a3: invokevirtual rip/breeze/inject/ե.processAll ([Ljava/lang/Object;)V
      // 2a6: iinc 24 1
      // 2a9: iload 23
      // 2ab: ifeq 345
      // 2ae: iload 23
      // 2b0: ifne 272
      // 2b3: lload 3
      // 2b4: lconst_0
      // 2b5: lcmp
      // 2b6: ifle 2a9
      // 2b9: goto 2c0
      // 2bc: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: getfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 2c4: iload 23
      // 2c6: ifeq 349
      // 2c9: ifnull 345
      // 2cc: goto 2d3
      // 2cf: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d2: athrow
      // 2d3: bipush 0
      // 2d4: istore 24
      // 2d6: aload 0
      // 2d7: getfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 2da: invokeinterface java/util/List.size ()I 1
      // 2df: istore 25
      // 2e1: iload 24
      // 2e3: iload 25
      // 2e5: if_icmpge 345
      // 2e8: aload 22
      // 2ea: aload 0
      // 2eb: getfield rip/breeze/inject/BreezeClass8.list_ô Ljava/util/List;
      // 2ee: iload 24
      // 2f0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2f5: iload 11
      // 2f7: i2c
      // 2f8: swap
      // 2f9: iload 12
      // 2fb: swap
      // 2fc: checkcast java/lang/String
      // 2ff: iload 13
      // 301: bipush 4
      // 302: anewarray 45
      // 305: dup_x1
      // 306: swap
      // 307: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30a: bipush 3
      // 30b: swap
      // 30c: aastore
      // 30d: dup_x1
      // 30e: swap
      // 30f: bipush 2
      // 310: swap
      // 311: aastore
      // 312: dup_x1
      // 313: swap
      // 314: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 317: bipush 1
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31f: bipush 0
      // 320: swap
      // 321: aastore
      // 322: invokevirtual rip/breeze/inject/BreezeClass11.processAll_6 ([Ljava/lang/Object;)V
      // 325: iinc 24 1
      // 328: iload 23
      // 32a: lload 3
      // 32b: lconst_0
      // 32c: lcmp
      // 32d: iflt 335
      // 330: ifeq 390
      // 333: iload 23
      // 335: ifne 2e1
      // 338: lload 3
      // 339: lconst_0
      // 33a: lcmp
      // 33b: ifle 328
      // 33e: goto 345
      // 341: invokestatic rip/breeze/inject/BreezeClass8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 344: athrow
      // 345: aload 0
      // 346: getfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 349: ifnull 390
      // 34c: bipush 0
      // 34d: istore 24
      // 34f: aload 0
      // 350: getfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 353: invokeinterface java/util/List.size ()I 1
      // 358: istore 25
      // 35a: iload 24
      // 35c: iload 25
      // 35e: if_icmpge 390
      // 361: aload 0
      // 362: getfield rip/breeze/inject/BreezeClass8.list_ó Ljava/util/List;
      // 365: iload 24
      // 367: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 36c: checkcast rip/breeze/inject/դ
      // 36f: aload 22
      // 371: lload 16
      // 373: bipush 2
      // 374: anewarray 45
      // 377: dup_x2
      // 378: dup_x2
      // 379: pop
      // 37a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37d: bipush 1
      // 37e: swap
      // 37f: aastore
      // 380: dup_x1
      // 381: swap
      // 382: bipush 0
      // 383: swap
      // 384: aastore
      // 385: invokevirtual rip/breeze/inject/դ.method_001 ([Ljava/lang/Object;)V
      // 388: iinc 24 1
      // 38b: iload 23
      // 38d: ifne 35a
      // 390: return
      // try (107 -> 110): 110 java/lang/IllegalStateException
      // try (112 -> 121): 122 java/lang/IllegalStateException
      // try (119 -> 143): 144 java/lang/IllegalStateException
      // try (147 -> 155): 156 java/lang/IllegalStateException
      // try (167 -> 198): 203 java/lang/IllegalStateException
      // try (207 -> 214): 215 java/lang/IllegalStateException
      // try (226 -> 257): 262 java/lang/IllegalStateException
      // try (266 -> 273): 274 java/lang/IllegalStateException
      // try (285 -> 316): 321 java/lang/IllegalStateException
      // try (325 -> 332): 333 java/lang/IllegalStateException
      // try (344 -> 375): 380 java/lang/IllegalStateException
      // try (384 -> 387): 388 java/lang/IllegalStateException
      // try (399 -> 446): 451 java/lang/IllegalStateException
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
   }
}
