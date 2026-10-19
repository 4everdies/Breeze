package rip.breeze;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

public class HttpUtil2 {
   private static final String CONST_A;
   private static LicenseState[] arr_b;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   public static File getFile() {
      long var0 = 80199751365964L;
      StringBuilder var10002 = new StringBuilder().append(buildString()).append(File.separator);
      short var10003 = 17933;
      long var10004 = 2941880060780170422L ^ var0;
      return new File(var10002.append("breeze").toString());
   }

   private static String buildString() {
      long var0 = 105922799578357L;
      short var10000 = 3474;
      long var10001 = 6043947688043142803L ^ var0;
      String var2 = System.getProperty("os.name").toLowerCase();
      short var7 = 2668;
      long var10002 = 8068205093641869673L ^ var0;
      String var3;
      if (var2.contains("win")) {
         var10000 = 16355;
         var10001 = 245053464016612586L ^ var0;
         var3 = System.getenv("mac");
         if (var3 == null) {
            StringBuilder var5 = new StringBuilder();
            short var9 = 26406;
            var10002 = 6937977981146706977L ^ var0;
            StringBuilder var6 = var5.append(System.getProperty("user.home"));
            short var10 = 19434;
            var10002 = 5664257738398570729L ^ var0;
            var3 = var6.append("/.config").toString();
         }
      } else if (var2.contains("mac")) {
         var3 = System.getProperty("user.home") + "/Library/Application Support";
      } else {
         var3 = System.getProperty("user.home") + "/.config";
      }

      return var3;
   }

   public static File getFile_2(String... var0) {
      return Paths.get(CONST_A, var0).toFile();
   }

   public static String buildString_2(File var0) {
      long var1 = 7798430115422L;
      String[] var3 = RenderUtil1.decrypt();

      try {
         BufferedReader var4 = new BufferedReader(new InputStreamReader(Files.newInputStream(var0.toPath()), StandardCharsets.UTF_8));
         StringBuilder var5 = new StringBuilder();

         String var6;
         while ((var6 = var4.readLine()) != null) {
            try {
               if (var5.length() > 0) {
                  var5.append("\n");
               }
            } catch (IOException var7) {
               throw getThrowable(var7);
            }

            var5.append(var6);
            if (var3 != null) {
               break;
            }
         }

         var4.close();
         return var5.toString();
      } catch (IOException var8) {
         return null;
      }
   }

   public static boolean checkCondition(File var0) {
      long var1 = 116839106453110L;
      String[] var3 = RenderUtil1.decrypt();
      if (!var0.isDirectory()) {
         return var0.delete();
      }

      Stack var4 = new Stack();
      boolean var5 = true;
      var4.push(var0);

      while (!var4.isEmpty()) {
         File var6 = (File)var4.pop();
         File[] var7 = var6.listFiles();
         if (var7 == null) {
            var5 &= var6.delete();
            if (var3 == null) {
               continue;
            }
         }

         File[] var8 = var7;
         int var9 = var8.length;
         int var10 = 0;

         while (true) {
            if (var10 < var9) {
               label32: {
                  File var11 = var8[var10];
                  if (var11.isDirectory()) {
                     var4.push(var11);
                     if (var3 == null) {
                        break label32;
                     }
                  }

                  var5 &= var11.delete();
               }

               var10++;
               if (var3 == null) {
                  continue;
               }
            }

            if (var3 != null) {
               return var5;
            }
            break;
         }
      }

      return var5;
   }

   public static boolean checkCondition_2(String var0, String var1) {
      long var2 = 12482358824006L;
      File var4 = new File(var0);
      if (!var4.exists()) {
         return false;
      }

      File var5 = new File(var1);
      return var5.exists() ? false : var4.renameTo(var5);
   }

