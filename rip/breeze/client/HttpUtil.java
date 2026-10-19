package rip.breeze.client;

import java.io.IOException;
import java.util.Locale;
import rip.breeze.StringDecryptor;

final class HttpUtil extends Util64<Locale> {

   public Locale getLocale(long param1, RotationUtil9 param3) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/HttpUtil.60564972586431L J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 38069733519334
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 48
      // 0f: lushr
      // 10: l2i
      // 11: istore 4
      // 13: dup2
      // 14: bipush 16
      // 16: lshl
      // 17: bipush 48
      // 19: lushr
      // 1a: l2i
      // 1b: istore 5
      // 1d: dup2
      // 1e: bipush 32
      // 20: lshl
      // 21: bipush 32
      // 23: lushr
      // 24: l2i
      // 25: istore 6
      // 27: pop2
      // 28: dup2
      // 29: ldc2_w 77327693589030
      // 2c: lxor
      // 2d: lstore 7
      // 2f: dup2
      // 30: ldc2_w 92224730242071
      // 33: lxor
      // 34: lstore 9
      // 36: pop2
      // 37: aload 3
      // 38: lload 7
      // 3a: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 3d: getstatic rip/breeze/client/EnumType1.NULL Lrip/breeze/client/EnumType1;
      // 40: if_acmpne 4f
      // 43: aload 3
      // 44: lload 9
      // 46: invokevirtual rip/breeze/client/RotationUtil9.calculate_7 (J)V
      // 49: aconst_null
      // 4a: areturn
      // 4b: invokestatic rip/breeze/client/HttpUtil.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 4e: athrow
      // 4f: aload 3
      // 50: iload 4
      // 52: i2s
      // 53: iload 5
      // 55: i2s
      // 56: iload 6
      // 58: invokevirtual rip/breeze/client/RotationUtil9.buildString_2 (SSI)Ljava/lang/String;
      // 5b: astore 11
      // 5d: new java/util/StringTokenizer
      // 60: dup
      // 61: aload 11
      // 63: ldc "_"
      // 65: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 68: astore 12
      // 6a: aconst_null
      // 6b: astore 13
      // 6d: aconst_null
      // 6e: astore 14
      // 70: aconst_null
      // 71: astore 15
      // 73: aload 12
      // 75: lload 1
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle 83
      // 7b: invokevirtual java/util/StringTokenizer.hasMoreElements ()Z
      // 7e: ifeq 88
      // 81: aload 12
      // 83: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 86: astore 13
      // 88: aload 12
      // 8a: lload 1
      // 8b: lconst_0
      // 8c: lcmp
      // 8d: ifle 98
      // 90: invokevirtual java/util/StringTokenizer.hasMoreElements ()Z
      // 93: ifeq 9d
      // 96: aload 12
      // 98: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 9b: astore 14
      // 9d: aload 12
      // 9f: lload 1
      // a0: lconst_0
      // a1: lcmp
      // a2: ifle ad
      // a5: invokevirtual java/util/StringTokenizer.hasMoreElements ()Z
      // a8: ifeq b2
      // ab: aload 12
      // ad: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // b0: astore 15
      // b2: aload 14
      // b4: lload 1
      // b5: lconst_0
      // b6: lcmp
      // b7: iflt df
      // ba: ifnonnull dd
      // bd: aload 15
      // bf: lload 1
      // c0: lconst_0
      // c1: lcmp
      // c2: ifle df
      // c5: ifnonnull dd
      // c8: goto cf
      // cb: invokestatic rip/breeze/client/HttpUtil.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // ce: athrow
      // cf: new java/util/Locale
      // d2: dup
      // d3: aload 13
      // d5: invokespecial java/util/Locale.<init> (Ljava/lang/String;)V
      // d8: areturn
      // d9: invokestatic rip/breeze/client/HttpUtil.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // dc: athrow
      // dd: aload 15
      // df: ifnonnull f2
      // e2: new java/util/Locale
      // e5: dup
      // e6: aload 13
      // e8: aload 14
      // ea: invokespecial java/util/Locale.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // ed: areturn
      // ee: invokestatic rip/breeze/client/HttpUtil.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // f1: athrow
      // f2: new java/util/Locale
      // f5: dup
      // f6: aload 13
      // f8: aload 14
      // fa: aload 15
      // fc: invokespecial java/util/Locale.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // ff: areturn
      // try (37 -> 47): 47 java/io/IOException
      // try (99 -> 111): 112 java/io/IOException
      // try (105 -> 119): 119 java/io/IOException
      // try (121 -> 129): 129 java/io/IOException
   }

   public void processAll(int var1, int var2, Util135 var3, short var4, Locale var5) throws IOException {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ 60564972586431L;
      long var10001 = var6 ^ 90284866696630L;
      int var8 = (int)((var6 ^ 90284866696630L) >>> 56);
      int var9 = (int)((var6 ^ 90284866696630L) << 8 >>> 32);
      int var10 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var3;
            if (var5 == null) {
               var12 = null;
               break label17;
            }
         } catch (IOException var11) {
            throw getIOException(var11);
         }

         var12 = var5.toString();
      }

      var10000.getDataBuilder19_8(var12, (byte)var8, var9, var10);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
