package rip.breeze.client;

import java.util.ArrayList;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util97 {

   static Util98[] parseEntries(String var0, char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ 130822509682765L;
      long var6 = var4 ^ 35140949089369L;
      long var8 = var4 ^ 67835516316429L;
      ArrayList var10 = new ArrayList();
      StringBuilder var11 = new StringBuilder();
      int var12 = 0;
      String[] var10000 = Util28.values();
      byte var13 = 1;
      String[] var14 = var10000;
      byte var15 = 0;
      int var16 = -1;
      int var17 = var0.length() - 1;

      while (var17 > -1) {
         label129: {
            label137: {
               char var18;
               label138: {
                  var18 = var0.charAt(var17);
                  var19 = var18;
                  byte var10001 = 93;
                  if (var2 > 0) {
                     label124: {
                        if (var18 == ']') {
                           var19 = var13;
                           if (var2 < 0) {
                              break label124;
                           }

                           if (var13 != 0) {
                              var15 = 1;
                              var10000 = var14;
                              if (var2 < 0) {
                                 break label129;
                              }

                              if (var14 == null) {
                                 break label137;
                              }

                              boolean var21 = LicenseState.isValid_2();
                              if (var3 >= 0) {
                                 ;
                              }

                              LicenseState.toggle(var21);
                           }
                        }

                        var13 = 0;
                        var19 = var18;
                     }

                     if (var1 < 0) {
                        break label138;
                     }

                     var10001 = 91;
                  }

                  if (var19 == var10001) {
                     var19 = var15;
                     if (var3 <= 0) {
                        break label138;
                     }

                     if (var15 != 0) {
                        var15 = 0;
                        var16 = Integer.parseInt(var11.toString());
                        var11 = new StringBuilder();
                        var10000 = var14;
                        if (var2 < 0) {
                           break label129;
                        }

                        if (var14 == null) {
                           break label137;
                        }
                     }
                  }

                  var19 = isValid(var18, var6);
               }

               label141: {
                  label101: {
                     label142: {
                        byte var23;
                        label143: {
                           if (var3 > 0) {
                              label95:
                              if (var19 != 0) {
                                 int var22 = var17;
                                 if (var2 > 0) {
                                    if (var17 != 0) {
                                       var19 = var0.charAt(var17 - 1);
                                       var23 = 92;
                                       if (var2 < 0) {
                                          break label143;
                                       }

                                       if (var19 == 92) {
                                          break label95;
                                       }
                                    }

                                    var22 = var12;
                                 }

                                 if (var1 >= 0) {
                                    var22 = var22 == 0 ? 1 : 0;
                                 }

                                 var12 = var22;
                                 var13 = 0;
                              }

                              var19 = var18;
                           }

                           if (var2 < 0) {
                              break label142;
                           }

                           var23 = 46;
                        }

                        if (var19 != var23) {
                           break label101;
                        }

                        var19 = var12;
                     }

                     if (var19 == 0) {
                        break label141;
                     }
                  }

                  var11.insert(0, var18);
                  var10000 = var14;
                  if (var3 < 0) {
                     break label129;
                  }

                  if (var14 == null) {
                     break label137;
                  }
               }

               var10.add(0, new Util98(var11.toString(), var16, !var10.isEmpty() ? (Util98)var10.get(0) : null, var8));
               var13 = 1;
               var16 = -1;
               var11 = new StringBuilder();
            }

            var17--;
            var10000 = var14;
         }

         if (var10000 != null) {
            break;
         }
      }

      var10.add(0, new Util98(var11.toString(), var16, !var10.isEmpty() ? (Util98)var10.get(0) : null, var8));
      return var10.toArray(new Util98[0]);
   }

   static boolean isValid(char var0, long var1) {
      var1 = 130822509682765L ^ var1;
      if (var0 != '"') {
         if (var1 <= 0L) {
            return (boolean)var0;
         }

         if (var0 != '\'') {
            return false;
         }
      }

      return true;
   }
}
