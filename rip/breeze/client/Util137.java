package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util137 {
   static final Util137 CONST_A;
   private final String string_b;
   private final EnumType22 enum_KEY_c;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   static Util137 getDataBuilder23(String var0, int var1, Util112 var2, int var3, byte var4) {
      int var7;
      int var8;
      int var9;
      long var10;
      long var14;
      String[] var16;
      boolean var20;
      label32: {
         long var5 = ((long)var1 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ 39288082250766L;
         long var10001 = var5 ^ 117969626350155L;
         var7 = (int)((var5 ^ 117969626350155L) >>> 48);
         var8 = (int)((var5 ^ 117969626350155L) << 16 >>> 32);
         var9 = (int)(var10001 << 48 >>> 48);
         var10 = var5 ^ 129376579329787L;
         long var12 = var5 ^ 48495053936889L;
         var14 = var5 ^ 16995773547859L;
         String[] var10000 = Util28.values();
         var0 = var0.trim();
         var16 = var10000;
         if (var0.startsWith(buildString_4(19778, 5023194728749407426L ^ var5))) {
            EnumType22 var17 = EnumType22.TABLE_ARRAY;
            var20 = checkCondition_3(var0, var2, var12);
            if (var3 < 0) {
               break label32;
            }

            boolean var18 = var20;
            if (var16 == null) {
               return !var18 ? CONST_A : new Util137(buildString_2(var0, var14), var17);
            }
         }

         var20 = var0.startsWith("[");
      }

      EnumType22 var21;
      label24: {
         if (var20) {
            var21 = EnumType22.TABLE;
            boolean var22 = checkCondition_2((short)var7, var0, var8, (char)var9, var2);
            if (var1 <= 0) {
               break label24;
            }

            if (var16 == null) {
               return !var22 ? CONST_A : new Util137(buildString_2(var0, var14), var21);
            }
         }

         var21 = EnumType22.KEY;
      }

      boolean var23 = checkCondition(var0, var2, var10);
      return !var23 ? CONST_A : new Util137(buildString_2(var0, var14), var21);
   }

   private Util137(String var1, EnumType22 var2) {
      this.string_b = var1;
      this.enum_KEY_c = var2;
   }

   String getString_b() {
      return this.string_b;
   }

   String buildString(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ 39288082250766L;
      long var6 = var4 ^ 83449990660430L;
      long var8 = var4 ^ 65238091381284L;
      if (this.isValid(var8)) {
         return this.string_b;
      }

      Util137 var10000 = this;
      if (var3 > 0) {
         if (this.isValid_2(var6)) {
            return this.string_b.substring(1, this.string_b.length() - 1);
         }

         var10000 = this;
      }

      return var10000.string_b.substring(2, this.string_b.length() - 2);
   }

   boolean isValid(long var1) {
      var1 = 39288082250766L ^ var1;
      return this.enum_KEY_c == EnumType22.KEY;
   }

   boolean isValid_2(long var1) {
      var1 = 39288082250766L ^ var1;
      return this.enum_KEY_c == EnumType22.TABLE;
   }

   boolean isValid_3(long var1) {
      var1 = 39288082250766L ^ var1;
      return this.enum_KEY_c == EnumType22.TABLE_ARRAY;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static String buildString_2(String var0, long var1) {
      var1 = 39288082250766L ^ var1;
      long var3 = var1 ^ 96760957437025L;
      String[] var10000 = Util28.values();
      int var5 = 0;
      StringBuilder var6 = new StringBuilder();
      String[] var7 = var10000;
      int var8 = 0;

      label92:
      while (true) {
         String var11;
         if (var8 < var0.length()) {
            var11 = var0;
         } else {
            var11 = EnumFacing.CONST_A.buildString(var3, var6.toString());
            if (var1 >= 0L) {
               return var11;
            }
         }

         do {
            label94: {
               char var9 = var11.charAt(var8);
               int var12 = var9;
               if (var1 > 0L) {
                  label86:
                  if (var9 == '"') {
                     int var13 = var8;
                     if (var1 > 0L) {
                        if (var8 != 0) {
                           var12 = var0.charAt(var8 - 1);
                           if (var1 <= 0L) {
                              break label86;
                           }

                           if (var12 == 92) {
                              var12 = var5;
                              break label86;
                           }

                           var13 = var5;
                           if (var1 >= 0L) {
                              var13 = var5 == 0 ? 1 : 0;
                           }
                        } else {
                           var13 = var5;
                           if (var1 >= 0L) {
                              var13 = var5 == 0 ? 1 : 0;
                           }
                        }
                     } else if (var1 >= 0L) {
                        var13 = var8 == 0 ? 1 : 0;
                     }

                     var5 = var13;
                     var6.append('"');
                     if (var1 < 0L) {
                        if (var7 == null) {
                           continue label92;
                        }
                        break label94;
                     }

                     if (var7 == null) {
                        var8++;
                        if (var7 == null) {
                           continue label92;
                        }
                        break label94;
                     }

                     var12 = var5;
                  } else {
                     var12 = var5;
                  }
               }

               if (var1 >= 0L) {
                  if (var12 == 0) {
                     if (!Character.isWhitespace(var9)) {
                        var6.append(var9);
                     }
                  } else {
                     var6.append(var9);
                  }
               } else if (var12 == 0) {
                  var6.append(var9);
               }

               var8++;
               if (var7 == null) {
                  continue label92;
               }
            }

            var11 = EnumFacing.CONST_A.buildString(var3, var6.toString());
         } while (var1 < 0L);

         return var11;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean checkCondition(String var0, Util112 var1, long var2) {
      var2 = 39288082250766L ^ var2;
      long var4 = var2 ^ 38859122963040L;
      String[] var6 = Util28.values();
      if (var0.trim().isEmpty()) {
         var1.dataBuilder12_c.update_7(var0, var1.atomicInteger_b.get(), var4);
         return false;
      }

      int var7 = 0;
      int var8 = 0;

      label122:
      while (true) {
         char var10000;
         if (var8 < var0.length()) {
            var10000 = var0.charAt(var8);
         } else {
            var10000 = 1;
            if (var2 > 0L) {
               return true;
            }
         }

         do {
            label118: {
               char var9 = (char)var10000;
               var10000 = var9;
               if (var2 > 0L) {
                  label116:
                  if (var9 == '"') {
                     var10000 = var8;
                     if (var2 > 0L) {
                        if (var8 != 0) {
                           var10000 = var0.charAt(var8 - 1);
                           if (var2 <= 0L) {
                              break label116;
                           }

                           if (var10000 == 92) {
                              var10000 = var7;
                              break label116;
                           }

                           var10000 = var7;
                        } else {
                           var10000 = var7;
                        }
                     }

                     if (var2 >= 0L) {
                        if (var10000 == 0) {
                           var10000 = var8;
                           if (var2 >= 0L) {
                              if (var8 > 0) {
                                 var10000 = var0.charAt(var8 - 1);
                                 if (var2 >= 0L) {
                                    if (var10000 != 46) {
                                       var1.dataBuilder12_c.update_7(var0, var1.atomicInteger_b.get(), var4);
                                       return false;
                                    }

                                    var10000 = var7;
                                 }
                              } else {
                                 var10000 = var7;
                              }
                           }
                        } else {
                           var10000 = var7;
                        }

                        if (var2 > 0L) {
                           var10000 = var10000 == 0 ? 1 : 0;
                        }
                     } else if (var2 > 0L) {
                        var10000 = var10000 == 0 ? 1 : 0;
                     }

                     var7 = var10000;
                     if (var2 < 0L) {
                        if (var6 == null) {
                           continue label122;
                        }
                        break label118;
                     }

                     if (var6 == null) {
                        var8++;
                        if (var6 == null) {
                           continue label122;
                        }
                        break label118;
                     }

                     var10000 = var7;
                  } else {
                     var10000 = var7;
                  }
               }

               if (var2 > 0L) {
                  if (var10000 == 0) {
                     var10000 = buildString_4(11323, 7085752386187386700L ^ var2).indexOf(var9);
                     if (var2 <= 0L) {
                        return (boolean)var10000;
                     }

                     if (var10000 == -1) {
                        var1.dataBuilder12_c.update_7(var0, var1.atomicInteger_b.get(), var4);
                        return false;
                     }

                     var8++;
                     if (var6 == null) {
                        continue label122;
                     }
                  } else {
                     var8++;
                     if (var6 == null) {
                        continue label122;
                     }
                  }
               } else {
                  if (var2 <= 0L) {
                     return (boolean)var10000;
                  }

                  if (var10000 == -1) {
                     var1.dataBuilder12_c.update_7(var0, var1.atomicInteger_b.get(), var4);
                     return false;
                  }

                  var8++;
                  if (var6 == null) {
                     continue label122;
                  }
               }
            }

            var10000 = 1;
         } while (var2 <= 0L);

         return true;
      }
   }

   private static boolean checkCondition_2(short param0, String param1, int param2, char param3, Util112 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 0
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
      // 017: getstatic rip/breeze/client/Util137.39288082250766L J
      // 01a: lxor
      // 01b: lstore 5
      // 01d: lload 5
      // 01f: dup2
      // 020: ldc2_w 18035736352197
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 114778551252450
      // 02a: lxor
      // 02b: lstore 9
      // 02d: dup2
      // 02e: ldc2_w 20340021932846
      // 031: lxor
      // 032: lstore 11
      // 034: pop2
      // 035: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 038: bipush 1
      // 039: istore 13
      // 03b: astore 14
      // 03d: aload 1
      // 03e: ldc "]"
      // 040: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 043: ifne 049
      // 046: bipush 0
      // 047: istore 13
      // 049: aload 1
      // 04a: bipush 1
      // 04b: aload 1
      // 04c: invokevirtual java/lang/String.length ()I
      // 04f: bipush 1
      // 050: isub
      // 051: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 054: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 057: astore 15
      // 059: aload 15
      // 05b: invokevirtual java/lang/String.isEmpty ()Z
      // 05e: iload 2
      // 05f: ifle 083
      // 062: ifne 082
      // 065: aload 15
      // 067: bipush 0
      // 068: invokevirtual java/lang/String.charAt (I)C
      // 06b: iload 3
      // 06c: iflt 083
      // 06f: bipush 46
      // 071: if_icmpeq 082
      // 074: aload 15
      // 076: ldc "."
      // 078: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 07b: iload 3
      // 07c: iflt 087
      // 07f: ifeq 085
      // 082: bipush 0
      // 083: istore 13
      // 085: iload 13
      // 087: iload 2
      // 088: ifle 0a6
      // 08b: ifne 0a5
      // 08e: aload 4
      // 090: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 093: aload 1
      // 094: aload 4
      // 096: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 099: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 09c: lload 9
      // 09e: dup2_x1
      // 09f: pop2
      // 0a0: invokevirtual rip/breeze/client/StringBuilderUtil.update_4 (Ljava/lang/String;JI)V
      // 0a3: bipush 0
      // 0a4: ireturn
      // 0a5: bipush 0
      // 0a6: istore 16
      // 0a8: bipush 0
      // 0a9: istore 17
      // 0ab: bipush 1
      // 0ac: istore 18
      // 0ae: bipush 1
      // 0af: istore 19
      // 0b1: bipush 0
      // 0b2: istore 20
      // 0b4: iload 20
      // 0b6: aload 15
      // 0b8: invokevirtual java/lang/String.length ()I
      // 0bb: if_icmpge 20b
      // 0be: aload 15
      // 0c0: iload 20
      // 0c2: invokevirtual java/lang/String.charAt (I)C
      // 0c5: istore 21
      // 0c7: iload 13
      // 0c9: iload 0
      // 0ca: iflt 0dc
      // 0cd: ifne 0d5
      // 0d0: aload 14
      // 0d2: ifnull 20b
      // 0d5: iload 21
      // 0d7: lload 7
      // 0d9: invokestatic rip/breeze/client/Util97.isValid (CJ)Z
      // 0dc: iload 3
      // 0dd: ifle 13f
      // 0e0: ifeq 13d
      // 0e3: iload 18
      // 0e5: iload 0
      // 0e6: iflt 0fa
      // 0e9: ifne 0f8
      // 0ec: bipush 0
      // 0ed: istore 13
      // 0ef: aload 14
      // 0f1: iload 0
      // 0f2: iflt 208
      // 0f5: ifnull 203
      // 0f8: iload 16
      // 0fa: iload 0
      // 0fb: iflt 127
      // 0fe: ifeq 125
      // 101: aload 15
      // 103: iload 20
      // 105: bipush 1
      // 106: isub
      // 107: invokevirtual java/lang/String.charAt (I)C
      // 10a: iload 0
      // 10b: iflt 127
      // 10e: bipush 92
      // 110: if_icmpeq 125
      // 113: bipush 0
      // 114: istore 19
      // 116: bipush 1
      // 117: istore 17
      // 119: bipush 0
      // 11a: istore 18
      // 11c: aload 14
      // 11e: iload 2
      // 11f: iflt 208
      // 122: ifnull 203
      // 125: iload 16
      // 127: iload 0
      // 128: iflt 132
      // 12b: ifne 203
      // 12e: bipush 1
      // 12f: istore 16
      // 131: bipush 1
      // 132: istore 18
      // 134: aload 14
      // 136: iload 0
      // 137: iflt 208
      // 13a: ifnull 203
      // 13d: iload 16
      // 13f: iload 2
      // 140: iflt 151
      // 143: ifeq 14f
      // 146: aload 14
      // 148: iload 2
      // 149: iflt 208
      // 14c: ifnull 203
      // 14f: iload 21
      // 151: iload 0
      // 152: iflt 191
      // 155: bipush 46
      // 157: if_icmpne 18c
      // 15a: iload 17
      // 15c: iload 2
      // 15d: iflt 18b
      // 160: ifeq 175
      // 163: bipush 1
      // 164: istore 19
      // 166: bipush 0
      // 167: istore 17
      // 169: bipush 1
      // 16a: istore 18
      // 16c: aload 14
      // 16e: iload 2
      // 16f: iflt 208
      // 172: ifnull 203
      // 175: aload 4
      // 177: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 17a: aload 1
      // 17b: aload 4
      // 17d: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 180: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 183: lload 11
      // 185: dup2_x1
      // 186: pop2
      // 187: invokevirtual rip/breeze/client/StringBuilderUtil.update_3 (Ljava/lang/String;JI)V
      // 18a: bipush 0
      // 18b: ireturn
      // 18c: iload 21
      // 18e: invokestatic java/lang/Character.isWhitespace (C)Z
      // 191: iload 2
      // 192: ifle 1ce
      // 195: ifeq 1cc
      // 198: aload 15
      // 19a: iload 20
      // 19c: bipush 1
      // 19d: isub
      // 19e: invokevirtual java/lang/String.charAt (I)C
      // 1a1: istore 22
      // 1a3: iload 22
      // 1a5: invokestatic java/lang/Character.isWhitespace (C)Z
      // 1a8: iload 0
      // 1a9: iflt 1b1
      // 1ac: ifne 1c3
      // 1af: iload 22
      // 1b1: iload 2
      // 1b2: ifle 1c1
      // 1b5: bipush 46
      // 1b7: if_icmpeq 1c3
      // 1ba: bipush 0
      // 1bb: istore 19
      // 1bd: bipush 1
      // 1be: istore 17
      // 1c0: bipush 1
      // 1c1: istore 18
      // 1c3: aload 14
      // 1c5: iload 3
      // 1c6: ifle 208
      // 1c9: ifnull 203
      // 1cc: iload 19
      // 1ce: iload 0
      // 1cf: iflt 201
      // 1d2: ifeq 200
      // 1d5: sipush 31045
      // 1d8: ldc2_w 7857814410473657985
      // 1db: lload 5
      // 1dd: lxor
      // 1de: invokestatic rip/breeze/client/Util137.buildString_4 (IJ)Ljava/lang/String;
      // 1e1: iload 21
      // 1e3: invokevirtual java/lang/String.indexOf (I)I
      // 1e6: iload 2
      // 1e7: ifle 201
      // 1ea: bipush -1
      // 1eb: if_icmple 200
      // 1ee: bipush 1
      // 1ef: istore 19
      // 1f1: bipush 1
      // 1f2: istore 17
      // 1f4: bipush 0
      // 1f5: istore 18
      // 1f7: aload 14
      // 1f9: iload 2
      // 1fa: ifle 208
      // 1fd: ifnull 203
      // 200: bipush 0
      // 201: istore 13
      // 203: iinc 20 1
      // 206: aload 14
      // 208: ifnull 0b4
      // 20b: iload 13
      // 20d: iload 3
      // 20e: ifle 0c5
      // 211: iload 0
      // 212: iflt 230
      // 215: ifne 22f
      // 218: aload 4
      // 21a: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 21d: aload 1
      // 21e: aload 4
      // 220: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 223: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 226: lload 9
      // 228: dup2_x1
      // 229: pop2
      // 22a: invokevirtual rip/breeze/client/StringBuilderUtil.update_4 (Ljava/lang/String;JI)V
      // 22d: bipush 0
      // 22e: ireturn
      // 22f: bipush 1
      // 230: ireturn
   }

   private static boolean checkCondition_3(String param0, Util112 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/Util137.39288082250766L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 101148959712605
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 16
      // 00f: lushr
      // 010: lstore 4
      // 012: dup2
      // 013: bipush 48
      // 015: lshl
      // 016: bipush 48
      // 018: lushr
      // 019: l2i
      // 01a: istore 6
      // 01c: pop2
      // 01d: dup2
      // 01e: ldc2_w 93656393640348
      // 021: lxor
      // 022: lstore 7
      // 024: pop2
      // 025: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 028: bipush 1
      // 029: istore 9
      // 02b: astore 10
      // 02d: aload 0
      // 02e: sipush 25981
      // 031: ldc2_w 3850607628192845833
      // 034: lload 2
      // 035: lxor
      // 036: invokestatic rip/breeze/client/Util137.buildString_4 (IJ)Ljava/lang/String;
      // 039: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 03c: ifne 042
      // 03f: bipush 0
      // 040: istore 9
      // 042: aload 0
      // 043: bipush 2
      // 044: aload 0
      // 045: invokevirtual java/lang/String.length ()I
      // 048: bipush 2
      // 049: isub
      // 04a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 04d: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 050: astore 11
      // 052: aload 11
      // 054: invokevirtual java/lang/String.isEmpty ()Z
      // 057: lload 2
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 082
      // 05d: ifne 081
      // 060: aload 11
      // 062: bipush 0
      // 063: invokevirtual java/lang/String.charAt (I)C
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 082
      // 06c: bipush 46
      // 06e: if_icmpeq 081
      // 071: aload 11
      // 073: ldc "."
      // 075: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 078: lload 2
      // 079: lconst_0
      // 07a: lcmp
      // 07b: ifle 086
      // 07e: ifeq 084
      // 081: bipush 0
      // 082: istore 9
      // 084: iload 9
      // 086: lload 2
      // 087: lconst_0
      // 088: lcmp
      // 089: ifle 0a8
      // 08c: ifne 0a7
      // 08f: aload 1
      // 090: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 093: aload 0
      // 094: aload 1
      // 095: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 098: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 09b: lload 4
      // 09d: dup2_x1
      // 09e: pop2
      // 09f: iload 6
      // 0a1: i2c
      // 0a2: invokevirtual rip/breeze/client/StringBuilderUtil.update_8 (Ljava/lang/String;JIC)V
      // 0a5: bipush 0
      // 0a6: ireturn
      // 0a7: bipush 0
      // 0a8: istore 12
      // 0aa: bipush 0
      // 0ab: istore 13
      // 0ad: bipush 1
      // 0ae: istore 14
      // 0b0: bipush 1
      // 0b1: istore 15
      // 0b3: bipush 0
      // 0b4: istore 16
      // 0b6: iload 16
      // 0b8: aload 11
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: if_icmpge 23e
      // 0c0: aload 11
      // 0c2: iload 16
      // 0c4: invokevirtual java/lang/String.charAt (I)C
      // 0c7: istore 17
      // 0c9: iload 9
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 0db
      // 0d1: ifne 0d9
      // 0d4: aload 10
      // 0d6: ifnull 23e
      // 0d9: iload 17
      // 0db: lload 2
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: ifle 150
      // 0e1: bipush 34
      // 0e3: if_icmpne 14e
      // 0e6: iload 14
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: ifle 101
      // 0ee: ifne 0ff
      // 0f1: bipush 0
      // 0f2: istore 9
      // 0f4: aload 10
      // 0f6: lload 2
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 23b
      // 0fc: ifnull 236
      // 0ff: iload 12
      // 101: lload 2
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 134
      // 107: ifeq 132
      // 10a: aload 11
      // 10c: iload 16
      // 10e: bipush 1
      // 10f: isub
      // 110: invokevirtual java/lang/String.charAt (I)C
      // 113: lload 2
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 134
      // 119: bipush 92
      // 11b: if_icmpeq 132
      // 11e: bipush 0
      // 11f: istore 15
      // 121: bipush 1
      // 122: istore 13
      // 124: bipush 0
      // 125: istore 14
      // 127: aload 10
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 23b
      // 12f: ifnull 236
      // 132: iload 12
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 141
      // 13a: ifne 236
      // 13d: bipush 1
      // 13e: istore 12
      // 140: bipush 1
      // 141: istore 14
      // 143: aload 10
      // 145: lload 2
      // 146: lconst_0
      // 147: lcmp
      // 148: ifle 23b
      // 14b: ifnull 236
      // 14e: iload 12
      // 150: lload 2
      // 151: lconst_0
      // 152: lcmp
      // 153: ifle 166
      // 156: ifeq 164
      // 159: aload 10
      // 15b: lload 2
      // 15c: lconst_0
      // 15d: lcmp
      // 15e: iflt 23b
      // 161: ifnull 236
      // 164: iload 17
      // 166: lload 2
      // 167: lconst_0
      // 168: lcmp
      // 169: iflt 1aa
      // 16c: bipush 46
      // 16e: if_icmpne 1a5
      // 171: iload 13
      // 173: lload 2
      // 174: lconst_0
      // 175: lcmp
      // 176: iflt 1a4
      // 179: ifeq 190
      // 17c: bipush 1
      // 17d: istore 15
      // 17f: bipush 0
      // 180: istore 13
      // 182: bipush 1
      // 183: istore 14
      // 185: aload 10
      // 187: lload 2
      // 188: lconst_0
      // 189: lcmp
      // 18a: iflt 23b
      // 18d: ifnull 236
      // 190: aload 1
      // 191: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 194: aload 0
      // 195: aload 1
      // 196: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 199: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 19c: lload 7
      // 19e: dup2_x1
      // 19f: pop2
      // 1a0: invokevirtual rip/breeze/client/StringBuilderUtil.update_3 (Ljava/lang/String;JI)V
      // 1a3: bipush 0
      // 1a4: ireturn
      // 1a5: iload 17
      // 1a7: invokestatic java/lang/Character.isWhitespace (C)Z
      // 1aa: lload 2
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: ifle 1fc
      // 1b0: ifeq 1fa
      // 1b3: aload 11
      // 1b5: iload 16
      // 1b7: bipush 1
      // 1b8: isub
      // 1b9: invokevirtual java/lang/String.charAt (I)C
      // 1bc: istore 18
      // 1be: iload 18
      // 1c0: invokestatic java/lang/Character.isWhitespace (C)Z
      // 1c3: lload 2
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: ifle 1ce
      // 1c9: ifne 1ef
      // 1cc: iload 18
      // 1ce: bipush 46
      // 1d0: lload 2
      // 1d1: lconst_0
      // 1d2: lcmp
      // 1d3: ifle 1e3
      // 1d6: if_icmpeq 1ef
      // 1d9: iload 18
      // 1db: lload 2
      // 1dc: lconst_0
      // 1dd: lcmp
      // 1de: iflt 1ed
      // 1e1: bipush 34
      // 1e3: if_icmpeq 1ef
      // 1e6: bipush 0
      // 1e7: istore 15
      // 1e9: bipush 1
      // 1ea: istore 13
      // 1ec: bipush 1
      // 1ed: istore 14
      // 1ef: aload 10
      // 1f1: lload 2
      // 1f2: lconst_0
      // 1f3: lcmp
      // 1f4: ifle 23b
      // 1f7: ifnull 236
      // 1fa: iload 15
      // 1fc: lload 2
      // 1fd: lconst_0
      // 1fe: lcmp
      // 1ff: ifle 234
      // 202: ifeq 233
      // 205: sipush 11323
      // 208: ldc2_w 7085851000068135246
      // 20b: lload 2
      // 20c: lxor
      // 20d: invokestatic rip/breeze/client/Util137.buildString_4 (IJ)Ljava/lang/String;
      // 210: iload 17
      // 212: invokevirtual java/lang/String.indexOf (I)I
      // 215: lload 2
      // 216: lconst_0
      // 217: lcmp
      // 218: iflt 234
      // 21b: bipush -1
      // 21c: if_icmple 233
      // 21f: bipush 1
      // 220: istore 15
      // 222: bipush 1
      // 223: istore 13
      // 225: bipush 0
      // 226: istore 14
      // 228: aload 10
      // 22a: lload 2
      // 22b: lconst_0
      // 22c: lcmp
      // 22d: iflt 23b
      // 230: ifnull 236
      // 233: bipush 0
      // 234: istore 9
      // 236: iinc 16 1
      // 239: aload 10
      // 23b: ifnull 0b6
      // 23e: iload 9
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 0c7
      // 246: lload 2
      // 247: lconst_0
      // 248: lcmp
      // 249: ifle 268
      // 24c: ifne 267
      // 24f: aload 1
      // 250: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 253: aload 0
      // 254: aload 1
      // 255: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 258: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 25b: lload 4
      // 25d: dup2_x1
      // 25e: pop2
      // 25f: iload 6
      // 261: i2c
      // 262: invokevirtual rip/breeze/client/StringBuilderUtil.update_8 (Ljava/lang/String;JIC)V
      // 265: bipush 0
      // 266: ireturn
      // 267: bipush 1
      // 268: ireturn
   }

   static {
      long var0 = 126626919814923L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "l\u008fh\u008b\u001eáuM\u0099\u0080\u0099<ðI00\u009fµ?90ý\u001317\u0099Ý%1D\u0088\u0084'\u0016y$µªæ\u008adMn\u0012\u0006ÎÅê<á#9ø×ý|.;Ö[N]ÀésÚUíB¹\u0012Ä\u000b§×BkÍ\u009eK¼¬\u0002Ú%î?Ý÷\u0086*²Ò%[+1È\u001ez+û9A\u001aÖ\u0097)\u0081d\u001bB\u0010\u008dn\u001c\u0090Ö|Ë¢2Ó\u0090}ló\u000e4";
      int var7 = "l\u008fh\u008b\u001eáuM\u0099\u0080\u0099<ðI00\u009fµ?90ý\u001317\u0099Ý%1D\u0088\u0084'\u0016y$µªæ\u008adMn\u0012\u0006ÎÅê<á#9ø×ý|.;Ö[N]ÀésÚUíB¹\u0012Ä\u000b§×BkÍ\u009eK¼¬\u0002Ú%î?Ý÷\u0086*²Ò%[+1È\u001ez+û9A\u001aÖ\u0097)\u0081d\u001bB\u0010\u008dn\u001c\u0090Ö|Ë¢2Ó\u0090}ló\u000e4"
         .length();
      char var8 = 'p';
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
                     CONST_E = var4;
                     CONST_F = new String[4];
                     CONST_A = new Util137("", null);
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

                  var6 = "\u0010ê\u008fj«%í\u0091ó\nß±åÜ/ëp\u0095\u009b¯à ¤¸\u0015B\u001a\b¼©îãJü\u00adî<{ÿ¤ò8²<&¡C}£e1¹\u001el\u0012Ñ¨À\u008bhêý4|Ô¤«\u007f·>vè:\u008d6;8ðdü\u0017#ùÆX Ð[ÔÎ\u008d\u0084[0ü©\u0084T\u001e\u008b+\u001d\u0016\u0001\u0089Þl$\u000bß4A\u009f\u001cFÄñ´§Ô¯üë\u009e'±qÖE";
                  var7 = "\u0010ê\u008fj«%í\u0091ó\nß±åÜ/ëp\u0095\u009b¯à ¤¸\u0015B\u001a\b¼©îãJü\u00adî<{ÿ¤ò8²<&¡C}£e1¹\u001el\u0012Ñ¨À\u008bhêý4|Ô¤«\u007f·>vè:\u008d6;8ðdü\u0017#ùÆX Ð[ÔÎ\u008d\u0084[0ü©\u0084T\u001e\u008b+\u001d\u0016\u0001\u0089Þl$\u000bß4A\u009f\u001cFÄñ´§Ô¯üë\u009e'±qÖE"
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23648;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/cy", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
   }
}
