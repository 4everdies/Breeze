package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import rip.breeze.StringDecryptor;

public class RotationUtil8 {
   private static final MathUtil11 CONST_A = new MathUtil11();
   private Map<String, Object> map_b = new HashMap<>();
   private final RotationUtil8 dataBuilder14_c;

   public RotationUtil8() {
      this(null);
   }

   public RotationUtil8(RotationUtil8 var1) {
      this(var1, new HashMap<>());
   }

   public RotationUtil8 getDataBuilder14(char var1, long var2, String var4) throws IllegalStateException {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ 122602200642596L;
      long var10001 = var5 ^ 90780885068164L;
      int var7 = (int)((var5 ^ 90780885068164L) >>> 48);
      int var8 = (int)((var5 ^ 90780885068164L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 95839683658067L;
      int var10 = (int)((var5 ^ 95839683658067L) >>> 48);
      int var11 = (int)((var5 ^ 95839683658067L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var5 ^ 66800866804335L;
      Util132 var15 = Util101.getDataBuilder11((short)var7, var4, var8, (char)var9);

      try {
         if (var15.dataBuilder12_a.isValid((short)var10, var11, (char)var12)) {
            throw new IllegalStateException(var15.dataBuilder12_a.toString());
         }
      } catch (IllegalStateException var16) {
         throw getIllegalStateException(var16);
      }

      this.map_b = var15.getById(var13);
      return this;
   }

   public boolean isValid(long var1, String var3) {
      var1 = 122602200642596L ^ var1;

      try {
         if (this.getObject(var3) != null) {
            return true;
         }
      } catch (IllegalStateException var4) {
         throw getIllegalStateException(var4);
      }

      return false;
   }

   private Object getObject(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/RotationUtil8.122602200642596L J
      // 003: ldc2_w 106275797246270
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 15018678095727
      // 00d: lxor
      // 00e: dup2
      // 00f: bipush 48
      // 011: lushr
      // 012: l2i
      // 013: istore 4
      // 015: dup2
      // 016: bipush 16
      // 018: lshl
      // 019: bipush 48
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 5
      // 01f: dup2
      // 020: bipush 32
      // 022: lshl
      // 023: bipush 32
      // 025: lushr
      // 026: l2i
      // 027: istore 6
      // 029: pop2
      // 02a: pop2
      // 02b: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 02e: astore 7
      // 030: aload 0
      // 031: getfield rip/breeze/client/RotationUtil8.map_b Ljava/util/Map;
      // 034: aload 1
      // 035: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 03a: ifeq 04c
      // 03d: aload 0
      // 03e: getfield rip/breeze/client/RotationUtil8.map_b Ljava/util/Map;
      // 041: aload 1
      // 042: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 047: areturn
      // 048: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04b: athrow
      // 04c: new java/util/HashMap
      // 04f: dup
      // 050: aload 0
      // 051: getfield rip/breeze/client/RotationUtil8.map_b Ljava/util/Map;
      // 054: invokespecial java/util/HashMap.<init> (Ljava/util/Map;)V
      // 057: astore 8
      // 059: aload 1
      // 05a: iload 4
      // 05c: i2c
      // 05d: iload 5
      // 05f: i2s
      // 060: iload 6
      // 062: invokestatic rip/breeze/client/Util97.parseEntries (Ljava/lang/String;CSI)[Lrip/breeze/client/Util98;
      // 065: astore 9
      // 067: aload 9
      // 069: astore 10
      // 06b: aload 10
      // 06d: arraylength
      // 06e: istore 11
      // 070: bipush 0
      // 071: istore 12
      // 073: iload 12
      // 075: iload 11
      // 077: if_icmpge 148
      // 07a: aload 10
      // 07c: iload 12
      // 07e: aaload
      // 07f: astore 13
      // 081: aload 13
      // 083: getfield rip/breeze/client/Util98.fieldInt_b I
      // 086: bipush -1
      // 087: if_icmpne 0c6
      // 08a: aload 8
      // 08c: instanceof java/util/Map
      // 08f: ifeq 0c6
      // 092: goto 099
      // 095: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 098: athrow
      // 099: aload 8
      // 09b: checkcast java/util/Map
      // 09e: aload 13
      // 0a0: getfield rip/breeze/client/Util98.string_c Ljava/lang/String;
      // 0a3: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0a8: ifeq 0c6
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b1: athrow
      // 0b2: aload 8
      // 0b4: checkcast java/util/Map
      // 0b7: aload 13
      // 0b9: getfield rip/breeze/client/Util98.string_c Ljava/lang/String;
      // 0bc: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c1: areturn
      // 0c2: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c5: athrow
      // 0c6: aload 8
      // 0c8: checkcast java/util/Map
      // 0cb: aload 13
      // 0cd: getfield rip/breeze/client/Util98.string_a Ljava/lang/String;
      // 0d0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d5: astore 8
      // 0d7: aload 13
      // 0d9: getfield rip/breeze/client/Util98.fieldInt_b I
      // 0dc: bipush -1
      // 0dd: if_icmple 11c
      // 0e0: aload 8
      // 0e2: ifnull 11c
      // 0e5: goto 0ec
      // 0e8: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0eb: athrow
      // 0ec: aload 13
      // 0ee: getfield rip/breeze/client/Util98.fieldInt_b I
      // 0f1: aload 8
      // 0f3: checkcast java/util/List
      // 0f6: invokeinterface java/util/List.size ()I 1
      // 0fb: if_icmplt 10b
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 104: athrow
      // 105: aconst_null
      // 106: areturn
      // 107: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10a: athrow
      // 10b: aload 8
      // 10d: checkcast java/util/List
      // 110: aload 13
      // 112: getfield rip/breeze/client/Util98.fieldInt_b I
      // 115: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11a: astore 8
      // 11c: aload 8
      // 11e: ifnonnull 140
      // 121: aload 0
      // 122: getfield rip/breeze/client/RotationUtil8.dataBuilder14_c Lrip/breeze/client/RotationUtil8;
      // 125: ifnull 13e
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield rip/breeze/client/RotationUtil8.dataBuilder14_c Lrip/breeze/client/RotationUtil8;
      // 133: aload 1
      // 134: invokespecial rip/breeze/client/RotationUtil8.getObject (Ljava/lang/String;)Ljava/lang/Object;
      // 137: goto 13f
      // 13a: invokestatic rip/breeze/client/RotationUtil8.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 13d: athrow
      // 13e: aconst_null
      // 13f: areturn
      // 140: iinc 12 1
      // 143: aload 7
      // 145: ifnull 073
      // 148: aload 8
      // 14a: areturn
      // try (31 -> 41): 41 java/lang/IllegalStateException
      // try (71 -> 78): 79 java/lang/IllegalStateException
      // try (75 -> 87): 88 java/lang/IllegalStateException
      // try (81 -> 96): 96 java/lang/IllegalStateException
      // try (104 -> 110): 111 java/lang/IllegalStateException
      // try (108 -> 119): 120 java/lang/IllegalStateException
      // try (113 -> 124): 124 java/lang/IllegalStateException
      // try (132 -> 137): 138 java/lang/IllegalStateException
      // try (134 -> 145): 145 java/lang/IllegalStateException
   }

   private RotationUtil8(RotationUtil8 var1, Map<String, Object> var2) {
      this.map_b = var2;
      this.dataBuilder14_c = var1;
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
   }
}
