package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class GenericSetting<T> {
   public final DateUtil dataBuilder51_a;
   public final String string_b;
   public final String string_c;
   public final T object_d;
   public final Function<T, String> formatter;
   public final Function<String, T> function_f;
   public final Function<T, T> function_g;
   public final Predicate<T> predicate_h;
   public final Predicate<DateUtil> predicate_i;
   public final boolean fieldBool_j;
   public final boolean fieldBool_k;
   private Consumer<T>[] arr_l;
   private T object_m;
   public float fieldFloat_n;
   public float fieldFloat_o;
   private static String[] arr_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public static <T> BlockUtil10<T> getDataBuilder50(DateUtil var0, String var1) {
      BlockUtil10 var2 = new BlockUtil10(var0);
      var2.string_c = var1;
      return var2;
   }

   public static <T> BlockUtil10<T> getDataBuilder50_2(DateUtil var0) {
      return new BlockUtil10<>(var0);
   }

   GenericSetting(
      DateUtil param1,
      String param2,
      String param3,
      T param4,
      Function<T, String> param5,
      Function<String, T> param6,
      Function<T, T> param7,
      Predicate<T> param8,
      Predicate<DateUtil> param9,
      Consumer<T>[] param10,
      Class<?> param11,
      boolean param12,
      boolean param13
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/GenericSetting.54593596683389L J
      // 03: ldc2_w 96834299584069
      // 06: lxor
      // 07: lstore 14
      // 09: aload 0
      // 0a: invokespecial java/lang/Object.<init> ()V
      // 0d: aload 0
      // 0e: aload 1
      // 0f: putfield rip/breeze/GenericSetting.dataBuilder51_a Lrip/breeze/DateUtil;
      // 12: aload 0
      // 13: aload 2
      // 14: putfield rip/breeze/GenericSetting.string_b Ljava/lang/String;
      // 17: aload 0
      // 18: aload 3
      // 19: putfield rip/breeze/GenericSetting.string_c Ljava/lang/String;
      // 1c: aload 0
      // 1d: aload 4
      // 1f: putfield rip/breeze/GenericSetting.object_d Ljava/lang/Object;
      // 22: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 25: aload 0
      // 26: aload 4
      // 28: putfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 2b: astore 16
      // 2d: aload 0
      // 2e: aload 5
      // 30: putfield rip/breeze/GenericSetting.formatter Ljava/util/function/Function;
      // 33: aload 0
      // 34: aload 6
      // 36: putfield rip/breeze/GenericSetting.function_f Ljava/util/function/Function;
      // 39: aload 0
      // 3a: aload 7
      // 3c: putfield rip/breeze/GenericSetting.function_g Ljava/util/function/Function;
      // 3f: aload 0
      // 40: aload 8
      // 42: putfield rip/breeze/GenericSetting.predicate_h Ljava/util/function/Predicate;
      // 45: aload 0
      // 46: aload 9
      // 48: putfield rip/breeze/GenericSetting.predicate_i Ljava/util/function/Predicate;
      // 4b: aload 0
      // 4c: aload 10
      // 4e: putfield rip/breeze/GenericSetting.arr_l [Ljava/util/function/Consumer;
      // 51: aload 0
      // 52: iload 12
      // 54: putfield rip/breeze/GenericSetting.fieldBool_k Z
      // 57: aload 0
      // 58: iload 13
      // 5a: putfield rip/breeze/GenericSetting.fieldBool_j Z
      // 5d: aload 1
      // 5e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 61: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 64: aload 11
      // 66: if_acmpeq 75
      // 69: aload 1
      // 6a: aload 0
      // 6b: invokevirtual rip/breeze/DateUtil.processAll (Lrip/breeze/GenericSetting;)V
      // 6e: goto 75
      // 71: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 16
      // 77: ifnonnull 93
      // 7a: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 7d: ifne 8f
      // 80: goto 87
      // 83: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: bipush 0
      // 88: goto 90
      // 8b: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: bipush 1
      // 90: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 93: return
      // try (23 -> 55): 56 java/lang/IllegalArgumentException
      // try (58 -> 62): 63 java/lang/IllegalArgumentException
      // try (60 -> 67): 67 java/lang/IllegalArgumentException
   }

   @Override
   public String toString() {
      return this.formatter.apply(this.object_m);
   }

   public T getObject_m() {
      return this.object_m;
   }

   public boolean isValid(T var1) {
      return Objects.equals(this.object_m, var1);
   }

   public void processAll(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 05
      // 04: return
      // 05: getstatic rip/breeze/GenericSetting.54593596683389L J
      // 08: ldc2_w 122603027147140
      // 0b: lxor
      // 0c: lstore 2
      // 0d: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 10: astore 4
      // 12: aload 0
      // 13: getfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 16: aload 1
      // 17: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1a: ifeq 22
      // 1d: return
      // 1e: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield rip/breeze/GenericSetting.predicate_h Ljava/util/function/Predicate;
      // 26: ifnull 42
      // 29: aload 0
      // 2a: getfield rip/breeze/GenericSetting.predicate_h Ljava/util/function/Predicate;
      // 2d: aload 1
      // 2e: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // 33: ifne 42
      // 36: goto 3d
      // 39: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: return
      // 3e: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 46: astore 5
      // 48: aload 0
      // 49: aload 1
      // 4a: putfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 4d: aload 0
      // 4e: getfield rip/breeze/GenericSetting.arr_l [Ljava/util/function/Consumer;
      // 51: ifnull 80
      // 54: aload 0
      // 55: getfield rip/breeze/GenericSetting.arr_l [Ljava/util/function/Consumer;
      // 58: astore 6
      // 5a: aload 6
      // 5c: arraylength
      // 5d: istore 7
      // 5f: bipush 0
      // 60: istore 8
      // 62: iload 8
      // 64: iload 7
      // 66: if_icmpge 80
      // 69: aload 6
      // 6b: iload 8
      // 6d: aaload
      // 6e: astore 9
      // 70: aload 9
      // 72: aload 1
      // 73: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 78: iinc 8 1
      // 7b: aload 4
      // 7d: ifnonnull 62
      // 80: aload 0
      // 81: getfield rip/breeze/GenericSetting.dataBuilder51_a Lrip/breeze/DateUtil;
      // 84: aload 0
      // 85: invokevirtual rip/breeze/DateUtil.noOp (Lrip/breeze/GenericSetting;)V
      // 88: return
      // try (9 -> 15): 15 java/lang/IllegalArgumentException
      // try (17 -> 25): 26 java/lang/IllegalArgumentException
      // try (20 -> 29): 29 java/lang/IllegalArgumentException
   }

   public void processNullable(T var1) {
      long var2 = 87956730386908L;
      String var4 = DateUtil.getString();

      try {
         if (Objects.equals(this.object_m, var1)) {
            return;
         }
      } catch (IllegalArgumentException var9) {
         throw getException(var9);
      }

      this.object_m = (T)var1;
      if (this.arr_l != null) {
         for (Consumer var8 : this.arr_l) {
            var8.accept(var1);
            if (var4 == null) {
               break;
            }
         }
      }

      this.dataBuilder51_a.noOp(this);
   }

   public boolean checkCondition(Enum<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/GenericSetting.54593596683389L J
      // 03: ldc2_w 140247975061400
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 0b: astore 4
      // 0d: aload 1
      // 0e: ifnull 1f
      // 11: aload 0
      // 12: getfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 15: ifnonnull 25
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 29: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2c: astore 5
      // 2e: aload 5
      // 30: invokevirtual java/lang/Class.isArray ()Z
      // 33: ifeq 48
      // 36: aload 5
      // 38: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 3b: invokevirtual java/lang/Class.isEnum ()Z
      // 3e: ifne 4e
      // 41: goto 48
      // 44: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
      // 4a: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/GenericSetting.object_m Ljava/lang/Object;
      // 52: checkcast [Ljava/lang/Object;
      // 55: checkcast [Ljava/lang/Object;
      // 58: astore 6
      // 5a: aload 6
      // 5c: arraylength
      // 5d: istore 7
      // 5f: bipush 0
      // 60: istore 8
      // 62: iload 8
      // 64: iload 7
      // 66: if_icmpge 84
      // 69: aload 6
      // 6b: iload 8
      // 6d: aaload
      // 6e: astore 9
      // 70: aload 9
      // 72: aload 1
      // 73: if_acmpne 7c
      // 76: bipush 1
      // 77: ireturn
      // 78: invokestatic rip/breeze/GenericSetting.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: iinc 8 1
      // 7f: aload 4
      // 81: ifnonnull 62
      // 84: bipush 0
      // 85: ireturn
      // try (6 -> 11): 12 java/lang/IllegalArgumentException
      // try (8 -> 16): 16 java/lang/IllegalArgumentException
      // try (22 -> 29): 30 java/lang/IllegalArgumentException
      // try (25 -> 34): 34 java/lang/IllegalArgumentException
      // try (53 -> 58): 58 java/lang/IllegalArgumentException
   }

   public void processAll_2(String var1) {
      long var2 = 47282948480602L;

      try {
         if (this.function_f == null) {
            throw new IllegalArgumentException(
               String.format("Setting %s/%s does not support string values.", this.dataBuilder51_a.getString(), this.string_b)
            );
         }
      } catch (Exception var6) {
         throw getException(var6);
      }

      try {
         this.processAll(this.function_f.apply(var1));
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void initialize() {
      this.processAll(this.object_d);
   }

   public void processAll_3(String var1) {
      long var2 = 136867895464202L;

      try {
         if (this.function_f == null) {
            throw new IllegalArgumentException(
               String.format("Setting %s/%s does not support string values.", this.dataBuilder51_a.getString(), this.string_b)
            );
         }
      } catch (Exception var6) {
         throw getException(var6);
      }

      try {
         this.processAll(this.function_f.apply(var1.trim()));
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void processNullable_2() {
      long var1 = 76740612033624L;
      String var3 = DateUtil.getString();

      try {
         if (this.function_g == null) {
            return;
         }
      } catch (IllegalArgumentException var4) {
         throw getException(var4);
      }

      while (!this.isValid_2(this.function_g.apply(this.object_m))) {
         this.object_m = this.function_g.apply(this.object_m);
         if (var3 == null) {
            break;
         }
      }

      this.processAll(this.function_g.apply(this.object_m));
   }

   public boolean isValid_2(T var1) {
      long var2 = 95747738725543L;

      try {
         if (this.predicate_h == null) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw getException(var4);
      }

      try {
         if (var1 == null) {
            return false;
         }
      } catch (IllegalArgumentException var5) {
         throw getException(var5);
      }

      return this.predicate_h.test((T)var1);
   }

   public boolean isValid_3(String var1) {
      try {
         return this.isValid_2(this.function_f.apply(var1));
      } catch (Exception var3) {
         return false;
      }
   }

   public boolean isValid_4() {
      long var1 = 17715807349324L;

      try {
         if (this.predicate_i == null) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw getException(var3);
      }

      return this.predicate_i.test(this.dataBuilder51_a);
   }

   public void calculate(Consumer<T> var1) {
      this.arr_l = Arrays.copyOf(this.arr_l, this.arr_l.length + 1);
      this.arr_l[this.arr_l.length - 1] = var1;
   }

   public GenericSetting<?> getDataBuilder54(DateUtil var1, boolean var2) {
      long var3 = 56901482686976L;

      GenericSetting var10000;
      GenericSetting var10001;
      DateUtil var10002;
      String var10003;
      String var10004;
      Object var10005;
      label22: {
         try {
            var10000 = new GenericSetting();
            var10001 = var10000;
            var10002 = var1;
            var10003 = this.string_b;
            var10004 = this.string_c;
            if (var2) {
               var10005 = this.object_d;
               break label22;
            }
         } catch (IllegalArgumentException var5) {
            throw getException(var5);
         }

         var10005 = this.object_m;
      }

      /* constructor call removed */
      return var10000;
   }

   public void setFloat_n(float var1) {
      this.fieldFloat_n = var1;
   }

   public void setFloat_o(float var1) {
      this.fieldFloat_o = var1;
   }

   public void initialize_2(float var1, float var2) {
      this.fieldFloat_o = var1;
      this.fieldFloat_n = var2;
   }

   public static void initialize_3(String[] var0) {
      arr_p = var0;
   }

   public static String[] decrypt() {
      return arr_p;
   }

   static {
      String[] var10000 = new String[5];
      initialize_3(var10000);
      long var0 = 38937842275649L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "§bñRß\u001aýeëþ7ñç9ì\u0087ÕË@²è¸2<ý\u001dsÁ\u0010`Aë\u0013\u0084µo\u0014XÀ)7ÄÂ[\u0005PJ3 \u0082\u008bnÇ\u0093\u0096{öÁÑ\u001c\u0082R\u00adÕh\u0005?\u0099ã \b\u0019PdÒ¨äg^nM@%\tG}\u0085\u0001 \u009cXüã\n%O\u000b\u0016\u0018÷\u0093\u007fñ{D\u0086ÙÅ\u0002®F\u0083\u0006\u0002×°ip¯ã¹LZ\u0084__\bò±5\u0010d\u0010ÿUO<Q\u009f\u0015\u0011~Ë¿?O5?Z\u0081gõ\u0001";
      int var7 = "§bñRß\u001aýeëþ7ñç9ì\u0087ÕË@²è¸2<ý\u001dsÁ\u0010`Aë\u0013\u0084µo\u0014XÀ)7ÄÂ[\u0005PJ3 \u0082\u008bnÇ\u0093\u0096{öÁÑ\u001c\u0082R\u00adÕh\u0005?\u0099ã \b\u0019PdÒ¨äg^nM@%\tG}\u0085\u0001 \u009cXüã\n%O\u000b\u0016\u0018÷\u0093\u007fñ{D\u0086ÙÅ\u0002®F\u0083\u0006\u0002×°ip¯ã¹LZ\u0084__\bò±5\u0010d\u0010ÿUO<Q\u009f\u0015\u0011~Ë¿?O5?Z\u0081gõ\u0001"
         .length();
      char var8 = 'H';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_R = var4;
            CONST_S = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31731;
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
            throw new RuntimeException("rip/breeze/cz", var10);
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
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/cz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
