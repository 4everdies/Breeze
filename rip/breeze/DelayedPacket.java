package rip.breeze;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
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

final class DelayedPacket implements HttpHandler {
   final MicrosoftAuth microsoftAuth_a;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   private DelayedPacket(MicrosoftAuth var1) {
      this.microsoftAuth_a = var1;
   }

   @Override
   public void handle(HttpExchange param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/DelayedPacket.104510457642823L J
      // 003: ldc2_w 88586012559946
      // 006: lxor
      // 007: lstore 2
      // 008: sipush 20856
      // 00b: ldc2_w 7775110979930319586
      // 00e: lload 2
      // 00f: lxor
      // 010: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: aload 1
      // 016: invokevirtual com/sun/net/httpserver/HttpExchange.getRequestMethod ()Ljava/lang/String;
      // 019: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 01c: ifne 038
      // 01f: aload 0
      // 020: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 023: aload 1
      // 024: sipush 405
      // 027: sipush 9298
      // 02a: ldc2_w 8436790996013916100
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 037: return
      // 038: aload 0
      // 039: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 03c: aload 1
      // 03d: invokevirtual com/sun/net/httpserver/HttpExchange.getRequestURI ()Ljava/net/URI;
      // 040: invokevirtual java/net/URI.getRawQuery ()Ljava/lang/String;
      // 043: invokestatic rip/breeze/MicrosoftAuth.parseQueryString (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;)Ljava/util/Map;
      // 046: astore 4
      // 048: aload 4
      // 04a: sipush 28462
      // 04d: ldc2_w 805581640218956987
      // 050: lload 2
      // 051: lxor
      // 052: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05c: checkcast java/lang/String
      // 05f: astore 5
      // 061: aload 0
      // 062: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 065: invokestatic rip/breeze/MicrosoftAuth.getString_w (Lrip/breeze/MicrosoftAuth;)Ljava/lang/String;
      // 068: ifnull 0a6
      // 06b: aload 5
      // 06d: ifnull 0a6
      // 070: goto 077
      // 073: invokestatic rip/breeze/DelayedPacket.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 0
      // 078: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 07b: invokestatic rip/breeze/MicrosoftAuth.getString_w (Lrip/breeze/MicrosoftAuth;)Ljava/lang/String;
      // 07e: aload 5
      // 080: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 083: ifne 0a6
      // 086: goto 08d
      // 089: invokestatic rip/breeze/DelayedPacket.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 091: aload 1
      // 092: sipush 400
      // 095: sipush 2044
      // 098: ldc2_w 8432318981992004712
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 0a5: return
      // 0a6: aload 4
      // 0a8: sipush 24150
      // 0ab: ldc2_w 5004287491021923782
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ba: checkcast java/lang/String
      // 0bd: astore 6
      // 0bf: aload 6
      // 0c1: ifnull 0d3
      // 0c4: aload 6
      // 0c6: invokevirtual java/lang/String.isEmpty ()Z
      // 0c9: ifeq 0ec
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/DelayedPacket.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 0d7: aload 1
      // 0d8: sipush 400
      // 0db: sipush 10556
      // 0de: ldc2_w 2096890863371424431
      // 0e1: lload 2
      // 0e2: lxor
      // 0e3: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 0eb: return
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 0f0: aload 6
      // 0f2: aload 0
      // 0f3: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 0f6: invokestatic rip/breeze/MicrosoftAuth.getString_8 (Lrip/breeze/MicrosoftAuth;)Ljava/lang/String;
      // 0f9: invokestatic rip/breeze/MicrosoftAuth.getBreezeUtil114_3 (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;Ljava/lang/String;)Lrip/breeze/Util11;
      // 0fc: astore 7
      // 0fe: aload 0
      // 0ff: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 102: aload 7
      // 104: getfield rip/breeze/Util11.string_a Ljava/lang/String;
      // 107: invokestatic rip/breeze/MicrosoftAuth.getBreezeUtil116_2 (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;)Lrip/breeze/Util13;
      // 10a: astore 8
      // 10c: aload 0
      // 10d: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 110: aload 8
      // 112: getfield rip/breeze/Util13.string_a Ljava/lang/String;
      // 115: invokestatic rip/breeze/MicrosoftAuth.getBreezeUtil117_2 (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;)Lrip/breeze/Util14;
      // 118: astore 9
      // 11a: aload 0
      // 11b: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 11e: aload 9
      // 120: getfield rip/breeze/Util14.string_a Ljava/lang/String;
      // 123: aload 8
      // 125: getfield rip/breeze/Util13.string_b Ljava/lang/String;
      // 128: invokestatic rip/breeze/MicrosoftAuth.getBreezeUtil113_2 (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;Ljava/lang/String;)Lrip/breeze/Util10;
      // 12b: astore 10
      // 12d: aload 0
      // 12e: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 131: aload 10
      // 133: getfield rip/breeze/Util10.string_a Ljava/lang/String;
      // 136: invokevirtual rip/breeze/MicrosoftAuth.getBreezeUtil115 (Ljava/lang/String;)Lrip/breeze/Util12;
      // 139: astore 11
      // 13b: aload 11
      // 13d: ifnonnull 15c
      // 140: aload 0
      // 141: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 144: aload 1
      // 145: sipush 200
      // 148: sipush 30537
      // 14b: ldc2_w 8165482654978755803
      // 14e: lload 2
      // 14f: lxor
      // 150: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokestatic rip/breeze/MicrosoftAuth.getString_9 (Ljava/lang/String;)Ljava/lang/String;
      // 158: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 15b: return
      // 15c: new rip/breeze/StringDecryptHelper4
      // 15f: dup
      // 160: invokespecial rip/breeze/StringDecryptHelper4.<init> ()V
      // 163: astore 12
      // 165: aload 12
      // 167: aload 11
      // 169: getfield rip/breeze/Util12.string_a Ljava/lang/String;
      // 16c: invokevirtual rip/breeze/StringDecryptHelper4.setString_a (Ljava/lang/String;)V
      // 16f: aload 12
      // 171: aload 11
      // 173: getfield rip/breeze/Util12.string_b Ljava/lang/String;
      // 176: invokevirtual rip/breeze/StringDecryptHelper4.setString_b (Ljava/lang/String;)V
      // 179: aload 12
      // 17b: aload 7
      // 17d: getfield rip/breeze/Util11.string_a Ljava/lang/String;
      // 180: invokevirtual rip/breeze/StringDecryptHelper4.setString_c (Ljava/lang/String;)V
      // 183: aload 12
      // 185: aload 7
      // 187: getfield rip/breeze/Util11.string_b Ljava/lang/String;
      // 18a: invokevirtual rip/breeze/StringDecryptHelper4.setString_d (Ljava/lang/String;)V
      // 18d: aload 12
      // 18f: aload 7
      // 191: getfield rip/breeze/Util11.fieldLong_c J
      // 194: invokestatic rip/breeze/MicrosoftAuth.getLong_2 (J)J
      // 197: invokevirtual rip/breeze/StringDecryptHelper4.setLong_e (J)V
      // 19a: aload 12
      // 19c: aload 8
      // 19e: getfield rip/breeze/Util13.string_a Ljava/lang/String;
      // 1a1: invokevirtual rip/breeze/StringDecryptHelper4.setString_f (Ljava/lang/String;)V
      // 1a4: aload 12
      // 1a6: aload 8
      // 1a8: getfield rip/breeze/Util13.string_b Ljava/lang/String;
      // 1ab: invokevirtual rip/breeze/StringDecryptHelper4.setString_g (Ljava/lang/String;)V
      // 1ae: aload 12
      // 1b0: aload 8
      // 1b2: getfield rip/breeze/Util13.fieldLong_c J
      // 1b5: invokevirtual rip/breeze/StringDecryptHelper4.setLong_h (J)V
      // 1b8: aload 12
      // 1ba: aload 9
      // 1bc: getfield rip/breeze/Util14.string_a Ljava/lang/String;
      // 1bf: invokevirtual rip/breeze/StringDecryptHelper4.setString_i (Ljava/lang/String;)V
      // 1c2: aload 12
      // 1c4: aload 9
      // 1c6: getfield rip/breeze/Util14.fieldLong_b J
      // 1c9: invokevirtual rip/breeze/StringDecryptHelper4.setLong_j (J)V
      // 1cc: aload 12
      // 1ce: aload 10
      // 1d0: getfield rip/breeze/Util10.string_a Ljava/lang/String;
      // 1d3: invokevirtual rip/breeze/StringDecryptHelper4.setString_k (Ljava/lang/String;)V
      // 1d6: aload 12
      // 1d8: aload 10
      // 1da: getfield rip/breeze/Util10.fieldLong_b J
      // 1dd: invokestatic rip/breeze/MicrosoftAuth.getLong_2 (J)J
      // 1e0: invokevirtual rip/breeze/StringDecryptHelper4.setLong_l (J)V
      // 1e3: aload 12
      // 1e5: bipush 1
      // 1e6: invokevirtual rip/breeze/StringDecryptHelper4.setBool_o (Z)V
      // 1e9: aload 12
      // 1eb: invokestatic java/lang/System.currentTimeMillis ()J
      // 1ee: invokevirtual rip/breeze/StringDecryptHelper4.setLong_n (J)V
      // 1f1: aload 0
      // 1f2: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 1f5: aload 12
      // 1f7: bipush 1
      // 1f8: invokestatic rip/breeze/MicrosoftAuth.update_6 (Lrip/breeze/MicrosoftAuth;Lrip/breeze/StringDecryptHelper4;Z)V
      // 1fb: aload 0
      // 1fc: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 1ff: aload 1
      // 200: sipush 200
      // 203: sipush 7220
      // 206: ldc2_w 7139945836552595363
      // 209: lload 2
      // 20a: lxor
      // 20b: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: invokestatic rip/breeze/MicrosoftAuth.getString_9 (Ljava/lang/String;)Ljava/lang/String;
      // 213: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 216: goto 25c
      // 219: astore 4
      // 21b: aload 0
      // 21c: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 21f: new java/lang/StringBuilder
      // 222: dup
      // 223: invokespecial java/lang/StringBuilder.<init> ()V
      // 226: sipush 32736
      // 229: ldc2_w 6218143826181309563
      // 22c: lload 2
      // 22d: lxor
      // 22e: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: aload 4
      // 238: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 241: invokestatic rip/breeze/MicrosoftAuth.update_4 (Lrip/breeze/MicrosoftAuth;Ljava/lang/String;)V
      // 244: aload 0
      // 245: getfield rip/breeze/DelayedPacket.microsoftAuth_a Lrip/breeze/MicrosoftAuth;
      // 248: aload 1
      // 249: sipush 500
      // 24c: sipush 32177
      // 24f: ldc2_w 6488336168129644064
      // 252: lload 2
      // 253: lxor
      // 254: invokedynamic o (IJ)Ljava/lang/String; bsm=rip/breeze/DelayedPacket.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: invokestatic rip/breeze/MicrosoftAuth.handleHttpExchange (Lrip/breeze/MicrosoftAuth;Lcom/sun/net/httpserver/HttpExchange;ILjava/lang/String;)V
      // 25c: return
      // try (4 -> 23): 222 java/lang/Throwable
      // try (44 -> 55): 56 java/lang/Throwable
      // try (40 -> 46): 47 java/lang/Throwable
      // try (24 -> 68): 222 java/lang/Throwable
      // try (78 -> 83): 84 java/lang/Throwable
      // try (69 -> 96): 222 java/lang/Throwable
      // try (97 -> 144): 222 java/lang/Throwable
      // try (145 -> 221): 222 java/lang/Throwable
   }

