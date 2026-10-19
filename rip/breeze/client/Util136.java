package rip.breeze.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util136 extends Util110 {
   private final Map<String, Object> map_a = new HashMap<>();
   final String string_b;
   final boolean fieldBool_c;

   Util136() {
      this(null, false);
   }

   public Util136(String var1) {
      this(var1, false);
   }

   public Util136(String var1, boolean var2) {
      this.string_b = var1;
      this.fieldBool_c = var2;
   }

   boolean checkCondition(String var1, long var2) {
      boolean var10000 = this.map_a.containsKey(var1);
      if (var2 >= 0L) {
         if (var10000) {
            var10000 = this.map_a.get(var1) instanceof Util111;
            if (var2 <= 0L) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   void initialize(String var1, Object var2) {
      this.map_a.put(var1, var2);
   }

   Object getObject(String var1) {
      return this.map_a.get(var1);
   }

   boolean isValid() {
      return this.fieldBool_c;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Map getById(long var1) {
      var1 = 72381003603569L ^ var1;
      long var3 = var1 ^ 72381003603569L;
      long var5 = (var1 ^ 21730703457344L) >>> 16;
      int var7 = (int)((var1 ^ 21730703457344L) << 48 >>> 48);
      String[] var10000 = Util28.values();
      Iterator var8 = this.map_a.entrySet().iterator();
      String[] var9 = var10000;

      label82:
      while (true) {
         Object var12;
         if (var8.hasNext()) {
            var12 = var8.next();
         } else {
            var12 = this.map_a;
            if (var1 >= 0L) {
               return this.map_a;
            }
         }

         do {
            Entry var10 = (Entry)var12;
            boolean var13 = var10.getValue() instanceof Util136;
            if (var1 > 0L) {
               if (var13) {
                  var10.setValue(((Util136)var10.getValue()).getById(var3));
                  if (var1 > 0L) {
                     if (var9 != null) {
                        var13 = (boolean)var10.getValue();
                        if (var1 > 0L) {
                           if (var13 instanceof Util111) {
                              var10.setValue(((Util111)var10.getValue()).getList(var5, (char)var7));
                           }

                           if (var9 == null) {
                              continue label82;
                           }
                        } else if (var9 == null) {
                           continue label82;
                        }
                     } else if (var9 == null) {
                        continue label82;
                     }
                  } else if (var9 == null) {
                     continue label82;
                  }
               } else {
                  var13 = (boolean)var10.getValue();
                  if (var1 > 0L) {
                     if (var13 instanceof Util111) {
                        var10.setValue(((Util111)var10.getValue()).getList(var5, (char)var7));
                     }

                     if (var9 == null) {
                        continue label82;
                     }
                  } else if (var9 == null) {
                     continue label82;
                  }
               }
            } else {
               if (var13) {
                  var10.setValue(((Util111)var10.getValue()).getList(var5, (char)var7));
               }

               if (var9 == null) {
                  continue label82;
               }
            }

            var12 = this.map_a;
         } while (var1 < 0L);

         return this.map_a;
      }
   }

   @Override
   public String toString() {
      return this.map_a.toString();
   }
}
