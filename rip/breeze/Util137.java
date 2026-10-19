package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.AimAssist;
import rip.breeze.client.AntiBot;
import rip.breeze.client.AntiFireball;
import rip.breeze.client.AntiInvis;
import rip.breeze.client.ArmorHUD;
import rip.breeze.client.AutoBlock;
import rip.breeze.client.AutoClicker;
import rip.breeze.client.AutoGG;
import rip.breeze.client.AutoHypixel;
import rip.breeze.client.AutoRod;
import rip.breeze.client.AutoTool;
import rip.breeze.client.BackTrack;
import rip.breeze.client.BedInfo;
import rip.breeze.client.BedNuker;
import rip.breeze.client.Blink;
import rip.breeze.client.BowAimModule;
import rip.breeze.client.BridgeAssist;
import rip.breeze.client.Chams;
import rip.breeze.client.ChestStealer;
import rip.breeze.client.Clutch;
import rip.breeze.client.ESPRenderer;
import rip.breeze.client.FastPlace;
import rip.breeze.client.FreeLook;
import rip.breeze.client.Freecam;
import rip.breeze.client.FullBright;
import rip.breeze.client.HitBoxes;
import rip.breeze.client.HitFX;
import rip.breeze.client.InventoryHUD;
import rip.breeze.client.InventoryManager;
import rip.breeze.client.KeepSprint;
import rip.breeze.client.KeyPressedEvent;
import rip.breeze.client.KillAura;
import rip.breeze.client.KnockbackDelay;
import rip.breeze.client.KnockbackManipulator;
import rip.breeze.client.LagAbuse;
import rip.breeze.client.MLG;
import rip.breeze.client.Minimap;
import rip.breeze.client.ModuleList;
import rip.breeze.client.NameTags;
import rip.breeze.client.NoHitDelay;
import rip.breeze.client.NoJumpDelay;
import rip.breeze.client.NoRender;
import rip.breeze.client.Notifications;
import rip.breeze.client.Parkour;
import rip.breeze.client.PingHUD;
import rip.breeze.client.PreTickEventEvent;
import rip.breeze.client.Radar;
import rip.breeze.client.Reach;
import rip.breeze.client.RightClicker;
import rip.breeze.client.ScaffoldInfo;
import rip.breeze.client.ScaffoldUtils;
import rip.breeze.client.Search;
import rip.breeze.client.SelfTrap;
import rip.breeze.client.ShaderESP;
import rip.breeze.client.SilentAim;
import rip.breeze.client.Sprint;
import rip.breeze.client.SprintReset;
import rip.breeze.client.TargetHUD;
import rip.breeze.client.ToggleUI;
import rip.breeze.client.Trajectories;
import rip.breeze.client.Velocity;
import rip.breeze.client.Wallhack;
import rip.breeze.client.WaterMark;

