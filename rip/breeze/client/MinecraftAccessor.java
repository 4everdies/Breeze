package rip.breeze.client;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Session;
import net.minecraft.util.StringTranslate;
import net.minecraft.util.Timer;
import net.minecraft.util.Vec3;
import rip.breeze.KeepParameters;
import rip.breeze.StringDecryptor;

public final class MinecraftAccessor {
   private static MethodHandle methodHandle_a;
   private static MethodHandle methodHandle_b;
   private static MethodHandle methodHandle_c;
   private static MethodHandle methodHandle_d;
   private static MethodHandle methodHandle_e;
   private static MethodHandle methodHandle_f;
   private static MethodHandle methodHandle_g;
   private static MethodHandle methodHandle_h;
   private static MethodHandle methodHandle_i;
   private static MethodHandle methodHandle_j;
   private static MethodHandle methodHandle_k;
   private static MethodHandle methodHandle_l;
   private static MethodHandle methodHandle_m;
   private static MethodHandle methodHandle_n;
   private static MethodHandle methodHandle_o;
   private static MethodHandle methodHandle_p;
   private static MethodHandle methodHandle_q;
   private static MethodHandle methodHandle_r;
   private static MethodHandle methodHandle_s;
   private static MethodHandle methodHandle_t;
   private static MethodHandle methodHandle_u;
   private static MethodHandle methodHandle_v;
   private static MethodHandle methodHandle_w;
   private static MethodHandle methodHandle_x;
   private static MethodHandle methodHandle_y;
   private static MethodHandle methodHandle_z;
   private static MethodHandle methodHandle_A;
   private static MethodHandle methodHandle_B;
   private static MethodHandle methodHandle_C;
   private static MethodHandle methodHandle_D;
   private static MethodHandle methodHandle_E;
   private static MethodHandle methodHandle_F;
   private static MethodHandle methodHandle_G;
   private static MethodHandle methodHandle_H;
   private static MethodHandle methodHandle_I;
   private static MethodHandle methodHandle_J;
   private static MethodHandle methodHandle_K;
   private static MethodHandle methodHandle_L;
   private static MethodHandle methodHandle_M;
   private static MethodHandle methodHandle_N;
   private static MethodHandle methodHandle_O;
   private static MethodHandle methodHandle_P;
   private static MethodHandle methodHandle_Q;
   private static MethodHandle methodHandle_R;
   private static MethodHandle methodHandle_S;
   private static MethodHandle methodHandle_T;
   private static MethodHandle methodHandle_U;
   private static MethodHandle methodHandle_V;
   private static MethodHandle methodHandle_W;
   private static MethodHandle methodHandle_X;
   private static MethodHandle methodHandle_Y;
   private static MethodHandle methodHandle_Z;
   private static MethodHandle methodHandle_aa;
   private static MethodHandle methodHandle_ab;
   private static MethodHandle methodHandle_ac;
   private static MethodHandle methodHandle_ad;
   private static MethodHandle methodHandle_ae;
   private static MethodHandle methodHandle_af;
   private static MethodHandle methodHandle_ag;
   private static MethodHandle methodHandle_ah;
   private static MethodHandle methodHandle_ai;
   private static MethodHandle methodHandle_aj;
   private static MethodHandle methodHandle_ak;
   private static MethodHandle methodHandle_al;
   private static MethodHandle methodHandle_am;
   private static MethodHandle methodHandle_an;
   private static MethodHandle methodHandle_ao;
   private static MethodHandle methodHandle_ap;
   private static MethodHandle methodHandle_aq;
   private static MethodHandle methodHandle_ar;
   private static MethodHandle methodHandle_as;
   private static MethodHandle methodHandle_at;
   private static MethodHandle methodHandle_au;
   private static MethodHandle methodHandle_av;
   private static MethodHandle methodHandle_aw;
   private static MethodHandle methodHandle_ax;
   private static MethodHandle methodHandle_ay;
   private static MethodHandle methodHandle_az;
   private static MethodHandle methodHandle_aA;
   private static MethodHandle methodHandle_aB;
   private static MethodHandle methodHandle_aC;
   private static MethodHandle methodHandle_aD;
   private static MethodHandle methodHandle_aE;
   private static MethodHandle methodHandle_aF;
   private static MethodHandle methodHandle_aG;
   private static MethodHandle methodHandle_aH;
   private static MethodHandle methodHandle_aI;
   private static MethodHandle methodHandle_aJ;
   private static MethodHandle methodHandle_aK;
   private static MethodHandle methodHandle_aL;
   private static MethodHandle methodHandle_aM;
   private static MethodHandle methodHandle_aN;
   private static MethodHandle methodHandle_aO;
   private static MethodHandle methodHandle_aP;
   private static MethodHandle methodHandle_aQ;
   private static MethodHandle methodHandle_aR;
   private static MethodHandle methodHandle_aS;
   private static MethodHandle methodHandle_aT;
   private static MethodHandle methodHandle_aU;
   private static MethodHandle methodHandle_aV;
   private static MethodHandle methodHandle_aW;
   private static MethodHandle methodHandle_aX;
   private static MethodHandle methodHandle_aY;
   private static MethodHandle methodHandle_aZ;
   private static MethodHandle methodHandle_a0;
   private static MethodHandle methodHandle_a1;
   private static MethodHandle methodHandle_a2;
   private static MethodHandle methodHandle_a3;
   private static MethodHandle methodHandle_a4;
   private static MethodHandle methodHandle_a5;
   private static MethodHandle methodHandle_a6;
   private static MethodHandle methodHandle_a7;
   private static MethodHandle methodHandle_a8;
   private static MethodHandle methodHandle_a9;
   private static MethodHandle methodHandle_a_;
   private static MethodHandle methodHandle_ba;
   private static MethodHandle methodHandle_bb;
   private static MethodHandle methodHandle_bc;
   private static MethodHandle methodHandle_bd;
   private static MethodHandle methodHandle_be;
   private static MethodHandle methodHandle_bf;
   private static MethodHandle methodHandle_bg;
   private static MethodHandle methodHandle_bh;
   private static MethodHandle methodHandle_bi;
   private static MethodHandle methodHandle_bj;
   private static MethodHandle methodHandle_bk;
   private static MethodHandle methodHandle_bl;
   private static MethodHandle methodHandle_bm;
   private static MethodHandle methodHandle_bn;
   private static MethodHandle methodHandle_bo;
   private static MethodHandle methodHandle_bp;
   private static MethodHandle methodHandle_bq;
   private static MethodHandle methodHandle_br;
   private static MethodHandle methodHandle_bs;
   private static MethodHandle methodHandle_bt;
   private static MethodHandle methodHandle_bu;
   private static MethodHandle methodHandle_bv;
   private static MethodHandle methodHandle_bw;
   private static MethodHandle methodHandle_bx;
   private static MethodHandle methodHandle_by;
   private static MethodHandle methodHandle_bz;
   private static MethodHandle methodHandle_bA;
   private static String string_bB;

   public static void initialize(Object var0, net.minecraft.util.EnumFacing var1) {
      methodHandle_a.invoke((Object)var0, (net.minecraft.util.EnumFacing)var1);
   }

   public static void initialize_2(Object var0) {
      methodHandle_b.invoke((Object)var0);
   }

   public static void initialize_3(Object var0, double var1) {
      methodHandle_c.invoke((Object)var0, (double)var1);
   }

   public static void initialize_4(Object var0, BlockPos var1) {
      methodHandle_d.invoke((Object)var0, (BlockPos)var1);
   }

   public static void initialize_5(Object var0, Session var1) {
      methodHandle_e.invoke((Object)var0, (Session)var1);
   }

   public static Object getObject() {
      return (Object)methodHandle_f.invoke();
   }

   public static void initialize_6(Object var0, float var1) {
      methodHandle_g.invoke((Object)var0, (float)var1);
   }

   public static double getDouble(Object var0) {
      return (double)methodHandle_h.invoke((Object)var0);
   }

   public static void initialize_7(Object var0, double var1) {
      methodHandle_i.invoke((Object)var0, (double)var1);
   }

   public static void initialize_8(Object var0, int var1) {
      methodHandle_j.invoke((Object)var0, (int)var1);
   }

   public static int getValue(Object var0) {
      return (int)methodHandle_k.invoke((Object)var0);
   }

   public static void initialize_9(Object var0, float var1) {
      methodHandle_l.invoke((Object)var0, (float)var1);
   }

