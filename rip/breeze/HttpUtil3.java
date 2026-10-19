package rip.breeze;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class HttpUtil3 {
   private static final ExecutorService CONST_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);
   private static final long eka_1;

   private HttpUtil3() {
   }

   public static String buildString(String var0, int var1) {
      long var2 = 82870179886434L;
      return "mojang-avatar:" + var0 + ":" + var1;
   }

   public static void processNullable(String var0, int var1) {
      long var2 = 51397358022873L;
      if (var0 != null && !var0.isEmpty()) {
         String var4 = buildString(var0, var1);
         if (BreezeContext.iRenderer_b.isFontLoaded(var4)) {
            CONST_A.execute(HttpUtil3::lambda$request_Inner1);
         }
      }
   }

   private static byte[] encryptKey(String param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/HttpUtil3.35159861562224L J
      // 003: ldc2_w 14908663199851
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 92062356890265
      // 00d: lxor
      // 00e: lstore 4
      // 010: dup2
      // 011: ldc2_w 2042303269980
      // 014: lxor
      // 015: dup2
      // 016: bipush 48
      // 018: lushr
      // 019: l2i
      // 01a: istore 6
      // 01c: dup2
      // 01d: bipush 16
      // 01f: lshl
      // 020: bipush 32
      // 022: lushr
      // 023: l2i
      // 024: istore 7
      // 026: dup2
      // 027: bipush 48
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 8
      // 030: pop2
      // 031: dup2
      // 032: ldc2_w 42883486946228
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 46691629499434
      // 03c: lxor
      // 03d: lstore 11
      // 03f: pop2
      // 040: invokestatic rip/breeze/RenderUtil1.decrypt ()[Ljava/lang/String;
      // 043: astore 13
      // 045: aload 0
      // 046: ldc "-"
      // 048: ldc ""
      // 04a: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 04d: astore 14
      // 04f: new java/lang/StringBuilder
      // 052: dup
      // 053: invokespecial java/lang/StringBuilder.<init> ()V
      // 056: sipush 31769
      // 059: ldc2_w 4342949758793572512
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: aload 14
      // 068: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 06e: invokestatic rip/breeze/HttpUtil3.buildString_2 (Ljava/lang/String;)Ljava/lang/String;
      // 071: astore 15
      // 073: aload 15
      // 075: ifnonnull 07a
      // 078: aconst_null
      // 079: areturn
      // 07a: new rip/breeze/client/Util139
      // 07d: dup
      // 07e: invokespecial rip/breeze/client/Util139.<init> ()V
      // 081: aload 15
      // 083: lload 4
      // 085: invokevirtual rip/breeze/client/Util139.getDataBuilder2 (Ljava/lang/String;J)Lrip/breeze/client/PlayerUtil8;
      // 088: lload 11
      // 08a: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 08d: astore 16
      // 08f: aload 16
      // 091: sipush 29667
      // 094: ldc2_w 5895276683419938645
      // 097: lload 2
      // 098: lxor
      // 099: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 0a1: lload 9
      // 0a3: invokevirtual rip/breeze/client/PlayerUtil8.getBreezeIterable (J)Lrip/breeze/client/BreezeIterable;
      // 0a6: bipush 0
      // 0a7: invokevirtual rip/breeze/client/BreezeIterable.getDataBuilder2 (I)Lrip/breeze/client/PlayerUtil8;
      // 0aa: lload 11
      // 0ac: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 0af: sipush 6186
      // 0b2: ldc2_w 2196318329574786202
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 0bf: iload 6
      // 0c1: i2c
      // 0c2: iload 7
      // 0c4: iload 8
      // 0c6: i2s
      // 0c7: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 0ca: astore 17
      // 0cc: new java/lang/String
      // 0cf: dup
      // 0d0: invokestatic java/util/Base64.getDecoder ()Ljava/util/Base64$Decoder;
      // 0d3: aload 17
      // 0d5: invokevirtual java/util/Base64$Decoder.decode (Ljava/lang/String;)[B
      // 0d8: sipush 15930
      // 0db: ldc2_w 231143530641203845
      // 0de: lload 2
      // 0df: lxor
      // 0e0: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 0e8: astore 18
      // 0ea: new rip/breeze/client/Util139
      // 0ed: dup
      // 0ee: invokespecial rip/breeze/client/Util139.<init> ()V
      // 0f1: aload 18
      // 0f3: lload 4
      // 0f5: invokevirtual rip/breeze/client/Util139.getDataBuilder2 (Ljava/lang/String;J)Lrip/breeze/client/PlayerUtil8;
      // 0f8: lload 11
      // 0fa: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 0fd: sipush 22812
      // 100: ldc2_w 4992510143156602286
      // 103: lload 2
      // 104: lxor
      // 105: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 10d: lload 11
      // 10f: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 112: astore 19
      // 114: aload 19
      // 116: sipush 16084
      // 119: ldc2_w 2023914765341991534
      // 11c: lload 2
      // 11d: lxor
      // 11e: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 126: ifne 12b
      // 129: aconst_null
      // 12a: areturn
      // 12b: aload 19
      // 12d: sipush 28190
      // 130: ldc2_w 1625974918968013478
      // 133: lload 2
      // 134: lxor
      // 135: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 13d: lload 11
      // 13f: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 142: sipush 31052
      // 145: ldc2_w 4549487939810682359
      // 148: lload 2
      // 149: lxor
      // 14a: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 152: iload 6
      // 154: i2c
      // 155: iload 7
      // 157: iload 8
      // 159: i2s
      // 15a: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 15d: astore 20
      // 15f: aload 20
      // 161: invokestatic rip/breeze/HttpUtil3.loadResource (Ljava/lang/String;)[B
      // 164: astore 21
      // 166: aload 21
      // 168: ifnonnull 16d
      // 16b: aconst_null
      // 16c: areturn
      // 16d: new java/io/ByteArrayInputStream
      // 170: dup
      // 171: aload 21
      // 173: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 176: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 179: astore 22
      // 17b: aload 22
      // 17d: ifnull 1a2
      // 180: aload 22
      // 182: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 185: bipush 48
      // 187: if_icmplt 1a2
      // 18a: goto 191
      // 18d: invokestatic rip/breeze/HttpUtil3.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 190: athrow
      // 191: aload 22
      // 193: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 196: bipush 16
      // 198: if_icmpge 1a4
      // 19b: goto 1a2
      // 19e: invokestatic rip/breeze/HttpUtil3.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: aconst_null
      // 1a3: areturn
      // 1a4: new java/awt/image/BufferedImage
      // 1a7: dup
      // 1a8: iload 1
      // 1a9: iload 1
      // 1aa: bipush 2
      // 1ab: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 1ae: astore 23
      // 1b0: aload 23
      // 1b2: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 1b5: astore 24
      // 1b7: aload 24
      // 1b9: bipush 2
      // 1ba: invokestatic java/awt/AlphaComposite.getInstance (I)Ljava/awt/AlphaComposite;
      // 1bd: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 1c0: bipush 0
      // 1c1: istore 25
      // 1c3: iload 25
      // 1c5: bipush 8
      // 1c7: if_icmpge 23b
      // 1ca: iload 25
      // 1cc: iload 1
      // 1cd: imul
      // 1ce: bipush 8
      // 1d0: idiv
      // 1d1: istore 26
      // 1d3: iload 25
      // 1d5: bipush 1
      // 1d6: iadd
      // 1d7: iload 1
      // 1d8: imul
      // 1d9: bipush 8
      // 1db: idiv
      // 1dc: iload 26
      // 1de: isub
      // 1df: istore 27
      // 1e1: bipush 0
      // 1e2: istore 28
      // 1e4: iload 28
      // 1e6: bipush 8
      // 1e8: if_icmpge 233
      // 1eb: iload 28
      // 1ed: iload 1
      // 1ee: imul
      // 1ef: bipush 8
      // 1f1: idiv
      // 1f2: istore 29
      // 1f4: iload 28
      // 1f6: bipush 1
      // 1f7: iadd
      // 1f8: iload 1
      // 1f9: imul
      // 1fa: bipush 8
      // 1fc: idiv
      // 1fd: iload 29
      // 1ff: isub
      // 200: istore 30
      // 202: aload 24
      // 204: new java/awt/Color
      // 207: dup
      // 208: aload 22
      // 20a: bipush 8
      // 20c: iload 28
      // 20e: iadd
      // 20f: bipush 8
      // 211: iload 25
      // 213: iadd
      // 214: invokevirtual java/awt/image/BufferedImage.getRGB (II)I
      // 217: bipush 1
      // 218: invokespecial java/awt/Color.<init> (IZ)V
      // 21b: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 21e: aload 24
      // 220: iload 29
      // 222: iload 26
      // 224: iload 30
      // 226: iload 27
      // 228: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 22b: iinc 28 1
      // 22e: aload 13
      // 230: ifnull 1e4
      // 233: iinc 25 1
      // 236: aload 13
      // 238: ifnull 1c3
      // 23b: aload 24
      // 23d: bipush 3
      // 23e: invokestatic java/awt/AlphaComposite.getInstance (I)Ljava/awt/AlphaComposite;
      // 241: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 244: bipush 0
      // 245: istore 25
      // 247: iload 25
      // 249: bipush 8
      // 24b: if_icmpge 2cb
      // 24e: iload 25
      // 250: iload 1
      // 251: imul
      // 252: bipush 8
      // 254: idiv
      // 255: istore 26
      // 257: iload 25
      // 259: bipush 1
      // 25a: iadd
      // 25b: iload 1
      // 25c: imul
      // 25d: bipush 8
      // 25f: idiv
      // 260: iload 26
      // 262: isub
      // 263: istore 27
      // 265: bipush 0
      // 266: istore 28
      // 268: iload 28
      // 26a: bipush 8
      // 26c: if_icmpge 2c3
      // 26f: aload 22
      // 271: bipush 40
      // 273: iload 28
      // 275: iadd
      // 276: bipush 8
      // 278: iload 25
      // 27a: iadd
      // 27b: invokevirtual java/awt/image/BufferedImage.getRGB (II)I
      // 27e: istore 29
      // 280: iload 29
      // 282: bipush 24
      // 284: iushr
      // 285: ifeq 2bb
      // 288: iload 28
      // 28a: iload 1
      // 28b: imul
      // 28c: bipush 8
      // 28e: idiv
      // 28f: istore 30
      // 291: iload 28
      // 293: bipush 1
      // 294: iadd
      // 295: iload 1
      // 296: imul
      // 297: bipush 8
      // 299: idiv
      // 29a: iload 30
      // 29c: isub
      // 29d: istore 31
      // 29f: aload 24
      // 2a1: new java/awt/Color
      // 2a4: dup
      // 2a5: iload 29
      // 2a7: bipush 1
      // 2a8: invokespecial java/awt/Color.<init> (IZ)V
      // 2ab: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 2ae: aload 24
      // 2b0: iload 30
      // 2b2: iload 26
      // 2b4: iload 31
      // 2b6: iload 27
      // 2b8: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 2bb: iinc 28 1
      // 2be: aload 13
      // 2c0: ifnull 268
      // 2c3: iinc 25 1
      // 2c6: aload 13
      // 2c8: ifnull 247
      // 2cb: aload 24
      // 2cd: invokevirtual java/awt/Graphics2D.dispose ()V
      // 2d0: new java/io/ByteArrayOutputStream
      // 2d3: dup
      // 2d4: iload 1
      // 2d5: iload 1
      // 2d6: imul
      // 2d7: bipush 2
      // 2d8: idiv
      // 2d9: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 2dc: astore 25
      // 2de: aload 23
      // 2e0: sipush 27758
      // 2e3: ldc2_w 8858974449723502800
      // 2e6: lload 2
      // 2e7: lxor
      // 2e8: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil3.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: aload 25
      // 2ef: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/OutputStream;)Z
      // 2f2: pop
      // 2f3: aload 25
      // 2f5: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 2f8: areturn
      // 2f9: astore 14
      // 2fb: aconst_null
      // 2fc: areturn
      // try (43 -> 65): 376 java/lang/Exception
      // try (66 -> 139): 376 java/lang/Exception
      // try (140 -> 168): 376 java/lang/Exception
      // try (177 -> 188): 189 java/lang/Exception
      // try (175 -> 181): 182 java/lang/Exception
      // try (169 -> 192): 376 java/lang/Exception
      // try (193 -> 375): 376 java/lang/Exception
   }

   private static String buildString_2(String var0) throws IOException {
      long var1 = 10008570021391L;
      byte[] var3 = loadResource(var0);

      try {
         if (var3 != null) {
            return new String(var3, "UTF-8");
         }
      } catch (IOException var4) {
         throw getException(var4);
      }

      return null;
   }

   private static byte[] loadResource(String var0) throws IOException {
      long var1 = 15053514818465L;
      String[] var10000 = RenderUtil1.decrypt();
      HttpURLConnection var3 = (HttpURLConnection)new URL(var0).openConnection();
      var3.setRequestProperty("User-Agent", "Mozilla/5.0");
      var3.setConnectTimeout(8000);
      var3.setReadTimeout(12000);
      String[] var4 = var10000;
      var3.connect();

      try {
         if (var3.getResponseCode() != 200) {
            return null;
         }

         InputStream var5 = var3.getInputStream();
         ByteArrayOutputStream var6 = new ByteArrayOutputStream((int)8314912116456849408L);
         byte[] var7 = new byte[16384];

         int var8;
         while ((var8 = var5.read(var7)) != -1) {
            var6.write(var7, 0, var8);
            if (var4 != null) {
               break;
            }
         }

         var5.close();
         return var6.toByteArray();
      } finally {
         var3.disconnect();
      }
   }

   private static void lambda$request_Inner1(String var0, String var1, int var2) {
      BreezeContext.iRenderer_b.loadFontBytes(var0, encryptKey(var1, var2));
   }

   private static Thread lambda$static_Inner0(Runnable var0) {
      long var1 = 39281665742280L;
      Thread var3 = new Thread(var0, "MojangAvatarLoader");
      var3.setDaemon(true);
      return var3;
   }

   static {
      long var0 = 63895385758217L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "=Û%±dßËïw\u008b9ÉñjkXYé÷å\r\u0004\u000eý<\u000fLÛ¼Èû>\u0018yzüñ¿º\u0011elõPêí&K\u009a 0L\u0096¨í¯\t(º'\u0001kûÎ°?²\u0081©\u0088>ÿa-vg$\u0010\u00926í¤±ú\"V&?º\u0092çÌª\u00adË@\u009f¢\u0010ãµfdÇÏ\u008e\u009c\u0019÷u\u001e¬èÊ@\u0010\u0094'\u00154EÅ¢l-0½\u0083\u009aÔÓÙ ¼Mq\u0096Ö½q¼véJ\u0086l`\u00ad\niÂ\u0002\u0091ÞÙ$ÌÙ\u0000ÑÝ\u0007ö»S \u009eh<ùK\u0014\\F!Æ\u0081j(´\u001e\u000bi¤\u008f\u0007Q¸\u0014\u0087¯\u007fÏK;ºKö -bÆ\f\u0004\u0097O\"\fùf\u001e\u000f¹\u0089=Èö\u0080B¨8ù\u0088$N·ë¤Ù2©\u0010Y$\u000e\u009aè+6ÆcKSz\u0005²\u000eâ\u0010×\\CÂr!ñ\u0093Ú¬Â\u0095=ÿ¥lhlù?Z.³¸®ú\u0096¤E\u0080<\u0019&\u001f±ç\u001f&\u0090GÐæ8v\\Î\u0086îÓ[¥¡àë\u00ad$«xzÕÄ\u001fýÛ\b7å>\u0010Ý±T\u0013àGn\u0091¥\u008d~ððDÛÐB\b\u000f\u0003é\u001cµ\u00930\u008b¾\u0083\u008c\u009dc\u0084&ÝW\u0005ø`D*\u001b¥ïè%ñ\u009aK\u000fî]\u0014\u0010DéÓw\u0001¡\u0099ì\u008a°\u0091\u0016º£V\b";
      int var7 = "=Û%±dßËïw\u008b9ÉñjkXYé÷å\r\u0004\u000eý<\u000fLÛ¼Èû>\u0018yzüñ¿º\u0011elõPêí&K\u009a 0L\u0096¨í¯\t(º'\u0001kûÎ°?²\u0081©\u0088>ÿa-vg$\u0010\u00926í¤±ú\"V&?º\u0092çÌª\u00adË@\u009f¢\u0010ãµfdÇÏ\u008e\u009c\u0019÷u\u001e¬èÊ@\u0010\u0094'\u00154EÅ¢l-0½\u0083\u009aÔÓÙ ¼Mq\u0096Ö½q¼véJ\u0086l`\u00ad\niÂ\u0002\u0091ÞÙ$ÌÙ\u0000ÑÝ\u0007ö»S \u009eh<ùK\u0014\\F!Æ\u0081j(´\u001e\u000bi¤\u008f\u0007Q¸\u0014\u0087¯\u007fÏK;ºKö -bÆ\f\u0004\u0097O\"\fùf\u001e\u000f¹\u0089=Èö\u0080B¨8ù\u0088$N·ë¤Ù2©\u0010Y$\u000e\u009aè+6ÆcKSz\u0005²\u000eâ\u0010×\\CÂr!ñ\u0093Ú¬Â\u0095=ÿ¥lhlù?Z.³¸®ú\u0096¤E\u0080<\u0019&\u001f±ç\u001f&\u0090GÐæ8v\\Î\u0086îÓ[¥¡àë\u00ad$«xzÕÄ\u001fýÛ\b7å>\u0010Ý±T\u0013àGn\u0091¥\u008d~ððDÛÐB\b\u000f\u0003é\u001cµ\u00930\u008b¾\u0083\u008c\u009dc\u0084&ÝW\u0005ø`D*\u001b¥ïè%ñ\u009aK\u000fî]\u0014\u0010DéÓw\u0001¡\u0099ì\u008a°\u0091\u0016º£V\b"
         .length();
      char var8 = ' ';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_C = var4;
                     CONST_D = new String[14];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 221763807085158027L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     8314912116456849408L = var30;
                     CONST_A = Executors.newCachedThreadPool(HttpUtil3::lambda$static_Inner0);
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "Ðj¸s4\u0094bò÷ég´\u0088®\u008e\u0010\u0010ß\u009a ´²\\Â\u0087\u0019_5Y0\u0001èÍ";
                  var7 = "Ðj¸s4\u0094bò÷ég´\u0088®\u008e\u0010\u0010ß\u009a ´²\\Â\u0087\u0019_5Y0\u0001èÍ".length();
                  var8 = 16;
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28584;
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
            throw new RuntimeException("rip/breeze/eQ", var10);
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
         CONST_D[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/eQ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
