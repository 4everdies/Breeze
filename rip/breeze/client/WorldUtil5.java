package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;

class WorldUtil5 implements IBreezeInterface {
   static final WorldUtil5 CONST_A;
   private static final String[] CONST_B;
   private static final String[] CONST_C;

   public boolean isValid(long var1, String var3) {
      return var3.startsWith(buildString(1566155430 - (char)-14214, 1566155430 - (char)-8364, (int)var1));
   }

   public Object getObject(String param1, AtomicInteger param2, long param3, Util112 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: lload 3
      // 001: dup2
      // 002: ldc2_w 86336726936101
      // 005: lxor
      // 006: lstore 6
      // 008: dup2
      // 009: ldc2_w 64438626796945
      // 00c: lxor
      // 00d: lstore 8
      // 00f: dup2
      // 010: ldc2_w 88622662033979
      // 013: lxor
      // 014: dup2
      // 015: bipush 32
      // 017: lushr
      // 018: l2i
      // 019: istore 10
      // 01b: dup2
      // 01c: bipush 32
      // 01e: lshl
      // 01f: bipush 48
      // 021: lushr
      // 022: l2i
      // 023: istore 11
      // 025: dup2
      // 026: bipush 48
      // 028: lshl
      // 029: bipush 48
      // 02b: lushr
      // 02c: l2i
      // 02d: istore 12
      // 02f: pop2
      // 030: pop2
      // 031: aload 5
      // 033: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 036: astore 13
      // 038: aload 13
      // 03a: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 03d: istore 14
      // 03f: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 042: aload 2
      // 043: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 046: istore 15
      // 048: astore 16
      // 04a: aload 2
      // 04b: bipush 3
      // 04c: invokevirtual java/util/concurrent/atomic/AtomicInteger.addAndGet (I)I
      // 04f: istore 17
      // 051: bipush -1
      // 052: istore 18
      // 054: aload 1
      // 055: iload 17
      // 057: invokevirtual java/lang/String.charAt (I)C
      // 05a: bipush 10
      // 05c: if_icmpne 06b
      // 05f: aload 2
      // 060: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 063: istore 17
      // 065: aload 13
      // 067: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 06a: pop
      // 06b: iload 17
      // 06d: istore 19
      // 06f: iload 19
      // 071: aload 1
      // 072: invokevirtual java/lang/String.length ()I
      // 075: if_icmpge 102
      // 078: aload 1
      // 079: iload 19
      // 07b: invokevirtual java/lang/String.charAt (I)C
      // 07e: istore 20
      // 080: iload 20
      // 082: bipush 10
      // 084: lload 3
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 0a8
      // 08a: if_icmpne 09e
      // 08d: aload 13
      // 08f: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 092: pop
      // 093: aload 16
      // 095: lload 3
      // 096: lconst_0
      // 097: lcmp
      // 098: iflt 0ff
      // 09b: ifnull 0f7
      // 09e: iload 20
      // 0a0: lload 3
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 0fb
      // 0a6: bipush 34
      // 0a8: if_icmpne 0f7
      // 0ab: aload 1
      // 0ac: invokevirtual java/lang/String.length ()I
      // 0af: lload 3
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: iflt 0fb
      // 0b5: iload 19
      // 0b7: bipush 2
      // 0b8: iadd
      // 0b9: if_icmple 0f7
      // 0bc: aload 1
      // 0bd: iload 19
      // 0bf: bipush 1
      // 0c0: iadd
      // 0c1: invokevirtual java/lang/String.charAt (I)C
      // 0c4: lload 3
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 0fb
      // 0ca: bipush 34
      // 0cc: if_icmpne 0f7
      // 0cf: aload 1
      // 0d0: iload 19
      // 0d2: bipush 2
      // 0d3: iadd
      // 0d4: invokevirtual java/lang/String.charAt (I)C
      // 0d7: lload 3
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: iflt 0fb
      // 0dd: bipush 34
      // 0df: if_icmpne 0f7
      // 0e2: iload 19
      // 0e4: istore 18
      // 0e6: aload 2
      // 0e7: bipush 2
      // 0e8: invokevirtual java/util/concurrent/atomic/AtomicInteger.addAndGet (I)I
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 10a
      // 0f1: pop
      // 0f2: aload 16
      // 0f4: ifnull 102
      // 0f7: aload 2
      // 0f8: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 0fb: istore 19
      // 0fd: aload 16
      // 0ff: ifnull 06f
      // 102: iload 18
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 07e
      // 10a: bipush -1
      // 10b: if_icmpne 139
      // 10e: new rip/breeze/client/StringBuilderUtil
      // 111: dup
      // 112: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 115: astore 19
      // 117: aload 19
      // 119: aload 5
      // 11b: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 11e: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 121: aload 1
      // 122: iload 15
      // 124: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 127: iload 10
      // 129: swap
      // 12a: iload 11
      // 12c: i2s
      // 12d: swap
      // 12e: iload 12
      // 130: swap
      // 131: iload 14
      // 133: invokevirtual rip/breeze/client/StringBuilderUtil.update_11 (Ljava/lang/String;ISILjava/lang/String;I)V
      // 136: aload 19
      // 138: areturn
      // 139: aload 1
      // 13a: iload 17
      // 13c: iload 18
      // 13e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 141: astore 1
      // 142: aload 1
      // 143: ldc 926795970
      // 145: sipush -22910
      // 148: i2c
      // 149: isub
      // 14a: ldc 926795970
      // 14c: sipush -29730
      // 14f: i2c
      // 150: isub
      // 151: lload 3
      // 152: l2i
      // 153: invokestatic rip/breeze/client/WorldUtil5.buildString (III)Ljava/lang/String;
      // 156: ldc ""
      // 158: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 15b: astore 1
      // 15c: getstatic rip/breeze/client/EnumFacing.CONST_A Lrip/breeze/client/EnumFacing;
      // 15f: lload 6
      // 161: aload 1
      // 162: invokevirtual rip/breeze/client/EnumFacing.buildString (JLjava/lang/String;)Ljava/lang/String;
      // 165: astore 1
      // 166: getstatic rip/breeze/client/EnumFacing.CONST_A Lrip/breeze/client/EnumFacing;
      // 169: aload 1
      // 16a: lload 8
      // 16c: invokevirtual rip/breeze/client/EnumFacing.buildString_2 (Ljava/lang/String;J)Ljava/lang/String;
      // 16f: astore 1
      // 170: aload 1
      // 171: areturn
   }