   public static void initialize_10(Object var0, boolean var1) {
      methodHandle_m.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_11(Object var0, int var1) {
      methodHandle_n.invoke((Object)var0, (int)var1);
   }

   public static void initialize_12(Object var0, float var1) {
      methodHandle_o.invoke((Object)var0, (float)var1);
   }

   public static void initialize_13(Object var0, int var1) {
      methodHandle_p.invoke((Object)var0, (int)var1);
   }

   public static void initialize_14(Object var0, String var1) {
      methodHandle_q.invoke((Object)var0, (String)var1);
   }

   public static void initialize_15(Object var0, float var1) {
      methodHandle_r.invoke((Object)var0, (float)var1);
   }

   public static double getDouble_2(Object var0) {
      return (double)methodHandle_s.invoke((Object)var0);
   }

   public static Ordering getOrdering() {
      return (Ordering)methodHandle_t.invoke();
   }

   public static float getFloat(Object var0) {
      return (float)methodHandle_u.invoke((Object)var0);
   }

   public static GameProfile getGameProfile(Object var0) {
      return (GameProfile)methodHandle_v.invoke((Object)var0);
   }

   public static void initialize_16(Object var0, int var1) {
      methodHandle_w.invoke((Object)var0, (int)var1);
   }

   public static Slot getSlot(Object var0, int var1, int var2) {
      return (Slot)methodHandle_x.invoke((Object)var0, (int)var1, (int)var2);
   }

   public static float getFloat_2(Object var0) {
      return (float)methodHandle_y.invoke((Object)var0);
   }

   public static void initialize_17(Object var0, float var1) {
      methodHandle_z.invoke((Object)var0, (float)var1);
   }

   public static float getFloat_3(Object var0, float var1, boolean var2) {
      return (float)methodHandle_A.invoke((Object)var0, (float)var1, (boolean)var2);
   }

   public static Vec3 getVec3(Object var0, float var1, float var2) {
      return (Vec3)methodHandle_B.invoke((Object)var0, (float)var1, (float)var2);
   }

   public static boolean isValid(Object var0) {
      return (boolean)methodHandle_C.invoke((Object)var0);
   }

   public static double getDouble_3(Object var0) {
      return (double)methodHandle_D.invoke((Object)var0);
   }

   public static boolean isValid_2(Object var0) {
      return (boolean)methodHandle_E.invoke((Object)var0);
   }

   public static float getFloat_4(Object var0) {
      return (float)methodHandle_F.invoke((Object)var0);
   }

   public static void initialize_18(Object var0, int var1) {
      methodHandle_G.invoke((Object)var0, (int)var1);
   }

   public static void initialize_19(Object var0, float var1) {
      methodHandle_H.invoke((Object)var0, (float)var1);
   }

   public static boolean isValid_3(Object var0) {
      return (boolean)methodHandle_I.invoke((Object)var0);
   }

   public static int getValue_2(Object var0) {
      return (int)methodHandle_J.invoke((Object)var0);
   }

   public static void initialize_20(Object var0, double var1) {
      methodHandle_K.invoke((Object)var0, (double)var1);
   }

   public static void initialize_21(Object var0, int var1) {
      methodHandle_L.invoke((Object)var0, (int)var1);
   }

   public static BlockPos getBlockPos(Object var0) {
      return (BlockPos)methodHandle_M.invoke((Object)var0);
   }

   public static void initialize_22(Object var0) {
      methodHandle_N.invoke((Object)var0);
   }

   public static void initialize_23(Object var0, ItemStack var1) {
      methodHandle_O.invoke((Object)var0, (ItemStack)var1);
   }

   public static void initialize_24(Object var0, boolean var1) {
      methodHandle_P.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_25(Object var0, float var1) {
      methodHandle_Q.invoke((Object)var0, (float)var1);
   }

   public static void initialize_26(Object var0, boolean var1) {
      methodHandle_R.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_27(Object var0, int var1, int var2, int var3) {
      methodHandle_S.invoke((Object)var0, (int)var1, (int)var2, (int)var3);
   }

   public static float getFloat_5(Object var0) {
      return (float)methodHandle_T.invoke((Object)var0);
   }

   public static void initialize_28(Object var0, float var1) {
      methodHandle_U.invoke((Object)var0, (float)var1);
   }

   public static void initialize_29(Object var0, int var1) {
      methodHandle_V.invoke((Object)var0, (int)var1);
   }

   public static Block getBlock(Object var0) {
      return (Block)methodHandle_W.invoke((Object)var0);
   }

   public static void initialize_30(Object var0, float var1) {
      methodHandle_X.invoke((Object)var0, (float)var1);
   }

   public static void initialize_31(Object var0, boolean var1) {
      methodHandle_Y.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_32(Object var0, int var1) {
      methodHandle_Z.invoke((Object)var0, (int)var1);
   }

   public static Object getObject_2() {
      return (Object)methodHandle_aa.invoke();
   }

   public static ItemStack getItemStack(Object var0) {
      return (ItemStack)methodHandle_ab.invoke((Object)var0);
   }

   public static Object getObject_3() {
      return (Object)methodHandle_ac.invoke();
   }

   public static void initialize_33(Object var0, boolean var1) {
      methodHandle_ad.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_34(Object var0) {
      methodHandle_ae.invoke((Object)var0);
   }

   public static int getValue_3(Object var0) {
      return (int)methodHandle_af.invoke((Object)var0);
   }

   public static Object getObject_4() {
      return (Object)methodHandle_ag.invoke();
   }

   public static void initialize_35(Object var0, int var1, int var2, int var3, long var4) {
      methodHandle_ah.invoke((Object)var0, (int)var1, (int)var2, (int)var3, (long)var4);
   }

   public static void initialize_36(Object var0, BlockPos var1) {
      methodHandle_ai.invoke((Object)var0, (BlockPos)var1);
   }

   public static void initialize_37(Object var0, int var1) {
      methodHandle_aj.invoke((Object)var0, (int)var1);
   }

   public static void initialize_38(Object var0, double var1) {
      methodHandle_ak.invoke((Object)var0, (double)var1);
   }

   public static DefaultResourcePack getDefaultResourcePack(Object var0) {
      return (DefaultResourcePack)methodHandle_al.invoke((Object)var0);
   }

   public static Object getObject_5() {
      return (Object)methodHandle_am.invoke();
   }

   public static float getFloat_6(Object var0) {
      return (float)methodHandle_an.invoke((Object)var0);
   }

   public static void initialize_39(Object var0, int var1) {
      methodHandle_ao.invoke((Object)var0, (int)var1);
   }

   public static int getValue_4(Object var0) {
      return (int)methodHandle_ap.invoke((Object)var0);
   }

   public static int getValue_5(Object var0) {
      return (int)methodHandle_aq.invoke((Object)var0);
   }

   public static void initialize_40(Object var0, boolean var1) {
      methodHandle_ar.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_41(Object var0, float var1) {
      methodHandle_as.invoke((Object)var0, (float)var1);
   }

   public static void initialize_42(Object var0) {
      methodHandle_at.invoke((Object)var0);
   }

   public static Object getObject_6(Object var0) {
      return (Object)methodHandle_au.invoke((Object)var0);
   }

   public static void initialize_43(Object var0, int var1) {
      methodHandle_av.invoke((Object)var0, (int)var1);
   }

   public static void initialize_44(Object var0, int var1) {
      methodHandle_aw.invoke((Object)var0, (int)var1);
   }

   public static double getDouble_4(Object var0) {
      return (double)methodHandle_ax.invoke((Object)var0);
   }

   public static double getDouble_5(Object var0) {
      return (double)methodHandle_ay.invoke((Object)var0);
   }

   public static Object getObject_7() {
      return (Object)methodHandle_az.invoke();
   }

   public static StringTranslate getStringTranslate() {
      return (StringTranslate)methodHandle_aA.invoke();
   }

   public static Session getSession(Object var0) {
      return (Session)methodHandle_aB.invoke((Object)var0);
   }

   public static void initialize_45(Object var0, boolean var1) {
      methodHandle_aC.invoke((Object)var0, (boolean)var1);
   }

   public static Object getObject_8(Object var0) {
      return (Object)methodHandle_aD.invoke((Object)var0);
   }

   public static boolean isValid_4(Object var0) {
      return (boolean)methodHandle_aE.invoke((Object)var0);
   }

   public static void initialize_46(Object var0, Action var1) {
      methodHandle_aF.invoke((Object)var0, (Action)var1);
   }

   public static float getFloat_7(Object var0) {
      return (float)methodHandle_aG.invoke((Object)var0);
   }

   public static boolean isValid_5(Object var0) {
      return (boolean)methodHandle_aH.invoke((Object)var0);
   }

   public static void initialize_47(Object var0, boolean var1) {
      methodHandle_aI.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_48(int var0) {
      methodHandle_aJ.invoke((int)var0);
   }

   public static void initialize_49(Object var0, float var1) {
      methodHandle_aK.invoke((Object)var0, (float)var1);
   }

   public static void initialize_50(Object var0, boolean var1) {
      methodHandle_aL.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_51(Object var0, double var1) {
      methodHandle_aM.invoke((Object)var0, (double)var1);
   }

   public static NetworkPlayerInfo getNetworkPlayerInfo(Object var0) {
      return (NetworkPlayerInfo)methodHandle_aN.invoke((Object)var0);
   }

   public static void initialize_52(Object var0, int var1, int var2, int var3) {
      methodHandle_aO.invoke((Object)var0, (int)var1, (int)var2, (int)var3);
   }

   public static boolean isValid_6(Object var0) {
      return (boolean)methodHandle_aP.invoke((Object)var0);
   }

   public static double getDouble_6(Object var0) {
      return (double)methodHandle_aQ.invoke((Object)var0);
   }

   public static Object getObject_9(Object var0) {
      return (Object)methodHandle_aR.invoke((Object)var0);
   }

   public static int getValue_6() {
      return (int)methodHandle_aS.invoke();
   }

   public static void initialize_53(Object var0, int var1) {
      methodHandle_aT.invoke((Object)var0, (int)var1);
   }

   public static double getDouble_7(Object var0) {
      return (double)methodHandle_aU.invoke((Object)var0);
   }

   public static void initialize_54(Object var0, int var1) {
      methodHandle_aV.invoke((Object)var0, (int)var1);
   }

   public static void initialize_55(Object var0, net.minecraft.network.play.client.C0BPacketEntityAction.Action var1) {
      methodHandle_aW.invoke((Object)var0, (net.minecraft.network.play.client.C0BPacketEntityAction.Action)var1);
   }

   public static void initialize_56(Object var0, int var1) {
      methodHandle_aX.invoke((Object)var0, (int)var1);
   }

   @KeepParameters
   public static void initialize_57(Object var0, int var1) {
      methodHandle_aY.invoke((Object)var0, (int)var1);
   }

   public static void initialize_58(Object var0, int var1) {
      methodHandle_aZ.invoke((Object)var0, (int)var1);
   }

   public static Object getObject_10(Object var0) {
      return (Object)methodHandle_a0.invoke((Object)var0);
   }

   public static void initialize_59(Object var0, ItemStack var1) {
      methodHandle_a1.invoke((Object)var0, (ItemStack)var1);
   }

   public static int getValue_7(Object var0) {
      return (int)methodHandle_a2.invoke((Object)var0);
   }

   public static boolean isValid_7(Object var0, AxisAlignedBB var1) {
      return (boolean)methodHandle_a3.invoke((Object)var0, (AxisAlignedBB)var1);
   }

   public static void initialize_60(Object var0, double var1) {
      methodHandle_a4.invoke((Object)var0, (double)var1);
   }

   public static void initialize_61(Object var0, float var1) {
      methodHandle_a5.invoke((Object)var0, (float)var1);
   }

   public static void initialize_62(Object var0, float var1) {
      methodHandle_a6.invoke((Object)var0, (float)var1);
   }

   public static boolean isValid_8(Object var0) {
      return (boolean)methodHandle_a7.invoke((Object)var0);
   }

   public static double getDouble_8(Object var0) {
      return (double)methodHandle_a8.invoke((Object)var0);
   }

   public static Object getObject_11(Object var0) {
      return (Object)methodHandle_a9.invoke((Object)var0);
   }

   public static void initialize_63(Object var0, int var1) {
      methodHandle_a_.invoke((Object)var0, (int)var1);
   }

   public static void initialize_64(Object var0, short var1) {
      methodHandle_ba.invoke((Object)var0, (short)var1);
   }

   public static void initialize_65(Object var0, int var1) {
      methodHandle_bb.invoke((Object)var0, (int)var1);
   }

   public static void initialize_66(Object var0, float var1) {
      methodHandle_bc.invoke((Object)var0, (float)var1);
   }

   public static Object getObject_12() {
      return (Object)methodHandle_bd.invoke();
   }

   public static void initialize_67(Object var0, int var1) {
      methodHandle_be.invoke((Object)var0, (int)var1);
   }

   public static Object getObject_13() {
      return (Object)methodHandle_bf.invoke();
   }

   public static void initialize_68(Object var0) {
      methodHandle_bg.invoke((Object)var0);
   }

   public static void initialize_69(Object var0, boolean var1) {
      methodHandle_bh.invoke((Object)var0, (boolean)var1);
   }

   public static void initialize_70(Object var0, float var1) {
      methodHandle_bi.invoke((Object)var0, (float)var1);
   }

   public static float getFloat_8(Object var0) {
      return (float)methodHandle_bj.invoke((Object)var0);
   }

   public static void initialize_71(Object var0, int var1) {
      methodHandle_bk.invoke((Object)var0, (int)var1);
   }

   public static int getValue_8(Object var0) {
      return (int)methodHandle_bl.invoke((Object)var0);
   }

   public static Timer getTimer(Object var0) {
      return (Timer)methodHandle_bm.invoke((Object)var0);
   }

   public static Object getObject_14(Object var0) {
      return (Object)methodHandle_bn.invoke((Object)var0);
   }

   public static void initialize_72(Object var0) {
      methodHandle_bo.invoke((Object)var0);
   }

   public static void initialize_73(Object var0, int var1) {
      methodHandle_bp.invoke((Object)var0, (int)var1);
   }

   public static int getValue_9(Object var0) {
      return (int)methodHandle_bq.invoke((Object)var0);
   }

   public static Object getObject_15() {
      return (Object)methodHandle_br.invoke();
   }

   public static double getDouble_9(Object var0) {
      return (double)methodHandle_bs.invoke((Object)var0);
   }

   public static Object getObject_16() {
      return (Object)methodHandle_bt.invoke();
   }

   public static Object getObject_17() {
      return (Object)methodHandle_bu.invoke();
   }

   public static void initialize_74(Object var0, Vec3 var1) {
      methodHandle_bv.invoke((Object)var0, (Vec3)var1);
   }

   public static void initialize_75(Object var0, float var1) {
      methodHandle_bw.invoke((Object)var0, (float)var1);
   }

   public static void initialize_76(Object var0, net.minecraft.network.play.client.C02PacketUseEntity.Action var1) {
      methodHandle_bx.invoke((Object)var0, (net.minecraft.network.play.client.C02PacketUseEntity.Action)var1);
   }

   public static int getValue_10(Object var0) {
      return (int)methodHandle_by.invoke((Object)var0);
   }

   public static void initialize_77(Object var0, boolean var1) {
      methodHandle_bz.invoke((Object)var0, (boolean)var1);
   }

   public static boolean isValid_9(Object var0) {
      return (boolean)methodHandle_bA.invoke((Object)var0);
   }

   static {
      long var0 = StringDecryptor.getIBreezeInterface3(6635621853897941056L, 5977178655428232778L, MethodHandles.lookup().lookupClass())
            .decryptKey(197811448177824L)
         ^ 11323452852095L;
      if (getString() == null) {
         initialize_78("RXiqAb");
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[156];
      int var5 = 0;
      String var6 = "\u009c2\u0011M\u0092n\u0011.¸´üÛ\u0099m<2\u0010ÍÐ\u0012è\u0001\nXaùW\u0098a*\u0094ã'\u0010\u0001\u0017\u0010Sý¢yÏ\u008c%¤Áò´A\u0014\u0010]¡¿ºåÐam¾(Ç^mv \u0006\u0010ÍÐ\u0012è\u0001\nXa\u001b\u0098QT¸ãôI\u0010ÍÐ\u0012è\u0001\nXaÉí\u001b¿_\u0016ß \u0010]¡¿ºåÐam\u0001³\u0095\u009aA\u009b\t\u0098\u0010]¡¿ºåÐam\u0019L\u0097[\u0011\u0097\u0016\u001e8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜW\u0017À\u0089}dîêeó}*ÔX\u008fb\u0010]¡¿ºåÐamÂ¦Å'âq¢_\u0010\u009b²ü»´V\u009cI0\u001f1^æÿSU\u0010ÍÐ\u0012è\u0001\nXa¯¬ââdÜË3\u0010\u009c2\u0011M\u0092n\u0011.\n\n}©Å\u0090æú\u0010\u009c2\u0011M\u0092n\u0011.e\u000b': fÙW\u0010ÍÐ\u0012è\u0001\nXaÇ\u0010M\u0088·Ä°b\u0010ÍÐ\u0012è\u0001\nXa\u007f\u001e÷\u0095n9\u0091·\u0010\u009c2\u0011M\u0092n\u0011.\n\n}©Å\u0090æú\u0010ÍÐ\u0012è\u0001\nXa=\"húFü´f\u00105ä\u000bÛ\u0087NK\u001d<µÅ m¾áá@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü¡\u008fB{É¤\u0094\u0097¥.â\u0089VH\u0017p^\u000bõIçîUm\u0010¶ÌÐ5Ç3x\"(<\u000bíè\u0096ìH\u0010]¡¿ºåÐamXìE§'ºÜÒ\u0010]¡¿ºåÐam°4\u0019\"\u0099YÈ\u0012\u0010]¡¿ºåÐamS¸l¡\r\u0013\u0001\u001d\u0010]¡¿ºåÐamIpÕÂ;\b2h\u0010ÍÐ\u0012è\u0001\nXaêSÜFohõ\u0003\u0010ÍÐ\u0012è\u0001\nXa\u008aj,p^î´¶\u0010\"Öåó[]d\u001e\u009f»ÊÁ¿ :Û\u0010]¡¿ºåÐamÔ\u008b/vÇ\u0096à\u009c\u0010]¡¿ºåÐam\u001cÃ\u0004YÚa±\u00028~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜàA,\rÁò\u0010rùu|N4#\u0087Å\u0010]¡¿ºåÐam±\u0003$ó@\u007f<\u008c\u0010]¡¿ºåÐamoJ«~ð±\u0094û\u0010\u009c2\u0011M\u0092n\u0011.Ä(\fõÓË\fì\u0010ÍÐ\u0012è\u0001\nXa\u0015\u001dÑß\u001b\u008cñ¼\u0010ÍÐ\u0012è\u0001\nXaÇAe\u001d\u001e@Ïb@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜàA,\rÁò\u0010r\u0089-\u0003òe°F{Á\u0010IÜeÅÔ\u0000\u0010\u009c2\u0011M\u0092n\u0011.ýì5iÚÇk}\u0010ÍÐ\u0012è\u0001\nXa³'ÚS&\u000e%¤\u0010ÍÐ\u0012è\u0001\nXaJ\u0090\u0015þå\u0090r$\u0010\u009b²ü»´V\u009cI\u0085!+@++çù\u0010]¡¿ºåÐam\u0081¤\u0015yI\u0083\u0002â\u0010ÍÐ\u0012è\u0001\nXa`Z\u001d\u0080ÐÝ^¯\u0010ÍÐ\u0012è\u0001\nXa³'ÚS&\u000e%¤\u0010¼gJ\u0017ö\u0000ÜÕ[\"zü\u0014X½c\u0010\u009c2\u0011M\u0092n\u0011.e\u000b': fÙW\u0010]¡¿ºåÐam)\u0084Ù\u0096\u0080Ó\u009cÆ\u0010ì\u008c\u0091÷L\u0084\u0093O¤àÈ\bs\u008b8v\u0010]¡¿ºåÐam\u0081»#QÁ \f\u0083\u0010Ñh\u0012\feÝñõÄpJ/kë<Ñ\u0010ÍÐ\u0012è\u0001\nXa\u0012î\u0018+:Î\u009b¥\u0010ÍÐ\u0012è\u0001\nXa]\u0007\u0000UN|e\u0003\u0010]¡¿ºåÐam\u001eB\u0003V\u0088Äü\u0084\u0010Ñh\u0012\feÝñõøºUÕh÷×¦\u0010]¡¿ºåÐam\u0081ø¼áN\u000f@\u0095\u0010]¡¿ºåÐam@\u000f´Uâk8¾\u0010]¡¿ºåÐamú(¼ÁA?rM\u0010]¡¿ºåÐam¼3E6\u001eCHQ\u0010]¡¿ºåÐamH{·V¯Óg,\u0010\u009b²ü»´V\u009cIÃÏ\u008eÍo\u0093H\u000f\u0010ÍÐ\u0012è\u0001\nXaú:*²\u0085n\u001fJ\u0010]¡¿ºåÐam°4\u0019\"\u0099YÈ\u0012\u0010ì\u008c\u0091÷L\u0084\u0093O\u000eôå\u001e$\u0012/\u0084\u0010]¡¿ºåÐam\b\u001dKs\u009e6Ë\u008a\u0010]¡¿ºåÐam9ø)Ï¬!S(8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜÕ[\u001cA\u001aÌO\u001e\u0085\\Ç\u0090;^þí\u0010ÍÐ\u0012è\u0001\nXaú:*²\u0085n\u001fJ\u0010\u0001\u0017\u0010Sý¢yÏûWÞ|wIù¸8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ün\u000e\u000fmqXn§4\\ï·D@M¶\u0010]¡¿ºåÐam\u009a\u001b4\u007f¢pRd\u0010ÍÐ\u0012è\u0001\nXaJ\u0086©X&Çf\u009f\u0010ÍÐ\u0012è\u0001\nXaLu\u0002´`q\"\u0097\u0010¹\u0002\u0007úlùI¯·ü\u009a?ú4´×\u0010]¡¿ºåÐam\u0002üK\u0099=\u001aPü8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜÕ[\u001cA\u001aÌO\u001e\u0085\\Ç\u0090;^þí\u0010]¡¿ºåÐam¹ì®r\u00ad4\u0094\u0011\u0010ÍÐ\u0012è\u0001\nXaµÁ[\u0085!ÿ¬è\u0010]¡¿ºåÐam£\u0019ª\u001fªë¿·\u0010ÍÐ\u0012è\u0001\nXal¦;\u0085Ìå\t²\u0010]¡¿ºåÐam\u0093\fF°IÒÐ_\u0010¹\u0002\u0007úlùI¯ÚãÏIíT½\u0099\u0010ÍÐ\u0012è\u0001\nXal¦;\u0085Ìå\t²\u0010$`è§U\u0099M\u000bDÛut\u0017·ñ~8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u001eù\u00041¨â/\u0099£i*º\r¦|é\u0010]¡¿ºåÐam_DêÓ@\u0081y@\u0010]¡¿ºåÐamGÜjjt\u0012ÓÃ\u0010]¡¿ºåÐam'iëw\u0099|ty8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u0018\u0082·ð\u0093åÅ\u009d#46\u008f/SQ&\u0010ÍÐ\u0012è\u0001\nXa¤wQ±¶Z¬Ã\u0010]¡¿ºåÐam£\u0019ª\u001fªë¿·\u0010ÍÐ\u0012è\u0001\nXa\u0092\u008c\u0010ºaËIV\u0010ÍÐ\u0012è\u0001\nXaîÒA©×0Æd\u0010]¡¿ºåÐam\r\u000f½høÇÓú@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Üj\u0015\u0095\u0017Á¬\u0099\u0087¾¢\u008b¾4f«\u008b\u00907\u0094D|\u000e=\u0080\u0010ÍÐ\u0012è\u0001\nXaô\u0099\u0017\u0095jé(Ä\u0010ÍÐ\u0012è\u0001\nXaêSÜFohõ\u0003\u0010ÍÐ\u0012è\u0001\nXa½ø £$GÍT\u0010ÍÐ\u0012è\u0001\nXaØx\u0081\u0096µ©Â%\u0010ÍÐ\u0012è\u0001\nXa. Æ D½><\u0010ÍÐ\u0012è\u0001\nXa½\u009b;}»Ö¡k\u0010\u009c2\u0011M\u0092n\u0011.µ\n\u009eLr\u001e/Ú\u0010ÍÐ\u0012è\u0001\nXa\u008bU\t\u0099\u0096RÔ\u0001\u0010ÍÐ\u0012è\u0001\nXa ð\t~x¾¶ª\u0010]¡¿ºåÐamB\u009f\u001eð%kýJ\u0010]¡¿ºåÐam\u0017A\u0093P7|MZ8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜW\u0017À\u0089}dîêeó}*ÔX\u008fb\u0010]¡¿ºåÐamb \u0007\r¢ú° \u0010¹\u0002\u0007úlùI¯6ö.\u0006Âh\u00ad$\u0010]¡¿ºåÐamÀmÏ\u000eÔ700\u0010ÍÐ\u0012è\u0001\nXa\u0017×èæílÐ\f\u0010]¡¿ºåÐam\u000e\u0017ÛO\u008e\u008fÁæ\u0010$`è§U\u0099M\u000b¼¼\u0090ïSiP\u0091\u0010]¡¿ºåÐam\u001cÃ\u0004YÚa±\u0002\u0010Ñh\u0012\feÝñõøºUÕh÷×¦\u0010\u009fjÏ7/-Q`³¶&\u00ad¢wè\u008d\u0010(JJÉÉð\u0097¿¯²¢d\u0089å(§\u0010ÍÐ\u0012è\u0001\nXaê\u009f§\u0015¡1Èª\u0010]¡¿ºåÐamÕï\u009eo·Acú\u0010\u0001\u0017\u0010Sý¢yÏyÏ8\u0083mk\u0088\u0098\u0010]¡¿ºåÐam\u0093\fF°IÒÐ_\u0010\u009c2\u0011M\u0092n\u0011.µ\n\u009eLr\u001e/Ú\u0010]¡¿ºåÐam\u0081»#QÁ \f\u0083\u0010]¡¿ºåÐam\u0003ÂWCQ*ÎÚ\u0010]¡¿ºåÐam'iëw\u0099|ty\u0010]¡¿ºåÐamÂ¦Å'âq¢_8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u001eù\u00041¨â/\u0099£i*º\r¦|é\u0010]¡¿ºåÐamÑ\u0002\u00adÿÆ\u009a*\u007f\u0010]¡¿ºåÐamW\u0019.4\u0017H¨\u001d\u0010]¡¿ºåÐamÑõ¦õ³¿\u0097§\u0010ÍÐ\u0012è\u0001\nXam;ýí\u001b[¤\u0006\u0010\u009c2\u0011M\u0092n\u0011.\u009d\f¸\u0015\u001cc\u001d\u008b\u0010ÍÐ\u0012è\u0001\nXaÐ\u008aj[\u007f\t\u009fã8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u0018\u0082·ð\u0093åÅ\u009d#46\u008f/SQ&\u0010ÍÐ\u0012è\u0001\nXa\u009c0&h\u008c|¿{@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Üj\u0015\u0095\u0017Á¬\u0099\u0087¾¢\u008b¾4f«\u008b\u00907\u0094D|\u000e=\u0080\u0010]¡¿ºåÐamÅL;,ýÏ8ê\u0010]¡¿ºåÐam§.\u0090\u001a\u0010v¦\u0000\u0010/Hf\t\u0013YænX´fÝ\u0082ÒlÒ\u0010]¡¿ºåÐamÕï\u009eo·Acú\u0010ÍÐ\u0012è\u0001\nXa\u009c0&h\u008c|¿{\u0010ÍÐ\u0012è\u0001\nXa\u0081\u0085ôh¡\u008f\u0011\u001f\u0010\u0001\u0017\u0010Sý¢yÏÛf=Úx\u0011XË\u0010]¡¿ºåÐam\u009a\u001b4\u007f¢pRd\u0010ÍÐ\u0012è\u0001\nXaØx\u0081\u0096µ©Â%\u0010\u0001\u0017\u0010Sý¢yÏpSÚ¶\u0013\u0088\u0018f\u0010\u009c2\u0011M\u0092n\u0011.\u0088ëø\u009a\u0084=³\u0090\u0010]¡¿ºåÐamp\u009f7Ô÷W\u000e\u0087\u0010\"Öåó[]d\u001eÕ\u0006z\n$y®ý\u0010\u009b²ü»´V\u009cI0\u001f1^æÿSU\u0010ÍÐ\u0012è\u0001\nXa. Æ D½><\u0010]¡¿ºåÐam¡3åot£¯\u0094\u0010]¡¿ºåÐamS¸l¡\r\u0013\u0001\u001d\u0010ÍÐ\u0012è\u0001\nXa,äl\u0002´°!ý\u0010ÍÐ\u0012è\u0001\nXaku!ó³üh²";
      int var7 = "\u009c2\u0011M\u0092n\u0011.¸´üÛ\u0099m<2\u0010ÍÐ\u0012è\u0001\nXaùW\u0098a*\u0094ã'\u0010\u0001\u0017\u0010Sý¢yÏ\u008c%¤Áò´A\u0014\u0010]¡¿ºåÐam¾(Ç^mv \u0006\u0010ÍÐ\u0012è\u0001\nXa\u001b\u0098QT¸ãôI\u0010ÍÐ\u0012è\u0001\nXaÉí\u001b¿_\u0016ß \u0010]¡¿ºåÐam\u0001³\u0095\u009aA\u009b\t\u0098\u0010]¡¿ºåÐam\u0019L\u0097[\u0011\u0097\u0016\u001e8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜW\u0017À\u0089}dîêeó}*ÔX\u008fb\u0010]¡¿ºåÐamÂ¦Å'âq¢_\u0010\u009b²ü»´V\u009cI0\u001f1^æÿSU\u0010ÍÐ\u0012è\u0001\nXa¯¬ââdÜË3\u0010\u009c2\u0011M\u0092n\u0011.\n\n}©Å\u0090æú\u0010\u009c2\u0011M\u0092n\u0011.e\u000b': fÙW\u0010ÍÐ\u0012è\u0001\nXaÇ\u0010M\u0088·Ä°b\u0010ÍÐ\u0012è\u0001\nXa\u007f\u001e÷\u0095n9\u0091·\u0010\u009c2\u0011M\u0092n\u0011.\n\n}©Å\u0090æú\u0010ÍÐ\u0012è\u0001\nXa=\"húFü´f\u00105ä\u000bÛ\u0087NK\u001d<µÅ m¾áá@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü¡\u008fB{É¤\u0094\u0097¥.â\u0089VH\u0017p^\u000bõIçîUm\u0010¶ÌÐ5Ç3x\"(<\u000bíè\u0096ìH\u0010]¡¿ºåÐamXìE§'ºÜÒ\u0010]¡¿ºåÐam°4\u0019\"\u0099YÈ\u0012\u0010]¡¿ºåÐamS¸l¡\r\u0013\u0001\u001d\u0010]¡¿ºåÐamIpÕÂ;\b2h\u0010ÍÐ\u0012è\u0001\nXaêSÜFohõ\u0003\u0010ÍÐ\u0012è\u0001\nXa\u008aj,p^î´¶\u0010\"Öåó[]d\u001e\u009f»ÊÁ¿ :Û\u0010]¡¿ºåÐamÔ\u008b/vÇ\u0096à\u009c\u0010]¡¿ºåÐam\u001cÃ\u0004YÚa±\u00028~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜàA,\rÁò\u0010rùu|N4#\u0087Å\u0010]¡¿ºåÐam±\u0003$ó@\u007f<\u008c\u0010]¡¿ºåÐamoJ«~ð±\u0094û\u0010\u009c2\u0011M\u0092n\u0011.Ä(\fõÓË\fì\u0010ÍÐ\u0012è\u0001\nXa\u0015\u001dÑß\u001b\u008cñ¼\u0010ÍÐ\u0012è\u0001\nXaÇAe\u001d\u001e@Ïb@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜàA,\rÁò\u0010r\u0089-\u0003òe°F{Á\u0010IÜeÅÔ\u0000\u0010\u009c2\u0011M\u0092n\u0011.ýì5iÚÇk}\u0010ÍÐ\u0012è\u0001\nXa³'ÚS&\u000e%¤\u0010ÍÐ\u0012è\u0001\nXaJ\u0090\u0015þå\u0090r$\u0010\u009b²ü»´V\u009cI\u0085!+@++çù\u0010]¡¿ºåÐam\u0081¤\u0015yI\u0083\u0002â\u0010ÍÐ\u0012è\u0001\nXa`Z\u001d\u0080ÐÝ^¯\u0010ÍÐ\u0012è\u0001\nXa³'ÚS&\u000e%¤\u0010¼gJ\u0017ö\u0000ÜÕ[\"zü\u0014X½c\u0010\u009c2\u0011M\u0092n\u0011.e\u000b': fÙW\u0010]¡¿ºåÐam)\u0084Ù\u0096\u0080Ó\u009cÆ\u0010ì\u008c\u0091÷L\u0084\u0093O¤àÈ\bs\u008b8v\u0010]¡¿ºåÐam\u0081»#QÁ \f\u0083\u0010Ñh\u0012\feÝñõÄpJ/kë<Ñ\u0010ÍÐ\u0012è\u0001\nXa\u0012î\u0018+:Î\u009b¥\u0010ÍÐ\u0012è\u0001\nXa]\u0007\u0000UN|e\u0003\u0010]¡¿ºåÐam\u001eB\u0003V\u0088Äü\u0084\u0010Ñh\u0012\feÝñõøºUÕh÷×¦\u0010]¡¿ºåÐam\u0081ø¼áN\u000f@\u0095\u0010]¡¿ºåÐam@\u000f´Uâk8¾\u0010]¡¿ºåÐamú(¼ÁA?rM\u0010]¡¿ºåÐam¼3E6\u001eCHQ\u0010]¡¿ºåÐamH{·V¯Óg,\u0010\u009b²ü»´V\u009cIÃÏ\u008eÍo\u0093H\u000f\u0010ÍÐ\u0012è\u0001\nXaú:*²\u0085n\u001fJ\u0010]¡¿ºåÐam°4\u0019\"\u0099YÈ\u0012\u0010ì\u008c\u0091÷L\u0084\u0093O\u000eôå\u001e$\u0012/\u0084\u0010]¡¿ºåÐam\b\u001dKs\u009e6Ë\u008a\u0010]¡¿ºåÐam9ø)Ï¬!S(8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜÕ[\u001cA\u001aÌO\u001e\u0085\\Ç\u0090;^þí\u0010ÍÐ\u0012è\u0001\nXaú:*²\u0085n\u001fJ\u0010\u0001\u0017\u0010Sý¢yÏûWÞ|wIù¸8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ün\u000e\u000fmqXn§4\\ï·D@M¶\u0010]¡¿ºåÐam\u009a\u001b4\u007f¢pRd\u0010ÍÐ\u0012è\u0001\nXaJ\u0086©X&Çf\u009f\u0010ÍÐ\u0012è\u0001\nXaLu\u0002´`q\"\u0097\u0010¹\u0002\u0007úlùI¯·ü\u009a?ú4´×\u0010]¡¿ºåÐam\u0002üK\u0099=\u001aPü8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜÕ[\u001cA\u001aÌO\u001e\u0085\\Ç\u0090;^þí\u0010]¡¿ºåÐam¹ì®r\u00ad4\u0094\u0011\u0010ÍÐ\u0012è\u0001\nXaµÁ[\u0085!ÿ¬è\u0010]¡¿ºåÐam£\u0019ª\u001fªë¿·\u0010ÍÐ\u0012è\u0001\nXal¦;\u0085Ìå\t²\u0010]¡¿ºåÐam\u0093\fF°IÒÐ_\u0010¹\u0002\u0007úlùI¯ÚãÏIíT½\u0099\u0010ÍÐ\u0012è\u0001\nXal¦;\u0085Ìå\t²\u0010$`è§U\u0099M\u000bDÛut\u0017·ñ~8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u001eù\u00041¨â/\u0099£i*º\r¦|é\u0010]¡¿ºåÐam_DêÓ@\u0081y@\u0010]¡¿ºåÐamGÜjjt\u0012ÓÃ\u0010]¡¿ºåÐam'iëw\u0099|ty8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u0018\u0082·ð\u0093åÅ\u009d#46\u008f/SQ&\u0010ÍÐ\u0012è\u0001\nXa¤wQ±¶Z¬Ã\u0010]¡¿ºåÐam£\u0019ª\u001fªë¿·\u0010ÍÐ\u0012è\u0001\nXa\u0092\u008c\u0010ºaËIV\u0010ÍÐ\u0012è\u0001\nXaîÒA©×0Æd\u0010]¡¿ºåÐam\r\u000f½høÇÓú@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Üj\u0015\u0095\u0017Á¬\u0099\u0087¾¢\u008b¾4f«\u008b\u00907\u0094D|\u000e=\u0080\u0010ÍÐ\u0012è\u0001\nXaô\u0099\u0017\u0095jé(Ä\u0010ÍÐ\u0012è\u0001\nXaêSÜFohõ\u0003\u0010ÍÐ\u0012è\u0001\nXa½ø £$GÍT\u0010ÍÐ\u0012è\u0001\nXaØx\u0081\u0096µ©Â%\u0010ÍÐ\u0012è\u0001\nXa. Æ D½><\u0010ÍÐ\u0012è\u0001\nXa½\u009b;}»Ö¡k\u0010\u009c2\u0011M\u0092n\u0011.µ\n\u009eLr\u001e/Ú\u0010ÍÐ\u0012è\u0001\nXa\u008bU\t\u0099\u0096RÔ\u0001\u0010ÍÐ\u0012è\u0001\nXa ð\t~x¾¶ª\u0010]¡¿ºåÐamB\u009f\u001eð%kýJ\u0010]¡¿ºåÐam\u0017A\u0093P7|MZ8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090ÜW\u0017À\u0089}dîêeó}*ÔX\u008fb\u0010]¡¿ºåÐamb \u0007\r¢ú° \u0010¹\u0002\u0007úlùI¯6ö.\u0006Âh\u00ad$\u0010]¡¿ºåÐamÀmÏ\u000eÔ700\u0010ÍÐ\u0012è\u0001\nXa\u0017×èæílÐ\f\u0010]¡¿ºåÐam\u000e\u0017ÛO\u008e\u008fÁæ\u0010$`è§U\u0099M\u000b¼¼\u0090ïSiP\u0091\u0010]¡¿ºåÐam\u001cÃ\u0004YÚa±\u0002\u0010Ñh\u0012\feÝñõøºUÕh÷×¦\u0010\u009fjÏ7/-Q`³¶&\u00ad¢wè\u008d\u0010(JJÉÉð\u0097¿¯²¢d\u0089å(§\u0010ÍÐ\u0012è\u0001\nXaê\u009f§\u0015¡1Èª\u0010]¡¿ºåÐamÕï\u009eo·Acú\u0010\u0001\u0017\u0010Sý¢yÏyÏ8\u0083mk\u0088\u0098\u0010]¡¿ºåÐam\u0093\fF°IÒÐ_\u0010\u009c2\u0011M\u0092n\u0011.µ\n\u009eLr\u001e/Ú\u0010]¡¿ºåÐam\u0081»#QÁ \f\u0083\u0010]¡¿ºåÐam\u0003ÂWCQ*ÎÚ\u0010]¡¿ºåÐam'iëw\u0099|ty\u0010]¡¿ºåÐamÂ¦Å'âq¢_8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u001eù\u00041¨â/\u0099£i*º\r¦|é\u0010]¡¿ºåÐamÑ\u0002\u00adÿÆ\u009a*\u007f\u0010]¡¿ºåÐamW\u0019.4\u0017H¨\u001d\u0010]¡¿ºåÐamÑõ¦õ³¿\u0097§\u0010ÍÐ\u0012è\u0001\nXam;ýí\u001b[¤\u0006\u0010\u009c2\u0011M\u0092n\u0011.\u009d\f¸\u0015\u001cc\u001d\u008b\u0010ÍÐ\u0012è\u0001\nXaÐ\u008aj[\u007f\t\u009fã8~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Ü\u0018\u0082·ð\u0093åÅ\u009d#46\u008f/SQ&\u0010ÍÐ\u0012è\u0001\nXa\u009c0&h\u008c|¿{@~´-©ó\u0011Á¦\u007fÍ\u009c¨\u0016/F\u001f°g#\u0014®o¤ÜLàI\u0089¸\u001a×UÛå'ú%\u008e\u0090Üj\u0015\u0095\u0017Á¬\u0099\u0087¾¢\u008b¾4f«\u008b\u00907\u0094D|\u000e=\u0080\u0010]¡¿ºåÐamÅL;,ýÏ8ê\u0010]¡¿ºåÐam§.\u0090\u001a\u0010v¦\u0000\u0010/Hf\t\u0013YænX´fÝ\u0082ÒlÒ\u0010]¡¿ºåÐamÕï\u009eo·Acú\u0010ÍÐ\u0012è\u0001\nXa\u009c0&h\u008c|¿{\u0010ÍÐ\u0012è\u0001\nXa\u0081\u0085ôh¡\u008f\u0011\u001f\u0010\u0001\u0017\u0010Sý¢yÏÛf=Úx\u0011XË\u0010]¡¿ºåÐam\u009a\u001b4\u007f¢pRd\u0010ÍÐ\u0012è\u0001\nXaØx\u0081\u0096µ©Â%\u0010\u0001\u0017\u0010Sý¢yÏpSÚ¶\u0013\u0088\u0018f\u0010\u009c2\u0011M\u0092n\u0011.\u0088ëø\u009a\u0084=³\u0090\u0010]¡¿ºåÐamp\u009f7Ô÷W\u000e\u0087\u0010\"Öåó[]d\u001eÕ\u0006z\n$y®ý\u0010\u009b²ü»´V\u009cI0\u001f1^æÿSU\u0010ÍÐ\u0012è\u0001\nXa. Æ D½><\u0010]¡¿ºåÐam¡3åot£¯\u0094\u0010]¡¿ºåÐamS¸l¡\r\u0013\u0001\u001d\u0010ÍÐ\u0012è\u0001\nXa,äl\u0002´°!ý\u0010ÍÐ\u0012è\u0001\nXaku!ó³üh²"
         .length();
      char var8 = 16;
      int var12 = -1;

      label32:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var303 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var303;
                  if ((var12 += var8) >= var7) {
                     Lookup var15 = MethodHandles.lookup();
                     Field var160 = C07PacketPlayerDigging.class.getDeclaredField(var4[92]);
                     var160.setAccessible(true);
                     methodHandle_a = var15.unreflectSetter(var160);
                     Lookup var16 = MethodHandles.lookup();
                     Method var161 = Class.forName(var4[134]).getDeclaredMethod(var4[82]);
                     var161.setAccessible(true);
                     methodHandle_b = var16.unreflect(var161);
                     Lookup var17 = MethodHandles.lookup();
                     Field var162 = EntityPlayerSP.class.getDeclaredField(var4[119]);
                     var162.setAccessible(true);
                     methodHandle_c = var17.unreflectSetter(var162);
                     Lookup var18 = MethodHandles.lookup();
                     Field var163 = C07PacketPlayerDigging.class.getDeclaredField(var4[126]);
                     var163.setAccessible(true);
                     methodHandle_d = var18.unreflectSetter(var163);
                     Lookup var19 = MethodHandles.lookup();
                     Field var164 = Minecraft.class.getDeclaredField(var4[12]);
                     var164.setAccessible(true);
                     methodHandle_e = var19.unreflectSetter(var164);
                     Lookup var20 = MethodHandles.lookup();
                     Field var165 = GlStateManager.class.getDeclaredField(var4[52]);
                     var165.setAccessible(true);
                     methodHandle_f = var20.unreflectGetter(var165);
                     Lookup var21 = MethodHandles.lookup();
                     Field var166 = C0CPacketInput.class.getDeclaredField(var4[51]);
                     var166.setAccessible(true);
                     methodHandle_g = var21.unreflectSetter(var166);
                     Lookup var22 = MethodHandles.lookup();
                     Field var167 = EntityOtherPlayerMP.class.getDeclaredField(var4[145]);
                     var167.setAccessible(true);
                     methodHandle_h = var22.unreflectGetter(var167);
                     Lookup var23 = MethodHandles.lookup();
                     Field var168 = EntityPlayerSP.class.getDeclaredField(var4[151]);
                     var168.setAccessible(true);
                     methodHandle_i = var23.unreflectSetter(var168);
                     Lookup var24 = MethodHandles.lookup();
                     Field var169 = C00PacketKeepAlive.class.getDeclaredField(var4[88]);
                     var169.setAccessible(true);
                     methodHandle_j = var24.unreflectSetter(var169);
                     Lookup var25 = MethodHandles.lookup();
                     Field var170 = Minecraft.class.getDeclaredField(var4[13]);
                     var170.setAccessible(true);
                     methodHandle_k = var25.unreflectGetter(var170);
                     Lookup var26 = MethodHandles.lookup();
                     Field var171 = EntityPlayerSP.class.getDeclaredField(var4[86]);
                     var171.setAccessible(true);
                     methodHandle_l = var26.unreflectSetter(var171);
                     Lookup var27 = MethodHandles.lookup();
                     Field var172 = C0CPacketInput.class.getDeclaredField(var4[39]);
                     var172.setAccessible(true);
                     methodHandle_m = var27.unreflectSetter(var172);
                     Lookup var28 = MethodHandles.lookup();
                     Field var173 = S12PacketEntityVelocity.class.getDeclaredField(var4[95]);
                     var173.setAccessible(true);
                     methodHandle_n = var28.unreflectSetter(var173);
                     Lookup var29 = MethodHandles.lookup();
                     Field var174 = S27PacketExplosion.class.getDeclaredField(var4[66]);
                     var174.setAccessible(true);
                     methodHandle_o = var29.unreflectSetter(var174);
                     Lookup var30 = MethodHandles.lookup();
                     Field var175 = C02PacketUseEntity.class.getDeclaredField(var4[5]);
                     var175.setAccessible(true);
                     methodHandle_p = var30.unreflectSetter(var175);
                     Lookup var31 = MethodHandles.lookup();
                     Field var176 = C01PacketChatMessage.class.getDeclaredField(var4[96]);
                     var176.setAccessible(true);
                     methodHandle_q = var31.unreflectSetter(var176);
                     Lookup var32 = MethodHandles.lookup();
                     Field var177 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[26]);
                     var177.setAccessible(true);
                     methodHandle_r = var32.unreflectSetter(var177);
                     Lookup var33 = MethodHandles.lookup();
                     Field var178 = RenderManager.class.getDeclaredField(var4[2]);
                     var178.setAccessible(true);
                     methodHandle_s = var33.unreflectGetter(var178);
                     Lookup var34 = MethodHandles.lookup();
                     Field var179 = GuiPlayerTabOverlay.class.getDeclaredField(var4[6]);
                     var179.setAccessible(true);
                     methodHandle_t = var34.unreflectGetter(var179);
                     Lookup var35 = MethodHandles.lookup();
                     Field var180 = S27PacketExplosion.class.getDeclaredField(var4[60]);
                     var180.setAccessible(true);
                     methodHandle_u = var35.unreflectGetter(var180);
                     Lookup var36 = MethodHandles.lookup();
                     Field var181 = NetworkPlayerInfo.class.getDeclaredField(var4[146]);
                     var181.setAccessible(true);
                     methodHandle_v = var36.unreflectGetter(var181);
                     Lookup var37 = MethodHandles.lookup();
                     Field var182 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[35]);
                     var182.setAccessible(true);
                     methodHandle_w = var37.unreflectSetter(var182);
                     Lookup var38 = MethodHandles.lookup();
                     Method var183 = GuiContainer.class.getDeclaredMethod(var4[72], int.class, int.class);
                     var183.setAccessible(true);
                     methodHandle_x = var38.unreflect(var183);
                     Lookup var39 = MethodHandles.lookup();
                     Field var184 = PlayerControllerMP.class.getDeclaredField(var4[141]);
                     var184.setAccessible(true);
                     methodHandle_y = var39.unreflectGetter(var184);
                     Lookup var40 = MethodHandles.lookup();
                     Field var185 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[140]);
                     var185.setAccessible(true);
                     methodHandle_z = var40.unreflectSetter(var185);
                     Lookup var41 = MethodHandles.lookup();
                     Method var186 = EntityRenderer.class.getDeclaredMethod(var4[155], float.class, boolean.class);
                     var186.setAccessible(true);
                     methodHandle_A = var41.unreflect(var186);
                     Lookup var42 = MethodHandles.lookup();
                     Method var187 = Entity.class.getDeclaredMethod(var4[47], float.class, float.class);
                     var187.setAccessible(true);
                     methodHandle_B = var42.unreflect(var187);
                     Lookup var43 = MethodHandles.lookup();
                     Field var188 = EntityPlayerSP.class.getDeclaredField(var4[154]);
                     var188.setAccessible(true);
                     methodHandle_C = var43.unreflectGetter(var188);
                     Lookup var44 = MethodHandles.lookup();
                     Field var189 = EntityOtherPlayerMP.class.getDeclaredField(var4[37]);
                     var189.setAccessible(true);
                     methodHandle_D = var44.unreflectGetter(var189);
                     Lookup var45 = MethodHandles.lookup();
                     Field var190 = EntityArrow.class.getDeclaredField(var4[59]);
                     var190.setAccessible(true);
                     methodHandle_E = var45.unreflectGetter(var190);
                     Lookup var46 = MethodHandles.lookup();
                     Field var191 = EntityPlayerSP.class.getDeclaredField(var4[121]);
                     var191.setAccessible(true);
                     methodHandle_F = var46.unreflectGetter(var191);
                     Lookup var47 = MethodHandles.lookup();
                     Field var192 = Class.forName(var4[74]).getDeclaredField(var4[9]);
                     var192.setAccessible(true);
                     methodHandle_G = var47.unreflectSetter(var192);
                     Lookup var48 = MethodHandles.lookup();
                     Field var193 = Class.forName(var4[65]).getDeclaredField(var4[29]);
                     var193.setAccessible(true);
                     methodHandle_H = var48.unreflectSetter(var193);
                     Lookup var49 = MethodHandles.lookup();
                     Field var194 = EntityLivingBase.class.getDeclaredField(var4[40]);
                     var194.setAccessible(true);
                     methodHandle_I = var49.unreflectGetter(var194);
                     Lookup var50 = MethodHandles.lookup();
                     Field var195 = Minecraft.class.getDeclaredField(var4[100]);
                     var195.setAccessible(true);
                     methodHandle_J = var50.unreflectGetter(var195);
                     Lookup var51 = MethodHandles.lookup();
                     Field var196 = C03PacketPlayer.class.getDeclaredField(var4[34]);
                     var196.setAccessible(true);
                     methodHandle_K = var51.unreflectSetter(var196);
                     Lookup var52 = MethodHandles.lookup();
                     Field var197 = C0EPacketClickWindow.class.getDeclaredField(var4[50]);
                     var197.setAccessible(true);
                     methodHandle_L = var52.unreflectSetter(var197);
                     Lookup var53 = MethodHandles.lookup();
                     Field var198 = PlayerControllerMP.class.getDeclaredField(var4[136]);
                     var198.setAccessible(true);
                     methodHandle_M = var53.unreflectGetter(var198);
                     Lookup var54 = MethodHandles.lookup();
                     Method var199 = Minecraft.class.getDeclaredMethod(var4[147]);
                     var199.setAccessible(true);
                     methodHandle_N = var54.unreflect(var199);
                     Lookup var55 = MethodHandles.lookup();
                     Field var200 = C0EPacketClickWindow.class.getDeclaredField(var4[42]);
                     var200.setAccessible(true);
                     methodHandle_O = var55.unreflectSetter(var200);
                     Lookup var56 = MethodHandles.lookup();
                     Field var201 = KeyBinding.class.getDeclaredField(var4[53]);
                     var201.setAccessible(true);
                     methodHandle_P = var56.unreflectSetter(var201);
                     Lookup var57 = MethodHandles.lookup();
                     Field var202 = S27PacketExplosion.class.getDeclaredField(var4[17]);
                     var202.setAccessible(true);
                     methodHandle_Q = var57.unreflectSetter(var202);
                     Lookup var58 = MethodHandles.lookup();
                     Field var203 = EntityPlayerSP.class.getDeclaredField(var4[142]);
                     var203.setAccessible(true);
                     methodHandle_R = var58.unreflectSetter(var203);
                     Lookup var59 = MethodHandles.lookup();
                     Method var204 = GuiScreen.class.getDeclaredMethod(var4[114], int.class, int.class, int.class);
                     var204.setAccessible(true);
                     methodHandle_S = var59.unreflect(var204);
                     Lookup var60 = MethodHandles.lookup();
                     Field var205 = ItemSword.class.getDeclaredField(var4[18]);
                     var205.setAccessible(true);
                     methodHandle_T = var60.unreflectGetter(var205);
                     Lookup var61 = MethodHandles.lookup();
                     Field var206 = Class.forName(var4[83]).getDeclaredField(var4[63]);
                     var206.setAccessible(true);
                     methodHandle_U = var61.unreflectSetter(var206);
                     Lookup var62 = MethodHandles.lookup();
                     Field var207 = Class.forName(var4[105]).getDeclaredField(var4[54]);
                     var207.setAccessible(true);
                     methodHandle_V = var62.unreflectSetter(var207);
                     Lookup var63 = MethodHandles.lookup();
                     Field var208 = ItemBucket.class.getDeclaredField(var4[137]);
                     var208.setAccessible(true);
                     methodHandle_W = var63.unreflectGetter(var208);
                     Lookup var64 = MethodHandles.lookup();
                     Field var209 = Class.forName(var4[125]).getDeclaredField(var4[7]);
                     var209.setAccessible(true);
                     methodHandle_X = var64.unreflectSetter(var209);
                     Lookup var65 = MethodHandles.lookup();
                     Field var210 = C03PacketPlayer.class.getDeclaredField(var4[15]);
                     var210.setAccessible(true);
                     methodHandle_Y = var65.unreflectSetter(var210);
                     Lookup var66 = MethodHandles.lookup();
                     Field var211 = C0EPacketClickWindow.class.getDeclaredField(var4[102]);
                     var211.setAccessible(true);
                     methodHandle_Z = var66.unreflectSetter(var211);
                     Lookup var67 = MethodHandles.lookup();
                     Field var212 = GlStateManager.class.getDeclaredField(var4[21]);
                     var212.setAccessible(true);
                     methodHandle_aa = var67.unreflectGetter(var212);
                     Lookup var68 = MethodHandles.lookup();
                     Field var213 = GuiContainer.class.getDeclaredField(var4[116]);
                     var213.setAccessible(true);
                     methodHandle_ab = var68.unreflectGetter(var213);
                     Lookup var69 = MethodHandles.lookup();
                     Field var214 = GlStateManager.class.getDeclaredField(var4[3]);
                     var214.setAccessible(true);
                     methodHandle_ac = var69.unreflectGetter(var214);
                     Lookup var70 = MethodHandles.lookup();
                     Field var215 = Class.forName(var4[93]).getDeclaredField(var4[22]);
                     var215.setAccessible(true);
                     methodHandle_ad = var70.unreflectSetter(var215);
                     Lookup var71 = MethodHandles.lookup();
                     Method var216 = Class.forName(var4[93]).getDeclaredMethod(var4[111]);
                     var216.setAccessible(true);
                     methodHandle_ae = var71.unreflect(var216);
                     Lookup var72 = MethodHandles.lookup();
                     Field var217 = S12PacketEntityVelocity.class.getDeclaredField(var4[43]);
                     var217.setAccessible(true);
                     methodHandle_af = var72.unreflectGetter(var217);
                     Lookup var73 = MethodHandles.lookup();
                     Field var218 = GlStateManager.class.getDeclaredField(var4[28]);
                     var218.setAccessible(true);
                     methodHandle_ag = var73.unreflectGetter(var218);
                     Lookup var74 = MethodHandles.lookup();
                     Method var219 = GuiScreen.class.getDeclaredMethod(var4[80], int.class, int.class, int.class, long.class);
                     var219.setAccessible(true);
                     methodHandle_ah = var74.unreflect(var219);
                     Lookup var75 = MethodHandles.lookup();
                     Field var220 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[75]);
                     var220.setAccessible(true);
                     methodHandle_ai = var75.unreflectSetter(var220);
                     Lookup var76 = MethodHandles.lookup();
                     Field var221 = S12PacketEntityVelocity.class.getDeclaredField(var4[149]);
                     var221.setAccessible(true);
                     methodHandle_aj = var76.unreflectSetter(var221);
                     Lookup var77 = MethodHandles.lookup();
                     Field var222 = EntityPlayerSP.class.getDeclaredField(var4[117]);
                     var222.setAccessible(true);
                     methodHandle_ak = var77.unreflectSetter(var222);
                     Lookup var78 = MethodHandles.lookup();
                     Field var223 = Minecraft.class.getDeclaredField(var4[20]);
                     var223.setAccessible(true);
                     methodHandle_al = var78.unreflectGetter(var223);
                     Lookup var79 = MethodHandles.lookup();
                     Field var224 = GlStateManager.class.getDeclaredField(var4[122]);
                     var224.setAccessible(true);
                     methodHandle_am = var79.unreflectGetter(var224);
                     Lookup var80 = MethodHandles.lookup();
                     Field var225 = Class.forName(var4[65]).getDeclaredField(var4[112]);
                     var225.setAccessible(true);
                     methodHandle_an = var80.unreflectGetter(var225);
                     Lookup var81 = MethodHandles.lookup();
                     Field var226 = C09PacketHeldItemChange.class.getDeclaredField(var4[91]);
                     var226.setAccessible(true);
                     methodHandle_ao = var81.unreflectSetter(var226);
                     Lookup var82 = MethodHandles.lookup();
                     Field var227 = S12PacketEntityVelocity.class.getDeclaredField(var4[98]);
                     var227.setAccessible(true);
                     methodHandle_ap = var82.unreflectGetter(var227);
                     Lookup var83 = MethodHandles.lookup();
                     Field var228 = EntityOtherPlayerMP.class.getDeclaredField(var4[33]);
                     var228.setAccessible(true);
                     methodHandle_aq = var83.unreflectGetter(var228);
                     Lookup var84 = MethodHandles.lookup();
                     Field var229 = Class.forName(var4[132]).getDeclaredField(var4[106]);
                     var229.setAccessible(true);
                     methodHandle_ar = var84.unreflectSetter(var229);
                     Lookup var85 = MethodHandles.lookup();
                     Field var230 = S27PacketExplosion.class.getDeclaredField(var4[97]);
                     var230.setAccessible(true);
                     methodHandle_as = var85.unreflectSetter(var230);
                     Lookup var86 = MethodHandles.lookup();
                     Method var231 = NetworkPlayerInfo.class.getDeclaredMethod(var4[44]);
                     var231.setAccessible(true);
                     methodHandle_at = var86.unreflect(var231);
                     Lookup var87 = MethodHandles.lookup();
                     Field var232 = Class.forName(var4[87]).getDeclaredField(var4[41]);
                     var232.setAccessible(true);
                     methodHandle_au = var87.unreflectGetter(var232);
                     Lookup var88 = MethodHandles.lookup();
                     Field var233 = Minecraft.class.getDeclaredField(var4[45]);
                     var233.setAccessible(true);
                     methodHandle_av = var88.unreflectSetter(var233);
                     Lookup var89 = MethodHandles.lookup();
                     Field var234 = S12PacketEntityVelocity.class.getDeclaredField(var4[38]);
                     var234.setAccessible(true);
                     methodHandle_aw = var89.unreflectSetter(var234);
                     Lookup var90 = MethodHandles.lookup();
                     Field var235 = RenderManager.class.getDeclaredField(var4[67]);
                     var235.setAccessible(true);
                     methodHandle_ax = var90.unreflectGetter(var235);
                     Lookup var91 = MethodHandles.lookup();
                     Field var236 = RenderManager.class.getDeclaredField(var4[118]);
                     var236.setAccessible(true);
                     methodHandle_ay = var91.unreflectGetter(var236);
                     Lookup var92 = MethodHandles.lookup();
                     Field var237 = GlStateManager.class.getDeclaredField(var4[103]);
                     var237.setAccessible(true);
                     methodHandle_az = var92.unreflectGetter(var237);
                     Lookup var93 = MethodHandles.lookup();
                     Field var238 = StringTranslate.class.getDeclaredField(var4[49]);
                     var238.setAccessible(true);
                     methodHandle_aA = var93.unreflectGetter(var238);
                     Lookup var94 = MethodHandles.lookup();
                     Field var239 = Minecraft.class.getDeclaredField(var4[16]);
                     var239.setAccessible(true);
                     methodHandle_aB = var94.unreflectGetter(var239);
                     Lookup var95 = MethodHandles.lookup();
                     Field var240 = Class.forName(var4[30]).getDeclaredField(var4[56]);
                     var240.setAccessible(true);
                     methodHandle_aC = var95.unreflectSetter(var240);
                     Lookup var96 = MethodHandles.lookup();
                     Field var241 = Class.forName(var4[68]).getDeclaredField(var4[150]);
                     var241.setAccessible(true);
                     methodHandle_aD = var96.unreflectGetter(var241);
                     Lookup var97 = MethodHandles.lookup();
                     Field var242 = EntityPlayerSP.class.getDeclaredField(var4[69]);
                     var242.setAccessible(true);
                     methodHandle_aE = var97.unreflectGetter(var242);
                     Lookup var98 = MethodHandles.lookup();
                     Field var243 = C07PacketPlayerDigging.class.getDeclaredField(var4[99]);
                     var243.setAccessible(true);
                     methodHandle_aF = var98.unreflectSetter(var243);
                     Lookup var99 = MethodHandles.lookup();
                     Field var244 = S27PacketExplosion.class.getDeclaredField(var4[143]);
                     var244.setAccessible(true);
                     methodHandle_aG = var99.unreflectGetter(var244);
                     Lookup var100 = MethodHandles.lookup();
                     Field var245 = PlayerControllerMP.class.getDeclaredField(var4[144]);
                     var245.setAccessible(true);
                     methodHandle_aH = var100.unreflectGetter(var245);
                     Lookup var101 = MethodHandles.lookup();
                     Field var246 = NetworkPlayerInfo.class.getDeclaredField(var4[84]);
                     var246.setAccessible(true);
                     methodHandle_aI = var101.unreflectSetter(var246);
                     Lookup var102 = MethodHandles.lookup();
                     Field var247 = GlStateManager.class.getDeclaredField(var4[77]);
                     var247.setAccessible(true);
                     methodHandle_aJ = var102.unreflectSetter(var247);
                     Lookup var103 = MethodHandles.lookup();
                     Field var248 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[90]);
                     var248.setAccessible(true);
                     methodHandle_aK = var103.unreflectSetter(var248);
                     Lookup var104 = MethodHandles.lookup();
                     Field var249 = C0FPacketConfirmTransaction.class.getDeclaredField(var4[133]);
                     var249.setAccessible(true);
                     methodHandle_aL = var104.unreflectSetter(var249);
                     Lookup var105 = MethodHandles.lookup();
                     Field var250 = C03PacketPlayer.class.getDeclaredField(var4[129]);
                     var250.setAccessible(true);
                     methodHandle_aM = var105.unreflectSetter(var250);
                     Lookup var106 = MethodHandles.lookup();
                     Field var251 = AbstractClientPlayer.class.getDeclaredField(var4[58]);
                     var251.setAccessible(true);
                     methodHandle_aN = var106.unreflectGetter(var251);
                     Lookup var107 = MethodHandles.lookup();
                     Method var252 = GuiScreen.class.getDeclaredMethod(var4[107], int.class, int.class, int.class);
                     var252.setAccessible(true);
                     methodHandle_aO = var107.unreflect(var252);
                     Lookup var108 = MethodHandles.lookup();
                     Field var253 = Class.forName(var4[93]).getDeclaredField(var4[61]);
                     var253.setAccessible(true);
                     methodHandle_aP = var108.unreflectGetter(var253);
                     Lookup var109 = MethodHandles.lookup();
                     Field var254 = EntityOtherPlayerMP.class.getDeclaredField(var4[0]);
                     var254.setAccessible(true);
                     methodHandle_aQ = var109.unreflectGetter(var254);
                     Lookup var110 = MethodHandles.lookup();
                     Field var255 = Class.forName(var4[125]).getDeclaredField(var4[32]);
                     var255.setAccessible(true);
                     methodHandle_aR = var110.unreflectGetter(var255);
                     Lookup var111 = MethodHandles.lookup();
                     Field var256 = GlStateManager.class.getDeclaredField(var4[89]);
                     var256.setAccessible(true);
                     methodHandle_aS = var111.unreflectGetter(var256);
                     Lookup var112 = MethodHandles.lookup();
                     Field var257 = C0FPacketConfirmTransaction.class.getDeclaredField(var4[152]);
                     var257.setAccessible(true);
                     methodHandle_aT = var112.unreflectSetter(var257);
                     Lookup var113 = MethodHandles.lookup();
                     Field var258 = EntityPlayerSP.class.getDeclaredField(var4[138]);
                     var258.setAccessible(true);
                     methodHandle_aU = var113.unreflectGetter(var258);
                     Lookup var114 = MethodHandles.lookup();
                     Field var259 = C0DPacketCloseWindow.class.getDeclaredField(var4[78]);
                     var259.setAccessible(true);
                     methodHandle_aV = var114.unreflectSetter(var259);
                     Lookup var115 = MethodHandles.lookup();
                     Field var260 = C0BPacketEntityAction.class.getDeclaredField(var4[70]);
                     var260.setAccessible(true);
                     methodHandle_aW = var115.unreflectSetter(var260);
                     Lookup var116 = MethodHandles.lookup();
                     Field var261 = C0EPacketClickWindow.class.getDeclaredField(var4[109]);
                     var261.setAccessible(true);
                     methodHandle_aX = var116.unreflectSetter(var261);
                     Lookup var117 = MethodHandles.lookup();
                     Field var262 = Minecraft.class.getDeclaredField(var4[120]);
                     var262.setAccessible(true);
                     methodHandle_aY = var117.unreflectSetter(var262);
                     Lookup var118 = MethodHandles.lookup();
                     Field var263 = Class.forName(var4[19]).getDeclaredField(var4[57]);
                     var263.setAccessible(true);
                     methodHandle_aZ = var118.unreflectSetter(var263);
                     Lookup var119 = MethodHandles.lookup();
                     Field var264 = Class.forName(var4[36]).getDeclaredField(var4[128]);
                     var264.setAccessible(true);
                     methodHandle_a0 = var119.unreflectGetter(var264);
                     Lookup var120 = MethodHandles.lookup();
                     Field var265 = C08PacketPlayerBlockPlacement.class.getDeclaredField(var4[11]);
                     var265.setAccessible(true);
                     methodHandle_a1 = var120.unreflectSetter(var265);
                     Lookup var121 = MethodHandles.lookup();
                     Field var266 = EntityLivingBase.class.getDeclaredField(var4[10]);
                     var266.setAccessible(true);
                     methodHandle_a2 = var121.unreflectGetter(var266);
                     Lookup var122 = MethodHandles.lookup();
                     Method var267 = Entity.class.getDeclaredMethod(var4[62], AxisAlignedBB.class);
                     var267.setAccessible(true);
                     methodHandle_a3 = var122.unreflect(var267);
                     Lookup var123 = MethodHandles.lookup();
                     Field var268 = C03PacketPlayer.class.getDeclaredField(var4[101]);
                     var268.setAccessible(true);
                     methodHandle_a4 = var123.unreflectSetter(var268);
                     Lookup var124 = MethodHandles.lookup();
                     Field var269 = C03PacketPlayer.class.getDeclaredField(var4[71]);
                     var269.setAccessible(true);
                     methodHandle_a5 = var124.unreflectSetter(var269);
                     Lookup var125 = MethodHandles.lookup();
                     Field var270 = C03PacketPlayer.class.getDeclaredField(var4[14]);
                     var270.setAccessible(true);
                     methodHandle_a6 = var125.unreflectSetter(var270);
                     Lookup var126 = MethodHandles.lookup();
                     Field var271 = C0FPacketConfirmTransaction.class.getDeclaredField(var4[139]);
                     var271.setAccessible(true);
                     methodHandle_a7 = var126.unreflectGetter(var271);
                     Lookup var127 = MethodHandles.lookup();
                     Field var272 = EntityPlayerSP.class.getDeclaredField(var4[79]);
                     var272.setAccessible(true);
                     methodHandle_a8 = var127.unreflectGetter(var272);
                     Lookup var128 = MethodHandles.lookup();
                     Field var273 = Class.forName(var4[65]).getDeclaredField(var4[110]);
                     var273.setAccessible(true);
                     methodHandle_a9 = var128.unreflectGetter(var273);
                     Lookup var129 = MethodHandles.lookup();
                     Field var274 = Class.forName(var4[125]).getDeclaredField(var4[24]);
                     var274.setAccessible(true);
                     methodHandle_a_ = var129.unreflectSetter(var274);
                     Lookup var130 = MethodHandles.lookup();
                     Field var275 = C0FPacketConfirmTransaction.class.getDeclaredField(var4[76]);
                     var275.setAccessible(true);
                     methodHandle_ba = var130.unreflectSetter(var275);
                     Lookup var131 = MethodHandles.lookup();
                     Field var276 = Class.forName(var4[8]).getDeclaredField(var4[73]);
                     var276.setAccessible(true);
                     methodHandle_bb = var131.unreflectSetter(var276);
                     Lookup var132 = MethodHandles.lookup();
                     Field var277 = Class.forName(var4[125]).getDeclaredField(var4[135]);
                     var277.setAccessible(true);
                     methodHandle_bc = var132.unreflectSetter(var277);
                     Lookup var133 = MethodHandles.lookup();
                     Field var278 = GlStateManager.class.getDeclaredField(var4[31]);
                     var278.setAccessible(true);
                     methodHandle_bd = var133.unreflectGetter(var278);
                     Lookup var134 = MethodHandles.lookup();
                     Field var279 = C0EPacketClickWindow.class.getDeclaredField(var4[153]);
                     var279.setAccessible(true);
                     methodHandle_be = var134.unreflectSetter(var279);
                     Lookup var135 = MethodHandles.lookup();
                     Field var280 = GlStateManager.class.getDeclaredField(var4[108]);
                     var280.setAccessible(true);
                     methodHandle_bf = var135.unreflectGetter(var280);
                     Lookup var136 = MethodHandles.lookup();
                     Method var281 = PlayerControllerMP.class.getDeclaredMethod(var4[115]);
                     var281.setAccessible(true);
                     methodHandle_bg = var136.unreflect(var281);
                     Lookup var137 = MethodHandles.lookup();
                     Field var282 = EntityPlayerSP.class.getDeclaredField(var4[104]);
                     var282.setAccessible(true);
                     methodHandle_bh = var137.unreflectSetter(var282);
                     Lookup var138 = MethodHandles.lookup();
                     Field var283 = EntityPlayerSP.class.getDeclaredField(var4[48]);
                     var283.setAccessible(true);
                     methodHandle_bi = var138.unreflectSetter(var283);
                     Lookup var139 = MethodHandles.lookup();
                     Field var284 = EntityPlayerSP.class.getDeclaredField(var4[123]);
                     var284.setAccessible(true);
                     methodHandle_bj = var139.unreflectGetter(var284);
                     Lookup var140 = MethodHandles.lookup();
                     Field var285 = C0BPacketEntityAction.class.getDeclaredField(var4[1]);
                     var285.setAccessible(true);
                     methodHandle_bk = var140.unreflectSetter(var285);
                     Lookup var141 = MethodHandles.lookup();
                     Field var286 = Class.forName(var4[65]).getDeclaredField(var4[124]);
                     var286.setAccessible(true);
                     methodHandle_bl = var141.unreflectGetter(var286);
                     Lookup var142 = MethodHandles.lookup();
                     Field var287 = Minecraft.class.getDeclaredField(var4[130]);
                     var287.setAccessible(true);
                     methodHandle_bm = var142.unreflectGetter(var287);
                     Lookup var143 = MethodHandles.lookup();
                     Field var288 = Class.forName(var4[8]).getDeclaredField(var4[85]);
                     var288.setAccessible(true);
                     methodHandle_bn = var143.unreflectGetter(var288);
                     Lookup var144 = MethodHandles.lookup();
                     Method var289 = Minecraft.class.getDeclaredMethod(var4[27]);
                     var289.setAccessible(true);
                     methodHandle_bo = var144.unreflect(var289);
                     Lookup var145 = MethodHandles.lookup();
                     Field var290 = EntityLivingBase.class.getDeclaredField(var4[148]);
                     var290.setAccessible(true);
                     methodHandle_bp = var145.unreflectSetter(var290);
                     Lookup var146 = MethodHandles.lookup();
                     Field var291 = S12PacketEntityVelocity.class.getDeclaredField(var4[25]);
                     var291.setAccessible(true);
                     methodHandle_bq = var146.unreflectGetter(var291);
                     Lookup var147 = MethodHandles.lookup();
                     Field var292 = GlStateManager.class.getDeclaredField(var4[64]);
                     var292.setAccessible(true);
                     methodHandle_br = var147.unreflectGetter(var292);
                     Lookup var148 = MethodHandles.lookup();
                     Field var293 = EntityPlayerSP.class.getDeclaredField(var4[23]);
                     var293.setAccessible(true);
                     methodHandle_bs = var148.unreflectGetter(var293);
                     Lookup var149 = MethodHandles.lookup();
                     Field var294 = GlStateManager.class.getDeclaredField(var4[55]);
                     var294.setAccessible(true);
                     methodHandle_bt = var149.unreflectGetter(var294);
                     Lookup var150 = MethodHandles.lookup();
                     Field var295 = GlStateManager.class.getDeclaredField(var4[46]);
                     var295.setAccessible(true);
                     methodHandle_bu = var150.unreflectGetter(var295);
                     Lookup var151 = MethodHandles.lookup();
                     Field var296 = C02PacketUseEntity.class.getDeclaredField(var4[127]);
                     var296.setAccessible(true);
                     methodHandle_bv = var151.unreflectSetter(var296);
                     Lookup var152 = MethodHandles.lookup();
                     Field var297 = C0CPacketInput.class.getDeclaredField(var4[4]);
                     var297.setAccessible(true);
                     methodHandle_bw = var152.unreflectSetter(var297);
                     Lookup var153 = MethodHandles.lookup();
                     Field var298 = C02PacketUseEntity.class.getDeclaredField(var4[94]);
                     var298.setAccessible(true);
                     methodHandle_bx = var153.unreflectSetter(var298);
                     Lookup var154 = MethodHandles.lookup();
                     Field var299 = C0DPacketCloseWindow.class.getDeclaredField(var4[81]);
                     var299.setAccessible(true);
                     methodHandle_by = var154.unreflectGetter(var299);
                     Lookup var155 = MethodHandles.lookup();
                     Field var300 = C0CPacketInput.class.getDeclaredField(var4[131]);
                     var300.setAccessible(true);
                     methodHandle_bz = var155.unreflectSetter(var300);
                     Lookup var156 = MethodHandles.lookup();
                     Field var301 = KeyBinding.class.getDeclaredField(var4[113]);
                     var301.setAccessible(true);
                     methodHandle_bA = var156.unreflectGetter(var301);
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var303;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label32;
                  }

                  var6 = "]¡¿ºåÐam\u0017A\u0093P7|MZ\u0010\u0003É\u001e·ï;)ù\u0014R²Áõ\u0018\u0018,";
                  var7 = "]¡¿ºåÐam\u0017A\u0093P7|MZ\u0010\u0003É\u001e·ï;)ù\u0014R²Áõ\u0018\u0018,".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize_78(String var0) {
      string_bB = var0;
   }

   public static String getString() {
      return string_bB;
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
}