   DelayedPacket(MicrosoftAuth var1, BreezeTask var2) {
      this(var1);
   }

   static {
      long var0 = 26504148690471L;
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
      String var6 = "\u008f±V´\u0094ÀüS\u0086\u0083¾ÁÔ'ölkµ>ï\u0087{î;P_Ky{'\u009eë06Ê0\u0082\u000eO\"\u0090\u0092ÌWÃº¨¤\u009aÒû}×[\u009cr\nlk6Å\u0015ã\u001a\u0004±Õ¬O¶Ù\u0001>¬Ï\u0098\u008d\u0083-Á·¢\f/í±÷ÞºØMÔã4 \u0005\u0081åÑàâ3ÒÖ\u0088 \u0010Vm©\u0090w@¬\n<:2Óp\u0091å{õ§\u000e\u008aUíl\u008b~Svôw\u0086I\u0010é>H[w&\u0090\u0093Ç¹\u0004Ý\u0012S\u009b5PÖhÞ25(\u0086¢µÓ\u0018CA·\u0090áiÆõhû»\u0005À<\u0084uµÓ\u001d\u009e|G\u0083RÝR±q®\u0082æ\u008b\u0015BÊÈn\u0000É\u000f¸[ %¡ØÈúþ7.nE\u0099jë'qØ\u000bEB\u0010B1yL\u009f8(±\u001bÎ\u0081\f\u009b\u0081\u0002(Ú¨¹\u0002ú\n3°¡ø\u0098+ù\u00811³¡>#\u0002\u0007íÆðEi_\t\u0001\u0017Ú\u0010sBàÔB\"ê¯\u008f¦Ò)\u001cãgÉ \\\u0095à}\u000eSÚqî,,\u0013cE\u0080\u00adU\u0013£\n¤@æ\u008bðÃ\u0018)Ë£Û¹";
      int var7 = "\u008f±V´\u0094ÀüS\u0086\u0083¾ÁÔ'ölkµ>ï\u0087{î;P_Ky{'\u009eë06Ê0\u0082\u000eO\"\u0090\u0092ÌWÃº¨¤\u009aÒû}×[\u009cr\nlk6Å\u0015ã\u001a\u0004±Õ¬O¶Ù\u0001>¬Ï\u0098\u008d\u0083-Á·¢\f/í±÷ÞºØMÔã4 \u0005\u0081åÑàâ3ÒÖ\u0088 \u0010Vm©\u0090w@¬\n<:2Óp\u0091å{õ§\u000e\u008aUíl\u008b~Svôw\u0086I\u0010é>H[w&\u0090\u0093Ç¹\u0004Ý\u0012S\u009b5PÖhÞ25(\u0086¢µÓ\u0018CA·\u0090áiÆõhû»\u0005À<\u0084uµÓ\u001d\u009e|G\u0083RÝR±q®\u0082æ\u008b\u0015BÊÈn\u0000É\u000f¸[ %¡ØÈúþ7.nE\u0099jë'qØ\u000bEB\u0010B1yL\u009f8(±\u001bÎ\u0081\f\u009b\u0081\u0002(Ú¨¹\u0002ú\n3°¡ø\u0098+ù\u00811³¡>#\u0002\u0007íÆðEi_\t\u0001\u0017Ú\u0010sBàÔB\"ê¯\u008f¦Ò)\u001cãgÉ \\\u0095à}\u000eSÚqî,,\u0013cE\u0080\u00adU\u0013£\n¤@æ\u008bðÃ\u0018)Ë£Û¹"
         .length();
      char var8 = 24;
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
                     CONST_C = var4;
                     CONST_D = new String[10];
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

                  var6 = "\u009ev\rèÝÒ]Ð\u0089&é\u008f\u008d0#\u007f{\u009cÄ\u008eñåÈ¥@ÓÕ3G+\u0012îð7\u00849\u001d^\u0094u\u0010ÉÄ'\"]Ü\u008bTz¢$'\u0011gèð";
                  var7 = "\u009ev\rèÝÒ]Ð\u0089&é\u008f\u008d0#\u007f{\u009cÄ\u008eñåÈ¥@ÓÕ3G+\u0012îð7\u00849\u001d^\u0094u\u0010ÉÄ'\"]Ü\u008bTz¢$'\u0011gèð"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20126;
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
            throw new RuntimeException("rip/breeze/ap", var10);
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
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/ap" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
