package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.Unsafe;

public class ո<T> {
   private static Unsafe unsafe_ÿ_2;
   private final Class<T> class_þ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   private static Unsafe invoke_1(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = encKey_a_2 ^ var1;
      String[] var3 = չ.method_069();

      try {
         if (var3 == null) {
            return unsafe_ÿ_2;
         }

         if (unsafe_ÿ_2 != null) {
            return unsafe_ÿ_2;
         }
      } catch (Throwable var11) {
         throw method_008(var11);
      }

      Field[] var4 = Unsafe.class.getDeclaredFields();
      int var5 = var4.length;
      int var6 = 0;

      Field var7;
      while (true) {
         if (var6 >= var5) {
            return unsafe_ÿ_2;
         }

         var7 = var4[var6];

         String[] var13;
         label48: {
            label47: {
               try {
                  var13 = var3;
                  if (var1 <= 0L) {
                     break label48;
                  }

                  if (var3 == null) {
                     break label47;
                  }

                  if (var7.getType() == Unsafe.class) {
                     break;
                  }
               } catch (Throwable var10) {
                  throw method_008(var10);
               }

               var6++;
            }

            var13 = var3;
         }

         if (var13 == null) {
            return unsafe_ÿ_2;
         }
      }

      var7.setAccessible(true);

      try {
         unsafe_ÿ_2 = (Unsafe)var7.get(null);
      } catch (Throwable var9) {
         throw new RuntimeException(((String)null), var9);
      }

      return unsafe_ÿ_2;
   }

   public static String invoke_2(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic rip/breeze/classtransform/ո.encKey_a_2 J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 1c: ldc rip/breeze/classtransform/ո
      // 1e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 21: astore 4
      // 23: astore 5
      // 25: aload 4
      // 27: ldc "."
      // 29: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2c: aload 5
      // 2e: ifnull 48
      // 31: ifne 41
      // 34: goto 3b
      // 37: invokestatic rip/breeze/classtransform/ո.method_008 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 1
      // 3c: areturn
      // 3d: invokestatic rip/breeze/classtransform/ո.method_008 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 4
      // 43: bipush 46
      // 45: invokevirtual java/lang/String.lastIndexOf (I)I
      // 48: istore 6
      // 4a: aload 4
      // 4c: bipush 0
      // 4d: iload 6
      // 4f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 52: astore 7
      // 54: aload 7
      // 56: bipush 46
      // 58: bipush 47
      // 5a: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 5d: astore 8
      // 5f: new java/lang/StringBuilder
      // 62: dup
      // 63: invokespecial java/lang/StringBuilder.<init> ()V
      // 66: aload 8
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: ldc "/"
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70: aload 1
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 77: areturn
      // try (22 -> 28): 29 java/lang/RuntimeException
      // try (27 -> 33): 33 java/lang/RuntimeException
   }

   public static ո invoke_3(Object[] var0) {
      long var1 = (Long)var0[0];
      byte[] var3 = (byte[])var0[1];
      var1 = encKey_a_2 ^ var1;
      long var4 = var1 ^ 33906359352488L;
      String[] var6 = չ.method_069();

      try {
         Method var15 = Unsafe.class.getDeclaredMethod(((String)null), Class.class, byte[].class, Object[].class);
         return new ո((Class<?>)var15.invoke(method_001(new Object[]{var4}), ո.class, var3, new Object[0]));
      } catch (Throwable var13) {
         ո var10000;
         try {
            Class var7 = Class.forName(((String)null));
            Object var9 = Array.newInstance(var7, 0);
            Method var10 = Lookup.class.getDeclaredMethod(((String)null), byte[].class, boolean.class, var9.getClass());
            Lookup var11 = (Lookup)var10.invoke(MethodHandles.lookup(), var3, false, var9);
            var10000 = new ո(var11.lookupClass());
         } catch (Throwable var12) {
            var12.addSuppressed(var13);
            throw new RuntimeException(((String)null), var12);
         }

         byte var10001 = rip.breeze.inject.ջ.method_013();
         if (var1 >= 0L) {
            if (var10001 != 0) {
               return var10000;
            }

            var10001 = 4;
         }

         չ.method_068(new String[var10001]);
         return var10000;
      }
   }

   private ո(Class<?> var1) {
      this.class_þ_2 = var1;
   }

   public Class invoke_4(Object[] var1) {
      return this.class_þ_2;
   }

   public Object call_5(Object[] var1) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 79789589490465L;
      return this.method_006(new Object[]{var4, new Object[0]});
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public Object call_6(Object... var1) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      long var2 = (Long)var1[0];
      Object[] var4 = (Object[])var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 33469921465630L;
      Class[] var7 = new Class[var4.length];
      String[] var10000 = չ.method_069();
      int var8 = 0;
      String[] var9 = var10000;

