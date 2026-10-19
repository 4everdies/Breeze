package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.ï;
import rip.breeze.inject.թ;
import rip.breeze.inject.ի;

public class MathUtil3 {
   public static final String CONST_Ÿ;
   public static final String CONST_Þ;
   private static int int_ý;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public static rip.breeze.inject.é getÉ(Object[] var0) {
      byte[] var1 = (byte[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a ^ var2;
      long var4 = var2 ^ 85325770855674L;
      Object[] var10004 = new Object[]{null, null, var4};
      var10004[1] = 8;
      var10004[0] = var1;
      return getÉ_2(var10004);
   }

   public static rip.breeze.inject.é getÉ_2(Object[] var0) {
      byte[] var1 = (byte[])var0[0];
      int var2 = (Integer)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a ^ var3;
      long var5 = var3 ^ 108441121164649L;
      long var7 = var3 ^ 77812422968224L;
      long var10001 = var3 ^ 24095299276263L;
      int var9 = (int)((var3 ^ 24095299276263L) >>> 32);
      int var10 = (int)((var3 ^ 24095299276263L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      rip.breeze.inject.é var12 = new rip.breeze.inject.é(var5);
      ï var10000 = new ï(var9, (short)var10, var1, (short)var11);
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = var7;
      var10005[0] = var12;
      var10000.method_009(var10005);
      return var12;
   }

   public static byte[] invoke_3(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      ó var4 = (ó)var0[2];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 18716914882556L;
      return method_004(new Object[]{var1, var4.ժ_ÿ_2, var4.է_þ_2, var5});
   }

   public static byte[] invoke_4(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      ժ var2 = (ժ)var0[1];
      է var3 = (է)var0[2];
      long var4 = (Long)var0[3];
      var4 = encKey_a ^ var4;
      long var6 = var4 ^ 113597742562682L;
      long var8 = var4 ^ 77061129167966L;
      long var10 = var4 ^ 60797671829747L;
      õ var12 = new õ(var2, var6, var3);
      var1.method_002(new Object[]{var10, var12});
      return var12.ì(new Object[]{var8});
   }

   public static byte[] invoke_5(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      ó var2 = (ó)var0[1];
      long var3 = (Long)var0[2];
      int var5 = (Integer)var0[3];
      var3 = encKey_a ^ var3;
      long var6 = var3 ^ 87387639822885L;
      ժ var10001 = var2.ժ_ÿ_2;
      է var10002 = var2.է_þ_2;
      Object[] var10006 = new Object[]{null, null, null, null, var5};
      var10006[3] = var6;
      var10006[2] = var10002;
      var10006[1] = var10001;
      var10006[0] = var1;
      return method_006(var10006);
   }

   public static byte[] invoke_6(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      ժ var2 = (ժ)var0[1];
      է var3 = (է)var0[2];
      long var4 = (Long)var0[3];
      int var6 = (Integer)var0[4];
      var4 = encKey_a ^ var4;
      long var7 = var4 ^ 46265009943268L;
      long var9 = var4 ^ 30482731155498L;
      long var11 = var4 ^ 117531491161223L;
      õ var13 = new õ(var6, var2, var7, var3);
      var1.method_002(new Object[]{var11, var13});
      return var13.ì(new Object[]{var9});
   }

   public static byte[] invoke_7(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a ^ var2;
      long var4 = var2 ^ 113582130070431L;
      long var6 = var2 ^ 117955143446764L;
      long var8 = var2 ^ 28699725898817L;
      rip.breeze.inject.í var10 = new rip.breeze.inject.í(1, var4);
      var1.method_002(new Object[]{var8, var10});
      return var10.method_003(new Object[]{var6});
   }

   public static BreezeClass12 getBreezeClass12(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/é
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 3
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast java/lang/String
      // 1f: astore 5
      // 21: pop
      // 22: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 25: lload 3
      // 26: lxor
      // 27: lstore 3
      // 28: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 2b: aload 1
      // 2c: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 2f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34: astore 6
      // 36: istore 7
      // 38: aload 6
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq 8e
      // 42: aload 6
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast rip/breeze/inject/BreezeClass12
      // 4c: astore 8
      // 4e: aload 8
      // 50: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 53: aload 2
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: iload 7
      // 59: ifne 83
      // 5c: ifeq 89
      // 5f: goto 66
      // 62: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: aload 8
      // 68: iload 7
      // 6a: ifne 88
      // 6d: goto 74
      // 70: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 77: aload 5
      // 79: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7c: goto 83
      // 7f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82: athrow
      // 83: ifeq 89
      // 86: aload 8
      // 88: areturn
      // 89: iload 7
      // 8b: ifeq 38
      // 8e: aconst_null
      // 8f: areturn
      // try (40 -> 47): 48 java/lang/IllegalArgumentException
      // try (46 -> 53): 54 java/lang/IllegalArgumentException
      // try (50 -> 59): 60 java/lang/IllegalArgumentException
   }

   public static boolean isValid(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      var1 = encKey_a ^ var1;
      long var6 = var1 ^ 25194421426982L;

      try {
         if (getBreezeClass12(new Object[]{var3, var4, var6, var5}) != null) {
            return true;
         }
      } catch (IllegalArgumentException var8) {
         throw getIllegalArgumentException(var8);
      }

      return false;
   }

   public static rip.breeze.inject.á getÁ(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/é
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/String
      // 15: astore 3
      // 16: dup
      // 17: bipush 3
      // 18: aaload
      // 19: checkcast java/lang/Long
      // 1c: invokevirtual java/lang/Long.longValue ()J
      // 1f: lstore 4
      // 21: pop
      // 22: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 25: lload 4
      // 27: lxor
      // 28: lstore 4
      // 2a: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 2d: aload 1
      // 2e: getfield rip/breeze/inject/é.list_å_2 Ljava/util/List;
      // 31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36: astore 6
      // 38: istore 7
      // 3a: aload 6
      // 3c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 41: ifeq 7e
      // 44: aload 6
      // 46: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4b: checkcast rip/breeze/inject/á
      // 4e: astore 8
      // 50: aload 8
      // 52: iload 7
      // 54: ifeq 78
      // 57: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 5a: aload 2
      // 5b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5e: lload 4
      // 60: lconst_0
      // 61: lcmp
      // 62: ifle 7b
      // 65: ifeq 79
      // 68: goto 6f
      // 6b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6e: athrow
      // 6f: aload 8
      // 71: goto 78
      // 74: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: areturn
      // 79: iload 7
      // 7b: ifne 3a
      // 7e: aconst_null
      // 7f: areturn
      // try (40 -> 51): 52 java/lang/IllegalArgumentException
      // try (43 -> 55): 56 java/lang/IllegalArgumentException
   }

   public static boolean isValid_2(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      String var5 = (String)var0[3];
      var3 = encKey_a ^ var3;
      long var6 = var3 ^ 111793089921975L;

      try {
         if (getÁ(new Object[]{var1, var2, var5, var6}) != null) {
            return true;
         }
      } catch (IllegalArgumentException var8) {
         throw getIllegalArgumentException(var8);
      }

      return false;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static List getList(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 113009402344776L;
      int var7 = getValue_5();

      try {
         if (var4.isEmpty()) {
            throw new IllegalArgumentException(null /* removed */);
         }
      } catch (IllegalArgumentException var14) {
         throw getIllegalArgumentException(var14);
      }

      ArrayList var8 = new ArrayList();
      Iterator var9 = var1.list_ä_2.iterator();

      label74:
      while (true) {
         int var10000 = var9.hasNext();

         do {
            if (var10000 == 0) {
               return var8;
            }

            BreezeClass12 var10 = (BreezeClass12)var9.next();

            int var10001;
            label68: {
               label67: {
                  label66: {
                     try {
                        var10000 = var10.int_û & 4096;
                        var10001 = var7;
                        if (var2 <= 0L) {
                           break label68;
                        }

                        if (var7 != 0) {
                           break label67;
                        }

                        if (var10000 == 0) {
                           break label66;
                        }
                     } catch (IllegalArgumentException var13) {
                        throw getIllegalArgumentException(var13);
                     }

                     if (var2 >= 0L) {
                        continue label74;
                     }
                  }

                  String var10002 = var10.string_ú;
                  String var10003 = var10.string_ù;
                  var10000 = ւ.method_003(new Object[]{var4, var5, var10002, var10003});
               }

               try {
                  if (var2 < 0L) {
                     continue;
                  }

                  var10001 = var7;
               } catch (IllegalArgumentException var12) {
                  throw getIllegalArgumentException(var12);
               }
            }

            label51: {
               label50: {
                  try {
                     if (var10001 != 0) {
                        break label51;
                     }

                     if (var10000 != 0) {
                        break label50;
                     }
                  } catch (IllegalArgumentException var11) {
                     throw getIllegalArgumentException(var11);
                  }

                  if (var2 >= 0L) {
                     continue label74;
                  }
               }

               var8.add(var10);
            }

            var10000 = var7;
         } while (var2 < 0L);

         if (var10000 != 0) {
            return var8;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static List getList_2(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 71902657668576L;
      int var7 = getValue_6();

      try {
         if (var4.isEmpty()) {
            throw new IllegalArgumentException(null /* removed */);
         }
      } catch (IllegalArgumentException var14) {
         throw getIllegalArgumentException(var14);
      }

      ArrayList var8 = new ArrayList();
      Iterator var9 = var1.list_å_2.iterator();

      label74:
      while (true) {
         int var10000 = var9.hasNext();

         do {
            if (var10000 == 0) {
               return var8;
            }

            rip.breeze.inject.á var10 = (rip.breeze.inject.á)var9.next();

            int var10001;
            label68: {
               label67: {
                  label66: {
                     try {
                        var10000 = var10.int_ý_2 & 4096;
                        var10001 = var7;
                        if (var2 < 0L) {
                           break label68;
                        }

                        if (var7 == 0) {
                           break label67;
                        }

                        if (var10000 == 0) {
                           break label66;
                        }
                     } catch (IllegalArgumentException var13) {
                        throw getIllegalArgumentException(var13);
                     }

                     if (var2 >= 0L) {
                        continue label74;
                     }
                  }

                  String var10003 = var10.string_û_2;
                  var10000 = ւ.method_005(new Object[]{var4, var10.string_ü_2, var5, var10003});
               }

               try {
                  if (var2 < 0L) {
                     continue;
                  }

                  var10001 = var7;
               } catch (IllegalArgumentException var12) {
                  throw getIllegalArgumentException(var12);
               }
            }

            label51: {
               label50: {
                  try {
                     if (var10001 == 0) {
                        break label51;
                     }

                     if (var10000 != 0) {
                        break label50;
                     }
                  } catch (IllegalArgumentException var11) {
                     throw getIllegalArgumentException(var11);
                  }

                  if (var2 >= 0L) {
                     continue label74;
                  }
               }

               var8.add(var10);
            }

            var10000 = var7;
         } while (var2 < 0L);

         if (var10000 == 0) {
            return var8;
         }
      }
   }

   public static boolean checkCondition(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 2
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 3
      // 01f: pop
      // 020: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 023: lload 3
      // 024: lxor
      // 025: lstore 3
      // 026: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 029: istore 5
      // 02b: iload 1
      // 02c: bipush 1
      // 02d: iand
      // 02e: iload 5
      // 030: ifeq 055
      // 033: ifeq 04b
      // 036: goto 03d
      // 039: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: bipush 4
      // 03e: istore 6
      // 040: iload 5
      // 042: lload 3
      // 043: lconst_0
      // 044: lcmp
      // 045: ifle 0ac
      // 048: ifne 0a9
      // 04b: iload 1
      // 04c: bipush 4
      // 04d: iand
      // 04e: goto 055
      // 051: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 054: athrow
      // 055: iload 5
      // 057: lload 3
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 084
      // 05d: ifeq 082
      // 060: ifeq 078
      // 063: goto 06a
      // 066: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: bipush 3
      // 06b: istore 6
      // 06d: iload 5
      // 06f: lload 3
      // 070: lconst_0
      // 071: lcmp
      // 072: iflt 0ac
      // 075: ifne 0a9
      // 078: iload 1
      // 079: bipush 2
      // 07a: iand
      // 07b: goto 082
      // 07e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 081: athrow
      // 082: iload 5
      // 084: ifeq 0a7
      // 087: ifne 09f
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: bipush 2
      // 092: istore 6
      // 094: iload 5
      // 096: lload 3
      // 097: lconst_0
      // 098: lcmp
      // 099: iflt 0ac
      // 09c: ifne 0a9
      // 09f: bipush 1
      // 0a0: goto 0a7
      // 0a3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a6: athrow
      // 0a7: istore 6
      // 0a9: iload 2
      // 0aa: bipush 1
      // 0ab: iand
      // 0ac: iload 5
      // 0ae: lload 3
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 0db
      // 0b4: ifeq 0d9
      // 0b7: ifeq 0cf
      // 0ba: goto 0c1
      // 0bd: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c0: athrow
      // 0c1: bipush 4
      // 0c2: istore 7
      // 0c4: iload 5
      // 0c6: lload 3
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: ifle 12f
      // 0cc: ifne 12d
      // 0cf: iload 2
      // 0d0: bipush 4
      // 0d1: iand
      // 0d2: goto 0d9
      // 0d5: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d8: athrow
      // 0d9: iload 5
      // 0db: lload 3
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: iflt 108
      // 0e1: ifeq 106
      // 0e4: ifeq 0fc
      // 0e7: goto 0ee
      // 0ea: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ed: athrow
      // 0ee: bipush 3
      // 0ef: istore 7
      // 0f1: iload 5
      // 0f3: lload 3
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: iflt 12f
      // 0f9: ifne 12d
      // 0fc: iload 2
      // 0fd: bipush 2
      // 0fe: iand
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: iload 5
      // 108: ifeq 12b
      // 10b: ifne 123
      // 10e: goto 115
      // 111: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 114: athrow
      // 115: bipush 2
      // 116: istore 7
      // 118: iload 5
      // 11a: lload 3
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 12f
      // 120: ifne 12d
      // 123: bipush 1
      // 124: goto 12b
      // 127: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: istore 7
      // 12d: iload 6
      // 12f: iload 5
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 13c
      // 137: ifeq 14e
      // 13a: iload 7
      // 13c: if_icmpge 151
      // 13f: goto 146
      // 142: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 145: athrow
      // 146: bipush 1
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14d: athrow
      // 14e: goto 152
      // 151: bipush 0
      // 152: ireturn
      // try (26 -> 32): 33 java/lang/IllegalArgumentException
      // try (37 -> 46): 47 java/lang/IllegalArgumentException
      // try (49 -> 56): 57 java/lang/IllegalArgumentException
      // try (61 -> 70): 71 java/lang/IllegalArgumentException
      // try (73 -> 76): 77 java/lang/IllegalArgumentException
      // try (81 -> 88): 89 java/lang/IllegalArgumentException
      // try (92 -> 102): 103 java/lang/IllegalArgumentException
      // try (107 -> 116): 117 java/lang/IllegalArgumentException
      // try (119 -> 126): 127 java/lang/IllegalArgumentException
      // try (131 -> 140): 141 java/lang/IllegalArgumentException
      // try (143 -> 146): 147 java/lang/IllegalArgumentException
      // try (151 -> 158): 159 java/lang/IllegalArgumentException
      // try (162 -> 171): 172 java/lang/IllegalArgumentException
      // try (169 -> 175): 176 java/lang/IllegalArgumentException
   }

   public static int getValue(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[1];
      int var3 = var1;
      var3 &= -3;
      var3 &= -5;
      var3 &= -2;
      return var3 | var2;
   }

   public static int getValue_2(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/MathUtil3
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 01c: istore 4
      // 01e: aload 1
      // 01f: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 022: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 025: iload 4
      // 027: ifeq 043
      // 02a: ifeq 03c
      // 02d: goto 034
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: sipush 177
      // 037: ireturn
      // 038: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03b: athrow
      // 03c: aload 1
      // 03d: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 040: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 043: iload 4
      // 045: lload 2
      // 046: lconst_0
      // 047: lcmp
      // 048: ifle 069
      // 04b: ifeq 067
      // 04e: ifeq 060
      // 051: goto 058
      // 054: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: sipush 172
      // 05b: ireturn
      // 05c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05f: athrow
      // 060: aload 1
      // 061: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 064: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 067: iload 4
      // 069: lload 2
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: ifle 08d
      // 06f: ifeq 08b
      // 072: ifeq 084
      // 075: goto 07c
      // 078: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: sipush 172
      // 07f: ireturn
      // 080: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: aload 1
      // 085: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 088: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 08b: iload 4
      // 08d: lload 2
      // 08e: lconst_0
      // 08f: lcmp
      // 090: iflt 0b1
      // 093: ifeq 0af
      // 096: ifeq 0a8
      // 099: goto 0a0
      // 09c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09f: athrow
      // 0a0: sipush 172
      // 0a3: ireturn
      // 0a4: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a7: athrow
      // 0a8: aload 1
      // 0a9: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 0ac: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0af: iload 4
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0d5
      // 0b7: ifeq 0d3
      // 0ba: ifeq 0cc
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c3: athrow
      // 0c4: sipush 172
      // 0c7: ireturn
      // 0c8: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 0d0: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0d3: iload 4
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 0f9
      // 0db: ifeq 0f7
      // 0de: ifeq 0f0
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e7: athrow
      // 0e8: sipush 172
      // 0eb: ireturn
      // 0ec: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 0f4: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0f7: iload 4
      // 0f9: lload 2
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 11d
      // 0ff: ifeq 11b
      // 102: ifeq 114
      // 105: goto 10c
      // 108: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10b: athrow
      // 10c: sipush 174
      // 10f: ireturn
      // 110: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: aload 1
      // 115: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 118: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 11b: iload 4
      // 11d: lload 2
      // 11e: lconst_0
      // 11f: lcmp
      // 120: ifle 141
      // 123: ifeq 13f
      // 126: ifeq 138
      // 129: goto 130
      // 12c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12f: athrow
      // 130: sipush 173
      // 133: ireturn
      // 134: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 137: athrow
      // 138: aload 1
      // 139: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 13c: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 13f: iload 4
      // 141: ifeq 159
      // 144: ifeq 156
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14d: athrow
      // 14e: sipush 175
      // 151: ireturn
      // 152: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 155: athrow
      // 156: sipush 176
      // 159: ireturn
      // try (19 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 30): 30 java/lang/IllegalArgumentException
      // try (35 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (52 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 64): 64 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 81): 81 java/lang/IllegalArgumentException
      // try (86 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 98): 98 java/lang/IllegalArgumentException
      // try (103 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 115): 115 java/lang/IllegalArgumentException
      // try (120 -> 127): 128 java/lang/IllegalArgumentException
      // try (126 -> 132): 132 java/lang/IllegalArgumentException
      // try (137 -> 144): 145 java/lang/IllegalArgumentException
      // try (143 -> 149): 149 java/lang/IllegalArgumentException
      // try (154 -> 157): 158 java/lang/IllegalArgumentException
      // try (156 -> 162): 162 java/lang/IllegalArgumentException
   }

   public static int getValue_3(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/MathUtil3
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 01c: istore 4
      // 01e: aload 1
      // 01f: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 022: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 025: iload 4
      // 027: ifeq 042
      // 02a: ifeq 03b
      // 02d: goto 034
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: bipush 21
      // 036: ireturn
      // 037: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03a: athrow
      // 03b: aload 1
      // 03c: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 03f: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 042: iload 4
      // 044: lload 2
      // 045: lconst_0
      // 046: lcmp
      // 047: ifle 067
      // 04a: ifeq 065
      // 04d: ifeq 05e
      // 050: goto 057
      // 053: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 056: athrow
      // 057: bipush 21
      // 059: ireturn
      // 05a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05d: athrow
      // 05e: aload 1
      // 05f: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 062: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 065: iload 4
      // 067: lload 2
      // 068: lconst_0
      // 069: lcmp
      // 06a: ifle 08a
      // 06d: ifeq 088
      // 070: ifeq 081
      // 073: goto 07a
      // 076: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: bipush 21
      // 07c: ireturn
      // 07d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: aload 1
      // 082: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 085: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 088: iload 4
      // 08a: lload 2
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: iflt 0ad
      // 090: ifeq 0ab
      // 093: ifeq 0a4
      // 096: goto 09d
      // 099: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: bipush 21
      // 09f: ireturn
      // 0a0: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 1
      // 0a5: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 0a8: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0ab: iload 4
      // 0ad: lload 2
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: iflt 0d0
      // 0b3: ifeq 0ce
      // 0b6: ifeq 0c7
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: bipush 21
      // 0c2: ireturn
      // 0c3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 0cb: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0ce: iload 4
      // 0d0: lload 2
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: ifle 0f3
      // 0d6: ifeq 0f1
      // 0d9: ifeq 0ea
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2: athrow
      // 0e3: bipush 23
      // 0e5: ireturn
      // 0e6: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 0ee: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0f1: iload 4
      // 0f3: lload 2
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: ifle 116
      // 0f9: ifeq 114
      // 0fc: ifeq 10d
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: bipush 22
      // 108: ireturn
      // 109: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: aload 1
      // 10e: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 111: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 114: iload 4
      // 116: ifeq 12c
      // 119: ifeq 12a
      // 11c: goto 123
      // 11f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 122: athrow
      // 123: bipush 24
      // 125: ireturn
      // 126: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: bipush 25
      // 12c: ireturn
      // try (19 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 30): 30 java/lang/IllegalArgumentException
      // try (35 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (52 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 64): 64 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 81): 81 java/lang/IllegalArgumentException
      // try (86 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 98): 98 java/lang/IllegalArgumentException
      // try (103 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 115): 115 java/lang/IllegalArgumentException
      // try (120 -> 127): 128 java/lang/IllegalArgumentException
      // try (126 -> 132): 132 java/lang/IllegalArgumentException
      // try (137 -> 140): 141 java/lang/IllegalArgumentException
      // try (139 -> 145): 145 java/lang/IllegalArgumentException
   }

   public static int getValue_4(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/MathUtil3
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 01c: istore 4
      // 01e: aload 3
      // 01f: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 022: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 025: iload 4
      // 027: ifeq 042
      // 02a: ifeq 03b
      // 02d: goto 034
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: bipush 54
      // 036: ireturn
      // 037: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03a: athrow
      // 03b: aload 3
      // 03c: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 03f: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 042: iload 4
      // 044: lload 1
      // 045: lconst_0
      // 046: lcmp
      // 047: ifle 067
      // 04a: ifeq 065
      // 04d: ifeq 05e
      // 050: goto 057
      // 053: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 056: athrow
      // 057: bipush 54
      // 059: ireturn
      // 05a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05d: athrow
      // 05e: aload 3
      // 05f: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 062: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 065: iload 4
      // 067: lload 1
      // 068: lconst_0
      // 069: lcmp
      // 06a: iflt 08a
      // 06d: ifeq 088
      // 070: ifeq 081
      // 073: goto 07a
      // 076: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: bipush 54
      // 07c: ireturn
      // 07d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: aload 3
      // 082: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 085: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 088: iload 4
      // 08a: lload 1
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: ifle 0ad
      // 090: ifeq 0ab
      // 093: ifeq 0a4
      // 096: goto 09d
      // 099: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: bipush 54
      // 09f: ireturn
      // 0a0: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 3
      // 0a5: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 0a8: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0ab: iload 4
      // 0ad: lload 1
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 0d0
      // 0b3: ifeq 0ce
      // 0b6: ifeq 0c7
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: bipush 54
      // 0c2: ireturn
      // 0c3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 0cb: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0ce: iload 4
      // 0d0: lload 1
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: iflt 0f3
      // 0d6: ifeq 0f1
      // 0d9: ifeq 0ea
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2: athrow
      // 0e3: bipush 56
      // 0e5: ireturn
      // 0e6: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: aload 3
      // 0eb: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 0ee: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0f1: iload 4
      // 0f3: lload 1
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: ifle 116
      // 0f9: ifeq 114
      // 0fc: ifeq 10d
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: bipush 55
      // 108: ireturn
      // 109: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: aload 3
      // 10e: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 111: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 114: iload 4
      // 116: ifeq 12c
      // 119: ifeq 12a
      // 11c: goto 123
      // 11f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 122: athrow
      // 123: bipush 57
      // 125: ireturn
      // 126: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: bipush 58
      // 12c: ireturn
      // try (19 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 30): 30 java/lang/IllegalArgumentException
      // try (35 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (52 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 64): 64 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 81): 81 java/lang/IllegalArgumentException
      // try (86 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 98): 98 java/lang/IllegalArgumentException
      // try (103 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 115): 115 java/lang/IllegalArgumentException
      // try (120 -> 127): 128 java/lang/IllegalArgumentException
      // try (126 -> 132): 132 java/lang/IllegalArgumentException
      // try (137 -> 140): 141 java/lang/IllegalArgumentException
      // try (139 -> 145): 145 java/lang/IllegalArgumentException
   }

   public static int calculate(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/BreezeClass12
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 77553921225126
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 124405314957460
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 47211738613489
      // 02c: lxor
      // 02d: lstore 8
      // 02f: pop2
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 033: bipush 0
      // 034: istore 10
      // 036: istore 11
      // 038: aload 3
      // 039: iload 11
      // 03b: ifeq 052
      // 03e: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 041: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 044: ifne 051
      // 047: goto 04e
      // 04a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04d: athrow
      // 04e: bipush 1
      // 04f: istore 10
      // 051: aload 3
      // 052: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 055: lload 4
      // 057: dup2_x1
      // 058: pop2
      // 059: bipush 2
      // 05a: anewarray 4
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 1
      // 060: swap
      // 061: aastore
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 0
      // 069: swap
      // 06a: aastore
      // 06b: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 06e: astore 12
      // 070: aload 12
      // 072: arraylength
      // 073: istore 13
      // 075: bipush 0
      // 076: istore 14
      // 078: iload 14
      // 07a: iload 13
      // 07c: if_icmpge 0a7
      // 07f: aload 12
      // 081: iload 14
      // 083: aaload
      // 084: astore 15
      // 086: iload 10
      // 088: aload 15
      // 08a: lload 6
      // 08c: bipush 1
      // 08d: anewarray 4
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 09c: iadd
      // 09d: istore 10
      // 09f: iinc 14 1
      // 0a2: iload 11
      // 0a4: ifne 078
      // 0a7: aload 3
      // 0a8: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 0ab: lload 8
      // 0ad: bipush 1
      // 0ae: anewarray 4
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 0
      // 0b8: swap
      // 0b9: aastore
      // 0ba: invokevirtual rip/breeze/inject/թ.method_008 ([Ljava/lang/Object;)Ljava/util/ListIterator;
      // 0bd: astore 12
      // 0bf: aload 12
      // 0c1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c6: ifeq 204
      // 0c9: aload 12
      // 0cb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d0: checkcast rip/breeze/inject/ջ
      // 0d3: astore 13
      // 0d5: aload 13
      // 0d7: bipush 0
      // 0d8: anewarray 4
      // 0db: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0de: lload 1
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iflt 20e
      // 0e4: bipush 54
      // 0e6: iload 11
      // 0e8: ifeq 20d
      // 0eb: iload 11
      // 0ed: lload 1
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 142
      // 0f3: ifeq 140
      // 0f6: goto 0fd
      // 0f9: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: lload 1
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 139
      // 103: if_icmplt 12e
      // 106: goto 10d
      // 109: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: aload 13
      // 10f: iload 11
      // 111: ifeq 172
      // 114: goto 11b
      // 117: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11a: athrow
      // 11b: bipush 0
      // 11c: anewarray 4
      // 11f: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 122: bipush 58
      // 124: if_icmple 170
      // 127: goto 12e
      // 12a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12d: athrow
      // 12e: aload 13
      // 130: bipush 0
      // 131: anewarray 4
      // 134: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 137: bipush 21
      // 139: goto 140
      // 13c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13f: athrow
      // 140: iload 11
      // 142: ifeq 1cb
      // 145: if_icmplt 1ac
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14e: athrow
      // 14f: aload 13
      // 151: bipush 0
      // 152: anewarray 4
      // 155: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 158: bipush 25
      // 15a: iload 11
      // 15c: ifeq 1cb
      // 15f: goto 166
      // 162: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 165: athrow
      // 166: if_icmpgt 1ac
      // 169: goto 170
      // 16c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16f: athrow
      // 170: aload 13
      // 172: checkcast rip/breeze/inject/ի
      // 175: astore 14
      // 177: aload 14
      // 179: getfield rip/breeze/inject/ի.int_ç_2 I
      // 17c: iload 11
      // 17e: lload 1
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 189
      // 184: ifeq 19f
      // 187: iload 10
      // 189: if_icmple 1a1
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 192: athrow
      // 193: aload 14
      // 195: getfield rip/breeze/inject/ի.int_ç_2 I
      // 198: goto 19f
      // 19b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19e: athrow
      // 19f: istore 10
      // 1a1: iload 11
      // 1a3: lload 1
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 201
      // 1a9: ifne 1ff
      // 1ac: aload 13
      // 1ae: iload 11
      // 1b0: ifeq 1d0
      // 1b3: goto 1ba
      // 1b6: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b9: athrow
      // 1ba: bipush 0
      // 1bb: anewarray 4
      // 1be: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 1c1: sipush 132
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ca: athrow
      // 1cb: if_icmpne 1ff
      // 1ce: aload 13
      // 1d0: checkcast rip/breeze/inject/ո
      // 1d3: astore 14
      // 1d5: aload 14
      // 1d7: getfield rip/breeze/inject/ո.int_ç_2 I
      // 1da: iload 11
      // 1dc: lload 1
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 1e7
      // 1e2: ifeq 1fd
      // 1e5: iload 10
      // 1e7: if_icmple 1ff
      // 1ea: goto 1f1
      // 1ed: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f0: athrow
      // 1f1: aload 14
      // 1f3: getfield rip/breeze/inject/ո.int_ç_2 I
      // 1f6: goto 1fd
      // 1f9: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fc: athrow
      // 1fd: istore 10
      // 1ff: iload 11
      // 201: ifne 0bf
      // 204: iload 10
      // 206: lload 1
      // 207: lconst_0
      // 208: lcmp
      // 209: ifle 20e
      // 20c: bipush 2
      // 20d: iadd
      // 20e: ireturn
      // try (35 -> 41): 42 java/lang/IllegalArgumentException
      // try (118 -> 135): 136 java/lang/IllegalArgumentException
      // try (129 -> 143): 144 java/lang/IllegalArgumentException
      // try (138 -> 149): 150 java/lang/IllegalArgumentException
      // try (146 -> 157): 158 java/lang/IllegalArgumentException
      // try (152 -> 165): 166 java/lang/IllegalArgumentException
      // try (168 -> 171): 172 java/lang/IllegalArgumentException
      // try (170 -> 181): 182 java/lang/IllegalArgumentException
      // try (174 -> 185): 186 java/lang/IllegalArgumentException
      // try (191 -> 201): 202 java/lang/IllegalArgumentException
      // try (199 -> 206): 207 java/lang/IllegalArgumentException
      // try (210 -> 219): 220 java/lang/IllegalArgumentException
      // try (216 -> 226): 227 java/lang/IllegalArgumentException
      // try (233 -> 243): 244 java/lang/IllegalArgumentException
      // try (241 -> 248): 249 java/lang/IllegalArgumentException
   }

   public static թ getԹ(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/MathUtil3
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 104958109838021
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 62896169421178
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 02c: new rip/breeze/inject/թ
      // 02f: dup
      // 030: invokespecial rip/breeze/inject/թ.<init> ()V
      // 033: astore 8
      // 035: istore 9
      // 037: aload 3
      // 038: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 03b: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 03e: iload 9
      // 040: ifeq 0ea
      // 043: ifeq 0dc
      // 046: goto 04d
      // 049: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04c: athrow
      // 04d: aload 8
      // 04f: new rip/breeze/inject/լ
      // 052: dup
      // 053: sipush 192
      // 056: getstatic rip/breeze/classtransform/ջ.CONST_Û_2 Ljava/lang/String;
      // 059: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 05c: lload 6
      // 05e: bipush 2
      // 05f: anewarray 4
      // 062: dup_x2
      // 063: dup_x2
      // 064: pop
      // 065: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068: bipush 1
      // 069: swap
      // 06a: aastore
      // 06b: dup_x1
      // 06c: swap
      // 06d: bipush 0
      // 06e: swap
      // 06f: aastore
      // 070: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 073: aload 8
      // 075: lload 1
      // 076: lconst_0
      // 077: lcmp
      // 078: iflt 5e2
      // 07b: new rip/breeze/inject/կ
      // 07e: dup
      // 07f: sipush 182
      // 082: getstatic rip/breeze/classtransform/ջ.CONST_Û_2 Ljava/lang/String;
      // 085: sipush 24166
      // 088: ldc2_w 4079316001759854860
      // 08b: lload 1
      // 08c: lxor
      // 08d: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: lload 4
      // 094: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 097: bipush 0
      // 098: anewarray 4
      // 09b: bipush 3
      // 09c: anewarray 4
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 2
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 1
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x2
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0b5: bipush 0
      // 0b6: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 0b9: lload 6
      // 0bb: bipush 2
      // 0bc: anewarray 4
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 1
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0d0: iload 9
      // 0d2: ifne 5e0
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: aload 3
      // 0dd: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 0e0: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0e3: goto 0ea
      // 0e6: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: iload 9
      // 0ec: lload 1
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 19e
      // 0f2: ifeq 19c
      // 0f5: ifeq 18e
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: aload 8
      // 101: new rip/breeze/inject/լ
      // 104: dup
      // 105: sipush 192
      // 108: getstatic rip/breeze/classtransform/ջ.CONST_Ú_2 Ljava/lang/String;
      // 10b: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 10e: lload 6
      // 110: bipush 2
      // 111: anewarray 4
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 1
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 125: aload 8
      // 127: lload 1
      // 128: lconst_0
      // 129: lcmp
      // 12a: iflt 5e2
      // 12d: new rip/breeze/inject/կ
      // 130: dup
      // 131: sipush 182
      // 134: getstatic rip/breeze/classtransform/ջ.CONST_Ú_2 Ljava/lang/String;
      // 137: sipush 3643
      // 13a: ldc2_w 5333922297636049225
      // 13d: lload 1
      // 13e: lxor
      // 13f: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: lload 4
      // 146: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 149: bipush 0
      // 14a: anewarray 4
      // 14d: bipush 3
      // 14e: anewarray 4
      // 151: dup_x1
      // 152: swap
      // 153: bipush 2
      // 154: swap
      // 155: aastore
      // 156: dup_x1
      // 157: swap
      // 158: bipush 1
      // 159: swap
      // 15a: aastore
      // 15b: dup_x2
      // 15c: dup_x2
      // 15d: pop
      // 15e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 167: bipush 0
      // 168: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 16b: lload 6
      // 16d: bipush 2
      // 16e: anewarray 4
      // 171: dup_x2
      // 172: dup_x2
      // 173: pop
      // 174: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 177: bipush 1
      // 178: swap
      // 179: aastore
      // 17a: dup_x1
      // 17b: swap
      // 17c: bipush 0
      // 17d: swap
      // 17e: aastore
      // 17f: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 182: iload 9
      // 184: ifne 5e0
      // 187: goto 18e
      // 18a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d: athrow
      // 18e: aload 3
      // 18f: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 192: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 195: goto 19c
      // 198: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: iload 9
      // 19e: lload 1
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 250
      // 1a4: ifeq 24e
      // 1a7: ifeq 240
      // 1aa: goto 1b1
      // 1ad: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: aload 8
      // 1b3: new rip/breeze/inject/լ
      // 1b6: dup
      // 1b7: sipush 192
      // 1ba: getstatic rip/breeze/classtransform/ջ.CONST_Ø_2 Ljava/lang/String;
      // 1bd: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 1c0: lload 6
      // 1c2: bipush 2
      // 1c3: anewarray 4
      // 1c6: dup_x2
      // 1c7: dup_x2
      // 1c8: pop
      // 1c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cc: bipush 1
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1d7: aload 8
      // 1d9: lload 1
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: iflt 5e2
      // 1df: new rip/breeze/inject/կ
      // 1e2: dup
      // 1e3: sipush 182
      // 1e6: getstatic rip/breeze/classtransform/ջ.CONST_Ø_2 Ljava/lang/String;
      // 1e9: sipush 28611
      // 1ec: ldc2_w 5708610172606034102
      // 1ef: lload 1
      // 1f0: lxor
      // 1f1: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: lload 4
      // 1f8: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 1fb: bipush 0
      // 1fc: anewarray 4
      // 1ff: bipush 3
      // 200: anewarray 4
      // 203: dup_x1
      // 204: swap
      // 205: bipush 2
      // 206: swap
      // 207: aastore
      // 208: dup_x1
      // 209: swap
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
      // 216: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 219: bipush 0
      // 21a: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 21d: lload 6
      // 21f: bipush 2
      // 220: anewarray 4
      // 223: dup_x2
      // 224: dup_x2
      // 225: pop
      // 226: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 229: bipush 1
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x1
      // 22d: swap
      // 22e: bipush 0
      // 22f: swap
      // 230: aastore
      // 231: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 234: iload 9
      // 236: ifne 5e0
      // 239: goto 240
      // 23c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23f: athrow
      // 240: aload 3
      // 241: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 244: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 247: goto 24e
      // 24a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24d: athrow
      // 24e: iload 9
      // 250: lload 1
      // 251: lconst_0
      // 252: lcmp
      // 253: ifle 302
      // 256: ifeq 300
      // 259: ifeq 2f2
      // 25c: goto 263
      // 25f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 262: athrow
      // 263: aload 8
      // 265: new rip/breeze/inject/լ
      // 268: dup
      // 269: sipush 192
      // 26c: getstatic rip/breeze/classtransform/ջ.CONST_Ù_2 Ljava/lang/String;
      // 26f: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 272: lload 6
      // 274: bipush 2
      // 275: anewarray 4
      // 278: dup_x2
      // 279: dup_x2
      // 27a: pop
      // 27b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27e: bipush 1
      // 27f: swap
      // 280: aastore
      // 281: dup_x1
      // 282: swap
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 289: aload 8
      // 28b: lload 1
      // 28c: lconst_0
      // 28d: lcmp
      // 28e: ifle 5e2
      // 291: new rip/breeze/inject/կ
      // 294: dup
      // 295: sipush 182
      // 298: getstatic rip/breeze/classtransform/ջ.CONST_Ù_2 Ljava/lang/String;
      // 29b: sipush 19339
      // 29e: ldc2_w 4333944845327406326
      // 2a1: lload 1
      // 2a2: lxor
      // 2a3: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: lload 4
      // 2aa: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 2ad: bipush 0
      // 2ae: anewarray 4
      // 2b1: bipush 3
      // 2b2: anewarray 4
      // 2b5: dup_x1
      // 2b6: swap
      // 2b7: bipush 2
      // 2b8: swap
      // 2b9: aastore
      // 2ba: dup_x1
      // 2bb: swap
      // 2bc: bipush 1
      // 2bd: swap
      // 2be: aastore
      // 2bf: dup_x2
      // 2c0: dup_x2
      // 2c1: pop
      // 2c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c5: bipush 0
      // 2c6: swap
      // 2c7: aastore
      // 2c8: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2cb: bipush 0
      // 2cc: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 2cf: lload 6
      // 2d1: bipush 2
      // 2d2: anewarray 4
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 1
      // 2dc: swap
      // 2dd: aastore
      // 2de: dup_x1
      // 2df: swap
      // 2e0: bipush 0
      // 2e1: swap
      // 2e2: aastore
      // 2e3: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 2e6: iload 9
      // 2e8: ifne 5e0
      // 2eb: goto 2f2
      // 2ee: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f1: athrow
      // 2f2: aload 3
      // 2f3: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 2f6: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 2f9: goto 300
      // 2fc: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ff: athrow
      // 300: iload 9
      // 302: lload 1
      // 303: lconst_0
      // 304: lcmp
      // 305: iflt 3b4
      // 308: ifeq 3b2
      // 30b: ifeq 3a4
      // 30e: goto 315
      // 311: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 314: athrow
      // 315: aload 8
      // 317: new rip/breeze/inject/լ
      // 31a: dup
      // 31b: sipush 192
      // 31e: getstatic rip/breeze/classtransform/ջ.CONST_Ö_2 Ljava/lang/String;
      // 321: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 324: lload 6
      // 326: bipush 2
      // 327: anewarray 4
      // 32a: dup_x2
      // 32b: dup_x2
      // 32c: pop
      // 32d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 330: bipush 1
      // 331: swap
      // 332: aastore
      // 333: dup_x1
      // 334: swap
      // 335: bipush 0
      // 336: swap
      // 337: aastore
      // 338: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 33b: aload 8
      // 33d: lload 1
      // 33e: lconst_0
      // 33f: lcmp
      // 340: iflt 5e2
      // 343: new rip/breeze/inject/կ
      // 346: dup
      // 347: sipush 182
      // 34a: getstatic rip/breeze/classtransform/ջ.CONST_Ö_2 Ljava/lang/String;
      // 34d: sipush 18291
      // 350: ldc2_w 3780625403453577228
      // 353: lload 1
      // 354: lxor
      // 355: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: lload 4
      // 35c: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 35f: bipush 0
      // 360: anewarray 4
      // 363: bipush 3
      // 364: anewarray 4
      // 367: dup_x1
      // 368: swap
      // 369: bipush 2
      // 36a: swap
      // 36b: aastore
      // 36c: dup_x1
      // 36d: swap
      // 36e: bipush 1
      // 36f: swap
      // 370: aastore
      // 371: dup_x2
      // 372: dup_x2
      // 373: pop
      // 374: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 377: bipush 0
      // 378: swap
      // 379: aastore
      // 37a: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 37d: bipush 0
      // 37e: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 381: lload 6
      // 383: bipush 2
      // 384: anewarray 4
      // 387: dup_x2
      // 388: dup_x2
      // 389: pop
      // 38a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38d: bipush 1
      // 38e: swap
      // 38f: aastore
      // 390: dup_x1
      // 391: swap
      // 392: bipush 0
      // 393: swap
      // 394: aastore
      // 395: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 398: iload 9
      // 39a: ifne 5e0
      // 39d: goto 3a4
      // 3a0: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a3: athrow
      // 3a4: aload 3
      // 3a5: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 3a8: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 3ab: goto 3b2
      // 3ae: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b1: athrow
      // 3b2: iload 9
      // 3b4: lload 1
      // 3b5: lconst_0
      // 3b6: lcmp
      // 3b7: iflt 46c
      // 3ba: ifeq 464
      // 3bd: ifeq 456
      // 3c0: goto 3c7
      // 3c3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c6: athrow
      // 3c7: aload 8
      // 3c9: new rip/breeze/inject/լ
      // 3cc: dup
      // 3cd: sipush 192
      // 3d0: getstatic rip/breeze/classtransform/ջ.CONST_Ô_2 Ljava/lang/String;
      // 3d3: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 3d6: lload 6
      // 3d8: bipush 2
      // 3d9: anewarray 4
      // 3dc: dup_x2
      // 3dd: dup_x2
      // 3de: pop
      // 3df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e2: bipush 1
      // 3e3: swap
      // 3e4: aastore
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: bipush 0
      // 3e8: swap
      // 3e9: aastore
      // 3ea: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 3ed: aload 8
      // 3ef: lload 1
      // 3f0: lconst_0
      // 3f1: lcmp
      // 3f2: ifle 5e2
      // 3f5: new rip/breeze/inject/կ
      // 3f8: dup
      // 3f9: sipush 182
      // 3fc: getstatic rip/breeze/classtransform/ջ.CONST_Ô_2 Ljava/lang/String;
      // 3ff: sipush 8583
      // 402: ldc2_w 4461653478626983667
      // 405: lload 1
      // 406: lxor
      // 407: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: lload 4
      // 40e: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 411: bipush 0
      // 412: anewarray 4
      // 415: bipush 3
      // 416: anewarray 4
      // 419: dup_x1
      // 41a: swap
      // 41b: bipush 2
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: bipush 1
      // 421: swap
      // 422: aastore
      // 423: dup_x2
      // 424: dup_x2
      // 425: pop
      // 426: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 429: bipush 0
      // 42a: swap
      // 42b: aastore
      // 42c: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 42f: bipush 0
      // 430: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 433: lload 6
      // 435: bipush 2
      // 436: anewarray 4
      // 439: dup_x2
      // 43a: dup_x2
      // 43b: pop
      // 43c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43f: bipush 1
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 0
      // 445: swap
      // 446: aastore
      // 447: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 44a: iload 9
      // 44c: ifne 5e0
      // 44f: goto 456
      // 452: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 455: athrow
      // 456: aload 3
      // 457: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 45a: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 45d: goto 464
      // 460: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 463: athrow
      // 464: lload 1
      // 465: lconst_0
      // 466: lcmp
      // 467: ifle 516
      // 46a: iload 9
      // 46c: ifeq 516
      // 46f: ifeq 508
      // 472: goto 479
      // 475: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 478: athrow
      // 479: aload 8
      // 47b: new rip/breeze/inject/լ
      // 47e: dup
      // 47f: sipush 192
      // 482: getstatic rip/breeze/classtransform/ջ.CONST_Õ_2 Ljava/lang/String;
      // 485: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 488: lload 6
      // 48a: bipush 2
      // 48b: anewarray 4
      // 48e: dup_x2
      // 48f: dup_x2
      // 490: pop
      // 491: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 494: bipush 1
      // 495: swap
      // 496: aastore
      // 497: dup_x1
      // 498: swap
      // 499: bipush 0
      // 49a: swap
      // 49b: aastore
      // 49c: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 49f: aload 8
      // 4a1: lload 1
      // 4a2: lconst_0
      // 4a3: lcmp
      // 4a4: iflt 5e2
      // 4a7: new rip/breeze/inject/կ
      // 4aa: dup
      // 4ab: sipush 182
      // 4ae: getstatic rip/breeze/classtransform/ջ.CONST_Õ_2 Ljava/lang/String;
      // 4b1: sipush 360
      // 4b4: ldc2_w 4864861601792286230
      // 4b7: lload 1
      // 4b8: lxor
      // 4b9: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4be: lload 4
      // 4c0: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 4c3: bipush 0
      // 4c4: anewarray 4
      // 4c7: bipush 3
      // 4c8: anewarray 4
      // 4cb: dup_x1
      // 4cc: swap
      // 4cd: bipush 2
      // 4ce: swap
      // 4cf: aastore
      // 4d0: dup_x1
      // 4d1: swap
      // 4d2: bipush 1
      // 4d3: swap
      // 4d4: aastore
      // 4d5: dup_x2
      // 4d6: dup_x2
      // 4d7: pop
      // 4d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4db: bipush 0
      // 4dc: swap
      // 4dd: aastore
      // 4de: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4e1: bipush 0
      // 4e2: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 4e5: lload 6
      // 4e7: bipush 2
      // 4e8: anewarray 4
      // 4eb: dup_x2
      // 4ec: dup_x2
      // 4ed: pop
      // 4ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f1: bipush 1
      // 4f2: swap
      // 4f3: aastore
      // 4f4: dup_x1
      // 4f5: swap
      // 4f6: bipush 0
      // 4f7: swap
      // 4f8: aastore
      // 4f9: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 4fc: iload 9
      // 4fe: ifne 5e0
      // 501: goto 508
      // 504: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 507: athrow
      // 508: aload 3
      // 509: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 50c: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 50f: goto 516
      // 512: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 515: athrow
      // 516: lload 1
      // 517: lconst_0
      // 518: lcmp
      // 519: ifle 5a4
      // 51c: ifeq 5ae
      // 51f: aload 8
      // 521: new rip/breeze/inject/լ
      // 524: dup
      // 525: sipush 192
      // 528: getstatic rip/breeze/classtransform/ջ.CONST_Ó_2 Ljava/lang/String;
      // 52b: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 52e: lload 6
      // 530: bipush 2
      // 531: anewarray 4
      // 534: dup_x2
      // 535: dup_x2
      // 536: pop
      // 537: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53a: bipush 1
      // 53b: swap
      // 53c: aastore
      // 53d: dup_x1
      // 53e: swap
      // 53f: bipush 0
      // 540: swap
      // 541: aastore
      // 542: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 545: aload 8
      // 547: lload 1
      // 548: lconst_0
      // 549: lcmp
      // 54a: ifle 5e2
      // 54d: new rip/breeze/inject/կ
      // 550: dup
      // 551: sipush 182
      // 554: getstatic rip/breeze/classtransform/ջ.CONST_Ó_2 Ljava/lang/String;
      // 557: sipush 3000
      // 55a: ldc2_w 8925455186485466319
      // 55d: lload 1
      // 55e: lxor
      // 55f: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 564: lload 4
      // 566: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 569: bipush 0
      // 56a: anewarray 4
      // 56d: bipush 3
      // 56e: anewarray 4
      // 571: dup_x1
      // 572: swap
      // 573: bipush 2
      // 574: swap
      // 575: aastore
      // 576: dup_x1
      // 577: swap
      // 578: bipush 1
      // 579: swap
      // 57a: aastore
      // 57b: dup_x2
      // 57c: dup_x2
      // 57d: pop
      // 57e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 581: bipush 0
      // 582: swap
      // 583: aastore
      // 584: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 587: bipush 0
      // 588: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 58b: lload 6
      // 58d: bipush 2
      // 58e: anewarray 4
      // 591: dup_x2
      // 592: dup_x2
      // 593: pop
      // 594: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 597: bipush 1
      // 598: swap
      // 599: aastore
      // 59a: dup_x1
      // 59b: swap
      // 59c: bipush 0
      // 59d: swap
      // 59e: aastore
      // 59f: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 5a2: iload 9
      // 5a4: ifne 5e0
      // 5a7: goto 5ae
      // 5aa: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5ad: athrow
      // 5ae: aload 8
      // 5b0: new rip/breeze/inject/լ
      // 5b3: dup
      // 5b4: sipush 192
      // 5b7: aload 3
      // 5b8: bipush 0
      // 5b9: anewarray 4
      // 5bc: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 5bf: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 5c2: lload 6
      // 5c4: bipush 2
      // 5c5: anewarray 4
      // 5c8: dup_x2
      // 5c9: dup_x2
      // 5ca: pop
      // 5cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ce: bipush 1
      // 5cf: swap
      // 5d0: aastore
      // 5d1: dup_x1
      // 5d2: swap
      // 5d3: bipush 0
      // 5d4: swap
      // 5d5: aastore
      // 5d6: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 5d9: goto 5e0
      // 5dc: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5df: athrow
      // 5e0: aload 8
      // 5e2: areturn
      // try (33 -> 39): 40 java/lang/IllegalArgumentException
      // try (38 -> 122): 123 java/lang/IllegalArgumentException
      // try (42 -> 128): 129 java/lang/IllegalArgumentException
      // try (131 -> 138): 139 java/lang/IllegalArgumentException
      // try (137 -> 221): 222 java/lang/IllegalArgumentException
      // try (141 -> 227): 228 java/lang/IllegalArgumentException
      // try (230 -> 237): 238 java/lang/IllegalArgumentException
      // try (236 -> 320): 321 java/lang/IllegalArgumentException
      // try (240 -> 326): 327 java/lang/IllegalArgumentException
      // try (329 -> 336): 337 java/lang/IllegalArgumentException
      // try (335 -> 419): 420 java/lang/IllegalArgumentException
      // try (339 -> 425): 426 java/lang/IllegalArgumentException
      // try (428 -> 435): 436 java/lang/IllegalArgumentException
      // try (434 -> 518): 519 java/lang/IllegalArgumentException
      // try (438 -> 524): 525 java/lang/IllegalArgumentException
      // try (527 -> 534): 535 java/lang/IllegalArgumentException
      // try (533 -> 617): 618 java/lang/IllegalArgumentException
      // try (537 -> 623): 624 java/lang/IllegalArgumentException
      // try (626 -> 633): 634 java/lang/IllegalArgumentException
      // try (632 -> 716): 717 java/lang/IllegalArgumentException
      // try (636 -> 722): 723 java/lang/IllegalArgumentException
      // try (725 -> 810): 811 java/lang/IllegalArgumentException
      // try (730 -> 838): 839 java/lang/IllegalArgumentException
   }

   public static rip.breeze.inject.ջ getՋ(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/MathUtil3
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 36811300343662
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 025: istore 6
      // 027: aload 1
      // 028: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 02b: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 02e: iload 6
      // 030: ifne 08d
      // 033: ifeq 086
      // 036: goto 03d
      // 039: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: new rip/breeze/inject/կ
      // 040: dup
      // 041: sipush 184
      // 044: getstatic rip/breeze/classtransform/ջ.CONST_Û_2 Ljava/lang/String;
      // 047: sipush 24852
      // 04a: ldc2_w 8888254488634678220
      // 04d: lload 2
      // 04e: lxor
      // 04f: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: lload 4
      // 056: ldc_w java/lang/Boolean
      // 059: bipush 1
      // 05a: anewarray 4
      // 05d: dup
      // 05e: bipush 0
      // 05f: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 062: aastore
      // 063: bipush 3
      // 064: anewarray 4
      // 067: dup_x1
      // 068: swap
      // 069: bipush 2
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x1
      // 06d: swap
      // 06e: bipush 1
      // 06f: swap
      // 070: aastore
      // 071: dup_x2
      // 072: dup_x2
      // 073: pop
      // 074: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 077: bipush 0
      // 078: swap
      // 079: aastore
      // 07a: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 07d: bipush 0
      // 07e: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 081: areturn
      // 082: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 085: athrow
      // 086: aload 1
      // 087: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 08a: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 08d: iload 6
      // 08f: lload 2
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 0f4
      // 095: ifne 0f2
      // 098: ifeq 0eb
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: new rip/breeze/inject/կ
      // 0a5: dup
      // 0a6: sipush 184
      // 0a9: getstatic rip/breeze/classtransform/ջ.CONST_Ú_2 Ljava/lang/String;
      // 0ac: sipush 4877
      // 0af: ldc2_w 995863208292198857
      // 0b2: lload 2
      // 0b3: lxor
      // 0b4: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: lload 4
      // 0bb: ldc_w java/lang/Byte
      // 0be: bipush 1
      // 0bf: anewarray 4
      // 0c2: dup
      // 0c3: bipush 0
      // 0c4: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 0c7: aastore
      // 0c8: bipush 3
      // 0c9: anewarray 4
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 2
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 1
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0e2: bipush 0
      // 0e3: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 0e6: areturn
      // 0e7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 0ef: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0f2: iload 6
      // 0f4: lload 2
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 159
      // 0fa: ifne 157
      // 0fd: ifeq 150
      // 100: goto 107
      // 103: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 106: athrow
      // 107: new rip/breeze/inject/կ
      // 10a: dup
      // 10b: sipush 184
      // 10e: getstatic rip/breeze/classtransform/ջ.CONST_Ù_2 Ljava/lang/String;
      // 111: sipush 4877
      // 114: ldc2_w 995863208292198857
      // 117: lload 2
      // 118: lxor
      // 119: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: lload 4
      // 120: ldc_w java/lang/Short
      // 123: bipush 1
      // 124: anewarray 4
      // 127: dup
      // 128: bipush 0
      // 129: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 12c: aastore
      // 12d: bipush 3
      // 12e: anewarray 4
      // 131: dup_x1
      // 132: swap
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x2
      // 13c: dup_x2
      // 13d: pop
      // 13e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 147: bipush 0
      // 148: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 14b: areturn
      // 14c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14f: athrow
      // 150: aload 1
      // 151: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 154: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 157: iload 6
      // 159: lload 2
      // 15a: lconst_0
      // 15b: lcmp
      // 15c: iflt 1be
      // 15f: ifne 1bc
      // 162: ifeq 1b5
      // 165: goto 16c
      // 168: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16b: athrow
      // 16c: new rip/breeze/inject/կ
      // 16f: dup
      // 170: sipush 184
      // 173: getstatic rip/breeze/classtransform/ջ.CONST_Ø_2 Ljava/lang/String;
      // 176: sipush 4877
      // 179: ldc2_w 995863208292198857
      // 17c: lload 2
      // 17d: lxor
      // 17e: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: lload 4
      // 185: ldc_w java/lang/Character
      // 188: bipush 1
      // 189: anewarray 4
      // 18c: dup
      // 18d: bipush 0
      // 18e: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 191: aastore
      // 192: bipush 3
      // 193: anewarray 4
      // 196: dup_x1
      // 197: swap
      // 198: bipush 2
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1ac: bipush 0
      // 1ad: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 1b0: areturn
      // 1b1: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b4: athrow
      // 1b5: aload 1
      // 1b6: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 1b9: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 1bc: iload 6
      // 1be: lload 2
      // 1bf: lconst_0
      // 1c0: lcmp
      // 1c1: iflt 222
      // 1c4: ifne 220
      // 1c7: ifeq 219
      // 1ca: goto 1d1
      // 1cd: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d0: athrow
      // 1d1: new rip/breeze/inject/կ
      // 1d4: dup
      // 1d5: sipush 184
      // 1d8: getstatic rip/breeze/classtransform/ջ.CONST_Ö_2 Ljava/lang/String;
      // 1db: sipush 4877
      // 1de: ldc2_w 995863208292198857
      // 1e1: lload 2
      // 1e2: lxor
      // 1e3: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: lload 4
      // 1ea: ldc java/lang/Integer
      // 1ec: bipush 1
      // 1ed: anewarray 4
      // 1f0: dup
      // 1f1: bipush 0
      // 1f2: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 1f5: aastore
      // 1f6: bipush 3
      // 1f7: anewarray 4
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 2
      // 1fd: swap
      // 1fe: aastore
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 1
      // 202: swap
      // 203: aastore
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 0
      // 20b: swap
      // 20c: aastore
      // 20d: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 210: bipush 0
      // 211: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 214: areturn
      // 215: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 218: athrow
      // 219: aload 1
      // 21a: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 21d: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 220: iload 6
      // 222: lload 2
      // 223: lconst_0
      // 224: lcmp
      // 225: iflt 28c
      // 228: ifne 284
      // 22b: ifeq 27d
      // 22e: goto 235
      // 231: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 234: athrow
      // 235: new rip/breeze/inject/կ
      // 238: dup
      // 239: sipush 184
      // 23c: getstatic rip/breeze/classtransform/ջ.CONST_Õ_2 Ljava/lang/String;
      // 23f: sipush 4877
      // 242: ldc2_w 995863208292198857
      // 245: lload 2
      // 246: lxor
      // 247: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: lload 4
      // 24e: ldc java/lang/Long
      // 250: bipush 1
      // 251: anewarray 4
      // 254: dup
      // 255: bipush 0
      // 256: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 259: aastore
      // 25a: bipush 3
      // 25b: anewarray 4
      // 25e: dup_x1
      // 25f: swap
      // 260: bipush 2
      // 261: swap
      // 262: aastore
      // 263: dup_x1
      // 264: swap
      // 265: bipush 1
      // 266: swap
      // 267: aastore
      // 268: dup_x2
      // 269: dup_x2
      // 26a: pop
      // 26b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26e: bipush 0
      // 26f: swap
      // 270: aastore
      // 271: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 274: bipush 0
      // 275: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 278: areturn
      // 279: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27c: athrow
      // 27d: aload 1
      // 27e: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 281: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 284: lload 2
      // 285: lconst_0
      // 286: lcmp
      // 287: iflt 2e9
      // 28a: iload 6
      // 28c: ifne 2e9
      // 28f: ifeq 2e2
      // 292: goto 299
      // 295: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 298: athrow
      // 299: new rip/breeze/inject/կ
      // 29c: dup
      // 29d: sipush 184
      // 2a0: getstatic rip/breeze/classtransform/ջ.CONST_Ô_2 Ljava/lang/String;
      // 2a3: sipush 4877
      // 2a6: ldc2_w 995863208292198857
      // 2a9: lload 2
      // 2aa: lxor
      // 2ab: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: lload 4
      // 2b2: ldc_w java/lang/Float
      // 2b5: bipush 1
      // 2b6: anewarray 4
      // 2b9: dup
      // 2ba: bipush 0
      // 2bb: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 2be: aastore
      // 2bf: bipush 3
      // 2c0: anewarray 4
      // 2c3: dup_x1
      // 2c4: swap
      // 2c5: bipush 2
      // 2c6: swap
      // 2c7: aastore
      // 2c8: dup_x1
      // 2c9: swap
      // 2ca: bipush 1
      // 2cb: swap
      // 2cc: aastore
      // 2cd: dup_x2
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d3: bipush 0
      // 2d4: swap
      // 2d5: aastore
      // 2d6: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2d9: bipush 0
      // 2da: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 2dd: areturn
      // 2de: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e1: athrow
      // 2e2: aload 1
      // 2e3: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 2e6: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 2e9: ifeq 335
      // 2ec: new rip/breeze/inject/կ
      // 2ef: dup
      // 2f0: sipush 184
      // 2f3: getstatic rip/breeze/classtransform/ջ.CONST_Ó_2 Ljava/lang/String;
      // 2f6: sipush 4877
      // 2f9: ldc2_w 995863208292198857
      // 2fc: lload 2
      // 2fd: lxor
      // 2fe: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: lload 4
      // 305: ldc_w java/lang/Double
      // 308: bipush 1
      // 309: anewarray 4
      // 30c: dup
      // 30d: bipush 0
      // 30e: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 311: aastore
      // 312: bipush 3
      // 313: anewarray 4
      // 316: dup_x1
      // 317: swap
      // 318: bipush 2
      // 319: swap
      // 31a: aastore
      // 31b: dup_x1
      // 31c: swap
      // 31d: bipush 1
      // 31e: swap
      // 31f: aastore
      // 320: dup_x2
      // 321: dup_x2
      // 322: pop
      // 323: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 326: bipush 0
      // 327: swap
      // 328: aastore
      // 329: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 32c: bipush 0
      // 32d: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 330: areturn
      // 331: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 334: athrow
      // 335: aconst_null
      // 336: areturn
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 74): 74 java/lang/IllegalArgumentException
      // try (79 -> 86): 87 java/lang/IllegalArgumentException
      // try (85 -> 129): 129 java/lang/IllegalArgumentException
      // try (134 -> 141): 142 java/lang/IllegalArgumentException
      // try (140 -> 184): 184 java/lang/IllegalArgumentException
      // try (189 -> 196): 197 java/lang/IllegalArgumentException
      // try (195 -> 239): 239 java/lang/IllegalArgumentException
      // try (244 -> 251): 252 java/lang/IllegalArgumentException
      // try (250 -> 294): 294 java/lang/IllegalArgumentException
      // try (299 -> 306): 307 java/lang/IllegalArgumentException
      // try (305 -> 349): 349 java/lang/IllegalArgumentException
      // try (354 -> 361): 362 java/lang/IllegalArgumentException
      // try (360 -> 404): 404 java/lang/IllegalArgumentException
      // try (409 -> 450): 450 java/lang/IllegalArgumentException
   }

   public static ց getՑ(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 01c: istore 4
      // 01e: aload 1
      // 01f: sipush 10027
      // 022: ldc2_w 6176765372811054808
      // 025: lload 2
      // 026: lxor
      // 027: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: invokevirtual java/lang/String.matches (Ljava/lang/String;)Z
      // 02f: iload 4
      // 031: ifne 0c8
      // 034: ifeq 0a4
      // 037: goto 03e
      // 03a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03d: athrow
      // 03e: sipush 25937
      // 041: ldc2_w 5085262773759823009
      // 044: lload 2
      // 045: lxor
      // 046: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 04e: aload 1
      // 04f: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 052: astore 5
      // 054: aload 5
      // 056: invokevirtual java/util/regex/Matcher.find ()Z
      // 059: lload 2
      // 05a: lconst_0
      // 05b: lcmp
      // 05c: ifle 0a1
      // 05f: ifeq 099
      // 062: new rip/breeze/classtransform/ց
      // 065: dup
      // 066: aload 5
      // 068: bipush 1
      // 069: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 06c: ifnonnull 083
      // 06f: goto 076
      // 072: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 075: athrow
      // 076: aload 5
      // 078: bipush 2
      // 079: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 07c: goto 089
      // 07f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 082: athrow
      // 083: aload 5
      // 085: bipush 1
      // 086: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 089: aload 5
      // 08b: bipush 3
      // 08c: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 08f: aload 5
      // 091: bipush 4
      // 092: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 095: invokespecial rip/breeze/classtransform/ց.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 098: areturn
      // 099: lload 2
      // 09a: lconst_0
      // 09b: lcmp
      // 09c: ifle 0a4
      // 09f: iload 4
      // 0a1: ifeq 126
      // 0a4: aload 1
      // 0a5: iload 4
      // 0a7: ifne 0d8
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b0: athrow
      // 0b1: sipush 12826
      // 0b4: ldc2_w 1693936738530761699
      // 0b7: lload 2
      // 0b8: lxor
      // 0b9: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: invokevirtual java/lang/String.matches (Ljava/lang/String;)Z
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: ifeq 126
      // 0cb: sipush 24009
      // 0ce: ldc2_w 5489073435854795816
      // 0d1: lload 2
      // 0d2: lxor
      // 0d3: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 0db: aload 1
      // 0dc: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0df: astore 5
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 0ef
      // 0e7: aload 5
      // 0e9: invokevirtual java/util/regex/Matcher.find ()Z
      // 0ec: ifeq 126
      // 0ef: new rip/breeze/classtransform/ց
      // 0f2: dup
      // 0f3: aload 5
      // 0f5: bipush 1
      // 0f6: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0f9: ifnonnull 110
      // 0fc: goto 103
      // 0ff: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: aload 5
      // 105: bipush 2
      // 106: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 109: goto 116
      // 10c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: aload 5
      // 112: bipush 1
      // 113: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 116: aload 5
      // 118: bipush 3
      // 119: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 11c: aload 5
      // 11e: bipush 4
      // 11f: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 122: invokespecial rip/breeze/classtransform/ց.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 125: areturn
      // 126: aconst_null
      // 127: areturn
      // try (19 -> 29): 30 java/lang/IllegalArgumentException
      // try (41 -> 54): 55 java/lang/IllegalArgumentException
      // try (48 -> 61): 61 java/lang/IllegalArgumentException
      // try (74 -> 83): 84 java/lang/IllegalArgumentException
      // try (80 -> 92): 93 java/lang/IllegalArgumentException
      // try (105 -> 118): 119 java/lang/IllegalArgumentException
      // try (112 -> 125): 125 java/lang/IllegalArgumentException
   }

   public static rip.breeze.inject.ջ getՋ_2(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/BreezeClass12
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 3
      // 19: pop
      // 1a: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 1d: lload 3
      // 1e: lxor
      // 1f: lstore 3
      // 20: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 23: aload 2
      // 24: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 27: bipush 0
      // 28: anewarray 4
      // 2b: invokevirtual rip/breeze/inject/թ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 2e: astore 5
      // 30: istore 6
      // 32: aload 5
      // 34: ifnull aa
      // 37: aload 5
      // 39: iload 6
      // 3b: lload 3
      // 3c: lconst_0
      // 3d: lcmp
      // 3e: iflt 45
      // 41: ifeq a3
      // 44: bipush 0
      // 45: anewarray 4
      // 48: lload 3
      // 49: lconst_0
      // 4a: lcmp
      // 4b: iflt a0
      // 4e: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 51: sipush 183
      // 54: if_icmpne 9a
      // 57: goto 5e
      // 5a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: lload 3
      // 5f: lconst_0
      // 60: lcmp
      // 61: ifle a5
      // 64: aload 5
      // 66: checkcast rip/breeze/inject/կ
      // 69: iload 6
      // 6b: ifeq a3
      // 6e: goto 75
      // 71: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 74: athrow
      // 75: lload 3
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle 9c
      // 7b: getfield rip/breeze/inject/կ.string_ç_2 Ljava/lang/String;
      // 7e: aload 1
      // 7f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 82: ifeq 9a
      // 85: goto 8c
      // 88: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: aload 5
      // 8e: bipush 0
      // 8f: anewarray 4
      // 92: invokevirtual rip/breeze/inject/ջ.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 95: areturn
      // 96: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 99: athrow
      // 9a: aload 5
      // 9c: bipush 0
      // 9d: anewarray 4
      // a0: invokevirtual rip/breeze/inject/ջ.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // a3: astore 5
      // a5: iload 6
      // a7: ifne 32
      // aa: lload 3
      // ab: lconst_0
      // ac: lcmp
      // ad: ifle 37
      // b0: aconst_null
      // b1: areturn
      // try (32 -> 48): 49 java/lang/IllegalArgumentException
      // try (39 -> 59): 60 java/lang/IllegalArgumentException
      // try (51 -> 70): 71 java/lang/IllegalArgumentException
      // try (62 -> 78): 78 java/lang/IllegalArgumentException
   }

   public static Number getNumber(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/ջ
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 01c: istore 4
      // 01e: aload 1
      // 01f: iload 4
      // 021: ifne 035
      // 024: ifnonnull 034
      // 027: goto 02e
      // 02a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02d: athrow
      // 02e: aconst_null
      // 02f: areturn
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: aload 1
      // 035: bipush 0
      // 036: anewarray 4
      // 039: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 03c: bipush 2
      // 03d: iload 4
      // 03f: ifne 08e
      // 042: if_icmplt 084
      // 045: goto 04c
      // 048: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04b: athrow
      // 04c: aload 1
      // 04d: bipush 0
      // 04e: anewarray 4
      // 051: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 054: bipush 8
      // 056: iload 4
      // 058: lload 2
      // 059: lconst_0
      // 05a: lcmp
      // 05b: ifle 090
      // 05e: ifne 08e
      // 061: goto 068
      // 064: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: if_icmpgt 084
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: aload 1
      // 073: bipush 0
      // 074: anewarray 4
      // 077: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 07a: bipush 3
      // 07b: isub
      // 07c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07f: areturn
      // 080: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: aload 1
      // 085: bipush 0
      // 086: anewarray 4
      // 089: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 08c: bipush 9
      // 08e: iload 4
      // 090: ifne 0e1
      // 093: if_icmplt 0d7
      // 096: goto 09d
      // 099: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: aload 1
      // 09e: bipush 0
      // 09f: anewarray 4
      // 0a2: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0a5: bipush 10
      // 0a7: iload 4
      // 0a9: lload 2
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 0e3
      // 0af: ifne 0e1
      // 0b2: goto 0b9
      // 0b5: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b8: athrow
      // 0b9: if_icmpgt 0d7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: bipush 0
      // 0c5: anewarray 4
      // 0c8: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0cb: bipush 9
      // 0cd: isub
      // 0ce: i2l
      // 0cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d2: areturn
      // 0d3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: bipush 0
      // 0d9: anewarray 4
      // 0dc: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0df: bipush 11
      // 0e1: iload 4
      // 0e3: ifne 134
      // 0e6: if_icmplt 12a
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: bipush 0
      // 0f2: anewarray 4
      // 0f5: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0f8: bipush 13
      // 0fa: iload 4
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: ifle 136
      // 102: ifne 134
      // 105: goto 10c
      // 108: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10b: athrow
      // 10c: if_icmpgt 12a
      // 10f: goto 116
      // 112: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 115: athrow
      // 116: aload 1
      // 117: bipush 0
      // 118: anewarray 4
      // 11b: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 11e: bipush 11
      // 120: isub
      // 121: i2f
      // 122: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 125: areturn
      // 126: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: aload 1
      // 12b: bipush 0
      // 12c: anewarray 4
      // 12f: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 132: bipush 14
      // 134: iload 4
      // 136: ifne 187
      // 139: if_icmplt 17d
      // 13c: goto 143
      // 13f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 142: athrow
      // 143: aload 1
      // 144: bipush 0
      // 145: anewarray 4
      // 148: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 14b: bipush 15
      // 14d: iload 4
      // 14f: lload 2
      // 150: lconst_0
      // 151: lcmp
      // 152: ifle 189
      // 155: ifne 187
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15e: athrow
      // 15f: if_icmpgt 17d
      // 162: goto 169
      // 165: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: aload 1
      // 16a: bipush 0
      // 16b: anewarray 4
      // 16e: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 171: bipush 14
      // 173: isub
      // 174: i2d
      // 175: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 178: areturn
      // 179: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17c: athrow
      // 17d: aload 1
      // 17e: bipush 0
      // 17f: anewarray 4
      // 182: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 185: bipush 16
      // 187: iload 4
      // 189: lload 2
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: iflt 1be
      // 18f: ifne 1b6
      // 192: if_icmpne 1ac
      // 195: goto 19c
      // 198: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: aload 1
      // 19d: checkcast rip/breeze/inject/ն
      // 1a0: getfield rip/breeze/inject/ն.int_ç_2 I
      // 1a3: i2b
      // 1a4: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 1a7: areturn
      // 1a8: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ab: athrow
      // 1ac: aload 1
      // 1ad: bipush 0
      // 1ae: anewarray 4
      // 1b1: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 1b4: bipush 17
      // 1b6: lload 2
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: ifle 1f7
      // 1bc: iload 4
      // 1be: ifne 1f7
      // 1c1: if_icmpne 1db
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ca: athrow
      // 1cb: aload 1
      // 1cc: checkcast rip/breeze/inject/ն
      // 1cf: getfield rip/breeze/inject/ն.int_ç_2 I
      // 1d2: i2s
      // 1d3: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 1d6: areturn
      // 1d7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1da: athrow
      // 1db: aload 1
      // 1dc: bipush 0
      // 1dd: anewarray 4
      // 1e0: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 1e3: lload 2
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 217
      // 1e9: iload 4
      // 1eb: ifne 217
      // 1ee: bipush 18
      // 1f0: goto 1f7
      // 1f3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f6: athrow
      // 1f7: if_icmpne 22c
      // 1fa: aload 1
      // 1fb: checkcast rip/breeze/inject/ղ
      // 1fe: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // 201: iload 4
      // 203: ifne 228
      // 206: goto 20d
      // 209: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20c: athrow
      // 20d: instanceof java/lang/Number
      // 210: goto 217
      // 213: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 216: athrow
      // 217: ifeq 22c
      // 21a: aload 1
      // 21b: checkcast rip/breeze/inject/ղ
      // 21e: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // 221: goto 228
      // 224: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 227: athrow
      // 228: checkcast java/lang/Number
      // 22b: areturn
      // 22c: aconst_null
      // 22d: areturn
      // try (19 -> 23): 24 java/lang/IllegalArgumentException
      // try (22 -> 28): 28 java/lang/IllegalArgumentException
      // try (31 -> 38): 39 java/lang/IllegalArgumentException
      // try (37 -> 52): 53 java/lang/IllegalArgumentException
      // try (41 -> 56): 57 java/lang/IllegalArgumentException
      // try (55 -> 67): 67 java/lang/IllegalArgumentException
      // try (74 -> 77): 78 java/lang/IllegalArgumentException
      // try (76 -> 91): 92 java/lang/IllegalArgumentException
      // try (80 -> 95): 96 java/lang/IllegalArgumentException
      // try (94 -> 107): 107 java/lang/IllegalArgumentException
      // try (114 -> 117): 118 java/lang/IllegalArgumentException
      // try (116 -> 131): 132 java/lang/IllegalArgumentException
      // try (120 -> 135): 136 java/lang/IllegalArgumentException
      // try (134 -> 147): 147 java/lang/IllegalArgumentException
      // try (154 -> 157): 158 java/lang/IllegalArgumentException
      // try (156 -> 171): 172 java/lang/IllegalArgumentException
      // try (160 -> 175): 176 java/lang/IllegalArgumentException
      // try (174 -> 187): 187 java/lang/IllegalArgumentException
      // try (194 -> 201): 202 java/lang/IllegalArgumentException
      // try (200 -> 210): 210 java/lang/IllegalArgumentException
      // try (217 -> 224): 225 java/lang/IllegalArgumentException
      // try (223 -> 233): 233 java/lang/IllegalArgumentException
      // try (235 -> 246): 247 java/lang/IllegalArgumentException
      // try (249 -> 255): 256 java/lang/IllegalArgumentException
      // try (250 -> 259): 260 java/lang/IllegalArgumentException
      // try (262 -> 266): 267 java/lang/IllegalArgumentException
   }

   public static boolean isValid_3(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.MathUtil3[] var3 = (rip.breeze.inject.MathUtil3[])var0[1];
      rip.breeze.inject.MathUtil3[] var4 = (rip.breeze.inject.MathUtil3[])var0[2];
      var1 = encKey_a ^ var1;
      long var5 = var1 ^ 111536013961049L;
      Object[] var10006 = new Object[]{null, null, null, false, new rip.breeze.inject.MathUtil3[0]};
      var10006[2] = var5;
      var10006[1] = var4;
      var10006[0] = var3;
      return checkCondition_2(var10006);
   }

   public static boolean checkCondition_2(Object... param0) {
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
      // 004: checkcast [Lrip/breeze/inject/MathUtil3;
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast [Lrip/breeze/inject/MathUtil3;
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Boolean
      // 01f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 022: istore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast [Lrip/breeze/inject/MathUtil3;
      // 02a: astore 6
      // 02c: pop
      // 02d: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 030: lload 3
      // 031: lxor
      // 032: lstore 3
      // 033: lload 3
      // 034: dup2
      // 035: ldc2_w 72459381876707
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 11359625542218
      // 03f: lxor
      // 040: lstore 9
      // 042: pop2
      // 043: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 046: istore 11
      // 048: aload 6
      // 04a: arraylength
      // 04b: iload 11
      // 04d: ifne 0c9
      // 050: ifle 0c7
      // 053: goto 05a
      // 056: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 059: athrow
      // 05a: aload 1
      // 05b: arraylength
      // 05c: aload 6
      // 05e: arraylength
      // 05f: iadd
      // 060: anewarray 266
      // 063: astore 12
      // 065: iload 11
      // 067: lload 3
      // 068: lconst_0
      // 069: lcmp
      // 06a: iflt 072
      // 06d: ifne 0b7
      // 070: iload 5
      // 072: ifeq 0a6
      // 075: goto 07c
      // 078: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: aload 6
      // 07e: bipush 0
      // 07f: aload 12
      // 081: bipush 0
      // 082: aload 6
      // 084: arraylength
      // 085: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 088: aload 1
      // 089: lload 3
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: iflt 0c6
      // 08f: bipush 0
      // 090: aload 12
      // 092: aload 6
      // 094: arraylength
      // 095: aload 1
      // 096: arraylength
      // 097: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 09a: iload 11
      // 09c: ifeq 0c4
      // 09f: goto 0a6
      // 0a2: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: bipush 0
      // 0a8: aload 12
      // 0aa: bipush 0
      // 0ab: aload 1
      // 0ac: arraylength
      // 0ad: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0b0: goto 0b7
      // 0b3: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: aload 6
      // 0b9: bipush 0
      // 0ba: aload 12
      // 0bc: aload 1
      // 0bd: arraylength
      // 0be: aload 6
      // 0c0: arraylength
      // 0c1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c4: aload 12
      // 0c6: astore 1
      // 0c7: aload 1
      // 0c8: arraylength
      // 0c9: iload 11
      // 0cb: lload 3
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 0d6
      // 0d1: ifne 0e7
      // 0d4: aload 2
      // 0d5: arraylength
      // 0d6: if_icmpeq 0e6
      // 0d9: goto 0e0
      // 0dc: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: ireturn
      // 0e2: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: bipush 0
      // 0e7: istore 12
      // 0e9: iload 12
      // 0eb: aload 1
      // 0ec: arraylength
      // 0ed: if_icmpge 1b5
      // 0f0: aload 1
      // 0f1: iload 12
      // 0f3: aaload
      // 0f4: astore 13
      // 0f6: aload 2
      // 0f7: iload 12
      // 0f9: aaload
      // 0fa: astore 14
      // 0fc: aload 13
      // 0fe: aload 14
      // 100: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 103: istore 15
      // 105: aload 13
      // 107: lload 7
      // 109: bipush 1
      // 10a: anewarray 4
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 0
      // 114: swap
      // 115: aastore
      // 116: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 119: iload 11
      // 11b: lload 3
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 126
      // 121: ifne 1b6
      // 124: iload 11
      // 126: ifne 162
      // 129: goto 130
      // 12c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12f: athrow
      // 130: bipush 10
      // 132: if_icmpeq 160
      // 135: goto 13c
      // 138: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: iload 15
      // 13e: iload 11
      // 140: lload 3
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 164
      // 146: ifne 162
      // 149: goto 150
      // 14c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14f: athrow
      // 150: ifne 160
      // 153: goto 15a
      // 156: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 159: athrow
      // 15a: bipush 0
      // 15b: ireturn
      // 15c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: iload 15
      // 162: iload 11
      // 164: lload 3
      // 165: lconst_0
      // 166: lcmp
      // 167: iflt 19e
      // 16a: ifne 19c
      // 16d: ifne 1ad
      // 170: goto 177
      // 173: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 176: athrow
      // 177: aload 14
      // 179: ldc java/lang/Object
      // 17b: lload 9
      // 17d: bipush 2
      // 17e: anewarray 4
      // 181: dup_x2
      // 182: dup_x2
      // 183: pop
      // 184: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 187: bipush 1
      // 188: swap
      // 189: aastore
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_2 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 192: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 195: goto 19c
      // 198: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: iload 11
      // 19e: ifne 1ac
      // 1a1: ifne 1ad
      // 1a4: goto 1ab
      // 1a7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1aa: athrow
      // 1ab: bipush 0
      // 1ac: ireturn
      // 1ad: iinc 12 1
      // 1b0: iload 11
      // 1b2: ifeq 0e9
      // 1b5: bipush 1
      // 1b6: ireturn
      // try (45 -> 50): 51 java/lang/IllegalArgumentException
      // try (60 -> 68): 69 java/lang/IllegalArgumentException
      // try (66 -> 92): 93 java/lang/IllegalArgumentException
      // try (71 -> 102): 103 java/lang/IllegalArgumentException
      // try (117 -> 126): 127 java/lang/IllegalArgumentException
      // try (123 -> 131): 131 java/lang/IllegalArgumentException
      // try (151 -> 171): 172 java/lang/IllegalArgumentException
      // try (169 -> 176): 177 java/lang/IllegalArgumentException
      // try (174 -> 186): 187 java/lang/IllegalArgumentException
      // try (179 -> 190): 191 java/lang/IllegalArgumentException
      // try (189 -> 195): 195 java/lang/IllegalArgumentException
      // try (198 -> 205): 206 java/lang/IllegalArgumentException
      // try (204 -> 227): 228 java/lang/IllegalArgumentException
      // try (230 -> 233): 234 java/lang/IllegalArgumentException
   }

   public static boolean checkCondition_3(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/MathUtil3
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/MathUtil3
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 3
      // 19: pop
      // 1a: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 1d: lload 3
      // 1e: lxor
      // 1f: lstore 3
      // 20: lload 3
      // 21: dup2
      // 22: ldc2_w 29171246526883
      // 25: lxor
      // 26: lstore 5
      // 28: dup2
      // 29: ldc2_w 89291968424970
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 33: istore 9
      // 35: aload 1
      // 36: aload 2
      // 37: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 3a: iload 9
      // 3c: ifeq 62
      // 3f: ifeq 4f
      // 42: goto 49
      // 45: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: bipush 1
      // 4a: ireturn
      // 4b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: aload 1
      // 50: lload 5
      // 52: bipush 1
      // 53: anewarray 4
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 62: iload 9
      // 64: lload 3
      // 65: lconst_0
      // 66: lcmp
      // 67: ifle 9f
      // 6a: ifeq 9d
      // 6d: bipush 10
      // 6f: if_icmpne b0
      // 72: goto 79
      // 75: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 78: athrow
      // 79: aload 2
      // 7a: ldc java/lang/Object
      // 7c: lload 7
      // 7e: bipush 2
      // 7f: anewarray 4
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 1
      // 89: swap
      // 8a: aastore
      // 8b: dup_x1
      // 8c: swap
      // 8d: bipush 0
      // 8e: swap
      // 8f: aastore
      // 90: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_2 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 93: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 96: goto 9d
      // 99: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9c: athrow
      // 9d: iload 9
      // 9f: ifeq ad
      // a2: ifeq b0
      // a5: goto ac
      // a8: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab: athrow
      // ac: bipush 1
      // ad: goto b1
      // b0: bipush 0
      // b1: ireturn
      // try (34 -> 40): 41 java/lang/IllegalArgumentException
      // try (39 -> 45): 45 java/lang/IllegalArgumentException
      // try (59 -> 67): 68 java/lang/IllegalArgumentException
      // try (65 -> 89): 90 java/lang/IllegalArgumentException
      // try (92 -> 95): 96 java/lang/IllegalArgumentException
   }

   public static rip.breeze.inject.é getÉ_3(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a ^ var2;
      long var4 = var2 ^ 44830252397236L;
      long var6 = var2 ^ 54939490661306L;
      rip.breeze.inject.é var8 = new rip.breeze.inject.é(var4);
      var1.method_002(new Object[]{var6, var8});
      return var8;
   }

   public static BreezeClass12 getBreezeClass12_2(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      var1 = encKey_a ^ var1;
      long var4 = var1 ^ 2824003281589L;
      long var10001 = var1 ^ 24943774987744L;
      int var6 = (int)((var1 ^ 24943774987744L) >>> 32);
      int var7 = (int)((var1 ^ 24943774987744L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);

      BreezeClass12 var10000;
      int var10002;
      String var10003;
      String var10004;
      String var10005;
      String[] var10006;
      label17: {
         try {
            var10000 = new BreezeClass12();
            var17 = var10000;
            var10002 = var3.int_û;
            var10003 = var3.string_ú;
            var10004 = var3.string_ù;
            var10005 = var3.string_ø;
            if (var3.list_ö == null) {
               var10006 = null;
               break label17;
            }
         } catch (IllegalArgumentException var15) {
            throw getIllegalArgumentException(var15);
         }

         var10006 = var3.list_ö.toArray(new String[0]);
      }

      String[] var9 = var10006;
      String var10 = var10005;
      String var11 = var10004;
      String var12 = var10003;
      int var13 = var10002;
      /* constructor call removed */
      BreezeClass12 var14 = var10000;
      var3.toggle(new Object[]{var4, var14});
      return var14;
   }

   public static թ getԹ_2(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/թ
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 113009382925711
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 43707091714057
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 104844268655378
      // 02c: lxor
      // 02d: lstore 8
      // 02f: dup2
      // 030: ldc2_w 34899245202365
      // 033: lxor
      // 034: lstore 10
      // 036: pop2
      // 037: new rip/breeze/inject/թ
      // 03a: dup
      // 03b: invokespecial rip/breeze/inject/թ.<init> ()V
      // 03e: astore 12
      // 040: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 043: new java/util/HashMap
      // 046: dup
      // 047: invokespecial java/util/HashMap.<init> ()V
      // 04a: astore 13
      // 04c: istore 14
      // 04e: aload 3
      // 04f: lload 8
      // 051: bipush 1
      // 052: anewarray 4
      // 055: dup_x2
      // 056: dup_x2
      // 057: pop
      // 058: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: invokevirtual rip/breeze/inject/թ.method_008 ([Ljava/lang/Object;)Ljava/util/ListIterator;
      // 061: astore 15
      // 063: aload 15
      // 065: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06a: ifeq 0b3
      // 06d: aload 15
      // 06f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 074: checkcast rip/breeze/inject/ջ
      // 077: astore 16
      // 079: aload 16
      // 07b: iload 14
      // 07d: ifeq 0ad
      // 080: instanceof rip/breeze/inject/ճ
      // 083: lload 1
      // 084: lconst_0
      // 085: lcmp
      // 086: ifle 0b0
      // 089: ifeq 0ae
      // 08c: goto 093
      // 08f: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 092: athrow
      // 093: aload 13
      // 095: aload 16
      // 097: checkcast rip/breeze/inject/ճ
      // 09a: new rip/breeze/inject/ճ
      // 09d: dup
      // 09e: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 0a1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0a6: goto 0ad
      // 0a9: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: pop
      // 0ae: iload 14
      // 0b0: ifne 063
      // 0b3: aload 3
      // 0b4: lload 10
      // 0b6: bipush 1
      // 0b7: anewarray 4
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 0c6: lload 1
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 074
      // 0cc: astore 15
      // 0ce: aload 15
      // 0d0: arraylength
      // 0d1: istore 16
      // 0d3: bipush 0
      // 0d4: istore 17
      // 0d6: iload 17
      // 0d8: iload 16
      // 0da: if_icmpge 138
      // 0dd: aload 15
      // 0df: iload 17
      // 0e1: aaload
      // 0e2: astore 18
      // 0e4: lload 1
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: ifle 126
      // 0ea: aload 12
      // 0ec: iload 14
      // 0ee: ifeq 13a
      // 0f1: aload 18
      // 0f3: lload 4
      // 0f5: aload 13
      // 0f7: bipush 2
      // 0f8: anewarray 4
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 1
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x2
      // 101: dup_x2
      // 102: pop
      // 103: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: invokevirtual rip/breeze/inject/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 10c: lload 6
      // 10e: bipush 2
      // 10f: anewarray 4
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 123: iinc 17 1
      // 126: iload 14
      // 128: ifne 0d6
      // 12b: lload 1
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 0e4
      // 131: goto 138
      // 134: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 137: athrow
      // 138: aload 12
      // 13a: areturn
      // try (65 -> 74): 75 java/lang/IllegalArgumentException
      // try (68 -> 84): 85 java/lang/IllegalArgumentException
      // try (119 -> 163): 168 java/lang/IllegalArgumentException
   }

   public static rip.breeze.inject.é getÉ_4(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = encKey_a ^ var1;
      long var4 = var1 ^ 27818518708206L;
      long var6 = var1 ^ 22170504917498L;
      long var10001 = var1 ^ 2919447172261L;
      int var8 = (int)((var1 ^ 2919447172261L) >>> 32);
      int var9 = (int)((var1 ^ 2919447172261L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 119098347634768L;
      long var13 = var1 ^ 109557833804259L;
      int var10000 = getValue_5();
      rip.breeze.inject.é var15 = new rip.breeze.inject.é(var6);
      Object[] var10010 = new Object[]{null, null, buildString_2(new Object[]{var3}), null, ջ.CONST_Þ_2, null, var4};
      var10010[1] = 1;
      var10010[0] = 52;
      var15.method_001(var10010);
      BreezeClass12 var16 = new BreezeClass12(var8, (short)var9, 1, null /* removed */, ջ.CONST_Ò_2, null, (short)var10, null);
      var16.թ_ê.method_012(new Object[]{new ի(25, 0), var13});
      int var17 = var10000;

      try {
         var16.թ_ê
            .method_012(new Object[]{new rip.breeze.inject.կ(183, ջ.CONST_Þ_2, var11, null /* removed */, ջ.CONST_Ò_2), var13});
         var16.թ_ê.method_012(new Object[]{new rip.breeze.inject.շ(177), var13});
         var15.list_ä_2.add(var16);
         if (rip.breeze.inject.ջ.method_012()) {
            initialize(++var17);
         }

         return var15;
      } catch (IllegalArgumentException var18) {
         throw getIllegalArgumentException(var18);
      }
   }

   public static rip.breeze.inject.ջ getՋ_3(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: pop
      // 16: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 1f: istore 4
      // 21: iload 3
      // 22: bipush -1
      // 23: iload 4
      // 25: ifeq 62
      // 28: if_icmplt 5f
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31: athrow
      // 32: iload 3
      // 33: bipush 5
      // 34: iload 4
      // 36: lload 1
      // 37: lconst_0
      // 38: lcmp
      // 39: ifle 64
      // 3c: ifeq 62
      // 3f: goto 46
      // 42: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: if_icmpgt 5f
      // 49: goto 50
      // 4c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: new rip/breeze/inject/շ
      // 53: dup
      // 54: bipush 3
      // 55: iload 3
      // 56: iadd
      // 57: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 5a: areturn
      // 5b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: iload 3
      // 60: bipush -128
      // 62: iload 4
      // 64: ifeq a3
      // 67: if_icmplt 9f
      // 6a: goto 71
      // 6d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: iload 3
      // 72: bipush 127
      // 74: iload 4
      // 76: lload 1
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt ab
      // 7c: ifeq a3
      // 7f: goto 86
      // 82: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 85: athrow
      // 86: if_icmpgt 9f
      // 89: goto 90
      // 8c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8f: athrow
      // 90: new rip/breeze/inject/ն
      // 93: dup
      // 94: bipush 16
      // 96: iload 3
      // 97: invokespecial rip/breeze/inject/ն.<init> (II)V
      // 9a: areturn
      // 9b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9e: athrow
      // 9f: iload 3
      // a0: sipush -32768
      // a3: lload 1
      // a4: lconst_0
      // a5: lcmp
      // a6: ifle c3
      // a9: iload 4
      // ab: ifeq c3
      // ae: if_icmplt d5
      // b1: goto b8
      // b4: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b7: athrow
      // b8: iload 3
      // b9: sipush 32767
      // bc: goto c3
      // bf: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c2: athrow
      // c3: if_icmpgt d5
      // c6: new rip/breeze/inject/ն
      // c9: dup
      // ca: bipush 17
      // cc: iload 3
      // cd: invokespecial rip/breeze/inject/ն.<init> (II)V
      // d0: areturn
      // d1: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d4: athrow
      // d5: new rip/breeze/inject/ղ
      // d8: dup
      // d9: iload 3
      // da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // dd: invokespecial rip/breeze/inject/ղ.<init> (Ljava/lang/Object;)V
      // e0: areturn
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 36): 37 java/lang/IllegalArgumentException
      // try (28 -> 40): 41 java/lang/IllegalArgumentException
      // try (39 -> 50): 50 java/lang/IllegalArgumentException
      // try (54 -> 57): 58 java/lang/IllegalArgumentException
      // try (56 -> 68): 69 java/lang/IllegalArgumentException
      // try (60 -> 72): 73 java/lang/IllegalArgumentException
      // try (71 -> 81): 81 java/lang/IllegalArgumentException
      // try (85 -> 92): 93 java/lang/IllegalArgumentException
      // try (91 -> 97): 98 java/lang/IllegalArgumentException
      // try (100 -> 107): 107 java/lang/IllegalArgumentException
   }

   public static int[] invoke_33(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      var1 = encKey_a ^ var1;
      long var4 = var1 ^ 7418527350725L;
      long var6 = var1 ^ 104037347537049L;
      rip.breeze.inject.MathUtil3[] var10000 = ջ.method_004(new Object[]{var3, var6});
      Object[] var10004 = new Object[]{null, null, Modifier.isStatic(var3.int_û)};
      var10004[1] = var4;
      var10004[0] = var10000;
      return method_034(var10004);
   }

   public static int[] invoke_34(Object[] var0) {
      rip.breeze.inject.MathUtil3[] var1 = (rip.breeze.inject.MathUtil3[])var0[0];
      long var2 = (Long)var0[1];
      byte var4 = (Boolean)var0[2];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 129587547935198L;
      int var10000 = getValue_5();
      int[] var7 = new int[var1.length];
      int var8 = var10000;

      label40: {
         label39: {
            try {
               var14 = var4;
               if (var8 != 0) {
                  break label40;
               }

               if (var4 != 0) {
                  break label39;
               }
            } catch (IllegalArgumentException var12) {
               throw getIllegalArgumentException(var12);
            }

            var14 = 1;
            break label40;
         }

         var14 = 0;
      }

      int var9 = var14;
      int var10 = 0;

      while (true) {
         if (var10 < var1.length) {
            rip.breeze.inject.MathUtil3 var11 = var1[var10];
            var15 = var7;
            int var10001 = var8;
            if (var2 >= 0L) {
               if (var8 != 0) {
                  break;
               }

               var10001 = var10;
            }

            var7[var10001] = var9;
            var9 += var11.getValue_2(new Object[]{var5});
            var10++;
            if (var8 == 0) {
               continue;
            }
         }

         var15 = var7;
         break;
      }

      return var15;
   }

   public static void calculate_2(Object[] param0) {
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
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 021: lload 2
      // 022: lxor
      // 023: lstore 2
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 105012898038474
      // 029: lxor
      // 02a: lstore 5
      // 02c: dup2
      // 02d: ldc2_w 103226095702695
      // 030: lxor
      // 031: lstore 7
      // 033: dup2
      // 034: ldc2_w 13584943487046
      // 037: lxor
      // 038: lstore 9
      // 03a: pop2
      // 03b: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 03e: istore 11
      // 040: iload 4
      // 042: iload 11
      // 044: ifeq 054
      // 047: ifne 052
      // 04a: goto 051
      // 04d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: return
      // 052: iload 4
      // 054: ifge 070
      // 057: new java/lang/IllegalArgumentException
      // 05a: dup
      // 05b: sipush 19168
      // 05e: ldc2_w 2674507937490791915
      // 061: lload 2
      // 062: lxor
      // 063: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 06b: athrow
      // 06c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06f: athrow
      // 070: aload 1
      // 071: lload 9
      // 073: bipush 2
      // 074: anewarray 4
      // 077: dup_x2
      // 078: dup_x2
      // 079: pop
      // 07a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x1
      // 081: swap
      // 082: bipush 0
      // 083: swap
      // 084: aastore
      // 085: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 088: astore 12
      // 08a: aload 12
      // 08c: aload 12
      // 08e: arraylength
      // 08f: iload 4
      // 091: isub
      // 092: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 095: checkcast [Lrip/breeze/inject/MathUtil3;
      // 098: astore 12
      // 09a: aload 1
      // 09b: lload 5
      // 09d: aload 1
      // 09e: bipush 2
      // 09f: anewarray 4
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: bipush 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0b3: lload 7
      // 0b5: dup2_x1
      // 0b6: pop2
      // 0b7: aload 12
      // 0b9: checkcast [Ljava/lang/Object;
      // 0bc: bipush 3
      // 0bd: anewarray 4
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 2
      // 0c3: swap
      // 0c4: aastore
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: bipush 1
      // 0c8: swap
      // 0c9: aastore
      // 0ca: dup_x2
      // 0cb: dup_x2
      // 0cc: pop
      // 0cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d0: bipush 0
      // 0d1: swap
      // 0d2: aastore
      // 0d3: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0d6: putfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0d9: aload 1
      // 0da: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 125
      // 0e3: iload 11
      // 0e5: ifeq 125
      // 0e8: ifnull 10f
      // 0eb: goto 0f2
      // 0ee: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: aload 1
      // 0f4: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0f7: aload 1
      // 0f8: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0fb: arraylength
      // 0fc: iload 4
      // 0fe: isub
      // 0ff: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 102: checkcast [Ljava/util/List;
      // 105: putfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 108: goto 10f
      // 10b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10e: athrow
      // 10f: aload 1
      // 110: lload 2
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 146
      // 116: iload 11
      // 118: ifeq 146
      // 11b: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 11e: goto 125
      // 121: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 124: athrow
      // 125: ifnull 145
      // 128: aload 1
      // 129: aload 1
      // 12a: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 12d: aload 1
      // 12e: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 131: arraylength
      // 132: iload 4
      // 134: isub
      // 135: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 138: checkcast [Ljava/util/List;
      // 13b: putfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 13e: goto 145
      // 141: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 144: athrow
      // 145: aload 1
      // 146: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 149: iload 11
      // 14b: ifeq 18d
      // 14e: ifle 189
      // 151: goto 158
      // 154: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 157: athrow
      // 158: aload 1
      // 159: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 15c: iload 11
      // 15e: lload 2
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 18f
      // 164: ifeq 18d
      // 167: goto 16e
      // 16a: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16d: athrow
      // 16e: aload 12
      // 170: arraylength
      // 171: if_icmple 189
      // 174: goto 17b
      // 177: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17a: athrow
      // 17b: aload 1
      // 17c: aload 12
      // 17e: arraylength
      // 17f: putfield rip/breeze/inject/BreezeClass12.int_î I
      // 182: goto 189
      // 185: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 188: athrow
      // 189: aload 1
      // 18a: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 18d: iload 11
      // 18f: lload 2
      // 190: lconst_0
      // 191: lcmp
      // 192: iflt 1c2
      // 195: ifeq 1bf
      // 198: ifle 1d3
      // 19b: goto 1a2
      // 19e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a1: athrow
      // 1a2: aload 1
      // 1a3: iload 11
      // 1a5: lload 2
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: ifle 1d0
      // 1ab: ifeq 1cd
      // 1ae: goto 1b5
      // 1b1: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b4: athrow
      // 1b5: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 1b8: goto 1bf
      // 1bb: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1be: athrow
      // 1bf: aload 12
      // 1c1: arraylength
      // 1c2: if_icmple 1d3
      // 1c5: aload 1
      // 1c6: goto 1cd
      // 1c9: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cc: athrow
      // 1cd: aload 12
      // 1cf: arraylength
      // 1d0: putfield rip/breeze/inject/BreezeClass12.int_ì I
      // 1d3: return
      // try (39 -> 43): 44 java/lang/IllegalArgumentException
      // try (48 -> 58): 58 java/lang/IllegalArgumentException
      // try (86 -> 139): 140 java/lang/IllegalArgumentException
      // try (138 -> 153): 154 java/lang/IllegalArgumentException
      // try (156 -> 164): 165 java/lang/IllegalArgumentException
      // try (167 -> 179): 180 java/lang/IllegalArgumentException
      // try (183 -> 187): 188 java/lang/IllegalArgumentException
      // try (186 -> 198): 199 java/lang/IllegalArgumentException
      // try (190 -> 204): 205 java/lang/IllegalArgumentException
      // try (201 -> 211): 212 java/lang/IllegalArgumentException
      // try (216 -> 223): 224 java/lang/IllegalArgumentException
      // try (222 -> 233): 234 java/lang/IllegalArgumentException
      // try (226 -> 237): 238 java/lang/IllegalArgumentException
      // try (240 -> 244): 245 java/lang/IllegalArgumentException
   }

   public static void calculate_3(Object... param0) {
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
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast [I
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 18821264271273
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 21432431900612
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 73422180875557
      // 034: lxor
      // 035: lstore 9
      // 037: pop2
      // 038: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 03b: istore 11
      // 03d: aload 4
      // 03f: iload 11
      // 041: ifeq 056
      // 044: arraylength
      // 045: ifne 054
      // 048: goto 04f
      // 04b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04e: athrow
      // 04f: return
      // 050: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: aload 4
      // 056: invokestatic java/util/Arrays.sort ([I)V
      // 059: new java/util/ArrayList
      // 05c: dup
      // 05d: aload 1
      // 05e: lload 9
      // 060: bipush 2
      // 061: anewarray 4
      // 064: dup_x2
      // 065: dup_x2
      // 066: pop
      // 067: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06a: bipush 1
      // 06b: swap
      // 06c: aastore
      // 06d: dup_x1
      // 06e: swap
      // 06f: bipush 0
      // 070: swap
      // 071: aastore
      // 072: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 075: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 078: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 07b: astore 12
      // 07d: aload 1
      // 07e: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 081: invokestatic java/util/Optional.ofNullable (Ljava/lang/Object;)Ljava/util/Optional;
      // 084: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;, ([Ljava/util/List;)Ljava/util/List; ]
      // 089: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 08c: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/util/ArrayList.<init> (Ljava/util/Collection;)V, (Ljava/util/List;)Ljava/util/List; ]
      // 091: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 094: astore 13
      // 096: aload 1
      // 097: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 09a: invokestatic java/util/Optional.ofNullable (Ljava/lang/Object;)Ljava/util/Optional;
      // 09d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;, ([Ljava/util/List;)Ljava/util/List; ]
      // 0a2: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 0a5: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/util/ArrayList.<init> (Ljava/util/Collection;)V, (Ljava/util/List;)Ljava/util/List; ]
      // 0aa: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 0ad: astore 14
      // 0af: aload 4
      // 0b1: arraylength
      // 0b2: bipush 1
      // 0b3: isub
      // 0b4: istore 15
      // 0b6: iload 15
      // 0b8: iflt 17d
      // 0bb: aload 4
      // 0bd: iload 15
      // 0bf: iaload
      // 0c0: istore 16
      // 0c2: aload 12
      // 0c4: iload 16
      // 0c6: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0cb: pop
      // 0cc: aload 13
      // 0ce: iload 16
      // 0d0: invokedynamic accept (I)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/classtransform/MathUtil3.lambda$removeParameters_Inner0 (ILjava/util/List;)V, (Ljava/util/List;)V ]
      // 0d5: invokevirtual java/util/Optional.ifPresent (Ljava/util/function/Consumer;)V
      // 0d8: aload 14
      // 0da: iload 16
      // 0dc: invokedynamic accept (I)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/classtransform/MathUtil3.lambda$removeParameters_Inner1 (ILjava/util/List;)V, (Ljava/util/List;)V ]
      // 0e1: invokevirtual java/util/Optional.ifPresent (Ljava/util/function/Consumer;)V
      // 0e4: lload 2
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 1f5
      // 0ea: aload 1
      // 0eb: iload 11
      // 0ed: ifeq 1e1
      // 0f0: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 0f3: iload 11
      // 0f5: ifeq 140
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: ifle 13c
      // 102: goto 109
      // 105: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 108: athrow
      // 109: iload 16
      // 10b: iload 11
      // 10d: lload 2
      // 10e: lconst_0
      // 10f: lcmp
      // 110: iflt 142
      // 113: ifeq 140
      // 116: goto 11d
      // 119: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11c: athrow
      // 11d: aload 1
      // 11e: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 121: if_icmpge 13c
      // 124: goto 12b
      // 127: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: aload 1
      // 12c: dup
      // 12d: getfield rip/breeze/inject/BreezeClass12.int_î I
      // 130: bipush 1
      // 131: isub
      // 132: putfield rip/breeze/inject/BreezeClass12.int_î I
      // 135: goto 13c
      // 138: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: aload 1
      // 13d: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 140: iload 11
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 161
      // 148: ifeq 157
      // 14b: ifle 175
      // 14e: goto 155
      // 151: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 154: athrow
      // 155: iload 16
      // 157: lload 2
      // 158: lconst_0
      // 159: lcmp
      // 15a: iflt 17a
      // 15d: aload 1
      // 15e: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 161: if_icmpge 175
      // 164: aload 1
      // 165: dup
      // 166: getfield rip/breeze/inject/BreezeClass12.int_ì I
      // 169: bipush 1
      // 16a: isub
      // 16b: putfield rip/breeze/inject/BreezeClass12.int_ì I
      // 16e: goto 175
      // 171: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 174: athrow
      // 175: iinc 15 -1
      // 178: iload 11
      // 17a: ifne 0b6
      // 17d: aload 1
      // 17e: lload 5
      // 180: aload 1
      // 181: bipush 2
      // 182: anewarray 4
      // 185: dup_x1
      // 186: swap
      // 187: bipush 1
      // 188: swap
      // 189: aastore
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 196: lload 7
      // 198: dup2_x1
      // 199: pop2
      // 19a: aload 12
      // 19c: bipush 0
      // 19d: anewarray 266
      // 1a0: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1a5: checkcast [Ljava/lang/Object;
      // 1a8: bipush 3
      // 1a9: anewarray 4
      // 1ac: dup_x1
      // 1ad: swap
      // 1ae: bipush 2
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 1
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x2
      // 1b7: dup_x2
      // 1b8: pop
      // 1b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1c2: putfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 1c5: aload 1
      // 1c6: aload 13
      // 1c8: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/MathUtil3.lambda$removeParameters_Inner2 (Ljava/util/List;)[Ljava/util/List;, (Ljava/util/List;)[Ljava/util/List; ]
      // 1cd: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 1d0: aconst_null
      // 1d1: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d4: checkcast [Ljava/util/List;
      // 1d7: putfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 1da: lload 2
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: ifle 1f5
      // 1e0: aload 1
      // 1e1: aload 14
      // 1e3: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/MathUtil3.lambda$removeParameters_Inner3 (Ljava/util/List;)[Ljava/util/List;, (Ljava/util/List;)[Ljava/util/List; ]
      // 1e8: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 1eb: aconst_null
      // 1ec: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ef: checkcast [Ljava/util/List;
      // 1f2: putfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 1f5: return
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (100 -> 122): 123 java/lang/IllegalArgumentException
      // try (119 -> 126): 127 java/lang/IllegalArgumentException
      // try (125 -> 136): 137 java/lang/IllegalArgumentException
      // try (129 -> 142): 143 java/lang/IllegalArgumentException
      // try (139 -> 151): 152 java/lang/IllegalArgumentException
      // try (156 -> 163): 164 java/lang/IllegalArgumentException
      // try (167 -> 180): 181 java/lang/IllegalArgumentException
   }

   public static void calculate_4(Object... param0) {
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
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast [Lrip/breeze/inject/MathUtil3;
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 123552169415281
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 125613592756764
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 39060562004221
      // 034: lxor
      // 035: lstore 9
      // 037: pop2
      // 038: invokestatic rip/breeze/classtransform/MathUtil3.getValue_6 ()I
      // 03b: istore 11
      // 03d: aload 4
      // 03f: iload 11
      // 041: ifeq 06c
      // 044: arraylength
      // 045: ifne 054
      // 048: goto 04f
      // 04b: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04e: athrow
      // 04f: return
      // 050: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: aload 1
      // 055: lload 9
      // 057: bipush 2
      // 058: anewarray 4
      // 05b: dup_x2
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061: bipush 1
      // 062: swap
      // 063: aastore
      // 064: dup_x1
      // 065: swap
      // 066: bipush 0
      // 067: swap
      // 068: aastore
      // 069: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 06c: astore 12
      // 06e: aload 12
      // 070: arraylength
      // 071: aload 4
      // 073: arraylength
      // 074: iadd
      // 075: anewarray 266
      // 078: astore 13
      // 07a: aload 12
      // 07c: bipush 0
      // 07d: aload 13
      // 07f: bipush 0
      // 080: aload 12
      // 082: arraylength
      // 083: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 086: aload 4
      // 088: bipush 0
      // 089: aload 13
      // 08b: aload 12
      // 08d: arraylength
      // 08e: aload 4
      // 090: arraylength
      // 091: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 094: aload 1
      // 095: lload 5
      // 097: aload 1
      // 098: bipush 2
      // 099: anewarray 4
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 1
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0ad: lload 7
      // 0af: dup2_x1
      // 0b0: pop2
      // 0b1: aload 13
      // 0b3: checkcast [Ljava/lang/Object;
      // 0b6: bipush 3
      // 0b7: anewarray 4
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 2
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 1
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x2
      // 0c5: dup_x2
      // 0c6: pop
      // 0c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0d0: putfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0d3: aload 1
      // 0d4: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0d7: iload 11
      // 0d9: ifeq 112
      // 0dc: ifnull 102
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: aload 1
      // 0e8: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0eb: aload 1
      // 0ec: getfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0ef: arraylength
      // 0f0: bipush 1
      // 0f1: iadd
      // 0f2: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0f5: checkcast [Ljava/util/List;
      // 0f8: putfield rip/breeze/inject/BreezeClass12.arr_í [Ljava/util/List;
      // 0fb: goto 102
      // 0fe: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: aload 1
      // 103: iload 11
      // 105: ifeq 116
      // 108: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 10b: goto 112
      // 10e: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 111: athrow
      // 112: ifnull 12a
      // 115: aload 1
      // 116: aload 1
      // 117: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 11a: aload 1
      // 11b: getfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 11e: arraylength
      // 11f: bipush 1
      // 120: iadd
      // 121: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 124: checkcast [Ljava/util/List;
      // 127: putfield rip/breeze/inject/BreezeClass12.arr_ë [Ljava/util/List;
      // 12a: return
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (74 -> 138): 139 java/lang/IllegalArgumentException
      // try (137 -> 152): 153 java/lang/IllegalArgumentException
      // try (155 -> 159): 160 java/lang/IllegalArgumentException
   }

   public static թ getԹ_3(Object[] param0) {
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
      // 004: checkcast rip/breeze/inject/MathUtil3
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/MathUtil3
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: pop
      // 01a: getstatic rip/breeze/classtransform/MathUtil3.encKey_a J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 25922376201697
      // 025: lxor
      // 026: lstore 5
      // 028: dup2
      // 029: ldc2_w 58120080150687
      // 02c: lxor
      // 02d: lstore 7
      // 02f: pop2
      // 030: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 033: new rip/breeze/inject/թ
      // 036: dup
      // 037: invokespecial rip/breeze/inject/թ.<init> ()V
      // 03a: astore 9
      // 03c: istore 10
      // 03e: aload 1
      // 03f: lload 5
      // 041: bipush 1
      // 042: anewarray 4
      // 045: dup_x2
      // 046: dup_x2
      // 047: pop
      // 048: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04b: bipush 0
      // 04c: swap
      // 04d: aastore
      // 04e: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 051: bipush 1
      // 052: iload 10
      // 054: ifne 0e6
      // 057: if_icmpne 0cb
      // 05a: goto 061
      // 05d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 060: athrow
      // 061: aload 2
      // 062: lload 5
      // 064: bipush 1
      // 065: anewarray 4
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 074: bipush 1
      // 075: iload 10
      // 077: lload 3
      // 078: lconst_0
      // 079: lcmp
      // 07a: ifle 0e8
      // 07d: ifne 0e6
      // 080: goto 087
      // 083: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 086: athrow
      // 087: lload 3
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 0df
      // 08d: if_icmpne 0cb
      // 090: goto 097
      // 093: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 096: athrow
      // 097: aload 9
      // 099: lload 3
      // 09a: lconst_0
      // 09b: lcmp
      // 09c: ifle 242
      // 09f: new rip/breeze/inject/շ
      // 0a2: dup
      // 0a3: bipush 95
      // 0a5: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 0a8: lload 7
      // 0aa: bipush 2
      // 0ab: anewarray 4
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0bf: iload 10
      // 0c1: ifeq 240
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: lload 5
      // 0ce: bipush 1
      // 0cf: anewarray 4
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 0
      // 0d9: swap
      // 0da: aastore
      // 0db: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 0de: bipush 2
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: iload 10
      // 0e8: ifne 19c
      // 0eb: if_icmpne 181
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: aload 2
      // 0f6: lload 5
      // 0f8: bipush 1
      // 0f9: anewarray 4
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 108: bipush 2
      // 109: lload 3
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 19c
      // 10f: iload 10
      // 111: ifne 19c
      // 114: goto 11b
      // 117: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11a: athrow
      // 11b: lload 3
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 195
      // 121: if_icmpne 181
      // 124: goto 12b
      // 127: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: aload 9
      // 12d: new rip/breeze/inject/շ
      // 130: dup
      // 131: bipush 94
      // 133: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 136: lload 7
      // 138: bipush 2
      // 139: anewarray 4
      // 13c: dup_x2
      // 13d: dup_x2
      // 13e: pop
      // 13f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 142: bipush 1
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 14d: aload 9
      // 14f: lload 3
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 242
      // 155: new rip/breeze/inject/շ
      // 158: dup
      // 159: bipush 88
      // 15b: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 15e: lload 7
      // 160: bipush 2
      // 161: anewarray 4
      // 164: dup_x2
      // 165: dup_x2
      // 166: pop
      // 167: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16a: bipush 1
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 0
      // 170: swap
      // 171: aastore
      // 172: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 175: iload 10
      // 177: ifeq 240
      // 17a: goto 181
      // 17d: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 180: athrow
      // 181: aload 1
      // 182: lload 5
      // 184: bipush 1
      // 185: anewarray 4
      // 188: dup_x2
      // 189: dup_x2
      // 18a: pop
      // 18b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18e: bipush 0
      // 18f: swap
      // 190: aastore
      // 191: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 194: bipush 2
      // 195: goto 19c
      // 198: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: if_icmpne 1f5
      // 19f: aload 9
      // 1a1: new rip/breeze/inject/շ
      // 1a4: dup
      // 1a5: bipush 91
      // 1a7: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 1aa: lload 7
      // 1ac: bipush 2
      // 1ad: anewarray 4
      // 1b0: dup_x2
      // 1b1: dup_x2
      // 1b2: pop
      // 1b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b6: bipush 1
      // 1b7: swap
      // 1b8: aastore
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 0
      // 1bc: swap
      // 1bd: aastore
      // 1be: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1c1: aload 9
      // 1c3: lload 3
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: ifle 242
      // 1c9: new rip/breeze/inject/շ
      // 1cc: dup
      // 1cd: bipush 87
      // 1cf: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 1d2: lload 7
      // 1d4: bipush 2
      // 1d5: anewarray 4
      // 1d8: dup_x2
      // 1d9: dup_x2
      // 1da: pop
      // 1db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1de: bipush 1
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1e9: iload 10
      // 1eb: ifeq 240
      // 1ee: goto 1f5
      // 1f1: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f4: athrow
      // 1f5: aload 9
      // 1f7: new rip/breeze/inject/շ
      // 1fa: dup
      // 1fb: bipush 93
      // 1fd: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 200: lload 7
      // 202: bipush 2
      // 203: anewarray 4
      // 206: dup_x2
      // 207: dup_x2
      // 208: pop
      // 209: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20c: bipush 1
      // 20d: swap
      // 20e: aastore
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 0
      // 212: swap
      // 213: aastore
      // 214: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 217: aload 9
      // 219: new rip/breeze/inject/շ
      // 21c: dup
      // 21d: bipush 88
      // 21f: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 222: lload 7
      // 224: bipush 2
      // 225: anewarray 4
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 1
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: bipush 0
      // 234: swap
      // 235: aastore
      // 236: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 239: goto 240
      // 23c: invokestatic rip/breeze/classtransform/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23f: athrow
      // 240: aload 9
      // 242: areturn
      // try (38 -> 54): 55 java/lang/IllegalArgumentException
      // try (53 -> 76): 77 java/lang/IllegalArgumentException
      // try (57 -> 84): 85 java/lang/IllegalArgumentException
      // try (79 -> 114): 115 java/lang/IllegalArgumentException
      // try (87 -> 130): 131 java/lang/IllegalArgumentException
      // try (133 -> 136): 137 java/lang/IllegalArgumentException
      // try (135 -> 158): 159 java/lang/IllegalArgumentException
      // try (139 -> 166): 167 java/lang/IllegalArgumentException
      // try (161 -> 217): 218 java/lang/IllegalArgumentException
      // try (169 -> 233): 234 java/lang/IllegalArgumentException
      // try (236 -> 285): 286 java/lang/IllegalArgumentException
      // try (237 -> 330): 331 java/lang/IllegalArgumentException
   }

   public static String buildString(Object[] var0) {
      String var1 = (String)var0[0];
      return var1.replace('/', '.');
   }

   public static String buildString_2(Object[] var0) {
      String var1 = (String)var0[0];
      return var1.replace('.', '/');
   }

   private static List[] lambda$removeParameters_Inner3(List var0) {
      return var0.toArray(new List[0]);
   }

   private static List[] lambda$removeParameters_Inner2(List var0) {
      return var0.toArray(new List[0]);
   }

   private static void lambda$removeParameters_Inner1(int var0, List var1) {
      List var10000 = (List)var1.remove(var0);
   }

   private static void lambda$removeParameters_Inner0(int var0, List var1) {
      List var10000 = (List)var1.remove(var0);
   }

   public static void initialize(int var0) {
      int_ý = var0;
   }

   public static int getValue_5() {
      return int_ý;
   }

   public static int getValue_6() {
      int var0 = getValue_5();

      try {
         return var0 == 0 ? 9 : 0;
      } catch (IllegalArgumentException var1) {
         throw getIllegalArgumentException(var1);
      }
   }

   static {
      initialize(0);
      long var0 = 2847096159687L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[21];
      int var5 = 0;
      String var6 = "\u0080¾ªj]´¡-Lµr@úÛ\u0012=Hìé\u00197p\u0095ÞøÊ\u0013\u0003Q*¤¶Y¤\u00ad²\u0093Ã1CC\u0002Û\u0011\tjÑ=imÌá\u0013*ê¾AAúÁG÷k\bQ\"CIääåôÌ³\u0086\u00070®pTÑ¤-\u000eì\u0099\u0085\u009aDH¸\u0084XÚ¿\u000f\u0083HçôZ%íÏ\u001aì·5³ÙPB0\u008cN.)² ¿I\u0087P\u00adpø94!|Ë¢\u0084¿\u0090tõó\u009a\u009c^ñà\u008d\u001f\u0085Å\u0084bÖê\u0007$ï\u000bqO¶G+\u0014\u008b@/vYÉ·æ¼tÚÁ\u0019áÉ¨\u0091\\}\u001c\u0089lä\u0000©Ä\u0097á\u0094èÞHú0\u008að?{Ð\u0015Å\u001c(ùÊ½\u0001Î\u0019\u0007ä\u001b!´h.\u0094d4\u000eæÔ\u0014ÉË\t Ìp\u0086ü\u0084\u0091Äsx6ó\u0089K\b\u008czàµÌÍ\u001dÄ-u\"ÝØT\u0013TÆ7\u0018\u008bùVÕ\u0018ù¹çâS]\u0019ß{aù\na\u0080&Á2U6\u0018âEÍ1\u0088\nqügG{Y³\u0092\u0098\u0019$ø\t\u0096î\u0018Ë4 A'oÜ\u0082÷®³ù\u008aÃâ[¼8\u0095r}F\u0080\u001fÏ\u0088[\u0001\u000e\u0015\u008dKÖáÐ\u0010ÑââH\n,'ÄÕ2}Ê\u001fÕo* Ä\u001f0\n×ã°\u009fÈO\u009en];\u008aêP\u0090¸è\u0005ÿ\u0005=&\u008eù¸8êê)(\u00ad\u009cµ\u0012¬Ép*\u0090D±0(Á\u0097@¿\u0096\u008c\rB¥¶¯©¯\u0092;-Ð°:×m×Ø u\u0089w@÷æ\fZÒ\u00ad\u001dáwy\u0015\u0091çÀï°ÇÀFÐ¶\u001c\u0002¼¿%f\u000e|kpó1Lë%¸);á\u007fs\u008eb¦\u0097Ó!é[ÀÀ mû\u0007ðµ\u008f\u009f1Ö@\u0010\u0018~È¾í\u0080\u001c\u008eJþ¡\rÍÚ5\nÚ³\u001c½¦Äx\u0093J\u0010ò¦AØR \u0015\u0017ê{A\u008c¼\u001es\u001c\u0018¶,[ï\u0096\u001eË\u008cëÇ½=\\YI\u0083,hhË?LK\t ÐÇræß6\n\u009fÀ\u001c\u000bo¯l¢ÓÍM7M»J\u0001£Ø\u0001\u0084\u001c\u009f\u0002¿\u000eP\u0093få\u000fbà\u0015kÀ¥jp\"\u0098]\u0092¤ïÔ\"I\u0001÷a\u0000¡-¥gL\u0018¨\u000e²\u0018ëR»ô\u0093êN\u0013%Ê\u0018¡Ìë\u000fÜ\u001b\u0010sæD6Ôþeè\"\u001dg?ñ7¡\u009f\u000e8\u0083\u0093\u009eX\u0094$ØAC BØ%o{U\u008fQ^3ð\\Ò¥\u0007¬\u008f\u0006\u009c\u0012 \u0017±¼Do½\u008f\u009d¥\u001dà8$^ULî*óëñaÚ\u0094i°DD\u0011\u0099CÁ\u0005l:\t\u0017\u0005þ\u008b:[b1\u000b¹m|\u001eÍ\r[4yÍ+Q\u0087tcôg¥V31¥\u008d";
      int var7 = "\u0080¾ªj]´¡-Lµr@úÛ\u0012=Hìé\u00197p\u0095ÞøÊ\u0013\u0003Q*¤¶Y¤\u00ad²\u0093Ã1CC\u0002Û\u0011\tjÑ=imÌá\u0013*ê¾AAúÁG÷k\bQ\"CIääåôÌ³\u0086\u00070®pTÑ¤-\u000eì\u0099\u0085\u009aDH¸\u0084XÚ¿\u000f\u0083HçôZ%íÏ\u001aì·5³ÙPB0\u008cN.)² ¿I\u0087P\u00adpø94!|Ë¢\u0084¿\u0090tõó\u009a\u009c^ñà\u008d\u001f\u0085Å\u0084bÖê\u0007$ï\u000bqO¶G+\u0014\u008b@/vYÉ·æ¼tÚÁ\u0019áÉ¨\u0091\\}\u001c\u0089lä\u0000©Ä\u0097á\u0094èÞHú0\u008að?{Ð\u0015Å\u001c(ùÊ½\u0001Î\u0019\u0007ä\u001b!´h.\u0094d4\u000eæÔ\u0014ÉË\t Ìp\u0086ü\u0084\u0091Äsx6ó\u0089K\b\u008czàµÌÍ\u001dÄ-u\"ÝØT\u0013TÆ7\u0018\u008bùVÕ\u0018ù¹çâS]\u0019ß{aù\na\u0080&Á2U6\u0018âEÍ1\u0088\nqügG{Y³\u0092\u0098\u0019$ø\t\u0096î\u0018Ë4 A'oÜ\u0082÷®³ù\u008aÃâ[¼8\u0095r}F\u0080\u001fÏ\u0088[\u0001\u000e\u0015\u008dKÖáÐ\u0010ÑââH\n,'ÄÕ2}Ê\u001fÕo* Ä\u001f0\n×ã°\u009fÈO\u009en];\u008aêP\u0090¸è\u0005ÿ\u0005=&\u008eù¸8êê)(\u00ad\u009cµ\u0012¬Ép*\u0090D±0(Á\u0097@¿\u0096\u008c\rB¥¶¯©¯\u0092;-Ð°:×m×Ø u\u0089w@÷æ\fZÒ\u00ad\u001dáwy\u0015\u0091çÀï°ÇÀFÐ¶\u001c\u0002¼¿%f\u000e|kpó1Lë%¸);á\u007fs\u008eb¦\u0097Ó!é[ÀÀ mû\u0007ðµ\u008f\u009f1Ö@\u0010\u0018~È¾í\u0080\u001c\u008eJþ¡\rÍÚ5\nÚ³\u001c½¦Äx\u0093J\u0010ò¦AØR \u0015\u0017ê{A\u008c¼\u001es\u001c\u0018¶,[ï\u0096\u001eË\u008cëÇ½=\\YI\u0083,hhË?LK\t ÐÇræß6\n\u009fÀ\u001c\u000bo¯l¢ÓÍM7M»J\u0001£Ø\u0001\u0084\u001c\u009f\u0002¿\u000eP\u0093få\u000fbà\u0015kÀ¥jp\"\u0098]\u0092¤ïÔ\"I\u0001÷a\u0000¡-¥gL\u0018¨\u000e²\u0018ëR»ô\u0093êN\u0013%Ê\u0018¡Ìë\u000fÜ\u001b\u0010sæD6Ôþeè\"\u001dg?ñ7¡\u009f\u000e8\u0083\u0093\u009eX\u0094$ØAC BØ%o{U\u008fQ^3ð\\Ò¥\u0007¬\u008f\u0006\u009c\u0012 \u0017±¼Do½\u008f\u009d¥\u001dà8$^ULî*óëñaÚ\u0094i°DD\u0011\u0099CÁ\u0005l:\t\u0017\u0005þ\u008b:[b1\u000b¹m|\u001eÍ\r[4yÍ+Q\u0087tcôg¥V31¥\u008d"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B = var4;
                     CONST_C = new String[21];
                     CONST_Þ = "^(?>L([^;]+);|([^.]+)\\.)([^(]+):(.+)$";
                     CONST_Ÿ = "^(?>L([^;]+);|([^.]+)\\.)([^(]+)(\\([^)]*\\).+)$";
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¿\u0010~½¥YÌ÷ôÑ \u0019&\u0014\u009e®\u0085\b¯¢[¨¿ÉÇ¿öã·>#\u0083\u0010¤Ydpz{!N'eë«3K$\u0004øi\u007fö\u0083¦î\u0094ü\u0006\u0084\u0019\u0011ö©¼\u009dÞ\u00165e¨\u0084\u0010êL\u0007:@\u009cO=ä,yµ\u001eg\u0095\u0092";
                  var7 = "¿\u0010~½¥YÌ÷ôÑ \u0019&\u0014\u009e®\u0085\b¯¢[¨¿ÉÇ¿öã·>#\u0083\u0010¤Ydpz{!N'eë«3K$\u0004øi\u007fö\u0083¦î\u0094ü\u0006\u0084\u0019\u0011ö©¼\u009dÞ\u00165e¨\u0084\u0010êL\u0007:@\u009cO=ä,yµ\u001eg\u0095\u0092"
                     .length();
                  var8 = 'H';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3399;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/c", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/c" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
