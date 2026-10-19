package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class õ {
   public final String string_ÿ_2;
   private ð ð_þ_2;
   õ õ_ý_2;
   private static final String[] CONST_C_2;
   private static final String[] CONST_D_2;
   private static final Map CONST_E_2 = new HashMap(13);

   protected õ(String var1) {
      this.string_ÿ_2 = var1;
   }

   public boolean check_1(Object[] var1) {
      return true;
   }

   public boolean check_2(Object[] var1) {
      return false;
   }

   @Deprecated
   protected ª[] invoke_3(Object[] var1) {
      return new ª[0];
   }

   protected õ invoke_4(Object[] var1) {
      ï var2 = (ï)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      char[] var5 = (char[])var1[3];
      int var6 = (Integer)var1[4];
      ª[] var7 = (ª[])var1[5];
      long var8 = (Long)var1[6];
      õ var10 = new õ(this.string_ÿ_2);
      Object[] var10007 = new Object[]{null, var4};
      var10007[0] = var3;
      var10.ð_þ_2 = new ð(var2.method_036(var10007));
      return var10;
   }

   public static õ invoke_5(Object[] var0) {
      õ var1 = (õ)var0[0];
      ï var2 = (ï)var0[1];
      int var3 = (Integer)var0[2];
      long var4 = (Long)var0[3];
      int var6 = (Integer)var0[4];
      char[] var7 = (char[])var0[5];
      int var8 = (Integer)var0[6];
      ª[] var9 = (ª[])var0[7];
      var4 = encKey_a_2 ^ var4;
      long var10 = var4 ^ 1034140219340L;
      Object[] var10009 = new Object[]{null, null, null, null, null, var9, var10};
      var10009[4] = var8;
      var10009[3] = var7;
      var10009[2] = var6;
      var10009[1] = var3;
      var10009[0] = var2;
      return var1.method_004(var10009);
   }

   public static ª invoke_6(Object[] var0) {
      ï var1 = (ï)var0[0];
      long var2 = (Long)var0[1];
      int var4 = (Integer)var0[2];
      ª[] var5 = (ª[])var0[3];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 63006477639865L;
      Object[] var10005 = new Object[]{null, var5, var6};
      var10005[0] = var4;
      return var1.method_017(var10005);
   }

   private ð invoke_7(Object[] var1) {
      í var2 = (í)var1[0];
      byte[] var3 = (byte[])var1[1];
      int var4 = (Integer)var1[2];
      long var5 = (Long)var1[3];
      int var7 = (Integer)var1[4];
      int var8 = (Integer)var1[5];
      var5 = encKey_a_2 ^ var5;
      long var9 = var5 ^ 44911174618847L;
      int var11 = Util140.getValue();
      ð var10000 = this.ð_þ_2;
      if (var11 == 0) {
         if (this.ð_þ_2 == null) {
            Object[] var10009 = new Object[]{null, null, null, null, null, var8};
            var10009[4] = var7;
            var10009[3] = var4;
            var10009[2] = var3;
            var10009[1] = var2;
            var10009[0] = var9;
            this.ð_þ_2 = this.method_008(var10009);
         }

         var10000 = this.ð_þ_2;
      }

      return var10000;
   }

   protected ð invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
      í var4 = (í)var1[1];
      byte[] var5 = (byte[])var1[2];
      int var6 = (Integer)var1[3];
      int var7 = (Integer)var1[4];
      int var8 = (Integer)var1[5];
      return this.ð_þ_2;
   }

   public static byte[] invoke_9(Object[] var0) {
      õ var1 = (õ)var0[0];
      long var2 = (Long)var0[1];
      í var4 = (í)var0[2];
      byte[] var5 = (byte[])var0[3];
      int var6 = (Integer)var0[4];
      int var7 = (Integer)var0[5];
      int var8 = (Integer)var0[6];
      var2 = encKey_a_2 ^ var2;
      long var9 = var2 ^ 66097181314639L;
      Object[] var10008 = new Object[]{null, null, null, null, null, var8};
      var10008[4] = var7;
      var10008[3] = var9;
      var10008[2] = var6;
      var10008[1] = var5;
      var10008[0] = var4;
      ð var11 = var1.method_007(var10008);
      byte[] var12 = new byte[var11.int_þ_2];
      System.arraycopy(var11.arr_ÿ_2, 0, var12, 0, var11.int_þ_2);
      return var12;
   }

   final int invoke_10(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic rip/breeze/inject/õ.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 15: bipush 0
      // 16: istore 4
      // 18: aload 0
      // 19: astore 5
      // 1b: istore 6
      // 1d: aload 5
      // 1f: ifnull 31
      // 22: iinc 4 1
      // 25: aload 5
      // 27: getfield rip/breeze/inject/õ.õ_ý_2 Lrip/breeze/inject/õ;
      // 2a: astore 5
      // 2c: iload 6
      // 2e: ifne 1d
      // 31: iload 4
      // 33: lload 2
      // 34: lconst_0
      // 35: lcmp
      // 36: ifle 2e
      // 39: ireturn
   }

   final int invoke_11(Object[] var1) {
      Util139 var2 = (Util139)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 13489715601548L;
      Object var7 = null;
      boolean var8 = false;
      byte var9 = -1;
      byte var10 = -1;
      Object[] var10008 = new Object[]{null, null, null, null, null, -1};
      var10008[4] = -1;
      var10008[3] = var5;
      var10008[2] = 0;
      var10008[1] = var7;
      var10008[0] = var2;
      return this.method_012(var10008);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int invoke_12(Object[] var1) {
      Util139 var2 = (Util139)var1[0];
      byte[] var3 = (byte[])var1[1];
      int var4 = (Integer)var1[2];
      long var5 = (Long)var1[3];
      int var7 = (Integer)var1[4];
      int var8 = (Integer)var1[5];
      var5 = encKey_a_2 ^ var5;
      long var9 = var5 ^ 33923024401334L;
      long var11 = var5 ^ 91840810466745L;
      int var10000 = Util140.getValue();
      í var13 = var2.í_ÿ;
      int var14 = 0;
      int var15 = var10000;
      õ var16 = this;

      label28:
      while (true) {
         if (var16 != null) {
            String var10002 = var16.string_ÿ_2;
            var2.calculate_6(new Object[]{var11, var10002});
         } else if (var5 > 0L) {
            var10000 = var14;
            break;
         }

         do {
            Object[] var10010 = new Object[]{null, null, null, null, null, var8};
            var10010[4] = var7;
            var10010[3] = var9;
            var10010[2] = var4;
            var10010[1] = var3;
            var10010[0] = var13;
            var10000 = var14 + 6 + var16.method_007(var10010).int_þ_2;
            if (var5 > 0L) {
               if (var15 != 0) {
                  return var10000;
               }

               var14 = var10000;
               var16 = var16.õ_ý_2;
               var10000 = var15;
            }

            if (var10000 == 0) {
               continue label28;
            }
         } while (var5 <= 0L);

         var10000 = var14;
         break;
      }

      return var10000;
   }

   static int invoke_13(Object[] var0) {
      Util139 var1;
      int var4;
      long var6;
      byte var8;
      int var9;
      long var10;
      int var11;
      int var10001;
      label43: {
         var1 = (Util139)var0[0];
         long var2 = (Long)var0[1];
         var4 = (Integer)var0[2];
         int var5 = (Integer)var0[3];
         var10 = encKey_a_2 ^ var2;
         var6 = var10 ^ 131724806721361L;
         var11 = Util140.getValue();
         var8 = 0;
         var9 = var11;
         var11 = var4 & 4096;
         label42:
         if (var9 == 0) {
            if (var11 != 0) {
               var11 = var1.getValue(new Object[0]);
               var10001 = var9;
               if (var10 < 0L) {
                  break label43;
               }

               if (var9 != 0) {
                  break label42;
               }

               if (var11 < 49) {
                  var1.calculate_6(new Object[]{var6, method_018(15356, 8772292433716035778L ^ var10)});
                  var8 += 6;
               }
            }

            var11 = var5;
         }

         var10001 = var9;
      }

      if (var10 >= 0L) {
         if (var10001 == 0) {
            if (var11 != 0) {
               var1.calculate_6(new Object[]{var6, method_018(19356, 5396818574083862693L ^ var10)});
               var8 += 8;
            }

            var11 = var4 & 131072;
         }

         var10001 = var9;
      }

      if (var10001 == 0) {
         if (var11 != 0) {
            var1.calculate_6(new Object[]{var6, method_018(10630, 5153038287125205692L ^ var10)});
            var8 += 6;
         }

         var11 = var8;
      }

      return var11;
   }

   final void invoke_14(Object[] var1) {
      Util139 var2 = (Util139)var1[0];
      ð var3 = (ð)var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 3519027669038L;
      Object var8 = null;
      boolean var9 = false;
      byte var10 = -1;
      byte var11 = -1;
      Object[] var10009 = new Object[]{null, null, null, null, null, -1, var3};
      var10009[4] = -1;
      var10009[3] = 0;
      var10009[2] = var6;
      var10009[1] = var8;
      var10009[0] = var2;
      this.method_015(var10009);
   }

   final void invoke_15(Object[] var1) {
      Util139 var2 = (Util139)var1[0];
      byte[] var3 = (byte[])var1[1];
      long var4 = (Long)var1[2];
      int var6 = (Integer)var1[3];
      int var7 = (Integer)var1[4];
      int var8 = (Integer)var1[5];
      ð var9 = (ð)var1[6];
      var4 = encKey_a_2 ^ var4;
      long var10 = var4 ^ 828931709298L;
      long var12 = var4 ^ 85481121941581L;
      long var14 = var4 ^ 56250247255489L;
      long var16 = var4 ^ 139044251114446L;
      long var18 = var4 ^ 6028935617234L;
      int var10000 = Util140.getValue();
      í var20 = var2.í_ÿ;
      õ var21 = this;
      int var22 = var10000;

      while (var21 != null) {
         Object[] var10008 = new Object[]{null, null, null, null, null, var8};
         var10008[4] = var7;
         var10008[3] = var14;
         var10008[2] = var6;
         var10008[1] = var3;
         var10008[0] = var20;
         ð var23 = var21.method_007(var10008);
         String var10003 = var21.string_ÿ_2;
         int var10001 = var2.calculate_6(new Object[]{var16, var10003});
         Object[] var10004 = new Object[]{null, var10};
         var10004[0] = var10001;
         ð var25 = var9.method_004(var10004);
         var10001 = var23.int_þ_2;
         var10004 = new Object[]{null, var12};
         var10004[0] = var10001;
         var25.method_007(var10004);
         byte[] var27 = var23.arr_ÿ_2;
         int var28 = var23.int_þ_2;
         Object[] var10006 = new Object[]{null, null, null, var18};
         var10006[2] = var28;
         var10006[1] = 0;
         var10006[0] = var27;
         var9.method_012(var10006);
         var21 = var21.õ_ý_2;
         if (var22 != 0) {
            break;
         }
      }
   }

   static void invoke_16(Object[] var0) {
      Util139 var1;
      int var2;
      int var3;
      ð var4;
      long var7;
      long var9;
      long var11;
      long var14;
      int var10000;
      int var10001;
      label35: {
         int var13;
         var1 = (Util139)var0[0];
         var2 = (Integer)var0[1];
         var3 = (Integer)var0[2];
         var4 = (ð)var0[3];
         long var5 = (Long)var0[4];
         var14 = encKey_a_2 ^ var5;
         var7 = var14 ^ 29761344414410L;
         var9 = var14 ^ 95033761608693L;
         var11 = var14 ^ 111761915158646L;
         var13 = Util140.getValue_2();
         var10000 = var2 & 4096;
         label34:
         if (var13 != 0) {
            if (var10000 != 0) {
               var10000 = var1.getValue(new Object[0]);
               var10001 = var13;
               if (var14 < 0L) {
                  break label35;
               }

               if (var13 == 0) {
                  break label34;
               }

               if (var10000 < 49) {
                  var10001 = var1.calculate_6(new Object[]{var11, method_018(22405, 5356752900414505882L ^ var14)});
                  Object[] var10004 = new Object[]{null, var7};
                  var10004[0] = var10001;
                  ð var15 = var4.method_004(var10004);
                  var10004 = new Object[]{null, var9};
                  var10004[0] = 0;
                  var15.method_007(var10004);
               }
            }

            var10000 = var3;
         }

         var10001 = var13;
      }

      if (var10001 != 0) {
         if (var10000 != 0) {
            var10001 = var1.calculate_6(new Object[]{var11, method_018(24581, 7347272146518455321L ^ var14)});
            Object[] var23 = new Object[]{null, var7};
            var23[0] = var10001;
            ð var16 = var4.method_004(var23);
            var23 = new Object[]{null, var9};
            var23[0] = 2;
            ð var17 = var16.method_007(var23);
            var23 = new Object[]{null, var7};
            var23[0] = var3;
            var17.method_004(var23);
         }

         var10000 = var2 & 131072;
      }

      if (var10000 != 0) {
         var10001 = var1.calculate_6(new Object[]{var11, method_018(5495, 8559032636020605295L ^ var14)});
         Object[] var26 = new Object[]{null, var7};
         var26[0] = var10001;
         ð var18 = var4.method_004(var26);
         var26 = new Object[]{null, var9};
         var26[0] = 0;
         var18.method_007(var26);
      }
   }

   static {
      long var0 = 36324679260683L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "K´Õ\u008f\u008añy\u0085\u0001\u001e7&\fÝm¨Ïë\u0098\u008eæ©üÁ 4x¯eÐ\u009d^\u0095K\u0093WÊªtmÀ\b\u0082\u009f\u001d\u0017Ì\u0010¿\u0086ð(*S*{W L~ËìËÏ\u008eß=5\u0097êW`&\u0094ÖÈêÍ\u0099`oóÍ.\u008fkúT\u000eW Ô\u008aáö\u0004TÒí\u007fÝÈ,ØùÍUÞ\u0082¶`A±ÍÌ\u0098ýQ¡Ã5Þç";
      int var7 = "K´Õ\u008f\u008añy\u0085\u0001\u001e7&\fÝm¨Ïë\u0098\u008eæ©üÁ 4x¯eÐ\u009d^\u0095K\u0093WÊªtmÀ\b\u0082\u009f\u001d\u0017Ì\u0010¿\u0086ð(*S*{W L~ËìËÏ\u008eß=5\u0097êW`&\u0094ÖÈêÍ\u0099`oóÍ.\u008fkúT\u000eW Ô\u008aáö\u0004TÒí\u007fÝÈ,ØùÍUÞ\u0082¶`A±ÍÌ\u0098ýQ¡Ã5Þç"
         .length();
      char var8 = '\u0018';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_017(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "f\u0094¢Ù9ÝZV\u0097`Ú²R(Q\u001b\u0098Å¼À\u0087=C\n!gãm\u0018¡\u0097\u0090 \u008bf\\o®lL0Ìµ¼ni8\u0089%¨\u0017¯\u0010YÙÅ¦?2Èe\u0015ý\u0085Ê";
            var7 = "f\u0094¢Ù9ÝZV\u0097`Ú²R(Q\u001b\u0098Å¼À\u0087=C\n!gãm\u0018¡\u0097\u0090 \u008bf\\o®lL0Ìµ¼ni8\u0089%¨\u0017¯\u0010YÙÅ¦?2Èe\u0015ý\u0085Ê"
               .length();
            var8 = ' ';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_017(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_C_2 = var4;
                  CONST_D_2 = new String[6];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_17(byte[] var0) {
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

   private static String invoke_18(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30866;
      if (CONST_D_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/õ", var10);
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
         CONST_D_2[var3] = method_017(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D_2[var3];
   }
}
