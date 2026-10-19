package rip.breeze;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import rip.breeze.client.ItemIconCache;
import rip.breeze.client.MinecraftAccessor;

public class RenderUtil20 implements SettingGroup {
   private static final Minecraft CONST_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public int getValue() {
      return CONST_A.displayWidth;
   }

   public int getValue_2() {
      return CONST_A.displayHeight;
   }

   public void initialize() {
      CONST_A.currentScreen = null;
   }

   public boolean isValid() {
      long var1 = 30612207879873L;
      return CONST_A.theWorld != null;
   }

   public String getString() {
      return CONST_A.getSession().getUsername();
   }

   public String getString_2() {
      return CONST_A.getSession().getPlayerID();
   }

   public String getString_3() {
      return CONST_A.getSession().getToken();
   }

   public void update(String var1) {
      long var2 = 13812445831245L;
      MinecraftAccessor.initialize_5(
         CONST_A,
         new Session(
            var1,
            MinecraftAccessor.getSession(CONST_A).getPlayerID(),
            MinecraftAccessor.getSession(CONST_A).getToken(),
            "mojang"
         )
      );
   }

   public void update_1(String var1) {
      long var2 = 91940379456840L;
      MinecraftAccessor.initialize_5(
         CONST_A,
         new Session(
            MinecraftAccessor.getSession(CONST_A).getUsername(),
            var1,
            MinecraftAccessor.getSession(CONST_A).getToken(),
            "mojang"
         )
      );
   }

   public void update_2(String var1) {
      long var2 = 119093972354663L;
      MinecraftAccessor.initialize_5(
         CONST_A,
         new Session(
            MinecraftAccessor.getSession(CONST_A).getUsername(),
            MinecraftAccessor.getSession(CONST_A).getPlayerID(),
            var1,
            "mojang"
         )
      );
   }

