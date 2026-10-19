package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

class StringBuilderUtil {
   private final StringBuilder stringBuilder_a = new StringBuilder();
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   void update(String var1, int var2, long var3) {
      var3 = 20723581065291L ^ var3;
      this.stringBuilder_a
         .append(buildString_2(12962, 475674337782016199L ^ var3))
         .append(var2)
         .append(buildString_2(32485, 3999120071091577990L ^ var3))
         .append(var1)
         .append("]");
   }

   public void update_1(long var1, String var3, AtomicInteger var4) {
      var1 = 20723581065291L ^ var1;
      this.stringBuilder_a
         .append(buildString_2(16446, 1777341616311077063L ^ var1))
         .append(var4.get())
         .append(buildString_2(17526, 5226585322864675978L ^ var1))
         .append(var3)
         .append("]");
   }

   public void update_2(int var1, int var2, String var3, AtomicInteger var4, byte var5) {
      long var6 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var5 << 56 >>> 56) ^ 20723581065291L;
      this.stringBuilder_a
         .append(buildString_2(16880, 5040199405322365574L ^ var6))
         .append(var4.get())
         .append(buildString_2(18834, 697805778768126707L ^ var6))
         .append(var3);
   }

   void update_3(String var1, long var2, int var4) {
      var2 = 20723581065291L ^ var2;
      this.stringBuilder_a.append(buildString_2(31730, 8794609923894203693L ^ var2)).append(var1);
   }

   void update_4(String var1, long var2, int var4) {
      var2 = 20723581065291L ^ var2;
      this.stringBuilder_a
         .append(buildString_2(12, 1653662943994996765L ^ var2))
         .append(var4)
         .append(buildString_2(18834, 697781161434784159L ^ var2))
         .append(var1)
         .append("]");
   }

   void update_5(String var1, long var2, int var4) {
      var2 = 20723581065291L ^ var2;
      this.stringBuilder_a.append(buildString_2(10750, 8589638486460187890L ^ var2));
      if (var4 > -1) {
         this.stringBuilder_a.append(buildString_2(21638, 3924648904766110088L ^ var2)).append(var4);
      }

      this.stringBuilder_a.append(buildString_2(18834, 697875656094229636L ^ var2)).append(var1);
   }

   void update_6(long var1, Util137 var3, char var4, int var5) {
      var1 = 20723581065291L ^ var1;
      this.stringBuilder_a
         .append(buildString_2(29606, 4313829050723051398L ^ var1))
         .append(var3.getString_b())
         .append(buildString_2(30040, 3985565646550770044L ^ var1))
         .append(var5)
         .append(buildString_2(28608, 2333826756184685561L ^ var1));
   }

   void update_7(String var1, int var2, long var3) {
      var3 = 20723581065291L ^ var3;
      this.stringBuilder_a
         .append(buildString_2(10328, 1662607220832344945L ^ var3))
         .append(var2)
         .append(buildString_2(18834, 697866149271468717L ^ var3))
         .append(var1);
   }

   void update_8(String var1, long var2, int var4, char var5) {
      long var6 = (var2 << 16 | (long)var5 << 48 >>> 48) ^ 20723581065291L;
      this.stringBuilder_a
         .append(buildString_2(23771, 6690220511829016262L ^ var6))
         .append(var4)
         .append(buildString_2(18834, 697900197833550738L ^ var6))
         .append(var1);
   }

   void update_9(int var1, String var2, String var3, int var4, byte var5, int var6) {
      long var7 = ((long)var1 << 32 | (long)var4 << 40 >>> 32 | (long)var5 << 56 >>> 56) ^ 20723581065291L;
      this.stringBuilder_a
         .append(buildString_2(13383, 1123808679850305970L ^ var7))
         .append(var6)
         .append(buildString_2(10100, 3223374969767590532L ^ var7))
         .append(var2)
         .append(buildString_2(14835, 8595885630448133150L ^ var7))
         .append(var3);
   }

   void update_10(String var1, int var2, long var3) {
      var3 = 20723581065291L ^ var3;
      this.stringBuilder_a
         .append(buildString_2(27655, 8723466561302029640L ^ var3))
         .append(var2)
         .append(buildString_2(18834, 697862827153703119L ^ var3))
         .append(var1);
   }

   void update_11(String var1, int var2, short var3, int var4, String var5, int var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ 20723581065291L;
      this.stringBuilder_a
         .append(buildString_2(19167, 6553773888990878790L ^ var7))
         .append(var6)
         .append(buildString_2(18834, 697862263463452442L ^ var7))
         .append(var1)
         .append(buildString_2(12138, 6202280023475681782L ^ var7))
         .append(var5.trim());
   }

   public void update_12(String var1, int var2, long var3) {
      var3 = 20723581065291L ^ var3;
      this.stringBuilder_a.append(var1).append(buildString_2(22764, 1567669023462471617L ^ var3)).append(var2);
   }

   boolean isValid(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 20723581065291L;
      return this.stringBuilder_a.length() > 0;
   }

   @Override
   public String toString() {
      return this.stringBuilder_a.toString();
   }

   public void initialize(StringBuilderUtil var1) {
      this.stringBuilder_a.append(var1.stringBuilder_a);
   }

   static {
      long var0 = 128233032828723L;
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
      String var6 = "ª,¹Äü\f½8Mÿ\u0089\u00ad=çðç^Ý\u0096ÞjÀ* £\u000eß×Z-SN\u008a$GöÌîÕlÁÂmö\u0096¶Øhuh¼³GþH\u001f\u0010^Â_¡?êªQf«X(ÏôÒR@¤\u009f9}»@ç\u0085<b/\u008c'ýÇþqiQ\u0004t3knÅ7;\u0097T4<y\u0019\u0084H\u001e\u0003\u0091ä\u0090\u0082+l\u001a\u0006Íj«\u001d\u0013xsVõ\u000eTtD³uüì®¢HCRf#?Ý\u0014+J+Â¥ýÒ\u0082ú\n\u0080\u009fÆ\u008d\\ã\u0000\u001eà8<÷°#Ó\u009e\u0096Æ\u0005h\bÆÁ]½õ0\u0097¦òã\\;'\u0092É§(¹ôÛ¤aJyrýpG\u008d²ò\f¤ÝHñ»¬§\rCÃ7ø\u0092×BÌ«¶Ü?æ¾à0\fS\u0017LÄ=.ôy\u0096\u0013iTÛ=ÜõácÔg\u0084ËKVÅlOä»\u009f2^ê¥aF\u0000mãKt\u001bv\u001cr\"6\u0085@\"\u0010\u001cÊRï&:´ÚÄ`XÉn9\u001eÆP8\u00167°\u001dRÑ¬77É\u0018\u0089Åtr\u0015Li\u0088Cq\u0001*§ö\u009f¼E\u0014ÆûM\u0003\u0006ç\u008cu\u0091åAâÁ;?\u0018\bZG:\u009e¥\u0016sû\u0012u\u0013\u009bKÆÆu\u008dÏ\u000b7d\u0011\u0095¼Q\u0084MzÙÂ³=°(ËÉ:m\u0012\u0002+¹áËe¹$Ð\u0012uÛ;\u001bËú]Ãð°ç\u0018kª\t:\u0094ô\u0094\u009dv×\u0093\u0085±\u0010ü\u0007\u009c\u0017\u008eô1;\u0017\u001b´Zï\tð\u001f \u008e¬iißÜ$çúÛ\u0002\u0099¥¦)hó\u001fóâûúþ\u00843ï£÷\u0091\u0090Ó&(~\u008aR¹\u0000±\u001eßw\u000b¸Ê\u0080¹\u00121½þí#¢OÙ_¯þ¨Üo!ñD\u0010Ð\u0010ÙjRÕñ\u0018d\u00990ðêÍ÷õ]KærixÂ\u0011n\u0089¶»fÚí;@FFtÚg0}L(vß®\u0081*Î®_kaJµ9`v'C¤\u009fÐ:ºLÕvMB\f\u0080vé®\u00049píþY\u001dUkz¨ç1w\u001fa\u0095>\u0083ÑddnHÙÓÛ:f0_\u001f\tí¾\u0087æ\u0081\u001b³^\u0010¬=\u0011*)¦S¾¯\u001a¥yÓéç¤\u0012Äª\u009f\tÉ;Ô\u0013\u001cÖ4x8\u008e]ÿ\u001a¹\u0090Y\u008aêÚð\u0014,\u0010õ4\u0016\u0094´})ÆX\u0080 \u0004)\u0003E<õ§\u0019sgÝÕONò\\ò\rª¸+f\u009c\u0096°\u007f\u0093Éâ¨Sþh´ò$ú«Ù;\u0097\u0080V4WõÄ?ï·â\u008eâ\u0013\u0007\u0083µ\u001bf\u0012ªÕ\u0001\u0081Ô\u008e,¾ùÂä\u009e¶^¬ KMÎ®ó{P²v\u0086\u008e¬\u007fEF:ê\u0017Ü\u008eâ\u0090/\u008b\u009c\u008b\u001aÆdw\\(0\u0080/\u0019\u000f\u000e*\tj\u0099V\u009fEÍ\fO}f\u0017l#\u0089\u0092ÏI\u0083Þt3(¼çÜ¸\u0016ÏNLf;Ì\u0011\u009b¾\u0014¶¦\u009dô\r MSç½Æ'\u0004\fyÒQé\u0019¬\u0081\u0082Ý\u0091G\u0010ì!óÑw:\u0016\u001c:\u0091I\u001b£wN{@\u001b\u009fO~þ\u000f¡eð\u0087ØÌ¢>Æ-ñ2$þ\u0012\u001b\u0011B\u0011r»\u000f½hð£\u0006\u0006\u001d\\ó\u000ed©\u0083\u001eèvÆÓÈCì\u0083®\u0090\u007f{\u009e@Néª\u0097G°p¢h¼\u0087+äí%\u0001¨LjJ\u008fà\u0086\u0092®8ÔÄM² ª\u0089\u0096©+hoö}A\u0087t\u0014®\u0094Pà?\u0098'L\n\u0018~õ\u009c\u0098§E{\u008a\u000b¹µK5âc1ú\u0090ë'I$-×<'Gª¹¨S\u0006»Tlè&5\u008eX,\u009bà\u0082òî*\u0081ºoð\u009e\n<\u0018úN\u00135";
      int var7 = "ª,¹Äü\f½8Mÿ\u0089\u00ad=çðç^Ý\u0096ÞjÀ* £\u000eß×Z-SN\u008a$GöÌîÕlÁÂmö\u0096¶Øhuh¼³GþH\u001f\u0010^Â_¡?êªQf«X(ÏôÒR@¤\u009f9}»@ç\u0085<b/\u008c'ýÇþqiQ\u0004t3knÅ7;\u0097T4<y\u0019\u0084H\u001e\u0003\u0091ä\u0090\u0082+l\u001a\u0006Íj«\u001d\u0013xsVõ\u000eTtD³uüì®¢HCRf#?Ý\u0014+J+Â¥ýÒ\u0082ú\n\u0080\u009fÆ\u008d\\ã\u0000\u001eà8<÷°#Ó\u009e\u0096Æ\u0005h\bÆÁ]½õ0\u0097¦òã\\;'\u0092É§(¹ôÛ¤aJyrýpG\u008d²ò\f¤ÝHñ»¬§\rCÃ7ø\u0092×BÌ«¶Ü?æ¾à0\fS\u0017LÄ=.ôy\u0096\u0013iTÛ=ÜõácÔg\u0084ËKVÅlOä»\u009f2^ê¥aF\u0000mãKt\u001bv\u001cr\"6\u0085@\"\u0010\u001cÊRï&:´ÚÄ`XÉn9\u001eÆP8\u00167°\u001dRÑ¬77É\u0018\u0089Åtr\u0015Li\u0088Cq\u0001*§ö\u009f¼E\u0014ÆûM\u0003\u0006ç\u008cu\u0091åAâÁ;?\u0018\bZG:\u009e¥\u0016sû\u0012u\u0013\u009bKÆÆu\u008dÏ\u000b7d\u0011\u0095¼Q\u0084MzÙÂ³=°(ËÉ:m\u0012\u0002+¹áËe¹$Ð\u0012uÛ;\u001bËú]Ãð°ç\u0018kª\t:\u0094ô\u0094\u009dv×\u0093\u0085±\u0010ü\u0007\u009c\u0017\u008eô1;\u0017\u001b´Zï\tð\u001f \u008e¬iißÜ$çúÛ\u0002\u0099¥¦)hó\u001fóâûúþ\u00843ï£÷\u0091\u0090Ó&(~\u008aR¹\u0000±\u001eßw\u000b¸Ê\u0080¹\u00121½þí#¢OÙ_¯þ¨Üo!ñD\u0010Ð\u0010ÙjRÕñ\u0018d\u00990ðêÍ÷õ]KærixÂ\u0011n\u0089¶»fÚí;@FFtÚg0}L(vß®\u0081*Î®_kaJµ9`v'C¤\u009fÐ:ºLÕvMB\f\u0080vé®\u00049píþY\u001dUkz¨ç1w\u001fa\u0095>\u0083ÑddnHÙÓÛ:f0_\u001f\tí¾\u0087æ\u0081\u001b³^\u0010¬=\u0011*)¦S¾¯\u001a¥yÓéç¤\u0012Äª\u009f\tÉ;Ô\u0013\u001cÖ4x8\u008e]ÿ\u001a¹\u0090Y\u008aêÚð\u0014,\u0010õ4\u0016\u0094´})ÆX\u0080 \u0004)\u0003E<õ§\u0019sgÝÕONò\\ò\rª¸+f\u009c\u0096°\u007f\u0093Éâ¨Sþh´ò$ú«Ù;\u0097\u0080V4WõÄ?ï·â\u008eâ\u0013\u0007\u0083µ\u001bf\u0012ªÕ\u0001\u0081Ô\u008e,¾ùÂä\u009e¶^¬ KMÎ®ó{P²v\u0086\u008e¬\u007fEF:ê\u0017Ü\u008eâ\u0090/\u008b\u009c\u008b\u001aÆdw\\(0\u0080/\u0019\u000f\u000e*\tj\u0099V\u009fEÍ\fO}f\u0017l#\u0089\u0092ÏI\u0083Þt3(¼çÜ¸\u0016ÏNLf;Ì\u0011\u009b¾\u0014¶¦\u009dô\r MSç½Æ'\u0004\fyÒQé\u0019¬\u0081\u0082Ý\u0091G\u0010ì!óÑw:\u0016\u001c:\u0091I\u001b£wN{@\u001b\u009fO~þ\u000f¡eð\u0087ØÌ¢>Æ-ñ2$þ\u0012\u001b\u0011B\u0011r»\u000f½hð£\u0006\u0006\u001d\\ó\u000ed©\u0083\u001eèvÆÓÈCì\u0083®\u0090\u007f{\u009e@Néª\u0097G°p¢h¼\u0087+äí%\u0001¨LjJ\u008fà\u0086\u0092®8ÔÄM² ª\u0089\u0096©+hoö}A\u0087t\u0014®\u0094Pà?\u0098'L\n\u0018~õ\u009c\u0098§E{\u008a\u000b¹µK5âc1ú\u0090ë'I$-×<'Gª¹¨S\u0006»Tlè&5\u008eX,\u009bà\u0082òî*\u0081ºoð\u009e\n<\u0018úN\u00135"
         .length();
      char var8 = '8';
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
                     CONST_D = new String[22];
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

                  var6 = "tÜÂÞUUOøñ®oµ\u0099\u001dÃy\u0010ú\u0083¢\u0081(yO\u009d·\u0092)ín\bÖq";
                  var7 = "tÜÂÞUUOøñ®oµ\u0099\u001dÃy\u0010ú\u0083¢\u0081(yO\u009d·\u0092)ín\bÖq".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30225;
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
            throw new RuntimeException("rip/breeze/client/cI", var10);
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
}
