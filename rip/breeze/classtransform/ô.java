package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import rip.breeze.inject.ք;

public class ô extends ք {
   private final Map<String, String> map_þ_2;
   private ô ô_ý_2;
   private static String string_ü_2;

   public ô() {
      this(new HashMap<>());
   }

   public ô(String var1, String var2) {
      this();
      this.map_þ_2.put(var1, var2);
   }

   public ô(Map<String, String> var1) {
      this.map_þ_2 = var1;
   }

   public Map invoke_1(Object[] var1) {
      return Collections.unmodifiableMap(this.map_þ_2);
   }

   public void invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      var3 = encKey_b_2 ^ var3;
      long var6 = var3 ^ 122144525909772L;
      Object[] var10006 = new Object[]{null, null, null, var6};
      var10006[2] = false;
      var10006[1] = var5;
      var10006[0] = var2;
      this.method_003(var10006);
   }

   public void invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      boolean var4 = (Boolean)var1[2];
      long var5 = (Long)var1[3];
      var5 = encKey_b_2 ^ var5;
      String var7 = method_016();
      if (var7 != null) {
         Map var10000;
         String var10001;
         String var10002;
         label33: {
            label32: {
               if (var4) {
                  var10000 = this.map_þ_2;
                  var10001 = var2;
                  var10002 = var7;
                  if (var5 <= 0L) {
                     break label33;
                  }

                  if (var7 == null) {
                     break label32;
                  }

                  if (this.map_þ_2.containsKey(var2)) {
                     return;
                  }
               }

               var10000 = this.map_þ_2;
               var10001 = var2;
            }

            var10002 = var3;
         }

         var10000.put(var10001, var10002);
      }

      ô var9 = this.ô_ý_2;
      if (var7 != null) {
         if (this.ô_ý_2 == null) {
            return;
         }

         this.ô_ý_2.ô_ý_2 = null;
         var9 = this;
      }

      var9.ô_ý_2 = null;
   }

   public void invoke_4(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      long var6 = (Long)var1[4];
      var6 = encKey_b_2 ^ var6;
      long var8 = var6 ^ 33823201002164L;
      Object[] var10008 = new Object[]{null, null, null, null, null, false};
      var10008[4] = var8;
      var10008[3] = var5;
      var10008[2] = var4;
      var10008[1] = var3;
      var10008[0] = var2;
      this.method_005(var10008);
   }

   public void invoke_5(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      long var6 = (Long)var1[4];
      boolean var8 = (Boolean)var1[5];
      var6 = encKey_b_2 ^ var6;
      String var10000 = method_016();
      String var9 = var2 + "." + var3 + var4;
      String var10 = var10000;
      if (var10 != null) {
         String var10001;
         String var10002;
         label33: {
            label32: {
               if (var8) {
                  var12 = this.map_þ_2;
                  var10001 = var9;
                  var10002 = var10;
                  if (var6 <= 0L) {
                     break label33;
                  }

                  if (var10 == null) {
                     break label32;
                  }

                  if (this.map_þ_2.containsKey(var9)) {
                     return;
                  }
               }

               var12 = this.map_þ_2;
               var10001 = var9;
            }

            var10002 = var5;
         }

         var12.put(var10001, var10002);
      }

      ô var13 = this.ô_ý_2;
      if (var10 != null) {
         if (this.ô_ý_2 == null) {
            return;
         }

         this.ô_ý_2.ô_ý_2 = null;
         var13 = this;
      }

      var13.ô_ý_2 = null;
   }

   public void invoke_6(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      var2 = encKey_b_2 ^ var2;
      long var7 = var2 ^ 35376723191720L;
      Object[] var10007 = new Object[]{null, var4, var5, var6, false};
      var10007[0] = var7;
      this.method_007(var10007);
   }

   public void invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      var2 = encKey_b_2 ^ var2;
      long var8 = var2 ^ 129326190121850L;
      Object[] var10008 = new Object[]{null, null, var5, "", var6, var7};
      var10008[1] = var8;
      var10008[0] = var4;
      this.method_009(var10008);
   }

   public void invoke_8(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      var3 = encKey_b_2 ^ var3;
      long var8 = var3 ^ 50247550417555L;
      Object[] var10008 = new Object[]{null, null, var5, var6, var7, false};
      var10008[1] = var8;
      var10008[0] = var2;
      this.method_009(var10008);
   }

   public void invoke_9(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      boolean var8 = (Boolean)var1[5];
      var3 = encKey_b_2 ^ var3;
      String var10000 = method_016();
      String var9 = var2 + "." + var5 + ":" + var6;
      String var10 = var10000;
      if (var10 != null) {
         String var10001;
         String var10002;
         label33: {
            label32: {
               if (var8) {
                  var12 = this.map_þ_2;
                  var10001 = var9;
                  var10002 = var10;
                  if (var3 < 0L) {
                     break label33;
                  }

                  if (var10 == null) {
                     break label32;
                  }

                  if (this.map_þ_2.containsKey(var9)) {
                     return;
                  }
               }

               var12 = this.map_þ_2;
               var10001 = var9;
            }

            var10002 = var7;
         }

         var12.put(var10001, var10002);
      }

      ô var13 = this.ô_ý_2;
      if (var10 != null) {
         if (this.ô_ý_2 == null) {
            return;
         }

         this.ô_ý_2.ô_ý_2 = null;
         var13 = this;
      }

      var13.ô_ý_2 = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public List invoke_10(Object... var1) {
      long var2 = (Long)var1[0];
      String[] var4 = (String[])var1[1];
      var2 = encKey_b_2 ^ var2;
      String var10000 = method_016();
      ArrayList var5 = new ArrayList();
      String var6 = var10000;
      Iterator var7 = this.map_þ_2.keySet().iterator();

      label57:
      while (true) {
         boolean var14 = var7.hasNext();

         label55:
         while (true) {
            if (var14) {
               var10000 = (String)var7.next();
            } else {
               var10000 = var5;
               if (var2 > 0L) {
                  return var5;
               }
            }

            do {
               String var8 = var10000;
               String[] var9 = var4;
               int var10 = var9.length;
               int var11 = 0;

               label50:
               while (true) {
                  if (var11 < var10) {
                     var10000 = var9[var11];
                  } else {
                     var10000 = var6;
                     if (var2 > 0L) {
                        break;
                     }
                  }

                  while (true) {
                     String var12 = var10000;
                     var10000 = var6;
                     if (var2 >= 0L) {
                        if (var6 != null) {
                           var14 = var8.startsWith(var12);
                           if (var6 == null) {
                              continue label55;
                           }

                           if (var14) {
                              var5.add(var8);
                           }

                           var11++;
                        }

                        var10000 = var6;
                     }

                     if (var10000 != null) {
                        break;
                     }

                     var10000 = var6;
                     if (var2 > 0L) {
                        break label50;
                     }
                  }
               }

               if (var10000 != null) {
                  continue label57;
               }

               var10000 = var5;
            } while (var2 <= 0L);

            return var5;
         }
      }
   }

   public boolean check_11(Object[] var1) {
      return this.map_þ_2.isEmpty();
   }

   public void invoke_12(Object[] var1) {
      ô var2 = (ô)var1[0];
      this.map_þ_2.putAll(var2.map_þ_2);
   }

   @Override
   public String invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      String var6 = (String)var1[3];
      String var10000 = method_016();
      String var7 = this.method_005(new Object[]{var2 + '.' + var3 + var6});
      String var8 = var10000;
      var10000 = var7;
      if (var8 != null) {
         var10000 = var7 == null ? var3 : var7;
      }

      return var10000;
   }

   @Override
   public String invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      String var10000 = method_016();
      String var6 = this.method_005(new Object[]{'.' + var2 + var3});
      String var7 = var10000;
      var10000 = var6;
      if (var7 != null) {
         var10000 = var6 == null ? var2 : var6;
      }

      return var10000;
   }

   @Override
   public String invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var10000 = method_016();
      String var6 = this.method_005(new Object[]{var4 + '.' + var5});
      String var7 = var10000;
      var10000 = var6;
      if (var7 != null) {
         var10000 = var6 == null ? var5 : var6;
      }

      return var10000;
   }

   @Override
   public String invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      String var10000 = method_016();
      String var7 = this.method_005(new Object[]{var4 + '.' + var5 + ':' + var6});
      String var8 = var10000;
      var10000 = var7;
      String var10001 = var8;
      if (var2 >= 0L) {
         if (var8 != null) {
            if (var7 == null) {
               var7 = this.method_005(new Object[]{var4 + '.' + var5 + ":"});
            }

            var10000 = var7;
         }

         var10001 = var8;
      }

      if (var10001 != null) {
         var10000 = var10000 == null ? var5 : var7;
      }

      return var10000;
   }

   @Override
   public String invoke_5(Object[] var1) {
      String var2 = (String)var1[0];
      return this.map_þ_2.get(var2);
   }

   public String invoke_13(Object[] var1) {
      String var2 = (String)var1[0];
      return this.map_þ_2.getOrDefault(var2, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ô invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_b_2 ^ var2;
      long var4 = var2 ^ 24916916029665L;
      long var6 = var2 ^ 97103173087172L;
      long var8 = var2 ^ 122407686898514L;
      long var10 = var2 ^ 125953485075542L;
      long var12 = var2 ^ 125969392769848L;
      long var14 = var2 ^ 89198016461879L;
      String var16 = method_016();
      ô var10000 = this.ô_ý_2;
      if (var16 != null) {
         if (this.ô_ý_2 != null) {
            return this.ô_ý_2;
         }

         var10000 = new ô();
      }

      ô var17 = var10000;
      Iterator var18 = this.map_þ_2.entrySet().iterator();

      label210: {
         Entry var19;
         while (true) {
            if (var18.hasNext()) {
               var19 = (Entry)var18.next();
               var31 = var16;
               if (var2 <= 0L) {
                  if (var2 >= 0L) {
                     if (var16 == null) {
                        return this.ô_ý_2 = var17;
                     }

                     var31 = (String)var19.getKey();
                  }
                  break;
               }

               if (var2 > 0L) {
                  if (var16 != null) {
                     boolean var32 = ((String)var19.getKey()).contains(".");
                     if (var16 == null) {
                        if (!var32) {
                           break label210;
                        }

                        var19 = (Entry)var18.next();
                        var31 = var16;
                        if (var2 >= 0L) {
                           if (var16 == null) {
                              return this.ô_ý_2 = var17;
                           }

                           var31 = (String)var19.getKey();
                        }
                        break;
                     }

                     if (var32) {
                        continue;
                     }

                     var17.method_002(new Object[]{(String)var19.getValue(), var4, (String)var19.getKey()});
                     if (var16 != null) {
                        continue;
                     }

                     var18 = this.map_þ_2.entrySet().iterator();
                  } else {
                     if (var16 != null) {
                        continue;
                     }

                     var18 = this.map_þ_2.entrySet().iterator();
                  }
               } else {
                  if (var16 != null) {
                     continue;
                  }

                  var18 = this.map_þ_2.entrySet().iterator();
               }
            } else {
               var18 = this.map_þ_2.entrySet().iterator();
            }

            if (!var18.hasNext()) {
               break label210;
            }

            var19 = (Entry)var18.next();
            var31 = var16;
            if (var2 >= 0L) {
               if (var16 == null) {
                  return this.ô_ý_2 = var17;
               }

               var31 = (String)var19.getKey();
            }
            break;
         }

         label199:
         while (true) {
            while (true) {
               boolean var33 = var31.contains(".");
               if (var16 != null) {
                  if (!var33) {
                     if (!var18.hasNext()) {
                        break label199;
                     }

                     var19 = (Entry)var18.next();
                     var31 = var16;
                     if (var2 >= 0L) {
                        if (var16 == null) {
                           return this.ô_ý_2 = var17;
                        }

                        var31 = (String)var19.getKey();
                     }
                     continue;
                  }

                  var34 = (String)var19.getKey();
                  if (var2 > 0L) {
                     if (var16 == null) {
                        break;
                     }

                     var33 = var34.contains(":");
                  } else {
                     var33 = var34.contains(var16);
                  }
               }

               if (var33) {
                  label185: {
                     String var20 = (String)var19.getKey();
                     String var21 = var20.substring(0, var20.indexOf("."));
                     String var22 = var20.substring(var20.indexOf(".") + 1, var20.indexOf(":"));
                     String var23 = var20.substring(var20.indexOf(":") + 1);
                     String var24 = (String)var19.getValue();
                     var35 = var16;
                     if (var2 > 0L) {
                        if (var16 != null) {
                           if (!var23.isEmpty()) {
                              var17.method_008(new Object[]{this.method_013(new Object[]{var21}), var10, var24, this.ÿ(new Object[]{var12, var23}), var22});
                              var35 = var16;
                              break label185;
                           }

                           var17.method_006(new Object[]{var8, this.method_013(new Object[]{var21}), var24, var22});
                           var35 = var16;
                        } else {
                           var35 = var16;
                        }
                     }

                     if (var2 >= 0L) {
                        if (var35 == null) {
                           var17.method_008(new Object[]{this.method_013(new Object[]{var21}), var10, var24, this.ÿ(new Object[]{var12, var23}), var22});
                           var35 = var16;
                        } else {
                           var35 = var16;
                        }
                     }
                  }

                  if (var2 < 0L) {
                     if (var35 == null || !var18.hasNext()) {
                        break label199;
                     }

                     var19 = (Entry)var18.next();
                     var31 = var16;
                     if (var2 >= 0L) {
                        if (var16 == null) {
                           return this.ô_ý_2 = var17;
                        }

                        var31 = (String)var19.getKey();
                     }
                  } else if (var35 != null) {
                     if (var16 == null || !var18.hasNext()) {
                        break label199;
                     }

                     var19 = (Entry)var18.next();
                     var31 = var16;
                     if (var2 >= 0L) {
                        if (var16 == null) {
                           return this.ô_ý_2 = var17;
                        }

                        var31 = (String)var19.getKey();
                     }
                  } else {
                     var34 = (String)var19.getKey();
                     break;
                  }
               } else {
                  var34 = (String)var19.getKey();
                  break;
               }
            }

            String var26 = var34;
            String var27 = var26.substring(0, var26.indexOf("."));
            String var28 = var26.substring(var26.indexOf(".") + 1, var26.indexOf("("));
            String var29 = var26.substring(var26.indexOf("("));
            String var30 = (String)var19.getValue();
            var17.method_004(new Object[]{this.method_013(new Object[]{var27}), var30, this.û(new Object[]{var6, var29}), var28, var14});
            if (var16 == null || !var18.hasNext()) {
               break;
            }

            var19 = (Entry)var18.next();
            var31 = var16;
            if (var2 >= 0L) {
               if (var16 == null) {
                  return this.ô_ý_2 = var17;
               }

               var31 = (String)var19.getKey();
            }
         }
      }

      var17.ô_ý_2 = this;
      return this.ô_ý_2 = var17;
   }

   public static void execute_15(String var0) {
      string_ü_2 = var0;
   }

   public static String invoke_16() {
      return string_ü_2;
   }

   static {
      if (method_016() == null) {
         method_015("frWZ0b");
      }
   }
}