   private WorldUtil5() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[2];
      int var1 = 0;
      String var2 = "\u00adk¯\u0005®À\u0000»à";
      int var3 = "\u00adk¯\u0005®À\u0000»à".length();
      char var4 = 3;
      int var5 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var5, var5 + var4).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 68;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 68;
               var10006 = var6;
            } else {
               var13 = 68;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 68;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 117;
                     break;
                  case 1:
                     var29 = 21;
                     break;
                  case 2:
                     var29 = 60;
                     break;
                  case 3:
                     var29 = 105;
                     break;
                  case 4:
                     var29 = 87;
                     break;
                  case 5:
                     var29 = 43;
                     break;
                  default:
                     var29 = 83;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var1++] = var15;
         if ((var5 += var4) >= var3) {
            CONST_B = var0;
            CONST_C = new String[2];
            CONST_A = new WorldUtil5();
            return;
         }

         var4 = var2.charAt(var5);
      }
   }

   private static String buildString(int var0, int var1, int var2) {
      int var3 = (var0 ^ var2 ^ 14521) & 65535;
      if (CONST_C[var3] == null) {
         char[] var4 = CONST_B[var3].toCharArray();
         short var10000;
         switch (var4[0] & 0xFF) {
            case 0:
               var10000 = 13;
               break;
            case 1:
               var10000 = 109;
               break;
            case 2:
               var10000 = 178;
               break;
            case 3:
               var10000 = 130;
               break;
            case 4:
               var10000 = 225;
               break;
            case 5:
               var10000 = 90;
               break;
            case 6:
               var10000 = 190;
               break;
            case 7:
               var10000 = 10;
               break;
            case 8:
               var10000 = 139;
               break;
            case 9:
               var10000 = 94;
               break;
            case 10:
               var10000 = 84;
               break;
            case 11:
               var10000 = 23;
               break;
            case 12:
               var10000 = 60;
               break;
            case 13:
               var10000 = 26;
               break;
            case 14:
               var10000 = 185;
               break;
            case 15:
               var10000 = 182;
               break;
            case 16:
               var10000 = 149;
               break;
            case 17:
               var10000 = 176;
               break;
            case 18:
               var10000 = 91;
               break;
            case 19:
               var10000 = 11;
               break;
            case 20:
               var10000 = 248;
               break;
            case 21:
               var10000 = 147;
               break;
            case 22:
               var10000 = 161;
               break;
            case 23:
               var10000 = 107;
               break;
            case 24:
               var10000 = 8;
               break;
            case 25:
               var10000 = 223;
               break;
            case 26:
               var10000 = 237;
               break;
            case 27:
               var10000 = 249;
               break;
            case 28:
               var10000 = 207;
               break;
            case 29:
               var10000 = 170;
               break;
            case 30:
               var10000 = 203;
               break;
            case 31:
               var10000 = 201;
               break;
            case 32:
               var10000 = 6;
               break;
            case 33:
               var10000 = 69;
               break;
            case 34:
               var10000 = 22;
               break;
            case 35:
               var10000 = 153;
               break;
            case 36:
               var10000 = 64;
               break;
            case 37:
               var10000 = 4;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 220;
               break;
            case 40:
               var10000 = 75;
               break;
            case 41:
               var10000 = 244;
               break;
            case 42:
               var10000 = 111;
               break;
            case 43:
               var10000 = 42;
               break;
            case 44:
               var10000 = 86;
               break;
            case 45:
               var10000 = 72;
               break;
            case 46:
               var10000 = 113;
               break;
            case 47:
               var10000 = 246;
               break;
            case 48:
               var10000 = 172;
               break;
            case 49:
               var10000 = 212;
               break;
            case 50:
               var10000 = 156;
               break;
            case 51:
               var10000 = 47;
               break;
            case 52:
               var10000 = 252;
               break;
            case 53:
               var10000 = 14;
               break;
            case 54:
               var10000 = 137;
               break;
            case 55:
               var10000 = 5;
               break;
            case 56:
               var10000 = 162;
               break;
            case 57:
               var10000 = 228;
               break;
            case 58:
               var10000 = 128;
               break;
            case 59:
               var10000 = 46;
               break;
            case 60:
               var10000 = 80;
               break;
            case 61:
               var10000 = 117;
               break;
            case 62:
               var10000 = 115;
               break;
            case 63:
               var10000 = 52;
               break;
            case 64:
               var10000 = 112;
               break;
            case 65:
               var10000 = 197;
               break;
            case 66:
               var10000 = 82;
               break;
            case 67:
               var10000 = 202;
               break;
            case 68:
               var10000 = 39;
               break;
            case 69:
               var10000 = 187;
               break;
            case 70:
               var10000 = 234;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 243;
               break;
            case 73:
               var10000 = 155;
               break;
            case 74:
               var10000 = 106;
               break;
            case 75:
               var10000 = 27;
               break;
            case 76:
               var10000 = 255;
               break;
            case 77:
               var10000 = 167;
               break;
            case 78:
               var10000 = 76;
               break;
            case 79:
               var10000 = 229;
               break;
            case 80:
               var10000 = 250;
               break;
            case 81:
               var10000 = 142;
               break;
            case 82:
               var10000 = 45;
               break;
            case 83:
               var10000 = 150;
               break;
            case 84:
               var10000 = 96;
               break;
            case 85:
               var10000 = 7;
               break;
            case 86:
               var10000 = 70;
               break;
            case 87:
               var10000 = 205;
               break;
            case 88:
               var10000 = 206;
               break;
            case 89:
               var10000 = 166;
               break;
            case 90:
               var10000 = 198;
               break;
            case 91:
               var10000 = 152;
               break;
            case 92:
               var10000 = 230;
               break;
            case 93:
               var10000 = 108;
               break;
            case 94:
               var10000 = 19;
               break;
            case 95:
               var10000 = 254;
               break;
            case 96:
               var10000 = 222;
               break;
            case 97:
               var10000 = 37;
               break;
            case 98:
               var10000 = 34;
               break;
            case 99:
               var10000 = 253;
               break;
            case 100:
               var10000 = 32;
               break;
            case 101:
               var10000 = 62;
               break;
            case 102:
               var10000 = 120;
               break;
            case 103:
               var10000 = 25;
               break;
            case 104:
               var10000 = 118;
               break;
            case 105:
               var10000 = 224;
               break;
            case 106:
               var10000 = 49;
               break;
            case 107:
               var10000 = 58;
               break;
            case 108:
               var10000 = 116;
               break;
            case 109:
               var10000 = 247;
               break;
            case 110:
               var10000 = 158;
               break;
            case 111:
               var10000 = 194;
               break;
            case 112:
               var10000 = 199;
               break;
            case 113:
               var10000 = 239;
               break;
            case 114:
               var10000 = 233;
               break;
            case 115:
               var10000 = 160;
               break;
            case 116:
               var10000 = 129;
               break;
            case 117:
               var10000 = 143;
               break;
            case 118:
               var10000 = 93;
               break;
            case 119:
               var10000 = 131;
               break;
            case 120:
               var10000 = 251;
               break;
            case 121:
               var10000 = 121;
               break;
            case 122:
               var10000 = 186;
               break;
            case 123:
               var10000 = 122;
               break;
            case 124:
               var10000 = 29;
               break;
            case 125:
               var10000 = 97;
               break;
            case 126:
               var10000 = 51;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 134;
               break;
            case 129:
               var10000 = 241;
               break;
            case 130:
               var10000 = 175;
               break;
            case 131:
               var10000 = 195;
               break;
            case 132:
               var10000 = 20;
               break;
            case 133:
               var10000 = 114;
               break;
            case 134:
               var10000 = 21;
               break;
            case 135:
               var10000 = 217;
               break;
            case 136:
               var10000 = 208;
               break;
            case 137:
               var10000 = 146;
               break;
            case 138:
               var10000 = 188;
               break;
            case 139:
               var10000 = 145;
               break;
            case 140:
               var10000 = 98;
               break;
            case 141:
               var10000 = 61;
               break;
            case 142:
               var10000 = 204;
               break;
            case 143:
               var10000 = 78;
               break;
            case 144:
               var10000 = 245;
               break;
            case 145:
               var10000 = 104;
               break;
            case 146:
               var10000 = 218;
               break;
            case 147:
               var10000 = 151;
               break;
            case 148:
               var10000 = 144;
               break;
            case 149:
               var10000 = 132;
               break;
            case 150:
               var10000 = 83;
               break;
            case 151:
               var10000 = 164;
               break;
            case 152:
               var10000 = 124;
               break;
            case 153:
               var10000 = 66;
               break;
            case 154:
               var10000 = 38;
               break;
            case 155:
               var10000 = 136;
               break;
            case 156:
               var10000 = 9;
               break;
            case 157:
               var10000 = 193;
               break;
            case 158:
               var10000 = 50;
               break;
            case 159:
               var10000 = 89;
               break;
            case 160:
               var10000 = 200;
               break;
            case 161:
               var10000 = 36;
               break;
            case 162:
               var10000 = 54;
               break;
            case 163:
               var10000 = 3;
               break;
            case 164:
               var10000 = 236;
               break;
            case 165:
               var10000 = 0;
               break;
            case 166:
               var10000 = 65;
               break;
            case 167:
               var10000 = 44;
               break;
            case 168:
               var10000 = 123;
               break;
            case 169:
               var10000 = 103;
               break;
            case 170:
               var10000 = 140;
               break;
            case 171:
               var10000 = 68;
               break;
            case 172:
               var10000 = 77;
               break;
            case 173:
               var10000 = 219;
               break;
            case 174:
               var10000 = 177;
               break;
            case 175:
               var10000 = 163;
               break;
            case 176:
               var10000 = 102;
               break;
            case 177:
               var10000 = 189;
               break;
            case 178:
               var10000 = 221;
               break;
            case 179:
               var10000 = 235;
               break;
            case 180:
               var10000 = 73;
               break;
            case 181:
               var10000 = 171;
               break;
            case 182:
               var10000 = 15;
               break;
            case 183:
               var10000 = 40;
               break;
            case 184:
               var10000 = 87;
               break;
            case 185:
               var10000 = 57;
               break;
            case 186:
               var10000 = 95;
               break;
            case 187:
               var10000 = 31;
               break;
            case 188:
               var10000 = 157;
               break;
            case 189:
               var10000 = 85;
               break;
            case 190:
               var10000 = 214;
               break;
            case 191:
               var10000 = 71;
               break;
            case 192:
               var10000 = 24;
               break;
            case 193:
               var10000 = 154;
               break;
            case 194:
               var10000 = 105;
               break;
            case 195:
               var10000 = 174;
               break;
            case 196:
               var10000 = 92;
               break;
            case 197:
               var10000 = 125;
               break;
            case 198:
               var10000 = 191;
               break;
            case 199:
               var10000 = 159;
               break;
            case 200:
               var10000 = 79;
               break;
            case 201:
               var10000 = 48;
               break;
            case 202:
               var10000 = 110;
               break;
            case 203:
               var10000 = 81;
               break;
            case 204:
               var10000 = 17;
               break;
            case 205:
               var10000 = 119;
               break;
            case 206:
               var10000 = 56;
               break;
            case 207:
               var10000 = 213;
               break;
            case 208:
               var10000 = 53;
               break;
            case 209:
               var10000 = 168;
               break;
            case 210:
               var10000 = 43;
               break;
            case 211:
               var10000 = 215;
               break;
            case 212:
               var10000 = 238;
               break;
            case 213:
               var10000 = 210;
               break;
            case 214:
               var10000 = 141;
               break;
            case 215:
               var10000 = 67;
               break;
            case 216:
               var10000 = 148;
               break;
            case 217:
               var10000 = 184;
               break;
            case 218:
               var10000 = 99;
               break;
            case 219:
               var10000 = 55;
               break;
            case 220:
               var10000 = 1;
               break;
            case 221:
               var10000 = 16;
               break;
            case 222:
               var10000 = 192;
               break;
            case 223:
               var10000 = 138;
               break;
            case 224:
               var10000 = 165;
               break;
            case 225:
               var10000 = 183;
               break;
            case 226:
               var10000 = 209;
               break;
            case 227:
               var10000 = 232;
               break;
            case 228:
               var10000 = 2;
               break;
            case 229:
               var10000 = 240;
               break;
            case 230:
               var10000 = 63;
               break;
            case 231:
               var10000 = 126;
               break;
            case 232:
               var10000 = 196;
               break;
            case 233:
               var10000 = 12;
               break;
            case 234:
               var10000 = 100;
               break;
            case 235:
               var10000 = 169;
               break;
            case 236:
               var10000 = 211;
               break;
            case 237:
               var10000 = 133;
               break;
            case 238:
               var10000 = 226;
               break;
            case 239:
               var10000 = 179;
               break;
            case 240:
               var10000 = 242;
               break;
            case 241:
               var10000 = 28;
               break;
            case 242:
               var10000 = 127;
               break;
            case 243:
               var10000 = 35;
               break;
            case 244:
               var10000 = 135;
               break;
            case 245:
               var10000 = 74;
               break;
            case 246:
               var10000 = 231;
               break;
            case 247:
               var10000 = 88;
               break;
            case 248:
               var10000 = 41;
               break;
            case 249:
               var10000 = 101;
               break;
            case 250:
               var10000 = 33;
               break;
            case 251:
               var10000 = 18;
               break;
            case 252:
               var10000 = 227;
               break;
            case 253:
               var10000 = 181;
               break;
            case 254:
               var10000 = 30;
               break;
            default:
               var10000 = 180;
         }

         short var5 = var10000;
         int var10;
         int var6 = ((var10 = var1 ^ var2) & 0xFF) - var5;
         if (var6 < 0) {
            var6 += 256;
         }

         int var7 = ((var10 & 65535) >>> 8) - var5;
         if (var7 < 0) {
            var7 += 256;
         }

         for (int var8 = 0; var8 < var4.length; var8++) {
            int var9 = var8 % 2;
            char var10002 = var4[var8];
            if (var9 == 0) {
               var4[var8] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var4[var8]) & 0xFF;
            } else {
               var4[var8] = (char)(var10002 ^ var7);
               var7 = ((var7 >>> 3 | var7 << 5) ^ var4[var8]) & 0xFF;
            }
         }

         CONST_C[var3] = new String(var4).intern();
      }

      return CONST_C[var3];
   }
}
