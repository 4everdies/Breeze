package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

public abstract class StringBuilderUtil<T> extends Util132<T> {
   private static final Map<Scriptable, Map<Class<?>, Map<Object, Reference<StringBuilderUtil<?>>>>> CONST_L;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);

   protected StringBuilderUtil(T var1) {
      super((T)var1);
   }

   public static <T, W extends StringBuilderUtil<? super T>> W getDataBuilder12(T var0) {
      long var1 = 128165027528078L;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (IllegalStateException var18) {
         throw getIllegalStateException(var18);
      }

      Context var3 = Context.getCurrentContext();

      try {
         if (var3 == null) {
            throw new IllegalStateException("CachedWrapper.wrapCached must be called from a Rhino context");
         }
      } catch (IllegalStateException var17) {
         throw getIllegalStateException(var17);
      }

      Scriptable var4 = ScriptRuntime.getTopCallScope(var3);
      Class var5 = Util132.getClass(var0.getClass());

      try {
         if (var5 == null) {
            throw new IllegalStateException(
               "No wrapper registered for" + var0.getClass().getName() + ". Ensure ReflectiveScriptable.define was called."
            );
         }
      } catch (IllegalStateException var16) {
         throw getIllegalStateException(var16);
      }

      Map var6 = CONST_L.computeIfAbsent(var4, StringBuilderUtil::lambda$wrapCached_Inner0).computeIfAbsent(var5, StringBuilderUtil::lambda$wrapCached_Inner1);
      synchronized (var6) {
         Reference var8 = (Reference)var6.get(var0);

         StringBuilderUtil var10000;
         label61: {
            try {
               if (var8 != null) {
                  var10000 = (StringBuilderUtil)var8.get();
                  break label61;
               }
            } catch (IllegalStateException var14) {
               throw getIllegalStateException(var14);
            }

            var10000 = null;
         }

         StringBuilderUtil var9 = var10000;
         if (var9 != null) {
            return (W)var9;
         }

         Util132 var10 = Util132.getDataBuilder11_2(var0);
         if (!(var10 instanceof StringBuilderUtil)) {
            return (W)var10;
         }

         StringBuilderUtil var11 = (StringBuilderUtil)var10;

         try {
            if (var11.getParentScope() == null) {
               var11.setParentScope(var4);
            }
         } catch (IllegalStateException var13) {
            throw getIllegalStateException(var13);
         }

         var6.put(var0, new WeakReference<>(var11));
         return (W)var11;
      }
   }

   public static <W extends StringBuilderUtil<?>> W getDataBuilder12_2(W var0) {
      long var1 = 93282190418540L;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (IllegalStateException var16) {
         throw getIllegalStateException(var16);
      }

      Context var3 = Context.getCurrentContext();

      try {
         if (var3 == null) {
            throw new IllegalStateException("CachedWrapper.internCached must be called from a Rhino context");
         }
      } catch (IllegalStateException var15) {
         throw getIllegalStateException(var15);
      }

      Scriptable var4 = ScriptRuntime.getTopCallScope(var3);
      Class var5 = var0.getClass();
      Map var6 = CONST_L.computeIfAbsent(var4, StringBuilderUtil::lambda$internCached_Inner2).computeIfAbsent(var5, StringBuilderUtil::lambda$internCached_Inner3);
      Object var7 = var0.b();
      synchronized (var6) {
         Reference var9 = (Reference)var6.get(var7);

         StringBuilderUtil var10000;
         label48: {
            try {
               if (var9 != null) {
                  var10000 = (StringBuilderUtil)var9.get();
                  break label48;
               }
            } catch (IllegalStateException var13) {
               throw getIllegalStateException(var13);
            }

            var10000 = null;
         }

         StringBuilderUtil var10 = var10000;
         if (var10 != null) {
            return (W)var10;
         }

         try {
            if (var0.getParentScope() == null) {
               var0.setParentScope(var4);
            }
         } catch (IllegalStateException var12) {
            throw getIllegalStateException(var12);
         }

         var6.put(var7, new WeakReference<>(var0));
         return (W)var0;
      }
   }

   private static Map lambda$internCached_Inner3(Class var0) {
      return new WeakHashMap<>();
   }

   private static Map lambda$internCached_Inner2(Scriptable var0) {
      return new ConcurrentHashMap<>();
   }

   private static Map lambda$wrapCached_Inner1(Class var0) {
      return new WeakHashMap<>();
   }

   private static Map lambda$wrapCached_Inner0(Scriptable var0) {
      return new ConcurrentHashMap<>();
   }

   static {
      long var0 = 125882175121588L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "\u000f\u0010¤Æ©uäÂð(*¶6®2°\u001ajIsöZdb&¼uäT\u00956\u000erÙÒºaËáå\n4\t1¢ÄJ\u0097¾õ²×ÔL)(\u0086ì~´µ²ò\u00939ï6¡Ë.®x\u009ew\u0088\u009a©{\u0002MEw[ÙÞî÷\u008b.²éÒÀ\u0091ª(ó£-É\u008c)J²h\u007fâ\u007f\u001bïò|ÉHÉuëô\u0097M\u0081XSÔÉþ;ZÔ\u008am¹«\u0097[X.^G\u001a\u009c\u009có\u0013Ø\u0090é\u0013ÓBã\u0094O=»UûhmØI¹j\u0014Ì\u0000\u0013\u0086?Ã\u001aÿ¢¿G!\u0018y¥\u0002ã\u00004ë`sV\u001d´\u009b×NZ\u0003\u001bÃ~\u009d£ÎägÓ% 7ÛBa";
      int var7 = "\u000f\u0010¤Æ©uäÂð(*¶6®2°\u001ajIsöZdb&¼uäT\u00956\u000erÙÒºaËáå\n4\t1¢ÄJ\u0097¾õ²×ÔL)(\u0086ì~´µ²ò\u00939ï6¡Ë.®x\u009ew\u0088\u009a©{\u0002MEw[ÙÞî÷\u008b.²éÒÀ\u0091ª(ó£-É\u008c)J²h\u007fâ\u007f\u001bïò|ÉHÉuëô\u0097M\u0081XSÔÉþ;ZÔ\u008am¹«\u0097[X.^G\u001a\u009c\u009có\u0013Ø\u0090é\u0013ÓBã\u0094O=»UûhmØI¹j\u0014Ì\u0000\u0013\u0086?Ã\u001aÿ¢¿G!\u0018y¥\u0002ã\u00004ë`sV\u001d´\u009b×NZ\u0003\u001bÃ~\u009d£ÎägÓ% 7ÛBa"
         .length();
      char var8 = 'h';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_Y = var4;
                     CONST_Z = new String[4];
                     CONST_L = new WeakHashMap<>();
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

                  var6 = "]êè\rC\u0012s*ó^©·gpb >\u0095Òò\u0094\u0005\u001bïL«I\u0011V\u0013\u0090×Y\u0010üd[\u0014\u0097q\u008aþjàD\u00884Ý\u0086\u001c}ð{N¿Ñ×Xz\u0003t¶÷\bO,6\bÛ\u008e>U]mXO¹+íSiÿ¢\u0018²íÎ\u0088oz\u0087È\t\u00057\u00918+¡²u\tFÇPÊQ©\u009d\"A\u001eªÔpP\u001aµ\u0093\u001eí~e\u009en1ùnKb%IoÛ+\u001b\u0002¤\u0089É¤A\u008c´\u009e\u0007ItÀÂ\u0090¿t";
                  var7 = "]êè\rC\u0012s*ó^©·gpb >\u0095Òò\u0094\u0005\u001bïL«I\u0011V\u0013\u0090×Y\u0010üd[\u0014\u0097q\u008aþjàD\u00884Ý\u0086\u001c}ð{N¿Ñ×Xz\u0003t¶÷\bO,6\bÛ\u008e>U]mXO¹+íSiÿ¢\u0018²íÎ\u0088oz\u0087È\t\u00057\u00918+¡²u\tFÇPÊQ©\u009d\"A\u001eªÔpP\u001aµ\u0093\u001eí~e\u009en1ùnKb%IoÛ+\u001b\u0002¤\u0089É¤A\u008c´\u009e\u0007ItÀÂ\u0090¿t"
                     .length();
                  var8 = '`';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30607;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/a7", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/a7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
