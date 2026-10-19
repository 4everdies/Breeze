package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DateUtil_x {
   private static String string_b;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);
   private static final long[] CONST_F;
   private static final Long[] CONST_G;
   private static final Map CONST_H;

   public static String buildString(long var0) {
      long var2 = 9020795790966L;
      long var4 = System.currentTimeMillis();
      long var6 = var4 - var0;
      if (var6 < -3927436845482180064L) {
         return "Just now";
      } else if (var6 < -6934625153974239934L) {
         return var6 / -4065112928774306817L + " seconds ago";
      } else if (var6 < 1943877007211273198L) {
         return var6 / -7554723830157293198L + " minutes ago";
      } else if (var6 < 6361088164495385389L) {
         return var6 / -395253086861259873L + " hours ago";
      } else if (var6 < -6004059381990060541L) {
         return var6 / 4495444151057050193L + " days ago";
      } else if (var6 < -631685975203902309L) {
         return var6 / -2150276968666362551L + " weeks ago";
      } else {
         return var6 < 1131371136155726056L
            ? var6 / 6869401504793753494L + " months ago"
            : var6 / -1173119485912979856L + " years ago";
      }
   }

   public static String buildString_2(long var0) {
      long var2 = 38743894942062L;
      Date var4 = new Date(var0);
      SimpleDateFormat var5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      return var5.format(var4);
   }

   public static String buildString_3(long var0) {
      long var2 = 13720787375402L;
      if (var0 < -4065112928774306817L) {
         return String.valueOf(var0);
      } else if (var0 < 1000000L) {
         return String.format("%.1fK", var0 / 1000.0);
      } else {
         return var0 < 1000000000L
            ? String.format("%.1fM", var0 / 1000000.0)
            : String.format("%.1fB", var0 / 1.0E9);
      }
   }

   public static void initialize(String var0) {
      string_b = var0;
   }

   public static String getString() {
      return string_b;
   }

   static {
      long var0 = 98589611044689L;
      initialize("a42Z1");
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
      String var6 = "j\u001aÂà\u008dèP\u0015üV7Ï\u007f\u008a!HmWJÛ»g þ\u008eÇ¬~\u009c\u0014\u0091t è\u0002wÑÄ²¨z'voSÞÄ3\u0093f-Æ5è\u0082\u0080EÅhÌYÐ\tùQ0Ë\u0015\u0084M3\u001cÙ\u007f)¯\u0086\u009d.~\u0004³¨\u0099:?(|\u009bøvXÐÐÖ\u009a\u0016\u009f²Q\u0096;híê\u0089T°)¤÷¤D;\u0018Ç\u00152\u008b±ì+m\u009b¨©\u008d\u009e,sµ\u0098\u009eeéèTø\u0086 ìÕ¦Àë\u0019ô\u0085¦yô|\u008d\u0090\u008a»\u0001[uéÛ\u000290üÉw\u0007`\u0096\u0000\u0081\u0018\u0004wË*Ë\u0081\u0093»ÍÕ\u001fS¬\u008a6Q\u0099òeÒFj\u008f° ´¬OY1ß\u0006Ð\f\u0013ýãÆÅ\u0013;¢&Ð\u009a\u001e*Ç§¾[¶ ªµ£2\u0010Ê|pÌ\u0015-¥\u0001¢Æ»ÅIÇf\u001d\u0010zIª)T:+ú\u0001¤\u0010»1ò\u0016u\u0010&ºÁ\u000ft\u009c\u0004Û¹Ó\u0013z£\u008dë©";
      int var7 = "j\u001aÂà\u008dèP\u0015üV7Ï\u007f\u008a!HmWJÛ»g þ\u008eÇ¬~\u009c\u0014\u0091t è\u0002wÑÄ²¨z'voSÞÄ3\u0093f-Æ5è\u0082\u0080EÅhÌYÐ\tùQ0Ë\u0015\u0084M3\u001cÙ\u007f)¯\u0086\u009d.~\u0004³¨\u0099:?(|\u009bøvXÐÐÖ\u009a\u0016\u009f²Q\u0096;híê\u0089T°)¤÷¤D;\u0018Ç\u00152\u008b±ì+m\u009b¨©\u008d\u009e,sµ\u0098\u009eeéèTø\u0086 ìÕ¦Àë\u0019ô\u0085¦yô|\u008d\u0090\u008a»\u0001[uéÛ\u000290üÉw\u0007`\u0096\u0000\u0081\u0018\u0004wË*Ë\u0081\u0093»ÍÕ\u001fS¬\u008a6Q\u0099òeÒFj\u008f° ´¬OY1ß\u0006Ð\f\u0013ýãÆÅ\u0013;¢&Ð\u009a\u001e*Ç§¾[¶ ªµ£2\u0010Ê|pÌ\u0015-¥\u0001¢Æ»ÅIÇf\u001d\u0010zIª)T:+ú\u0001¤\u0010»1ò\u0016u\u0010&ºÁ\u000ft\u009c\u0004Û¹Ó\u0013z£\u008dë©"
         .length();
      char var8 = ' ';
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString_4(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_C = var4;
                     CONST_D = new String[12];
                     CONST_H = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[16];
                     int var14 = 0;
                     String var15 = ".0i\u001e)®\u0087\u0015Ôdí/åÖ¼òRèF\u0019Y¦ng±¡\u0096oÂüÀ§*\u0004Ú\u000fðK¶%VQ¾Á\u00139{¤\u0097±à\u0098\u0080ñ¨J\u0085©^\u0088Þ\u007ft\u000e6~úC·ö\u008cð?·Ï2\u0012g¹O+ø\u0091\u008fÂÑ \u00020%«O\rædR¾ðæð\u009eöf\u0005\u0090H\u0017~¦âdû";
                     int var16 = ".0i\u001e)®\u0087\u0015Ôdí/åÖ¼òRèF\u0019Y¦ng±¡\u0096oÂüÀ§*\u0004Ú\u000fðK¶%VQ¾Á\u00139{¤\u0097±à\u0098\u0080ñ¨J\u0085©^\u0088Þ\u007ft\u000e6~úC·ö\u008cð?·Ï2\u0012g¹O+ø\u0091\u008fÂÑ \u00020%«O\rædR¾ðæð\u009eöf\u0005\u0090H\u0017~¦âdû"
                        .length();
                     byte var17 = 0;

                     label36:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var28 = var13;
                        var10001 = var14++;
                        long var40 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var19 = var40;
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
                           long var45 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var17 >= var16) {
                                    CONST_F = var13;
                                    CONST_G = new Long[16];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "êww£ì³àåÛäÜX\n¼#±";
                                 var16 = "êww£ì³àåÛäÜX\n¼#±".length();
                                 var17 = 0;
                           }

                           byte var34 = var17;
                           var17 += 8;
                           var18 = var15.substring(var34, var17).getBytes("ISO-8859-1");
                           var28 = var13;
                           var10001 = var14++;
                           var40 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var36;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label54;
                  }

                  var6 = "J×m\u001eL\u008b\u0080îÐ/\u0011\t\u008d¼\u001c+÷oNwÁw²\u001dlÏbÍÿË,X \r\u0086®Þa\u0080DäúÊ^\u0015\u008dX\u000eç\u0010\u00ad]n\u007fnqûÛ\u0080×\u0088\u008b\\ç\u008b";
                  var7 = "J×m\u001eL\u008b\u0080îÐ/\u0011\t\u008d¼\u001c+÷oNwÁw²\u001dlÏbÍÿË,X \r\u0086®Þa\u0080DäúÊ^\u0015\u008dX\u000eç\u0010\u00ad]n\u007fnqûÛ\u0080×\u0088\u008b\\ç\u008b"
                     .length();
                  var8 = ' ';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_4(byte[] var0) {
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

   private static String buildString_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26951;
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
            throw new RuntimeException("rip/breeze/eR", var10);
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
         CONST_D[var3] = buildString_4(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_5(var4, var5);
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
         throw new RuntimeException("rip/breeze/eR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32390;
      if (CONST_G[var3] == null) {
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
         long var5 = CONST_F[var3];
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
         Object[] var9 = (Object[])CONST_H.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/eR", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_G[var3] = var14;
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/eR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