   public void update_3(String var1, String var2, String var3) {
      long var4 = 55399863114265L;
      MinecraftAccessor.initialize_5(CONST_A, new Session(var1, var2, var3, "mojang"));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void processAll(String var1) {
      long var2 = 97289705883352L;
      LicenseState[] var4 = KeybindSettings.decrypt();

      try {
         if (Desktop.isDesktopSupported()) {
            Desktop var5 = Desktop.getDesktop();
            if (var5.isSupported(Action.BROWSE)) {
               var5.browse(URI.create(var1));
               return;
            }
         }
      } catch (Throwable var7) {
      }

      try {
         String[] var6;
         label49: {
            String var11 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
            if (var11.contains("win")) {
               var6 = new String[]{"rundll32", "url.dll,FileProtocolHandler", var1};

               try {
                  if (var4 != null) {
                     break label49;
                  }
               } catch (Throwable var8) {
                  throw getThrowable(var8);
               }
            }

            label41: {
               try {
                  if (!var11.contains("mac")) {
                     break label41;
                  }
               } catch (Throwable var9) {
                  throw getThrowable(var9);
               }

               var6 = new String[]{"open", var1};
               if (var4 != null) {
                  break label49;
               }
            }

            var6 = new String[]{"xdg-open", var1};
         }

         Runtime.getRuntime().exec(var6);
      } catch (Throwable var10) {
      }
   }

   public void processAll(String var1) {
      net.minecraft.client.gui.GuiScreen.setClipboardString(var1);
   }

   public String buildString(String param1, String... param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/RenderUtil20.52126622871440L J
      // 003: ldc2_w 33558412554871
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 00b: invokestatic org/lwjgl/system/MemoryStack.stackPush ()Lorg/lwjgl/system/MemoryStack;
      // 00e: astore 5
      // 010: aconst_null
      // 011: astore 6
      // 013: astore 7
      // 015: aconst_null
      // 016: astore 8
      // 018: aconst_null
      // 019: astore 9
      // 01b: aload 2
      // 01c: ifnull 0b5
      // 01f: aload 2
      // 020: arraylength
      // 021: ifle 0b5
      // 024: goto 02b
      // 027: invokestatic rip/breeze/RenderUtil20.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 5
      // 02d: aload 2
      // 02e: arraylength
      // 02f: invokevirtual org/lwjgl/system/MemoryStack.mallocPointer (I)Lorg/PointerBuffer;
      // 032: astore 8
      // 034: aload 2
      // 035: astore 10
      // 037: aload 10
      // 039: arraylength
      // 03a: istore 11
      // 03c: bipush 0
      // 03d: istore 12
      // 03f: iload 12
      // 041: iload 11
      // 043: if_icmpge 07f
      // 046: aload 10
      // 048: iload 12
      // 04a: aaload
      // 04b: astore 13
      // 04d: aload 8
      // 04f: aload 5
      // 051: new java/lang/StringBuilder
      // 054: dup
      // 055: invokespecial java/lang/StringBuilder.<init> ()V
      // 058: sipush 30508
      // 05b: ldc2_w 6230480963484834728
      // 05e: lload 3
      // 05f: lxor
      // 060: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil20.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: aload 13
      // 06a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 070: invokevirtual org/lwjgl/system/MemoryStack.UTF8 (Ljava/lang/CharSequence;)Ljava/nio/ByteBuffer;
      // 073: invokevirtual org/PointerBuffer.put (Ljava/nio/ByteBuffer;)Lorg/PointerBuffer;
      // 076: pop
      // 077: iinc 12 1
      // 07a: aload 7
      // 07c: ifnonnull 03f
      // 07f: aload 8
      // 081: invokevirtual org/PointerBuffer.flip ()Lorg/lwjgl/system/CustomBuffer;
      // 084: pop
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: sipush 31648
      // 08f: ldc2_w 1622356113106196258
      // 092: lload 3
      // 093: lxor
      // 094: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil20.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: aload 2
      // 09a: invokestatic java/lang/String.join (Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: sipush 15247
      // 0a3: ldc2_w 5902120189139719945
      // 0a6: lload 3
      // 0a7: lxor
      // 0a8: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil20.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b3: astore 9
      // 0b5: aload 1
      // 0b6: ldc ""
      // 0b8: aload 8
      // 0ba: aload 9
      // 0bc: bipush 0
      // 0bd: invokestatic org/lwjgl/util/tinyfd/TinyFileDialogs.tinyfd_openFileDialog (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lorg/PointerBuffer;Ljava/lang/CharSequence;Z)Ljava/lang/String;
      // 0c0: astore 10
      // 0c2: aload 5
      // 0c4: ifnull 0f5
      // 0c7: aload 6
      // 0c9: ifnull 0e9
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/RenderUtil20.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: aload 5
      // 0d5: invokevirtual org/lwjgl/system/MemoryStack.close ()V
      // 0d8: goto 0f5
      // 0db: astore 11
      // 0dd: aload 6
      // 0df: aload 11
      // 0e1: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0e4: aload 7
      // 0e6: ifnonnull 0f5
      // 0e9: aload 5
      // 0eb: invokevirtual org/lwjgl/system/MemoryStack.close ()V
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/RenderUtil20.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 10
      // 0f7: areturn
      // 0f8: astore 8
      // 0fa: aload 8
      // 0fc: astore 6
      // 0fe: aload 8
      // 100: athrow
      // 101: astore 14
      // 103: aload 5
      // 105: ifnull 136
      // 108: aload 6
      // 10a: ifnull 12a
      // 10d: goto 114
      // 110: invokestatic rip/breeze/RenderUtil20.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 5
      // 116: invokevirtual org/lwjgl/system/MemoryStack.close ()V
      // 119: goto 136
      // 11c: astore 15
      // 11e: aload 6
      // 120: aload 15
      // 122: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 125: aload 7
      // 127: ifnonnull 136
      // 12a: aload 5
      // 12c: invokevirtual org/lwjgl/system/MemoryStack.close ()V
      // 12f: goto 136
      // 132: invokestatic rip/breeze/RenderUtil20.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 135: athrow
      // 136: aload 14
      // 138: athrow
      // try (14 -> 19): 20 java/lang/Throwable
      // try (97 -> 99): 100 java/lang/Throwable
      // try (10 -> 90): 113 java/lang/Throwable
      // try (10 -> 90): 118 null
      // try (101 -> 108): 109 java/lang/Throwable
      // try (90 -> 94): 95 java/lang/Throwable
      // try (126 -> 128): 129 java/lang/Throwable
      // try (113 -> 119): 118 null
      // try (119 -> 123): 124 java/lang/Throwable
      // try (130 -> 137): 138 java/lang/Throwable
   }

   public List<Util141> getList() {
      return ItemIconCache.getList();
   }

   public void decrypt(String var1) {
      ItemIconCache.processAll(var1);
   }

   static {
      long var0 = 122266041287569L;
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
      String var6 = "\u001a\u0097ëb¶\u008c\u0011\u008dx9ì3®Á\u001cj\u0010å.D)gùzÍñS7\u0012\u001e\u000e\u0017\u009b\u0010\u00adûOÈ3ÆV\u0084ñ\u0089×Ø\u0095-Ó\u0085\u0010am\u0085\u008fÕ\b\u001cF\\+¯òYÓ°b\u0010I\f\nVyà]Îs²x\u0019.^PB\u0018\"{@xè\t[tjÀ\u0091AÖom8+-«\u001b/Æ\u007f\u0091\u0010\u0099µ~¤]Îx{¦\u009c±\u009eLuÆ¬\u0010-Ö\u0018\f\u009d¥ý|ðlÉ7\nòÐ#\u0010|0A\u0019[\u001f÷Ç\"N\u0090á\u0001 \u0013`8Æ\u0015÷Ù«\nÐx\t\u0005UË§'\u0004î«¬?â\b[\u00803âJîÂ£\u0000\u0080O\u0004\u0099p2h\u0089\u0081ñg,\u0017jw \u00843>\u001az7ûF¿ø";
      int var7 = "\u001a\u0097ëb¶\u008c\u0011\u008dx9ì3®Á\u001cj\u0010å.D)gùzÍñS7\u0012\u001e\u000e\u0017\u009b\u0010\u00adûOÈ3ÆV\u0084ñ\u0089×Ø\u0095-Ó\u0085\u0010am\u0085\u008fÕ\b\u001cF\\+¯òYÓ°b\u0010I\f\nVyà]Îs²x\u0019.^PB\u0018\"{@xè\t[tjÀ\u0091AÖom8+-«\u001b/Æ\u007f\u0091\u0010\u0099µ~¤]Îx{¦\u009c±\u009eLuÆ¬\u0010-Ö\u0018\f\u009d¥ý|ðlÉ7\nòÐ#\u0010|0A\u0019[\u001f÷Ç\"N\u0090á\u0001 \u0013`8Æ\u0015÷Ù«\nÐx\t\u0005UË§'\u0004î«¬?â\b[\u00803âJîÂ£\u0000\u0080O\u0004\u0099p2h\u0089\u0081ñg,\u0017jw \u00843>\u001az7ûF¿ø"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_C = var4;
                     CONST_D = new String[12];
                     CONST_A = Minecraft.getMinecraft();
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

                  var6 = "`\\¾fü\u0012A6\u009b¾\u0093\u001aú¼!\u0016\u0018«z~ÚÚÐ<WZí\u008e\u001e\u000f\u0006ÿ\u0005JÈô\u0092\u009fLÝ\u0015";
                  var7 = "`\\¾fü\u0012A6\u009b¾\u0093\u001aú¼!\u0016\u0018«z~ÚÚÐ<WZí\u008e\u001e\u000f\u0006ÿ\u0005JÈô\u0092\u009fLÝ\u0015".length();
                  var8 = 16;
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

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12641;
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
            throw new RuntimeException("rip/breeze/af", var10);
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
         CONST_D[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/af" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
