package rip.breeze.client;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public final class ConfigMap<K, V> extends AbstractMap<K, V> implements Serializable {
   private static final Comparator<Comparable> CONST_A;
   Comparator<? super K> comparator_b;
   Util94<K, V> clientUtil5_c;
   int fieldInt_d;
   int fieldInt_e;
   final Util94<K, V> clientUtil5_f;
   private ConfigSetImpl clientUtil92_g;
   private ConfigSet clientUtil129_h;
   static final boolean CONST_I;
   private static LicenseState[] arr_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);

   public ConfigMap() {
      long var1 = 134377889556975L;
      long var3 = var1 ^ 19343677477190L;
      this(var3, CONST_A);
   }

   public ConfigMap(long var1, Comparator var3) {
      var1 = 113031391850038L ^ var1;
      super();
      this.fieldInt_d = 0;
      this.fieldInt_e = 0;
      this.clientUtil5_f = new Util94<>();
      this.comparator_b = var3 != null ? var3 : CONST_A;
   }

   @Override
   public int size() {
      return this.fieldInt_d;
   }

   @Override
   public V get(Object var1) {
      long var2 = 42295924464161L;
      long var4 = var2 ^ 82534366204996L;
      Util94 var6 = this.getClientUtil5_2(var4, var1);

      try {
         if (var6 != null) {
            return var6.value;
         }
      } catch (NullPointerException var7) {
         throw getRuntimeException(var7);
      }

      return null;
   }

   @Override
   public boolean containsKey(Object var1) {
      long var2 = 62561951881821L;
      long var4 = var2 ^ 94012957709368L;

      try {
         if (this.getClientUtil5_2(var4, var1) != null) {
            return true;
         }
      } catch (NullPointerException var6) {
         throw getRuntimeException(var6);
      }

      return false;
   }

   @Override
   public V put(K var1, V var2) {
      long var3 = 132156471809182L;
      long var10001 = var3 ^ 58113102517204L;
      int var5 = (int)((var3 ^ 58113102517204L) >>> 48);
      int var6 = (int)((var3 ^ 58113102517204L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);

      try {
         if (var1 == null) {
            throw new NullPointerException(buildString_2(24799, 961061189563635068L ^ var3));
         }
      } catch (NullPointerException var10) {
         throw getRuntimeException(var10);
      }

      Util94 var8 = this.getClientUtil5(var1, (short)var5, var6, true, (char)var7);
      Object var9 = var8.value;
      var8.value = (V)var2;
      return (V)var9;
   }

   @Override
   public void clear() {
      this.clientUtil5_c = null;
      this.fieldInt_d = 0;
      this.fieldInt_e++;
      Util94 var1 = this.clientUtil5_f;
      var1.clientUtil5_d = var1.clientUtil5_e = var1;
   }

   @Override
   public V remove(Object var1) {
      long var2 = 87227878799586L;
      long var10001 = var2 ^ 94426472979960L;
      int var4 = (int)((var2 ^ 94426472979960L) >>> 56);
      int var5 = (int)((var2 ^ 94426472979960L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      Util94 var7 = this.getClientUtil5_4(var1, (byte)var4, var5, var6);

      try {
         if (var7 != null) {
            return var7.value;
         }
      } catch (NullPointerException var8) {
         throw getRuntimeException(var8);
      }

      return null;
   }

   Util94 getClientUtil5(Object param1, short param2, int param3, boolean param4, char param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 5
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 01b: lxor
      // 01c: lstore 6
      // 01e: lload 6
      // 020: dup2
      // 021: ldc2_w 41724264661170
      // 024: lxor
      // 025: lstore 8
      // 027: dup2
      // 028: ldc2_w 70120456579393
      // 02b: lxor
      // 02c: lstore 10
      // 02e: pop2
      // 02f: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 032: aload 0
      // 033: getfield rip/breeze/client/ConfigMap.comparator_b Ljava/util/Comparator;
      // 036: astore 12
      // 038: astore 13
      // 03a: aload 0
      // 03b: getfield rip/breeze/client/ConfigMap.clientUtil5_c Lrip/breeze/client/Util94;
      // 03e: astore 14
      // 040: bipush 0
      // 041: istore 15
      // 043: aload 14
      // 045: ifnull 0cf
      // 048: aload 12
      // 04a: getstatic rip/breeze/client/ConfigMap.CONST_A Ljava/util/Comparator;
      // 04d: if_acmpne 062
      // 050: goto 057
      // 053: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: aload 1
      // 058: checkcast java/lang/Comparable
      // 05b: goto 063
      // 05e: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 061: athrow
      // 062: aconst_null
      // 063: astore 16
      // 065: aload 16
      // 067: ifnull 079
      // 06a: aload 16
      // 06c: aload 14
      // 06e: getfield rip/breeze/client/Util94.key Ljava/lang/Object;
      // 071: invokeinterface java/lang/Comparable.compareTo (Ljava/lang/Object;)I 2
      // 076: goto 086
      // 079: aload 12
      // 07b: aload 1
      // 07c: aload 14
      // 07e: getfield rip/breeze/client/Util94.key Ljava/lang/Object;
      // 081: invokeinterface java/util/Comparator.compare (Ljava/lang/Object;Ljava/lang/Object;)I 3
      // 086: istore 15
      // 088: iload 15
      // 08a: iload 3
      // 08b: iflt 09a
      // 08e: ifne 098
      // 091: aload 14
      // 093: areturn
      // 094: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: iload 15
      // 09a: ifge 0a9
      // 09d: aload 14
      // 09f: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 0a2: goto 0ae
      // 0a5: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a8: athrow
      // 0a9: aload 14
      // 0ab: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 0ae: astore 17
      // 0b0: aload 17
      // 0b2: iload 5
      // 0b4: ifle 0c8
      // 0b7: ifnonnull 0c6
      // 0ba: aload 13
      // 0bc: ifnonnull 0cf
      // 0bf: goto 0c6
      // 0c2: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: aload 17
      // 0c8: astore 14
      // 0ca: aload 13
      // 0cc: ifnonnull 065
      // 0cf: iload 4
      // 0d1: ifne 0da
      // 0d4: aconst_null
      // 0d5: areturn
      // 0d6: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield rip/breeze/client/ConfigMap.clientUtil5_f Lrip/breeze/client/Util94;
      // 0de: astore 16
      // 0e0: aload 14
      // 0e2: iload 2
      // 0e3: iflt 16d
      // 0e6: ifnonnull 15a
      // 0e9: aload 12
      // 0eb: getstatic rip/breeze/client/ConfigMap.CONST_A Ljava/util/Comparator;
      // 0ee: if_acmpne 135
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f7: athrow
      // 0f8: aload 1
      // 0f9: instanceof java/lang/Comparable
      // 0fc: ifne 135
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 105: athrow
      // 106: new java/lang/ClassCastException
      // 109: dup
      // 10a: new java/lang/StringBuilder
      // 10d: dup
      // 10e: invokespecial java/lang/StringBuilder.<init> ()V
      // 111: aload 1
      // 112: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 115: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: sipush 5565
      // 11e: ldc2_w 8055261492407770621
      // 121: lload 6
      // 123: lxor
      // 124: invokestatic rip/breeze/client/ConfigMap.buildString_2 (IJ)Ljava/lang/String;
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12d: invokespecial java/lang/ClassCastException.<init> (Ljava/lang/String;)V
      // 130: athrow
      // 131: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 134: athrow
      // 135: new rip/breeze/client/Util94
      // 138: dup
      // 139: aload 14
      // 13b: aload 1
      // 13c: lload 8
      // 13e: aload 16
      // 140: aload 16
      // 142: getfield rip/breeze/client/Util94.clientUtil5_e Lrip/breeze/client/Util94;
      // 145: invokespecial rip/breeze/client/Util94.<init> (Lrip/breeze/client/Util94;Ljava/lang/Object;JLrip/breeze/client/Util94;Lrip/breeze/client/Util94;)V
      // 148: astore 17
      // 14a: aload 0
      // 14b: aload 17
      // 14d: putfield rip/breeze/client/ConfigMap.clientUtil5_c Lrip/breeze/client/Util94;
      // 150: iload 5
      // 152: ifle 1b6
      // 155: aload 13
      // 157: ifnonnull 1a2
      // 15a: new rip/breeze/client/Util94
      // 15d: dup
      // 15e: aload 14
      // 160: aload 1
      // 161: lload 8
      // 163: aload 16
      // 165: aload 16
      // 167: getfield rip/breeze/client/Util94.clientUtil5_e Lrip/breeze/client/Util94;
      // 16a: invokespecial rip/breeze/client/Util94.<init> (Lrip/breeze/client/Util94;Ljava/lang/Object;JLrip/breeze/client/Util94;Lrip/breeze/client/Util94;)V
      // 16d: astore 17
      // 16f: iload 2
      // 170: iflt 192
      // 173: iload 15
      // 175: ifge 18b
      // 178: aload 14
      // 17a: aload 17
      // 17c: putfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 17f: aload 13
      // 181: ifnonnull 199
      // 184: goto 18b
      // 187: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18a: athrow
      // 18b: aload 14
      // 18d: aload 17
      // 18f: putfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 192: goto 199
      // 195: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 198: athrow
      // 199: aload 0
      // 19a: aload 14
      // 19c: lload 10
      // 19e: bipush 1
      // 19f: invokespecial rip/breeze/client/ConfigMap.clamp_2 (Lrip/breeze/client/Util94;JZ)V
      // 1a2: aload 0
      // 1a3: dup
      // 1a4: getfield rip/breeze/client/ConfigMap.fieldInt_d I
      // 1a7: bipush 1
      // 1a8: iadd
      // 1a9: putfield rip/breeze/client/ConfigMap.fieldInt_d I
      // 1ac: aload 0
      // 1ad: dup
      // 1ae: getfield rip/breeze/client/ConfigMap.fieldInt_e I
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: putfield rip/breeze/client/ConfigMap.fieldInt_e I
      // 1b6: aload 17
      // 1b8: areturn
      // try (41 -> 46): 47 java/lang/NullPointerException
      // try (43 -> 52): 52 java/lang/NullPointerException
      // try (69 -> 75): 75 java/lang/NullPointerException
      // try (77 -> 82): 82 java/lang/NullPointerException
      // try (87 -> 93): 94 java/lang/NullPointerException
      // try (100 -> 104): 104 java/lang/NullPointerException
      // try (109 -> 116): 117 java/lang/NullPointerException
      // try (113 -> 122): 123 java/lang/NullPointerException
      // try (119 -> 143): 143 java/lang/NullPointerException
      // try (172 -> 181): 182 java/lang/NullPointerException
      // try (176 -> 187): 188 java/lang/NullPointerException
   }

   Util94 getClientUtil5_2(long var1, Object var3) {
      var1 = 113031391850038L ^ var1;
      long var10001 = var1 ^ 78352899106585L;
      int var4 = (int)((var1 ^ 78352899106585L) >>> 48);
      int var5 = (int)((var1 ^ 78352899106585L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);

      try {
         try {
            if (var3 != null) {
               return this.getClientUtil5(var3, (short)var4, var5, false, (char)var6);
            }
         } catch (ClassCastException var8) {
            throw getRuntimeException(var8);
         }

         return null;
      } catch (ClassCastException var9) {
         return null;
      }
   }

   Util94 getClientUtil5_3(short param1, int param2, Entry param3, char param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 1b: lxor
      // 1c: lstore 5
      // 1e: lload 5
      // 20: dup2
      // 21: ldc2_w 42685873400395
      // 24: lxor
      // 25: lstore 7
      // 27: dup2
      // 28: ldc2_w 59179134781363
      // 2b: lxor
      // 2c: dup2
      // 2d: bipush 32
      // 2f: lushr
      // 30: l2i
      // 31: istore 9
      // 33: dup2
      // 34: bipush 32
      // 36: lshl
      // 37: bipush 48
      // 39: lushr
      // 3a: l2i
      // 3b: istore 10
      // 3d: dup2
      // 3e: bipush 48
      // 40: lshl
      // 41: bipush 48
      // 43: lushr
      // 44: l2i
      // 45: istore 11
      // 47: pop2
      // 48: pop2
      // 49: aload 0
      // 4a: aload 3
      // 4b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 50: lload 7
      // 52: dup2_x1
      // 53: pop2
      // 54: invokevirtual rip/breeze/client/ConfigMap.getClientUtil5_2 (JLjava/lang/Object;)Lrip/breeze/client/Util94;
      // 57: astore 12
      // 59: aload 12
      // 5b: ifnull 89
      // 5e: aload 0
      // 5f: aload 12
      // 61: getfield rip/breeze/client/Util94.value Ljava/lang/Object;
      // 64: iload 9
      // 66: swap
      // 67: aload 3
      // 68: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 6d: iload 10
      // 6f: i2s
      // 70: swap
      // 71: iload 11
      // 73: i2c
      // 74: invokespecial rip/breeze/client/ConfigMap.checkCondition (ILjava/lang/Object;SLjava/lang/Object;C)Z
      // 77: ifeq 89
      // 7a: goto 81
      // 7d: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 80: athrow
      // 81: bipush 1
      // 82: goto 8a
      // 85: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: bipush 0
      // 8a: istore 13
      // 8c: iload 13
      // 8e: ifeq 9a
      // 91: aload 12
      // 93: goto 9b
      // 96: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 99: athrow
      // 9a: aconst_null
      // 9b: areturn
      // try (58 -> 74): 75 java/lang/NullPointerException
      // try (60 -> 79): 79 java/lang/NullPointerException
      // try (83 -> 87): 87 java/lang/NullPointerException
   }

   private boolean checkCondition(int param1, Object param2, short param3, Object param4, char param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: aload 2
      // 1f: aload 4
      // 21: if_acmpeq 3f
      // 24: aload 2
      // 25: ifnull 47
      // 28: goto 2f
      // 2b: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 2
      // 30: aload 4
      // 32: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 35: ifeq 47
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 48
      // 43: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 46: athrow
      // 47: bipush 0
      // 48: ireturn
      // try (21 -> 26): 27 java/lang/NullPointerException
      // try (24 -> 33): 34 java/lang/NullPointerException
      // try (29 -> 38): 38 java/lang/NullPointerException
   }

   void clamp(Util94 param1, boolean param2, short param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: lload 4
      // 007: bipush 16
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 011: lxor
      // 012: lstore 6
      // 014: lload 6
      // 016: dup2
      // 017: ldc2_w 14392930787003
      // 01a: lxor
      // 01b: lstore 8
      // 01d: dup2
      // 01e: ldc2_w 7206736431678
      // 021: lxor
      // 022: dup2
      // 023: bipush 32
      // 025: lushr
      // 026: l2i
      // 027: istore 10
      // 029: dup2
      // 02a: bipush 32
      // 02c: lshl
      // 02d: bipush 48
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
      // 03f: ldc2_w 96474189132616
      // 042: lxor
      // 043: lstore 13
      // 045: dup2
      // 046: ldc2_w 55599047661445
      // 049: lxor
      // 04a: lstore 15
      // 04c: dup2
      // 04d: ldc2_w 113031391850038
      // 050: lxor
      // 051: dup2
      // 052: bipush 48
      // 054: lushr
      // 055: l2i
      // 056: istore 17
      // 058: dup2
      // 059: bipush 16
      // 05b: lshl
      // 05c: bipush 16
      // 05e: lushr
      // 05f: lstore 18
      // 061: pop2
      // 062: pop2
      // 063: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 066: astore 20
      // 068: iload 2
      // 069: ifeq 089
      // 06c: aload 1
      // 06d: getfield rip/breeze/client/Util94.clientUtil5_e Lrip/breeze/client/Util94;
      // 070: aload 1
      // 071: getfield rip/breeze/client/Util94.clientUtil5_d Lrip/breeze/client/Util94;
      // 074: putfield rip/breeze/client/Util94.clientUtil5_d Lrip/breeze/client/Util94;
      // 077: aload 1
      // 078: getfield rip/breeze/client/Util94.clientUtil5_d Lrip/breeze/client/Util94;
      // 07b: aload 1
      // 07c: getfield rip/breeze/client/Util94.clientUtil5_e Lrip/breeze/client/Util94;
      // 07f: putfield rip/breeze/client/Util94.clientUtil5_e Lrip/breeze/client/Util94;
      // 082: goto 089
      // 085: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 088: athrow
      // 089: aload 1
      // 08a: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 08d: astore 21
      // 08f: aload 1
      // 090: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 093: astore 22
      // 095: aload 1
      // 096: getfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 099: astore 23
      // 09b: aload 21
      // 09d: lload 4
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: iflt 170
      // 0a4: ifnull 16e
      // 0a7: aload 22
      // 0a9: lload 4
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 170
      // 0b0: ifnull 16e
      // 0b3: goto 0ba
      // 0b6: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: aload 21
      // 0bc: iload 3
      // 0bd: iflt 0e2
      // 0c0: getfield rip/breeze/client/Util94.fieldInt_h I
      // 0c3: aload 22
      // 0c5: getfield rip/breeze/client/Util94.fieldInt_h I
      // 0c8: if_icmple 0e0
      // 0cb: goto 0d2
      // 0ce: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d1: athrow
      // 0d2: aload 21
      // 0d4: lload 13
      // 0d6: invokevirtual rip/breeze/client/Util94.getClientUtil5_2 (J)Lrip/breeze/client/Util94;
      // 0d9: goto 0e7
      // 0dc: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0df: athrow
      // 0e0: aload 22
      // 0e2: lload 8
      // 0e4: invokevirtual rip/breeze/client/Util94.getClientUtil5 (J)Lrip/breeze/client/Util94;
      // 0e7: astore 24
      // 0e9: aload 0
      // 0ea: aload 24
      // 0ec: bipush 0
      // 0ed: iload 17
      // 0ef: i2s
      // 0f0: lload 18
      // 0f2: invokevirtual rip/breeze/client/ConfigMap.clamp (Lrip/breeze/client/Util94;ZSJ)V
      // 0f5: bipush 0
      // 0f6: istore 25
      // 0f8: aload 1
      // 0f9: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 0fc: astore 21
      // 0fe: aload 21
      // 100: iload 3
      // 101: iflt 11d
      // 104: ifnull 121
      // 107: aload 21
      // 109: getfield rip/breeze/client/Util94.fieldInt_h I
      // 10c: istore 25
      // 10e: aload 24
      // 110: aload 21
      // 112: putfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 115: aload 21
      // 117: aload 24
      // 119: putfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 11c: aload 1
      // 11d: aconst_null
      // 11e: putfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 121: bipush 0
      // 122: istore 26
      // 124: aload 1
      // 125: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 128: astore 22
      // 12a: aload 22
      // 12c: lload 4
      // 12e: lconst_0
      // 12f: lcmp
      // 130: ifle 152
      // 133: ifnull 150
      // 136: aload 22
      // 138: getfield rip/breeze/client/Util94.fieldInt_h I
      // 13b: istore 26
      // 13d: aload 24
      // 13f: aload 22
      // 141: putfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 144: aload 22
      // 146: aload 24
      // 148: putfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 14b: aload 1
      // 14c: aconst_null
      // 14d: putfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 150: aload 24
      // 152: iload 25
      // 154: iload 26
      // 156: invokestatic java/lang/Math.max (II)I
      // 159: bipush 1
      // 15a: iadd
      // 15b: putfield rip/breeze/client/Util94.fieldInt_h I
      // 15e: aload 0
      // 15f: aload 1
      // 160: iload 10
      // 162: iload 11
      // 164: i2s
      // 165: aload 24
      // 167: iload 12
      // 169: i2c
      // 16a: invokespecial rip/breeze/client/ConfigMap.processAll (Lrip/breeze/client/Util94;ISLrip/breeze/client/Util94;C)V
      // 16d: return
      // 16e: aload 21
      // 170: iload 3
      // 171: iflt 1bd
      // 174: ifnull 1b7
      // 177: aload 0
      // 178: aload 1
      // 179: iload 10
      // 17b: iload 11
      // 17d: i2s
      // 17e: aload 21
      // 180: iload 12
      // 182: i2c
      // 183: invokespecial rip/breeze/client/ConfigMap.processAll (Lrip/breeze/client/Util94;ISLrip/breeze/client/Util94;C)V
      // 186: aload 1
      // 187: aconst_null
      // 188: putfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 18b: lload 4
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: iflt 216
      // 192: aload 20
      // 194: ifnonnull 1f9
      // 197: goto 19e
      // 19a: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19d: athrow
      // 19e: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 1a1: ifne 1b3
      // 1a4: goto 1ab
      // 1a7: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1aa: athrow
      // 1ab: bipush 0
      // 1ac: goto 1b4
      // 1af: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 1b7: iload 3
      // 1b8: iflt 1f2
      // 1bb: aload 22
      // 1bd: ifnull 1e4
      // 1c0: aload 0
      // 1c1: aload 1
      // 1c2: iload 10
      // 1c4: iload 11
      // 1c6: i2s
      // 1c7: aload 22
      // 1c9: iload 12
      // 1cb: i2c
      // 1cc: invokespecial rip/breeze/client/ConfigMap.processAll (Lrip/breeze/client/Util94;ISLrip/breeze/client/Util94;C)V
      // 1cf: aload 1
      // 1d0: aconst_null
      // 1d1: putfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 1d4: iload 3
      // 1d5: iflt 216
      // 1d8: aload 20
      // 1da: ifnonnull 1f9
      // 1dd: goto 1e4
      // 1e0: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: aload 1
      // 1e6: iload 10
      // 1e8: iload 11
      // 1ea: i2s
      // 1eb: aconst_null
      // 1ec: iload 12
      // 1ee: i2c
      // 1ef: invokespecial rip/breeze/client/ConfigMap.processAll (Lrip/breeze/client/Util94;ISLrip/breeze/client/Util94;C)V
      // 1f2: goto 1f9
      // 1f5: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: aload 23
      // 1fc: lload 15
      // 1fe: bipush 0
      // 1ff: invokespecial rip/breeze/client/ConfigMap.clamp_2 (Lrip/breeze/client/Util94;JZ)V
      // 202: aload 0
      // 203: dup
      // 204: getfield rip/breeze/client/ConfigMap.fieldInt_d I
      // 207: bipush 1
      // 208: isub
      // 209: putfield rip/breeze/client/ConfigMap.fieldInt_d I
      // 20c: aload 0
      // 20d: dup
      // 20e: getfield rip/breeze/client/ConfigMap.fieldInt_e I
      // 211: bipush 1
      // 212: iadd
      // 213: putfield rip/breeze/client/ConfigMap.fieldInt_e I
      // 216: return
      // try (67 -> 79): 80 java/lang/NullPointerException
      // try (91 -> 103): 104 java/lang/NullPointerException
      // try (97 -> 113): 114 java/lang/NullPointerException
      // try (106 -> 120): 120 java/lang/NullPointerException
      // try (194 -> 216): 217 java/lang/NullPointerException
      // try (198 -> 221): 222 java/lang/NullPointerException
      // try (219 -> 226): 226 java/lang/NullPointerException
      // try (230 -> 250): 251 java/lang/NullPointerException
      // try (234 -> 262): 263 java/lang/NullPointerException
   }

   Util94 getClientUtil5_4(Object var1, byte var2, int var3, int var4) {
      long var5 = ((long)var2 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ 113031391850038L;
      long var7 = var5 ^ 18822009947465L;
      int var9 = (int)((var5 ^ 67923061142178L) >>> 48);
      long var10 = (var5 ^ 67923061142178L) << 16 >>> 16;
      Util94 var12 = this.getClientUtil5_2(var7, var1);

      try {
         if (var12 != null) {
            this.clamp(var12, true, (short)var9, var10);
         }

         return var12;
      } catch (NullPointerException var13) {
         throw getRuntimeException(var13);
      }
   }

   private void processAll(Util94 param1, int param2, short param3, Util94 param4, char param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 21: aload 1
      // 22: getfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 25: astore 8
      // 27: aload 1
      // 28: aconst_null
      // 29: putfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 2c: astore 9
      // 2e: aload 4
      // 30: ifnull 41
      // 33: aload 4
      // 35: aload 8
      // 37: putfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: iload 2
      // 42: iflt ba
      // 45: aload 8
      // 47: ifnull b4
      // 4a: iload 2
      // 4b: iflt 71
      // 4e: aload 8
      // 50: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 53: aload 1
      // 54: if_acmpne 71
      // 57: goto 5e
      // 5a: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d: athrow
      // 5e: aload 8
      // 60: aload 4
      // 62: putfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 65: aload 9
      // 67: ifnonnull c1
      // 6a: goto 71
      // 6d: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 70: athrow
      // 71: iload 5
      // 73: ifle aa
      // 76: getstatic rip/breeze/client/ConfigMap.CONST_I Z
      // 79: ifne a3
      // 7c: goto 83
      // 7f: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 82: athrow
      // 83: aload 8
      // 85: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 88: aload 1
      // 89: iload 2
      // 8a: ifle a7
      // 8d: if_acmpeq a3
      // 90: goto 97
      // 93: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 96: athrow
      // 97: new java/lang/AssertionError
      // 9a: dup
      // 9b: invokespecial java/lang/AssertionError.<init> ()V
      // 9e: athrow
      // 9f: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a2: athrow
      // a3: aload 8
      // a5: aload 4
      // a7: putfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // aa: iload 5
      // ac: iflt ba
      // af: aload 9
      // b1: ifnonnull c1
      // b4: aload 0
      // b5: aload 4
      // b7: putfield rip/breeze/client/ConfigMap.clientUtil5_c Lrip/breeze/client/Util94;
      // ba: goto c1
      // bd: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c0: athrow
      // c1: return
      // try (29 -> 34): 35 java/lang/NullPointerException
      // try (37 -> 47): 48 java/lang/NullPointerException
      // try (41 -> 55): 56 java/lang/NullPointerException
      // try (50 -> 62): 63 java/lang/NullPointerException
      // try (58 -> 71): 72 java/lang/NullPointerException
      // try (65 -> 78): 78 java/lang/NullPointerException
      // try (80 -> 90): 91 java/lang/NullPointerException
   }

   private void clamp_2(Util94 param1, long param2, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/ConfigMap.113031391850038L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 2865898748755
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 106300206315065
      // 012: lxor
      // 013: dup2
      // 014: bipush 48
      // 016: lushr
      // 017: l2i
      // 018: istore 7
      // 01a: dup2
      // 01b: bipush 16
      // 01d: lshl
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 8
      // 024: dup2
      // 025: bipush 48
      // 027: lshl
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 9
      // 02e: pop2
      // 02f: pop2
      // 030: invokestatic rip/breeze/client/ConfigMap.values ()[Lrip/breeze/LicenseState;
      // 033: aload 1
      // 034: astore 10
      // 036: astore 11
      // 038: aload 10
      // 03a: ifnull 363
      // 03d: aload 10
      // 03f: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 042: astore 12
      // 044: aload 10
      // 046: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 049: astore 13
      // 04b: aload 12
      // 04d: lload 2
      // 04e: lconst_0
      // 04f: lcmp
      // 050: iflt 058
      // 053: ifnull 062
      // 056: aload 12
      // 058: getfield rip/breeze/client/Util94.fieldInt_h I
      // 05b: goto 063
      // 05e: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 061: athrow
      // 062: bipush 0
      // 063: istore 14
      // 065: aload 13
      // 067: lload 2
      // 068: lconst_0
      // 069: lcmp
      // 06a: ifle 072
      // 06d: ifnull 07c
      // 070: aload 13
      // 072: getfield rip/breeze/client/Util94.fieldInt_h I
      // 075: goto 07d
      // 078: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07b: athrow
      // 07c: bipush 0
      // 07d: istore 15
      // 07f: iload 14
      // 081: iload 15
      // 083: isub
      // 084: istore 16
      // 086: iload 16
      // 088: bipush -2
      // 08a: lload 2
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: ifle 1a6
      // 090: if_icmpne 19d
      // 093: aload 13
      // 095: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 098: astore 17
      // 09a: aload 13
      // 09c: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 09f: astore 18
      // 0a1: aload 18
      // 0a3: lload 2
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 0ae
      // 0a9: ifnull 0b8
      // 0ac: aload 18
      // 0ae: getfield rip/breeze/client/Util94.fieldInt_h I
      // 0b1: goto 0b9
      // 0b4: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: bipush 0
      // 0b9: istore 19
      // 0bb: aload 17
      // 0bd: lload 2
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 0c8
      // 0c3: ifnull 0d2
      // 0c6: aload 17
      // 0c8: getfield rip/breeze/client/Util94.fieldInt_h I
      // 0cb: goto 0d3
      // 0ce: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d1: athrow
      // 0d2: bipush 0
      // 0d3: istore 20
      // 0d5: iload 20
      // 0d7: iload 19
      // 0d9: isub
      // 0da: istore 21
      // 0dc: lload 2
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: iflt 11a
      // 0e2: iload 21
      // 0e4: bipush -1
      // 0e5: if_icmpeq 10c
      // 0e8: iload 21
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: ifle 135
      // 0f0: ifne 12c
      // 0f3: goto 0fa
      // 0f6: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f9: athrow
      // 0fa: iload 4
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 135
      // 102: ifne 12c
      // 105: goto 10c
      // 108: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10b: athrow
      // 10c: aload 0
      // 10d: iload 7
      // 10f: i2c
      // 110: iload 8
      // 112: iload 9
      // 114: i2c
      // 115: aload 10
      // 117: invokespecial rip/breeze/client/ConfigMap.clamp_3 (CICLrip/breeze/client/Util94;)V
      // 11a: lload 2
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 174
      // 120: aload 11
      // 122: ifnonnull 174
      // 125: goto 12c
      // 128: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12b: athrow
      // 12c: lload 2
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: ifle 166
      // 132: getstatic rip/breeze/client/ConfigMap.CONST_I Z
      // 135: ifne 15e
      // 138: goto 13f
      // 13b: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13e: athrow
      // 13f: lload 2
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 166
      // 145: iload 21
      // 147: bipush 1
      // 148: if_icmpeq 15e
      // 14b: goto 152
      // 14e: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 151: athrow
      // 152: new java/lang/AssertionError
      // 155: dup
      // 156: invokespecial java/lang/AssertionError.<init> ()V
      // 159: athrow
      // 15a: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15d: athrow
      // 15e: aload 0
      // 15f: aload 13
      // 161: lload 5
      // 163: invokespecial rip/breeze/client/ConfigMap.clamp_4 (Lrip/breeze/client/Util94;J)V
      // 166: aload 0
      // 167: iload 7
      // 169: i2c
      // 16a: iload 8
      // 16c: iload 9
      // 16e: i2c
      // 16f: aload 10
      // 171: invokespecial rip/breeze/client/ConfigMap.clamp_3 (CICLrip/breeze/client/Util94;)V
      // 174: lload 2
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 18b
      // 17a: iload 4
      // 17c: ifeq 18b
      // 17f: aload 11
      // 181: ifnonnull 363
      // 184: goto 18b
      // 187: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18a: athrow
      // 18b: aload 11
      // 18d: lload 2
      // 18e: lconst_0
      // 18f: lcmp
      // 190: ifle 360
      // 193: ifnonnull 357
      // 196: goto 19d
      // 199: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19c: athrow
      // 19d: iload 16
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: ifle 2b6
      // 1a5: bipush 2
      // 1a6: if_icmpne 2b4
      // 1a9: goto 1b0
      // 1ac: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1af: athrow
      // 1b0: aload 12
      // 1b2: getfield rip/breeze/client/Util94.clientUtil5_b Lrip/breeze/client/Util94;
      // 1b5: astore 17
      // 1b7: aload 12
      // 1b9: getfield rip/breeze/client/Util94.clientUtil5_c Lrip/breeze/client/Util94;
      // 1bc: astore 18
      // 1be: aload 18
      // 1c0: lload 2
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: iflt 1cb
      // 1c6: ifnull 1d5
      // 1c9: aload 18
      // 1cb: getfield rip/breeze/client/Util94.fieldInt_h I
      // 1ce: goto 1d6
      // 1d1: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d4: athrow
      // 1d5: bipush 0
      // 1d6: istore 19
      // 1d8: aload 17
      // 1da: lload 2
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 1e5
      // 1e0: ifnull 1ef
      // 1e3: aload 17
      // 1e5: getfield rip/breeze/client/Util94.fieldInt_h I
      // 1e8: goto 1f0
      // 1eb: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ee: athrow
      // 1ef: bipush 0
      // 1f0: istore 20
      // 1f2: iload 20
      // 1f4: iload 19
      // 1f6: isub
      // 1f7: istore 21
      // 1f9: lload 2
      // 1fa: lconst_0
      // 1fb: lcmp
      // 1fc: ifle 231
      // 1ff: iload 21
      // 201: bipush 1
      // 202: if_icmpeq 229
      // 205: iload 21
      // 207: lload 2
      // 208: lconst_0
      // 209: lcmp
      // 20a: iflt 24c
      // 20d: ifne 243
      // 210: goto 217
      // 213: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 216: athrow
      // 217: iload 4
      // 219: lload 2
      // 21a: lconst_0
      // 21b: lcmp
      // 21c: ifle 24c
      // 21f: ifne 243
      // 222: goto 229
      // 225: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 228: athrow
      // 229: aload 0
      // 22a: aload 10
      // 22c: lload 5
      // 22e: invokespecial rip/breeze/client/ConfigMap.clamp_4 (Lrip/breeze/client/Util94;J)V
      // 231: lload 2
      // 232: lconst_0
      // 233: lcmp
      // 234: ifle 28b
      // 237: aload 11
      // 239: ifnonnull 28b
      // 23c: goto 243
      // 23f: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 242: athrow
      // 243: lload 2
      // 244: lconst_0
      // 245: lcmp
      // 246: iflt 283
      // 249: getstatic rip/breeze/client/ConfigMap.CONST_I Z
      // 24c: ifne 275
      // 24f: goto 256
      // 252: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 255: athrow
      // 256: lload 2
      // 257: lconst_0
      // 258: lcmp
      // 259: iflt 283
      // 25c: iload 21
      // 25e: bipush -1
      // 25f: if_icmpeq 275
      // 262: goto 269
      // 265: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 268: athrow
      // 269: new java/lang/AssertionError
      // 26c: dup
      // 26d: invokespecial java/lang/AssertionError.<init> ()V
      // 270: athrow
      // 271: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 274: athrow
      // 275: aload 0
      // 276: iload 7
      // 278: i2c
      // 279: iload 8
      // 27b: iload 9
      // 27d: i2c
      // 27e: aload 12
      // 280: invokespecial rip/breeze/client/ConfigMap.clamp_3 (CICLrip/breeze/client/Util94;)V
      // 283: aload 0
      // 284: aload 10
      // 286: lload 5
      // 288: invokespecial rip/breeze/client/ConfigMap.clamp_4 (Lrip/breeze/client/Util94;J)V
      // 28b: lload 2
      // 28c: lconst_0
      // 28d: lcmp
      // 28e: iflt 2a2
      // 291: iload 4
      // 293: ifeq 2a2
      // 296: aload 11
      // 298: ifnonnull 363
      // 29b: goto 2a2
      // 29e: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a1: athrow
      // 2a2: aload 11
      // 2a4: lload 2
      // 2a5: lconst_0
      // 2a6: lcmp
      // 2a7: iflt 360
      // 2aa: ifnonnull 357
      // 2ad: goto 2b4
      // 2b0: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b3: athrow
      // 2b4: iload 16
      // 2b6: lload 2
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: iflt 2f0
      // 2bc: ifne 2ed
      // 2bf: goto 2c6
      // 2c2: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c5: athrow
      // 2c6: aload 10
      // 2c8: iload 14
      // 2ca: bipush 1
      // 2cb: iadd
      // 2cc: putfield rip/breeze/client/Util94.fieldInt_h I
      // 2cf: lload 2
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: iflt 35e
      // 2d5: iload 4
      // 2d7: ifeq 357
      // 2da: goto 2e1
      // 2dd: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e0: athrow
      // 2e1: aload 11
      // 2e3: ifnonnull 363
      // 2e6: goto 2ed
      // 2e9: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ec: athrow
      // 2ed: getstatic rip/breeze/client/ConfigMap.CONST_I Z
      // 2f0: lload 2
      // 2f1: lconst_0
      // 2f2: lcmp
      // 2f3: ifle 348
      // 2f6: ifne 332
      // 2f9: goto 300
      // 2fc: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ff: athrow
      // 300: iload 16
      // 302: lload 2
      // 303: lconst_0
      // 304: lcmp
      // 305: ifle 348
      // 308: bipush -1
      // 309: if_icmpeq 332
      // 30c: goto 313
      // 30f: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 312: athrow
      // 313: iload 16
      // 315: lload 2
      // 316: lconst_0
      // 317: lcmp
      // 318: iflt 348
      // 31b: bipush 1
      // 31c: if_icmpeq 332
      // 31f: goto 326
      // 322: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 325: athrow
      // 326: new java/lang/AssertionError
      // 329: dup
      // 32a: invokespecial java/lang/AssertionError.<init> ()V
      // 32d: athrow
      // 32e: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 331: athrow
      // 332: aload 10
      // 334: iload 14
      // 336: iload 15
      // 338: invokestatic java/lang/Math.max (II)I
      // 33b: bipush 1
      // 33c: iadd
      // 33d: putfield rip/breeze/client/Util94.fieldInt_h I
      // 340: lload 2
      // 341: lconst_0
      // 342: lcmp
      // 343: ifle 35e
      // 346: iload 4
      // 348: ifne 357
      // 34b: aload 11
      // 34d: ifnonnull 363
      // 350: goto 357
      // 353: invokestatic rip/breeze/client/ConfigMap.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 356: athrow
      // 357: aload 10
      // 359: getfield rip/breeze/client/Util94.clientUtil5_a Lrip/breeze/client/Util94;
      // 35c: astore 10
      // 35e: aload 11
      // 360: ifnonnull 038
      // 363: return
      // try (45 -> 54): 54 java/lang/NullPointerException
      // try (58 -> 67): 67 java/lang/NullPointerException
      // try (88 -> 97): 97 java/lang/NullPointerException
      // try (101 -> 110): 110 java/lang/NullPointerException
      // try (118 -> 131): 132 java/lang/NullPointerException
      // try (125 -> 140): 141 java/lang/NullPointerException
      // try (134 -> 157): 158 java/lang/NullPointerException
      // try (143 -> 166): 167 java/lang/NullPointerException
      // try (160 -> 176): 177 java/lang/NullPointerException
      // try (169 -> 183): 183 java/lang/NullPointerException
      // try (197 -> 205): 206 java/lang/NullPointerException
      // try (203 -> 214): 215 java/lang/NullPointerException
      // try (208 -> 224): 225 java/lang/NullPointerException
      // try (233 -> 242): 242 java/lang/NullPointerException
      // try (246 -> 255): 255 java/lang/NullPointerException
      // try (263 -> 276): 277 java/lang/NullPointerException
      // try (270 -> 285): 286 java/lang/NullPointerException
      // try (279 -> 298): 299 java/lang/NullPointerException
      // try (288 -> 307): 308 java/lang/NullPointerException
      // try (301 -> 317): 318 java/lang/NullPointerException
      // try (310 -> 324): 324 java/lang/NullPointerException
      // try (338 -> 346): 347 java/lang/NullPointerException
      // try (344 -> 355): 356 java/lang/NullPointerException
      // try (349 -> 364): 365 java/lang/NullPointerException
      // try (358 -> 378): 379 java/lang/NullPointerException
      // try (367 -> 383): 384 java/lang/NullPointerException
      // try (381 -> 392): 393 java/lang/NullPointerException
      // try (386 -> 402): 403 java/lang/NullPointerException
      // try (395 -> 412): 413 java/lang/NullPointerException
      // try (405 -> 419): 419 java/lang/NullPointerException
      // try (421 -> 436): 437 java/lang/NullPointerException
   }

   private void clamp_3(char var1, int var2, char var3, Util94 var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 113031391850038L;
      long var10001 = var5 ^ 93119882341250L;
      int var7 = (int)((var5 ^ 93119882341250L) >>> 32);
      int var8 = (int)((var5 ^ 93119882341250L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Util94 var10 = var4.clientUtil5_b;
      Util94 var11 = var4.clientUtil5_c;
      Util94 var12 = var11.clientUtil5_b;
      Util94 var13 = var11.clientUtil5_c;

      try {
         var4.clientUtil5_c = var12;
         if (var12 != null) {
            var12.clientUtil5_a = var4;
         }
      } catch (NullPointerException var14) {
         throw getRuntimeException(var14);
      }

      Util94 var10000;
      label61: {
         try {
            label59: {
               this.processAll(var4, var7, (short)var8, var11, (char)var9);
               var11.clientUtil5_b = var4;
               var4.clientUtil5_a = var11;
               var10000 = var4;
               Util94 var19 = var10;
               if (var3 >= 0) {
                  if (var10 == null) {
                     break label59;
                  }

                  var19 = var10;
               }

               var20 = var19.fieldInt_h;
               break label61;
            }
         } catch (NullPointerException var17) {
            throw getRuntimeException(var17);
         }

         var20 = 0;
      }

      int var22;
      label52: {
         try {
            label50: {
               Util94 var10002 = var12;
               if (var3 > 0) {
                  if (var12 == null) {
                     break label50;
                  }

                  var10002 = var12;
               }

               var22 = var10002.fieldInt_h;
               break label52;
            }
         } catch (NullPointerException var16) {
            throw getRuntimeException(var16);
         }

         var22 = 0;
      }

      label43: {
         try {
            label41: {
               var10000.fieldInt_h = Math.max(var20, var22) + 1;
               var10000 = var11;
               var21 = var4.fieldInt_h;
               Util94 var23 = var13;
               if (var1 >= 0) {
                  if (var13 == null) {
                     break label41;
                  }

                  var23 = var13;
               }

               var22 = var23.fieldInt_h;
               break label43;
            }
         } catch (NullPointerException var15) {
            throw getRuntimeException(var15);
         }

         var22 = 0;
      }

      var10000.fieldInt_h = Math.max(var21, var22) + 1;
   }

   private void clamp_4(Util94 var1, long var2) {
      var2 = 113031391850038L ^ var2;
      long var10001 = var2 ^ 59956123084520L;
      int var4 = (int)((var2 ^ 59956123084520L) >>> 32);
      int var5 = (int)((var2 ^ 59956123084520L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Util94 var7 = var1.clientUtil5_b;
      Util94 var8 = var1.clientUtil5_c;
      Util94 var9 = var7.clientUtil5_b;
      Util94 var10 = var7.clientUtil5_c;

      try {
         var1.clientUtil5_b = var10;
         if (var10 != null) {
            var10.clientUtil5_a = var1;
         }
      } catch (NullPointerException var11) {
         throw getRuntimeException(var11);
      }

      Util94 var10000;
      label61: {
         try {
            label59: {
               this.processAll(var1, var4, (short)var5, var7, (char)var6);
               var7.clientUtil5_c = var1;
               var1.clientUtil5_a = var7;
               var10000 = var1;
               Util94 var17 = var8;
               if (var2 > 0L) {
                  if (var8 == null) {
                     break label59;
                  }

                  var17 = var8;
               }

               var18 = var17.fieldInt_h;
               break label61;
            }
         } catch (NullPointerException var14) {
            throw getRuntimeException(var14);
         }

         var18 = 0;
      }

      int var20;
      label52: {
         try {
            label50: {
               Util94 var10002 = var10;
               if (var2 >= 0L) {
                  if (var10 == null) {
                     break label50;
                  }

                  var10002 = var10;
               }

               var20 = var10002.fieldInt_h;
               break label52;
            }
         } catch (NullPointerException var13) {
            throw getRuntimeException(var13);
         }

         var20 = 0;
      }

      label43: {
         try {
            label41: {
               var10000.fieldInt_h = Math.max(var18, var20) + 1;
               var10000 = var7;
               var19 = var1.fieldInt_h;
               Util94 var21 = var9;
               if (var2 >= 0L) {
                  if (var9 == null) {
                     break label41;
                  }

                  var21 = var9;
               }

               var20 = var21.fieldInt_h;
               break label43;
            }
         } catch (NullPointerException var12) {
            throw getRuntimeException(var12);
         }

         var20 = 0;
      }

      var10000.fieldInt_h = Math.max(var19, var20) + 1;
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      long var1 = 84417213366020L;
      ConfigSetImpl var3 = this.clientUtil92_g;

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (NullPointerException var4) {
         throw getRuntimeException(var4);
      }

      return this.clientUtil92_g = new ConfigSetImpl(this);
   }

   @Override
   public Set<K> keySet() {
      long var1 = 89867190477375L;
      ConfigSet var3 = this.clientUtil129_h;

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (NullPointerException var4) {
         throw getRuntimeException(var4);
      }

      return this.clientUtil129_h = new ConfigSet(this);
   }

   private Object writeReplace() throws ObjectStreamException {
      return new LinkedHashMap<>(this);
   }

   static {
      LicenseState[] var10000 = new LicenseState[1];
      initialize(var10000);
      long var0 = 9382088778344L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "\f\tí\u009d+ì\u001eñ\u000e¨ÔQgß\u0011{íì\u0085<\u0002Ì§>ÃÅã\u0089Ì\fþa±®\u000f\u0018¹úù\u0003 {Eâ@\u0013qó\u0086¬¼t\u009aQ¤\u0098\rú\u009bC¹\u0019½jÅ\u0018Ðã\u008bfÅêö";
      int var7 = "\f\tí\u009d+ì\u001eñ\u000e¨ÔQgß\u0011{íì\u0085<\u0002Ì§>ÃÅã\u0089Ì\fþa±®\u000f\u0018¹úù\u0003 {Eâ@\u0013qó\u0086¬¼t\u009aQ¤\u0098\rú\u009bC¹\u0019½jÅ\u0018Ðã\u008bfÅêö"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var16 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var16;
         if ((var9 += var8) >= var7) {
            CONST_L = var4;
            CONST_M = new String[2];

            label25: {
               try {
                  if (!ConfigMap.class.desiredAssertionStatus()) {
                     var14 = true;
                     break label25;
                  }
               } catch (NullPointerException var11) {
                  throw getRuntimeException(var11);
               }

               var14 = false;
            }

            CONST_I = var14;
            CONST_A = new BreezeComparator();
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_j = var0;
   }

   public static LicenseState[] values() {
      return arr_j;
   }

   private static RuntimeException getRuntimeException(RuntimeException var0) {
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8508;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fQ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
   }
}
