package rip.breeze;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public final class CloudAuthService {
   private static final int CONST_A;
   private static final String CONST_B;
   private static final int CONST_C;
   private static final int CONST_D;
   private static final int CONST_E;
   private static final rip.breeze.client.Util139 CONST_F;
   private final String string_g;
   private final String string_h;
   private final String string_i;
   private volatile EnumType12 enum_CONNECTING_j;
   private String string_k;
   private String string_l;
   private String string_m;
   private boolean fieldBool_n;
   private int fieldInt_o;
   private UserRole userRole_p;
   private String string_q;
   private byte[] arr_r;
   private UserTheme userTheme_s;
   private long fieldLong_t;
   private final HashSet<String> hashSet_u;
   private final ExecutorService executorService_v;
   private final ScheduledExecutorService scheduledExecutorService_w;
   private final Object object_x;
   private volatile ScheduledFuture<?> scheduledFuture_y;
   private int fieldInt_z;
   private final HashSet<Long> hashSet_A;
   private volatile List<RenderUtil3_x> list_B;
   private volatile Map<Integer, RenderUtil3_x> map_C;
   private final ConcurrentMap<String, RenderUtil3_x> concurrentMap_D;
   private volatile Integer integer_E;
   private volatile UUID uUID_F;
   private volatile ScheduledFuture<?> scheduledFuture_G;
   private static int[] arr_H;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);
   private static final long[] CONST_M;
   private static final Long[] CONST_N;
   private static final Map CONST_O;

   public CloudAuthService(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 132530031954063
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: aload 0
      // 00d: bipush 32
      // 00f: newarray 8
      // 011: putfield rip/breeze/CloudAuthService.arr_r [B
      // 014: aload 0
      // 015: sipush 28100
      // 018: ldc2_w 5468410870058091398
      // 01b: lload 3
      // 01c: lxor
      // 01d: invokedynamic x (IJ)J bsm=rip/breeze/CloudAuthService.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: putfield rip/breeze/CloudAuthService.fieldLong_t J
      // 025: aload 0
      // 026: new java/util/HashSet
      // 029: dup
      // 02a: invokespecial java/util/HashSet.<init> ()V
      // 02d: putfield rip/breeze/CloudAuthService.hashSet_u Ljava/util/HashSet;
      // 030: aload 0
      // 031: invokedynamic newThread ()Ljava/util/concurrent/ThreadFactory; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Runnable;)Ljava/lang/Thread;, rip/breeze/CloudAuthService.lambda$new_Inner0 (Ljava/lang/Runnable;)Ljava/lang/Thread;, (Ljava/lang/Runnable;)Ljava/lang/Thread; ]
      // 036: invokestatic java/util/concurrent/Executors.newSingleThreadExecutor (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
      // 039: putfield rip/breeze/CloudAuthService.executorService_v Ljava/util/concurrent/ExecutorService;
      // 03c: aload 0
      // 03d: invokedynamic newThread ()Ljava/util/concurrent/ThreadFactory; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Runnable;)Ljava/lang/Thread;, rip/breeze/CloudAuthService.lambda$new_Inner1 (Ljava/lang/Runnable;)Ljava/lang/Thread;, (Ljava/lang/Runnable;)Ljava/lang/Thread; ]
      // 042: invokestatic java/util/concurrent/Executors.newSingleThreadScheduledExecutor (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;
      // 045: putfield rip/breeze/CloudAuthService.scheduledExecutorService_w Ljava/util/concurrent/ScheduledExecutorService;
      // 048: aload 0
      // 049: new java/lang/Object
      // 04c: dup
      // 04d: invokespecial java/lang/Object.<init> ()V
      // 050: putfield rip/breeze/CloudAuthService.object_x Ljava/lang/Object;
      // 053: aload 0
      // 054: bipush 0
      // 055: putfield rip/breeze/CloudAuthService.fieldInt_z I
      // 058: aload 0
      // 059: new java/util/HashSet
      // 05c: dup
      // 05d: invokespecial java/util/HashSet.<init> ()V
      // 060: putfield rip/breeze/CloudAuthService.hashSet_A Ljava/util/HashSet;
      // 063: aload 0
      // 064: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 067: putfield rip/breeze/CloudAuthService.list_B Ljava/util/List;
      // 06a: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 06d: aload 0
      // 06e: invokestatic java/util/Collections.emptyMap ()Ljava/util/Map;
      // 071: putfield rip/breeze/CloudAuthService.map_C Ljava/util/Map;
      // 074: aload 0
      // 075: new java/util/concurrent/ConcurrentHashMap
      // 078: dup
      // 079: invokespecial java/util/concurrent/ConcurrentHashMap.<init> ()V
      // 07c: putfield rip/breeze/CloudAuthService.concurrentMap_D Ljava/util/concurrent/ConcurrentMap;
      // 07f: aload 0
      // 080: aconst_null
      // 081: putfield rip/breeze/CloudAuthService.integer_E Ljava/lang/Integer;
      // 084: aload 0
      // 085: aconst_null
      // 086: putfield rip/breeze/CloudAuthService.uUID_F Ljava/util/UUID;
      // 089: aload 0
      // 08a: aload 1
      // 08b: sipush 1036
      // 08e: ldc2_w 8387401829795116419
      // 091: lload 3
      // 092: lxor
      // 093: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 09b: checkcast java/lang/String
      // 09e: putfield rip/breeze/CloudAuthService.string_g Ljava/lang/String;
      // 0a1: aload 0
      // 0a2: aload 2
      // 0a3: sipush 26360
      // 0a6: ldc2_w 5730066998938457980
      // 0a9: lload 3
      // 0aa: lxor
      // 0ab: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
      // 0b3: checkcast java/lang/String
      // 0b6: putfield rip/breeze/CloudAuthService.string_i Ljava/lang/String;
      // 0b9: aload 0
      // 0ba: new java/lang/StringBuilder
      // 0bd: dup
      // 0be: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c1: aload 2
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: sipush 28335
      // 0c8: ldc2_w 7555413306336141171
      // 0cb: lload 3
      // 0cc: lxor
      // 0cd: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d8: putfield rip/breeze/CloudAuthService.string_h Ljava/lang/String;
      // 0db: aload 0
      // 0dc: getstatic rip/breeze/EnumType12.CONNECTING Lrip/breeze/EnumType12;
      // 0df: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 0e2: astore 5
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 0e8: getstatic rip/breeze/EnumType12.CONNECTING Lrip/breeze/EnumType12;
      // 0eb: if_acmpne 12a
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 0f3: ldc2_w -648243037413266939
      // 0f6: lload 3
      // 0f7: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: checkcast rip/breeze/EnumType12
      // 102: goto 109
      // 105: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 108: athrow
      // 109: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 10c: sipush 14672
      // 10f: ldc2_w 5128463986826827542
      // 112: lload 3
      // 113: lxor
      // 114: invokedynamic x (IJ)J bsm=rip/breeze/CloudAuthService.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: invokestatic java/lang/Thread.sleep (J)V
      // 11c: goto 0e4
      // 11f: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: astore 6
      // 125: aload 5
      // 127: ifnull 0e4
      // 12a: aload 0
      // 12b: getfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 12e: getstatic rip/breeze/EnumType12.CONNECTED Lrip/breeze/EnumType12;
      // 131: if_acmpne 195
      // 134: aload 0
      // 135: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 138: ldc2_w -646502414056329870
      // 13b: lload 3
      // 13c: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 13f: dup_x2
      // 140: pop
      // 141: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 144: pop
      // 145: goto 14c
      // 148: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: aload 0
      // 14d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 150: dup
      // 151: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 154: pop
      // 155: invokedynamic accept (Ljava/io/PrintStream;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, java/io/PrintStream.println (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 15a: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 15d: ldc2_w -639679077228679688
      // 160: lload 3
      // 161: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 164: dup_x2
      // 165: pop
      // 166: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 169: pop
      // 16a: goto 171
      // 16d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 0
      // 172: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 175: ldc2_w -646392596422951887
      // 178: lload 3
      // 179: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 181: pop
      // 182: goto 189
      // 185: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 188: athrow
      // 189: aload 5
      // 18b: ifnull 1ae
      // 18e: goto 195
      // 191: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: aload 0
      // 196: getfield rip/breeze/CloudAuthService.scheduledExecutorService_w Ljava/util/concurrent/ScheduledExecutorService;
      // 199: invokeinterface java/util/concurrent/ScheduledExecutorService.shutdown ()V 1
      // 19e: aload 0
      // 19f: getfield rip/breeze/CloudAuthService.executorService_v Ljava/util/concurrent/ExecutorService;
      // 1a2: invokeinterface java/util/concurrent/ExecutorService.shutdown ()V 1
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 1b1: ifeq 1c1
      // 1b4: bipush 5
      // 1b5: newarray 10
      // 1b7: invokestatic rip/breeze/CloudAuthService.initialize_2 ([I)V
      // 1ba: goto 1c1
      // 1bd: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: return
      // try (111 -> 113): 114 java/lang/reflect/InvocationTargetException
      // try (117 -> 123): 126 java/lang/InterruptedException
      // try (99 -> 124): 124 java/io/UncheckedIOException
      // try (169 -> 171): 172 java/lang/reflect/InvocationTargetException
      // try (157 -> 159): 160 java/lang/reflect/InvocationTargetException
      // try (140 -> 142): 143 java/lang/reflect/InvocationTargetException
      // try (129 -> 176): 177 java/lang/InterruptedException
      // try (133 -> 185): 186 java/lang/InterruptedException
      // try (188 -> 193): 194 java/lang/InterruptedException
   }

   public UserInfo getUserInfo() {
      return new UserInfo("", "", UserRole.OWNER, 67);
   }

   public boolean isValid() {
      return true;
   }

   public String getString() {
      return "";
   }

   public String getString_i() {
      return this.string_i;
   }

   public UserTheme getUserTheme() {
      UserTheme var10000 = this.userTheme_s;
      if (this.userTheme_s == null) {
         var10000 = new UserTheme();
      }

      return var10000;
   }

   public long getLong() {
      return 67L;
   }

   public HashSet<String> getHashSet_u() {
      return this.hashSet_u;
   }

   public void processAll(long var1, Consumer<UserTheme> var3, Consumer<String> var4) {
      long var5 = 93465985838055L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$getConfig_Inner2);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7779532992417839290L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_2(long var1, IBreezeInterface4<ImageUtil18, StringDecryptHelper3, UserInfo> var3, Consumer<String> var4) {
      long var5 = 28592024726947L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$getTheme_Inner3);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(3292759188826455806L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_3(long var1, RenderUtil19_x var3, int var4, String var5, BiConsumer<Float, Integer> var6, Consumer<String> var7) {
      long var8 = 42644110188575L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var7, this::lambda$addReview_Inner4);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(2309792182629266242L, var8);
      Object[] var10002 = var10001;
      CloudAuthService var11 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public void processAll_4(long var1, RenderUtil19_x var3, Consumer<String> var4) {
      long var5 = 138180259803151L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$deleteReview_Inner5);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-1144375392290626734L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_5(
      long var1, RenderUtil19_x var3, int var4, RenderUtil24 var5, BiConsumer<ArrayList<RenderUtil46>, Integer> var6, Consumer<String> var7
   ) {
      long var8 = 84776827295284L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var7, this::lambda$getReviews_Inner6);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1595800471450174825L, var8);
      Object[] var10002 = var10001;
      CloudAuthService var11 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public void processAll_6(long var1, RenderUtil19_x var3, boolean var4) {
      long var5 = 114022187682088L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$bookmarkItem_Inner7);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(5269944213216212662L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_7(long var1) {
      long var3 = 131290524171479L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$setTheme_Inner8);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(4385813948177367881L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void processAll_8(long var1, RenderUtil19_x var3) {
      long var4 = 99990070248007L;

      try {
         if (this.hashSet_A.contains(var1)) {
            return;
         }
      } catch (UncheckedIOException var7) {
         throw getThrowable(var7);
      }

      this.hashSet_A.add(var1);
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$registerDownload_Inner9);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(4777658484948778457L, var4);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void processAll_9(UserTheme var1) {
      long var2 = 72817956453156L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$saveConfig_Inner10);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(8876242878841717946L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void processAll_10(long var1, RenderUtil19_x var3, Consumer<String> var4, Consumer<String> var5) {
      long var6 = 118501408451882L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var5, this::lambda$regenerateShareCode_Inner11);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(3259281006368554615L, var6);
      Object[] var10002 = var10001;
      CloudAuthService var9 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void processAll_11(String var1, ImageUtil18 var2, boolean var3, Consumer<StringDecryptHelper3> var4, Consumer<String> var5) {
      long var6 = 101849224700827L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var5, this::lambda$uploadTheme_Inner12);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2050688511966269242L, var6);
      Object[] var10002 = var10001;
      CloudAuthService var9 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void processAll_12(long var1, Runnable var3, Consumer<String> var4) {
      long var5 = 21966055154580L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$deleteTheme_Inner13);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(2559507978520064201L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_13(long var1, ImageUtil18 var3, boolean var4, Consumer<StringDecryptHelper3> var5, Consumer<String> var6) {
      long var7 = 44754824287126L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var6, this::lambda$updateTheme_Inner14);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(6018790130179506379L, var7);
      Object[] var10002 = var10001;
      CloudAuthService var10 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void processAll_14(String var1, String var2, String var3, boolean var4, UserTheme var5, Consumer<StringDecryptHelper> var6, Consumer<String> var7) {
      long var8 = 40533621778382L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var7, this::lambda$uploadConfig_Inner15);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-6350350536281295725L, var8);
      Object[] var10002 = var10001;
      CloudAuthService var11 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var11, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public void processAll_15(long var1, String var3, String var4, boolean var5, UserTheme var6, Consumer<StringDecryptHelper> var7, Consumer<String> var8) {
      long var9 = 32878675592411L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var8, this::lambda$updateConfig_Inner16);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-8878216716528986234L, var9);
      Object[] var10002 = var10001;
      CloudAuthService var12 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var12, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void processAll_16(long var1, Runnable var3, Consumer<String> var4) {
      long var5 = 77790221123203L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$deleteConfig_Inner17);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(4508780215847251422L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_17(
      String var1, String var2, String var3, boolean var4, boolean var5, String var6, Consumer<StringDecryptHelper2> var7, Consumer<String> var8
   ) {
      long var9 = 96259229746573L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var8, this::lambda$uploadScript_Inner18);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(404328377285039824L, var9);
      Object[] var10002 = var10001;
      CloudAuthService var12 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var12, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void processAll_18(
      long var1, String var3, String var4, boolean var5, boolean var6, String var7, Consumer<StringDecryptHelper2> var8, Consumer<String> var9
   ) {
      long var10 = 76682182975360L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var9, this::lambda$updateScript_Inner19);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2336975999924990755L, var10);
      Object[] var10002 = var10001;
      CloudAuthService var13 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var13, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public void processAll_19(long var1, IBreezeInterface4<String, StringDecryptHelper2, UserInfo> var3, Consumer<String> var4) {
      long var5 = 124140772953993L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$getScript_Inner20);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-8099633840551502636L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_20(long var1, Runnable var3, Consumer<String> var4) {
      long var5 = 7232663875021L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$deleteScript_Inner21);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7916245794666135184L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_21(
      String var1,
      RotationUtil1_x var2,
      int var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      BiConsumer<ArrayList<UIPanel>, Integer> var8,
      Consumer<ConfigUtil2_x> var9,
      Consumer<String> var10
   ) {
      long var11 = 67003481678165L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var10, this::lambda$getCloudItems_Inner22);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7008759872076657160L, var11);
      Object[] var10002 = var10001;
      CloudAuthService var14 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   public void processAll_22(long var1, Consumer<UserInfo> var3, Consumer<String> var4) {
      long var5 = 25688586579672L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var4, this::lambda$getUserPreview_Inner23);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-1240400482144436859L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void processAll_23(long var1, int var3, BiConsumer<ArrayList<UIPanel>, Integer> var4, Consumer<String> var5) {
      long var6 = 6083107270097L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var5, this::lambda$getUserItems_Inner24);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-5926696977026777460L, var6);
      Object[] var10002 = var10001;
      CloudAuthService var9 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public byte[] getArr_r() {
      return this.arr_r;
   }

   public EnumType12 getEnum_CONNECTING() {
      return EnumType12.CONNECTED;
   }

   public void setUUID_F(UUID var1) {
      this.uUID_F = var1;
   }

   public List<RenderUtil3_x> getList_B() {
      return this.list_B;
   }

   public RenderUtil3_x getBreezeUtil3() {
      long var1 = 97120292994865L;
      Integer var3 = this.integer_E;

      try {
         if (var3 == null) {
            return null;
         }
      } catch (UncheckedIOException var4) {
         throw getThrowable(var4);
      }

      return this.map_C.get(var3);
   }

   public RenderUtil3_x getBreezeUtil3_2(UUID var1) {
      long var2 = 111020127649698L;

      try {
         if (var1 == null) {
            return null;
         }
      } catch (UncheckedIOException var7) {
         throw getThrowable(var7);
      }

      try {
         if (var1.equals(this.uUID_F)) {
            Object[] var14 = rip.breeze.client.MathUtil8.noArgs();
            Method var17 = rip.breeze.client.MathUtil8.getMethod_3(9200384552871571292L, var2);
            Object[] var16 = var14;
            CloudAuthService var15 = this;
            Method var12 = var17;

            try {
               return (RenderUtil3_x)var12.invoke(var15, var16);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }
      } catch (UncheckedIOException var9) {
         throw getThrowable(var9);
      }

      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(var1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(9200583397755857661L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var13 = this;
      Method var10000 = var10003;

      try {
         var10 = (String)var10000.invoke(var13, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String var4 = var10;

      try {
         if (var4 == null) {
            return null;
         }
      } catch (UncheckedIOException var8) {
         throw getThrowable(var8);
      }

      return this.concurrentMap_D.get(var4);
   }

   public void processAll_24() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 03: ldc2_w 46981761813477
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0b: aload 0
      // 0c: getfield rip/breeze/CloudAuthService.object_x Ljava/lang/Object;
      // 0f: dup
      // 10: astore 3
      // 11: monitorenter
      // 12: astore 4
      // 14: aload 0
      // 15: getfield rip/breeze/CloudAuthService.scheduledFuture_y Ljava/util/concurrent/ScheduledFuture;
      // 18: ifnull 2d
      // 1b: aload 0
      // 1c: getfield rip/breeze/CloudAuthService.scheduledFuture_y Ljava/util/concurrent/ScheduledFuture;
      // 1f: bipush 0
      // 20: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 25: pop
      // 26: goto 2d
      // 29: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 3
      // 2e: monitorexit
      // 2f: goto 39
      // 32: astore 5
      // 34: aload 3
      // 35: monitorexit
      // 36: aload 5
      // 38: athrow
      // 39: aload 0
      // 3a: getfield rip/breeze/CloudAuthService.scheduledFuture_G Ljava/util/concurrent/ScheduledFuture;
      // 3d: ifnull 52
      // 40: aload 0
      // 41: getfield rip/breeze/CloudAuthService.scheduledFuture_G Ljava/util/concurrent/ScheduledFuture;
      // 44: bipush 0
      // 45: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 4a: pop
      // 4b: goto 52
      // 4e: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: getfield rip/breeze/CloudAuthService.scheduledExecutorService_w Ljava/util/concurrent/ScheduledExecutorService;
      // 56: invokeinterface java/util/concurrent/ScheduledExecutorService.shutdownNow ()Ljava/util/List; 1
      // 5b: pop
      // 5c: aload 0
      // 5d: getfield rip/breeze/CloudAuthService.executorService_v Ljava/util/concurrent/ExecutorService;
      // 60: invokeinterface java/util/concurrent/ExecutorService.shutdownNow ()Ljava/util/List; 1
      // 65: pop
      // 66: aload 4
      // 68: ifnull 84
      // 6b: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 6e: ifne 80
      // 71: goto 78
      // 74: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: bipush 0
      // 79: goto 81
      // 7c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: bipush 1
      // 81: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 84: return
      // try (11 -> 19): 20 java/io/UncheckedIOException
      // try (11 -> 24): 25 null
      // try (25 -> 28): 25 null
      // try (30 -> 38): 39 java/io/UncheckedIOException
      // try (41 -> 53): 54 java/io/UncheckedIOException
      // try (51 -> 58): 58 java/io/UncheckedIOException
   }

   private EnumType12 getEnum_CONNECTING_2() {
      return EnumType12.CONNECTED;
   }

   private void processAll_25() {
      long var1 = 86881463825548L;
      synchronized (this.object_x) {
         if (this.scheduledFuture_y != null) {
            try {
               if (!this.scheduledFuture_y.isDone()) {
                  this.scheduledFuture_y.cancel(false);
               }
            } catch (UncheckedIOException var5) {
               throw getThrowable(var5);
            }
         }

         this.scheduledFuture_y = this.scheduledExecutorService_w
            .schedule(this::processAll_26, "BreezeClient/2.0", TimeUnit.MILLISECONDS);
      }
   }

   private void processAll_26() {
      long var1 = 60543673938347L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$sendKeepAliveScheduled_Inner25);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-5640120387577834760L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void processAll_27() {
      long var1 = 63414274376034L;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(4713584783995201704L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.scheduledFuture_G = this.scheduledExecutorService_w
         .scheduleAtFixedRate(
            this::processAll_28, "BreezeClient/2.0", "BreezeClient/2.0", TimeUnit.SECONDS
         );
   }

   private void processAll_28() {
      long var1 = 15828220848053L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(this::lambda$refreshCapeAssignments_Inner26);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(2864275626601601067L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void processAll_29(Consumer<String> var1) {
      long var2 = 59377392715842L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var1, this::lambda$loadAvailableCapes_Inner27);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-8623523535438226657L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private static ColorMode getColorMode(rip.breeze.client.PlayerUtil8 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 03: ldc2_w 44065645600632
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 22504762630075
      // 0d: lxor
      // 0e: dup2
      // 0f: bipush 48
      // 11: lushr
      // 12: l2i
      // 13: istore 3
      // 14: dup2
      // 15: bipush 16
      // 17: lshl
      // 18: bipush 32
      // 1a: lushr
      // 1b: l2i
      // 1c: istore 4
      // 1e: dup2
      // 1f: bipush 48
      // 21: lshl
      // 22: bipush 48
      // 24: lushr
      // 25: l2i
      // 26: istore 5
      // 28: pop2
      // 29: pop2
      // 2a: aload 0
      // 2b: ifnull 3c
      // 2e: aload 0
      // 2f: invokevirtual rip/breeze/client/PlayerUtil8.isValid_4 ()Z
      // 32: ifeq 44
      // 35: goto 3c
      // 38: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: getstatic rip/breeze/ColorMode.NONE Lrip/breeze/ColorMode;
      // 3f: areturn
      // 40: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 0
      // 45: iload 3
      // 46: i2c
      // 47: iload 4
      // 49: iload 5
      // 4b: i2s
      // 4c: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 4f: astore 6
      // 51: sipush 3161
      // 54: ldc2_w 4628792518283242045
      // 57: lload 1
      // 58: lxor
      // 59: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 6
      // 60: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 63: ifeq 70
      // 66: getstatic rip/breeze/ColorMode.RAINBOW Lrip/breeze/ColorMode;
      // 69: goto 73
      // 6c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: getstatic rip/breeze/ColorMode.NONE Lrip/breeze/ColorMode;
      // 73: areturn
      // try (29 -> 34): 35 java/io/UncheckedIOException
      // try (31 -> 39): 39 java/io/UncheckedIOException
      // try (49 -> 59): 59 java/io/UncheckedIOException
   }

   private void initialize(Runnable var1) {
      this.executorService_v.submit(var1);
   }

   private void processAll_30(Runnable var1) {
      long var2 = 33598124081248L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(null, var1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(4643562539343221565L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private void scheduleTask(Consumer<String> var1, Runnable var2) {
      long var3 = 138491798608010L;

      try {
         if (this.enum_CONNECTING_j == EnumType12.UNAUTHORIZED) {
            return;
         }
      } catch (UncheckedIOException var5) {
         throw getThrowable(var5);
      }

      this.executorService_v.submit(this::lambda$enqueueAndBump_Inner28);
   }

   private HttpURLConnection getHttpURLConnection(String var1) {
      long var2 = 114389950776332L;

      try {
         URL var4 = new URL(this.string_h + var1);
         HttpURLConnection var5 = (HttpURLConnection)var4.openConnection();
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(var5);
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-4322108762801416328L, var2);
         Object[] var10002 = var10001;
         CloudAuthService var8 = this;
         Method var10000 = var10003;

         try {
            var10000.invoke(var8, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         return var5;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private int getValue(HttpURLConnection var1) {
      try {
         return var1.getResponseCode();
      } catch (IOException var3) {
         throw new UncheckedIOException(var3);
      }
   }

   private void processAll_31(HttpURLConnection param1, UserTheme param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 03: ldc2_w 107323981080426
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0b: aload 1
      // 0c: sipush 19197
      // 0f: ldc2_w 22344128139711699
      // 12: lload 3
      // 13: lxor
      // 14: pop2
      // 15: pop
      // 16: ldc_w "Content-Type"
      // 19: sipush 8344
      // 1c: ldc2_w 7518672749416464050
      // 1f: lload 3
      // 20: lxor
      // 21: pop2
      // 22: pop
      // 23: ldc_w "application/json"
      // 26: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 29: aload 1
      // 2a: bipush 1
      // 2b: invokevirtual java/net/HttpURLConnection.setDoOutput (Z)V
      // 2e: astore 5
      // 30: aload 1
      // 31: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 34: astore 6
      // 36: aconst_null
      // 37: astore 7
      // 39: aload 2
      // 3a: invokevirtual rip/breeze/client/UserTheme.toString ()Ljava/lang/String;
      // 3d: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 40: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 43: astore 8
      // 45: aload 6
      // 47: aload 8
      // 49: bipush 0
      // 4a: aload 8
      // 4c: arraylength
      // 4d: invokevirtual java/io/OutputStream.write ([BII)V
      // 50: aload 6
      // 52: ifnull b7
      // 55: aload 7
      // 57: ifnull 6e
      // 5a: aload 6
      // 5c: invokevirtual java/io/OutputStream.close ()V
      // 5f: goto b7
      // 62: astore 8
      // 64: aload 7
      // 66: aload 8
      // 68: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 6b: goto b7
      // 6e: aload 6
      // 70: invokevirtual java/io/OutputStream.close ()V
      // 73: goto b7
      // 76: astore 8
      // 78: aload 8
      // 7a: astore 7
      // 7c: aload 8
      // 7e: athrow
      // 7f: astore 9
      // 81: aload 6
      // 83: ifnull b4
      // 86: aload 7
      // 88: ifnull a8
      // 8b: goto 92
      // 8e: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 6
      // 94: invokevirtual java/io/OutputStream.close ()V
      // 97: goto b4
      // 9a: astore 10
      // 9c: aload 7
      // 9e: aload 10
      // a0: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // a3: aload 5
      // a5: ifnull b4
      // a8: aload 6
      // aa: invokevirtual java/io/OutputStream.close ()V
      // ad: goto b4
      // b0: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: aload 9
      // b6: athrow
      // b7: goto c6
      // ba: astore 6
      // bc: new java/io/UncheckedIOException
      // bf: dup
      // c0: aload 6
      // c2: invokespecial java/io/UncheckedIOException.<init> (Ljava/io/IOException;)V
      // c5: athrow
      // c6: return
      // try (45 -> 47): 48 java/lang/Throwable
      // try (30 -> 41): 56 java/lang/Throwable
      // try (30 -> 41): 61 null
      // try (69 -> 71): 72 java/lang/Throwable
      // try (56 -> 62): 61 null
      // try (73 -> 80): 81 java/lang/Throwable
      // try (62 -> 66): 67 java/lang/Throwable
      // try (25 -> 85): 86 java/io/IOException
   }

   private void processAll_32(HttpURLConnection var1) {
      long var2 = 131777666847025L;

      try {
         short var10001 = 15401;
         long var10002 = 1896908146609286116L ^ var2;
         var1.setRequestMethod("POST");
         var10001 = 3130;
         var10002 = 330096405128764409L ^ var2;
         short var11 = 8014;
         long var10003 = 7290158327029975188L ^ var2;
         var1.setRequestProperty("User-Agent", "BreezeClient/2.0");
         var10001 = 21766;
         var10002 = 5425024812205998782L ^ var2;
         var1.setRequestProperty("Session-Auth", this.string_g);
         var10001 = 31528;
         var10002 = 7846895302443084999L ^ var2;
         short var14 = 10523;
         var10003 = 6128861845174484635L ^ var2;
         var1.setRequestProperty("Accept-Encoding", "gzip");
         var10001 = 22489;
         var10002 = 5284628967767802013L ^ var2;
         short var16 = 21572;
         var10003 = 6422802464296207308L ^ var2;
         var1.setRequestProperty("Connection", "keep-alive");
         var1.setConnectTimeout(5000);
         var1.setReadTimeout(5000);
      } catch (IOException var5) {
         throw new UncheckedIOException(var5);
      }
   }

   private UserTheme getUserTheme_2(HttpURLConnection var1) {
      long var2 = 30431577182749L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(var1, false);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1302209056323830466L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var5 = this;
      Method var10000 = var10003;

      try {
         return (UserTheme)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private UserTheme getUserTheme_3(HttpURLConnection param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 59399947425150
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 96771171974008
      // 00d: lxor
      // 00e: lstore 5
      // 010: dup2
      // 011: ldc2_w 37170907553227
      // 014: lxor
      // 015: lstore 7
      // 017: pop2
      // 018: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 01b: astore 9
      // 01d: new java/lang/StringBuilder
      // 020: dup
      // 021: invokespecial java/lang/StringBuilder.<init> ()V
      // 024: astore 10
      // 026: iload 2
      // 027: ifeq 035
      // 02a: aload 1
      // 02b: invokevirtual java/net/HttpURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 02e: goto 039
      // 031: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 1
      // 036: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 039: astore 11
      // 03b: aload 11
      // 03d: ifnonnull 048
      // 040: new rip/breeze/client/UserTheme
      // 043: dup
      // 044: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 047: areturn
      // 048: aload 1
      // 049: invokevirtual java/net/HttpURLConnection.getContentEncoding ()Ljava/lang/String;
      // 04c: astore 12
      // 04e: aload 12
      // 050: ifnull 07a
      // 053: aload 12
      // 055: sipush 21800
      // 058: ldc2_w 4368707376707041634
      // 05b: lload 3
      // 05c: lxor
      // 05d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 065: ifeq 07a
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: new java/util/zip/GZIPInputStream
      // 072: dup
      // 073: aload 11
      // 075: invokespecial java/util/zip/GZIPInputStream.<init> (Ljava/io/InputStream;)V
      // 078: astore 11
      // 07a: new java/io/BufferedReader
      // 07d: dup
      // 07e: new java/io/InputStreamReader
      // 081: dup
      // 082: aload 11
      // 084: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 087: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 08a: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 08d: astore 13
      // 08f: aconst_null
      // 090: astore 14
      // 092: sipush 1024
      // 095: newarray 5
      // 097: astore 15
      // 099: aload 13
      // 09b: aload 15
      // 09d: invokevirtual java/io/Reader.read ([C)I
      // 0a0: dup
      // 0a1: istore 16
      // 0a3: bipush -1
      // 0a4: if_icmpeq 0b7
      // 0a7: aload 10
      // 0a9: aload 15
      // 0ab: bipush 0
      // 0ac: iload 16
      // 0ae: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
      // 0b1: pop
      // 0b2: aload 9
      // 0b4: ifnull 099
      // 0b7: aload 13
      // 0b9: ifnull 125
      // 0bc: aload 14
      // 0be: ifnull 0dc
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 13
      // 0ca: invokevirtual java/io/Reader.close ()V
      // 0cd: goto 125
      // 0d0: astore 15
      // 0d2: aload 14
      // 0d4: aload 15
      // 0d6: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0d9: goto 125
      // 0dc: aload 13
      // 0de: invokevirtual java/io/Reader.close ()V
      // 0e1: goto 125
      // 0e4: astore 15
      // 0e6: aload 15
      // 0e8: astore 14
      // 0ea: aload 15
      // 0ec: athrow
      // 0ed: astore 17
      // 0ef: aload 13
      // 0f1: ifnull 122
      // 0f4: aload 14
      // 0f6: ifnull 116
      // 0f9: goto 100
      // 0fc: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 13
      // 102: invokevirtual java/io/Reader.close ()V
      // 105: goto 122
      // 108: astore 18
      // 10a: aload 14
      // 10c: aload 18
      // 10e: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 111: aload 9
      // 113: ifnull 122
      // 116: aload 13
      // 118: invokevirtual java/io/Reader.close ()V
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 17
      // 124: athrow
      // 125: getstatic rip/breeze/CloudAuthService.CONST_F Lrip/breeze/client/Util139;
      // 128: aload 10
      // 12a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12d: lload 5
      // 12f: invokevirtual rip/breeze/client/Util139.getDataBuilder2 (Ljava/lang/String;J)Lrip/breeze/client/PlayerUtil8;
      // 132: lload 7
      // 134: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 137: areturn
      // 138: astore 10
      // 13a: new java/io/UncheckedIOException
      // 13d: dup
      // 13e: aload 10
      // 140: invokespecial java/io/UncheckedIOException.<init> (Ljava/io/IOException;)V
      // 143: athrow
      // try (20 -> 25): 25 java/lang/Throwable
      // try (93 -> 95): 96 java/lang/Throwable
      // try (68 -> 86): 104 java/lang/Throwable
      // try (68 -> 86): 109 null
      // try (117 -> 119): 120 java/lang/Throwable
      // try (104 -> 110): 109 null
      // try (16 -> 35): 141 java/io/IOException
      // try (121 -> 128): 129 java/lang/Throwable
      // try (110 -> 114): 115 java/lang/Throwable
      // try (86 -> 90): 91 java/lang/Throwable
      // try (39 -> 49): 50 java/lang/Throwable
      // try (36 -> 140): 141 java/io/IOException
   }

   private void processAll_33(HttpURLConnection param1, Consumer<String> param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 28355169605394
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 41428894422993
      // 00d: lxor
      // 00e: dup2
      // 00f: bipush 48
      // 011: lushr
      // 012: l2i
      // 013: istore 5
      // 015: dup2
      // 016: bipush 16
      // 018: lshl
      // 019: bipush 32
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 6
      // 01f: dup2
      // 020: bipush 48
      // 022: lshl
      // 023: bipush 48
      // 025: lushr
      // 026: l2i
      // 027: istore 7
      // 029: pop2
      // 02a: pop2
      // 02b: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 02e: astore 8
      // 030: aload 1
      // 031: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 034: istore 9
      // 036: iload 9
      // 038: sipush 401
      // 03b: if_icmpne 06f
      // 03e: aload 0
      // 03f: getstatic rip/breeze/EnumType12.UNAUTHORIZED Lrip/breeze/EnumType12;
      // 042: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 045: aload 2
      // 046: ifnull 12f
      // 049: goto 050
      // 04c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 2
      // 051: sipush 1851
      // 054: ldc2_w 2490838634843433278
      // 057: lload 3
      // 058: lxor
      // 059: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 063: aload 8
      // 065: ifnull 12f
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 9
      // 071: sipush 400
      // 074: if_icmpne 0f8
      // 077: goto 07e
      // 07a: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 0
      // 07f: aload 1
      // 080: bipush 1
      // 081: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 084: ldc2_w 2925454725450414153
      // 087: lload 3
      // 088: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 08b: dup_x2
      // 08c: pop
      // 08d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 090: checkcast rip/breeze/client/UserTheme
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: astore 10
      // 09c: aload 2
      // 09d: ifnull 0f3
      // 0a0: aload 2
      // 0a1: aload 10
      // 0a3: sipush 10684
      // 0a6: ldc2_w 5325810954685827067
      // 0a9: lload 3
      // 0aa: lxor
      // 0ab: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 0b3: ifeq 0e1
      // 0b6: goto 0bd
      // 0b9: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 10
      // 0bf: sipush 10684
      // 0c2: ldc2_w 5325810954685827067
      // 0c5: lload 3
      // 0c6: lxor
      // 0c7: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 0cf: iload 5
      // 0d1: i2c
      // 0d2: iload 6
      // 0d4: iload 7
      // 0d6: i2s
      // 0d7: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 0da: goto 0ee
      // 0dd: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: sipush 4290
      // 0e4: ldc2_w 6664990325966667428
      // 0e7: lload 3
      // 0e8: lxor
      // 0e9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 0f3: aload 8
      // 0f5: ifnull 12f
      // 0f8: aload 2
      // 0f9: ifnull 12f
      // 0fc: goto 103
      // 0ff: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: aload 2
      // 104: new java/lang/StringBuilder
      // 107: dup
      // 108: invokespecial java/lang/StringBuilder.<init> ()V
      // 10b: sipush 5997
      // 10e: ldc2_w 3917128729528203552
      // 111: lload 3
      // 112: lxor
      // 113: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: iload 9
      // 11d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 120: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 123: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 1
      // 130: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 133: goto 17b
      // 136: astore 9
      // 138: aload 2
      // 139: ifnull 16b
      // 13c: aload 2
      // 13d: new java/lang/StringBuilder
      // 140: dup
      // 141: invokespecial java/lang/StringBuilder.<init> ()V
      // 144: sipush 271
      // 147: ldc2_w 2935598558959857419
      // 14a: lload 3
      // 14b: lxor
      // 14c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 154: aload 9
      // 156: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15f: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 164: goto 16b
      // 167: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: aload 1
      // 16c: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 16f: goto 17b
      // 172: astore 11
      // 174: aload 1
      // 175: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 178: aload 11
      // 17a: athrow
      // 17b: return
      // try (116 -> 135): 136 java/io/IOException
      // try (114 -> 118): 119 java/io/IOException
      // try (80 -> 106): 106 java/io/IOException
      // try (78 -> 89): 90 java/io/IOException
      // try (45 -> 60): 61 java/io/IOException
      // try (37 -> 54): 55 java/io/IOException
      // try (34 -> 42): 43 java/io/IOException
      // try (72 -> 74): 75 java/lang/reflect/InvocationTargetException
      // try (31 -> 138): 141 java/io/IOException
      // try (31 -> 138): 165 null
      // try (142 -> 159): 160 java/io/IOException
      // try (141 -> 162): 165 null
      // try (165 -> 166): 165 null
   }

   private byte[] makeRequest(ImageUtil18 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 21853353151517
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 00b: astore 4
      // 00d: aload 1
      // 00e: sipush 20637
      // 011: ldc2_w 2233471793653441900
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: invokevirtual rip/breeze/ImageUtil18.getString (Ljava/lang/String;)Ljava/lang/String;
      // 01e: invokevirtual java/lang/String.isEmpty ()Z
      // 021: ifeq 02a
      // 024: aconst_null
      // 025: areturn
      // 026: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: new java/net/URL
      // 02d: dup
      // 02e: aload 1
      // 02f: sipush 26005
      // 032: ldc2_w 5996270405834756269
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: invokevirtual rip/breeze/ImageUtil18.getString (Ljava/lang/String;)Ljava/lang/String;
      // 03f: sipush 11303
      // 042: ldc2_w 1233699496761301261
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 0
      // 04d: getfield rip/breeze/CloudAuthService.string_i Ljava/lang/String;
      // 050: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 053: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 056: astore 5
      // 058: aload 5
      // 05a: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 05d: checkcast java/net/HttpURLConnection
      // 060: astore 6
      // 062: aload 6
      // 064: sipush 10544
      // 067: ldc2_w 6312273079523843149
      // 06a: lload 2
      // 06b: lxor
      // 06c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 074: aload 6
      // 076: sipush 23476
      // 079: ldc2_w 6068904788831301253
      // 07c: lload 2
      // 07d: lxor
      // 07e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: sipush 19240
      // 086: ldc2_w 5012428107252661800
      // 089: lload 2
      // 08a: lxor
      // 08b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 093: aload 6
      // 095: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 098: sipush 200
      // 09b: if_icmpne 14f
      // 09e: new java/io/ByteArrayOutputStream
      // 0a1: dup
      // 0a2: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 0a5: astore 7
      // 0a7: sipush 4096
      // 0aa: newarray 8
      // 0ac: astore 8
      // 0ae: aload 6
      // 0b0: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 0b3: astore 9
      // 0b5: aconst_null
      // 0b6: astore 10
      // 0b8: aload 9
      // 0ba: aload 8
      // 0bc: invokevirtual java/io/InputStream.read ([B)I
      // 0bf: dup
      // 0c0: istore 11
      // 0c2: bipush -1
      // 0c3: if_icmpeq 0d5
      // 0c6: aload 7
      // 0c8: aload 8
      // 0ca: bipush 0
      // 0cb: iload 11
      // 0cd: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 0d0: aload 4
      // 0d2: ifnull 0b8
      // 0d5: aload 9
      // 0d7: ifnull 149
      // 0da: aload 10
      // 0dc: ifnull 0fc
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 9
      // 0e8: invokevirtual java/io/InputStream.close ()V
      // 0eb: goto 149
      // 0ee: astore 12
      // 0f0: aload 10
      // 0f2: aload 12
      // 0f4: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0f7: aload 4
      // 0f9: ifnull 149
      // 0fc: aload 9
      // 0fe: invokevirtual java/io/InputStream.close ()V
      // 101: goto 149
      // 104: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: astore 12
      // 10a: aload 12
      // 10c: astore 10
      // 10e: aload 12
      // 110: athrow
      // 111: astore 13
      // 113: aload 9
      // 115: ifnull 146
      // 118: aload 10
      // 11a: ifnull 13a
      // 11d: goto 124
      // 120: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 9
      // 126: invokevirtual java/io/InputStream.close ()V
      // 129: goto 146
      // 12c: astore 14
      // 12e: aload 10
      // 130: aload 14
      // 132: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 135: aload 4
      // 137: ifnull 146
      // 13a: aload 9
      // 13c: invokevirtual java/io/InputStream.close ()V
      // 13f: goto 146
      // 142: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 13
      // 148: athrow
      // 149: aload 7
      // 14b: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 14e: areturn
      // 14f: goto 154
      // 152: astore 5
      // 154: aconst_null
      // 155: areturn
      // try (6 -> 17): 17 java/lang/Throwable
      // try (98 -> 100): 101 java/lang/Throwable
      // try (77 -> 91): 112 java/lang/Throwable
      // try (77 -> 91): 117 null
      // try (102 -> 110): 110 java/lang/Throwable
      // try (91 -> 95): 96 java/lang/Throwable
      // try (125 -> 127): 128 java/lang/Throwable
      // try (112 -> 118): 117 null
      // try (129 -> 136): 137 java/lang/Throwable
      // try (118 -> 122): 123 java/lang/Throwable
      // try (19 -> 143): 145 java/lang/Exception
   }

   private String getString_2(UUID var1) {
      long var2 = 5898358941564L;

      try {
         if (var1 == null) {
            return null;
         }
      } catch (Exception var9) {
         throw getThrowable(var9);
      }

      try {
         MessageDigest var4 = MessageDigest.getInstance("SHA-256");
         ByteBuffer var5 = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN);
         var5.putLong(var1.getMostSignificantBits()).putLong(var1.getLeastSignificantBits());
         byte[] var6 = var4.digest(var5.array());
         byte[] var7 = Arrays.copyOf(var6, 18);
         return Base64.getUrlEncoder().withoutPadding().encodeToString(var7);
      } catch (Exception var8) {
         return null;
      }
   }

   private void lambda$enqueueAndBump_Inner28(Runnable var1, Consumer var2) {
      long var3 = 33890192144558L;

      try {
         var1.run();
         Object[] var9 = rip.breeze.client.MathUtil8.noArgs();
         Method var12 = rip.breeze.client.MathUtil8.getMethod_3(4080930777184051927L, var3);
         Object[] var11 = var9;
         CloudAuthService var10 = this;
         Method var10000 = var12;

         try {
            var10000.invoke(var10, var11);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } catch (Throwable var8) {
         Throwable var5 = var8;

         try {
            if (var2 != null) {
               StringBuilder var10001 = new StringBuilder();
               short var10002 = 31868;
               long var10003 = 3098383709104112223L ^ var3;
               var2.accept(var10001.append("Local error: ").append(var5.getMessage()).toString());
            }
         } catch (Throwable var6) {
            throw getThrowable(var6);
         }
      }
   }

   private void lambda$loadAvailableCapes_Inner27(Consumer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 114437058782220
      // 006: lxor
      // 007: lstore 2
      // 008: lload 2
      // 009: dup2
      // 00a: ldc2_w 92841849791695
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
      // 02a: dup2
      // 02b: ldc2_w 15166940161813
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 120961085926611
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 140586397297849
      // 03c: lxor
      // 03d: lstore 11
      // 03f: pop2
      // 040: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 043: aload 0
      // 044: sipush 18909
      // 047: ldc2_w 3428201609576486133
      // 04a: lload 2
      // 04b: lxor
      // 04c: pop2
      // 04d: pop
      // 04e: ldc_w "get-capes/"
      // 051: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 054: ldc2_w 1989305119227432646
      // 057: lload 2
      // 058: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 060: checkcast java/net/HttpURLConnection
      // 063: goto 06a
      // 066: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 069: athrow
      // 06a: astore 13
      // 06c: astore 14
      // 06e: aload 0
      // 06f: aload 13
      // 071: new rip/breeze/client/UserTheme
      // 074: dup
      // 075: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 078: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 07b: ldc2_w 1983787749369313369
      // 07e: lload 2
      // 07f: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 082: dup_x2
      // 083: pop
      // 084: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 087: pop
      // 088: goto 08f
      // 08b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 0
      // 090: aload 13
      // 092: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 095: ldc2_w 1989144423897920830
      // 098: lload 2
      // 099: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0a1: checkcast java/lang/Integer
      // 0a4: invokevirtual java/lang/Integer.intValue ()I
      // 0a7: goto 0ae
      // 0aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: sipush 200
      // 0b1: if_icmpeq 0d4
      // 0b4: aload 0
      // 0b5: aload 13
      // 0b7: aload 1
      // 0b8: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0bb: ldc2_w 1982277543513425061
      // 0be: lload 2
      // 0bf: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c7: pop
      // 0c8: goto 0cf
      // 0cb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: return
      // 0d0: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: aload 13
      // 0d7: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0da: ldc2_w 1988782078911118210
      // 0dd: lload 2
      // 0de: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: checkcast rip/breeze/client/UserTheme
      // 0e9: goto 0f0
      // 0ec: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: astore 15
      // 0f2: aload 15
      // 0f4: sipush 24471
      // 0f7: ldc2_w 1784481195797578438
      // 0fa: lload 2
      // 0fb: lxor
      // 0fc: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 104: ifeq 128
      // 107: aload 15
      // 109: sipush 24471
      // 10c: ldc2_w 1784481195797578438
      // 10f: lload 2
      // 110: lxor
      // 111: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 119: lload 9
      // 11b: invokevirtual rip/breeze/client/PlayerUtil8.isValid_5 (J)Z
      // 11e: ifne 17c
      // 121: goto 128
      // 124: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 1
      // 129: aload 15
      // 12b: sipush 10684
      // 12e: ldc2_w 5325899106644522213
      // 131: lload 2
      // 132: lxor
      // 133: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 13b: ifeq 169
      // 13e: goto 145
      // 141: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: aload 15
      // 147: sipush 10684
      // 14a: ldc2_w 5325899106644522213
      // 14d: lload 2
      // 14e: lxor
      // 14f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 157: iload 4
      // 159: i2c
      // 15a: iload 5
      // 15c: iload 6
      // 15e: i2s
      // 15f: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 162: goto 176
      // 165: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: sipush 13583
      // 16c: ldc2_w 448105901602400260
      // 16f: lload 2
      // 170: lxor
      // 171: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 17b: return
      // 17c: aload 15
      // 17e: sipush 32245
      // 181: ldc2_w 8666831467962867737
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: invokevirtual rip/breeze/client/UserTheme.getBreezeIterable (Ljava/lang/String;)Lrip/breeze/client/BreezeIterable;
      // 18e: astore 16
      // 190: new java/util/ArrayList
      // 193: dup
      // 194: aload 16
      // 196: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 199: invokespecial java/util/ArrayList.<init> (I)V
      // 19c: astore 17
      // 19e: new java/util/HashMap
      // 1a1: dup
      // 1a2: aload 16
      // 1a4: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 1a7: invokespecial java/util/HashMap.<init> (I)V
      // 1aa: astore 18
      // 1ac: bipush 0
      // 1ad: istore 19
      // 1af: iload 19
      // 1b1: aload 16
      // 1b3: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 1b6: if_icmpge 259
      // 1b9: aload 16
      // 1bb: iload 19
      // 1bd: invokevirtual rip/breeze/client/BreezeIterable.getDataBuilder2 (I)Lrip/breeze/client/PlayerUtil8;
      // 1c0: lload 11
      // 1c2: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1c5: astore 20
      // 1c7: aload 20
      // 1c9: sipush 24399
      // 1cc: ldc2_w 35242899484639814
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1d9: lload 7
      // 1db: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 1de: istore 21
      // 1e0: aload 20
      // 1e2: sipush 9123
      // 1e5: ldc2_w 8748284681674522341
      // 1e8: lload 2
      // 1e9: lxor
      // 1ea: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1f2: iload 4
      // 1f4: i2c
      // 1f5: iload 5
      // 1f7: iload 6
      // 1f9: i2s
      // 1fa: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1fd: astore 22
      // 1ff: aload 20
      // 201: sipush 25519
      // 204: ldc2_w 7818294695748746974
      // 207: lload 2
      // 208: lxor
      // 209: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 211: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 214: ldc2_w 1989344879931962586
      // 217: lload 2
      // 218: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 21b: swap
      // 21c: aconst_null
      // 21d: swap
      // 21e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 221: checkcast rip/breeze/ColorMode
      // 224: goto 22b
      // 227: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22a: athrow
      // 22b: astore 23
      // 22d: new rip/breeze/RenderUtil3_x
      // 230: dup
      // 231: iload 21
      // 233: aload 22
      // 235: aload 23
      // 237: invokespecial rip/breeze/RenderUtil3_x.<init> (ILjava/lang/String;Lrip/breeze/ColorMode;)V
      // 23a: astore 24
      // 23c: aload 17
      // 23e: aload 24
      // 240: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 243: pop
      // 244: aload 18
      // 246: iload 21
      // 248: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24b: aload 24
      // 24d: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 250: pop
      // 251: iinc 19 1
      // 254: aload 14
      // 256: ifnull 1af
      // 259: aload 0
      // 25a: aload 17
      // 25c: invokestatic java/util/Collections.unmodifiableList (Ljava/util/List;)Ljava/util/List;
      // 25f: putfield rip/breeze/CloudAuthService.list_B Ljava/util/List;
      // 262: aload 0
      // 263: aload 18
      // 265: invokestatic java/util/Collections.unmodifiableMap (Ljava/util/Map;)Ljava/util/Map;
      // 268: putfield rip/breeze/CloudAuthService.map_C Ljava/util/Map;
      // 26b: return
      // try (104 -> 106): 107 java/lang/reflect/InvocationTargetException
      // try (87 -> 90): 91 java/lang/reflect/InvocationTargetException
      // try (74 -> 76): 77 java/lang/reflect/InvocationTargetException
      // try (56 -> 58): 59 java/lang/reflect/InvocationTargetException
      // try (63 -> 110): 110 java/io/UncheckedIOException
      // try (120 -> 122): 123 java/lang/reflect/InvocationTargetException
      // try (126 -> 144): 145 java/io/UncheckedIOException
      // try (134 -> 156): 157 java/io/UncheckedIOException
      // try (147 -> 173): 173 java/io/UncheckedIOException
      // try (252 -> 254): 255 java/lang/reflect/InvocationTargetException
   }

   private void lambda$refreshCapeAssignments_Inner26() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 20128375607226
      // 006: lxor
      // 007: lstore 1
      // 008: lload 1
      // 009: dup2
      // 00a: ldc2_w 50760505839481
      // 00d: lxor
      // 00e: dup2
      // 00f: bipush 48
      // 011: lushr
      // 012: l2i
      // 013: istore 3
      // 014: dup2
      // 015: bipush 16
      // 017: lshl
      // 018: bipush 32
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 4
      // 01e: dup2
      // 01f: bipush 48
      // 021: lshl
      // 022: bipush 48
      // 024: lushr
      // 025: l2i
      // 026: istore 5
      // 028: pop2
      // 029: dup2
      // 02a: ldc2_w 119922688616785
      // 02d: lxor
      // 02e: lstore 6
      // 030: dup2
      // 031: ldc2_w 131467347086499
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 22374734858085
      // 03b: lxor
      // 03c: lstore 10
      // 03e: dup2
      // 03f: ldc2_w 6073735186191
      // 042: lxor
      // 043: lstore 12
      // 045: pop2
      // 046: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 049: aload 0
      // 04a: sipush 22034
      // 04d: ldc2_w 5368824178036039915
      // 050: lload 1
      // 051: lxor
      // 052: pop2
      // 053: pop
      // 054: ldc_w "update-capes/"
      // 057: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05a: ldc2_w 8083139092423615856
      // 05d: lload 1
      // 05e: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 061: dup_x2
      // 062: pop
      // 063: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 066: checkcast java/net/HttpURLConnection
      // 069: goto 070
      // 06c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06f: athrow
      // 070: astore 14
      // 072: new rip/breeze/client/UserTheme
      // 075: dup
      // 076: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 079: astore 15
      // 07b: astore 16
      // 07d: aload 0
      // 07e: getfield rip/breeze/CloudAuthService.uUID_F Ljava/util/UUID;
      // 081: ifnull 0a6
      // 084: aload 15
      // 086: sipush 20134
      // 089: ldc2_w 5299579169167669311
      // 08c: lload 1
      // 08d: lxor
      // 08e: pop2
      // 08f: pop
      // 090: ldc_w "update-capes/"
      // 093: aload 0
      // 094: getfield rip/breeze/CloudAuthService.uUID_F Ljava/util/UUID;
      // 097: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 09a: lload 6
      // 09c: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 09f: goto 0a6
      // 0a2: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 14
      // 0a9: aload 15
      // 0ab: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ae: ldc2_w 8084434294983660527
      // 0b1: lload 1
      // 0b2: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ba: pop
      // 0bb: goto 0c2
      // 0be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 14
      // 0c5: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c8: ldc2_w 8083017995216166536
      // 0cb: lload 1
      // 0cc: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0cf: dup_x2
      // 0d0: pop
      // 0d1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d4: checkcast java/lang/Integer
      // 0d7: invokevirtual java/lang/Integer.intValue ()I
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: sipush 200
      // 0e4: if_icmpeq 113
      // 0e7: aload 0
      // 0e8: aload 14
      // 0ea: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0ed: dup
      // 0ee: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f1: pop
      // 0f2: invokedynamic accept (Ljava/io/PrintStream;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, java/io/PrintStream.println (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 0f7: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fa: ldc2_w 8085101209809809171
      // 0fd: lload 1
      // 0fe: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 101: dup_x2
      // 102: pop
      // 103: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 106: pop
      // 107: goto 10e
      // 10a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: return
      // 10f: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 0
      // 114: aload 14
      // 116: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 119: ldc2_w 8083935601888956468
      // 11c: lload 1
      // 11d: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 120: dup_x2
      // 121: pop
      // 122: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 125: checkcast rip/breeze/client/UserTheme
      // 128: goto 12f
      // 12b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: astore 17
      // 131: aload 17
      // 133: sipush 24471
      // 136: ldc2_w 1784474848566733168
      // 139: lload 1
      // 13a: lxor
      // 13b: pop2
      // 13c: pop
      // 13d: ldc_w "update-capes/"
      // 140: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 143: ifeq 167
      // 146: aload 17
      // 148: sipush 24471
      // 14b: ldc2_w 1784474848566733168
      // 14e: lload 1
      // 14f: lxor
      // 150: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 158: lload 10
      // 15a: invokevirtual rip/breeze/client/PlayerUtil8.isValid_5 (J)Z
      // 15d: ifne 16c
      // 160: goto 167
      // 163: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: return
      // 168: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 17
      // 16e: sipush 4258
      // 171: ldc2_w 5889510071443924601
      // 174: lload 1
      // 175: lxor
      // 176: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 17e: ifeq 1cf
      // 181: aload 17
      // 183: sipush 9073
      // 186: ldc2_w 5912188730890458555
      // 189: lload 1
      // 18a: lxor
      // 18b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 193: invokevirtual rip/breeze/client/PlayerUtil8.isValid_4 ()Z
      // 196: ifne 1cf
      // 199: goto 1a0
      // 19c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 17
      // 1a2: sipush 9073
      // 1a5: ldc2_w 5912188730890458555
      // 1a8: lload 1
      // 1a9: lxor
      // 1aa: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1b2: lload 8
      // 1b4: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 1b7: istore 18
      // 1b9: aload 0
      // 1ba: iload 18
      // 1bc: ifne 1c7
      // 1bf: aconst_null
      // 1c0: goto 1cc
      // 1c3: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: iload 18
      // 1c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cc: putfield rip/breeze/CloudAuthService.integer_E Ljava/lang/Integer;
      // 1cf: aload 17
      // 1d1: sipush 32743
      // 1d4: ldc2_w 859350864806988113
      // 1d7: lload 1
      // 1d8: lxor
      // 1d9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: invokevirtual rip/breeze/client/UserTheme.getBreezeIterable (Ljava/lang/String;)Lrip/breeze/client/BreezeIterable;
      // 1e1: astore 18
      // 1e3: aload 18
      // 1e5: ifnull 26f
      // 1e8: bipush 0
      // 1e9: istore 19
      // 1eb: iload 19
      // 1ed: aload 18
      // 1ef: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 1f2: if_icmpge 26f
      // 1f5: aload 18
      // 1f7: iload 19
      // 1f9: invokevirtual rip/breeze/client/BreezeIterable.getDataBuilder2 (I)Lrip/breeze/client/PlayerUtil8;
      // 1fc: lload 12
      // 1fe: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 201: astore 20
      // 203: aload 20
      // 205: sipush 24399
      // 208: ldc2_w 35271646028917232
      // 20b: lload 1
      // 20c: lxor
      // 20d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 215: iload 3
      // 216: i2c
      // 217: iload 4
      // 219: iload 5
      // 21b: i2s
      // 21c: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 21f: astore 21
      // 221: aload 20
      // 223: sipush 4886
      // 226: ldc2_w 8512412299564918244
      // 229: lload 1
      // 22a: lxor
      // 22b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 233: lload 8
      // 235: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 238: istore 22
      // 23a: aload 0
      // 23b: getfield rip/breeze/CloudAuthService.map_C Ljava/util/Map;
      // 23e: iload 22
      // 240: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 243: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 248: checkcast rip/breeze/RenderUtil3_x
      // 24b: astore 23
      // 24d: aload 23
      // 24f: ifnull 267
      // 252: aload 0
      // 253: getfield rip/breeze/CloudAuthService.concurrentMap_D Ljava/util/concurrent/ConcurrentMap;
      // 256: aload 21
      // 258: aload 23
      // 25a: invokeinterface java/util/concurrent/ConcurrentMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 25f: pop
      // 260: goto 267
      // 263: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: iinc 19 1
      // 26a: aload 16
      // 26c: ifnull 1eb
      // 26f: aload 17
      // 271: sipush 32080
      // 274: ldc2_w 8253262900901366746
      // 277: lload 1
      // 278: lxor
      // 279: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: invokevirtual rip/breeze/client/UserTheme.getBreezeIterable (Ljava/lang/String;)Lrip/breeze/client/BreezeIterable;
      // 281: astore 19
      // 283: aload 19
      // 285: ifnull 2d5
      // 288: bipush 0
      // 289: istore 20
      // 28b: iload 20
      // 28d: aload 19
      // 28f: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 292: if_icmpge 2d5
      // 295: aload 19
      // 297: iload 20
      // 299: invokevirtual rip/breeze/client/BreezeIterable.getDataBuilder2 (I)Lrip/breeze/client/PlayerUtil8;
      // 29c: lload 12
      // 29e: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 2a1: astore 21
      // 2a3: aload 21
      // 2a5: sipush 24399
      // 2a8: ldc2_w 35271646028917232
      // 2ab: lload 1
      // 2ac: lxor
      // 2ad: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 2b5: iload 3
      // 2b6: i2c
      // 2b7: iload 4
      // 2b9: iload 5
      // 2bb: i2s
      // 2bc: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 2bf: astore 22
      // 2c1: aload 0
      // 2c2: getfield rip/breeze/CloudAuthService.concurrentMap_D Ljava/util/concurrent/ConcurrentMap;
      // 2c5: aload 22
      // 2c7: invokeinterface java/util/concurrent/ConcurrentMap.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2cc: pop
      // 2cd: iinc 20 1
      // 2d0: aload 16
      // 2d2: ifnull 28b
      // 2d5: return
      // try (60 -> 62): 63 java/lang/reflect/InvocationTargetException
      // try (71 -> 87): 88 java/io/UncheckedIOException
      // try (133 -> 135): 136 java/lang/reflect/InvocationTargetException
      // try (112 -> 115): 116 java/lang/reflect/InvocationTargetException
      // try (99 -> 101): 102 java/lang/reflect/InvocationTargetException
      // try (90 -> 139): 139 java/io/UncheckedIOException
      // try (149 -> 151): 152 java/lang/reflect/InvocationTargetException
      // try (155 -> 175): 176 java/io/UncheckedIOException
      // try (165 -> 179): 179 java/io/UncheckedIOException
      // try (181 -> 198): 199 java/io/UncheckedIOException
      // try (211 -> 216): 216 java/io/UncheckedIOException
      // try (274 -> 282): 283 java/io/UncheckedIOException
   }

   private void lambda$sendKeepAliveScheduled_Inner25() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 03: ldc2_w 59904942003792
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: sipush 12253
      // 10: ldc2_w 3003299089287790803
      // 13: lload 1
      // 14: lxor
      // 15: pop2
      // 16: pop
      // 17: ldc_w "keep-alive/"
      // 1a: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d: ldc2_w 3010427758068104346
      // 20: lload 1
      // 21: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 24: dup_x2
      // 25: pop
      // 26: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 29: checkcast java/net/HttpURLConnection
      // 2c: goto 33
      // 2f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32: athrow
      // 33: astore 4
      // 35: aload 0
      // 36: aload 4
      // 38: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3b: ldc2_w 3010236609272956770
      // 3e: lload 1
      // 3f: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 42: dup_x2
      // 43: pop
      // 44: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 47: checkcast java/lang/Integer
      // 4a: invokevirtual java/lang/Integer.intValue ()I
      // 4d: goto 54
      // 50: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53: athrow
      // 54: istore 5
      // 56: iload 5
      // 58: sipush 200
      // 5b: if_icmpne 88
      // 5e: aload 0
      // 5f: getstatic rip/breeze/EnumType12.CONNECTED Lrip/breeze/EnumType12;
      // 62: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 65: aload 0
      // 66: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // 69: ldc2_w 3015273786318435245
      // 6c: lload 1
      // 6d: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 70: dup_x2
      // 71: pop
      // 72: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 75: pop
      // 76: goto 7d
      // 79: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 3
      // 7e: ifnull cf
      // 81: goto 88
      // 84: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: iload 5
      // 8a: sipush 401
      // 8d: if_icmpne a9
      // 90: goto 97
      // 93: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: aload 0
      // 98: getstatic rip/breeze/EnumType12.UNAUTHORIZED Lrip/breeze/EnumType12;
      // 9b: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // 9e: aload 3
      // 9f: ifnull cf
      // a2: goto a9
      // a5: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: aload 0
      // aa: getstatic rip/breeze/EnumType12.CONNECTING Lrip/breeze/EnumType12;
      // ad: putfield rip/breeze/CloudAuthService.enum_CONNECTING_j Lrip/breeze/EnumType12;
      // b0: aload 0
      // b1: invokestatic rip/breeze/client/MathUtil8.noArgs ()[Ljava/lang/Object;
      // b4: ldc2_w 3015273786318435245
      // b7: lload 1
      // b8: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // bb: dup_x2
      // bc: pop
      // bd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // c0: pop
      // c1: goto c8
      // c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // c7: athrow
      // c8: goto cf
      // cb: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ce: athrow
      // cf: goto d4
      // d2: astore 4
      // d4: return
      // try (88 -> 90): 91 java/lang/reflect/InvocationTargetException
      // try (54 -> 56): 57 java/lang/reflect/InvocationTargetException
      // try (34 -> 37): 38 java/lang/reflect/InvocationTargetException
      // try (20 -> 22): 23 java/lang/reflect/InvocationTargetException
      // try (70 -> 93): 94 java/lang/Throwable
      // try (64 -> 75): 76 java/lang/Throwable
      // try (44 -> 67): 68 java/lang/Throwable
      // try (41 -> 61): 62 java/lang/Throwable
      // try (6 -> 96): 97 java/lang/Throwable
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void lambda$getUserItems_Inner24(long var1, int var3, Consumer var4, BiConsumer var5) {
      long var6 = 101842494624523L;
      long var8 = var6 ^ 26490932606131L;
      long var10001 = var6 ^ 86925673770060L;
      int var10 = (int)((var6 ^ 86925673770060L) >>> 48);
      int var11 = (int)((var6 ^ 86925673770060L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var6 ^ 24970076270486L;
      long var15 = var6 ^ 110648203109434L;
      int[] var10000 = values();
      Object[] var10002 = rip.breeze.client.MathUtil8.buildArgs1("get-user-items/");
      Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(1375978371132474949L, var6);
      Object[] var10003 = var10002;
      CloudAuthService var56 = this;
      Method var46 = var10004;

      try {
         var47 = (HttpURLConnection)var46.invoke(var56, var10003);
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      HttpURLConnection var17 = var47;
      int[] var18 = var10000;
      UserTheme var19 = new UserTheme();

      try {
         var19.runCloudJob(var8, "user-id", var1);
         var19.runCloudJob(var8, "offset", var3);
         var19.runCloudJob(var8, "limit", 20);
         Object[] var48 = rip.breeze.client.MathUtil8.buildArgs2(var17, var19);
         Method var61 = rip.breeze.client.MathUtil8.getMethod_3(1370447837451514074L, var6);
         var10002 = var48;
         CloudAuthService var49 = this;
         Method var40 = var61;

         try {
            var40.invoke(var49, var10002);
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         Object[] var50 = rip.breeze.client.MathUtil8.buildArgs1(var17);
         Method var62 = rip.breeze.client.MathUtil8.getMethod_3(1376350161821793725L, var6);
         var10002 = var50;
         CloudAuthService var51 = this;
         Method var41 = var62;

         try {
            var42 = (Integer)var41.invoke(var51, var10002);
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         if (var42 != 200) {
            Object[] var54 = rip.breeze.client.MathUtil8.buildArgs2(var17, var4);
            Method var64 = rip.breeze.client.MathUtil8.getMethod_3(1369496238814661670L, var6);
            var10002 = var54;
            CloudAuthService var55 = this;
            Method var45 = var64;

            try {
               var45.invoke(var55, var10002);
               return;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }
         }
      } catch (Exception var39) {
         throw getThrowable(var39);
      }

      Object[] var52 = rip.breeze.client.MathUtil8.buildArgs1(var17);
      Method var63 = rip.breeze.client.MathUtil8.getMethod_3(1376564081455723265L, var6);
      var10002 = var52;
      CloudAuthService var53 = this;
      Method var43 = var63;

      try {
         var44 = (UserTheme)var43.invoke(var53, var10002);
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      UserTheme var20 = var44;

      try {
         if (!"success"
            .equals(var20.getDataBuilder2_2("status").buildString((char)var10, var11, (short)var12))) {
            var4.accept(var20.getDataBuilder2_2("message").buildString((char)var10, var11, (short)var12));
            return;
         }
      } catch (Exception var38) {
         throw getThrowable(var38);
      }

      BreezeIterable var21 = var20.getBreezeIterable("content");
      int var22 = var20.getDataBuilder2_2("total").getValue(var13);
      ArrayList var23 = new ArrayList(var21.getValue());
      int var24 = 0;

      while (var24 < var21.getValue()) {
         RenderUtil19_x var26;
         label95: {
            UserTheme var25 = var21.getDataBuilder2(var24).getUserTheme(var15);
            var26 = RenderUtil19_x.getEnum4Val(
               var25.getDataBuilder2_2("type").buildString((char)var10, var11, (short)var12)
            );
            switch (ConfigUtil1.CONST_A[Objects.requireNonNull(var26).ordinal()]) {
               case 1:
                  try {
                     var23.add(
                        new ImageUtil33(
                           new StringDecryptHelper(var25),
                           new UserInfo(var25.getDataBuilder2_2("user").getUserTheme(var15))
                        )
                     );
                     break;
                  } catch (Exception var37) {
                     if (var18 == null) {
                        break;
                     }
                  }
               case 2:
                  try {
                     var23.add(
                        new RenderUtil47(
                           new StringDecryptHelper3(var25),
                           new UserInfo(var25.getDataBuilder2_2("user").getUserTheme(var15))
                        )
                     );
                     break;
                  } catch (Exception var36) {
                     if (var18 == null) {
                        break;
                     }
                  }
               case 3:
                  try {
                     var23.add(
                        new ImageUtil35(
                           new StringDecryptHelper2(var25),
                           new UserInfo(var25.getDataBuilder2_2("user").getUserTheme(var15))
                        )
                     );
                  } catch (Exception var35) {
                     try {
                        if (var18 != null) {
                           break label95;
                        }
                     } catch (Exception var34) {
                        throw getThrowable(var34);
                     }
                  }
                  break;
               default:
                  break label95;
            }

            var24++;
            if (var18 == null) {
               continue;
            }
            break;
         }

         try {
            var4.accept("Unknown item kind:" + var26.getString_a());
            return;
         } catch (Exception var29) {
            throw getThrowable(var29);
         }
      }

      var5.accept(var23, var22);
   }

   private void lambda$getUserPreview_Inner23(long param1, Consumer param3, Consumer param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 81777167623956
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 36409260425000
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 129760126576599
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 9
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 10
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 11
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 102978778263457
      // 037: lxor
      // 038: lstore 12
      // 03a: pop2
      // 03b: aload 0
      // 03c: sipush 12040
      // 03f: ldc2_w 1194760794846359911
      // 042: lload 5
      // 044: lxor
      // 045: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04d: ldc2_w 1766339055069482462
      // 050: lload 5
      // 052: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 055: dup_x2
      // 056: pop
      // 057: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05a: checkcast java/net/HttpURLConnection
      // 05d: goto 064
      // 060: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 063: athrow
      // 064: astore 14
      // 066: new rip/breeze/client/UserTheme
      // 069: dup
      // 06a: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 06d: astore 15
      // 06f: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 072: aload 15
      // 074: lload 7
      // 076: sipush 1382
      // 079: ldc2_w 8042243503739788147
      // 07c: lload 5
      // 07e: lxor
      // 07f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: lload 1
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 08b: astore 16
      // 08d: aload 0
      // 08e: aload 14
      // 090: aload 15
      // 092: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 095: ldc2_w 1774407287089658689
      // 098: lload 5
      // 09a: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0a2: pop
      // 0a3: goto 0aa
      // 0a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: aload 14
      // 0ad: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b0: ldc2_w 1766253437782619686
      // 0b3: lload 5
      // 0b5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0bd: checkcast java/lang/Integer
      // 0c0: invokevirtual java/lang/Integer.intValue ()I
      // 0c3: goto 0ca
      // 0c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: sipush 200
      // 0cd: if_icmpeq 0f1
      // 0d0: aload 0
      // 0d1: aload 14
      // 0d3: aload 3
      // 0d4: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d7: ldc2_w 1772822415477311421
      // 0da: lload 5
      // 0dc: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e4: pop
      // 0e5: goto 0ec
      // 0e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: return
      // 0ed: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: aload 14
      // 0f4: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f7: ldc2_w 1765886832321689754
      // 0fa: lload 5
      // 0fc: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0ff: dup_x2
      // 100: pop
      // 101: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 104: checkcast rip/breeze/client/UserTheme
      // 107: goto 10e
      // 10a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: astore 17
      // 110: sipush 24471
      // 113: ldc2_w 1784518664034910686
      // 116: lload 5
      // 118: lxor
      // 119: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: aload 17
      // 120: sipush 2653
      // 123: ldc2_w 7190983879874401452
      // 126: lload 5
      // 128: lxor
      // 129: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 131: iload 9
      // 133: i2c
      // 134: iload 10
      // 136: iload 11
      // 138: i2s
      // 139: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 13c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13f: ifne 172
      // 142: aload 3
      // 143: aload 17
      // 145: sipush 10684
      // 148: ldc2_w 5325866586176223229
      // 14b: lload 5
      // 14d: lxor
      // 14e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 156: iload 9
      // 158: i2c
      // 159: iload 10
      // 15b: iload 11
      // 15d: i2s
      // 15e: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 161: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 166: aload 16
      // 168: ifnull 1dc
      // 16b: goto 172
      // 16e: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 17
      // 174: sipush 26757
      // 177: ldc2_w 783094049082291859
      // 17a: lload 5
      // 17c: lxor
      // 17d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 185: ifne 1af
      // 188: goto 18f
      // 18b: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: aload 3
      // 190: sipush 32104
      // 193: ldc2_w 6822387710609171206
      // 196: lload 5
      // 198: lxor
      // 199: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1a3: aload 16
      // 1a5: ifnull 1dc
      // 1a8: goto 1af
      // 1ab: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: aload 4
      // 1b1: new rip/breeze/UserInfo
      // 1b4: dup
      // 1b5: aload 17
      // 1b7: sipush 26757
      // 1ba: ldc2_w 783094049082291859
      // 1bd: lload 5
      // 1bf: lxor
      // 1c0: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1c8: lload 12
      // 1ca: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1cd: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 1d0: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1d5: goto 1dc
      // 1d8: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: return
      // try (110 -> 112): 113 java/lang/reflect/InvocationTargetException
      // try (93 -> 96): 97 java/lang/reflect/InvocationTargetException
      // try (80 -> 82): 83 java/lang/reflect/InvocationTargetException
      // try (49 -> 51): 52 java/lang/reflect/InvocationTargetException
      // try (71 -> 116): 116 java/io/UncheckedIOException
      // try (126 -> 128): 129 java/lang/reflect/InvocationTargetException
      // try (132 -> 169): 170 java/io/UncheckedIOException
      // try (152 -> 180): 181 java/io/UncheckedIOException
      // try (172 -> 192): 193 java/io/UncheckedIOException
      // try (183 -> 209): 210 java/io/UncheckedIOException
   }

   private void lambda$getCloudItems_Inner22(
      String param1,
      RotationUtil1_x param2,
      int param3,
      boolean param4,
      boolean param5,
      boolean param6,
      boolean param7,
      Consumer param8,
      Consumer param9,
      BiConsumer param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 136289252682678
      // 006: lxor
      // 007: lstore 11
      // 009: lload 11
      // 00b: dup2
      // 00c: ldc2_w 16143590707819
      // 00f: lxor
      // 010: lstore 13
      // 012: dup2
      // 013: ldc2_w 66317332992462
      // 016: lxor
      // 017: lstore 15
      // 019: dup2
      // 01a: ldc2_w 18182113883018
      // 01d: lxor
      // 01e: lstore 17
      // 020: dup2
      // 021: ldc2_w 78685029329781
      // 024: lxor
      // 025: dup2
      // 026: bipush 48
      // 028: lushr
      // 029: l2i
      // 02a: istore 19
      // 02c: dup2
      // 02d: bipush 16
      // 02f: lshl
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 20
      // 036: dup2
      // 037: bipush 48
      // 039: lshl
      // 03a: bipush 48
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 21
      // 040: pop2
      // 041: dup2
      // 042: ldc2_w 5134592691549
      // 045: lxor
      // 046: lstore 22
      // 048: dup2
      // 049: ldc2_w 33171917138095
      // 04c: lxor
      // 04d: lstore 24
      // 04f: dup2
      // 050: ldc2_w 53122417745645
      // 053: lxor
      // 054: lstore 26
      // 056: dup2
      // 057: ldc2_w 68315278371853
      // 05a: lxor
      // 05b: lstore 28
      // 05d: dup2
      // 05e: ldc2_w 138415367267177
      // 061: lxor
      // 062: lstore 30
      // 064: dup2
      // 065: ldc2_w 119009081533187
      // 068: lxor
      // 069: lstore 32
      // 06b: dup2
      // 06c: ldc2_w 42638587649089
      // 06f: lxor
      // 070: lstore 34
      // 072: pop2
      // 073: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 076: aload 0
      // 077: sipush 20450
      // 07a: ldc2_w 6260247480132590874
      // 07d: lload 11
      // 07f: lxor
      // 080: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 088: ldc2_w -3161107374045396612
      // 08b: lload 11
      // 08d: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 090: dup_x2
      // 091: pop
      // 092: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 095: checkcast java/net/HttpURLConnection
      // 098: goto 09f
      // 09b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: astore 36
      // 0a1: astore 37
      // 0a3: new rip/breeze/client/UserTheme
      // 0a6: dup
      // 0a7: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 0aa: astore 38
      // 0ac: aload 1
      // 0ad: invokevirtual java/lang/String.isEmpty ()Z
      // 0b0: ifne 0d0
      // 0b3: aload 38
      // 0b5: sipush 26437
      // 0b8: ldc2_w 8728484453042910658
      // 0bb: lload 11
      // 0bd: lxor
      // 0be: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: aload 1
      // 0c4: lload 22
      // 0c6: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0c9: goto 0d0
      // 0cc: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: aload 38
      // 0d2: sipush 2995
      // 0d5: ldc2_w 1518925617913403879
      // 0d8: lload 11
      // 0da: lxor
      // 0db: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 2
      // 0e1: invokevirtual rip/breeze/RotationUtil1_x.getString_b ()Ljava/lang/String;
      // 0e4: lload 22
      // 0e6: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0e9: aload 38
      // 0eb: lload 17
      // 0ed: sipush 23776
      // 0f0: ldc2_w 5675886145484115572
      // 0f3: lload 11
      // 0f5: lxor
      // 0f6: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: iload 3
      // 0fc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 102: aload 38
      // 104: lload 17
      // 106: sipush 15083
      // 109: ldc2_w 5306391740037572613
      // 10c: lload 11
      // 10e: lxor
      // 10f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: bipush 20
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 11c: new rip/breeze/client/BreezeIterable
      // 11f: dup
      // 120: invokespecial rip/breeze/client/BreezeIterable.<init> ()V
      // 123: astore 39
      // 125: iload 4
      // 127: ifeq 151
      // 12a: aload 39
      // 12c: new rip/breeze/client/Util138
      // 12f: dup
      // 130: lload 13
      // 132: sipush 17280
      // 135: ldc2_w 2385930312426246415
      // 138: lload 11
      // 13a: lxor
      // 13b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokespecial rip/breeze/client/Util138.<init> (JLjava/lang/String;)V
      // 143: lload 26
      // 145: dup2_x1
      // 146: pop2
      // 147: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // 14a: goto 151
      // 14d: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: iload 5
      // 153: ifeq 17d
      // 156: aload 39
      // 158: new rip/breeze/client/Util138
      // 15b: dup
      // 15c: lload 13
      // 15e: sipush 10392
      // 161: ldc2_w 8671434787273194108
      // 164: lload 11
      // 166: lxor
      // 167: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: invokespecial rip/breeze/client/Util138.<init> (JLjava/lang/String;)V
      // 16f: lload 26
      // 171: dup2_x1
      // 172: pop2
      // 173: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // 176: goto 17d
      // 179: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: iload 6
      // 17f: ifeq 1a9
      // 182: aload 39
      // 184: new rip/breeze/client/Util138
      // 187: dup
      // 188: lload 13
      // 18a: sipush 26757
      // 18d: ldc2_w 783110076171647537
      // 190: lload 11
      // 192: lxor
      // 193: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokespecial rip/breeze/client/Util138.<init> (JLjava/lang/String;)V
      // 19b: lload 26
      // 19d: dup2_x1
      // 19e: pop2
      // 19f: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: iload 7
      // 1ab: ifeq 1d5
      // 1ae: aload 39
      // 1b0: new rip/breeze/client/Util138
      // 1b3: dup
      // 1b4: lload 13
      // 1b6: sipush 2832
      // 1b9: ldc2_w 1337519368222775708
      // 1bc: lload 11
      // 1be: lxor
      // 1bf: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: invokespecial rip/breeze/client/Util138.<init> (JLjava/lang/String;)V
      // 1c7: lload 26
      // 1c9: dup2_x1
      // 1ca: pop2
      // 1cb: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // 1ce: goto 1d5
      // 1d1: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: aload 38
      // 1d7: sipush 30521
      // 1da: ldc2_w 199329978532652456
      // 1dd: lload 11
      // 1df: lxor
      // 1e0: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: lload 28
      // 1e7: aload 39
      // 1e9: invokevirtual rip/breeze/client/UserTheme.processNullable (Ljava/lang/String;JLrip/breeze/client/PlayerUtil8;)V
      // 1ec: aload 0
      // 1ed: aload 36
      // 1ef: aload 38
      // 1f1: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1f4: ldc2_w -3153144731346716701
      // 1f7: lload 11
      // 1f9: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 201: pop
      // 202: goto 209
      // 205: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 208: athrow
      // 209: aload 0
      // 20a: aload 36
      // 20c: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 20f: ldc2_w -3161298580688291196
      // 212: lload 11
      // 214: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 217: dup_x2
      // 218: pop
      // 219: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 21c: checkcast java/lang/Integer
      // 21f: invokevirtual java/lang/Integer.intValue ()I
      // 222: goto 229
      // 225: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 228: athrow
      // 229: sipush 200
      // 22c: if_icmpeq 251
      // 22f: aload 0
      // 230: aload 36
      // 232: aload 8
      // 234: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 237: ldc2_w -3154660434626688225
      // 23a: lload 11
      // 23c: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 23f: dup_x2
      // 240: pop
      // 241: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 244: pop
      // 245: goto 24c
      // 248: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: return
      // 24d: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: aload 0
      // 252: aload 36
      // 254: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 257: ldc2_w -3160540523452025800
      // 25a: lload 11
      // 25c: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 25f: dup_x2
      // 260: pop
      // 261: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 264: checkcast rip/breeze/client/UserTheme
      // 267: goto 26e
      // 26a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: astore 40
      // 270: sipush 24471
      // 273: ldc2_w 1784502773105282428
      // 276: lload 11
      // 278: lxor
      // 279: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: aload 40
      // 280: sipush 2653
      // 283: ldc2_w 7191034920872024078
      // 286: lload 11
      // 288: lxor
      // 289: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 291: iload 19
      // 293: i2c
      // 294: iload 20
      // 296: iload 21
      // 298: i2s
      // 299: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 29c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 29f: ifne 2cc
      // 2a2: aload 8
      // 2a4: aload 40
      // 2a6: sipush 10684
      // 2a9: ldc2_w 5325918761023126367
      // 2ac: lload 11
      // 2ae: lxor
      // 2af: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 2b7: iload 19
      // 2b9: i2c
      // 2ba: iload 20
      // 2bc: iload 21
      // 2be: i2s
      // 2bf: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 2c2: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 2c7: return
      // 2c8: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cb: athrow
      // 2cc: aload 40
      // 2ce: sipush 15969
      // 2d1: ldc2_w 214171471093279956
      // 2d4: lload 11
      // 2d6: lxor
      // 2d7: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 2df: ifeq 41e
      // 2e2: aload 40
      // 2e4: sipush 17169
      // 2e7: ldc2_w 8133458033883730410
      // 2ea: lload 11
      // 2ec: lxor
      // 2ed: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 2f5: lload 30
      // 2f7: invokevirtual rip/breeze/client/PlayerUtil8.isValid_5 (J)Z
      // 2fa: ifeq 41e
      // 2fd: goto 304
      // 300: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 303: athrow
      // 304: aload 40
      // 306: sipush 29363
      // 309: ldc2_w 4025620989870596143
      // 30c: lload 11
      // 30e: lxor
      // 30f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 317: lload 32
      // 319: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 31c: astore 41
      // 31e: aload 41
      // 320: sipush 20787
      // 323: ldc2_w 8899058760518550374
      // 326: lload 11
      // 328: lxor
      // 329: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 331: iload 19
      // 333: i2c
      // 334: iload 20
      // 336: iload 21
      // 338: i2s
      // 339: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 33c: invokestatic rip/breeze/RenderUtil19_x.getEnum4Val (Ljava/lang/String;)Lrip/breeze/RenderUtil19_x;
      // 33f: astore 42
      // 341: getstatic rip/breeze/ConfigUtil1.CONST_A [I
      // 344: aload 42
      // 346: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 349: checkcast rip/breeze/RenderUtil19_x
      // 34c: invokevirtual rip/breeze/RenderUtil19_x.ordinal ()I
      // 34f: iaload
      // 350: tableswitch 205 1 3 28 94 144
      // 36c: aload 9
      // 36e: new rip/breeze/PlayerUtil9
      // 371: dup
      // 372: new rip/breeze/StringDecryptHelper
      // 375: dup
      // 376: aload 41
      // 378: invokespecial rip/breeze/StringDecryptHelper.<init> (Lrip/breeze/client/UserTheme;)V
      // 37b: new rip/breeze/UserInfo
      // 37e: dup
      // 37f: aload 41
      // 381: sipush 26757
      // 384: ldc2_w 783110076171647537
      // 387: lload 11
      // 389: lxor
      // 38a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 392: lload 32
      // 394: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 397: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 39a: invokespecial rip/breeze/PlayerUtil9.<init> (Lrip/breeze/StringDecryptHelper;Lrip/breeze/UserInfo;)V
      // 39d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 3a2: aload 37
      // 3a4: ifnull 41d
      // 3a7: goto 3ae
      // 3aa: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: aload 9
      // 3b0: new rip/breeze/RenderUtil40
      // 3b3: dup
      // 3b4: aload 41
      // 3b6: sipush 24399
      // 3b9: ldc2_w 35227093539343868
      // 3bc: lload 11
      // 3be: lxor
      // 3bf: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 3c7: lload 15
      // 3c9: invokevirtual rip/breeze/client/PlayerUtil8.getLong (J)J
      // 3cc: invokespecial rip/breeze/RenderUtil40.<init> (J)V
      // 3cf: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 3d4: aload 37
      // 3d6: ifnull 41d
      // 3d9: goto 3e0
      // 3dc: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3df: athrow
      // 3e0: aload 9
      // 3e2: new rip/breeze/RenderUtil14_x
      // 3e5: dup
      // 3e6: new rip/breeze/StringDecryptHelper2
      // 3e9: dup
      // 3ea: aload 41
      // 3ec: invokespecial rip/breeze/StringDecryptHelper2.<init> (Lrip/breeze/client/UserTheme;)V
      // 3ef: new rip/breeze/UserInfo
      // 3f2: dup
      // 3f3: aload 41
      // 3f5: sipush 26757
      // 3f8: ldc2_w 783110076171647537
      // 3fb: lload 11
      // 3fd: lxor
      // 3fe: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 403: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 406: lload 32
      // 408: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 40b: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 40e: invokespecial rip/breeze/RenderUtil14_x.<init> (Lrip/breeze/StringDecryptHelper2;Lrip/breeze/UserInfo;)V
      // 411: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 416: goto 41d
      // 419: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41c: athrow
      // 41d: return
      // 41e: aload 40
      // 420: sipush 29363
      // 423: ldc2_w 4025620989870596143
      // 426: lload 11
      // 428: lxor
      // 429: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42e: invokevirtual rip/breeze/client/UserTheme.getBreezeIterable (Ljava/lang/String;)Lrip/breeze/client/BreezeIterable;
      // 431: astore 41
      // 433: aload 40
      // 435: sipush 30092
      // 438: ldc2_w 3515292437832394613
      // 43b: lload 11
      // 43d: lxor
      // 43e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 443: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 446: lload 24
      // 448: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 44b: istore 42
      // 44d: new java/util/ArrayList
      // 450: dup
      // 451: aload 41
      // 453: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 456: invokespecial java/util/ArrayList.<init> (I)V
      // 459: astore 43
      // 45b: bipush 0
      // 45c: istore 44
      // 45e: iload 44
      // 460: aload 41
      // 462: invokevirtual rip/breeze/client/BreezeIterable.getValue ()I
      // 465: if_icmpge 60c
      // 468: aload 41
      // 46a: iload 44
      // 46c: invokevirtual rip/breeze/client/BreezeIterable.getDataBuilder2 (I)Lrip/breeze/client/PlayerUtil8;
      // 46f: lload 32
      // 471: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 474: astore 45
      // 476: aload 45
      // 478: sipush 20787
      // 47b: ldc2_w 8899058760518550374
      // 47e: lload 11
      // 480: lxor
      // 481: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 486: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 489: iload 19
      // 48b: i2c
      // 48c: iload 20
      // 48e: iload 21
      // 490: i2s
      // 491: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 494: invokestatic rip/breeze/RenderUtil19_x.getEnum4Val (Ljava/lang/String;)Lrip/breeze/RenderUtil19_x;
      // 497: astore 46
      // 499: getstatic rip/breeze/ConfigUtil1.CONST_A [I
      // 49c: aload 46
      // 49e: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4a1: checkcast rip/breeze/RenderUtil19_x
      // 4a4: invokevirtual rip/breeze/RenderUtil19_x.ordinal ()I
      // 4a7: iaload
      // 4a8: tableswitch 301 1 4 32 95 238 158
      // 4c8: aload 43
      // 4ca: new rip/breeze/ImageUtil33
      // 4cd: dup
      // 4ce: new rip/breeze/StringDecryptHelper
      // 4d1: dup
      // 4d2: aload 45
      // 4d4: invokespecial rip/breeze/StringDecryptHelper.<init> (Lrip/breeze/client/UserTheme;)V
      // 4d7: new rip/breeze/UserInfo
      // 4da: dup
      // 4db: aload 45
      // 4dd: sipush 26757
      // 4e0: ldc2_w 783110076171647537
      // 4e3: lload 11
      // 4e5: lxor
      // 4e6: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4eb: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 4ee: lload 32
      // 4f0: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 4f3: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 4f6: invokespecial rip/breeze/ImageUtil33.<init> (Lrip/breeze/StringDecryptHelper;Lrip/breeze/UserInfo;)V
      // 4f9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4fc: pop
      // 4fd: goto 604
      // 500: astore 47
      // 502: aload 37
      // 504: ifnull 604
      // 507: aload 43
      // 509: new rip/breeze/RenderUtil47
      // 50c: dup
      // 50d: new rip/breeze/StringDecryptHelper3
      // 510: dup
      // 511: aload 45
      // 513: invokespecial rip/breeze/StringDecryptHelper3.<init> (Lrip/breeze/client/UserTheme;)V
      // 516: new rip/breeze/UserInfo
      // 519: dup
      // 51a: aload 45
      // 51c: sipush 26757
      // 51f: ldc2_w 783110076171647537
      // 522: lload 11
      // 524: lxor
      // 525: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52a: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 52d: lload 32
      // 52f: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 532: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 535: invokespecial rip/breeze/RenderUtil47.<init> (Lrip/breeze/StringDecryptHelper3;Lrip/breeze/UserInfo;)V
      // 538: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 53b: pop
      // 53c: goto 604
      // 53f: astore 47
      // 541: aload 37
      // 543: ifnull 604
      // 546: aload 43
      // 548: new rip/breeze/RenderUtil17
      // 54b: dup
      // 54c: new rip/breeze/UserInfo
      // 54f: dup
      // 550: aload 45
      // 552: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 555: aload 45
      // 557: sipush 8299
      // 55a: ldc2_w 8656095486654624446
      // 55d: lload 11
      // 55f: lxor
      // 560: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 565: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 568: lload 34
      // 56a: invokevirtual rip/breeze/client/PlayerUtil8.getFloat (J)F
      // 56d: aload 45
      // 56f: sipush 25233
      // 572: ldc2_w 1591014508442677269
      // 575: lload 11
      // 577: lxor
      // 578: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57d: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 580: lload 24
      // 582: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 585: invokespecial rip/breeze/RenderUtil17.<init> (Lrip/breeze/UserInfo;FI)V
      // 588: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 58b: pop
      // 58c: goto 604
      // 58f: astore 47
      // 591: aload 37
      // 593: ifnull 604
      // 596: aload 43
      // 598: new rip/breeze/ImageUtil35
      // 59b: dup
      // 59c: new rip/breeze/StringDecryptHelper2
      // 59f: dup
      // 5a0: aload 45
      // 5a2: invokespecial rip/breeze/StringDecryptHelper2.<init> (Lrip/breeze/client/UserTheme;)V
      // 5a5: new rip/breeze/UserInfo
      // 5a8: dup
      // 5a9: aload 45
      // 5ab: sipush 26757
      // 5ae: ldc2_w 783110076171647537
      // 5b1: lload 11
      // 5b3: lxor
      // 5b4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b9: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 5bc: lload 32
      // 5be: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 5c1: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 5c4: invokespecial rip/breeze/ImageUtil35.<init> (Lrip/breeze/StringDecryptHelper2;Lrip/breeze/UserInfo;)V
      // 5c7: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 5ca: pop
      // 5cb: goto 604
      // 5ce: astore 47
      // 5d0: aload 37
      // 5d2: ifnull 604
      // 5d5: aload 8
      // 5d7: new java/lang/StringBuilder
      // 5da: dup
      // 5db: invokespecial java/lang/StringBuilder.<init> ()V
      // 5de: sipush 6746
      // 5e1: ldc2_w 6406090820190734472
      // 5e4: lload 11
      // 5e6: lxor
      // 5e7: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5ef: aload 46
      // 5f1: invokevirtual rip/breeze/RenderUtil19_x.getString_a ()Ljava/lang/String;
      // 5f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5fa: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 5ff: return
      // 600: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: iinc 44 1
      // 607: aload 37
      // 609: ifnull 45e
      // 60c: aload 10
      // 60e: aload 43
      // 610: iload 42
      // 612: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 615: invokeinterface java/util/function/BiConsumer.accept (Ljava/lang/Object;Ljava/lang/Object;)V 3
      // 61a: return
      // try (82 -> 84): 85 java/lang/reflect/InvocationTargetException
      // try (405 -> 445): 446 java/lang/Exception
      // try (379 -> 421): 422 java/lang/Exception
      // try (372 -> 402): 403 java/lang/Exception
      // try (326 -> 344): 345 java/lang/Exception
      // try (288 -> 324): 324 java/lang/Exception
      // try (266 -> 268): 269 java/lang/reflect/InvocationTargetException
      // try (249 -> 252): 253 java/lang/reflect/InvocationTargetException
      // try (236 -> 238): 239 java/lang/reflect/InvocationTargetException
      // try (218 -> 272): 272 java/lang/Exception
      // try (199 -> 215): 216 java/lang/Exception
      // try (180 -> 196): 197 java/lang/Exception
      // try (161 -> 177): 178 java/lang/Exception
      // try (142 -> 158): 159 java/lang/Exception
      // try (93 -> 105): 106 java/lang/Exception
      // try (282 -> 284): 285 java/lang/reflect/InvocationTargetException
      // try (507 -> 529): 530 java/lang/Exception
      // try (533 -> 555): 556 java/lang/Exception
      // try (559 -> 587): 588 java/lang/Exception
      // try (591 -> 613): 614 java/lang/Exception
      // try (615 -> 633): 633 java/lang/Exception
   }

   private void lambda$deleteScript_Inner21(long param1, Consumer param3, Runnable param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 49555862393254
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 77442917943706
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 19198618489189
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 9
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 10
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 11
      // 032: pop2
      // 033: pop2
      // 034: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 037: aload 0
      // 038: sipush 5387
      // 03b: ldc2_w 259425072277732843
      // 03e: lload 5
      // 040: lxor
      // 041: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 049: ldc2_w -1283196653439468692
      // 04c: lload 5
      // 04e: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 051: dup_x2
      // 052: pop
      // 053: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 056: checkcast java/net/HttpURLConnection
      // 059: goto 060
      // 05c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05f: athrow
      // 060: astore 12
      // 062: astore 13
      // 064: new rip/breeze/client/UserTheme
      // 067: dup
      // 068: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 06b: astore 14
      // 06d: aload 14
      // 06f: lload 7
      // 071: sipush 22926
      // 074: ldc2_w 2454643739746136538
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 086: aload 0
      // 087: aload 12
      // 089: aload 14
      // 08b: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w -1284210387482178061
      // 091: lload 5
      // 093: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 096: dup_x2
      // 097: pop
      // 098: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: aload 12
      // 0a6: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a9: ldc2_w -1283357295349235564
      // 0ac: lload 5
      // 0ae: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: checkcast java/lang/Integer
      // 0b9: invokevirtual java/lang/Integer.intValue ()I
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: sipush 200
      // 0c6: if_icmpeq 0ea
      // 0c9: aload 0
      // 0ca: aload 12
      // 0cc: aload 3
      // 0cd: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d0: ldc2_w -1285720612677488369
      // 0d3: lload 5
      // 0d5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0dd: pop
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: return
      // 0e6: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: aload 12
      // 0ed: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f0: ldc2_w -1282444223760101848
      // 0f3: lload 5
      // 0f5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: checkcast rip/breeze/client/UserTheme
      // 100: goto 107
      // 103: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 106: athrow
      // 107: astore 15
      // 109: sipush 24471
      // 10c: ldc2_w 1784416348845045612
      // 10f: lload 5
      // 111: lxor
      // 112: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: aload 15
      // 119: sipush 2653
      // 11c: ldc2_w 7191095008469754398
      // 11f: lload 5
      // 121: lxor
      // 122: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 12a: iload 9
      // 12c: i2c
      // 12d: iload 10
      // 12f: iload 11
      // 131: i2s
      // 132: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 135: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 138: ifeq 14e
      // 13b: aload 4
      // 13d: invokeinterface java/lang/Runnable.run ()V 1
      // 142: aload 13
      // 144: ifnull 179
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 3
      // 14f: aload 15
      // 151: sipush 10684
      // 154: ldc2_w 5325823233255145807
      // 157: lload 5
      // 159: lxor
      // 15a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 162: iload 9
      // 164: i2c
      // 165: iload 10
      // 167: iload 11
      // 169: i2s
      // 16a: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 16d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 172: goto 179
      // 175: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: return
      // try (106 -> 108): 109 java/lang/reflect/InvocationTargetException
      // try (89 -> 92): 93 java/lang/reflect/InvocationTargetException
      // try (76 -> 78): 79 java/lang/reflect/InvocationTargetException
      // try (46 -> 48): 49 java/lang/reflect/InvocationTargetException
      // try (57 -> 112): 112 java/io/UncheckedIOException
      // try (122 -> 124): 125 java/lang/reflect/InvocationTargetException
      // try (128 -> 152): 153 java/io/UncheckedIOException
      // try (148 -> 170): 171 java/io/UncheckedIOException
   }

   private void lambda$getScript_Inner20(long param1, Consumer param3, IBreezeInterface4 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 69318352163068
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 92867490973888
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 3777264816191
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 9
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 10
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 11
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 44821368035401
      // 037: lxor
      // 038: lstore 12
      // 03a: pop2
      // 03b: aload 0
      // 03c: sipush 401
      // 03f: ldc2_w 2562900152965785617
      // 042: lload 5
      // 044: lxor
      // 045: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04d: ldc2_w 3416887862448618038
      // 050: lload 5
      // 052: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 055: dup_x2
      // 056: pop
      // 057: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05a: checkcast java/net/HttpURLConnection
      // 05d: goto 064
      // 060: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 063: athrow
      // 064: astore 14
      // 066: new rip/breeze/client/UserTheme
      // 069: dup
      // 06a: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 06d: astore 15
      // 06f: aload 15
      // 071: lload 7
      // 073: sipush 24399
      // 076: ldc2_w 35292286956746422
      // 079: lload 5
      // 07b: lxor
      // 07c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: lload 1
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 088: aload 0
      // 089: aload 14
      // 08b: aload 15
      // 08d: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 090: ldc2_w 3420346948686761129
      // 093: lload 5
      // 095: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 098: dup_x2
      // 099: pop
      // 09a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09d: pop
      // 09e: goto 0a5
      // 0a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 14
      // 0a8: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ab: ldc2_w 3416696441192530382
      // 0ae: lload 5
      // 0b0: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b8: checkcast java/lang/Integer
      // 0bb: invokevirtual java/lang/Integer.intValue ()I
      // 0be: goto 0c5
      // 0c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: sipush 200
      // 0c8: if_icmpeq 0ec
      // 0cb: aload 0
      // 0cc: aload 14
      // 0ce: aload 3
      // 0cf: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d2: ldc2_w 3418832395773096021
      // 0d5: lload 5
      // 0d7: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0df: pop
      // 0e0: goto 0e7
      // 0e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: return
      // 0e8: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: aload 14
      // 0ef: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f2: ldc2_w 3416479343685521266
      // 0f5: lload 5
      // 0f7: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: checkcast rip/breeze/client/UserTheme
      // 102: goto 109
      // 105: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 108: athrow
      // 109: astore 16
      // 10b: sipush 24471
      // 10e: ldc2_w 1784436103275361846
      // 111: lload 5
      // 113: lxor
      // 114: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 16
      // 11b: sipush 2653
      // 11e: ldc2_w 7191110430352106308
      // 121: lload 5
      // 123: lxor
      // 124: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 12c: iload 9
      // 12e: i2c
      // 12f: iload 10
      // 131: iload 11
      // 133: i2s
      // 134: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 137: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13a: ifne 166
      // 13d: aload 3
      // 13e: aload 16
      // 140: sipush 10684
      // 143: ldc2_w 5325843121909579797
      // 146: lload 5
      // 148: lxor
      // 149: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 151: iload 9
      // 153: i2c
      // 154: iload 10
      // 156: iload 11
      // 158: i2s
      // 159: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 15c: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 161: return
      // 162: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 16
      // 168: sipush 21907
      // 16b: ldc2_w 1266509843206028305
      // 16e: lload 5
      // 170: lxor
      // 171: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 179: lload 12
      // 17b: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 17e: astore 17
      // 180: aload 17
      // 182: sipush 26757
      // 185: ldc2_w 783184916300071291
      // 188: lload 5
      // 18a: lxor
      // 18b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: invokevirtual rip/breeze/client/UserTheme.isValid (Ljava/lang/String;)Z
      // 193: ifeq 1dc
      // 196: aload 17
      // 198: sipush 26757
      // 19b: ldc2_w 783184916300071291
      // 19e: lload 5
      // 1a0: lxor
      // 1a1: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1a9: invokevirtual rip/breeze/client/PlayerUtil8.isValid_2 ()Z
      // 1ac: ifeq 1dc
      // 1af: goto 1b6
      // 1b2: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: new rip/breeze/UserInfo
      // 1b9: dup
      // 1ba: aload 17
      // 1bc: sipush 26757
      // 1bf: ldc2_w 783184916300071291
      // 1c2: lload 5
      // 1c4: lxor
      // 1c5: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1cd: lload 12
      // 1cf: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1d2: invokespecial rip/breeze/UserInfo.<init> (Lrip/breeze/client/UserTheme;)V
      // 1d5: goto 1dd
      // 1d8: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: aconst_null
      // 1dd: astore 18
      // 1df: aload 4
      // 1e1: aload 16
      // 1e3: sipush 2832
      // 1e6: ldc2_w 1337452783101567702
      // 1e9: lload 5
      // 1eb: lxor
      // 1ec: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1f4: iload 9
      // 1f6: i2c
      // 1f7: iload 10
      // 1f9: iload 11
      // 1fb: i2s
      // 1fc: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1ff: new rip/breeze/StringDecryptHelper2
      // 202: dup
      // 203: aload 17
      // 205: invokespecial rip/breeze/StringDecryptHelper2.<init> (Lrip/breeze/client/UserTheme;)V
      // 208: aload 18
      // 20a: invokeinterface rip/breeze/IBreezeInterface4.apply (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V 4
      // 20f: return
      // try (108 -> 110): 111 java/lang/reflect/InvocationTargetException
      // try (91 -> 94): 95 java/lang/reflect/InvocationTargetException
      // try (78 -> 80): 81 java/lang/reflect/InvocationTargetException
      // try (49 -> 51): 52 java/lang/reflect/InvocationTargetException
      // try (59 -> 114): 114 java/io/UncheckedIOException
      // try (124 -> 126): 127 java/lang/reflect/InvocationTargetException
      // try (130 -> 166): 166 java/io/UncheckedIOException
      // try (178 -> 195): 196 java/io/UncheckedIOException
      // try (186 -> 211): 211 java/io/UncheckedIOException
   }

   private void lambda$updateScript_Inner19(
      long param1, String param3, String param4, boolean param5, boolean param6, String param7, Consumer param8, Consumer param9
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 75330136349088
      // 006: lxor
      // 007: lstore 10
      // 009: lload 10
      // 00b: dup2
      // 00c: ldc2_w 52768505774492
      // 00f: lxor
      // 010: lstore 12
      // 012: dup2
      // 013: ldc2_w 132934392764771
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 14
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 15
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 16
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 65816211521355
      // 037: lxor
      // 038: lstore 17
      // 03a: dup2
      // 03b: ldc2_w 25348662515845
      // 03e: lxor
      // 03f: lstore 19
      // 041: dup2
      // 042: ldc2_w 91583944659221
      // 045: lxor
      // 046: lstore 21
      // 048: pop2
      // 049: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 04c: aload 0
      // 04d: sipush 25135
      // 050: ldc2_w 1399710097348575972
      // 053: lload 10
      // 055: lxor
      // 056: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05e: ldc2_w 7365429245617812330
      // 061: lload 10
      // 063: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 066: dup_x2
      // 067: pop
      // 068: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06b: checkcast java/net/HttpURLConnection
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: astore 23
      // 077: astore 24
      // 079: new rip/breeze/client/UserTheme
      // 07c: dup
      // 07d: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 080: astore 25
      // 082: aload 25
      // 084: lload 12
      // 086: sipush 24399
      // 089: ldc2_w 35212605704077290
      // 08c: lload 10
      // 08e: lxor
      // 08f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: lload 1
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 09b: aload 25
      // 09d: sipush 31969
      // 0a0: ldc2_w 4906452496858504273
      // 0a3: lload 10
      // 0a5: lxor
      // 0a6: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: aload 3
      // 0ac: lload 17
      // 0ae: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0b1: aload 25
      // 0b3: sipush 11286
      // 0b6: ldc2_w 8015035076555934801
      // 0b9: lload 10
      // 0bb: lxor
      // 0bc: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: aload 4
      // 0c3: lload 17
      // 0c5: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0c8: aload 25
      // 0ca: sipush 7625
      // 0cd: ldc2_w 6973113792763018607
      // 0d0: lload 10
      // 0d2: lxor
      // 0d3: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: iload 5
      // 0da: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0dd: lload 19
      // 0df: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0e2: aload 25
      // 0e4: sipush 14507
      // 0e7: ldc2_w 4041158426143496207
      // 0ea: lload 10
      // 0ec: lxor
      // 0ed: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: iload 6
      // 0f4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f7: lload 19
      // 0f9: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0fc: aload 25
      // 0fe: sipush 2832
      // 101: ldc2_w 1337548955015523210
      // 104: lload 10
      // 106: lxor
      // 107: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: aload 7
      // 10e: lload 17
      // 110: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 113: aload 0
      // 114: aload 23
      // 116: aload 25
      // 118: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 11b: ldc2_w 7362251681802061301
      // 11e: lload 10
      // 120: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 123: dup_x2
      // 124: pop
      // 125: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 128: pop
      // 129: goto 130
      // 12c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 0
      // 131: aload 23
      // 133: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 136: ldc2_w 7365338981713184914
      // 139: lload 10
      // 13b: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 13e: dup_x2
      // 13f: pop
      // 140: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 143: checkcast java/lang/Integer
      // 146: invokevirtual java/lang/Integer.intValue ()I
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: sipush 200
      // 153: if_icmpeq 178
      // 156: aload 0
      // 157: aload 23
      // 159: aload 8
      // 15b: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 15e: ldc2_w 7362921925215156489
      // 161: lload 10
      // 163: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 166: dup_x2
      // 167: pop
      // 168: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16b: pop
      // 16c: goto 173
      // 16f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 172: athrow
      // 173: return
      // 174: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 0
      // 179: aload 23
      // 17b: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 17e: ldc2_w 7365002037296137774
      // 181: lload 10
      // 183: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 186: dup_x2
      // 187: pop
      // 188: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18b: checkcast rip/breeze/client/UserTheme
      // 18e: goto 195
      // 191: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 194: athrow
      // 195: astore 26
      // 197: sipush 24471
      // 19a: ldc2_w 1784530076048129898
      // 19d: lload 10
      // 19f: lxor
      // 1a0: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: aload 26
      // 1a7: sipush 2653
      // 1aa: ldc2_w 7190998865267075608
      // 1ad: lload 10
      // 1af: lxor
      // 1b0: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1b8: iload 14
      // 1ba: i2c
      // 1bb: iload 15
      // 1bd: iload 16
      // 1bf: i2s
      // 1c0: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c6: ifeq 1fb
      // 1c9: aload 9
      // 1cb: new rip/breeze/StringDecryptHelper2
      // 1ce: dup
      // 1cf: aload 26
      // 1d1: sipush 2832
      // 1d4: ldc2_w 1337548955015523210
      // 1d7: lload 10
      // 1d9: lxor
      // 1da: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1e2: lload 21
      // 1e4: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1e7: invokespecial rip/breeze/StringDecryptHelper2.<init> (Lrip/breeze/client/UserTheme;)V
      // 1ea: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1ef: aload 24
      // 1f1: ifnull 227
      // 1f4: goto 1fb
      // 1f7: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: aload 8
      // 1fd: aload 26
      // 1ff: sipush 10684
      // 202: ldc2_w 5325868927218452809
      // 205: lload 10
      // 207: lxor
      // 208: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 210: iload 14
      // 212: i2c
      // 213: iload 15
      // 215: iload 16
      // 217: i2s
      // 218: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 21b: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 220: goto 227
      // 223: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: return
      // try (165 -> 167): 168 java/lang/reflect/InvocationTargetException
      // try (148 -> 151): 152 java/lang/reflect/InvocationTargetException
      // try (135 -> 137): 138 java/lang/reflect/InvocationTargetException
      // try (58 -> 60): 61 java/lang/reflect/InvocationTargetException
      // try (69 -> 171): 171 java/io/UncheckedIOException
      // try (181 -> 183): 184 java/lang/reflect/InvocationTargetException
      // try (187 -> 223): 224 java/io/UncheckedIOException
      // try (207 -> 241): 242 java/io/UncheckedIOException
   }

   private void lambda$uploadScript_Inner18(
      String param1, String param2, String param3, boolean param4, boolean param5, String param6, Consumer param7, Consumer param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 113800075121190
      // 006: lxor
      // 007: lstore 9
      // 009: lload 9
      // 00b: dup2
      // 00c: ldc2_w 101035822240485
      // 00f: lxor
      // 010: dup2
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 11
      // 017: dup2
      // 018: bipush 16
      // 01a: lshl
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 12
      // 021: dup2
      // 022: bipush 48
      // 024: lshl
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 13
      // 02b: pop2
      // 02c: dup2
      // 02d: ldc2_w 27346205766861
      // 030: lxor
      // 031: lstore 14
      // 033: dup2
      // 034: ldc2_w 57238979826435
      // 037: lxor
      // 038: lstore 16
      // 03a: dup2
      // 03b: ldc2_w 123456745380499
      // 03e: lxor
      // 03f: lstore 18
      // 041: pop2
      // 042: aload 0
      // 043: sipush 22491
      // 046: ldc2_w 2992183882082024667
      // 049: lload 9
      // 04b: lxor
      // 04c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 054: ldc2_w 7904206448670521580
      // 057: lload 9
      // 059: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 061: checkcast java/net/HttpURLConnection
      // 064: goto 06b
      // 067: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: astore 20
      // 06d: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 070: new rip/breeze/client/UserTheme
      // 073: dup
      // 074: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 077: astore 21
      // 079: aload 21
      // 07b: sipush 11932
      // 07e: ldc2_w 8526796215822812571
      // 081: lload 9
      // 083: lxor
      // 084: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: aload 1
      // 08a: lload 14
      // 08c: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 08f: aload 21
      // 091: sipush 11867
      // 094: ldc2_w 671570997809972547
      // 097: lload 9
      // 099: lxor
      // 09a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: aload 2
      // 0a0: lload 14
      // 0a2: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0a5: aload 21
      // 0a7: sipush 7101
      // 0aa: ldc2_w 2146575022221766788
      // 0ad: lload 9
      // 0af: lxor
      // 0b0: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 3
      // 0b6: lload 14
      // 0b8: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0bb: astore 22
      // 0bd: aload 21
      // 0bf: sipush 19934
      // 0c2: ldc2_w 8371218283026441908
      // 0c5: lload 9
      // 0c7: lxor
      // 0c8: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: iload 4
      // 0cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d2: lload 16
      // 0d4: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0d7: aload 21
      // 0d9: sipush 18316
      // 0dc: ldc2_w 8361948118341709041
      // 0df: lload 9
      // 0e1: lxor
      // 0e2: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: iload 5
      // 0e9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ec: lload 16
      // 0ee: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0f1: aload 21
      // 0f3: sipush 11834
      // 0f6: ldc2_w 9147979824868230407
      // 0f9: lload 9
      // 0fb: lxor
      // 0fc: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: aload 6
      // 103: lload 14
      // 105: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 108: aload 0
      // 109: aload 20
      // 10b: aload 21
      // 10d: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 110: ldc2_w 7903214705749823091
      // 113: lload 9
      // 115: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 118: dup_x2
      // 119: pop
      // 11a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 11d: pop
      // 11e: goto 125
      // 121: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 0
      // 126: aload 20
      // 128: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12b: ldc2_w 7904050188431590164
      // 12e: lload 9
      // 130: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 133: dup_x2
      // 134: pop
      // 135: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 138: checkcast java/lang/Integer
      // 13b: invokevirtual java/lang/Integer.intValue ()I
      // 13e: goto 145
      // 141: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 144: athrow
      // 145: sipush 200
      // 148: if_icmpeq 16d
      // 14b: aload 0
      // 14c: aload 20
      // 14e: aload 7
      // 150: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 153: ldc2_w 7901699102699385487
      // 156: lload 9
      // 158: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 160: pop
      // 161: goto 168
      // 164: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 167: athrow
      // 168: return
      // 169: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 0
      // 16e: aload 20
      // 170: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 173: ldc2_w 7904834771511512488
      // 176: lload 9
      // 178: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 180: checkcast rip/breeze/client/UserTheme
      // 183: goto 18a
      // 186: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 189: athrow
      // 18a: astore 23
      // 18c: sipush 20721
      // 18f: ldc2_w 714619850306255762
      // 192: lload 9
      // 194: lxor
      // 195: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: aload 23
      // 19c: sipush 8318
      // 19f: ldc2_w 5164500336203729678
      // 1a2: lload 9
      // 1a4: lxor
      // 1a5: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1ad: iload 11
      // 1af: i2c
      // 1b0: iload 12
      // 1b2: iload 13
      // 1b4: i2s
      // 1b5: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bb: ifeq 1f0
      // 1be: aload 8
      // 1c0: new rip/breeze/StringDecryptHelper2
      // 1c3: dup
      // 1c4: aload 23
      // 1c6: sipush 2832
      // 1c9: ldc2_w 1337514882855870476
      // 1cc: lload 9
      // 1ce: lxor
      // 1cf: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1d7: lload 18
      // 1d9: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1dc: invokespecial rip/breeze/StringDecryptHelper2.<init> (Lrip/breeze/client/UserTheme;)V
      // 1df: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1e4: aload 22
      // 1e6: ifnull 21c
      // 1e9: goto 1f0
      // 1ec: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: aload 7
      // 1f2: aload 23
      // 1f4: sipush 20685
      // 1f7: ldc2_w 6966519407982836730
      // 1fa: lload 9
      // 1fc: lxor
      // 1fd: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 205: iload 11
      // 207: i2c
      // 208: iload 12
      // 20a: iload 13
      // 20c: i2s
      // 20d: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 210: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 215: goto 21c
      // 218: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: return
      // try (160 -> 162): 163 java/lang/reflect/InvocationTargetException
      // try (143 -> 146): 147 java/lang/reflect/InvocationTargetException
      // try (130 -> 132): 133 java/lang/reflect/InvocationTargetException
      // try (53 -> 55): 56 java/lang/reflect/InvocationTargetException
      // try (92 -> 166): 166 java/io/UncheckedIOException
      // try (176 -> 178): 179 java/lang/reflect/InvocationTargetException
      // try (182 -> 218): 219 java/io/UncheckedIOException
      // try (202 -> 236): 237 java/io/UncheckedIOException
   }

   private void lambda$deleteConfig_Inner17(long param1, Consumer param3, Runnable param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 26415742670355
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 126973980118575
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 40005434316496
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 9
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 10
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 11
      // 032: pop2
      // 033: pop2
      // 034: aload 0
      // 035: sipush 11241
      // 038: ldc2_w 8762629574121014449
      // 03b: lload 5
      // 03d: lxor
      // 03e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 046: ldc2_w -6231822564065051431
      // 049: lload 5
      // 04b: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 04e: dup_x2
      // 04f: pop
      // 050: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 053: checkcast java/net/HttpURLConnection
      // 056: goto 05d
      // 059: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: astore 12
      // 05f: new rip/breeze/client/UserTheme
      // 062: dup
      // 063: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 066: astore 13
      // 068: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 06b: aload 13
      // 06d: lload 7
      // 06f: sipush 24399
      // 072: ldc2_w 35260414089146457
      // 075: lload 5
      // 077: lxor
      // 078: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: lload 1
      // 07e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 081: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 084: astore 14
      // 086: aload 0
      // 087: aload 12
      // 089: aload 13
      // 08b: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w -6226045749962716602
      // 091: lload 5
      // 093: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 096: dup_x2
      // 097: pop
      // 098: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: aload 12
      // 0a6: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a9: ldc2_w -6231385107351222495
      // 0ac: lload 5
      // 0ae: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: checkcast java/lang/Integer
      // 0b9: invokevirtual java/lang/Integer.intValue ()I
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: sipush 200
      // 0c6: if_icmpeq 0ea
      // 0c9: aload 0
      // 0ca: aload 12
      // 0cc: aload 3
      // 0cd: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d0: ldc2_w -6224811420696725830
      // 0d3: lload 5
      // 0d5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0dd: pop
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: return
      // 0e6: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: aload 12
      // 0ed: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f0: ldc2_w -6231043644629890659
      // 0f3: lload 5
      // 0f5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: checkcast rip/breeze/client/UserTheme
      // 100: goto 107
      // 103: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 106: athrow
      // 107: astore 15
      // 109: sipush 24471
      // 10c: ldc2_w 1784463543738347737
      // 10f: lload 5
      // 111: lxor
      // 112: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: aload 15
      // 119: sipush 2653
      // 11c: ldc2_w 7191074168090846635
      // 11f: lload 5
      // 121: lxor
      // 122: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 12a: iload 9
      // 12c: i2c
      // 12d: iload 10
      // 12f: iload 11
      // 131: i2s
      // 132: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 135: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 138: ifeq 14e
      // 13b: aload 4
      // 13d: invokeinterface java/lang/Runnable.run ()V 1
      // 142: aload 14
      // 144: ifnull 179
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 3
      // 14f: aload 15
      // 151: sipush 10684
      // 154: ldc2_w 5325811223304095482
      // 157: lload 5
      // 159: lxor
      // 15a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 162: iload 9
      // 164: i2c
      // 165: iload 10
      // 167: iload 11
      // 169: i2s
      // 16a: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 16d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 172: goto 179
      // 175: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: return
      // try (106 -> 108): 109 java/lang/reflect/InvocationTargetException
      // try (89 -> 92): 93 java/lang/reflect/InvocationTargetException
      // try (76 -> 78): 79 java/lang/reflect/InvocationTargetException
      // try (45 -> 47): 48 java/lang/reflect/InvocationTargetException
      // try (67 -> 112): 112 java/io/UncheckedIOException
      // try (122 -> 124): 125 java/lang/reflect/InvocationTargetException
      // try (128 -> 152): 153 java/io/UncheckedIOException
      // try (148 -> 170): 171 java/io/UncheckedIOException
   }

   private void lambda$updateConfig_Inner16(long param1, String param3, String param4, boolean param5, UserTheme param6, Consumer param7, Consumer param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 117909121786311
      // 006: lxor
      // 007: lstore 9
      // 009: lload 9
      // 00b: dup2
      // 00c: ldc2_w 282685585915
      // 00f: lxor
      // 010: lstore 11
      // 012: dup2
      // 013: ldc2_w 96038725034244
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 13
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 14
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 15
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 22419573901100
      // 037: lxor
      // 038: lstore 16
      // 03a: dup2
      // 03b: ldc2_w 62337211113698
      // 03e: lxor
      // 03f: lstore 18
      // 041: dup2
      // 042: ldc2_w 51580020303484
      // 045: lxor
      // 046: lstore 20
      // 048: dup2
      // 049: ldc2_w 137389513664882
      // 04c: lxor
      // 04d: lstore 22
      // 04f: pop2
      // 050: aload 0
      // 051: sipush 31170
      // 054: ldc2_w 1300655859559768349
      // 057: lload 9
      // 059: lxor
      // 05a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 062: ldc2_w 2184366078258825997
      // 065: lload 9
      // 067: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06f: checkcast java/net/HttpURLConnection
      // 072: goto 079
      // 075: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 078: athrow
      // 079: astore 24
      // 07b: new rip/breeze/client/UserTheme
      // 07e: dup
      // 07f: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 082: astore 25
      // 084: aload 25
      // 086: lload 11
      // 088: sipush 24399
      // 08b: ldc2_w 35243824499263373
      // 08e: lload 9
      // 090: lxor
      // 091: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 1
      // 097: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09a: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 09d: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0a0: aload 25
      // 0a2: sipush 31969
      // 0a5: ldc2_w 4906415827252749366
      // 0a8: lload 9
      // 0aa: lxor
      // 0ab: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 3
      // 0b1: lload 16
      // 0b3: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0b6: astore 26
      // 0b8: aload 25
      // 0ba: sipush 11286
      // 0bd: ldc2_w 8015053082951742518
      // 0c0: lload 9
      // 0c2: lxor
      // 0c3: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: aload 4
      // 0ca: lload 16
      // 0cc: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0cf: aload 25
      // 0d1: sipush 7625
      // 0d4: ldc2_w 6973073826771977480
      // 0d7: lload 9
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: iload 5
      // 0e1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e4: lload 18
      // 0e6: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0e9: aload 25
      // 0eb: sipush 17280
      // 0ee: ldc2_w 2385947047584799614
      // 0f1: lload 9
      // 0f3: lxor
      // 0f4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: lload 20
      // 0fb: aload 6
      // 0fd: invokevirtual rip/breeze/client/UserTheme.processNullable (Ljava/lang/String;JLrip/breeze/client/PlayerUtil8;)V
      // 100: aload 0
      // 101: aload 24
      // 103: aload 25
      // 105: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 108: ldc2_w 2183356701476978066
      // 10b: lload 9
      // 10d: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 110: dup_x2
      // 111: pop
      // 112: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 115: pop
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 0
      // 11e: aload 24
      // 120: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 123: ldc2_w 2184773001379016949
      // 126: lload 9
      // 128: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 130: checkcast java/lang/Integer
      // 133: invokevirtual java/lang/Integer.intValue ()I
      // 136: goto 13d
      // 139: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: sipush 200
      // 140: if_icmpeq 165
      // 143: aload 0
      // 144: aload 24
      // 146: aload 7
      // 148: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 14b: ldc2_w 2182404983209001326
      // 14e: lload 9
      // 150: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 153: dup_x2
      // 154: pop
      // 155: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 158: pop
      // 159: goto 160
      // 15c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15f: athrow
      // 160: return
      // 161: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 164: athrow
      // 165: aload 0
      // 166: aload 24
      // 168: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 16b: ldc2_w 2184969208440684105
      // 16e: lload 9
      // 170: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 173: dup_x2
      // 174: pop
      // 175: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 178: checkcast rip/breeze/client/UserTheme
      // 17b: goto 182
      // 17e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 181: athrow
      // 182: astore 27
      // 184: sipush 24471
      // 187: ldc2_w 1784484392875067149
      // 18a: lload 9
      // 18c: lxor
      // 18d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: aload 27
      // 194: sipush 2653
      // 197: ldc2_w 7191018120959382143
      // 19a: lload 9
      // 19c: lxor
      // 19d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1a5: iload 13
      // 1a7: i2c
      // 1a8: iload 14
      // 1aa: iload 15
      // 1ac: i2s
      // 1ad: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b3: ifeq 1e8
      // 1b6: aload 8
      // 1b8: new rip/breeze/StringDecryptHelper
      // 1bb: dup
      // 1bc: aload 27
      // 1be: sipush 17280
      // 1c1: ldc2_w 2385947047584799614
      // 1c4: lload 9
      // 1c6: lxor
      // 1c7: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1cf: lload 22
      // 1d1: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1d4: invokespecial rip/breeze/StringDecryptHelper.<init> (Lrip/breeze/client/UserTheme;)V
      // 1d7: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1dc: aload 26
      // 1de: ifnull 214
      // 1e1: goto 1e8
      // 1e4: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e7: athrow
      // 1e8: aload 7
      // 1ea: aload 27
      // 1ec: sipush 10684
      // 1ef: ldc2_w 5325900380594303278
      // 1f2: lload 9
      // 1f4: lxor
      // 1f5: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1fd: iload 13
      // 1ff: i2c
      // 200: iload 14
      // 202: iload 15
      // 204: i2s
      // 205: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 208: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 20d: goto 214
      // 210: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: return
      // try (159 -> 161): 162 java/lang/reflect/InvocationTargetException
      // try (142 -> 145): 146 java/lang/reflect/InvocationTargetException
      // try (129 -> 131): 132 java/lang/reflect/InvocationTargetException
      // try (61 -> 63): 64 java/lang/reflect/InvocationTargetException
      // try (92 -> 165): 165 java/io/UncheckedIOException
      // try (175 -> 177): 178 java/lang/reflect/InvocationTargetException
      // try (181 -> 217): 218 java/io/UncheckedIOException
      // try (201 -> 235): 236 java/io/UncheckedIOException
   }

   private void lambda$uploadConfig_Inner15(String param1, String param2, String param3, boolean param4, UserTheme param5, Consumer param6, Consumer param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 64385629710454
      // 006: lxor
      // 007: lstore 8
      // 009: lload 8
      // 00b: dup2
      // 00c: ldc2_w 7606048434357
      // 00f: lxor
      // 010: dup2
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 10
      // 017: dup2
      // 018: bipush 16
      // 01a: lshl
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 11
      // 021: dup2
      // 022: bipush 48
      // 024: lshl
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 12
      // 02b: pop2
      // 02c: dup2
      // 02d: ldc2_w 76767699832477
      // 030: lxor
      // 031: lstore 13
      // 033: dup2
      // 034: ldc2_w 115449435302227
      // 037: lxor
      // 038: lstore 15
      // 03a: dup2
      // 03b: ldc2_w 140029910200269
      // 03e: lxor
      // 03f: lstore 17
      // 041: dup2
      // 042: ldc2_w 49780095967427
      // 045: lxor
      // 046: lstore 19
      // 048: pop2
      // 049: aload 0
      // 04a: sipush 23296
      // 04d: ldc2_w 510027059206261287
      // 050: lload 8
      // 052: lxor
      // 053: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05b: ldc2_w -7502648512065027396
      // 05e: lload 8
      // 060: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 063: dup_x2
      // 064: pop
      // 065: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 068: checkcast java/net/HttpURLConnection
      // 06b: goto 072
      // 06e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 071: athrow
      // 072: astore 21
      // 074: new rip/breeze/client/UserTheme
      // 077: dup
      // 078: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 07b: astore 22
      // 07d: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 080: aload 22
      // 082: sipush 3499
      // 085: ldc2_w 4394988380578765998
      // 088: lload 8
      // 08a: lxor
      // 08b: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: aload 1
      // 091: lload 13
      // 093: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 096: astore 23
      // 098: aload 22
      // 09a: sipush 31969
      // 09d: ldc2_w 4906467839948795271
      // 0a0: lload 8
      // 0a2: lxor
      // 0a3: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: aload 2
      // 0a9: lload 13
      // 0ab: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0ae: aload 22
      // 0b0: sipush 11286
      // 0b3: ldc2_w 8015107585411349895
      // 0b6: lload 8
      // 0b8: lxor
      // 0b9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: aload 3
      // 0bf: lload 13
      // 0c1: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0c4: aload 22
      // 0c6: sipush 7625
      // 0c9: ldc2_w 6972984002484817081
      // 0cc: lload 8
      // 0ce: lxor
      // 0cf: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: iload 4
      // 0d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d9: lload 15
      // 0db: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0de: aload 22
      // 0e0: sipush 17280
      // 0e3: ldc2_w 2386001259362030287
      // 0e6: lload 8
      // 0e8: lxor
      // 0e9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: lload 17
      // 0f0: aload 5
      // 0f2: invokevirtual rip/breeze/client/UserTheme.processNullable (Ljava/lang/String;JLrip/breeze/client/PlayerUtil8;)V
      // 0f5: aload 0
      // 0f6: aload 21
      // 0f8: aload 22
      // 0fa: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fd: ldc2_w -7494685873745202141
      // 100: lload 8
      // 102: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 105: dup_x2
      // 106: pop
      // 107: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10a: pop
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 0
      // 113: aload 21
      // 115: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 118: ldc2_w -7502839980699879100
      // 11b: lload 8
      // 11d: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 120: dup_x2
      // 121: pop
      // 122: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 125: checkcast java/lang/Integer
      // 128: invokevirtual java/lang/Integer.intValue ()I
      // 12b: goto 132
      // 12e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 131: athrow
      // 132: sipush 200
      // 135: if_icmpeq 15a
      // 138: aload 0
      // 139: aload 21
      // 13b: aload 6
      // 13d: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 140: ldc2_w -7496201486809921313
      // 143: lload 8
      // 145: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 148: dup_x2
      // 149: pop
      // 14a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14d: pop
      // 14e: goto 155
      // 151: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 154: athrow
      // 155: return
      // 156: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: aload 0
      // 15b: aload 21
      // 15d: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 160: ldc2_w -7501941065725609992
      // 163: lload 8
      // 165: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 168: dup_x2
      // 169: pop
      // 16a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16d: checkcast rip/breeze/client/UserTheme
      // 170: goto 177
      // 173: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 176: athrow
      // 177: astore 24
      // 179: sipush 24471
      // 17c: ldc2_w 1784431144285736636
      // 17f: lload 8
      // 181: lxor
      // 182: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: aload 24
      // 189: sipush 2653
      // 18c: ldc2_w 7191106571108735950
      // 18f: lload 8
      // 191: lxor
      // 192: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 19a: iload 10
      // 19c: i2c
      // 19d: iload 11
      // 19f: iload 12
      // 1a1: i2s
      // 1a2: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1a5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a8: ifeq 1dd
      // 1ab: aload 7
      // 1ad: new rip/breeze/StringDecryptHelper
      // 1b0: dup
      // 1b1: aload 24
      // 1b3: sipush 17280
      // 1b6: ldc2_w 2386001259362030287
      // 1b9: lload 8
      // 1bb: lxor
      // 1bc: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1c4: lload 19
      // 1c6: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 1c9: invokespecial rip/breeze/StringDecryptHelper.<init> (Lrip/breeze/client/UserTheme;)V
      // 1cc: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1d1: aload 23
      // 1d3: ifnull 209
      // 1d6: goto 1dd
      // 1d9: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: aload 6
      // 1df: aload 24
      // 1e1: sipush 10684
      // 1e4: ldc2_w 5325849192792815775
      // 1e7: lload 8
      // 1e9: lxor
      // 1ea: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1f2: iload 10
      // 1f4: i2c
      // 1f5: iload 11
      // 1f7: iload 12
      // 1f9: i2s
      // 1fa: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1fd: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 202: goto 209
      // 205: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: return
      // try (154 -> 156): 157 java/lang/reflect/InvocationTargetException
      // try (137 -> 140): 141 java/lang/reflect/InvocationTargetException
      // try (124 -> 126): 127 java/lang/reflect/InvocationTargetException
      // try (57 -> 59): 60 java/lang/reflect/InvocationTargetException
      // try (78 -> 160): 160 java/io/UncheckedIOException
      // try (170 -> 172): 173 java/lang/reflect/InvocationTargetException
      // try (176 -> 212): 213 java/io/UncheckedIOException
      // try (196 -> 230): 231 java/io/UncheckedIOException
   }

   private void lambda$updateTheme_Inner14(ImageUtil18 param1, long param2, boolean param4, Consumer param5, Consumer param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 93697097302302
      // 006: lxor
      // 007: lstore 7
      // 009: lload 7
      // 00b: dup2
      // 00c: ldc2_w 68489767147810
      // 00f: lxor
      // 010: lstore 9
      // 012: dup2
      // 013: ldc2_w 115807744246237
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 11
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 12
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 13
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 46628914292725
      // 037: lxor
      // 038: lstore 14
      // 03a: dup2
      // 03b: ldc2_w 7393084784699
      // 03e: lxor
      // 03f: lstore 16
      // 041: dup2
      // 042: ldc2_w 18563883320997
      // 045: lxor
      // 046: lstore 18
      // 048: dup2
      // 049: ldc2_w 73663660034475
      // 04c: lxor
      // 04d: lstore 20
      // 04f: pop2
      // 050: aload 0
      // 051: sipush 21564
      // 054: ldc2_w 7297034961625279587
      // 057: lload 7
      // 059: lxor
      // 05a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 062: ldc2_w 9117910543773314004
      // 065: lload 7
      // 067: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06f: checkcast java/net/HttpURLConnection
      // 072: goto 079
      // 075: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 078: athrow
      // 079: astore 22
      // 07b: aload 0
      // 07c: aload 1
      // 07d: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 080: ldc2_w 9118315340792237198
      // 083: lload 7
      // 085: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 088: dup_x2
      // 089: pop
      // 08a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 08d: checkcast [B
      // 090: goto 097
      // 093: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 096: athrow
      // 097: astore 23
      // 099: new rip/breeze/client/UserTheme
      // 09c: dup
      // 09d: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 0a0: astore 24
      // 0a2: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0a5: aload 24
      // 0a7: lload 9
      // 0a9: sipush 24399
      // 0ac: ldc2_w 35193275600889684
      // 0af: lload 7
      // 0b1: lxor
      // 0b2: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: lload 2
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 0be: astore 25
      // 0c0: aload 24
      // 0c2: sipush 14870
      // 0c5: ldc2_w 6471365798257623558
      // 0c8: lload 7
      // 0ca: lxor
      // 0cb: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: aload 1
      // 0d1: invokevirtual rip/breeze/ImageUtil18.toString ()Ljava/lang/String;
      // 0d4: lload 14
      // 0d6: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0d9: aload 24
      // 0db: sipush 7625
      // 0de: ldc2_w 6973098036074587601
      // 0e1: lload 7
      // 0e3: lxor
      // 0e4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: iload 4
      // 0eb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ee: lload 16
      // 0f0: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0f3: aload 24
      // 0f5: sipush 21907
      // 0f8: ldc2_w 1266604139755269619
      // 0fb: lload 7
      // 0fd: lxor
      // 0fe: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: aload 1
      // 104: invokevirtual rip/breeze/ImageUtil18.getUserTheme ()Lrip/breeze/client/UserTheme;
      // 107: lload 18
      // 109: dup2_x1
      // 10a: pop2
      // 10b: invokevirtual rip/breeze/client/UserTheme.processNullable (Ljava/lang/String;JLrip/breeze/client/PlayerUtil8;)V
      // 10e: aload 23
      // 110: ifnull 137
      // 113: aload 24
      // 115: sipush 20962
      // 118: ldc2_w 6801819870985808261
      // 11b: lload 7
      // 11d: lxor
      // 11e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: invokestatic java/util/Base64.getEncoder ()Ljava/util/Base64$Encoder;
      // 126: aload 23
      // 128: invokevirtual java/util/Base64$Encoder.encodeToString ([B)Ljava/lang/String;
      // 12b: lload 14
      // 12d: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 130: goto 137
      // 133: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: aload 0
      // 138: aload 22
      // 13a: aload 24
      // 13c: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 13f: ldc2_w 9121453156371438923
      // 142: lload 7
      // 144: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 147: dup_x2
      // 148: pop
      // 149: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14c: pop
      // 14d: goto 154
      // 150: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 0
      // 155: aload 22
      // 157: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 15a: ldc2_w 9117785331585585196
      // 15d: lload 7
      // 15f: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 162: dup_x2
      // 163: pop
      // 164: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 167: checkcast java/lang/Integer
      // 16a: invokevirtual java/lang/Integer.intValue ()I
      // 16d: goto 174
      // 170: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 173: athrow
      // 174: sipush 200
      // 177: if_icmpeq 19c
      // 17a: aload 0
      // 17b: aload 22
      // 17d: aload 5
      // 17f: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 182: ldc2_w 9119872600562295223
      // 185: lload 7
      // 187: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18f: pop
      // 190: goto 197
      // 193: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 196: athrow
      // 197: return
      // 198: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 0
      // 19d: aload 22
      // 19f: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a2: ldc2_w 9118575249282539152
      // 1a5: lload 7
      // 1a7: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1af: checkcast rip/breeze/client/UserTheme
      // 1b2: goto 1b9
      // 1b5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: astore 26
      // 1bb: sipush 24471
      // 1be: ldc2_w 1784548133769734100
      // 1c1: lload 7
      // 1c3: lxor
      // 1c4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: aload 26
      // 1cb: sipush 2653
      // 1ce: ldc2_w 7191015961985299110
      // 1d1: lload 7
      // 1d3: lxor
      // 1d4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1dc: iload 11
      // 1de: i2c
      // 1df: iload 12
      // 1e1: iload 13
      // 1e3: i2s
      // 1e4: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1e7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ea: ifeq 21f
      // 1ed: aload 6
      // 1ef: new rip/breeze/StringDecryptHelper3
      // 1f2: dup
      // 1f3: aload 26
      // 1f5: sipush 10392
      // 1f8: ldc2_w 8671453746429923540
      // 1fb: lload 7
      // 1fd: lxor
      // 1fe: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 206: lload 20
      // 208: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 20b: invokespecial rip/breeze/StringDecryptHelper3.<init> (Lrip/breeze/client/UserTheme;)V
      // 20e: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 213: aload 25
      // 215: ifnull 24b
      // 218: goto 21f
      // 21b: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 5
      // 221: aload 26
      // 223: sipush 10684
      // 226: ldc2_w 5325884958652404215
      // 229: lload 7
      // 22b: lxor
      // 22c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 234: iload 11
      // 236: i2c
      // 237: iload 12
      // 239: iload 13
      // 23b: i2s
      // 23c: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 23f: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 244: goto 24b
      // 247: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: return
      // try (75 -> 77): 78 java/lang/reflect/InvocationTargetException
      // try (61 -> 63): 64 java/lang/reflect/InvocationTargetException
      // try (97 -> 142): 143 java/io/UncheckedIOException
      // try (184 -> 186): 187 java/lang/reflect/InvocationTargetException
      // try (167 -> 170): 171 java/lang/reflect/InvocationTargetException
      // try (154 -> 156): 157 java/lang/reflect/InvocationTargetException
      // try (145 -> 190): 190 java/io/UncheckedIOException
      // try (200 -> 202): 203 java/lang/reflect/InvocationTargetException
      // try (206 -> 242): 243 java/io/UncheckedIOException
      // try (226 -> 260): 261 java/io/UncheckedIOException
   }

   private void lambda$deleteTheme_Inner13(long param1, Consumer param3, Runnable param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 64604934201674
      // 006: lxor
      // 007: lstore 5
      // 009: lload 5
      // 00b: dup2
      // 00c: ldc2_w 89880917522806
      // 00f: lxor
      // 010: lstore 7
      // 012: dup2
      // 013: ldc2_w 7310493720969
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 9
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 10
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 11
      // 032: pop2
      // 033: pop2
      // 034: aload 0
      // 035: sipush 795
      // 038: ldc2_w 8753558901196348263
      // 03b: lload 5
      // 03d: lxor
      // 03e: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 046: ldc2_w -6999371583081854080
      // 049: lload 5
      // 04b: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 04e: dup_x2
      // 04f: pop
      // 050: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 053: checkcast java/net/HttpURLConnection
      // 056: goto 05d
      // 059: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: astore 12
      // 05f: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 062: new rip/breeze/client/UserTheme
      // 065: dup
      // 066: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 069: astore 13
      // 06b: astore 14
      // 06d: aload 13
      // 06f: lload 7
      // 071: sipush 24399
      // 074: ldc2_w 35298637793232640
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 086: aload 0
      // 087: aload 12
      // 089: aload 13
      // 08b: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w -7007171502102119137
      // 091: lload 5
      // 093: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 096: dup_x2
      // 097: pop
      // 098: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: aload 12
      // 0a6: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a9: ldc2_w -6999563010377650056
      // 0ac: lload 5
      // 0ae: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: checkcast java/lang/Integer
      // 0b9: invokevirtual java/lang/Integer.intValue ()I
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: sipush 200
      // 0c6: if_icmpeq 0ea
      // 0c9: aload 0
      // 0ca: aload 12
      // 0cc: aload 3
      // 0cd: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d0: ldc2_w -7006435287995678237
      // 0d3: lload 5
      // 0d5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0dd: pop
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: return
      // 0e6: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: aload 12
      // 0ed: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f0: ldc2_w -6998664095403376956
      // 0f3: lload 5
      // 0f5: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: checkcast rip/breeze/client/UserTheme
      // 100: goto 107
      // 103: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 106: athrow
      // 107: astore 15
      // 109: sipush 24471
      // 10c: ldc2_w 1784431398505580416
      // 10f: lload 5
      // 111: lxor
      // 112: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: aload 15
      // 119: sipush 2653
      // 11c: ldc2_w 7191106347492496114
      // 11f: lload 5
      // 121: lxor
      // 122: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 12a: iload 9
      // 12c: i2c
      // 12d: iload 10
      // 12f: iload 11
      // 131: i2s
      // 132: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 135: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 138: ifeq 14e
      // 13b: aload 4
      // 13d: invokeinterface java/lang/Runnable.run ()V 1
      // 142: aload 14
      // 144: ifnull 179
      // 147: goto 14e
      // 14a: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: aload 3
      // 14f: aload 15
      // 151: sipush 10684
      // 154: ldc2_w 5325849415851078051
      // 157: lload 5
      // 159: lxor
      // 15a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 162: iload 9
      // 164: i2c
      // 165: iload 10
      // 167: iload 11
      // 169: i2s
      // 16a: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 16d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 172: goto 179
      // 175: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: return
      // try (106 -> 108): 109 java/lang/reflect/InvocationTargetException
      // try (89 -> 92): 93 java/lang/reflect/InvocationTargetException
      // try (76 -> 78): 79 java/lang/reflect/InvocationTargetException
      // try (45 -> 47): 48 java/lang/reflect/InvocationTargetException
      // try (57 -> 112): 112 java/io/UncheckedIOException
      // try (122 -> 124): 125 java/lang/reflect/InvocationTargetException
      // try (128 -> 152): 153 java/io/UncheckedIOException
      // try (148 -> 170): 171 java/io/UncheckedIOException
   }

   private void lambda$uploadTheme_Inner12(ImageUtil18 param1, String param2, boolean param3, Consumer param4, Consumer param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 44327930556052
      // 006: lxor
      // 007: lstore 6
      // 009: lload 6
      // 00b: dup2
      // 00c: ldc2_w 22217862360663
      // 00f: lxor
      // 010: dup2
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 8
      // 017: dup2
      // 018: bipush 16
      // 01a: lshl
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 9
      // 021: dup2
      // 022: bipush 48
      // 024: lshl
      // 025: bipush 48
      // 027: lushr
      // 028: l2i
      // 029: istore 10
      // 02b: pop2
      // 02c: dup2
      // 02d: ldc2_w 95725348259967
      // 030: lxor
      // 031: lstore 11
      // 033: dup2
      // 034: ldc2_w 136194462527409
      // 037: lxor
      // 038: lstore 13
      // 03a: dup2
      // 03b: ldc2_w 120419425560879
      // 03e: lxor
      // 03f: lstore 15
      // 041: dup2
      // 042: ldc2_w 69923157337633
      // 045: lxor
      // 046: lstore 17
      // 048: pop2
      // 049: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 04c: aload 0
      // 04d: sipush 31812
      // 050: ldc2_w 7764783128876887037
      // 053: lload 6
      // 055: lxor
      // 056: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05e: ldc2_w 1225874323506185310
      // 061: lload 6
      // 063: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 066: dup_x2
      // 067: pop
      // 068: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06b: checkcast java/net/HttpURLConnection
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: astore 19
      // 077: astore 20
      // 079: aload 0
      // 07a: aload 1
      // 07b: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07e: ldc2_w 1225188120699659012
      // 081: lload 6
      // 083: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 086: dup_x2
      // 087: pop
      // 088: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 08b: checkcast [B
      // 08e: goto 095
      // 091: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 094: athrow
      // 095: astore 21
      // 097: new rip/breeze/client/UserTheme
      // 09a: dup
      // 09b: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 09e: astore 22
      // 0a0: aload 22
      // 0a2: sipush 3499
      // 0a5: ldc2_w 4395003593686932044
      // 0a8: lload 6
      // 0aa: lxor
      // 0ab: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 2
      // 0b1: lload 11
      // 0b3: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0b6: aload 22
      // 0b8: sipush 9586
      // 0bb: ldc2_w 5820309882978202330
      // 0be: lload 6
      // 0c0: lxor
      // 0c1: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: aload 1
      // 0c7: invokevirtual rip/breeze/ImageUtil18.toString ()Ljava/lang/String;
      // 0ca: lload 11
      // 0cc: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0cf: aload 22
      // 0d1: sipush 7625
      // 0d4: ldc2_w 6973004746840689243
      // 0d7: lload 6
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: iload 3
      // 0e0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e3: lload 13
      // 0e5: invokevirtual rip/breeze/client/UserTheme.update_1 (Ljava/lang/String;Ljava/lang/Boolean;J)V
      // 0e8: aload 22
      // 0ea: sipush 26903
      // 0ed: ldc2_w 8271399172014718676
      // 0f0: lload 6
      // 0f2: lxor
      // 0f3: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: aload 1
      // 0f9: invokevirtual rip/breeze/ImageUtil18.getUserTheme ()Lrip/breeze/client/UserTheme;
      // 0fc: lload 15
      // 0fe: dup2_x1
      // 0ff: pop2
      // 100: invokevirtual rip/breeze/client/UserTheme.processNullable (Ljava/lang/String;JLrip/breeze/client/PlayerUtil8;)V
      // 103: aload 21
      // 105: ifnull 12c
      // 108: aload 22
      // 10a: sipush 29722
      // 10d: ldc2_w 471605281424745417
      // 110: lload 6
      // 112: lxor
      // 113: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokestatic java/util/Base64.getEncoder ()Ljava/util/Base64$Encoder;
      // 11b: aload 21
      // 11d: invokevirtual java/util/Base64$Encoder.encodeToString ([B)Ljava/lang/String;
      // 120: lload 11
      // 122: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 125: goto 12c
      // 128: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: aload 0
      // 12d: aload 19
      // 12f: aload 22
      // 131: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 134: ldc2_w 1233867783047803585
      // 137: lload 6
      // 139: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 13c: dup_x2
      // 13d: pop
      // 13e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 141: pop
      // 142: goto 149
      // 145: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 148: athrow
      // 149: aload 0
      // 14a: aload 19
      // 14c: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14f: ldc2_w 1225713658778320806
      // 152: lload 6
      // 154: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 157: dup_x2
      // 158: pop
      // 159: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 15c: checkcast java/lang/Integer
      // 15f: invokevirtual java/lang/Integer.intValue ()I
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: sipush 200
      // 16c: if_icmpeq 191
      // 16f: aload 0
      // 170: aload 19
      // 172: aload 4
      // 174: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 177: ldc2_w 1232357546609282621
      // 17a: lload 6
      // 17c: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 17f: dup_x2
      // 180: pop
      // 181: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 184: pop
      // 185: goto 18c
      // 188: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18b: athrow
      // 18c: return
      // 18d: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 0
      // 192: aload 19
      // 194: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 197: ldc2_w 1225492051279868186
      // 19a: lload 6
      // 19c: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 19f: dup_x2
      // 1a0: pop
      // 1a1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a4: checkcast rip/breeze/client/UserTheme
      // 1a7: goto 1ae
      // 1aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: astore 23
      // 1b0: sipush 24471
      // 1b3: ldc2_w 1784411121484040286
      // 1b6: lload 6
      // 1b8: lxor
      // 1b9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: aload 23
      // 1c0: sipush 2653
      // 1c3: ldc2_w 7191091427390151980
      // 1c6: lload 6
      // 1c8: lxor
      // 1c9: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1d1: iload 8
      // 1d3: i2c
      // 1d4: iload 9
      // 1d6: iload 10
      // 1d8: i2s
      // 1d9: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1df: ifeq 214
      // 1e2: aload 5
      // 1e4: new rip/breeze/StringDecryptHelper3
      // 1e7: dup
      // 1e8: aload 23
      // 1ea: sipush 21668
      // 1ed: ldc2_w 8316448171631903557
      // 1f0: lload 6
      // 1f2: lxor
      // 1f3: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1fb: lload 17
      // 1fd: invokevirtual rip/breeze/client/PlayerUtil8.getUserTheme (J)Lrip/breeze/client/UserTheme;
      // 200: invokespecial rip/breeze/StringDecryptHelper3.<init> (Lrip/breeze/client/UserTheme;)V
      // 203: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 208: aload 20
      // 20a: ifnull 240
      // 20d: goto 214
      // 210: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: aload 4
      // 216: aload 23
      // 218: sipush 10684
      // 21b: ldc2_w 5325828998057229949
      // 21e: lload 6
      // 220: lxor
      // 221: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 229: iload 8
      // 22b: i2c
      // 22c: iload 9
      // 22e: iload 10
      // 230: i2s
      // 231: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 234: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 239: goto 240
      // 23c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23f: athrow
      // 240: return
      // try (73 -> 75): 76 java/lang/reflect/InvocationTargetException
      // try (58 -> 60): 61 java/lang/reflect/InvocationTargetException
      // try (83 -> 137): 138 java/io/UncheckedIOException
      // try (179 -> 181): 182 java/lang/reflect/InvocationTargetException
      // try (162 -> 165): 166 java/lang/reflect/InvocationTargetException
      // try (149 -> 151): 152 java/lang/reflect/InvocationTargetException
      // try (140 -> 185): 185 java/io/UncheckedIOException
      // try (195 -> 197): 198 java/lang/reflect/InvocationTargetException
      // try (201 -> 237): 238 java/io/UncheckedIOException
      // try (221 -> 255): 256 java/io/UncheckedIOException
   }

   private void lambda$regenerateShareCode_Inner11(long param1, RenderUtil19_x param3, Consumer param4, Consumer param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 21461109618917
      // 006: lxor
      // 007: lstore 6
      // 009: lload 6
      // 00b: dup2
      // 00c: ldc2_w 133014195462361
      // 00f: lxor
      // 010: lstore 8
      // 012: dup2
      // 013: ldc2_w 52642685810726
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 10
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 11
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 12
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 119691615690254
      // 037: lxor
      // 038: lstore 13
      // 03a: pop2
      // 03b: aload 0
      // 03c: sipush 21752
      // 03f: ldc2_w 5605005066732525046
      // 042: lload 6
      // 044: lxor
      // 045: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04d: ldc2_w 5148201409887769135
      // 050: lload 6
      // 052: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 055: dup_x2
      // 056: pop
      // 057: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05a: checkcast java/net/HttpURLConnection
      // 05d: goto 064
      // 060: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 063: athrow
      // 064: astore 15
      // 066: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 069: new rip/breeze/client/UserTheme
      // 06c: dup
      // 06d: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 070: astore 16
      // 072: aload 16
      // 074: lload 8
      // 076: sipush 12750
      // 079: ldc2_w 5301444247236587536
      // 07c: lload 6
      // 07e: lxor
      // 07f: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: lload 1
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 08b: aload 16
      // 08d: sipush 514
      // 090: ldc2_w 4590716850216600458
      // 093: lload 6
      // 095: lxor
      // 096: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 3
      // 09c: invokevirtual rip/breeze/RenderUtil19_x.getString_a ()Ljava/lang/String;
      // 09f: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0a2: lload 13
      // 0a4: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0a7: astore 17
      // 0a9: aload 0
      // 0aa: aload 15
      // 0ac: aload 16
      // 0ae: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b1: ldc2_w 5147244810251379888
      // 0b4: lload 6
      // 0b6: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0b9: dup_x2
      // 0ba: pop
      // 0bb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0be: pop
      // 0bf: goto 0c6
      // 0c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aload 15
      // 0c9: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0cc: ldc2_w 5148643242904791511
      // 0cf: lload 6
      // 0d1: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0d4: dup_x2
      // 0d5: pop
      // 0d6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d9: checkcast java/lang/Integer
      // 0dc: invokevirtual java/lang/Integer.intValue ()I
      // 0df: goto 0e6
      // 0e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: sipush 200
      // 0e9: if_icmpeq 10e
      // 0ec: aload 0
      // 0ed: aload 15
      // 0ef: aload 4
      // 0f1: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f4: ldc2_w 5146221829231630412
      // 0f7: lload 6
      // 0f9: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 101: pop
      // 102: goto 109
      // 105: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 108: athrow
      // 109: return
      // 10a: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 0
      // 10f: aload 15
      // 111: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 114: ldc2_w 5147870917795555179
      // 117: lload 6
      // 119: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 121: checkcast rip/breeze/client/UserTheme
      // 124: goto 12b
      // 127: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: astore 18
      // 12d: sipush 24471
      // 130: ldc2_w 1784476181258395183
      // 133: lload 6
      // 135: lxor
      // 136: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 18
      // 13d: sipush 2653
      // 140: ldc2_w 7191079109872520029
      // 143: lload 6
      // 145: lxor
      // 146: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 14e: iload 10
      // 150: i2c
      // 151: iload 11
      // 153: iload 12
      // 155: i2s
      // 156: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 159: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15c: ifeq 190
      // 15f: aload 5
      // 161: aload 18
      // 163: sipush 32355
      // 166: ldc2_w 4393140108622790618
      // 169: lload 6
      // 16b: lxor
      // 16c: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 174: iload 10
      // 176: i2c
      // 177: iload 11
      // 179: iload 12
      // 17b: i2s
      // 17c: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 17f: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 184: aload 17
      // 186: ifnull 1bc
      // 189: goto 190
      // 18c: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: aload 4
      // 192: aload 18
      // 194: sipush 10684
      // 197: ldc2_w 5325821662609909772
      // 19a: lload 6
      // 19c: lxor
      // 19d: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1a5: iload 10
      // 1a7: i2c
      // 1a8: iload 11
      // 1aa: iload 12
      // 1ac: i2s
      // 1ad: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 1b0: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 1b5: goto 1bc
      // 1b8: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: return
      // try (121 -> 123): 124 java/lang/reflect/InvocationTargetException
      // try (104 -> 107): 108 java/lang/reflect/InvocationTargetException
      // try (91 -> 93): 94 java/lang/reflect/InvocationTargetException
      // try (49 -> 51): 52 java/lang/reflect/InvocationTargetException
      // try (82 -> 127): 127 java/io/UncheckedIOException
      // try (137 -> 139): 140 java/lang/reflect/InvocationTargetException
      // try (143 -> 180): 181 java/io/UncheckedIOException
      // try (163 -> 198): 199 java/io/UncheckedIOException
   }

   private void lambda$saveConfig_Inner10(UserTheme var1) {
      long var2 = 59085049326355L;
      long var4 = var2 ^ 124292670409899L;
      long var6 = var2 ^ 105156333130540L;
      short var10001 = 22755;
      long var10002 = 6443575277564228970L ^ var2;
      Object[] var20 = rip.breeze.client.MathUtil8.buildArgs1("save-data/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7710193438832967261L, var2);
      Object[] var29 = var20;
      CloudAuthService var21 = this;
      Method var10000 = var10003;

      try {
         var15 = (HttpURLConnection)var10000.invoke(var21, var29);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      HttpURLConnection var8 = var15;
      UserTheme var9 = new UserTheme();

      try {
         var10001 = 17280;
         var10002 = 2386036405802855982L ^ var2;
         var9.processNullable("config", var6, var1);
         short var31 = 11286;
         long var35 = 8015071545184780646L ^ var2;
         var9.runCloudJob(var4, "version", Util140.enum_LEGACY_f.getInt_a());
         Object[] var23 = rip.breeze.client.MathUtil8.buildArgs2(var8, var9);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(7718226452623689922L, var2);
         Object[] var32 = var23;
         CloudAuthService var24 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var24, var32);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         Object[] var25 = rip.breeze.client.MathUtil8.buildArgs1(var8);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(7710635570349147557L, var2);
         Object[] var33 = var25;
         CloudAuthService var26 = this;
         var10000 = var10003;

         try {
            var18 = (Integer)var10000.invoke(var26, var33);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         if (var18 != 200) {
            Object[] var27 = rip.breeze.client.MathUtil8.buildArgs2(var8, System.out::println);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(7717204444426761278L, var2);
            Object[] var34 = var27;
            CloudAuthService var28 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var28, var34);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }
      } catch (UncheckedIOException var13) {
         throw getThrowable(var13);
      }
   }

   private void lambda$registerDownload_Inner9(long var1, RenderUtil19_x var3) {
      long var4 = 62022258791467L;
      long var6 = var4 ^ 137298387907475L;
      long var8 = var4 ^ 115437484444996L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1("register-download/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1456934001942708581L, var4);
      Object[] var10002 = var10001;
      CloudAuthService var18 = this;
      Method var10000 = var10003;

      try {
         var15 = (HttpURLConnection)var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      HttpURLConnection var10 = var15;
      UserTheme var11 = new UserTheme();
      var11.runCloudJob(var6, "object-id", var1);
      var11.update("kind", var3.getString_a().toLowerCase(), var8);
      var10001 = rip.breeze.client.MathUtil8.buildArgs2(var10, var11);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(1451473841266948090L, var4);
      var10002 = var10001;
      CloudAuthService var20 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var20, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var10001 = rip.breeze.client.MathUtil8.buildArgs1(var10);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(1457376165671172765L, var4);
      var10002 = var10001;
      CloudAuthService var22 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var22, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   private void lambda$setTheme_Inner8(long var1) {
      long var3 = 48016541523665L;
      long var5 = var3 ^ 122167458085225L;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1("set-theme/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-7007035860597519457L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var19 = this;
      Method var10000 = var10003;

      try {
         var14 = (HttpURLConnection)var10000.invoke(var19, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      HttpURLConnection var7 = var14;
      UserTheme var8 = new UserTheme();

      try {
         var8.runCloudJob(var5, "theme", var1);
         var10001 = rip.breeze.client.MathUtil8.buildArgs2(var7, var8);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-6998954427945157376L, var3);
         var10002 = var10001;
         CloudAuthService var21 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var21, var10002);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var10001 = rip.breeze.client.MathUtil8.buildArgs1(var7);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-7006562919536005017L, var3);
         var10002 = var10001;
         CloudAuthService var23 = this;
         var10000 = var10003;

         try {
            var17 = (Integer)var10000.invoke(var23, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         if (var17 != 200) {
            var10001 = rip.breeze.client.MathUtil8.buildArgs2(var7, System.out::println);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(-6999971949395213828L, var3);
            var10002 = var10001;
            CloudAuthService var25 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var25, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }
      } catch (UncheckedIOException var12) {
         throw getThrowable(var12);
      }
   }

   private void lambda$bookmarkItem_Inner7(long var1, RenderUtil19_x var3, boolean var4) {
      long var5 = 58189489050601L;
      long var7 = var5 ^ 123538841580625L;
      long var9 = var5 ^ 110473121237638L;
      String var10001 = rip.breeze.client.MathUtil8.buildArgs1("bookmark/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1439495215430551207L, var5);
      String var10002 = var10001;
      CloudAuthService var25 = this;
      Method var10000 = var10003;

      try {
         var19 = (HttpURLConnection)var10000.invoke(var25, var10002);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      HttpURLConnection var11 = var19;
      UserTheme var12 = new UserTheme();

      label55: {
         try {
            var12.runCloudJob(var7, "object-id", var1);
            var12.update("kind", var3.getString_a().toLowerCase(), var9);
            var20 = var12;
            var10001 = "action";
            if (var4) {
               var10002 = "add";
               break label55;
            }
         } catch (UncheckedIOException var18) {
            throw getThrowable(var18);
         }

         var10002 = "remove";
      }

      try {
         var20.update(var10001, var10002, var9);
         Object[] var27 = rip.breeze.client.MathUtil8.buildArgs2(var11, var12);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(1434017426027835448L, var5);
         Object[] var34 = var27;
         CloudAuthService var28 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var28, var34);
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Object[] var29 = rip.breeze.client.MathUtil8.buildArgs1(var11);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(1439937342786010463L, var5);
         Object[] var35 = var29;
         CloudAuthService var30 = this;
         var10000 = var10003;

         try {
            var23 = (Integer)var10000.invoke(var30, var35);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (var23 != 200) {
            Object[] var31 = rip.breeze.client.MathUtil8.buildArgs2(var11, System.out::println);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(1432995559717473476L, var5);
            Object[] var36 = var31;
            CloudAuthService var32 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var32, var36);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }
         }
      } catch (UncheckedIOException var16) {
         throw getThrowable(var16);
      }
   }

   private void lambda$getReviews_Inner6(long var1, RenderUtil19_x var3, int var4, Consumer var5, RenderUtil24 var6, BiConsumer var7) {
      long var8 = 81175708950794L;
      long var10 = var8 ^ 14722516403890L;
      long var10001 = var8 ^ 99483406097997L;
      int var12 = (int)((var8 ^ 99483406097997L) >>> 48);
      int var13 = (int)((var8 ^ 99483406097997L) << 16 >>> 32);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var8 ^ 27771220719717L;
      long var17 = var8 ^ 4131498122647L;
      long var19 = var8 ^ 125165919508027L;
      Object[] var45 = rip.breeze.client.MathUtil8.buildArgs1("get-reviews/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2226642446727236540L, var8);
      Object[] var10002 = var45;
      CloudAuthService var46 = this;
      Method var10000 = var10003;

      try {
         var38 = (HttpURLConnection)var10000.invoke(var46, var10002);
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      HttpURLConnection var21 = var38;
      UserTheme var22 = new UserTheme();
      int[] var39 = values();
      var22.runCloudJob(var10, "object-id", var1);
      var22.update("kind", var3.getString_a().toLowerCase(), var15);
      var22.runCloudJob(var10, "offset", var4);
      var22.runCloudJob(var10, "limit", 20);
      var10002 = rip.breeze.client.MathUtil8.buildArgs2(var21, var22);
      Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(-2232137830648053029L, var8);
      Object[] var59 = var10002;
      CloudAuthService var55 = this;
      Method var47 = var10004;

      try {
         var47.invoke(var55, var59);
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      int[] var23 = var39;

      try {
         Object[] var48 = rip.breeze.client.MathUtil8.buildArgs1(var21);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2226798730990022724L, var8);
         var10002 = var48;
         CloudAuthService var49 = this;
         var10000 = var10003;

         try {
            var41 = (Integer)var10000.invoke(var49, var10002);
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         if (var41 != 200) {
            Object[] var52 = rip.breeze.client.MathUtil8.buildArgs2(var21, var5);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2233652481656291801L, var8);
            var10002 = var52;
            CloudAuthService var53 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var53, var10002);
               return;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }
         }
      } catch (Exception var37) {
         throw getThrowable(var37);
      }

      Object[] var50 = rip.breeze.client.MathUtil8.buildArgs1(var21);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2226013203143982848L, var8);
      var10002 = var50;
      CloudAuthService var51 = this;
      var10000 = var10003;

      try {
         var43 = (UserTheme)var10000.invoke(var51, var10002);
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      UserTheme var24 = var43;

      try {
         if (!"success"
            .equals(var24.getDataBuilder2_2("status").buildString((char)var12, var13, (short)var14))) {
            var5.accept(var24.getDataBuilder2_2("message").buildString((char)var12, var13, (short)var14));
            return;
         }
      } catch (Exception var36) {
         throw getThrowable(var36);
      }

      BreezeIterable var25 = var24.getBreezeIterable("reviews");
      int var26 = var24.getDataBuilder2_2("total").getValue(var17);
      ArrayList var27 = new ArrayList(var25.getValue());
      int var28 = 0;

      while (var28 < var25.getValue()) {
         try {
            var27.add(new RenderUtil46(var6, new Util142(var25.getDataBuilder2(var28).getUserTheme(var19))));
         } catch (Exception var31) {
         }

         var28++;
         if (var23 != null) {
            break;
         }
      }

      var7.accept(var27, var26);
   }

   private void lambda$deleteReview_Inner5(long var1, RenderUtil19_x var3, Consumer var4) {
      long var5 = 46357072385310L;
      long var7 = var5 ^ 121627899769510L;
      long var10001 = var5 ^ 63254676777561L;
      int var9 = (int)((var5 ^ 63254676777561L) >>> 48);
      int var10 = (int)((var5 ^ 63254676777561L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 134950357568625L;
      Object[] var31 = rip.breeze.client.MathUtil8.buildArgs1("delete-review/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1516872500344701008L, var5);
      Object[] var10002 = var31;
      CloudAuthService var32 = this;
      Method var10000 = var10003;

      try {
         var24 = (HttpURLConnection)var10000.invoke(var32, var10002);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      HttpURLConnection var14 = var24;
      UserTheme var15 = new UserTheme();

      try {
         var15.runCloudJob(var7, "object-id", var1);
         var15.update("kind", var3.getString_a().toLowerCase(), var12);
         Object[] var33 = rip.breeze.client.MathUtil8.buildArgs2(var14, var15);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(1518198531408393935L, var5);
         var10002 = var33;
         CloudAuthService var34 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var34, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         Object[] var35 = rip.breeze.client.MathUtil8.buildArgs1(var14);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(1516782506485119912L, var5);
         var10002 = var35;
         CloudAuthService var36 = this;
         var10000 = var10003;

         try {
            var27 = (Integer)var10000.invoke(var36, var10002);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         if (var27 != 200) {
            Object[] var39 = rip.breeze.client.MathUtil8.buildArgs2(var14, var4);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(1518868779636492851L, var5);
            var10002 = var39;
            CloudAuthService var40 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var40, var10002);
               return;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }
         }
      } catch (UncheckedIOException var23) {
         throw getThrowable(var23);
      }

      Object[] var37 = rip.breeze.client.MathUtil8.buildArgs1(var14);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(1517712199472706836L, var5);
      var10002 = var37;
      CloudAuthService var38 = this;
      var10000 = var10003;

      try {
         var29 = (UserTheme)var10000.invoke(var38, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      UserTheme var16 = var29;

      try {
         if (!"success"
            .equals(var16.getDataBuilder2_2("status").buildString((char)var9, var10, (short)var11))) {
            var4.accept(var16.getDataBuilder2_2("message").buildString((char)var9, var10, (short)var11));
         }
      } catch (UncheckedIOException var18) {
         throw getThrowable(var18);
      }
   }

   private void lambda$addReview_Inner4(long param1, RenderUtil19_x param3, int param4, String param5, Consumer param6, BiConsumer param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/CloudAuthService.52548406476676L J
      // 003: ldc2_w 36990552213903
      // 006: lxor
      // 007: lstore 8
      // 009: lload 8
      // 00b: dup2
      // 00c: ldc2_w 82298061443507
      // 00f: lxor
      // 010: lstore 10
      // 012: dup2
      // 013: ldc2_w 32712920353100
      // 016: lxor
      // 017: dup2
      // 018: bipush 48
      // 01a: lushr
      // 01b: l2i
      // 01c: istore 12
      // 01e: dup2
      // 01f: bipush 16
      // 021: lshl
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 13
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 14
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 104434903641956
      // 037: lxor
      // 038: lstore 15
      // 03a: dup2
      // 03b: ldc2_w 75297899793046
      // 03e: lxor
      // 03f: lstore 17
      // 041: dup2
      // 042: ldc2_w 136989208313464
      // 045: lxor
      // 046: lstore 19
      // 048: pop2
      // 049: aload 0
      // 04a: sipush 9038
      // 04d: ldc2_w 3552935164985906093
      // 050: lload 8
      // 052: lxor
      // 053: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05b: ldc2_w 8509595234419581765
      // 05e: lload 8
      // 060: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 063: dup_x2
      // 064: pop
      // 065: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 068: checkcast java/net/HttpURLConnection
      // 06b: goto 072
      // 06e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 071: athrow
      // 072: astore 21
      // 074: new rip/breeze/client/UserTheme
      // 077: dup
      // 078: invokespecial rip/breeze/client/UserTheme.<init> ()V
      // 07b: astore 22
      // 07d: aload 22
      // 07f: lload 10
      // 081: sipush 13615
      // 084: ldc2_w 2174436253212673506
      // 087: lload 8
      // 089: lxor
      // 08a: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: lload 1
      // 090: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 093: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 096: aload 22
      // 098: sipush 15255
      // 09b: ldc2_w 4076160894436412412
      // 09e: lload 8
      // 0a0: lxor
      // 0a1: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: aload 3
      // 0a7: invokevirtual rip/breeze/RenderUtil19_x.getString_a ()Ljava/lang/String;
      // 0aa: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0ad: lload 15
      // 0af: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0b2: invokestatic rip/breeze/CloudAuthService.values ()[I
      // 0b5: aload 22
      // 0b7: lload 10
      // 0b9: sipush 22918
      // 0bc: ldc2_w 8438168345549040100
      // 0bf: lload 8
      // 0c1: lxor
      // 0c2: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: iload 4
      // 0c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cc: invokevirtual rip/breeze/client/UserTheme.runCloudJob (JLjava/lang/String;Ljava/lang/Number;)V
      // 0cf: aload 22
      // 0d1: sipush 10684
      // 0d4: ldc2_w 5325837194363443558
      // 0d7: lload 8
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: aload 5
      // 0e1: lload 15
      // 0e3: invokevirtual rip/breeze/client/UserTheme.update (Ljava/lang/String;Ljava/lang/String;J)V
      // 0e6: aload 0
      // 0e7: aload 21
      // 0e9: aload 22
      // 0eb: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ee: ldc2_w 8504095454851012058
      // 0f1: lload 8
      // 0f3: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fb: pop
      // 0fc: goto 103
      // 0ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 102: athrow
      // 103: astore 23
      // 105: aload 0
      // 106: aload 21
      // 108: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10b: ldc2_w 8509997762176555197
      // 10e: lload 8
      // 110: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 113: dup_x2
      // 114: pop
      // 115: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 118: checkcast java/lang/Integer
      // 11b: invokevirtual java/lang/Integer.intValue ()I
      // 11e: goto 125
      // 121: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 124: athrow
      // 125: sipush 200
      // 128: if_icmpeq 14d
      // 12b: aload 0
      // 12c: aload 21
      // 12e: aload 6
      // 130: invokestatic rip/breeze/client/MathUtil8.buildArgs2 (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 133: ldc2_w 8503147238638184742
      // 136: lload 8
      // 138: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 140: pop
      // 141: goto 148
      // 144: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 147: athrow
      // 148: return
      // 149: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 0
      // 14e: aload 21
      // 150: invokestatic rip/breeze/client/MathUtil8.buildArgs1 (Ljava/lang/Object;)[Ljava/lang/Object;
      // 153: ldc2_w 8510355734879114753
      // 156: lload 8
      // 158: invokestatic rip/breeze/client/MathUtil8.getMethod_3 (JJ)Ljava/lang/reflect/Method;
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 160: checkcast rip/breeze/client/UserTheme
      // 163: goto 16a
      // 166: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 169: athrow
      // 16a: astore 24
      // 16c: sipush 24471
      // 16f: ldc2_w 1784421067119685445
      // 172: lload 8
      // 174: lxor
      // 175: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: aload 24
      // 17c: sipush 2653
      // 17f: ldc2_w 7191099039512148535
      // 182: lload 8
      // 184: lxor
      // 185: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 18d: iload 12
      // 18f: i2c
      // 190: iload 13
      // 192: iload 14
      // 194: i2s
      // 195: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 198: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19b: ifeq 1e7
      // 19e: aload 7
      // 1a0: aload 24
      // 1a2: sipush 8299
      // 1a5: ldc2_w 8656194098151985287
      // 1a8: lload 8
      // 1aa: lxor
      // 1ab: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1b3: lload 19
      // 1b5: invokevirtual rip/breeze/client/PlayerUtil8.getFloat (J)F
      // 1b8: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1bb: aload 24
      // 1bd: sipush 32140
      // 1c0: ldc2_w 6862708328383892973
      // 1c3: lload 8
      // 1c5: lxor
      // 1c6: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1ce: lload 17
      // 1d0: invokevirtual rip/breeze/client/PlayerUtil8.getValue (J)I
      // 1d3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d6: invokeinterface java/util/function/BiConsumer.accept (Ljava/lang/Object;Ljava/lang/Object;)V 3
      // 1db: aload 23
      // 1dd: ifnull 213
      // 1e0: goto 1e7
      // 1e3: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: aload 6
      // 1e9: aload 24
      // 1eb: sipush 10684
      // 1ee: ldc2_w 5325837194363443558
      // 1f1: lload 8
      // 1f3: lxor
      // 1f4: invokedynamic k (IJ)Ljava/lang/String; bsm=rip/breeze/CloudAuthService.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: invokevirtual rip/breeze/client/UserTheme.getDataBuilder2_2 (Ljava/lang/String;)Lrip/breeze/client/PlayerUtil8;
      // 1fc: iload 12
      // 1fe: i2c
      // 1ff: iload 13
      // 201: iload 14
      // 203: i2s
      // 204: invokevirtual rip/breeze/client/PlayerUtil8.buildString (CIS)Ljava/lang/String;
      // 207: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 20c: goto 213
      // 20f: invokestatic rip/breeze/CloudAuthService.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: return
      // try (148 -> 150): 151 java/lang/reflect/InvocationTargetException
      // try (131 -> 134): 135 java/lang/reflect/InvocationTargetException
      // try (117 -> 119): 120 java/lang/reflect/InvocationTargetException
      // try (57 -> 59): 60 java/lang/reflect/InvocationTargetException
      // try (123 -> 154): 154 java/io/UncheckedIOException
      // try (164 -> 166): 167 java/lang/reflect/InvocationTargetException
      // try (170 -> 214): 215 java/io/UncheckedIOException
      // try (190 -> 232): 233 java/io/UncheckedIOException
   }

   private void lambda$getTheme_Inner3(long var1, Consumer var3, IBreezeInterface4 var4) {
      long var5 = 34071650948868L;
      long var7 = var5 ^ 99278298116284L;
      long var10001 = var5 ^ 14646190401603L;
      int var9 = (int)((var5 ^ 14646190401603L) >>> 48);
      int var10 = (int)((var5 ^ 14646190401603L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 42875245469749L;
      short var38 = 32301;
      long var10002 = 49789014760517571L ^ var5;
      Object[] var39 = rip.breeze.client.MathUtil8.buildArgs1("get-theme/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2947826592125484470L, var5);
      Object[] var49 = var39;
      CloudAuthService var40 = this;
      Method var10000 = var10003;

      try {
         var31 = (HttpURLConnection)var10000.invoke(var40, var49);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      HttpURLConnection var14 = var31;
      UserTheme var15 = new UserTheme();

      try {
         short var50 = 24399;
         long var55 = 35303224590257866L ^ var5;
         var15.runCloudJob(var7, "id", var1);
         Object[] var41 = rip.breeze.client.MathUtil8.buildArgs2(var14, var15);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2951109751923133227L, var5);
         Object[] var51 = var41;
         CloudAuthService var42 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var42, var51);
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Object[] var43 = rip.breeze.client.MathUtil8.buildArgs1(var14);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2948022177353320014L, var5);
         Object[] var52 = var43;
         CloudAuthService var44 = this;
         var10000 = var10003;

         try {
            var34 = (Integer)var10000.invoke(var44, var52);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         if (var34 != 200) {
            Object[] var47 = rip.breeze.client.MathUtil8.buildArgs2(var14, var3);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2950368143486629847L, var5);
            Object[] var54 = var47;
            CloudAuthService var48 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var48, var54);
               return;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }
         }
      } catch (Exception var30) {
         throw getThrowable(var30);
      }

      Object[] var45 = rip.breeze.client.MathUtil8.buildArgs1(var14);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2948226209576962290L, var5);
      Object[] var53 = var45;
      CloudAuthService var46 = this;
      var10000 = var10003;

      try {
         var36 = (UserTheme)var10000.invoke(var46, var53);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      UserTheme var16 = var36;

      try {
         if (!"success"
            .equals(var16.getDataBuilder2_2("status").buildString((char)var9, var10, (short)var11))) {
            var3.accept(var16.getDataBuilder2_2("message").buildString((char)var9, var10, (short)var11));
            return;
         }
      } catch (Exception var24) {
         throw getThrowable(var24);
      }

      try {
         var16.runCloudJob(var7, "time", System.currentTimeMillis());
         if (!var16.isValid("data")) {
            var3.accept("Theme not found.");
            return;
         }
      } catch (Exception var29) {
         throw getThrowable(var29);
      }

      String var17 = var16.getDataBuilder2_2("data").buildString((char)var9, var10, (short)var11);

      try {
         ImageUtil18 var18 = ImageUtil18.getDataBuilder41_2(var17);
         UserTheme var19 = var16.getDataBuilder2_2("theme").getUserTheme(var12);
         StringDecryptHelper3 var20 = new StringDecryptHelper3(var19);
         UserInfo var21 = new UserInfo(var19.getDataBuilder2_2("user").getUserTheme(var12));
         var4.apply(var18, var20, var21);
      } catch (Exception var23) {
         var3.accept("Invalid theme.");
      }
   }

   private void lambda$getConfig_Inner2(long var1, Consumer var3, Consumer var4) {
      long var5 = 120203104346793L;
      long var7 = var5 ^ 46063998354705L;
      long var10001 = var5 ^ 139621049228782L;
      int var9 = (int)((var5 ^ 139621049228782L) >>> 48);
      int var10 = (int)((var5 ^ 139621049228782L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      Object[] var29 = rip.breeze.client.MathUtil8.buildArgs1("get-config/");
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2109297629717710873L, var5);
      Object[] var10002 = var29;
      CloudAuthService var30 = this;
      Method var10000 = var10003;

      try {
         var22 = (HttpURLConnection)var10000.invoke(var30, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      HttpURLConnection var12 = var22;
      UserTheme var13 = new UserTheme();

      try {
         var13.runCloudJob(var7, "id", var1);
         Object[] var31 = rip.breeze.client.MathUtil8.buildArgs2(var12, var13);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2114722604159008392L, var5);
         var10002 = var31;
         CloudAuthService var32 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var32, var10002);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         Object[] var33 = rip.breeze.client.MathUtil8.buildArgs1(var12);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2108820571795846113L, var5);
         var10002 = var33;
         CloudAuthService var34 = this;
         var10000 = var10003;

         try {
            var25 = (Integer)var10000.invoke(var34, var10002);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         if (var25 != 200) {
            Object[] var37 = rip.breeze.client.MathUtil8.buildArgs2(var12, var3);
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2115745831588266620L, var5);
            var10002 = var37;
            CloudAuthService var38 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var38, var10002);
               return;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }
         }
      } catch (UncheckedIOException var21) {
         throw getThrowable(var21);
      }

      Object[] var35 = rip.breeze.client.MathUtil8.buildArgs1(var12);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(-2109733772099845469L, var5);
      var10002 = var35;
      CloudAuthService var36 = this;
      var10000 = var10003;

      try {
         var27 = (UserTheme)var10000.invoke(var36, var10002);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      UserTheme var14 = var27;

      try {
         if (!"success"
            .equals(var14.getDataBuilder2_2("status").buildString((char)var9, var10, (short)var11))) {
            var3.accept(var14.getDataBuilder2_2("message").buildString((char)var9, var10, (short)var11));
            return;
         }
      } catch (UncheckedIOException var20) {
         throw getThrowable(var20);
      }

      var4.accept(var14);
   }

   private static Thread lambda$new_Inner1(Runnable var0) {
      long var1 = 68024839374026L;
      short var10003 = 20123;
      long var10004 = 1268989854341172282L ^ var1;
      Thread var3 = new Thread(var0, "breeze-cloud-scheduler");
      var3.setDaemon(true);
      return var3;
   }

   private static Thread lambda$new_Inner0(Runnable var0) {
      long var1 = 140123045181969L;
      short var10003 = 15826;
      long var10004 = 4377881743952822655L ^ var1;
      Thread var3 = new Thread(var0, "breeze-cloud-worker");
      var3.setDaemon(true);
      return var3;
   }

   static {
      initialize_2(null);
      long var0 = 32716437223449L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[148];
      int var5 = 0;
      String var6 = "ÄÀ\u000b\u0098\u001f\u0082L¼jÃ-i*T\u0010\u0005 ÂáoÜgÆ;\u008c\u00974PB\u0003>F\u008cø\u0011f\u0016Ül\u001b\u0000H\u009eo@¹&v:\u0010jðò\\!(¸óÅâO\u0015\u000b(_\u0016\u0010 \u0005\\Ý¡ï\u00adn{\u0094éLè_|Í(MÓårF¾&ÿÊóhNU\u0092ôñ(µ§Ã\u0081*½A5Ö\u0086\b\"Ø\u008b\nëëu\u0007XI#@0v[Þ¶ª´×@¶¬Ù{õüÛ\u000b?\u007f£L\u0017_þ\u0005Þ\u008c\u0087k;W\u000f\u008d9\u0010>ê\bp\u0014Õ\u0090Ø\"=GÜ¸i\u0010®»\t¼u\r\u0006\u0015`xø\u00adÞ]ÎÒ(\u0092iyÞ&\u001cOÚ-\u0083\u0094°5\u0099¢6\u0003hJ\u009cÍäëbîÁ\u008aúÝÓk\u008fÖþd\u0093Éz\u00875\u0010\u0087\r\u0017\u0096Mù^6tì(\u001eÚîüM\u00102*ø=ÞÇ\u0097Ô¶ °\u0090Sqi©\u0010\u0018Üªd³\u0086\u009f\u009b¡\u00ad/\u0080\u0003\u0017u\u0083 ´ù\u0080È¿\u008d½&e\u009eiôÓÄlm\u0098\u0018p\u0099öÝSÜ{uº9p\u0089\u0010Ô\u0018\bã$ji\u0086Æé\u0014\u0097Áhì_iÄ=íJÇÓõ%$\u0010\u009d\b§@\u0080K\u008b'yÌa:»ø§\u0017\u0018\u0014t\u0090Aö\u008e:\u0088\u0085JRôØ\u0086\u009bS²¿\u0019oE]\u009a)(Ïä\"X§kXø«l®NkR\u001fí\u009e\u0015&p\u0010/\u0094ÚH`{Vû1\b¨±\u009a\u0083H\u0018\u0090«Û ã\u001bg Î\u0015\u0097ky¤nÙEþ 8xO¶\u009a4GÁ²È\"&\nc\u0084Ü\u001f\u0010B#´°y4\u007f\u0007)ìµè³ûåæ\u0010ín\u0094\u0004\u0089á\u0090.V\u008c6\u0086\u009a©\u009f¾\u0010¶+\u008f¹\u0006I\u0083wz²>Pã\u0000Lã\u0018\u007fÁ\u0018\u007fk\u0016*|\u0013ë÷O]ð\u0005Ãz]=\u0001\u0098O%6\u0010ª\u008cõºk\u000bKE\u0085²\u0094¿\u008cqÚ\n ßSî\tk\u0019M?tÜ\u0018Ý\u0090\u0096¼\u0090úq3f´Á\u0007e¥\u0084¢Çu\u001b©* S4R\u0090§^Bw\r³\u0091O5\u0081\u0090\u000eÛß\u0006ÕC|û\u0019j\u0091¾\u009c5È°r\u0010ËIb\u001e\u0010¬x\u0095\u0001»Íg\u001e\u0093À\u000f(-\u0011ñR©£\u009b\u0085à!¹¸~×ÔBºÝsºÍ~\u009a´Å+U\u0015ùÒ-ð\u0087$\u008fá\u000f\n\u0006| \u0095¥M_\u001d\u0006\tê!i`U#\u001c¯ÍepèÀïR;\u0017Ï÷äùÒ'©Ç \u009b½{1N®R¢\u009fÀÈb\u000eê\u001c\u009d»lMê\u0098\u008e¾rd§\u008c>0ÉS¾ \u0091®\t\u009bP)\u0017Q+Ñ£\u009dZ\u0018\u008fÿ;i\u0094Q¨\u001bÕ%dLÉÎ¸\rN\u001c\u0018ÀÉ\fÓö³V\u001dE\u0005fÕ\u0002x(T<JxÁê6°\"\u0010{y=£\u009c\u0007A?tOqV®Äïþ\u0010Y¯\u001a\u001f\n»\u008cé»\u0084\u0096\u0015=\u0019y\u0094(ÄL\u0012\\í¹ù+2\u0089(0Æ+ø\"e\u0099eO©%\\FK©ÿWPJs\u0012Qæ,XÍ\u001f\u0010R \u0093V\r\u0090Ò\u009fèB%\u0087(\u001cÊfæx\u0018 hª\u0091Ù»*\u0084\u0011Mi]4dÙ\u0018øß\u0093[RÆ\u0090PÖ\u007fÍ;%íº¯¥O9 4U\u009ah V\u0081nÐ\u0001~RÖMq·ôãm<}yØgõH\u0080«\u0018¯W\u0010f\u001c8ïI\u0018t\bbT\u0085ÆÏ\u009eY\u0005\u009d<\u00ad\u0094ÕÄ¦\u0013ü¡ÍÕ\u009e¥\u0010mÿÀ\u0010p\u0006¥õ\u0003\u0000\u0087|ÍÏEÀ\u0018X\u0080\u0086Ì}óN\\¥ù&gSÿV\u009fR\u008ckI\u001c{ë\u009a(êÂà2\u0088©[©VÎ\bLUbJ\u001f/w¤ìFvpÓ\u009aØ\tnÒ5¥ªÔ\u0002\u001fÀõÀî\u0096\u0010³¦º¢~6\u0097ÝÊ\u0081\u0091¦\u0082ôYù\u0018\u0014ßÍz½Y÷\u009d;\u00074\u0099\u009bap¼G\u0098\u0080Y3ì\u009f\u0088 \b÷Ól\u001bë\n@ÒÅÎ\u0089:\u0010ú\b+¤\u009d+aP\u0003aø5_ Ä úH D\u0090û-=\u00032 m\u0015\u0000«Æ\u0080\u0090[\u009c\u00802#¹\\Q\u001béý\u0082`ü\u009d\u0092ý\u0010b§I\u009bÀ\u007f\u009bHÔ\u0088\u0017j@¤\u0014n B\u0010\u009c XlÃÈ\t\u008d}u\u0099h+Þq\u009c\r~A\u0015ó\u0006\u000b°ÎC\u0003±lß(Q5@.N£ä\u0017U\u0085¡:2\u0007èãÑ\u0002\u001d\u000euò¯Ä\u000f\u0015wÔ¦ë\u0095Ná\\«îADè$\u0010eñÆ@[Ì}ðóÊ®¾,;\u0015¦\u0010\u001eG\u0097\u0011õÔ\u0082UÀ\u0091à/p\u008e*ù ç¬òM[À`\u0012ww}\u008f¶Ï\u0087âz}öäZ\u000eß\u0006ª°Å%qË\u0013®\u0010íì\u009díÃð³\u0010«áÜP\u0093}JR\u00108\u0016(ÔQ*¤¹×\u0004øE\"Þ\u008b^\u0010ò£P\u001bw\u001f¹B\u000e\u0098#\u0096âÎ\u0087Á\u0010â;\u0016\u009b\u0016\u0098\u0083ÒôZ\u0005\f\u008b\u00adRU\u0010î\u000f-íqo>\u0080+8 Ó@óÈÏ\u0010¹#õA\u001c/èQüO\u001eLaP\u009d>\u0010ß¸\u0000¨ó©%ÃK¢µR\u001dÇ\u0015¯ LË¸è áM¼\u0097ÿ´\nAz{\u0081íâ$ùâïRG\u0083\u0007\u009dT\f\u008bzÞ\u0018ð2T\n°-ü#\u0080Í±\u0003°ª¤\u0018\u0007¹Y`\u008e\u0005å\u0080\u0018Zæ+i\u0091ú\u0003§Q\u0089ìÕ#0¿\u008b\u0082WÂZo\u0006fR\u0010ã>s\u0003½\b\u0083\u009eµ×±®¶\u0003é0\u0010\u008f¸¬¶L½\u0097\u009b\"ä»\u000b+\u0099\u0088¤ þ\u007fî\u0080O(e½p\u0016\u009fÝ\u0091#â\u0003ò¦°G\u008bðHC\u000bWI\u0083H§É+0\u00ad,\u0014n9¢æ\u001a\u0096\u0002÷<¼wUhÁ\b\u0002×U½\u008d\u009cû½9?d5\u008dö®Ç\u0082$'\u008a½\u0089pº\u0011ÞY\u0003j<\u0010ÿIã½åX¿ÐZ\u0006$´Þ\u0003Æo\u0010\u001b½i²6'Ã°>6\u0005\u008fØV~\n\u0010\u0003\u0017v½1t·L\u009câ\u001c\u0001\u0018\u0088a\u001a\u0010©·3£g)#\u009cØ±óQC.×Ð *\u0005\u0095÷U\n¿¾Ú}K¶yË}ï ¡¥ÕÇ@k\u0083¼î\tÉ¨i\"á(^qZ%/²IÏ\u0097¬\u009e³w\u000ff®fÁ\u0095jÍ|âM^Ìþ\u0002l\u0087?6\u0016WRË¿\u0097¡\u0081 rA¯\u008a¼ÒMÔ\u0092\u0090\u0086\u009aøÕ\b\u0081úÅq\u007fJ63²³pÌ\u000bk\u0083\u0016¤\u0010\u0091Hü\u008c\u0005+eÙ\u00ad^·O:F8h\u0018\u0001¶'ê\u000eÖ[Q]';m\u007f`Ôß\u000f\u009cPàÚS-\u000e(µ\u0085í\u0016¹£\u0015g\u0018«\f?E`\u001bj\u0017±a¥\u0014Ãíè¦m,\u0095\u0080éxØ$©æ\u009dòd\u009b\u001d\u0010°F\u0006\u008e\u0018\u00055¾?\u008eH\u0011²\u0013\u008cÀ\u0010Që\u0091HÖÚ\u008c¨\u0015Y\u0000\u0000R:®l\u0018\u008a\u001fP\t\u001c¬âé\u0099<\u001d§Ü\u0096\u0018\u009eÌ¢¤W¼×ad ðc\u001d\u0017|×µd!\u001e\u00974R£>\u008eÜÐ\u00ad\u0094\u0089d\u001ac\u001e\u0013CFçÓË\u007f\u0010r\u0004\u0089ÇÙ¨9ähñ\u0015\u008b\u001bòÈr\u0010m¥Î±ÿ.Fð9ç\u000eR\bÈµû\u0010&\u0091',Y|Å\u0091Y27\u0017þ\u0086Í¬\u0010q£\u0010TSH£Ô\u0096tk2_eÏ\\\u0018\u0095mD\u0004N3*îf\u0014~&\u0005~¡\u000f0t~b~.±'\u0010\u0002\u0081<\u0095èÀx(®\rD[\u001f1\u0097.\u0010\u001a3êar\tG\f\u00991¹Å¥\u0085Øä\u0010C(\u007fò\u00ad/$á\u0007\u0085\u0097ædJ²5\u0018\u0000U\u0087:mõ©\"\u009có/%2nÝûÕ\u009fT4sÑæ5\u0018\u0091>k®Þ\u0003\u000f<\u0081þ¹}7\u00ad>N\u0004Á\u009eæ¡mÚ\u009a(²Ï>}\né\u008f\u0018é90ç©§Ù\u0018;\tJ½¹\tCÀ8.\u0093\u0014@yî\u0085l\u00908\u001dãOë\u0019\u0010g\u008eÞ\u0084\u008bÿ\u0015)\u000f\u0098Ïmä\u000eq\u0098\u0010UçÅð\u001c.X\n9 ¶;Ì,qf -\u009f\u0003\u000bø¶óZç_\u008c\u0014 §»\u0000½\u001dú`\u0005` é\u008a_ò\\\u000b<©;\u0010Å\u0094w\u0085\u0012CëÅ\u000bK¹\n¡\u009f(Ä \u0097\u0016n±\u0095Ø<(Â\"\tÚ\u0007àö/ô\u0000ì°ëâ\u0087åóæ|@\u0093Ú\u0015Â ½Ck\u0086'm\u008d\u001dÄõ\u0095³õpH½¢ÓhN\t·þ^\u008d\u0088'8n®\n$\u0010Ê\f¸¼Î\u008bÑb/}\"]\u0096¨áS\u0010®8è\u0004©XíZ\u0000¿ÊÝ\u008f6<\u0019\u0010\u0002·à?ü\f\u0094%¶CX\u000f¼Áe\u007f\u0010ÇÉ+b p\u0092q\"\u0017\u0012\u0004FLp\u0010\u0018'éË\u0096¦Ú>\u0098uJ\u0006Ãâs\f\u0018\u0002]FÔ=¡n\u0013\u0018\n¤NIe\u0002GÅD·N÷ÚuîæÉ\u0088÷7R\u0010`\u001e\u0010\u0091\u001b\u009cýü^}\u0097º¾OÁî\u001e£ì\u0010\u0098Ôý KØ1µ\u0014ÛÑÅoS\u0005~0w\u008f2|@l\u0097á `\\ß *Þ#>rXé\u0018molÀ³fç\u0090¥\t\u000fCs Á^\u009bÆ` \u009b\u0005OÇÒkÒ Q\u0094®E]éciZÅæY¨0µ1ãñð\u008fùÛ(ücJ\u0088\"}\u008c#y\u0018\u0017PÃ\u0002uÞÖr\u0001Ó\u009cÑ#³¬¨ØjùÂ\u00905\u0010\u0097\u0010VîöÈ\u0089ö\u0085.LÛ±$JÁº¾ \u0088H\"z\u0094·ÔÕ\n¹\u0018\u0002%\u0095÷ye)m8\u0014\rÕ\f4\u0086ÿ\u0086[H\u0083õ\u0010)\t\u000bG5\u0019\u0012\nb(\u0087\u0094]w\u0085á\u0018]èXËÛ·\u0087P\u0095\u001a¤5\u0018çt\u008f7Iú¢u\u0094\u009f¸\u0010\u001e\bX\u0001H8´k\u001cØ\u0086\u0081$øEC\u0010àw\u008eA¬H)hñX÷\u001d>\u008b\u0000F àZ&$À(rÅå2ôàZn¯öÚ Ö>\u00974wJÀíüM?(,Ã\u0010~K\u0088í\u0003ôy5A¦y©¹6¸ß ,\u0012û#ºûÇ#ÞÃ:\u0098^-ÏBØ\u008b«\u001fÑ\u000b\u008e\u0085É\u000b\u0084\u008d¥\u0082ù\u008b \u009b4ÖeT\u009a\u0098\u009by$\u001a© <ã¤FaÉ}+\u007f\u0084fÂNîlVþëÓ\u0010ùµ@´ÍÿÍÝKÊ\u001agÜÐ\u009cz\u0018´\u0013ÕUýÞ¿úåÂ \u0004Ü·éJ\u0012\u0007\u0098¡P\ráÃ8¬¿p\u0011IÞ\fk\u0001&<É}  ·§sÙ\u0005h:ë\u0090w\u00987Þ\u0000oVþÛ ®±\u000b&ÿ²*Ý\u0019\u008e\u0018\u0099$\u001b'9´-\u0003ÃÛë\u0018\u000fÖ}Ç\u001b\\\u0090\u0011Â\u0095Od\u001eÄ&M\rà]ë5\u0085\u000e\u0086\u0018ÛÎ\n\u008d\u0013\r9|p\u009fÍEfjz \u0092|?\u0092ßÔ\u0013R\u0010ü*N~Ù|\u008aP\u0083ÒÇ\u0084\u0095å`J ô*Ì\u001fV©\u0003\u0012\u00adg!Î·×4u|îRÚØ M\u0093J3§ï\u0089oÁ\u009e\u0010ëOtS¿5ß\u001eåXÀÖô\u0099¯×\u0010\u008b\u001açà>åø»,ý\u007fHà\u0007AU\u0018ºÏdO9vÄ6\u0011\u008dÍ\u0082Aôª\u0098E®cbÁË\u0099Ý\u0018äKJw¼©\u008d¯=þ©ë'Ô3Ø\u0081þ\u008b\u0087c\u0084Z¾\u0010ìmáÜ\u0084\u0087~\nÛ²ez<h`ä\u0010º²w\u0011þ8\u000bÿVë_y¥h\u001aÉ\u0010\u001d>\u008cf|eÿèn¯i\u0001\u001dÊ:%\u0010Æv`\u0019sÝ0\u008dÞ\u000ft\u0017r\u0012¤«\u0010\u0015X\u001eFÍ¬\u001e\u0096è»4Õ\u0093ºå\u0004\u00105p@\u0086õ\u000e\r\u0003¼<×\u0015Î\u0098\u009eß\u0010x\u0087\u007fÿ¬\u009céP @Yywg¢J(;ÿ®ßt\u00ad!pL\u0019°Iô3§¹\u0001R´f\u009bDÒ%.N§8LÓS¯'×t\u0087ÆÆ*\u0014\u00101o\u0080à>ÿ\u009di0\u0019ÊþR,\u001f¶\u0018på\b}¦Â\u0095\u009d\b£\u007fÃ\u000brær\u008d±\n\u000bAG\u0094á\u0010szLOK\u0001\u0091[\r\u001a4\u0085h·\u0005E\u0010]k-¡ñbô?\u00802a~oã¶g(D\u008bÌè\u0090¢\u009dN\u0084\u001c-ã\f-\u0080\u0087\u009c\\b\u0002\u0006á ö=Ñ=>ÆZdÓ\u009a\u000fÄàQ6\u0081F(|aô|ËÍ¸©ù0>Ä\u0098\u0080L.Ç\u001a\u009b\u0096¶-\u009bÅ\u0095%¾4Ä\u0087\u0097Ì,Z{qE¼Ì[\u0010Å\rç\u0098\u008aeþJ·^\u008a\u009a\u009dD>\r\u0018YÿO°öÔ\n@¦ý\u0018¾^ì\u0001½²G÷\u000f\u0010|ÐÇ0d\u0012\tl\u001d(\u009e¹\u00adV\n\u008däjq\u00984\u009dB@/\u0082)I¾\u0016õÌ\u0088\u0012\u0097¿\u0085ãk\u0086Jr\n\u000e%\f-êNÏ\r\"\u0010\u009bÜ²èÌ|z§9\u0091u8F^·\u0088 °-*2\u0083{\u009cqí¤*jÄ¯\u009bI\"dol¦þ\u008c'Ä\t°\n\u00186\u009cõ";
      int var7 = "ÄÀ\u000b\u0098\u001f\u0082L¼jÃ-i*T\u0010\u0005 ÂáoÜgÆ;\u008c\u00974PB\u0003>F\u008cø\u0011f\u0016Ül\u001b\u0000H\u009eo@¹&v:\u0010jðò\\!(¸óÅâO\u0015\u000b(_\u0016\u0010 \u0005\\Ý¡ï\u00adn{\u0094éLè_|Í(MÓårF¾&ÿÊóhNU\u0092ôñ(µ§Ã\u0081*½A5Ö\u0086\b\"Ø\u008b\nëëu\u0007XI#@0v[Þ¶ª´×@¶¬Ù{õüÛ\u000b?\u007f£L\u0017_þ\u0005Þ\u008c\u0087k;W\u000f\u008d9\u0010>ê\bp\u0014Õ\u0090Ø\"=GÜ¸i\u0010®»\t¼u\r\u0006\u0015`xø\u00adÞ]ÎÒ(\u0092iyÞ&\u001cOÚ-\u0083\u0094°5\u0099¢6\u0003hJ\u009cÍäëbîÁ\u008aúÝÓk\u008fÖþd\u0093Éz\u00875\u0010\u0087\r\u0017\u0096Mù^6tì(\u001eÚîüM\u00102*ø=ÞÇ\u0097Ô¶ °\u0090Sqi©\u0010\u0018Üªd³\u0086\u009f\u009b¡\u00ad/\u0080\u0003\u0017u\u0083 ´ù\u0080È¿\u008d½&e\u009eiôÓÄlm\u0098\u0018p\u0099öÝSÜ{uº9p\u0089\u0010Ô\u0018\bã$ji\u0086Æé\u0014\u0097Áhì_iÄ=íJÇÓõ%$\u0010\u009d\b§@\u0080K\u008b'yÌa:»ø§\u0017\u0018\u0014t\u0090Aö\u008e:\u0088\u0085JRôØ\u0086\u009bS²¿\u0019oE]\u009a)(Ïä\"X§kXø«l®NkR\u001fí\u009e\u0015&p\u0010/\u0094ÚH`{Vû1\b¨±\u009a\u0083H\u0018\u0090«Û ã\u001bg Î\u0015\u0097ky¤nÙEþ 8xO¶\u009a4GÁ²È\"&\nc\u0084Ü\u001f\u0010B#´°y4\u007f\u0007)ìµè³ûåæ\u0010ín\u0094\u0004\u0089á\u0090.V\u008c6\u0086\u009a©\u009f¾\u0010¶+\u008f¹\u0006I\u0083wz²>Pã\u0000Lã\u0018\u007fÁ\u0018\u007fk\u0016*|\u0013ë÷O]ð\u0005Ãz]=\u0001\u0098O%6\u0010ª\u008cõºk\u000bKE\u0085²\u0094¿\u008cqÚ\n ßSî\tk\u0019M?tÜ\u0018Ý\u0090\u0096¼\u0090úq3f´Á\u0007e¥\u0084¢Çu\u001b©* S4R\u0090§^Bw\r³\u0091O5\u0081\u0090\u000eÛß\u0006ÕC|û\u0019j\u0091¾\u009c5È°r\u0010ËIb\u001e\u0010¬x\u0095\u0001»Íg\u001e\u0093À\u000f(-\u0011ñR©£\u009b\u0085à!¹¸~×ÔBºÝsºÍ~\u009a´Å+U\u0015ùÒ-ð\u0087$\u008fá\u000f\n\u0006| \u0095¥M_\u001d\u0006\tê!i`U#\u001c¯ÍepèÀïR;\u0017Ï÷äùÒ'©Ç \u009b½{1N®R¢\u009fÀÈb\u000eê\u001c\u009d»lMê\u0098\u008e¾rd§\u008c>0ÉS¾ \u0091®\t\u009bP)\u0017Q+Ñ£\u009dZ\u0018\u008fÿ;i\u0094Q¨\u001bÕ%dLÉÎ¸\rN\u001c\u0018ÀÉ\fÓö³V\u001dE\u0005fÕ\u0002x(T<JxÁê6°\"\u0010{y=£\u009c\u0007A?tOqV®Äïþ\u0010Y¯\u001a\u001f\n»\u008cé»\u0084\u0096\u0015=\u0019y\u0094(ÄL\u0012\\í¹ù+2\u0089(0Æ+ø\"e\u0099eO©%\\FK©ÿWPJs\u0012Qæ,XÍ\u001f\u0010R \u0093V\r\u0090Ò\u009fèB%\u0087(\u001cÊfæx\u0018 hª\u0091Ù»*\u0084\u0011Mi]4dÙ\u0018øß\u0093[RÆ\u0090PÖ\u007fÍ;%íº¯¥O9 4U\u009ah V\u0081nÐ\u0001~RÖMq·ôãm<}yØgõH\u0080«\u0018¯W\u0010f\u001c8ïI\u0018t\bbT\u0085ÆÏ\u009eY\u0005\u009d<\u00ad\u0094ÕÄ¦\u0013ü¡ÍÕ\u009e¥\u0010mÿÀ\u0010p\u0006¥õ\u0003\u0000\u0087|ÍÏEÀ\u0018X\u0080\u0086Ì}óN\\¥ù&gSÿV\u009fR\u008ckI\u001c{ë\u009a(êÂà2\u0088©[©VÎ\bLUbJ\u001f/w¤ìFvpÓ\u009aØ\tnÒ5¥ªÔ\u0002\u001fÀõÀî\u0096\u0010³¦º¢~6\u0097ÝÊ\u0081\u0091¦\u0082ôYù\u0018\u0014ßÍz½Y÷\u009d;\u00074\u0099\u009bap¼G\u0098\u0080Y3ì\u009f\u0088 \b÷Ól\u001bë\n@ÒÅÎ\u0089:\u0010ú\b+¤\u009d+aP\u0003aø5_ Ä úH D\u0090û-=\u00032 m\u0015\u0000«Æ\u0080\u0090[\u009c\u00802#¹\\Q\u001béý\u0082`ü\u009d\u0092ý\u0010b§I\u009bÀ\u007f\u009bHÔ\u0088\u0017j@¤\u0014n B\u0010\u009c XlÃÈ\t\u008d}u\u0099h+Þq\u009c\r~A\u0015ó\u0006\u000b°ÎC\u0003±lß(Q5@.N£ä\u0017U\u0085¡:2\u0007èãÑ\u0002\u001d\u000euò¯Ä\u000f\u0015wÔ¦ë\u0095Ná\\«îADè$\u0010eñÆ@[Ì}ðóÊ®¾,;\u0015¦\u0010\u001eG\u0097\u0011õÔ\u0082UÀ\u0091à/p\u008e*ù ç¬òM[À`\u0012ww}\u008f¶Ï\u0087âz}öäZ\u000eß\u0006ª°Å%qË\u0013®\u0010íì\u009díÃð³\u0010«áÜP\u0093}JR\u00108\u0016(ÔQ*¤¹×\u0004øE\"Þ\u008b^\u0010ò£P\u001bw\u001f¹B\u000e\u0098#\u0096âÎ\u0087Á\u0010â;\u0016\u009b\u0016\u0098\u0083ÒôZ\u0005\f\u008b\u00adRU\u0010î\u000f-íqo>\u0080+8 Ó@óÈÏ\u0010¹#õA\u001c/èQüO\u001eLaP\u009d>\u0010ß¸\u0000¨ó©%ÃK¢µR\u001dÇ\u0015¯ LË¸è áM¼\u0097ÿ´\nAz{\u0081íâ$ùâïRG\u0083\u0007\u009dT\f\u008bzÞ\u0018ð2T\n°-ü#\u0080Í±\u0003°ª¤\u0018\u0007¹Y`\u008e\u0005å\u0080\u0018Zæ+i\u0091ú\u0003§Q\u0089ìÕ#0¿\u008b\u0082WÂZo\u0006fR\u0010ã>s\u0003½\b\u0083\u009eµ×±®¶\u0003é0\u0010\u008f¸¬¶L½\u0097\u009b\"ä»\u000b+\u0099\u0088¤ þ\u007fî\u0080O(e½p\u0016\u009fÝ\u0091#â\u0003ò¦°G\u008bðHC\u000bWI\u0083H§É+0\u00ad,\u0014n9¢æ\u001a\u0096\u0002÷<¼wUhÁ\b\u0002×U½\u008d\u009cû½9?d5\u008dö®Ç\u0082$'\u008a½\u0089pº\u0011ÞY\u0003j<\u0010ÿIã½åX¿ÐZ\u0006$´Þ\u0003Æo\u0010\u001b½i²6'Ã°>6\u0005\u008fØV~\n\u0010\u0003\u0017v½1t·L\u009câ\u001c\u0001\u0018\u0088a\u001a\u0010©·3£g)#\u009cØ±óQC.×Ð *\u0005\u0095÷U\n¿¾Ú}K¶yË}ï ¡¥ÕÇ@k\u0083¼î\tÉ¨i\"á(^qZ%/²IÏ\u0097¬\u009e³w\u000ff®fÁ\u0095jÍ|âM^Ìþ\u0002l\u0087?6\u0016WRË¿\u0097¡\u0081 rA¯\u008a¼ÒMÔ\u0092\u0090\u0086\u009aøÕ\b\u0081úÅq\u007fJ63²³pÌ\u000bk\u0083\u0016¤\u0010\u0091Hü\u008c\u0005+eÙ\u00ad^·O:F8h\u0018\u0001¶'ê\u000eÖ[Q]';m\u007f`Ôß\u000f\u009cPàÚS-\u000e(µ\u0085í\u0016¹£\u0015g\u0018«\f?E`\u001bj\u0017±a¥\u0014Ãíè¦m,\u0095\u0080éxØ$©æ\u009dòd\u009b\u001d\u0010°F\u0006\u008e\u0018\u00055¾?\u008eH\u0011²\u0013\u008cÀ\u0010Që\u0091HÖÚ\u008c¨\u0015Y\u0000\u0000R:®l\u0018\u008a\u001fP\t\u001c¬âé\u0099<\u001d§Ü\u0096\u0018\u009eÌ¢¤W¼×ad ðc\u001d\u0017|×µd!\u001e\u00974R£>\u008eÜÐ\u00ad\u0094\u0089d\u001ac\u001e\u0013CFçÓË\u007f\u0010r\u0004\u0089ÇÙ¨9ähñ\u0015\u008b\u001bòÈr\u0010m¥Î±ÿ.Fð9ç\u000eR\bÈµû\u0010&\u0091',Y|Å\u0091Y27\u0017þ\u0086Í¬\u0010q£\u0010TSH£Ô\u0096tk2_eÏ\\\u0018\u0095mD\u0004N3*îf\u0014~&\u0005~¡\u000f0t~b~.±'\u0010\u0002\u0081<\u0095èÀx(®\rD[\u001f1\u0097.\u0010\u001a3êar\tG\f\u00991¹Å¥\u0085Øä\u0010C(\u007fò\u00ad/$á\u0007\u0085\u0097ædJ²5\u0018\u0000U\u0087:mõ©\"\u009có/%2nÝûÕ\u009fT4sÑæ5\u0018\u0091>k®Þ\u0003\u000f<\u0081þ¹}7\u00ad>N\u0004Á\u009eæ¡mÚ\u009a(²Ï>}\né\u008f\u0018é90ç©§Ù\u0018;\tJ½¹\tCÀ8.\u0093\u0014@yî\u0085l\u00908\u001dãOë\u0019\u0010g\u008eÞ\u0084\u008bÿ\u0015)\u000f\u0098Ïmä\u000eq\u0098\u0010UçÅð\u001c.X\n9 ¶;Ì,qf -\u009f\u0003\u000bø¶óZç_\u008c\u0014 §»\u0000½\u001dú`\u0005` é\u008a_ò\\\u000b<©;\u0010Å\u0094w\u0085\u0012CëÅ\u000bK¹\n¡\u009f(Ä \u0097\u0016n±\u0095Ø<(Â\"\tÚ\u0007àö/ô\u0000ì°ëâ\u0087åóæ|@\u0093Ú\u0015Â ½Ck\u0086'm\u008d\u001dÄõ\u0095³õpH½¢ÓhN\t·þ^\u008d\u0088'8n®\n$\u0010Ê\f¸¼Î\u008bÑb/}\"]\u0096¨áS\u0010®8è\u0004©XíZ\u0000¿ÊÝ\u008f6<\u0019\u0010\u0002·à?ü\f\u0094%¶CX\u000f¼Áe\u007f\u0010ÇÉ+b p\u0092q\"\u0017\u0012\u0004FLp\u0010\u0018'éË\u0096¦Ú>\u0098uJ\u0006Ãâs\f\u0018\u0002]FÔ=¡n\u0013\u0018\n¤NIe\u0002GÅD·N÷ÚuîæÉ\u0088÷7R\u0010`\u001e\u0010\u0091\u001b\u009cýü^}\u0097º¾OÁî\u001e£ì\u0010\u0098Ôý KØ1µ\u0014ÛÑÅoS\u0005~0w\u008f2|@l\u0097á `\\ß *Þ#>rXé\u0018molÀ³fç\u0090¥\t\u000fCs Á^\u009bÆ` \u009b\u0005OÇÒkÒ Q\u0094®E]éciZÅæY¨0µ1ãñð\u008fùÛ(ücJ\u0088\"}\u008c#y\u0018\u0017PÃ\u0002uÞÖr\u0001Ó\u009cÑ#³¬¨ØjùÂ\u00905\u0010\u0097\u0010VîöÈ\u0089ö\u0085.LÛ±$JÁº¾ \u0088H\"z\u0094·ÔÕ\n¹\u0018\u0002%\u0095÷ye)m8\u0014\rÕ\f4\u0086ÿ\u0086[H\u0083õ\u0010)\t\u000bG5\u0019\u0012\nb(\u0087\u0094]w\u0085á\u0018]èXËÛ·\u0087P\u0095\u001a¤5\u0018çt\u008f7Iú¢u\u0094\u009f¸\u0010\u001e\bX\u0001H8´k\u001cØ\u0086\u0081$øEC\u0010àw\u008eA¬H)hñX÷\u001d>\u008b\u0000F àZ&$À(rÅå2ôàZn¯öÚ Ö>\u00974wJÀíüM?(,Ã\u0010~K\u0088í\u0003ôy5A¦y©¹6¸ß ,\u0012û#ºûÇ#ÞÃ:\u0098^-ÏBØ\u008b«\u001fÑ\u000b\u008e\u0085É\u000b\u0084\u008d¥\u0082ù\u008b \u009b4ÖeT\u009a\u0098\u009by$\u001a© <ã¤FaÉ}+\u007f\u0084fÂNîlVþëÓ\u0010ùµ@´ÍÿÍÝKÊ\u001agÜÐ\u009cz\u0018´\u0013ÕUýÞ¿úåÂ \u0004Ü·éJ\u0012\u0007\u0098¡P\ráÃ8¬¿p\u0011IÞ\fk\u0001&<É}  ·§sÙ\u0005h:ë\u0090w\u00987Þ\u0000oVþÛ ®±\u000b&ÿ²*Ý\u0019\u008e\u0018\u0099$\u001b'9´-\u0003ÃÛë\u0018\u000fÖ}Ç\u001b\\\u0090\u0011Â\u0095Od\u001eÄ&M\rà]ë5\u0085\u000e\u0086\u0018ÛÎ\n\u008d\u0013\r9|p\u009fÍEfjz \u0092|?\u0092ßÔ\u0013R\u0010ü*N~Ù|\u008aP\u0083ÒÇ\u0084\u0095å`J ô*Ì\u001fV©\u0003\u0012\u00adg!Î·×4u|îRÚØ M\u0093J3§ï\u0089oÁ\u009e\u0010ëOtS¿5ß\u001eåXÀÖô\u0099¯×\u0010\u008b\u001açà>åø»,ý\u007fHà\u0007AU\u0018ºÏdO9vÄ6\u0011\u008dÍ\u0082Aôª\u0098E®cbÁË\u0099Ý\u0018äKJw¼©\u008d¯=þ©ë'Ô3Ø\u0081þ\u008b\u0087c\u0084Z¾\u0010ìmáÜ\u0084\u0087~\nÛ²ez<h`ä\u0010º²w\u0011þ8\u000bÿVë_y¥h\u001aÉ\u0010\u001d>\u008cf|eÿèn¯i\u0001\u001dÊ:%\u0010Æv`\u0019sÝ0\u008dÞ\u000ft\u0017r\u0012¤«\u0010\u0015X\u001eFÍ¬\u001e\u0096è»4Õ\u0093ºå\u0004\u00105p@\u0086õ\u000e\r\u0003¼<×\u0015Î\u0098\u009eß\u0010x\u0087\u007fÿ¬\u009céP @Yywg¢J(;ÿ®ßt\u00ad!pL\u0019°Iô3§¹\u0001R´f\u009bDÒ%.N§8LÓS¯'×t\u0087ÆÆ*\u0014\u00101o\u0080à>ÿ\u009di0\u0019ÊþR,\u001f¶\u0018på\b}¦Â\u0095\u009d\b£\u007fÃ\u000brær\u008d±\n\u000bAG\u0094á\u0010szLOK\u0001\u0091[\r\u001a4\u0085h·\u0005E\u0010]k-¡ñbô?\u00802a~oã¶g(D\u008bÌè\u0090¢\u009dN\u0084\u001c-ã\f-\u0080\u0087\u009c\\b\u0002\u0006á ö=Ñ=>ÆZdÓ\u009a\u000fÄàQ6\u0081F(|aô|ËÍ¸©ù0>Ä\u0098\u0080L.Ç\u001a\u009b\u0096¶-\u009bÅ\u0095%¾4Ä\u0087\u0097Ì,Z{qE¼Ì[\u0010Å\rç\u0098\u008aeþJ·^\u008a\u009a\u009dD>\r\u0018YÿO°öÔ\n@¦ý\u0018¾^ì\u0001½²G÷\u000f\u0010|ÐÇ0d\u0012\tl\u001d(\u009e¹\u00adV\n\u008däjq\u00984\u009dB@/\u0082)I¾\u0016õÌ\u0088\u0012\u0097¿\u0085ãk\u0086Jr\n\u000e%\f-êNÏ\r\"\u0010\u009bÜ²èÌ|z§9\u0091u8F^·\u0088 °-*2\u0083{\u009cqí¤*jÄ¯\u009bI\"dol¦þ\u008c'Ä\t°\n\u00186\u009cõ"
         .length();
      char var8 = 16;
      int var34 = -1;

      label81:
      while (true) {
         String var37 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var37.getBytes("ISO-8859-1"));
            String var55 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var55;
                  if ((var34 += var8) >= var7) {
                     CONST_J = var4;
                     CONST_K = new String[148];
                     short var39 = 15286;
                     long var47 = 5302217557006288333L ^ var0;
                     CONST_B = "BreezeClient/2.0";
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[4];
                     int var14 = 0;
                     String var15 = "ä·*Êt \nf¥p&h\u0097\u0097åM";
                     int var16 = "ä·*Êt \nf¥p&h\u0097\u0097åM".length();
                     byte var17 = 0;

                     label63:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var41 = var13;
                        var10001 = var14++;
                        long var59 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var65 = -1;

                        while (true) {
                           long var19 = var59;
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
                           long var70 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var65) {
                              case 0:
                                 var41[var10001] = var70;
                                 if (var17 >= var16) {
                                    CONST_C = (int)var13[1];
                                    CONST_D = (int)var13[0];
                                    CONST_E = (int)var13[3];
                                    CONST_A = (int)var13[2];
                                    CONST_O = new HashMap(13);
                                    Cipher var22;
                                    var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var23 = 1; var23 < 8; var23++) {
                                       var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var24 = new long[6];
                                    int var25 = 0;
                                    String var26 = "Ç¢Æ&\u0000t%\u0015±¶uØm?Å\u0016¸°å\u0005\u0018\u0006S \u007fY®záÝW+";
                                    int var27 = "Ç¢Æ&\u0000t%\u0015±¶uØm?Å\u0016¸°å\u0005\u0018\u0006S \u007fY®záÝW+".length();
                                    byte var28 = 0;

                                    label47:
                                    while (true) {
                                       int var51 = var28;
                                       var28 += 8;
                                       byte[] var29 = var26.substring(var51, var28).getBytes("ISO-8859-1");
                                       long[] var43 = var24;
                                       var51 = var25++;
                                       long var62 = (var29[0] & 255L) << 56
                                          | (var29[1] & 255L) << 48
                                          | (var29[2] & 255L) << 40
                                          | (var29[3] & 255L) << 32
                                          | (var29[4] & 255L) << 24
                                          | (var29[5] & 255L) << 16
                                          | (var29[6] & 255L) << 8
                                          | var29[7] & 255L;
                                       byte var68 = -1;

                                       while (true) {
                                          long var30 = var62;
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
                                          var70 = (var32[0] & 255L) << 56
                                             | (var32[1] & 255L) << 48
                                             | (var32[2] & 255L) << 40
                                             | (var32[3] & 255L) << 32
                                             | (var32[4] & 255L) << 24
                                             | (var32[5] & 255L) << 16
                                             | (var32[6] & 255L) << 8
                                             | var32[7] & 255L;
                                          switch (var68) {
                                             case 0:
                                                var43[var51] = var70;
                                                if (var28 >= var27) {
                                                   CONST_M = var24;
                                                   CONST_N = new Long[6];
                                                   CONST_F = new rip.breeze.client.Util139();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var43[var51] = var70;
                                                if (var28 < var27) {
                                                   continue label47;
                                                }

                                                var26 = "r£{®ÐÞÃ%\u0005\u008f³xV\u0089M:";
                                                var27 = "r£{®ÐÞÃ%\u0005\u008f³xV\u0089M:".length();
                                                var28 = 0;
                                          }

                                          byte var53 = var28;
                                          var28 += 8;
                                          var29 = var26.substring(var53, var28).getBytes("ISO-8859-1");
                                          var43 = var24;
                                          var51 = var25++;
                                          var62 = (var29[0] & 255L) << 56
                                             | (var29[1] & 255L) << 48
                                             | (var29[2] & 255L) << 40
                                             | (var29[3] & 255L) << 32
                                             | (var29[4] & 255L) << 24
                                             | (var29[5] & 255L) << 16
                                             | (var29[6] & 255L) << 8
                                             | var29[7] & 255L;
                                          var68 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var41[var10001] = var70;
                                 if (var17 < var16) {
                                    continue label63;
                                 }

                                 var15 = "Að\u0010\fw\u0017Æèú&ã\u0086øÖÜ©";
                                 var16 = "Að\u0010\fw\u0017Æèú&ã\u0086øÖÜ©".length();
                                 var17 = 0;
                           }

                           byte var50 = var17;
                           var17 += 8;
                           var18 = var15.substring(var50, var17).getBytes("ISO-8859-1");
                           var41 = var13;
                           var10001 = var14++;
                           var59 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var65 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var55;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label81;
                  }

                  var6 = "v¢E$¾;uÂÆø\u001bZTì« \u0010U\u0083}¹\u0080×w^Ø$D@\u0012x\u0088Z";
                  var7 = "v¢E$¾;uÂÆø\u001bZTì« \u0010U\u0083}¹\u0080×w^Ø$D@\u0012x\u0088Z".length();
                  var8 = 16;
                  var34 = -1;
            }

            var37 = var6.substring(++var34, var34 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize_2(int[] var0) {
      arr_H = var0;
   }

   public static int[] values() {
      return arr_H;
   }

   private static Throwable getThrowable(Throwable var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18148;
      if (CONST_K[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_L.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/S", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_J[var3].getBytes("ISO-8859-1");
         CONST_K[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_K[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
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
         throw new RuntimeException("rip/breeze/S" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6476;
      if (CONST_N[var3] == null) {
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
         long var5 = CONST_M[var3];
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
         Object[] var9 = (Object[])CONST_O.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/S", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_N[var3] = var14;
      }

      return CONST_N[var3];
   }

   private static long getLong_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/S" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
