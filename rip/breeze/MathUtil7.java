package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MathUtil7 extends Util28 {
   private final int fieldInt_j;
   private final StringDecryptHelper6 stringDecryptHelper6_k;
   private final StringDecryptHelper6 stringDecryptHelper6_l;
   private final StringDecryptHelper6 stringDecryptHelper6_m;
   private final ImageUtil2 breezeUtil110_n;
   private static LicenseState[] arr_o;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);
   private static final long eka_1;

   public MathUtil7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil7.105784954804125L J
      // 003: ldc2_w 37464807376844
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic rip/breeze/MathUtil7.decrypt ()[Lrip/breeze/LicenseState;
      // 00b: aload 0
      // 00c: invokespecial rip/breeze/Util28.<init> ()V
      // 00f: aload 0
      // 010: getstatic rip/breeze/MathUtil7.-4848839423724355476L J
      // 013: l2i
      // 014: putfield rip/breeze/MathUtil7.fieldInt_j I
      // 017: aload 0
      // 018: new rip/breeze/StringDecryptHelper6
      // 01b: dup
      // 01c: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 01f: invokeinterface rip/breeze/SettingGroup.getTitle ()Ljava/lang/String; 1
      // 024: new rip/breeze/LicenseState
      // 027: dup
      // 028: invokespecial rip/breeze/LicenseState.<init> ()V
      // 02b: aload 0
      // 02c: invokedynamic accept (Lrip/breeze/MathUtil7;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/MathUtil7.update (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 031: invokespecial rip/breeze/StringDecryptHelper6.<init> (Ljava/lang/String;Lrip/breeze/LicenseState;Ljava/util/function/Consumer;)V
      // 034: putfield rip/breeze/MathUtil7.stringDecryptHelper6_k Lrip/breeze/StringDecryptHelper6;
      // 037: astore 3
      // 038: aload 0
      // 039: getfield rip/breeze/MathUtil7.stringDecryptHelper6_k Lrip/breeze/StringDecryptHelper6;
      // 03c: bipush 16
      // 03e: invokevirtual rip/breeze/StringDecryptHelper6.clamp_9 (I)V
      // 041: aload 0
      // 042: new rip/breeze/StringDecryptHelper6
      // 045: dup
      // 046: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 049: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 04e: new rip/breeze/LicenseState
      // 051: dup
      // 052: invokespecial rip/breeze/LicenseState.<init> ()V
      // 055: aload 0
      // 056: invokedynamic accept (Lrip/breeze/MathUtil7;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/MathUtil7.processAll_2 (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 05b: invokespecial rip/breeze/StringDecryptHelper6.<init> (Ljava/lang/String;Lrip/breeze/LicenseState;Ljava/util/function/Consumer;)V
      // 05e: putfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 061: aload 0
      // 062: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 065: bipush 36
      // 067: invokevirtual rip/breeze/StringDecryptHelper6.clamp_9 (I)V
      // 06a: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 06d: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 072: ifnull 08a
      // 075: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 078: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 07d: invokevirtual java/lang/String.isEmpty ()Z
      // 080: ifeq 0a4
      // 083: goto 08a
      // 086: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 08e: sipush 26472
      // 091: ldc2_w 858840784617429839
      // 094: lload 1
      // 095: lxor
      // 096: pop2
      // 097: pop
      // 098: ldc "Copy the mojang auth token, you can use this to temporarily share your account with friends."
      // 09a: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: new rip/breeze/StringDecryptHelper6
      // 0a8: dup
      // 0a9: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0ac: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 0b1: new rip/breeze/LicenseState
      // 0b4: dup
      // 0b5: invokespecial rip/breeze/LicenseState.<init> ()V
      // 0b8: aload 0
      // 0b9: invokedynamic accept (Lrip/breeze/MathUtil7;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/MathUtil7.update_1 (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 0be: invokespecial rip/breeze/StringDecryptHelper6.<init> (Ljava/lang/String;Lrip/breeze/LicenseState;Ljava/util/function/Consumer;)V
      // 0c1: putfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 0c4: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0c7: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 0cc: ifnull 0e4
      // 0cf: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0d2: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 0d7: invokevirtual java/lang/String.isEmpty ()Z
      // 0da: ifeq 0ff
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 0e8: sipush 30971
      // 0eb: ldc2_w 786908912844817605
      // 0ee: lload 1
      // 0ef: lxor
      // 0f0: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 103: bipush 0
      // 104: invokevirtual rip/breeze/StringDecryptHelper6.update_3 (Z)V
      // 107: aload 0
      // 108: new rip/breeze/ImageUtil2
      // 10b: dup
      // 10c: new rip/breeze/LicenseState
      // 10f: dup
      // 110: invokespecial rip/breeze/LicenseState.<init> ()V
      // 113: sipush 3203
      // 116: ldc2_w 2730766893537341628
      // 119: lload 1
      // 11a: lxor
      // 11b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: aload 0
      // 121: invokedynamic run (Lrip/breeze/MathUtil7;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rip/breeze/MathUtil7.processAll ()V, ()V ]
      // 126: bipush 0
      // 127: sipush 26742
      // 12a: ldc2_w 6122617769555121241
      // 12d: lload 1
      // 12e: lxor
      // 12f: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: invokespecial rip/breeze/ImageUtil2.<init> (Lrip/breeze/LicenseState;Ljava/lang/String;Ljava/lang/Runnable;ZLjava/lang/String;)V
      // 137: putfield rip/breeze/MathUtil7.breezeUtil110_n Lrip/breeze/ImageUtil2;
      // 13a: aload 0
      // 13b: bipush 4
      // 13c: anewarray 161
      // 13f: dup
      // 140: bipush 0
      // 141: aload 0
      // 142: getfield rip/breeze/MathUtil7.stringDecryptHelper6_k Lrip/breeze/StringDecryptHelper6;
      // 145: aastore
      // 146: dup
      // 147: bipush 1
      // 148: aload 0
      // 149: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 14c: aastore
      // 14d: dup
      // 14e: bipush 2
      // 14f: aload 0
      // 150: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 153: aastore
      // 154: dup
      // 155: bipush 3
      // 156: aload 0
      // 157: getfield rip/breeze/MathUtil7.breezeUtil110_n Lrip/breeze/ImageUtil2;
      // 15a: aastore
      // 15b: invokevirtual rip/breeze/MathUtil7.a ([Lrip/breeze/UIPanel;)V
      // 15e: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 161: ifeq 172
      // 164: bipush 4
      // 165: anewarray 57
      // 168: invokestatic rip/breeze/MathUtil7.initialize ([Lrip/breeze/LicenseState;)V
      // 16b: goto 172
      // 16e: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 171: athrow
      // 172: return
      // try (24 -> 51): 52 java/lang/IllegalArgumentException
      // try (47 -> 64): 65 java/lang/IllegalArgumentException
      // try (67 -> 86): 87 java/lang/IllegalArgumentException
      // try (82 -> 97): 98 java/lang/IllegalArgumentException
      // try (100 -> 154): 155 java/lang/IllegalArgumentException
   }

   private void processAll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil7.105784954804125L J
      // 03: ldc2_w 109764542894963
      // 06: lxor
      // 07: lstore 1
      // 08: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0b: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 10: ifnull 68
      // 13: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 16: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 1b: invokevirtual java/lang/String.isEmpty ()Z
      // 1e: ifne 68
      // 21: goto 28
      // 24: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 2b: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 2e: new java/awt/datatransfer/StringSelection
      // 31: dup
      // 32: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 35: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 3a: invokespecial java/awt/datatransfer/StringSelection.<init> (Ljava/lang/String;)V
      // 3d: aconst_null
      // 3e: invokevirtual java/awt/datatransfer/Clipboard.setContents (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
      // 41: getstatic rip/breeze/BreezeContext.guiPanelSettings_f Lrip/breeze/GuiPanelSettings;
      // 44: sipush 1949
      // 47: ldc2_w 5863057754037759754
      // 4a: lload 1
      // 4b: lxor
      // 4c: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: sipush 16224
      // 54: ldc2_w 8786890060896507889
      // 57: lload 1
      // 58: lxor
      // 59: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: invokevirtual rip/breeze/GuiPanelSettings.processAll (Ljava/lang/String;Ljava/lang/String;)V
      // 61: goto 68
      // 64: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67: athrow
      // 68: return
      // try (4 -> 11): 12 java/lang/IllegalArgumentException
      // try (7 -> 35): 36 java/lang/IllegalArgumentException
   }

   private void update(String var1) {
      this.stringDecryptHelper6_k.setString_k(var1);
      this.stringDecryptHelper6_k.clamp_8("");
      BreezeContext.settingGroup_d.setTitle(var1);
   }

   private void processAll_2(String var1) {
      long var2 = 73517653141821L;

      try {
         UUID.fromString(var1);
         this.stringDecryptHelper6_l.setString_k(var1);
         this.stringDecryptHelper6_l.clamp_8("");
         BreezeContext.settingGroup_d.setSubtitle(var1);
      } catch (IllegalArgumentException var5) {
         BreezeContext.guiPanelSettings_f
            .processAll("Error", RenderUtil18_x.RED + "Invalid UUID.");
      }
   }

   private void update_1(String var1) {
      long var2 = 104857464739859L;

      try {
         BreezeContext.settingGroup_d.setDescription(var1);
         this.stringDecryptHelper6_m.setString_k(var1.replaceAll(".", "*"));
         this.stringDecryptHelper6_m.clamp_8("");
         if (var1.isEmpty()) {
            return;
         }
      } catch (IllegalArgumentException var4) {
         throw getIllegalArgumentException(var4);
      }

      BreezeContext.microsoftAuth_k.processAll(var1, this::processNullable);
   }

   private void processNullable(Util12 var1) {
      long var2 = 24818689427272L;

      try {
         if (var1 == null) {
            BreezeContext.guiPanelSettings_f
               .processAll("Error", RenderUtil18_x.RED + "Invalid auth token. (Leave empty for cracked)");
            return;
         }
      } catch (IllegalArgumentException var4) {
         throw getIllegalArgumentException(var4);
      }

      BreezeContext.guiPanelSettings_f
         .processAll(
            "Success",
            "Found profile " + RenderUtil18_x.ACCENT + var1.string_b + RenderUtil18_x.RESET + "."
         );
      BreezeContext.settingGroup_d.setStrings(var1.string_b, var1.string_a, BreezeContext.settingGroup_d.getDescription());
   }

   public void calculate(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil7.105784954804125L J
      // 003: ldc2_w 132927405206239
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic rip/breeze/MathUtil7.decrypt ()[Lrip/breeze/LicenseState;
      // 00c: aload 0
      // 00d: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 010: bipush 18
      // 012: invokevirtual rip/breeze/StringDecryptHelper6.clamp_10 (I)V
      // 015: astore 6
      // 017: aload 0
      // 018: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 01b: bipush 18
      // 01d: invokevirtual rip/breeze/StringDecryptHelper6.clamp_10 (I)V
      // 020: aload 0
      // 021: getfield rip/breeze/MathUtil7.stringDecryptHelper6_k Lrip/breeze/StringDecryptHelper6;
      // 024: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 027: ifne 040
      // 02a: aload 0
      // 02b: getfield rip/breeze/MathUtil7.stringDecryptHelper6_k Lrip/breeze/StringDecryptHelper6;
      // 02e: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 031: invokeinterface rip/breeze/SettingGroup.getTitle ()Ljava/lang/String; 1
      // 036: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 039: goto 040
      // 03c: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 044: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 047: ifne 0ba
      // 04a: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 04d: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 052: ifnull 071
      // 055: goto 05c
      // 058: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05b: athrow
      // 05c: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 05f: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 064: invokevirtual java/lang/String.isEmpty ()Z
      // 067: ifeq 0ab
      // 06a: goto 071
      // 06d: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 070: athrow
      // 071: aload 0
      // 072: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 075: sipush 30971
      // 078: ldc2_w 786990341637663190
      // 07b: lload 4
      // 07d: lxor
      // 07e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 086: aload 6
      // 088: ifnonnull 0ba
      // 08b: goto 092
      // 08e: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 091: athrow
      // 092: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 095: ifne 0a7
      // 098: goto 09f
      // 09b: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: goto 0a8
      // 0a3: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a6: athrow
      // 0a7: bipush 1
      // 0a8: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 0ab: aload 0
      // 0ac: getfield rip/breeze/MathUtil7.stringDecryptHelper6_l Lrip/breeze/StringDecryptHelper6;
      // 0af: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0b2: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 0b7: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 0ba: aload 0
      // 0bb: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 0be: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 0c1: ifne 12b
      // 0c4: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0c7: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 0cc: ifnull 0eb
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d5: athrow
      // 0d6: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 0d9: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 0de: invokevirtual java/lang/String.isEmpty ()Z
      // 0e1: ifeq 10c
      // 0e4: goto 0eb
      // 0e7: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 0ef: sipush 30971
      // 0f2: ldc2_w 786990341637663190
      // 0f5: lload 4
      // 0f7: lxor
      // 0f8: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 100: aload 6
      // 102: ifnonnull 12b
      // 105: goto 10c
      // 108: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10b: athrow
      // 10c: aload 0
      // 10d: getfield rip/breeze/MathUtil7.stringDecryptHelper6_m Lrip/breeze/StringDecryptHelper6;
      // 110: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 113: invokeinterface rip/breeze/SettingGroup.getDescription ()Ljava/lang/String; 1
      // 118: ldc_w "."
      // 11b: ldc_w "*"
      // 11e: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 121: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 124: goto 12b
      // 127: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 12e: aload 0
      // 12f: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 132: sipush 16110
      // 135: ldc2_w 2729960072435576788
      // 138: lload 4
      // 13a: lxor
      // 13b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 143: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 146: sipush 20965
      // 149: ldc2_w 7582199949007732939
      // 14c: lload 4
      // 14e: lxor
      // 14f: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 157: invokeinterface rip/breeze/IRenderer.strokeRoundedRect (Lrip/breeze/LicenseState;FLjava/awt/Color;)V 4
      // 15c: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 15f: invokeinterface rip/breeze/SettingGroup.getSubtitle ()Ljava/lang/String; 1
      // 164: astore 7
      // 166: aload 7
      // 168: bipush 108
      // 16a: invokestatic rip/breeze/HttpUtil3.processNullable (Ljava/lang/String;I)V
      // 16d: aload 7
      // 16f: ifnull 17b
      // 172: aload 7
      // 174: goto 17d
      // 177: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17a: athrow
      // 17b: ldc ""
      // 17d: bipush 108
      // 17f: invokestatic rip/breeze/HttpUtil3.buildString (Ljava/lang/String;I)Ljava/lang/String;
      // 182: astore 8
      // 184: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 187: aload 8
      // 189: aload 0
      // 18a: getfield rip/breeze/MathUtil7.a F
      // 18d: ldc_w 25.0
      // 190: fadd
      // 191: aload 0
      // 192: getfield rip/breeze/MathUtil7.b F
      // 195: ldc_w 25.0
      // 198: fadd
      // 199: ldc_w 108.0
      // 19c: ldc_w 108.0
      // 19f: ldc_w 10.0
      // 1a2: bipush 0
      // 1a3: invokeinterface rip/breeze/IRenderer.drawTextInputSelected (Ljava/lang/String;FFFFFZ)Z 8
      // 1a8: ifne 27a
      // 1ab: aload 7
      // 1ad: ifnull 1da
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: invokevirtual java/lang/String.isEmpty ()Z
      // 1bc: ifne 1da
      // 1bf: goto 1c6
      // 1c2: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c5: athrow
      // 1c6: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 1c9: aload 8
      // 1cb: invokeinterface rip/breeze/IRenderer.loadFont (Ljava/lang/String;)Z 2
      // 1d0: ifeq 216
      // 1d3: goto 1da
      // 1d6: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d9: athrow
      // 1da: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 1dd: sipush 32585
      // 1e0: ldc2_w 6918399350122180214
      // 1e3: lload 4
      // 1e5: lxor
      // 1e6: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: aload 0
      // 1ec: getfield rip/breeze/MathUtil7.a F
      // 1ef: ldc_w 25.0
      // 1f2: fadd
      // 1f3: aload 0
      // 1f4: getfield rip/breeze/MathUtil7.b F
      // 1f7: ldc_w 25.0
      // 1fa: fadd
      // 1fb: ldc_w 108.0
      // 1fe: ldc_w 108.0
      // 201: ldc_w 10.0
      // 204: bipush 0
      // 205: invokeinterface rip/breeze/IRenderer.drawTextWrapped (Ljava/lang/String;FFFFFZ)V 8
      // 20a: aload 6
      // 20c: ifnonnull 27a
      // 20f: goto 216
      // 212: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 215: athrow
      // 216: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 219: aload 0
      // 21a: getfield rip/breeze/MathUtil7.a F
      // 21d: ldc_w 25.0
      // 220: fadd
      // 221: aload 0
      // 222: getfield rip/breeze/MathUtil7.b F
      // 225: ldc_w 25.0
      // 228: fadd
      // 229: ldc_w 108.0
      // 22c: ldc_w 108.0
      // 22f: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 232: sipush 5975
      // 235: ldc2_w 6460975698826004088
      // 238: lload 4
      // 23a: lxor
      // 23b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 243: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 246: sipush 31011
      // 249: ldc2_w 1059356037226424336
      // 24c: lload 4
      // 24e: lxor
      // 24f: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 257: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 25a: sipush 21940
      // 25d: ldc2_w 7314739354829636746
      // 260: lload 4
      // 262: lxor
      // 263: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 26b: invokestatic rip/breeze/RenderUtil1.getColor_2 (Ljava/awt/Color;Ljava/awt/Color;)Ljava/awt/Color;
      // 26e: invokeinterface rip/breeze/IRenderer.fillRoundedRectFull (FFFFFLjava/awt/Color;)V 7
      // 273: goto 27a
      // 276: invokestatic rip/breeze/MathUtil7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 279: athrow
      // 27a: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 27d: sipush 26608
      // 280: ldc2_w 5720930745865893570
      // 283: lload 4
      // 285: lxor
      // 286: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: aload 0
      // 28c: getfield rip/breeze/MathUtil7.a F
      // 28f: ldc_w 155.0
      // 292: fadd
      // 293: aload 0
      // 294: getfield rip/breeze/MathUtil7.b F
      // 297: ldc_w 30.0
      // 29a: fadd
      // 29b: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 29e: sipush 3927
      // 2a1: ldc2_w 7576746409811746415
      // 2a4: lload 4
      // 2a6: lxor
      // 2a7: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2af: getstatic rip/breeze/EnumType32.SOURCE_SANS Lrip/breeze/EnumType32;
      // 2b2: ldc_w 18.0
      // 2b5: invokeinterface rip/breeze/IRenderer.drawText (Ljava/lang/String;FFLjava/awt/Color;Lrip/breeze/EnumType32;F)V 7
      // 2ba: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 2bd: sipush 27927
      // 2c0: ldc2_w 3405171933110533152
      // 2c3: lload 4
      // 2c5: lxor
      // 2c6: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: aload 0
      // 2cc: getfield rip/breeze/MathUtil7.a F
      // 2cf: aload 0
      // 2d0: getfield rip/breeze/MathUtil7.c F
      // 2d3: fconst_2
      // 2d4: fdiv
      // 2d5: fadd
      // 2d6: ldc_w 45.0
      // 2d9: fsub
      // 2da: aload 0
      // 2db: getfield rip/breeze/MathUtil7.b F
      // 2de: ldc_w 30.0
      // 2e1: fadd
      // 2e2: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2e5: sipush 20511
      // 2e8: ldc2_w 1112225057193345335
      // 2eb: lload 4
      // 2ed: lxor
      // 2ee: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2f6: getstatic rip/breeze/EnumType32.SOURCE_SANS Lrip/breeze/EnumType32;
      // 2f9: ldc_w 18.0
      // 2fc: invokeinterface rip/breeze/IRenderer.drawText (Ljava/lang/String;FFLjava/awt/Color;Lrip/breeze/EnumType32;F)V 7
      // 301: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 304: sipush 19921
      // 307: ldc2_w 4059084174307548384
      // 30a: lload 4
      // 30c: lxor
      // 30d: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: aload 0
      // 313: getfield rip/breeze/MathUtil7.a F
      // 316: ldc_w 155.0
      // 319: fadd
      // 31a: aload 0
      // 31b: getfield rip/breeze/MathUtil7.b F
      // 31e: ldc_w 90.0
      // 321: fadd
      // 322: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 325: sipush 20511
      // 328: ldc2_w 1112225057193345335
      // 32b: lload 4
      // 32d: lxor
      // 32e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil7.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 336: getstatic rip/breeze/EnumType32.SOURCE_SANS Lrip/breeze/EnumType32;
      // 339: ldc_w 18.0
      // 33c: invokeinterface rip/breeze/IRenderer.drawText (Ljava/lang/String;FFLjava/awt/Color;Lrip/breeze/EnumType32;F)V 7
      // 341: aload 0
      // 342: fload 1
      // 343: fload 2
      // 344: fload 3
      // 345: invokespecial rip/breeze/Util28.processNullable (FFF)V
      // 348: return
      // try (10 -> 23): 24 java/lang/IllegalArgumentException
      // try (26 -> 33): 34 java/lang/IllegalArgumentException
      // try (30 -> 40): 41 java/lang/IllegalArgumentException
      // try (36 -> 53): 54 java/lang/IllegalArgumentException
      // try (43 -> 58): 59 java/lang/IllegalArgumentException
      // try (56 -> 63): 63 java/lang/IllegalArgumentException
      // try (72 -> 79): 80 java/lang/IllegalArgumentException
      // try (76 -> 86): 87 java/lang/IllegalArgumentException
      // try (82 -> 99): 100 java/lang/IllegalArgumentException
      // try (89 -> 110): 111 java/lang/IllegalArgumentException
      // try (133 -> 140): 140 java/lang/IllegalArgumentException
      // try (146 -> 164): 165 java/lang/IllegalArgumentException
      // try (162 -> 170): 171 java/lang/IllegalArgumentException
      // try (167 -> 177): 178 java/lang/IllegalArgumentException
      // try (173 -> 201): 202 java/lang/IllegalArgumentException
      // try (180 -> 238): 239 java/lang/IllegalArgumentException
   }

   public void calculate_2() {
      super.processNullable_4();
      this.stringDecryptHelper6_k.a(this.a + 150.0F, this.b + 50.0F, this.c / 2.0F - 108.0F - 100.0F, 30.0F);
      this.stringDecryptHelper6_l.a(this.a + this.c / 2.0F - 50.0F, this.b + 52.0F, this.c / 2.0F + 40.0F, 30.0F);
      this.stringDecryptHelper6_m.a(this.a + 150.0F, this.b + 110.0F, this.c - 108.0F - 80.0F, 30.0F);
      this.breezeUtil110_n.a(this.a + this.c - 40.0F, this.b + 20.0F, 30.0F, 30.0F);
   }

   public static void initialize(LicenseState[] var0) {
      arr_o = var0;
   }

   public static LicenseState[] decrypt() {
      return arr_o;
   }

   static {
      LicenseState[] var10000 = new LicenseState[3];
      initialize(var10000);
      long var0 = 36303631805134L;
      Cipher var2;
      Cipher var18 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[23];
      int var5 = 0;
      String var6 = "\u0003;\u001dùáXB,8t´O\u001e\u0015ï~~é~Ï\u009b¹\u008e±\u0097\tvx\u0006\u0099Né,\u0093\u0091#Å\u008aL×Ï\u009fIeM:\u0016¥\u0098iµ9\u009f}\"HBìfç\u0094Ô0¿Î vXhËFæë,\u008e\u0096/eñí&O[d(\u0089Dùg\u0002 íZM\u0082?ÑÉ'\u0018q\u0088\u000e~\r¨ÐCN×u\u0083£ÔÒ\u0016ëZ\u0084\u0017\u0003ù½<¨pá«5\u0092Ãjr³.\u0010²Ü\u0016\u008eT\u0095gÜ\u00ad\u000b¬èÀEî\n°°^éóü%ó\u0099ð)Ò\u0098KÄ~GÅfºPîè3\u008b{»\u009dI.;À2}r6G¬å]k\u0080¢\u0090ÈR÷Ì. \u0014u\u0013\u0082ª%Ú\u0093lß_q\u001a\u008b©F\u0015\u000ef3ß¡\u009b\u009d\u008b\u001dà\u009f\u009aÍzj\u0018\u0099\u0017×èl\u008e ]è¼\\a§v?\\lð\u0080¹¢º\u000b6\u0010±Sa<\"o\u00837îü$A?äË\u0085(\u0082\u009bÚ\u0085@Ãö¤?ÙÞ\u0011phâ\u0017\u008e%-Á\u0016æ\u009eLL\u000fÐ\u001cs-p¢\u000e2pZáß\u009e)\u0010\b¥\u0003+Å\u008eì<ÔÙ\"º>R\u001bm(ä)\u0088/\u0007_ûSâ\u0099Ý¼òo\u0081O\u0095*\u009d³UÈ¬»Ì\u0011N°\u008d\u0086\u0010B½\u0001ôÇ\f\ndÎ Í&\u001bý\u009f}JÀ Yò½¸\u008f\u001eèûÍ4e\u00929_·?\u008dÈ\u008c\"\u0093iÁ\u0010G1¸\u0081/\u0082õQ6Ë?AJÆí{\u0010\t¿\u008fìj\u000eÍû\u0087vÌÙ\u000e?\u00980\u0010\u0003\u0088hE~îCÚqMëv³\u0085\u008ei\u0018O-Ð\u0014ÆÁuËM\u009e\"\f\u009aö>±\u0002ünîÂª8?\u0010ò\u0006Ù\u0014]Ð¦X!\u001c$\u001b\u0005'\u0097Ü(â\u008c\u0018òë\u009cê&\u001eí±×É½öö\u0018(ÑÜ4e\u0085\u0002-ïÙE¨Ú!UÚ'^\u0003ßº°ï Y\u0082¾\u001dòáet\u0091«Yßm÷V¬ºa\u0004vï0°ªÌ¸\u0094ûñlÎg\u0010Ä\u0080]µÐ\u0092\u0004=õ=Ï!77w«\u0010\f@S)´l\u0003\u008fùô¬ Nò\u000eò0q\f(_\u0011J\u0093\t\u009a\u0014D¨/\u0083\u0001:\n0é¢¨k\u008bJ½w1ß.B0!@³\u0090\u0091pÆ\u0087ðÌ\u0005â1õ\u0082ö10\b\u007f×QB\u009b!\u0015\u0004§aIO\u009a\u0089\tz\u0088í\"Ã\u0010\bÿ:8\"m;l,\u0080t\u001c\u0019¯\u0094/d¾4N\u001e»¬huÝ A\u008fÐ\u0018Ð»\u008b\u001e\u000b \u0010È!\u0087ù¦\u0019Á·ùT=\t\u00199/\u0011\u0004\u0089*v½";
      int var7 = "\u0003;\u001dùáXB,8t´O\u001e\u0015ï~~é~Ï\u009b¹\u008e±\u0097\tvx\u0006\u0099Né,\u0093\u0091#Å\u008aL×Ï\u009fIeM:\u0016¥\u0098iµ9\u009f}\"HBìfç\u0094Ô0¿Î vXhËFæë,\u008e\u0096/eñí&O[d(\u0089Dùg\u0002 íZM\u0082?ÑÉ'\u0018q\u0088\u000e~\r¨ÐCN×u\u0083£ÔÒ\u0016ëZ\u0084\u0017\u0003ù½<¨pá«5\u0092Ãjr³.\u0010²Ü\u0016\u008eT\u0095gÜ\u00ad\u000b¬èÀEî\n°°^éóü%ó\u0099ð)Ò\u0098KÄ~GÅfºPîè3\u008b{»\u009dI.;À2}r6G¬å]k\u0080¢\u0090ÈR÷Ì. \u0014u\u0013\u0082ª%Ú\u0093lß_q\u001a\u008b©F\u0015\u000ef3ß¡\u009b\u009d\u008b\u001dà\u009f\u009aÍzj\u0018\u0099\u0017×èl\u008e ]è¼\\a§v?\\lð\u0080¹¢º\u000b6\u0010±Sa<\"o\u00837îü$A?äË\u0085(\u0082\u009bÚ\u0085@Ãö¤?ÙÞ\u0011phâ\u0017\u008e%-Á\u0016æ\u009eLL\u000fÐ\u001cs-p¢\u000e2pZáß\u009e)\u0010\b¥\u0003+Å\u008eì<ÔÙ\"º>R\u001bm(ä)\u0088/\u0007_ûSâ\u0099Ý¼òo\u0081O\u0095*\u009d³UÈ¬»Ì\u0011N°\u008d\u0086\u0010B½\u0001ôÇ\f\ndÎ Í&\u001bý\u009f}JÀ Yò½¸\u008f\u001eèûÍ4e\u00929_·?\u008dÈ\u008c\"\u0093iÁ\u0010G1¸\u0081/\u0082õQ6Ë?AJÆí{\u0010\t¿\u008fìj\u000eÍû\u0087vÌÙ\u000e?\u00980\u0010\u0003\u0088hE~îCÚqMëv³\u0085\u008ei\u0018O-Ð\u0014ÆÁuËM\u009e\"\f\u009aö>±\u0002ünîÂª8?\u0010ò\u0006Ù\u0014]Ð¦X!\u001c$\u001b\u0005'\u0097Ü(â\u008c\u0018òë\u009cê&\u001eí±×É½öö\u0018(ÑÜ4e\u0085\u0002-ïÙE¨Ú!UÚ'^\u0003ßº°ï Y\u0082¾\u001dòáet\u0091«Yßm÷V¬ºa\u0004vï0°ªÌ¸\u0094ûñlÎg\u0010Ä\u0080]µÐ\u0092\u0004=õ=Ï!77w«\u0010\f@S)´l\u0003\u008fùô¬ Nò\u000eò0q\f(_\u0011J\u0093\t\u009a\u0014D¨/\u0083\u0001:\n0é¢¨k\u008bJ½w1ß.B0!@³\u0090\u0091pÆ\u0087ðÌ\u0005â1õ\u0082ö10\b\u007f×QB\u009b!\u0015\u0004§aIO\u009a\u0089\tz\u0088í\"Ã\u0010\bÿ:8\"m;l,\u0080t\u001c\u0019¯\u0094/d¾4N\u001e»¬huÝ A\u008fÐ\u0018Ð»\u008b\u001e\u000b \u0010È!\u0087ù¦\u0019Á·ùT=\t\u00199/\u0011\u0004\u0089*v½"
         .length();
      char var8 = '0';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var19.getBytes("ISO-8859-1"));
            String var27 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var27;
                  if ((var17 += var8) >= var7) {
                     CONST_Q = var4;
                     CONST_R = new String[23];
                     Cipher var11;
                     Cipher var21 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var21.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 5093156918699688723L;
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
                     long var31 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     -4848839423724355476L = var31;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var27;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "\u0014ªÿ\u0016\u0088td\u00041\u008aVqªÙ] ðtb#å\u0016\u001e¤¬`â\u001a¼QÁ7#\u009d\u0019ïÍ£®WPá\u0084\u0015±Ð\u0018ú¢2%¯N\u0013ÍZ¾ó\u0082±\u001e\u007f\u0010?ÜÒ\u0080h¤F|è\u0016\u001c-\u008a¬ÊäB]\u0017Û\u0093ÖOR\u0010ÏÕ\u0012Z©ZáÃ¬\u009af!\fëèr\u000e©ºkaÌ\u0011Ç%>\u00951áýi\u001f_";
                  var7 = "\u0014ªÿ\u0016\u0088td\u00041\u008aVqªÙ] ðtb#å\u0016\u001e¤¬`â\u001a¼QÁ7#\u009d\u0019ïÍ£®WPá\u0084\u0015±Ð\u0018ú¢2%¯N\u0013ÍZ¾ó\u0082±\u001e\u007f\u0010?ÜÒ\u0080h¤F|è\u0016\u001c-\u008a¬ÊäB]\u0017Û\u0093ÖOR\u0010ÏÕ\u0012Z©ZáÃ¬\u009af!\fëèr\u000e©ºkaÌ\u0011Ç%>\u00951áýi\u001f_"
                     .length();
                  var8 = '(';
                  var17 = -1;
            }

            var19 = var6.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27775;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c1", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/c1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