   public static boolean isValid(File var0, String var1) {
      long var2 = 64661352911108L;

      try {
         processAll(var0);
         processAll_2(var0);
         var0.delete();
         processAll_2(var0);
         BufferedWriter var4 = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream(var0), Charset.forName("UTF-8"))
         );
         var4.append(var1);
         var4.close();
         return true;
      } catch (IOException var5) {
         return false;
      }
   }

   public static void processAll(String var0) {
      new File(var0).delete();
   }

   public static String[] buildString_3(File var0, String var1) {
      long var2 = 48991864001841L;
      String[] var10000 = RenderUtil1.decrypt();
      File[] var4 = var0.listFiles();
      String[] var5 = var10000;
      if (var4 == null) {
         return new String[0];
      }

      ArrayList var6 = new ArrayList();

      for (File var10 : var4) {
         try {
            if (var10.getName().substring(var10.getName().lastIndexOf(".")).equalsIgnoreCase(var1)) {
               var6.add(var10.getName());
            }
         } catch (Exception var12) {
         }

         if (var5 != null) {
            break;
         }
      }

      return var6.toArray(new String[var6.size()]);
   }

   public static void update(String var0, String var1) {
      File var2 = new File(var0);
      File var3 = new File(var1);

      try {
         processAll_3(var2, var3);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static String buildString_4(URL var0) {
      long var1 = 125015833096305L;
      byte[] var3 = downloadFile(var0);
      return var3 == null ? null : new String(var3, Charset.forName("UTF-8"));
   }

   public static byte[] downloadFile(URL var0) {
      long var1 = 122353138703897L;

      try {
         TrustManager[] var3 = new TrustManager[]{new Util16()};
         SSLContext var4 = SSLContext.getInstance("SSL");
         var4.init(null, var3, new SecureRandom());
         HttpsURLConnection.setDefaultSSLSocketFactory(var4.getSocketFactory());
         HostnameVerifier var5 = HttpUtil2::lambda$downloadFile_Inner0;
         HttpsURLConnection.setDefaultHostnameVerifier(var5);
         HttpsURLConnection var6 = (HttpsURLConnection)var0.openConnection();
         var6.setRequestProperty("User-Agent", "Mozilla/5.0");
         var6.connect();
         BufferedInputStream var7 = new BufferedInputStream(var6.getInputStream());
         byte[] var8 = readStream(var7);
         var7.close();
         return var8;
      } catch (Exception var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public static byte[] readStream(InputStream var0) throws IOException {
      long var1 = 61658722690233L;
      String[] var10000 = RenderUtil1.decrypt();
      byte[] var3 = new byte[8192];
      String[] var4 = var10000;
      ByteArrayOutputStream var5 = new ByteArrayOutputStream();

      int var6;
      while ((var6 = var0.read(var3)) != -1) {
         var5.write(var3, 0, var6);
         if (var4 != null) {
            break;
         }
      }

      return var5.toByteArray();
   }

   public static void processAll(File param0) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/HttpUtil2.95040925612764L J
      // 03: ldc2_w 15810034707993
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokevirtual java/io/File.getCanonicalFile ()Ljava/io/File;
      // 0c: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0f: astore 3
      // 10: aload 3
      // 11: ifnull 5a
      // 14: aload 3
      // 15: invokevirtual java/io/File.mkdirs ()Z
      // 18: ifne 5a
      // 1b: goto 22
      // 1e: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 3
      // 23: invokevirtual java/io/File.isDirectory ()Z
      // 26: ifne 5a
      // 29: goto 30
      // 2c: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: new java/io/IOException
      // 33: dup
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: sipush 6251
      // 3e: ldc2_w 7423922479800644447
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic s (IJ)Ljava/lang/String; bsm=rip/breeze/HttpUtil2.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b: aload 0
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 55: athrow
      // 56: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: return
      // try (8 -> 13): 14 java/io/IOException
      // try (10 -> 19): 20 java/io/IOException
      // try (16 -> 38): 38 java/io/IOException
   }

   public static void processAll_2(File var0) throws IOException {
      long var1 = 109338456605764L;

      try {
         if (!var0.exists()) {
            new FileOutputStream(var0).close();
         }
      } catch (IOException var4) {
         throw getThrowable(var4);
      }

      try {
         if (!var0.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to set the last modification time for" + var0);
         }
      } catch (IOException var3) {
         throw getThrowable(var3);
      }
   }

   public static void processAll_3(File param0, File param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/HttpUtil2.95040925612764L J
      // 003: ldc2_w 58206068811763
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/RenderUtil1.decrypt ()[Ljava/lang/String;
      // 00b: astore 4
      // 00d: aload 0
      // 00e: invokevirtual java/io/File.isDirectory ()Z
      // 011: ifeq 072
      // 014: aload 1
      // 015: invokevirtual java/io/File.exists ()Z
      // 018: ifne 02e
      // 01b: goto 022
      // 01e: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: aload 1
      // 023: invokevirtual java/io/File.mkdir ()Z
      // 026: pop
      // 027: goto 02e
      // 02a: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual java/io/File.list ()[Ljava/lang/String;
      // 032: astore 5
      // 034: aload 5
      // 036: astore 6
      // 038: aload 6
      // 03a: arraylength
      // 03b: istore 7
      // 03d: bipush 0
      // 03e: istore 8
      // 040: iload 8
      // 042: iload 7
      // 044: if_icmpge 06d
      // 047: aload 6
      // 049: iload 8
      // 04b: aaload
      // 04c: astore 9
      // 04e: new java/io/File
      // 051: dup
      // 052: aload 0
      // 053: aload 9
      // 055: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 058: new java/io/File
      // 05b: dup
      // 05c: aload 1
      // 05d: aload 9
      // 05f: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 062: invokestatic rip/breeze/HttpUtil2.processAll_3 (Ljava/io/File;Ljava/io/File;)V
      // 065: iinc 8 1
      // 068: aload 4
      // 06a: ifnull 040
      // 06d: aload 4
      // 06f: ifnull 18b
      // 072: new java/io/FileInputStream
      // 075: dup
      // 076: aload 0
      // 077: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 07a: astore 5
      // 07c: aconst_null
      // 07d: astore 6
      // 07f: new java/io/FileOutputStream
      // 082: dup
      // 083: aload 1
      // 084: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 087: astore 7
      // 089: aconst_null
      // 08a: astore 8
      // 08c: sipush 1024
      // 08f: newarray 8
      // 091: astore 9
      // 093: aload 5
      // 095: aload 9
      // 097: invokevirtual java/io/InputStream.read ([B)I
      // 09a: dup
      // 09b: istore 10
      // 09d: ifle 0af
      // 0a0: aload 7
      // 0a2: aload 9
      // 0a4: bipush 0
      // 0a5: iload 10
      // 0a7: invokevirtual java/io/OutputStream.write ([BII)V
      // 0aa: aload 4
      // 0ac: ifnull 093
      // 0af: aload 7
      // 0b1: ifnull 11d
      // 0b4: aload 8
      // 0b6: ifnull 0d4
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 7
      // 0c2: invokevirtual java/io/OutputStream.close ()V
      // 0c5: goto 11d
      // 0c8: astore 9
      // 0ca: aload 8
      // 0cc: aload 9
      // 0ce: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0d1: goto 11d
      // 0d4: aload 7
      // 0d6: invokevirtual java/io/OutputStream.close ()V
      // 0d9: goto 11d
      // 0dc: astore 9
      // 0de: aload 9
      // 0e0: astore 8
      // 0e2: aload 9
      // 0e4: athrow
      // 0e5: astore 11
      // 0e7: aload 7
      // 0e9: ifnull 11a
      // 0ec: aload 8
      // 0ee: ifnull 10e
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 7
      // 0fa: invokevirtual java/io/OutputStream.close ()V
      // 0fd: goto 11a
      // 100: astore 12
      // 102: aload 8
      // 104: aload 12
      // 106: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 109: aload 4
      // 10b: ifnull 11a
      // 10e: aload 7
      // 110: invokevirtual java/io/OutputStream.close ()V
      // 113: goto 11a
      // 116: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 11
      // 11c: athrow
      // 11d: aload 5
      // 11f: ifnull 18b
      // 122: aload 6
      // 124: ifnull 142
      // 127: goto 12e
      // 12a: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 5
      // 130: invokevirtual java/io/InputStream.close ()V
      // 133: goto 18b
      // 136: astore 7
      // 138: aload 6
      // 13a: aload 7
      // 13c: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 13f: goto 18b
      // 142: aload 5
      // 144: invokevirtual java/io/InputStream.close ()V
      // 147: goto 18b
      // 14a: astore 7
      // 14c: aload 7
      // 14e: astore 6
      // 150: aload 7
      // 152: athrow
      // 153: astore 13
      // 155: aload 5
      // 157: ifnull 188
      // 15a: aload 6
      // 15c: ifnull 17c
      // 15f: goto 166
      // 162: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 5
      // 168: invokevirtual java/io/InputStream.close ()V
      // 16b: goto 188
      // 16e: astore 14
      // 170: aload 6
      // 172: aload 14
      // 174: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 177: aload 4
      // 179: ifnull 188
      // 17c: aload 5
      // 17e: invokevirtual java/io/InputStream.close ()V
      // 181: goto 188
      // 184: invokestatic rip/breeze/HttpUtil2.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 187: athrow
      // 188: aload 13
      // 18a: athrow
      // 18b: return
      // try (9 -> 18): 19 java/lang/Throwable
      // try (6 -> 12): 13 java/lang/Throwable
      // try (91 -> 93): 94 java/lang/Throwable
      // try (68 -> 84): 102 java/lang/Throwable
      // try (68 -> 84): 107 null
      // try (84 -> 88): 89 java/lang/Throwable
      // try (115 -> 117): 118 java/lang/Throwable
      // try (102 -> 108): 107 null
      // try (119 -> 126): 127 java/lang/Throwable
      // try (108 -> 112): 113 java/lang/Throwable
      // try (138 -> 140): 141 java/lang/Throwable
      // try (61 -> 131): 149 java/lang/Throwable
      // try (61 -> 131): 154 null
      // try (131 -> 135): 136 java/lang/Throwable
      // try (162 -> 164): 165 java/lang/Throwable
      // try (149 -> 155): 154 null
      // try (155 -> 159): 160 java/lang/Throwable
      // try (166 -> 173): 174 java/lang/Throwable
   }

   private static boolean lambda$downloadFile_Inner0(String var0, SSLSession var1) {
      return true;
   }

   static {
      LicenseState[] var10000 = new LicenseState[3];
      long var0 = 120014595510094L;
      initialize(var10000);
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[17];
      int var5 = 0;
      String var6 = "þÐs\t\u0084ê\f\u0086\u000b°g\u0018¢¶¿\u0098P\u008a\u0019\u00867_q_¦T¡~ø:\u0012ÍsT+\u0097\u008eA\u0088ÀrTºØKý\u0093\u0015ÉåÂ\\Õã\u0084lÙ¼~ñ\u0088\t9ü\u001c*!>¨»\u008aNC\u008aiX´\u0094º\nºvì¦u\u0098-\u0090\u0018.\"Ùç\u009fuÙj C\u008c:Â\u0004*ß<0ë±\\nìt \u00ad>\u001brÞÀ.x´×j\u0089w\u008e\u001d° \u0006\u00ad\u00adFK²z×_³ºùx+¨¡à\nå\u009b¤l1\u0094(\u009coÿõ:ÁË\u0010§À\u0006Y»;azdç)\u0082¨rZhPø\fG¾d\u008b°^\u0094ø·wµF\u0085Î\nÙw/ý¾\u00953»\u0004\u0007*5\u008c×ºë\u0091\u0000\u000f/\u0014Mä¸F}ÀÎ\u0006-\u0017Õ\u000f\u008fI\u0097é\u009a\u0090\u009cB0\u0014ÖÓ6¶º\u0012ÛIZx]ô\u0081eÞÍ¢\u0093\u0006f(ÕA\u0080a9Üý\u0003k³\u0005yÞKPWt\u00ad\b\u0010çë¥vuÕEôÖÌ÷þ¨¤\u0007s.i\u001fa\u0010ËpK\u0081S;`í/\u0086k[ÿr*`\u0010ô\u009b÷@É:ÞªXYjù\u0088\u008f\u0006\u0018 º:Ä\u000b¸x-Ä\nìZü%Aðé^ÙÇmk?\u0006\u001céE¨©d\u0017ÐÚ\u0018\u0089ì\u0093\u0001\u009c\bl\u0017Ö&\u0096m%\u008aK¢V/m\u0098I³=z\u0010¥2Ø\u0085Vò\u0092ÑÎ%¤õ8\u001c\u0000\u0018\u0010êßÁSPÿÈ\u0010Ð+eÅ\n\u008e2\u001a\u0010ÒS¨2\u0017ýJ\u0096ù×Ì\u0091Æÿ_K\u0010\u0007\u008aö0\u00941\u0092\u001a²\u0006vl \u0097Ù\u0097";
      int var7 = "þÐs\t\u0084ê\f\u0086\u000b°g\u0018¢¶¿\u0098P\u008a\u0019\u00867_q_¦T¡~ø:\u0012ÍsT+\u0097\u008eA\u0088ÀrTºØKý\u0093\u0015ÉåÂ\\Õã\u0084lÙ¼~ñ\u0088\t9ü\u001c*!>¨»\u008aNC\u008aiX´\u0094º\nºvì¦u\u0098-\u0090\u0018.\"Ùç\u009fuÙj C\u008c:Â\u0004*ß<0ë±\\nìt \u00ad>\u001brÞÀ.x´×j\u0089w\u008e\u001d° \u0006\u00ad\u00adFK²z×_³ºùx+¨¡à\nå\u009b¤l1\u0094(\u009coÿõ:ÁË\u0010§À\u0006Y»;azdç)\u0082¨rZhPø\fG¾d\u008b°^\u0094ø·wµF\u0085Î\nÙw/ý¾\u00953»\u0004\u0007*5\u008c×ºë\u0091\u0000\u000f/\u0014Mä¸F}ÀÎ\u0006-\u0017Õ\u000f\u008fI\u0097é\u009a\u0090\u009cB0\u0014ÖÓ6¶º\u0012ÛIZx]ô\u0081eÞÍ¢\u0093\u0006f(ÕA\u0080a9Üý\u0003k³\u0005yÞKPWt\u00ad\b\u0010çë¥vuÕEôÖÌ÷þ¨¤\u0007s.i\u001fa\u0010ËpK\u0081S;`í/\u0086k[ÿr*`\u0010ô\u009b÷@É:ÞªXYjù\u0088\u008f\u0006\u0018 º:Ä\u000b¸x-Ä\nìZü%Aðé^ÙÇmk?\u0006\u001céE¨©d\u0017ÐÚ\u0018\u0089ì\u0093\u0001\u009c\bl\u0017Ö&\u0096m%\u008aK¢V/m\u0098I³=z\u0010¥2Ø\u0085Vò\u0092ÑÎ%¤õ8\u001c\u0000\u0018\u0010êßÁSPÿÈ\u0010Ð+eÅ\n\u008e2\u001a\u0010ÒS¨2\u0017ýJ\u0096ù×Ì\u0091Æÿ_K\u0010\u0007\u008aö0\u00941\u0092\u001a²\u0006vl \u0097Ù\u0097"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = buildString_5(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_D = var4;
                     CONST_E = new String[17];
                     CONST_A = getFile().getAbsolutePath();
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ßð¨¤àË\u0095-Õy\u0003ÂJ²ð\u008eGa\u009bÝüo\u0014çÎ:\u0005\u0004Æ \u0017\u0011µ$ÛÉ×hâ3$b#(¿ì$YØ+Õ \u000fÁt\u0018 !ÙÄz\u009f\u001f<ex>?-)è»òáPYàFýÓ\u0006ê¿\u0086\u0098l\u0092\u0011\u0088";
                  var7 = "ßð¨¤àË\u0095-Õy\u0003ÂJ²ð\u008eGa\u009bÝüo\u0014çÎ:\u0005\u0004Æ \u0017\u0011µ$ÛÉ×hâ3$b#(¿ì$YØ+Õ \u000fÁt\u0018 !ÙÄz\u009f\u001f<ex>?-)è»òáPYàFýÓ\u0006ê¿\u0086\u0098l\u0092\u0011\u0088"
                     .length();
                  var8 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_b = var0;
   }

   public static LicenseState[] values() {
      return arr_b;
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
   }

   private static String buildString_5(byte[] var0) {
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

   private static String buildString_6(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32752;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eN", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString_5(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_6(var4, var5);
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
         throw new RuntimeException("rip/breeze/eN" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