public final class Util137 implements ModuleBase {
   final Map<Class<? extends BreezeModule>, BreezeModule> map_a;
   final Map<String, BreezeModule> map_b;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public Util137() {
      long var1 = 9704464862259L;
      super();
      this.map_a = new HashMap<>();
      this.map_b = new TreeMap<>();
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(5493310631380358501L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var8 = var10000;
      Method var5 = var10003;

      try {
         var6 = (EnumType12)var5.invoke(var8, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (var6 != EnumType12.UNAUTHORIZED) {
         this.decrypt(new AimAssist());
         this.decrypt(new AntiBot());
         this.decrypt(new AntiFireball());
         this.decrypt(new AntiInvis());
         this.decrypt(new AutoBlock());
         this.decrypt(new AutoClicker());
         this.decrypt(new AutoGG());
         this.decrypt(new AutoRod());
         this.decrypt(new AutoTool());
         this.decrypt(new AutoHypixel());
         this.decrypt(new BackTrack());
         this.decrypt(new BedInfo());
         this.decrypt(new BedNuker());
         this.decrypt(new Blink());
         this.decrypt(new BowAimModule());
         this.decrypt(new BridgeAssist());
         this.decrypt(new Chams());
         this.decrypt(new ChestStealer());
         this.decrypt(new Clutch());
         this.decrypt(new ESPRenderer());
         this.decrypt(new FastPlace());
         this.decrypt(new Freecam());
         this.decrypt(new FreeLook());
         this.decrypt(new FullBright());
         this.decrypt(new HitBoxes());
         this.decrypt(new HitFX());
         this.decrypt(new InventoryManager());
         this.decrypt(new KeepSprint());
         this.decrypt(new MLG());
         this.decrypt(new KillAura());
         this.decrypt(new KnockbackDelay());
         this.decrypt(new KnockbackManipulator());
         this.decrypt(new LagAbuse());
         this.decrypt(new NameTags());
         this.decrypt(new NoHitDelay());
         this.decrypt(new NoJumpDelay());
         this.decrypt(new NoRender());
         this.decrypt(new Parkour());
         this.decrypt(new Radar());
         this.decrypt(new Reach());
         this.decrypt(new RightClicker());
         this.decrypt(new ScaffoldUtils());
         this.decrypt(new Search());
         this.decrypt(new SelfTrap());
         this.decrypt(new ShaderESP());
         this.decrypt(new SilentAim());
         this.decrypt(new Sprint());
         this.decrypt(new Trajectories());
         this.decrypt(new Velocity());
         this.decrypt(new Wallhack());
         this.decrypt(new SprintReset());
         this.decrypt(new ArmorHUD());
         this.decrypt(new InventoryHUD());
         this.decrypt(new Notifications());
         this.decrypt(new ScaffoldInfo());
         this.decrypt(new ModuleList());
         this.decrypt(new Minimap());
         this.decrypt(new PingHUD());
         this.decrypt(new TargetHUD());
         this.decrypt(new ToggleUI());
         this.decrypt(new WaterMark());
         var10001 = rip.breeze.client.MathUtil8.noArgs();
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(5486294073436532620L, var1);
         var10002 = var10001;
         Util137 var10 = this;
         Method var7 = var10003;

         try {
            var7.invoke(var10, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         EventBus.processAll(this);
      }
   }

   public String buildString(BreezeModule var1) {
      long var2 = 130936309058873L;
      ModuleInfo var4 = var1.getClass().getAnnotation(ModuleInfo.class);

      try {
         if (var4 == null) {
            throw new IllegalStateException(String.format("Module %s has no info annotation.", var1));
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      return var4.name();
   }

   public String buildString_2(BreezeModule var1) {
      long var2 = 104452292869747L;
      ModuleInfo var4 = var1.getClass().getAnnotation(ModuleInfo.class);

      try {
         if (var4 == null) {
            throw new IllegalStateException(String.format("Module %s has no info annotation.", var1));
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      return var4.description();
   }

   public Set<String> getModuleNames(BreezeModule var1) {
      long var2 = 58871201802392L;
      ModuleInfo var4 = var1.getClass().getAnnotation(ModuleInfo.class);

      try {
         if (var4 == null) {
            throw new IllegalStateException(String.format("Module %s has no info annotation.", var1));
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(var4.tags())));
   }

   public Set<ModuleCategory> getModuleCategories(BreezeModule var1) {
      long var2 = 35306105494529L;
      ModuleInfo var4 = var1.getClass().getAnnotation(ModuleInfo.class);

      try {
         if (var4 == null) {
            throw new IllegalStateException(String.format("Module %s has no info annotation.", var1));
         }
      } catch (IllegalStateException var6) {
         throw getIllegalStateException(var6);
      }

      HashSet var5 = new HashSet<>(Arrays.asList(var4.categories()));
      var5.add(ModuleCategory.ALL);
      return Collections.unmodifiableSet(var5);
   }

   public <T extends BreezeModule> T getDataBuilder52(Class<T> var1) {
      return (T)this.map_a.get(var1);
   }

   public <T extends BreezeModule> T getDataBuilder52_2(String var1) {
      return (T)this.map_b.get(var1);
   }

   public Collection<BreezeModule> getCollection() {
      return Collections.unmodifiableCollection(this.map_b.values());
   }

   @EventListener(a = Priority.HIGHEST)
   public void processAll(KeyPressedEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/Util137.1124270155244L J
      // 003: ldc2_w 71148067782227
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 00b: astore 4
      // 00d: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 010: getfield net/minecraft/client/Minecraft.currentScreen Lnet/minecraft/client/gui/GuiScreen;
      // 013: ifnull 01b
      // 016: return
      // 017: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01a: athrow
      // 01b: aload 1
      // 01c: getfield rip/breeze/client/KeyPressedEvent.fieldBool_i Z
      // 01f: ifeq 027
      // 022: return
      // 023: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 026: athrow
      // 027: aload 0
      // 028: invokevirtual rip/breeze/Util137.getCollection ()Ljava/util/Collection;
      // 02b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 030: astore 5
      // 032: aload 5
      // 034: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 039: ifeq 13c
      // 03c: aload 5
      // 03e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 043: checkcast rip/breeze/BreezeModule
      // 046: astore 6
      // 048: aload 6
      // 04a: invokevirtual rip/breeze/BreezeModule.getKeyBind ()Lrip/breeze/KeyBind;
      // 04d: getstatic rip/breeze/KeyBind.CONST_G Lrip/breeze/KeyBind;
      // 050: invokevirtual rip/breeze/KeyBind.equals (Ljava/lang/Object;)Z
      // 053: ifeq 062
      // 056: aload 4
      // 058: ifnonnull 032
      // 05b: goto 062
      // 05e: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 061: athrow
      // 062: aload 6
      // 064: invokevirtual rip/breeze/BreezeModule.getKeyBind ()Lrip/breeze/KeyBind;
      // 067: getfield rip/breeze/KeyBind.int_aJ I
      // 06a: aload 1
      // 06b: getfield rip/breeze/client/KeyPressedEvent.fieldInt_h I
      // 06e: if_icmpeq 07d
      // 071: aload 4
      // 073: ifnonnull 032
      // 076: goto 07d
      // 079: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07c: athrow
      // 07d: aload 6
      // 07f: invokevirtual rip/breeze/BreezeModule.isValid_2 ()Z
      // 082: ifeq 0a0
      // 085: aload 6
      // 087: invokevirtual rip/breeze/BreezeModule.isValid ()Z
      // 08a: ifeq 0a0
      // 08d: goto 094
      // 090: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 093: athrow
      // 094: aload 4
      // 096: ifnonnull 032
      // 099: goto 0a0
      // 09c: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: aload 6
      // 0a2: invokevirtual rip/breeze/BreezeModule.processAll ()V
      // 0a5: aload 0
      // 0a6: ldc rip/breeze/client/Notifications
      // 0a8: invokevirtual rip/breeze/Util137.getDataBuilder52 (Ljava/lang/Class;)Lrip/breeze/BreezeModule;
      // 0ab: checkcast rip/breeze/client/Notifications
      // 0ae: astore 7
      // 0b0: aload 7
      // 0b2: invokevirtual rip/breeze/client/Notifications.checkCondition ()Z
      // 0b5: ifeq 137
      // 0b8: aload 7
      // 0ba: aload 6
      // 0bc: getfield rip/breeze/BreezeModule.moduleName Ljava/lang/String;
      // 0bf: new java/lang/StringBuilder
      // 0c2: dup
      // 0c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c6: sipush 24698
      // 0c9: ldc2_w 3763831794781230584
      // 0cc: lload 2
      // 0cd: lxor
      // 0ce: invokedynamic q (IJ)Ljava/lang/String; bsm=rip/breeze/Util137.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: aload 6
      // 0d8: invokevirtual rip/breeze/BreezeModule.isValid ()Z
      // 0db: ifeq 10c
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e4: athrow
      // 0e5: new java/lang/StringBuilder
      // 0e8: dup
      // 0e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ec: getstatic rip/breeze/RenderUtil18_x.GREEN Lrip/breeze/RenderUtil18_x;
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0f2: sipush 8609
      // 0f5: ldc2_w 1879817376669717536
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic q (IJ)Ljava/lang/String; bsm=rip/breeze/Util137.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 105: goto 12c
      // 108: invokestatic rip/breeze/Util137.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10b: athrow
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: getstatic rip/breeze/RenderUtil18_x.RED Lrip/breeze/RenderUtil18_x;
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 119: sipush 21607
      // 11c: ldc2_w 1296752820202316257
      // 11f: lload 2
      // 120: lxor
      // 121: invokedynamic q (IJ)Ljava/lang/String; bsm=rip/breeze/Util137.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 132: aload 6
      // 134: invokevirtual rip/breeze/client/Notifications.processAll_1 (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
      // 137: aload 4
      // 139: ifnonnull 032
      // 13c: getstatic rip/breeze/BreezeContext.dataBuilder15_j Lrip/breeze/AnimationTimer;
      // 13f: aload 1
      // 140: getfield rip/breeze/client/KeyPressedEvent.fieldInt_h I
      // 143: invokevirtual rip/breeze/AnimationTimer.processAll_4 (I)V
      // 146: return
      // try (6 -> 10): 10 java/lang/IllegalStateException
      // try (12 -> 16): 16 java/lang/IllegalStateException
      // try (29 -> 36): 37 java/lang/IllegalStateException
      // try (39 -> 47): 48 java/lang/IllegalStateException
      // try (50 -> 56): 57 java/lang/IllegalStateException
      // try (53 -> 61): 62 java/lang/IllegalStateException
      // try (71 -> 89): 90 java/lang/IllegalStateException
      // try (74 -> 105): 105 java/lang/IllegalStateException
   }

   @EventListener(a = Priority.HIGHEST)
   public void processAll_2(PreTickEventEvent var1) {
      long var2 = 110626040881180L;
      LicenseState[] var10000 = KeybindSettings.decrypt();
      Iterator var4 = this.getCollection().iterator();
      LicenseState[] var5 = var10000;

      while (var4.hasNext()) {
         BreezeModule var6 = (BreezeModule)var4.next();
         if (var6.isValid_2()) {
            try {
               if (!var6.isValid() && var5 != null) {
                  continue;
               }
            } catch (IllegalStateException var9) {
               throw getIllegalStateException(var9);
            }

            if (!var6.getKeyBind().checkCondition()) {
               var6.processAll();
               Notifications var7 = this.getDataBuilder52(Notifications.class);

               try {
                  if (var7.checkCondition()) {
                     var7.processAll_1(
                        var6.moduleName,
                        "Toggled " + RenderUtil18_x.RED + "off",
                        var6
                     );
                  }
               } catch (IllegalStateException var8) {
                  throw getIllegalStateException(var8);
               }
            }

            if (var5 == null) {
               break;
            }
         }
      }

      BreezeContext.dataBuilder15_j.processAll_5();
   }

   private void decrypt(BreezeModule var1) {
      this.map_a.put((Class<? extends BreezeModule>)var1.getClass(), var1);
      this.map_b.put(this.buildString(var1), var1);
   }

   static {
      long var0 = 62183663675247L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "\u0086\u0080Õ\u0083ä\u0097OcëçÊð\u0088Hü\u001aMm\u0093mÅ\f\u00adA4ÁêÍã\u0082â\u0002@\u0087å¡ü£u\u0085ïVp0¯ Ä\f\u0096wr¾5¸«-D\f\u000eXOd\u0004\u0089ÞìhS\u0010èS¥8q.-2³\u0002\u0096T=B÷<»Õ\u0003a|\u0080\u00019¯\u0003\u0092î\u0010\u0091\u0088\u007f³äìµg×À\u0099^\r\u009a\u0081\u00868º\u009aä°â\tû\u009dÑ¢\u0082¹.Öbt\n\u0088\u008fsmýá\u0095Ä?\u0093\u0006;^Ý\u0090EP\u008f·F\u0083\fM\u0099}.æò=Ý/vöQÃ\u0099Ý?\u009c\u0010\u0010OOúøó*\u0092Å\u0010æ\tO8\"+";
      int var7 = "\u0086\u0080Õ\u0083ä\u0097OcëçÊð\u0088Hü\u001aMm\u0093mÅ\f\u00adA4ÁêÍã\u0082â\u0002@\u0087å¡ü£u\u0085ïVp0¯ Ä\f\u0096wr¾5¸«-D\f\u000eXOd\u0004\u0089ÞìhS\u0010èS¥8q.-2³\u0002\u0096T=B÷<»Õ\u0003a|\u0080\u00019¯\u0003\u0092î\u0010\u0091\u0088\u007f³äìµg×À\u0099^\r\u009a\u0081\u00868º\u009aä°â\tû\u009dÑ¢\u0082¹.Öbt\n\u0088\u008fsmýá\u0095Ä?\u0093\u0006;^Ý\u0090EP\u008f·F\u0083\fM\u0099}.æò=Ý/vöQÃ\u0099Ý?\u009c\u0010\u0010OOúøó*\u0092Å\u0010æ\tO8\"+"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_E = var4;
                     CONST_F = new String[7];
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

                  var6 = "î\u001a¿)\u000e\u00ad2\u0082à$;ê,\u009c·\n\u0018Yb®õòý\u0099éH4ov\u009cJqÇ)>ï\r\u001e\u0005\u0087®";
                  var7 = "î\u001a¿)\u000e\u00ad2\u0082à$;ê,\u009c·\n\u0018Yb®õòý\u0099éH4ov\u009cJqÇ)>ï\r\u001e\u0005\u0087®".length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11835;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ag", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/ag" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
