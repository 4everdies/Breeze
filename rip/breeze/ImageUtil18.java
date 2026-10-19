package rip.breeze;

import java.awt.Color;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.BreezeIterable;
import rip.breeze.client.UserTheme;

public final class ImageUtil18 {
   private static final ImageUtil18 CONST_A;
   private static final LinkedHashMap<String, Object> CONST_B;
   private String string_c;
   private final List<Util27> list_d;
   private final Map<String, Object> map_e;
   private static LicenseState[] arr_f;
   private static final String[] CONST_H;
   private static final String[] CONST_I;
   private static final Map CONST_J = new HashMap(13);

   public ImageUtil18() {
      long var1 = 72375026234359L;
      super();
      Util27[] var10001 = new Util27[7];
      short var10006 = 32717;
      long var10007 = 1125900200489718332L ^ var1;
      var10001[0] = new Util27("brighter", 0, ImageUtil18::lambda$new_Inner5);
      var10006 = 31580;
      var10007 = 7533045479785109176L ^ var1;
      var10001[1] = new Util27("alpha", 0, ImageUtil18::lambda$new_Inner6);
      var10006 = 4340;
      var10007 = 6369965778568903945L ^ var1;
      var10001[2] = new Util27("sub", 1, ImageUtil18::lambda$new_Inner7);
      var10006 = 14617;
      var10007 = 2766067579021776111L ^ var1;
      var10001[3] = new Util27("div", 1, ImageUtil18::lambda$new_Inner8);
      var10006 = 27771;
      var10007 = 8858963641079103874L ^ var1;
      var10001[4] = new Util27("darker", 1, ImageUtil18::lambda$new_Inner9);
      var10006 = 26805;
      var10007 = 158602324278740301L ^ var1;
      var10001[5] = new Util27("add", 1, ImageUtil18::lambda$new_Inner10);
      var10006 = 20200;
      var10007 = 6471689799587406605L ^ var1;
      var10001[6] = new Util27("mul", 1, ImageUtil18::lambda$new_Inner11);
      this.list_d = Arrays.asList(var10001);
      this.map_e = new HashMap<>();
   }

   public static ImageUtil18 getDataBuilder41(Consumer<ImageUtil18> var0) {
      ImageUtil18 var1 = new ImageUtil18().getDataBuilder41_4();
      var0.accept(var1);
      return var1;
   }

   public static ImageUtil18 getDataBuilder41_2(String var0) throws Exception {
      long var1 = 48833334761934L;
      int var3 = (int)((var1 ^ 112114467467600L) >>> 48);
      long var4 = (var1 ^ 112114467467600L) << 16 >>> 16;
      rip.breeze.client.RotationUtil8 var6 = new rip.breeze.client.RotationUtil8().getDataBuilder14((char)var3, var4, var0);
      ImageUtil18 var7 = getDataBuilder41(ImageUtil18::lambda$generate_Inner12);
      var7.string_c = var0;
      return var7;
   }

   private static void processAll(ImageUtil18 var0, rip.breeze.client.RotationUtil8 var1) {
      try {
         Method var2 = var1.getClass().getDeclaredMethod("c", String.class);
         var2.setAccessible(true);
         CONST_B.forEach(ImageUtil18::lambda$recursivelyAdd_Inner13);
      } catch (NoSuchMethodException var3) {
         var3.printStackTrace();
      }
   }

   private static Color getColor(List<Number> var0) {
      long var1 = 110950316898950L;
      if (var0 == null) {
         return null;
      }

      int var3 = var0.size() > 3 ? ((Number)var0.get(3)).intValue() : 255;
      return new Color(((Number)var0.get(0)).intValue(), ((Number)var0.get(1)).intValue(), ((Number)var0.get(2)).intValue(), var3);
   }

