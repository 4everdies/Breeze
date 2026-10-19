package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class û extends ü {
   private final Util139 dataBuilder4_ü_2;
   private final boolean bool_û_2;
   private final ð ð_ú_2;
   private final int int_ù_2;
   private int int_ø_2;
   private final û û_ö_2;
   private û û_õ_2;
   private static final String[] CONST_C_2;
   private static final String[] CONST_D_2;
   private static final Map CONST_F_2 = new HashMap(13);

   û(Util139 var1, long var2, boolean var4, ð var5, û var6, short var7) {
      int var12;
      int var14;
      label28: {
         long var8 = (var2 << 16 | (long)var7 << 48 >>> 48) ^ encKey_b_2;
         long var10 = var8 ^ 675877024396L;
         int var10000 = Util140.getValue();
         super(589824, var10);
         this.dataBuilder4_ü_2 = var1;
         var12 = var10000;
         this.bool_û_2 = var4;
         this.ð_ú_2 = var5;
         var14 = var5.int_þ_2;
         if (var12 == 0) {
            if (var5.int_þ_2 == 0) {
               var14 = -1;
               break label28;
            }

            var14 = var5.int_þ_2;
         }

         var14 -= 2;
      }

      this.int_ù_2 = var14;
      û var13 = this;
      û var15 = var6;
      if (var2 > 0L) {
         this.û_ö_2 = var6;
         var13 = var6;
         if (var12 == 0) {
            if (var6 == null) {
               return;
            }

            var13 = var6;
         }

         var15 = this;
      }

      var13.û_õ_2 = var15;
   }

   static û invoke_1(Object[] var0) {
      long var1 = (Long)var0[0];
      Util139 var3 = (Util139)var0[1];
      String var4 = (String)var0[2];
      û var5 = (û)var0[3];
      var1 = encKey_b_2 ^ var1;
      long var6 = var1 ^ 20812687322890L;
      long var8 = var1 ^ 119129906982326L;
      long var10 = (var1 ^ 120524790297188L) >>> 16;
      int var12 = (int)((var1 ^ 120524790297188L) << 48 >>> 48);
      ð var13 = new ð();
      int var10001 = var3.calculate_6(new Object[]{var8, var4});
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = var10001;
      ð var10000 = var13.method_004(var10004);
      var10004 = new Object[]{null, var6};
      var10004[0] = 0;
      var10000.method_004(var10004);
      return new û(var3, var10, true, var13, var5, (short)var12);
   }

   static û invoke_2(Object[] var0) {
      long var1 = (Long)var0[0];
      Util139 var3 = (Util139)var0[1];
      int var4 = (Integer)var0[2];
      և var5 = (և)var0[3];
      String var6 = (String)var0[4];
      û var7 = (û)var0[5];
      var1 = encKey_b_2 ^ var1;
      long var8 = var1 ^ 107936114388896L;
      long var10 = var1 ^ 40758557382718L;
      long var12 = var1 ^ 31465314037020L;
      long var14 = (var1 ^ 32276081275598L) >>> 16;
      int var16 = (int)((var1 ^ 32276081275598L) << 48 >>> 48);
      long var17 = var1 ^ 61659908167321L;
      ð var19 = new ð();
      Object[] var10004 = new Object[]{null, var10, var19};
      var10004[0] = var4;
      ֆ.processAll(var10004);
      և.calculate_3(new Object[]{var17, var5, var19});
      int var10001 = var3.calculate_6(new Object[]{var12, var6});
      var10004 = new Object[]{null, var8};
      var10004[0] = var10001;
      ð var10000 = var19.method_004(var10004);
      var10004 = new Object[]{null, var8};
      var10004[0] = 0;
      var10000.method_004(var10004);
      return new û(var3, var14, true, var19, var7, (short)var16);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      Object var5 = var1[2];
      long var6 = var2 ^ 95536324021958L;
      long var8 = var2 ^ 24681051634301L;
      long var10 = var2 ^ 18248511100595L;
      long var12 = var2 ^ 118895778939891L;
      long var14 = var2 ^ 81976651347970L;
      long var16 = var2 ^ 67330981394043L;
      long var18 = var2 ^ 121135578059791L;
      long var20 = var2 ^ 130970697306546L;
      long var22 = var2 ^ 36974387213730L;
      int var10000 = Util140.getValue_2();
      this.int_ø_2++;
      int var24 = var10000;
      int var68 = this.bool_û_2;
      if (var24 != 0) {
         if (this.bool_û_2) {
            ð var69 = this.ð_ú_2;
            int var10001 = this.dataBuilder4_ü_2.calculate_6(new Object[]{var18, var4});
            Object[] var10004 = new Object[]{null, var10};
            var10004[0] = var10001;
            var69.method_004(var10004);
         }

         var68 = var5 instanceof String;
      }

      int var113 = var24;
      if (var2 > 0L) {
         if (var24 != 0) {
            label457: {
               if (var68) {
                  ð var70 = this.ð_ú_2;
                  Object[] var10005 = new Object[]{null, null, this.dataBuilder4_ü_2.calculate_6(new Object[]{var18, (String)var5})};
                  var10005[1] = var6;
                  var10005[0] = 115;
                  var68 = (boolean)var70.method_005(var10005);
                  if (var2 < 0L) {
                     break label457;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (boolean)var5;
            }

            var68 = var68 instanceof Byte;
         }

         var113 = var24;
      }

      if (var2 >= 0L) {
         if (var113 != 0) {
            label443: {
               if (var68) {
                  ð var72 = this.ð_ú_2;
                  Util139 var10002 = this.dataBuilder4_ü_2;
                  byte var10003 = (Byte)var5;
                  Object[] var10006 = new Object[]{null, var14};
                  var10006[0] = Integer.valueOf(var10003);
                  Object[] var129 = new Object[]{null, null, var10002.getBreezeClass3_6(var10006).int_è};
                  var129[1] = var6;
                  var129[0] = 66;
                  var68 = (boolean)var72.method_005(var129);
                  if (var2 <= 0L) {
                     break label443;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (boolean)var5;
            }

            var68 = var68 instanceof Boolean;
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            label429: {
               if (var68) {
                  var68 = (Boolean)var5;
                  if (var24 != 0) {
                     var68 = (byte)(var68 != 0 ? 1 : 0);
                  }

                  byte var25 = var68;
                  ð var75 = this.ð_ú_2;
                  Util139 var115 = this.dataBuilder4_ü_2;
                  Object[] var151 = new Object[]{null, var14};
                  var151[0] = Integer.valueOf(var25);
                  Object[] var130 = new Object[]{null, null, var115.getBreezeClass3_6(var151).int_è};
                  var130[1] = var6;
                  var130[0] = 90;
                  var68 = (boolean)var75.method_005(var130);
                  if (var2 < 0L) {
                     break label429;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (boolean)var5;
            }

            var68 = var68 instanceof Character;
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            label414: {
               if (var68) {
                  ð var77 = this.ð_ú_2;
                  Util139 var116 = this.dataBuilder4_ü_2;
                  char var126 = (Character)var5;
                  Object[] var152 = new Object[]{null, var14};
                  var152[0] = Integer.valueOf(var126);
                  Object[] var131 = new Object[]{null, null, var116.getBreezeClass3_6(var152).int_è};
                  var131[1] = var6;
                  var131[0] = 67;
                  var68 = (byte)var77.method_005(var131);
                  if (var2 < 0L) {
                     break label414;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (byte)var5;
            }

            var68 = var68 instanceof Short;
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            label400: {
               if (var68) {
                  ð var79 = this.ð_ú_2;
                  Util139 var117 = this.dataBuilder4_ü_2;
                  short var127 = (Short)var5;
                  Object[] var153 = new Object[]{null, var14};
                  var153[0] = Integer.valueOf(var127);
                  Object[] var132 = new Object[]{null, null, var117.getBreezeClass3_6(var153).int_è};
                  var132[1] = var6;
                  var132[0] = 83;
                  var68 = (byte)var79.method_005(var132);
                  if (var2 <= 0L) {
                     break label400;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (byte)var5;
            }

            var68 = var68 instanceof MathUtil3;
         }

         var113 = var24;
      }

      if (var2 >= 0L) {
         if (var113 != 0) {
            label386: {
               if (var68) {
                  ð var81 = this.ð_ú_2;
                  Object[] var133 = new Object[]{
                     null, null, this.dataBuilder4_ü_2.calculate_6(new Object[]{var18, ((MathUtil3)var5).buildString_5(new Object[]{var8})})
                  };
                  var133[1] = var6;
                  var133[0] = 99;
                  var68 = (byte)var81.method_005(var133);
                  if (var2 < 0L) {
                     break label386;
                  }

                  if (var24 != 0) {
                     return;
                  }
               }

               var68 = (byte)var5;
            }

            var68 = var68 instanceof byte[];
         }

         var113 = var24;
      }

      if (var2 >= 0L) {
         if (var113 != 0) {
            if (var68) {
               byte[] var32 = (byte[])var5;
               ð var83 = this.ð_ú_2;
               Object[] var134 = new Object[]{null, null, var32.length};
               var134[1] = var6;
               var134[0] = 91;
               var83.method_005(var134);
               byte[] var26 = var32;
               int var27 = var26.length;
               int var28 = 0;

               label369:
               while (true) {
                  if (var28 < var27) {
                     var68 = var26[var28];
                  } else {
                     var68 = var24;
                     if (var2 > 0L) {
                        break;
                     }
                  }

                  while (true) {
                     int var29 = var68;
                     ð var85 = this.ð_ú_2;
                     Util139 var118 = this.dataBuilder4_ü_2;
                     Object[] var154 = new Object[]{null, var14};
                     var154[0] = var29;
                     var134 = new Object[]{null, null, var118.getBreezeClass3_6(var154).int_è};
                     var134[1] = var6;
                     var134[0] = 66;
                     var85.method_005(var134);
                     var28++;
                     var68 = var24;
                     if (var2 > 0L) {
                        if (var24 == 0) {
                           return;
                        }

                        var68 = var24;
                     }

                     if (var68 != 0) {
                        break;
                     }

                     var68 = var24;
                     if (var2 > 0L) {
                        break label369;
                     }
                  }
               }

               if (var68 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof boolean[];
         }

         var113 = var24;
      }

      if (var2 >= 0L) {
         if (var113 != 0) {
            if (var68) {
               boolean[] var33 = (boolean[])var5;
               ð var87 = this.ð_ú_2;
               Object[] var136 = new Object[]{null, null, var33.length};
               var136[1] = var6;
               var136[0] = 91;
               var87.method_005(var136);
               boolean[] var41 = var33;
               int var48 = var41.length;
               int var55 = 0;

               label342:
               while (true) {
                  if (var55 < var48) {
                     var68 = var41[var55];
                  } else {
                     var68 = var24;
                     if (var2 >= 0L) {
                        break;
                     }
                  }

                  while (true) {
                     int var62 = var68;
                     if (var24 == 0) {
                        return;
                     }

                     ð var89 = this.ð_ú_2;
                     Util139 var119 = this.dataBuilder4_ü_2;
                     int var128 = var62;
                     if (var24 != 0) {
                        var128 = var62 != 0 ? 1 : 0;
                     }

                     Object[] var155 = new Object[]{null, var14};
                     var155[0] = var128;
                     var136 = new Object[]{null, null, var119.getBreezeClass3_6(var155).int_è};
                     var136[1] = var6;
                     var136[0] = 90;
                     var89.method_005(var136);
                     var55++;
                     if (var24 != 0) {
                        break;
                     }

                     var68 = var24;
                     if (var2 >= 0L) {
                        break label342;
                     }
                  }
               }

               if (var68 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof short[];
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            if (var68) {
               short[] var34 = (short[])var5;
               ð var90 = this.ð_ú_2;
               Object[] var138 = new Object[]{null, null, var34.length};
               var138[1] = var6;
               var138[0] = 91;
               var90.method_005(var138);
               short[] var42 = var34;
               int var49 = var42.length;
               int var56 = 0;

               label316:
               while (true) {
                  if (var56 < var49) {
                     var68 = var42[var56];
                  } else {
                     var68 = var24;
                     if (var2 > 0L) {
                        break;
                     }
                  }

                  while (true) {
                     int var63 = var68;
                     ð var92 = this.ð_ú_2;
                     Util139 var120 = this.dataBuilder4_ü_2;
                     Object[] var156 = new Object[]{null, var14};
                     var156[0] = var63;
                     var138 = new Object[]{null, null, var120.getBreezeClass3_6(var156).int_è};
                     var138[1] = var6;
                     var138[0] = 83;
                     var92.method_005(var138);
                     var56++;
                     var68 = var24;
                     if (var2 >= 0L) {
                        if (var24 == 0) {
                           return;
                        }

                        var68 = var24;
                     }

                     if (var68 != 0) {
                        break;
                     }

                     var68 = var24;
                     if (var2 > 0L) {
                        break label316;
                     }
                  }
               }

               if (var68 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof char[];
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            if (var68) {
               char[] var35 = (char[])var5;
               ð var94 = this.ð_ú_2;
               Object[] var140 = new Object[]{null, null, var35.length};
               var140[1] = var6;
               var140[0] = 91;
               var94.method_005(var140);
               char[] var43 = var35;
               int var50 = var43.length;
               int var57 = 0;

               label289:
               while (true) {
                  if (var57 < var50) {
                     var68 = var43[var57];
                  } else {
                     var68 = var24;
                     if (var2 >= 0L) {
                        break;
                     }
                  }

                  while (true) {
                     int var64 = var68;
                     ð var96 = this.ð_ú_2;
                     Util139 var121 = this.dataBuilder4_ü_2;
                     Object[] var157 = new Object[]{null, var14};
                     var157[0] = var64;
                     var140 = new Object[]{null, null, var121.getBreezeClass3_6(var157).int_è};
                     var140[1] = var6;
                     var140[0] = 67;
                     var96.method_005(var140);
                     var57++;
                     var68 = var24;
                     if (var2 > 0L) {
                        if (var24 == 0) {
                           return;
                        }

                        var68 = var24;
                     }

                     if (var68 != 0) {
                        break;
                     }

                     var68 = var24;
                     if (var2 >= 0L) {
                        break label289;
                     }
                  }
               }

               if (var68 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof int[];
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            if (var68) {
               int[] var36 = (int[])var5;
               ð var98 = this.ð_ú_2;
               Object[] var142 = new Object[]{null, null, var36.length};
               var142[1] = var6;
               var142[0] = 91;
               var98.method_005(var142);
               int[] var44 = var36;
               int var51 = var44.length;
               int var58 = 0;

               label262:
               while (true) {
                  if (var58 < var51) {
                     var68 = var44[var58];
                  } else {
                     var68 = var24;
                     if (var2 >= 0L) {
                        break;
                     }
                  }

                  while (true) {
                     int var65 = var68;
                     ð var100 = this.ð_ú_2;
                     Util139 var122 = this.dataBuilder4_ü_2;
                     Object[] var158 = new Object[]{null, var14};
                     var158[0] = var65;
                     var142 = new Object[]{null, null, var122.getBreezeClass3_6(var158).int_è};
                     var142[1] = var6;
                     var142[0] = 73;
                     var100.method_005(var142);
                     var58++;
                     var68 = var24;
                     if (var2 > 0L) {
                        if (var24 == 0) {
                           return;
                        }

                        var68 = var24;
                     }

                     if (var68 != 0) {
                        break;
                     }

                     var68 = var24;
                     if (var2 >= 0L) {
                        break label262;
                     }
                  }
               }

               if (var68 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof long[];
         }

         var113 = var24;
      }

      if (var2 > 0L) {
         if (var113 != 0) {
            if (var68) {
               long[] var37 = (long[])var5;
               ð var102 = this.ð_ú_2;
               Object[] var144 = new Object[]{null, null, var37.length};
               var144[1] = var6;
               var144[0] = 91;
               var102.method_005(var144);
               long[] var45 = var37;
               int var52 = var45.length;
               int var59 = 0;

               while (var59 < var52) {
                  long var30 = var45[var59];
                  ð var103 = this.ð_ú_2;
                  Util139 var123 = this.dataBuilder4_ü_2;
                  Object[] var159 = new Object[]{null, var20};
                  var159[0] = var30;
                  var144 = new Object[]{null, null, var123.getBreezeClass3_9(var159).int_è};
                  var144[1] = var6;
                  var144[0] = 74;
                  var103.method_005(var144);
                  var59++;
                  var68 = var24;
                  if (var2 > 0L) {
                     if (var24 == 0) {
                        return;
                     }

                     var68 = var24;
                  }

                  if (var68 == 0) {
                     break;
                  }
               }

               if (var2 <= 0L || var24 != 0) {
                  return;
               }
            }

            var68 = var5 instanceof float[];
         }

         var113 = var24;
      }

      label492: {
         label493: {
            if (var113 != 0) {
               if (var68) {
                  float[] var38 = (float[])var5;
                  ð var105 = this.ð_ú_2;
                  Object[] var146 = new Object[]{null, null, var38.length};
                  var146[1] = var6;
                  var146[0] = 91;
                  var105.method_005(var146);
                  float[] var46 = var38;
                  int var53 = var46.length;
                  int var60 = 0;

                  while (var60 < var53) {
                     float var66 = var46[var60];
                     ð var106 = this.ð_ú_2;
                     Util139 var124 = this.dataBuilder4_ü_2;
                     Object[] var160 = new Object[]{null, var66};
                     var160[0] = var16;
                     var146 = new Object[]{null, null, var124.getBreezeClass3_7(var160).int_è};
                     var146[1] = var6;
                     var146[0] = 70;
                     var106.method_005(var146);
                     var60++;
                     var68 = var24;
                     if (var2 >= 0L) {
                        if (var24 == 0) {
                           return;
                        }

                        var68 = var24;
                     }

                     if (var68 == 0) {
                        break;
                     }
                  }

                  if (var2 <= 0L || var24 != 0) {
                     return;
                  }
               }

               var108 = var5;
               if (var24 == 0) {
                  break label493;
               }

               var68 = var5 instanceof double[];
            }

            if (!var68) {
               break label492;
            }

            var108 = var5;
         }

         double[] var39 = (double[])var108;
         ð var109 = this.ð_ú_2;
         Object[] var148 = new Object[]{null, null, var39.length};
         var148[1] = var6;
         var148[0] = 91;
         var109.method_005(var148);
         double[] var47 = var39;
         int var54 = var47.length;
         int var61 = 0;

         while (var61 < var54) {
            double var67 = var47[var61];
            ð var110 = this.ð_ú_2;
            Util139 var125 = this.dataBuilder4_ü_2;
            Object[] var161 = new Object[]{null, var12};
            var161[0] = var67;
            var148 = new Object[]{null, null, var125.getBreezeClass3_10(var161).int_è};
            var148[1] = var6;
            var148[0] = 68;
            var110.method_005(var148);
            var61++;
            var68 = var24;
            if (var2 > 0L) {
               if (var24 == 0) {
                  return;
               }

               var68 = var24;
            }

            if (var68 == 0) {
               break;
            }
         }

         if (var2 < 0L || var24 != 0) {
            return;
         }
      }

      BreezeClass3 var40 = this.dataBuilder4_ü_2.getBreezeClass3(new Object[]{var5, var22});
      ð var112 = this.ð_ú_2;
      char var114 = method_010(27038, 8851564212519884266L ^ var2).charAt(var40.int_ç);
      Object[] var150 = new Object[]{null, null, var40.int_è};
      var150[1] = var6;
      var150[0] = Integer.valueOf(var114);
      var112.method_005(var150);
   }

   @Override
   public void invoke_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      long var7 = var3 ^ 20188048428192L;
      long var9 = var3 ^ 92528591836373L;
      long var11 = var3 ^ 46814049146473L;
      int var10000 = Util140.getValue();
      this.int_ø_2++;
      int var13 = var10000;
      û var14 = this;
      if (var13 == 0) {
         if (this.bool_û_2) {
            ð var15 = this.ð_ú_2;
            int var10001 = this.dataBuilder4_ü_2.calculate_6(new Object[]{var11, var2});
            Object[] var10004 = new Object[]{null, var9};
            var10004[0] = var10001;
            var15.method_004(var10004);
         }

         var14 = this;
      }

      ð var16 = var14.ð_ú_2;
      Object[] var10005 = new Object[]{null, null, this.dataBuilder4_ü_2.calculate_6(new Object[]{var11, var5})};
      var10005[1] = var7;
      var10005[0] = 101;
      ð var17 = var16.method_005(var10005);
      int var18 = this.dataBuilder4_ü_2.calculate_6(new Object[]{var11, var6});
      Object[] var19 = new Object[]{null, var9};
      var19[0] = var18;
      var17.method_004(var19);
   }

   @Override
   public ü invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 35242823305296L;
      long var8 = var4 ^ 112659195973669L;
      long var10 = var4 ^ 27222581138073L;
      long var12 = (var4 ^ 27515888405835L) >>> 16;
      int var14 = (int)((var4 ^ 27515888405835L) << 48 >>> 48);
      int var10000 = Util140.getValue_2();
      this.int_ø_2++;
      int var15 = var10000;
      û var16 = this;
      if (var15 != 0) {
         if (this.bool_û_2) {
            ð var17 = this.ð_ú_2;
            int var10001 = this.dataBuilder4_ü_2.calculate_6(new Object[]{var10, var2});
            Object[] var10004 = new Object[]{null, var8};
            var10004[0] = var10001;
            var17.method_004(var10004);
         }

         ð var18 = this.ð_ú_2;
         Object[] var10005 = new Object[]{null, null, this.dataBuilder4_ü_2.calculate_6(new Object[]{var10, var3})};
         var10005[1] = var6;
         var10005[0] = 64;
         ð var19 = var18.method_005(var10005);
         Object[] var20 = new Object[]{null, var8};
         var20[0] = 0;
         var19.method_004(var20);
         var16 = new û(this.dataBuilder4_ü_2, var12, true, this.ð_ú_2, null, (short)var14);
      }

      return var16;
   }

   @Override
   public ü invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 101486054354108L;
      long var7 = var2 ^ 28819374585033L;
      long var9 = var2 ^ 110512923326069L;
      long var11 = (var2 ^ 111351339936167L) >>> 16;
      int var13 = (int)((var2 ^ 111351339936167L) << 48 >>> 48);
      int var10000 = Util140.getValue_2();
      this.int_ø_2++;
      int var14 = var10000;
      û var15 = this;
      if (var14 != 0) {
         if (this.bool_û_2) {
            ð var16 = this.ð_ú_2;
            int var10001 = this.dataBuilder4_ü_2.calculate_6(new Object[]{var9, var4});
            Object[] var10004 = new Object[]{null, var7};
            var10004[0] = var10001;
            var16.method_004(var10004);
         }

         ð var17 = this.ð_ú_2;
         Object[] var10005 = new Object[]{null, null, 0};
         var10005[1] = var5;
         var10005[0] = 91;
         var17.method_005(var10005);
         var15 = new û(this.dataBuilder4_ü_2, var11, false, this.ð_ú_2, null, (short)var13);
      }

      return var15;
   }

   @Override
   public void invoke_5(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = Util140.getValue_2();
      û var10000 = this;
      if (var4 != 0) {
         if (this.int_ù_2 == -1) {
            return;
         }

         var10000 = this;
      }

      byte[] var5 = var10000.ð_ú_2.arr_ÿ_2;
      var5[this.int_ù_2] = (byte)(this.int_ø_2 >>> 8);
      var5[this.int_ù_2 + 1] = (byte)this.int_ø_2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   int invoke_3(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 77398481618766L;
      int var7 = Util140.getValue_2();
      if (var2 != null) {
         this.dataBuilder4_ü_2.calculate_6(new Object[]{var5, var2});
      }

      int var8 = 8;
      û var9 = this;

      int var10000;
      label34:
      while (true) {
         if (var9 != null) {
            var10000 = var8 + var9.ð_ú_2.int_þ_2;
            if (var3 > 0L) {
               if (var7 == 0) {
                  break;
               }

               var8 = var10000;
               var9 = var9.û_ö_2;
               var10000 = var7;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         while (var3 < 0L) {
            if (var7 != 0) {
               continue label34;
            }
         }

         var10000 = var8;
         break;
      }

      return var10000;
   }

   static int invoke_4(Object[] var0) {
      long var1 = (Long)var0[0];
      û var3 = (û)var0[1];
      û var4 = (û)var0[2];
      û var5 = (û)var0[3];
      û var6 = (û)var0[4];
      var1 = encKey_b_2 ^ var1;
      long var7 = var1 ^ 8568616719274L;
      int var10000 = Util140.getValue();
      int var9 = 0;
      int var10 = var10000;
      û var12 = var3;
      if (var10 == 0) {
         if (var3 != null) {
            var9 += var3.method_003(new Object[]{method_010(17218, 2600851088756374755L ^ var1), var7});
         }

         var12 = var4;
      }

      int var10001 = var10;
      if (var1 > 0L) {
         if (var10 == 0) {
            if (var12 != null) {
               var9 += var4.method_003(new Object[]{method_010(21541, 1523070969485159298L ^ var1), var7});
            }

            var12 = var5;
         }

         var10001 = var10;
      }

      if (var10001 == 0) {
         if (var12 != null) {
            var9 += var5.method_003(new Object[]{method_010(23052, 2116569177604482472L ^ var1), var7});
         }

         var12 = var6;
      }

      if (var12 != null) {
         var9 += var6.method_003(new Object[]{method_010(19754, 7906378803759870597L ^ var1), var7});
      }

      return var9;
   }

   @Override
   void invoke_5(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:24 from source 21_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/ð
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 5
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 6
      // 033: pop
      // 034: iload 4
      // 036: i2l
      // 037: bipush 32
      // 039: lshl
      // 03a: iload 5
      // 03c: i2l
      // 03d: bipush 48
      // 03f: lshl
      // 040: bipush 32
      // 042: lushr
      // 043: lor
      // 044: iload 6
      // 046: i2l
      // 047: bipush 48
      // 049: lshl
      // 04a: bipush 48
      // 04c: lushr
      // 04d: lor
      // 04e: getstatic rip/breeze/inject/û.encKey_b_2 J
      // 051: lxor
      // 052: lstore 7
      // 054: lload 7
      // 056: dup2
      // 057: ldc2_w 110022903252780
      // 05a: lxor
      // 05b: lstore 9
      // 05d: dup2
      // 05e: ldc2_w 45557453575699
      // 061: lxor
      // 062: lstore 11
      // 064: dup2
      // 065: ldc2_w 65194081990435
      // 068: lxor
      // 069: lstore 13
      // 06b: dup2
      // 06c: ldc2_w 107382985065612
      // 06f: lxor
      // 070: lstore 15
      // 072: pop2
      // 073: bipush 2
      // 074: istore 17
      // 076: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 079: bipush 0
      // 07a: istore 18
      // 07c: istore 19
      // 07e: aload 0
      // 07f: astore 20
      // 081: aconst_null
      // 082: astore 21
      // 084: aload 20
      // 086: ifnull 0c7
      // 089: aload 20
      // 08b: lload 13
      // 08d: bipush 1
      // 08e: anewarray 80
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: invokevirtual rip/breeze/inject/û.method_005 ([Ljava/lang/Object;)V
      // 09d: iload 17
      // 09f: aload 20
      // 0a1: getfield rip/breeze/inject/û.ð_ú_2 Lrip/breeze/inject/ð;
      // 0a4: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0a7: iadd
      // 0a8: istore 17
      // 0aa: iinc 18 1
      // 0ad: aload 20
      // 0af: astore 21
      // 0b1: aload 20
      // 0b3: getfield rip/breeze/inject/û.û_ö_2 Lrip/breeze/inject/û;
      // 0b6: iload 4
      // 0b8: ifle 127
      // 0bb: astore 20
      // 0bd: iload 19
      // 0bf: ifne 125
      // 0c2: iload 19
      // 0c4: ifeq 084
      // 0c7: aload 3
      // 0c8: iload 2
      // 0c9: lload 9
      // 0cb: bipush 2
      // 0cc: anewarray 80
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0e3: pop
      // 0e4: aload 3
      // 0e5: iload 17
      // 0e7: lload 11
      // 0e9: bipush 2
      // 0ea: anewarray 80
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 101: pop
      // 102: aload 3
      // 103: iload 18
      // 105: lload 9
      // 107: bipush 2
      // 108: anewarray 80
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 11f: pop
      // 120: iload 5
      // 122: ifgt 0bd
      // 125: aload 21
      // 127: astore 20
      // 129: aload 20
      // 12b: ifnull 174
      // 12e: aload 3
      // 12f: aload 20
      // 131: getfield rip/breeze/inject/û.ð_ú_2 Lrip/breeze/inject/ð;
      // 134: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 137: bipush 0
      // 138: aload 20
      // 13a: getfield rip/breeze/inject/û.ð_ú_2 Lrip/breeze/inject/ð;
      // 13d: getfield rip/breeze/inject/ð.int_þ_2 I
      // 140: lload 15
      // 142: bipush 4
      // 143: anewarray 80
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 3
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 154: bipush 2
      // 155: swap
      // 156: aastore
      // 157: dup_x1
      // 158: swap
      // 159: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15c: bipush 1
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 167: pop
      // 168: aload 20
      // 16a: getfield rip/breeze/inject/û.û_õ_2 Lrip/breeze/inject/û;
      // 16d: astore 20
      // 16f: iload 19
      // 171: ifeq 129
      // 174: iload 5
      // 176: ifgt 16f
      // 179: return
   }

   static void invoke_6(Object[] var0) {
      Util139 var1 = (Util139)var0[0];
      û var2 = (û)var0[1];
      û var3 = (û)var0[2];
      û var4 = (û)var0[3];
      long var5 = (Long)var0[4];
      û var7 = (û)var0[5];
      ð var8 = (ð)var0[6];
      var5 = encKey_b_2 ^ var5;
      long var9 = var5 ^ 112941050983768L;
      long var10001 = var5 ^ 127007535854577L;
      int var11 = (int)((var5 ^ 127007535854577L) >>> 32);
      int var12 = (int)((var5 ^ 127007535854577L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      int var14 = Util140.getValue_2();
      û var10000 = var2;
      if (var14 != 0) {
         if (var2 != null) {
            int var16 = var1.calculate_6(new Object[]{var9, method_010(9878, 5260651832289557425L ^ var5)});
            short var10004 = (short)var12;
            Object[] var10007 = new Object[]{null, null, null, null, var13};
            var10007[3] = Integer.valueOf(var10004);
            var10007[2] = var11;
            var10007[1] = var8;
            var10007[0] = var16;
            var2.method_005(var10007);
         }

         var10000 = var3;
      }

      int var17 = var14;
      if (var5 > 0L) {
         if (var14 != 0) {
            if (var10000 != null) {
               int var18 = var1.calculate_6(new Object[]{var9, method_010(13760, 8511914311533160672L ^ var5)});
               short var20 = (short)var12;
               Object[] var23 = new Object[]{null, null, null, null, var13};
               var23[3] = Integer.valueOf(var20);
               var23[2] = var11;
               var23[1] = var8;
               var23[0] = var18;
               var3.method_005(var23);
            }

            var10000 = var4;
         }

         var17 = var14;
      }

      if (var5 > 0L) {
         if (var17 != 0) {
            if (var10000 != null) {
               int var19 = var1.calculate_6(new Object[]{var9, method_010(27039, 8142247138984309945L ^ var5)});
               short var21 = (short)var12;
               Object[] var24 = new Object[]{null, null, null, null, var13};
               var24[3] = Integer.valueOf(var21);
               var24[2] = var11;
               var24[1] = var8;
               var24[0] = var19;
               var4.method_005(var24);
            }

            var10000 = var7;
         }

         var17 = var14;
      }

      if (var5 > 0L) {
         if (var17 != 0) {
            if (var10000 == null) {
               return;
            }

            var10000 = var7;
         }

         var17 = var1.calculate_6(new Object[]{var9, method_010(17396, 8967377793400708817L ^ var5)});
      }

      short var22 = (short)var12;
      Object[] var25 = new Object[]{null, null, null, null, var13};
      var25[3] = Integer.valueOf(var22);
      var25[2] = var11;
      var25[1] = var8;
      var25[0] = var17;
      var10000.method_005(var25);
   }

   static int invoke_7(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      û[] var4 = (û[])var0[2];
      int var5 = (Integer)var0[3];
      var1 = encKey_b_2 ^ var1;
      long var6 = var1 ^ 58304238461284L;
      int var10000 = Util140.getValue();
      int var8 = 7 + 2 * var5;
      int var9 = var10000;
      int var10 = 0;

      while (true) {
         if (var10 < var5) {
            û var11 = var4[var10];
            var10000 = var8;
            if (var9 != 0) {
               break;
            }

            int var14;
            label22: {
               û var10001 = var11;
               if (var9 == 0) {
                  if (var11 == null) {
                     var14 = 0;
                     break label22;
                  }

                  var10001 = var11;
               }

               var14 = var10001.method_003(new Object[]{var3, var6}) - 8;
            }

            var8 += var14;
            var10++;
            if (var9 == 0) {
               continue;
            }
         }

         var10000 = var8;
         break;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void invoke_8(Object[] var0) {
      int var1 = (Integer)var0[0];
      û[] var2 = (û[])var0[1];
      long var3 = (Long)var0[2];
      int var5 = (Integer)var0[3];
      ð var6 = (ð)var0[4];
      var3 = encKey_b_2 ^ var3;
      long var7 = var3 ^ 80466985695964L;
      long var9 = var3 ^ 138951775927319L;
      long var11 = var3 ^ 15535002746698L;
      long var13 = var3 ^ 56211004730664L;
      long var15 = var3 ^ 36539991542808L;
      long var17 = var3 ^ 136178439323575L;
      int var10000 = Util140.getValue();
      int var19 = 1 + 2 * var5;
      int var20 = var10000;
      int var21 = 0;

      label102: {
         while (true) {
            if (var21 < var5) {
               û var22 = var2[var21];
               var10000 = var19;
               if (var20 != 0) {
                  break;
               }

               int var31;
               label96: {
                  û var10001 = var22;
                  if (var20 == 0) {
                     if (var22 == null) {
                        var31 = 0;
                        break label96;
                     }

                     var10001 = var22;
                  }

                  var31 = var10001.method_003(new Object[]{null, var7}) - 8;
               }

               var19 += var31;
               var21++;
               if (var20 == 0) {
                  continue;
               }
            }

            Object[] var10004 = new Object[]{null, var9};
            var10004[0] = var1;
            var6.method_004(var10004);
            var10004 = new Object[]{null, var13};
            var10004[0] = var19;
            var6.method_007(var10004);
            var10004 = new Object[]{null, var11};
            var10004[0] = var5;
            var6.method_002(var10004);
            if (var3 < 0L) {
               break label102;
            }

            var10000 = 0;
            break;
         }

         var21 = var10000;
      }

      while (var21 < var5) {
         û var26 = var2[var21];
         û var23 = null;
         int var24 = 0;

         label81: {
            label80:
            while (true) {
               if (var26 != null) {
                  var26.method_005(new Object[]{var15});
                  var24++;
                  var23 = var26;
                  var29 = var26.û_ö_2;
                  if (var3 < 0L) {
                     break label81;
                  }

                  var26 = var26.û_ö_2;
                  if (var20 != 0) {
                     break;
                  }

                  if (var20 == 0) {
                     continue;
                  }
               }

               do {
                  Object[] var35 = new Object[]{null, var9};
                  var35[0] = var24;
                  var6.method_004(var35);
                  if (var3 > 0L || var20 != 0) {
                     break label80;
                  }
               } while (var20 != 0);
            }

            var29 = var23;
         }

         var26 = var29;

         label59:
         while (true) {
            if (var26 != null) {
               byte[] var32 = var26.ð_ú_2.arr_ÿ_2;
               int var10003 = var26.ð_ú_2.int_þ_2;
               Object[] var10006 = new Object[]{null, null, null, var17};
               var10006[2] = var10003;
               var10006[1] = 0;
               var10006[0] = var32;
               var6.method_012(var10006);
               var26 = var26.û_õ_2;
            } else if (var3 > 0L) {
               var21++;
               var10000 = var20;
               break;
            }

            do {
               var10000 = var20;
               if (var3 < 0L) {
                  break label59;
               }

               if (var20 != 0) {
                  var10000 = var20;
                  break label59;
               }

               if (var20 == 0) {
                  continue label59;
               }
            } while (var3 <= 0L);

            var21++;
            var10000 = var20;
            break;
         }

         if (var10000 != 0) {
            break;
         }
      }
   }

   static {
      long var0 = 103173512747875L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "<\u0016\u009b;èñ'ô\u0086ô°ã%m\u0007\u0090R¿\u0010\u0089Pq?¨Zñ\u0016¹Z°FÔ¶\u0098\u0097wMQX\u0018\u0080\u0095µèÀÀÛ\u0017^¤\u0096^NzuH \fb\n\u00ad\u0003ö×HÏÒò^\u0098\u0081J\u0087|\u001fÏîò\u0017XÈSÆ\u001a*\u00007<r8\u009aÅ\u0016\\\u0084þ\u0099ñ¾m\nfMµ\u0083îµ\u008a[\u009eás1«<\u001aÊ&\u001f»)Õ\u008a¡ÒÃ\u0087ùw\u0004%ÝÂiLÍù,\u0089R!ÎURõî0\u009cT\u0083\u0004r^LR\u0010áÉ\u007fýòÏÔþÏ\t³±áøÆ\u0098\u0002{ë\u001dè¨\u0005tÁ\rÁV\u0014Ó\u000f\u0098§SãÚO\u008c¿0Cî[2§£\u0097\u0015tGX\u001a/n«\nÍI\u001f\n\u001ay¬\u0001\u009e\u0014äU»\u0094pjÛ\u009e¬ j\u001aø\\¿0\u0080=²]Úü8\u001e\u0081\u0097NMµèqÝð©ç~UO\u0090=\u0013È¿SmPËè\u00840ô& \u0091Ð¶\u009fgÐ¯èR$fp\u001fµonr_$è¢\\ìw\u0013í0f@r¿\u00941U¢\u000f+\u0006\u009câ\u008d\u0010\u0005ÝS<\u000f0ðS%%M¡ý\u0004¤\u0098óqé\u0095-\u0013í¢.S>E\u0010´\u00adD\n";
      int var7 = "<\u0016\u009b;èñ'ô\u0086ô°ã%m\u0007\u0090R¿\u0010\u0089Pq?¨Zñ\u0016¹Z°FÔ¶\u0098\u0097wMQX\u0018\u0080\u0095µèÀÀÛ\u0017^¤\u0096^NzuH \fb\n\u00ad\u0003ö×HÏÒò^\u0098\u0081J\u0087|\u001fÏîò\u0017XÈSÆ\u001a*\u00007<r8\u009aÅ\u0016\\\u0084þ\u0099ñ¾m\nfMµ\u0083îµ\u008a[\u009eás1«<\u001aÊ&\u001f»)Õ\u008a¡ÒÃ\u0087ùw\u0004%ÝÂiLÍù,\u0089R!ÎURõî0\u009cT\u0083\u0004r^LR\u0010áÉ\u007fýòÏÔþÏ\t³±áøÆ\u0098\u0002{ë\u001dè¨\u0005tÁ\rÁV\u0014Ó\u000f\u0098§SãÚO\u008c¿0Cî[2§£\u0097\u0015tGX\u001a/n«\nÍI\u001f\n\u001ay¬\u0001\u009e\u0014äU»\u0094pjÛ\u009e¬ j\u001aø\\¿0\u0080=²]Úü8\u001e\u0081\u0097NMµèqÝð©ç~UO\u0090=\u0013È¿SmPËè\u00840ô& \u0091Ð¶\u009fgÐ¯èR$fp\u001fµonr_$è¢\\ìw\u0013í0f@r¿\u00941U¢\u000f+\u0006\u009câ\u008d\u0010\u0005ÝS<\u000f0ðS%%M¡ý\u0004¤\u0098óqé\u0095-\u0013í¢.S>E\u0010´\u00adD\n"
         .length();
      char var8 = '8';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_009(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "5S\r\u009a\u001dC§ÄË\u009bÉ}\u0005¶áêd\u0015\u00ad°e8\u0096\u001bòz¬\u001cÖ-\u0098ö/1bl¾yß%ÀH'\u0007\u0088þnåÒÁ\u0081¥Çtð|8]!\u009ah\u0006¶\u0082Qý 'So.¾\u0011\nwå©µ$Úe¨Ã\fÛ^\u0097\u001bé\u0090\rü®¨÷s°+Ípk\u008cÒªÚLÇµ9;\u0011r¦";
            var7 = "5S\r\u009a\u001dC§ÄË\u009bÉ}\u0005¶áêd\u0015\u00ad°e8\u0096\u001bòz¬\u001cÖ-\u0098ö/1bl¾yß%ÀH'\u0007\u0088þnåÒÁ\u0081¥Çtð|8]!\u009ah\u0006¶\u0082Qý 'So.¾\u0011\nwå©µ$Úe¨Ã\fÛ^\u0097\u001bé\u0090\rü®¨÷s°+Ípk\u008cÒªÚLÇµ9;\u0011r¦"
               .length();
            var8 = '8';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_009(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_C_2 = var4;
                  CONST_D_2 = new String[9];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_9(byte[] var0) {
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

   private static String invoke_10(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9347;
      if (CONST_D_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/û", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C_2[var3].getBytes("ISO-8859-1");
         CONST_D_2[var3] = method_009(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D_2[var3];
   }
}
