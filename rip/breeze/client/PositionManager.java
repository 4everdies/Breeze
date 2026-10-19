package rip.breeze.client;

import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import rip.breeze.BreezeContext;
import rip.breeze.CloudAuthService;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.KeepParameters;
import rip.breeze.RenderUtil3_x;
import rip.breeze.StringDecryptor;

public class PositionManager {
   private final ConcurrentHashMap<Integer, ResourceLocation> concurrentHashMap_a = new ConcurrentHashMap<>();
   private final ConcurrentHashMap<Integer, String> concurrentHashMap_b = new ConcurrentHashMap<>();
   private final ConcurrentHashMap<Integer, BufferedImage> concurrentHashMap_c = new ConcurrentHashMap<>();
   private final Set<Integer> set_d = ConcurrentHashMap.newKeySet();
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   public PositionManager() {
      EventBus.processAll(this);
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 41802891619922L;
      if (BreezeClient.CONST_A.thePlayer != null) {
         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = MathUtil8.buildArgs1(BreezeClient.CONST_A.thePlayer.getUniqueID());
         Method var10003 = MathUtil8.getMethod_3(7944568074707735994L, var2);
         Object[] var10002 = var10001;
         CloudAuthService var6 = var10000;
         Method var5 = var10003;

         try {
            var5.invoke(var6, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public RenderUtil3_x getBreezeUtil3(UUID var1) {
      long var2 = 140385398685324L;
      if (var1 == null) {
         return null;
      }

      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = MathUtil8.buildArgs1(var1);
      Method var10003 = MathUtil8.getMethod_3(-99582053326236517L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var6 = var10000;
      Method var5 = var10003;

      try {
         return (RenderUtil3_x)var5.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @KeepParameters
   public RenderUtil3_x getBreezeUtil3_2(AbstractClientPlayer var1) {
      long var2 = 15556751226621L;
      return var1 == null ? null : this.getBreezeUtil3(var1.getUniqueID());
   }

   @KeepParameters
   public ResourceLocation getResourceLocation(UUID var1) {
      long var2 = 7746835456426L;
      RenderUtil3_x var4 = this.getBreezeUtil3(var1);
      if (var4 == null) {
         return null;
      }

      int var5 = var4.fieldInt_a;
      String var6 = var4.string_b;
      String var7 = this.concurrentHashMap_b.get(var5);
      if (var7 != null && !var7.equals(var6)) {
         ResourceLocation var8 = this.concurrentHashMap_a.remove(var5);
         if (var8 != null) {
            BreezeClient.CONST_A.getTextureManager().deleteTexture(var8);
         }

         this.concurrentHashMap_b.remove(var5);
         this.concurrentHashMap_c.remove(var5);
      }

      BufferedImage var10 = this.concurrentHashMap_c.remove(var5);
      if (var10 != null) {
         ResourceLocation var11 = BreezeClient.CONST_A
            .getTextureManager()
            .getDynamicTextureLocation("brz-cape-" + var5, new DynamicTexture(var10));
         this.concurrentHashMap_a.put(var5, var11);
         this.concurrentHashMap_b.put(var5, var6);
         return var11;
      }

      ResourceLocation var9 = this.concurrentHashMap_a.get(var5);
      if (var9 != null) {
         return var9;
      }

      if (this.set_d.add(var5)) {
         BreezeContext.breezeUtil26_l.initialize_2(this::lambda$getCapeTexture_Inner0);
      }

      return null;
   }

   public ResourceLocation getResourceLocation_2(AbstractClientPlayer var1) {
      long var2 = 88642289077751L;
      return var1 == null ? null : this.getResourceLocation(var1.getUniqueID());
   }

   public void makeRequest() {
      this.set_d.clear();
      this.concurrentHashMap_c.clear();
      this.concurrentHashMap_a.clear();
      this.concurrentHashMap_b.clear();
   }

   private BufferedImage getBufferedImage(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/PositionManager.72697812946618L J
      // 003: ldc2_w 70271752098961
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/client/ConfigManager.isValid ()Z
      // 00b: aconst_null
      // 00c: astore 4
      // 00e: istore 5
      // 010: new java/net/URL
      // 013: dup
      // 014: aload 1
      // 015: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 018: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 01b: checkcast java/net/HttpURLConnection
      // 01e: astore 4
      // 020: aload 4
      // 022: sipush 27683
      // 025: ldc2_w 2048202035190276053
      // 028: lload 2
      // 029: lxor
      // 02a: invokedynamic n (IJ)Ljava/lang/String; bsm=rip/breeze/client/PositionManager.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: sipush 9858
      // 032: ldc2_w 239283457876448631
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic n (IJ)Ljava/lang/String; bsm=rip/breeze/client/PositionManager.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 03f: aload 4
      // 041: sipush 9461
      // 044: ldc2_w 5884078654109669122
      // 047: lload 2
      // 048: lxor
      // 049: invokedynamic n (IJ)Ljava/lang/String; bsm=rip/breeze/client/PositionManager.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: sipush 14981
      // 051: ldc2_w 1201339436530977137
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic n (IJ)Ljava/lang/String; bsm=rip/breeze/client/PositionManager.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: invokevirtual java/net/HttpURLConnection.setRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 05e: aload 4
      // 060: sipush 5000
      // 063: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 066: aload 4
      // 068: sipush 10000
      // 06b: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 06e: aload 4
      // 070: bipush 1
      // 071: invokevirtual java/net/HttpURLConnection.setInstanceFollowRedirects (Z)V
      // 074: aload 4
      // 076: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 079: astore 6
      // 07b: aconst_null
      // 07c: astore 7
      // 07e: aload 6
      // 080: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 083: astore 8
      // 085: aload 6
      // 087: ifnull 0b8
      // 08a: aload 7
      // 08c: ifnull 0ac
      // 08f: goto 096
      // 092: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 6
      // 098: invokevirtual java/io/InputStream.close ()V
      // 09b: goto 0b8
      // 09e: astore 9
      // 0a0: aload 7
      // 0a2: aload 9
      // 0a4: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0a7: iload 5
      // 0a9: ifeq 0b8
      // 0ac: aload 6
      // 0ae: invokevirtual java/io/InputStream.close ()V
      // 0b1: goto 0b8
      // 0b4: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 4
      // 0ba: ifnull 0c9
      // 0bd: aload 4
      // 0bf: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 0c2: goto 0c9
      // 0c5: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 8
      // 0cb: areturn
      // 0cc: astore 8
      // 0ce: aload 8
      // 0d0: astore 7
      // 0d2: aload 8
      // 0d4: athrow
      // 0d5: astore 10
      // 0d7: aload 6
      // 0d9: ifnull 10a
      // 0dc: aload 7
      // 0de: ifnull 0fe
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 6
      // 0ea: invokevirtual java/io/InputStream.close ()V
      // 0ed: goto 10a
      // 0f0: astore 11
      // 0f2: aload 7
      // 0f4: aload 11
      // 0f6: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0f9: iload 5
      // 0fb: ifeq 10a
      // 0fe: aload 6
      // 100: invokevirtual java/io/InputStream.close ()V
      // 103: goto 10a
      // 106: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 10
      // 10c: athrow
      // 10d: astore 6
      // 10f: aload 6
      // 111: invokevirtual java/lang/Exception.printStackTrace ()V
      // 114: aconst_null
      // 115: astore 7
      // 117: aload 4
      // 119: ifnull 128
      // 11c: aload 4
      // 11e: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 121: goto 128
      // 124: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 7
      // 12a: areturn
      // 12b: astore 12
      // 12d: aload 4
      // 12f: ifnull 13e
      // 132: aload 4
      // 134: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 137: goto 13e
      // 13a: invokestatic rip/breeze/client/PositionManager.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 12
      // 140: athrow
      // try (63 -> 65): 66 java/lang/Throwable
      // try (53 -> 56): 86 java/lang/Throwable
      // try (53 -> 56): 91 null
      // try (67 -> 74): 75 java/lang/Throwable
      // try (56 -> 60): 61 java/lang/Throwable
      // try (99 -> 101): 102 java/lang/Throwable
      // try (86 -> 92): 91 null
      // try (8 -> 77): 115 java/lang/Exception
      // try (103 -> 110): 111 java/lang/Throwable
      // try (92 -> 96): 97 java/lang/Throwable
      // try (86 -> 115): 115 java/lang/Exception
      // try (8 -> 77): 129 null
      // try (77 -> 81): 82 java/lang/Throwable
      // try (86 -> 120): 129 null
      // try (120 -> 124): 125 java/lang/Throwable
      // try (129 -> 130): 129 null
      // try (130 -> 134): 135 java/lang/Throwable
   }

   private void lambda$getCapeTexture_Inner0(String var1, int var2) {
      long var3 = 103484327608806L;

      try {
         BufferedImage var5 = this.getBufferedImage(var1);
         if (var5 != null) {
            this.concurrentHashMap_c.put(var2, var5);
         }
      } finally {
         this.set_d.remove(var2);
      }
   }

   static {
      long var0 = 81534535106991L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "µc$Hýf¶\u009fì}b\u0003\u0097Iõ\u000b\u009a\u0005\u007fÌ\u009cúN'ÐNº_Nj|>ZÈ\t'ý:±Ä\u0019'Ú\u0099#.\u0096\u0090k\u008c-(ÖÊ&ï\u0019¾\u0097\u0093 ¥6M£w\u008dôt´?ï%¢õ;\u0088[[Å\u008apÕw\u008f\u00ad\u0018\u001f]\u0087@îC\u0089ñ.¹ïj\u0010\u009bÐë.É\u001d$\u0092\u0086à%ÙÅE.\fôÕXÈ¼tµ?×\u008d\u0087©\u0096\u009fiêûp\u001a:\u0087{\u0096¤'õ\u0001E\u0019Zf´\u009e1\u0089\u0094¹Ó\r\u0010m\u0010wIû\u0098§'ow]\u000fH\u0087Rì\u0091ï\u0098ê\u0098ùÕ«,\u0097\u0088\fÀ#\u0086Ë\u0015\u008ceXtMcqSz\u0081,\u0019\u0014ô5\u0080zê²¤Ð5ØgElÖ<h#ã¤ÐæG«\u001d\u0097¬ù\u009a\u000eÆâÐm7À½1\u001cq\u0010UùH\u001f¢j«\u0014\u0000\u0088Ä\u009bù]³î";
      int var7 = "µc$Hýf¶\u009fì}b\u0003\u0097Iõ\u000b\u009a\u0005\u007fÌ\u009cúN'ÐNº_Nj|>ZÈ\t'ý:±Ä\u0019'Ú\u0099#.\u0096\u0090k\u008c-(ÖÊ&ï\u0019¾\u0097\u0093 ¥6M£w\u008dôt´?ï%¢õ;\u0088[[Å\u008apÕw\u008f\u00ad\u0018\u001f]\u0087@îC\u0089ñ.¹ïj\u0010\u009bÐë.É\u001d$\u0092\u0086à%ÙÅE.\fôÕXÈ¼tµ?×\u008d\u0087©\u0096\u009fiêûp\u001a:\u0087{\u0096¤'õ\u0001E\u0019Zf´\u009e1\u0089\u0094¹Ó\r\u0010m\u0010wIû\u0098§'ow]\u000fH\u0087Rì\u0091ï\u0098ê\u0098ùÕ«,\u0097\u0088\fÀ#\u0086Ë\u0015\u008ceXtMcqSz\u0081,\u0019\u0014ô5\u0080zê²¤Ð5ØgElÖ<h#ã¤ÐæG«\u001d\u0097¬ù\u009a\u000eÆâÐm7À½1\u001cq\u0010UùH\u001f¢j«\u0014\u0000\u0088Ä\u009bù]³î"
         .length();
      char var8 = 168;
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
                     CONST_F = var4;
                     CONST_G = new String[5];
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

                  var6 = "H\u0016#b\u0007â)ÂL\u001aT©\u0014¯ô\u0096£\u008c\u001eàµZá*ÔíÍ\n\u0000_oÞ ,hî\u0093ÙÇ>3Ö\u008c0¿â3\u0019K=ð«ºkò\u0003<åï\u0000t\u008dc\u001c~";
                  var7 = "H\u0016#b\u0007â)ÂL\u001aT©\u0014¯ô\u0096£\u008c\u001eàµZá*ÔíÍ\n\u0000_oÞ ,hî\u0093ÙÇ>3Ö\u008c0¿â3\u0019K=ð«ºkò\u0003<åï\u0000t\u008dc\u001c~"
                     .length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10718;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/ej", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/client/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