   public Object getObject(String var1) {
      long var2 = 66865615502784L;
      int var10000 = AuthSession.getValue();
      Object var4 = this.map_e.get(var1);
      int var5 = var10000;
      String var6 = null;
      if (var4 instanceof String) {
         var6 = (String)var4;
      } else {
         label53: {
            try {
               if (var4 != null || !var1.contains("::")) {
                  break label53;
               }
            } catch (Exception var15) {
               throw getException(var15);
            }

            var6 = var1;
         }
      }

      if (var6 != null) {
         List var7 = Arrays.asList(var6.split("::"));
         Object var8 = this.getObject((String)var7.get(0));

         try {
            int var9 = 1;

            while (var9 < var7.size()) {
               String[] var10 = ((String)var7.get(var9)).split(";");
               String var11 = var10[0];
               ArrayList var12 = new ArrayList();
               int var13 = 1;

               while (var13 < var10.length) {
                  var12.add(Float.parseFloat(var10[var13]));
                  var13++;
                  if (var5 == 0) {
                     break;
                  }
               }

               Util27 var16 = this.list_d.stream().filter(ImageUtil18::lambda$get_Inner14).findFirst().orElse(null);
               if (var16 != null) {
                  var8 = var16.getObject(var8, var12);
               }

               var9++;
               if (var5 == 0) {
                  break;
               }
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }

         this.initialize(var1, var8);
         return var8;
      } else {
         return var4;
      }
   }

   public String getString(String var1) {
      long var2 = 5414815864800L;
      return !this.map_e.containsKey(var1) ? "" : this.map_e.get(var1).toString();
   }

   public float getFloat(String var1) {
      long var2 = 15400515467557L;

      try {
         if (this.getObject(var1) == null) {
            return 0.0F;
         }
      } catch (Exception var5) {
         throw getException(var5);
      }

      try {
         if (this.getObject(var1) instanceof Integer) {
            return ((Integer)this.getObject(var1)).intValue();
         }
      } catch (Exception var8) {
         throw getException(var8);
      }

      try {
         return Float.parseFloat(this.getObject(var1).toString());
      } catch (Exception var7) {
         try {
            if (this == CONST_A) {
               return 0.0F;
            }
         } catch (Exception var6) {
            throw getException(var6);
         }

         return CONST_A.getFloat(var1);
      }
   }

   public Color getColor_2(String var1) {
      long var2 = 95156751170720L;
      Object var4 = this.getObject(var1);

      try {
         if (var4 == null) {
            return Color.WHITE;
         }
      } catch (Exception var8) {
         throw getException(var8);
      }

      try {
         return (Color)var4;
      } catch (Exception var7) {
         try {
            if (this == CONST_A) {
               return Color.WHITE;
            }
         } catch (Exception var6) {
            throw getException(var6);
         }

         return CONST_A.getColor_2(var1);
      }
   }

   public boolean isValid(String var1) {
      long var2 = 83895732059284L;

      try {
         if (this.getObject(var1) == null) {
            return false;
         }
      } catch (Exception var7) {
         throw getException(var7);
      }

      try {
         return (Boolean)this.getObject(var1);
      } catch (Exception var6) {
         try {
            if (this == CONST_A) {
               return false;
            }
         } catch (Exception var5) {
            throw getException(var5);
         }

         return CONST_A.isValid(var1);
      }
   }

   public void initialize(String var1, Object var2) {
      this.map_e.put(var1, var2);
   }

   public ImageUtil18 getDataBuilder41_3(Consumer<ImageUtil18> var1) {
      var1.accept(this);
      return this;
   }

   public ImageUtil18 getDataBuilder41_4() {
      this.map_e.putAll(CONST_B);
      return this;
   }

   public UserTheme getUserTheme() {
      long var1 = 87875523376295L;
      long var3 = var1 ^ 12489602192159L;
      long var5 = var1 ^ 56797255813638L;
      long var7 = var1 ^ 41726947052696L;
      UserTheme var9 = new UserTheme();
      int var10000 = AuthSession.getValue();
      var9.processNullable(
         "accent",
         var7,
         this.getBreezeIterable(this.getColor_2("default.accent"))
      );
      var9.processNullable(
         "text-primary",
         var7,
         this.getBreezeIterable(this.getColor_2("default.text-primary"))
      );
      var9.processNullable(
         "text-secondary",
         var7,
         this.getBreezeIterable(this.getColor_2("default.text-secondary"))
      );
      int var10 = var10000;
      var9.processNullable(
         "layer-zero",
         var7,
         this.getBreezeIterable(this.getColor_2("default.layer-zero"))
      );
      var9.processNullable(
         "layer-one",
         var7,
         this.getBreezeIterable(this.getColor_2("default.layer-one"))
      );
      var9.processNullable(
         "border",
         var7,
         this.getBreezeIterable(this.getColor_2("panel.border"))
      );
      var9.update_1("square-design", !this.isValid("settings.rounded-design"), var5);
      var9.runCloudJob(var3, "corner-radius", this.getFloat("default.corner-radius"));
      var9.runCloudJob(var3, "border-thickness", this.getFloat("panel.border-thickness"));
      if (var10 == 0) {
         LicenseState.toggle(LicenseState.isValid_2());
      }

      return var9;
   }

   private BreezeIterable getBreezeIterable(Color var1) {
      long var2 = 43753958294017L;
      long var4 = var2 ^ 1078026735618L;
      BreezeIterable var6 = new BreezeIterable();
      var6.processAll(var1.getRed(), var4);
      var6.processAll(var1.getGreen(), var4);
      var6.processAll(var1.getBlue(), var4);
      var6.processAll(var1.getAlpha(), var4);
      return var6;
   }

   @Override
   public String toString() {
      long var1 = 58443501958339L;
      return this == CONST_A ? "DEFAULT" : this.string_c;
   }

   public String getString_c() {
      return this.string_c;
   }

   private static boolean lambda$get_Inner14(String var0, Util27 var1) {
      return var1.getString_a().equalsIgnoreCase(var0);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void lambda$recursivelyAdd_Inner13(rip.breeze.client.RotationUtil8 var0, Method var1, ImageUtil18 var2, String var3, Object var4) {
      long var5 = 16554908947271L;
      long var7 = var5 ^ 125623933274896L;
      int var9 = AuthSession.getValue();
      if (var0.isValid(var7, var3)) {
         IllegalAccessException var10;
         label36: {
            try {
               var15 = var1.invoke(var0, var3);
               if (var15 instanceof ArrayList) {
                  var2.initialize(var3, getColor((List<Number>)var15));
                  return;
               }
            } catch (IllegalAccessException | InvocationTargetException var14) {
               var10 = var14;
               break label36;
            }

            try {
               var2.initialize(var3, var15);
               return;
            } catch (IllegalAccessException | InvocationTargetException var13) {
               var10 = var13;
            }
         }

         try {
            var10.printStackTrace();
            if (var9 != 0) {
               return;
            }
         } catch (IllegalAccessException var12) {
            throw getException(var12);
         }
      }

      try {
         var2.initialize(var3, var4);
      } catch (IllegalAccessException var11) {
         throw getException(var11);
      }
   }

   private static void lambda$generate_Inner12(rip.breeze.client.RotationUtil8 var0, ImageUtil18 var1) {
      processAll(var1, var0);
   }

   private static Object lambda$new_Inner11(Object var0, List var1) {
      long var2 = 62986022169735L;
      if (!(var0 instanceof Number)) {
         return var0;
      }

      Number var4 = (Number)var0;
      float var5 = !var1.isEmpty() ? var1.get(0) : 1.0F;
      return var4.floatValue() / var5;
   }

   private static Object lambda$new_Inner10(Object var0, List var1) {
      long var2 = 69758236037519L;
      if (!(var0 instanceof Number)) {
         return var0;
      }

      Number var4 = (Number)var0;
      float var5 = !var1.isEmpty() ? var1.get(0) : 1.0F;
      return var4.floatValue() * var5;
   }

   private static Object lambda$new_Inner9(Object var0, List var1) {
      long var2 = 117207866547737L;
      if (!(var0 instanceof Number)) {
         return var0;
      }

      Number var4 = (Number)var0;
      float var5 = !var1.isEmpty() ? var1.get(0) : 1.0F;
      return var4.floatValue() - var5;
   }

   private static Object lambda$new_Inner8(Object var0, List var1) {
      long var2 = 139239002658917L;
      if (!(var0 instanceof Number)) {
         return var0;
      }

      Number var4 = (Number)var0;
      float var5 = !var1.isEmpty() ? var1.get(0) : 1.0F;
      return var4.floatValue() + var5;
   }

   private static Object lambda$new_Inner7(Object var0, List var1) {
      long var2 = 36690842226594L;
      if (!(var0 instanceof Color)) {
         return var0;
      }

      Color var4 = (Color)var0;
      int var5 = !var1.isEmpty() ? var1.get(0).intValue() : 255;
      return RenderUtil1.getColor_7(var4, var5);
   }

   private static Object lambda$new_Inner6(Object var0, List var1) {
      long var2 = 11351855228760L;
      if (!(var0 instanceof Color)) {
         return var0;
      }

      Color var4 = (Color)var0;
      int var5 = !var1.isEmpty() ? var1.get(0).intValue() : 10;
      return new Color(
         MathUtil1.clamp_2(var4.getRed() - var5, 0, 255),
         MathUtil1.clamp_2(var4.getGreen() - var5, 0, 255),
         MathUtil1.clamp_2(var4.getBlue() - var5, 0, 255),
         var4.getAlpha()
      );
   }

   private static Object lambda$new_Inner5(Object var0, List var1) {
      long var2 = 45699104223771L;
      if (!(var0 instanceof Color)) {
         return var0;
      }

      Color var4 = (Color)var0;
      int var5 = !var1.isEmpty() ? var1.get(0).intValue() : 10;
      return new Color(
         MathUtil1.clamp_2(var4.getRed() + var5, 0, 255),
         MathUtil1.clamp_2(var4.getGreen() + var5, 0, 255),
         MathUtil1.clamp_2(var4.getBlue() + var5, 0, 255),
         var4.getAlpha()
      );
   }

   private static void lambda$static_Inner4(StringBuilder var0, String var1, List var2) {
      long var3 = 127741338731048L;
      var0.append("###")
         .append(var1)
         .append('\n')
         .append("|Key|Default Value|Description|")
         .append('\n')
         .append("|---|-------------|-----------|")
         .append('\n');
      var2.forEach(ImageUtil18::lambda$null_Inner3);
   }

   private static void lambda$null_Inner3(StringBuilder var0, Util17 var1) {
      long var2 = 11773908395178L;
      var0.append("|")
         .append((CharSequence)var1.getObject_a(), 0, ((String)var1.getObject_a()).length() - 1)
         .append("|")
         .append((String)var1.getObject_b())
         .append("||")
         .append('\n');
   }

   private static void lambda$static_Inner2(LinkedHashMap var0, String var1) {
      long var2 = 126194125436363L;
      Object var4 = CONST_B.get(var1);
      String[] var5 = var1.split(Pattern.quote("."));
      var0.computeIfAbsent(var5[0], ImageUtil18::lambda$null_Inner0);
      ((List)var0.get(var5[0]))
         .add(
            new Util17<>(
               Arrays.stream(var5).skip(1L).map(ImageUtil18::lambda$null_Inner1).collect(Collectors.joining()),
               var4 instanceof Color
                  ? "["
                     + ((Color)var4).getRed()
                     + ","
                     + ((Color)var4).getGreen()
                     + ","
                     + ((Color)var4).getBlue()
                     + (((Color)var4).getAlpha() != 255 ? "," + ((Color)var4).getAlpha() : "")
                     + "]"
                  : CONST_B.get(var1).toString()
            )
         );
   }

   private static String lambda$null_Inner1(String var0) {
      return var0 + '.';
   }

   private static List lambda$null_Inner0(String var0) {
      return new ArrayList();
   }

   static {
      long var0 = 120534814658824L;
      initialize_2(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[33];
      int var5 = 0;
      String var6 = "¦î0\u008fí\u0086á-LVÞ0\u0017(gÑ\u0010Î\r¿\u0083á¾+Z\u0003¯ä\u008bßÙbv\u0018\u0011\fÎôË\u0083Ý5é9/\u0002H`\u0002~\bbiÒ®ñx3\u0010\u0091Ør\u0001ÿÆtÍâç\u0003\u0018Gq{®(\u008eeÑ»\u0002µXK\u009eFð\fu\u0082*lAÕ2\u0094\u0006¯&tP\u0000S9 l¸\u0094îò®L\u0019Çim\u0010:Z¢/4)Ý¨\u007f\u0090Ýß£fá-\u0018ÐÖÝUÔÈu\u0084s\n$Çsç^½Õt*Þ;*¯1 \\\u0083\u000b[\u0099\f§C_×ÛíÎýö¡É\u0094\u00178\u0093PÎ\u0082Ì\u0082\n9\"½aÑ(½Ê\u000eÃ\u0094ÅèêÂ\u0094j?\u0010\u0000\u0095zP\u0012¡\\\u008aÓ'«\u0092Ib~\u001d:d\u0010§¹Q÷\u001b\u000bhû\u0018çUo^\u0003¦ôÐ4\u008eñSéÆ~g\u0006sú{\u001c½\u0094î \n\u009d²Ò\u00ad°[ÝWK/\u009e>ûkâD\u0012}k´èËyØ\u0015\u001cìñ\u0003\u009c\u0090\u0010\u008cv\u0003²'u\u009d\u0006.°e\u0082è\u0002Ã{8|öæNìÛ\u0014eÂ7\u001e\u0006å>»n\u0010Û`£\u0012I\u000fäæ%è\u0004_½Ö£&¹\u0094H\\\u0084`oF~Á¤¶í^×\u009e0ëb#sJ×0E·£$ûÜñcºj\u0010\u008e¡\tçö×S×>óþÔ\u0088\u001d*ÁJâ¨QïÌæ;5È¯\u008c&µ\\ÐÂ\u0094\u000ed\u0000\u0010D\u0003\u008f|+Ò±U\u0092\u0082\u0082\u007fJ;\u001a\u0087\u0018¥\u0013¼¥\u0001x\u008f\u0080SYrhE*lÓ\u007f\u0094\u0004}]¸H\u001c\u0010VCê\u001fA\u0018\u0013\u0092mÎ\u001fÆz~P\u001c <j)õ\u0083\u007féâ\u0014%·Ë¤G\"¥3ü\u0080E¦rßi¼ê½è8\u0093cK\u0010\u008dXcï\u0081\u000bÆ\u009cWt¸MÞX\u0080=\u0010\u0091ïaf§\\\u0086Àá\u008cÊ\u0010=Íú¥(ã}»ùúà\u000fÐ÷\u001aj\u0083tª\u0088ÝrÞÉiÑ_¾ª\u0007íL=«\bg2a¤©\u009cn[Âù(Ú!\u0083 WäqÐap§3¶RÍ\"XÆTû½¬\u0005©æÕ\t,\u0012\t|õTÍ\u0005ÐdÜµ\u0010\u0010FõÄEËùÞ;\u0085¼ú\u007f¸lA( ]\u0090ZÝ\u007fàn£¯õôuÜì\nR÷í\u0019?Íg¢\u00808va\u0096ïI¦v(cM&º\u008aÿÝ?Æjø:fwáÒj\u0012Ã\b¨g6\u009d\u0000@\u009c\u000f\u0090l\u0015µ½\u0086(fUú\u0001\f\u0018Rø&Á\u0084ÆçJÖ\u0086\u0005£\u0011F\u0097mU2´Ë3U\u007fÑ\u00106\u00964æ¹©ÏvÜ}åë\u0004T'´(\u0090ä\u0007áø\u008e`1\u0017Nr\u008e÷L·B¡¼ªI<æ¶\u0017Þk¬¢\f»1¬÷d%[g\u008c²\u001d\u0010A\u0004àêbf!\t.²\u009d²U*·\u001c\u0010Ór^Nkç½\t\u0094Ý\u0014ÆÆMNt(»©\u008fX\fÁm\rcCÐG\u0010LÔ»\u0003ø¾ÅïÃV\u0000\u001f¹\u0007ç\tÞ6%'EË\u009e\u0082§\u0011ü";
      int var7 = "¦î0\u008fí\u0086á-LVÞ0\u0017(gÑ\u0010Î\r¿\u0083á¾+Z\u0003¯ä\u008bßÙbv\u0018\u0011\fÎôË\u0083Ý5é9/\u0002H`\u0002~\bbiÒ®ñx3\u0010\u0091Ør\u0001ÿÆtÍâç\u0003\u0018Gq{®(\u008eeÑ»\u0002µXK\u009eFð\fu\u0082*lAÕ2\u0094\u0006¯&tP\u0000S9 l¸\u0094îò®L\u0019Çim\u0010:Z¢/4)Ý¨\u007f\u0090Ýß£fá-\u0018ÐÖÝUÔÈu\u0084s\n$Çsç^½Õt*Þ;*¯1 \\\u0083\u000b[\u0099\f§C_×ÛíÎýö¡É\u0094\u00178\u0093PÎ\u0082Ì\u0082\n9\"½aÑ(½Ê\u000eÃ\u0094ÅèêÂ\u0094j?\u0010\u0000\u0095zP\u0012¡\\\u008aÓ'«\u0092Ib~\u001d:d\u0010§¹Q÷\u001b\u000bhû\u0018çUo^\u0003¦ôÐ4\u008eñSéÆ~g\u0006sú{\u001c½\u0094î \n\u009d²Ò\u00ad°[ÝWK/\u009e>ûkâD\u0012}k´èËyØ\u0015\u001cìñ\u0003\u009c\u0090\u0010\u008cv\u0003²'u\u009d\u0006.°e\u0082è\u0002Ã{8|öæNìÛ\u0014eÂ7\u001e\u0006å>»n\u0010Û`£\u0012I\u000fäæ%è\u0004_½Ö£&¹\u0094H\\\u0084`oF~Á¤¶í^×\u009e0ëb#sJ×0E·£$ûÜñcºj\u0010\u008e¡\tçö×S×>óþÔ\u0088\u001d*ÁJâ¨QïÌæ;5È¯\u008c&µ\\ÐÂ\u0094\u000ed\u0000\u0010D\u0003\u008f|+Ò±U\u0092\u0082\u0082\u007fJ;\u001a\u0087\u0018¥\u0013¼¥\u0001x\u008f\u0080SYrhE*lÓ\u007f\u0094\u0004}]¸H\u001c\u0010VCê\u001fA\u0018\u0013\u0092mÎ\u001fÆz~P\u001c <j)õ\u0083\u007féâ\u0014%·Ë¤G\"¥3ü\u0080E¦rßi¼ê½è8\u0093cK\u0010\u008dXcï\u0081\u000bÆ\u009cWt¸MÞX\u0080=\u0010\u0091ïaf§\\\u0086Àá\u008cÊ\u0010=Íú¥(ã}»ùúà\u000fÐ÷\u001aj\u0083tª\u0088ÝrÞÉiÑ_¾ª\u0007íL=«\bg2a¤©\u009cn[Âù(Ú!\u0083 WäqÐap§3¶RÍ\"XÆTû½¬\u0005©æÕ\t,\u0012\t|õTÍ\u0005ÐdÜµ\u0010\u0010FõÄEËùÞ;\u0085¼ú\u007f¸lA( ]\u0090ZÝ\u007fàn£¯õôuÜì\nR÷í\u0019?Íg¢\u00808va\u0096ïI¦v(cM&º\u008aÿÝ?Æjø:fwáÒj\u0012Ã\b¨g6\u009d\u0000@\u009c\u000f\u0090l\u0015µ½\u0086(fUú\u0001\f\u0018Rø&Á\u0084ÆçJÖ\u0086\u0005£\u0011F\u0097mU2´Ë3U\u007fÑ\u00106\u00964æ¹©ÏvÜ}åë\u0004T'´(\u0090ä\u0007áø\u008e`1\u0017Nr\u008e÷L·B¡¼ªI<æ¶\u0017Þk¬¢\f»1¬÷d%[g\u008c²\u001d\u0010A\u0004àêbf!\t.²\u009d²U*·\u001c\u0010Ór^Nkç½\t\u0094Ý\u0014ÆÆMNt(»©\u008fX\fÁm\rcCÐG\u0010LÔ»\u0003ø¾ÅïÃV\u0000\u001f¹\u0007ç\tÞ6%'EË\u009e\u0082§\u0011ü"
         .length();
      char var8 = 16;
      int var17 = -1;

      label39:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var24 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var24;
                  if ((var17 += var8) >= var7) {
                     CONST_H = var4;
                     CONST_I = new String[33];
                     CONST_B = new OrderedConfigMap();
                     CONST_A = new ImageUtil18().getDataBuilder41_4();
                     boolean var11 = false;
                     if (var11) {
                        try {
                           File var12 = new File("theme.md");
                           if (!var12.exists()) {
                              var12.createNewFile();
                              StringBuilder var13 = new StringBuilder();
                              LinkedHashMap var14 = new LinkedHashMap();
                              CONST_B.keySet().forEach(ImageUtil18::lambda$static_Inner2);
                              var14.forEach(ImageUtil18::lambda$static_Inner4);
                              HttpUtil2.isValid(var12, var13.toString());
                           }
                        } catch (Exception var15) {
                           var15.printStackTrace();
                        }
                     }

                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var24;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label39;
                  }

                  var6 = "v\u009fò{\u008a*é\u0006¾Z[\u0096\u009fÁ\u0086Ö¤FOZ\u009e\u0000X#¹o3%\u0084·\u0000R`&¬Àöê\u009eI '®·-\u001eÀ\u0001©\u001ct¾¦ìwU¿Ë×Ô:\u0084ê\u0001×\f4\u0097Ã¸Ðtø";
                  var7 = "v\u009fò{\u008a*é\u0006¾Z[\u0096\u009fÁ\u0086Ö¤FOZ\u009e\u0000X#¹o3%\u0084·\u0000R`&¬Àöê\u009eI '®·-\u001eÀ\u0001©\u001ct¾¦ìwU¿Ë×Ô:\u0084ê\u0001×\f4\u0097Ã¸Ðtø"
                     .length();
                  var8 = '(';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize_2(LicenseState[] var0) {
      arr_f = var0;
   }

   public static LicenseState[] values() {
      return arr_f;
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24079;
      if (CONST_I[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_J.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cO", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_H[var3].getBytes("ISO-8859-1");
         CONST_I[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_I[var3];
   }

   private static Object getObject_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getObject_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/cO" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
