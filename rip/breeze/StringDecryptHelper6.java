package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StringDecryptHelper6 extends UIPanel {
   private final Util133 dataBuilder112_h;
   private Consumer<String> consumer_i;
   private String string_j;
   private String string_k;
   private Util134 dataBuilder113_l;
   private int fieldInt_m;
   private boolean fieldBool_n;
   private int fieldInt_o;
   private int fieldInt_p;
   private int fieldInt_q;
   private int fieldInt_r;
   private boolean fieldBool_s;
   private final ArrayList<String> arrayList_t;
   private final ArrayList<Integer> arrayList_u;
   private static final long eka_1;
   private long fieldLong_w;
   private int fieldInt_x;
   private int fieldInt_y;
   private static final String CONST_Z = "|";
   private boolean fieldBool_A;
   private long fieldLong_B;
   private float fieldFloat_C;
   private final Map<Integer, Util4> map_D;
   private float fieldFloat_E;
   private final boolean fieldBool_F;
   private boolean fieldBool_G;
   private static int fieldInt_H;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);
   private static final long eka_2;
   private static final long[] CONST_N;
   private static final Long[] CONST_O;
   private static final Map CONST_P;

   public StringDecryptHelper6(String var1, LicenseState var2) {
      this(var1, var2, null, false, false);
   }

   public StringDecryptHelper6(String var1, LicenseState var2, Consumer<String> var3) {
      this(var1, var2, var3, false, false);
   }

   public StringDecryptHelper6(String var1, LicenseState var2, Consumer<String> var3, boolean var4) {
      this(var1, var2, var3, var4, false);
   }

   public StringDecryptHelper6(String var1, LicenseState var2, Consumer<String> var3, boolean var4, boolean var5) {
      long var6 = 12445315854661L;
      super(var2);
      this.dataBuilder112_h = new Util133();
      this.string_j = "";
      this.dataBuilder113_l = new Util134(4.0F, 4.0F);
      this.fieldInt_m = (int)5224815930193739798L;
      this.fieldBool_n = false;
      this.fieldInt_o = -1;
      this.fieldInt_p = -1;
      this.fieldInt_q = -1;
      this.fieldInt_r = -1;
      this.fieldBool_s = false;
      this.arrayList_t = new ArrayList<>();
      this.arrayList_u = new ArrayList<>();
      this.fieldLong_w = 0L;
      this.fieldInt_x = -1;
      this.fieldInt_y = 0;
      this.fieldBool_A = true;
      this.fieldLong_B = -2244245054869190984L;
      this.fieldFloat_C = 7.0F;
      this.map_D = new HashMap<>();
      this.fieldFloat_E = 0.0F;
      this.fieldBool_G = false;
      this.string_k = var1;
      this.consumer_i = var3;
      this.fieldBool_F = var4;
      this.fieldBool_G = var5;
   }

   public void update(float var1, float var2, float var3) {
      long var4 = 107561627352698L;
      super.toggle(var1, var2, var3);
      if (this.fieldBool_s && this.fieldInt_o != -1) {
         int var6 = this.clamp_3(var1);
         if (!this.isValid()) {
            this.fieldInt_q = this.fieldInt_o;
         }

         this.fieldInt_r = var6;
         this.fieldInt_o = var6;
         this.dataBuilder112_h.getDataBuilder112();
      }

      BreezeContext.iRenderer_b.renderInRect(this.a, this.b, this.c, this.d, this::lambda$draw_Inner1);
   }

   public boolean absValue(float var1, float var2, int var3, boolean var4) {
      long var5 = 66652810588429L;
      int var7 = RenderUtil9.getValue_2();
      if (this.fieldBool_n) {
         return super.checkCondition(var1, var2, var3, var4);
      }

      if (!this.a(var1, var2)) {
         if (this.fieldInt_o != -1) {
            this.fieldInt_o = -1;
            this.initialize();
            this.map_D.clear();
         }

         return super.checkCondition(var1, var2, var3, var4);
      } else {
         if (var4) {
            this.fieldInt_o = -1;
            return true;
         }

         int var8 = this.clamp_3(var1);
         boolean var9 = BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_115();
         if (var3 == 0) {
            long var10;
            label46: {
               var10 = System.currentTimeMillis();
               if (var10 - this.fieldLong_w <= 2364821063848275951L && Math.abs(var8 - this.fieldInt_x) <= 1) {
                  this.fieldInt_y++;
                  if (var7 == 0) {
                     break label46;
                  }
               }

               this.fieldInt_y = 1;
            }

            this.fieldLong_w = var10;
            this.fieldInt_x = var8;
            if (this.fieldInt_y == 2) {
               this.fieldInt_q = 0;
               this.fieldInt_r = this.string_j.length();
               this.fieldInt_o = this.fieldInt_r;
               this.fieldBool_s = false;
               this.dataBuilder112_h.getDataBuilder112();
               return true;
            }
         }

         label55: {
            if (!var9) {
               this.fieldInt_o = var8;
               this.initialize();
               if (var7 == 0) {
                  break label55;
               }
            }

            if (!this.isValid()) {
               this.fieldInt_q = this.fieldInt_o;
            }

            this.fieldInt_r = var8;
            this.fieldInt_o = var8;
         }

         this.fieldBool_s = var3 == 0;
         this.dataBuilder112_h.getDataBuilder112();
         return true;
      }
   }

   public void toggle(float var1, float var2, int var3) {
      super.noOp(var1, var2, var3);
      this.fieldBool_s = false;
   }

   public boolean clamp(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/StringDecryptHelper6.133057230471884L J
      // 003: ldc2_w 88375313428707
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/RenderUtil9.getValue ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield rip/breeze/StringDecryptHelper6.fieldBool_n Z
      // 011: ifne 023
      // 014: aload 0
      // 015: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 018: bipush -1
      // 019: if_icmpne 029
      // 01c: goto 023
      // 01f: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 02c: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_115 ()Z 1
      // 031: istore 5
      // 033: iload 1
      // 034: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 037: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_BACK ()I 1
      // 03c: if_icmpne 0c0
      // 03f: aload 0
      // 040: invokespecial rip/breeze/StringDecryptHelper6.update_5 ()V
      // 043: aload 0
      // 044: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 047: ifeq 061
      // 04a: goto 051
      // 04d: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: invokespecial rip/breeze/StringDecryptHelper6.clamp_6 ()V
      // 055: iload 4
      // 057: ifne 6ad
      // 05a: goto 061
      // 05d: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 0
      // 062: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 065: ifle 6ad
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 0
      // 071: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 074: bipush 1
      // 075: isub
      // 076: aload 0
      // 077: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 07a: invokespecial rip/breeze/StringDecryptHelper6.clamp_7 (II)V
      // 07d: aload 0
      // 07e: new java/lang/StringBuilder
      // 081: dup
      // 082: invokespecial java/lang/StringBuilder.<init> ()V
      // 085: aload 0
      // 086: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 089: bipush 0
      // 08a: aload 0
      // 08b: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 08e: bipush 1
      // 08f: isub
      // 090: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: aload 0
      // 097: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 09a: aload 0
      // 09b: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 09e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a7: putfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 0aa: aload 0
      // 0ab: dup
      // 0ac: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 0af: bipush 1
      // 0b0: isub
      // 0b1: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 0b4: iload 4
      // 0b6: ifne 6ad
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: iload 1
      // 0c1: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 0c4: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_108 ()I 1
      // 0c9: if_icmpne 151
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: invokespecial rip/breeze/StringDecryptHelper6.update_5 ()V
      // 0d7: aload 0
      // 0d8: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 0db: ifeq 0f5
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: invokespecial rip/breeze/StringDecryptHelper6.clamp_6 ()V
      // 0e9: iload 4
      // 0eb: ifne 6ad
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 0f9: aload 0
      // 0fa: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 0fd: invokevirtual java/lang/String.length ()I
      // 100: if_icmpge 6ad
      // 103: goto 10a
      // 106: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: aload 0
      // 10c: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 10f: aload 0
      // 110: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 113: bipush 1
      // 114: iadd
      // 115: invokespecial rip/breeze/StringDecryptHelper6.clamp_7 (II)V
      // 118: aload 0
      // 119: new java/lang/StringBuilder
      // 11c: dup
      // 11d: invokespecial java/lang/StringBuilder.<init> ()V
      // 120: aload 0
      // 121: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 124: bipush 0
      // 125: aload 0
      // 126: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 129: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: aload 0
      // 130: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 133: aload 0
      // 134: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 137: bipush 1
      // 138: iadd
      // 139: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 142: putfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 145: iload 4
      // 147: ifne 6ad
      // 14a: goto 151
      // 14d: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: iload 1
      // 152: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 155: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_RETURN ()I 1
      // 15a: if_icmpne 19a
      // 15d: goto 164
      // 160: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 0
      // 165: bipush -1
      // 166: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 169: aload 0
      // 16a: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 16d: aload 0
      // 16e: getfield rip/breeze/StringDecryptHelper6.map_D Ljava/util/Map;
      // 171: invokeinterface java/util/Map.clear ()V 1
      // 176: aload 0
      // 177: getfield rip/breeze/StringDecryptHelper6.consumer_i Ljava/util/function/Consumer;
      // 17a: ifnull 198
      // 17d: goto 184
      // 180: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: aload 0
      // 185: getfield rip/breeze/StringDecryptHelper6.consumer_i Ljava/util/function/Consumer;
      // 188: aload 0
      // 189: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 18c: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 191: goto 198
      // 194: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: bipush 1
      // 199: ireturn
      // 19a: iload 1
      // 19b: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 19e: invokeinterface rip/breeze/IKeyCodeProvider.getModifiedKeyCode ()I 1
      // 1a3: if_icmpne 1be
      // 1a6: aload 0
      // 1a7: bipush -1
      // 1a8: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 1ab: aload 0
      // 1ac: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 1af: aload 0
      // 1b0: getfield rip/breeze/StringDecryptHelper6.map_D Ljava/util/Map;
      // 1b3: invokeinterface java/util/Map.clear ()V 1
      // 1b8: bipush 1
      // 1b9: ireturn
      // 1ba: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: iload 1
      // 1bf: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 1c2: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_NUMPAD6 ()I 1
      // 1c7: if_icmpne 248
      // 1ca: iload 5
      // 1cc: ifne 203
      // 1cf: goto 1d6
      // 1d2: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 1da: ifeq 203
      // 1dd: goto 1e4
      // 1e0: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: aload 0
      // 1e6: getfield rip/breeze/StringDecryptHelper6.fieldInt_q I
      // 1e9: aload 0
      // 1ea: getfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 1ed: invokestatic java/lang/Math.min (II)I
      // 1f0: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 1f3: aload 0
      // 1f4: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 1f7: iload 4
      // 1f9: ifne 6ad
      // 1fc: goto 203
      // 1ff: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: iload 5
      // 205: ifne 21a
      // 208: goto 20f
      // 20b: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: aload 0
      // 210: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 213: goto 21a
      // 216: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: aload 0
      // 21b: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 21e: ifle 6ad
      // 221: aload 0
      // 222: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 225: istore 6
      // 227: aload 0
      // 228: dup
      // 229: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 22c: bipush 1
      // 22d: isub
      // 22e: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 231: iload 5
      // 233: ifeq 243
      // 236: aload 0
      // 237: iload 6
      // 239: invokespecial rip/breeze/StringDecryptHelper6.processAll (I)V
      // 23c: goto 243
      // 23f: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 242: athrow
      // 243: iload 4
      // 245: ifne 6ad
      // 248: iload 1
      // 249: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 24c: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_ADD ()I 1
      // 251: if_icmpne 2e0
      // 254: goto 25b
      // 257: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: iload 5
      // 25d: ifne 294
      // 260: goto 267
      // 263: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 266: athrow
      // 267: aload 0
      // 268: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 26b: ifeq 294
      // 26e: goto 275
      // 271: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 274: athrow
      // 275: aload 0
      // 276: aload 0
      // 277: getfield rip/breeze/StringDecryptHelper6.fieldInt_q I
      // 27a: aload 0
      // 27b: getfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 27e: invokestatic java/lang/Math.max (II)I
      // 281: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 284: aload 0
      // 285: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 288: iload 4
      // 28a: ifne 6ad
      // 28d: goto 294
      // 290: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 293: athrow
      // 294: iload 5
      // 296: ifne 2ab
      // 299: goto 2a0
      // 29c: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 2a4: goto 2ab
      // 2a7: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: aload 0
      // 2ac: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 2af: aload 0
      // 2b0: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 2b3: invokevirtual java/lang/String.length ()I
      // 2b6: if_icmpge 6ad
      // 2b9: aload 0
      // 2ba: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 2bd: istore 6
      // 2bf: aload 0
      // 2c0: dup
      // 2c1: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 2c4: bipush 1
      // 2c5: iadd
      // 2c6: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 2c9: iload 5
      // 2cb: ifeq 2db
      // 2ce: aload 0
      // 2cf: iload 6
      // 2d1: invokespecial rip/breeze/StringDecryptHelper6.processAll (I)V
      // 2d4: goto 2db
      // 2d7: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2da: athrow
      // 2db: iload 4
      // 2dd: ifne 6ad
      // 2e0: iload 1
      // 2e1: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 2e4: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_103 ()I 1
      // 2e9: if_icmpne 32c
      // 2ec: goto 2f3
      // 2ef: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: iload 5
      // 2f5: ifne 30a
      // 2f8: goto 2ff
      // 2fb: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: aload 0
      // 300: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 303: goto 30a
      // 306: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 309: athrow
      // 30a: aload 0
      // 30b: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 30e: istore 6
      // 310: aload 0
      // 311: bipush 0
      // 312: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 315: iload 5
      // 317: ifeq 327
      // 31a: aload 0
      // 31b: iload 6
      // 31d: invokespecial rip/breeze/StringDecryptHelper6.processAll_1 (I)V
      // 320: goto 327
      // 323: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: iload 4
      // 329: ifne 6ad
      // 32c: iload 1
      // 32d: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 330: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_105 ()I 1
      // 335: if_icmpne 37e
      // 338: goto 33f
      // 33b: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33e: athrow
      // 33f: iload 5
      // 341: ifne 356
      // 344: goto 34b
      // 347: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: aload 0
      // 34c: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 34f: goto 356
      // 352: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 355: athrow
      // 356: aload 0
      // 357: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 35a: istore 6
      // 35c: aload 0
      // 35d: aload 0
      // 35e: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 361: invokevirtual java/lang/String.length ()I
      // 364: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 367: iload 5
      // 369: ifeq 379
      // 36c: aload 0
      // 36d: iload 6
      // 36f: invokespecial rip/breeze/StringDecryptHelper6.processAll_1 (I)V
      // 372: goto 379
      // 375: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 378: athrow
      // 379: iload 4
      // 37b: ifne 6ad
      // 37e: iload 1
      // 37f: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 382: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_V ()I 1
      // 387: if_icmpne 56b
      // 38a: goto 391
      // 38d: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 394: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 399: ifeq 6ad
      // 39c: goto 3a3
      // 39f: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a2: athrow
      // 3a3: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 3a6: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 3a9: astore 6
      // 3ab: aload 6
      // 3ad: aconst_null
      // 3ae: invokevirtual java/awt/datatransfer/Clipboard.getContents (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
      // 3b1: astore 7
      // 3b3: aload 7
      // 3b5: ifnull 561
      // 3b8: aload 7
      // 3ba: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 3bd: invokeinterface java/awt/datatransfer/Transferable.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z 2
      // 3c2: ifeq 561
      // 3c5: goto 3cc
      // 3c8: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cb: athrow
      // 3cc: aload 0
      // 3cd: invokespecial rip/breeze/StringDecryptHelper6.update_5 ()V
      // 3d0: aload 7
      // 3d2: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 3d5: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 3da: checkcast java/lang/String
      // 3dd: astore 8
      // 3df: new java/lang/StringBuilder
      // 3e2: dup
      // 3e3: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e6: astore 9
      // 3e8: bipush 0
      // 3e9: istore 10
      // 3eb: iload 10
      // 3ed: aload 8
      // 3ef: invokevirtual java/lang/String.length ()I
      // 3f2: if_icmpge 45c
      // 3f5: aload 8
      // 3f7: iload 10
      // 3f9: invokevirtual java/lang/String.charAt (I)C
      // 3fc: istore 11
      // 3fe: aload 0
      // 3ff: getfield rip/breeze/StringDecryptHelper6.fieldBool_G Z
      // 402: ifeq 436
      // 405: iload 11
      // 407: invokestatic java/lang/Character.isDigit (C)Z
      // 40a: ifne 422
      // 40d: goto 414
      // 410: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 413: athrow
      // 414: iload 11
      // 416: bipush 46
      // 418: if_icmpne 454
      // 41b: goto 422
      // 41e: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 421: athrow
      // 422: aload 9
      // 424: iload 11
      // 426: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 429: pop
      // 42a: iload 4
      // 42c: ifne 454
      // 42f: goto 436
      // 432: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 435: athrow
      // 436: iload 11
      // 438: invokestatic rip/breeze/Util6.isValid (C)Z
      // 43b: ifeq 454
      // 43e: goto 445
      // 441: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 444: athrow
      // 445: aload 9
      // 447: iload 11
      // 449: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 44c: pop
      // 44d: goto 454
      // 450: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 453: athrow
      // 454: iinc 10 1
      // 457: iload 4
      // 459: ifne 3eb
      // 45c: aload 9
      // 45e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 461: astore 10
      // 463: aload 10
      // 465: invokevirtual java/lang/String.isEmpty ()Z
      // 468: ifne 561
      // 46b: aload 0
      // 46c: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 46f: ifeq 4cc
      // 472: goto 479
      // 475: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 478: athrow
      // 479: aload 0
      // 47a: getfield rip/breeze/StringDecryptHelper6.fieldInt_q I
      // 47d: aload 0
      // 47e: getfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 481: invokestatic java/lang/Math.min (II)I
      // 484: istore 11
      // 486: aload 0
      // 487: getfield rip/breeze/StringDecryptHelper6.fieldInt_q I
      // 48a: aload 0
      // 48b: getfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 48e: invokestatic java/lang/Math.max (II)I
      // 491: istore 12
      // 493: aload 0
      // 494: iload 11
      // 496: iload 12
      // 498: invokespecial rip/breeze/StringDecryptHelper6.clamp_7 (II)V
      // 49b: aload 0
      // 49c: new java/lang/StringBuilder
      // 49f: dup
      // 4a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 4a3: aload 0
      // 4a4: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 4a7: bipush 0
      // 4a8: iload 11
      // 4aa: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 4ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b0: aload 0
      // 4b1: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 4b4: iload 12
      // 4b6: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4bf: putfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 4c2: aload 0
      // 4c3: iload 11
      // 4c5: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 4c8: aload 0
      // 4c9: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 4cc: aload 0
      // 4cd: getfield rip/breeze/StringDecryptHelper6.fieldInt_p I
      // 4d0: ifle 4fc
      // 4d3: aload 0
      // 4d4: getfield rip/breeze/StringDecryptHelper6.fieldInt_p I
      // 4d7: aload 0
      // 4d8: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 4db: invokevirtual java/lang/String.length ()I
      // 4de: isub
      // 4df: istore 11
      // 4e1: iload 11
      // 4e3: ifgt 4e8
      // 4e6: bipush 1
      // 4e7: ireturn
      // 4e8: aload 10
      // 4ea: invokevirtual java/lang/String.length ()I
      // 4ed: iload 11
      // 4ef: if_icmple 4fc
      // 4f2: aload 10
      // 4f4: bipush 0
      // 4f5: iload 11
      // 4f7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 4fa: astore 10
      // 4fc: aload 0
      // 4fd: aload 0
      // 4fe: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 501: aload 10
      // 503: invokevirtual java/lang/String.length ()I
      // 506: invokespecial rip/breeze/StringDecryptHelper6.calculate (II)V
      // 509: aload 0
      // 50a: new java/lang/StringBuilder
      // 50d: dup
      // 50e: invokespecial java/lang/StringBuilder.<init> ()V
      // 511: aload 0
      // 512: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 515: bipush 0
      // 516: aload 0
      // 517: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 51a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 51d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 520: aload 10
      // 522: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 525: aload 0
      // 526: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 529: aload 0
      // 52a: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 52d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 530: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 533: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 536: putfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 539: aload 0
      // 53a: aload 0
      // 53b: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 53e: aload 10
      // 540: invokevirtual java/lang/String.length ()I
      // 543: sipush 6877
      // 546: ldc2_w 8201270219493510616
      // 549: lload 2
      // 54a: lxor
      // 54b: invokedynamic c (IJ)J bsm=rip/breeze/StringDecryptHelper6.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 550: invokespecial rip/breeze/StringDecryptHelper6.calculate_2 (IIJ)V
      // 553: aload 0
      // 554: dup
      // 555: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 558: aload 10
      // 55a: invokevirtual java/lang/String.length ()I
      // 55d: iadd
      // 55e: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 561: goto 6ad
      // 564: astore 6
      // 566: iload 4
      // 568: ifne 6ad
      // 56b: iload 1
      // 56c: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 56f: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_C ()I 1
      // 574: if_icmpne 5c5
      // 577: goto 57e
      // 57a: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57d: athrow
      // 57e: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 581: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 586: ifeq 6ad
      // 589: goto 590
      // 58c: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58f: athrow
      // 590: aload 0
      // 591: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 594: ifeq 6ad
      // 597: goto 59e
      // 59a: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59d: athrow
      // 59e: aload 0
      // 59f: invokespecial rip/breeze/StringDecryptHelper6.buildString ()Ljava/lang/String;
      // 5a2: astore 6
      // 5a4: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 5a7: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 5aa: astore 7
      // 5ac: new java/awt/datatransfer/StringSelection
      // 5af: dup
      // 5b0: aload 6
      // 5b2: invokespecial java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
      // 5b5: astore 8
      // 5b7: aload 7
      // 5b9: aload 8
      // 5bb: aload 8
      // 5bd: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 5c0: iload 4
      // 5c2: ifne 6ad
      // 5c5: iload 1
      // 5c6: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 5c9: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_X ()I 1
      // 5ce: if_icmpne 627
      // 5d1: goto 5d8
      // 5d4: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d7: athrow
      // 5d8: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 5db: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 5e0: ifeq 6ad
      // 5e3: goto 5ea
      // 5e6: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e9: athrow
      // 5ea: aload 0
      // 5eb: invokespecial rip/breeze/StringDecryptHelper6.isValid ()Z
      // 5ee: ifeq 6ad
      // 5f1: goto 5f8
      // 5f4: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f7: athrow
      // 5f8: aload 0
      // 5f9: invokespecial rip/breeze/StringDecryptHelper6.buildString ()Ljava/lang/String;
      // 5fc: astore 6
      // 5fe: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 601: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 604: astore 7
      // 606: new java/awt/datatransfer/StringSelection
      // 609: dup
      // 60a: aload 6
      // 60c: invokespecial java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
      // 60f: astore 8
      // 611: aload 7
      // 613: aload 8
      // 615: aload 8
      // 617: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 61a: aload 0
      // 61b: invokespecial rip/breeze/StringDecryptHelper6.update_5 ()V
      // 61e: aload 0
      // 61f: invokespecial rip/breeze/StringDecryptHelper6.clamp_6 ()V
      // 622: iload 4
      // 624: ifne 6ad
      // 627: iload 1
      // 628: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 62b: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_A ()I 1
      // 630: if_icmpne 670
      // 633: goto 63a
      // 636: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 639: athrow
      // 63a: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 63d: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 642: ifeq 6ad
      // 645: goto 64c
      // 648: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64b: athrow
      // 64c: aload 0
      // 64d: bipush 0
      // 64e: putfield rip/breeze/StringDecryptHelper6.fieldInt_q I
      // 651: aload 0
      // 652: aload 0
      // 653: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 656: invokevirtual java/lang/String.length ()I
      // 659: putfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 65c: aload 0
      // 65d: aload 0
      // 65e: getfield rip/breeze/StringDecryptHelper6.fieldInt_r I
      // 661: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 664: iload 4
      // 666: ifne 6ad
      // 669: goto 670
      // 66c: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66f: athrow
      // 670: iload 1
      // 671: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 674: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_Z ()I 1
      // 679: if_icmpne 6ad
      // 67c: goto 683
      // 67f: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 682: athrow
      // 683: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 686: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 68b: ifeq 6ad
      // 68e: goto 695
      // 691: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 694: athrow
      // 695: aload 0
      // 696: invokespecial rip/breeze/StringDecryptHelper6.clamp_13 ()V
      // 699: aload 0
      // 69a: invokespecial rip/breeze/StringDecryptHelper6.initialize ()V
      // 69d: aload 0
      // 69e: getfield rip/breeze/StringDecryptHelper6.map_D Ljava/util/Map;
      // 6a1: invokeinterface java/util/Map.clear ()V 1
      // 6a6: goto 6ad
      // 6a9: invokestatic rip/breeze/StringDecryptHelper6.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ac: athrow
      // 6ad: aload 0
      // 6ae: bipush 0
      // 6af: aload 0
      // 6b0: getfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 6b3: aload 0
      // 6b4: getfield rip/breeze/StringDecryptHelper6.string_j Ljava/lang/String;
      // 6b7: invokevirtual java/lang/String.length ()I
      // 6ba: invokestatic java/lang/Math.min (II)I
      // 6bd: invokestatic java/lang/Math.max (II)I
      // 6c0: putfield rip/breeze/StringDecryptHelper6.fieldInt_o I
      // 6c3: aload 0
      // 6c4: getfield rip/breeze/StringDecryptHelper6.dataBuilder112_h Lrip/breeze/Util133;
      // 6c7: invokevirtual rip/breeze/Util133.getDataBuilder112 ()Lrip/breeze/Util133;
      // 6ca: pop
      // 6cb: bipush 1
      // 6cc: ireturn
      // try (489 -> 495): 496 java/lang/Exception
      // try (470 -> 480): 481 java/lang/Exception
      // try (461 -> 473): 474 java/lang/Exception
      // try (455 -> 467): 468 java/lang/Exception
      // try (449 -> 458): 459 java/lang/Exception
      // try (446 -> 452): 453 java/lang/Exception
      // try (416 -> 422): 423 java/lang/Exception
      // try (396 -> 406): 407 java/lang/Exception
      // try (394 -> 400): 401 java/lang/Exception
      // try (381 -> 391): 392 java/lang/Exception
      // try (368 -> 375): 376 java/lang/Exception
      // try (361 -> 370): 371 java/lang/Exception
      // try (359 -> 365): 366 java/lang/Exception
      // try (348 -> 356): 357 java/lang/Exception
      // try (335 -> 342): 343 java/lang/Exception
      // try (328 -> 337): 338 java/lang/Exception
      // try (326 -> 332): 333 java/lang/Exception
      // try (312 -> 323): 324 java/lang/Exception
      // try (293 -> 300): 301 java/lang/Exception
      // try (279 -> 295): 296 java/lang/Exception
      // try (273 -> 290): 291 java/lang/Exception
      // try (268 -> 276): 277 java/lang/Exception
      // try (261 -> 270): 271 java/lang/Exception
      // try (259 -> 265): 266 java/lang/Exception
      // try (245 -> 256): 257 java/lang/Exception
      // try (229 -> 236): 237 java/lang/Exception
      // try (215 -> 231): 232 java/lang/Exception
      // try (209 -> 226): 227 java/lang/Exception
      // try (204 -> 212): 213 java/lang/Exception
      // try (200 -> 206): 207 java/lang/Exception
      // try (184 -> 198): 198 java/lang/Exception
      // try (160 -> 179): 180 java/lang/Exception
      // try (153 -> 171): 172 java/lang/Exception
      // try (119 -> 157): 158 java/lang/Exception
      // try (110 -> 150): 151 java/lang/Exception
      // try (103 -> 116): 117 java/lang/Exception
      // try (95 -> 107): 108 java/lang/Exception
      // try (88 -> 100): 101 java/lang/Exception
      // try (48 -> 92): 93 java/lang/Exception
      // try (42 -> 85): 86 java/lang/Exception
      // try (35 -> 45): 46 java/lang/Exception
      // try (27 -> 39): 40 java/lang/Exception
      // try (23 -> 32): 33 java/lang/Exception
      // try (9 -> 18): 18 java/lang/Exception
      // try (6 -> 13): 14 java/lang/Exception
      // try (409 -> 549): 605 java/lang/Exception
      // try (550 -> 604): 605 java/lang/Exception
      // try (606 -> 612): 613 java/lang/Exception
      // try (608 -> 618): 619 java/lang/Exception
      // try (615 -> 624): 625 java/lang/Exception
      // try (638 -> 648): 649 java/lang/Exception
      // try (644 -> 654): 655 java/lang/Exception
      // try (651 -> 660): 661 java/lang/Exception
      // try (674 -> 688): 689 java/lang/Exception
      // try (684 -> 694): 695 java/lang/Exception
      // try (691 -> 711): 712 java/lang/Exception
      // try (697 -> 718): 719 java/lang/Exception
      // try (714 -> 724): 725 java/lang/Exception
      // try (721 -> 734): 735 java/lang/Exception
   }

   public boolean clamp_2(char var1) {
      long var2 = 81790150103816L;
      if (!this.fieldBool_n && this.fieldInt_o != -1) {
         if (this.fieldInt_p > 0 && this.string_j.length() >= this.fieldInt_p && !this.isValid()) {
            return true;
         }

         if (this.fieldBool_G && !Character.isDigit(var1) && var1 != '.') {
            return true;
         }

         if (Util6.isValid(var1)) {
            this.update_5();
            if (this.isValid()) {
               int var4 = Math.min(this.fieldInt_q, this.fieldInt_r);
               int var5 = Math.max(this.fieldInt_q, this.fieldInt_r);
               this.clamp_7(var4, var5);
               this.string_j = this.string_j.substring(0, var4) + this.string_j.substring(var5);
               this.fieldInt_o = var4;
               this.initialize();
            }

            if (this.fieldInt_p > 0 && this.string_j.length() >= this.fieldInt_p) {
               return true;
            }

            this.calculate(this.fieldInt_o, 1);
            this.string_j = this.string_j.substring(0, this.fieldInt_o) + var1 + this.string_j.substring(this.fieldInt_o);
            this.processAll_2(this.fieldInt_o, 1);
            this.fieldInt_o++;
            this.dataBuilder112_h.getDataBuilder112();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int clamp_3(float var1) {
      String var4;
      float var7;
      label36: {
         long var2 = 8693106866693L;
         int var10000 = RenderUtil9.getValue_2();
         var4 = this.string_j;
         float var5 = this.clamp_4(var4);
         int var6 = var10000;
         if (this.fieldBool_F) {
            var7 = this.a + Math.max(0.0F, (this.c - var5) * 0.5F);
            if (var6 == 0) {
               break label36;
            }
         }

         var7 = this.a + this.dataBuilder113_l.fieldFloat_a - this.fieldFloat_E;
      }

      float[] var8 = this.measureText(var4, var7);
      if (var4.isEmpty()) {
         return 0;
      }

      if (var1 <= var8[0]) {
         return 0;
      }

      for (int var9 = 0; var9 < var4.length(); var9++) {
         float var10 = (var8[var9] + var8[var9 + 1]) * 0.5F;
         if (var1 < var10) {
            return var9;
         }

         if (var9 == var4.length() - 1) {
            return var4.length();
         }
         break;
      }

      return var4.length();
   }

   private float[] measureText(String var1, float var2) {
      long var3 = 19384214268247L;
      int var10000 = RenderUtil9.getValue_2();
      int var5 = var1.length();
      float[] var6 = new float[var5 + 1];
      var6[0] = var2;
      String var7 = "|";
      float var8 = BreezeContext.iRenderer_b.measureText(var7, EnumType32.SOURCE_SANS, this.fieldInt_m);
      int var9 = var10000;
      int var10 = 0;

      while (var10 < var5) {
         String var11 = var1.substring(0, var10 + 1) + "|";
         float var12 = BreezeContext.iRenderer_b.measureText(var11, EnumType32.SOURCE_SANS, this.fieldInt_m);
         float var13 = var12 - var8;
         if (var13 < 0.0F && var13 > -0.25F) {
            var13 = 0.0F;
         }

         var6[var10 + 1] = var6[var10] + var13;
         var8 = var12;
         var10++;
         if (var9 != 0) {
            break;
         }
      }

      return var6;
   }

   private float clamp_4(String var1) {
      long var2 = 125319425318468L;
      float var4 = BreezeContext.iRenderer_b.measureText(var1 + "|", EnumType32.SOURCE_SANS, this.fieldInt_m);
      float var5 = BreezeContext.iRenderer_b.measureText("|", EnumType32.SOURCE_SANS, this.fieldInt_m);
      float var6 = var4 - var5;
      if (var6 < 0.0F && var6 > -0.25F) {
         var6 = 0.0F;
      }

      return Math.max(0.0F, var6);
   }

   private void clamp_5(String var1, int var2, int var3, float[] var4, float var5, float var6, Color var7) {
      long var8 = 37330810868284L;
      if (var2 < var3) {
         float var10 = var4[var2];
         float var11 = var4[var3];
         float var12 = Math.max(1.0F, var11 - var10);
         BreezeContext.iRenderer_b.renderInRect(var10, var6 - 1.0F, var12, this.fieldInt_m + 2.0F, this::lambda$drawStableRunClipped_Inner2);
      }
   }

   private boolean isValid() {
      long var1 = 124613370778697L;
      return this.fieldInt_q != -1 && this.fieldInt_r != -1 && this.fieldInt_q != this.fieldInt_r;
   }

   private void initialize() {
      this.fieldInt_q = -1;
      this.fieldInt_r = -1;
   }

   private String buildString() {
      long var1 = 73484300899235L;
      if (!this.isValid()) {
         return "";
      }

      int var3 = Math.max(0, Math.min(this.fieldInt_q, this.string_j.length()));
      int var4 = Math.max(0, Math.min(this.fieldInt_r, this.string_j.length()));
      return var3 >= var4 ? "" : this.string_j.substring(var3, var4);
   }

   private void clamp_6() {
      long var1 = 115339545164090L;
      if (this.isValid()) {
         int var3 = Math.min(this.fieldInt_q, this.fieldInt_r);
         int var4 = Math.max(this.fieldInt_q, this.fieldInt_r);
         this.clamp_7(var3, var4);
         this.string_j = this.string_j.substring(0, var3) + this.string_j.substring(var4);
         this.fieldInt_o = var3;
         this.initialize();
      }
   }

   private void processAll(int var1) {
      long var2 = 17087466714693L;
      int var4 = RenderUtil9.getValue();
      if (!this.isValid()) {
         this.fieldInt_q = var1;
         this.fieldInt_r = this.fieldInt_o;
         if (var4 != 0) {
            return;
         }
      }

      this.fieldInt_r = this.fieldInt_o;
   }

   private void processAll_1(int var1) {
      long var2 = 130561560960191L;
      int var4 = RenderUtil9.getValue();
      if (!this.isValid()) {
         this.fieldInt_q = var1;
         this.fieldInt_r = this.fieldInt_o;
         if (var4 != 0) {
            return;
         }
      }

      this.fieldInt_r = this.fieldInt_o;
   }

   private void calculate(int var1, int var2) {
      long var3 = 8682022654769L;
      int var5 = RenderUtil9.getValue_2();
      if (this.fieldBool_A && var2 > 0 && !this.map_D.isEmpty()) {
         HashMap var6 = new HashMap();

         for (Util4 var8 : this.map_D.values()) {
            if (var8.fieldInt_a >= var1) {
               var8.fieldInt_a += var2;
            }

            var6.put(var8.fieldInt_a, var8);
            if (var5 != 0) {
               break;
            }
         }

         this.map_D.clear();
         this.map_D.putAll(var6);
      }
   }

   private void clamp_7(int var1, int var2) {
      long var3 = 126265225052058L;
      int var5 = RenderUtil9.getValue_2();
      if (this.fieldBool_A) {
         if (var1 > var2) {
            int var6 = var1;
            var1 = var2;
            var2 = var6;
         }

         int var11 = Math.max(0, var2 - var1);
         if (var11 != 0) {
            Iterator var7 = this.map_D.entrySet().iterator();

            while (var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               int var9 = (Integer)var8.getKey();
               if (var9 >= var1 && var9 < var2) {
                  var7.remove();
               }

               if (var5 != 0) {
                  break;
               }
            }

            HashMap var12 = new HashMap();

            for (Util4 var10 : this.map_D.values()) {
               if (var10.fieldInt_a >= var2) {
                  var10.fieldInt_a -= var11;
               }

               var12.put(var10.fieldInt_a, var10);
               if (var5 != 0) {
                  break;
               }
            }

            this.map_D.clear();
            this.map_D.putAll(var12);
         }
      }
   }

   private void processAll_2(int var1, int var2) {
      this.calculate_2(var1, var2, 0L);
   }

   private void calculate_2(int var1, int var2, long var3) {
      long var5 = 113471645535194L;
      int var7 = RenderUtil9.getValue_2();
      if (this.fieldBool_A) {
         long var8 = System.currentTimeMillis();
         int var10 = 0;

         while (var10 < var2) {
            int var11 = var1 + var10;
            this.map_D.put(var11, new Util4(var11, var8 + var10 * var3));
            var10++;
            if (var7 != 0) {
               break;
            }
         }
      }
   }

   private void calculate_3(long var1) {
      long var3 = 82308599030843L;
      int var5 = RenderUtil9.getValue();
      if (!this.map_D.isEmpty()) {
         Iterator var6 = this.map_D.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Util4 var8 = (Util4)var7.getValue();
            if (var1 - var8.fieldLong_b >= this.fieldLong_B + 6044643405003263901L) {
               var6.remove();
            }

            if (var5 == 0) {
               break;
            }
         }
      }
   }

   private static float getFloat(float var0) {
      long var1 = 33704035679752L;
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   private static float calculateFloat(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   public void processAll_3() {
      long var1 = 74820003913670L;
      super.toggle_2();
      if (this.fieldInt_o != -1) {
         this.fieldInt_o = -1;
         this.initialize();
         this.map_D.clear();
      }
   }

   public String getString_j() {
      return this.string_j;
   }

   public void clamp_8(String var1) {
      long var2 = 50851720505693L;
      int var4 = RenderUtil9.getValue_2();
      if (var1 == null) {
         var1 = "";
      }

      if (this.fieldBool_G) {
         StringBuilder var5 = new StringBuilder();
         int var6 = 0;

         while (var6 < var1.length()) {
            char var7 = var1.charAt(var6);
            if (Character.isDigit(var7) || var7 == '.') {
               var5.append(var7);
            }

            var6++;
            if (var4 != 0) {
               break;
            }
         }

         var1 = var5.toString();
      }

      if (this.fieldInt_p > 0 && var1.length() > this.fieldInt_p) {
         var1 = var1.substring(0, this.fieldInt_p);
      }

      if (!this.string_j.equals(var1)) {
         this.string_j = var1;
         this.arrayList_t.clear();
         this.arrayList_u.clear();
         this.fieldFloat_E = 0.0F;
         this.initialize();
         this.map_D.clear();
         this.fieldInt_o = this.isValid_2() ? Math.min(this.string_j.length(), this.string_j.length()) : -1;
         if (this.fieldInt_o > -1) {
            this.dataBuilder112_h.getDataBuilder112();
         }
      }
   }

   public void update_1(boolean var1) {
      long var2 = 63510234167076L;
      this.fieldBool_n = var1;
      if (var1) {
         this.fieldInt_o = -1;
         this.initialize();
         this.map_D.clear();
      }
   }

   public boolean isValid_2() {
      long var1 = 18811549042423L;
      return this.fieldInt_o != -1;
   }

   public void update_2() {
      long var1 = 73262255446508L;
      if (!this.fieldBool_n) {
         this.fieldInt_o = this.string_j.length();
         this.dataBuilder112_h.getDataBuilder112();
      }
   }

   public void processAll(Util134 var1) {
      long var2 = 111791915683796L;
      this.dataBuilder113_l = var1 != null ? var1 : new Util134(0.0F, 0.0F);
   }

   public void clamp_9(int var1) {
      long var2 = 426246546630L;
      this.fieldInt_p = var1;
      if (var1 > 0 && this.string_j.length() > var1) {
         this.string_j = this.string_j.substring(0, var1);
         this.fieldInt_o = Math.min(this.fieldInt_o, this.string_j.length());
      }
   }

   public void clamp_10(int var1) {
      this.fieldInt_m = Math.max(1, var1);
   }

   public void setConsumer_i(Consumer<String> var1) {
      this.consumer_i = var1;
   }

   public void update_3(boolean var1) {
      long var2 = 114340949948249L;
      this.fieldBool_A = var1;
      if (!var1) {
         this.map_D.clear();
      }
   }

   public void clamp_11(long var1) {
      this.fieldLong_B = Math.max(1L, var1);
   }

   public void clamp_12(float var1) {
      this.fieldFloat_C = Math.max(0.0F, var1);
   }

   public void setString_k(String var1) {
      this.string_k = var1;
   }

   public void update_4(boolean var1) {
      long var2 = 47296225875996L;
      this.fieldBool_G = var1;
      if (var1) {
         this.clamp_8(this.string_j);
      }
   }

   public boolean isBool_G() {
      return this.fieldBool_G;
   }

   private void update_5() {
      this.arrayList_t.add(this.string_j);
      this.arrayList_u.add(this.fieldInt_o);
   }

   private void clamp_13() {
      long var1 = 40801329046093L;
      if (!this.arrayList_t.isEmpty()) {
         this.string_j = this.arrayList_t.remove(this.arrayList_t.size() - 1);
         this.fieldInt_o = this.arrayList_u.remove(this.arrayList_u.size() - 1);
         this.fieldInt_o = Math.max(0, Math.min(this.fieldInt_o, this.string_j.length()));
      }
   }

   private void lambda$drawStableRunClipped_Inner2(String var1, float var2, float var3, Color var4) {
      BreezeContext.iRenderer_b.drawText(var1, var2, var3, var4, EnumType32.SOURCE_SANS, this.fieldInt_m);
   }

   private void lambda$draw_Inner1() {
      long var1 = 124124776868922L;
      int var3 = RenderUtil9.getValue();
      if (this.string_j.isEmpty()) {
         float var29 = this.fieldBool_F ? this.a + Math.max(0.0F, (this.c - this.clamp_4(this.string_k)) * 0.5F) : this.a + this.dataBuilder113_l.fieldFloat_a;
         BreezeContext.iRenderer_b
            .drawText(
               this.string_k,
               var29,
               this.b + this.dataBuilder113_l.fieldFloat_b,
               BreezeContext.authSession_c.getColor("textbox.text-placeholder"),
               EnumType32.SOURCE_SANS,
               this.fieldInt_m
            );
         if (this.fieldInt_o > -1 && this.isValid_2()) {
            BreezeContext.iRenderer_b
               .drawRect(
                  var29,
                  this.b + this.dataBuilder113_l.fieldFloat_b,
                  1.0F,
                  this.fieldInt_m,
                  BreezeContext.authSession_c.getColor("textbox.text")
               );
         }
      } else {
         if (this.fieldInt_o > -1 && this.dataBuilder112_h.isValid(-1557874413831097103L)) {
            this.dataBuilder112_h.getDataBuilder112();
         }

         Color var4;
         float var5;
         String var6;
         float var8;
         label143: {
            var4 = BreezeContext.authSession_c.getColor("textbox.text");
            var5 = this.b + this.dataBuilder113_l.fieldFloat_b;
            var6 = this.string_j;
            float var7 = this.clamp_4(var6);
            if (this.fieldBool_F) {
               var8 = this.a + Math.max(0.0F, (this.c - var7) * 0.5F);
               this.fieldFloat_E = 0.0F;
               if (var3 != 0) {
                  break label143;
               }
            }

            label144: {
               if (this.fieldInt_o == -1) {
                  this.fieldFloat_E = 0.0F;
                  if (var3 != 0) {
                     break label144;
                  }
               }

               label129: {
                  float[] var9 = this.measureText(var6, this.a + this.dataBuilder113_l.fieldFloat_a - this.fieldFloat_E);
                  float var10 = var9[Math.max(0, Math.min(this.fieldInt_o, var6.length()))];
                  float var11 = this.a + this.dataBuilder113_l.fieldFloat_a;
                  float var12 = this.a + this.c - this.dataBuilder113_l.fieldFloat_a;
                  if (var10 < var11) {
                     this.fieldFloat_E -= var11 - var10 + 6.0F;
                     if (var3 != 0) {
                        break label129;
                     }
                  }

                  if (var10 > var12) {
                     this.fieldFloat_E += var10 - var12 + 6.0F;
                  }
               }

               float var13 = Math.max(0.0F, var7 - (this.c - this.dataBuilder113_l.fieldFloat_a * 2.0F));
               if (this.fieldFloat_E < 0.0F) {
                  this.fieldFloat_E = 0.0F;
               }

               if (this.fieldFloat_E > var13) {
                  this.fieldFloat_E = var13;
               }
            }

            var8 = this.a + this.dataBuilder113_l.fieldFloat_a - this.fieldFloat_E;
         }

         float[] var30;
         var30 = this.measureText(var6, var8);
         label121:
         if (this.isValid_2() && this.isValid()) {
            int var31 = Math.max(0, Math.min(this.fieldInt_q, this.fieldInt_r));
            int var32 = Math.max(0, Math.min(Math.max(this.fieldInt_q, this.fieldInt_r), var6.length()));
            if (var31 != var32) {
               float var33 = var30[var31];
               float var36 = var30[var32];
               if (var36 == var33) {
                  var36 = var33 + 2.0F;
               }

               BreezeContext.iRenderer_b
                  .drawRect(var33, var5, var36 - var33, this.fieldInt_m, BreezeContext.authSession_c.getColor("textbox.selection"));
               if (var3 != 0) {
                  break label121;
               }
            }

            float var34 = var30[var31];
            BreezeContext.iRenderer_b
               .drawRect(var34, var5, 2.0F, this.fieldInt_m, BreezeContext.authSession_c.getColor("textbox.selection"));
         }

         label145: {
            long var14 = System.currentTimeMillis();
            this.calculate_3(var14);
            boolean var35 = this.fieldBool_A && !this.map_D.isEmpty();
            if (!var35) {
               BreezeContext.iRenderer_b.drawText(var6, var8, var5, var4, EnumType32.SOURCE_SANS, this.fieldInt_m);
               if (var3 != 0) {
                  break label145;
               }
            }

            int var37 = -1;
            int var16 = 0;

            while (var16 < var6.length()) {
               label99: {
                  boolean var17 = this.map_D.containsKey(var16);
                  if (!var17) {
                     if (var37 != -1) {
                        break label99;
                     }

                     var37 = var16;
                     if (var3 != 0) {
                        break label99;
                     }
                  }

                  if (var37 != -1) {
                     this.clamp_5(var6, var37, var16, var30, var8, var5, var4);
                     var37 = -1;
                  }
               }

               var16++;
               if (var3 == 0) {
                  break;
               }
            }

            if (var37 != -1) {
               this.clamp_5(var6, var37, var6.length(), var30, var8, var5, var4);
            }

            for (Entry var41 : this.map_D.entrySet()) {
               int var18 = (Integer)var41.getKey();
               if (var18 >= 0 && var18 < var6.length()) {
                  Util4 var19 = (Util4)var41.getValue();
                  float var20 = getFloat((float)(var14 - var19.fieldLong_b) / (float)this.fieldLong_B);
                  float var21 = calculateFloat(var20);
                  float var22 = (1.0F - var21) * this.fieldFloat_C;
                  int var23 = var4.getAlpha();
                  int var24 = Math.max(0, Math.min(255, (int)(var23 * var21)));
                  if (var24 > 0) {
                     Color var25 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), var24);
                     float var26 = var30[var18];
                     float var27 = var30[var18 + 1];
                     float var28 = Math.max(1.0F, var27 - var26);
                     BreezeContext.iRenderer_b.renderInRect(var26, var5 - 1.0F, var28, this.fieldInt_m + 2.0F, this::lambda$null_Inner0);
                     if (var3 == 0) {
                        break;
                     }
                  }
               }
            }
         }

         if (this.fieldInt_o > -1 && !this.dataBuilder112_h.isValid(6532390458823282077L)) {
            int var38 = Math.max(0, Math.min(this.fieldInt_o, var6.length()));
            float var40 = var30[var38];
            BreezeContext.iRenderer_b.drawRect(var40, var5, 1.0F, this.fieldInt_m, var4);
         }
      }
   }

   private void lambda$null_Inner0(String var1, float var2, float var3, float var4, Color var5) {
      BreezeContext.iRenderer_b.drawText(var1, var2, var3 + var4, var5, EnumType32.SOURCE_SANS, this.fieldInt_m);
   }

   public static void initialize_2(int var0) {
      fieldInt_H = var0;
   }

   public static int getValue() {
      return fieldInt_H;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 59 : 0;
   }

   static {
      initialize_2(12);
      long var0 = 41532083956271L;
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
      String var6 = "\u0013ÊehuÕ´¹\u009aâ± qshÚì\u00823Ú°\u0092\"R«I mpI¡\u0099ÝÔ{ÝJä\u008888£\u001c²ýZõ'<ð\u008d\u0086\u0006æQ»!f(d\u0013\u0080Ò\fs\u0090çÔ«Mó\u0004\u001a\"\u00ad-\u0015¸\u0011\u0011@ý9¬Æ99iåþØ\n(MD\u009a\u0090 \u0090p~ÐÐ{è²°\u009eF`\u001fÒ\u0012Ü±\u0000:}\u001f¾\u0006ÃJÀèAÄ1ÃB";
      int var7 = "\u0013ÊehuÕ´¹\u009aâ± qshÚì\u00823Ú°\u0092\"R«I mpI¡\u0099ÝÔ{ÝJä\u008888£\u001c²ýZõ'<ð\u008d\u0086\u0006æQ»!f(d\u0013\u0080Ò\fs\u0090çÔ«Mó\u0004\u001a\"\u00ad-\u0015¸\u0011\u0011@ý9¬Æ99iåþØ\n(MD\u009a\u0090 \u0090p~ÐÐ{è²°\u009eF`\u001fÒ\u0012Ü±\u0000:}\u001f¾\u0006ÃJÀèAÄ1ÃB"
         .length();
      char var8 = '(';
      int var28 = -1;

      label66:
      while (true) {
         String var30 = var6.substring(++var28, var28 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var43;
                  if ((var28 += var8) >= var7) {
                     CONST_J = var4;
                     CONST_K = new String[5];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -2477369123341748604L;
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
                     long var47 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = (byte)-1;
                     5224815930193739798L = var47;
                     CONST_P = new HashMap(13);
                     Cipher var16;
                     var10000 = var16 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var17 = 1; var17 < 8; var17++) {
                        var10003[var17] = (byte)(var0 << var17 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var18 = new long[7];
                     int var19 = 0;
                     String var20 = "4\u0017Ô)ÍÉ\u0098¸e¹x;-ÓsNûþµ16\u0013\nÖoxN<^5¯\u008eÊYbOF\u001fÔ\u0016";
                     int var21 = "4\u0017Ô)ÍÉ\u0098¸e¹x;-ÓsNûþµ16\u0013\nÖoxN<^5¯\u008eÊYbOF\u001fÔ\u0016".length();
                     byte var22 = 0;

                     label42:
                     while (true) {
                        var10001 = var22;
                        var22 += 8;
                        byte[] var23 = var20.substring(var10001, var22).getBytes("ISO-8859-1");
                        long[] var34 = var18;
                        var10001 = var19++;
                        long var49 = (var23[0] & 255L) << 56
                           | (var23[1] & 255L) << 48
                           | (var23[2] & 255L) << 40
                           | (var23[3] & 255L) << 32
                           | (var23[4] & 255L) << 24
                           | (var23[5] & 255L) << 16
                           | (var23[6] & 255L) << 8
                           | var23[7] & 255L;
                        byte var53 = -1;

                        while (true) {
                           long var24 = var49;
                           byte[] var26 = var16.doFinal(
                              new byte[]{
                                 (byte)(var24 >>> 56),
                                 (byte)(var24 >>> 48),
                                 (byte)(var24 >>> 40),
                                 (byte)(var24 >>> 32),
                                 (byte)(var24 >>> 24),
                                 (byte)(var24 >>> 16),
                                 (byte)(var24 >>> 8),
                                 (byte)var24
                              }
                           );
                           long var55 = (var26[0] & 255L) << 56
                              | (var26[1] & 255L) << 48
                              | (var26[2] & 255L) << 40
                              | (var26[3] & 255L) << 32
                              | (var26[4] & 255L) << 24
                              | (var26[5] & 255L) << 16
                              | (var26[6] & 255L) << 8
                              | var26[7] & 255L;
                           switch (var53) {
                              case 0:
                                 var34[var10001] = var55;
                                 if (var22 >= var21) {
                                    CONST_N = var18;
                                    CONST_O = new Long[7];
                                    500L = ((String)null);
                                    return;
                                 }
                                 break;
                              default:
                                 var34[var10001] = var55;
                                 if (var22 < var21) {
                                    continue label42;
                                 }

                                 var20 = "¾\u0005\u0085ÝÛ\u009f\u0094\u0003\u0002ìÃÛ\twO»";
                                 var21 = "¾\u0005\u0085ÝÛ\u009f\u0094\u0003\u0002ìÃÛ\twO»".length();
                                 var22 = 0;
                           }

                           byte var41 = var22;
                           var22 += 8;
                           var23 = var20.substring(var41, var22).getBytes("ISO-8859-1");
                           var34 = var18;
                           var10001 = var19++;
                           var49 = (var23[0] & 255L) << 56
                              | (var23[1] & 255L) << 48
                              | (var23[2] & 255L) << 40
                              | (var23[3] & 255L) << 32
                              | (var23[4] & 255L) << 24
                              | (var23[5] & 255L) << 16
                              | (var23[6] & 255L) << 8
                              | var23[7] & 255L;
                           var53 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var28);
                  break;
               default:
                  var4[var5++] = var43;
                  if ((var28 += var8) < var7) {
                     var8 = var6.charAt(var28);
                     continue label66;
                  }

                  var6 = "üjg\u008dó¢Z@ZÈ8\u009cÝ1B:pëg©BÓ\u0091s03\u00037á\u0081»ù(ç*´ø~[°jnßú¤¤ap)n¦ \u0085(\u0098ã§\u0085G5i\u0005)ìßSî=ÄÏÇ\u0082\u0017";
                  var7 = "üjg\u008dó¢Z@ZÈ8\u009cÝ1B:pëg©BÓ\u0091s03\u00037á\u0081»ù(ç*´ø~[°jnßú¤¤ap)n¦ \u0085(\u0098ã§\u0085G5i\u0005)ìßSî=ÄÏÇ\u0082\u0017"
                     .length();
                  var8 = ' ';
                  var28 = -1;
            }

            var30 = var6.substring(++var28, var28 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2411;
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
            throw new RuntimeException("rip/breeze/ej", var10);
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
         CONST_K[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_K[var3];
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
         throw new RuntimeException("rip/breeze/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25903;
      if (CONST_O[var3] == null) {
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
         long var5 = CONST_N[var3];
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
         Object[] var9 = (Object[])CONST_P.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/ej", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_O[var3] = var14;
      }

      return CONST_O[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
