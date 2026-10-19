package rip.breeze.client;

import com.mojang.authlib.properties.Property;
import com.mojang.util.UUIDTypeAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.commons.io.IOUtils;
import rip.breeze.StringDecryptor;

public class SkinLoader {
   public static final HashMap<String, UUID> CONST_A;
   public static final HashMap<UUID, String> CONST_B;
   private static final HashMap<UUID, Property> CONST_C;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public static boolean checkCondition(NetworkPlayerInfo var0) {
      long var1 = 36958436615633L;
      boolean var10000 = BlockUtil7.checkCondition();
      UUID var3 = MinecraftAccessor.getGameProfile(var0).getId();
      boolean var4 = var10000;

      try {
         if (var3 == null) {
            MinecraftAccessor.initialize_42(var0);
            return true;
         }
      } catch (IllegalArgumentException var7) {
         throw getException(var7);
      }

      Property var5;
      label27: {
         if (CONST_C.containsKey(var3)) {
            var5 = CONST_C.get(var3);
            if (!var4) {
               break label27;
            }
         }

         var5 = getProperty(var3);
         CONST_C.put(var3, var5);
      }

      try {
         if (var5 != null) {
            var0.getGameProfile()
               .getProperties()
               .put("textures", new Property(var5.getName(), var5.getValue(), var5.getSignature()));
            MinecraftAccessor.initialize_47(var0, false);
            MinecraftAccessor.initialize_42(var0);
            return true;
         } else {
            return false;
         }
      } catch (IllegalArgumentException var6) {
         throw getException(var6);
      }
   }

