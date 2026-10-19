package rip.breeze.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util111 extends Util110 {
   private final List<Util136> list_a = new ArrayList<>();

   Util111() {
      this.list_a.add(new Util136());
   }

   boolean isValid(String var1, long var2) {
      long var4 = var2 ^ 0L;
      return this.getDataBuilder21().checkCondition(var1, var4);
   }

   void initialize(String var1, Object var2) {
      this.list_a.add((Util136)var2);
   }

   Object getObject(String var1) {
      throw new UnsupportedOperationException();
   }

   boolean isValid_2() {
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   List getList(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ 134990844357358L;
      long var6 = var4 ^ 44878508411103L;
      ArrayList var8 = new ArrayList();
      String[] var10000 = Util28.values();
      Iterator var9 = this.list_a.iterator();
      String[] var10 = var10000;

      label20:
      while (true) {
         Object var12;
         if (var9.hasNext()) {
            var12 = var9.next();
         } else {
            var12 = var8;
            if (var3 > 0) {
               return var8;
            }
         }

         do {
            Util136 var11 = (Util136)var12;
            var8.add(var11.getById(var6));
            if (var10 == null) {
               continue label20;
            }

            var12 = var8;
         } while (var3 <= 0);

         return var8;
      }
   }

   Util136 getDataBuilder21() {
      return this.list_a.get(this.list_a.size() - 1);
   }

   @Override
   public String toString() {
      return this.list_a.toString();
   }
}
