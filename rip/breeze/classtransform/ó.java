package rip.breeze.classtransform;

import java.lang.instrument.ClassFileTransformer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.Mapping;
import rip.breeze.inject.ù;

public class ó implements ClassFileTransformer {
   public final ժ ժ_ÿ_2;
   public final է է_þ_2;
   public final ò ò_ý_2;
   public final Mapping mapping_ü_2;
   private final List<BreezeColor> list_û_2;
   private final Map<String, â> map_ú_2;
   private final List<IBreezeInterface2> list_ù_2;
   private final List<IFunctional3> list_ø_2;
   private final Map<String, List<IFunctional>> map_ö_2;
   private final Map<String, List<rip.breeze.inject.é>> map_õ_2;
   private final List<IFunctional2> list_ô_2;
   private final Set<String> set_ó_2;
   private final Set<String> set_ò_2;
   private static String[] arr_ñ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public ó(է var1, long var2) {
      var2 = encKey_a_2 ^ var2;
      long var10001 = var2 ^ 70040626201605L;
      int var4 = (int)((var2 ^ 70040626201605L) >>> 48);
      int var5 = (int)((var2 ^ 70040626201605L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 59603153812582L;
      this(var1, new í((short)var4, var5, (char)var6), var7, Mapping.NONE);
   }

   public ó(է param1, ò param2, long param3, Mapping param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/classtransform/ó.encKey_a_2 J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 14808340259305
      // 00b: lxor
      // 00c: lstore 6
      // 00e: pop2
      // 00f: aload 0
      // 010: invokespecial java/lang/Object.<init> ()V
      // 013: invokestatic rip/breeze/classtransform/ó.method_015 ()[Ljava/lang/String;
      // 016: aload 0
      // 017: new rip/breeze/classtransform/ժ
      // 01a: dup
      // 01b: aload 0
      // 01c: invokespecial rip/breeze/classtransform/ժ.<init> (Lrip/breeze/classtransform/ó;)V
      // 01f: putfield rip/breeze/classtransform/ó.ժ_ÿ_2 Lrip/breeze/classtransform/ժ;
      // 022: aload 0
      // 023: new java/util/ArrayList
      // 026: dup
      // 027: invokespecial java/util/ArrayList.<init> ()V
      // 02a: putfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 02d: aload 0
      // 02e: new java/util/HashMap
      // 031: dup
      // 032: invokespecial java/util/HashMap.<init> ()V
      // 035: putfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 038: aload 0
      // 039: new java/util/ArrayList
      // 03c: dup
      // 03d: invokespecial java/util/ArrayList.<init> ()V
      // 040: putfield rip/breeze/classtransform/ó.list_ù_2 Ljava/util/List;
      // 043: aload 0
      // 044: new java/util/ArrayList
      // 047: dup
      // 048: invokespecial java/util/ArrayList.<init> ()V
      // 04b: putfield rip/breeze/classtransform/ó.list_ø_2 Ljava/util/List;
      // 04e: aload 0
      // 04f: new java/util/HashMap
      // 052: dup
      // 053: invokespecial java/util/HashMap.<init> ()V
      // 056: putfield rip/breeze/classtransform/ó.map_ö_2 Ljava/util/Map;
      // 059: aload 0
      // 05a: new java/util/HashMap
      // 05d: dup
      // 05e: invokespecial java/util/HashMap.<init> ()V
      // 061: putfield rip/breeze/classtransform/ó.map_õ_2 Ljava/util/Map;
      // 064: aload 0
      // 065: new java/util/ArrayList
      // 068: dup
      // 069: invokespecial java/util/ArrayList.<init> ()V
      // 06c: putfield rip/breeze/classtransform/ó.list_ô_2 Ljava/util/List;
      // 06f: aload 0
      // 070: new java/util/HashSet
      // 073: dup
      // 074: invokespecial java/util/HashSet.<init> ()V
      // 077: putfield rip/breeze/classtransform/ó.set_ó_2 Ljava/util/Set;
      // 07a: aload 0
      // 07b: new java/util/HashSet
      // 07e: dup
      // 07f: invokespecial java/util/HashSet.<init> ()V
      // 082: putfield rip/breeze/classtransform/ó.set_ò_2 Ljava/util/Set;
      // 085: aload 0
      // 086: aload 1
      // 087: putfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 08a: aload 0
      // 08b: aload 2
      // 08c: putfield rip/breeze/classtransform/ó.ò_ý_2 Lrip/breeze/classtransform/ò;
      // 08f: aload 0
      // 090: getfield rip/breeze/classtransform/ó.ò_ý_2 Lrip/breeze/classtransform/ò;
      // 093: lload 6
      // 095: bipush 1
      // 096: anewarray 4
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: invokevirtual rip/breeze/classtransform/ò.method_002 ([Ljava/lang/Object;)V
      // 0a5: aload 0
      // 0a6: aload 5
      // 0a8: putfield rip/breeze/classtransform/ó.mapping_ü_2 Lrip/breeze/classtransform/annotations/Mapping;
      // 0ab: aload 0
      // 0ac: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 0af: new rip/breeze/classtransform/Util142
      // 0b2: dup
      // 0b3: invokespecial rip/breeze/classtransform/Util142.<init> ()V
      // 0b6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0bb: pop
      // 0bc: aload 0
      // 0bd: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 0c0: new rip/breeze/classtransform/BreezeClass4
      // 0c3: dup
      // 0c4: invokespecial rip/breeze/classtransform/BreezeClass4.<init> ()V
      // 0c7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cc: pop
      // 0cd: aload 0
      // 0ce: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 0d1: new rip/breeze/classtransform/BreezeClass6
      // 0d4: dup
      // 0d5: invokespecial rip/breeze/classtransform/BreezeClass6.<init> ()V
      // 0d8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0dd: pop
      // 0de: aload 0
      // 0df: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 0e2: new rip/breeze/classtransform/Util141
      // 0e5: dup
      // 0e6: bipush 1
      // 0e7: invokespecial rip/breeze/classtransform/Util141.<init> (Z)V
      // 0ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ef: pop
      // 0f0: aload 0
      // 0f1: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 0f4: new rip/breeze/classtransform/BreezeClass2
      // 0f7: dup
      // 0f8: invokespecial rip/breeze/classtransform/BreezeClass2.<init> ()V
      // 0fb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 100: pop
      // 101: aload 0
      // 102: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 105: new rip/breeze/classtransform/MathUtil11
      // 108: dup
      // 109: invokespecial rip/breeze/classtransform/MathUtil11.<init> ()V
      // 10c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 111: pop
      // 112: aload 0
      // 113: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 116: new rip/breeze/classtransform/Util139
      // 119: dup
      // 11a: invokespecial rip/breeze/classtransform/Util139.<init> ()V
      // 11d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 122: pop
      // 123: astore 8
      // 125: aload 0
      // 126: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 129: new rip/breeze/classtransform/Util141
      // 12c: dup
      // 12d: bipush 0
      // 12e: invokespecial rip/breeze/classtransform/Util141.<init> (Z)V
      // 131: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 136: pop
      // 137: aload 0
      // 138: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 13b: new rip/breeze/classtransform/BreezeClass5
      // 13e: dup
      // 13f: invokespecial rip/breeze/classtransform/BreezeClass5.<init> ()V
      // 142: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 147: pop
      // 148: aload 0
      // 149: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 14c: sipush 27389
      // 14f: ldc2_w 3666906763917461062
      // 152: lload 3
      // 153: lxor
      // 154: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: new rip/breeze/classtransform/ß
      // 15c: dup
      // 15d: invokespecial rip/breeze/classtransform/ß.<init> ()V
      // 160: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 165: pop
      // 166: aload 0
      // 167: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 16a: sipush 22202
      // 16d: ldc2_w 2481200501291563522
      // 170: lload 3
      // 171: lxor
      // 172: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: new rip/breeze/classtransform/BreezeClass9
      // 17a: dup
      // 17b: invokespecial rip/breeze/classtransform/BreezeClass9.<init> ()V
      // 17e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 183: pop
      // 184: aload 0
      // 185: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 188: sipush 19559
      // 18b: ldc2_w 36602732511633620
      // 18e: lload 3
      // 18f: lxor
      // 190: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: new rip/breeze/classtransform/BreezeClass7
      // 198: dup
      // 199: invokespecial rip/breeze/classtransform/BreezeClass7.<init> ()V
      // 19c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1a1: pop
      // 1a2: aload 0
      // 1a3: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 1a6: sipush 8470
      // 1a9: ldc2_w 2162905051267190196
      // 1ac: lload 3
      // 1ad: lxor
      // 1ae: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: new rip/breeze/classtransform/BreezeClass8
      // 1b6: dup
      // 1b7: invokespecial rip/breeze/classtransform/BreezeClass8.<init> ()V
      // 1ba: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1bf: pop
      // 1c0: aload 0
      // 1c1: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 1c4: sipush 11695
      // 1c7: ldc2_w 2174813234289295647
      // 1ca: lload 3
      // 1cb: lxor
      // 1cc: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: new rip/breeze/classtransform/º
      // 1d4: dup
      // 1d5: invokespecial rip/breeze/classtransform/º.<init> ()V
      // 1d8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1dd: pop
      // 1de: aload 0
      // 1df: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 1e2: sipush 25086
      // 1e5: ldc2_w 4140033866033794368
      // 1e8: lload 3
      // 1e9: lxor
      // 1ea: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: new rip/breeze/classtransform/à
      // 1f2: dup
      // 1f3: invokespecial rip/breeze/classtransform/à.<init> ()V
      // 1f6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1fb: pop
      // 1fc: aload 0
      // 1fd: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 200: sipush 32112
      // 203: ldc2_w 2145818462371451332
      // 206: lload 3
      // 207: lxor
      // 208: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: new rip/breeze/classtransform/à
      // 210: dup
      // 211: sipush 180
      // 214: sipush 178
      // 217: invokespecial rip/breeze/classtransform/à.<init> (II)V
      // 21a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 21f: pop
      // 220: aload 0
      // 221: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 224: sipush 2620
      // 227: ldc2_w 2852382850399594112
      // 22a: lload 3
      // 22b: lxor
      // 22c: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: new rip/breeze/classtransform/à
      // 234: dup
      // 235: sipush 181
      // 238: sipush 179
      // 23b: invokespecial rip/breeze/classtransform/à.<init> (II)V
      // 23e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 243: pop
      // 244: aload 0
      // 245: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 248: sipush 18769
      // 24b: ldc2_w 8545298389265163748
      // 24e: lload 3
      // 24f: lxor
      // 250: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: new rip/breeze/classtransform/µ
      // 258: dup
      // 259: invokespecial rip/breeze/classtransform/µ.<init> ()V
      // 25c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 261: pop
      // 262: aload 0
      // 263: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 266: sipush 14520
      // 269: ldc2_w 3155130134146962461
      // 26c: lload 3
      // 26d: lxor
      // 26e: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: new rip/breeze/classtransform/ª
      // 276: dup
      // 277: invokespecial rip/breeze/classtransform/ª.<init> ()V
      // 27a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 27f: pop
      // 280: aload 0
      // 281: getfield rip/breeze/classtransform/ó.map_ú_2 Ljava/util/Map;
      // 284: sipush 15212
      // 287: ldc2_w 6644401970134308827
      // 28a: lload 3
      // 28b: lxor
      // 28c: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: new rip/breeze/classtransform/á
      // 294: dup
      // 295: invokespecial rip/breeze/classtransform/á.<init> ()V
      // 298: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 29d: pop
      // 29e: aload 8
      // 2a0: ifnull 2bc
      // 2a3: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 2a6: ifeq 2b8
      // 2a9: goto 2b0
      // 2ac: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2af: athrow
      // 2b0: bipush 0
      // 2b1: goto 2b9
      // 2b4: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: bipush 1
      // 2b9: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 2bc: return
      // try (137 -> 292): 293 rip/breeze/classtransform/բ
      // try (290 -> 297): 297 rip/breeze/classtransform/բ
   }

   public Set invoke_1(Object[] var1) {
      return Collections.unmodifiableSet(this.set_ó_2);
   }

   public Set invoke_2(Object[] var1) {
      return Collections.unmodifiableSet(this.set_ò_2);
   }

   public Map invoke_3(Object[] var1) {
      return Collections.unmodifiableMap(this.map_ú_2);
   }

   public Optional invoke_4(Object[] var1) {
      String var2 = (String)var1[0];
      return Optional.ofNullable(this.map_ú_2.get(var2.toUpperCase(Locale.ROOT)));
   }

   public void invoke_5(Object[] var1) {
      IBreezeInterface2 var2 = (IBreezeInterface2)var1[0];
      this.list_ù_2.add(var2);
   }

   public void invoke_6(Object[] var1) {
      IFunctional3 var2 = (IFunctional3)var1[0];
      this.list_ø_2.add(var2);
   }

   public void invoke_7(Object[] var1) {
      String var2 = (String)var1[0];
      IFunctional var3 = (IFunctional)var1[1];
      this.map_ö_2.computeIfAbsent(var2, ó::lambda$addRawTransformer_Inner0).add(var3);
      this.set_ò_2.add(var2);
   }

   public void invoke_8(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/ó.encKey_a_2 J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 108855660172564
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 101097552882662
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 127123229867087
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 45076764201218
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 25278634217580
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 17498252994093
      // 041: lxor
      // 042: lstore 15
      // 044: pop2
      // 045: invokestatic rip/breeze/classtransform/ó.method_015 ()[Ljava/lang/String;
      // 048: new java/util/ArrayList
      // 04b: dup
      // 04c: invokespecial java/util/ArrayList.<init> ()V
      // 04f: astore 17
      // 051: astore 18
      // 053: bipush 0
      // 054: istore 19
      // 056: aload 2
      // 057: sipush 31563
      // 05a: ldc2_w 7486009963143916397
      // 05d: lload 3
      // 05e: lxor
      // 05f: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 067: aload 18
      // 069: ifnonnull 151
      // 06c: ifeq 139
      // 06f: goto 076
      // 072: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: bipush 1
      // 077: istore 19
      // 079: aload 2
      // 07a: bipush 0
      // 07b: aload 2
      // 07c: invokevirtual java/lang/String.length ()I
      // 07f: bipush 2
      // 080: isub
      // 081: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 084: astore 20
      // 086: aload 0
      // 087: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 08a: lload 11
      // 08c: bipush 1
      // 08d: anewarray 4
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: invokeinterface rip/breeze/classtransform/է.method_002 ([Ljava/lang/Object;)Ljava/util/Map; 2
      // 09e: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0a3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0a8: astore 21
      // 0aa: aload 21
      // 0ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b1: ifeq 12e
      // 0b4: aload 21
      // 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bb: checkcast java/util/Map$Entry
      // 0be: astore 22
      // 0c0: aload 18
      // 0c2: lload 3
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: ifle 0d2
      // 0c8: ifnonnull 292
      // 0cb: aload 22
      // 0cd: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0d2: checkcast java/lang/String
      // 0d5: aload 20
      // 0d7: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0da: aload 18
      // 0dc: ifnonnull 10d
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: ifeq 10e
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 17
      // 0f2: aload 22
      // 0f4: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0f9: checkcast java/util/function/Supplier
      // 0fc: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 101: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 106: goto 10d
      // 109: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: pop
      // 10e: goto 129
      // 111: astore 23
      // 113: new rip/breeze/classtransform/բ
      // 116: dup
      // 117: aload 22
      // 119: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 11e: checkcast java/lang/String
      // 121: aload 23
      // 123: lload 5
      // 125: invokespecial rip/breeze/classtransform/բ.<init> (Ljava/lang/String;Ljava/lang/Throwable;J)V
      // 128: athrow
      // 129: aload 18
      // 12b: ifnull 0aa
      // 12e: aload 18
      // 130: lload 3
      // 131: lconst_0
      // 132: lcmp
      // 133: iflt 0bb
      // 136: ifnull 292
      // 139: aload 2
      // 13a: sipush 20477
      // 13d: ldc2_w 5450292790755123148
      // 140: lload 3
      // 141: lxor
      // 142: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 14a: goto 151
      // 14d: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: aload 18
      // 153: ifnonnull 27f
      // 156: ifeq 25a
      // 159: goto 160
      // 15c: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: bipush 1
      // 161: istore 19
      // 163: aload 2
      // 164: bipush 0
      // 165: aload 2
      // 166: invokevirtual java/lang/String.length ()I
      // 169: bipush 1
      // 16a: isub
      // 16b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 16e: astore 20
      // 170: aload 0
      // 171: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 174: lload 11
      // 176: bipush 1
      // 177: anewarray 4
      // 17a: dup_x2
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 180: bipush 0
      // 181: swap
      // 182: aastore
      // 183: invokeinterface rip/breeze/classtransform/է.method_002 ([Ljava/lang/Object;)Ljava/util/Map; 2
      // 188: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 18d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 192: astore 21
      // 194: aload 21
      // 196: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19b: ifeq 24f
      // 19e: aload 21
      // 1a0: lload 3
      // 1a1: lconst_0
      // 1a2: lcmp
      // 1a3: ifle 299
      // 1a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ab: checkcast java/util/Map$Entry
      // 1ae: astore 22
      // 1b0: aload 18
      // 1b2: ifnonnull 292
      // 1b5: aload 22
      // 1b7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1bc: checkcast java/lang/String
      // 1bf: aload 18
      // 1c1: ifnonnull 1f9
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 20
      // 1cd: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1d0: ifeq 24a
      // 1d3: goto 1da
      // 1d6: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: aload 22
      // 1dc: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1e1: checkcast java/lang/String
      // 1e4: bipush 0
      // 1e5: aload 22
      // 1e7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1ec: checkcast java/lang/String
      // 1ef: bipush 46
      // 1f1: invokevirtual java/lang/String.lastIndexOf (I)I
      // 1f4: bipush 1
      // 1f5: iadd
      // 1f6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f9: astore 23
      // 1fb: aload 23
      // 1fd: aload 20
      // 1ff: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 202: aload 18
      // 204: ifnonnull 22e
      // 207: ifeq 22f
      // 20a: goto 211
      // 20d: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: aload 17
      // 213: aload 22
      // 215: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 21a: checkcast java/util/function/Supplier
      // 21d: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 222: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 227: goto 22e
      // 22a: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: pop
      // 22f: goto 24a
      // 232: astore 23
      // 234: new rip/breeze/classtransform/բ
      // 237: dup
      // 238: aload 22
      // 23a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 23f: checkcast java/lang/String
      // 242: aload 23
      // 244: lload 5
      // 246: invokespecial rip/breeze/classtransform/բ.<init> (Ljava/lang/String;Ljava/lang/Throwable;J)V
      // 249: athrow
      // 24a: aload 18
      // 24c: ifnull 194
      // 24f: aload 18
      // 251: lload 3
      // 252: lconst_0
      // 253: lcmp
      // 254: iflt 1ab
      // 257: ifnull 292
      // 25a: aload 17
      // 25c: aload 0
      // 25d: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 260: lload 7
      // 262: aload 2
      // 263: bipush 2
      // 264: anewarray 4
      // 267: dup_x1
      // 268: swap
      // 269: bipush 1
      // 26a: swap
      // 26b: aastore
      // 26c: dup_x2
      // 26d: dup_x2
      // 26e: pop
      // 26f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 272: bipush 0
      // 273: swap
      // 274: aastore
      // 275: invokeinterface rip/breeze/classtransform/է.method_001 ([Ljava/lang/Object;)[B 2
      // 27a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27f: pop
      // 280: goto 292
      // 283: astore 20
      // 285: new rip/breeze/classtransform/բ
      // 288: dup
      // 289: aload 2
      // 28a: aload 20
      // 28c: lload 5
      // 28e: invokespecial rip/breeze/classtransform/բ.<init> (Ljava/lang/String;Ljava/lang/Throwable;J)V
      // 291: athrow
      // 292: aload 17
      // 294: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 299: astore 20
      // 29b: aload 20
      // 29d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a2: ifeq 3ac
      // 2a5: aload 20
      // 2a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2ac: checkcast [B
      // 2af: astore 21
      // 2b1: aconst_null
      // 2b2: astore 22
      // 2b4: aload 21
      // 2b6: lload 9
      // 2b8: bipush 2
      // 2b9: anewarray 4
      // 2bc: dup_x2
      // 2bd: dup_x2
      // 2be: pop
      // 2bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c2: bipush 1
      // 2c3: swap
      // 2c4: aastore
      // 2c5: dup_x1
      // 2c6: swap
      // 2c7: bipush 0
      // 2c8: swap
      // 2c9: aastore
      // 2ca: invokestatic rip/breeze/classtransform/MathUtil3.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 2cd: astore 23
      // 2cf: aload 23
      // 2d1: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 2d4: astore 22
      // 2d6: aload 0
      // 2d7: aload 23
      // 2d9: iload 19
      // 2db: aload 18
      // 2dd: ifnonnull 2eb
      // 2e0: ifne 2ee
      // 2e3: goto 2ea
      // 2e6: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e9: athrow
      // 2ea: bipush 1
      // 2eb: goto 2ef
      // 2ee: bipush 0
      // 2ef: lload 13
      // 2f1: dup2_x1
      // 2f2: pop2
      // 2f3: bipush 3
      // 2f4: anewarray 4
      // 2f7: dup_x1
      // 2f8: swap
      // 2f9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2fc: bipush 2
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x2
      // 300: dup_x2
      // 301: pop
      // 302: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 305: bipush 1
      // 306: swap
      // 307: aastore
      // 308: dup_x1
      // 309: swap
      // 30a: bipush 0
      // 30b: swap
      // 30c: aastore
      // 30d: invokevirtual rip/breeze/classtransform/ó.method_010 ([Ljava/lang/Object;)Ljava/util/Set;
      // 310: astore 24
      // 312: aload 24
      // 314: invokeinterface java/util/Set.isEmpty ()Z 1
      // 319: lload 3
      // 31a: lconst_0
      // 31b: lcmp
      // 31c: iflt 330
      // 31f: aload 18
      // 321: ifnonnull 330
      // 324: ifeq 374
      // 327: goto 32e
      // 32a: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32d: athrow
      // 32e: iload 19
      // 330: lload 3
      // 331: lconst_0
      // 332: lcmp
      // 333: iflt 33c
      // 336: ifne 374
      // 339: sipush 22305
      // 33c: ldc2_w 9028367336954742533
      // 33f: lload 3
      // 340: lxor
      // 341: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: bipush 1
      // 347: anewarray 4
      // 34a: dup
      // 34b: bipush 0
      // 34c: aload 22
      // 34e: aastore
      // 34f: lload 15
      // 351: dup2_x1
      // 352: pop2
      // 353: bipush 3
      // 354: anewarray 4
      // 357: dup_x1
      // 358: swap
      // 359: bipush 2
      // 35a: swap
      // 35b: aastore
      // 35c: dup_x2
      // 35d: dup_x2
      // 35e: pop
      // 35f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 362: bipush 1
      // 363: swap
      // 364: aastore
      // 365: dup_x1
      // 366: swap
      // 367: bipush 0
      // 368: swap
      // 369: aastore
      // 36a: invokestatic rip/breeze/classtransform/հ.method_002 ([Ljava/lang/Object;)V
      // 36d: goto 374
      // 370: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 373: athrow
      // 374: goto 3a7
      // 377: astore 23
      // 379: aload 22
      // 37b: ifnonnull 399
      // 37e: new java/lang/RuntimeException
      // 381: dup
      // 382: sipush 23340
      // 385: ldc2_w 7251518606232374041
      // 388: lload 3
      // 389: lxor
      // 38a: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: aload 23
      // 391: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 394: athrow
      // 395: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 398: athrow
      // 399: new rip/breeze/classtransform/բ
      // 39c: dup
      // 39d: aload 22
      // 39f: aload 23
      // 3a1: lload 5
      // 3a3: invokespecial rip/breeze/classtransform/բ.<init> (Ljava/lang/String;Ljava/lang/Throwable;J)V
      // 3a6: athrow
      // 3a7: aload 18
      // 3a9: ifnull 29b
      // 3ac: return
      // try (113 -> 123): 124 java/lang/Throwable
      // try (103 -> 114): 115 java/lang/Throwable
      // try (97 -> 110): 111 java/lang/Throwable
      // try (51 -> 61): 62 java/lang/Throwable
      // try (97 -> 127): 128 java/lang/Throwable
      // try (233 -> 243): 244 java/lang/Throwable
      // try (228 -> 234): 235 java/lang/Throwable
      // try (201 -> 212): 213 java/lang/Throwable
      // try (199 -> 206): 207 java/lang/Throwable
      // try (156 -> 159): 160 java/lang/Throwable
      // try (140 -> 153): 154 java/lang/Throwable
      // try (215 -> 247): 248 java/lang/Throwable
      // try (266 -> 288): 289 java/lang/ClassNotFoundException
      // try (380 -> 419): 420 java/lang/Throwable
      // try (367 -> 376): 377 java/lang/Throwable
      // try (330 -> 336): 337 java/lang/Throwable
      // try (309 -> 422): 423 java/lang/Throwable
      // try (424 -> 436): 436 java/lang/Throwable
   }

   public Set invoke_9(Object[] var1) {
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 97926787722803L;
      Object[] var10005 = new Object[]{null, null, true};
      var10005[1] = var5;
      var10005[0] = var2;
      return this.method_010(var10005);
   }

   public Set invoke_10(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/inject/é
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Boolean
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: istore 5
      // 01d: pop
      // 01e: getstatic rip/breeze/classtransform/ó.encKey_a_2 J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 93092471334384
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 42996158279199
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 73104759984005
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: invokestatic rip/breeze/classtransform/ó.method_015 ()[Ljava/lang/String;
      // 03e: aload 0
      // 03f: getfield rip/breeze/classtransform/ó.list_ù_2 Ljava/util/List;
      // 042: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 047: astore 12
      // 049: astore 13
      // 04b: aload 12
      // 04d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 052: ifeq 094
      // 055: aload 12
      // 057: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05c: checkcast rip/breeze/classtransform/IBreezeInterface2
      // 05f: astore 14
      // 061: aload 14
      // 063: aload 2
      // 064: bipush 1
      // 065: anewarray 4
      // 068: dup_x1
      // 069: swap
      // 06a: bipush 0
      // 06b: swap
      // 06c: aastore
      // 06d: invokeinterface rip/breeze/classtransform/IBreezeInterface2.method_001 ([Ljava/lang/Object;)V 2
      // 072: aload 14
      // 074: aload 2
      // 075: bipush 1
      // 076: anewarray 4
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokeinterface rip/breeze/classtransform/IBreezeInterface2.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é; 2
      // 083: aload 13
      // 085: lload 3
      // 086: lconst_0
      // 087: lcmp
      // 088: iflt 0ac
      // 08b: ifnonnull 095
      // 08e: astore 2
      // 08f: aload 13
      // 091: ifnull 04b
      // 094: aload 2
      // 095: ldc_w rip/breeze/classtransform/annotations/CTransformer
      // 098: lload 6
      // 09a: bipush 3
      // 09b: anewarray 4
      // 09e: dup_x2
      // 09f: dup_x2
      // 0a0: pop
      // 0a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a4: bipush 2
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: bipush 1
      // 0aa: swap
      // 0ab: aastore
      // 0ac: dup_x1
      // 0ad: swap
      // 0ae: bipush 0
      // 0af: swap
      // 0b0: aastore
      // 0b1: invokestatic rip/breeze/classtransform/չ.method_028 ([Ljava/lang/Object;)Ljava/util/Optional;
      // 0b4: astore 12
      // 0b6: aload 12
      // 0b8: aload 13
      // 0ba: ifnonnull 105
      // 0bd: invokevirtual java/util/Optional.isPresent ()Z
      // 0c0: ifne 0f3
      // 0c3: goto 0ca
      // 0c6: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: iload 5
      // 0cc: ifeq 0ef
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: new java/lang/IllegalStateException
      // 0d9: dup
      // 0da: sipush 12605
      // 0dd: ldc2_w 7576999835188679734
      // 0e0: lload 3
      // 0e1: lxor
      // 0e2: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0ea: athrow
      // 0eb: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: invokestatic java/util/Collections.emptySet ()Ljava/util/Set;
      // 0f2: areturn
      // 0f3: aload 12
      // 0f5: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/ó.lambda$addTransformer_Inner1 (Lrip/breeze/inject/ù;)Ljava/util/List;, (Lrip/breeze/inject/ù;)Ljava/util/List; ]
      // 0fa: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 0fd: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, java/util/Collections.emptyList ()Ljava/util/List;, ()Ljava/util/List; ]
      // 102: invokevirtual java/util/Optional.orElseGet (Ljava/util/function/Supplier;)Ljava/lang/Object;
      // 105: checkcast java/util/List
      // 108: astore 14
      // 10a: new java/util/HashSet
      // 10d: dup
      // 10e: invokespecial java/util/HashSet.<init> ()V
      // 111: astore 15
      // 113: bipush 0
      // 114: istore 16
      // 116: iload 16
      // 118: aload 14
      // 11a: invokeinterface java/util/List.size ()I 1
      // 11f: if_icmpge 2b3
      // 122: aload 14
      // 124: iload 16
      // 126: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 12b: checkcast java/lang/String
      // 12e: astore 17
      // 130: aload 14
      // 132: iload 16
      // 134: bipush 1
      // 135: iadd
      // 136: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 13b: astore 18
      // 13d: aload 17
      // 13f: sipush 11908
      // 142: lload 3
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 2ca
      // 148: ldc2_w 6633009909467761545
      // 14b: lload 3
      // 14c: lxor
      // 14d: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 155: aload 13
      // 157: ifnonnull 2c4
      // 15a: aload 13
      // 15c: ifnonnull 22e
      // 15f: goto 166
      // 162: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: ifeq 209
      // 169: goto 170
      // 16c: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: aload 18
      // 172: checkcast java/util/List
      // 175: astore 19
      // 177: aload 19
      // 179: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17e: astore 20
      // 180: aload 20
      // 182: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 187: ifeq 1fe
      // 18a: aload 20
      // 18c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 191: checkcast rip/breeze/inject/MathUtil3
      // 194: astore 21
      // 196: aload 0
      // 197: aload 15
      // 199: aload 0
      // 19a: getfield rip/breeze/classtransform/ó.ò_ý_2 Lrip/breeze/classtransform/ò;
      // 19d: aload 21
      // 19f: lload 10
      // 1a1: bipush 1
      // 1a2: anewarray 4
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: invokevirtual rip/breeze/inject/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1b1: lload 8
      // 1b3: dup2_x1
      // 1b4: pop2
      // 1b5: bipush 2
      // 1b6: anewarray 4
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: invokevirtual rip/breeze/classtransform/ò.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1ca: aload 2
      // 1cb: bipush 3
      // 1cc: anewarray 4
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 2
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: bipush 1
      // 1d7: swap
      // 1d8: aastore
      // 1d9: dup_x1
      // 1da: swap
      // 1db: bipush 0
      // 1dc: swap
      // 1dd: aastore
      // 1de: invokespecial rip/breeze/classtransform/ó.method_011 ([Ljava/lang/Object;)V
      // 1e1: aload 13
      // 1e3: lload 3
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 1ee
      // 1e9: ifnonnull 2ae
      // 1ec: aload 13
      // 1ee: ifnull 180
      // 1f1: lload 3
      // 1f2: lconst_0
      // 1f3: lcmp
      // 1f4: iflt 1e1
      // 1f7: goto 1fe
      // 1fa: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: lload 3
      // 1ff: lconst_0
      // 200: lcmp
      // 201: ifle 209
      // 204: aload 13
      // 206: ifnull 2ab
      // 209: aload 17
      // 20b: aload 13
      // 20d: ifnonnull 233
      // 210: goto 217
      // 213: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 216: athrow
      // 217: sipush 365
      // 21a: ldc2_w 3178020162137220206
      // 21d: lload 3
      // 21e: lxor
      // 21f: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 227: goto 22e
      // 22a: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: ifeq 2ab
      // 231: aload 18
      // 233: checkcast java/util/List
      // 236: astore 19
      // 238: aload 19
      // 23a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 23f: astore 20
      // 241: aload 20
      // 243: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 248: ifeq 2ab
      // 24b: aload 20
      // 24d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 252: checkcast java/lang/String
      // 255: astore 21
      // 257: aload 0
      // 258: aload 15
      // 25a: aload 0
      // 25b: getfield rip/breeze/classtransform/ó.ò_ý_2 Lrip/breeze/classtransform/ò;
      // 25e: lload 8
      // 260: aload 21
      // 262: bipush 2
      // 263: anewarray 4
      // 266: dup_x1
      // 267: swap
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x2
      // 26c: dup_x2
      // 26d: pop
      // 26e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 271: bipush 0
      // 272: swap
      // 273: aastore
      // 274: invokevirtual rip/breeze/classtransform/ò.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 277: aload 2
      // 278: bipush 3
      // 279: anewarray 4
      // 27c: dup_x1
      // 27d: swap
      // 27e: bipush 2
      // 27f: swap
      // 280: aastore
      // 281: dup_x1
      // 282: swap
      // 283: bipush 1
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 0
      // 289: swap
      // 28a: aastore
      // 28b: invokespecial rip/breeze/classtransform/ó.method_011 ([Ljava/lang/Object;)V
      // 28e: aload 13
      // 290: lload 3
      // 291: lconst_0
      // 292: lcmp
      // 293: iflt 2b0
      // 296: ifnonnull 2ae
      // 299: aload 13
      // 29b: ifnull 241
      // 29e: lload 3
      // 29f: lconst_0
      // 2a0: lcmp
      // 2a1: ifle 28e
      // 2a4: goto 2ab
      // 2a7: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: iinc 16 2
      // 2ae: aload 13
      // 2b0: ifnull 116
      // 2b3: aload 0
      // 2b4: getfield rip/breeze/classtransform/ó.set_ò_2 Ljava/util/Set;
      // 2b7: lload 3
      // 2b8: lconst_0
      // 2b9: lcmp
      // 2ba: ifle 12b
      // 2bd: aload 15
      // 2bf: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 2c4: pop
      // 2c5: aload 2
      // 2c6: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 2c9: bipush 1
      // 2ca: anewarray 4
      // 2cd: dup_x1
      // 2ce: swap
      // 2cf: bipush 0
      // 2d0: swap
      // 2d1: aastore
      // 2d2: invokestatic rip/breeze/classtransform/MathUtil3.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 2d5: astore 16
      // 2d7: aload 0
      // 2d8: getfield rip/breeze/classtransform/ó.set_ó_2 Ljava/util/Set;
      // 2db: aload 16
      // 2dd: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2e2: pop
      // 2e3: aload 15
      // 2e5: areturn
      // try (103 -> 108): 109 rip/breeze/classtransform/բ
      // try (106 -> 113): 114 rip/breeze/classtransform/բ
      // try (111 -> 125): 125 rip/breeze/classtransform/բ
      // try (157 -> 172): 173 rip/breeze/classtransform/բ
      // try (170 -> 176): 177 rip/breeze/classtransform/բ
      // try (192 -> 253): 258 rip/breeze/classtransform/բ
      // try (260 -> 269): 270 rip/breeze/classtransform/բ
      // try (266 -> 278): 279 rip/breeze/classtransform/բ
      // try (295 -> 343): 348 rip/breeze/classtransform/բ
   }

   private void invoke_11(Object[] var1) {
      Set var2 = (Set)var1[0];
      String var3 = (String)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      List var5 = this.map_õ_2.computeIfAbsent(var3, ó::lambda$addTransformer_Inner2);
      var5.removeIf(ó::lambda$addTransformer_Inner3);
      var5.add(var4);
      var2.add(var3);
   }

   public byte[] invoke_12(Object[] var1) {
      String var2 = (String)var1[0];
      byte[] var3 = (byte[])var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 13541878525961L;
      Object[] var10006 = new Object[]{null, null, null, var6};
      var10006[2] = true;
      var10006[1] = var3;
      var10006[0] = var2;
      return this.method_013(var10006);
   }

   public byte[] invoke_13(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast [B
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Boolean
      // 015: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 018: istore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: pop
      // 026: getstatic rip/breeze/classtransform/ó.encKey_a_2 J
      // 029: lload 5
      // 02b: lxor
      // 02c: lstore 5
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 68825164511862
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 9041229866601
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 41131561530075
      // 042: lxor
      // 043: lstore 11
      // 045: dup2
      // 046: ldc2_w 98119411870949
      // 049: lxor
      // 04a: lstore 13
      // 04c: dup2
      // 04d: ldc2_w 53014378962085
      // 050: lxor
      // 051: lstore 15
      // 053: dup2
      // 054: ldc2_w 15964464325920
      // 057: lxor
      // 058: lstore 17
      // 05a: dup2
      // 05b: ldc2_w 75302444772065
      // 05e: lxor
      // 05f: lstore 19
      // 061: pop2
      // 062: invokestatic rip/breeze/classtransform/ó.method_015 ()[Ljava/lang/String;
      // 065: astore 21
      // 067: bipush 0
      // 068: istore 22
      // 06a: aconst_null
      // 06b: astore 23
      // 06d: aload 0
      // 06e: getfield rip/breeze/classtransform/ó.list_ø_2 Ljava/util/List;
      // 071: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 076: astore 24
      // 078: aload 24
      // 07a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07f: ifeq 0e0
      // 082: aload 24
      // 084: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 089: checkcast rip/breeze/classtransform/IFunctional3
      // 08c: astore 25
      // 08e: aload 25
      // 090: aload 2
      // 091: aload 3
      // 092: iload 4
      // 094: bipush 3
      // 095: anewarray 4
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 09d: bipush 2
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: bipush 1
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: invokeinterface rip/breeze/classtransform/IFunctional3.method_001 ([Ljava/lang/Object;)[B 2
      // 0af: astore 26
      // 0b1: aload 26
      // 0b3: aload 21
      // 0b5: lload 5
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: ifle 0c1
      // 0bc: ifnonnull 0f1
      // 0bf: aload 21
      // 0c1: ifnonnull 0da
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: ifnull 0db
      // 0ce: goto 0d5
      // 0d1: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: istore 22
      // 0d8: aload 26
      // 0da: astore 3
      // 0db: aload 21
      // 0dd: ifnull 078
      // 0e0: aload 0
      // 0e1: getfield rip/breeze/classtransform/ó.map_ö_2 Ljava/util/Map;
      // 0e4: lload 5
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: ifle 089
      // 0eb: aload 2
      // 0ec: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f1: checkcast java/util/List
      // 0f4: astore 24
      // 0f6: aload 24
      // 0f8: ifnull 151
      // 0fb: aload 3
      // 0fc: lload 15
      // 0fe: bipush 2
      // 0ff: anewarray 4
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 0
      // 10e: swap
      // 10f: aastore
      // 110: invokestatic rip/breeze/classtransform/MathUtil3.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 113: astore 23
      // 115: aload 24
      // 117: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11c: astore 25
      // 11e: aload 25
      // 120: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 125: ifeq 151
      // 128: aload 25
      // 12a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12f: checkcast rip/breeze/classtransform/IFunctional
      // 132: astore 26
      // 134: lload 5
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 14c
      // 13b: aload 26
      // 13d: aload 0
      // 13e: aload 23
      // 140: invokeinterface rip/breeze/classtransform/IFunctional.method_001 (Lrip/breeze/classtransform/ó;Lrip/breeze/inject/é;)Lrip/breeze/inject/é; 3
      // 145: aload 21
      // 147: ifnonnull 162
      // 14a: astore 23
      // 14c: aload 21
      // 14e: ifnull 11e
      // 151: aload 0
      // 152: getfield rip/breeze/classtransform/ó.map_õ_2 Ljava/util/Map;
      // 155: lload 5
      // 157: lconst_0
      // 158: lcmp
      // 159: iflt 162
      // 15c: aload 2
      // 15d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 162: checkcast java/util/List
      // 165: astore 25
      // 167: lload 5
      // 169: lconst_0
      // 16a: lcmp
      // 16b: iflt 311
      // 16e: aload 25
      // 170: ifnull 311
      // 173: aload 23
      // 175: aload 21
      // 177: ifnonnull 1aa
      // 17a: goto 181
      // 17d: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 180: athrow
      // 181: ifnonnull 1ac
      // 184: goto 18b
      // 187: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: aload 3
      // 18c: lload 15
      // 18e: bipush 2
      // 18f: anewarray 4
      // 192: dup_x2
      // 193: dup_x2
      // 194: pop
      // 195: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 198: bipush 1
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: invokestatic rip/breeze/classtransform/MathUtil3.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 1a3: goto 1aa
      // 1a6: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: astore 23
      // 1ac: aload 25
      // 1ae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1b3: astore 26
      // 1b5: aload 26
      // 1b7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1bc: ifeq 311
      // 1bf: aload 26
      // 1c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c6: checkcast rip/breeze/inject/é
      // 1c9: astore 27
      // 1cb: aload 27
      // 1cd: lload 17
      // 1cf: bipush 2
      // 1d0: anewarray 4
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 1
      // 1da: swap
      // 1db: aastore
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: bipush 0
      // 1df: swap
      // 1e0: aastore
      // 1e1: invokestatic rip/breeze/classtransform/MathUtil3.getÉ_3 ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 1e4: astore 27
      // 1e6: aload 0
      // 1e7: getfield rip/breeze/classtransform/ó.ò_ý_2 Lrip/breeze/classtransform/ò;
      // 1ea: aload 0
      // 1eb: getfield rip/breeze/classtransform/ó.ժ_ÿ_2 Lrip/breeze/classtransform/ժ;
      // 1ee: aload 0
      // 1ef: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 1f2: lload 13
      // 1f4: aload 23
      // 1f6: aload 27
      // 1f8: bipush 5
      // 1f9: anewarray 4
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 4
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 3
      // 204: swap
      // 205: aastore
      // 206: dup_x2
      // 207: dup_x2
      // 208: pop
      // 209: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20c: bipush 2
      // 20d: swap
      // 20e: aastore
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x1
      // 215: swap
      // 216: bipush 0
      // 217: swap
      // 218: aastore
      // 219: invokevirtual rip/breeze/classtransform/ò.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 21c: astore 27
      // 21e: aload 21
      // 220: ifnonnull 32d
      // 223: goto 267
      // 226: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 229: athrow
      // 22a: astore 28
      // 22c: lload 19
      // 22e: sipush 28575
      // 231: ldc2_w 7968466565410479944
      // 234: lload 5
      // 236: lxor
      // 237: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: bipush 2
      // 23d: anewarray 4
      // 240: dup
      // 241: bipush 0
      // 242: aload 27
      // 244: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 247: aastore
      // 248: dup
      // 249: bipush 1
      // 24a: aload 28
      // 24c: aastore
      // 24d: bipush 3
      // 24e: anewarray 4
      // 251: dup_x1
      // 252: swap
      // 253: bipush 2
      // 254: swap
      // 255: aastore
      // 256: dup_x1
      // 257: swap
      // 258: bipush 1
      // 259: swap
      // 25a: aastore
      // 25b: dup_x2
      // 25c: dup_x2
      // 25d: pop
      // 25e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: invokestatic rip/breeze/classtransform/հ.method_003 ([Ljava/lang/Object;)V
      // 267: aload 0
      // 268: getfield rip/breeze/classtransform/ó.list_û_2 Ljava/util/List;
      // 26b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 270: astore 28
      // 272: aload 28
      // 274: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 279: ifeq 305
      // 27c: aload 28
      // 27e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 283: checkcast rip/breeze/classtransform/BreezeColor
      // 286: astore 29
      // 288: aload 29
      // 28a: aload 0
      // 28b: aload 23
      // 28d: aload 27
      // 28f: lload 7
      // 291: bipush 4
      // 292: anewarray 4
      // 295: dup_x2
      // 296: dup_x2
      // 297: pop
      // 298: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29b: bipush 3
      // 29c: swap
      // 29d: aastore
      // 29e: dup_x1
      // 29f: swap
      // 2a0: bipush 2
      // 2a1: swap
      // 2a2: aastore
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: bipush 1
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 0
      // 2ab: swap
      // 2ac: aastore
      // 2ad: invokevirtual rip/breeze/classtransform/BreezeColor.method_001 ([Ljava/lang/Object;)V
      // 2b0: aload 21
      // 2b2: ifnonnull 1b5
      // 2b5: goto 300
      // 2b8: astore 30
      // 2ba: lload 19
      // 2bc: sipush 12030
      // 2bf: ldc2_w 2738982459185143347
      // 2c2: lload 5
      // 2c4: lxor
      // 2c5: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: bipush 3
      // 2cb: anewarray 4
      // 2ce: dup
      // 2cf: bipush 0
      // 2d0: aload 29
      // 2d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2d5: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 2d8: aastore
      // 2d9: dup
      // 2da: bipush 1
      // 2db: aload 23
      // 2dd: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 2e0: aastore
      // 2e1: dup
      // 2e2: bipush 2
      // 2e3: aload 30
      // 2e5: aastore
      // 2e6: bipush 3
      // 2e7: anewarray 4
      // 2ea: dup_x1
      // 2eb: swap
      // 2ec: bipush 2
      // 2ed: swap
      // 2ee: aastore
      // 2ef: dup_x1
      // 2f0: swap
      // 2f1: bipush 1
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x2
      // 2f5: dup_x2
      // 2f6: pop
      // 2f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fa: bipush 0
      // 2fb: swap
      // 2fc: aastore
      // 2fd: invokestatic rip/breeze/classtransform/հ.method_003 ([Ljava/lang/Object;)V
      // 300: aload 21
      // 302: ifnull 272
      // 305: aload 21
      // 307: lload 5
      // 309: lconst_0
      // 30a: lcmp
      // 30b: iflt 283
      // 30e: ifnull 1b5
      // 311: aload 23
      // 313: lload 5
      // 315: lconst_0
      // 316: lcmp
      // 317: iflt 36d
      // 31a: ifnonnull 32d
      // 31d: iload 22
      // 31f: ifeq 32b
      // 322: goto 329
      // 325: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 328: athrow
      // 329: aload 3
      // 32a: areturn
      // 32b: aconst_null
      // 32c: areturn
      // 32d: iload 4
      // 32f: ifeq 36b
      // 332: aload 23
      // 334: aload 0
      // 335: getfield rip/breeze/classtransform/ó.ժ_ÿ_2 Lrip/breeze/classtransform/ժ;
      // 338: aload 0
      // 339: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 33c: lload 9
      // 33e: bipush 4
      // 33f: anewarray 4
      // 342: dup_x2
      // 343: dup_x2
      // 344: pop
      // 345: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 348: bipush 3
      // 349: swap
      // 34a: aastore
      // 34b: dup_x1
      // 34c: swap
      // 34d: bipush 2
      // 34e: swap
      // 34f: aastore
      // 350: dup_x1
      // 351: swap
      // 352: bipush 1
      // 353: swap
      // 354: aastore
      // 355: dup_x1
      // 356: swap
      // 357: bipush 0
      // 358: swap
      // 359: aastore
      // 35a: invokestatic rip/breeze/classtransform/MathUtil3.method_004 ([Ljava/lang/Object;)[B
      // 35d: astore 26
      // 35f: aload 21
      // 361: lload 5
      // 363: lconst_0
      // 364: lcmp
      // 365: iflt 381
      // 368: ifnull 386
      // 36b: aload 23
      // 36d: lload 11
      // 36f: bipush 2
      // 370: anewarray 4
      // 373: dup_x2
      // 374: dup_x2
      // 375: pop
      // 376: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 379: bipush 1
      // 37a: swap
      // 37b: aastore
      // 37c: dup_x1
      // 37d: swap
      // 37e: bipush 0
      // 37f: swap
      // 380: aastore
      // 381: invokestatic rip/breeze/classtransform/MathUtil3.method_007 ([Ljava/lang/Object;)[B
      // 384: astore 26
      // 386: aload 0
      // 387: getfield rip/breeze/classtransform/ó.list_ô_2 Ljava/util/List;
      // 38a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 38f: astore 27
      // 391: aload 27
      // 393: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 398: ifeq 3c4
      // 39b: aload 27
      // 39d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3a2: checkcast rip/breeze/classtransform/IFunctional2
      // 3a5: astore 28
      // 3a7: aload 28
      // 3a9: aload 2
      // 3aa: aload 26
      // 3ac: bipush 2
      // 3ad: anewarray 4
      // 3b0: dup_x1
      // 3b1: swap
      // 3b2: bipush 1
      // 3b3: swap
      // 3b4: aastore
      // 3b5: dup_x1
      // 3b6: swap
      // 3b7: bipush 0
      // 3b8: swap
      // 3b9: aastore
      // 3ba: invokeinterface rip/breeze/classtransform/IFunctional2.method_001 ([Ljava/lang/Object;)V 2
      // 3bf: aload 21
      // 3c1: ifnull 391
      // 3c4: aload 26
      // 3c6: lload 5
      // 3c8: lconst_0
      // 3c9: lcmp
      // 3ca: ifle 3a2
      // 3cd: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 3d0: lload 5
      // 3d2: lconst_0
      // 3d3: lcmp
      // 3d4: iflt 3db
      // 3d7: ifeq 3e1
      // 3da: bipush 4
      // 3db: anewarray 260
      // 3de: invokestatic rip/breeze/classtransform/ó.method_014 ([Ljava/lang/String;)V
      // 3e1: areturn
      // 3e2: astore 22
      // 3e4: lload 19
      // 3e6: sipush 29187
      // 3e9: ldc2_w 4340004767617270474
      // 3ec: lload 5
      // 3ee: lxor
      // 3ef: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: bipush 2
      // 3f5: anewarray 4
      // 3f8: dup
      // 3f9: bipush 0
      // 3fa: aload 2
      // 3fb: aastore
      // 3fc: dup
      // 3fd: bipush 1
      // 3fe: aload 22
      // 400: aastore
      // 401: bipush 3
      // 402: anewarray 4
      // 405: dup_x1
      // 406: swap
      // 407: bipush 2
      // 408: swap
      // 409: aastore
      // 40a: dup_x1
      // 40b: swap
      // 40c: bipush 1
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x2
      // 410: dup_x2
      // 411: pop
      // 412: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 415: bipush 0
      // 416: swap
      // 417: aastore
      // 418: invokestatic rip/breeze/classtransform/հ.method_003 ([Ljava/lang/Object;)V
      // 41b: aload 22
      // 41d: athrow
      // try (196 -> 217): 218 java/lang/Throwable
      // try (190 -> 197): 198 java/lang/Throwable
      // try (184 -> 193): 194 java/lang/Throwable
      // try (106 -> 112): 113 java/lang/Throwable
      // try (99 -> 108): 109 java/lang/Throwable
      // try (231 -> 289): 294 java/lang/Throwable
      // try (289 -> 292): 292 java/lang/Throwable
      // try (343 -> 373): 376 java/lang/Throwable
      // try (428 -> 436): 437 java/lang/Throwable
      // try (60 -> 440): 545 java/lang/Throwable
      // try (441 -> 442): 545 java/lang/Throwable
      // try (443 -> 531): 545 java/lang/Throwable
   }

   @Override
   public byte[] transform(ClassLoader param1, String param2, Class<?> param3, ProtectionDomain param4, byte[] param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/ó.encKey_a_2 J
      // 03: ldc2_w 5642708929212
      // 06: lxor
      // 07: lstore 6
      // 09: lload 6
      // 0b: dup2
      // 0c: ldc2_w 118729089669509
      // 0f: lxor
      // 10: lstore 8
      // 12: dup2
      // 13: ldc2_w 39408549331821
      // 16: lxor
      // 17: lstore 10
      // 19: pop2
      // 1a: invokestatic rip/breeze/classtransform/ó.method_015 ()[Ljava/lang/String;
      // 1d: astore 12
      // 1f: aload 2
      // 20: aload 12
      // 22: ifnonnull 42
      // 25: ifnonnull 35
      // 28: goto 2f
      // 2b: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aconst_null
      // 30: areturn
      // 31: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 2
      // 36: bipush 1
      // 37: anewarray 4
      // 3a: dup_x1
      // 3b: swap
      // 3c: bipush 0
      // 3d: swap
      // 3e: aastore
      // 3f: invokestatic rip/breeze/classtransform/MathUtil3.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 42: astore 2
      // 43: aload 0
      // 44: aload 2
      // 45: aload 5
      // 47: lload 8
      // 49: bipush 3
      // 4a: anewarray 4
      // 4d: dup_x2
      // 4e: dup_x2
      // 4f: pop
      // 50: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53: bipush 2
      // 54: swap
      // 55: aastore
      // 56: dup_x1
      // 57: swap
      // 58: bipush 1
      // 59: swap
      // 5a: aastore
      // 5b: dup_x1
      // 5c: swap
      // 5d: bipush 0
      // 5e: swap
      // 5f: aastore
      // 60: invokevirtual rip/breeze/classtransform/ó.method_012 ([Ljava/lang/Object;)[B
      // 63: astore 13
      // 65: aload 13
      // 67: aload 12
      // 69: ifnonnull 78
      // 6c: ifnull 79
      // 6f: goto 76
      // 72: invokestatic rip/breeze/classtransform/ó.method_016 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 13
      // 78: areturn
      // 79: goto b5
      // 7c: astore 13
      // 7e: lload 10
      // 80: sipush 21582
      // 83: ldc2_w 9208384812918656274
      // 86: lload 6
      // 88: lxor
      // 89: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ó.method_020 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: bipush 2
      // 8f: anewarray 4
      // 92: dup
      // 93: bipush 0
      // 94: aload 2
      // 95: aastore
      // 96: dup
      // 97: bipush 1
      // 98: aload 13
      // 9a: aastore
      // 9b: bipush 3
      // 9c: anewarray 4
      // 9f: dup_x1
      // a0: swap
      // a1: bipush 2
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 1
      // a7: swap
      // a8: aastore
      // a9: dup_x2
      // aa: dup_x2
      // ab: pop
      // ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // af: bipush 0
      // b0: swap
      // b1: aastore
      // b2: invokestatic rip/breeze/classtransform/հ.method_003 ([Ljava/lang/Object;)V
      // b5: aconst_null
      // b6: areturn
      // try (62 -> 66): 67 java/lang/Throwable
      // try (19 -> 25): 25 java/lang/Throwable
      // try (16 -> 20): 21 java/lang/Throwable
      // try (27 -> 70): 72 java/lang/Throwable
   }

   private static boolean lambda$addTransformer_Inner3(rip.breeze.inject.é var0, rip.breeze.inject.é var1) {
      return var1.string_ú_2.equals(var0.string_ú_2);
   }

   private static List lambda$addTransformer_Inner2(String var0) {
      return new ArrayList<>();
   }

   private static List lambda$addTransformer_Inner1(ù var0) {
      return var0.list_û_2;
   }

   private static List lambda$addRawTransformer_Inner0(String var0) {
      return new ArrayList<>();
   }

   public static void execute_14(String[] var0) {
      arr_ñ_2 = var0;
   }

   public static String[] invoke_15() {
      return arr_ñ_2;
   }

   static {
      long var0 = 120310371030670L;
      method_014(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[22];
      int var5 = 0;
      String var6 = "âô5sÐDá½vûr\u0016Ó9\u0013\u0001\u0010d:ã·m& Ì\u0012B\u0018U¤îÅ\u0002\u0010{k\u0017z~\u008faz\u001a¼êöþf\u0016{8Ï\u0013Y$5Êzv2±k*!©Í\b²©ý\u0082¹zz\u009e\u0093¨Ô\u0098.¹\u009aU¶Èvó\u008b\u009e\u0083\u0084\u009c\r\u0086à\u0019¢è;\u0007èð\r\u000e\u0098<\u000b\u0010ÿJ¯\u0095}rÞ{`5Mu\u000f\u0088§\u000e\u0018ÿ[Z·Æ\u0016$RgÎ£\u00813Ïc·\u0017  -\u0007ea\u0081\u0018)\u009c%g+ã¡k»ô/VÂ«Aû\u009c\u009cÈ'ä'Ò÷\u0010¶¿W\u009fÏ\\¬^\u0018F*i¢§yUPZ\u0014ê_©3ÂF \u0080z\u009b\u0098nÎ8>\u0012$#\u008a4má\u001c?«\u0094|m(Y\u000e\u000eÂ³±)>Ç`\b\u008e£\u0003eæFXÀZº¹¦¥¯`[zÇõ¥]Ô\u009d`Zµ\u0087 \u0090wçõ\u009b\u0090ï5ÏT\u0010°W\u0011åI\u0088\u0006\u0014?¾QÖ\u0091ö\u0013s\u0010ñDó7\u0096wl&ÂÐ+ÈGú\u009dì`²Pù+\u0001a¦YÄ)À1\u0018O\"<!\u009dæáa0þ\u0091\u0090f¸ä²\u0080A\u007f£ps\u0083\u0080¾ð(\u000f\rÜ\u008fN²VØïi¶\u0098\u009a\tºg\u008c5\u0016ü½\u0017\u0081; È\u0098aÚ±ç¬Ðgk\u007fcRÕ  \u0097:(-Ôµ8ÇCö×\u0015°Dt8Ö\u001bt ¾\u0013³\u0097\u001de\u001a¥sO\u0007\u0089\u00174«¹[ÜÖÿ$Ú%ùµyØâda\u0014\u008a\u0084à°ÓB{\nþ\u0001\u0007Oôýû\u0019\u0099«£\u007f§ ô\u0018\u00ad%õ\u0018?¶:§wM±Ü\u009eÂ\u0002\u0082\u0086S?{~qá©ÑØº\u0090Í[\u0010Ö\u008b\\ß\u009aq\u0099z\f®W\u0082\u008d\u0097\u001b\u008f\u0010°?Y;\u00ad;L\b\u008d\ft\u0091ÉêÆ3\u0010\u00147\u0010\u001f?\u0082\u007f[âd8\u0014¸\u0018w|Pp»Ö\u0082QÕ¢ò\u0013EFNM±ëÅ\u0015ë\u0007«¥6\u0004ÞA·\u007f´òa|,6 M\u0093°_ÿc4·\f:ÌÚ,°ÉnÉ 7ò|ÈÄÙ6\u009c\u001e\n*ÄÆ\u0081±yK²Ý g\u001czúü-_WPÜ]ìþÊ\u0002ln+>Ýï\u0088\tî¨ë\u0097á\u009cùÚ\u0011â\u0001ôIPS::²,®ó\u008fÓ\u0010Ù·ðümß©KÇrú\u008aö\t²§Ö\u0010z\u0082\u0003\u0015²ØÓM¡·V\u0090\u0003õÁa<±goMæ¡I\u0010ÂÕ\u008en>\u009cÛ\u0002\u0012L4¸Âíã¯";
      int var7 = "âô5sÐDá½vûr\u0016Ó9\u0013\u0001\u0010d:ã·m& Ì\u0012B\u0018U¤îÅ\u0002\u0010{k\u0017z~\u008faz\u001a¼êöþf\u0016{8Ï\u0013Y$5Êzv2±k*!©Í\b²©ý\u0082¹zz\u009e\u0093¨Ô\u0098.¹\u009aU¶Èvó\u008b\u009e\u0083\u0084\u009c\r\u0086à\u0019¢è;\u0007èð\r\u000e\u0098<\u000b\u0010ÿJ¯\u0095}rÞ{`5Mu\u000f\u0088§\u000e\u0018ÿ[Z·Æ\u0016$RgÎ£\u00813Ïc·\u0017  -\u0007ea\u0081\u0018)\u009c%g+ã¡k»ô/VÂ«Aû\u009c\u009cÈ'ä'Ò÷\u0010¶¿W\u009fÏ\\¬^\u0018F*i¢§yUPZ\u0014ê_©3ÂF \u0080z\u009b\u0098nÎ8>\u0012$#\u008a4má\u001c?«\u0094|m(Y\u000e\u000eÂ³±)>Ç`\b\u008e£\u0003eæFXÀZº¹¦¥¯`[zÇõ¥]Ô\u009d`Zµ\u0087 \u0090wçõ\u009b\u0090ï5ÏT\u0010°W\u0011åI\u0088\u0006\u0014?¾QÖ\u0091ö\u0013s\u0010ñDó7\u0096wl&ÂÐ+ÈGú\u009dì`²Pù+\u0001a¦YÄ)À1\u0018O\"<!\u009dæáa0þ\u0091\u0090f¸ä²\u0080A\u007f£ps\u0083\u0080¾ð(\u000f\rÜ\u008fN²VØïi¶\u0098\u009a\tºg\u008c5\u0016ü½\u0017\u0081; È\u0098aÚ±ç¬Ðgk\u007fcRÕ  \u0097:(-Ôµ8ÇCö×\u0015°Dt8Ö\u001bt ¾\u0013³\u0097\u001de\u001a¥sO\u0007\u0089\u00174«¹[ÜÖÿ$Ú%ùµyØâda\u0014\u008a\u0084à°ÓB{\nþ\u0001\u0007Oôýû\u0019\u0099«£\u007f§ ô\u0018\u00ad%õ\u0018?¶:§wM±Ü\u009eÂ\u0002\u0082\u0086S?{~qá©ÑØº\u0090Í[\u0010Ö\u008b\\ß\u009aq\u0099z\f®W\u0082\u008d\u0097\u001b\u008f\u0010°?Y;\u00ad;L\b\u008d\ft\u0091ÉêÆ3\u0010\u00147\u0010\u001f?\u0082\u007f[âd8\u0014¸\u0018w|Pp»Ö\u0082QÕ¢ò\u0013EFNM±ëÅ\u0015ë\u0007«¥6\u0004ÞA·\u007f´òa|,6 M\u0093°_ÿc4·\f:ÌÚ,°ÉnÉ 7ò|ÈÄÙ6\u009c\u001e\n*ÄÆ\u0081±yK²Ý g\u001czúü-_WPÜ]ìþÊ\u0002ln+>Ýï\u0088\tî¨ë\u0097á\u009cùÚ\u0011â\u0001ôIPS::²,®ó\u008fÓ\u0010Ù·ðümß©KÇrú\u008aö\t²§Ö\u0010z\u0082\u0003\u0015²ØÓM¡·V\u0090\u0003õÁa<±goMæ¡I\u0010ÂÕ\u008en>\u009cÛ\u0002\u0012L4¸Âíã¯"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_017(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[22];
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

                  var6 = "\u0015\u0016\u009c\u0017å=Léßq\u0093¼¦Ãò&0üÌ\u0093Lj\u0092xÃ\u0000·Ì\u001a\u0081ôD\u000e\f×\u001d¥J¶\u0012{á0\u0001ß\u008a}ßÚüA·ÞÞ&Y\u0001u\u001d\u0087,Ó©\u0011O";
                  var7 = "\u0015\u0016\u009c\u0017å=Léßq\u0093¼¦Ãò&0üÌ\u0093Lj\u0092xÃ\u0000·Ì\u001a\u0081ôD\u000e\f×\u001d¥J¶\u0012{á0\u0001ß\u008a}ßÚüA·ÞÞ&Y\u0001u\u001d\u0087,Ó©\u0011O"
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_16(Throwable var0) {
      return var0;
   }

   private static String invoke_17(byte[] var0) {
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

   private static String invoke_18(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30389;
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
            throw new RuntimeException("rip/breeze/classtransform/ó", var10);
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
         CONST_C_2[var3] = method_017(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_19(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_018(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_20(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_019".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ó" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
