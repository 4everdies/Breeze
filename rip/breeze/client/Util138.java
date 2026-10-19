package rip.breeze.client;

import java.math.BigInteger;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public final class Util138 extends PlayerUtil8 {
   private static final Class<?>[] CONST_A = new Class[]{
      int.class,
      long.class,
      short.class,
      float.class,
      double.class,
      byte.class,
      boolean.class,
      char.class,
      Integer.class,
      Long.class,
      Short.class,
      Float.class,
      Double.class,
      Byte.class,
      Boolean.class,
      Character.class
   };
   private Object object_c;
   private static LicenseState[] arr_d;

   public Util138(Boolean var1, long var2) {
      var2 = 133721760644497L ^ var2;
      long var4 = var2 ^ 76439992808510L;
      super();
      this.processAll(var1, var4);
   }

   public Util138(long var1, Number var3) {
      var1 = 133721760644497L ^ var1;
      long var4 = var1 ^ 80863574052017L;
      super();
      this.processAll(var3, var4);
   }

   public Util138(long var1, String var3) {
      var1 = 133721760644497L ^ var1;
      long var4 = var1 ^ 21989234864569L;
      super();
      this.processAll(var3, var4);
   }

   Util138(Object var1, int var2, int var3) {
      long var4 = ((long)var2 << 32 | (long)var3 << 32 >>> 32) ^ 133721760644497L;
      long var6 = var4 ^ 111353732697974L;
      super();
      this.processAll(var1, var6);
   }

   void processAll(Object var1, long var2) {
      long var4;
      long var6;
      Object var10000;
      label32: {
         var2 = 133721760644497L ^ var2;
         var4 = var2 ^ 132815283903226L;
         var6 = var2 ^ 52919382582065L;
         String[] var8 = Util64.getStringArray();
         if (var1 instanceof Character) {
            char var9 = (Character)var1;
            this.object_c = String.valueOf(var9);
            var10000 = (boolean)var8;
            if (var2 <= 0L) {
               break label32;
            }

            if (var8 == null) {
               return;
            }
         }

         var10000 = (boolean)var1;
      }

      var10000 = var10000 instanceof Number;
      label23:
      if (var2 > 0L) {
         if (!var10000) {
            var10000 = checkCondition_2(var6, var1);
            if (var2 < 0L) {
               break label23;
            }

            if (!var10000) {
               var10000 = false;
               break label23;
            }
         }

         var10000 = true;
      }

      Util67.update(var10000, var4);
      this.object_c = var1;
   }

   @Override
   public boolean isValid() {
      return this.object_c instanceof Boolean;
   }

   @Override
   Boolean getBoolean() {
      return (Boolean)this.object_c;
   }

   public boolean checkCondition(long var1) {
      long var10001 = var1 ^ 64266131785756L;
      int var3 = (int)((var1 ^ 64266131785756L) >>> 48);
      int var4 = (int)((var1 ^ 64266131785756L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      return this.isValid() ? this.getBoolean() : Boolean.parseBoolean(this.getString((char)var3, var4, (short)var5));
   }

   @Override
   public boolean isValid_2() {
      return this.object_c instanceof Number;
   }

   @Override
   public Number getNumber(long var1) {
      Object var10000 = this.object_c;
      if (var1 > 0L) {
         if (this.object_c instanceof String) {
            return new NumberConverter((String)this.object_c);
         }

         var10000 = this.object_c;
      }

      return (Number)var10000;
   }

   public String getString(char var1, int var2, short var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 138356355995571L;
      if (this.isValid_2()) {
         return this.getNumber(var6).toString();
      }

      Object var10000 = this;
      if (var3 > 0) {
         if (this.isValid()) {
            return this.getBoolean().toString();
         }

         var10000 = this.object_c;
      }

      return (String)var10000;
   }

   @Override
   public double getDouble(long var1) {
      long var10001 = var1 ^ 68761601449989L;
      int var3 = (int)((var1 ^ 68761601449989L) >>> 48);
      int var4 = (int)((var1 ^ 68761601449989L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 74063886661558L;
      return this.isValid_2() ? this.getNumber(var6).doubleValue() : Double.parseDouble(this.getString((char)var3, var4, (short)var5));
   }

   @Override
   public float getFloat(long var1) {
      long var10001 = var1 ^ 107029929015092L;
      int var3 = (int)((var1 ^ 107029929015092L) >>> 48);
      int var4 = (int)((var1 ^ 107029929015092L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 31345771651207L;
      return this.isValid_2() ? this.getNumber(var6).floatValue() : Float.parseFloat(this.getString((char)var3, var4, (short)var5));
   }

   @Override
   public long getLong(long var1) {
      long var10001 = var1 ^ 136068794661563L;
      int var3 = (int)((var1 ^ 136068794661563L) >>> 48);
      int var4 = (int)((var1 ^ 136068794661563L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 6688964357384L;
      return this.isValid_2() ? this.getNumber(var6).longValue() : Long.parseLong(this.getString((char)var3, var4, (short)var5));
   }

   @Override
   public int getValue(long var1) {
      long var10001 = var1 ^ 98660657300442L;
      int var3 = (int)((var1 ^ 98660657300442L) >>> 48);
      int var4 = (int)((var1 ^ 98660657300442L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 40057551262825L;
      return this.isValid_2() ? this.getNumber(var6).intValue() : Integer.parseInt(this.getString((char)var3, var4, (short)var5));
   }

   private static boolean checkCondition_2(long var0, Object var2) {
      var0 = 133721760644497L ^ var0;
      String[] var3 = Util64.getStringArray();
      if (var2 instanceof String) {
         return true;
      }

      Class var4 = var2.getClass();
      Class[] var5 = CONST_A;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         Class var8 = var5[var7];
         if (var0 >= 0L) {
            if (var8.isAssignableFrom(var4)) {
               return true;
            }

            var7++;
         }

         if (var3 != null) {
            break;
         }
      }

      return false;
   }

   @Override
   public int hashCode() {
      long var1 = 77090695698502L;
      long var3 = var1 ^ 78148165506114L;
      long var5 = var1 ^ 44420475187378L;
      if (this.object_c == null) {
         return 31;
      } else if (checkCondition_3(var3, this)) {
         long var9 = this.getNumber(var5).longValue();
         return (int)(var9 ^ var9 >>> 32);
      } else if (this.object_c instanceof Number) {
         long var7 = Double.doubleToLongBits(this.getNumber(var5).doubleValue());
         return (int)(var7 ^ var7 >>> 32);
      } else {
         return this.object_c.hashCode();
      }
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 65244615476567L;
      long var4 = var2 ^ 64152450910547L;
      long var6 = var2 ^ 93654229036451L;
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         Util138 var8 = (Util138)var1;
         if (this.object_c == null) {
            return var8.object_c == null;
         } else if (checkCondition_3(var4, this) && checkCondition_3(var4, var8)) {
            return this.getNumber(var6).longValue() == var8.getNumber(var6).longValue();
         } else if (this.object_c instanceof Number && var8.object_c instanceof Number) {
            double var9 = this.getNumber(var6).doubleValue();
            double var11 = var8.getNumber(var6).doubleValue();
            return var9 == var11 || Double.isNaN(var9) && Double.isNaN(var11);
         } else {
            return this.object_c.equals(var8.object_c);
         }
      } else {
         return false;
      }
   }

   private static boolean checkCondition_3(long var0, Util138 var2) {
      var0 = 133721760644497L ^ var0;
      if (!(var2.object_c instanceof Number)) {
         return false;
      }

      Number var3 = (Number)var2.object_c;
      boolean var10000 = var3 instanceof BigInteger;
      if (var0 > 0L) {
         if (!var10000) {
            var10000 = var3 instanceof Long;
            if (var0 <= 0L) {
               return var10000;
            }

            if (!var10000) {
               var10000 = var3 instanceof Integer;
               if (var0 < 0L) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = var3 instanceof Short;
                  if (var0 < 0L) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = var3 instanceof Byte;
                     if (var0 <= 0L) {
                        return var10000;
                     }

                     if (!var10000) {
                        return false;
                     }
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   static {
      LicenseState[] var10000 = new LicenseState[2];
      initialize(var10000);
   }

   public static void initialize(LicenseState[] var0) {
      arr_d = var0;
   }

   public static LicenseState[] values() {
      return arr_d;
   }
}
