package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "Setting", group = "breeze/settings")
public abstract class Setting<T> extends Util135 {
   protected final GenericSetting<T> dataBuilder54_i;
   protected final ImageUtil15 dataBuilder17_j;
   private Function function_k;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_V = new HashMap(13);

   protected Setting(GenericSetting<T> var1, ImageUtil15 var2) {
      this.dataBuilder54_i = var1;
      this.dataBuilder17_j = var2;
   }

   protected Setting(BlockUtil10<T> var1) {
      long var2 = 134209608556405L;
      super();
      this.dataBuilder54_i = var1.getDataBuilder50_9(this::checkCondition).getDataBuilder54();
      this.dataBuilder17_j = BreezeContext.dataBuilder15_j.getDataBuilder17_f();
      if (this.dataBuilder17_j == null) {
         throw Context.reportRuntimeError("You can only register settings while initializing the script.");
      }
   }

   @JSFunction(
      value = "visible",
      description = "You can use this to hide settings temporarily depending on the user config.\nThe callback should return a boolean.",
      params = "The function to determine if the setting should be visible or not.",
      example = "const delay = new IntSetting(\"Delay\", \"The amount of ticks to wait in between attacks.\", false);\n\ndelay.visible(() => {\n\treturn someOtherSetting.getValue()\n});"
   )
   public void processNullable(Function var1) {
      long var2 = 73955052778423L;

      try {
         if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() == null) {
            throw Context.reportRuntimeError("You can only register visible callbacks while initializing the script.");
         }
      } catch (RhinoException var5) {
         throw getRhinoException(var5);
      }

      try {
         if (this.dataBuilder17_j != BreezeContext.dataBuilder15_j.getDataBuilder17_f()) {
            throw Context.reportRuntimeError("You can only register visible callbacks for settings that belong to this script.");
         }
      } catch (RhinoException var7) {
         throw getRhinoException(var7);
      }

      try {
         if (this.function_k != null) {
            throw Context.reportRuntimeError("You can only register one visible function.");
         }
      } catch (RhinoException var4) {
         throw getRhinoException(var4);
      }

      try {
         if (!(var1 instanceof ArrowFunction)) {
            throw Context.reportRuntimeError("Visible function must be an arrow function.");
         }
      } catch (RhinoException var6) {
         throw getRhinoException(var6);
      }

