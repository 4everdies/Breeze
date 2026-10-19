package rip.breeze.client;

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
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "HitFX", b = "Adds hit effects to the game.", d = rip.breeze.ModuleCategory.VISUAL)
public class HitFX extends BreezeModule {
   private final GenericSetting<Boolean> rainbowSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final GenericSetting<Double> dataBuilder54_p;
   private final MathUtil10 dataBuilder46_q;
   private static final String[] CONST_R;
   private final List<RenderUtil7_x> list_s;
   private static final String[] CONST_U;
   private static final String[] CONST_V;
   private static final Map CONST_W = new HashMap(13);
   private static final long[] CONST_X;
   private static final Long[] CONST_Y;
   private static final Map CONST_Z;

   public HitFX() {
      long var1 = 49877606360523L;
      super();
      short var10002 = 29377;
      long var10003 = 474632927269960643L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Rainbow");
      var10002 = 860;
      var10003 = 4015809262049839706L ^ var1;
      this.rainbowSetting = var10001.getDataBuilder50_3("Use a random rainbow color for each comic word.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 1385;
      var10003 = 3427214423931800678L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 22424;
      var10003 = 8817830283598438033L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("Custom color for comic words.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(255, 200, 0))
         .getDataBuilder50_9(HitFX::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 10763;
      var10003 = 7436317810098365187L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Size multiplier applied to each comic word.");
      var10002 = 16381;
      var10003 = 9143513146902935278L ^ var1;
      this.dataBuilder54_p = var10001.getDataBuilder50_3("badaboom")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.25, 3.0))
         .getDataBuilder54();
      this.dataBuilder46_q = MathUtil10.getDataBuilder46_2("badaboom", 150, true);
      this.list_s = new ArrayList<>();
   }

   @EventListener
   public void updateRotation(PacketReceiveEventEvent var1) {
      if (var1.packet_h instanceof S19PacketEntityStatus) {
         S19PacketEntityStatus var2 = (S19PacketEntityStatus)var1.packet_h;
         if (var2.getOpCode() == 2) {
            Entity var3 = var2.getEntity(BreezeClient.CONST_A.theWorld);
            if (var3 != null && var3 instanceof EntityPlayer && var3 != BreezeClient.CONST_A.thePlayer) {
               if (!(BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var3) > 10.0F) || var3 == BreezeClient.getThemeManager().getEntity()) {
                  if (AntiBot.isInvisible_3((EntityPlayer)var3)) {
                     for (int var4 = 0; var4 < 1 + new Random().nextInt(3); var4++) {
                        this.updateRotation_2((EntityLivingBase)var3);
                     }
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void processAll(Render2DEventEvent var1) {
      this.initialize();
   }

   private void initialize() {
      if (!this.list_s.isEmpty()) {
         this.dataBuilder46_q.processAll();
         Iterator var1 = this.list_s.iterator();

         while (var1.hasNext()) {
            RenderUtil7_x var2 = (RenderUtil7_x)var1.next();
            long var3 = System.currentTimeMillis() - var2.fieldLong_k;
            if (var3 > var2.fieldLong_l) {
               var1.remove();
            } else {
               float var5 = (float)var3 / (float)var2.fieldLong_l;
               float var6 = (float)Math.pow(var5, 0.15);
               double var7 = var2.fieldFloat_c + var2.fieldFloat_f * var6;
               double var9 = var2.fieldFloat_d + var2.fieldFloat_g * var6;
               double var11 = var2.fieldFloat_e + var2.fieldFloat_h * var6;
               double[] var13 = RenderUtil31.vecToArray(new Vec3(var7, var9, var11));
               if (var13 != null) {
                  float var14 = (float)var13[0];
                  float var15 = (float)var13[1];
                  float var16;
                  if (var5 < 0.1F) {
                     var16 = var5 / 0.1F;
                  } else if (var5 < 0.3F) {
                     var16 = 1.0F;
                  } else {
                     var16 = 1.0F - (var5 - 0.3F) / 0.7F * 0.4F;
                  }

                  var16 *= var2.fieldFloat_j * this.dataBuilder54_p.getObject_m().floatValue();
                  float var17;
                  if (var5 < 0.6F) {
                     var17 = 1.0F;
                  } else {
                     var17 = 1.0F - (var5 - 0.6F) / 0.4F;
                  }

                  Color var18 = new Color(
                     var2.color_b.getRed(), var2.color_b.getGreen(), var2.color_b.getBlue(), Math.max(0, Math.min(255, (int)(var17 * 255.0F)))
                  );
                  float var19 = this.dataBuilder46_q.clamp_8(var2.string_a) * var16;
                  float var20 = this.dataBuilder46_q.getValue() * var16;
                  float var21 = var14 - var19 / 2.0F;
                  float var22 = var15 - var20 / 2.0F;
                  GL11.glPushMatrix();
                  GL11.glTranslatef(var14, var15, 0.0F);
                  GL11.glRotatef(var2.fieldFloat_i, 0.0F, 0.0F, 1.0F);
                  GL11.glScalef(var16, var16, 1.0F);
                  GL11.glTranslatef(-var14, -var15, 0.0F);
                  this.dataBuilder46_q.calculate(var21, var22, var2.string_a, var18, true);
                  this.dataBuilder46_q.processAll_2();
                  GL11.glPopMatrix();
               }
            }
         }

         this.dataBuilder46_q.toggle();
         GlStateManager.disableBlend();
         GlStateManager.enableBlend();
         GlStateManager.disableAlpha();
         GlStateManager.enableAlpha();
         GlStateManager.enableTexture2D();
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void updateRotation_2(EntityLivingBase var1) {
      long var2 = 106572169487319L;
      ThreadLocalRandom var4 = ThreadLocalRandom.current();
      String var5 = CONST_R[var4.nextInt(CONST_R.length)];
      Color var6;
      if (this.rainbowSetting.getObject_m()) {
         var6 = Color.getHSBColor(var4.nextFloat(), 1.0F, 1.0F);
      } else {
         Color var7 = this.colorSetting.getObject_m();
         float[] var8 = Color.RGBtoHSB(var7.getRed(), var7.getGreen(), var7.getBlue(), null);
         float var9 = var4.nextFloat() * 0.2F - 0.1F;
         float var10 = (var8[0] + var9) % 1.0F;
         if (var10 < 0.0F) {
            var10++;
         }

         var6 = Color.getHSBColor(var10, var8[1], var8[2]);
      }

      float var33 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var1);
      double var11 = Math.max(2.0F, var33) / 10.0;
      long var10001 = 1711852522230491801L ^ var2;
      double var13 = var4.nextDouble(-0.15, 0.3);
      double var15 = var4.nextDouble(0.4, var1.height);
      double var17 = var4.nextDouble(-0.15, 0.15);
      double var19 = var1.posX + var13;
      double var21 = var1.posY + var15;
      double var23 = var1.posZ + var17;
      float var25 = Math.max(2.0F, var33 / 2.0F);
      float var26 = (var4.nextFloat() - 0.5F) * 2.0F * var25;
      float var27 = var4.nextFloat() * 0.1F * var25;
      float var28 = (var4.nextFloat() - 0.5F) * 2.0F * var25;
      float var29 = var4.nextFloat() * 40.0F - 20.0F;
      float var30 = (float)(0.55F * Math.max(0.5, 1.0 - var11) + var4.nextFloat() * 0.2F);
      long var31 = ((String)null) + var4.nextLong("THWACK!");
      this.list_s.add(new RenderUtil7_x(var5, var6, (float)var19, (float)var21, (float)var23, var26, var27, var28, var29, var30, var31));
   }

   @Override
   public void initialize() {
      this.list_s.clear();
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 110110886271288L;
      return !var0.getObject("Rainbow", Boolean.class);
   }

   static {
      long var0 = 53372678603160L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "*Õ¤&X¹øÉµ\\Â\r¸«`\u0085\u0010,BHjã\u0005:\u0001Ü'U]\u0088´À\u0006\u0010\u0096A»¡Ãµy¥f\u008dF»\n±2Ä\u0010\u0015KÚ\u000fK{ì3.øFå]\u008f\u0093\u0010\u0010Çþ3á\u009cËg\u0081å¬Ëá&\u0000Õ\u0080P´À»^\u0000\u000eÍâd\u0092Æ&,N°äuw*£\u009e\u0019Ç\u0085O£û\u0017kì$\u0086EÏ?(\u0007\u0001\u0006#þG\u0013Æê(ÞH[{rm\u0016*';\u0094Ü6µ;\u008a9ò+Ð\u0001H;¦R\u0088¤æ!2v'ù'\u0010¸X-\u00997ô©mïÆµâ¾ /Ë\u0010ü´äÎ³\u0093^c¢n\u0000®Hù\u0092A\u0010\u0018ú6â\u0013ÛômF{©T\u00176\u0000@\u0010ÿ=i\u0085\u008fÍ\u009d©eM\u00ad\u0018\u001bËëî0Ð\u000by\u007f<pïN¾\u000b*}\u0095Ñ\u0081\fe\u000b\u0018ùw\u0080ö1<\u0011\\G]¤8Ù\u000bÉóÿ\u0084\u0011¾\u0010\u0013\u0090â'\u0011w\u0080\u009b\u0010¹\u0013ç\tÃËy/\"\u00ad\u001c\u00043Ý\u008cÞ\u00109¾$¯\u009b{\u008f\u008c_[ØDí Ij\u0010>R\u008d+\u008f\u0006tÐ9\u0003º:h5»q\u0010¯ª&8ÙRR<\u0092¯\u000bOsm\t× t=[Ó\u0011À,?*\u0011ÌvI\u0015·?\u0095\u0081No!©\u001b\u001d²MøÕV\u0096Wo";
      int var7 = "*Õ¤&X¹øÉµ\\Â\r¸«`\u0085\u0010,BHjã\u0005:\u0001Ü'U]\u0088´À\u0006\u0010\u0096A»¡Ãµy¥f\u008dF»\n±2Ä\u0010\u0015KÚ\u000fK{ì3.øFå]\u008f\u0093\u0010\u0010Çþ3á\u009cËg\u0081å¬Ëá&\u0000Õ\u0080P´À»^\u0000\u000eÍâd\u0092Æ&,N°äuw*£\u009e\u0019Ç\u0085O£û\u0017kì$\u0086EÏ?(\u0007\u0001\u0006#þG\u0013Æê(ÞH[{rm\u0016*';\u0094Ü6µ;\u008a9ò+Ð\u0001H;¦R\u0088¤æ!2v'ù'\u0010¸X-\u00997ô©mïÆµâ¾ /Ë\u0010ü´äÎ³\u0093^c¢n\u0000®Hù\u0092A\u0010\u0018ú6â\u0013ÛômF{©T\u00176\u0000@\u0010ÿ=i\u0085\u008fÍ\u009d©eM\u00ad\u0018\u001bËëî0Ð\u000by\u007f<pïN¾\u000b*}\u0095Ñ\u0081\fe\u000b\u0018ùw\u0080ö1<\u0011\\G]¤8Ù\u000bÉóÿ\u0084\u0011¾\u0010\u0013\u0090â'\u0011w\u0080\u009b\u0010¹\u0013ç\tÃËy/\"\u00ad\u001c\u00043Ý\u008cÞ\u00109¾$¯\u009b{\u008f\u008c_[ØDí Ij\u0010>R\u008d+\u008f\u0006tÐ9\u0003º:h5»q\u0010¯ª&8ÙRR<\u0092¯\u000bOsm\t× t=[Ó\u0011À,?*\u0011ÌvI\u0015·?\u0095\u0081No!©\u001b\u001d²MøÕV\u0096Wo"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var34 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var34;
                  if ((var23 += var8) >= var7) {
                     CONST_U = var4;
                     CONST_V = new String[18];
                     CONST_Z = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "çþ;£\u0087_sþ\u0006~Ê\u0017ÒU\u0091ß";
                     int var16 = "çþ;£\u0087_sþ\u0006~Ê\u0017ÒU\u0091ß".length();
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
                        byte var39 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_X = var13;
                     CONST_Y = new Long[2];
                     String[] var27 = new String[10];
                     short var40 = 4874;
                     long var50 = 8640198688443416148L ^ var0;
                     var27[0] = "POW!";
                     short var41 = 13071;
                     var50 = 4361819937995300445L ^ var0;
                     var27[1] = "BAM!";
                     short var42 = 24310;
                     var50 = 2862352685642544034L ^ var0;
                     var27[2] = "WHAM!";
                     short var43 = 23503;
                     var50 = 1821809687705155224L ^ var0;
                     var27[3] = "ZAP!";
                     short var44 = 6323;
                     var50 = 2415480209499403754L ^ var0;
                     var27[4] = "CRACK!";
                     short var45 = 23349;
                     var50 = 9196548019628734053L ^ var0;
                     var27[5] = "BONK!";
                     short var46 = 4605;
                     var50 = 3692997237576907947L ^ var0;
                     var27[6] = "SMACK!";
                     short var47 = 16989;
                     var50 = 8465104686620077852L ^ var0;
                     var27[7] = "THWACK!";
                     short var48 = 30394;
                     var50 = 8743133744352222178L ^ var0;
                     var27[8] = "KAPOW!";
                     short var49 = 25999;
                     var50 = 615821522604509404L ^ var0;
                     var27[9] = "BIFF!";
                     CONST_R = var27;
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var34;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "¹ò¹SNÒ£P¦\u008aâ!0\u009f×P/áÛÊ?q¤\n\u008f_\u0099¿+Q\u001eK5øåÁlìFÞ\u0086\u0015\u0004@&3Â\u0007\u00ad\u0012øbÕÈø\u009c¾È\u0080Øë1éHÁÂhé\u009dµ±Á$Ây\u0016\u0094¡À×\u0010¼§Ã1Ý±\u001fÂ£\u0016¤L\u000fÍ\u0011\u0094";
                  var7 = "¹ò¹SNÒ£P¦\u008aâ!0\u009f×P/áÛÊ?q¤\n\u008f_\u0099¿+Q\u001eK5øåÁlìFÞ\u0086\u0015\u0004@&3Â\u0007\u00ad\u0012øbÕÈø\u009c¾È\u0080Øë1éHÁÂhé\u009dµ±Á$Ây\u0016\u0094¡À×\u0010¼§Ã1Ý±\u001fÂ£\u0016¤L\u000fÍ\u0011\u0094"
                     .length();
                  var8 = 'P';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11464;
      if (CONST_V[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_W.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d7", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_U[var3].getBytes("ISO-8859-1");
         CONST_V[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_V[var3];
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
         throw new RuntimeException("rip/breeze/client/d7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7215;
      if (CONST_Y[var3] == null) {
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
         long var5 = CONST_X[var3];
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
         Object[] var9 = (Object[])CONST_Z.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Z.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/d7", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_Y[var3] = var14;
      }

      return CONST_Y[var3];
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
         throw new RuntimeException("rip/breeze/client/d7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
