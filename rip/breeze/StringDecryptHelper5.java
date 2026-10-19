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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StringDecryptHelper5 extends UIPanel {
   private final Util133 dataBuilder112_h;
   private Consumer<String> consumer_i;
   private String string_j;
   private String string_k;
   private Util134 dataBuilder113_l;
   private int fieldInt_m;
   private int fieldInt_n;
   private int fieldInt_o;
   private EnumType32 enum_SOURCE_SANS_p;
   private boolean fieldBool_q;
   private boolean fieldBool_r;
   private LinkedList<String> linkedList_s;
   private LinkedList<Integer> linkedList_t;
   private int fieldInt_u;
   private List<Util3> list_v;
   private boolean fieldBool_w;
   private boolean fieldBool_x;
   private float fieldFloat_y;
   private float fieldFloat_z;
   private float fieldFloat_A;
   private boolean fieldBool_B;
   private boolean fieldBool_C;
   private LicenseState licenseState_D;
   private LicenseState licenseState_E;
   private boolean fieldBool_F;
   private float fieldFloat_G;
   private float fieldFloat_H;
   private float fieldFloat_I;
   private int fieldInt_J;
   private int fieldInt_K;
   private int fieldInt_L;
   private boolean fieldBool_M;
   private static final long eka_1;
   private long fieldLong_O;
   private int fieldInt_P;
   private int fieldInt_Q;
   private static final String CONST_R = "|";
   private static final float CONST_S = 14.0F;
   private static final float CONST_T = 14.0F;
   private static final float CONST_U = 900.0F;
   private boolean fieldBool_V;
   private long fieldLong_W;
   private float fieldFloat_X;
   private final Map<Integer, Util15> map_Y;
   private static boolean fieldBool_Z;
   private static final String[] CONST_DB;
   private static final String[] CONST_EB;
   private static final Map CONST_FB = new HashMap(13);
   private static final long[] CONST_GB;
   private static final Integer[] CONST_HB;
   private static final Map CONST_IB;
   private static final long[] CONST_JB;
   private static final Long[] CONST_KB;
   private static final Map CONST_LB;

   public StringDecryptHelper5(String var1, LicenseState var2) {
      this(var1, var2, null);
   }

   public StringDecryptHelper5(String var1, LicenseState var2, Consumer<String> var3) {
      long var4 = 109764245831182L;
      super(var2);
      this.dataBuilder112_h = new Util133();
      this.string_j = "";
      this.dataBuilder113_l = new Util134(4.0F, 4.0F);
      this.fieldInt_m = -1;
      this.fieldInt_n = -1;
      this.fieldInt_o = 7866726768275501351L;
      this.enum_SOURCE_SANS_p = EnumType32.SOURCE_SANS;
      this.fieldBool_q = false;
      this.fieldBool_r = false;
      this.linkedList_s = new LinkedList<>();
      this.linkedList_t = new LinkedList<>();
      this.fieldInt_u = -3044091842998153548L;
      this.list_v = new ArrayList<>();
      this.fieldBool_w = true;
      this.fieldBool_x = false;
      this.fieldFloat_y = 0.0F;
      this.fieldFloat_z = 0.0F;
      this.fieldFloat_A = 2.0F;
      int var10000 = RenderUtil9.getValue_2();
      this.fieldBool_B = true;
      this.fieldBool_C = false;
      this.fieldBool_F = false;
      this.fieldFloat_G = 0.0F;
      this.fieldFloat_H = 10.0F;
      this.fieldFloat_I = 10.0F;
      this.fieldInt_J = 3345141869925769641L;
      this.fieldInt_K = -1;
      this.fieldInt_L = -1;
      this.fieldBool_M = false;
      this.fieldLong_O = 0L;
      this.fieldInt_P = -1;
      this.fieldInt_Q = 0;
      int var6 = var10000;
      this.fieldBool_V = false;
      this.fieldLong_W = 500L;
      this.fieldFloat_X = 7.0F;
      this.map_Y = new HashMap<>();
      this.string_k = var1;
      this.consumer_i = var3;
      if (LicenseState.checkCondition()) {
         RenderUtil9.initialize(++var6);
      }
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 4489885032390L;
      super.toggle(var1, var2, var3);
      if (this.fieldBool_w) {
         this.clamp_10();
         this.fieldBool_w = false;
         this.update_9();
      }

      if (this.fieldBool_M && this.fieldInt_m != -1) {
         if (this.fieldBool_x) {
            this.clamp_27(var2, var3);
         }

         int var6 = this.clamp(var1, var2);
         if (!this.isValid_2()) {
            this.fieldInt_K = this.fieldInt_m;
         }

         this.fieldInt_L = var6;
         this.fieldInt_m = var6;
         this.dataBuilder112_h.getDataBuilder112();
      }

      if (this.checkCondition()) {
         this.dataBuilder112_h.getDataBuilder112();
      }

      if (this.fieldFloat_y != this.fieldFloat_z) {
         this.fieldFloat_z = (float)MathUtil1.calculateDouble_2(this.fieldFloat_z, this.fieldFloat_y, 13.0, var3);
         if (Math.abs(this.fieldFloat_y - this.fieldFloat_z) < 1.0F) {
            this.fieldFloat_z = this.fieldFloat_y;
         }

         this.g();
      }

      BreezeContext.iRenderer_b.renderInRect(this.a, this.b, this.c, this.d, this::lambda$draw_Inner1);
      this.clamp_9(var2);
      this.update_2();
   }

   private boolean checkCondition() {
      long var1 = 20682138233856L;
      return this.fieldInt_m > -1 && this.dataBuilder112_h.isValid(500L);
   }

   private boolean isValid(int var1, int var2) {
      long var3 = 123767135329057L;
      if (var1 >= 0 && var1 < this.list_v.size()) {
         Util3 var5 = this.list_v.get(var1);
         int var6 = var5.fieldInt_a;
         int var7 = var5.fieldInt_b;
         if (var2 > var6 && var2 < var7) {
            return true;
         }

         if (var2 == var6) {
            return true;
         }

         if (var2 != var7) {
            return false;
         }

         if (var2 == this.string_j.length()) {
            return true;
         }

         if (var1 + 1 >= this.list_v.size()) {
            return true;
         }

         Util3 var8 = this.list_v.get(var1 + 1);
         return var8.fieldInt_a != var2;
      } else {
         return false;
      }
   }

   public boolean checkCondition_2(float var1, float var2, int var3, boolean var4) {
      long var5 = 98234887262385L;
      if (this.fieldBool_C && var3 == 0 && this.licenseState_E != null && this.licenseState_E.isValid(var1, var2)) {
         this.fieldBool_F = true;
         float var7 = this.licenseState_E.fieldFloat_b + this.licenseState_E.fieldFloat_d * 0.5F;
         this.fieldFloat_G = var2 - var7;
         return true;
      } else {
         return this.fieldBool_q && !this.fieldBool_r
            ? super.checkCondition(var1, var2, var3, var4)
            : super.checkCondition(var1, var2, var3, var4) || this.absValue_2(var1, var2, var3, var4);
      }
   }

   private boolean absValue_2(float var1, float var2, int var3, boolean var4) {
      long var5 = 110201098447741L;
      int var7 = RenderUtil9.getValue();
      if (!this.a(var1, var2)) {
         if (this.fieldInt_m != -1) {
            this.fieldInt_m = -1;
            this.initialize();
            if (this.consumer_i != null) {
               this.consumer_i.accept(this.string_j);
            }

            return false;
         } else {
            return super.checkCondition(var1, var2, var3, var4);
         }
      } else {
         if (var4) {
            this.fieldInt_m = -1;
            return true;
         }

         int var8 = this.clamp(var1, var2);
         boolean var9 = BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_115();
         if (var3 == 0) {
            long var10;
            label63: {
               var10 = System.currentTimeMillis();
               if (var10 - this.fieldLong_O <= -6172864330917207183L && Math.abs(var8 - this.fieldInt_P) <= 1) {
                  this.fieldInt_Q++;
                  if (var7 != 0) {
                     break label63;
                  }
               }

               this.fieldInt_Q = 1;
            }

            this.fieldLong_O = var10;
            this.fieldInt_P = var8;
            if (this.fieldInt_Q == 3) {
               this.clamp_22(var8);
               this.fieldBool_M = false;
               if (this.fieldBool_x) {
                  this.calculate_7();
               }

               return true;
            }

            if (this.fieldInt_Q == 2) {
               this.clamp_21(var8);
               this.fieldBool_M = false;
               if (this.fieldBool_x) {
                  this.calculate_7();
               }

               return true;
            }
         }

         label72: {
            if (!var9) {
               this.fieldInt_m = var8;
               this.initialize();
               if (var7 != 0) {
                  break label72;
               }
            }

            if (!this.isValid_2()) {
               this.fieldInt_K = this.fieldInt_m;
            }

            this.fieldInt_L = var8;
            this.fieldInt_m = var8;
         }

         this.fieldBool_M = var3 == 0;
         this.dataBuilder112_h.getDataBuilder112();
         if (this.fieldBool_x) {
            this.calculate_7();
         }

         return true;
      }
   }

   public void toggle(float var1, float var2, int var3) {
      long var4 = 14416543233365L;
      if (this.fieldBool_F) {
         this.fieldBool_F = false;
      }

      this.fieldBool_M = false;
      super.noOp(var1, var2, var3);
   }

   public boolean checkCondition_3(float var1, float var2, float var3) {
      long var4 = 139163048336493L;
      if (!this.fieldBool_x) {
         return false;
      }

      if (!this.a(var1, var2)) {
         return false;
      }

      if (this.list_v.isEmpty()) {
         return false;
      }

      this.fieldFloat_y = this.fieldFloat_y - var3 * BreezeContext.iKeybindSettings_e.getX();
      this.update_9();
      return true;
   }

   private int clamp(float var1, float var2) {
      long var3 = 11392465183331L;
      int var5 = RenderUtil9.getValue();
      if (!this.string_j.isEmpty() && !this.list_v.isEmpty()) {
         float var6 = this.fieldInt_o + this.fieldInt_u;
         float var7 = this.b + this.dataBuilder113_l.fieldFloat_b - (this.fieldBool_x ? this.fieldFloat_z : 0.0F);
         int var8 = (int)Math.floor((var2 - var7) / var6);
         var8 = Math.max(0, Math.min(this.list_v.size() - 1, var8));
         Util3 var9 = this.list_v.get(var8);
         int var10 = Math.min(var9.fieldInt_b, this.string_j.length());
         int var11 = Math.min(var9.fieldInt_a, var10);
         String var12 = this.buildString_2(this.string_j, var11, var10);
         float var13 = this.a + this.dataBuilder113_l.fieldFloat_a;
         float[] var14 = this.measureText(var12, var13);
         if (var1 <= var14[0]) {
            return var11;
         }

         int var15 = 0;

         while (var15 < var12.length()) {
            float var16 = (var14[var15] + var14[var15 + 1]) * 0.5F;
            if (var1 < var16) {
               return var11 + var15;
            }

            var15++;
            if (var5 == 0) {
               break;
            }
         }

         return var10;
      } else {
         return 0;
      }
   }

   public boolean clamp_2(char var1) {
      long var2 = 52387968561844L;
      if (this.fieldInt_m == -1) {
         return false;
      }

      if (this.fieldBool_q) {
         return true;
      }

      if (this.fieldInt_n > 0 && this.string_j.length() >= this.fieldInt_n && !this.isValid_2()) {
         return true;
      }

      if (Util6.isValid(var1)) {
         this.update_3();
         if (this.isValid_2()) {
            int var4 = Math.min(this.fieldInt_K, this.fieldInt_L);
            int var5 = Math.max(this.fieldInt_K, this.fieldInt_L);
            this.clamp_23(var4, var5);
            this.string_j = this.string_j.substring(0, var4) + this.string_j.substring(var5);
            this.fieldInt_m = var4;
            this.initialize();
         }

         if (this.fieldInt_n > 0 && this.string_j.length() >= this.fieldInt_n) {
            return true;
         }

         this.calculate_4(this.fieldInt_m, 1);
         this.string_j = this.string_j.substring(0, this.fieldInt_m) + var1 + this.string_j.substring(this.fieldInt_m);
         this.processAll(this.fieldInt_m, 1);
         this.fieldInt_m++;
         if (this.consumer_i != null) {
            this.consumer_i.accept(this.string_j);
         }

         this.fieldBool_w = true;
         this.dataBuilder112_h.getDataBuilder112();
         if (this.fieldBool_x) {
            if (this.fieldBool_w) {
               this.clamp_10();
               this.fieldBool_w = false;
            }

            this.calculate_7();
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean clamp_3(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/StringDecryptHelper5.31632608420720L J
      // 003: ldc2_w 58990264291679
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/RenderUtil9.getValue_2 ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 011: bipush -1
      // 012: if_icmpne 01b
      // 015: bipush 0
      // 016: ireturn
      // 017: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield rip/breeze/StringDecryptHelper5.fieldBool_q Z
      // 01f: ifeq 037
      // 022: aload 0
      // 023: iload 1
      // 024: invokespecial rip/breeze/StringDecryptHelper5.checkCondition_4 (I)Z
      // 027: ifeq 037
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: bipush 1
      // 032: ireturn
      // 033: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: bipush 0
      // 038: istore 5
      // 03a: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 03d: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_115 ()Z 1
      // 042: istore 6
      // 044: iload 1
      // 045: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 048: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_BACK ()I 1
      // 04d: if_icmpne 118
      // 050: aload 0
      // 051: invokespecial rip/breeze/StringDecryptHelper5.update_3 ()V
      // 054: aload 0
      // 055: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 058: ifeq 0bd
      // 05b: goto 062
      // 05e: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 066: aload 0
      // 067: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 06a: invokestatic java/lang/Math.min (II)I
      // 06d: istore 7
      // 06f: aload 0
      // 070: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 073: aload 0
      // 074: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 077: invokestatic java/lang/Math.max (II)I
      // 07a: istore 8
      // 07c: aload 0
      // 07d: iload 7
      // 07f: iload 8
      // 081: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 084: aload 0
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: aload 0
      // 08d: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 090: bipush 0
      // 091: iload 7
      // 093: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: aload 0
      // 09a: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 09d: iload 8
      // 09f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 0ab: aload 0
      // 0ac: iload 7
      // 0ae: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0b1: aload 0
      // 0b2: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 0b5: bipush 1
      // 0b6: istore 5
      // 0b8: iload 4
      // 0ba: ifeq a02
      // 0bd: aload 0
      // 0be: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0c1: ifle a02
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 0
      // 0cd: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0d0: bipush 1
      // 0d1: isub
      // 0d2: aload 0
      // 0d3: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0d6: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 0d9: aload 0
      // 0da: new java/lang/StringBuilder
      // 0dd: dup
      // 0de: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e1: aload 0
      // 0e2: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 0e5: bipush 0
      // 0e6: aload 0
      // 0e7: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0ea: bipush 1
      // 0eb: isub
      // 0ec: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: aload 0
      // 0f3: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 0f6: aload 0
      // 0f7: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 0fa: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 106: aload 0
      // 107: dup
      // 108: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 10b: bipush 1
      // 10c: isub
      // 10d: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 110: bipush 1
      // 111: istore 5
      // 113: iload 4
      // 115: ifeq a02
      // 118: iload 1
      // 119: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 11c: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_108 ()I 1
      // 121: if_icmpne 1f0
      // 124: goto 12b
      // 127: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: aload 0
      // 12c: invokespecial rip/breeze/StringDecryptHelper5.update_3 ()V
      // 12f: aload 0
      // 130: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 133: ifeq 198
      // 136: goto 13d
      // 139: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 141: aload 0
      // 142: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 145: invokestatic java/lang/Math.min (II)I
      // 148: istore 7
      // 14a: aload 0
      // 14b: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 14e: aload 0
      // 14f: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 152: invokestatic java/lang/Math.max (II)I
      // 155: istore 8
      // 157: aload 0
      // 158: iload 7
      // 15a: iload 8
      // 15c: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 15f: aload 0
      // 160: new java/lang/StringBuilder
      // 163: dup
      // 164: invokespecial java/lang/StringBuilder.<init> ()V
      // 167: aload 0
      // 168: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 16b: bipush 0
      // 16c: iload 7
      // 16e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: aload 0
      // 175: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 178: iload 8
      // 17a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 183: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 186: aload 0
      // 187: iload 7
      // 189: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 18c: aload 0
      // 18d: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 190: bipush 1
      // 191: istore 5
      // 193: iload 4
      // 195: ifeq a02
      // 198: aload 0
      // 199: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 19c: aload 0
      // 19d: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 1a0: invokevirtual java/lang/String.length ()I
      // 1a3: if_icmpge a02
      // 1a6: goto 1ad
      // 1a9: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: aload 0
      // 1af: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 1b2: aload 0
      // 1b3: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 1b6: bipush 1
      // 1b7: iadd
      // 1b8: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 1bb: aload 0
      // 1bc: new java/lang/StringBuilder
      // 1bf: dup
      // 1c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c3: aload 0
      // 1c4: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 1c7: bipush 0
      // 1c8: aload 0
      // 1c9: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 1cc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: aload 0
      // 1d3: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 1d6: aload 0
      // 1d7: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 1da: bipush 1
      // 1db: iadd
      // 1dc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e5: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 1e8: bipush 1
      // 1e9: istore 5
      // 1eb: iload 4
      // 1ed: ifeq a02
      // 1f0: iload 1
      // 1f1: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 1f4: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_RETURN ()I 1
      // 1f9: if_icmpne 2df
      // 1fc: goto 203
      // 1ff: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aload 0
      // 204: getfield rip/breeze/StringDecryptHelper5.fieldInt_n I
      // 207: ifle 22c
      // 20a: goto 211
      // 20d: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: aload 0
      // 212: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 215: invokevirtual java/lang/String.length ()I
      // 218: aload 0
      // 219: getfield rip/breeze/StringDecryptHelper5.fieldInt_n I
      // 21c: if_icmplt 22c
      // 21f: goto 226
      // 222: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 225: athrow
      // 226: bipush 1
      // 227: ireturn
      // 228: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: aload 0
      // 22d: invokespecial rip/breeze/StringDecryptHelper5.update_3 ()V
      // 230: aload 0
      // 231: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 234: ifeq 28a
      // 237: aload 0
      // 238: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 23b: aload 0
      // 23c: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 23f: invokestatic java/lang/Math.min (II)I
      // 242: istore 7
      // 244: aload 0
      // 245: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 248: aload 0
      // 249: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 24c: invokestatic java/lang/Math.max (II)I
      // 24f: istore 8
      // 251: aload 0
      // 252: iload 7
      // 254: iload 8
      // 256: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 259: aload 0
      // 25a: new java/lang/StringBuilder
      // 25d: dup
      // 25e: invokespecial java/lang/StringBuilder.<init> ()V
      // 261: aload 0
      // 262: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 265: bipush 0
      // 266: iload 7
      // 268: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 26b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26e: aload 0
      // 26f: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 272: iload 8
      // 274: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27d: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 280: aload 0
      // 281: iload 7
      // 283: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 286: aload 0
      // 287: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 28a: aload 0
      // 28b: aload 0
      // 28c: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 28f: bipush 1
      // 290: invokespecial rip/breeze/StringDecryptHelper5.calculate_4 (II)V
      // 293: aload 0
      // 294: new java/lang/StringBuilder
      // 297: dup
      // 298: invokespecial java/lang/StringBuilder.<init> ()V
      // 29b: aload 0
      // 29c: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 29f: bipush 0
      // 2a0: aload 0
      // 2a1: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2a4: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: ldc_w "\n"
      // 2ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b0: aload 0
      // 2b1: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 2b4: aload 0
      // 2b5: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2b8: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c1: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 2c4: aload 0
      // 2c5: aload 0
      // 2c6: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2c9: bipush 1
      // 2ca: invokespecial rip/breeze/StringDecryptHelper5.processAll (II)V
      // 2cd: aload 0
      // 2ce: dup
      // 2cf: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2d2: bipush 1
      // 2d3: iadd
      // 2d4: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2d7: bipush 1
      // 2d8: istore 5
      // 2da: iload 4
      // 2dc: ifeq a02
      // 2df: iload 1
      // 2e0: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 2e3: invokeinterface rip/breeze/IKeyCodeProvider.getModifiedKeyCode ()I 1
      // 2e8: if_icmpne 31f
      // 2eb: goto 2f2
      // 2ee: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f1: athrow
      // 2f2: aload 0
      // 2f3: bipush -1
      // 2f4: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 2f7: aload 0
      // 2f8: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 2fb: aload 0
      // 2fc: getfield rip/breeze/StringDecryptHelper5.consumer_i Ljava/util/function/Consumer;
      // 2ff: ifnull 31d
      // 302: goto 309
      // 305: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: aload 0
      // 30a: getfield rip/breeze/StringDecryptHelper5.consumer_i Ljava/util/function/Consumer;
      // 30d: aload 0
      // 30e: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 311: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 316: goto 31d
      // 319: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: bipush 1
      // 31e: ireturn
      // 31f: iload 1
      // 320: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 323: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_NUMPAD6 ()I 1
      // 328: if_icmpne 3a9
      // 32b: iload 6
      // 32d: ifne 364
      // 330: goto 337
      // 333: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 336: athrow
      // 337: aload 0
      // 338: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 33b: ifeq 364
      // 33e: goto 345
      // 341: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: aload 0
      // 346: aload 0
      // 347: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 34a: aload 0
      // 34b: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 34e: invokestatic java/lang/Math.min (II)I
      // 351: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 354: aload 0
      // 355: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 358: iload 4
      // 35a: ifeq a02
      // 35d: goto 364
      // 360: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: iload 6
      // 366: ifne 37b
      // 369: goto 370
      // 36c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: aload 0
      // 371: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 374: goto 37b
      // 377: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37a: athrow
      // 37b: aload 0
      // 37c: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 37f: ifle a02
      // 382: aload 0
      // 383: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 386: istore 7
      // 388: aload 0
      // 389: dup
      // 38a: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 38d: bipush 1
      // 38e: isub
      // 38f: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 392: iload 6
      // 394: ifeq 3a4
      // 397: aload 0
      // 398: iload 7
      // 39a: invokespecial rip/breeze/StringDecryptHelper5.update (I)V
      // 39d: goto 3a4
      // 3a0: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: iload 4
      // 3a6: ifeq a02
      // 3a9: iload 1
      // 3aa: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 3ad: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_ADD ()I 1
      // 3b2: if_icmpne 441
      // 3b5: goto 3bc
      // 3b8: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: iload 6
      // 3be: ifne 3f5
      // 3c1: goto 3c8
      // 3c4: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c7: athrow
      // 3c8: aload 0
      // 3c9: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 3cc: ifeq 3f5
      // 3cf: goto 3d6
      // 3d2: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: aload 0
      // 3d7: aload 0
      // 3d8: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 3db: aload 0
      // 3dc: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 3df: invokestatic java/lang/Math.max (II)I
      // 3e2: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 3e5: aload 0
      // 3e6: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 3e9: iload 4
      // 3eb: ifeq a02
      // 3ee: goto 3f5
      // 3f1: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f4: athrow
      // 3f5: iload 6
      // 3f7: ifne 40c
      // 3fa: goto 401
      // 3fd: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 400: athrow
      // 401: aload 0
      // 402: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 405: goto 40c
      // 408: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40b: athrow
      // 40c: aload 0
      // 40d: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 410: aload 0
      // 411: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 414: invokevirtual java/lang/String.length ()I
      // 417: if_icmpge a02
      // 41a: aload 0
      // 41b: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 41e: istore 7
      // 420: aload 0
      // 421: dup
      // 422: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 425: bipush 1
      // 426: iadd
      // 427: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 42a: iload 6
      // 42c: ifeq 43c
      // 42f: aload 0
      // 430: iload 7
      // 432: invokespecial rip/breeze/StringDecryptHelper5.update (I)V
      // 435: goto 43c
      // 438: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43b: athrow
      // 43c: iload 4
      // 43e: ifeq a02
      // 441: iload 1
      // 442: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 445: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_NUMPAD1 ()I 1
      // 44a: if_icmpne 4bf
      // 44d: goto 454
      // 450: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 453: athrow
      // 454: iload 6
      // 456: ifne 48d
      // 459: goto 460
      // 45c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: aload 0
      // 461: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 464: ifeq 48d
      // 467: goto 46e
      // 46a: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46d: athrow
      // 46e: aload 0
      // 46f: aload 0
      // 470: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 473: aload 0
      // 474: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 477: invokestatic java/lang/Math.min (II)I
      // 47a: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 47d: aload 0
      // 47e: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 481: iload 4
      // 483: ifeq a02
      // 486: goto 48d
      // 489: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48c: athrow
      // 48d: aload 0
      // 48e: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 491: istore 7
      // 493: aload 0
      // 494: bipush -1
      // 495: invokespecial rip/breeze/StringDecryptHelper5.clamp_4 (I)V
      // 498: iload 6
      // 49a: ifeq 4af
      // 49d: aload 0
      // 49e: iload 7
      // 4a0: invokespecial rip/breeze/StringDecryptHelper5.update_1 (I)V
      // 4a3: iload 4
      // 4a5: ifeq 4ba
      // 4a8: goto 4af
      // 4ab: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ae: athrow
      // 4af: aload 0
      // 4b0: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 4b3: goto 4ba
      // 4b6: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b9: athrow
      // 4ba: iload 4
      // 4bc: ifeq a02
      // 4bf: iload 1
      // 4c0: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 4c3: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_NUMPAD2 ()I 1
      // 4c8: if_icmpne 53d
      // 4cb: goto 4d2
      // 4ce: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d1: athrow
      // 4d2: iload 6
      // 4d4: ifne 50b
      // 4d7: goto 4de
      // 4da: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4dd: athrow
      // 4de: aload 0
      // 4df: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 4e2: ifeq 50b
      // 4e5: goto 4ec
      // 4e8: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4eb: athrow
      // 4ec: aload 0
      // 4ed: aload 0
      // 4ee: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 4f1: aload 0
      // 4f2: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 4f5: invokestatic java/lang/Math.max (II)I
      // 4f8: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 4fb: aload 0
      // 4fc: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 4ff: iload 4
      // 501: ifeq a02
      // 504: goto 50b
      // 507: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50a: athrow
      // 50b: aload 0
      // 50c: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 50f: istore 7
      // 511: aload 0
      // 512: bipush 1
      // 513: invokespecial rip/breeze/StringDecryptHelper5.clamp_4 (I)V
      // 516: iload 6
      // 518: ifeq 52d
      // 51b: aload 0
      // 51c: iload 7
      // 51e: invokespecial rip/breeze/StringDecryptHelper5.update_1 (I)V
      // 521: iload 4
      // 523: ifeq 538
      // 526: goto 52d
      // 529: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52c: athrow
      // 52d: aload 0
      // 52e: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 531: goto 538
      // 534: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 537: athrow
      // 538: iload 4
      // 53a: ifeq a02
      // 53d: iload 1
      // 53e: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 541: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_103 ()I 1
      // 546: if_icmpne 601
      // 549: goto 550
      // 54c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54f: athrow
      // 550: iload 6
      // 552: ifne 567
      // 555: goto 55c
      // 558: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55b: athrow
      // 55c: aload 0
      // 55d: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 560: goto 567
      // 563: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 566: athrow
      // 567: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 56a: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 56f: ifeq 594
      // 572: aload 0
      // 573: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 576: istore 7
      // 578: aload 0
      // 579: bipush 0
      // 57a: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 57d: iload 6
      // 57f: ifeq 58f
      // 582: aload 0
      // 583: iload 7
      // 585: invokespecial rip/breeze/StringDecryptHelper5.update_1 (I)V
      // 588: goto 58f
      // 58b: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58e: athrow
      // 58f: iload 4
      // 591: ifeq a02
      // 594: aload 0
      // 595: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 598: istore 7
      // 59a: aload 0
      // 59b: aload 0
      // 59c: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 59f: invokespecial rip/breeze/StringDecryptHelper5.calculate (I)I
      // 5a2: istore 8
      // 5a4: iload 8
      // 5a6: bipush -1
      // 5a7: if_icmpeq 5cb
      // 5aa: aload 0
      // 5ab: aload 0
      // 5ac: getfield rip/breeze/StringDecryptHelper5.list_v Ljava/util/List;
      // 5af: iload 8
      // 5b1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5b6: checkcast rip/breeze/Util3
      // 5b9: getfield rip/breeze/Util3.fieldInt_a I
      // 5bc: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 5bf: iload 4
      // 5c1: ifeq 5ea
      // 5c4: goto 5cb
      // 5c7: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ca: athrow
      // 5cb: aload 0
      // 5cc: getfield rip/breeze/StringDecryptHelper5.list_v Ljava/util/List;
      // 5cf: invokeinterface java/util/List.isEmpty ()Z 1
      // 5d4: ifne 5ea
      // 5d7: goto 5de
      // 5da: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dd: athrow
      // 5de: aload 0
      // 5df: bipush 0
      // 5e0: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 5e3: goto 5ea
      // 5e6: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e9: athrow
      // 5ea: iload 6
      // 5ec: ifeq 5fc
      // 5ef: aload 0
      // 5f0: iload 7
      // 5f2: invokespecial rip/breeze/StringDecryptHelper5.update_1 (I)V
      // 5f5: goto 5fc
      // 5f8: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fb: athrow
      // 5fc: iload 4
      // 5fe: ifeq a02
      // 601: iload 1
      // 602: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 605: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_105 ()I 1
      // 60a: if_icmpne 6c7
      // 60d: goto 614
      // 610: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 613: athrow
      // 614: iload 6
      // 616: ifne 62b
      // 619: goto 620
      // 61c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61f: athrow
      // 620: aload 0
      // 621: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 624: goto 62b
      // 627: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62a: athrow
      // 62b: aload 0
      // 62c: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 62f: istore 7
      // 631: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 634: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 639: ifeq 653
      // 63c: aload 0
      // 63d: aload 0
      // 63e: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 641: invokevirtual java/lang/String.length ()I
      // 644: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 647: iload 4
      // 649: ifeq 6b0
      // 64c: goto 653
      // 64f: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 652: athrow
      // 653: aload 0
      // 654: aload 0
      // 655: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 658: invokespecial rip/breeze/StringDecryptHelper5.calculate (I)I
      // 65b: istore 8
      // 65d: iload 8
      // 65f: bipush -1
      // 660: if_icmpeq 68b
      // 663: aload 0
      // 664: getfield rip/breeze/StringDecryptHelper5.list_v Ljava/util/List;
      // 667: iload 8
      // 669: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 66e: checkcast rip/breeze/Util3
      // 671: astore 9
      // 673: aload 0
      // 674: aload 9
      // 676: getfield rip/breeze/Util3.fieldInt_b I
      // 679: aload 0
      // 67a: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 67d: invokevirtual java/lang/String.length ()I
      // 680: invokestatic java/lang/Math.min (II)I
      // 683: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 686: iload 4
      // 688: ifeq 6b0
      // 68b: aload 0
      // 68c: getfield rip/breeze/StringDecryptHelper5.list_v Ljava/util/List;
      // 68f: invokeinterface java/util/List.isEmpty ()Z 1
      // 694: ifne 6b0
      // 697: goto 69e
      // 69a: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69d: athrow
      // 69e: aload 0
      // 69f: aload 0
      // 6a0: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 6a3: invokevirtual java/lang/String.length ()I
      // 6a6: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 6a9: goto 6b0
      // 6ac: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6af: athrow
      // 6b0: iload 6
      // 6b2: ifeq 6c2
      // 6b5: aload 0
      // 6b6: iload 7
      // 6b8: invokespecial rip/breeze/StringDecryptHelper5.update_1 (I)V
      // 6bb: goto 6c2
      // 6be: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c1: athrow
      // 6c2: iload 4
      // 6c4: ifeq a02
      // 6c7: iload 1
      // 6c8: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 6cb: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_V ()I 1
      // 6d0: if_icmpne 86d
      // 6d3: goto 6da
      // 6d6: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d9: athrow
      // 6da: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 6dd: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 6e2: ifeq a02
      // 6e5: goto 6ec
      // 6e8: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6eb: athrow
      // 6ec: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 6ef: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 6f2: astore 7
      // 6f4: aload 7
      // 6f6: aconst_null
      // 6f7: invokevirtual java/awt/datatransfer/Clipboard.getContents (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
      // 6fa: astore 8
      // 6fc: aload 8
      // 6fe: ifnull 863
      // 701: aload 8
      // 703: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 706: invokeinterface java/awt/datatransfer/Transferable.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z 2
      // 70b: ifeq 863
      // 70e: goto 715
      // 711: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 714: athrow
      // 715: aload 0
      // 716: invokespecial rip/breeze/StringDecryptHelper5.update_3 ()V
      // 719: aload 8
      // 71b: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 71e: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 723: checkcast java/lang/String
      // 726: astore 9
      // 728: new java/lang/StringBuilder
      // 72b: dup
      // 72c: invokespecial java/lang/StringBuilder.<init> ()V
      // 72f: astore 10
      // 731: aload 9
      // 733: invokevirtual java/lang/String.toCharArray ()[C
      // 736: astore 11
      // 738: aload 11
      // 73a: arraylength
      // 73b: istore 12
      // 73d: bipush 0
      // 73e: istore 13
      // 740: iload 13
      // 742: iload 12
      // 744: if_icmpge 782
      // 747: aload 11
      // 749: iload 13
      // 74b: caload
      // 74c: istore 14
      // 74e: iload 14
      // 750: invokestatic rip/breeze/Util6.isValid (C)Z
      // 753: ifne 76b
      // 756: ldc_w "\n"
      // 759: iload 14
      // 75b: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 75e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 761: ifeq 77a
      // 764: goto 76b
      // 767: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76a: athrow
      // 76b: aload 10
      // 76d: iload 14
      // 76f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 772: pop
      // 773: goto 77a
      // 776: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 779: athrow
      // 77a: iinc 13 1
      // 77d: iload 4
      // 77f: ifeq 740
      // 782: aload 10
      // 784: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 787: astore 11
      // 789: aload 11
      // 78b: invokevirtual java/lang/String.isEmpty ()Z
      // 78e: ifne 863
      // 791: aload 0
      // 792: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 795: ifeq 7f2
      // 798: goto 79f
      // 79b: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79e: athrow
      // 79f: aload 0
      // 7a0: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 7a3: aload 0
      // 7a4: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 7a7: invokestatic java/lang/Math.min (II)I
      // 7aa: istore 12
      // 7ac: aload 0
      // 7ad: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 7b0: aload 0
      // 7b1: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 7b4: invokestatic java/lang/Math.max (II)I
      // 7b7: istore 13
      // 7b9: aload 0
      // 7ba: iload 12
      // 7bc: iload 13
      // 7be: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 7c1: aload 0
      // 7c2: new java/lang/StringBuilder
      // 7c5: dup
      // 7c6: invokespecial java/lang/StringBuilder.<init> ()V
      // 7c9: aload 0
      // 7ca: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 7cd: bipush 0
      // 7ce: iload 12
      // 7d0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 7d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d6: aload 0
      // 7d7: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 7da: iload 13
      // 7dc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 7df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e5: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 7e8: aload 0
      // 7e9: iload 12
      // 7eb: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 7ee: aload 0
      // 7ef: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 7f2: aload 0
      // 7f3: getfield rip/breeze/StringDecryptHelper5.fieldInt_n I
      // 7f6: ifle 822
      // 7f9: aload 0
      // 7fa: getfield rip/breeze/StringDecryptHelper5.fieldInt_n I
      // 7fd: aload 0
      // 7fe: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 801: invokevirtual java/lang/String.length ()I
      // 804: isub
      // 805: istore 12
      // 807: iload 12
      // 809: ifgt 80e
      // 80c: bipush 1
      // 80d: ireturn
      // 80e: aload 11
      // 810: invokevirtual java/lang/String.length ()I
      // 813: iload 12
      // 815: if_icmple 822
      // 818: aload 11
      // 81a: bipush 0
      // 81b: iload 12
      // 81d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 820: astore 11
      // 822: aload 0
      // 823: new java/lang/StringBuilder
      // 826: dup
      // 827: invokespecial java/lang/StringBuilder.<init> ()V
      // 82a: aload 0
      // 82b: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 82e: bipush 0
      // 82f: aload 0
      // 830: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 833: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 836: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 839: aload 11
      // 83b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83e: aload 0
      // 83f: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 842: aload 0
      // 843: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 846: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 849: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 84f: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 852: aload 0
      // 853: dup
      // 854: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 857: aload 11
      // 859: invokevirtual java/lang/String.length ()I
      // 85c: iadd
      // 85d: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 860: bipush 1
      // 861: istore 5
      // 863: goto a02
      // 866: astore 7
      // 868: iload 4
      // 86a: ifeq a02
      // 86d: iload 1
      // 86e: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 871: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_C ()I 1
      // 876: if_icmpne 8c7
      // 879: goto 880
      // 87c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87f: athrow
      // 880: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 883: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 888: ifeq a02
      // 88b: goto 892
      // 88e: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 891: athrow
      // 892: aload 0
      // 893: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 896: ifeq a02
      // 899: goto 8a0
      // 89c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89f: athrow
      // 8a0: aload 0
      // 8a1: invokespecial rip/breeze/StringDecryptHelper5.buildString ()Ljava/lang/String;
      // 8a4: astore 7
      // 8a6: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 8a9: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 8ac: astore 8
      // 8ae: new java/awt/datatransfer/StringSelection
      // 8b1: dup
      // 8b2: aload 7
      // 8b4: invokespecial java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
      // 8b7: astore 9
      // 8b9: aload 8
      // 8bb: aload 9
      // 8bd: aload 9
      // 8bf: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 8c2: iload 4
      // 8c4: ifeq a02
      // 8c7: iload 1
      // 8c8: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 8cb: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_X ()I 1
      // 8d0: if_icmpne 97b
      // 8d3: goto 8da
      // 8d6: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d9: athrow
      // 8da: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 8dd: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 8e2: ifeq a02
      // 8e5: goto 8ec
      // 8e8: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8eb: athrow
      // 8ec: aload 0
      // 8ed: invokespecial rip/breeze/StringDecryptHelper5.isValid_2 ()Z
      // 8f0: ifeq a02
      // 8f3: goto 8fa
      // 8f6: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f9: athrow
      // 8fa: aload 0
      // 8fb: invokespecial rip/breeze/StringDecryptHelper5.buildString ()Ljava/lang/String;
      // 8fe: astore 7
      // 900: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 903: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 906: astore 8
      // 908: new java/awt/datatransfer/StringSelection
      // 90b: dup
      // 90c: aload 7
      // 90e: invokespecial java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
      // 911: astore 9
      // 913: aload 8
      // 915: aload 9
      // 917: aload 9
      // 919: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 91c: aload 0
      // 91d: invokespecial rip/breeze/StringDecryptHelper5.update_3 ()V
      // 920: aload 0
      // 921: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 924: aload 0
      // 925: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 928: invokestatic java/lang/Math.min (II)I
      // 92b: istore 10
      // 92d: aload 0
      // 92e: getfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 931: aload 0
      // 932: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 935: invokestatic java/lang/Math.max (II)I
      // 938: istore 11
      // 93a: aload 0
      // 93b: iload 10
      // 93d: iload 11
      // 93f: invokespecial rip/breeze/StringDecryptHelper5.clamp_23 (II)V
      // 942: aload 0
      // 943: new java/lang/StringBuilder
      // 946: dup
      // 947: invokespecial java/lang/StringBuilder.<init> ()V
      // 94a: aload 0
      // 94b: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 94e: bipush 0
      // 94f: iload 10
      // 951: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 954: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 957: aload 0
      // 958: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 95b: iload 11
      // 95d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 960: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 963: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 966: putfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 969: aload 0
      // 96a: iload 10
      // 96c: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 96f: aload 0
      // 970: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 973: bipush 1
      // 974: istore 5
      // 976: iload 4
      // 978: ifeq a02
      // 97b: iload 1
      // 97c: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 97f: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_A ()I 1
      // 984: if_icmpne 9c4
      // 987: goto 98e
      // 98a: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98d: athrow
      // 98e: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 991: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 996: ifeq a02
      // 999: goto 9a0
      // 99c: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99f: athrow
      // 9a0: aload 0
      // 9a1: bipush 0
      // 9a2: putfield rip/breeze/StringDecryptHelper5.fieldInt_K I
      // 9a5: aload 0
      // 9a6: aload 0
      // 9a7: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // 9aa: invokevirtual java/lang/String.length ()I
      // 9ad: putfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 9b0: aload 0
      // 9b1: aload 0
      // 9b2: getfield rip/breeze/StringDecryptHelper5.fieldInt_L I
      // 9b5: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // 9b8: iload 4
      // 9ba: ifeq a02
      // 9bd: goto 9c4
      // 9c0: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c3: athrow
      // 9c4: iload 1
      // 9c5: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 9c8: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_Z ()I 1
      // 9cd: if_icmpne a02
      // 9d0: goto 9d7
      // 9d3: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d6: athrow
      // 9d7: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 9da: invokeinterface rip/breeze/IKeyCodeProvider.getKeyCode_KEY_114 ()Z 1
      // 9df: ifeq a02
      // 9e2: goto 9e9
      // 9e5: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e8: athrow
      // 9e9: aload 0
      // 9ea: invokespecial rip/breeze/StringDecryptHelper5.clamp_12 ()V
      // 9ed: aload 0
      // 9ee: invokespecial rip/breeze/StringDecryptHelper5.initialize ()V
      // 9f1: aload 0
      // 9f2: getfield rip/breeze/StringDecryptHelper5.map_Y Ljava/util/Map;
      // 9f5: invokeinterface java/util/Map.clear ()V 1
      // 9fa: aload 0
      // 9fb: bipush 1
      // 9fc: putfield rip/breeze/StringDecryptHelper5.fieldBool_w Z
      // 9ff: bipush 1
      // a00: istore 5
      // a02: iload 5
      // a04: ifeq a2e
      // a07: aload 0
      // a08: getfield rip/breeze/StringDecryptHelper5.consumer_i Ljava/util/function/Consumer;
      // a0b: ifnull a29
      // a0e: goto a15
      // a11: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a14: athrow
      // a15: aload 0
      // a16: getfield rip/breeze/StringDecryptHelper5.consumer_i Ljava/util/function/Consumer;
      // a19: aload 0
      // a1a: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // a1d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // a22: goto a29
      // a25: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a28: athrow
      // a29: aload 0
      // a2a: bipush 1
      // a2b: putfield rip/breeze/StringDecryptHelper5.fieldBool_w Z
      // a2e: aload 0
      // a2f: bipush 0
      // a30: aload 0
      // a31: getfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // a34: aload 0
      // a35: getfield rip/breeze/StringDecryptHelper5.string_j Ljava/lang/String;
      // a38: invokevirtual java/lang/String.length ()I
      // a3b: invokestatic java/lang/Math.min (II)I
      // a3e: invokestatic java/lang/Math.max (II)I
      // a41: putfield rip/breeze/StringDecryptHelper5.fieldInt_m I
      // a44: aload 0
      // a45: getfield rip/breeze/StringDecryptHelper5.dataBuilder112_h Lrip/breeze/Util133;
      // a48: invokevirtual rip/breeze/Util133.getDataBuilder112 ()Lrip/breeze/Util133;
      // a4b: pop
      // a4c: aload 0
      // a4d: getfield rip/breeze/StringDecryptHelper5.fieldBool_x Z
      // a50: ifeq a75
      // a53: aload 0
      // a54: getfield rip/breeze/StringDecryptHelper5.fieldBool_w Z
      // a57: ifeq a71
      // a5a: goto a61
      // a5d: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a60: athrow
      // a61: aload 0
      // a62: invokespecial rip/breeze/StringDecryptHelper5.clamp_10 ()V
      // a65: aload 0
      // a66: bipush 0
      // a67: putfield rip/breeze/StringDecryptHelper5.fieldBool_w Z
      // a6a: goto a71
      // a6d: invokestatic rip/breeze/StringDecryptHelper5.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a70: athrow
      // a71: aload 0
      // a72: invokespecial rip/breeze/StringDecryptHelper5.calculate_7 ()V
      // a75: bipush 1
      // a76: ireturn
      // try (851 -> 857): 858 java/lang/Exception
      // try (830 -> 842): 843 java/lang/Exception
      // try (827 -> 835): 836 java/lang/Exception
      // try (792 -> 798): 799 java/lang/Exception
      // try (772 -> 782): 783 java/lang/Exception
      // try (770 -> 776): 777 java/lang/Exception
      // try (762 -> 767): 768 java/lang/Exception
      // try (747 -> 759): 760 java/lang/Exception
      // try (737 -> 751): 752 java/lang/Exception
      // try (710 -> 720): 721 java/lang/Exception
      // try (697 -> 704): 705 java/lang/Exception
      // try (690 -> 699): 700 java/lang/Exception
      // try (688 -> 694): 695 java/lang/Exception
      // try (680 -> 685): 686 java/lang/Exception
      // try (667 -> 677): 678 java/lang/Exception
      // try (654 -> 671): 672 java/lang/Exception
      // try (651 -> 664): 665 java/lang/Exception
      // try (630 -> 638): 639 java/lang/Exception
      // try (614 -> 621): 622 java/lang/Exception
      // try (607 -> 616): 617 java/lang/Exception
      // try (605 -> 611): 612 java/lang/Exception
      // try (592 -> 602): 603 java/lang/Exception
      // try (587 -> 597): 598 java/lang/Exception
      // try (564 -> 581): 582 java/lang/Exception
      // try (559 -> 567): 568 java/lang/Exception
      // try (552 -> 561): 562 java/lang/Exception
      // try (550 -> 556): 557 java/lang/Exception
      // try (537 -> 547): 548 java/lang/Exception
      // try (532 -> 542): 543 java/lang/Exception
      // try (509 -> 526): 527 java/lang/Exception
      // try (504 -> 512): 513 java/lang/Exception
      // try (497 -> 506): 507 java/lang/Exception
      // try (495 -> 501): 502 java/lang/Exception
      // try (481 -> 492): 493 java/lang/Exception
      // try (462 -> 469): 470 java/lang/Exception
      // try (448 -> 464): 465 java/lang/Exception
      // try (442 -> 459): 460 java/lang/Exception
      // try (437 -> 445): 446 java/lang/Exception
      // try (430 -> 439): 440 java/lang/Exception
      // try (428 -> 434): 435 java/lang/Exception
      // try (414 -> 425): 426 java/lang/Exception
      // try (398 -> 405): 406 java/lang/Exception
      // try (384 -> 400): 401 java/lang/Exception
      // try (378 -> 395): 396 java/lang/Exception
      // try (373 -> 381): 382 java/lang/Exception
      // try (369 -> 375): 376 java/lang/Exception
      // try (348 -> 364): 365 java/lang/Exception
      // try (341 -> 356): 357 java/lang/Exception
      // try (339 -> 345): 346 java/lang/Exception
      // try (244 -> 255): 255 java/lang/Exception
      // try (238 -> 250): 251 java/lang/Exception
      // try (231 -> 241): 242 java/lang/Exception
      // try (229 -> 235): 236 java/lang/Exception
      // try (187 -> 195): 196 java/lang/Exception
      // try (132 -> 144): 145 java/lang/Exception
      // try (130 -> 136): 137 java/lang/Exception
      // try (85 -> 90): 91 java/lang/Exception
      // try (33 -> 42): 43 java/lang/Exception
      // try (17 -> 26): 26 java/lang/Exception
      // try (14 -> 21): 22 java/lang/Exception
      // try (6 -> 12): 12 java/lang/Exception
      // try (785 -> 911): 952 java/lang/Exception
      // try (912 -> 951): 952 java/lang/Exception
      // try (953 -> 959): 960 java/lang/Exception
      // try (955 -> 965): 966 java/lang/Exception
      // try (962 -> 971): 972 java/lang/Exception
      // try (985 -> 995): 996 java/lang/Exception
      // try (991 -> 1001): 1002 java/lang/Exception
      // try (998 -> 1007): 1008 java/lang/Exception
      // try (1067 -> 1073): 1074 java/lang/Exception
      // try (1069 -> 1079): 1080 java/lang/Exception
      // try (1076 -> 1096): 1097 java/lang/Exception
      // try (1082 -> 1103): 1104 java/lang/Exception
      // try (1099 -> 1109): 1110 java/lang/Exception
      // try (1124 -> 1129): 1130 java/lang/Exception
      // try (1126 -> 1137): 1138 java/lang/Exception
      // try (1143 -> 1163): 1164 java/lang/Exception
      // try (1160 -> 1171): 1172 java/lang/Exception
   }

   private boolean checkCondition_4(int var1) {
      long var2 = 67198467871703L;
      if (var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_BACK()
         || var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_108()
         || var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_RETURN()) {
         return true;
      } else {
         return !BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_114()
            ? false
            : var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_V()
               || var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_X()
               || var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_Z();
      }
   }

   private void update(int var1) {
      long var2 = 117667323046041L;
      int var4 = RenderUtil9.getValue_2();
      if (!this.isValid_2()) {
         this.fieldInt_K = var1;
         this.fieldInt_L = this.fieldInt_m;
         if (var4 == 0) {
            return;
         }
      }

      this.fieldInt_L = this.fieldInt_m;
   }

   private void update_1(int var1) {
      long var2 = 8583947351186L;
      int var4 = RenderUtil9.getValue();
      if (!this.isValid_2()) {
         this.fieldInt_K = var1;
         this.fieldInt_L = this.fieldInt_m;
         if (var4 != 0) {
            return;
         }
      }

      this.fieldInt_L = this.fieldInt_m;
   }

   private void clamp_4(int var1) {
      long var2 = 19782630694565L;
      int var4 = RenderUtil9.getValue();
      if (!this.list_v.isEmpty()) {
         int var5 = this.calculate(this.fieldInt_m);
         if (var5 == -1) {
            if (this.fieldInt_m != this.string_j.length() || this.list_v.isEmpty()) {
               return;
            }

            var5 = this.list_v.size() - 1;
            if (var4 == 0) {
               return;
            }
         }

         int var6 = var5 + var1;
         if (var6 < 0) {
            this.fieldInt_m = 0;
         } else if (var6 >= this.list_v.size()) {
            this.fieldInt_m = this.string_j.length();
         } else {
            Util3 var7 = this.list_v.get(var5);
            int var8 = this.fieldInt_m - var7.fieldInt_a;
            var8 = Math.max(0, Math.min(var8, var7.calculate()));
            float var9 = this.clamp_5(var5, var8);
            int var10 = this.clamp_6(var6, var9);
            Util3 var11 = this.list_v.get(var6);
            this.fieldInt_m = Math.min(var11.fieldInt_a + var10, this.string_j.length());
         }
      }
   }

   private int calculate(int var1) {
      long var2 = 140377764067590L;
      int var4 = RenderUtil9.getValue();
      if (this.list_v.isEmpty()) {
         return this.string_j.isEmpty() && var1 == 0 ? 0 : -1;
      }

      for (int var5 = 0; var5 < this.list_v.size(); var5++) {
         Util3 var6 = this.list_v.get(var5);
         if (var1 >= var6.fieldInt_a
            && var1 <= var6.fieldInt_b
            && (var1 != var6.fieldInt_b || var1 == this.string_j.length() || var5 + 1 >= this.list_v.size() || this.list_v.get(var5 + 1).fieldInt_a != var1 || var4 == 0)
            )
          {
            return var5;
         }
         break;
      }

      if (var1 == this.string_j.length()) {
         Util3 var7 = this.list_v.get(this.list_v.size() - 1);
         if (var1 >= var7.fieldInt_a) {
            return this.list_v.size() - 1;
         }
      }

      return this.list_v.size() - 1;
   }

   private float clamp_5(int var1, int var2) {
      long var3 = 120934498335368L;
      if (var1 >= 0 && var1 < this.list_v.size()) {
         Util3 var5 = this.list_v.get(var1);
         int var6 = Math.min(var5.fieldInt_b, this.string_j.length());
         int var7 = Math.min(var5.fieldInt_a, var6);
         String var8 = this.buildString_2(this.string_j, var7, var6);
         var2 = Math.max(0, Math.min(var2, var8.length()));
         float[] var9 = this.measureText(var8, this.a + this.dataBuilder113_l.fieldFloat_a);
         return var9[var2] - (this.a + this.dataBuilder113_l.fieldFloat_a);
      } else {
         return 0.0F;
      }
   }

   private int clamp_6(int var1, float var2) {
      long var3 = 90002665342250L;
      int var5 = RenderUtil9.getValue();
      if (var1 >= 0 && var1 < this.list_v.size()) {
         Util3 var6 = this.list_v.get(var1);
         int var7 = Math.min(var6.fieldInt_b, this.string_j.length());
         int var8 = Math.min(var6.fieldInt_a, var7);
         String var9 = this.buildString_2(this.string_j, var8, var7);
         float[] var10 = this.measureText(var9, this.a + this.dataBuilder113_l.fieldFloat_a);
         float var11 = var2 + (this.a + this.dataBuilder113_l.fieldFloat_a);
         int var12 = 0;

         while (var12 < var9.length()) {
            float var13 = (var10[var12] + var10[var12 + 1]) * 0.5F;
            if (var11 < var13) {
               return var12;
            }

            var12++;
            if (var5 == 0) {
               break;
            }
         }

         return var9.length();
      } else {
         return 0;
      }
   }

   private float clamp_7(int var1, int var2, int var3) {
      int var4 = Math.min(var2, this.string_j.length());
      int var5 = Math.min(var1, var4);
      String var6 = this.buildString_2(this.string_j, var5, var4);
      int var7 = Math.max(0, Math.min(var3 - var5, var6.length()));
      float[] var8 = this.measureText(var6, this.a + this.dataBuilder113_l.fieldFloat_a);
      return var8[var7];
   }

   private float[] measureText(String var1, float var2) {
      long var3 = 21755284028833L;
      int var10000 = RenderUtil9.getValue_2();
      int var5 = var1.length();
      int var6 = var10000;
      float[] var7 = new float[var5 + 1];
      var7[0] = var2;
      String var8 = "|";
      float var9 = BreezeContext.iRenderer_b.measureText(var8, this.enum_SOURCE_SANS_p, this.fieldInt_o);
      int var10 = 0;

      while (var10 < var5) {
         String var11 = var1.substring(0, var10 + 1) + "|";
         float var12 = BreezeContext.iRenderer_b.measureText(var11, this.enum_SOURCE_SANS_p, this.fieldInt_o);
         float var13 = var12 - var9;
         if (var13 < 0.0F && var13 > -0.25F) {
            var13 = 0.0F;
         }

         var7[var10 + 1] = var7[var10] + var13;
         var9 = var12;
         var10++;
         if (var6 != 0) {
            break;
         }
      }

      return var7;
   }

   private void clamp_8(String var1, int var2, int var3, float[] var4, float var5, float var6, Color var7) {
      long var8 = 65844471436579L;
      if (var2 < var3) {
         float var10 = var4[var2];
         float var11 = var4[var3];
         float var12 = Math.max(1.0F, var11 - var10);
         BreezeContext.iRenderer_b.renderInRect(var10, var6 - 1.0F, var12, this.fieldInt_o + 2.0F, this::lambda$drawStableRunClippedLine_Inner2);
      }
   }

   private void update_2() {
      long var1 = 32444454007153L;
      if (this.fieldBool_C) {
         BreezeContext.iRenderer_b
            .strokeRoundedRect(this.licenseState_E, 5.0F, BreezeContext.authSession_c.getColor("i>~U~%"));
      }
   }

   private void clamp_9(float var1) {
      long var2 = 124494593567954L;
      float var4 = this.clamp_24();
      float var5 = this.clamp_25();
      if (this.fieldBool_B && this.fieldBool_x && !(var4 <= var5) && !(this.d <= 0.0F)) {
         this.fieldBool_C = true;
         float var6 = this.a + this.c - this.fieldFloat_I - this.fieldFloat_H * 0.5F;
         float var7 = this.b + this.fieldFloat_H;
         float var8 = this.b + this.d - this.fieldFloat_H;
         float var9 = Math.max(1.0F, var8 - var7);
         float var10 = Math.max(0.0F, Math.min(1.0F, var5 / var4));
         float var11 = Math.max(this.fieldInt_J, var9 * var10);
         float var12 = Math.max(1.0F, var4 - var5);
         float var13 = Math.max(1.0F, var9 - var11);
         float var14 = var7 + var11 * 0.5F + this.fieldFloat_z / var12 * var13;
         if (this.fieldBool_F) {
            var14 = var1 - this.fieldFloat_G;
            float var15 = var7 + var11 * 0.5F;
            float var16 = var8 - var11 * 0.5F;
            if (var14 < var15) {
               var14 = var15;
            }

            if (var14 > var16) {
               var14 = var16;
            }

            float var17 = (var14 - var7 - var11 * 0.5F) / var13;
            this.fieldFloat_y = var17 * var12;
            this.update_9();
         }

         this.licenseState_D = new LicenseState(var6, var7, this.fieldFloat_I, var9);
         this.licenseState_E = new LicenseState(var6, var14 - var11 * 0.5F, this.fieldFloat_I, var11);
      } else {
         this.fieldBool_C = false;
         this.fieldBool_F = false;
      }
   }

   private void clamp_10() {
      long var1 = 95368104107615L;
      int var10000 = RenderUtil9.getValue_2();
      this.list_v.clear();
      int var3 = var10000;
      if (!this.string_j.isEmpty()) {
         float var4 = Math.max(1.0F, this.c - this.dataBuilder113_l.fieldFloat_a * 2.0F - 2.0F);
         String[] var5 = this.string_j.split("\n", -1);
         int var6 = 0;
         int var7 = 0;

         while (var7 < var5.length) {
            label36: {
               String var8 = var5[var7];
               if (var8.isEmpty()) {
                  this.list_v.add(new Util3(var6, var6));
                  if (var7 >= var5.length - 1) {
                     break label36;
                  }

                  var6++;
                  if (var3 == 0) {
                     break label36;
                  }
               }

               int var9 = var6;
               this.calculate_2(var8, var9, var4);
               var6 += var8.length();
               if (var7 < var5.length - 1) {
                  var6++;
               }
            }

            var7++;
            if (var3 != 0) {
               break;
            }
         }

         if (!this.list_v.isEmpty()) {
            Util3 var10 = this.list_v.get(this.list_v.size() - 1);
            var10.fieldInt_b = Math.min(var10.fieldInt_b, this.string_j.length());
            var10.fieldInt_a = Math.min(var10.fieldInt_a, this.string_j.length());
         }

         if (this.list_v.isEmpty() && !this.string_j.isEmpty()) {
            this.list_v.add(new Util3(0, this.string_j.length()));
         }

         this.update_9();
      }
   }

   private void calculate_2(String var1, int var2, float var3) {
      long var4 = 43194712359663L;
      int var6 = RenderUtil9.getValue();
      if (!var1.isEmpty()) {
         int var7 = var2;
         int var8 = 0;

         while (var8 < var1.length()) {
            int var11;
            label57: {
               int var9 = this.calculate_3(var1, var8, var3);
               int var10 = var8 + var9;
               if (var10 < var1.length()) {
                  label66: {
                     int var12 = var1.lastIndexOf(" ", var10 - 1);
                     if (var12 > var8) {
                        var11 = var12 + 1;
                        if (var6 != 0) {
                           break label66;
                        }
                     }

                     if (var12 == var8 && var8 > 0 && !" ".equals(var1.substring(var8 - 1, var8))) {
                        if (" ".equals(var1.substring(var12, var12 + 1))) {
                           var11 = var12 + 1;
                           if (var6 != 0) {
                              break label66;
                           }
                        }

                        var11 = var10;
                        if (var6 != 0) {
                           break label66;
                        }
                     }

                     var11 = var10;
                  }

                  label41: {
                     if (var11 <= var8 && var9 > 0) {
                        var11 = var8 + var9;
                        if (var6 != 0) {
                           break label41;
                        }
                     }

                     if (var9 == 0 && var1.length() > var8) {
                        var11 = var8 + 1;
                     }
                  }

                  if (var6 != 0) {
                     break label57;
                  }
               }

               var11 = var1.length();
            }

            int var13 = var2 + var11;
            this.list_v.add(new Util3(var7, var13));
            var7 = var13;
            var8 = var11;
            if (var6 == 0) {
               break;
            }
         }
      }
   }

   private int calculate_3(String var1, int var2, float var3) {
      long var4 = 40167281616937L;
      int var10000 = RenderUtil9.getValue();
      int var6 = 0;
      int var7 = var10000;
      int var8 = var1.length() - var2;
      int var9 = 0;

      while (var6 <= var8) {
         int var10 = var6 + (var8 - var6) / 2;
         if (var10 == 0) {
            if (var6 != 0) {
               break;
            }

            var6 = 1;
            if (var6 > var1.length() - var2) {
               break;
            }

            var10 = 1;
         }

         label36: {
            String var11 = var1.substring(var2, var2 + var10);
            float var12 = BreezeContext.iRenderer_b.measureText(var11, this.enum_SOURCE_SANS_p, this.fieldInt_o);
            if (var12 <= var3) {
               var9 = var10;
               var6 = var10 + 1;
               if (var7 != 0) {
                  break label36;
               }
            }

            var8 = var10 - 1;
         }

         if (var7 == 0) {
            break;
         }
      }

      return var9 == 0 && var1.length() - var2 > 0 && var3 > 0.0F ? 1 : var9;
   }

   private boolean isValid_2() {
      long var1 = 89110445421095L;
      return this.fieldInt_K != -1 && this.fieldInt_L != -1 && this.fieldInt_K != this.fieldInt_L;
   }

   private void initialize() {
      this.fieldInt_K = -1;
      this.fieldInt_L = -1;
   }

   private void clamp_11() {
      long var1 = 101811175490164L;
      if (this.isValid_2()) {
         int var3 = Math.min(this.fieldInt_K, this.fieldInt_L);
         int var4 = Math.max(this.fieldInt_K, this.fieldInt_L);
         this.string_j = this.string_j.substring(0, var3) + this.string_j.substring(var4);
         this.fieldInt_m = var3;
         this.initialize();
      }
   }

   private String buildString() {
      long var1 = 79845273292686L;
      if (!this.isValid_2()) {
         return "";
      }

      int var3 = Math.min(this.fieldInt_K, this.fieldInt_L);
      int var4 = Math.max(this.fieldInt_K, this.fieldInt_L);
      var3 = Math.max(0, Math.min(var3, this.string_j.length()));
      var4 = Math.max(0, Math.min(var4, this.string_j.length()));
      return var3 >= var4 ? "" : this.string_j.substring(var3, var4);
   }

   private String buildString_2(String var1, int var2, int var3) {
      long var4 = 61378517633905L;
      int var6 = Math.max(0, Math.min(var2, var1.length()));
      int var7 = Math.max(0, Math.min(var3, var1.length()));
      return var6 >= var7 ? "" : var1.substring(var6, var7);
   }

   private void update_3() {
      this.linkedList_s.addFirst(this.string_j);
      this.linkedList_t.addFirst(this.fieldInt_m);
   }

   private void clamp_12() {
      long var1 = 63879014526223L;
      if (!this.linkedList_s.isEmpty()) {
         this.string_j = this.linkedList_s.removeFirst();
         this.fieldInt_m = this.linkedList_t.removeFirst();
         this.fieldInt_m = Math.max(0, Math.min(this.fieldInt_m, this.string_j.length()));
      }
   }

   public void processNullable() {
      long var1 = 37154241068666L;
      super.toggle_2();
      if (this.fieldInt_m != -1) {
         this.fieldInt_m = -1;
         this.initialize();
         if (this.consumer_i != null) {
            this.consumer_i.accept(this.string_j);
         }
      }
   }

   public String getString_j() {
      return this.string_j;
   }

   public void processAll(String var1) {
      long var2 = 80675456437784L;
      if (var1 == null) {
         var1 = "";
      }

      if (this.fieldInt_n > 0 && var1.length() > this.fieldInt_n) {
         var1 = var1.substring(0, this.fieldInt_n);
      }

      if (!this.string_j.equals(var1)) {
         this.string_j = var1;
         this.fieldBool_w = true;
         this.linkedList_s.clear();
         this.linkedList_t.clear();
         this.fieldInt_m = this.isValid_3() ? var1.length() : -1;
         this.initialize();
         this.map_Y.clear();
         if (this.fieldInt_m > -1) {
            this.dataBuilder112_h.getDataBuilder112();
         }

         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }

         if (this.consumer_i != null) {
            this.consumer_i.accept(this.string_j);
         }
      }
   }

   public void processNullable_2(boolean var1) {
      long var2 = 77179960134242L;
      if (this.fieldBool_q != var1) {
         this.fieldBool_q = var1;
         if (var1) {
            this.fieldInt_m = -1;
            this.initialize();
            this.map_Y.clear();
            if (this.consumer_i != null) {
               this.consumer_i.accept(this.string_j);
            }
         }
      }
   }

   public void setBool_r(boolean var1) {
      this.fieldBool_r = var1;
   }

   public boolean isValid_3() {
      long var1 = 87385489254083L;
      return this.fieldInt_m != -1;
   }

   public void update_4() {
      long var1 = 753616186410L;
      if (!this.fieldBool_q) {
         this.fieldInt_m = this.string_j.length();
         this.dataBuilder112_h.getDataBuilder112();
         this.fieldBool_w = true;
         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void update_5(Util134 var1) {
      long var2 = 99883525376776L;
      if (!this.dataBuilder113_l.equals(var1)) {
         this.dataBuilder113_l = var1;
         this.fieldBool_w = true;
         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void clamp_13(int var1) {
      long var2 = 52274758669235L;
      if (this.fieldInt_n != var1) {
         this.fieldInt_n = var1;
         if (var1 > 0 && this.string_j.length() > var1) {
            this.string_j = this.string_j.substring(0, var1);
            this.fieldInt_m = Math.min(this.fieldInt_m, this.string_j.length());
            this.fieldBool_w = true;
            this.map_Y.clear();
            if (this.consumer_i != null) {
               this.consumer_i.accept(this.string_j);
            }
         }

         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void update_6(EnumType32 var1) {
      long var2 = 56490813313085L;
      if (this.enum_SOURCE_SANS_p != var1) {
         this.enum_SOURCE_SANS_p = var1;
         this.fieldBool_w = true;
         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void clamp_14(int var1) {
      long var2 = 49468295222948L;
      if (this.fieldInt_o != var1) {
         this.fieldInt_o = Math.max(1, var1);
         this.fieldBool_w = true;
         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void update_7(int var1) {
      long var2 = 106887751706271L;
      if (this.fieldInt_u != var1) {
         this.fieldInt_u = var1;
         this.fieldBool_w = true;
         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void update_8(boolean var1) {
      long var2 = 6438057716612L;
      this.fieldBool_V = var1;
      if (!var1) {
         this.map_Y.clear();
      }
   }

   public void clamp_15(long var1) {
      this.fieldLong_W = Math.max(1L, var1);
   }

   public void clamp_16(float var1) {
      this.fieldFloat_X = Math.max(0.0F, var1);
   }

   public void toggle_2(boolean var1) {
      long var2 = 53675488535085L;
      int var4 = RenderUtil9.getValue();
      if (this.fieldBool_x != var1) {
         this.fieldBool_x = var1;
         if (!var1) {
            this.fieldFloat_y = 0.0F;
            this.fieldFloat_z = 0.0F;
            if (var4 != 0) {
               return;
            }
         }

         if (this.fieldBool_w) {
            this.clamp_10();
            this.fieldBool_w = false;
         }

         this.calculate_7();
      }
   }

   public boolean isBool_x() {
      return this.fieldBool_x;
   }

   public float getFloat_y() {
      return this.fieldFloat_y;
   }

   public void initialize_2(float var1) {
      this.fieldFloat_y = var1;
      this.update_9();
   }

   public float clamp_17() {
      long var1 = 55430145357847L;
      if (this.fieldBool_w) {
         this.clamp_10();
         this.fieldBool_w = false;
      }

      return (this.fieldInt_u + this.fieldInt_o) * Math.max(1, this.list_v.size());
   }

   @Override
   public float calculateFloat() {
      long var1 = 107911095860544L;
      if (this.fieldInt_m == -1) {
         return -1.0F;
      }

      if (this.fieldBool_w) {
         this.clamp_10();
         this.fieldBool_w = false;
      }

      int var3 = this.calculate(this.fieldInt_m);
      return var3 == -1 ? -1.0F : this.dataBuilder113_l.fieldFloat_b - (this.fieldBool_x ? this.fieldFloat_y : 0.0F) + (var3 + 1) * (this.fieldInt_o + this.fieldInt_u);
   }

   public void processAll_2(float var1, float var2, float var3, float var4) {
      long var5 = 72405863235857L;
      boolean var7 = this.c != var3;
      super.drawColoredQuad(var1, var2, var3, var4);
      if (var7) {
         this.clamp_10();
         this.update_9();
         if (this.fieldBool_x) {
            this.calculate_7();
         }
      }
   }

   public void toggle_3(boolean var1) {
      this.fieldBool_B = var1;
      this.fieldBool_F = false;
      this.fieldBool_C = false;
   }

   public boolean isBool_B() {
      return this.fieldBool_B;
   }

   public void clamp_18(float var1) {
      this.fieldFloat_H = Math.max(0.0F, var1);
   }

   public void clamp_19(float var1) {
      this.fieldFloat_I = Math.max(4.0F, var1);
   }

   public void clamp_20(int var1) {
      this.fieldInt_J = Math.max(8, var1);
   }

   private void clamp_21(int var1) {
      long var2 = 119500043917308L;
      int var4 = RenderUtil9.getValue_2();
      if (!this.string_j.isEmpty()) {
         int var5 = this.string_j.length();
         int var6 = Math.max(0, Math.min(var1, var5));
         int var7 = var6;
         int var8 = this.getValue(var6);
         if (var8 == 0 && var6 > 0) {
            var7 = var6 - 1;
            var8 = this.getValue(var7);
         }

         if (var8 == 0 && var6 + 1 < var5) {
            var7 = var6 + 1;
            var8 = this.getValue(var7);
         }

         if (var8 != 0) {
            int var9 = var7;

            while (var9 - 1 >= 0 && this.getValue_2(this.string_j.charAt(var9 - 1)) == var8) {
               var9--;
               if (var4 != 0) {
                  break;
               }
            }

            int var10 = var7;

            while (var10 + 1 < var5 && this.getValue_2(this.string_j.charAt(var10 + 1)) == var8) {
               var10++;
               if (var4 != 0) {
                  break;
               }
            }

            this.fieldInt_K = var9;
            this.fieldInt_L = var10 + 1;
            this.fieldInt_m = this.fieldInt_L;
            this.dataBuilder112_h.getDataBuilder112();
         }
      }
   }

   private int getValue(int var1) {
      long var2 = 114440692007172L;
      return var1 >= 0 && var1 < this.string_j.length() ? this.getValue_2(this.string_j.charAt(var1)) : 0;
   }

   private int getValue_2(char var1) {
      long var2 = 44515983305006L;
      if (Character.isDigit(var1)) {
         return 1;
      } else if (Character.isLetter(var1)) {
         return 2;
      } else {
         return var1 == 95 ? 2 : 0;
      }
   }

   private void clamp_22(int var1) {
      long var2 = 64183287471841L;
      if (!this.string_j.isEmpty()) {
         int var4 = this.calculate(var1);
         if (var4 >= 0 && var4 < this.list_v.size()) {
            Util3 var5 = this.list_v.get(var4);
            int var6 = Math.max(0, Math.min(var5.fieldInt_a, this.string_j.length()));
            int var7 = Math.max(0, Math.min(var5.fieldInt_b, this.string_j.length()));
            this.fieldInt_K = var6;
            this.fieldInt_L = var7;
            this.fieldInt_m = var7;
            this.dataBuilder112_h.getDataBuilder112();
         }
      }
   }

   private boolean checkCondition_5(int var1, int var2) {
      long var3 = 136398686546900L;
      int var5 = RenderUtil9.getValue();
      if (this.fieldBool_V && !this.map_Y.isEmpty()) {
         int var6 = var1;

         while (var6 < var2) {
            if (this.map_Y.containsKey(var6)) {
               return true;
            }

            var6++;
            if (var5 == 0) {
               break;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void calculate_4(int var1, int var2) {
      long var3 = 43574293338079L;
      int var5 = RenderUtil9.getValue_2();
      if (this.fieldBool_V && var2 > 0 && !this.map_Y.isEmpty()) {
         HashMap var6 = new HashMap();

         for (Util15 var8 : this.map_Y.values()) {
            if (var8.fieldInt_a >= var1) {
               var8.fieldInt_a += var2;
            }

            var6.put(var8.fieldInt_a, var8);
            if (var5 != 0) {
               break;
            }
         }

         this.map_Y.clear();
         this.map_Y.putAll(var6);
      }
   }

   private void clamp_23(int var1, int var2) {
      long var3 = 59837371066222L;
      int var5 = RenderUtil9.getValue_2();
      if (this.fieldBool_V) {
         if (var1 > var2) {
            int var6 = var1;
            var1 = var2;
            var2 = var6;
         }

         int var11 = Math.max(0, var2 - var1);
         if (var11 != 0) {
            Iterator var7 = this.map_Y.entrySet().iterator();

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

            for (Util15 var10 : this.map_Y.values()) {
               if (var10.fieldInt_a >= var2) {
                  var10.fieldInt_a -= var11;
               }

               var12.put(var10.fieldInt_a, var10);
               if (var5 != 0) {
                  break;
               }
            }

            this.map_Y.clear();
            this.map_Y.putAll(var12);
         }
      }
   }

   private void processAll(int var1, int var2) {
      this.calculate_5(var1, var2, 0L);
   }

   private void calculate_5(int var1, int var2, long var3) {
      long var5 = 127966222492123L;
      int var7 = RenderUtil9.getValue_2();
      if (this.fieldBool_V) {
         long var8 = System.currentTimeMillis();
         int var10 = 0;

         while (var10 < var2) {
            int var11 = var1 + var10;
            Util15 var12 = new Util15(var11, var8 + var10 * var3);
            this.map_Y.put(var11, var12);
            var10++;
            if (var7 != 0) {
               break;
            }
         }
      }
   }

   private void calculate_6(long var1) {
      long var3 = 25483572297137L;
      int var5 = RenderUtil9.getValue_2();
      if (!this.map_Y.isEmpty()) {
         Iterator var6 = this.map_Y.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Util15 var8 = (Util15)var7.getValue();
            if (var1 - var8.fieldLong_b >= this.fieldLong_W + -7542597439983994358L) {
               var6.remove();
            }

            if (var5 != 0) {
               break;
            }
         }
      }
   }

   private static float getFloat(float var0) {
      long var1 = 62431278617472L;
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   private static float calculateFloat_2(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private float clamp_24() {
      return (this.fieldInt_o + this.fieldInt_u) * Math.max(0, this.list_v.size());
   }

   private float clamp_25() {
      return Math.max(0.0F, this.d - this.dataBuilder113_l.fieldFloat_b);
   }

   private float clamp_26() {
      return Math.max(0.0F, this.clamp_24() - this.clamp_25());
   }

   private void update_9() {
      long var1 = 120760920209144L;
      if (!this.fieldBool_x) {
         this.fieldFloat_y = 0.0F;
      } else {
         float var3 = this.clamp_26();
         if (this.fieldFloat_y < 0.0F) {
            this.fieldFloat_y = 0.0F;
         }

         if (this.fieldFloat_y > var3) {
            this.fieldFloat_y = var3;
         }
      }
   }

   private void clamp_27(float var1, float var2) {
      float var8;
      label17: {
         long var3 = 75159167253785L;
         int var10000 = RenderUtil9.getValue();
         float var5 = this.b + 14.0F;
         float var6 = this.b + this.d - 14.0F;
         int var7 = var10000;
         var8 = 0.0F;
         if (var1 < var5) {
            var8 = var1 - var5;
            if (var7 != 0) {
               break label17;
            }
         }

         if (var1 > var6) {
            var8 = var1 - var6;
         }
      }

      if (var8 != 0.0F) {
         float var9 = Math.max(-900.0F, Math.min(900.0F, var8 * 14.0F));
         this.fieldFloat_y += var9 * var2;
         this.update_9();
         this.fieldFloat_z = this.fieldFloat_y;
      }
   }

   private void calculate_7() {
      long var1 = 39723766033035L;
      int var3 = RenderUtil9.getValue();
      if (this.fieldBool_x) {
         if (this.fieldInt_m >= 0) {
            if (this.list_v.isEmpty()) {
               this.fieldFloat_y = 0.0F;
            } else {
               int var4 = this.calculate(this.fieldInt_m);
               if (var4 < 0) {
                  var4 = 0;
               }

               label23: {
                  float var5 = this.fieldInt_o + this.fieldInt_u;
                  float var6 = this.b + this.dataBuilder113_l.fieldFloat_b - this.fieldFloat_y;
                  float var7 = var6 + var4 * var5;
                  float var8 = var7 + var5;
                  float var9 = this.b + this.fieldFloat_A;
                  float var10 = this.b + this.d - this.fieldFloat_A;
                  if (var7 < var9) {
                     this.fieldFloat_y -= var9 - var7;
                     if (var3 != 0) {
                        break label23;
                     }
                  }

                  if (var8 > var10) {
                     this.fieldFloat_y += var8 - var10;
                  }
               }

               this.update_9();
            }
         }
      }
   }

   private void lambda$drawStableRunClippedLine_Inner2(String var1, float var2, float var3, Color var4) {
      BreezeContext.iRenderer_b.drawText(var1, var2, var3, var4, this.enum_SOURCE_SANS_p, this.fieldInt_o);
   }

   private void lambda$draw_Inner1() {
      long var1 = 135840678255808L;
      int var3 = RenderUtil9.getValue_2();
      if (this.string_j.isEmpty()) {
         BreezeContext.iRenderer_b
            .drawText(
               this.string_k,
               this.a + this.dataBuilder113_l.fieldFloat_a,
               this.b + this.dataBuilder113_l.fieldFloat_b,
               BreezeContext.authSession_c.getColor("textbox."),
               this.enum_SOURCE_SANS_p,
               this.fieldInt_o
            );
         if (this.fieldInt_m == -1) {
            return;
         }
      }

      if (this.string_j.isEmpty()) {
         if (!this.dataBuilder112_h.isValid(500L)) {
            BreezeContext.iRenderer_b
               .drawRect(
                  this.a + this.dataBuilder113_l.fieldFloat_a,
                  this.b + this.dataBuilder113_l.fieldFloat_b - (this.fieldBool_x ? this.fieldFloat_z : 0.0F),
                  1.0F,
                  this.fieldInt_o,
                  BreezeContext.authSession_c.getColor("textbox.text")
               );
         }
      } else {
         float var4 = this.fieldInt_o + this.fieldInt_u;
         Color var5 = BreezeContext.authSession_c.getColor("textbox.text");
         float var6 = this.b + this.dataBuilder113_l.fieldFloat_b - (this.fieldBool_x ? this.fieldFloat_z : 0.0F);
         float var7 = this.b;
         float var8 = this.b + this.d;
         int var9 = this.list_v.size();
         if (var9 != 0) {
            int var10 = (int)Math.floor((var7 - var6) / var4);
            var10 = Math.max(0, Math.min(var9 - 1, var10));
            int var11 = (int)Math.floor((var8 - var6) / var4);
            var11 = Math.max(0, Math.min(var9 - 1, var11));
            var10 = Math.max(0, var10 - 1);
            var11 = Math.min(var9 - 1, var11 + 1);
            if (!(var8 <= var6 - var4) && !(var7 >= var6 + var9 * var4)) {
               int var12 = -1;
               if (this.fieldInt_m != -1) {
                  int var13 = 0;

                  while (var13 < var9) {
                     if (this.isValid(var13, this.fieldInt_m)) {
                        var12 = var13;
                        if (var3 == 0) {
                           break;
                        }
                     }

                     var13++;
                     if (var3 != 0) {
                        break;
                     }
                  }

                  if (var12 == -1 && this.fieldInt_m == this.string_j.length() && var9 > 0) {
                     Util3 var44 = this.list_v.get(var9 - 1);
                     if (this.fieldInt_m >= var44.fieldInt_a && this.fieldInt_m <= var44.fieldInt_b) {
                        var12 = var9 - 1;
                     }
                  }
               }

               long var14 = System.currentTimeMillis();
               this.calculate_6(var14);
               if (this.isValid_3() && this.isValid_2()) {
                  int var16 = Math.min(this.fieldInt_K, this.fieldInt_L);
                  int var17 = Math.max(this.fieldInt_K, this.fieldInt_L);
                  int var18 = var10;

                  while (var18 <= var11) {
                     float var19 = var6 + var18 * var4;
                     label160:
                     if (!(var19 > var8) && !(var19 + this.fieldInt_o < var7)) {
                        Util3 var20 = this.list_v.get(var18);
                        int var21 = var20.fieldInt_a;
                        int var22 = Math.min(var20.fieldInt_b, this.string_j.length());
                        String var23 = this.buildString_2(this.string_j, var21, var22);
                        int var24 = Math.max(var16, var21);
                        int var25 = Math.min(var17, var22);
                        if (var21 == var22) {
                           if (var24 != var25 || var24 != var21) {
                              break label160;
                           }

                           float var26 = this.a + this.dataBuilder113_l.fieldFloat_a;
                           BreezeContext.iRenderer_b
                              .fillRoundedRectFull(
                                 var26,
                                 var19 - 0.5F,
                                 2.0F,
                                 this.fieldInt_o + 1,
                                 1.0F,
                                 BreezeContext.authSession_c.getColor("textbox.selection")
                              );
                           if (var3 == 0) {
                              break label160;
                           }
                        }

                        float[] var56 = this.measureText(var23, this.a + this.dataBuilder113_l.fieldFloat_a);
                        if (var24 < var25) {
                           int var27 = var24 - var21;
                           int var28 = var25 - var21;
                           var27 = Math.max(0, Math.min(var27, var23.length()));
                           var28 = Math.max(0, Math.min(var28, var23.length()));
                           float var29 = var56[var27];
                           float var30 = var56[var28];
                           if (var30 == var29) {
                              var30 = var29 + 2.0F;
                           }

                           BreezeContext.iRenderer_b
                              .fillRoundedRectFull(
                                 var29,
                                 var19 - 0.5F,
                                 var30 - var29,
                                 this.fieldInt_o + 1,
                                 3.0F,
                                 BreezeContext.authSession_c.getColor("textbox.selection")
                              );
                        }
                     }

                     var18++;
                     if (var3 != 0) {
                        break;
                     }
                  }
               }

               int var45 = var10;

               while (var45 <= var11) {
                  float var46 = var6 + var45 * var4;
                  if (!(var46 > var8) && !(var46 + this.fieldInt_o < var7)) {
                     Util3 var47;
                     String var50;
                     float[] var52;
                     label200: {
                        var47 = this.list_v.get(var45);
                        int var48 = Math.min(var47.fieldInt_b, this.string_j.length());
                        int var49 = Math.min(var47.fieldInt_a, var48);
                        var50 = this.buildString_2(this.string_j, var49, var48);
                        float var51 = this.a + this.dataBuilder113_l.fieldFloat_a;
                        var52 = this.measureText(var50, var51);
                        boolean var53 = this.checkCondition_5(var49, var48);
                        if (!this.fieldBool_V || this.map_Y.isEmpty() || !var53) {
                           BreezeContext.iRenderer_b.drawText(var50, var51, var46, var5, this.enum_SOURCE_SANS_p, this.fieldInt_o);
                           if (var3 == 0) {
                              break label200;
                           }
                        }

                        int var54 = -1;
                        int var57 = 0;

                        while (var57 < var50.length()) {
                           label127: {
                              int var61 = var49 + var57;
                              boolean var64 = this.map_Y.containsKey(var61);
                              if (!var64) {
                                 if (var54 != -1) {
                                    break label127;
                                 }

                                 var54 = var57;
                                 if (var3 == 0) {
                                    break label127;
                                 }
                              }

                              if (var54 != -1) {
                                 this.clamp_8(var50, var54, var57, var52, var51, var46, var5);
                                 var54 = -1;
                              }
                           }

                           var57++;
                           if (var3 != 0) {
                              break;
                           }
                        }

                        if (var54 != -1) {
                           this.clamp_8(var50, var54, var50.length(), var52, var51, var46, var5);
                        }

                        for (Entry var62 : this.map_Y.entrySet()) {
                           int var65 = (Integer)var62.getKey();
                           if (var65 >= var49 && var65 < var48) {
                              int var66 = var65 - var49;
                              Util15 var67 = (Util15)var62.getValue();
                              float var31 = getFloat((float)(var14 - var67.fieldLong_b) / (float)this.fieldLong_W);
                              float var32 = calculateFloat_2(var31);
                              float var33 = (1.0F - var32) * this.fieldFloat_X;
                              int var34 = var5.getAlpha();
                              int var35 = Math.max(0, Math.min(255, (int)(var34 * var32)));
                              if (var35 > 0) {
                                 Color var36 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), var35);
                                 float var37 = var52[var66];
                                 float var38 = var52[var66 + 1];
                                 float var39 = Math.max(1.0F, var38 - var37);
                                 BreezeContext.iRenderer_b.renderInRect(var37, var46 - 1.0F, var39, this.fieldInt_o + 2.0F, this::lambda$null_Inner0);
                                 if (var3 != 0) {
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if (var45 == var12 && this.fieldInt_m > -1 && !this.dataBuilder112_h.isValid(-6172864330917207183L)) {
                        int var55 = Math.max(0, Math.min(this.fieldInt_m - var47.fieldInt_a, var50.length()));
                        float var59 = var52[var55];
                        BreezeContext.iRenderer_b.drawRect(var59, var46, 1.0F, this.fieldInt_o, var5);
                     }
                  }

                  var45++;
                  if (var3 != 0) {
                     break;
                  }
               }
            }
         }
      }
   }

   private void lambda$null_Inner0(String var1, float var2, float var3, float var4, Color var5) {
      BreezeContext.iRenderer_b.drawText(var1, var2, var3 + var4, var5, this.enum_SOURCE_SANS_p, this.fieldInt_o);
   }

   public static void toggle_4(boolean var0) {
      fieldBool_Z = var0;
   }

   public static boolean isValid_4() {
      return fieldBool_Z;
   }

   public static boolean checkCondition_6() {
      boolean var0 = isValid_4();
      return !var0;
   }

   static {
      toggle_4(true);
      long var0 = 49751204696677L;
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
      String var6 = "2qÝ¥A¾Xthº?ë£ óà½\u0088®á¨Jö;ÅçÎ\u009cNÛ+Í\u0011¥\u0002\u00921±m\u001a½\fÆ÷ç:\\ù xö+\u0093m2L't\u0085\u0085Ø\u0080L\u0000d!7\u0096\u001aÐY£\u0087õêß.*Â(¿ \u00836iö\u001dD°\u000f«¦D!7Ò-È\u009c8¿Û7\u0092\u0005\u0012ã\u0000<-¹÷¸\u009d(\u0092\u0003\u0012R)\u009ck²}Ï\u001f\u001d\u009c»\f/Àä\u0003f\u009bDiÈ\u0015k)pO³Aîý¸Ô\u0082n\u00122K";
      int var7 = "2qÝ¥A¾Xthº?ë£ óà½\u0088®á¨Jö;ÅçÎ\u009cNÛ+Í\u0011¥\u0002\u00921±m\u001a½\fÆ÷ç:\\ù xö+\u0093m2L't\u0085\u0085Ø\u0080L\u0000d!7\u0096\u001aÐY£\u0087õêß.*Â(¿ \u00836iö\u001dD°\u000f«¦D!7Ò-È\u009c8¿Û7\u0092\u0005\u0012ã\u0000<-¹÷¸\u009d(\u0092\u0003\u0012R)\u009ck²}Ï\u001f\u001d\u009c»\f/Àä\u0003f\u009bDiÈ\u0015k)pO³Aîý¸Ô\u0082n\u00122K"
         .length();
      char var8 = '0';
      int var34 = -1;

      label73:
      while (true) {
         String var36 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var50;
                  if ((var34 += var8) >= var7) {
                     CONST_DB = var4;
                     CONST_EB = new String[6];
                     CONST_IB = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "¶W`\u0011ç+Sèö¶êÚ\næó¡\u0097y\u0004\f\u0083\têÑ";
                     int var16 = "¶W`\u0011ç+Sèö¶êÚ\næó¡\u0097y\u0004\f\u0083\têÑ".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
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
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var58 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_GB = var13;
                     CONST_HB = new Integer[3];
                     CONST_LB = new HashMap(13);
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
                     String var26 = "Áe8¶lvà\u0011sÃsm\u0090©þ@\u008cLlÀ7²ô53äv\u009e\u0011g8¸";
                     int var27 = "Áe8¶lvà\u0011sÃsm\u0090©þ@\u008cLlÀ7²ô53äv\u009e\u0011g8¸".length();
                     byte var28 = 0;

                     label44:
                     while (true) {
                        int var46 = var28;
                        var28 += 8;
                        byte[] var29 = var26.substring(var46, var28).getBytes("ISO-8859-1");
                        long[] var40 = var24;
                        var46 = var25++;
                        long var55 = (var29[0] & 255L) << 56
                           | (var29[1] & 255L) << 48
                           | (var29[2] & 255L) << 40
                           | (var29[3] & 255L) << 32
                           | (var29[4] & 255L) << 24
                           | (var29[5] & 255L) << 16
                           | (var29[6] & 255L) << 8
                           | var29[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var30 = var55;
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
                           long var63 = (var32[0] & 255L) << 56
                              | (var32[1] & 255L) << 48
                              | (var32[2] & 255L) << 40
                              | (var32[3] & 255L) << 32
                              | (var32[4] & 255L) << 24
                              | (var32[5] & 255L) << 16
                              | (var32[6] & 255L) << 8
                              | var32[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var40[var46] = var63;
                                 if (var28 >= var27) {
                                    CONST_JB = var24;
                                    CONST_KB = new Long[6];
                                    500L = ((String)null);
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var46] = var63;
                                 if (var28 < var27) {
                                    continue label44;
                                 }

                                 var26 = "Ã§øu9Ê\u0016C\u001eð±Ø£Ãfx";
                                 var27 = "Ã§øu9Ê\u0016C\u001eð±Ø£Ãfx".length();
                                 var28 = 0;
                           }

                           byte var48 = var28;
                           var28 += 8;
                           var29 = var26.substring(var48, var28).getBytes("ISO-8859-1");
                           var40 = var24;
                           var46 = var25++;
                           var55 = (var29[0] & 255L) << 56
                              | (var29[1] & 255L) << 48
                              | (var29[2] & 255L) << 40
                              | (var29[3] & 255L) << 32
                              | (var29[4] & 255L) << 24
                              | (var29[5] & 255L) << 16
                              | (var29[6] & 255L) << 8
                              | var29[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var50;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label73;
                  }

                  var6 = "ÉNµ§Ù½\"éjB-\u0010vuÀ@\u0088\u0003\n\u0084\u0089B\u0019\u0083wv+»v\"\u0099»(\u0003F}ZPN\u0007STt¿Ï\u001fõ\u0019¥z0j¥TÛ\u008f»!\u0004_[+\u008c+<\u0088\fñ\u0012î±rÎ";
                  var7 = "ÉNµ§Ù½\"éjB-\u0010vuÀ@\u0088\u0003\n\u0084\u0089B\u0019\u0083wv+»v\"\u0099»(\u0003F}ZPN\u0007STt¿Ï\u001fõ\u0019¥z0j¥TÛ\u008f»!\u0004_[+\u008c+<\u0088\fñ\u0012î±rÎ"
                     .length();
                  var8 = ' ';
                  var34 = -1;
            }

            var36 = var6.substring(++var34, var34 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
      return var0;
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11180;
      if (CONST_EB[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_FB.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_FB.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ef", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_DB[var3].getBytes("ISO-8859-1");
         CONST_EB[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_EB[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
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
         throw new RuntimeException("rip/breeze/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7964;
      if (CONST_HB[var3] == null) {
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
         long var5 = CONST_GB[var3];
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
         Object[] var9 = (Object[])CONST_IB.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_IB.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/ef", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_HB[var3] = var15;
      }

      return CONST_HB[var3];
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
         throw new RuntimeException("rip/breeze/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 788;
      if (CONST_KB[var3] == null) {
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
         long var5 = CONST_JB[var3];
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
         Object[] var9 = (Object[])CONST_LB.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_LB.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/ef", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_KB[var3] = var14;
      }

      return CONST_KB[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