      this.function_k = var1;
   }

   @JSFunction(value = "name", returns = "The name of the setting.")
   public String getString() {
      return this.dataBuilder54_i.string_b;
   }

   @JSFunction(value = "description", returns = "The description of the setting.")
   public String getString_2() {
      return this.dataBuilder54_i.string_c;
   }

   protected boolean checkCondition(DateUtil var1) {
      long var2 = 109267522239282L;

      try {
         if (this.function_k == null) {
            return true;
         }
      } catch (RhinoException var7) {
         throw getRhinoException(var7);
      }

      try {
         Object var4 = this.function_k.call(this.dataBuilder17_j.context_x, this.dataBuilder17_j.scriptable_y, null, new Object[0]);

         try {
            if (!(var4 instanceof Boolean)) {
               throw Context.reportRuntimeError("Visible function must return a boolean.");
            }
         } catch (RhinoException var5) {
            throw getRhinoException(var5);
         }

         return (Boolean)var4;
      } catch (RhinoException var6) {
         this.dataBuilder17_j.processAll_9(var6);
         return true;
      }
   }

   protected static DateUtil getDataBuilder51(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/Setting.51793861580601L J
      // 03: ldc2_w 88437469976179
      // 06: lxor
      // 07: lstore 1
      // 08: getstatic rip/breeze/BreezeContext.dataBuilder15_j Lrip/breeze/AnimationTimer;
      // 0b: invokevirtual rip/breeze/AnimationTimer.getDataBuilder17_f ()Lrip/breeze/ImageUtil15;
      // 0e: astore 3
      // 0f: aload 3
      // 10: ifnonnull 28
      // 13: sipush 25111
      // 16: ldc2_w 3669922011574712245
      // 19: lload 1
      // 1a: lxor
      // 1b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/Setting.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 23: athrow
      // 24: invokestatic rip/breeze/Setting.getRhinoException (Lorg/mozilla/javascript/RhinoException;)Lorg/mozilla/javascript/RhinoException;
      // 27: athrow
      // 28: aload 0
      // 29: instanceof rip/breeze/ImageUtil15
      // 2c: ifeq 59
      // 2f: aload 0
      // 30: aload 3
      // 31: if_acmpeq 50
      // 34: goto 3b
      // 37: invokestatic rip/breeze/Setting.getRhinoException (Lorg/mozilla/javascript/RhinoException;)Lorg/mozilla/javascript/RhinoException;
      // 3a: athrow
      // 3b: sipush 16909
      // 3e: ldc2_w 3453126834880649123
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/Setting.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 4b: athrow
      // 4c: invokestatic rip/breeze/Setting.getRhinoException (Lorg/mozilla/javascript/RhinoException;)Lorg/mozilla/javascript/RhinoException;
      // 4f: athrow
      // 50: aload 3
      // 51: getfield rip/breeze/ImageUtil15.dataBuilder51_k Lrip/breeze/DateUtil;
      // 54: astore 4
      // 56: goto b4
      // 59: aload 0
      // 5a: instanceof rip/breeze/SubGroup
      // 5d: ifeq a3
      // 60: aload 0
      // 61: checkcast rip/breeze/SubGroup
      // 64: getfield rip/breeze/SubGroup.dataBuilder53_i Lrip/breeze/ConditionsSetting;
      // 67: astore 4
      // 69: aload 4
      // 6b: astore 5
      // 6d: aload 5
      // 6f: instanceof rip/breeze/ConditionsSetting
      // 72: ifeq 82
      // 75: aload 5
      // 77: checkcast rip/breeze/ConditionsSetting
      // 7a: getfield rip/breeze/ConditionsSetting.dataBuilder51_d Lrip/breeze/DateUtil;
      // 7d: astore 5
      // 7f: goto 6d
      // 82: aload 5
      // 84: aload 3
      // 85: getfield rip/breeze/ImageUtil15.dataBuilder51_k Lrip/breeze/DateUtil;
      // 88: if_acmpeq a0
      // 8b: sipush 31101
      // 8e: ldc2_w 1387690181656521950
      // 91: lload 1
      // 92: lxor
      // 93: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/Setting.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 9b: athrow
      // 9c: invokestatic rip/breeze/Setting.getRhinoException (Lorg/mozilla/javascript/RhinoException;)Lorg/mozilla/javascript/RhinoException;
      // 9f: athrow
      // a0: goto b4
      // a3: sipush 5412
      // a6: ldc2_w 3502553576483504270
      // a9: lload 1
      // aa: lxor
      // ab: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/Setting.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // b3: athrow
      // b4: aload 4
      // b6: areturn
      // try (7 -> 16): 16 org/mozilla/javascript/RhinoException
      // try (18 -> 24): 25 org/mozilla/javascript/RhinoException
      // try (21 -> 34): 34 org/mozilla/javascript/RhinoException
      // try (57 -> 68): 68 org/mozilla/javascript/RhinoException
   }

   static {
      long var0 = 47642975764625L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "\u0002´\bj·S[\u0015oÝIJONÚ\u008b\u001f©\u000f¦\u000f+K=R,\u0083å¢\u001b|±B\u0001Ù!\u008aÛ\u0096\u0090F\u0018ÄÖÑèEë\u0088\u001dÓ.µ\u001f@¹c&Zûû×\u0088]=Ì)ejúX~\u001b\u009c^\u001cÐ1\u008d&NÕg±ê\u0090\u001c1Ì\u001d Ö&\r\u008d\u0098\u0083\u0094\u001d×C¶0\u000eh\u000eÊ\u001c9.~\u00031c\u009a\u0081 ÆyÏÜ8û\u0003q\u008eÿ\u0012@\u0003-\u0014D-®Ìjÿ}ÈBÎà\u0016\\Ñ\u0084s]\u0083\nvà×MÔ\u0092\u009d\nÃ}wÊµ8»]\u00937,\u0000\u0086èðgÚijIlø!Ã\u009díò>,ÖY\u0091\r?x\r=t×pÚ\u009e5¤Ói«¤ÎaÃ\u007fé6¹.Ø_;\u0099\u0019G\u0001â*\b\t?]'ú\u0004º,þÊ÷^\u008a>\u0092·Ê¿k1²Iò£?÷\u0013~ËÙ\u000e \u000bë\u001fHXDð\u0088\u0002¤L\u0010}\u0013÷\u000b¾\u009f\u0010I\u0098Q\u0085\u0013\u000fç\u0002\"ø*ÝkB RËb\u0006ê\n0Éo\u0006Yq3\u0013«hM«E\u0083£\"ûHáÞÃ\u0018i\u001aÝ\u0081ÒÑ\r0Õª\u0093üÚ>\u008bUþ\u0003\nÇu\u0086$\u0082\"@¦ª\u0016@ÃæÿµÝ\"\u0086²Æ#\tL\u0086\u0018ó%$\u0083\u008d©ì\u009f\u0006\u0081âé\u000e\u00adÚÏy\u0098Átÿ\u0013\u0015\u0088p¿5`áÂC7â¹ElHø2Mª\u0014Dð\fÓóò¿#ù6\u000e\u0089cG\u0019¡Å¸±¸\u0001\\\u0005+\u001cñýÜ\u008b×¦íN®Ýg\u001aÊìúÔ\u009f\u0018p,ìÅZ\u0000»\u009ai\u0018e\u0019*=\u008c\r2ötÖ\u0017VÉÑã3\u00168\u00ad\u008fñÄR\u009e4ß\u0096\u0090#}Iñ\\\u0012±¡\u0092\u0003?õ\u0098\u000b`vòß(SP¶í\u009e\u0001\u00931Æ\u0086h1\u0093ê\u0086áâoº6\u001cÝ\u0006Î´}@á+àª¨¿@\u0006V%ý\b\u0089J\u0018ß½úä\u008eVërÀO°\u009d\u0014Úb3m}álC\u0090õ\u009cÓ\u0087\u0013eÜ\tR\u008e\u0015¦¶Ìº\u0089\u001c.;\u001cøm\u0003\u0005à×\u001d\u0018P\nvª<{o}Ç´Z\u0087/¥\fxòÑ{UÜþ^$)2³\u0092Ãm -¿\u0010\u009e+b\u00adëÚ\u00050ZÒ\b\u0013¹\u0016*9\u008d\u000fh:ªì\u0082\"û¼î\u0016\"Ò\u000b^ÜsS&K2ø\u0086\u008e\u0004\u0012mÓ6a\u0088\"Kéi\u0088sHÛÙÖ\u001d©þ\u0000t\u0005æ\u008b\u008a\u008c|·ZÜ\u0090\u009cK\u008fKL\u008f¥\u0096#ÍË\u000edµ>\u0015IO<\u001a]õx\u001fÁêòX,÷·¸t»\u001fj\u007f\u008atD\u0010dÓk{u\u0001\u009d_¥Í\u0019{@¤\u0090\u0001Í\u0080ü\u008cÓT>n\u0087Bµºøà¢\u0004\u008bµ\u0099ÞHþ\u0007ö®çÐ)\u00011Þ\u008b\u0090ëre\u008a\u0094\u0014\u0006!,k~ä\u00066\u0004ùÍ\u009fq/Ñ";
      int var7 = "\u0002´\bj·S[\u0015oÝIJONÚ\u008b\u001f©\u000f¦\u000f+K=R,\u0083å¢\u001b|±B\u0001Ù!\u008aÛ\u0096\u0090F\u0018ÄÖÑèEë\u0088\u001dÓ.µ\u001f@¹c&Zûû×\u0088]=Ì)ejúX~\u001b\u009c^\u001cÐ1\u008d&NÕg±ê\u0090\u001c1Ì\u001d Ö&\r\u008d\u0098\u0083\u0094\u001d×C¶0\u000eh\u000eÊ\u001c9.~\u00031c\u009a\u0081 ÆyÏÜ8û\u0003q\u008eÿ\u0012@\u0003-\u0014D-®Ìjÿ}ÈBÎà\u0016\\Ñ\u0084s]\u0083\nvà×MÔ\u0092\u009d\nÃ}wÊµ8»]\u00937,\u0000\u0086èðgÚijIlø!Ã\u009díò>,ÖY\u0091\r?x\r=t×pÚ\u009e5¤Ói«¤ÎaÃ\u007fé6¹.Ø_;\u0099\u0019G\u0001â*\b\t?]'ú\u0004º,þÊ÷^\u008a>\u0092·Ê¿k1²Iò£?÷\u0013~ËÙ\u000e \u000bë\u001fHXDð\u0088\u0002¤L\u0010}\u0013÷\u000b¾\u009f\u0010I\u0098Q\u0085\u0013\u000fç\u0002\"ø*ÝkB RËb\u0006ê\n0Éo\u0006Yq3\u0013«hM«E\u0083£\"ûHáÞÃ\u0018i\u001aÝ\u0081ÒÑ\r0Õª\u0093üÚ>\u008bUþ\u0003\nÇu\u0086$\u0082\"@¦ª\u0016@ÃæÿµÝ\"\u0086²Æ#\tL\u0086\u0018ó%$\u0083\u008d©ì\u009f\u0006\u0081âé\u000e\u00adÚÏy\u0098Átÿ\u0013\u0015\u0088p¿5`áÂC7â¹ElHø2Mª\u0014Dð\fÓóò¿#ù6\u000e\u0089cG\u0019¡Å¸±¸\u0001\\\u0005+\u001cñýÜ\u008b×¦íN®Ýg\u001aÊìúÔ\u009f\u0018p,ìÅZ\u0000»\u009ai\u0018e\u0019*=\u008c\r2ötÖ\u0017VÉÑã3\u00168\u00ad\u008fñÄR\u009e4ß\u0096\u0090#}Iñ\\\u0012±¡\u0092\u0003?õ\u0098\u000b`vòß(SP¶í\u009e\u0001\u00931Æ\u0086h1\u0093ê\u0086áâoº6\u001cÝ\u0006Î´}@á+àª¨¿@\u0006V%ý\b\u0089J\u0018ß½úä\u008eVërÀO°\u009d\u0014Úb3m}álC\u0090õ\u009cÓ\u0087\u0013eÜ\tR\u008e\u0015¦¶Ìº\u0089\u001c.;\u001cøm\u0003\u0005à×\u001d\u0018P\nvª<{o}Ç´Z\u0087/¥\fxòÑ{UÜþ^$)2³\u0092Ãm -¿\u0010\u009e+b\u00adëÚ\u00050ZÒ\b\u0013¹\u0016*9\u008d\u000fh:ªì\u0082\"û¼î\u0016\"Ò\u000b^ÜsS&K2ø\u0086\u008e\u0004\u0012mÓ6a\u0088\"Kéi\u0088sHÛÙÖ\u001d©þ\u0000t\u0005æ\u008b\u008a\u008c|·ZÜ\u0090\u009cK\u008fKL\u008f¥\u0096#ÍË\u000edµ>\u0015IO<\u001a]õx\u001fÁêòX,÷·¸t»\u001fj\u007f\u008atD\u0010dÓk{u\u0001\u009d_¥Í\u0019{@¤\u0090\u0001Í\u0080ü\u008cÓT>n\u0087Bµºøà¢\u0004\u008bµ\u0099ÞHþ\u0007ö®çÐ)\u00011Þ\u008b\u0090ëre\u008a\u0094\u0014\u0006!,k~ä\u00066\u0004ùÍ\u009fq/Ñ"
         .length();
      char var8 = 128;
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
                     CONST_Q = var4;
                     CONST_R = new String[10];
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

                  var6 = "f\u008f`!ß\u0019`\u0013\u008c³\u009a½d2\u009d4_\u0097\u0013#½°aÏ\t¯·\u0084\u0099¤§\u008a+\u0099Ù¾÷Þi êÓ\u0091\bk\u009b°|>ï0~¸ \u008dU\u009b\u0010ò¥§×\u009ezÂjº\u008cåÜ\u0084g\u0019ZlÛ«+ò®\u0091µ ¶\u0014þâ¤\u0093h\u0085Ü\u008cAd~x¹\u0013\u0094ù\u000fÊYï6ä!Å\u009eÂ\u0089Ë\u008d~+\u009d#\u0082¡zÕ\u008d§¼v Ô\u0096þàâj;^t\u008f@\u001fåTãï\u009es\u0016Ú0o+.V,-x\u0089³t\u001aÈs'»L\u001bô(±ï;0t\u0095\u0007³\"\u0019â{ãÃQ~4\u0010M|Óº\u008d\u0012Êg^é\u0004*Æ\u009dòì7B£\u000eJ\u0080;\u001fÄ·²\u0000{Ô/+";
                  var7 = "f\u008f`!ß\u0019`\u0013\u008c³\u009a½d2\u009d4_\u0097\u0013#½°aÏ\t¯·\u0084\u0099¤§\u008a+\u0099Ù¾÷Þi êÓ\u0091\bk\u009b°|>ï0~¸ \u008dU\u009b\u0010ò¥§×\u009ezÂjº\u008cåÜ\u0084g\u0019ZlÛ«+ò®\u0091µ ¶\u0014þâ¤\u0093h\u0085Ü\u008cAd~x¹\u0013\u0094ù\u000fÊYï6ä!Å\u009eÂ\u0089Ë\u008d~+\u009d#\u0082¡zÕ\u008d§¼v Ô\u0096þàâj;^t\u008f@\u001fåTãï\u009es\u0016Ú0o+.V,-x\u0089³t\u001aÈs'»L\u001bô(±ï;0t\u0095\u0007³\"\u0019â{ãÃQ~4\u0010M|Óº\u008d\u0012Êg^é\u0004*Æ\u009dòì7B£\u000eJ\u0080;\u001fÄ·²\u0000{Ô/+"
                     .length();
                  var8 = '`';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static RhinoException getRhinoException(RhinoException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21728;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_V.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_V.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aX", var10);
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
         throw new RuntimeException("rip/breeze/aX" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
