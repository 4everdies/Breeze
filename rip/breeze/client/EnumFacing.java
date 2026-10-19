package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class EnumFacing implements IBreezeInterface, IMarker3 {
   static final EnumFacing CONST_A;
   private static final Pattern CONST_B;
   private static final String[] CONST_C;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public boolean isValid(long var1, String var3) {
      return var3.startsWith("\"");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Object getObject(String var1, AtomicInteger var2, long var3, Util112 var5) {
      long var6 = var3 ^ 86336726936101L;
      long var8 = var3 ^ 64438626796945L;
      long var10001 = var3 ^ 54184182294855L;
      int var10 = (int)((var3 ^ 54184182294855L) >>> 32);
      int var11 = (int)((var3 ^ 54184182294855L) << 32 >>> 40);
      int var12 = (int)(var10001 << 56 >>> 56);
      var10001 = var3 ^ 88622662033979L;
      int var13 = (int)((var3 ^ 88622662033979L) >>> 32);
      int var14 = (int)((var3 ^ 88622662033979L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      String[] var10000 = Util28.values();
      int var16 = var2.incrementAndGet();
      int var17 = -1;
      int var18 = var2.get();
      String[] var19 = var10000;

      label50:
      while (true) {
         if (var18 < var1.length()) {
            var26 = var1.charAt(var18);
         } else {
            var26 = var17;
            if (var3 >= 0L) {
               break;
            }
         }

         while (true) {
            label46: {
               int var20 = var26;
               int var27 = var20;
               if (var3 >= 0L) {
                  if (var20 == 34) {
                     var27 = var1.charAt(var18 - 1);
                     if (var3 > 0L) {
                        if (var27 != 92) {
                           var26 = var18;
                           if (var3 < 0L) {
                              break label50;
                           }

                           var17 = var18;
                           if (var19 == null) {
                              break label46;
                           }

                           var27 = var2.incrementAndGet();
                        } else {
                           var27 = var2.incrementAndGet();
                        }
                     }
                  } else {
                     var27 = var2.incrementAndGet();
                  }
               }

               var18 = var27;
               if (var19 == null) {
                  break;
               }
            }

            var26 = var17;
            if (var3 >= 0L) {
               break label50;
            }
         }
      }

      if (var26 == -1) {
         StringBuilderUtil var24 = new StringBuilderUtil();
         var24.update_11(var5.dataBuilder23_a.getString_b(), var13, (short)var14, var15, var1.substring(var16 - 1), var5.atomicInteger_b.get());
         return var24;
      }

      String var23 = var1.substring(var16, var17);
      var1 = this.buildString(var6, var23);
      var1 = this.buildString_2(var1, var8);
      String var28 = var1;
      if (var3 > 0L) {
         if (var1 == null) {
            StringBuilderUtil var25 = new StringBuilderUtil();
            var25.update_9(var10, var5.dataBuilder23_a.getString_b(), var23, var11, (byte)var12, var5.atomicInteger_b.get());
            return var25;
         }

         var28 = var1;
      }

      return var28;
   }

   String buildString(long param1, String param3) {
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
      // 00: getstatic rip/breeze/client/EnumFacing.92300271440721L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 09: getstatic rip/breeze/client/EnumFacing.CONST_B Ljava/util/regex/Pattern;
      // 0c: aload 3
      // 0d: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 10: astore 4
      // 12: astore 5
      // 14: aload 4
      // 16: invokevirtual java/util/regex/Matcher.find ()Z
      // 19: ifeq 40
      // 1c: aload 3
      // 1d: aload 4
      // 1f: invokevirtual java/util/regex/Matcher.group ()Ljava/lang/String;
      // 22: new java/lang/String
      // 25: dup
      // 26: aload 4
      // 28: bipush 1
      // 29: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 2c: bipush 16
      // 2e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 31: invokestatic java/lang/Character.toChars (I)[C
      // 34: invokespecial java/lang/String.<init> ([C)V
      // 37: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 3a: astore 3
      // 3b: aload 5
      // 3d: ifnull 14
      // 40: aload 3
      // 41: lload 1
      // 42: lconst_0
      // 43: lcmp
      // 44: iflt 3a
      // 47: areturn
   }

   String buildString_2(String param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/EnumFacing.92300271440721L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 009: bipush 0
      // 00a: istore 4
      // 00c: astore 5
      // 00e: iload 4
      // 010: aload 1
      // 011: invokevirtual java/lang/String.length ()I
      // 014: bipush 1
      // 015: isub
      // 016: if_icmpge 0bf
      // 019: aload 1
      // 01a: iload 4
      // 01c: invokevirtual java/lang/String.charAt (I)C
      // 01f: istore 6
      // 021: aload 1
      // 022: iload 4
      // 024: bipush 1
      // 025: iadd
      // 026: invokevirtual java/lang/String.charAt (I)C
      // 029: istore 7
      // 02b: iload 6
      // 02d: bipush 92
      // 02f: lload 2
      // 030: lconst_0
      // 031: lcmp
      // 032: iflt 057
      // 035: if_icmpne 053
      // 038: iload 7
      // 03a: bipush 92
      // 03c: lload 2
      // 03d: lconst_0
      // 03e: lcmp
      // 03f: ifle 057
      // 042: if_icmpne 053
      // 045: iinc 4 1
      // 048: aload 5
      // 04a: lload 2
      // 04b: lconst_0
      // 04c: lcmp
      // 04d: ifle 0bc
      // 050: ifnull 0b7
      // 053: iload 6
      // 055: bipush 92
      // 057: lload 2
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 064
      // 05d: if_icmpne 0b7
      // 060: iload 7
      // 062: bipush 98
      // 064: lload 2
      // 065: lconst_0
      // 066: lcmp
      // 067: ifle 071
      // 06a: if_icmpeq 0b7
      // 06d: iload 7
      // 06f: bipush 102
      // 071: lload 2
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07e
      // 077: if_icmpeq 0b7
      // 07a: iload 7
      // 07c: bipush 110
      // 07e: lload 2
      // 07f: lconst_0
      // 080: lcmp
      // 081: iflt 08b
      // 084: if_icmpeq 0b7
      // 087: iload 7
      // 089: bipush 116
      // 08b: lload 2
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 098
      // 091: if_icmpeq 0b7
      // 094: iload 7
      // 096: bipush 114
      // 098: lload 2
      // 099: lconst_0
      // 09a: lcmp
      // 09b: ifle 0a5
      // 09e: if_icmpeq 0b7
      // 0a1: iload 7
      // 0a3: bipush 34
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0b2
      // 0ab: if_icmpeq 0b7
      // 0ae: iload 7
      // 0b0: bipush 92
      // 0b2: if_icmpeq 0b7
      // 0b5: aconst_null
      // 0b6: areturn
      // 0b7: iinc 4 1
      // 0ba: aload 5
      // 0bc: ifnull 00e
      // 0bf: aload 1
      // 0c0: sipush 12338
      // 0c3: ldc2_w 5767614504279476448
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 0cb: ldc "\n"
      // 0cd: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0d0: sipush 8480
      // 0d3: ldc2_w 6821305315292027382
      // 0d6: lload 2
      // 0d7: lxor
      // 0d8: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 0db: ldc "\""
      // 0dd: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0e0: sipush 23735
      // 0e3: ldc2_w 561845697736467563
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 0eb: ldc "\t"
      // 0ed: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0f0: sipush 27640
      // 0f3: ldc2_w 5448505618534355745
      // 0f6: lload 2
      // 0f7: lxor
      // 0f8: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 0fb: ldc "\r"
      // 0fd: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 100: sipush 17630
      // 103: ldc2_w 427047007514295306
      // 106: lload 2
      // 107: lxor
      // 108: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 10b: ldc "\\"
      // 10d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 110: sipush 11117
      // 113: ldc2_w 7859402209250612152
      // 116: lload 2
      // 117: lxor
      // 118: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 11b: ldc "/"
      // 11d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 120: sipush 2074
      // 123: ldc2_w 5108923541425107137
      // 126: lload 2
      // 127: lxor
      // 128: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 12b: ldc "\b"
      // 12d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 130: sipush 32595
      // 133: ldc2_w 1794362030617053060
      // 136: lload 2
      // 137: lxor
      // 138: invokestatic rip/breeze/client/EnumFacing.buildString_4 (IJ)Ljava/lang/String;
      // 13b: ldc "\f"
      // 13d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 140: lload 2
      // 141: lconst_0
      // 142: lcmp
      // 143: ifle 01a
      // 146: areturn
   }

   private EnumFacing() {
   }

   @Override
   public String toString() {
      long var1 = 10162820885362L;
      return buildString_4(20666, 2328403463063228219L ^ var1);
   }

   static {
      long var0 = 135409570582315L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[17];
      int var5 = 0;
      String var6 = "\u0097%\t\u0005O\u0089\u0019\u0005·äZû¡«üð\u0010\u008c)ýVà×¸´ÁÙ±[\u000e\u0019\u0096Å\u0010Ç!\fwù\u0089Ù\"ðr\u001dEO}m$\u0010*\u0085°9\u008b±;HÒ}#Ö\u0017\u009d ;\u0010\u008c[\u0097N\u0019\u0093ö\u009a.ùDC\u0017gîß\u0018$\u00038\u0014\u0001ÝV\u0088Îò ÌtF<ûýt\u0017æVü\u0019Ø\u0010F\u0081\\\n/XôH2B\u008cL¢÷Hh\u0010àBçeh×\u0096á\u0095¼òTÄP_Ï\u0010px\u0018ñÐL4\u0086%Ó=öH\u008c:Ì\u0010aÊi\u0096±°\u000eFíü\u0017.7ü¥\u0097\u0010a\u0096\u0088è,\u009cKW\u009a¼ë\u0089\u0093\u0099îß\u0010v0\u009dÏuVX\u001a\u0006?Ès\u00898-\u008c\u0010îÏE\u008béõ¼îËvÚ\u009fÐnöà\u0010¡Ä\u000b\u0000ítkâ\u0084M\ne\u0084w6e\u0010òÁÚ{\u008dXw\u009d\u0019\u001a¢GX\u0007\u0097\u009e";
      int var7 = "\u0097%\t\u0005O\u0089\u0019\u0005·äZû¡«üð\u0010\u008c)ýVà×¸´ÁÙ±[\u000e\u0019\u0096Å\u0010Ç!\fwù\u0089Ù\"ðr\u001dEO}m$\u0010*\u0085°9\u008b±;HÒ}#Ö\u0017\u009d ;\u0010\u008c[\u0097N\u0019\u0093ö\u009a.ùDC\u0017gîß\u0018$\u00038\u0014\u0001ÝV\u0088Îò ÌtF<ûýt\u0017æVü\u0019Ø\u0010F\u0081\\\n/XôH2B\u008cL¢÷Hh\u0010àBçeh×\u0096á\u0095¼òTÄP_Ï\u0010px\u0018ñÐL4\u0086%Ó=öH\u008c:Ì\u0010aÊi\u0096±°\u000eFíü\u0017.7ü¥\u0097\u0010a\u0096\u0088è,\u009cKW\u009a¼ë\u0089\u0093\u0099îß\u0010v0\u009dÏuVX\u001a\u0006?Ès\u00898-\u008c\u0010îÏE\u008béõ¼îËvÚ\u009fÐnöà\u0010¡Ä\u000b\u0000ítkâ\u0084M\ne\u0084w6e\u0010òÁÚ{\u008dXw\u009d\u0019\u001a¢GX\u0007\u0097\u009e"
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
                     CONST_E = var4;
                     CONST_F = new String[17];
                     CONST_A = new EnumFacing();
                     CONST_B = Pattern.compile(buildString_4(23380, 3457193270370033817L ^ var0));
                     CONST_C = new String[93];
                     CONST_C[8] = buildString_4(2293, 1015634830744531774L ^ var0);
                     CONST_C[9] = buildString_4(30802, 2833176909727581072L ^ var0);
                     CONST_C[10] = buildString_4(15788, 2723861583974205039L ^ var0);
                     CONST_C[12] = buildString_4(10920, 4288608328359285094L ^ var0);
                     CONST_C[13] = buildString_4(14323, 1086569833396997183L ^ var0);
                     CONST_C[34] = buildString_4(26099, 5546295670068928051L ^ var0);
                     CONST_C[92] = buildString_4(4132, 6514685503240547309L ^ var0);
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

                  var6 = "\u001d\u00026õ\u0090\u0097é-BCC\u0082\u0084#\u0094-\u0010\fo\u0092\u0092À8$RþîÛÕxÓ<h";
                  var7 = "\u001d\u00026õ\u0090\u0097é-BCC\u0082\u0084#\u0094-\u0010\fo\u0092\u0092À8$RþîÛÕxÓ<h".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13539;
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
            throw new RuntimeException("rip/breeze/client/cJ", var10);
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
