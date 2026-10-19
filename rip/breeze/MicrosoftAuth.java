package rip.breeze;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.BindException;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public class MicrosoftAuth {
   private static final String CONST_A;
   private static final String CONST_B;
   private static final String CONST_C;
   private static final String CONST_D;
   private static final String CONST_E;
   private static final String CONST_F;
   private static final String CONST_G;
   private static final String CONST_H;
   private static final String CONST_I;
   private static final int CONST_J;
   private static final int CONST_K;
   private static final int CONST_L;
   private static final int CONST_M;
   private static final int CONST_N;
   private static final long eka_1;
   private final rip.breeze.client.MathUtil11 dataBuilder5_p;
   private final SecureRandom secureRandom_q;
   private final BiConsumer<StringDecryptHelper4, Boolean> biConsumer_r;
   private final Consumer<StringDecryptHelper4> consumer_s;
   private final Consumer<String> consumer_t;
   private HttpServer httpServer_u;
   private int fieldInt_v;
   private volatile String string_w;
   private String string_x;
   private String string_y;
   private final ArrayList<StringDecryptHelper4> arrayList_z;
   private static final Pattern CONST_A_2;
   private static final Pattern CONST_B_2;
   private static final Pattern CONST_C_2;
   private static final Pattern CONST_D_2;
   private static final Pattern CONST_E_2;
   private static final Pattern CONST_F_2;
   private static final Pattern CONST_G_2;
   private static final Pattern CONST_H_2;
   private static final Pattern CONST_I_2;
   private static final Pattern CONST_J_2;
   private static final Pattern CONST_K_2;
   private static final Pattern CONST_L_2;
   private static final Pattern CONST_M_2;
   private static final Pattern CONST_N_2;
   private static final Pattern CONST_O;
   private static int fieldInt_P;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);
   private static final long[] CONST_U;
   private static final Integer[] CONST_V;
   private static final Map CONST_W;
   private static final long[] CONST_X;
   private static final Long[] CONST_Y;
   private static final Map CONST_Z;

   public MicrosoftAuth(BiConsumer<StringDecryptHelper4, Boolean> param1, Consumer<StringDecryptHelper4> param2, Consumer<String> param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 03: ldc2_w 30271303522983
      // 06: lxor
      // 07: lstore 4
      // 09: lload 4
      // 0b: dup2
      // 0c: ldc2_w 51169091627072
      // 0f: lxor
      // 10: dup2
      // 11: bipush 48
      // 13: lushr
      // 14: l2i
      // 15: istore 6
      // 17: dup2
      // 18: bipush 16
      // 1a: lshl
      // 1b: bipush 16
      // 1d: lushr
      // 1e: lstore 7
      // 20: pop2
      // 21: pop2
      // 22: invokestatic rip/breeze/MicrosoftAuth.getValue_2 ()I
      // 25: aload 0
      // 26: invokespecial java/lang/Object.<init> ()V
      // 29: aload 0
      // 2a: new rip/breeze/client/MathUtil3
      // 2d: dup
      // 2e: invokespecial rip/breeze/client/MathUtil3.<init> ()V
      // 31: invokevirtual rip/breeze/client/MathUtil3.isActive_2 ()Lrip/breeze/client/MathUtil3;
      // 34: iload 6
      // 36: i2c
      // 37: lload 7
      // 39: invokevirtual rip/breeze/client/MathUtil3.getDataBuilder5 (CJ)Lrip/breeze/client/MathUtil11;
      // 3c: putfield rip/breeze/MicrosoftAuth.dataBuilder5_p Lrip/breeze/client/MathUtil11;
      // 3f: aload 0
      // 40: new java/security/SecureRandom
      // 43: dup
      // 44: invokespecial java/security/SecureRandom.<init> ()V
      // 47: putfield rip/breeze/MicrosoftAuth.secureRandom_q Ljava/security/SecureRandom;
      // 4a: aload 0
      // 4b: bipush -1
      // 4c: putfield rip/breeze/MicrosoftAuth.fieldInt_v I
      // 4f: aload 0
      // 50: aconst_null
      // 51: putfield rip/breeze/MicrosoftAuth.string_w Ljava/lang/String;
      // 54: istore 9
      // 56: aload 0
      // 57: new java/util/ArrayList
      // 5a: dup
      // 5b: invokespecial java/util/ArrayList.<init> ()V
      // 5e: putfield rip/breeze/MicrosoftAuth.arrayList_z Ljava/util/ArrayList;
      // 61: aload 0
      // 62: aload 1
      // 63: putfield rip/breeze/MicrosoftAuth.biConsumer_r Ljava/util/function/BiConsumer;
      // 66: aload 0
      // 67: aload 2
      // 68: putfield rip/breeze/MicrosoftAuth.consumer_s Ljava/util/function/Consumer;
      // 6b: aload 0
      // 6c: aload 3
      // 6d: putfield rip/breeze/MicrosoftAuth.consumer_t Ljava/util/function/Consumer;
      // 70: aload 0
      // 71: invokespecial rip/breeze/MicrosoftAuth.processAll_3 ()V
      // 74: iload 9
      // 76: ifne 92
      // 79: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 7c: ifne 8e
      // 7f: goto 86
      // 82: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: bipush 0
      // 87: goto 8f
      // 8a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: bipush 1
      // 8f: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 92: return
      // try (46 -> 66): 67 java/time/format/DateTimeParseException
      // try (64 -> 71): 71 java/time/format/DateTimeParseException
   }

   public void update() {
      this.processAll_2();
      this.processAll_4();
   }

   public void processNullable(StringDecryptHelper4 var1) {
      long var2 = 90511162392000L;

      try {
         if (var1 == null) {
            return;
         }
      } catch (DateTimeParseException var4) {
         throw getException(var4);
      }

      this.consumer_s.accept(var1);
      this.arrayList_z.remove(var1);
      this.processAll_2();
   }

   public ArrayList<StringDecryptHelper4> getArrayList_z() {
      return this.arrayList_z;
   }

   public String buildString() {
      long var1 = 77087290868306L;
      String var3 = this.buildString_13();
      this.string_w = this.buildString_14(16);
      this.update_2();

      try {
         return "https://api.minecraftservices.com/minecraft/profile"
            + URLEncoder.encode("\"sCtx\"\\s*:\\s*\"([^\"]+)\"", "<form([^>]*?)>")
            + "\\baction\\s*=\\s*\"([^\"]+)\""
            + URLEncoder.encode(var3, "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "\\baction\\s*=\\s*\"([^\"]+)\""
            + URLEncoder.encode("\"(?:sFT|sft|flowToken)\"\\s*:\\s*\"([^\"]+)\"", "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "\"sFTTag\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\""
            + URLEncoder.encode(this.string_y, "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "&code_challenge_method=S256&state="
            + URLEncoder.encode(this.string_w, "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "XboxLive.signin offline_access";
      } catch (UnsupportedEncodingException var5) {
         return "\"sCtx\"\\s*:\\s*\"([^\"]+)\""
            + this.buildString_13()
            + "<form([^>]*?)>"
            + ""
            + "\"sPOST_PaginatedLoginState\"\\s*:\\s*\"([^\"]+)\""
            + this.string_y
            + "<form([^>]*?)>"
            + this.string_w
            + "&prompt=select_account";
      }
   }

   public void update_1(File var1) {
      this.processAll_5(new BreezeTask(this, var1));
   }

   private String buildString_2() {
      long var1 = 22494485615958L;
      String var3 = this.buildString_13();

      try {
         return "XboxLive.signin offline_access"
            + URLEncoder.encode("\"sCtx\"\\s*:\\s*\"([^\"]+)\"", "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "XboxLive.signin offline_access"
            + URLEncoder.encode(var3, "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "<form([^>]*?)>"
            + URLEncoder.encode("", "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "\"sPOST_PaginatedLoginState\"\\s*:\\s*\"([^\"]+)\""
            + URLEncoder.encode(this.string_y, "\\baction\\s*=\\s*\"([^\"]+)\"")
            + "<form([^>]*?)>"
            + URLEncoder.encode(this.string_w, "\\baction\\s*=\\s*\"([^\"]+)\"");
      } catch (UnsupportedEncodingException var5) {
         return "4976cd9d-40aa-4a29-8951-199d743ed64f"
            + var3
            + "<form([^>]*?)>"
            + ""
            + "\"sPOST_PaginatedLoginState\"\\s*:\\s*\"([^\"]+)\""
            + this.string_y
            + "<form([^>]*?)>"
            + this.string_w;
      }
   }

   private static String buildString_3(List<HttpCookie> var0) {
      long var1 = 125862402791854L;
      int var10000 = getValue();
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var0.iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         HttpCookie var6 = (HttpCookie)var4.next();

         try {
            if (var6.hasExpired()) {
               continue;
            }
         } catch (DateTimeParseException var9) {
            throw getException(var9);
         }

         try {
            if (!checkCondition(var6.getName())) {
               continue;
            }
         } catch (DateTimeParseException var8) {
            throw getException(var8);
         }

         try {
            if (var3.length() > 0) {
               var3.append("https://user.auth.xboxlive.com/user/authenticate");
            }
         } catch (DateTimeParseException var7) {
            throw getException(var7);
         }

         var3.append(var6.getName()).append('=').append(var6.getValue());
         if (var5 != 0) {
            break;
         }
      }

      return var3.toString();
   }

   private static boolean checkCondition(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 124458242052873
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: ifnull 01a
      // 00c: aload 0
      // 00d: invokevirtual java/lang/String.isEmpty ()Z
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: aload 0
      // 021: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 024: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 027: astore 3
      // 028: aload 3
      // 029: sipush 28826
      // 02c: ldc2_w 91159620048524204
      // 02f: lload 1
      // 030: lxor
      // 031: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 039: ifne 16d
      // 03c: aload 3
      // 03d: sipush 9659
      // 040: ldc2_w 1508283802403915642
      // 043: lload 1
      // 044: lxor
      // 045: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 04d: ifne 16d
      // 050: goto 057
      // 053: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: aload 3
      // 058: sipush 3821
      // 05b: ldc2_w 447342287138516431
      // 05e: lload 1
      // 05f: lxor
      // 060: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 068: ifne 16d
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 3
      // 073: sipush 4584
      // 076: ldc2_w 1990225781874914265
      // 079: lload 1
      // 07a: lxor
      // 07b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 083: ifne 16d
      // 086: goto 08d
      // 089: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 3
      // 08e: sipush 5678
      // 091: ldc2_w 8552548813014496421
      // 094: lload 1
      // 095: lxor
      // 096: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 09e: ifne 16d
      // 0a1: goto 0a8
      // 0a4: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: sipush 1674
      // 0ac: ldc2_w 578907465769870730
      // 0af: lload 1
      // 0b0: lxor
      // 0b1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0b9: ifne 16d
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 3
      // 0c4: sipush 9069
      // 0c7: ldc2_w 3336483985066410350
      // 0ca: lload 1
      // 0cb: lxor
      // 0cc: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0d4: ifne 16d
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: aload 3
      // 0df: sipush 248
      // 0e2: ldc2_w 8449116416422437554
      // 0e5: lload 1
      // 0e6: lxor
      // 0e7: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0ef: ifne 16d
      // 0f2: goto 0f9
      // 0f5: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: aload 3
      // 0fa: sipush 23292
      // 0fd: ldc2_w 8260680179563214865
      // 100: lload 1
      // 101: lxor
      // 102: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10a: ifne 16d
      // 10d: goto 114
      // 110: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 3
      // 115: sipush 26924
      // 118: ldc2_w 1482175146271968051
      // 11b: lload 1
      // 11c: lxor
      // 11d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 125: ifne 16d
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: aload 3
      // 130: sipush 4905
      // 133: ldc2_w 8657845753707753867
      // 136: lload 1
      // 137: lxor
      // 138: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 140: ifne 16d
      // 143: goto 14a
      // 146: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 3
      // 14b: sipush 10162
      // 14e: ldc2_w 5929365419796219348
      // 151: lload 1
      // 152: lxor
      // 153: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 15b: ifne 16d
      // 15e: goto 165
      // 161: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: bipush 1
      // 166: goto 16e
      // 169: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: bipush 0
      // 16e: ireturn
      // try (4 -> 9): 10 java/time/format/DateTimeParseException
      // try (6 -> 14): 14 java/time/format/DateTimeParseException
      // try (20 -> 36): 37 java/time/format/DateTimeParseException
      // try (28 -> 47): 48 java/time/format/DateTimeParseException
      // try (39 -> 58): 59 java/time/format/DateTimeParseException
      // try (50 -> 69): 70 java/time/format/DateTimeParseException
      // try (61 -> 80): 81 java/time/format/DateTimeParseException
      // try (72 -> 91): 92 java/time/format/DateTimeParseException
      // try (83 -> 102): 103 java/time/format/DateTimeParseException
      // try (94 -> 113): 114 java/time/format/DateTimeParseException
      // try (105 -> 124): 125 java/time/format/DateTimeParseException
      // try (116 -> 135): 136 java/time/format/DateTimeParseException
      // try (127 -> 146): 147 java/time/format/DateTimeParseException
      // try (138 -> 151): 151 java/time/format/DateTimeParseException
   }

   private String buildString_4(String param1, String param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 0000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 0003: ldc2_w 91123119287955
      // 0006: lxor
      // 0007: lstore 3
      // 0008: invokestatic rip/breeze/MicrosoftAuth.getValue ()I
      // 000b: new java/lang/StringBuilder
      // 000e: dup
      // 000f: sipush 10491
      // 0012: ldc2_w 6406006405477217896
      // 0015: lload 3
      // 0016: lxor
      // 0017: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 001c: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 001f: astore 5
      // 0021: aload 2
      // 0022: invokestatic rip/breeze/MicrosoftAuth.getLinkedHashMap (Ljava/lang/String;)Ljava/util/LinkedHashMap;
      // 0025: astore 6
      // 0027: aload 5
      // 0029: sipush 28905
      // 002c: ldc2_w 977182629550550828
      // 002f: lload 3
      // 0030: lxor
      // 0031: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0036: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0039: aload 6
      // 003b: invokevirtual java/util/LinkedHashMap.size ()I
      // 003e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0041: sipush 16046
      // 0044: ldc2_w 7118072359753163157
      // 0047: lload 3
      // 0048: lxor
      // 0049: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 004e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0051: aload 6
      // 0053: invokevirtual java/util/LinkedHashMap.keySet ()Ljava/util/Set;
      // 0056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0059: ldc_w "\n"
      // 005c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 005f: pop
      // 0060: aload 1
      // 0061: astore 7
      // 0063: aconst_null
      // 0064: astore 8
      // 0066: bipush 0
      // 0067: istore 9
      // 0069: istore 10
      // 006b: iload 9
      // 006d: bipush 30
      // 006f: if_icmpge 1741
      // 0072: aload 7
      // 0074: astore 11
      // 0076: aconst_null
      // 0077: astore 12
      // 0079: new java/net/URL
      // 007c: dup
      // 007d: aload 11
      // 007f: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 0082: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 0085: checkcast java/net/HttpURLConnection
      // 0088: astore 12
      // 008a: aload 12
      // 008c: bipush 0
      // 008d: invokevirtual java/net/HttpURLConnection.setInstanceFollowRedirects (Z)V
      // 0090: aload 12
      // 0092: sipush 9000
      // 0095: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 0098: aload 12
      // 009a: sipush 12000
      // 009d: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 00a0: aload 12
      // 00a2: sipush 3616
      // 00a5: ldc2_w 3388827425022349587
      // 00a8: lload 3
      // 00a9: lxor
      // 00aa: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00af: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 00b2: aload 12
      // 00b4: sipush 14080
      // 00b7: ldc2_w 7327862450879277228
      // 00ba: lload 3
      // 00bb: lxor
      // 00bc: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00c1: aload 6
      // 00c3: invokestatic rip/breeze/MicrosoftAuth.buildString_6 (Ljava/util/Map;)Ljava/lang/String;
      // 00c6: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 00c9: aload 12
      // 00cb: aload 8
      // 00cd: bipush 0
      // 00ce: aload 11
      // 00d0: invokestatic rip/breeze/MicrosoftAuth.processAll_6 (Ljava/net/HttpURLConnection;Ljava/lang/String;ZLjava/lang/String;)V
      // 00d3: aload 5
      // 00d5: sipush 11456
      // 00d8: ldc2_w 9179042807269241619
      // 00db: lload 3
      // 00dc: lxor
      // 00dd: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00e5: iload 9
      // 00e7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 00ea: sipush 4425
      // 00ed: ldc2_w 8972391881647001115
      // 00f0: lload 3
      // 00f1: lxor
      // 00f2: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 00f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00fa: aload 11
      // 00fc: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 00ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0102: pop
      // 0103: aload 12
      // 0105: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 0108: istore 13
      // 010a: aload 5
      // 010c: sipush 1964
      // 010f: ldc2_w 445250704507115730
      // 0112: lload 3
      // 0113: lxor
      // 0114: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 011c: iload 13
      // 011e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0121: pop
      // 0122: aload 12
      // 0124: aload 6
      // 0126: invokestatic rip/breeze/MicrosoftAuth.calculate (Ljava/net/HttpURLConnection;Ljava/util/Map;)V
      // 0129: iload 13
      // 012b: sipush 300
      // 012e: if_icmplt 0292
      // 0131: iload 13
      // 0133: sipush 400
      // 0136: if_icmpge 0292
      // 0139: goto 0140
      // 013c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 013f: athrow
      // 0140: aload 12
      // 0142: sipush 25880
      // 0145: ldc2_w 3929003779994057369
      // 0148: lload 3
      // 0149: lxor
      // 014a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 014f: invokevirtual java/net/HttpURLConnection.getHeaderField (Ljava/lang/String;)Ljava/lang/String;
      // 0152: astore 14
      // 0154: aload 12
      // 0156: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0159: aconst_null
      // 015a: astore 12
      // 015c: aload 14
      // 015e: ifnonnull 0197
      // 0161: aload 5
      // 0163: sipush 16602
      // 0166: ldc2_w 839184452090912542
      // 0169: lload 3
      // 016a: lxor
      // 016b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0173: pop
      // 0174: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 0177: aload 5
      // 0179: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 017c: aconst_null
      // 017d: astore 15
      // 017f: aload 11
      // 0181: astore 8
      // 0183: aload 12
      // 0185: ifnull 0194
      // 0188: aload 12
      // 018a: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 018d: goto 0194
      // 0190: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0193: athrow
      // 0194: aload 15
      // 0196: areturn
      // 0197: aload 14
      // 0199: sipush 27259
      // 019c: ldc2_w 7697611527542469885
      // 019f: lload 3
      // 01a0: lxor
      // 01a1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a6: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 01a9: ifne 01c3
      // 01ac: new java/net/URL
      // 01af: dup
      // 01b0: new java/net/URL
      // 01b3: dup
      // 01b4: aload 7
      // 01b6: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 01b9: aload 14
      // 01bb: invokespecial java/net/URL.<init> (Ljava/net/URL;Ljava/lang/String;)V
      // 01be: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 01c1: astore 14
      // 01c3: aload 5
      // 01c5: sipush 1981
      // 01c8: ldc2_w 4845380337625569353
      // 01cb: lload 3
      // 01cc: lxor
      // 01cd: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01d5: aload 14
      // 01d7: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 01da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01dd: ldc_w "\n"
      // 01e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01e3: pop
      // 01e4: aload 14
      // 01e6: sipush 29785
      // 01e9: ldc2_w 4745541746590870422
      // 01ec: lload 3
      // 01ed: lxor
      // 01ee: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f3: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 01f6: ifeq 028b
      // 01f9: aload 14
      // 01fb: sipush 29452
      // 01fe: ldc2_w 4478712322808343989
      // 0201: lload 3
      // 0202: lxor
      // 0203: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0208: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 020b: ifeq 028b
      // 020e: goto 0215
      // 0211: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0214: athrow
      // 0215: aload 14
      // 0217: sipush 13703
      // 021a: ldc2_w 1879100776998185633
      // 021d: lload 3
      // 021e: lxor
      // 021f: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0224: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0227: ifeq 026c
      // 022a: goto 0231
      // 022d: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0230: athrow
      // 0231: new java/io/IOException
      // 0234: dup
      // 0235: new java/lang/StringBuilder
      // 0238: dup
      // 0239: invokespecial java/lang/StringBuilder.<init> ()V
      // 023c: sipush 28388
      // 023f: ldc2_w 1481612328877322680
      // 0242: lload 3
      // 0243: lxor
      // 0244: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0249: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 024c: aload 14
      // 024e: sipush 18707
      // 0251: ldc2_w 7020766659610597113
      // 0254: lload 3
      // 0255: lxor
      // 0256: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025b: invokestatic rip/breeze/MicrosoftAuth.buildString_5 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 025e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0261: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0264: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0267: athrow
      // 0268: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026b: athrow
      // 026c: aload 14
      // 026e: invokestatic rip/breeze/MicrosoftAuth.getString (Ljava/lang/String;)Ljava/lang/String;
      // 0271: astore 15
      // 0273: aload 11
      // 0275: astore 8
      // 0277: aload 12
      // 0279: ifnull 0288
      // 027c: aload 12
      // 027e: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0281: goto 0288
      // 0284: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0287: athrow
      // 0288: aload 15
      // 028a: areturn
      // 028b: aload 14
      // 028d: astore 7
      // 028f: goto 167d
      // 0292: iload 13
      // 0294: sipush 200
      // 0297: if_icmpne 1647
      // 029a: aload 12
      // 029c: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 029f: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 02a2: astore 14
      // 02a4: aload 12
      // 02a6: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 02a9: aconst_null
      // 02aa: astore 12
      // 02ac: aload 5
      // 02ae: sipush 11238
      // 02b1: ldc2_w 582373862696629270
      // 02b4: lload 3
      // 02b5: lxor
      // 02b6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02be: aload 14
      // 02c0: invokevirtual java/lang/String.length ()I
      // 02c3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 02c6: sipush 17765
      // 02c9: ldc2_w 7430257251943438849
      // 02cc: lload 3
      // 02cd: lxor
      // 02ce: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02d6: pop
      // 02d7: bipush 0
      // 02d8: istore 15
      // 02da: bipush 0
      // 02db: istore 16
      // 02dd: bipush 0
      // 02de: istore 15
      // 02e0: iinc 16 1
      // 02e3: aconst_null
      // 02e4: astore 17
      // 02e6: aconst_null
      // 02e7: astore 18
      // 02e9: aconst_null
      // 02ea: astore 19
      // 02ec: bipush -1
      // 02ed: istore 20
      // 02ef: getstatic rip/breeze/MicrosoftAuth.CONST_J_2 Ljava/util/regex/Pattern;
      // 02f2: aload 14
      // 02f4: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 02f7: astore 21
      // 02f9: aload 21
      // 02fb: invokevirtual java/util/regex/Matcher.find ()Z
      // 02fe: ifeq 0638
      // 0301: aload 21
      // 0303: bipush 1
      // 0304: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0307: astore 22
      // 0309: getstatic rip/breeze/MicrosoftAuth.CONST_K_2 Ljava/util/regex/Pattern;
      // 030c: aload 22
      // 030e: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0311: astore 23
      // 0313: aload 23
      // 0315: invokevirtual java/util/regex/Matcher.find ()Z
      // 0318: ifne 0322
      // 031b: goto 02f9
      // 031e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0321: athrow
      // 0322: aload 23
      // 0324: bipush 1
      // 0325: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0328: sipush 24818
      // 032b: ldc2_w 7136929760632373051
      // 032e: lload 3
      // 032f: lxor
      // 0330: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0335: ldc_w "&"
      // 0338: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 033b: astore 24
      // 033d: getstatic rip/breeze/MicrosoftAuth.CONST_L_2 Ljava/util/regex/Pattern;
      // 0340: aload 22
      // 0342: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0345: astore 25
      // 0347: aload 25
      // 0349: invokevirtual java/util/regex/Matcher.find ()Z
      // 034c: ifeq 035c
      // 034f: aload 25
      // 0351: bipush 1
      // 0352: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0355: goto 0369
      // 0358: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035b: athrow
      // 035c: sipush 32234
      // 035f: ldc2_w 7376194405007123304
      // 0362: lload 3
      // 0363: lxor
      // 0364: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0369: astore 26
      // 036b: aload 21
      // 036d: invokevirtual java/util/regex/Matcher.start ()I
      // 0370: istore 27
      // 0372: aload 14
      // 0374: sipush 9762
      // 0377: ldc2_w 728963981200242984
      // 037a: lload 3
      // 037b: lxor
      // 037c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0381: iload 27
      // 0383: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 0386: istore 28
      // 0388: iload 28
      // 038a: ifge 0394
      // 038d: aload 14
      // 038f: invokevirtual java/lang/String.length ()I
      // 0392: istore 28
      // 0394: aload 14
      // 0396: iload 27
      // 0398: iload 28
      // 039a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 039d: astore 29
      // 039f: new java/util/LinkedHashMap
      // 03a2: dup
      // 03a3: invokespecial java/util/LinkedHashMap.<init> ()V
      // 03a6: astore 30
      // 03a8: getstatic rip/breeze/MicrosoftAuth.CONST_M_2 Ljava/util/regex/Pattern;
      // 03ab: aload 29
      // 03ad: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 03b0: astore 31
      // 03b2: aload 31
      // 03b4: invokevirtual java/util/regex/Matcher.find ()Z
      // 03b7: ifeq 0410
      // 03ba: aload 31
      // 03bc: bipush 1
      // 03bd: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 03c0: astore 32
      // 03c2: getstatic rip/breeze/MicrosoftAuth.CONST_N_2 Ljava/util/regex/Pattern;
      // 03c5: aload 32
      // 03c7: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 03ca: astore 33
      // 03cc: getstatic rip/breeze/MicrosoftAuth.CONST_O Ljava/util/regex/Pattern;
      // 03cf: aload 32
      // 03d1: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 03d4: astore 34
      // 03d6: aload 33
      // 03d8: invokevirtual java/util/regex/Matcher.find ()Z
      // 03db: ifeq 040b
      // 03de: aload 30
      // 03e0: aload 33
      // 03e2: bipush 1
      // 03e3: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 03e6: aload 34
      // 03e8: invokevirtual java/util/regex/Matcher.find ()Z
      // 03eb: ifeq 0402
      // 03ee: goto 03f5
      // 03f1: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f4: athrow
      // 03f5: aload 34
      // 03f7: bipush 1
      // 03f8: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 03fb: goto 0405
      // 03fe: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0401: athrow
      // 0402: ldc_w ""
      // 0405: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 040a: pop
      // 040b: iload 10
      // 040d: ifeq 03b2
      // 0410: bipush 0
      // 0411: istore 32
      // 0413: aload 24
      // 0415: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0418: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 041b: astore 33
      // 041d: aload 33
      // 041f: sipush 10792
      // 0422: ldc2_w 8693641283274290439
      // 0425: lload 3
      // 0426: lxor
      // 0427: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042c: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 042f: ifne 04a2
      // 0432: aload 33
      // 0434: sipush 1657
      // 0437: ldc2_w 8902444754759325970
      // 043a: lload 3
      // 043b: lxor
      // 043c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0441: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0444: ifne 04a2
      // 0447: goto 044e
      // 044a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044d: athrow
      // 044e: aload 33
      // 0450: sipush 24740
      // 0453: ldc2_w 7615619678516444708
      // 0456: lload 3
      // 0457: lxor
      // 0458: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045d: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0460: ifne 04a2
      // 0463: goto 046a
      // 0466: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0469: athrow
      // 046a: aload 33
      // 046c: sipush 10616
      // 046f: ldc2_w 7821757320917530186
      // 0472: lload 3
      // 0473: lxor
      // 0474: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0479: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 047c: ifne 04a2
      // 047f: goto 0486
      // 0482: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0485: athrow
      // 0486: aload 33
      // 0488: sipush 23360
      // 048b: ldc2_w 3265091283516638428
      // 048e: lload 3
      // 048f: lxor
      // 0490: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0495: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0498: ifeq 04ac
      // 049b: goto 04a2
      // 049e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a1: athrow
      // 04a2: iinc 32 10
      // 04a5: goto 04ac
      // 04a8: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04ab: athrow
      // 04ac: aload 33
      // 04ae: sipush 9003
      // 04b1: ldc2_w 621834529207041432
      // 04b4: lload 3
      // 04b5: lxor
      // 04b6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04bb: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 04be: ifne 04dd
      // 04c1: aload 33
      // 04c3: sipush 20428
      // 04c6: ldc2_w 8939751416873701410
      // 04c9: lload 3
      // 04ca: lxor
      // 04cb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d0: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 04d3: ifeq 04e7
      // 04d6: goto 04dd
      // 04d9: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04dc: athrow
      // 04dd: iinc 32 20
      // 04e0: goto 04e7
      // 04e3: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e6: athrow
      // 04e7: aload 30
      // 04e9: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 04ee: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 04f3: astore 34
      // 04f5: aload 34
      // 04f7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04fc: ifeq 05c5
      // 04ff: aload 34
      // 0501: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0506: checkcast java/lang/String
      // 0509: astore 35
      // 050b: aload 35
      // 050d: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0510: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0513: astore 36
      // 0515: aload 36
      // 0517: sipush 12791
      // 051a: ldc2_w 6225780692003270371
      // 051d: lload 3
      // 051e: lxor
      // 051f: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0524: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0527: ifne 05b6
      // 052a: aload 36
      // 052c: sipush 26930
      // 052f: ldc2_w 1553943784305718825
      // 0532: lload 3
      // 0533: lxor
      // 0534: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0539: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 053c: ifne 05b6
      // 053f: goto 0546
      // 0542: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0545: athrow
      // 0546: aload 36
      // 0548: sipush 25328
      // 054b: ldc2_w 3709238477106380223
      // 054e: lload 3
      // 054f: lxor
      // 0550: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0555: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0558: ifne 05b6
      // 055b: goto 0562
      // 055e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0561: athrow
      // 0562: aload 36
      // 0564: sipush 6289
      // 0567: ldc2_w 5491059704700340216
      // 056a: lload 3
      // 056b: lxor
      // 056c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0571: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0574: ifne 05b6
      // 0577: goto 057e
      // 057a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057d: athrow
      // 057e: aload 36
      // 0580: sipush 13499
      // 0583: ldc2_w 4295480818448051064
      // 0586: lload 3
      // 0587: lxor
      // 0588: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0590: ifne 05b6
      // 0593: goto 059a
      // 0596: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0599: athrow
      // 059a: aload 36
      // 059c: sipush 21561
      // 059f: ldc2_w 2270967541035584135
      // 05a2: lload 3
      // 05a3: lxor
      // 05a4: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05ac: ifeq 05c0
      // 05af: goto 05b6
      // 05b2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b5: athrow
      // 05b6: iinc 32 5
      // 05b9: goto 05c0
      // 05bc: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05bf: athrow
      // 05c0: iload 10
      // 05c2: ifeq 04f5
      // 05c5: aload 33
      // 05c7: sipush 31829
      // 05ca: ldc2_w 1656711705824519090
      // 05cd: lload 3
      // 05ce: lxor
      // 05cf: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d4: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 05d7: ifne 0612
      // 05da: aload 33
      // 05dc: sipush 22216
      // 05df: ldc2_w 4918544567018211677
      // 05e2: lload 3
      // 05e3: lxor
      // 05e4: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 05ec: ifne 0612
      // 05ef: goto 05f6
      // 05f2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f5: athrow
      // 05f6: aload 33
      // 05f8: sipush 19711
      // 05fb: ldc2_w 4695996547049870120
      // 05fe: lload 3
      // 05ff: lxor
      // 0600: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0605: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0608: ifeq 061c
      // 060b: goto 0612
      // 060e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0611: athrow
      // 0612: iinc 32 -20
      // 0615: goto 061c
      // 0618: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061b: athrow
      // 061c: iload 32
      // 061e: iload 20
      // 0620: if_icmple 0633
      // 0623: iload 32
      // 0625: istore 20
      // 0627: aload 24
      // 0629: astore 17
      // 062b: aload 26
      // 062d: astore 18
      // 062f: aload 30
      // 0631: astore 19
      // 0633: iload 10
      // 0635: ifeq 02f9
      // 0638: aload 17
      // 063a: ifnull 0b2a
      // 063d: aload 18
      // 063f: ifnull 0b2a
      // 0642: goto 0649
      // 0645: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0648: athrow
      // 0649: aload 17
      // 064b: astore 22
      // 064d: aload 18
      // 064f: astore 23
      // 0651: new java/util/LinkedHashMap
      // 0654: dup
      // 0655: aload 19
      // 0657: invokespecial java/util/LinkedHashMap.<init> (Ljava/util/Map;)V
      // 065a: astore 24
      // 065c: aload 22
      // 065e: sipush 16382
      // 0661: ldc2_w 6542747272617107560
      // 0664: lload 3
      // 0665: lxor
      // 0666: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 066e: ifne 0688
      // 0671: new java/net/URL
      // 0674: dup
      // 0675: new java/net/URL
      // 0678: dup
      // 0679: aload 7
      // 067b: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 067e: aload 22
      // 0680: invokespecial java/net/URL.<init> (Ljava/net/URL;Ljava/lang/String;)V
      // 0683: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 0686: astore 22
      // 0688: aload 22
      // 068a: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 068d: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0690: sipush 16298
      // 0693: ldc2_w 5226265447338418354
      // 0696: lload 3
      // 0697: lxor
      // 0698: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069d: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 06a0: ifeq 06ea
      // 06a3: aload 24
      // 06a5: sipush 27286
      // 06a8: ldc2_w 928471116892992796
      // 06ab: lload 3
      // 06ac: lxor
      // 06ad: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b2: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 06b7: ifne 06ea
      // 06ba: goto 06c1
      // 06bd: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c0: athrow
      // 06c1: aload 24
      // 06c3: sipush 27286
      // 06c6: ldc2_w 928471116892992796
      // 06c9: lload 3
      // 06ca: lxor
      // 06cb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d0: sipush 18782
      // 06d3: ldc2_w 6680693184029906532
      // 06d6: lload 3
      // 06d7: lxor
      // 06d8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06dd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 06e2: pop
      // 06e3: goto 06ea
      // 06e6: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e9: athrow
      // 06ea: aload 5
      // 06ec: sipush 21862
      // 06ef: ldc2_w 5073088179172166180
      // 06f2: lload 3
      // 06f3: lxor
      // 06f4: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06fc: aload 23
      // 06fe: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0701: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0704: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0707: bipush 32
      // 0709: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 070c: aload 22
      // 070e: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 0711: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0714: sipush 16576
      // 0717: ldc2_w 8396504112558563313
      // 071a: lload 3
      // 071b: lxor
      // 071c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0721: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0724: iload 20
      // 0726: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0729: sipush 15367
      // 072c: ldc2_w 8709908174797972152
      // 072f: lload 3
      // 0730: lxor
      // 0731: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0736: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0739: aload 24
      // 073b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0740: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0743: sipush 21942
      // 0746: ldc2_w 8271984832963005044
      // 0749: lload 3
      // 074a: lxor
      // 074b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0750: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0753: pop
      // 0754: sipush 2889
      // 0757: ldc2_w 4560825963637150737
      // 075a: lload 3
      // 075b: lxor
      // 075c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0761: aload 23
      // 0763: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0766: ifeq 0a4d
      // 0769: new java/net/URL
      // 076c: dup
      // 076d: aload 22
      // 076f: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 0772: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 0775: checkcast java/net/HttpURLConnection
      // 0778: astore 25
      // 077a: aload 25
      // 077c: bipush 0
      // 077d: invokevirtual java/net/HttpURLConnection.setInstanceFollowRedirects (Z)V
      // 0780: aload 25
      // 0782: sipush 9000
      // 0785: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 0788: aload 25
      // 078a: sipush 12000
      // 078d: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 0790: aload 25
      // 0792: sipush 23648
      // 0795: ldc2_w 3714680047127184351
      // 0798: lload 3
      // 0799: lxor
      // 079a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079f: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 07a2: aload 25
      // 07a4: bipush 1
      // 07a5: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 07a8: aload 25
      // 07aa: sipush 17392
      // 07ad: ldc2_w 1480666779563023699
      // 07b0: lload 3
      // 07b1: lxor
      // 07b2: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b7: aload 6
      // 07b9: invokestatic rip/breeze/MicrosoftAuth.buildString_6 (Ljava/util/Map;)Ljava/lang/String;
      // 07bc: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 07bf: aload 25
      // 07c1: sipush 16948
      // 07c4: ldc2_w 8327869222254533890
      // 07c7: lload 3
      // 07c8: lxor
      // 07c9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07ce: sipush 389
      // 07d1: ldc2_w 501908679068655333
      // 07d4: lload 3
      // 07d5: lxor
      // 07d6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07db: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 07de: aload 25
      // 07e0: aload 7
      // 07e2: bipush 1
      // 07e3: aload 22
      // 07e5: invokestatic rip/breeze/MicrosoftAuth.processAll_6 (Ljava/net/HttpURLConnection;Ljava/lang/String;ZLjava/lang/String;)V
      // 07e8: aload 24
      // 07ea: invokestatic rip/breeze/MicrosoftAuth.buildString_7 (Ljava/util/Map;)Ljava/lang/String;
      // 07ed: astore 26
      // 07ef: aload 25
      // 07f1: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 07f4: astore 27
      // 07f6: aload 27
      // 07f8: aload 26
      // 07fa: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 07fd: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 0800: invokevirtual java/io/OutputStream.write ([B)V
      // 0803: aload 27
      // 0805: invokevirtual java/io/OutputStream.close ()V
      // 0808: goto 0815
      // 080b: astore 37
      // 080d: aload 27
      // 080f: invokevirtual java/io/OutputStream.close ()V
      // 0812: aload 37
      // 0814: athrow
      // 0815: aload 25
      // 0817: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 081a: istore 28
      // 081c: aload 25
      // 081e: aload 6
      // 0820: invokestatic rip/breeze/MicrosoftAuth.calculate (Ljava/net/HttpURLConnection;Ljava/util/Map;)V
      // 0823: iload 28
      // 0825: sipush 300
      // 0828: if_icmplt 09b7
      // 082b: iload 28
      // 082d: sipush 400
      // 0830: if_icmpge 09b7
      // 0833: goto 083a
      // 0836: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0839: athrow
      // 083a: aload 25
      // 083c: sipush 31531
      // 083f: ldc2_w 141454873130919010
      // 0842: lload 3
      // 0843: lxor
      // 0844: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0849: invokevirtual java/net/HttpURLConnection.getHeaderField (Ljava/lang/String;)Ljava/lang/String;
      // 084c: astore 29
      // 084e: aload 29
      // 0850: ifnull 098a
      // 0853: aload 29
      // 0855: sipush 16382
      // 0858: ldc2_w 6542747272617107560
      // 085b: lload 3
      // 085c: lxor
      // 085d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0862: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0865: ifne 0886
      // 0868: goto 086f
      // 086b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086e: athrow
      // 086f: new java/net/URL
      // 0872: dup
      // 0873: new java/net/URL
      // 0876: dup
      // 0877: aload 22
      // 0879: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 087c: aload 29
      // 087e: invokespecial java/net/URL.<init> (Ljava/net/URL;Ljava/lang/String;)V
      // 0881: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 0884: astore 29
      // 0886: aload 5
      // 0888: sipush 25225
      // 088b: ldc2_w 4407747344292576527
      // 088e: lload 3
      // 088f: lxor
      // 0890: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0895: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0898: iload 28
      // 089a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 089d: sipush 1981
      // 08a0: ldc2_w 4845380337625569353
      // 08a3: lload 3
      // 08a4: lxor
      // 08a5: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08ad: aload 29
      // 08af: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 08b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b5: bipush 10
      // 08b7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 08ba: pop
      // 08bb: aload 29
      // 08bd: sipush 9003
      // 08c0: ldc2_w 621834529207041432
      // 08c3: lload 3
      // 08c4: lxor
      // 08c5: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08ca: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08cd: ifeq 0967
      // 08d0: aload 29
      // 08d2: sipush 1361
      // 08d5: ldc2_w 2875153138912205421
      // 08d8: lload 3
      // 08d9: lxor
      // 08da: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08df: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08e2: ifeq 0967
      // 08e5: goto 08ec
      // 08e8: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08eb: athrow
      // 08ec: aload 29
      // 08ee: sipush 25075
      // 08f1: ldc2_w 7391518016416480923
      // 08f4: lload 3
      // 08f5: lxor
      // 08f6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08fb: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08fe: ifeq 0943
      // 0901: goto 0908
      // 0904: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0907: athrow
      // 0908: new java/io/IOException
      // 090b: dup
      // 090c: new java/lang/StringBuilder
      // 090f: dup
      // 0910: invokespecial java/lang/StringBuilder.<init> ()V
      // 0913: sipush 11179
      // 0916: ldc2_w 6056647458677175353
      // 0919: lload 3
      // 091a: lxor
      // 091b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0920: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0923: aload 29
      // 0925: sipush 19201
      // 0928: ldc2_w 3708593880292971741
      // 092b: lload 3
      // 092c: lxor
      // 092d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0932: invokestatic rip/breeze/MicrosoftAuth.buildString_5 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0935: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0938: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 093b: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 093e: athrow
      // 093f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0942: athrow
      // 0943: aload 29
      // 0945: invokestatic rip/breeze/MicrosoftAuth.getString (Ljava/lang/String;)Ljava/lang/String;
      // 0948: astore 30
      // 094a: aload 25
      // 094c: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 094f: aload 11
      // 0951: astore 8
      // 0953: aload 12
      // 0955: ifnull 0964
      // 0958: aload 12
      // 095a: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 095d: goto 0964
      // 0960: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0963: athrow
      // 0964: aload 30
      // 0966: areturn
      // 0967: aload 29
      // 0969: astore 7
      // 096b: aload 25
      // 096d: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0970: aload 11
      // 0972: astore 8
      // 0974: aload 12
      // 0976: ifnull 1739
      // 0979: aload 12
      // 097b: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 097e: iload 10
      // 0980: ifeq 1739
      // 0983: goto 098a
      // 0986: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0989: athrow
      // 098a: aload 5
      // 098c: sipush 14584
      // 098f: ldc2_w 2991644222563788564
      // 0992: lload 3
      // 0993: lxor
      // 0994: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0999: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099c: iload 28
      // 099e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09a1: sipush 30475
      // 09a4: ldc2_w 4976706738613316022
      // 09a7: lload 3
      // 09a8: lxor
      // 09a9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b1: pop
      // 09b2: iload 10
      // 09b4: ifeq 0a36
      // 09b7: iload 28
      // 09b9: sipush 200
      // 09bc: if_icmpne 0a07
      // 09bf: goto 09c6
      // 09c2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c5: athrow
      // 09c6: aload 25
      // 09c8: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 09cb: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 09ce: astore 14
      // 09d0: aload 22
      // 09d2: astore 7
      // 09d4: bipush 1
      // 09d5: istore 15
      // 09d7: aload 5
      // 09d9: sipush 13180
      // 09dc: ldc2_w 6672700382255754333
      // 09df: lload 3
      // 09e0: lxor
      // 09e1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e9: aload 14
      // 09eb: invokevirtual java/lang/String.length ()I
      // 09ee: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09f1: sipush 29335
      // 09f4: ldc2_w 3193852745032690987
      // 09f7: lload 3
      // 09f8: lxor
      // 09f9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a01: pop
      // 0a02: iload 10
      // 0a04: ifeq 0a36
      // 0a07: aload 5
      // 0a09: sipush 14584
      // 0a0c: ldc2_w 2991644222563788564
      // 0a0f: lload 3
      // 0a10: lxor
      // 0a11: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a16: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a19: iload 28
      // 0a1b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a1e: sipush 11995
      // 0a21: ldc2_w 3115010503484452937
      // 0a24: lload 3
      // 0a25: lxor
      // 0a26: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2e: pop
      // 0a2f: goto 0a36
      // 0a32: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a35: athrow
      // 0a36: aload 25
      // 0a38: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0a3b: goto 0a48
      // 0a3e: astore 38
      // 0a40: aload 25
      // 0a42: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0a45: aload 38
      // 0a47: athrow
      // 0a48: iload 10
      // 0a4a: ifeq 0b2a
      // 0a4d: new java/lang/StringBuilder
      // 0a50: dup
      // 0a51: aload 22
      // 0a53: ldc_w "?"
      // 0a56: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0a59: ifeq 0a7f
      // 0a5c: goto 0a63
      // 0a5f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a62: athrow
      // 0a63: new java/lang/StringBuilder
      // 0a66: dup
      // 0a67: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a6a: aload 22
      // 0a6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6f: ldc_w "&"
      // 0a72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a75: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a78: goto 0a94
      // 0a7b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7e: athrow
      // 0a7f: new java/lang/StringBuilder
      // 0a82: dup
      // 0a83: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a86: aload 22
      // 0a88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a8b: ldc_w "?"
      // 0a8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a94: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0a97: astore 25
      // 0a99: aload 24
      // 0a9b: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0aa0: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0aa5: astore 26
      // 0aa7: aload 26
      // 0aa9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0aae: ifeq 0b09
      // 0ab1: aload 26
      // 0ab3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ab8: checkcast java/util/Map$Entry
      // 0abb: astore 27
      // 0abd: aload 25
      // 0abf: aload 27
      // 0ac1: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0ac6: checkcast java/lang/String
      // 0ac9: sipush 17021
      // 0acc: ldc2_w 5054721224276466997
      // 0acf: lload 3
      // 0ad0: lxor
      // 0ad1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad6: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0ad9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0adc: bipush 61
      // 0ade: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0ae1: aload 27
      // 0ae3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0ae8: checkcast java/lang/String
      // 0aeb: sipush 17021
      // 0aee: ldc2_w 5054721224276466997
      // 0af1: lload 3
      // 0af2: lxor
      // 0af3: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af8: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0afb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0afe: bipush 38
      // 0b00: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b03: pop
      // 0b04: iload 10
      // 0b06: ifeq 0aa7
      // 0b09: aload 25
      // 0b0b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b0e: astore 7
      // 0b10: aload 11
      // 0b12: astore 8
      // 0b14: aload 12
      // 0b16: ifnull 1739
      // 0b19: aload 12
      // 0b1b: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0b1e: iload 10
      // 0b20: ifeq 1739
      // 0b23: goto 0b2a
      // 0b26: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b29: athrow
      // 0b2a: getstatic rip/breeze/MicrosoftAuth.CONST_B_2 Ljava/util/regex/Pattern;
      // 0b2d: aload 14
      // 0b2f: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0b32: astore 22
      // 0b34: aload 22
      // 0b36: invokevirtual java/util/regex/Matcher.find ()Z
      // 0b39: ifeq 1360
      // 0b3c: aload 22
      // 0b3e: bipush 1
      // 0b3f: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0b42: sipush 9940
      // 0b45: ldc2_w 7016596266379557159
      // 0b48: lload 3
      // 0b49: lxor
      // 0b4a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4f: ldc_w "&"
      // 0b52: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0b55: sipush 17522
      // 0b58: ldc2_w 6203777807142247381
      // 0b5b: lload 3
      // 0b5c: lxor
      // 0b5d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b62: ldc_w "&"
      // 0b65: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0b68: sipush 17392
      // 0b6b: ldc2_w 6484774891440397314
      // 0b6e: lload 3
      // 0b6f: lxor
      // 0b70: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b75: ldc_w "/"
      // 0b78: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0b7b: astore 23
      // 0b7d: getstatic rip/breeze/MicrosoftAuth.CONST_C_2 Ljava/util/regex/Pattern;
      // 0b80: aload 14
      // 0b82: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0b85: astore 24
      // 0b87: aload 24
      // 0b89: invokevirtual java/util/regex/Matcher.find ()Z
      // 0b8c: ifeq 0b9c
      // 0b8f: aload 24
      // 0b91: bipush 1
      // 0b92: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0b95: goto 0b9f
      // 0b98: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9b: athrow
      // 0b9c: ldc_w ""
      // 0b9f: astore 25
      // 0ba1: aload 25
      // 0ba3: invokevirtual java/lang/String.isEmpty ()Z
      // 0ba6: ifeq 0c10
      // 0ba9: getstatic rip/breeze/MicrosoftAuth.CONST_D_2 Ljava/util/regex/Pattern;
      // 0bac: aload 14
      // 0bae: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0bb1: astore 26
      // 0bb3: aload 26
      // 0bb5: invokevirtual java/util/regex/Matcher.find ()Z
      // 0bb8: ifeq 0c10
      // 0bbb: aload 26
      // 0bbd: bipush 1
      // 0bbe: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0bc1: sipush 12739
      // 0bc4: ldc2_w 6402595157406985912
      // 0bc7: lload 3
      // 0bc8: lxor
      // 0bc9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bce: ldc_w "\""
      // 0bd1: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0bd4: sipush 19945
      // 0bd7: ldc2_w 2412974352083702634
      // 0bda: lload 3
      // 0bdb: lxor
      // 0bdc: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be1: ldc_w "/"
      // 0be4: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0be7: astore 27
      // 0be9: sipush 25922
      // 0bec: ldc2_w 2477584743616772637
      // 0bef: lload 3
      // 0bf0: lxor
      // 0bf1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf6: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 0bf9: aload 27
      // 0bfb: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0bfe: astore 28
      // 0c00: aload 28
      // 0c02: invokevirtual java/util/regex/Matcher.find ()Z
      // 0c05: ifeq 0c10
      // 0c08: aload 28
      // 0c0a: bipush 1
      // 0c0b: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0c0e: astore 25
      // 0c10: getstatic rip/breeze/MicrosoftAuth.CONST_E_2 Ljava/util/regex/Pattern;
      // 0c13: aload 14
      // 0c15: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0c18: astore 26
      // 0c1a: aload 26
      // 0c1c: invokevirtual java/util/regex/Matcher.find ()Z
      // 0c1f: ifeq 0c2f
      // 0c22: aload 26
      // 0c24: bipush 1
      // 0c25: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0c28: goto 0c32
      // 0c2b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2e: athrow
      // 0c2f: ldc_w ""
      // 0c32: astore 27
      // 0c34: getstatic rip/breeze/MicrosoftAuth.CONST_F_2 Ljava/util/regex/Pattern;
      // 0c37: aload 14
      // 0c39: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0c3c: astore 28
      // 0c3e: aload 28
      // 0c40: invokevirtual java/util/regex/Matcher.find ()Z
      // 0c43: ifeq 0c53
      // 0c46: aload 28
      // 0c48: bipush 1
      // 0c49: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0c4c: goto 0c56
      // 0c4f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c52: athrow
      // 0c53: ldc_w ""
      // 0c56: astore 29
      // 0c58: getstatic rip/breeze/MicrosoftAuth.CONST_G_2 Ljava/util/regex/Pattern;
      // 0c5b: aload 14
      // 0c5d: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0c60: astore 30
      // 0c62: aload 30
      // 0c64: invokevirtual java/util/regex/Matcher.find ()Z
      // 0c67: ifeq 0c77
      // 0c6a: aload 30
      // 0c6c: bipush 1
      // 0c6d: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0c70: goto 0c7a
      // 0c73: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c76: athrow
      // 0c77: ldc_w ""
      // 0c7a: astore 31
      // 0c7c: getstatic rip/breeze/MicrosoftAuth.CONST_H_2 Ljava/util/regex/Pattern;
      // 0c7f: aload 14
      // 0c81: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0c84: astore 32
      // 0c86: aload 32
      // 0c88: invokevirtual java/util/regex/Matcher.find ()Z
      // 0c8b: ifeq 0c9b
      // 0c8e: aload 32
      // 0c90: bipush 1
      // 0c91: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0c94: goto 0c9e
      // 0c97: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9a: athrow
      // 0c9b: ldc_w ""
      // 0c9e: astore 33
      // 0ca0: getstatic rip/breeze/MicrosoftAuth.CONST_I_2 Ljava/util/regex/Pattern;
      // 0ca3: aload 14
      // 0ca5: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0ca8: astore 34
      // 0caa: aload 34
      // 0cac: invokevirtual java/util/regex/Matcher.find ()Z
      // 0caf: ifeq 0cbf
      // 0cb2: aload 34
      // 0cb4: bipush 1
      // 0cb5: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 0cb8: goto 0cc2
      // 0cbb: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cbe: athrow
      // 0cbf: ldc_w ""
      // 0cc2: astore 35
      // 0cc4: aload 29
      // 0cc6: sipush 8599
      // 0cc9: ldc2_w 4436504572726525461
      // 0ccc: lload 3
      // 0ccd: lxor
      // 0cce: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd3: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0cd6: ifeq 0cf0
      // 0cd9: aload 31
      // 0cdb: invokevirtual java/lang/String.isEmpty ()Z
      // 0cde: ifne 0cf0
      // 0ce1: goto 0ce8
      // 0ce4: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce7: athrow
      // 0ce8: bipush 1
      // 0ce9: goto 0cf1
      // 0cec: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cef: athrow
      // 0cf0: bipush 0
      // 0cf1: istore 36
      // 0cf3: new java/util/LinkedHashMap
      // 0cf6: dup
      // 0cf7: invokespecial java/util/LinkedHashMap.<init> ()V
      // 0cfa: astore 37
      // 0cfc: iload 36
      // 0cfe: ifeq 0d9e
      // 0d01: aload 37
      // 0d03: sipush 20183
      // 0d06: ldc2_w 3788613380833366392
      // 0d09: lload 3
      // 0d0a: lxor
      // 0d0b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d10: sipush 25761
      // 0d13: ldc2_w 1163081209040239113
      // 0d16: lload 3
      // 0d17: lxor
      // 0d18: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d22: pop
      // 0d23: aload 37
      // 0d25: sipush 21622
      // 0d28: ldc2_w 6097778632523402135
      // 0d2b: lload 3
      // 0d2c: lxor
      // 0d2d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d32: aload 31
      // 0d34: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d39: pop
      // 0d3a: aload 37
      // 0d3c: sipush 10681
      // 0d3f: ldc2_w 4342004432334370421
      // 0d42: lload 3
      // 0d43: lxor
      // 0d44: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d49: aload 31
      // 0d4b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d50: pop
      // 0d51: aload 37
      // 0d53: sipush 26129
      // 0d56: ldc2_w 7131623187900397919
      // 0d59: lload 3
      // 0d5a: lxor
      // 0d5b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d60: ldc_w ""
      // 0d63: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d68: pop
      // 0d69: aload 37
      // 0d6b: sipush 18615
      // 0d6e: ldc2_w 5734240475090409288
      // 0d71: lload 3
      // 0d72: lxor
      // 0d73: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d78: aload 33
      // 0d7a: invokevirtual java/lang/String.isEmpty ()Z
      // 0d7d: ifeq 0d91
      // 0d80: goto 0d87
      // 0d83: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d86: athrow
      // 0d87: ldc_w "2"
      // 0d8a: goto 0d93
      // 0d8d: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d90: athrow
      // 0d91: aload 33
      // 0d93: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d98: pop
      // 0d99: iload 10
      // 0d9b: ifeq 0dc7
      // 0d9e: aload 37
      // 0da0: sipush 30189
      // 0da3: ldc2_w 5242117847816006342
      // 0da6: lload 3
      // 0da7: lxor
      // 0da8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dad: sipush 15321
      // 0db0: ldc2_w 5211400445077693455
      // 0db3: lload 3
      // 0db4: lxor
      // 0db5: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0dbf: pop
      // 0dc0: goto 0dc7
      // 0dc3: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc6: athrow
      // 0dc7: aload 37
      // 0dc9: sipush 26219
      // 0dcc: ldc2_w 615015623140473316
      // 0dcf: lload 3
      // 0dd0: lxor
      // 0dd1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd6: ldc_w "1"
      // 0dd9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0dde: pop
      // 0ddf: aload 37
      // 0de1: sipush 32619
      // 0de4: ldc2_w 9053680612797866480
      // 0de7: lload 3
      // 0de8: lxor
      // 0de9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dee: ldc_w "1"
      // 0df1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0df6: pop
      // 0df7: aload 37
      // 0df9: sipush 32447
      // 0dfc: ldc2_w 1924932463484625360
      // 0dff: lload 3
      // 0e00: lxor
      // 0e01: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e06: ldc_w ""
      // 0e09: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e0e: pop
      // 0e0f: aload 37
      // 0e11: sipush 1637
      // 0e14: ldc2_w 322093170701048015
      // 0e17: lload 3
      // 0e18: lxor
      // 0e19: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1e: ldc_w "0"
      // 0e21: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e26: pop
      // 0e27: aload 37
      // 0e29: sipush 20728
      // 0e2c: ldc2_w 5532213320979566454
      // 0e2f: lload 3
      // 0e30: lxor
      // 0e31: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e36: ldc_w "0"
      // 0e39: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e3e: pop
      // 0e3f: aload 37
      // 0e41: sipush 31933
      // 0e44: ldc2_w 9155073753297806100
      // 0e47: lload 3
      // 0e48: lxor
      // 0e49: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4e: ldc_w "0"
      // 0e51: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e56: pop
      // 0e57: aload 37
      // 0e59: sipush 22122
      // 0e5c: ldc2_w 1639784916143688137
      // 0e5f: lload 3
      // 0e60: lxor
      // 0e61: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e66: ldc_w "1"
      // 0e69: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e6e: pop
      // 0e6f: aload 37
      // 0e71: sipush 14959
      // 0e74: ldc2_w 6369883581228754298
      // 0e77: lload 3
      // 0e78: lxor
      // 0e79: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7e: ldc_w "0"
      // 0e81: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e86: pop
      // 0e87: aload 37
      // 0e89: sipush 21791
      // 0e8c: ldc2_w 5721352065166494439
      // 0e8f: lload 3
      // 0e90: lxor
      // 0e91: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e96: ldc_w "1"
      // 0e99: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e9e: pop
      // 0e9f: aload 37
      // 0ea1: sipush 3021
      // 0ea4: ldc2_w 6919002342223811951
      // 0ea7: lload 3
      // 0ea8: lxor
      // 0ea9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eae: ldc_w "0"
      // 0eb1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0eb6: pop
      // 0eb7: aload 37
      // 0eb9: sipush 27469
      // 0ebc: ldc2_w 7554925183138788581
      // 0ebf: lload 3
      // 0ec0: lxor
      // 0ec1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec6: ldc_w "2"
      // 0ec9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ece: pop
      // 0ecf: aload 37
      // 0ed1: sipush 1823
      // 0ed4: ldc2_w 2214623648102717478
      // 0ed7: lload 3
      // 0ed8: lxor
      // 0ed9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ede: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ee1: sipush 25207
      // 0ee4: ldc2_w 4940700460410424172
      // 0ee7: lload 3
      // 0ee8: lxor
      // 0ee9: invokedynamic v (IJ)J bsm=rip/breeze/MicrosoftAuth.getCallSite_3 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eee: lrem
      // 0eef: invokestatic java/lang/String.valueOf (J)Ljava/lang/String;
      // 0ef2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ef7: pop
      // 0ef8: aload 25
      // 0efa: invokevirtual java/lang/String.isEmpty ()Z
      // 0efd: ifne 0f1e
      // 0f00: aload 37
      // 0f02: sipush 30063
      // 0f05: ldc2_w 1457261297071320056
      // 0f08: lload 3
      // 0f09: lxor
      // 0f0a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0f: aload 25
      // 0f11: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f16: pop
      // 0f17: goto 0f1e
      // 0f1a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1d: athrow
      // 0f1e: aload 27
      // 0f20: invokevirtual java/lang/String.isEmpty ()Z
      // 0f23: ifne 0f44
      // 0f26: aload 37
      // 0f28: sipush 12792
      // 0f2b: ldc2_w 6996779664551063170
      // 0f2e: lload 3
      // 0f2f: lxor
      // 0f30: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f35: aload 27
      // 0f37: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f3c: pop
      // 0f3d: goto 0f44
      // 0f40: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f43: athrow
      // 0f44: aload 35
      // 0f46: invokevirtual java/lang/String.isEmpty ()Z
      // 0f49: ifne 0f6a
      // 0f4c: aload 37
      // 0f4e: sipush 2985
      // 0f51: ldc2_w 7244491610743149591
      // 0f54: lload 3
      // 0f55: lxor
      // 0f56: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5b: aload 35
      // 0f5d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f62: pop
      // 0f63: goto 0f6a
      // 0f66: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f69: athrow
      // 0f6a: aload 5
      // 0f6c: sipush 16710
      // 0f6f: ldc2_w 786491345799372530
      // 0f72: lload 3
      // 0f73: lxor
      // 0f74: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f79: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f7c: aload 23
      // 0f7e: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 0f81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f84: sipush 6476
      // 0f87: ldc2_w 1867136409433573371
      // 0f8a: lload 3
      // 0f8b: lxor
      // 0f8c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f91: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f94: aload 25
      // 0f96: invokevirtual java/lang/String.isEmpty ()Z
      // 0f99: ifeq 0fb0
      // 0f9c: sipush 1022
      // 0f9f: ldc2_w 6966792033787419868
      // 0fa2: lload 3
      // 0fa3: lxor
      // 0fa4: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa9: goto 0fbd
      // 0fac: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0faf: athrow
      // 0fb0: sipush 27179
      // 0fb3: ldc2_w 6815020390591427848
      // 0fb6: lload 3
      // 0fb7: lxor
      // 0fb8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fbd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc0: sipush 27045
      // 0fc3: ldc2_w 6254583380811282036
      // 0fc6: lload 3
      // 0fc7: lxor
      // 0fc8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fcd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd0: aload 27
      // 0fd2: invokevirtual java/lang/String.isEmpty ()Z
      // 0fd5: ifeq 0fec
      // 0fd8: sipush 8410
      // 0fdb: ldc2_w 1964234050743353208
      // 0fde: lload 3
      // 0fdf: lxor
      // 0fe0: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe5: goto 0ff9
      // 0fe8: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0feb: athrow
      // 0fec: sipush 19719
      // 0fef: ldc2_w 8358972579725202021
      // 0ff2: lload 3
      // 0ff3: lxor
      // 0ff4: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ffc: sipush 3111
      // 0fff: ldc2_w 835955370942436194
      // 1002: lload 3
      // 1003: lxor
      // 1004: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1009: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100c: aload 29
      // 100e: invokevirtual java/lang/String.isEmpty ()Z
      // 1011: ifeq 101e
      // 1014: ldc_w "?"
      // 1017: goto 1020
      // 101a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101d: athrow
      // 101e: aload 29
      // 1020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1023: sipush 8225
      // 1026: ldc2_w 663864541869457364
      // 1029: lload 3
      // 102a: lxor
      // 102b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1030: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1033: iload 36
      // 1035: ifeq 1064
      // 1038: new java/lang/StringBuilder
      // 103b: dup
      // 103c: invokespecial java/lang/StringBuilder.<init> ()V
      // 103f: sipush 28377
      // 1042: ldc2_w 5168475519484784908
      // 1045: lload 3
      // 1046: lxor
      // 1047: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104f: aload 31
      // 1051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1054: ldc_w ")"
      // 1057: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 105d: goto 1071
      // 1060: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1063: athrow
      // 1064: sipush 3880
      // 1067: ldc2_w 9142950642121707610
      // 106a: lload 3
      // 106b: lxor
      // 106c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1074: sipush 13343
      // 1077: ldc2_w 5587474102908070865
      // 107a: lload 3
      // 107b: lxor
      // 107c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1084: pop
      // 1085: new java/net/URL
      // 1088: dup
      // 1089: aload 23
      // 108b: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 108e: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 1091: checkcast java/net/HttpURLConnection
      // 1094: astore 38
      // 1096: aload 38
      // 1098: bipush 0
      // 1099: invokevirtual java/net/HttpURLConnection.setInstanceFollowRedirects (Z)V
      // 109c: aload 38
      // 109e: sipush 9000
      // 10a1: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 10a4: aload 38
      // 10a6: sipush 12000
      // 10a9: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 10ac: aload 38
      // 10ae: sipush 24002
      // 10b1: ldc2_w 5289027556667572886
      // 10b4: lload 3
      // 10b5: lxor
      // 10b6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10bb: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 10be: aload 38
      // 10c0: bipush 1
      // 10c1: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 10c4: aload 38
      // 10c6: sipush 17392
      // 10c9: ldc2_w 1480666779563023699
      // 10cc: lload 3
      // 10cd: lxor
      // 10ce: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d3: aload 6
      // 10d5: invokestatic rip/breeze/MicrosoftAuth.buildString_6 (Ljava/util/Map;)Ljava/lang/String;
      // 10d8: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 10db: aload 38
      // 10dd: sipush 15354
      // 10e0: ldc2_w 5060081807133058376
      // 10e3: lload 3
      // 10e4: lxor
      // 10e5: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10ea: sipush 32018
      // 10ed: ldc2_w 6183292282923705231
      // 10f0: lload 3
      // 10f1: lxor
      // 10f2: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f7: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 10fa: aload 38
      // 10fc: aload 7
      // 10fe: bipush 1
      // 10ff: aload 23
      // 1101: invokestatic rip/breeze/MicrosoftAuth.processAll_6 (Ljava/net/HttpURLConnection;Ljava/lang/String;ZLjava/lang/String;)V
      // 1104: aload 37
      // 1106: invokestatic rip/breeze/MicrosoftAuth.buildString_7 (Ljava/util/Map;)Ljava/lang/String;
      // 1109: astore 39
      // 110b: aload 38
      // 110d: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 1110: astore 40
      // 1112: aload 40
      // 1114: aload 39
      // 1116: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 1119: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 111c: invokevirtual java/io/OutputStream.write ([B)V
      // 111f: aload 40
      // 1121: invokevirtual java/io/OutputStream.close ()V
      // 1124: goto 1131
      // 1127: astore 41
      // 1129: aload 40
      // 112b: invokevirtual java/io/OutputStream.close ()V
      // 112e: aload 41
      // 1130: athrow
      // 1131: aload 38
      // 1133: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 1136: istore 41
      // 1138: aload 38
      // 113a: aload 6
      // 113c: invokestatic rip/breeze/MicrosoftAuth.calculate (Ljava/net/HttpURLConnection;Ljava/util/Map;)V
      // 113f: iload 41
      // 1141: sipush 300
      // 1144: if_icmplt 12d3
      // 1147: iload 41
      // 1149: sipush 400
      // 114c: if_icmpge 12d3
      // 114f: goto 1156
      // 1152: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1155: athrow
      // 1156: aload 38
      // 1158: sipush 31531
      // 115b: ldc2_w 141454873130919010
      // 115e: lload 3
      // 115f: lxor
      // 1160: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1165: invokevirtual java/net/HttpURLConnection.getHeaderField (Ljava/lang/String;)Ljava/lang/String;
      // 1168: astore 42
      // 116a: aload 42
      // 116c: ifnull 12a6
      // 116f: aload 42
      // 1171: sipush 16382
      // 1174: ldc2_w 6542747272617107560
      // 1177: lload 3
      // 1178: lxor
      // 1179: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1181: ifne 11a2
      // 1184: goto 118b
      // 1187: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118a: athrow
      // 118b: new java/net/URL
      // 118e: dup
      // 118f: new java/net/URL
      // 1192: dup
      // 1193: aload 23
      // 1195: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 1198: aload 42
      // 119a: invokespecial java/net/URL.<init> (Ljava/net/URL;Ljava/lang/String;)V
      // 119d: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 11a0: astore 42
      // 11a2: aload 5
      // 11a4: sipush 14584
      // 11a7: ldc2_w 2991644222563788564
      // 11aa: lload 3
      // 11ab: lxor
      // 11ac: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b4: iload 41
      // 11b6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11b9: sipush 1981
      // 11bc: ldc2_w 4845380337625569353
      // 11bf: lload 3
      // 11c0: lxor
      // 11c1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c9: aload 42
      // 11cb: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 11ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d1: bipush 10
      // 11d3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 11d6: pop
      // 11d7: aload 42
      // 11d9: sipush 9003
      // 11dc: ldc2_w 621834529207041432
      // 11df: lload 3
      // 11e0: lxor
      // 11e1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 11e9: ifeq 1283
      // 11ec: aload 42
      // 11ee: sipush 1361
      // 11f1: ldc2_w 2875153138912205421
      // 11f4: lload 3
      // 11f5: lxor
      // 11f6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11fb: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 11fe: ifeq 1283
      // 1201: goto 1208
      // 1204: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1207: athrow
      // 1208: aload 42
      // 120a: sipush 25075
      // 120d: ldc2_w 7391518016416480923
      // 1210: lload 3
      // 1211: lxor
      // 1212: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1217: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 121a: ifeq 125f
      // 121d: goto 1224
      // 1220: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1223: athrow
      // 1224: new java/io/IOException
      // 1227: dup
      // 1228: new java/lang/StringBuilder
      // 122b: dup
      // 122c: invokespecial java/lang/StringBuilder.<init> ()V
      // 122f: sipush 11179
      // 1232: ldc2_w 6056647458677175353
      // 1235: lload 3
      // 1236: lxor
      // 1237: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123f: aload 42
      // 1241: sipush 19201
      // 1244: ldc2_w 3708593880292971741
      // 1247: lload 3
      // 1248: lxor
      // 1249: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124e: invokestatic rip/breeze/MicrosoftAuth.buildString_5 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1254: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1257: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 125a: athrow
      // 125b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125e: athrow
      // 125f: aload 42
      // 1261: invokestatic rip/breeze/MicrosoftAuth.getString (Ljava/lang/String;)Ljava/lang/String;
      // 1264: astore 43
      // 1266: aload 38
      // 1268: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 126b: aload 11
      // 126d: astore 8
      // 126f: aload 12
      // 1271: ifnull 1280
      // 1274: aload 12
      // 1276: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1279: goto 1280
      // 127c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127f: athrow
      // 1280: aload 43
      // 1282: areturn
      // 1283: aload 42
      // 1285: astore 7
      // 1287: aload 38
      // 1289: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 128c: aload 11
      // 128e: astore 8
      // 1290: aload 12
      // 1292: ifnull 1739
      // 1295: aload 12
      // 1297: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 129a: iload 10
      // 129c: ifeq 1739
      // 129f: goto 12a6
      // 12a2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a5: athrow
      // 12a6: aload 5
      // 12a8: sipush 14584
      // 12ab: ldc2_w 2991644222563788564
      // 12ae: lload 3
      // 12af: lxor
      // 12b0: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b8: iload 41
      // 12ba: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12bd: sipush 29763
      // 12c0: ldc2_w 7354997056523955006
      // 12c3: lload 3
      // 12c4: lxor
      // 12c5: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12cd: pop
      // 12ce: iload 10
      // 12d0: ifeq 134e
      // 12d3: iload 41
      // 12d5: sipush 200
      // 12d8: if_icmpne 131f
      // 12db: goto 12e2
      // 12de: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e1: athrow
      // 12e2: aload 38
      // 12e4: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 12e7: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 12ea: astore 14
      // 12ec: bipush 1
      // 12ed: istore 15
      // 12ef: aload 5
      // 12f1: sipush 28463
      // 12f4: ldc2_w 1445739990284169397
      // 12f7: lload 3
      // 12f8: lxor
      // 12f9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1301: aload 14
      // 1303: invokevirtual java/lang/String.length ()I
      // 1306: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1309: sipush 29335
      // 130c: ldc2_w 3193852745032690987
      // 130f: lload 3
      // 1310: lxor
      // 1311: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1316: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1319: pop
      // 131a: iload 10
      // 131c: ifeq 134e
      // 131f: aload 5
      // 1321: sipush 14584
      // 1324: ldc2_w 2991644222563788564
      // 1327: lload 3
      // 1328: lxor
      // 1329: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1331: iload 41
      // 1333: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1336: sipush 9366
      // 1339: ldc2_w 5281815797904685960
      // 133c: lload 3
      // 133d: lxor
      // 133e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1343: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1346: pop
      // 1347: goto 134e
      // 134a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134d: athrow
      // 134e: aload 38
      // 1350: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1353: goto 1360
      // 1356: astore 44
      // 1358: aload 38
      // 135a: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 135d: aload 44
      // 135f: athrow
      // 1360: iload 15
      // 1362: ifne 156a
      // 1365: getstatic rip/breeze/MicrosoftAuth.CONST_A_2 Ljava/util/regex/Pattern;
      // 1368: aload 14
      // 136a: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 136d: astore 23
      // 136f: aload 23
      // 1371: invokevirtual java/util/regex/Matcher.find ()Z
      // 1374: ifeq 1524
      // 1377: aload 23
      // 1379: bipush 1
      // 137a: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 137d: sipush 24748
      // 1380: ldc2_w 8731037343588548395
      // 1383: lload 3
      // 1384: lxor
      // 1385: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138a: ldc_w ":"
      // 138d: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 1390: sipush 17522
      // 1393: ldc2_w 6203777807142247381
      // 1396: lload 3
      // 1397: lxor
      // 1398: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139d: ldc_w "&"
      // 13a0: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 13a3: astore 24
      // 13a5: aload 24
      // 13a7: sipush 16382
      // 13aa: ldc2_w 6542747272617107560
      // 13ad: lload 3
      // 13ae: lxor
      // 13af: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b4: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 13b7: ifne 13d1
      // 13ba: new java/net/URL
      // 13bd: dup
      // 13be: new java/net/URL
      // 13c1: dup
      // 13c2: aload 7
      // 13c4: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 13c7: aload 24
      // 13c9: invokespecial java/net/URL.<init> (Ljava/net/URL;Ljava/lang/String;)V
      // 13cc: invokevirtual java/net/URL.toString ()Ljava/lang/String;
      // 13cf: astore 24
      // 13d1: aload 5
      // 13d3: sipush 5283
      // 13d6: ldc2_w 4505308064356502342
      // 13d9: lload 3
      // 13da: lxor
      // 13db: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13e3: aload 24
      // 13e5: invokestatic rip/breeze/MicrosoftAuth.buildString_8 (Ljava/lang/String;)Ljava/lang/String;
      // 13e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13eb: bipush 10
      // 13ed: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 13f0: pop
      // 13f1: aload 24
      // 13f3: sipush 29928
      // 13f6: ldc2_w 6307770399968782957
      // 13f9: lload 3
      // 13fa: lxor
      // 13fb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1400: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1403: ifne 1422
      // 1406: aload 24
      // 1408: sipush 13184
      // 140b: ldc2_w 3646866794308021268
      // 140e: lload 3
      // 140f: lxor
      // 1410: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1415: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1418: ifeq 143b
      // 141b: goto 1422
      // 141e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1421: athrow
      // 1422: new java/io/IOException
      // 1425: dup
      // 1426: sipush 23248
      // 1429: ldc2_w 8597467105371440206
      // 142c: lload 3
      // 142d: lxor
      // 142e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1433: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 1436: athrow
      // 1437: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143a: athrow
      // 143b: aload 24
      // 143d: sipush 4778
      // 1440: ldc2_w 8682231587177532868
      // 1443: lload 3
      // 1444: lxor
      // 1445: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 144d: ifeq 1506
      // 1450: aload 5
      // 1452: sipush 4246
      // 1455: ldc2_w 8437367177256242995
      // 1458: lload 3
      // 1459: lxor
      // 145a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1462: pop
      // 1463: new java/io/File
      // 1466: dup
      // 1467: sipush 3372
      // 146a: ldc2_w 7399510556844888601
      // 146d: lload 3
      // 146e: lxor
      // 146f: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1474: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 1477: sipush 29798
      // 147a: ldc2_w 8360166172178311985
      // 147d: lload 3
      // 147e: lxor
      // 147f: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1484: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1487: astore 25
      // 1489: aload 25
      // 148b: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 148e: aload 14
      // 1490: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 1493: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 1496: bipush 0
      // 1497: anewarray 903
      // 149a: invokestatic java/nio/file/Files.write (Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 149d: pop
      // 149e: aload 5
      // 14a0: sipush 1685
      // 14a3: ldc2_w 3426623426890832285
      // 14a6: lload 3
      // 14a7: lxor
      // 14a8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b0: aload 25
      // 14b2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 14b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b8: bipush 10
      // 14ba: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 14bd: pop
      // 14be: goto 14e3
      // 14c1: astore 25
      // 14c3: aload 5
      // 14c5: sipush 21527
      // 14c8: ldc2_w 5620806374743067499
      // 14cb: lload 3
      // 14cc: lxor
      // 14cd: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14d5: aload 25
      // 14d7: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 14da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14dd: bipush 10
      // 14df: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 14e2: pop
      // 14e3: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 14e6: aload 5
      // 14e8: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 14eb: aconst_null
      // 14ec: astore 25
      // 14ee: aload 11
      // 14f0: astore 8
      // 14f2: aload 12
      // 14f4: ifnull 1503
      // 14f7: aload 12
      // 14f9: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 14fc: goto 1503
      // 14ff: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1502: athrow
      // 1503: aload 25
      // 1505: areturn
      // 1506: aload 24
      // 1508: astore 7
      // 150a: aload 11
      // 150c: astore 8
      // 150e: aload 12
      // 1510: ifnull 1739
      // 1513: aload 12
      // 1515: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1518: iload 10
      // 151a: ifeq 1739
      // 151d: goto 1524
      // 1520: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1523: athrow
      // 1524: aload 5
      // 1526: sipush 20390
      // 1529: ldc2_w 9182279058832871440
      // 152c: lload 3
      // 152d: lxor
      // 152e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1533: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1536: aload 14
      // 1538: sipush 500
      // 153b: invokestatic rip/breeze/MicrosoftAuth.buildString_9 (Ljava/lang/String;I)Ljava/lang/String;
      // 153e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1541: bipush 10
      // 1543: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1546: pop
      // 1547: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 154a: aload 5
      // 154c: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 154f: aconst_null
      // 1550: astore 24
      // 1552: aload 11
      // 1554: astore 8
      // 1556: aload 12
      // 1558: ifnull 1567
      // 155b: aload 12
      // 155d: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1560: goto 1567
      // 1563: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1566: athrow
      // 1567: aload 24
      // 1569: areturn
      // 156a: iload 15
      // 156c: ifeq 157c
      // 156f: iload 16
      // 1571: bipush 5
      // 1572: if_icmplt 02dd
      // 1575: goto 157c
      // 1578: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157b: athrow
      // 157c: aload 5
      // 157e: sipush 27581
      // 1581: ldc2_w 3886700409663943764
      // 1584: lload 3
      // 1585: lxor
      // 1586: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158e: iload 16
      // 1590: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1593: sipush 16274
      // 1596: ldc2_w 6645915543309820055
      // 1599: lload 3
      // 159a: lxor
      // 159b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15a3: pop
      // 15a4: new java/io/File
      // 15a7: dup
      // 15a8: sipush 21006
      // 15ab: ldc2_w 6357355187773754692
      // 15ae: lload 3
      // 15af: lxor
      // 15b0: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b5: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 15b8: sipush 1947
      // 15bb: ldc2_w 8937455720985598219
      // 15be: lload 3
      // 15bf: lxor
      // 15c0: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c5: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 15c8: astore 17
      // 15ca: aload 17
      // 15cc: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 15cf: aload 14
      // 15d1: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 15d4: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 15d7: bipush 0
      // 15d8: anewarray 903
      // 15db: invokestatic java/nio/file/Files.write (Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 15de: pop
      // 15df: aload 5
      // 15e1: sipush 4714
      // 15e4: ldc2_w 1883163831925542374
      // 15e7: lload 3
      // 15e8: lxor
      // 15e9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15f1: aload 17
      // 15f3: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 15f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15f9: bipush 10
      // 15fb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 15fe: pop
      // 15ff: goto 1624
      // 1602: astore 17
      // 1604: aload 5
      // 1606: sipush 12512
      // 1609: ldc2_w 7517605880051511190
      // 160c: lload 3
      // 160d: lxor
      // 160e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1613: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1616: aload 17
      // 1618: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 161b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161e: bipush 10
      // 1620: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1623: pop
      // 1624: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 1627: aload 5
      // 1629: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 162c: aconst_null
      // 162d: astore 17
      // 162f: aload 11
      // 1631: astore 8
      // 1633: aload 12
      // 1635: ifnull 1644
      // 1638: aload 12
      // 163a: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 163d: goto 1644
      // 1640: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1643: athrow
      // 1644: aload 17
      // 1646: areturn
      // 1647: aload 5
      // 1649: sipush 10218
      // 164c: ldc2_w 8236859397747488927
      // 164f: lload 3
      // 1650: lxor
      // 1651: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1656: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1659: pop
      // 165a: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 165d: aload 5
      // 165f: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1662: aconst_null
      // 1663: astore 14
      // 1665: aload 11
      // 1667: astore 8
      // 1669: aload 12
      // 166b: ifnull 167a
      // 166e: aload 12
      // 1670: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1673: goto 167a
      // 1676: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1679: athrow
      // 167a: aload 14
      // 167c: areturn
      // 167d: aload 11
      // 167f: astore 8
      // 1681: aload 12
      // 1683: ifnull 1739
      // 1686: aload 12
      // 1688: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 168b: goto 1739
      // 168e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1691: athrow
      // 1692: astore 13
      // 1694: aload 5
      // 1696: sipush 1996
      // 1699: ldc2_w 4529725229451548708
      // 169c: lload 3
      // 169d: lxor
      // 169e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a6: aload 13
      // 16a8: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 16ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16ae: bipush 10
      // 16b0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 16b3: pop
      // 16b4: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 16b7: aload 5
      // 16b9: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 16bc: aload 13
      // 16be: athrow
      // 16bf: astore 13
      // 16c1: aload 5
      // 16c3: sipush 27126
      // 16c6: ldc2_w 6275505899224528726
      // 16c9: lload 3
      // 16ca: lxor
      // 16cb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d3: aload 13
      // 16d5: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 16d8: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 16db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16de: sipush 16901
      // 16e1: ldc2_w 1588636863453453651
      // 16e4: lload 3
      // 16e5: lxor
      // 16e6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16ee: aload 13
      // 16f0: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 16f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f6: bipush 10
      // 16f8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 16fb: pop
      // 16fc: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 16ff: aload 5
      // 1701: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 1704: aconst_null
      // 1705: astore 14
      // 1707: aload 11
      // 1709: astore 8
      // 170b: aload 12
      // 170d: ifnull 171c
      // 1710: aload 12
      // 1712: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1715: goto 171c
      // 1718: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171b: athrow
      // 171c: aload 14
      // 171e: areturn
      // 171f: astore 45
      // 1721: aload 11
      // 1723: astore 8
      // 1725: aload 12
      // 1727: ifnull 1736
      // 172a: aload 12
      // 172c: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 172f: goto 1736
      // 1732: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1735: athrow
      // 1736: aload 45
      // 1738: athrow
      // 1739: iinc 9 1
      // 173c: iload 10
      // 173e: ifeq 006b
      // 1741: aload 5
      // 1743: sipush 29962
      // 1746: ldc2_w 5160422656696806099
      // 1749: lload 3
      // 174a: lxor
      // 174b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1750: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1753: pop
      // 1754: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 1757: aload 5
      // 1759: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 175c: aconst_null
      // 175d: areturn
      // try (112 -> 131): 132 java/io/IOException
      // try (830 -> 835): 838 null
      // try (838 -> 839): 838 null
      // try (929 -> 962): 962 java/io/IOException
      // try (918 -> 937): 938 java/io/IOException
      // try (889 -> 926): 927 java/io/IOException
      // try (866 -> 876): 877 java/io/IOException
      // try (846 -> 855): 856 java/io/IOException
      // try (779 -> 967): 1068 null
      // try (980 -> 982): 1068 null
      // try (1027 -> 1062): 1063 java/io/IOException
      // try (995 -> 1016): 1017 java/io/IOException
      // try (995 -> 1065): 1068 null
      // try (1068 -> 1069): 1068 null
      // try (1754 -> 1759): 1762 null
      // try (1762 -> 1763): 1762 null
      // try (1853 -> 1886): 1886 java/io/IOException
      // try (1842 -> 1861): 1862 java/io/IOException
      // try (1813 -> 1850): 1851 java/io/IOException
      // try (1790 -> 1800): 1801 java/io/IOException
      // try (1770 -> 1779): 1780 java/io/IOException
      // try (1703 -> 1891): 1990 null
      // try (1904 -> 1906): 1990 null
      // try (1949 -> 1984): 1985 java/io/IOException
      // try (1919 -> 1940): 1941 java/io/IOException
      // try (1919 -> 1987): 1990 null
      // try (1990 -> 1991): 1990 null
      // try (2099 -> 2136): 2137 java/io/IOException
      // try (2234 -> 2271): 2272 java/io/IOException
      // try (53 -> 161): 2335 java/io/IOException
      // try (222 -> 255): 255 java/io/IOException
      // try (211 -> 230): 231 java/io/IOException
      // try (190 -> 219): 220 java/io/IOException
      // try (172 -> 260): 2335 java/io/IOException
      // try (697 -> 721): 722 java/io/IOException
      // try (687 -> 705): 706 java/io/IOException
      // try (653 -> 657): 658 java/io/IOException
      // try (625 -> 637): 638 java/io/IOException
      // try (614 -> 633): 634 java/io/IOException
      // try (606 -> 622): 623 java/io/IOException
      // try (589 -> 601): 602 java/io/IOException
      // try (578 -> 597): 598 java/io/IOException
      // try (567 -> 586): 587 java/io/IOException
      // try (556 -> 575): 576 java/io/IOException
      // try (545 -> 564): 565 java/io/IOException
      // try (537 -> 553): 554 java/io/IOException
      // try (507 -> 519): 520 java/io/IOException
      // try (499 -> 515): 516 java/io/IOException
      // try (484 -> 496): 497 java/io/IOException
      // try (473 -> 492): 493 java/io/IOException
      // try (462 -> 481): 482 java/io/IOException
      // try (451 -> 470): 471 java/io/IOException
      // try (443 -> 459): 460 java/io/IOException
      // try (416 -> 430): 430 java/io/IOException
      // try (413 -> 423): 424 java/io/IOException
      // try (353 -> 360): 360 java/io/IOException
      // try (332 -> 336): 336 java/io/IOException
      // try (271 -> 969): 2335 java/io/IOException
      // try (980 -> 984): 2335 java/io/IOException
      // try (1075 -> 1093): 1093 java/io/IOException
      // try (1073 -> 1081): 1082 java/io/IOException
      // try (995 -> 1147): 2335 java/io/IOException
      // try (1657 -> 1681): 1681 java/io/IOException
      // try (1642 -> 1654): 1654 java/io/IOException
      // try (1619 -> 1635): 1635 java/io/IOException
      // try (1587 -> 1612): 1612 java/io/IOException
      // try (1572 -> 1584): 1585 java/io/IOException
      // try (1557 -> 1569): 1570 java/io/IOException
      // try (1427 -> 1554): 1555 java/io/IOException
      // try (1407 -> 1424): 1425 java/io/IOException
      // try (1350 -> 1404): 1404 java/io/IOException
      // try (1348 -> 1399): 1400 java/io/IOException
      // try (1332 -> 1340): 1340 java/io/IOException
      // try (1324 -> 1335): 1336 java/io/IOException
      // try (1313 -> 1320): 1320 java/io/IOException
      // try (1298 -> 1305): 1305 java/io/IOException
      // try (1283 -> 1290): 1290 java/io/IOException
      // try (1268 -> 1275): 1275 java/io/IOException
      // try (1253 -> 1260): 1260 java/io/IOException
      // try (1194 -> 1201): 1201 java/io/IOException
      // try (1158 -> 1893): 2335 java/io/IOException
      // try (1904 -> 1908): 2335 java/io/IOException
      // try (2061 -> 2081): 2081 java/io/IOException
      // try (2040 -> 2069): 2070 java/io/IOException
      // try (1919 -> 2156): 2335 java/io/IOException
      // try (2167 -> 2169): 2335 java/io/IOException
      // try (2180 -> 2199): 2335 java/io/IOException
      // try (2210 -> 2215): 2216 java/io/IOException
      // try (2210 -> 2291): 2335 java/io/IOException
      // try (2302 -> 2315): 2335 java/io/IOException
      // try (53 -> 161): 2354 java/lang/Exception
      // try (172 -> 260): 2354 java/lang/Exception
      // try (271 -> 969): 2354 java/lang/Exception
      // try (980 -> 984): 2354 java/lang/Exception
      // try (995 -> 1147): 2354 java/lang/Exception
      // try (1158 -> 1893): 2354 java/lang/Exception
      // try (1904 -> 1908): 2354 java/lang/Exception
      // try (1919 -> 2156): 2354 java/lang/Exception
      // try (2167 -> 2169): 2354 java/lang/Exception
      // try (2180 -> 2199): 2354 java/lang/Exception
      // try (2210 -> 2291): 2354 java/lang/Exception
      // try (2302 -> 2315): 2354 java/lang/Exception
      // try (53 -> 161): 2394 null
      // try (163 -> 167): 168 java/io/IOException
      // try (172 -> 260): 2394 null
      // try (262 -> 266): 267 java/io/IOException
      // try (271 -> 969): 2394 null
      // try (971 -> 975): 976 java/io/IOException
      // try (980 -> 984): 2394 null
      // try (986 -> 992): 993 java/io/IOException
      // try (995 -> 1147): 2394 null
      // try (1149 -> 1155): 1156 java/io/IOException
      // try (1158 -> 1893): 2394 null
      // try (1895 -> 1899): 1900 java/io/IOException
      // try (1904 -> 1908): 2394 null
      // try (1910 -> 1916): 1917 java/io/IOException
      // try (1919 -> 2156): 2394 null
      // try (2158 -> 2162): 2163 java/io/IOException
      // try (2167 -> 2169): 2394 null
      // try (2171 -> 2177): 2178 java/io/IOException
      // try (2180 -> 2199): 2394 null
      // try (2201 -> 2205): 2206 java/io/IOException
      // try (2210 -> 2291): 2394 null
      // try (2293 -> 2297): 2298 java/io/IOException
      // try (2302 -> 2315): 2394 null
      // try (2328 -> 2333): 2333 java/io/IOException
      // try (2317 -> 2321): 2322 java/io/IOException
      // try (2335 -> 2383): 2394 null
      // try (2385 -> 2389): 2390 java/io/IOException
      // try (2394 -> 2395): 2394 null
      // try (2397 -> 2401): 2402 java/io/IOException
   }

   private static String getString(String var0) {
      long var1 = 30475638909830L;
      return buildString_5(var0, "XboxLive.signin offline_access");
   }

   private static String buildString_5(String var0, String var1) {
      long var2 = 96786390113908L;
      int var10000 = getValue_2();
      int var4 = var0.indexOf(63);
      int var5 = var10000;

      try {
         if (var4 < 0) {
            return null;
         }
      } catch (Exception var15) {
         throw getException(var15);
      }

      String[] var6 = var0.substring(var4 + 1).split("&");

      for (String var10 : var6) {
         int var11 = var10.indexOf(61);

         label34: {
            try {
               if (var11 < 0) {
                  break label34;
               }
            } catch (Exception var14) {
               throw getException(var14);
            }

            try {
               String var12 = URLDecoder.decode(var10.substring(0, var11), "\\baction\\s*=\\s*\"([^\"]+)\"");
               if (var1.equals(var12)) {
                  return URLDecoder.decode(var10.substring(var11 + 1), "\\baction\\s*=\\s*\"([^\"]+)\"");
               }
            } catch (Exception var13) {
            }
         }

         if (var5 == 0) {
            break;
         }
      }

      return null;
   }

   private static LinkedHashMap<String, String> getLinkedHashMap(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 03: ldc2_w 108833117564662
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/MicrosoftAuth.getValue ()I
      // 0b: new java/util/LinkedHashMap
      // 0e: dup
      // 0f: invokespecial java/util/LinkedHashMap.<init> ()V
      // 12: astore 3
      // 13: istore 4
      // 15: aload 0
      // 16: ifnull 27
      // 19: aload 0
      // 1a: invokevirtual java/lang/String.isEmpty ()Z
      // 1d: ifeq 2d
      // 20: goto 27
      // 23: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 3
      // 28: areturn
      // 29: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: ldc_w ";"
      // 31: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 34: astore 5
      // 36: aload 5
      // 38: arraylength
      // 39: istore 6
      // 3b: bipush 0
      // 3c: istore 7
      // 3e: iload 7
      // 40: iload 6
      // 42: if_icmpge 8c
      // 45: aload 5
      // 47: iload 7
      // 49: aaload
      // 4a: astore 8
      // 4c: aload 8
      // 4e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 51: astore 8
      // 53: aload 8
      // 55: bipush 61
      // 57: invokevirtual java/lang/String.indexOf (I)I
      // 5a: istore 9
      // 5c: iload 9
      // 5e: ifle 84
      // 61: aload 3
      // 62: aload 8
      // 64: bipush 0
      // 65: iload 9
      // 67: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6d: aload 8
      // 6f: iload 9
      // 71: bipush 1
      // 72: iadd
      // 73: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 76: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 79: invokevirtual java/util/LinkedHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 7c: pop
      // 7d: goto 84
      // 80: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: iinc 7 1
      // 87: iload 4
      // 89: ifeq 3e
      // 8c: aload 3
      // 8d: areturn
      // try (10 -> 15): 16 java/time/format/DateTimeParseException
      // try (12 -> 20): 20 java/time/format/DateTimeParseException
      // try (45 -> 61): 62 java/time/format/DateTimeParseException
   }

   private static String buildString_6(Map<String, String> var0) {
      long var1 = 129724078459863L;
      int var10000 = getValue();
      StringBuilder var3 = new StringBuilder();
      int var4 = var10000;

      for (Entry var6 : var0.entrySet()) {
         try {
            if (!checkCondition((String)var6.getKey())) {
               continue;
            }
         } catch (DateTimeParseException var8) {
            throw getException(var8);
         }

         try {
            if (var3.length() > 0) {
               var3.append("https://api.minecraftservices.com/minecraft/profile");
            }
         } catch (DateTimeParseException var7) {
            throw getException(var7);
         }

         var3.append((String)var6.getKey()).append('=').append((String)var6.getValue());
         if (var4 != 0) {
            break;
         }
      }

      return var3.toString();
   }

   private static void calculate(HttpURLConnection var0, Map<String, String> var1) {
      long var2 = 43589245983391L;
      int var10000 = getValue_2();
      List var4 = var0.getHeaderFields().get("<form([^>]*?)>");
      int var5 = var10000;

      try {
         if (var4 == null) {
            return;
         }
      } catch (DateTimeParseException var11) {
         throw getException(var11);
      }

      for (String var7 : var4) {
         String var8 = var7.split(";")[0].trim();
         int var9 = var8.indexOf(61);

         try {
            if (var9 > 0) {
               var1.put(var8.substring(0, var9).trim(), var8.substring(var9 + 1).trim());
            }
         } catch (DateTimeParseException var10) {
            throw getException(var10);
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   public Util12 getBreezeUtil115(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 99073130781909
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 28552396640440
      // 00d: lxor
      // 00e: dup2
      // 00f: bipush 48
      // 011: lushr
      // 012: l2i
      // 013: istore 4
      // 015: dup2
      // 016: bipush 16
      // 018: lshl
      // 019: bipush 32
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 5
      // 01f: dup2
      // 020: bipush 48
      // 022: lshl
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 6
      // 029: pop2
      // 02a: pop2
      // 02b: aload 1
      // 02c: ifnull 03d
      // 02f: aload 1
      // 030: invokevirtual java/lang/String.isEmpty ()Z
      // 033: ifeq 043
      // 036: goto 03d
      // 039: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: aconst_null
      // 03e: areturn
      // 03f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: aconst_null
      // 044: astore 7
      // 046: new java/net/URL
      // 049: dup
      // 04a: sipush 12600
      // 04d: ldc2_w 3378678785048288751
      // 050: lload 2
      // 051: lxor
      // 052: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 05a: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 05d: checkcast java/net/HttpURLConnection
      // 060: astore 7
      // 062: aload 7
      // 064: sipush 6000
      // 067: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 06a: aload 7
      // 06c: sipush 8000
      // 06f: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 072: aload 7
      // 074: sipush 4415
      // 077: ldc2_w 2337302543670820293
      // 07a: lload 2
      // 07b: lxor
      // 07c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 084: aload 7
      // 086: sipush 27448
      // 089: ldc2_w 589295881507980831
      // 08c: lload 2
      // 08d: lxor
      // 08e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: sipush 21370
      // 09d: ldc2_w 5822966425924796009
      // 0a0: lload 2
      // 0a1: lxor
      // 0a2: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: aload 1
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b1: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0b4: aload 7
      // 0b6: sipush 8931
      // 0b9: ldc2_w 2350615606087847900
      // 0bc: lload 2
      // 0bd: lxor
      // 0be: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: sipush 28296
      // 0c6: ldc2_w 6326755434746561296
      // 0c9: lload 2
      // 0ca: lxor
      // 0cb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0d3: aload 7
      // 0d5: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 0d8: istore 8
      // 0da: iload 8
      // 0dc: sipush 200
      // 0df: if_icmpeq 0f9
      // 0e2: aconst_null
      // 0e3: astore 9
      // 0e5: aload 7
      // 0e7: ifnull 0f6
      // 0ea: aload 7
      // 0ec: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0ef: goto 0f6
      // 0f2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: aload 9
      // 0f8: areturn
      // 0f9: aload 7
      // 0fb: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 0fe: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 101: astore 9
      // 103: aload 9
      // 105: invokestatic rip/breeze/MicrosoftAuth.getUserTheme_3 (Ljava/lang/String;)Lrip/breeze/client/UserTheme;
      // 108: astore 10
      // 10a: aload 10
      // 10c: sipush 18327
      // 10f: ldc2_w 989340448864365383
      // 112: lload 2
      // 113: lxor
      // 114: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 11c: ifeq 143
      // 11f: aload 10
      // 121: sipush 5827
      // 124: ldc2_w 1183213921575123945
      // 127: lload 2
      // 128: lxor
      // 129: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 131: iload 4
      // 133: i2c
      // 134: iload 5
      // 136: iload 6
      // 138: i2s
      // 139: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 13c: goto 144
      // 13f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aconst_null
      // 144: astore 11
      // 146: aload 10
      // 148: sipush 20120
      // 14b: ldc2_w 6106305034682557438
      // 14e: lload 2
      // 14f: lxor
      // 150: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 158: ifeq 17f
      // 15b: aload 10
      // 15d: sipush 13710
      // 160: ldc2_w 2816132257895028923
      // 163: lload 2
      // 164: lxor
      // 165: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 16d: iload 4
      // 16f: i2c
      // 170: iload 5
      // 172: iload 6
      // 174: i2s
      // 175: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 178: goto 180
      // 17b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: aconst_null
      // 180: astore 12
      // 182: aload 11
      // 184: ifnull 193
      // 187: aload 12
      // 189: ifnonnull 1aa
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: aconst_null
      // 194: astore 13
      // 196: aload 7
      // 198: ifnull 1a7
      // 19b: aload 7
      // 19d: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1a0: goto 1a7
      // 1a3: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: aload 13
      // 1a9: areturn
      // 1aa: new rip/breeze/Util12
      // 1ad: dup
      // 1ae: aload 11
      // 1b0: invokestatic rip/breeze/MicrosoftAuth.buildString_11 (Ljava/lang/String;)Ljava/lang/String;
      // 1b3: aload 12
      // 1b5: invokespecial rip/breeze/Util12.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1b8: astore 13
      // 1ba: aload 7
      // 1bc: ifnull 1cb
      // 1bf: aload 7
      // 1c1: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: aload 13
      // 1cd: areturn
      // 1ce: astore 14
      // 1d0: aload 7
      // 1d2: ifnull 1e1
      // 1d5: aload 7
      // 1d7: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1da: goto 1e1
      // 1dd: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: aload 14
      // 1e3: athrow
      // try (31 -> 39): 39 java/io/IOException
      // try (29 -> 34): 35 java/io/IOException
      // try (43 -> 106): 208 null
      // try (174 -> 178): 179 java/io/IOException
      // try (148 -> 170): 170 java/io/IOException
      // try (122 -> 144): 144 java/io/IOException
      // try (106 -> 110): 111 java/io/IOException
      // try (115 -> 183): 208 null
      // try (183 -> 187): 188 java/io/IOException
      // try (192 -> 199): 208 null
      // try (199 -> 203): 204 java/io/IOException
      // try (208 -> 209): 208 null
      // try (209 -> 213): 214 java/io/IOException
   }

   public void processAll(String param1, Consumer<Util12> param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 03: ldc2_w 43961647165442
      // 06: lxor
      // 07: lstore 3
      // 08: aload 1
      // 09: ifnull 1a
      // 0c: aload 1
      // 0d: invokevirtual java/lang/String.isEmpty ()Z
      // 10: ifeq 26
      // 13: goto 1a
      // 16: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 2
      // 1b: aconst_null
      // 1c: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 21: return
      // 22: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: new rip/breeze/BreezeTask2
      // 2a: dup
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 2
      // 2e: invokespecial rip/breeze/BreezeTask2.<init> (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;Ljava/util/function/Consumer;)V
      // 31: invokespecial rip/breeze/MicrosoftAuth.processAll_5 (Ljava/lang/Runnable;)V
      // 34: return
      // try (4 -> 9): 10 java/time/format/DateTimeParseException
      // try (6 -> 16): 16 java/time/format/DateTimeParseException
   }

   public void processAll_2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 38842133408356
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 25838285198225
      // 00d: lxor
      // 00e: lstore 3
      // 00f: dup2
      // 010: ldc2_w 22956716749697
      // 013: lxor
      // 014: dup2
      // 015: bipush 32
      // 017: lushr
      // 018: l2i
      // 019: istore 5
      // 01b: dup2
      // 01c: bipush 32
      // 01e: lshl
      // 01f: bipush 56
      // 021: lushr
      // 022: l2i
      // 023: istore 6
      // 025: dup2
      // 026: bipush 40
      // 028: lshl
      // 029: bipush 40
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 7
      // 02f: pop2
      // 030: pop2
      // 031: invokestatic rip/breeze/MicrosoftAuth.getValue_2 ()I
      // 034: bipush 1
      // 035: anewarray 235
      // 038: dup
      // 039: bipush 0
      // 03a: sipush 17028
      // 03d: ldc2_w 8881848814058592710
      // 040: lload 1
      // 041: lxor
      // 042: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: aastore
      // 048: invokestatic rip/breeze/HttpUtil2.getFile_2 ([Ljava/lang/String;)Ljava/io/File;
      // 04b: astore 8
      // 04d: getstatic rip/breeze/BreezeContext.cloudAuthService_h Lrip/breeze/CloudAuthService;
      // 050: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 053: ldc2_w -7401148088058583783
      // 056: lload 1
      // 057: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05f: checkcast [B
      // 062: goto 069
      // 065: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 068: athrow
      // 069: astore 9
      // 06b: istore 10
      // 06d: aload 9
      // 06f: ifnull 07f
      // 072: aload 9
      // 074: arraylength
      // 075: ifne 095
      // 078: goto 07f
      // 07b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: sipush 21130
      // 083: ldc2_w 1009464001266305487
      // 086: lload 1
      // 087: lxor
      // 088: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: invokespecial rip/breeze/MicrosoftAuth.processAll_8 (Ljava/lang/String;)V
      // 090: return
      // 091: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: new rip/breeze/client/BreezeIterable
      // 098: dup
      // 099: invokespecial rip/breeze/client/BreezeIterable.<init> ()V
      // 09c: astore 11
      // 09e: aload 0
      // 09f: getfield rip/breeze/MicrosoftAuth.arrayList_z Ljava/util/ArrayList;
      // 0a2: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0a5: astore 12
      // 0a7: aload 12
      // 0a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ae: ifeq 0cf
      // 0b1: aload 12
      // 0b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b8: checkcast rip/breeze/StringDecryptHelper4
      // 0bb: astore 13
      // 0bd: aload 11
      // 0bf: aload 13
      // 0c1: invokevirtual rip/breeze/StringDecryptHelper4.getUserTheme ()Lrip/breeze/client/UserTheme;
      // 0c4: lload 3
      // 0c5: dup2_x1
      // 0c6: pop2
      // 0c7: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // 0ca: iload 10
      // 0cc: ifne 0a7
      // 0cf: aload 0
      // 0d0: getfield rip/breeze/MicrosoftAuth.dataBuilder5_p Lrip/breeze/client/MathUtil11;
      // 0d3: aload 11
      // 0d5: iload 5
      // 0d7: iload 6
      // 0d9: i2b
      // 0da: iload 7
      // 0dc: invokevirtual rip/breeze/client/MathUtil11.buildString (Lrip/breeze/client/PlayerUtil8;IBI)Ljava/lang/String;
      // 0df: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 0e2: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 0e5: astore 12
      // 0e7: aload 0
      // 0e8: aload 9
      // 0ea: aload 12
      // 0ec: invokespecial rip/breeze/MicrosoftAuth.encryptBytes ([B[B)[B
      // 0ef: astore 13
      // 0f1: aload 8
      // 0f3: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0f6: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 0f9: bipush 0
      // 0fa: anewarray 1141
      // 0fd: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 100: pop
      // 101: new java/io/File
      // 104: dup
      // 105: aload 8
      // 107: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 10a: new java/lang/StringBuilder
      // 10d: dup
      // 10e: invokespecial java/lang/StringBuilder.<init> ()V
      // 111: aload 8
      // 113: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: sipush 28170
      // 11c: ldc2_w 8596412847362143719
      // 11f: lload 1
      // 120: lxor
      // 121: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12c: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 12f: astore 14
      // 131: new java/io/FileOutputStream
      // 134: dup
      // 135: aload 14
      // 137: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 13a: astore 15
      // 13c: aload 15
      // 13e: aload 13
      // 140: invokevirtual java/io/FileOutputStream.write ([B)V
      // 143: aload 15
      // 145: invokevirtual java/io/FileOutputStream.close ()V
      // 148: goto 155
      // 14b: astore 16
      // 14d: aload 15
      // 14f: invokevirtual java/io/FileOutputStream.close ()V
      // 152: aload 16
      // 154: athrow
      // 155: aload 8
      // 157: invokevirtual java/io/File.exists ()Z
      // 15a: ifeq 16a
      // 15d: aload 8
      // 15f: invokevirtual java/io/File.delete ()Z
      // 162: pop
      // 163: goto 16a
      // 166: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 14
      // 16c: aload 8
      // 16e: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 171: ifne 199
      // 174: aload 14
      // 176: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 179: aload 8
      // 17b: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 17e: bipush 1
      // 17f: anewarray 1169
      // 182: dup
      // 183: bipush 0
      // 184: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING Ljava/nio/file/StandardCopyOption;
      // 187: aastore
      // 188: invokestatic java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
      // 18b: pop
      // 18c: aload 14
      // 18e: invokevirtual java/io/File.delete ()Z
      // 191: pop
      // 192: goto 199
      // 195: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: goto 1bc
      // 19c: astore 16
      // 19e: aload 14
      // 1a0: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 1a3: aload 8
      // 1a5: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 1a8: bipush 1
      // 1a9: anewarray 1169
      // 1ac: dup
      // 1ad: bipush 0
      // 1ae: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING Ljava/nio/file/StandardCopyOption;
      // 1b1: aastore
      // 1b2: invokestatic java/nio/file/Files.copy (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
      // 1b5: pop
      // 1b6: aload 14
      // 1b8: invokevirtual java/io/File.delete ()Z
      // 1bb: pop
      // 1bc: goto 1e7
      // 1bf: astore 11
      // 1c1: aload 0
      // 1c2: new java/lang/StringBuilder
      // 1c5: dup
      // 1c6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c9: sipush 4657
      // 1cc: ldc2_w 3320521915472841088
      // 1cf: lload 1
      // 1d0: lxor
      // 1d1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d9: aload 11
      // 1db: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e4: invokespecial rip/breeze/MicrosoftAuth.processAll_8 (Ljava/lang/String;)V
      // 1e7: return
      // try (53 -> 55): 56 java/lang/reflect/InvocationTargetException
      // try (62 -> 76): 76 java/io/IOException
      // try (60 -> 65): 66 java/io/IOException
      // try (149 -> 152): 155 null
      // try (155 -> 156): 155 null
      // try (169 -> 188): 189 java/time/format/DateTimeParseException
      // try (160 -> 166): 167 java/io/IOException
      // try (169 -> 191): 192 java/io/IOException
      // try (78 -> 208): 209 java/lang/Exception
   }

   public void sleep() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 26927092064826
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 123408659473953
      // 00d: lxor
      // 00e: lstore 3
      // 00f: pop2
      // 010: invokestatic rip/breeze/MicrosoftAuth.getValue_2 ()I
      // 013: bipush 1
      // 014: anewarray 235
      // 017: dup
      // 018: bipush 0
      // 019: sipush 26863
      // 01c: ldc2_w 5880228714442488829
      // 01f: lload 1
      // 020: lxor
      // 021: pop2
      // 022: pop
      // 023: ldc_w "accounts"
      // 026: aastore
      // 027: invokestatic rip/breeze/HttpUtil2.getFile_2 ([Ljava/lang/String;)Ljava/io/File;
      // 02a: astore 5
      // 02c: istore 6
      // 02e: getstatic rip/breeze/BreezeContext.cloudAuthService_h Lrip/breeze/CloudAuthService;
      // 031: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 034: ldc2_w 1231712680480697671
      // 037: lload 1
      // 038: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 03b: dup_x2
      // 03c: pop
      // 03d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast [B
      // 043: goto 04a
      // 046: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 049: athrow
      // 04a: astore 7
      // 04c: aload 7
      // 04e: ifnull 05e
      // 051: aload 7
      // 053: arraylength
      // 054: ifne 074
      // 057: goto 05e
      // 05a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: sipush 16700
      // 062: ldc2_w 8307966365958034118
      // 065: lload 1
      // 066: lxor
      // 067: pop2
      // 068: pop
      // 069: ldc_w "Load failed: "
      // 06c: invokespecial rip/breeze/MicrosoftAuth.processAll_8 (Ljava/lang/String;)V
      // 06f: return
      // 070: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 5
      // 076: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 079: invokestatic java/nio/file/Files.readAllBytes (Ljava/nio/file/Path;)[B
      // 07c: astore 8
      // 07e: aload 0
      // 07f: aload 7
      // 081: aload 8
      // 083: invokespecial rip/breeze/MicrosoftAuth.decryptBytes ([B[B)[B
      // 086: astore 9
      // 088: new java/lang/String
      // 08b: dup
      // 08c: aload 9
      // 08e: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 091: invokespecial java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
      // 094: invokestatic rip/breeze/MicrosoftAuth.getBreezeIterable (Ljava/lang/String;)Lrip/breeze/client/BreezeIterable;
      // 097: astore 10
      // 099: sipush 26680
      // 09c: ldc2_w 8942459995028573569
      // 09f: lload 1
      // 0a0: lxor
      // 0a1: invokedynamic v (IJ)J bsm=rip/breeze/MicrosoftAuth.getCallSite_3 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: invokestatic java/lang/Thread.sleep (J)V
      // 0a9: goto 0b4
      // 0ac: astore 11
      // 0ae: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 0b1: invokevirtual java/lang/Thread.interrupt ()V
      // 0b4: bipush 1
      // 0b5: istore 11
      // 0b7: aload 10
      // 0b9: invokevirtual rip/breeze/client/BreezeIterable.iterator ()Ljava/util/Iterator;
      // 0bc: astore 12
      // 0be: aload 12
      // 0c0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c5: ifeq 17b
      // 0c8: aload 12
      // 0ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cf: checkcast rip/breeze/client/PlayerUtil8
      // 0d2: astore 13
      // 0d4: iload 11
      // 0d6: ifne 0f8
      // 0d9: sipush 14093
      // 0dc: ldc2_w 4360480550971806389
      // 0df: lload 1
      // 0e0: lxor
      // 0e1: invokedynamic v (IJ)J bsm=rip/breeze/MicrosoftAuth.getCallSite_3 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: invokestatic java/lang/Thread.sleep (J)V
      // 0e9: goto 0f8
      // 0ec: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: astore 14
      // 0f2: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 0f5: invokevirtual java/lang/Thread.interrupt ()V
      // 0f8: bipush 0
      // 0f9: istore 11
      // 0fb: aload 13
      // 0fd: lload 3
      // 0fe: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 101: invokestatic rip/breeze/StringDecryptHelper4.isActive (Lrip/breeze/client/UserTheme;)Lrip/breeze/StringDecryptHelper4;
      // 104: astore 14
      // 106: aload 0
      // 107: aload 14
      // 109: invokevirtual rip/breeze/MicrosoftAuth.checkCondition_2 (Lrip/breeze/StringDecryptHelper4;)Z
      // 10c: pop
      // 10d: aload 0
      // 10e: aload 14
      // 110: invokevirtual rip/breeze/StringDecryptHelper4.getString_k ()Ljava/lang/String;
      // 113: invokevirtual rip/breeze/MicrosoftAuth.getBreezeUtil115 (Ljava/lang/String;)Lrip/breeze/Util12;
      // 116: astore 15
      // 118: aload 15
      // 11a: ifnull 164
      // 11d: aload 14
      // 11f: aload 15
      // 121: getfield rip/breeze/Util12.string_a Ljava/lang/String;
      // 124: invokevirtual rip/breeze/StringDecryptHelper4.setString_a (Ljava/lang/String;)V
      // 127: aload 14
      // 129: aload 15
      // 12b: getfield rip/breeze/Util12.string_b Ljava/lang/String;
      // 12e: invokevirtual rip/breeze/StringDecryptHelper4.setString_b (Ljava/lang/String;)V
      // 131: aload 14
      // 133: bipush 1
      // 134: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 137: aload 14
      // 139: invokestatic java/lang/System.currentTimeMillis ()J
      // 13c: invokevirtual rip/breeze/StringDecryptHelper4.setLong_n (J)V
      // 13f: aload 0
      // 140: getfield rip/breeze/MicrosoftAuth.biConsumer_r Ljava/util/function/BiConsumer;
      // 143: aload 14
      // 145: bipush 0
      // 146: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 149: invokeinterface java/util/function/BiConsumer.accept (Ljava/lang/Object;Ljava/lang/Object;)V 3
      // 14e: aload 0
      // 14f: getfield rip/breeze/MicrosoftAuth.arrayList_z Ljava/util/ArrayList;
      // 152: aload 14
      // 154: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 157: pop
      // 158: iload 6
      // 15a: ifne 171
      // 15d: goto 164
      // 160: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 14
      // 166: bipush 0
      // 167: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: goto 176
      // 174: astore 14
      // 176: iload 6
      // 178: ifne 0be
      // 17b: goto 1a6
      // 17e: astore 8
      // 180: aload 0
      // 181: new java/lang/StringBuilder
      // 184: dup
      // 185: invokespecial java/lang/StringBuilder.<init> ()V
      // 188: sipush 8932
      // 18b: ldc2_w 1849950068400501167
      // 18e: lload 1
      // 18f: lxor
      // 190: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: aload 8
      // 19a: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 19d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a3: invokespecial rip/breeze/MicrosoftAuth.processAll_8 (Ljava/lang/String;)V
      // 1a6: return
      // try (33 -> 35): 36 java/lang/reflect/InvocationTargetException
      // try (41 -> 57): 57 java/lang/InterruptedException
      // try (39 -> 44): 45 java/lang/InterruptedException
      // try (75 -> 81): 82 java/lang/InterruptedException
      // try (99 -> 105): 108 java/lang/InterruptedException
      // try (129 -> 162): 163 java/lang/InterruptedException
      // try (127 -> 156): 157 java/lang/InterruptedException
      // try (97 -> 106): 106 java/time/format/DateTimeParseException
      // try (113 -> 165): 166 java/lang/Exception
      // try (59 -> 169): 170 java/lang/Exception
   }

   public boolean checkCondition_2(StringDecryptHelper4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 22162191776688
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: ifnonnull 012
      // 00c: bipush 0
      // 00d: ireturn
      // 00e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 011: athrow
      // 012: invokestatic java/lang/System.currentTimeMillis ()J
      // 015: lstore 4
      // 017: aload 1
      // 018: invokevirtual rip/breeze/StringDecryptHelper4.getString_c ()Ljava/lang/String;
      // 01b: ifnull 02f
      // 01e: lload 4
      // 020: aload 1
      // 021: invokevirtual rip/breeze/StringDecryptHelper4.getLong_e ()J
      // 024: lcmp
      // 025: iflt 037
      // 028: goto 02f
      // 02b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: bipush 1
      // 030: goto 038
      // 033: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: bipush 0
      // 038: istore 6
      // 03a: aload 1
      // 03b: invokevirtual rip/breeze/StringDecryptHelper4.getString_f ()Ljava/lang/String;
      // 03e: ifnull 060
      // 041: aload 1
      // 042: invokevirtual rip/breeze/StringDecryptHelper4.getString_g ()Ljava/lang/String;
      // 045: ifnull 060
      // 048: goto 04f
      // 04b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: lload 4
      // 051: aload 1
      // 052: invokevirtual rip/breeze/StringDecryptHelper4.getLong_h ()J
      // 055: lcmp
      // 056: iflt 068
      // 059: goto 060
      // 05c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: bipush 1
      // 061: goto 069
      // 064: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: bipush 0
      // 069: istore 7
      // 06b: aload 1
      // 06c: invokevirtual rip/breeze/StringDecryptHelper4.getString_i ()Ljava/lang/String;
      // 06f: ifnull 083
      // 072: lload 4
      // 074: aload 1
      // 075: invokevirtual rip/breeze/StringDecryptHelper4.getLong_j ()J
      // 078: lcmp
      // 079: iflt 08b
      // 07c: goto 083
      // 07f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: bipush 1
      // 084: goto 08c
      // 087: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: bipush 0
      // 08c: istore 8
      // 08e: aload 1
      // 08f: invokevirtual rip/breeze/StringDecryptHelper4.getString_k ()Ljava/lang/String;
      // 092: ifnull 0a6
      // 095: lload 4
      // 097: aload 1
      // 098: invokevirtual rip/breeze/StringDecryptHelper4.getLong_l ()J
      // 09b: lcmp
      // 09c: iflt 0ae
      // 09f: goto 0a6
      // 0a2: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: bipush 1
      // 0a7: goto 0af
      // 0aa: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: bipush 0
      // 0af: istore 9
      // 0b1: iload 6
      // 0b3: ifeq 0f8
      // 0b6: aload 1
      // 0b7: invokevirtual rip/breeze/StringDecryptHelper4.getString_d ()Ljava/lang/String;
      // 0ba: astore 10
      // 0bc: aload 10
      // 0be: ifnull 0d0
      // 0c1: aload 10
      // 0c3: invokevirtual java/lang/String.isEmpty ()Z
      // 0c6: ifeq 0d2
      // 0c9: goto 0d0
      // 0cc: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: bipush 0
      // 0d1: ireturn
      // 0d2: aload 0
      // 0d3: aload 10
      // 0d5: invokespecial rip/breeze/MicrosoftAuth.getBreezeUtil114_2 (Ljava/lang/String;)Lrip/breeze/Util11;
      // 0d8: astore 11
      // 0da: aload 1
      // 0db: aload 11
      // 0dd: getfield rip/breeze/Util11.string_a Ljava/lang/String;
      // 0e0: invokevirtual rip/breeze/StringDecryptHelper4.setString_c (Ljava/lang/String;)V
      // 0e3: aload 1
      // 0e4: aload 11
      // 0e6: getfield rip/breeze/Util11.string_b Ljava/lang/String;
      // 0e9: invokevirtual rip/breeze/StringDecryptHelper4.setString_d (Ljava/lang/String;)V
      // 0ec: aload 1
      // 0ed: aload 11
      // 0ef: getfield rip/breeze/Util11.fieldLong_c J
      // 0f2: invokestatic rip/breeze/MicrosoftAuth.clamp (J)J
      // 0f5: invokevirtual rip/breeze/StringDecryptHelper4.setLong_e (J)V
      // 0f8: iload 9
      // 0fa: ifne 104
      // 0fd: aload 1
      // 0fe: bipush 1
      // 0ff: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 102: bipush 1
      // 103: ireturn
      // 104: iload 8
      // 106: ifeq 1b8
      // 109: iload 7
      // 10b: ifeq 19c
      // 10e: goto 115
      // 111: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 1
      // 116: invokevirtual rip/breeze/StringDecryptHelper4.getString_c ()Ljava/lang/String;
      // 119: ifnull 135
      // 11c: goto 123
      // 11f: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: invokestatic java/lang/System.currentTimeMillis ()J
      // 126: aload 1
      // 127: invokevirtual rip/breeze/StringDecryptHelper4.getLong_e ()J
      // 12a: lcmp
      // 12b: iflt 177
      // 12e: goto 135
      // 131: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 1
      // 136: invokevirtual rip/breeze/StringDecryptHelper4.getString_d ()Ljava/lang/String;
      // 139: astore 10
      // 13b: aload 10
      // 13d: ifnull 14f
      // 140: aload 10
      // 142: invokevirtual java/lang/String.isEmpty ()Z
      // 145: ifeq 151
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: bipush 0
      // 150: ireturn
      // 151: aload 0
      // 152: aload 10
      // 154: invokespecial rip/breeze/MicrosoftAuth.getBreezeUtil114_2 (Ljava/lang/String;)Lrip/breeze/Util11;
      // 157: astore 11
      // 159: aload 1
      // 15a: aload 11
      // 15c: getfield rip/breeze/Util11.string_a Ljava/lang/String;
      // 15f: invokevirtual rip/breeze/StringDecryptHelper4.setString_c (Ljava/lang/String;)V
      // 162: aload 1
      // 163: aload 11
      // 165: getfield rip/breeze/Util11.string_b Ljava/lang/String;
      // 168: invokevirtual rip/breeze/StringDecryptHelper4.setString_d (Ljava/lang/String;)V
      // 16b: aload 1
      // 16c: aload 11
      // 16e: getfield rip/breeze/Util11.fieldLong_c J
      // 171: invokestatic rip/breeze/MicrosoftAuth.clamp (J)J
      // 174: invokevirtual rip/breeze/StringDecryptHelper4.setLong_e (J)V
      // 177: aload 0
      // 178: aload 1
      // 179: invokevirtual rip/breeze/StringDecryptHelper4.getString_c ()Ljava/lang/String;
      // 17c: invokespecial rip/breeze/MicrosoftAuth.getBreezeUtil116 (Ljava/lang/String;)Lrip/breeze/Util13;
      // 17f: astore 10
      // 181: aload 1
      // 182: aload 10
      // 184: getfield rip/breeze/Util13.string_a Ljava/lang/String;
      // 187: invokevirtual rip/breeze/StringDecryptHelper4.setString_f (Ljava/lang/String;)V
      // 18a: aload 1
      // 18b: aload 10
      // 18d: getfield rip/breeze/Util13.string_b Ljava/lang/String;
      // 190: invokevirtual rip/breeze/StringDecryptHelper4.setString_g (Ljava/lang/String;)V
      // 193: aload 1
      // 194: aload 10
      // 196: getfield rip/breeze/Util13.fieldLong_c J
      // 199: invokevirtual rip/breeze/StringDecryptHelper4.setLong_h (J)V
      // 19c: aload 0
      // 19d: aload 1
      // 19e: invokevirtual rip/breeze/StringDecryptHelper4.getString_f ()Ljava/lang/String;
      // 1a1: invokespecial rip/breeze/MicrosoftAuth.getBreezeUtil117 (Ljava/lang/String;)Lrip/breeze/Util14;
      // 1a4: astore 10
      // 1a6: aload 1
      // 1a7: aload 10
      // 1a9: getfield rip/breeze/Util14.string_a Ljava/lang/String;
      // 1ac: invokevirtual rip/breeze/StringDecryptHelper4.setString_i (Ljava/lang/String;)V
      // 1af: aload 1
      // 1b0: aload 10
      // 1b2: getfield rip/breeze/Util14.fieldLong_b J
      // 1b5: invokevirtual rip/breeze/StringDecryptHelper4.setLong_j (J)V
      // 1b8: aload 0
      // 1b9: aload 1
      // 1ba: invokevirtual rip/breeze/StringDecryptHelper4.getString_i ()Ljava/lang/String;
      // 1bd: aload 1
      // 1be: invokevirtual rip/breeze/StringDecryptHelper4.getString_g ()Ljava/lang/String;
      // 1c1: invokespecial rip/breeze/MicrosoftAuth.getBreezeUtil113 (Ljava/lang/String;Ljava/lang/String;)Lrip/breeze/Util10;
      // 1c4: astore 10
      // 1c6: aload 1
      // 1c7: aload 10
      // 1c9: getfield rip/breeze/Util10.string_a Ljava/lang/String;
      // 1cc: invokevirtual rip/breeze/StringDecryptHelper4.setString_k (Ljava/lang/String;)V
      // 1cf: aload 1
      // 1d0: aload 10
      // 1d2: getfield rip/breeze/Util10.fieldLong_b J
      // 1d5: invokestatic rip/breeze/MicrosoftAuth.clamp (J)J
      // 1d8: invokevirtual rip/breeze/StringDecryptHelper4.setLong_l (J)V
      // 1db: aload 1
      // 1dc: invokestatic java/lang/System.currentTimeMillis ()J
      // 1df: invokevirtual rip/breeze/StringDecryptHelper4.setLong_n (J)V
      // 1e2: aload 1
      // 1e3: bipush 1
      // 1e4: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 1e7: bipush 1
      // 1e8: ireturn
      // 1e9: astore 10
      // 1eb: aload 0
      // 1ec: new java/lang/StringBuilder
      // 1ef: dup
      // 1f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f3: sipush 9388
      // 1f6: ldc2_w 7162900421067615890
      // 1f9: lload 2
      // 1fa: lxor
      // 1fb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: aload 10
      // 205: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 208: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20e: invokespecial rip/breeze/MicrosoftAuth.processAll_8 (Ljava/lang/String;)V
      // 211: aload 1
      // 212: bipush 0
      // 213: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 216: bipush 0
      // 217: ireturn
      // try (91 -> 96): 97 java/lang/Exception
      // try (72 -> 82): 82 java/lang/Exception
      // try (69 -> 77): 78 java/lang/Exception
      // try (55 -> 65): 65 java/lang/Exception
      // try (52 -> 60): 61 java/lang/Exception
      // try (38 -> 48): 48 java/lang/Exception
      // try (32 -> 43): 44 java/lang/Exception
      // try (29 -> 35): 36 java/lang/Exception
      // try (15 -> 25): 25 java/lang/Exception
      // try (12 -> 20): 21 java/lang/Exception
      // try (4 -> 8): 8 java/lang/Exception
      // try (86 -> 100): 230 java/lang/Exception
      // try (101 -> 124): 230 java/lang/Exception
      // try (149 -> 154): 155 java/lang/Exception
      // try (132 -> 143): 144 java/lang/Exception
      // try (127 -> 135): 136 java/lang/Exception
      // try (125 -> 129): 130 java/lang/Exception
      // try (125 -> 158): 230 java/lang/Exception
      // try (159 -> 229): 230 java/lang/Exception
   }

   private void update_2() {
      byte[] var1 = new byte[32];
      this.secureRandom_q.nextBytes(var1);
      this.string_x = getString_2(var1);
      this.string_y = buildString_15(this.string_x);
   }

   private Util11 getBreezeUtil114(String var1, String var2) throws IOException {
      long var3 = 77318883867903L;
      long var5 = var3 ^ 139081057165385L;
      long var10001 = var3 ^ 6316440050418L;
      int var7 = (int)((var3 ^ 6316440050418L) >>> 48);
      int var8 = (int)((var3 ^ 6316440050418L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      LinkedHashMap var10 = new LinkedHashMap();
      var10.put("\"sPOST_Username\"\\s*:\\s*\"([^\"]+)\"", "\"sCtx\"\\s*:\\s*\"([^\"]+)\"");
      var10.put("grant_type", "\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"");
      var10.put("\\baction\\s*=\\s*\"([^\"]+)\"", var1);
      var10.put("\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"", var2);
      var10.put("https://user.auth.xboxlive.com/user/authenticate", this.string_x);
      UserTheme var11 = this.getUserTheme("\"urlPost\"\\s*:\\s*\"([^\"]+)\"", var10);
      String var12 = var11.getDataBuilder2_2("\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"").buildString((char)var7, var8, (short)var9);
      String var13 = var11.getDataBuilder2_2("\\bmethod\\s*=\\s*\"?(get|post)\"?").buildString((char)var7, var8, (short)var9);
      long var14 = var11.getDataBuilder2_2("/auth/callback").getLong(var5);
      return new Util11(var12, var13, var14);
   }

   private Util11 getBreezeUtil114_2(String var1) throws IOException {
      long var2 = 10885248688764L;
      long var4 = var2 ^ 54743837392586L;
      long var10001 = var2 ^ 81410950988913L;
      int var6 = (int)((var2 ^ 81410950988913L) >>> 48);
      int var7 = (int)((var2 ^ 81410950988913L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      LinkedHashMap var9 = new LinkedHashMap();
      var9.put("<(?:input|button)([^>]*?)(?:/)?>", "\\baction\\s*=\\s*\"([^\"]+)\"");
      var9.put("<form([^>]*?)>", "\\baction\\s*=\\s*\"([^\"]+)\"");
      var9.put("\\bmethod\\s*=\\s*\"?(get|post)\"?", var1);
      UserTheme var10 = this.getUserTheme("\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"", var9);
      String var11 = var10.getDataBuilder2_2("\\bmethod\\s*=\\s*\"?(get|post)\"?").buildString((char)var6, var7, (short)var8);
      String var12 = var10.getDataBuilder2_2("\\bmethod\\s*=\\s*\"?(get|post)\"?").buildString((char)var6, var7, (short)var8);
      long var13 = var10.getDataBuilder2_2("/auth/callback").getLong(var4);
      return new Util11(var11, var12, var13);
   }

   private Util13 getBreezeUtil116(String var1) throws IOException {
      long var2 = 137021704056976L;
      long var10001 = var2 ^ 69760004789917L;
      int var4 = (int)((var2 ^ 69760004789917L) >>> 48);
      int var5 = (int)((var2 ^ 69760004789917L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 136654868459701L;
      long var9 = var2 ^ 77807335018981L;
      long var11 = var2 ^ 22947933806315L;
      UserTheme var13 = new UserTheme();
      var13.update("<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)", "\\baction\\s*=\\s*\"([^\"]+)\"", var7);
      var13.update("\"urlPost\"\\s*:\\s*\"([^\"]+)\"", "쁫.ʣU", var7);
      var13.update("\"sPOST_Username\"\\s*:\\s*\"([^\"]+)\"", "https://api.minecraftservices.com/authentication/login_with_xbox" + var1, var7);
      UserTheme var14 = new UserTheme();
      var14.processNullable("\"sCtx\"\\s*:\\s*\"([^\"]+)\"", var9, var13);
      var14.update("\"sCtx\"\\s*:\\s*\"([^\"]+)\"", "\"sPageId\"\\s*:\\s*\"([^\"]+)\"", var7);
      var14.update("/auth/callback", "\\baction\\s*=\\s*\"([^\"]+)\"", var7);
      UserTheme var15 = this.getUserTheme_2("\\bmethod\\s*=\\s*\"?(get|post)\"?", var14);
      String var16 = var15.getDataBuilder2_2("\"sPOST_PaginatedLoginState\"\\s*:\\s*\"([^\"]+)\"").buildString((char)var4, var5, (short)var6);
      String var17 = null;
      if (var15.isValid("\\bmethod\\s*=\\s*\"?(get|post)\"?")) {
         try {
            label29: {
               UserTheme var18 = var15.getUserTheme("4976cd9d-40aa-4a29-8951-199d743ed64f");
               BreezeIterable var19 = var18.getBreezeIterable("\"sPageId\"\\s*:\\s*\"([^\"]+)\"");

               try {
                  if (var19 == null || var19.getValue() <= 0) {
                     break label29;
                  }
               } catch (Exception var23) {
                  throw getException(var23);
               }

               UserTheme var20 = var19.getDataBuilder2(0).getUserTheme(var11);
               if (var20.isValid("\"(?:sFT|sft|flowToken)\"\\s*:\\s*\"([^\"]+)\"")) {
                  var17 = var20.getDataBuilder2_2("/auth/callback").buildString((char)var4, var5, (short)var6);
               }
            }
         } catch (Exception var24) {
         }
      }

      long var21 = getLong(var15, "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)");
      return new Util13(var16, var17, var21);
   }

   private Util14 getBreezeUtil117(String var1) throws IOException {
      long var2 = 97533895345941L;
      long var4 = var2 ^ 90600411699206L;
      long var10001 = var2 ^ 30066861842712L;
      int var6 = (int)((var2 ^ 30066861842712L) >>> 48);
      int var7 = (int)((var2 ^ 30066861842712L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 97183436408624L;
      long var11 = var2 ^ 119403101328512L;
      long var13 = var2 ^ 108756461430368L;
      UserTheme var15 = new UserTheme();
      var15.update("\"sPageId\"\\s*:\\s*\"([^\"]+)\"", "https://xsts.auth.xboxlive.com/xsts/authorize", var9);
      BreezeIterable var16 = new BreezeIterable();
      var16.processNullable(var11, new rip.breeze.client.Util138(var4, var1));
      var15.processNullable("4976cd9d-40aa-4a29-8951-199d743ed64f", var13, var16);
      UserTheme var17 = new UserTheme();
      var17.processNullable("https://api.minecraftservices.com/authentication/login_with_xbox", var13, var15);
      var17.update("\"(?:sFT|sft|flowToken)\"\\s*:\\s*\"([^\"]+)\"", "\\baction\\s*=\\s*\"([^\"]+)\"", var9);
      var17.update("https://xsts.auth.xboxlive.com/xsts/authorize", "\\bmethod\\s*=\\s*\"?(get|post)\"?", var9);
      UserTheme var18 = this.getUserTheme_2("\\baction\\s*=\\s*\"([^\"]+)\"", var17);
      String var19 = var18.getDataBuilder2_2("Token").buildString((char)var6, var7, (short)var8);
      long var20 = getLong(var18, "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)");
      return new Util14(var19, var20);
   }

   private Util10 getBreezeUtil113(String var1, String var2) throws IOException {
      long var3 = 125946794216153L;
      long var5 = var3 ^ 82051666843247L;
      long var10001 = var3 ^ 54292016737492L;
      int var7 = (int)((var3 ^ 54292016737492L) >>> 48);
      int var8 = (int)((var3 ^ 54292016737492L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var3 ^ 125739143072508L;
      String var12 = "\"sCtx\"\\s*:\\s*\"([^\"]+)\"" + var2 + ";" + var1;
      UserTheme var13 = new UserTheme();
      var13.update("/auth/callback", var12, var10);
      UserTheme var14 = this.getUserTheme_2("\"sPOST_Username\"\\s*:\\s*\"([^\"]+)\"", var13);
      String var15 = var14.getDataBuilder2_2("\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"").buildString((char)var7, var8, (short)var9);
      long var16 = var14.getDataBuilder2_2("/auth/callback").getLong(var5);
      return new Util10(var15, var16);
   }

   private void processAll_3() {
      long var1 = 50261430291648L;

      try {
         try {
            short var10003 = 9003;
            long var10004 = 621862213952533931L ^ var1;
            this.httpServer_u = HttpServer.create(new InetSocketAddress("127.0.0.1", "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)"), 0);
         } catch (BindException var4) {
            this.httpServer_u = HttpServer.create(
               new InetSocketAddress("\\baction\\s*=\\s*\"([^\"]+)\"", "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)"), 0
            );
         }

         this.fieldInt_v = this.httpServer_u.getAddress().getPort();
         this.httpServer_u.createContext("\"sFTTag\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\"", new DelayedPacket(this, null));
         this.httpServer_u.setExecutor(null);
         this.httpServer_u.start();
      } catch (IOException var5) {
         this.processAll_8("\"sPageId\"\\s*:\\s*\"([^\"]+)\"" + var5.getMessage());
      }
   }

   public void processAll_4() {
      long var1 = 128737951445976L;

      try {
         if (this.httpServer_u != null) {
            this.httpServer_u.stop(0);
            this.httpServer_u = null;
         }
      } catch (DateTimeParseException var3) {
         throw getException(var3);
      }
   }

   private void processAll_5(Runnable var1) {
      long var2 = 9181054306457L;

      try {
         BreezeContext.breezeUtil26_l.initialize_2(var1);
      } catch (Throwable var5) {
         new Thread(var1, "\\baction\\s*=\\s*\"([^\"]+)\"").start();
      }
   }

   private UserTheme getUserTheme(String param1, Map<String, String> param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 80033633138771
      // 006: lxor
      // 007: lstore 3
      // 008: aconst_null
      // 009: astore 5
      // 00b: new java/net/URL
      // 00e: dup
      // 00f: aload 1
      // 010: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 013: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 016: checkcast java/net/HttpURLConnection
      // 019: astore 5
      // 01b: aload 5
      // 01d: sipush 9000
      // 020: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 023: aload 5
      // 025: sipush 12000
      // 028: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 02b: aload 5
      // 02d: sipush 24002
      // 030: ldc2_w 5289051840557503574
      // 033: lload 3
      // 034: lxor
      // 035: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 03d: aload 5
      // 03f: bipush 1
      // 040: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 043: aload 5
      // 045: sipush 32435
      // 048: ldc2_w 5592564084294711051
      // 04b: lload 3
      // 04c: lxor
      // 04d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: sipush 14030
      // 055: ldc2_w 3519382214185631488
      // 058: lload 3
      // 059: lxor
      // 05a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 062: aload 5
      // 064: sipush 15354
      // 067: ldc2_w 5060110505993515912
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: sipush 32018
      // 074: ldc2_w 6183281451173606735
      // 077: lload 3
      // 078: lxor
      // 079: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 081: aload 2
      // 082: invokestatic rip/breeze/MicrosoftAuth.buildString_7 (Ljava/util/Map;)Ljava/lang/String;
      // 085: astore 6
      // 087: aload 5
      // 089: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 08c: astore 7
      // 08e: aload 7
      // 090: aload 6
      // 092: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 095: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 098: invokevirtual java/io/OutputStream.write ([B)V
      // 09b: aload 7
      // 09d: invokevirtual java/io/OutputStream.close ()V
      // 0a0: goto 0ad
      // 0a3: astore 8
      // 0a5: aload 7
      // 0a7: invokevirtual java/io/OutputStream.close ()V
      // 0aa: aload 8
      // 0ac: athrow
      // 0ad: aload 5
      // 0af: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 0b2: istore 8
      // 0b4: iload 8
      // 0b6: sipush 200
      // 0b9: if_icmplt 0d7
      // 0bc: iload 8
      // 0be: sipush 300
      // 0c1: if_icmpge 0d7
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 0d0: goto 0dc
      // 0d3: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 5
      // 0d9: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 0dc: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 0df: astore 9
      // 0e1: iload 8
      // 0e3: sipush 200
      // 0e6: if_icmplt 0f8
      // 0e9: iload 8
      // 0eb: sipush 300
      // 0ee: if_icmplt 138
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: new java/io/IOException
      // 0fb: dup
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: sipush 27666
      // 106: ldc2_w 1991398608840614990
      // 109: lload 3
      // 10a: lxor
      // 10b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: iload 8
      // 115: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 118: sipush 30567
      // 11b: ldc2_w 6271315393529020166
      // 11e: lload 3
      // 11f: lxor
      // 120: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 9
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 130: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 133: athrow
      // 134: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 9
      // 13a: invokestatic rip/breeze/MicrosoftAuth.getUserTheme_3 (Ljava/lang/String;)Lrip/breeze/client/UserTheme;
      // 13d: astore 10
      // 13f: aload 5
      // 141: ifnull 150
      // 144: aload 5
      // 146: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 149: goto 150
      // 14c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 10
      // 152: areturn
      // 153: astore 11
      // 155: aload 5
      // 157: ifnull 166
      // 15a: aload 5
      // 15c: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 15f: goto 166
      // 162: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 11
      // 168: athrow
      // try (59 -> 64): 67 null
      // try (67 -> 68): 67 null
      // try (96 -> 126): 126 java/io/IOException
      // try (93 -> 99): 100 java/io/IOException
      // try (78 -> 87): 87 java/io/IOException
      // try (75 -> 81): 82 java/io/IOException
      // try (6 -> 131): 140 null
      // try (131 -> 135): 136 java/io/IOException
      // try (140 -> 141): 140 null
      // try (141 -> 145): 146 java/io/IOException
   }

   private UserTheme getUserTheme_2(String param1, UserTheme param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 78859296747885
      // 006: lxor
      // 007: lstore 3
      // 008: aconst_null
      // 009: astore 5
      // 00b: new java/net/URL
      // 00e: dup
      // 00f: aload 1
      // 010: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 013: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 016: checkcast java/net/HttpURLConnection
      // 019: astore 5
      // 01b: aload 5
      // 01d: sipush 9000
      // 020: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 023: aload 5
      // 025: sipush 12000
      // 028: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 02b: aload 5
      // 02d: sipush 24002
      // 030: ldc2_w 5289042161647820136
      // 033: lload 3
      // 034: lxor
      // 035: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 03d: aload 5
      // 03f: bipush 1
      // 040: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 043: aload 5
      // 045: sipush 32435
      // 048: ldc2_w 5592564834100395573
      // 04b: lload 3
      // 04c: lxor
      // 04d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: sipush 14030
      // 055: ldc2_w 3519374029922760254
      // 058: lload 3
      // 059: lxor
      // 05a: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 062: aload 5
      // 064: sipush 15354
      // 067: ldc2_w 5060094075394095798
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: sipush 14030
      // 074: ldc2_w 3519374029922760254
      // 077: lload 3
      // 078: lxor
      // 079: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 081: aload 2
      // 082: invokevirtual rip/breeze/client/UserTheme.toString ()Ljava/lang/String;
      // 085: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 088: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 08b: astore 6
      // 08d: aload 5
      // 08f: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 092: astore 7
      // 094: aload 7
      // 096: aload 6
      // 098: invokevirtual java/io/OutputStream.write ([B)V
      // 09b: aload 7
      // 09d: invokevirtual java/io/OutputStream.close ()V
      // 0a0: goto 0ad
      // 0a3: astore 8
      // 0a5: aload 7
      // 0a7: invokevirtual java/io/OutputStream.close ()V
      // 0aa: aload 8
      // 0ac: athrow
      // 0ad: aload 5
      // 0af: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 0b2: istore 8
      // 0b4: iload 8
      // 0b6: sipush 200
      // 0b9: if_icmplt 0d7
      // 0bc: iload 8
      // 0be: sipush 300
      // 0c1: if_icmpge 0d7
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 0d0: goto 0dc
      // 0d3: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 5
      // 0d9: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 0dc: invokestatic rip/breeze/MicrosoftAuth.buildString_10 (Ljava/io/InputStream;)Ljava/lang/String;
      // 0df: astore 9
      // 0e1: iload 8
      // 0e3: sipush 200
      // 0e6: if_icmplt 0f8
      // 0e9: iload 8
      // 0eb: sipush 300
      // 0ee: if_icmplt 138
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: new java/io/IOException
      // 0fb: dup
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: sipush 17797
      // 106: ldc2_w 6678055053104219467
      // 109: lload 3
      // 10a: lxor
      // 10b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: iload 8
      // 115: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 118: sipush 30567
      // 11b: ldc2_w 6271332219397551672
      // 11e: lload 3
      // 11f: lxor
      // 120: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 9
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 130: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 133: athrow
      // 134: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 9
      // 13a: invokestatic rip/breeze/MicrosoftAuth.getUserTheme_3 (Ljava/lang/String;)Lrip/breeze/client/UserTheme;
      // 13d: astore 10
      // 13f: aload 5
      // 141: ifnull 150
      // 144: aload 5
      // 146: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 149: goto 150
      // 14c: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 10
      // 152: areturn
      // 153: astore 11
      // 155: aload 5
      // 157: ifnull 166
      // 15a: aload 5
      // 15c: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 15f: goto 166
      // 162: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 11
      // 168: athrow
      // try (61 -> 64): 67 null
      // try (67 -> 68): 67 null
      // try (96 -> 126): 126 java/io/IOException
      // try (93 -> 99): 100 java/io/IOException
      // try (78 -> 87): 87 java/io/IOException
      // try (75 -> 81): 82 java/io/IOException
      // try (6 -> 131): 140 null
      // try (131 -> 135): 136 java/io/IOException
      // try (140 -> 141): 140 null
      // try (141 -> 145): 146 java/io/IOException
   }

   private static String buildString_7(Map<String, String> var0) throws UnsupportedEncodingException {
      long var1 = 72246594505015L;
      StringBuilder var3 = new StringBuilder();
      int var10000 = getValue_2();
      boolean var4 = true;
      int var5 = var10000;

      for (Entry var7 : var0.entrySet()) {
         try {
            if (!var4) {
               var3.append('&');
            }
         } catch (UnsupportedEncodingException var8) {
            throw getException(var8);
         }

         var4 = false;
         var3.append(URLEncoder.encode((String)var7.getKey(), "\\baction\\s*=\\s*\"([^\"]+)\""))
            .append('=')
            .append(URLEncoder.encode((String)var7.getValue(), "\\baction\\s*=\\s*\"([^\"]+)\""));
         if (var5 == 0) {
            break;
         }
      }

      return var3.toString();
   }

   private void update_3(StringDecryptHelper4 var1, boolean var2) {
      this.biConsumer_r.accept(var1, var2);
      this.arrayList_z.add(var1);
      this.processAll_2();
   }

   private static long clamp(long var0) {
      long var2 = 86093399251904L;
      long var4 = System.currentTimeMillis() + var0 * "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)";
      return Math.max(0L, var4 - "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)");
   }

   private static long getLong(UserTheme var0, long var1) {
      long var3 = 70801432532298L;
      long var10001 = var3 ^ 3883246908231L;
      int var5 = (int)((var3 ^ 3883246908231L) >>> 48);
      int var6 = (int)((var3 ^ 3883246908231L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);

      try {
         if (var0.isValid("<(?:input|button)([^>]*?)(?:/)?>")) {
            String var8 = var0.getDataBuilder2_2("4976cd9d-40aa-4a29-8951-199d743ed64f").buildString((char)var5, var6, (short)var7);
            return OffsetDateTime.parse(var8).toInstant().toEpochMilli() - "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)";
         }
      } catch (DateTimeParseException var9) {
      }

      return System.currentTimeMillis() + var1 * "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)" - "<meta[^>]*http-equiv\\s*=\\s*\"?refresh\"?[^>]*content\\s*=\\s*\"?\\s*\\d+\\s*;\\s*url\\s*=\\s*([^\"'>\\s]+)";
   }

   private static void processAll_6(HttpURLConnection param0, String param1, boolean param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 003: ldc2_w 100766612276928
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: sipush 4642
      // 00d: ldc2_w 3506990790558197212
      // 010: lload 4
      // 012: lxor
      // 013: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: sipush 12435
      // 01b: ldc2_w 716436190871881329
      // 01e: lload 4
      // 020: lxor
      // 021: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 029: aload 0
      // 02a: sipush 32435
      // 02d: ldc2_w 5592577971024742808
      // 030: lload 4
      // 032: lxor
      // 033: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: sipush 25563
      // 03b: ldc2_w 1376662239550362783
      // 03e: lload 4
      // 040: lxor
      // 041: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 049: aload 0
      // 04a: sipush 2740
      // 04d: ldc2_w 8254676337998150996
      // 050: lload 4
      // 052: lxor
      // 053: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: sipush 12080
      // 05b: ldc2_w 7985956071297194120
      // 05e: lload 4
      // 060: lxor
      // 061: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 069: aload 0
      // 06a: sipush 20670
      // 06d: ldc2_w 2848127476435019610
      // 070: lload 4
      // 072: lxor
      // 073: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: ldc_w "1"
      // 07b: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 07e: aload 0
      // 07f: sipush 4165
      // 082: ldc2_w 6965654697041012662
      // 085: lload 4
      // 087: lxor
      // 088: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: sipush 996
      // 090: ldc2_w 7653521876339242054
      // 093: lload 4
      // 095: lxor
      // 096: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 09e: aload 0
      // 09f: sipush 1155
      // 0a2: ldc2_w 2714981676419756956
      // 0a5: lload 4
      // 0a7: lxor
      // 0a8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: sipush 4808
      // 0b0: ldc2_w 1616303627327841730
      // 0b3: lload 4
      // 0b5: lxor
      // 0b6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0be: aload 0
      // 0bf: sipush 1955
      // 0c2: ldc2_w 90223815357968564
      // 0c5: lload 4
      // 0c7: lxor
      // 0c8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: sipush 11642
      // 0d0: ldc2_w 3059045690958649878
      // 0d3: lload 4
      // 0d5: lxor
      // 0d6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0de: aload 0
      // 0df: sipush 21867
      // 0e2: ldc2_w 1211191395020891029
      // 0e5: lload 4
      // 0e7: lxor
      // 0e8: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: sipush 998
      // 0f0: ldc2_w 1336126987604407451
      // 0f3: lload 4
      // 0f5: lxor
      // 0f6: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0fe: aload 0
      // 0ff: sipush 8364
      // 102: ldc2_w 5665623372243834851
      // 105: lload 4
      // 107: lxor
      // 108: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: sipush 6322
      // 110: ldc2_w 1182811059906555706
      // 113: lload 4
      // 115: lxor
      // 116: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 11e: aload 0
      // 11f: sipush 21212
      // 122: ldc2_w 2941240919132431848
      // 125: lload 4
      // 127: lxor
      // 128: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: sipush 15224
      // 130: ldc2_w 3849968758452850048
      // 133: lload 4
      // 135: lxor
      // 136: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 13e: sipush 4126
      // 141: ldc2_w 8122589248932816656
      // 144: lload 4
      // 146: lxor
      // 147: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: astore 6
      // 14e: aload 1
      // 14f: ifnull 1c7
      // 152: new java/net/URL
      // 155: dup
      // 156: aload 1
      // 157: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 15a: astore 7
      // 15c: new java/net/URL
      // 15f: dup
      // 160: aload 3
      // 161: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 164: astore 8
      // 166: aload 7
      // 168: invokevirtual java/net/URL.getHost ()Ljava/lang/String;
      // 16b: aload 8
      // 16d: invokevirtual java/net/URL.getHost ()Ljava/lang/String;
      // 170: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 173: ifeq 1a2
      // 176: aload 7
      // 178: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 17b: aload 8
      // 17d: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 180: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 183: ifeq 1a2
      // 186: goto 18d
      // 189: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: sipush 15646
      // 190: ldc2_w 514780833331710924
      // 193: lload 4
      // 195: lxor
      // 196: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: goto 1b0
      // 19e: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: sipush 7890
      // 1a5: ldc2_w 4878857818396699088
      // 1a8: lload 4
      // 1aa: lxor
      // 1ab: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: astore 6
      // 1b2: goto 1c7
      // 1b5: astore 7
      // 1b7: sipush 17354
      // 1ba: ldc2_w 4214915703316280530
      // 1bd: lload 4
      // 1bf: lxor
      // 1c0: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: astore 6
      // 1c7: aload 0
      // 1c8: sipush 15699
      // 1cb: ldc2_w 1918323273406450374
      // 1ce: lload 4
      // 1d0: lxor
      // 1d1: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: aload 6
      // 1d8: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 1db: aload 1
      // 1dc: ifnull 1f9
      // 1df: aload 0
      // 1e0: sipush 13909
      // 1e3: ldc2_w 5187921214672830593
      // 1e6: lload 4
      // 1e8: lxor
      // 1e9: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: aload 1
      // 1ef: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 1f2: goto 1f9
      // 1f5: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f8: athrow
      // 1f9: iload 2
      // 1fa: ifeq 269
      // 1fd: aload 0
      // 1fe: sipush 22855
      // 201: ldc2_w 239459702321147556
      // 204: lload 4
      // 206: lxor
      // 207: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: sipush 23858
      // 20f: ldc2_w 390790628681345772
      // 212: lload 4
      // 214: lxor
      // 215: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 21d: new java/net/URL
      // 220: dup
      // 221: aload 3
      // 222: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 225: astore 7
      // 227: aload 0
      // 228: sipush 13230
      // 22b: ldc2_w 2531409399984063518
      // 22e: lload 4
      // 230: lxor
      // 231: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: new java/lang/StringBuilder
      // 239: dup
      // 23a: invokespecial java/lang/StringBuilder.<init> ()V
      // 23d: aload 7
      // 23f: invokevirtual java/net/URL.getProtocol ()Ljava/lang/String;
      // 242: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 245: sipush 26386
      // 248: ldc2_w 5139289812750651576
      // 24b: lload 4
      // 24d: lxor
      // 24e: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 256: aload 7
      // 258: invokevirtual java/net/URL.getHost ()Ljava/lang/String;
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 261: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 264: goto 269
      // 267: astore 7
      // 269: return
      // try (144 -> 159): 159 java/lang/Exception
      // try (138 -> 150): 151 java/lang/Exception
      // try (128 -> 167): 168 java/lang/Exception
      // try (175 -> 193): 194 java/lang/Exception
      // try (210 -> 238): 239 java/lang/Exception
   }

   private static String buildString_8(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 03: ldc2_w 70526194315836
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: ifnonnull 1e
      // 0c: sipush 26392
      // 0f: ldc2_w 7812034427529847830
      // 12: lload 1
      // 13: lxor
      // 14: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: areturn
      // 1a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual java/lang/String.length ()I
      // 22: sipush 200
      // 25: if_icmpgt 2e
      // 28: aload 0
      // 29: areturn
      // 2a: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 0
      // 2f: bipush 63
      // 31: invokevirtual java/lang/String.indexOf (I)I
      // 34: istore 3
      // 35: iload 3
      // 36: iflt 47
      // 39: iload 3
      // 3a: sipush 200
      // 3d: if_icmple 71
      // 40: goto 47
      // 43: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: new java/lang/StringBuilder
      // 4a: dup
      // 4b: invokespecial java/lang/StringBuilder.<init> ()V
      // 4e: aload 0
      // 4f: bipush 0
      // 50: sipush 200
      // 53: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: sipush 31345
      // 5c: ldc2_w 2767542417132681715
      // 5f: lload 1
      // 60: lxor
      // 61: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 69: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6c: areturn
      // 6d: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: new java/lang/StringBuilder
      // 74: dup
      // 75: invokespecial java/lang/StringBuilder.<init> ()V
      // 78: aload 0
      // 79: bipush 0
      // 7a: iload 3
      // 7b: bipush 80
      // 7d: iadd
      // 7e: aload 0
      // 7f: invokevirtual java/lang/String.length ()I
      // 82: invokestatic java/lang/Math.min (II)I
      // 85: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: sipush 22338
      // 8e: ldc2_w 4556537043964187753
      // 91: lload 1
      // 92: lxor
      // 93: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: areturn
      // try (4 -> 12): 12 java/time/format/DateTimeParseException
      // try (14 -> 20): 20 java/time/format/DateTimeParseException
      // try (26 -> 31): 32 java/time/format/DateTimeParseException
      // try (28 -> 50): 50 java/time/format/DateTimeParseException
   }

   private static String buildString_9(String var0, int var1) {
      long var2 = 86323901053774L;

      try {
         if (var0 == null) {
            return "<(?:input|button)([^>]*?)(?:/)?>";
         }
      } catch (DateTimeParseException var5) {
         throw getException(var5);
      }

      String var4 = var0.replaceAll("\\bname\\s*=\\s*\"([^\"]+)\"", " ").trim();
      if (var4.length() > var1) {
         var4 = var4.substring(0, var1) + "https://api.minecraftservices.com/minecraft/profile";
      }

      return var4;
   }

   private static String buildString_10(InputStream var0) throws IOException {
      long var1 = 110893490569005L;
      int var3 = getValue_2();

      try {
         if (var0 == null) {
            return "";
         }
      } catch (IOException var13) {
         throw getException(var13);
      }

      BufferedReader var4 = new BufferedReader(new InputStreamReader(var0, StandardCharsets.UTF_8));

      try {
         StringBuilder var5 = new StringBuilder();
         char[] var6 = new char[4096];

         int var7;
         while ((var7 = var4.read(var6)) >= 0) {
            var5.append(var6, 0, var7);
            if (var3 == 0) {
               break;
            }
         }

         return var5.toString();
      } finally {
         var4.close();
      }
   }

   private static String buildString_11(String var0) {
      long var1 = 28615282438073L;
      String var3 = var0.replace("-", "");

      try {
         if (var3.length() != 32) {
            return var0;
         }
      } catch (DateTimeParseException var4) {
         throw getException(var4);
      }

      return var3.substring(0, 8) + "-" + var3.substring(8, 12) + "-" + var3.substring(12, 16) + "-" + var3.substring(16, 20) + "-" + var3.substring(20);
   }

   private static String buildString_12(String var0) {
      long var1 = 117545853464558L;
      return "\"sFTTag\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\"" + var0 + "/auth/callback";
   }

   private void processAll_7(HttpExchange var1, int var2, String var3) throws IOException {
      long var4 = 54952279434017L;
      byte[] var6 = var3.getBytes(StandardCharsets.UTF_8);
      var1.getResponseHeaders().set("\"sPOST_Username\"\\s*:\\s*\"([^\"]+)\"", "\\baction\\s*=\\s*\"([^\"]+)\"");
      var1.sendResponseHeaders(var2, var6.length);
      OutputStream var7 = var1.getResponseBody();

      try {
         var7.write(var6);
      } finally {
         var7.close();
      }
   }

   private void processAll_8(String var1) {
      try {
         this.consumer_t.accept(var1);
      } catch (Exception var3) {
      }
   }

   private String buildString_13() {
      long var1 = 63653160158769L;
      return "\\bvalue\\s*=\\s*\"([^\"]*)\"" + this.fieldInt_v + "\"sFTTag\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\"";
   }

   private String buildString_14(int var1) {
      long var2 = 99301482229621L;
      byte[] var4 = new byte[var1];
      int var10000 = getValue();
      this.secureRandom_q.nextBytes(var4);
      int var5 = var10000;
      StringBuilder var6 = new StringBuilder(var1 * 2);

      for (byte var10 : var4) {
         var6.append(String.format("https://user.auth.xboxlive.com/user/authenticate", var10));
         if (var5 != 0) {
            break;
         }
      }

      return var6.toString();
   }

   private Map<String, String> parseParams(String param1) throws UnsupportedEncodingException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MicrosoftAuth.88246108222250L J
      // 03: ldc2_w 3540446580827
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/MicrosoftAuth.getValue ()I
      // 0b: new java/util/HashMap
      // 0e: dup
      // 0f: invokespecial java/util/HashMap.<init> ()V
      // 12: astore 4
      // 14: istore 5
      // 16: aload 1
      // 17: ifnull 28
      // 1a: aload 1
      // 1b: invokevirtual java/lang/String.isEmpty ()Z
      // 1e: ifeq 2f
      // 21: goto 28
      // 24: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 4
      // 2a: areturn
      // 2b: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: ldc_w "&"
      // 33: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 36: astore 6
      // 38: bipush 0
      // 39: istore 7
      // 3b: iload 7
      // 3d: aload 6
      // 3f: arraylength
      // 40: if_icmpge ca
      // 43: aload 6
      // 45: iload 7
      // 47: aaload
      // 48: astore 8
      // 4a: aload 8
      // 4c: bipush 61
      // 4e: invokevirtual java/lang/String.indexOf (I)I
      // 51: istore 9
      // 53: iload 9
      // 55: ifge 81
      // 58: aload 4
      // 5a: aload 8
      // 5c: sipush 17021
      // 5f: ldc2_w 5054635222084625405
      // 62: lload 2
      // 63: lxor
      // 64: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: invokestatic java/net/URLDecoder.decode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 6c: ldc_w ""
      // 6f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 74: pop
      // 75: iload 5
      // 77: ifeq c2
      // 7a: goto 81
      // 7d: invokestatic rip/breeze/MicrosoftAuth.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: aload 8
      // 83: bipush 0
      // 84: iload 9
      // 86: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 89: sipush 17021
      // 8c: ldc2_w 5054635222084625405
      // 8f: lload 2
      // 90: lxor
      // 91: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: invokestatic java/net/URLDecoder.decode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 99: astore 10
      // 9b: aload 8
      // 9d: iload 9
      // 9f: bipush 1
      // a0: iadd
      // a1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // a4: sipush 17021
      // a7: ldc2_w 5054635222084625405
      // aa: lload 2
      // ab: lxor
      // ac: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/MicrosoftAuth.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: invokestatic java/net/URLDecoder.decode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // b4: astore 11
      // b6: aload 4
      // b8: aload 10
      // ba: aload 11
      // bc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c1: pop
      // c2: iinc 7 1
      // c5: iload 5
      // c7: ifeq 3b
      // ca: aload 4
      // cc: areturn
      // try (10 -> 15): 16 java/io/UnsupportedEncodingException
      // try (12 -> 20): 20 java/io/UnsupportedEncodingException
      // try (40 -> 55): 56 java/io/UnsupportedEncodingException
   }

   private byte[] encryptBytes(byte[] var1, byte[] var2) throws Exception {
      long var3 = 66034102404412L;
      byte[] var5 = new byte[12];
      this.secureRandom_q.nextBytes(var5);
      Cipher var6 = Cipher.getInstance("https://xsts.auth.xboxlive.com/xsts/authorize");
      var6.init(1, getSecretKeySpec(var1), new GCMParameterSpec(128, var5));
      byte[] var7 = var6.doFinal(var2);
      ByteBuffer var8 = ByteBuffer.allocate(1 + var5.length + var7.length);
      var8.put((byte)var5.length).put(var5).put(var7);
      return var8.array();
   }

   private byte[] decryptBytes(byte[] var1, byte[] var2) throws Exception {
      long var3 = 36435639452646L;
      ByteBuffer var5 = ByteBuffer.wrap(var2);
      int var6 = var5.get() & 255;

      try {
         if (var6 != 12) {
            throw new IllegalArgumentException("https://xsts.auth.xboxlive.com/xsts/authorize");
         }
      } catch (Exception var10) {
         throw getException(var10);
      }

      byte[] var7 = new byte[var6];
      var5.get(var7);
      long var10001 = 9007946106274589482L ^ var3;
      byte[] var8 = new byte[var5.remaining()];
      var5.get(var8);
      Cipher var9 = Cipher.getInstance(((String)null));
      var9.init(2, getSecretKeySpec(var1), new GCMParameterSpec(128, var7));
      return var9.doFinal(var8);
   }

   private static SecretKeySpec getSecretKeySpec(byte[] var0) {
      long var1 = 63463411264008L;

      try {
         if (var0 == null) {
            throw new IllegalArgumentException("/auth/callback");
         }
      } catch (DateTimeParseException var3) {
         throw getException(var3);
      }

      try {
         if (var0.length != 32) {
            throw new IllegalArgumentException("\"sPageId\"\\s*:\\s*\"([^\"]+)\"" + var0.length + ")");
         }
      } catch (DateTimeParseException var4) {
         throw getException(var4);
      }

      return new SecretKeySpec(var0, "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize");
   }

   private static String getString_2(byte[] var0) {
      return Base64.getUrlEncoder().withoutPadding().encodeToString(var0);
   }

   private static String buildString_15(String var0) {
      long var1 = 2383793522516L;

      try {
         MessageDigest var3 = MessageDigest.getInstance("XboxLive.signin offline_access");
         byte[] var4 = var3.digest(var0.getBytes(StandardCharsets.US_ASCII));
         return getString_2(var4);
      } catch (Exception var5) {
         throw new RuntimeException(var5);
      }
   }

   private static UserTheme getUserTheme_3(String var0) {
      long var1 = 108846300860611L;
      long var3 = var1 ^ 126938538481675L;
      long var5 = var1 ^ 11814978420408L;
      return new rip.breeze.client.Util139().getDataBuilder2(var0, var3).getUserTheme(var5);
   }

   private static BreezeIterable getBreezeIterable(String var0) {
      long var1 = 113728849992014L;
      long var3 = var1 ^ 130714659180934L;
      long var5 = var1 ^ 2577110802603L;
      return new rip.breeze.client.Util139().getDataBuilder2(var0, var3).getBreezeIterable(var5);
   }

   static void update_4(MicrosoftAuth var0, String var1) {
      var0.processAll_8(var1);
   }

   static String getString_3(MicrosoftAuth var0, String var1) {
      return var0.string_w = var1;
   }

   static String getString_4(MicrosoftAuth var0, int var1) {
      return var0.buildString_14(var1);
   }

   static void update_5(MicrosoftAuth var0) {
      var0.update_2();
   }

   static String getString_5(MicrosoftAuth var0) {
      return var0.buildString_2();
   }

   static String getString_6(List var0) {
      return buildString_3(var0);
   }

   static String getString_7(MicrosoftAuth var0, String var1, String var2) throws IOException {
      return var0.buildString_4(var1, var2);
   }

   static String getString_8(MicrosoftAuth var0) {
      return var0.buildString_13();
   }

   static Util11 getBreezeUtil114_3(MicrosoftAuth var0, String var1, String var2) throws IOException {
      return var0.getBreezeUtil114(var1, var2);
   }

   static Util13 getBreezeUtil116_2(MicrosoftAuth var0, String var1) throws IOException {
      return var0.getBreezeUtil116(var1);
   }

   static Util14 getBreezeUtil117_2(MicrosoftAuth var0, String var1) throws IOException {
      return var0.getBreezeUtil117(var1);
   }

   static Util10 getBreezeUtil113_2(MicrosoftAuth var0, String var1, String var2) throws IOException {
      return var0.getBreezeUtil113(var1, var2);
   }

   static long getLong_2(long var0) {
      return clamp(var0);
   }

   static void update_6(MicrosoftAuth var0, StringDecryptHelper4 var1, boolean var2) {
      var0.update_3(var1, var2);
   }

   static void handleHttpExchange(MicrosoftAuth var0, HttpExchange var1, int var2, String var3) throws IOException {
      var0.processAll_7(var1, var2, var3);
   }

   static Map parseQueryString(MicrosoftAuth var0, String var1) throws UnsupportedEncodingException {
      return var0.parseParams(var1);
   }

   static String getString_w(MicrosoftAuth var0) {
      return var0.string_w;
   }

   static String getString_9(String var0) {
      return buildString_12(var0);
   }

   static {
      long var0 = 94326028865077L;
      initialize(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[312];
      int var5 = 0;
      String var6 = "EàõI\u0003Î\u0003e\u001bðÈ\u001b\u008fD.\u0019\u00825dºµó¦ÍÐ\u0012\u0013ñM®²ËEg{\u001e¢yÔkJk@Q\u0016\rëòHÈ\u0018»Ç±©Ý\u0090g¯k°rò\u001eúò\u0093\u008bÈ\u0013\u000fY^\u0090VÚo];Ì\u0091]î\u0003b\u001bÆ-·¿ÐM\u0012©3:Í\u0092üÑ\u008bÆ\u0016MÇ\u0017íáõsOhuÁ\u0081\u001aJÖÚ4{\u0018\u0083\u0085õeV\u008b\u0091\u0090BÎ\u008f+\u0081ÇS1\u0084\u008f÷T÷ \u000f\u009d(ªì'\u001dªÉ\u0084\u000f\u0000\u008ft ©\u0082x=Ôøº\u0096^±\u0080\u000e±å\u001cNQà.3~\\¬J+\u008dÙ\u0017 \u0005]¾ð\u0081ðÕ\u008aá4ð¿\u0080å{\u001dë\u0097Cô6q\u0083ñ¨îÔHI¦ÌV8O§\u001cµÍÁ\u0083\u0001Üö²§\"e4>\u0089UÂêdN\rV»Y\u0089ª\u000fþâö»eh\u001a}©-²\r\u0011\u009aU.#\u0090èÃâ\u0018ªjn<Ï( Ij'yA\u0014\bT9äëöÇ\u001cVLÁÔ\u0012y?ü\u008fÊ!ß=£\b\u0088b\u0003\u0094ûHTá\u00968 vÕÀ\u000bG\u0099\f³\u0093\u0098yd©¢è¿IP\f\u0014Z\u001dÃ\u001e\u00ad·jÔ³Ö\u0017x\u0010Úa9Y\"\u0094ù\u000e!Çc\u0002\u000f7¼è\u0010ùXwL\u0087\u0010\u0081WÛ\u0003åH\u0094ì3P\u00107ï¨!_ÚU\u0091\râ·¯ÿÇ \u009f\u0018*\u0006-5£\u0097\u0084ÂîcÌ\u008eÞ7\u0088á\u0087VóB\u001aÎNm\u0018Ó`\u0095lN\u0018oßAö\u007f\u008f\u0090¦\u0019#BrîÜ\u0098\u000eãÁ(zó\u0013õ\u008b\n »,²w\u001bïvw\u0002\b\u008fèÓ\\\u0018\t$e¿yf9I\u0090-BÁé¦^S@\u0088@<¦\u0011\u0002M\u0090\u0017ßþÃH+*\u0091Ýñ6ë\u001d\u001eþ< )H\u009azÖ^Ñï¢\u001eó¥dxm\u008aNË\u0089Ö\u0085\u009e®\u001f\u009bÇýp}_¡(moXhîø\u001f\u0011\f\u0010þQ\u009bM\u00ad\u0088VÙî&ZOI\u0086ëÎ\u0010¿B¿'\u009cå\b~\u001a\u0092)\u008f\u007f²#á\u0010_ä?°M\u00971+YE½AÎBÉ\u00898Å\u000e¼S\u0084Û\u0014jÏ\ra4\u0087H¾C[$ÑåÀé\u0006ß\u001eÎÈn\u0002 \u0016Å>©Ík+\u0081OHèé\u009a_µçòoC-ôB¨6õ@\u0018sÚo_²ãxÚ$´Ç\u0017Ï?ôúJÌ\u009ct\u0003\u009bZC \u00981\u009a2\u0001 ûgY×öNøm´¨¦í®¸\u0013\u0005ç\u007f¼\u0003\n'ÿ½óN\u0010Æo\u0014wo\u008b\u001e\u007f#·\"¶5yRð\u0010ÈqÖ¯¿½Tëq&ÜQ´Q\u0088\u0080 \t\bâ\"»«z\u0002N¥ô³ïò\u001f\u0017|\u0013KNk'§ýrÅ\u0098ÐÂÒJó\u0010ùýº\u0099Ãý öþ³ö¹g§õ}H2çÕåÈõ?\u0091\u0098\u000b\u0003Èr\u0006¡äN\u0091,åZG*Ý²K\u0084éåe\u0086Ä9ëp\u0096ïZJqaÉ½Ó\f`å¾\u009cúb\u0090\u0018fbÚq_YÈø=g®w|«-be\r\u009a\u0018\\¸·\u0088¯1V\u0080\u008e¬\u009e\u0005¦LrrZP\u0099\u0001¯\u00adqí\u0010ÚbÑ\u008aA×\u0081x?¸N`SÓPê\u0010}¯>¸]ëä\n\u00ad³5jÏ\tÈg ZíVÝ£ôÀ\u00127=\u0001\u0013F¼\f{\u0019@Íï\u0001¹%Ñ\u0091SHTb³\u0005P(îB:÷ü\u0013)ã.ÁO%«¡\u0017\u007fF\u0002;Ì/o\u0086²Tv\u008ea\u0092¯4'\rfSªi²\\3\u0010\u009b¶\u0086\u0092í\u0086\u008d¯\u009fiÛu¾N®-\u0018öð`ÜO\u0001\u008bÞQBö\u001eÎêk2VT¸\"CÌ.ß\u0010\u009bÅ\u008büo?z\u0017ÉLá\u0019æc]ë /\u0081h\u000bJ\u001e\u009ab\u0013ÝXèmÅ¡\u009eM\u0091»Ð\r4Sc¢\u0099¦\u0011×´Û\u0083\u0010Z\u0003Â½m\u0015RßÀÆ/n\u008aQË1(\u0095\u009dGN\u0000\u008e²ÛÃ\u0084ÃÜF}gk+!ãËÓö\u0088\rv_Û\u0012ÿ©a¢Ô¡¸P{\u0096sV \u0007\t\u000b\u0088_\u0084ö&\bõ\u008e¶&¿F\u0081mªw\u0083Ñ\u008c\tÙ\u0095<Vfp§FIHoLsãBÝ\u001f*±\u0082§\u0098ÉÔÄÜ§$\u0018\u00992~#\\Ú\u0088\u0091ö\u0080\u008cøÚI[3á\rZÂ\u0014\u0085\u0089\u0005zÄìÖ\u00ad×\u0019Ê\u0003Kÿ?Ky\u00898·óÓJ\u0081CÌ)|´¤|Ì\u0010m\u008eýá\u001dÒâ-\u009a>!êë\fyk(²Gx\u0098\u0082pzü³'«Kçì\u0005Mþ\u0085\u0019GÓ8×ø\u0004ª\u0014Dëj}At¯Ä\u0080\u0014ø\u000eÅ\u0010MV\u009f¢°Ñ\u0089î\u007fp_\u009bæ\u007f\u009a/(`iÇNv\u0012\u0084ñP\u0095ñC\u0012õÀ\u000bZ]¶þ¨AG\tÁ§'°¨\\Göå\u00934ä%º7® @\u0082¾Û³\u0010\u0085\u0089\u00993ÄdÔ¹¢x\u0090õþ3Î\u0093}w \u0096i[8Bgø(ÃÛê=c\u0098ØJ\u0083\u0094Sõò\u0003\"Yéå'¿uÍS\u0007ÅOÙ-_\u0002\u001ef¡<ÞèÏ½\u001d`0þ3Á#ÇºFR²>\u00140'\u0082[-@V\te¸ÃCï\u0004½c\u0090¥\u00852¿,f\u0006Û1\u008f%ô*cÖ=ÞØ\u0082Ù\u0010!GW\u007f\bµ\u0007 >Ì\u008cHTüD\u0092@/´Q\u001c¯\u001f4\u0086\f!\u0011)ÜÂ\u0013i\f}ÀT\u0002@\u00ad\u0013{[ó\u0012~â\u00874íÄV1?\bµ{ïÜ{\u0019³?Ýý¯h¥îB\u0090\r¯á÷ïS=£7\u009a\u00106©\"±\u009e\u0010Úå\u0011\u0017ê\u0091\u0097~*: \t'Þ6C\u0002\n\u0094Ê8ÙEÝOï?>\u009bè®ÇC\u0000\u0089Q\u0001P\tä)($\u0010j\u0000Á1ßQC\u0092NS¨Xs\u0017\u001f\u0098\u0018{$]· 7\u001adÿWï\u0092Rð¾\u0080ÞÄ\u009d«÷¸£Ú@]/ä\u001a \n®\u0084\u001c I\u009d\u0017ÖÝ\u0005\u001f³y\u008f\u0014!'\u0013¤\u0003èôù\u0006Íâ{qîþ¦Ø\u0098\u0002zÖûó:}SõÃI+ªGÅ½Æ\u0005%\u000b°×ÒÐæ\u0010\u0003~·\u009c¨\u0096\u0002¤j@z|à\u008a«q O}0§\u0088Ûú}\u0090!µR\u0098äâ\u008dÓÇÝÉ\u009f¾ÐéûDß|÷LN²8\u008a&mçàB]\u0004§¿\u0083Ùí\u0091Ë+³ \u009d\u0012ø\u001eXç\u00998~!\u008a³²c5©3UoC½{\u0015\r¿¦TÏ¿\u0018îî\u008e\tXtý· \u000e\u008f5¬Â\u0007\u001d2òÌÂ*?\u0090ÛÓFrY\u009cuû\"ä\u0093ý¼\u008eÇ\u0018¬D\u0010÷qr\u0010\u0002TÏÜ%\u001f|\u0012Çí¯Þ\u0018¡¸\u0099âG}µ\u0095ÂÔ\u001c6{\u0083ê¢¿äII@4_g8\u001d\u0013¼¢\u0013Ç|h6\u0087zKÄ}ó&\u0095ÔJçdP&¼ÅdGQ+\nÎYµê&tñM\u001bÐÁ'½Ô2Ì]\u0095\u009eóo\u008cDÉ\u0085\u0084`åwÅæ\u0081\u001b\u0087ºà¥\u0084\u009c¶Rû\u0092å¶\u0018nÆ·\u0017\t\u0093«|¡Ì\u001b¿Ø;\u000bM\u009cIîê\u009e\u0083z\u0098\u00878+µÉ\u0004Wò«#]Z\u0013«IwÝî\u0083\u009a\u0014[[GoÐæHxÆrÿAR\u0092\u008a\u008eôë\u0000\u000b\u001eø#\u0016¿`÷L\u0003\u0010mÈ Gb\u001d\u008a(\u009f\u000e×fô6£ä®c\u001aø*Ð7\u001eV`\u008fµ>ëóÞzD\u0017p¡Ì½ü=¤\u008dù\u0081o\u000bÔµ\u0093Ôç\u0007\u0016·9&\u0007\u0001æNù;«QyÉ ¨üÔCn6ê\u0084+c$8ó~\u000e`><?çÇ+fRP3NÙ^¥c\u0088)?Uç>m\u001cxì\u0092c\u001bîÄl\u009b\u001d\u0084)Õ §\u009e[º\u008d;ø\u0099K\u0086\u001dfëè\u0016¤\u000e¿Z%\u008f\u008d\u008a\u00adDô\u00920.Pÿ@\u007f¥\u0084Ä\u0013gûÎ9æ\u0099\fP\u0003½\u0086hÝi\u008b#l¼\t¬Z\u0015*Tká\u009a·ßvX_\u0002¸C¤\u001e¯\u0080ð)\u001a°aB\u0083Þx.Öú¯\u0080²×.5G¯!ýIh±Ùä«\u0083¬fÌhXð¿\u009b§\u0096[èøðMþ¨Ýd9ÒÄ]\"esP\u001aq)¢[\u0002|\u0005HF\u0099\u0086ç¥>\u001abþ\u0007¨\u0087ïª9ªÚú\u008b\u000bÎ\u0082\u00ad\u0096¥\u0088uõÓ\u008cÞ´'\u0010R¢Õ\u001b\u0096¬_Qp~4\u0099\u0096\u0006Jïþ RR\u000f\u00adÜW\u0093R\u0016¹=\u008cÊãÒFÃC¥ÀÐ\u009f\u0090£÷kxp«Ë\u00920{\\w,&w\u0019Os?1s/µD\u0094\u0086g\u009f\u0093\u0019j/í®k_Ë9«|/Å3ÂO*\u000bn/ªì¨(Öwû\u0011\u0089Jl&½p\u0095ß×G-\u008fZ\u001fZ'_\u0081{)nP\u001b\u008f(¶å\u009aXh\u0016\u0099Q£\u0090Òò\u0083\u008aNvþD5Xcí³\u0007Q=ó\u0091¾òÐ+¬ølÔ¹\u0097\u0093\u00ad\u009bfòÌGÈíÅ0ÏÓí\\iÕý5Í\u0092K\u0093\u001fC%\u00ad\\&\u0003<Ìøeõ\u0016§Ö\b\u008b\u0095\u00ad¦\u008fø\u0081\u0005^\u0082|ã«q²Ä3'\u009cÉ¢)ð\u0081\u0094®m\u0083òøÄ\u0010YÙ&Âa\u000b]çcÉ\u001b²Å§\u0019D\u0010\u009b\u0082s\u0015÷$Du\u001f¢\u0098ª^\u0094^\u0018\u0010\u000b±£V!¬õ\u0080²\u0019ö\u0080\u008c\u0089#\u0081\u0010\u0017Õçç£\u00ad7à¨\u008cG\u007f\u0017\u0019?\u0097 ´]ê\f'J\u007fêÝ\u008f\u008bÎ×À\"¯\u009d\u0087\báH(w1Îó¨Ë\u001bÝ\u0090²\u0010\u008f\u0016\u008al\u009d4Å\u0002\u0005m\u000e\u009e\u008a¾ºÚ(GñU5î`/&\u0006ÈRw\u0017d\u0088å\u0007a ÷=e\u0007Üo¾T\b|=^~O\t%\u0002\u0091Õ¦·\u0018Tr&ñI\u0093<{\u008e³#¯\u0090ú\u009e\u0019\u0015E|\u008b\u008f¸\u001eh8FùÙNXvW1y\u0010TSß\u0087ùàk>]Ùj\u000e\u0083\u0095%&\u009bÌÎþ»\u009f¹ú1\u0013¡Üfu\u0006¼\u0084rEYÙTy±-ÑmÖ:º\u0010\u00800ð·o(Í'P\u008dã\u0010Z\u000eì\u0096\u0010Þ\u0093\u0006\u0019mEI<\u00031\u0098\u000eøûî\u0019 ·\u0094\u009f]Çb<w©ó*\u0011#^ÍCdÈ\u001bâÝ¡I\u0012\u0002ÅÜ${ºÐò\u0010o\u009dÀ®©\u009a9Xpbå;\u000bÖ\u0093õ\u0010×pÍ!î\u009c\u0095TÎ¤\u00ad¦\u0003\u0087Ug\u0018zµè\u001f>\u0016U\u001fÊ@<\u001d\u0018\u007fbÒï\u0015\u001f×\u0011¹¤À8 \u008dd\u0005¬õ+\u009b$àó\u0087VZ\u00ad\u0091\\âÚÁ{ÑC]nG\u009b@£CÛß\rº\u0007¦\u0013ñÄÞ*Ó\u0086\b\u0000J¬.Õ\u0010<ØÌE¯\u008a(¯v\u0091ÔúÝ\u0085po#\u0094óº¿Øo:ý¥çýy+»U\u000e~\u0082÷ÊfÊ\u001dç\u008cü\u0083\u0091Ì¥(FE(Ó\u008b\u0090ô\u0000¥ölÅ#\u0002æ\u001cD\u0087qQá\u0086B,ã³\u0012\u000eWÖ¥|SM\u009a\u00ad®Êã¢\u00107ÃÕLWå\u0096»\tZ:{\u009e\u009c\u001f7 [æ\u0000M\u008c7øËxN}\u0088½\u0013}ù#q\u0004$\u0094\u0006UNVã4/«Ðjí\u0010÷2#\u00917¯\u0000\u009e)<\u0080ÜÑ\u0092³]pOd\u0000üxqQÚ$\u0019sñN\u0000±\u0081ÄÒçÄñ\u0093\u0011ïè\u0091#Q>×-g'\f\u00adÍÊ7þÕlcLXE\u0000³Ök\u0012\u001dw¯ÌÐ¶Dó\u001cIc/k{W\u0097\u0006uñQÎv¾\u009d¾ñEI¯mãnD¸oC\u0084¡\u008fa\u0099Çn°é³2\u0095ÍSúw+Ûû\u0095\bÉ\u0084sv\u000b0Ù\u009d\u008f\u0000\u008cN¨\u008aZ\u000e\u00833K°[ !\u0012CIñ9¸\u0095\u0091\u001bhÐÔX4\u009aNÁ¤Ù\u009bðéÎ\u0088¸\u001bÛ\u0095¡X¼\u0018W\u0016\u0080\u0085b½~\u0094\u001dÜ±\u0083l:\u0002Y\bz°]\u0007\u009ai\u000e0u\u0085Î\u0089DÐ\u008cÈ¡\u0018`ºØ¬|\\\u0081ðt¾\u0013USp¥¶\u0001â.µ®Ñ&2QâÅd\u0007\u0017ì\u0095*<`T¨K \u001c\u009fAAÈ×Ñ£+´1¹\u0087\u009c\u0005)áÉ~\u000bÉÀ´È5,Î7ÈÑõ,\u0018Ö6\u001e>u8\u0091\u0003\u0093w=:tÙ¾l+#ÈU\tòçW\u0010È=ä³GC«¹b\u009eÃ\u008e\u0095Å\u0084E ôÁ\u0003\u00ad\nµ&\u0094\u0091Xn\u001fVÄî\u00adß\u001d\u0096E\u0084U-¿7ß\u0017ëai½M ·µFð\u009c\u0085ËV\\p\u00adý0Àò\u0011ùg\u0087\",jú^5dê\u008bX9ªD\u0010\u0092È\u0018%á\u0082]E\u0099Ð\u008f\u0086.7ÌU\u0010|ã\\\"\u0092Û\u0000\u0082Þ¾Å\u008aü\u0005\ræ([H¹\u001cã¢G®dV\u009a\tª$d\u0086®Ãë~Ö\f`wÍì)6¸\u009bè\u0083Y\u00933\u0019´\bÐø(\u0013')*òóë2%\u009an@\u008b·½ó§ÆMv§qÕJ\u0018UhL\\æó9%9c}\u0004\n@Ô\u0010nwÚ¿`R\u0010QwÃ\u0094\u0093VLïø@dA&Ú\u008b\u0084-s6\u001c}$ô?\n¡þÃH\u000bÀÌ{¼dØ{Ê\u001dB\u008ac\u0087ï5¿XÄÔ\u000f\u0014FÂI±i\u0000\u0006ÉÐ¤Cõ8Ô\"«pÊ\u0089ë8´¯\u0010tvhA\u0098\u0098¹W·N\u001b_ÍS£o\u0010è\u0001\u0090`æS¾5!\u0013+[K\b\u0006a\u0010R\u0094 kTó#Ïbì?Tl\u008dúû(ñ{\u0000\u0007ËáråÊ\u001c5,ÆÜc8\u0011µ\u0099\u0012]\u0093öÜò\u00935`;geW¸O³7*\u008c\"*\u0018\u0000µîòÅ;\u0011½u½AF\u001d@XÊ\u0084\u0011;ôÎj¦\u0004\u0010g$±7Ñ\u0087û¨û\u008fÖµXð\u0082b\u0010¨\u0001\u0006ÒAq\u009bOæ¯p?S¨\u0092\"\u0010\u0015kkIb\u0000@ýk¨JÏ\u00ad8À\u0081(\u0010L[\u0083å\u009b\u0099k\u001fò ¶ìO5ãw<\u009dÇÇx\u0097ãÅê¨ª®Þ¬\u0082ev¬\u0003î>Ú\u0092\u0018\u008b\u0088\u0096ì`Ë\fºò\t- [c)o W\u0085\".\u0082Eà(û\nÎûÉ\u0092\u000exPhSÞÝ\u0003\u0012\u0006ké§8\u0092\u008e\u0084B\u0091\u0083ÈãäNèµû\u000bÚm#Â>\u0088 9÷cX\u001c¸·|%\u0011\u0004%¬Dã\u001bh\u009a\u001eü\u00ad¤6ßû1uGãá]G(¤;Ò)-\u0006x\u0094_X/ty¸ú\u0012î\u001b/½ú\u00030¯Îª×Ç«åe6\u0005W©\u0094h\u0010\b3(¶V¿\u0014îÛ'û\r\u00009é\u008bYB\u0014n\u0002þª1íÁ;3\ntâô\u0085\too\u009dà\u00adÖþÆp\u0010¶ \u008bú°\u008eØæõ¾}\u0080\u0083\b²*\u0010¹\u0089åí\u00078\u0015ÓçF\u009e\u0092qx\u0090-@Vf\u0013ð@Þ:jiçH\u0005wd7\u0080\u0099~\u0000ør\u009b\u008c\ræ\u0095$\rã:e^äºêÍ|\u00adÕph5\u0000«\u008a\u0005ÎifÏ\u001eWù\f?\u0098G7!\u001bZ\u0014e\u00adxhp\u001cc¢P\u008dÐ\u000f!i\u0018\u0001\u0018fFîÌ+nj\u000b+\u0084\u001cM\bñÂIÔ\u0012Ë>\u0087Í\u001fº\u009b$®Ü\u0091?)\u0004¹°_\u009c\u0005(\u009fdâ\u0004è¬>æ\u000b|\u0011?ö\u009b¹:EU¬\u0010¹JëÓ\u0084n\u0098\u007fÈ\u0085âO!~b\u008e3\"e\u0098?°ÈÎ\u0014\u0092È9\t§Á¢%näR2}\u007fÈÍ^=ì\u001b4.Ê \u0084È\u001eì\u0012ð\u001bYúº%\u0082s6U\u0002\u008f\u009e\u000fõ\rÉ\u008fK§þúÛg\u001aÆ\u007f\u0010\u001aÜ\u009f C\u008cy\u00ad×¦\u0080g¾·ÿC §m7@B\u0084\u008d¼\u00022\u0014«Æå¶{-³»\u0015Þ\u0092~\u0098\u0015êæ¶Pxf( Óß^\u00ad\u0003J°Uô\u009c\u0016{(\u0005ì\u001a¬Ì2\u008e\u001d.\u0097¹\u001dB\u0014>u\u0019cIPÿÃ\u008e\u007fp¹÷\u0014\rõyÃç\u0088\"Ô?\u0096\u009f¯\u00185\u00903\u0087·¹HÁZkWQS¦ís÷.W\u0099h(åÙ1 \u0098w\u0014\u009fÿ\u0093úv7³\u0001 a\u0088KáÁe\u00934\u0087OÒì\u000fêJü{pðJë\u0018\u00897¤\u007fÁÐ\u001ea\u0014\u008a¿c¢\u00116½<\u00937i¡T\\à\u0010\u0005È%lg¾\u009d¹2\u008a\u001d\r6\u0015÷Ð8\u001bh:Mÿ\u0017*ÃæC\u0015\fý\u0086²®ëÚÒ\u0085¥j`:\u0012g12ü\u0015 ¼ÐNSx\n_lÍÑå\u0015\u009a\u0095\u008cRÇ´bI\u0003Ù\u0085;ô8jp µºJ\u00ad\u0010\u0007mµä\u0016\u0089\u0087£\"hOzF\u0080T\u009cG\u001c«å'U,ýöTõ¡\t\u0091z|v\u001eÆo\u009bMZxxî¥¬B\u000efN \f£\u0091ªøö\u0007TcT]&ø¥È\u008cC\u0012IWÙà@fÙ\u0086\u0093¶Ôì¹\u0083 ¯\"3¤\u001aæÏ>\u008aå\u0098Å@\f\u0010jòÎ\u0092ÒÀ[è,;o\u008aq\u0019¾·Ñ(Ò\u009d\u00169\u00078£\u0004ìÖ·ù\u0094qõýC\tÝb.ñB\u009c\u0002UíT5ÍÝÛýÎÁS+\u0096¯*\u0010\u0088a\u0090\u0014P\u007fÂv\"öÎc°\u000eÎ\u0093\u00185`.·¿yl¸ÿk|Á?+&ióÕû^\u0013â: \u0018w\u0001ä\u0084\u0012u\t\u0011?\u0011R×'*\u000b\u0000ü=U\u0005\u008fo\u009d-\u0010\u008eÁ\u008f§®µ\u009aü\n-\u0017'í6ñ\u0014\u0010\u0011ÃmD\\6÷MÓä\u001bâtz\fß\u0010\u0018/d\u0093£\u0013*°ðz2ZÕD7T8¸¨<bè\u007f²£/\u00100k8$\u0004Iß\u0081\u009b\u0010AÞY%Buf\n ÕÇ:ßÁÚ)\u000b\u008eQ\u00adëõ\u009b`P\u0092ü\u009b\\zd¯2ÉW\f\u0018Ú\u0081\u001bz&&ÂÍäÿÅ\u009fÑ 6\u0095åH4ª\u0085týõ\u0010&[\b|\u0082Ì2?ýÑgãJ\u0098ÓY\u0010\u0000Ý¢\u0094 \nß[v\nÔc¯A\u0088ì\u0010Ø\u008cC\u0018wýæOaÞ¾\u0005\u0090\u0080±9\u0010\u0080\u00896Ê\u000e}©e^4À<1Ð\u00864 Ëö_==lvGN~ª¾nho¦\u0003\u0003¨lÿ³\u0093ä}º\u0012\u0095B\u0089#+\u0010\u0012s*\u0081\u0006¾U\u0018þ]\u001c¥ûlw¶\u00989¸\u00ad²ä\u0098ßÄ\u000ek¡jÑå×£a×\u0018:\u009d¥ ºó2ÿEéhÛ\u0007WE\u0080W\u0096z}DÎg\u0010Ö\u0003Ï9ïß«éi>h¼1\u0089}»·m\"\u0018e|¥\u0015@Ä\u00adºÇ{¥ùÚî%öó¸ÙN\u0092 ¸´É~\u008d\u0006\u000e¹\u0002\u0017\u0091ûÈÃ¥\u0092\u0017, C\u0011 \u009d\u0017?\u00193ÃxHßïÑy©\u0080\u00ad\u009e}NAg¸ggØÞ\u0016±³Ó\u0017\u0011ú~W¦ñ\u001a\u0084«bØ×°\u0086O è\fÐSIfDK}Â±øcZ¨\u0014J$Rò0«ÛÖéï`\u0093I7ºß\u0010\u0001¿¬Vv!?vï©\u00ad}Ù\u0017\u0090;\u0010\u000bk\u009c¡³ù\r>ÉÅQo&\u000e^\u00048\u001f_)5¾´)Ï\u0005h+@³ËÉO\u0016e{°gúè\u0096ù\u0092CùÀá\u008b¤©²8òC£ô\u0082ØÔèÅþ;Ü\u0018é,=û{\u008aDá\u0010X\u001b©H(qÅ\u001c\u008bý\u001c'©Ð\u001b·\u0010ä¶\u0003öËvù\u001aß\u0004u=«À\u0001zp£¿Ý]\u0001\u0098©L\u0012)%\u0092\u0088,<Åg\u0097\u00927º\u0081~m¶ocK=õ\u0095(¿4°k\u001eé1.1¦\u008f\u001a\u007fTëWÏË\u0089\u0085>ð\u000e\n\u0089\u00966\u008dø\u008a\u000f0÷\u009a{H[£÷ý?â¥\u001eÓ\u008aÆmÄDà¤\u00075ao-¼\u008d\nã\u001bv\u0092 ÓH,\u000bG\u0091G{Q\u00195ÿ\u00ad\u0082= (úïÉ§\"óp¦Úª\u0085@)ã ¢\u0082\u001e³Êü\u0095*\u0092¿æ[:³ó\u009c\u0018\u008d2Ýï\u0080E\u0087\u008d\u001cøÁy}¹|\u0090:^\\\u0002±G\u008eë\u0010¢r\u0090§W\u0015ÚÛ>\u001ath\u0086\u009câï Nßäè»\u009e42\u0010\u001f ÏsËò×iK{-_Ñ\u0093\u0004M\u0010\u00ad\u0019?:\u009ap\u0010ã\u0013Õ\u0018¾\u008eä=\u009dÚ,\u008b\u000biøg\u0018³\u001eÈ¨_ÏL\u009c\u0090Ö\u0083\u0094\u0018G\r Z\u000eÛ\u009bF-ö¸¨\u00adMV¦·\u0004\u000e\u0094\u007fï=\u000fA\u0090AVÖ\fvÂÐî\u0019ªQ´S\u008cÍÜò¨\u0091\u008fl\u0011\u001d\u009c\u0006ÿ\u0088Oí{\u0084Ú\u0016D·õä\u001f\u001a UøJ·\u009dì\u0087\u0083ª¬·%½|\u0005n¢ë\u009f]rgÐYe\u0097B\u009c´\fú¦¾\u0004Å¨Ú\bW´2Ð^\u008e\u008a\u008eñs£ú×?¼\u008cÉ;§\u0096<Vç\u008aÝ\u007fT¿\r£b\u000f³°lz\u0097áF\u001cMPê\u0080!\buÖì>QÞr\\ìó.\u008cÔG\u0003\u0011éèp¯ÉÑâ\u0017\u000eßf\u0091*\u009a\u0010ýp.ãßÁ°4\u008f\u0014Àx{Pp: \u008c`ÐEXë.\u0083`\b%í e|\u0095Kî\"áLÿ5¢Û\n¥|\u0003\bþZ\u0010ì?Fôtçé;G\u0084\u009cW³Ç;»\u0018)ìëí$%¸ú{0\u0086Î¯Þ\u008flÈ\t\u0097*Ñä\u0001G\u0018\u0011¶\u000eX]4É ´«øR\u0000>VÖà²X\u009e\u0006\u008a3u\u0010y\\ÝB¬\u0096æ\u0094Âî\u001cxÁ,(óè.\u00adáü(Å\u008a<ydåËL×Ú+Ý\u009cÞ<\u0000uÈD\u0091Z9L\u009c¦ti\u0017WØÀ,\u00991}å\u0003\u0084\u0018$ÀÝo6\u001f_Õ +j]'¢áGªãç|\u0018\u008e\u008cU\u000f\u0093\u001b\b²OvylJw\u0010Fº¯-Ð\u0015íG7b\u008c.\u0001\u00138¹t\u0012I\u0019B¾\u009d¯e\u001b\u00ad \fb¡<S\u00931P>~2hEßì\u0089ªÊ 2®êB«Ì\u0091¸ü]å\u0098!\u001f\u000e\u001fé\u001dFÖ=\u0001Ë\u007f\u009aü\u0087³ª.ÀOäB\u0012\u001czH\u000b<\u00965·2\u001a¸\u0006#Ç¹Ë5%øã\u008d\u001aË°xjXÇxnë\u0087ªéK\u007fÓÝ÷ç¡i6\fÈ¾4iÀÇØÑñç\u009duñyÇ86S»/çÂÚ\u0098çQ \u008bö¹Ó\u0092\t!#¦]\u001dmT\u008bø¹d\u0090ä¦Y\u0003\u009aôzÔ%G\b¯\u0081\u0016 ó\u0005\u001d!'Ó2\u0098È\u0006\u000eb\u0086þr\u000b\u001dÏ\u0085d_+Ò=?hJ\u0007ø\u008d\u0003\f8\u0081\u0083-#ö½ÏbÒkî\u001c\u000bÏÛ>Q³\u00ad\u0011Ht\u0085w\b\u0019õX&ØÄ\u0012ÚUîÖ\u009d\u001f\u0091îW@N§C\u008eÒÞ~ç@\u0019\u008d9P.0\u0006¢\u0002®×©\u0084²³m\u000eÐ\u0088Ì@±^w÷\u0089Ò\u001fô\u0015 \u000f¬íTÄ}öÇ\u0086h\u0015m\u0084Ñ®\u0093\u001bÀá8å\u0014K\u0010\u0002ót¨O\u00ad\u008e=ë®Õ*\u009a,\r\u0006\u0010\u00ad\u0014þ\u0081\u0014è£îi\u0003\u0085Y\u000eã\f\u009e`EÄ$~\u008d\u0000\u008fÛð*\fj\u0090ºCûiÃE/mýÔ·\u009frª\u007f¦û\u0019\u001a\u001d\u008f(\u000f\u0014Á/i\u0017?_Áßu\u000bÞ\u0095,¯\u0015MH÷\u0080õ\u0016¼<ý\u001dFÅÎ\u0018I}µ\u0016áÊ\u0014\u0096\u001bÌú\u0014÷ý_Ø\u00842÷ûú¦9S<;îEf¼\u0010!62ëy\u008b\rÜu\fÉ\u0006B\u000bñ\u0091 R\u0014¢~É$´0¶»U\u008a\u0096º~\u000føX\u0098¶¹±_I©Þ¶G_ÅüC Bm/Ù]\u0085©ÔôÉW\u0003ô$\u0002*TÇ\u0090è_-\u0014[\t\ff*\u0015â´\u00128/\u0005\u0081\u009d&º)\f\u0095ÝO·S£B\u000e(\u009dúÓUë±\u0013ì\u007f9ÇØ£Õõ\u009e\u0084\u00ad\u0016?§Ê\u0094Ì\u0089¾\u009f¸ú\u00833¡³À¹À!s·\u0018Ò\u0088´#\u000eqpl\u0000ÒÖ\u0089\u008d\u0007ÿ¤kÝ\rUâ±ÏP \u0001Ñ\u0000âØÉQ\u00061\u0014\u0094Ëûù\u0083ï9ª\\\u0012\bzQ\u0089RVÝ(²W4K ÙP!c~N\u0095nCòp=jK£\u0096\u001b¬P%¥LôÇ?gè^¶¾<\u0098pÒ8ò÷4\u001b\u0096ý!åâ\"Ú0©9\rã£ëSWó'ÄJê²¥c¨\u0087\u0085ü\u0089[\u0018\u0088êÕ\u0011\u001dKÚ\u0004]pýj\"A\u0006\u009a\nö/\u0088B\u00108\u001fg²¶Ñ«I\u0091\u008bP\u0085Q×n@ÎJSÑOàäÂm\u0094#\u0019t#\fá§+v\u0016¨¦ñe\u0082È³\u0083Z®\u0098â1S\u008eëÅ(\u0083ßLû\u008cçÏé8K\u009d\u009bHu\u001dså;aQé;L´²ª*R9\u0088ã\u000fTÏ\u001f%\u0013\u00862\u0093h\u0098\u0018b¯R\u0014^¹U\u000f\u009cV|Á\u008fTJäã\u009cÖþ/2Z²Ö\u008fËß´\u001d\u0087y\u0090ð\u0083´\u0094%\u000fe7þØ¯\u0080p\u0094\u0091áþ\u0092\u009a»¹8\u00115¹\u00886î^èn__\r\u0014cã\u0011,\u0092¡ß$2è\u0094ÏR\u001d\u0004\\o ø½\u0014ø§\u001fsÞá6\u008c9<\u001dÜÞ(\u00918jõÉ¨4i\u0098Aï®Õï»KØ¡øÉ(G@ïVlEù\u0095b=\u0005\u0010O\u0095¸Ô\u0098°\u00920Ës\u000e|\u0005RË\u009fe{nåIìC+G;4¦â\u009aMßfT¿t\u0083Éê3K¢P~\u009dÇ\u009f\u00adè \u0087ò\u0096¨¶\u008d\u0018q×ù;o\u0018\týÍÉ6ÝÁ3«o¯ô{V xÎ\u009f\u0018Ëõ8e/7¢üÙÊ<¼h±4'û\u0007\u0014×z\u0000ÚÒ\u0010Øk]Ä\u0015\u0082Ë\u0095Ãµ?LËh\u0082µP¯\u0080çg*ëjÂ$\u0005\u008cpQß,Ê÷»/\u00975LÃiÑ\u0016g7\u0010éhìÆ\u009f=wb\u0084§;%_5;Eá/³\r®OYq\u001d\u000evCâ'·\u007fk¼§Ý\u0018\"Tüù\u008d\u001e.ÖßÅ´ø\u008aÌ(çHÝóhÑüô\u001b¬GÛ¬\u000f\u0098h\u0006`fRÂª§¬a\u0004\u0084\u001d¿eÞÌÏk)DT·Ã\u0001\u0010s\u008büË\t(Ì\\HÀ\u0092>\u0003ë¿Ô(ì\tO0DìPÃ)\u0014[)/»\fÉ<\u009eG\u0089À\u0087_n\u0084\u0000ÅÀ4\u008aÈ\u009e©¦\u0011i\tAÌh(ª\rb²K\u0096\u001fsúÃÆ2(³\u001dA\u001bïíB\t \u0086-\u0013N\u008e\r±\u008dçð©\u0090äv`\u00989Ü ð\u0001·4.¬rÁqGJÄ¢JZ<9Ð\u0080]Íúÿ\u001a\u008a\u0000\u009c!XÁ\u0091¥\u0010\u0095[:KAÇÈ»ø·ÞÃÿI\u0098( \u001aÊy\u0015¦ÞÛ>ÐÎ\u00840véåÛ\fP\u001e0C\u0084:\u0082v\u0001\u001c¨üÔD\u009d@\u0002\u008c[ÈiÎ\u0084i'S \u0003\u0004\u0084\u0004ÐÁðæ\t\f\tÄ6qÝúàog\u0011\u0012Ë\"Íh»b\fðXÃâóÞðÀü.\u0016\u0015\u007fQ\u0088!¯G6æ\u0007VÆÄø\u0010\u001eÄ\u0002Ü\u009d\u0088d\u0093M \u0013\u0016ìTTÁ8A\u0014\u0080\u00021\u0017Ð¶fê\u0096\u001eï\u0010ð\tÒ;FÁ=ä\u0093Õ_ÝK»¢j\u008e9\u0092·ÒÉ=YJø°ÚQ?Õ'\u007f^É7k:S±0\u0005\u0010\u0002Ñ\u0081\u001d.NfDþ\u0019Ø\u0017ÂP;ò \u001e|eýÐ\u0011©PrC/Ø3\u001a¯~ó\u008eUéÕ°¥\u009aÏ0ÀI$\u0014a08¥éQòÊaÛÎýq\u008c\u0015Åô_Inner2\u0095¢\u0095$D©ï\u0091/2;ôÞ\u0014\u0098\u0012\u0016ÒòGbç3¯M¶|ké\u001ffÔñÐ*ú\u001bmÃC\u0010W$fÁ\u0087\u0096\u0080ö\u008cÿd/ä\u007f^U\u0010µ\u0013\u0016§Rd¢fÁö\u009fG\u000f¶~\u008c\u0010\u0014\u0017/\t·¨P¢]Iy¾6£}~\u0010\u0080ë\u0094ü1n·\u009a\u0091µÆ\u0019·<1å(A&|¹\u009bÔz÷z\t&x\u0086|²³kf;ü\u0080·nÆ¬ÔQ\u000ed~÷ñSì\u001d\u0086[\nT¦ §7ð\u000fQgÇå\u001d\b\u001f\f\u0010ñ)\r\t¶\u009c\\Âû!\n\u0085w2½Ñ¦}·\u0018\u008fèn9:;*Fÿ\u008f¡\u009eÒ;\f0]\u008f1r?\u000e^æ\u0018\u008cpÞÐR\u0093\u001d\r,ÿ\u0013\u00841?¥ØI/w×|0îb\u0010ñÙ\u008eC\u0002¶ÐÔ¸w(ö\u0006,K\u001b\u0010U«ù\u0007N:wyJ¯\u0004çháüÜ\u0018úìh\u0003\u0003mª°\u0014\u0000ù¥@óÀ\b\u001eòj-\u0086CT¶He\u0014Öè¤R\u001fn¤HÔµÂö\u001c\u0019¯\u0084¥Ù³w\u0012\u0082\u0098\u0003}R°.&¶ß¼\u0081ëâ\u009bnëÙâi\u0014ÿI\u0086À$ÀëI¡\u0090ÓØ÷\u0015ÊYþW7t²ÜÅ[µ\u001aËW\u0018$\u0098Ñ\u0088\u0094&Pv\u0081\u0083ú\u008e\u001c\u009aU\u0085\u0012Ú<\u009a }ÛB\u0018ÄÆ.\u0085É\u000bPÖ:sõ\u0005¢ú¨tñ¹ßÓG¶\u000e´\u0080$fÅds\u001dv\u0016-äõ®ÈÝ\u0098r\r\u009cpà\r\u0007WG\u009eÊc\u0096\u009cQü¦\u0085ü_OQÝ\ryÐ\"k÷\u0016¥¯)Íó.¤ò¼¾\u0090HÊ÷±¢ÉÍ½MÎÅ!ä½\u009a[°-çGq«Âá\u00199çfE\u0014ãáÃÄ£\u0084TÐ\u008d\\ø- P!\u0016_X¶YG\u0081\u0018\u001eb#\n\u00ad_ÇT\tK3\u0093A[Ï~\u001cS\u000b\u0010\u0002\b\u0093öü²\u0083YÊ\u0090\u0095ÙLÎ\u0087h\u0010I\u0005P¡&@ðÃ¥x.D\u0019\u0083J3(-åF\u0088Áµk¸¿s\u008b\u0090dà¨\u008eì\u009bÌõµs\u009f7ñ\u008e\u0016\tË\u001c\n\u0011\u0086¸\u001eÙv3 ß\u0010Û\u0003\u0097ÛßcyÑÔÍÜ\u008c»\u0099@9\u0010®%\"\rMGìpbÆ¶?Mç @0Íùï~?\u0095(\u0087\u008aÖPÑX4Ù1º\u0015\u009f\u0006¹Ær\u0094´\f.\u001d©\u000b%cáôðNlâC\u0015.pÓJ\u0084\u0010ã½\u0010)¼L\u009cô¬G\u008brzØ\u0095t\u00adCÙ\u0010þ\u0091ÖD\u009dßþ»/pÛq\u0095÷\u0099|\u0010ÀA¨\\÷WÄ·Â;×ËÎ¦\u0083Í0Â´H\",\u001aFpQÏÏ\u000efä`\nÕ\u009aDÏ\u0005\u0094i¥\u001d\u007f\u000eWnn¤¯®\u008f£òÝg»P÷gy¯\u0085-ÓÜ\u0010Hwß\u0006ÓÑ\u00ad>Qã»¹Õ´Çä -\u0005Æ(\u0003$\f\u0086Ã\u0012\u000b?h#ci\u009b¾*\u0014\u0019)\u0000\u001au\u009b.\u008a\u001f'\u0004\u0000 Z5î\u008dªÊÉ\u009cë\u0002ëùtÁ\u001dý\u0091°örÆ]JNáí \u00ad`ÜwÃ EÀ\u0093\u000fE\u0086$µ5N»ð]pM4Æ\u00ad?f{ÜPíÛK!\u0081q\u008fI\u0011H\u00adã\u009eò>\u0003Tnúý)Ð\u000eöE\u0003?·\u0093\u0013'jÜZ2F\u0013}\u0099\u0010ù\u008a»\u0097ÚÔE¢vc fÀy;\u000ekü\u008fº,oÍZA]Ñ\u0080º)\u0098°XXI§Y\u000e\u0088fý\u0095\u0010À\u0012Ï!\u00150]v\u001bì^\u00912\u0005çm \u0010p\u0015«\u007f9z\u0017<¸ý!£\u0010òwzËµ\u0089B\u0010cû9\u001d¬å¥k:\u000f\u0010<Ìä·ÉYÄÊî¢\u001e\u0087ûO\u0096ã \u0097\u000eÁÿØ\u0000<\u001fÍ²\u008a\u0089\u009atÈänú#x\u0092ïV\u0000ý\u008a?\u0011\b\u0099Åj\u0018Bò\u009d\u009bè\u0090ò´\u0018º\u00954\u0004¹[LÙ\u001bîÈíÝ \u008a\u0010Ø©Ãc\u0004!vÞ[Ý§qy\u001e\u009b®XLÙq\u008fÙç·B·°dñ\u001aJ?\tß|Ä²Ll7§ù½\u0019K0í\u0085w\u0018£ef\u0010%,¢HÂ`«^ÂE\u000b¿Ï\u0085Ôç\u0085éi\u0081'\u0088\rP¤\u0088\\²\u0016é\u0012°íÂ\u000eÉJò0+.Ø\u0007\u001cGP\u009bÿP[0 §ð2|%èR\u008dÝ\u008f\u001d\u008cÇ°Fc<¢¯Å_Ó¸\u0000\t(²¯Ô\u0001Õ\u008e 6`Ä\u0083v\\uc\u001cfâQ9Öø\t<\u0097£\u0019\n»bÿwû\u008fòÉß\u00ad\u00ad\u0018%\u009bÀ\u008csÙ\u008eH\u008a¶4ø¬\u0085·J2´·\u0085<J\u008d\u000f\u0010éM¹yýù\u009dý\u009cL \u008fï\n\u0011\u001e V/\u001bòÂ2Z\u0000_M\u00996¶¼°j²Ðù\u0085å\u008fÁ\u009b¹¥»ðD\u0092wÒ ÷Dð >\u008b5êÎí\u0089\u0005¥\u0085þÛ\u0004ùs\u0090\u0086Ö¼\u001c2\u0096më\u00adÆ\u0002k8\u0017\u0014¾rÔP\u008a\u000b8ê|ýH\u0000\u0094ùHõþX\u0005\u0017²qbª\u009f°-w\u0015T²ßÃ:\u007f?\u008d%N\u001dê\u0007gz\u0016Rv}D6õn\u0088æ\u0010\u001d\u000e7ÎÉ\u00076\u001c*\rà\u0007GÜ\u0004¨\u0010k³\u009f©}Xj\\RBvOÈ4½H@¤î÷\u0016kîu¤µs¸Ü}i\u00ad/\t\u0084÷Ã\u009dJÌ|é\u0093y\u000fxIæ\u0007\u0006RÒ \u0098:#ÌiÛ°\u000eÖkHi\u0005\u0005´\u0081<\ræ¿~V4+\u0003\u0081\u0093S ¬/ÑÄ×æåÉ\u0004£ç·D-ûÃ\u0012Þ\u0094å\u007f8gKÎÅ?ó\tJ|\u0085 ê-þ´©b\u009eÿ\u00ad¼\u0082£¦\u008e\ràx\u0082\u008ebðHÉD6\u0089¬(2Õ \\ \b×\u00ad0GL\u008e2Í.£\u0003\u0012K\u009b\u0097ã7ßVêKcDÍ\u008dÙ\u0080É²ÕC \"Ì\u0083A7Ð\u0015\u008b¹\u0019«\u0086Ì\u008b!\u0088ëÞ\u0091O¡'\u008fr\u0084\u0089$µF<_*\u0010'¤³éÒø\\ÑÊÈ¾\u009e\u0085\u008a2Û\u0010÷ÉW\u0097\u0015ßÞen\u000b\u001d\u0095úiÁ\u0003\u0010Q\u000eÄ\u0080`\"û}m\u0098ç%¹¹\u0081å \u000b·ÿ\u0019\\}\r`$\u009b\u0013£]\u001c\u0002'±y\u0096>\u008f'\u0013/Ô\\\u0010÷¾ ÅÒ\u0010Õ'WFà\u009cSúÎ®ÖÏ\u0090\b~9 \u0010\bÀß>3\u0015ø36'Of\u00987\u001cÇæÎ»jo\u001a{.¡\u001a «fÛ\u0089\u001821\u0016\u0001ùO\u009c¥\\\u0000)ó±K]{\u0004¤._Qhñl¨ç3KjÓ\u0092îio¯´\u009czÝIéSýH§õU\u007fW\u0080V´\u0094J'³|ÇÍ§ [\u0001r\u000eô\u0084#È\t\u0087ä\u001e\u009d\u0019FGPv¤ec\u008e[Å\u0081}$\u008dõ\u00923¤}¹\u0013µ;þr\u009dZWë¶¶J®?\u0002uhÃáØ³Yæ¡\rRð/ÄçlÏ\u0097(A\u007féYÏì²á{fK'å1\u0004\"olp7¸\u001c\u0091\u009d6/GªoìÁ:\t_\u0084dgß\u008bó÷?«\u0019¨\u0010 êË\u0002¾~J÷\u001aÁp}n¸ò\u001c¯U\u0010f·w´\u0004£\u0016,Þ'\u0082uÛ\\I± ¶8~J\u008b`'OY8ä\u0018Èu\u009eUþ\u0016óN'Á,ÍZ\rw\u008d\u0001¢99 m`Pd{n´\u0092§5x\u0004Á\u0010E\u0081,\u0006Ø\u0002/*\u0084ÓÊÂ\u0007ôMfÜ\u009b\u0018\u0084á »\u0089\u008f²·Úiï\u0080\\\u0000c\u008aÉ\\\u001cÀs©àÂ\u0010Ï\u007f\u0098ÍÕhq?O5\u0002Ü\u0081¯÷\u009b\u00105\u0098J\u000fP°É6À\u0087S\u0010½\u0091xè\u0010\u0087ZM¸\u001fÏùà\u0096dá\u0001í|\u0087Ï \u0004¥u\u0089>Me§\u0010¿&.l\u0000aðÈ\u0004è\u00adÃH¶¤ò\u008a\u008egðz\u00929\u0010h=rçb!Ô¹A99\u009f{`Ðð`ß/¦$\u0004î(Pö\f+\u007fññ\u009bú{a¶¡?¯\u0000tb\u0016`xY\u0004\u0093\u009a=|j\u0086\u0091\u0089b]ü'V[\u0016$\u001f|ðI±OÐl\bÆ?ªÊ&\u00028\u0086\u0007ö\u0015\u00178\u0090._Iì\u0099ßxôN\u0017ä¥^\u008bÛVÉû\u0000_Ï^ \nØr× Ö:¾ë~æ^·\u0091ßMh\u0018è2\u0086\u0080µïO\u0097×u2\u0083¢\u0007£w±\u0001ç\u0010\u0006â2¸ø^l\u00951ó\u0013yÊ,½G 6¦3#¦0FeI+ÁU\u0017E\u0001)\u009eTO¦â\u001e\u0006Îåtg\u0004\u0089Ægd\u0010ÜÆ£à5%è_\u0012p·pNl\u0085M\u0010£§\u0093è·\u0004¬\u0088åáÕ\u0085Äé0ê\u0010Ó.\u0010ô\u008b\u0007B\"®í\u009e3\u000fºÞÖ q\u008cXU\u0003`×\u0017\u0017¬êÓÉþ\u008a§ëÌØ}]\u000f*,\u0015çVÉ\u008a\u001dâò(å\u0000\u0095üÇ\u0088¼\u008aü\u001dÕø¹þI*`pz\u001dý¥G(sG\\\u001eÂÕïëÀ\u008aôFÕoF\u00028\u009fHÜ¡ûz¢\u008ca1\u009c²\u0091\u008d\u0007¥*·c\u008f«zÔ\u0005Ã\u009dñß¬<ìR\u0004 Õ.F«çà°yª©\u009d%\u0010y+\u008ew\u007f\u00828ãc\u0018 \u009d·,Ý}É\u0018×P+\u0085 Æ8³¹%\u0014ø\u009dU²:\u0010·\u008e*¿A~£\nAú;Y^ñJÁ \b\u0012¼L\u0082e\u0082ß¦Ið\u0004Tg.|Ç\u0016ó#ø{ç\u0084E4D´\u007f\u0000Ù\u0096\u0010\u0019ß.@ã\u0006ÿ\u0003¦]´òÒ;+Ap¯1>mU¾¾o\u0094Ö\u008d{\u0083>©<\"Á\u009c&g´ß\u0011\u009dÅl\u0096:vYY¿\u00adÜ\u0019¢\u0093ÃJ G¼\u0015\u000b\u009cÃUí\u0003ùlþ;\r\"Z$Þo#ð¨Ç:ÁÁÕ¿R¯[]õËC±b\u000fQÅq#\u0081aÓð\u0010ÖçºÆj]DEé\u001c§@õ%ãq(\u009bõÀ#\u008d²±\u0010tí\u001bÜ\t\u0004¯¯÷\u0012\u0087\tÁ\u001c\u000e\u0081\u0010Ë5÷½.åªÔ³â\u0092jÑ-Ë\u001b\u0010TX\u0091\u008e¯\u0099ò,W\u0013ñ¢Ä/Po0\u008a\u00104\u008auP\u0004\r¾ë&ÉrËlâ>-\u001e:\u0006/+\"@aå\u000fÙú.ÀÈ'\u0000´¼ÍýÇ<\u0082\u0086ýÈÇgä(Á\u0087¢U²ÒACuÊÚ®÷H\u001eà\u0093¨l\n/$ \u0092\u0010\u000fà}\u009d\u0081f\u0001\u008e#:i\u0018å\u001fÂHDf\u009b,³1©\u0004æ\u0090\u000fu\u0089\u0001¦«\u0091N÷¦ }ÿpÅ\u0001Â\u0007V¾½\u008f-ör®\u00938·zÉ¦é\u00856x\u0011Ó\u000bñ_\u0091²\u00ad9Ë\u0083²É.!\u0005 yÉ\u000e3ú_¶\u0099ò lW\u0003\u009a6Bñ\u009fá#Mós(kI«ß§4½Ï\u0012#¾\u0016ÚàÓ\u0017ÀsP\u000e]GÛ©\u000bÐ¸¯<}\u0007£øôöe\f\u000f\u0097#Ù´,õ\\\u0012\u0098·\u009f\töÐH¼*7©\u0007`Wi\u0013z'Ä \"pþ\u000fÛM î\u0001\u001c·ÊewA0\u008f\u008csÆö\u009c\rEÙ\tN\u0086\u0093£Q¼60y?\fU\u0091µ~«5*©Â×tÝç»Âa\u009a\u0018$\rÌäÆ$àº°Pí\u00907\u0001³©ØIh{\u000ekÅð©¾ù8\u001f>öÕ\u0014«Ä\u009c\u0090\u0016±t_¾aq\u0091NW6Óvk\u009eÇ\u000fîìvùBk\u009d¥Åì£ô\u0083/>q=P\u009f]Ö\u0087N}\u0010û\\@\u0096· Ô[Ô#ü\u0097\t\u009c×]E\u0017U\u0005gß^k\u001dJï\u0089üW&\"-öi\u0012iu\u0098#H\u0093ãENd\u0089¼*´D\u0015µzºÿ\u00184-¡rI\u00ady\u0086\u0007\u008dG4épÕÆg\f\u0094\u008fL\u0005ªN9J*÷¡IÛ~2oß\u009b<E\u0094kÃ{\u0080w\u00815\u0094à\u001d\u0083\u0098\u0085¾\\^\u008b\u001f*,\u0015\u009f\u009bNË*ØÄoY\u0017jL8$¯Ë\u009f\u0082+O[\rÉiPüf\u0005ªk\u0007á¾îÈ\b\u008céÎ\u001e8\u0005\u0012afæ\tç\u0088@ê\u001azrMè>y°}\u0093bÜWltc?Õë\u0083\"ü*\u0005îli\u009b\u0015)\fµÒaTÖ\u001a³²zh]Ù«ô¤\u001af*LC<rüé6}\u0002û9¯ÕM\u0010\u0010¡\u008cÚ7\u0096>Ë\u0019\u0083ÀÝ,ñ\n:\u0010g4\u008as ÙXØYÇÉÁ\u0084Ú\u00adù\u0010ùõ\u0007¦¨ÊÜFO¤î;vä±±8\u0004\u000b\u009c¥ò\u0094åHõ%F£°5$ß\u009a¥ëòúÇW\u0005±ÜÕqflæê@\u008fÏuV¢Ô®\u009a'&ã*?\u008d\\Q\u0087W\b\u0013ð%&\u0010V¡¢r\u001eñÉ=4ø\u0089\u001dëÈÐª\u0010Ü-ËXÄûû[7÷\u0081\u0015[co:\u0010×\u0000XfÊAP#·3)ç\u0004Û\u001a\u009b \u0085zã\u0001\u0093Î\u00899ãEXW\u0083\u0003\u0011í$30è\u0084YYé[FDK ì»¹8W\u009dD\u0014²\u0004Ò\u0096=*È¬{2cLù^ª]|¹\u008cUæ\u00808t\u0080%\rº,À\\I2nÄû\u008dOÉn\u0007ó?Îã \u0087vKÉ\u0010õ\u0010\u0088ï\u0082TÍÓ\n\u0096Ö0zJ\u000eN¾F\u0010\u0095\u0083v¹~\u0099ÅÃ+\u001fþ½E\u0091e!";
      int var7 = "EàõI\u0003Î\u0003e\u001bðÈ\u001b\u008fD.\u0019\u00825dºµó¦ÍÐ\u0012\u0013ñM®²ËEg{\u001e¢yÔkJk@Q\u0016\rëòHÈ\u0018»Ç±©Ý\u0090g¯k°rò\u001eúò\u0093\u008bÈ\u0013\u000fY^\u0090VÚo];Ì\u0091]î\u0003b\u001bÆ-·¿ÐM\u0012©3:Í\u0092üÑ\u008bÆ\u0016MÇ\u0017íáõsOhuÁ\u0081\u001aJÖÚ4{\u0018\u0083\u0085õeV\u008b\u0091\u0090BÎ\u008f+\u0081ÇS1\u0084\u008f÷T÷ \u000f\u009d(ªì'\u001dªÉ\u0084\u000f\u0000\u008ft ©\u0082x=Ôøº\u0096^±\u0080\u000e±å\u001cNQà.3~\\¬J+\u008dÙ\u0017 \u0005]¾ð\u0081ðÕ\u008aá4ð¿\u0080å{\u001dë\u0097Cô6q\u0083ñ¨îÔHI¦ÌV8O§\u001cµÍÁ\u0083\u0001Üö²§\"e4>\u0089UÂêdN\rV»Y\u0089ª\u000fþâö»eh\u001a}©-²\r\u0011\u009aU.#\u0090èÃâ\u0018ªjn<Ï( Ij'yA\u0014\bT9äëöÇ\u001cVLÁÔ\u0012y?ü\u008fÊ!ß=£\b\u0088b\u0003\u0094ûHTá\u00968 vÕÀ\u000bG\u0099\f³\u0093\u0098yd©¢è¿IP\f\u0014Z\u001dÃ\u001e\u00ad·jÔ³Ö\u0017x\u0010Úa9Y\"\u0094ù\u000e!Çc\u0002\u000f7¼è\u0010ùXwL\u0087\u0010\u0081WÛ\u0003åH\u0094ì3P\u00107ï¨!_ÚU\u0091\râ·¯ÿÇ \u009f\u0018*\u0006-5£\u0097\u0084ÂîcÌ\u008eÞ7\u0088á\u0087VóB\u001aÎNm\u0018Ó`\u0095lN\u0018oßAö\u007f\u008f\u0090¦\u0019#BrîÜ\u0098\u000eãÁ(zó\u0013õ\u008b\n »,²w\u001bïvw\u0002\b\u008fèÓ\\\u0018\t$e¿yf9I\u0090-BÁé¦^S@\u0088@<¦\u0011\u0002M\u0090\u0017ßþÃH+*\u0091Ýñ6ë\u001d\u001eþ< )H\u009azÖ^Ñï¢\u001eó¥dxm\u008aNË\u0089Ö\u0085\u009e®\u001f\u009bÇýp}_¡(moXhîø\u001f\u0011\f\u0010þQ\u009bM\u00ad\u0088VÙî&ZOI\u0086ëÎ\u0010¿B¿'\u009cå\b~\u001a\u0092)\u008f\u007f²#á\u0010_ä?°M\u00971+YE½AÎBÉ\u00898Å\u000e¼S\u0084Û\u0014jÏ\ra4\u0087H¾C[$ÑåÀé\u0006ß\u001eÎÈn\u0002 \u0016Å>©Ík+\u0081OHèé\u009a_µçòoC-ôB¨6õ@\u0018sÚo_²ãxÚ$´Ç\u0017Ï?ôúJÌ\u009ct\u0003\u009bZC \u00981\u009a2\u0001 ûgY×öNøm´¨¦í®¸\u0013\u0005ç\u007f¼\u0003\n'ÿ½óN\u0010Æo\u0014wo\u008b\u001e\u007f#·\"¶5yRð\u0010ÈqÖ¯¿½Tëq&ÜQ´Q\u0088\u0080 \t\bâ\"»«z\u0002N¥ô³ïò\u001f\u0017|\u0013KNk'§ýrÅ\u0098ÐÂÒJó\u0010ùýº\u0099Ãý öþ³ö¹g§õ}H2çÕåÈõ?\u0091\u0098\u000b\u0003Èr\u0006¡äN\u0091,åZG*Ý²K\u0084éåe\u0086Ä9ëp\u0096ïZJqaÉ½Ó\f`å¾\u009cúb\u0090\u0018fbÚq_YÈø=g®w|«-be\r\u009a\u0018\\¸·\u0088¯1V\u0080\u008e¬\u009e\u0005¦LrrZP\u0099\u0001¯\u00adqí\u0010ÚbÑ\u008aA×\u0081x?¸N`SÓPê\u0010}¯>¸]ëä\n\u00ad³5jÏ\tÈg ZíVÝ£ôÀ\u00127=\u0001\u0013F¼\f{\u0019@Íï\u0001¹%Ñ\u0091SHTb³\u0005P(îB:÷ü\u0013)ã.ÁO%«¡\u0017\u007fF\u0002;Ì/o\u0086²Tv\u008ea\u0092¯4'\rfSªi²\\3\u0010\u009b¶\u0086\u0092í\u0086\u008d¯\u009fiÛu¾N®-\u0018öð`ÜO\u0001\u008bÞQBö\u001eÎêk2VT¸\"CÌ.ß\u0010\u009bÅ\u008büo?z\u0017ÉLá\u0019æc]ë /\u0081h\u000bJ\u001e\u009ab\u0013ÝXèmÅ¡\u009eM\u0091»Ð\r4Sc¢\u0099¦\u0011×´Û\u0083\u0010Z\u0003Â½m\u0015RßÀÆ/n\u008aQË1(\u0095\u009dGN\u0000\u008e²ÛÃ\u0084ÃÜF}gk+!ãËÓö\u0088\rv_Û\u0012ÿ©a¢Ô¡¸P{\u0096sV \u0007\t\u000b\u0088_\u0084ö&\bõ\u008e¶&¿F\u0081mªw\u0083Ñ\u008c\tÙ\u0095<Vfp§FIHoLsãBÝ\u001f*±\u0082§\u0098ÉÔÄÜ§$\u0018\u00992~#\\Ú\u0088\u0091ö\u0080\u008cøÚI[3á\rZÂ\u0014\u0085\u0089\u0005zÄìÖ\u00ad×\u0019Ê\u0003Kÿ?Ky\u00898·óÓJ\u0081CÌ)|´¤|Ì\u0010m\u008eýá\u001dÒâ-\u009a>!êë\fyk(²Gx\u0098\u0082pzü³'«Kçì\u0005Mþ\u0085\u0019GÓ8×ø\u0004ª\u0014Dëj}At¯Ä\u0080\u0014ø\u000eÅ\u0010MV\u009f¢°Ñ\u0089î\u007fp_\u009bæ\u007f\u009a/(`iÇNv\u0012\u0084ñP\u0095ñC\u0012õÀ\u000bZ]¶þ¨AG\tÁ§'°¨\\Göå\u00934ä%º7® @\u0082¾Û³\u0010\u0085\u0089\u00993ÄdÔ¹¢x\u0090õþ3Î\u0093}w \u0096i[8Bgø(ÃÛê=c\u0098ØJ\u0083\u0094Sõò\u0003\"Yéå'¿uÍS\u0007ÅOÙ-_\u0002\u001ef¡<ÞèÏ½\u001d`0þ3Á#ÇºFR²>\u00140'\u0082[-@V\te¸ÃCï\u0004½c\u0090¥\u00852¿,f\u0006Û1\u008f%ô*cÖ=ÞØ\u0082Ù\u0010!GW\u007f\bµ\u0007 >Ì\u008cHTüD\u0092@/´Q\u001c¯\u001f4\u0086\f!\u0011)ÜÂ\u0013i\f}ÀT\u0002@\u00ad\u0013{[ó\u0012~â\u00874íÄV1?\bµ{ïÜ{\u0019³?Ýý¯h¥îB\u0090\r¯á÷ïS=£7\u009a\u00106©\"±\u009e\u0010Úå\u0011\u0017ê\u0091\u0097~*: \t'Þ6C\u0002\n\u0094Ê8ÙEÝOï?>\u009bè®ÇC\u0000\u0089Q\u0001P\tä)($\u0010j\u0000Á1ßQC\u0092NS¨Xs\u0017\u001f\u0098\u0018{$]· 7\u001adÿWï\u0092Rð¾\u0080ÞÄ\u009d«÷¸£Ú@]/ä\u001a \n®\u0084\u001c I\u009d\u0017ÖÝ\u0005\u001f³y\u008f\u0014!'\u0013¤\u0003èôù\u0006Íâ{qîþ¦Ø\u0098\u0002zÖûó:}SõÃI+ªGÅ½Æ\u0005%\u000b°×ÒÐæ\u0010\u0003~·\u009c¨\u0096\u0002¤j@z|à\u008a«q O}0§\u0088Ûú}\u0090!µR\u0098äâ\u008dÓÇÝÉ\u009f¾ÐéûDß|÷LN²8\u008a&mçàB]\u0004§¿\u0083Ùí\u0091Ë+³ \u009d\u0012ø\u001eXç\u00998~!\u008a³²c5©3UoC½{\u0015\r¿¦TÏ¿\u0018îî\u008e\tXtý· \u000e\u008f5¬Â\u0007\u001d2òÌÂ*?\u0090ÛÓFrY\u009cuû\"ä\u0093ý¼\u008eÇ\u0018¬D\u0010÷qr\u0010\u0002TÏÜ%\u001f|\u0012Çí¯Þ\u0018¡¸\u0099âG}µ\u0095ÂÔ\u001c6{\u0083ê¢¿äII@4_g8\u001d\u0013¼¢\u0013Ç|h6\u0087zKÄ}ó&\u0095ÔJçdP&¼ÅdGQ+\nÎYµê&tñM\u001bÐÁ'½Ô2Ì]\u0095\u009eóo\u008cDÉ\u0085\u0084`åwÅæ\u0081\u001b\u0087ºà¥\u0084\u009c¶Rû\u0092å¶\u0018nÆ·\u0017\t\u0093«|¡Ì\u001b¿Ø;\u000bM\u009cIîê\u009e\u0083z\u0098\u00878+µÉ\u0004Wò«#]Z\u0013«IwÝî\u0083\u009a\u0014[[GoÐæHxÆrÿAR\u0092\u008a\u008eôë\u0000\u000b\u001eø#\u0016¿`÷L\u0003\u0010mÈ Gb\u001d\u008a(\u009f\u000e×fô6£ä®c\u001aø*Ð7\u001eV`\u008fµ>ëóÞzD\u0017p¡Ì½ü=¤\u008dù\u0081o\u000bÔµ\u0093Ôç\u0007\u0016·9&\u0007\u0001æNù;«QyÉ ¨üÔCn6ê\u0084+c$8ó~\u000e`><?çÇ+fRP3NÙ^¥c\u0088)?Uç>m\u001cxì\u0092c\u001bîÄl\u009b\u001d\u0084)Õ §\u009e[º\u008d;ø\u0099K\u0086\u001dfëè\u0016¤\u000e¿Z%\u008f\u008d\u008a\u00adDô\u00920.Pÿ@\u007f¥\u0084Ä\u0013gûÎ9æ\u0099\fP\u0003½\u0086hÝi\u008b#l¼\t¬Z\u0015*Tká\u009a·ßvX_\u0002¸C¤\u001e¯\u0080ð)\u001a°aB\u0083Þx.Öú¯\u0080²×.5G¯!ýIh±Ùä«\u0083¬fÌhXð¿\u009b§\u0096[èøðMþ¨Ýd9ÒÄ]\"esP\u001aq)¢[\u0002|\u0005HF\u0099\u0086ç¥>\u001abþ\u0007¨\u0087ïª9ªÚú\u008b\u000bÎ\u0082\u00ad\u0096¥\u0088uõÓ\u008cÞ´'\u0010R¢Õ\u001b\u0096¬_Qp~4\u0099\u0096\u0006Jïþ RR\u000f\u00adÜW\u0093R\u0016¹=\u008cÊãÒFÃC¥ÀÐ\u009f\u0090£÷kxp«Ë\u00920{\\w,&w\u0019Os?1s/µD\u0094\u0086g\u009f\u0093\u0019j/í®k_Ë9«|/Å3ÂO*\u000bn/ªì¨(Öwû\u0011\u0089Jl&½p\u0095ß×G-\u008fZ\u001fZ'_\u0081{)nP\u001b\u008f(¶å\u009aXh\u0016\u0099Q£\u0090Òò\u0083\u008aNvþD5Xcí³\u0007Q=ó\u0091¾òÐ+¬ølÔ¹\u0097\u0093\u00ad\u009bfòÌGÈíÅ0ÏÓí\\iÕý5Í\u0092K\u0093\u001fC%\u00ad\\&\u0003<Ìøeõ\u0016§Ö\b\u008b\u0095\u00ad¦\u008fø\u0081\u0005^\u0082|ã«q²Ä3'\u009cÉ¢)ð\u0081\u0094®m\u0083òøÄ\u0010YÙ&Âa\u000b]çcÉ\u001b²Å§\u0019D\u0010\u009b\u0082s\u0015÷$Du\u001f¢\u0098ª^\u0094^\u0018\u0010\u000b±£V!¬õ\u0080²\u0019ö\u0080\u008c\u0089#\u0081\u0010\u0017Õçç£\u00ad7à¨\u008cG\u007f\u0017\u0019?\u0097 ´]ê\f'J\u007fêÝ\u008f\u008bÎ×À\"¯\u009d\u0087\báH(w1Îó¨Ë\u001bÝ\u0090²\u0010\u008f\u0016\u008al\u009d4Å\u0002\u0005m\u000e\u009e\u008a¾ºÚ(GñU5î`/&\u0006ÈRw\u0017d\u0088å\u0007a ÷=e\u0007Üo¾T\b|=^~O\t%\u0002\u0091Õ¦·\u0018Tr&ñI\u0093<{\u008e³#¯\u0090ú\u009e\u0019\u0015E|\u008b\u008f¸\u001eh8FùÙNXvW1y\u0010TSß\u0087ùàk>]Ùj\u000e\u0083\u0095%&\u009bÌÎþ»\u009f¹ú1\u0013¡Üfu\u0006¼\u0084rEYÙTy±-ÑmÖ:º\u0010\u00800ð·o(Í'P\u008dã\u0010Z\u000eì\u0096\u0010Þ\u0093\u0006\u0019mEI<\u00031\u0098\u000eøûî\u0019 ·\u0094\u009f]Çb<w©ó*\u0011#^ÍCdÈ\u001bâÝ¡I\u0012\u0002ÅÜ${ºÐò\u0010o\u009dÀ®©\u009a9Xpbå;\u000bÖ\u0093õ\u0010×pÍ!î\u009c\u0095TÎ¤\u00ad¦\u0003\u0087Ug\u0018zµè\u001f>\u0016U\u001fÊ@<\u001d\u0018\u007fbÒï\u0015\u001f×\u0011¹¤À8 \u008dd\u0005¬õ+\u009b$àó\u0087VZ\u00ad\u0091\\âÚÁ{ÑC]nG\u009b@£CÛß\rº\u0007¦\u0013ñÄÞ*Ó\u0086\b\u0000J¬.Õ\u0010<ØÌE¯\u008a(¯v\u0091ÔúÝ\u0085po#\u0094óº¿Øo:ý¥çýy+»U\u000e~\u0082÷ÊfÊ\u001dç\u008cü\u0083\u0091Ì¥(FE(Ó\u008b\u0090ô\u0000¥ölÅ#\u0002æ\u001cD\u0087qQá\u0086B,ã³\u0012\u000eWÖ¥|SM\u009a\u00ad®Êã¢\u00107ÃÕLWå\u0096»\tZ:{\u009e\u009c\u001f7 [æ\u0000M\u008c7øËxN}\u0088½\u0013}ù#q\u0004$\u0094\u0006UNVã4/«Ðjí\u0010÷2#\u00917¯\u0000\u009e)<\u0080ÜÑ\u0092³]pOd\u0000üxqQÚ$\u0019sñN\u0000±\u0081ÄÒçÄñ\u0093\u0011ïè\u0091#Q>×-g'\f\u00adÍÊ7þÕlcLXE\u0000³Ök\u0012\u001dw¯ÌÐ¶Dó\u001cIc/k{W\u0097\u0006uñQÎv¾\u009d¾ñEI¯mãnD¸oC\u0084¡\u008fa\u0099Çn°é³2\u0095ÍSúw+Ûû\u0095\bÉ\u0084sv\u000b0Ù\u009d\u008f\u0000\u008cN¨\u008aZ\u000e\u00833K°[ !\u0012CIñ9¸\u0095\u0091\u001bhÐÔX4\u009aNÁ¤Ù\u009bðéÎ\u0088¸\u001bÛ\u0095¡X¼\u0018W\u0016\u0080\u0085b½~\u0094\u001dÜ±\u0083l:\u0002Y\bz°]\u0007\u009ai\u000e0u\u0085Î\u0089DÐ\u008cÈ¡\u0018`ºØ¬|\\\u0081ðt¾\u0013USp¥¶\u0001â.µ®Ñ&2QâÅd\u0007\u0017ì\u0095*<`T¨K \u001c\u009fAAÈ×Ñ£+´1¹\u0087\u009c\u0005)áÉ~\u000bÉÀ´È5,Î7ÈÑõ,\u0018Ö6\u001e>u8\u0091\u0003\u0093w=:tÙ¾l+#ÈU\tòçW\u0010È=ä³GC«¹b\u009eÃ\u008e\u0095Å\u0084E ôÁ\u0003\u00ad\nµ&\u0094\u0091Xn\u001fVÄî\u00adß\u001d\u0096E\u0084U-¿7ß\u0017ëai½M ·µFð\u009c\u0085ËV\\p\u00adý0Àò\u0011ùg\u0087\",jú^5dê\u008bX9ªD\u0010\u0092È\u0018%á\u0082]E\u0099Ð\u008f\u0086.7ÌU\u0010|ã\\\"\u0092Û\u0000\u0082Þ¾Å\u008aü\u0005\ræ([H¹\u001cã¢G®dV\u009a\tª$d\u0086®Ãë~Ö\f`wÍì)6¸\u009bè\u0083Y\u00933\u0019´\bÐø(\u0013')*òóë2%\u009an@\u008b·½ó§ÆMv§qÕJ\u0018UhL\\æó9%9c}\u0004\n@Ô\u0010nwÚ¿`R\u0010QwÃ\u0094\u0093VLïø@dA&Ú\u008b\u0084-s6\u001c}$ô?\n¡þÃH\u000bÀÌ{¼dØ{Ê\u001dB\u008ac\u0087ï5¿XÄÔ\u000f\u0014FÂI±i\u0000\u0006ÉÐ¤Cõ8Ô\"«pÊ\u0089ë8´¯\u0010tvhA\u0098\u0098¹W·N\u001b_ÍS£o\u0010è\u0001\u0090`æS¾5!\u0013+[K\b\u0006a\u0010R\u0094 kTó#Ïbì?Tl\u008dúû(ñ{\u0000\u0007ËáråÊ\u001c5,ÆÜc8\u0011µ\u0099\u0012]\u0093öÜò\u00935`;geW¸O³7*\u008c\"*\u0018\u0000µîòÅ;\u0011½u½AF\u001d@XÊ\u0084\u0011;ôÎj¦\u0004\u0010g$±7Ñ\u0087û¨û\u008fÖµXð\u0082b\u0010¨\u0001\u0006ÒAq\u009bOæ¯p?S¨\u0092\"\u0010\u0015kkIb\u0000@ýk¨JÏ\u00ad8À\u0081(\u0010L[\u0083å\u009b\u0099k\u001fò ¶ìO5ãw<\u009dÇÇx\u0097ãÅê¨ª®Þ¬\u0082ev¬\u0003î>Ú\u0092\u0018\u008b\u0088\u0096ì`Ë\fºò\t- [c)o W\u0085\".\u0082Eà(û\nÎûÉ\u0092\u000exPhSÞÝ\u0003\u0012\u0006ké§8\u0092\u008e\u0084B\u0091\u0083ÈãäNèµû\u000bÚm#Â>\u0088 9÷cX\u001c¸·|%\u0011\u0004%¬Dã\u001bh\u009a\u001eü\u00ad¤6ßû1uGãá]G(¤;Ò)-\u0006x\u0094_X/ty¸ú\u0012î\u001b/½ú\u00030¯Îª×Ç«åe6\u0005W©\u0094h\u0010\b3(¶V¿\u0014îÛ'û\r\u00009é\u008bYB\u0014n\u0002þª1íÁ;3\ntâô\u0085\too\u009dà\u00adÖþÆp\u0010¶ \u008bú°\u008eØæõ¾}\u0080\u0083\b²*\u0010¹\u0089åí\u00078\u0015ÓçF\u009e\u0092qx\u0090-@Vf\u0013ð@Þ:jiçH\u0005wd7\u0080\u0099~\u0000ør\u009b\u008c\ræ\u0095$\rã:e^äºêÍ|\u00adÕph5\u0000«\u008a\u0005ÎifÏ\u001eWù\f?\u0098G7!\u001bZ\u0014e\u00adxhp\u001cc¢P\u008dÐ\u000f!i\u0018\u0001\u0018fFîÌ+nj\u000b+\u0084\u001cM\bñÂIÔ\u0012Ë>\u0087Í\u001fº\u009b$®Ü\u0091?)\u0004¹°_\u009c\u0005(\u009fdâ\u0004è¬>æ\u000b|\u0011?ö\u009b¹:EU¬\u0010¹JëÓ\u0084n\u0098\u007fÈ\u0085âO!~b\u008e3\"e\u0098?°ÈÎ\u0014\u0092È9\t§Á¢%näR2}\u007fÈÍ^=ì\u001b4.Ê \u0084È\u001eì\u0012ð\u001bYúº%\u0082s6U\u0002\u008f\u009e\u000fõ\rÉ\u008fK§þúÛg\u001aÆ\u007f\u0010\u001aÜ\u009f C\u008cy\u00ad×¦\u0080g¾·ÿC §m7@B\u0084\u008d¼\u00022\u0014«Æå¶{-³»\u0015Þ\u0092~\u0098\u0015êæ¶Pxf( Óß^\u00ad\u0003J°Uô\u009c\u0016{(\u0005ì\u001a¬Ì2\u008e\u001d.\u0097¹\u001dB\u0014>u\u0019cIPÿÃ\u008e\u007fp¹÷\u0014\rõyÃç\u0088\"Ô?\u0096\u009f¯\u00185\u00903\u0087·¹HÁZkWQS¦ís÷.W\u0099h(åÙ1 \u0098w\u0014\u009fÿ\u0093úv7³\u0001 a\u0088KáÁe\u00934\u0087OÒì\u000fêJü{pðJë\u0018\u00897¤\u007fÁÐ\u001ea\u0014\u008a¿c¢\u00116½<\u00937i¡T\\à\u0010\u0005È%lg¾\u009d¹2\u008a\u001d\r6\u0015÷Ð8\u001bh:Mÿ\u0017*ÃæC\u0015\fý\u0086²®ëÚÒ\u0085¥j`:\u0012g12ü\u0015 ¼ÐNSx\n_lÍÑå\u0015\u009a\u0095\u008cRÇ´bI\u0003Ù\u0085;ô8jp µºJ\u00ad\u0010\u0007mµä\u0016\u0089\u0087£\"hOzF\u0080T\u009cG\u001c«å'U,ýöTõ¡\t\u0091z|v\u001eÆo\u009bMZxxî¥¬B\u000efN \f£\u0091ªøö\u0007TcT]&ø¥È\u008cC\u0012IWÙà@fÙ\u0086\u0093¶Ôì¹\u0083 ¯\"3¤\u001aæÏ>\u008aå\u0098Å@\f\u0010jòÎ\u0092ÒÀ[è,;o\u008aq\u0019¾·Ñ(Ò\u009d\u00169\u00078£\u0004ìÖ·ù\u0094qõýC\tÝb.ñB\u009c\u0002UíT5ÍÝÛýÎÁS+\u0096¯*\u0010\u0088a\u0090\u0014P\u007fÂv\"öÎc°\u000eÎ\u0093\u00185`.·¿yl¸ÿk|Á?+&ióÕû^\u0013â: \u0018w\u0001ä\u0084\u0012u\t\u0011?\u0011R×'*\u000b\u0000ü=U\u0005\u008fo\u009d-\u0010\u008eÁ\u008f§®µ\u009aü\n-\u0017'í6ñ\u0014\u0010\u0011ÃmD\\6÷MÓä\u001bâtz\fß\u0010\u0018/d\u0093£\u0013*°ðz2ZÕD7T8¸¨<bè\u007f²£/\u00100k8$\u0004Iß\u0081\u009b\u0010AÞY%Buf\n ÕÇ:ßÁÚ)\u000b\u008eQ\u00adëõ\u009b`P\u0092ü\u009b\\zd¯2ÉW\f\u0018Ú\u0081\u001bz&&ÂÍäÿÅ\u009fÑ 6\u0095åH4ª\u0085týõ\u0010&[\b|\u0082Ì2?ýÑgãJ\u0098ÓY\u0010\u0000Ý¢\u0094 \nß[v\nÔc¯A\u0088ì\u0010Ø\u008cC\u0018wýæOaÞ¾\u0005\u0090\u0080±9\u0010\u0080\u00896Ê\u000e}©e^4À<1Ð\u00864 Ëö_==lvGN~ª¾nho¦\u0003\u0003¨lÿ³\u0093ä}º\u0012\u0095B\u0089#+\u0010\u0012s*\u0081\u0006¾U\u0018þ]\u001c¥ûlw¶\u00989¸\u00ad²ä\u0098ßÄ\u000ek¡jÑå×£a×\u0018:\u009d¥ ºó2ÿEéhÛ\u0007WE\u0080W\u0096z}DÎg\u0010Ö\u0003Ï9ïß«éi>h¼1\u0089}»·m\"\u0018e|¥\u0015@Ä\u00adºÇ{¥ùÚî%öó¸ÙN\u0092 ¸´É~\u008d\u0006\u000e¹\u0002\u0017\u0091ûÈÃ¥\u0092\u0017, C\u0011 \u009d\u0017?\u00193ÃxHßïÑy©\u0080\u00ad\u009e}NAg¸ggØÞ\u0016±³Ó\u0017\u0011ú~W¦ñ\u001a\u0084«bØ×°\u0086O è\fÐSIfDK}Â±øcZ¨\u0014J$Rò0«ÛÖéï`\u0093I7ºß\u0010\u0001¿¬Vv!?vï©\u00ad}Ù\u0017\u0090;\u0010\u000bk\u009c¡³ù\r>ÉÅQo&\u000e^\u00048\u001f_)5¾´)Ï\u0005h+@³ËÉO\u0016e{°gúè\u0096ù\u0092CùÀá\u008b¤©²8òC£ô\u0082ØÔèÅþ;Ü\u0018é,=û{\u008aDá\u0010X\u001b©H(qÅ\u001c\u008bý\u001c'©Ð\u001b·\u0010ä¶\u0003öËvù\u001aß\u0004u=«À\u0001zp£¿Ý]\u0001\u0098©L\u0012)%\u0092\u0088,<Åg\u0097\u00927º\u0081~m¶ocK=õ\u0095(¿4°k\u001eé1.1¦\u008f\u001a\u007fTëWÏË\u0089\u0085>ð\u000e\n\u0089\u00966\u008dø\u008a\u000f0÷\u009a{H[£÷ý?â¥\u001eÓ\u008aÆmÄDà¤\u00075ao-¼\u008d\nã\u001bv\u0092 ÓH,\u000bG\u0091G{Q\u00195ÿ\u00ad\u0082= (úïÉ§\"óp¦Úª\u0085@)ã ¢\u0082\u001e³Êü\u0095*\u0092¿æ[:³ó\u009c\u0018\u008d2Ýï\u0080E\u0087\u008d\u001cøÁy}¹|\u0090:^\\\u0002±G\u008eë\u0010¢r\u0090§W\u0015ÚÛ>\u001ath\u0086\u009câï Nßäè»\u009e42\u0010\u001f ÏsËò×iK{-_Ñ\u0093\u0004M\u0010\u00ad\u0019?:\u009ap\u0010ã\u0013Õ\u0018¾\u008eä=\u009dÚ,\u008b\u000biøg\u0018³\u001eÈ¨_ÏL\u009c\u0090Ö\u0083\u0094\u0018G\r Z\u000eÛ\u009bF-ö¸¨\u00adMV¦·\u0004\u000e\u0094\u007fï=\u000fA\u0090AVÖ\fvÂÐî\u0019ªQ´S\u008cÍÜò¨\u0091\u008fl\u0011\u001d\u009c\u0006ÿ\u0088Oí{\u0084Ú\u0016D·õä\u001f\u001a UøJ·\u009dì\u0087\u0083ª¬·%½|\u0005n¢ë\u009f]rgÐYe\u0097B\u009c´\fú¦¾\u0004Å¨Ú\bW´2Ð^\u008e\u008a\u008eñs£ú×?¼\u008cÉ;§\u0096<Vç\u008aÝ\u007fT¿\r£b\u000f³°lz\u0097áF\u001cMPê\u0080!\buÖì>QÞr\\ìó.\u008cÔG\u0003\u0011éèp¯ÉÑâ\u0017\u000eßf\u0091*\u009a\u0010ýp.ãßÁ°4\u008f\u0014Àx{Pp: \u008c`ÐEXë.\u0083`\b%í e|\u0095Kî\"áLÿ5¢Û\n¥|\u0003\bþZ\u0010ì?Fôtçé;G\u0084\u009cW³Ç;»\u0018)ìëí$%¸ú{0\u0086Î¯Þ\u008flÈ\t\u0097*Ñä\u0001G\u0018\u0011¶\u000eX]4É ´«øR\u0000>VÖà²X\u009e\u0006\u008a3u\u0010y\\ÝB¬\u0096æ\u0094Âî\u001cxÁ,(óè.\u00adáü(Å\u008a<ydåËL×Ú+Ý\u009cÞ<\u0000uÈD\u0091Z9L\u009c¦ti\u0017WØÀ,\u00991}å\u0003\u0084\u0018$ÀÝo6\u001f_Õ +j]'¢áGªãç|\u0018\u008e\u008cU\u000f\u0093\u001b\b²OvylJw\u0010Fº¯-Ð\u0015íG7b\u008c.\u0001\u00138¹t\u0012I\u0019B¾\u009d¯e\u001b\u00ad \fb¡<S\u00931P>~2hEßì\u0089ªÊ 2®êB«Ì\u0091¸ü]å\u0098!\u001f\u000e\u001fé\u001dFÖ=\u0001Ë\u007f\u009aü\u0087³ª.ÀOäB\u0012\u001czH\u000b<\u00965·2\u001a¸\u0006#Ç¹Ë5%øã\u008d\u001aË°xjXÇxnë\u0087ªéK\u007fÓÝ÷ç¡i6\fÈ¾4iÀÇØÑñç\u009duñyÇ86S»/çÂÚ\u0098çQ \u008bö¹Ó\u0092\t!#¦]\u001dmT\u008bø¹d\u0090ä¦Y\u0003\u009aôzÔ%G\b¯\u0081\u0016 ó\u0005\u001d!'Ó2\u0098È\u0006\u000eb\u0086þr\u000b\u001dÏ\u0085d_+Ò=?hJ\u0007ø\u008d\u0003\f8\u0081\u0083-#ö½ÏbÒkî\u001c\u000bÏÛ>Q³\u00ad\u0011Ht\u0085w\b\u0019õX&ØÄ\u0012ÚUîÖ\u009d\u001f\u0091îW@N§C\u008eÒÞ~ç@\u0019\u008d9P.0\u0006¢\u0002®×©\u0084²³m\u000eÐ\u0088Ì@±^w÷\u0089Ò\u001fô\u0015 \u000f¬íTÄ}öÇ\u0086h\u0015m\u0084Ñ®\u0093\u001bÀá8å\u0014K\u0010\u0002ót¨O\u00ad\u008e=ë®Õ*\u009a,\r\u0006\u0010\u00ad\u0014þ\u0081\u0014è£îi\u0003\u0085Y\u000eã\f\u009e`EÄ$~\u008d\u0000\u008fÛð*\fj\u0090ºCûiÃE/mýÔ·\u009frª\u007f¦û\u0019\u001a\u001d\u008f(\u000f\u0014Á/i\u0017?_Áßu\u000bÞ\u0095,¯\u0015MH÷\u0080õ\u0016¼<ý\u001dFÅÎ\u0018I}µ\u0016áÊ\u0014\u0096\u001bÌú\u0014÷ý_Ø\u00842÷ûú¦9S<;îEf¼\u0010!62ëy\u008b\rÜu\fÉ\u0006B\u000bñ\u0091 R\u0014¢~É$´0¶»U\u008a\u0096º~\u000føX\u0098¶¹±_I©Þ¶G_ÅüC Bm/Ù]\u0085©ÔôÉW\u0003ô$\u0002*TÇ\u0090è_-\u0014[\t\ff*\u0015â´\u00128/\u0005\u0081\u009d&º)\f\u0095ÝO·S£B\u000e(\u009dúÓUë±\u0013ì\u007f9ÇØ£Õõ\u009e\u0084\u00ad\u0016?§Ê\u0094Ì\u0089¾\u009f¸ú\u00833¡³À¹À!s·\u0018Ò\u0088´#\u000eqpl\u0000ÒÖ\u0089\u008d\u0007ÿ¤kÝ\rUâ±ÏP \u0001Ñ\u0000âØÉQ\u00061\u0014\u0094Ëûù\u0083ï9ª\\\u0012\bzQ\u0089RVÝ(²W4K ÙP!c~N\u0095nCòp=jK£\u0096\u001b¬P%¥LôÇ?gè^¶¾<\u0098pÒ8ò÷4\u001b\u0096ý!åâ\"Ú0©9\rã£ëSWó'ÄJê²¥c¨\u0087\u0085ü\u0089[\u0018\u0088êÕ\u0011\u001dKÚ\u0004]pýj\"A\u0006\u009a\nö/\u0088B\u00108\u001fg²¶Ñ«I\u0091\u008bP\u0085Q×n@ÎJSÑOàäÂm\u0094#\u0019t#\fá§+v\u0016¨¦ñe\u0082È³\u0083Z®\u0098â1S\u008eëÅ(\u0083ßLû\u008cçÏé8K\u009d\u009bHu\u001dså;aQé;L´²ª*R9\u0088ã\u000fTÏ\u001f%\u0013\u00862\u0093h\u0098\u0018b¯R\u0014^¹U\u000f\u009cV|Á\u008fTJäã\u009cÖþ/2Z²Ö\u008fËß´\u001d\u0087y\u0090ð\u0083´\u0094%\u000fe7þØ¯\u0080p\u0094\u0091áþ\u0092\u009a»¹8\u00115¹\u00886î^èn__\r\u0014cã\u0011,\u0092¡ß$2è\u0094ÏR\u001d\u0004\\o ø½\u0014ø§\u001fsÞá6\u008c9<\u001dÜÞ(\u00918jõÉ¨4i\u0098Aï®Õï»KØ¡øÉ(G@ïVlEù\u0095b=\u0005\u0010O\u0095¸Ô\u0098°\u00920Ës\u000e|\u0005RË\u009fe{nåIìC+G;4¦â\u009aMßfT¿t\u0083Éê3K¢P~\u009dÇ\u009f\u00adè \u0087ò\u0096¨¶\u008d\u0018q×ù;o\u0018\týÍÉ6ÝÁ3«o¯ô{V xÎ\u009f\u0018Ëõ8e/7¢üÙÊ<¼h±4'û\u0007\u0014×z\u0000ÚÒ\u0010Øk]Ä\u0015\u0082Ë\u0095Ãµ?LËh\u0082µP¯\u0080çg*ëjÂ$\u0005\u008cpQß,Ê÷»/\u00975LÃiÑ\u0016g7\u0010éhìÆ\u009f=wb\u0084§;%_5;Eá/³\r®OYq\u001d\u000evCâ'·\u007fk¼§Ý\u0018\"Tüù\u008d\u001e.ÖßÅ´ø\u008aÌ(çHÝóhÑüô\u001b¬GÛ¬\u000f\u0098h\u0006`fRÂª§¬a\u0004\u0084\u001d¿eÞÌÏk)DT·Ã\u0001\u0010s\u008büË\t(Ì\\HÀ\u0092>\u0003ë¿Ô(ì\tO0DìPÃ)\u0014[)/»\fÉ<\u009eG\u0089À\u0087_n\u0084\u0000ÅÀ4\u008aÈ\u009e©¦\u0011i\tAÌh(ª\rb²K\u0096\u001fsúÃÆ2(³\u001dA\u001bïíB\t \u0086-\u0013N\u008e\r±\u008dçð©\u0090äv`\u00989Ü ð\u0001·4.¬rÁqGJÄ¢JZ<9Ð\u0080]Íúÿ\u001a\u008a\u0000\u009c!XÁ\u0091¥\u0010\u0095[:KAÇÈ»ø·ÞÃÿI\u0098( \u001aÊy\u0015¦ÞÛ>ÐÎ\u00840véåÛ\fP\u001e0C\u0084:\u0082v\u0001\u001c¨üÔD\u009d@\u0002\u008c[ÈiÎ\u0084i'S \u0003\u0004\u0084\u0004ÐÁðæ\t\f\tÄ6qÝúàog\u0011\u0012Ë\"Íh»b\fðXÃâóÞðÀü.\u0016\u0015\u007fQ\u0088!¯G6æ\u0007VÆÄø\u0010\u001eÄ\u0002Ü\u009d\u0088d\u0093M \u0013\u0016ìTTÁ8A\u0014\u0080\u00021\u0017Ð¶fê\u0096\u001eï\u0010ð\tÒ;FÁ=ä\u0093Õ_ÝK»¢j\u008e9\u0092·ÒÉ=YJø°ÚQ?Õ'\u007f^É7k:S±0\u0005\u0010\u0002Ñ\u0081\u001d.NfDþ\u0019Ø\u0017ÂP;ò \u001e|eýÐ\u0011©PrC/Ø3\u001a¯~ó\u008eUéÕ°¥\u009aÏ0ÀI$\u0014a08¥éQòÊaÛÎýq\u008c\u0015Åô_Inner2\u0095¢\u0095$D©ï\u0091/2;ôÞ\u0014\u0098\u0012\u0016ÒòGbç3¯M¶|ké\u001ffÔñÐ*ú\u001bmÃC\u0010W$fÁ\u0087\u0096\u0080ö\u008cÿd/ä\u007f^U\u0010µ\u0013\u0016§Rd¢fÁö\u009fG\u000f¶~\u008c\u0010\u0014\u0017/\t·¨P¢]Iy¾6£}~\u0010\u0080ë\u0094ü1n·\u009a\u0091µÆ\u0019·<1å(A&|¹\u009bÔz÷z\t&x\u0086|²³kf;ü\u0080·nÆ¬ÔQ\u000ed~÷ñSì\u001d\u0086[\nT¦ §7ð\u000fQgÇå\u001d\b\u001f\f\u0010ñ)\r\t¶\u009c\\Âû!\n\u0085w2½Ñ¦}·\u0018\u008fèn9:;*Fÿ\u008f¡\u009eÒ;\f0]\u008f1r?\u000e^æ\u0018\u008cpÞÐR\u0093\u001d\r,ÿ\u0013\u00841?¥ØI/w×|0îb\u0010ñÙ\u008eC\u0002¶ÐÔ¸w(ö\u0006,K\u001b\u0010U«ù\u0007N:wyJ¯\u0004çháüÜ\u0018úìh\u0003\u0003mª°\u0014\u0000ù¥@óÀ\b\u001eòj-\u0086CT¶He\u0014Öè¤R\u001fn¤HÔµÂö\u001c\u0019¯\u0084¥Ù³w\u0012\u0082\u0098\u0003}R°.&¶ß¼\u0081ëâ\u009bnëÙâi\u0014ÿI\u0086À$ÀëI¡\u0090ÓØ÷\u0015ÊYþW7t²ÜÅ[µ\u001aËW\u0018$\u0098Ñ\u0088\u0094&Pv\u0081\u0083ú\u008e\u001c\u009aU\u0085\u0012Ú<\u009a }ÛB\u0018ÄÆ.\u0085É\u000bPÖ:sõ\u0005¢ú¨tñ¹ßÓG¶\u000e´\u0080$fÅds\u001dv\u0016-äõ®ÈÝ\u0098r\r\u009cpà\r\u0007WG\u009eÊc\u0096\u009cQü¦\u0085ü_OQÝ\ryÐ\"k÷\u0016¥¯)Íó.¤ò¼¾\u0090HÊ÷±¢ÉÍ½MÎÅ!ä½\u009a[°-çGq«Âá\u00199çfE\u0014ãáÃÄ£\u0084TÐ\u008d\\ø- P!\u0016_X¶YG\u0081\u0018\u001eb#\n\u00ad_ÇT\tK3\u0093A[Ï~\u001cS\u000b\u0010\u0002\b\u0093öü²\u0083YÊ\u0090\u0095ÙLÎ\u0087h\u0010I\u0005P¡&@ðÃ¥x.D\u0019\u0083J3(-åF\u0088Áµk¸¿s\u008b\u0090dà¨\u008eì\u009bÌõµs\u009f7ñ\u008e\u0016\tË\u001c\n\u0011\u0086¸\u001eÙv3 ß\u0010Û\u0003\u0097ÛßcyÑÔÍÜ\u008c»\u0099@9\u0010®%\"\rMGìpbÆ¶?Mç @0Íùï~?\u0095(\u0087\u008aÖPÑX4Ù1º\u0015\u009f\u0006¹Ær\u0094´\f.\u001d©\u000b%cáôðNlâC\u0015.pÓJ\u0084\u0010ã½\u0010)¼L\u009cô¬G\u008brzØ\u0095t\u00adCÙ\u0010þ\u0091ÖD\u009dßþ»/pÛq\u0095÷\u0099|\u0010ÀA¨\\÷WÄ·Â;×ËÎ¦\u0083Í0Â´H\",\u001aFpQÏÏ\u000efä`\nÕ\u009aDÏ\u0005\u0094i¥\u001d\u007f\u000eWnn¤¯®\u008f£òÝg»P÷gy¯\u0085-ÓÜ\u0010Hwß\u0006ÓÑ\u00ad>Qã»¹Õ´Çä -\u0005Æ(\u0003$\f\u0086Ã\u0012\u000b?h#ci\u009b¾*\u0014\u0019)\u0000\u001au\u009b.\u008a\u001f'\u0004\u0000 Z5î\u008dªÊÉ\u009cë\u0002ëùtÁ\u001dý\u0091°örÆ]JNáí \u00ad`ÜwÃ EÀ\u0093\u000fE\u0086$µ5N»ð]pM4Æ\u00ad?f{ÜPíÛK!\u0081q\u008fI\u0011H\u00adã\u009eò>\u0003Tnúý)Ð\u000eöE\u0003?·\u0093\u0013'jÜZ2F\u0013}\u0099\u0010ù\u008a»\u0097ÚÔE¢vc fÀy;\u000ekü\u008fº,oÍZA]Ñ\u0080º)\u0098°XXI§Y\u000e\u0088fý\u0095\u0010À\u0012Ï!\u00150]v\u001bì^\u00912\u0005çm \u0010p\u0015«\u007f9z\u0017<¸ý!£\u0010òwzËµ\u0089B\u0010cû9\u001d¬å¥k:\u000f\u0010<Ìä·ÉYÄÊî¢\u001e\u0087ûO\u0096ã \u0097\u000eÁÿØ\u0000<\u001fÍ²\u008a\u0089\u009atÈänú#x\u0092ïV\u0000ý\u008a?\u0011\b\u0099Åj\u0018Bò\u009d\u009bè\u0090ò´\u0018º\u00954\u0004¹[LÙ\u001bîÈíÝ \u008a\u0010Ø©Ãc\u0004!vÞ[Ý§qy\u001e\u009b®XLÙq\u008fÙç·B·°dñ\u001aJ?\tß|Ä²Ll7§ù½\u0019K0í\u0085w\u0018£ef\u0010%,¢HÂ`«^ÂE\u000b¿Ï\u0085Ôç\u0085éi\u0081'\u0088\rP¤\u0088\\²\u0016é\u0012°íÂ\u000eÉJò0+.Ø\u0007\u001cGP\u009bÿP[0 §ð2|%èR\u008dÝ\u008f\u001d\u008cÇ°Fc<¢¯Å_Ó¸\u0000\t(²¯Ô\u0001Õ\u008e 6`Ä\u0083v\\uc\u001cfâQ9Öø\t<\u0097£\u0019\n»bÿwû\u008fòÉß\u00ad\u00ad\u0018%\u009bÀ\u008csÙ\u008eH\u008a¶4ø¬\u0085·J2´·\u0085<J\u008d\u000f\u0010éM¹yýù\u009dý\u009cL \u008fï\n\u0011\u001e V/\u001bòÂ2Z\u0000_M\u00996¶¼°j²Ðù\u0085å\u008fÁ\u009b¹¥»ðD\u0092wÒ ÷Dð >\u008b5êÎí\u0089\u0005¥\u0085þÛ\u0004ùs\u0090\u0086Ö¼\u001c2\u0096më\u00adÆ\u0002k8\u0017\u0014¾rÔP\u008a\u000b8ê|ýH\u0000\u0094ùHõþX\u0005\u0017²qbª\u009f°-w\u0015T²ßÃ:\u007f?\u008d%N\u001dê\u0007gz\u0016Rv}D6õn\u0088æ\u0010\u001d\u000e7ÎÉ\u00076\u001c*\rà\u0007GÜ\u0004¨\u0010k³\u009f©}Xj\\RBvOÈ4½H@¤î÷\u0016kîu¤µs¸Ü}i\u00ad/\t\u0084÷Ã\u009dJÌ|é\u0093y\u000fxIæ\u0007\u0006RÒ \u0098:#ÌiÛ°\u000eÖkHi\u0005\u0005´\u0081<\ræ¿~V4+\u0003\u0081\u0093S ¬/ÑÄ×æåÉ\u0004£ç·D-ûÃ\u0012Þ\u0094å\u007f8gKÎÅ?ó\tJ|\u0085 ê-þ´©b\u009eÿ\u00ad¼\u0082£¦\u008e\ràx\u0082\u008ebðHÉD6\u0089¬(2Õ \\ \b×\u00ad0GL\u008e2Í.£\u0003\u0012K\u009b\u0097ã7ßVêKcDÍ\u008dÙ\u0080É²ÕC \"Ì\u0083A7Ð\u0015\u008b¹\u0019«\u0086Ì\u008b!\u0088ëÞ\u0091O¡'\u008fr\u0084\u0089$µF<_*\u0010'¤³éÒø\\ÑÊÈ¾\u009e\u0085\u008a2Û\u0010÷ÉW\u0097\u0015ßÞen\u000b\u001d\u0095úiÁ\u0003\u0010Q\u000eÄ\u0080`\"û}m\u0098ç%¹¹\u0081å \u000b·ÿ\u0019\\}\r`$\u009b\u0013£]\u001c\u0002'±y\u0096>\u008f'\u0013/Ô\\\u0010÷¾ ÅÒ\u0010Õ'WFà\u009cSúÎ®ÖÏ\u0090\b~9 \u0010\bÀß>3\u0015ø36'Of\u00987\u001cÇæÎ»jo\u001a{.¡\u001a «fÛ\u0089\u001821\u0016\u0001ùO\u009c¥\\\u0000)ó±K]{\u0004¤._Qhñl¨ç3KjÓ\u0092îio¯´\u009czÝIéSýH§õU\u007fW\u0080V´\u0094J'³|ÇÍ§ [\u0001r\u000eô\u0084#È\t\u0087ä\u001e\u009d\u0019FGPv¤ec\u008e[Å\u0081}$\u008dõ\u00923¤}¹\u0013µ;þr\u009dZWë¶¶J®?\u0002uhÃáØ³Yæ¡\rRð/ÄçlÏ\u0097(A\u007féYÏì²á{fK'å1\u0004\"olp7¸\u001c\u0091\u009d6/GªoìÁ:\t_\u0084dgß\u008bó÷?«\u0019¨\u0010 êË\u0002¾~J÷\u001aÁp}n¸ò\u001c¯U\u0010f·w´\u0004£\u0016,Þ'\u0082uÛ\\I± ¶8~J\u008b`'OY8ä\u0018Èu\u009eUþ\u0016óN'Á,ÍZ\rw\u008d\u0001¢99 m`Pd{n´\u0092§5x\u0004Á\u0010E\u0081,\u0006Ø\u0002/*\u0084ÓÊÂ\u0007ôMfÜ\u009b\u0018\u0084á »\u0089\u008f²·Úiï\u0080\\\u0000c\u008aÉ\\\u001cÀs©àÂ\u0010Ï\u007f\u0098ÍÕhq?O5\u0002Ü\u0081¯÷\u009b\u00105\u0098J\u000fP°É6À\u0087S\u0010½\u0091xè\u0010\u0087ZM¸\u001fÏùà\u0096dá\u0001í|\u0087Ï \u0004¥u\u0089>Me§\u0010¿&.l\u0000aðÈ\u0004è\u00adÃH¶¤ò\u008a\u008egðz\u00929\u0010h=rçb!Ô¹A99\u009f{`Ðð`ß/¦$\u0004î(Pö\f+\u007fññ\u009bú{a¶¡?¯\u0000tb\u0016`xY\u0004\u0093\u009a=|j\u0086\u0091\u0089b]ü'V[\u0016$\u001f|ðI±OÐl\bÆ?ªÊ&\u00028\u0086\u0007ö\u0015\u00178\u0090._Iì\u0099ßxôN\u0017ä¥^\u008bÛVÉû\u0000_Ï^ \nØr× Ö:¾ë~æ^·\u0091ßMh\u0018è2\u0086\u0080µïO\u0097×u2\u0083¢\u0007£w±\u0001ç\u0010\u0006â2¸ø^l\u00951ó\u0013yÊ,½G 6¦3#¦0FeI+ÁU\u0017E\u0001)\u009eTO¦â\u001e\u0006Îåtg\u0004\u0089Ægd\u0010ÜÆ£à5%è_\u0012p·pNl\u0085M\u0010£§\u0093è·\u0004¬\u0088åáÕ\u0085Äé0ê\u0010Ó.\u0010ô\u008b\u0007B\"®í\u009e3\u000fºÞÖ q\u008cXU\u0003`×\u0017\u0017¬êÓÉþ\u008a§ëÌØ}]\u000f*,\u0015çVÉ\u008a\u001dâò(å\u0000\u0095üÇ\u0088¼\u008aü\u001dÕø¹þI*`pz\u001dý¥G(sG\\\u001eÂÕïëÀ\u008aôFÕoF\u00028\u009fHÜ¡ûz¢\u008ca1\u009c²\u0091\u008d\u0007¥*·c\u008f«zÔ\u0005Ã\u009dñß¬<ìR\u0004 Õ.F«çà°yª©\u009d%\u0010y+\u008ew\u007f\u00828ãc\u0018 \u009d·,Ý}É\u0018×P+\u0085 Æ8³¹%\u0014ø\u009dU²:\u0010·\u008e*¿A~£\nAú;Y^ñJÁ \b\u0012¼L\u0082e\u0082ß¦Ið\u0004Tg.|Ç\u0016ó#ø{ç\u0084E4D´\u007f\u0000Ù\u0096\u0010\u0019ß.@ã\u0006ÿ\u0003¦]´òÒ;+Ap¯1>mU¾¾o\u0094Ö\u008d{\u0083>©<\"Á\u009c&g´ß\u0011\u009dÅl\u0096:vYY¿\u00adÜ\u0019¢\u0093ÃJ G¼\u0015\u000b\u009cÃUí\u0003ùlþ;\r\"Z$Þo#ð¨Ç:ÁÁÕ¿R¯[]õËC±b\u000fQÅq#\u0081aÓð\u0010ÖçºÆj]DEé\u001c§@õ%ãq(\u009bõÀ#\u008d²±\u0010tí\u001bÜ\t\u0004¯¯÷\u0012\u0087\tÁ\u001c\u000e\u0081\u0010Ë5÷½.åªÔ³â\u0092jÑ-Ë\u001b\u0010TX\u0091\u008e¯\u0099ò,W\u0013ñ¢Ä/Po0\u008a\u00104\u008auP\u0004\r¾ë&ÉrËlâ>-\u001e:\u0006/+\"@aå\u000fÙú.ÀÈ'\u0000´¼ÍýÇ<\u0082\u0086ýÈÇgä(Á\u0087¢U²ÒACuÊÚ®÷H\u001eà\u0093¨l\n/$ \u0092\u0010\u000fà}\u009d\u0081f\u0001\u008e#:i\u0018å\u001fÂHDf\u009b,³1©\u0004æ\u0090\u000fu\u0089\u0001¦«\u0091N÷¦ }ÿpÅ\u0001Â\u0007V¾½\u008f-ör®\u00938·zÉ¦é\u00856x\u0011Ó\u000bñ_\u0091²\u00ad9Ë\u0083²É.!\u0005 yÉ\u000e3ú_¶\u0099ò lW\u0003\u009a6Bñ\u009fá#Mós(kI«ß§4½Ï\u0012#¾\u0016ÚàÓ\u0017ÀsP\u000e]GÛ©\u000bÐ¸¯<}\u0007£øôöe\f\u000f\u0097#Ù´,õ\\\u0012\u0098·\u009f\töÐH¼*7©\u0007`Wi\u0013z'Ä \"pþ\u000fÛM î\u0001\u001c·ÊewA0\u008f\u008csÆö\u009c\rEÙ\tN\u0086\u0093£Q¼60y?\fU\u0091µ~«5*©Â×tÝç»Âa\u009a\u0018$\rÌäÆ$àº°Pí\u00907\u0001³©ØIh{\u000ekÅð©¾ù8\u001f>öÕ\u0014«Ä\u009c\u0090\u0016±t_¾aq\u0091NW6Óvk\u009eÇ\u000fîìvùBk\u009d¥Åì£ô\u0083/>q=P\u009f]Ö\u0087N}\u0010û\\@\u0096· Ô[Ô#ü\u0097\t\u009c×]E\u0017U\u0005gß^k\u001dJï\u0089üW&\"-öi\u0012iu\u0098#H\u0093ãENd\u0089¼*´D\u0015µzºÿ\u00184-¡rI\u00ady\u0086\u0007\u008dG4épÕÆg\f\u0094\u008fL\u0005ªN9J*÷¡IÛ~2oß\u009b<E\u0094kÃ{\u0080w\u00815\u0094à\u001d\u0083\u0098\u0085¾\\^\u008b\u001f*,\u0015\u009f\u009bNË*ØÄoY\u0017jL8$¯Ë\u009f\u0082+O[\rÉiPüf\u0005ªk\u0007á¾îÈ\b\u008céÎ\u001e8\u0005\u0012afæ\tç\u0088@ê\u001azrMè>y°}\u0093bÜWltc?Õë\u0083\"ü*\u0005îli\u009b\u0015)\fµÒaTÖ\u001a³²zh]Ù«ô¤\u001af*LC<rüé6}\u0002û9¯ÕM\u0010\u0010¡\u008cÚ7\u0096>Ë\u0019\u0083ÀÝ,ñ\n:\u0010g4\u008as ÙXØYÇÉÁ\u0084Ú\u00adù\u0010ùõ\u0007¦¨ÊÜFO¤î;vä±±8\u0004\u000b\u009c¥ò\u0094åHõ%F£°5$ß\u009a¥ëòúÇW\u0005±ÜÕqflæê@\u008fÏuV¢Ô®\u009a'&ã*?\u008d\\Q\u0087W\b\u0013ð%&\u0010V¡¢r\u001eñÉ=4ø\u0089\u001dëÈÐª\u0010Ü-ËXÄûû[7÷\u0081\u0015[co:\u0010×\u0000XfÊAP#·3)ç\u0004Û\u001a\u009b \u0085zã\u0001\u0093Î\u00899ãEXW\u0083\u0003\u0011í$30è\u0084YYé[FDK ì»¹8W\u009dD\u0014²\u0004Ò\u0096=*È¬{2cLù^ª]|¹\u008cUæ\u00808t\u0080%\rº,À\\I2nÄû\u008dOÉn\u0007ó?Îã \u0087vKÉ\u0010õ\u0010\u0088ï\u0082TÍÓ\n\u0096Ö0zJ\u000eN¾F\u0010\u0095\u0083v¹~\u0099ÅÃ+\u001fþ½E\u0091e!"
         .length();
      char var8 = '0';
      int var34 = -1;

      label81:
      while (true) {
         String var37 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var37.getBytes("ISO-8859-1"));
            String var89 = buildString_16(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var89;
                  if ((var34 += var8) >= var7) {
                     CONST_R = var4;
                     CONST_S = new String[312];
                     short var39 = 16278;
                     long var64 = 6511530742783781881L ^ var0;
                     CONST_B = "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize";
                     short var40 = 4838;
                     long var65 = 6185134272022349497L ^ var0;
                     CONST_D = "XboxLive.signin offline_access";
                     short var41 = 22639;
                     long var66 = 3796242955360161157L ^ var0;
                     CONST_I = "/auth/callback";
                     short var42 = 14410;
                     long var67 = 8666706103970540871L ^ var0;
                     CONST_F = "https://xsts.auth.xboxlive.com/xsts/authorize";
                     short var43 = 16770;
                     long var68 = 1421897135970800709L ^ var0;
                     CONST_G = "https://api.minecraftservices.com/authentication/login_with_xbox";
                     short var44 = 21321;
                     long var69 = 7558039490311046689L ^ var0;
                     CONST_A = "4976cd9d-40aa-4a29-8951-199d743ed64f";
                     short var45 = 12939;
                     long var70 = 4195843100387944258L ^ var0;
                     CONST_C = "https://login.microsoftonline.com/consumers/oauth2/v2.0/token";
                     short var46 = 31329;
                     long var71 = 3604607463902900049L ^ var0;
                     CONST_E = "https://user.auth.xboxlive.com/user/authenticate";
                     short var47 = 1615;
                     long var72 = 1573286671153566254L ^ var0;
                     CONST_H = "https://api.minecraftservices.com/minecraft/profile";
                     CONST_W = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[7];
                     int var14 = 0;
                     String var15 = "\u0085±(Þvt\u009bB_ë´Ñ\u001aùQt N=\u009cj·ýü\u009aó~Ï\u0088NCð«\u0098Ðç9\u0096Ø(";
                     int var16 = "\u0085±(Þvt\u009bB_ë´Ñ\u001aùQt N=\u009cj·ýü\u009aó~Ï\u0088NCð«\u0098Ðç9\u0096Ø(".length();
                     byte var17 = 0;

                     label63:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var49 = var13;
                        var10001 = var14++;
                        long var93 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var99 = -1;

                        while (true) {
                           long var19 = var93;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var104 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var99) {
                              case 0:
                                 var49[var10001] = var104;
                                 if (var17 >= var16) {
                                    CONST_U = var13;
                                    CONST_V = new Integer[7];
                                    CONST_M = ((String)null);
                                    CONST_L = ((String)null);
                                    CONST_K = ((String)null);
                                    CONST_J = ((String)null);
                                    CONST_N = ((String)null);
                                    CONST_Z = new HashMap(13);
                                    Cipher var22;
                                    var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var23 = 1; var23 < 8; var23++) {
                                       var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var24 = new long[10];
                                    int var25 = 0;
                                    String var26 = "\u0018°õ\u0015LÒ\u0096\u008bqYM¦\u0088*^\u0098E\\\u0083\u0086v®·Ü#Q\u0084t¬\u009e\u0016ÐCD\n9\u0001òy\u0087ªÃKH\u007fÜÅm\u001e\u0000s\u0007\u0010CBaWy\u008fZ\u0098²ÒÆ";
                                    int var27 = "\u0018°õ\u0015LÒ\u0096\u008bqYM¦\u0088*^\u0098E\\\u0083\u0086v®·Ü#Q\u0084t¬\u009e\u0016ÐCD\n9\u0001òy\u0087ªÃKH\u007fÜÅm\u001e\u0000s\u0007\u0010CBaWy\u008fZ\u0098²ÒÆ"
                                       .length();
                                    byte var28 = 0;

                                    label47:
                                    while (true) {
                                       int var76 = var28;
                                       var28 += 8;
                                       byte[] var29 = var26.substring(var76, var28).getBytes("ISO-8859-1");
                                       long[] var51 = var24;
                                       var76 = var25++;
                                       long var96 = (var29[0] & 255L) << 56
                                          | (var29[1] & 255L) << 48
                                          | (var29[2] & 255L) << 40
                                          | (var29[3] & 255L) << 32
                                          | (var29[4] & 255L) << 24
                                          | (var29[5] & 255L) << 16
                                          | (var29[6] & 255L) << 8
                                          | var29[7] & 255L;
                                       byte var102 = -1;

                                       while (true) {
                                          long var30 = var96;
                                          byte[] var32 = var22.doFinal(
                                             new byte[]{
                                                (byte)(var30 >>> 56),
                                                (byte)(var30 >>> 48),
                                                (byte)(var30 >>> 40),
                                                (byte)(var30 >>> 32),
                                                (byte)(var30 >>> 24),
                                                (byte)(var30 >>> 16),
                                                (byte)(var30 >>> 8),
                                                (byte)var30
                                             }
                                          );
                                          var104 = (var32[0] & 255L) << 56
                                             | (var32[1] & 255L) << 48
                                             | (var32[2] & 255L) << 40
                                             | (var32[3] & 255L) << 32
                                             | (var32[4] & 255L) << 24
                                             | (var32[5] & 255L) << 16
                                             | (var32[6] & 255L) << 8
                                             | var32[7] & 255L;
                                          switch (var102) {
                                             case 0:
                                                var51[var76] = var104;
                                                if (var28 >= var27) {
                                                   CONST_X = var24;
                                                   CONST_Y = new Long[10];
                                                   60000L = ((String)null);
                                                   short var52 = 13570;
                                                   long var79 = 5388600102882910433L ^ var0;
                                                   CONST_A_2 = Pattern.compile("\"sPOST_Username\"\\s*:\\s*\"([^\"]+)\"", 2);
                                                   short var53 = 27274;
                                                   long var80 = 3122763072413302651L ^ var0;
                                                   CONST_B_2 = Pattern.compile("\"sPOST_PaginatedLoginState\"\\s*:\\s*\"([^\"]+)\"");
                                                   short var54 = 15732;
                                                   long var81 = 4202813884478466059L ^ var0;
                                                   CONST_C_2 = Pattern.compile("\"sCanaryToken\"\\s*:\\s*\"([^\"]+)\"");
                                                   short var55 = 23300;
                                                   long var82 = 3405319407460798131L ^ var0;
                                                   CONST_D_2 = Pattern.compile("<form([^>]*?)>");
                                                   short var56 = 13067;
                                                   long var83 = 2590188655157552807L ^ var0;
                                                   CONST_E_2 = Pattern.compile("\\baction\\s*=\\s*\"([^\"]+)\"");
                                                   short var57 = 24762;
                                                   long var84 = 1482963496630318483L ^ var0;
                                                   CONST_F_2 = Pattern.compile("\\bmethod\\s*=\\s*\"?(get|post)\"?");
                                                   short var58 = 25730;
                                                   long var85 = 2155290569124147589L ^ var0;
                                                   CONST_G_2 = Pattern.compile("<(?:input|button)([^>]*?)(?:/)?>");
                                                   short var59 = 6030;
                                                   long var86 = 8831080867748840153L ^ var0;
                                                   CONST_H_2 = Pattern.compile("\\bname\\s*=\\s*\"([^\"]+)\"");
                                                   short var60 = 17936;
                                                   long var87 = 8219943751833736171L ^ var0;
                                                   CONST_I_2 = Pattern.compile("\\bvalue\\s*=\\s*\"([^\"]*)\"");
                                                   CONST_J_2 = Pattern.compile("<form([^>]*?)>", 2);
                                                   CONST_K_2 = Pattern.compile("\\baction\\s*=\\s*\"([^\"]+)\"", 2);
                                                   CONST_L_2 = Pattern.compile("\\bmethod\\s*=\\s*\"?(get|post)\"?", 2);
                                                   CONST_M_2 = Pattern.compile("<(?:input|button)([^>]*?)(?:/)?>", 2);
                                                   CONST_N_2 = Pattern.compile("\\bname\\s*=\\s*\"([^\"]+)\"", 2);
                                                   CONST_O = Pattern.compile("\\bvalue\\s*=\\s*\"([^\"]*)\"", 2);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var51[var76] = var104;
                                                if (var28 < var27) {
                                                   continue label47;
                                                }

                                                var26 = "\u001e2P\u0085è\u009b\u0091í¡¹\u00905ö )^";
                                                var27 = "\u001e2P\u0085è\u009b\u0091í¡¹\u00905ö )^".length();
                                                var28 = 0;
                                          }

                                          byte var78 = var28;
                                          var28 += 8;
                                          var29 = var26.substring(var78, var28).getBytes("ISO-8859-1");
                                          var51 = var24;
                                          var76 = var25++;
                                          var96 = (var29[0] & 255L) << 56
                                             | (var29[1] & 255L) << 48
                                             | (var29[2] & 255L) << 40
                                             | (var29[3] & 255L) << 32
                                             | (var29[4] & 255L) << 24
                                             | (var29[5] & 255L) << 16
                                             | (var29[6] & 255L) << 8
                                             | var29[7] & 255L;
                                          var102 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var10001] = var104;
                                 if (var17 < var16) {
                                    continue label63;
                                 }

                                 var15 = "^\u0082^Ë\u0091À\u0016\u001ex×Øö\u0086z\u0001d";
                                 var16 = "^\u0082^Ë\u0091À\u0016\u001ex×Øö\u0086z\u0001d".length();
                                 var17 = 0;
                           }

                           byte var75 = var17;
                           var17 += 8;
                           var18 = var15.substring(var75, var17).getBytes("ISO-8859-1");
                           var49 = var13;
                           var10001 = var14++;
                           var93 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var99 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var89;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label81;
                  }

                  var6 = "Þ\u001f\u0098\u0002ý\u0002¡\u0088Ù\u0010\u0097\u0016ÍTwøè¶ÖÜþ?h\u0001½¥ÑJ\u0019C~¶\u0018\u001f°\u0097Ô\\ÅâqR¤'éÏPÌÛTWº`ªBx+";
                  var7 = "Þ\u001f\u0098\u0002ý\u0002¡\u0088Ù\u0010\u0097\u0016ÍTwøè¶ÖÜþ?h\u0001½¥ÑJ\u0019C~¶\u0018\u001f°\u0097Ô\\ÅâqR¤'éÏPÌÛTWº`ªBx+".length();
                  var8 = ' ';
                  var34 = -1;
            }

            var37 = var6.substring(++var34, var34 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int var0) {
      fieldInt_P = var0;
   }

   public static int getValue() {
      return fieldInt_P;
   }

   public static int getValue_2() {
      int var0 = getValue();

      try {
         return var0 == 0 ? 96 : 0;
      } catch (DateTimeParseException var1) {
         throw getException(var1);
      }
   }

   private static Exception getException(Exception var0) {
      return var0;
   }

   private static String buildString_16(byte[] var0) {
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

   private static String buildString_17(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 526;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/am", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString_16(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_17(var4, var5);
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
         throw new RuntimeException("rip/breeze/am" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22905;
      if (CONST_V[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_U[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_W.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/am", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_V[var3] = var15;
      }

      return CONST_V[var3];
   }

   private static int getValue_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/am" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13472;
      if (CONST_Y[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_X[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_Z.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Z.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/am", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_Y[var3] = var14;
      }

      return CONST_Y[var3];
   }

   private static long getLong_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt_2(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_3(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/am" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
