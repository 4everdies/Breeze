package rip.breeze.client;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public final class Util141 {
   static final Type[] CONST_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public static Type getType(long var0, Type var2) {
      var0 = 85312070001270L ^ var0;
      long var3 = var0 ^ 96754596604286L;
      long var5 = var0 ^ 124406664756982L;
      long var7 = var0 ^ 36163018907828L;
      long var9 = var0 ^ 85312070001270L;
      if (var2 instanceof Class) {
         Class var16 = (Class)var2;

         try {
            if (var16.isArray()) {
               return new Util53(getType(var9, var16.getComponentType()), var5);
            }
         } catch (IllegalArgumentException var12) {
            throw getIllegalArgumentException(var12);
         }

         return var16;
      } else {
         boolean var10000 = var2 instanceof ParameterizedType;
         if (var0 > 0L) {
            if (var10000) {
               ParameterizedType var15 = (ParameterizedType)var2;
               return new Util57(var15.getOwnerType(), var7, var15.getRawType(), var15.getActualTypeArguments());
            }

            var10000 = var2 instanceof GenericArrayType;
         }

         if (var0 > 0L) {
            if (var10000) {
               GenericArrayType var14 = (GenericArrayType)var2;
               return new Util53(var14.getGenericComponentType(), var5);
            }

            if (var0 < 0L) {
               return var2;
            }

            var10000 = var2 instanceof WildcardType;
         }

         if (var10000) {
            WildcardType var11 = (WildcardType)var2;
            return new Util58(var11.getUpperBounds(), var11.getLowerBounds(), var3);
         } else {
            return var2;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static Class getClass(char var0, Type var1, char var2, int var3) {
      long var4 = ((long)var0 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ 85312070001270L;
      long var10001 = var4 ^ 85312070001270L;
      int var6 = (int)((var4 ^ 85312070001270L) >>> 48);
      int var7 = (int)((var4 ^ 85312070001270L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      long var9 = var4 ^ 36140809474885L;

      try {
         if (var1 instanceof Class) {
            return (Class)var1;
         }
      } catch (IllegalArgumentException var15) {
         throw getIllegalArgumentException(var15);
      }

      boolean var10000 = var1 instanceof ParameterizedType;
      if (var0 >= 0) {
         if (var10000) {
            ParameterizedType var21 = (ParameterizedType)var1;
            Type var12 = var21.getRawType();
            Util67.update(var12 instanceof Class, var9);
            return (Class)var12;
         }

         var10000 = var1 instanceof GenericArrayType;
      }

      label46:
      if (var0 < 0) {
         label86: {
            label78: {
               try {
                  if (var0 < 0) {
                     break label78;
                  }

                  if (var10000) {
                     return Object.class;
                  }
               } catch (IllegalArgumentException var19) {
                  throw getIllegalArgumentException(var19);
               }

               try {
                  var22 = var1;
                  if (var2 < 0) {
                     break label86;
                  }

                  var10000 = var1 instanceof WildcardType;
               } catch (IllegalArgumentException var17) {
                  throw getIllegalArgumentException(var17);
               }
            }

            try {
               if (var10000) {
                  return getClass((char)var6, ((WildcardType)var1).getUpperBounds()[0], (char)var7, var8);
               }
            } catch (IllegalArgumentException var18) {
               throw getIllegalArgumentException(var18);
            }

            try {
               var22 = var1;
            } catch (IllegalArgumentException var13) {
               throw getIllegalArgumentException(var13);
            }
         }

         label61: {
            label60: {
               try {
                  if (var0 < 0) {
                     break label60;
                  }

                  if (var22 == null) {
                     var23 = buildString_2(18393, 8523153398801949886L ^ var4);
                     break label61;
                  }
               } catch (IllegalArgumentException var16) {
                  throw getIllegalArgumentException(var16);
               }

               var22 = var1;
            }

            var23 = var22.getClass().getName();
         }

         String var20 = var23;
         throw new IllegalArgumentException(
            buildString_2(20721, 4898531394297000852L ^ var4) + var1 + buildString_2(22727, 9002013692185672609L ^ var4) + var20
         );
      } else {
         if (var10000) {
            Type var11 = ((GenericArrayType)var1).getGenericComponentType();
            return Array.newInstance(getClass((char)var6, var11, (char)var7, var8), 0).getClass();
         }

         try {
            var10000 = var1 instanceof TypeVariable;
            break label46;
         } catch (IllegalArgumentException var14) {
            throw getIllegalArgumentException(var14);
         }
      }
   }

   static boolean checkCondition(long param0, Object param2, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util141.85312070001270L J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: aload 2
      // 07: aload 3
      // 08: if_acmpeq 25
      // 0b: aload 2
      // 0c: ifnull 2d
      // 0f: goto 16
      // 12: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 2
      // 17: aload 3
      // 18: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1b: ifeq 2d
      // 1e: goto 25
      // 21: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // try (4 -> 9): 10 java/lang/IllegalArgumentException
      // try (7 -> 16): 17 java/lang/IllegalArgumentException
      // try (12 -> 21): 21 java/lang/IllegalArgumentException
   }

   public static boolean checkCondition_2(Type param0, char param1, int param2, char param3, Type param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic rip/breeze/client/Util141.85312070001270L J
      // 01a: lxor
      // 01b: lstore 5
      // 01d: lload 5
      // 01f: dup2
      // 020: ldc2_w 85312070001270
      // 023: lxor
      // 024: dup2
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 7
      // 02b: dup2
      // 02c: bipush 16
      // 02e: lshl
      // 02f: bipush 32
      // 031: lushr
      // 032: l2i
      // 033: istore 8
      // 035: dup2
      // 036: bipush 48
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 9
      // 03f: pop2
      // 040: dup2
      // 041: ldc2_w 97158436961402
      // 044: lxor
      // 045: lstore 10
      // 047: pop2
      // 048: aload 0
      // 049: aload 4
      // 04b: if_acmpne 054
      // 04e: bipush 1
      // 04f: ireturn
      // 050: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: aload 0
      // 055: instanceof java/lang/Class
      // 058: iload 1
      // 059: iflt 06e
      // 05c: ifeq 06a
      // 05f: aload 0
      // 060: aload 4
      // 062: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 065: ireturn
      // 066: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: aload 0
      // 06b: instanceof java/lang/reflect/ParameterizedType
      // 06e: iload 2
      // 06f: ifle 0fb
      // 072: ifeq 0f7
      // 075: aload 4
      // 077: iload 2
      // 078: iflt 08f
      // 07b: instanceof java/lang/reflect/ParameterizedType
      // 07e: ifne 08e
      // 081: goto 088
      // 084: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 087: athrow
      // 088: bipush 0
      // 089: ireturn
      // 08a: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: checkcast java/lang/reflect/ParameterizedType
      // 092: astore 12
      // 094: aload 4
      // 096: checkcast java/lang/reflect/ParameterizedType
      // 099: astore 13
      // 09b: aload 12
      // 09d: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType ()Ljava/lang/reflect/Type; 1
      // 0a2: lload 10
      // 0a4: dup2_x1
      // 0a5: pop2
      // 0a6: aload 13
      // 0a8: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType ()Ljava/lang/reflect/Type; 1
      // 0ad: invokestatic rip/breeze/client/Util141.checkCondition (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 0b0: iload 2
      // 0b1: iflt 0c8
      // 0b4: ifeq 0f5
      // 0b7: aload 12
      // 0b9: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 0be: aload 13
      // 0c0: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 0c5: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0c8: ifeq 0f5
      // 0cb: goto 0d2
      // 0ce: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d1: athrow
      // 0d2: aload 12
      // 0d4: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 0d9: aload 13
      // 0db: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 0e0: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 0e3: ifeq 0f5
      // 0e6: goto 0ed
      // 0e9: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: goto 0f6
      // 0f1: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: bipush 0
      // 0f6: ireturn
      // 0f7: aload 0
      // 0f8: instanceof java/lang/reflect/GenericArrayType
      // 0fb: iload 3
      // 0fc: ifle 149
      // 0ff: ifeq 145
      // 102: aload 4
      // 104: iload 2
      // 105: iflt 11c
      // 108: instanceof java/lang/reflect/GenericArrayType
      // 10b: ifne 11b
      // 10e: goto 115
      // 111: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 114: athrow
      // 115: bipush 0
      // 116: ireturn
      // 117: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11a: athrow
      // 11b: aload 0
      // 11c: checkcast java/lang/reflect/GenericArrayType
      // 11f: astore 12
      // 121: aload 4
      // 123: checkcast java/lang/reflect/GenericArrayType
      // 126: astore 13
      // 128: aload 12
      // 12a: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 12f: aload 13
      // 131: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 136: iload 7
      // 138: i2c
      // 139: swap
      // 13a: iload 8
      // 13c: swap
      // 13d: iload 9
      // 13f: i2c
      // 140: swap
      // 141: invokestatic rip/breeze/client/Util141.checkCondition_2 (Ljava/lang/reflect/Type;CICLjava/lang/reflect/Type;)Z
      // 144: ireturn
      // 145: aload 0
      // 146: instanceof java/lang/reflect/WildcardType
      // 149: iload 2
      // 14a: iflt 1b7
      // 14d: ifeq 1b3
      // 150: aload 4
      // 152: iload 3
      // 153: ifle 16a
      // 156: instanceof java/lang/reflect/WildcardType
      // 159: ifne 169
      // 15c: goto 163
      // 15f: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 162: athrow
      // 163: bipush 0
      // 164: ireturn
      // 165: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: aload 0
      // 16a: checkcast java/lang/reflect/WildcardType
      // 16d: astore 12
      // 16f: aload 4
      // 171: checkcast java/lang/reflect/WildcardType
      // 174: astore 13
      // 176: aload 12
      // 178: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 17d: aload 13
      // 17f: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 184: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 187: iload 1
      // 188: iflt 19f
      // 18b: ifeq 1b1
      // 18e: aload 12
      // 190: invokeinterface java/lang/reflect/WildcardType.getLowerBounds ()[Ljava/lang/reflect/Type; 1
      // 195: aload 13
      // 197: invokeinterface java/lang/reflect/WildcardType.getLowerBounds ()[Ljava/lang/reflect/Type; 1
      // 19c: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 19f: ifeq 1b1
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a8: athrow
      // 1a9: bipush 1
      // 1aa: goto 1b2
      // 1ad: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: bipush 0
      // 1b2: ireturn
      // 1b3: aload 0
      // 1b4: instanceof java/lang/reflect/TypeVariable
      // 1b7: iload 3
      // 1b8: iflt 21f
      // 1bb: ifeq 21e
      // 1be: aload 4
      // 1c0: iload 1
      // 1c1: iflt 1d8
      // 1c4: instanceof java/lang/reflect/TypeVariable
      // 1c7: ifne 1d7
      // 1ca: goto 1d1
      // 1cd: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d0: athrow
      // 1d1: bipush 0
      // 1d2: ireturn
      // 1d3: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d6: athrow
      // 1d7: aload 0
      // 1d8: checkcast java/lang/reflect/TypeVariable
      // 1db: astore 12
      // 1dd: aload 4
      // 1df: checkcast java/lang/reflect/TypeVariable
      // 1e2: astore 13
      // 1e4: aload 12
      // 1e6: iload 2
      // 1e7: ifle 1fb
      // 1ea: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration ()Ljava/lang/reflect/GenericDeclaration; 1
      // 1ef: aload 13
      // 1f1: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration ()Ljava/lang/reflect/GenericDeclaration; 1
      // 1f6: if_acmpne 21c
      // 1f9: aload 12
      // 1fb: invokeinterface java/lang/reflect/TypeVariable.getName ()Ljava/lang/String; 1
      // 200: aload 13
      // 202: invokeinterface java/lang/reflect/TypeVariable.getName ()Ljava/lang/String; 1
      // 207: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20a: ifeq 21c
      // 20d: goto 214
      // 210: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 213: athrow
      // 214: bipush 1
      // 215: goto 21d
      // 218: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21b: athrow
      // 21c: bipush 0
      // 21d: ireturn
      // 21e: bipush 0
      // 21f: ireturn
      // try (50 -> 55): 55 java/lang/IllegalArgumentException
      // try (57 -> 66): 66 java/lang/IllegalArgumentException
      // try (68 -> 78): 79 java/lang/IllegalArgumentException
      // try (73 -> 83): 83 java/lang/IllegalArgumentException
      // try (91 -> 108): 109 java/lang/IllegalArgumentException
      // try (102 -> 117): 118 java/lang/IllegalArgumentException
      // try (111 -> 122): 122 java/lang/IllegalArgumentException
      // try (126 -> 136): 137 java/lang/IllegalArgumentException
      // try (131 -> 141): 141 java/lang/IllegalArgumentException
      // try (163 -> 173): 174 java/lang/IllegalArgumentException
      // try (168 -> 178): 178 java/lang/IllegalArgumentException
      // try (186 -> 200): 201 java/lang/IllegalArgumentException
      // try (194 -> 205): 205 java/lang/IllegalArgumentException
      // try (209 -> 219): 220 java/lang/IllegalArgumentException
      // try (214 -> 224): 224 java/lang/IllegalArgumentException
      // try (232 -> 245): 246 java/lang/IllegalArgumentException
      // try (239 -> 250): 250 java/lang/IllegalArgumentException
   }

   static int getValue(long var0, Object var2) {
      var0 = 85312070001270L ^ var0;

      try {
         if (var2 != null) {
            return var2.hashCode();
         }
      } catch (IllegalArgumentException var3) {
         throw getIllegalArgumentException(var3);
      }

      return 0;
   }

   public static String getString(long var0, Type var2) {
      var0 = 85312070001270L ^ var0;

      try {
         if (var2 instanceof Class) {
            return ((Class)var2).getName();
         }
      } catch (IllegalArgumentException var3) {
         throw getIllegalArgumentException(var3);
      }

      return var2.toString();
   }

   static void processAll(long param0, Type param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util141.85312070001270L J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: lload 0
      // 07: dup2
      // 08: ldc2_w 116498665714941
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: aload 2
      // 0f: instanceof java/lang/Class
      // 12: ifeq 26
      // 15: aload 2
      // 16: checkcast java/lang/Class
      // 19: invokevirtual java/lang/Class.isPrimitive ()Z
      // 1c: ifne 2e
      // 1f: goto 26
      // 22: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2f
      // 2a: invokestatic rip/breeze/client/Util141.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: lload 3
      // 30: invokestatic rip/breeze/client/Util67.update (ZJ)V
      // 33: return
      // try (10 -> 17): 18 java/lang/IllegalArgumentException
      // try (13 -> 22): 22 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 45757193626093L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "\u000eõý\u009e)I=MC\u0099Pû\u009c±\bm ÿhnØÉ\u009b ¥\u000f^À$´[½@\u0097.\u009e®u®\u0015Q¯ }µs§ã@h\fª¿¿×z}ù\u0014ZÆbt\u0001.Wû*\u008fð\u0090ûÓxDRLúxijÖ\u000bþ\u0087wð¯öd\u008a\\\u008fàÔ%ù¦oõ~\u0018\u0084\u0094è2w8×\u0002d\u008c\u007fè\u008d¤Ï\u0019\u009e¡óßü\u008d>\u0019$\u000fk]í\\ÞWJ¾àû3\u0001w¨fÅ½·K/.v\txÙ\u0011";
      int var7 = "\u000eõý\u009e)I=MC\u0099Pû\u009c±\bm ÿhnØÉ\u009b ¥\u000f^À$´[½@\u0097.\u009e®u®\u0015Q¯ }µs§ã@h\fª¿¿×z}ù\u0014ZÆbt\u0001.Wû*\u008fð\u0090ûÓxDRLúxijÖ\u000bþ\u0087wð¯öd\u008a\\\u008fàÔ%ù¦oõ~\u0018\u0084\u0094è2w8×\u0002d\u008c\u007fè\u008d¤Ï\u0019\u009e¡óßü\u008d>\u0019$\u000fk]í\\ÞWJ¾àû3\u0001w¨fÅ½·K/.v\txÙ\u0011"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_C = var4;
            CONST_D = new String[3];
            CONST_A = new Type[0];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23864;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/bP", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }
}
