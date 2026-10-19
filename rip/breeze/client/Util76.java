package rip.breeze.client;

import java.io.IOException;

class Util76 extends Util64<T> {
   final Util64 clientUtil2_a;

   Util76(Util64 var1) {
      this.clientUtil2_a = var1;
   }

   public void processAll(long param1, Util135 param3, Object param4) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 76076738342635
      // 05: lxor
      // 06: lstore 5
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 7
      // 0f: pop2
      // 10: invokestatic rip/breeze/client/Util64.getStringArray ()[Ljava/lang/String;
      // 13: astore 9
      // 15: aload 4
      // 17: ifnonnull 2d
      // 1a: aload 3
      // 1b: lload 5
      // 1d: invokevirtual rip/breeze/client/Util135.getDataBuilder19_9 (J)Lrip/breeze/client/Util135;
      // 20: pop
      // 21: aload 9
      // 23: ifnull 40
      // 26: goto 2d
      // 29: invokestatic rip/breeze/client/Util76.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/client/Util76.clientUtil2_a Lrip/breeze/client/Util64;
      // 31: lload 7
      // 33: aload 3
      // 34: aload 4
      // 36: invokevirtual rip/breeze/client/Util64.updateCallSite (JLrip/breeze/client/Util135;Ljava/lang/Object;)V
      // 39: goto 40
      // 3c: invokestatic rip/breeze/client/Util76.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 3f: athrow
      // 40: return
      // try (12 -> 20): 21 java/io/IOException
      // try (14 -> 29): 30 java/io/IOException
   }

   public Object getObject(RotationUtil9 var1, long var2) throws IOException {
      long var4 = var2 ^ 49605078528163L;
      long var6 = var2 ^ 62300294317714L;
      long var8 = var2 ^ 0L;

      try {
         if (var1.getEnum10Val(var4) == EnumType1.NULL) {
            var1.calculate_7(var6);
            return null;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      return this.clientUtil2_a.lookupByKey(var1, var8);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
