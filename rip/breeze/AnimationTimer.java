package rip.breeze;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public class AnimationTimer {
   public static final String CONST_A;
   private final HashMap<File, FileUtil3> hashMap_b;
   private final List<PlayerUtil2> list_c;
   private final File file_d;
   private final Util133 dataBuilder112_e;
   private ImageUtil15 dataBuilder17_f;
   private final Queue<Runnable> queue_g;
   private boolean fieldBool_h;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);
   private static final long eka_1;

   public AnimationTimer() {
      long var1 = 103670623371248L;
      super();
      this.hashMap_b = new HashMap<>();
      this.list_c = new ArrayList<>();
      String[] var10001 = new String[1];
      StringBuilder var10004 = new StringBuilder().append(Util140.string_d);
      short var10005 = 26289;
      long var10006 = 1447103633278536944L ^ var1;
      var10001[0] = var10004.append("/scripts").toString();
      this.file_d = HttpUtil2.getFile_2(var10001);
      this.dataBuilder112_e = new Util133().getDataBuilder112();
      this.queue_g = new ConcurrentLinkedQueue<>();
      this.fieldBool_h = false;
      if (this.file_d.exists() || this.file_d.mkdirs()) {
         for (File var6 : this.file_d.listFiles()) {
            if (var6.getName().endsWith(".js")) {
               FileUtil3 var7 = new FileUtil3(
                  var6, var6.getName().replaceFirst("[.][^.]+$", ""), HttpUtil2.buildString_2(var6)
               );
               this.hashMap_b.put(var6, var7);
            }
         }
      }
   }

   public void processAll() {
      for (FileUtil3 var2 : this.hashMap_b.values()) {
         var2.f();
      }
   }

   public File getFile_d() {
      return this.file_d;
   }

   public void processAll_2() {
      for (FileUtil3 var2 : this.hashMap_b.values()) {
         this.initialize(var2);
      }

      this.processAll_3();
   }

   public ImageUtil15 getDataBuilder17_f() {
      return this.dataBuilder17_f;
   }

   public void noOp(ImageUtil15 var1) {
   }

   public void initialize(ImageUtil15 var1) {
      this.dataBuilder17_f = var1;
      var1.processAll();
      this.dataBuilder17_f = null;
   }

   public void initialize_2(ImageUtil15 var1) {
      this.dataBuilder17_f = var1;
      var1.update();
      this.dataBuilder17_f = null;
   }

   public List<FileUtil3> getList() {
      return new ArrayList<>(this.hashMap_b.values());
   }

   public List<PlayerUtil2> getList_2() {
      return new ArrayList<>(this.list_c);
   }

   public PlayerUtil2 getBreezeUtil15(long var1) {
      for (PlayerUtil2 var4 : this.list_c) {
         if (var4.getLong() == var1) {
            return var4;
         }
      }

      return null;
   }

   public List<ImageUtil15> getList_3() {
      ArrayList var1 = new ArrayList<>(this.hashMap_b.values());
      var1.addAll(this.list_c);
      return var1;
   }

   public void toggle(PlayerUtil2 var1) {
      this.list_c.removeIf(AnimationTimer::lambda$loadCloudScript_Inner0);
      this.list_c.add(var1);
      this.initialize(var1);
      this.fieldBool_h = true;
   }

   public void toggle_2(PlayerUtil2 var1) {
      if (this.list_c.remove(var1)) {
         var1.j();
         var1.e();
         this.fieldBool_h = true;
      }
   }

   public BreezeIterable getBreezeIterable() {
      long var1 = 56887596748464L;
      long var3 = var1 ^ 130888187291912L;
      long var5 = var1 ^ 98554441807503L;
      long var7 = var1 ^ 96564207813743L;
      BreezeIterable var9 = new BreezeIterable();

      for (PlayerUtil2 var11 : this.list_c) {
         var11.f();
         UserTheme var12 = new UserTheme();
         var12.runCloudJob(var3, "id", var11.getLong());
         var12.processNullable("config", var5, var11.getUserTheme());
         var9.processNullable(var7, var12);
      }

      return var9;
   }

   private void processAll_3() {
      long var1 = 57044781628739L;
      long var3 = var1 ^ 100672985200831L;
      long var5 = var1 ^ 13071776057970L;
      if (BreezeContext.cloudAuthService_h != null) {
         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-194758862722423787L, var1);
         Object[] var10002 = var10001;
         CloudAuthService var24 = var10000;
         Method var17 = var10003;

         try {
            var18 = (EnumType12)var17.invoke(var24, var10002);
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         if (var18 == EnumType12.CONNECTED) {
            var10000 = BreezeContext.cloudAuthService_h;
            var10001 = rip.breeze.client.MathUtil8.noArgs();
            var10003 = rip.breeze.client.MathUtil8.getMethod_3(-195893644515218727L, var1);
            var10002 = var10001;
            CloudAuthService var26 = var10000;
            Method var20 = var10003;

            try {
               var21 = (UserTheme)var20.invoke(var26, var10002);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            UserTheme var7 = var21;
            if (var7 != null) {
               short var27 = 12176;
               long var31 = 5403047476621592422L ^ var1;
               if (var7.isValid("_cloud_scripts") && var7.getDataBuilder2_2("_cloud_scripts").isValid()) {
                  for (rip.breeze.client.PlayerUtil8 var9 : var7.getBreezeIterable("_cloud_scripts")) {
                     if (var9.isValid_2()) {
                        UserTheme var10 = var9.getUserTheme(var5);
                        if (var10.isValid("id")) {
                           long var11 = var10.getDataBuilder2_2("id").getLong(var3);
                           UserTheme var13 = var10.isValid("config")
                                 && var10.getDataBuilder2_2("config").isValid_2()
                              ? var10.getUserTheme("config")
                              : new UserTheme();
                           var10000 = BreezeContext.cloudAuthService_h;
                           var10001 = rip.breeze.client.MathUtil8.buildArgs3(var11, this::lambda$loadCloudScripts_Inner2, AnimationTimer::lambda$loadCloudScripts_Inner3);
                           var10003 = rip.breeze.client.MathUtil8.getMethod_3(-192717844256948951L, var1);
                           var10002 = var10001;
                           CloudAuthService var29 = var10000;
                           Method var23 = var10003;

                           try {
                              var23.invoke(var29, var10002);
                           } catch (InvocationTargetException var14) {
                              throw var14.getTargetException();
                           }
                        }
                     }
                  }

                  return;
               }
            }

            return;
         }
      }
   }

   public void processAll_4(int var1) {
      for (ImageUtil15 var3 : this.getList_3()) {
         if (!var3.getKeyBind().equals(KeyBind.CONST_G) && var3.getKeyBind().int_aJ == var1 && (!var3.checkCondition() || !var3.isValid())) {
            var3.update_4();
         }
      }
   }

   public void processAll_5() {
      Runnable var1;
      while ((var1 = this.queue_g.poll()) != null) {
         var1.run();
      }

      for (ImageUtil15 var3 : this.getList_3()) {
         if (var3.checkCondition() && var3.isValid() && !var3.getKeyBind().checkCondition()) {
            var3.update_4();
         }
      }
   }

   public boolean checkCondition() {
      long var1 = 45541744284503L;
      boolean var3 = false;
      if (this.fieldBool_h) {
         this.fieldBool_h = false;
         var3 = true;
      }

      if (this.file_d.exists() && this.dataBuilder112_e.isValid(5000L)) {
         this.dataBuilder112_e.getDataBuilder112();

         for (File var7 : this.file_d.listFiles()) {
            if (var7.getName().endsWith(".js") && !this.hashMap_b.containsKey(var7)) {
               var3 = true;
               this.hashMap_b
                  .put(
                     var7,
                     new FileUtil3(var7, var7.getName().replaceFirst("[.][^.]+$", ""), HttpUtil2.buildString_2(var7))
                  );
            }
         }

         ArrayList var8 = new ArrayList();

         for (FileUtil3 var11 : this.hashMap_b.values()) {
            if (!var11.isValid()) {
               var11.e();
               var3 = true;
               var8.add(var11.getFile_A());
            }
         }

         for (File var12 : var8) {
            this.hashMap_b.remove(var12);
         }

         return var3;
      } else {
         return var3;
      }
   }

   private static void lambda$loadCloudScripts_Inner3(String var0) {
   }

   private void lambda$loadCloudScripts_Inner2(UserTheme var1, String var2, StringDecryptHelper2 var3, UserInfo var4) {
      if (var4 != null) {
         this.queue_g.add(this::lambda$null_Inner1);
      }
   }

   private void lambda$null_Inner1(StringDecryptHelper2 var1, UserInfo var2, String var3, UserTheme var4) {
      PlayerUtil2 var5 = new PlayerUtil2(var1, var2, var3);
      var5.processAll(var4);
      this.toggle(var5);
   }

   private static boolean lambda$loadCloudScript_Inner0(PlayerUtil2 var0, PlayerUtil2 var1) {
      if (var1.getLong() == var0.getLong()) {
         var1.e();
         return true;
      } else {
         return false;
      }
   }

   static {
      long var0 = 95102918841104L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "J\rF\u008bÁ\u0004\u0081\t\u0013r^\u0097\u0014×(\u001b\u0010\u0004çü@\u0086[\u0092Â×÷´\u008a\u0016¡w\u0093\u0018p\u0097ì\u0093\u0096Ç\u001f?\u0017\u0017v\u00ad\u008aè'arZ\u0096`\u009cn Î\u0018)s?ÖÄü\u0013Þ\u000e\u000bí:¥Pó5\u0095]\u001aø\u009dHaß\u0018-À`\"ÀØ\u0093t*\u0001.ûÁU¶¨\u001cP\fºÁw¥Ù\u0010ò®1}[é:Q3\u0096ÞÊ\u0086\u0088åÃ  (ò\nJÞ{\u0018\u0097[\u008b[*ç\u0094\u007fþòPZsÖøÖXªv¤¯¿\u0082ª\u0018eß\u008b*\u0017\u009dé&-î\u0087µþÆ\u0099\u0088H÷\u000b 6É\u0092º\u0010¡ýß\u0019\u001d\u0015:j!uv¶_Øö\u0091 ©\u008eÌ¸x×¢}\u000e\u001e\u0090p+\u008azCë«ÑÙ/åJû+´ \u0095¤m°Ê";
      int var7 = "J\rF\u008bÁ\u0004\u0081\t\u0013r^\u0097\u0014×(\u001b\u0010\u0004çü@\u0086[\u0092Â×÷´\u008a\u0016¡w\u0093\u0018p\u0097ì\u0093\u0096Ç\u001f?\u0017\u0017v\u00ad\u008aè'arZ\u0096`\u009cn Î\u0018)s?ÖÄü\u0013Þ\u000e\u000bí:¥Pó5\u0095]\u001aø\u009dHaß\u0018-À`\"ÀØ\u0093t*\u0001.ûÁU¶¨\u001cP\fºÁw¥Ù\u0010ò®1}[é:Q3\u0096ÞÊ\u0086\u0088åÃ  (ò\nJÞ{\u0018\u0097[\u008b[*ç\u0094\u007fþòPZsÖøÖXªv¤¯¿\u0082ª\u0018eß\u008b*\u0017\u009dé&-î\u0087µþÆ\u0099\u0088H÷\u000b 6É\u0092º\u0010¡ýß\u0019\u001d\u0015:j!uv¶_Øö\u0091 ©\u008eÌ¸x×¢}\u000e\u001e\u0090p+\u008azCë«ÑÙ/åJû+´ \u0095¤m°Ê"
         .length();
      char var8 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var28 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var17 += var8) >= var7) {
                     CONST_J = var4;
                     CONST_K = new String[12];
                     short var20 = 12222;
                     long var25 = 3653074819947850014L ^ var0;
                     CONST_A = "_cloud_scripts";
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -2082620920453194898L;
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
                     long var32 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     5000L = var32;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var28;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "O{\u0080\u008aFçÅ\u001c\u0010xø9Kèaö\u0010l×\u0090\u001cÈêµ\u0011!dß\u0016úfßÏ";
                  var7 = "O{\u0080\u008aFçÅ\u001c\u0010xø9Kèaö\u0010l×\u0090\u001cÈêµ\u0011!dß\u0016úfßÏ".length();
                  var8 = 16;
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5555;
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
            throw new RuntimeException("rip/breeze/aE", var10);
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
         throw new RuntimeException("rip/breeze/aE" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