      label30:
      while (true) {
         if (var8 < var4.length) {
            try {
               var13 = var7;
               if (var9 == null) {
                  break;
               }

               var7[var8] = var4[var8].getClass();
               var8++;
            } catch (InvocationTargetException var11) {
               throw method_008(var11);
            }

            do {
               try {
                  if (var9 != null) {
                     continue label30;
                  }
               } catch (InvocationTargetException var10) {
                  throw method_008(var10);
               }
            } while (var2 <= 0L);
         }

         var13 = this.method_007(new Object[]{var7, var5, var4});
         break;
      }

      return var13;
   }

   public Object call_7(Object[] var1) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
      Class[] var2 = (Class[])var1[0];
      long var3 = (Long)var1[1];
      Object[] var5 = (Object[])var1[2];
      var3 = encKey_a_2 ^ var3;

      try {
         if (var2.length != var5.length) {
            throw new IllegalArgumentException(((String)null));
         }
      } catch (NoSuchMethodException var7) {
         throw method_008(var7);
      }

      Constructor var6 = this.class_þ_2.getDeclaredConstructor(var2);
      var6.setAccessible(true);
      return var6.newInstance(var5);
   }

   static {
      long var0 = 224168118663L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "\r\u0088xýUæ¾·´\t\u0019¸ÒÝ\u001az\u009brìjDå\u008a$à\u0007ï»\u001a»W©¨Ì.N ¨B\"±Î-5yFB\u009dÓKuFÌ\u009dúÐZ¸¨zv²{bvÏL$OêJ\u000e\u007f¹Æ¯\u0094îJ.(\rFéå¶uÔ\u0018\u0003\u0017lòò+Qá\\\u0085($zÕ\u008b\nÌeÒ\t|æOúl«·°/&\u0083Ó@bé+°\u0081K\u0098ã]\" õÓ\u009a \u0006r\u0086G{¨FÛ¡\u0019\u009cíø ÿ3Íµ²LÀI¯¶C\u0091à\u009cáp\u0015¡\u001a8ÛåïÌ\u009aqñ[Ö¦E?\u008b\u001e»8\u001f\u0081\u0099)Ò22ÿ\u00ad=a\u000fèË!\u0092Êì\u0091=\u0098Å\u001e\u0081þUµ\u009eÍ\u0089ý\u008f³Î\u00ad\u0092_È+\u0086þ\u001eü\u008eµl\u0006Z\u008f\u0092æpt¦\u001cÑ";
      int var7 = "\r\u0088xýUæ¾·´\t\u0019¸ÒÝ\u001az\u009brìjDå\u008a$à\u0007ï»\u001a»W©¨Ì.N ¨B\"±Î-5yFB\u009dÓKuFÌ\u009dúÐZ¸¨zv²{bvÏL$OêJ\u000e\u007f¹Æ¯\u0094îJ.(\rFéå¶uÔ\u0018\u0003\u0017lòò+Qá\\\u0085($zÕ\u008b\nÌeÒ\t|æOúl«·°/&\u0083Ó@bé+°\u0081K\u0098ã]\" õÓ\u009a \u0006r\u0086G{¨FÛ¡\u0019\u009cíø ÿ3Íµ²LÀI¯¶C\u0091à\u009cáp\u0015¡\u001a8ÛåïÌ\u009aqñ[Ö¦E?\u008b\u001e»8\u001f\u0081\u0099)Ò22ÿ\u00ad=a\u000fèË!\u0092Êì\u0091=\u0098Å\u001e\u0081þUµ\u009eÍ\u0089ý\u008f³Î\u00ad\u0092_È+\u0086þ\u001eü\u008eµl\u0006Z\u008f\u0092æpt¦\u001cÑ"
         .length();
      char var8 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_009(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[6];
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

                  var6 = "x_*ú\u0017hàtö¥\u008f×|¸ê\u0081\u0012Q¼µ-\u0086_¾tÃO¶Ì§H_øÉkfxÕ\u0013\u0084b\u008cÕ·2ºþµ[+\u0019!¡'?\u0011Ä°¼¹èÕå\u008f.ó³9[Ü¿/;/°Ë¸Wi\"U\u0019%RÄò\u0086\u001c(«ú\u009c\u008cÖCóè\u0014yj1÷ç<Fp<sIv(°vOäÛò!aSåÁù[Rm\u008f\u007f'";
                  var7 = "x_*ú\u0017hàtö¥\u008f×|¸ê\u0081\u0012Q¼µ-\u0086_¾tÃO¶Ì§H_øÉkfxÕ\u0013\u0084b\u008cÕ·2ºþµ[+\u0019!¡'?\u0011Ä°¼¹èÕå\u008f.ó³9[Ü¿/;/°Ë¸Wi\"U\u0019%RÄò\u0086\u001c(«ú\u009c\u008cÖCóè\u0014yj1÷ç<Fp<sIv(°vOäÛò!aSåÁù[Rm\u008f\u007f'"
                     .length();
                  var8 = 'X';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_8(Throwable var0) {
      return var0;
   }

   private static String invoke_9(byte[] var0) {
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

   private static String invoke_10(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22025;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/ո", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_009(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_11(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_010(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_12(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_011".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ո" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
