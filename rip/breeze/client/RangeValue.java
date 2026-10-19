package rip.breeze.client;

import net.minecraft.util.AxisAlignedBB;

public class RangeValue {
   double min;
   double max;
   double current;
   boolean fieldBool_d;
   boolean fieldBool_e;
   boolean fieldBool_f;
   boolean fieldBool_g;
   boolean fieldBool_h;
   boolean fieldBool_i;
   AxisAlignedBB axisAlignedBB_j;
   private static String string_k;

   public RangeValue(
      double var1, double var3, double var5, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12, AxisAlignedBB var13
   ) {
      this.min = var1;
      this.max = var3;
      this.current = var5;
      this.fieldBool_d = var7;
      this.fieldBool_e = var8;
      this.fieldBool_f = var9;
      this.fieldBool_g = var10;
      this.fieldBool_h = var11;
      this.fieldBool_i = var12;
      this.axisAlignedBB_j = var13;
   }

   public double getDouble_a() {
      return this.min;
   }

   public double getDouble_b() {
      return this.max;
   }

   public double getDouble_c() {
      return this.current;
   }

   public boolean isBool_d() {
      return this.fieldBool_d;
   }

   public boolean isBool_e() {
      return this.fieldBool_e;
   }

   public boolean isBool_f() {
      return this.fieldBool_f;
   }

   public boolean isBool_g() {
      return this.fieldBool_g;
   }

   public boolean isBool_h() {
      return this.fieldBool_h;
   }

   public boolean isBool_i() {
      return this.fieldBool_i;
   }

   public AxisAlignedBB getAxisAlignedBB_j() {
      return this.axisAlignedBB_j;
   }

   public double calculateDouble() {
      return (this.axisAlignedBB_j.maxX + this.axisAlignedBB_j.minX) / 2.0;
   }

   public double getDouble() {
      return this.axisAlignedBB_j.minY;
   }

   public double calculateDouble_2() {
      return (this.axisAlignedBB_j.maxZ + this.axisAlignedBB_j.minZ) / 2.0;
   }

   public static void initialize(String var0) {
      string_k = var0;
   }

   public static String getString() {
      return string_k;
   }

   static {
      if (getString() == null) {
         initialize("P4XjUc");
      }
   }
}
