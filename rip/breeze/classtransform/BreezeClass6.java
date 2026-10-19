package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;

public class BreezeClass6 extends BreezeColor {

   public void processAll(Object[] var1) {
      ó var2 = (ó)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 42272879072481L;
      long var9 = var5 ^ 131660128515683L;
      long var11 = var5 ^ 129263607895849L;
      long var13 = var5 ^ 89072101053672L;
      ô var15 = new ô();

      try {
         this.processAll(new Object[]{var2, var3, var4, var15, var9});
         this.processAll_2(new Object[]{var2, var3, var4, var11, var15});
         if (var15.method_011(new Object[0])) {
            return;
         }
      } catch (զ var17) {
         throw getԶ(var17);
      }

      rip.breeze.inject.é var16 = խ.method_006(new Object[]{var4, var15, var7});
      խ.method_007(new Object[]{var4, var16, var13});
   }

   private void processAll(Object[] param1) {
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
      // 004: checkcast rip/breeze/classtransform/ó
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/é
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/inject/é
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast rip/breeze/classtransform/ô
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 6
      // 02a: pop
      // 02b: getstatic rip/breeze/classtransform/BreezeClass6.encKey_b J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 91567701955401
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 24433075079375
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 64311515487539
      // 047: lxor
      // 048: lstore 12
      // 04a: pop2
      // 04b: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 04e: aload 4
      // 050: getfield rip/breeze/inject/é.list_å_2 Ljava/util/List;
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 14
      // 05a: istore 15
      // 05c: aload 14
      // 05e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 063: ifeq 20e
      // 066: aload 14
      // 068: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06d: checkcast rip/breeze/inject/á
      // 070: astore 16
      // 072: aload 0
      // 073: lload 12
      // 075: ldc rip/breeze/classtransform/annotations/CShadow
      // 077: aload 16
      // 079: aload 2
      // 07a: bipush 4
      // 07b: anewarray 38
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 3
      // 081: swap
      // 082: aastore
      // 083: dup_x1
      // 084: swap
      // 085: bipush 2
      // 086: swap
      // 087: aastore
      // 088: dup_x1
      // 089: swap
      // 08a: bipush 1
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x2
      // 08e: dup_x2
      // 08f: pop
      // 090: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: invokevirtual rip/breeze/classtransform/BreezeClass6.ý ([Ljava/lang/Object;)Ljava/lang/annotation/Annotation;
      // 099: checkcast rip/breeze/classtransform/annotations/CShadow
      // 09c: astore 17
      // 09e: iload 15
      // 0a0: ifeq 0bd
      // 0a3: aload 17
      // 0a5: ifnonnull 0b6
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0ae: athrow
      // 0af: goto 05c
      // 0b2: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0b5: athrow
      // 0b6: aload 14
      // 0b8: invokeinterface java/util/Iterator.remove ()V 1
      // 0bd: aload 3
      // 0be: aload 17
      // 0c0: invokeinterface rip/breeze/classtransform/annotations/CShadow.value ()Ljava/lang/String; 1
      // 0c5: lload 10
      // 0c7: dup2_x1
      // 0c8: pop2
      // 0c9: bipush 3
      // 0ca: anewarray 38
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: bipush 2
      // 0d0: swap
      // 0d1: aastore
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: invokestatic rip/breeze/classtransform/MathUtil3.getList_2 ([Ljava/lang/Object;)Ljava/util/List;
      // 0e3: astore 18
      // 0e5: aload 18
      // 0e7: iload 15
      // 0e9: ifeq 113
      // 0ec: invokeinterface java/util/List.isEmpty ()Z 1
      // 0f1: ifeq 111
      // 0f4: goto 0fb
      // 0f7: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0fa: athrow
      // 0fb: new rip/breeze/classtransform/զ
      // 0fe: dup
      // 0ff: aload 3
      // 100: aload 4
      // 102: aload 17
      // 104: invokeinterface rip/breeze/classtransform/annotations/CShadow.value ()Ljava/lang/String; 1
      // 109: invokespecial rip/breeze/classtransform/զ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 10c: athrow
      // 10d: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 110: athrow
      // 111: aload 18
      // 113: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 118: astore 19
      // 11a: aload 19
      // 11c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 121: ifeq 209
      // 124: aload 19
      // 126: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12b: checkcast rip/breeze/inject/á
      // 12e: astore 20
      // 130: aload 17
      // 132: invokeinterface rip/breeze/classtransform/annotations/CShadow.makePublic ()Z 1
      // 137: lload 6
      // 139: lconst_0
      // 13a: lcmp
      // 13b: iflt 20b
      // 13e: iload 15
      // 140: ifeq 063
      // 143: iload 15
      // 145: lload 6
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 140
      // 14c: lload 6
      // 14e: lconst_0
      // 14f: lcmp
      // 150: iflt 198
      // 153: ifeq 196
      // 156: ifeq 189
      // 159: goto 160
      // 15c: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 15f: athrow
      // 160: aload 20
      // 162: aload 20
      // 164: getfield rip/breeze/inject/á.int_ý_2 I
      // 167: bipush 1
      // 168: bipush 2
      // 169: anewarray 38
      // 16c: dup_x1
      // 16d: swap
      // 16e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 171: bipush 1
      // 172: swap
      // 173: aastore
      // 174: dup_x1
      // 175: swap
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: invokestatic rip/breeze/classtransform/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 17f: putfield rip/breeze/inject/á.int_ý_2 I
      // 182: goto 189
      // 185: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 188: athrow
      // 189: aload 16
      // 18b: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 18e: aload 20
      // 190: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 193: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 196: iload 15
      // 198: ifeq 1b9
      // 19b: ifeq 1bf
      // 19e: goto 1a5
      // 1a1: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 1a4: athrow
      // 1a5: aload 16
      // 1a7: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 1aa: aload 20
      // 1ac: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 1af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b2: goto 1b9
      // 1b5: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 1b8: athrow
      // 1b9: ifeq 1bf
      // 1bc: goto 11a
      // 1bf: aload 5
      // 1c1: aload 4
      // 1c3: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 1c6: aload 16
      // 1c8: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 1cb: lload 8
      // 1cd: dup2_x1
      // 1ce: pop2
      // 1cf: aload 16
      // 1d1: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 1d4: aload 20
      // 1d6: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 1d9: bipush 5
      // 1da: anewarray 38
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 4
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: bipush 3
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 2
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x2
      // 1ed: dup_x2
      // 1ee: pop
      // 1ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f2: bipush 1
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: bipush 0
      // 1f8: swap
      // 1f9: aastore
      // 1fa: invokevirtual rip/breeze/classtransform/ô.method_008 ([Ljava/lang/Object;)V
      // 1fd: iload 15
      // 1ff: lload 6
      // 201: lconst_0
      // 202: lcmp
      // 203: iflt 20b
      // 206: ifne 11a
      // 209: iload 15
      // 20b: ifne 05c
      // 20e: return
      // try (91 -> 95): 96 rip/breeze/classtransform/զ
      // try (93 -> 99): 99 rip/breeze/classtransform/զ
      // try (130 -> 135): 136 rip/breeze/classtransform/զ
      // try (133 -> 146): 146 rip/breeze/classtransform/զ
      // try (166 -> 177): 178 rip/breeze/classtransform/զ
      // try (176 -> 200): 201 rip/breeze/classtransform/զ
      // try (208 -> 211): 212 rip/breeze/classtransform/զ
      // try (210 -> 219): 220 rip/breeze/classtransform/զ
   }

   private void processAll_2(Object[] param1) {
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
      // 004: checkcast rip/breeze/classtransform/ó
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/é
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/inject/é
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/classtransform/ô
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic rip/breeze/classtransform/BreezeClass6.encKey_b J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 91712703085677
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 126186620336738
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 56890931118194
      // 047: lxor
      // 048: lstore 12
      // 04a: pop2
      // 04b: invokestatic rip/breeze/classtransform/BreezeClass5.getValue_2 ()I
      // 04e: aload 4
      // 050: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 14
      // 05a: istore 15
      // 05c: aload 14
      // 05e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 063: ifeq 20c
      // 066: aload 14
      // 068: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06d: checkcast rip/breeze/inject/BreezeClass12
      // 070: astore 16
      // 072: aload 0
      // 073: ldc rip/breeze/classtransform/annotations/CShadow
      // 075: aload 16
      // 077: lload 8
      // 079: aload 2
      // 07a: bipush 4
      // 07b: anewarray 38
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 3
      // 081: swap
      // 082: aastore
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 2
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: invokevirtual rip/breeze/classtransform/BreezeClass6.ü ([Ljava/lang/Object;)Ljava/lang/annotation/Annotation;
      // 099: checkcast rip/breeze/classtransform/annotations/CShadow
      // 09c: astore 17
      // 09e: iload 15
      // 0a0: ifne 0bd
      // 0a3: aload 17
      // 0a5: ifnonnull 0b6
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0ae: athrow
      // 0af: goto 05c
      // 0b2: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0b5: athrow
      // 0b6: aload 14
      // 0b8: invokeinterface java/util/Iterator.remove ()V 1
      // 0bd: aload 3
      // 0be: aload 17
      // 0c0: invokeinterface rip/breeze/classtransform/annotations/CShadow.value ()Ljava/lang/String; 1
      // 0c5: lload 12
      // 0c7: dup2_x1
      // 0c8: pop2
      // 0c9: bipush 3
      // 0ca: anewarray 38
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: bipush 2
      // 0d0: swap
      // 0d1: aastore
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: invokestatic rip/breeze/classtransform/MathUtil3.getList ([Ljava/lang/Object;)Ljava/util/List;
      // 0e3: astore 18
      // 0e5: aload 18
      // 0e7: iload 15
      // 0e9: ifne 113
      // 0ec: invokeinterface java/util/List.isEmpty ()Z 1
      // 0f1: ifeq 111
      // 0f4: goto 0fb
      // 0f7: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 0fa: athrow
      // 0fb: new rip/breeze/classtransform/դ
      // 0fe: dup
      // 0ff: aload 3
      // 100: aload 4
      // 102: aload 17
      // 104: invokeinterface rip/breeze/classtransform/annotations/CShadow.value ()Ljava/lang/String; 1
      // 109: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 10c: athrow
      // 10d: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 110: athrow
      // 111: aload 18
      // 113: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 118: astore 19
      // 11a: aload 19
      // 11c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 121: ifeq 207
      // 124: aload 19
      // 126: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12b: checkcast rip/breeze/inject/BreezeClass12
      // 12e: astore 20
      // 130: aload 17
      // 132: invokeinterface rip/breeze/classtransform/annotations/CShadow.makePublic ()Z 1
      // 137: lload 5
      // 139: lconst_0
      // 13a: lcmp
      // 13b: iflt 209
      // 13e: iload 15
      // 140: ifne 063
      // 143: iload 15
      // 145: lload 5
      // 147: lconst_0
      // 148: lcmp
      // 149: iflt 140
      // 14c: lload 5
      // 14e: lconst_0
      // 14f: lcmp
      // 150: iflt 198
      // 153: ifne 196
      // 156: ifeq 189
      // 159: goto 160
      // 15c: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 15f: athrow
      // 160: aload 20
      // 162: aload 20
      // 164: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 167: bipush 1
      // 168: bipush 2
      // 169: anewarray 38
      // 16c: dup_x1
      // 16d: swap
      // 16e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 171: bipush 1
      // 172: swap
      // 173: aastore
      // 174: dup_x1
      // 175: swap
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: invokestatic rip/breeze/classtransform/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 17f: putfield rip/breeze/inject/BreezeClass12.int_û I
      // 182: goto 189
      // 185: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 188: athrow
      // 189: aload 16
      // 18b: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 18e: aload 20
      // 190: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 193: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 196: iload 15
      // 198: ifne 1b9
      // 19b: ifeq 1bf
      // 19e: goto 1a5
      // 1a1: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 1a4: athrow
      // 1a5: aload 16
      // 1a7: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 1aa: aload 20
      // 1ac: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 1af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b2: goto 1b9
      // 1b5: invokestatic rip/breeze/classtransform/BreezeClass6.getԶ (Lrip/breeze/classtransform/զ;)Lrip/breeze/classtransform/զ;
      // 1b8: athrow
      // 1b9: ifeq 1bf
      // 1bc: goto 11a
      // 1bf: aload 7
      // 1c1: aload 4
      // 1c3: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 1c6: aload 16
      // 1c8: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 1cb: aload 16
      // 1cd: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 1d0: aload 20
      // 1d2: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 1d5: lload 10
      // 1d7: bipush 5
      // 1d8: anewarray 38
      // 1db: dup_x2
      // 1dc: dup_x2
      // 1dd: pop
      // 1de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e1: bipush 4
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 3
      // 1e7: swap
      // 1e8: aastore
      // 1e9: dup_x1
      // 1ea: swap
      // 1eb: bipush 2
      // 1ec: swap
      // 1ed: aastore
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: bipush 1
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: invokevirtual rip/breeze/classtransform/ô.method_004 ([Ljava/lang/Object;)V
      // 1fb: iload 15
      // 1fd: lload 5
      // 1ff: lconst_0
      // 200: lcmp
      // 201: ifle 209
      // 204: ifeq 11a
      // 207: iload 15
      // 209: ifeq 05c
      // 20c: return
      // try (91 -> 95): 96 rip/breeze/classtransform/զ
      // try (93 -> 99): 99 rip/breeze/classtransform/զ
      // try (130 -> 135): 136 rip/breeze/classtransform/զ
      // try (133 -> 146): 146 rip/breeze/classtransform/զ
      // try (166 -> 177): 178 rip/breeze/classtransform/զ
      // try (176 -> 200): 201 rip/breeze/classtransform/զ
      // try (208 -> 211): 212 rip/breeze/classtransform/զ
      // try (210 -> 219): 220 rip/breeze/classtransform/զ
   }

   private static զ getԶ(զ var0) {
      return var0;
   }
}