   public static UUID getUUID(String var0) {
      try {
         return UUIDTypeAdapter.fromString(var0);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   public static Property getProperty(UUID var0) {
      long var1 = 118738565992834L;
      long var3 = var1 ^ 123903300506094L;
      long var10001 = var1 ^ 132297916624581L;
      int var5 = (int)((var1 ^ 132297916624581L) >>> 48);
      int var6 = (int)((var1 ^ 132297916624581L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 103938603905325L;
      long var10 = var1 ^ 92357859763891L;

      try {
         URL var12 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + var0 + "?unsigned=false");
         InputStreamReader var13 = new InputStreamReader(var12.openStream());
         UserTheme var14 = new Util139()
            .getDataBuilder2_2(var13, var3)
            .getUserTheme(var10)
            .getDataBuilder2_2("properties")
            .getBreezeIterable(var8)
            .getDataBuilder2(0)
            .getUserTheme(var10);
         String var15 = var14.getDataBuilder2_2("value").buildString((char)var5, var6, (short)var7);
         String var16 = var14.getDataBuilder2_2("signature").buildString((char)var5, var6, (short)var7);
         return new Property("textures", var15, var16);
      } catch (Exception var17) {
         return null;
      }
   }

   public static UUID getUUID_2(String var0) {
      long var1 = 89602849512678L;
      long var3 = var1 ^ 81586330442890L;
      long var10001 = var1 ^ 73464112948129L;
      int var5 = (int)((var1 ^ 73464112948129L) >>> 48);
      int var6 = (int)((var1 ^ 73464112948129L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 115981521546199L;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (IOException var18) {
         throw getException(var18);
      }

      try {
         if (CONST_A.containsKey(var0)) {
            return CONST_A.get(var0);
         }
      } catch (IOException var19) {
         throw getException(var19);
      }

      try {
         URLConnection var10 = new URL("https://api.mojang.com/users/profiles/minecraft/" + var0).openConnection();
         var10.connect();
         Util139 var11 = new Util139();

         PlayerUtil8 var12;
         try {
            var12 = var11.getDataBuilder2_2(new InputStreamReader((InputStream)var10.getContent()), var3);
         } catch (IOException var16) {
            CONST_A.put(var0, null);
            return null;
         }

         UserTheme var13 = var12.getUserTheme(var8);
         String var14 = var13.getDataBuilder2_2("id").buildString((char)var5, var6, (short)var7);
         var14 = UUID.fromString(var14.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"))
            .toString();
         UUID var15 = UUID.fromString(var14);
         CONST_B.put(var15, var0);
         CONST_A.put(var0, var15);
         return var15;
      } catch (Exception var17) {
         CONST_A.put(var0, null);
         var17.printStackTrace();
         return null;
      }
   }

   public static ArrayList<EntityPlayer> getArrayList() {
      long var0 = 57898332875690L;
      ArrayList var2 = new ArrayList();
      List var3 = MinecraftAccessor.getOrdering().sortedCopy(BreezeClient.CONST_A.thePlayer.sendQueue.getPlayerInfoMap());
      boolean var10000 = BlockUtil7.isValid();
      Iterator var4 = var3.iterator();
      boolean var5 = var10000;

      while (var4.hasNext()) {
         NetworkPlayerInfo var6 = (NetworkPlayerInfo)var4.next();

         try {
            if (var6 != null) {
               var2.add(BreezeClient.CONST_A.theWorld.getPlayerEntityByName(MinecraftAccessor.getGameProfile(var6).getName()));
            }
         } catch (IllegalArgumentException var7) {
            throw getException(var7);
         }

         if (!var5) {
            break;
         }
      }

      return var2;
   }

   public static String buildString(UUID var0) {
      long var1 = 57189199486321L;
      long var3 = var1 ^ 129523049958643L;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (Exception var12) {
         throw getException(var12);
      }

      try {
         if (CONST_B.containsKey(var0)) {
            return CONST_B.get(var0);
         }
      } catch (Exception var13) {
         throw getException(var13);
      }

      try {
         URL var5 = new URL("%^��'��" + var0.toString().replace("-", ""));
         URLConnection var6 = var5.openConnection();
         var6.connect();
         String var7 = IOUtils.toString(var5);
         Util139 var8 = new Util139();
         UserTheme var9 = (UserTheme)var8.getDataBuilder2(var7, var3);
         String var10 = var9.getDataBuilder2_2("name").toString().replaceAll("\"", "");
         CONST_B.put(var0, var10);
         CONST_A.put(var10, var0);
         return var10;
      } catch (Exception var11) {
         CONST_B.put(var0, null);
         return null;
      }
   }

   static {
      long var0 = 68582067518520L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[13];
      int var5 = 0;
      String var6 = "lÎ\u0094\u008d\u0089M´éw\u008fû¯¬#Ó\u0005$\u0018ªAnÊ²\u0084\nñ$ zw\u0012MÕ\u0015\u0086¨ÉJ*¼\u001dFñ»b\u0085°àÕ¬±JZY\u0000ûX\u0093\u008dñ\u0086¨üL\u001f¼\u0080ÏbZ\u0013&²Uâ\u008a \u001c\u0017*\u0016\u00887ÌWa£t\u0090i\u009a©\u0098Ä$m\u0098ë¬\u0092ÃvØ\u008f\u009e²è|LJ\u0080\u0093\u001fã¯Á³D§_¾Ó \r+ºEv:'ü\næá\u0005HÚ\u009c\u0090\u0099ê:\u008cÜ\u0005x\u000fõîÓaÖÉ\u0080\u0007]©z±Ñ<\u007f¿\u0081\u0099ÕK\u001eü\u0014¦ëä8Xt ¤\u0097üwOÚíõ\u0098Ó¾&\u0005ë÷I\u000eø=b·\u0003\u000b?`=ö¸â\u0088\"©¾\fÈÜAkî\u0097A²¼:\u0095d4ûØ»©\u0007è9;â½X\u0012Ó\t9\u0006\u008eýÖÊ«ZcX0\u008df±\"3\u0007\u0018\\è-È\u0005J\u0013*\u0098X\u0010¨]\u000fp\u008c\u0082l\u0006\u0080dv7É\u0017\u0090W kkËÍ¾*T±ý/¯ÿi\u0084\\åz\u00adÙ\u0095U4¼Ç\u001bý\u0086t<Û\\sh9\u008c3\u008bÝ\u0013Ð\u0014fß9^C\u0018çz?\u00ad°}IÃ*In\u0010\u001e©\u0012\r¿l\u0096á\u0080V\u009fE\u008b2W\u008bfÆJ\u001edÌÇþ^æ84>§\u001f^l+\u0089ô^\u0005\u0016\u0006\u0019ÆÖd)G\u0084\u0099è\u0010\u0013ip*S£¢×~6î'Q\u0084\u0090\u0004?À¹\u0081\u008c\u009e&\u00adù²-,\u0018?\u0015ó%ÐÎMM\u0096kyVÿ]¿\u0013¹¶x\t7ß\u0000B ýß!o\u007f\\¯\u0086\u009f\u001fBmFÏ\u0013ÕßÙ\u008aÚúûÚë³¥\u0092ëàÈ\u0005Å ^Es-\u009aá\u0092+,9\u0018\u0010¦Ôã±\u0085\u0019M\u0001Ûú+\u009eU\r\u009c\u0007Gz5ø\u0010L±\u001bå\u008e¢Ë\u0083Ôæ\u000bè\u008c\u0083ß° ¶Í\u0090ÕýQXÆä\u0098¢\u008bÃ~<°gK1\u0002\t¾å~\u00812x÷Z\u0094®^";
      int var7 = "lÎ\u0094\u008d\u0089M´éw\u008fû¯¬#Ó\u0005$\u0018ªAnÊ²\u0084\nñ$ zw\u0012MÕ\u0015\u0086¨ÉJ*¼\u001dFñ»b\u0085°àÕ¬±JZY\u0000ûX\u0093\u008dñ\u0086¨üL\u001f¼\u0080ÏbZ\u0013&²Uâ\u008a \u001c\u0017*\u0016\u00887ÌWa£t\u0090i\u009a©\u0098Ä$m\u0098ë¬\u0092ÃvØ\u008f\u009e²è|LJ\u0080\u0093\u001fã¯Á³D§_¾Ó \r+ºEv:'ü\næá\u0005HÚ\u009c\u0090\u0099ê:\u008cÜ\u0005x\u000fõîÓaÖÉ\u0080\u0007]©z±Ñ<\u007f¿\u0081\u0099ÕK\u001eü\u0014¦ëä8Xt ¤\u0097üwOÚíõ\u0098Ó¾&\u0005ë÷I\u000eø=b·\u0003\u000b?`=ö¸â\u0088\"©¾\fÈÜAkî\u0097A²¼:\u0095d4ûØ»©\u0007è9;â½X\u0012Ó\t9\u0006\u008eýÖÊ«ZcX0\u008df±\"3\u0007\u0018\\è-È\u0005J\u0013*\u0098X\u0010¨]\u000fp\u008c\u0082l\u0006\u0080dv7É\u0017\u0090W kkËÍ¾*T±ý/¯ÿi\u0084\\åz\u00adÙ\u0095U4¼Ç\u001bý\u0086t<Û\\sh9\u008c3\u008bÝ\u0013Ð\u0014fß9^C\u0018çz?\u00ad°}IÃ*In\u0010\u001e©\u0012\r¿l\u0096á\u0080V\u009fE\u008b2W\u008bfÆJ\u001edÌÇþ^æ84>§\u001f^l+\u0089ô^\u0005\u0016\u0006\u0019ÆÖd)G\u0084\u0099è\u0010\u0013ip*S£¢×~6î'Q\u0084\u0090\u0004?À¹\u0081\u008c\u009e&\u00adù²-,\u0018?\u0015ó%ÐÎMM\u0096kyVÿ]¿\u0013¹¶x\t7ß\u0000B ýß!o\u007f\\¯\u0086\u009f\u001fBmFÏ\u0013ÕßÙ\u008aÚúûÚë³¥\u0092ëàÈ\u0005Å ^Es-\u009aá\u0092+,9\u0018\u0010¦Ôã±\u0085\u0019M\u0001Ûú+\u009eU\r\u009c\u0007Gz5ø\u0010L±\u001bå\u008e¢Ë\u0083Ôæ\u000bè\u008c\u0083ß° ¶Í\u0090ÕýQXÆä\u0098¢\u008bÃ~<°gK1\u0002\t¾å~\u00812x÷Z\u0094®^"
         .length();
      char var8 = '8';
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
                     CONST_E = var4;
                     CONST_F = new String[13];
                     CONST_A = new HashMap<>();
                     CONST_B = new HashMap<>();
                     CONST_C = new HashMap<>();
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

                  var6 = "\u0019PÍv\f\u009aÑ¾\u0019-3e\u0015)ÌÆ)t\u0092û®\u0097ùTáÒX;$,}@\u0010\u0094f¼\u0083YX'â§\u0017qe£Î\u0097w";
                  var7 = "\u0019PÍv\f\u009aÑ¾\u0019-3e\u0015)ÌÆ)t\u0092û®\u0097ùTáÒX;$,}@\u0010\u0094f¼\u0083YX'â§\u0017qe£Î\u0097w".length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6347;
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
            throw new RuntimeException("rip/breeze/client/fd", var10);
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
         CONST_F[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/client/fd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
