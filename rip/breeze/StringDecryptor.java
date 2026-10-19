package rip.breeze;

import java.util.ArrayList;
import java.util.Vector;

public class StringDecryptor implements IBreezeInterface3 {
   private long fieldLong_a;
   private int[] arr_b;
   private IBreezeInterface3 iBreezeInterface3_c;
   private long fieldLong_d;
   private long[] arr_j;
   private static long[] arr_k = new long[64];
   static int[] arr_e;
   private static ArrayList arrayList_f;
   private static Vector vector_m;
   private static int fieldInt_i;
   private static Object object_o;
   private static int fieldInt_h = 52;
   private static int fieldInt_l = 128;
   private static int fieldInt_n = 17;

   public static Object getObject() {
      return object_o;
   }

   public static IBreezeInterface3 getIBreezeInterface3(long var0, long var2, Object var4) {
      Util131.toggle(var0 > 0L);
      IBreezeInterface3 var5 = getIBreezeInterface3_3(var0);
      IBreezeInterface3 var6 = getIBreezeInterface3_3(var2);
      IBreezeInterface3 var7 = Util131.getIBreezeInterface3(var5, var6);
      if (var4 != null) {
         vector_m.add(var4);
      }

      return var7;
   }

   static IBreezeInterface3 getIBreezeInterface3_2(long var0) {
      int var2 = (int)getLong_4(var0, fieldInt_h, 63, arr_e, arr_k);
      if (var2 < fieldInt_i) {
         return (IBreezeInterface3)arrayList_f.get(var2);
      }

      if (arrayList_f.size() % fieldInt_l == 0) {
         arr_e = (int[])arr_e.clone();
      }

      StringDecryptor var3 = new StringDecryptor(var0);
      arrayList_f.add(var3);
      return var3;
   }

   private static IBreezeInterface3 getIBreezeInterface3_3(long var0) {
      return new StringDecryptor(var0);
   }

   static void initialize(Util131 var0) {
      fieldInt_i = arrayList_f.size();
      calculate();
      var0.initialize();
   }

   static void update(Util131 var0) {
      calculate();
      int[] var10000 = arr_e = new int[64];
      var10000[0] = -15;
      var10000[1] = -13;
      var10000[2] = -2;
      var10000[3] = -45;
      var10000[4] = 2;
      var10000[5] = -19;
      var10000[6] = -54;
      var10000[7] = -22;
      var10000[8] = -51;
      var10000[9] = -16;
      var10000[10] = -20;
      var10000[11] = -41;
      var10000[12] = -43;
      var10000[13] = -14;
      var10000[14] = 13;
      var10000[15] = 15;
      var10000[16] = -40;
      var10000[17] = -3;
      var10000[18] = -43;
      var10000[19] = -23;
      var10000[20] = 3;
      var10000[21] = -26;
      var10000[22] = -9;
      var10000[23] = -5;
      var10000[24] = 19;
      var10000[25] = 16;
      var10000[26] = -32;
      var10000[27] = 14;
      var10000[28] = 5;
      var10000[29] = 22;
      var10000[30] = 20;
      var10000[31] = 9;
      var10000[32] = -30;
      var10000[33] = -13;
      var10000[34] = -11;
      var10000[35] = -6;
      var10000[36] = -18;
      var10000[37] = -13;
      var10000[38] = -5;
      var10000[39] = -10;
      var10000[40] = -17;
      var10000[41] = 6;
      var10000[42] = 23;
      var10000[43] = 5;
      var10000[44] = -9;
      var10000[45] = 11;
      var10000[46] = 13;
      var10000[47] = 26;
      var10000[48] = 45;
      var10000[49] = 10;
      var10000[50] = 13;
      var10000[51] = -12;
      var10000[52] = 41;
      var10000[53] = 9;
      var10000[54] = 18;
      var10000[55] = 43;
      var10000[56] = 40;
      var10000[57] = 17;
      var10000[58] = 32;
      var10000[59] = 51;
      var10000[60] = 54;
      var10000[61] = 43;
      var10000[62] = 30;
      var10000[63] = 12;
      var0.initialize();
   }

   private StringDecryptor(long var1) {
      this.fieldLong_a = var1;
      this.arr_b = arr_e;
      this.arr_j = arr_k;
   }

   public long getLong(long var1) {
      long var3 = this.getLong_3(8, 55);
      long var5 = this.fieldLong_a ^ var1 ^ this.fieldLong_d;
      this.fieldLong_a = var5;
      if (this.iBreezeInterface3_c != null) {
         this.iBreezeInterface3_c.decryptKey(var1);
      }

      return var3;
   }

   public void initialize_2(long var1) {
      this.fieldLong_d = var1;
   }

   public void processAll(IBreezeInterface3 var1) {
      if (this != var1) {
         if (this.iBreezeInterface3_c == null) {
            this.iBreezeInterface3_c = var1;
         } else {
            this.iBreezeInterface3_c.setObserver(var1);
         }
      }
   }

   @Override
   public int hashCode() {
      return (int)this.getLong_2(8);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof StringDecryptor ? this.getLong_2(56) == ((StringDecryptor)var1).getLong_2(56) : false;
      }
   }

   public boolean checkCondition(IBreezeInterface3 var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof StringDecryptor ? this.getLong_3(56, 63) - ((StringDecryptor)var1).getLong_3(56, 63) <= 0L : true;
      }
   }

   public int[] getDecryptionTable() {
      return this.arr_b;
   }

   private long getLong_2(int var1) {
      return this.getLong_3(0, var1 - 1);
   }

   private long getLong_3(int var1, int var2) {
      return getLong_4(this.fieldLong_a, var1, var2, this.arr_b, this.arr_j);
   }

   private static long getLong_4(long var0, int var2, int var3, int[] var4, long[] var5) {
      long var6 = 0L;
      int var8 = var4.length;

      for (int var9 = 0; var9 < var8; var9++) {
         long var10 = var0 & arr_k[var9];
         long var12 = (long)var4[var9];
         if (var10 != 0L) {
            if (var12 > 0) {
               var10 >>>= var12;
            } else if (var12 < 0) {
               var10 <<= ~var12 + 1;
            }

            var6 |= var10;
         }
      }

      byte var16 = 64;
      long var13 = var6;
      long var15 = (long)(var16 - 1 - var3);
      if (var15 > 0) {
         var13 <<= var15;
      }

      long var17 = (long)(var2 + var16 - 1 - var3);
      if (var17 > 0) {
         var13 >>>= var17;
      }

      return var13;
   }

   private static void calculate() {
      byte var0 = 0;
      calculate_2(0, arrayList_f.size() - 1, arrayList_f, new ArrayList(arrayList_f), var0);
   }

   private static void calculate_2(int var0, int var1, ArrayList var2, ArrayList var3, int var4) {
      if (var0 < var1) {
         int var5 = var0 + (var1 - var0) / 2;
         if (++var4 < fieldInt_n) {
            calculate_2(var0, var5, var2, var3, var4);
            calculate_2(var5 + 1, var1, var2, var3, var4);
         }

         calculate_3(var0, var5, var1, var2, var3);
      }
   }

   private static void calculate_3(int var0, int var1, int var2, ArrayList var3, ArrayList var4) {
      int var5 = var0;
      int var6 = var1 + 1;

      for (int var7 = var0; var7 <= var2; var7++) {
         var4.set(var7, var3.get(var7));
      }

      while (var5 <= var1 && var6 <= var2) {
         IBreezeInterface3 var8;
         if (((IBreezeInterface3)var4.get(var5)).equals((IBreezeInterface3)var4.get(var6))) {
            var8 = (IBreezeInterface3)var4.get(var5++);
         } else {
            var8 = (IBreezeInterface3)var4.get(var6++);
         }

         var3.set(var0, var8);
         var0++;
      }

      while (var5 <= var1) {
         var3.set(var0, var4.get(var5));
         var0++;
         var5++;
      }
   }

   static {
      long var0 = 1L;

      for (int var2 = 0; var2 < 64; var2++) {
         arr_k[var2] = var0;
         var0 <<= 1;
      }

      object_o = new Object();
      vector_m = new Vector();
      arrayList_f = new ArrayList();
      update_1();
      fieldInt_i = arrayList_f.size();
      calculate();
   }

   private static void update_1() {
      arr_e = new int[]{
         -44,
         -25,
         -37,
         -22,
         -32,
         -58,
         -39,
         -49,
         -10,
         -45,
         -6,
         -21,
         -43,
         -21,
         -23,
         -18,
         6,
         -34,
         10,
         -43,
         -38,
         -21,
         -31,
         -4,
         -14,
         22,
         25,
         4,
         -13,
         -30,
         -10,
         -17,
         21,
         18,
         21,
         -12,
         32,
         23,
         14,
         37,
         10,
         13,
         21,
         -14,
         44,
         39,
         -6,
         12,
         17,
         -11,
         -11,
         34,
         6,
         31,
         45,
         43,
         49,
         14,
         38,
         30,
         11,
         11,
         43,
         58
      };
      arrayList_f.add(new StringDecryptor(-5906712865812348354L));
      arrayList_f.add(new StringDecryptor(-8496562076183541530L));
      arrayList_f.add(new StringDecryptor(-7362667756466420489L));
      arrayList_f.add(new StringDecryptor(8930531357904617896L));
      arrayList_f.add(new StringDecryptor(-8886997627006138067L));
      arrayList_f.add(new StringDecryptor(-1950499943194439863L));
      arrayList_f.add(new StringDecryptor(-619563724996555282L));
      arrayList_f.add(new StringDecryptor(5060923924434675466L));
      arrayList_f.add(new StringDecryptor(-8320142820248484184L));
      arrayList_f.add(new StringDecryptor(-3399579559711307042L));
      arrayList_f.add(new StringDecryptor(1003653569900464510L));
      arrayList_f.add(new StringDecryptor(-1073208383006716679L));
      arrayList_f.add(new StringDecryptor(-8107612653955913042L));
      arrayList_f.add(new StringDecryptor(5078491689494448351L));
      arrayList_f.add(new StringDecryptor(-1224730226432750318L));
      arrayList_f.add(new StringDecryptor(-1427071888968604309L));
      arrayList_f.add(new StringDecryptor(-1781559062987332823L));
      arrayList_f.add(new StringDecryptor(6103290775599468367L));
      arrayList_f.add(new StringDecryptor(-275336559505248785L));
      arrayList_f.add(new StringDecryptor(-6369052187998625534L));
      arrayList_f.add(new StringDecryptor(-6809127944767626140L));
      arrayList_f.add(new StringDecryptor(-7711854568471098313L));
      arrayList_f.add(new StringDecryptor(-7808263268452521384L));
      arrayList_f.add(new StringDecryptor(-5688439054275139658L));
      arrayList_f.add(new StringDecryptor(-6904237389249888222L));
      arrayList_f.add(new StringDecryptor(-6517694385005687049L));
      arrayList_f.add(new StringDecryptor(-6808010841491200956L));
      arrayList_f.add(new StringDecryptor(-5691873927511669910L));
      arrayList_f.add(new StringDecryptor(-3012180743586066561L));
      arrayList_f.add(new StringDecryptor(1998228368248562137L));
      arrayList_f.add(new StringDecryptor(6032937114084967228L));
      arrayList_f.add(new StringDecryptor(-5575634560305197793L));
      arrayList_f.add(new StringDecryptor(2416818144678054312L));
      arrayList_f.add(new StringDecryptor(4779151474911298720L));
      arrayList_f.add(new StringDecryptor(7537218080247320378L));
      arrayList_f.add(new StringDecryptor(8408293140479520485L));
      arrayList_f.add(new StringDecryptor(-5145641318557514152L));
      arrayList_f.add(new StringDecryptor(-5654871562799633259L));
      arrayList_f.add(new StringDecryptor(-4814314383512198423L));
      arrayList_f.add(new StringDecryptor(1445535675321698802L));
      arrayList_f.add(new StringDecryptor(3308825349184390992L));
      arrayList_f.add(new StringDecryptor(-7187369034070659297L));
      arrayList_f.add(new StringDecryptor(-6095954162168093900L));
      arrayList_f.add(new StringDecryptor(494679487590016189L));
      arrayList_f.add(new StringDecryptor(1221837219831384852L));
      arrayList_f.add(new StringDecryptor(2251749955166307692L));
      arrayList_f.add(new StringDecryptor(8152196513931792303L));
      arrayList_f.add(new StringDecryptor(6249921617528498997L));
      arrayList_f.add(new StringDecryptor(1733898863003149602L));
      arrayList_f.add(new StringDecryptor(-6828724242975694347L));
      arrayList_f.add(new StringDecryptor(2171300521016937882L));
      arrayList_f.add(new StringDecryptor(5918207411531934332L));
      arrayList_f.add(new StringDecryptor(2459373293746512975L));
      arrayList_f.add(new StringDecryptor(-2704938770718006685L));
      arrayList_f.add(new StringDecryptor(-3137654162870826949L));
      arrayList_f.add(new StringDecryptor(-8850720463548193376L));
      arrayList_f.add(new StringDecryptor(-841511108466251286L));
      arrayList_f.add(new StringDecryptor(2784711303517463065L));
      arrayList_f.add(new StringDecryptor(-6360474933664397547L));
      arrayList_f.add(new StringDecryptor(248949975946939251L));
      arrayList_f.add(new StringDecryptor(6807336328797159439L));
      arrayList_f.add(new StringDecryptor(-107359804178954731L));
      arrayList_f.add(new StringDecryptor(1771201130371981473L));
      arrayList_f.add(new StringDecryptor(-701651277454499171L));
      arrayList_f.add(new StringDecryptor(-2028519730884843824L));
      arrayList_f.add(new StringDecryptor(70072301784615288L));
      arrayList_f.add(new StringDecryptor(6346166307186977856L));
      arrayList_f.add(new StringDecryptor(8194856018566881835L));
      arrayList_f.add(new StringDecryptor(587497410040434499L));
      arrayList_f.add(new StringDecryptor(-2444654085548634690L));
      arrayList_f.add(new StringDecryptor(-6552847957078669812L));
      arrayList_f.add(new StringDecryptor(-2579077744359715554L));
      arrayList_f.add(new StringDecryptor(-777072592405730054L));
      arrayList_f.add(new StringDecryptor(-3137082416823334885L));
      arrayList_f.add(new StringDecryptor(5387526004889454422L));
      arrayList_f.add(new StringDecryptor(7749441078218181470L));
      arrayList_f.add(new StringDecryptor(-5196662081457872092L));
      arrayList_f.add(new StringDecryptor(-5577323410165985857L));
      arrayList_f.add(new StringDecryptor(-5720804753262736539L));
      arrayList_f.add(new StringDecryptor(-653835625402200543L));
      arrayList_f.add(new StringDecryptor(-8791903847748295448L));
      arrayList_f.add(new StringDecryptor(-1204969179330984765L));
      arrayList_f.add(new StringDecryptor(-2810973074855050385L));
      arrayList_f.add(new StringDecryptor(-6656896759212389549L));
      arrayList_f.add(new StringDecryptor(558424367318368561L));
      arrayList_f.add(new StringDecryptor(-1138932304592778655L));
      arrayList_f.add(new StringDecryptor(4524457375220752882L));
      arrayList_f.add(new StringDecryptor(242139266428890150L));
      arrayList_f.add(new StringDecryptor(7597669175202639168L));
      arrayList_f.add(new StringDecryptor(8266686632726594849L));
      arrayList_f.add(new StringDecryptor(-5521897875037904720L));
      arrayList_f.add(new StringDecryptor(-6852354626998632082L));
      arrayList_f.add(new StringDecryptor(3853081832825815231L));
      arrayList_f.add(new StringDecryptor(-9203075466382588658L));
      arrayList_f.add(new StringDecryptor(4125884932153074603L));
      arrayList_f.add(new StringDecryptor(462539379072617714L));
      arrayList_f.add(new StringDecryptor(6799204738265104479L));
      arrayList_f.add(new StringDecryptor(-8639478167427619116L));
      arrayList_f.add(new StringDecryptor(1380922682344301243L));
      arrayList_f.add(new StringDecryptor(1718530888081506951L));
      arrayList_f.add(new StringDecryptor(-2873202931318026316L));
      arrayList_f.add(new StringDecryptor(2289417838482278720L));
      arrayList_f.add(new StringDecryptor(-4715813438205721781L));
      arrayList_f.add(new StringDecryptor(7159252071903014272L));
      arrayList_f.add(new StringDecryptor(3622196390199585192L));
      arrayList_f.add(new StringDecryptor(-3659462249658095375L));
      arrayList_f.add(new StringDecryptor(-2068757654418167397L));
      arrayList_f.add(new StringDecryptor(638463779709192999L));
      arrayList_f.add(new StringDecryptor(-6207668625326144943L));
      arrayList_f.add(new StringDecryptor(-3159362695612667721L));
      arrayList_f.add(new StringDecryptor(-958362111904240001L));
      arrayList_f.add(new StringDecryptor(2339073496022345682L));
      arrayList_f.add(new StringDecryptor(-4087585986700326107L));
      arrayList_f.add(new StringDecryptor(-5894664210468188788L));
      arrayList_f.add(new StringDecryptor(-8664705606955318476L));
      arrayList_f.add(new StringDecryptor(-2750753058266406724L));
      arrayList_f.add(new StringDecryptor(4534114019005427266L));
      arrayList_f.add(new StringDecryptor(542321255245401494L));
      arrayList_f.add(new StringDecryptor(8713510550792579068L));
      arrayList_f.add(new StringDecryptor(-4170416188603915238L));
      arrayList_f.add(new StringDecryptor(1864318889768609833L));
      arrayList_f.add(new StringDecryptor(-2672273224416268845L));
      arrayList_f.add(new StringDecryptor(2769896622813374412L));
      arrayList_f.add(new StringDecryptor(1715309399815766067L));
      arrayList_f.add(new StringDecryptor(4491098772450584655L));
      arrayList_f.add(new StringDecryptor(7645380694604728191L));
      arrayList_f.add(new StringDecryptor(-2233432519964538753L));
      arrayList_f.add(new StringDecryptor(1545985463073153141L));
      arrayList_f.add(new StringDecryptor(-1413776164036033384L));
      arrayList_f.add(new StringDecryptor(5467354888246101288L));
      arrayList_f.add(new StringDecryptor(-1658616573124712660L));
      arrayList_f.add(new StringDecryptor(348491053148299586L));
      arrayList_f.add(new StringDecryptor(-7916360018108289182L));
      arrayList_f.add(new StringDecryptor(7591146885723344207L));
      arrayList_f.add(new StringDecryptor(-5760025370597963176L));
      arrayList_f.add(new StringDecryptor(-7570289970042959159L));
      arrayList_f.add(new StringDecryptor(-7670101371983011423L));
      arrayList_f.add(new StringDecryptor(-4086463508851971279L));
      arrayList_f.add(new StringDecryptor(-6449765508423653336L));
      arrayList_f.add(new StringDecryptor(-222392971526304807L));
      arrayList_f.add(new StringDecryptor(8812338253477004893L));
      arrayList_f.add(new StringDecryptor(7056058469240360954L));
      arrayList_f.add(new StringDecryptor(2247714415401142069L));
      arrayList_f.add(new StringDecryptor(4759729917571837592L));
      arrayList_f.add(new StringDecryptor(4561356346575104926L));
      arrayList_f.add(new StringDecryptor(4124471538840741738L));
      arrayList_f.add(new StringDecryptor(8212591951574527801L));
      arrayList_f.add(new StringDecryptor(8228761858961967879L));
      arrayList_f.add(new StringDecryptor(4166279646034537486L));
      arrayList_f.add(new StringDecryptor(-7010828069537650015L));
      arrayList_f.add(new StringDecryptor(-935428717727994324L));
      arrayList_f.add(new StringDecryptor(-6490997582349669580L));
      arrayList_f.add(new StringDecryptor(4632996743130148523L));
      arrayList_f.add(new StringDecryptor(-5264167041347639183L));
      arrayList_f.add(new StringDecryptor(-4234789291813059330L));
      arrayList_f.add(new StringDecryptor(1022208451684453855L));
      arrayList_f.add(new StringDecryptor(-3008199983618267699L));
      arrayList_f.add(new StringDecryptor(-7236183533787132L));
      arrayList_f.add(new StringDecryptor(-1250412239146456478L));
      arrayList_f.add(new StringDecryptor(-1075774953392977459L));
      arrayList_f.add(new StringDecryptor(1733119683799379186L));
      arrayList_f.add(new StringDecryptor(722746396773551521L));
      arrayList_f.add(new StringDecryptor(7591146885184900431L));
      arrayList_f.add(new StringDecryptor(2164126335875656483L));
      arrayList_f.add(new StringDecryptor(-1121519819668944596L));
      arrayList_f.add(new StringDecryptor(-761496866701991499L));
      arrayList_f.add(new StringDecryptor(-6306386797943730382L));
      arrayList_f.add(new StringDecryptor(-5145239355368012613L));
      arrayList_f.add(new StringDecryptor(4707821967436407663L));
      arrayList_f.add(new StringDecryptor(-43213880932130320L));
      arrayList_f.add(new StringDecryptor(1169278622834427829L));
      arrayList_f.add(new StringDecryptor(-9091286922054375437L));
      arrayList_f.add(new StringDecryptor(308213744205917732L));
      arrayList_f.add(new StringDecryptor(9216707548905775506L));
      arrayList_f.add(new StringDecryptor(2839557343937054072L));
      arrayList_f.add(new StringDecryptor(-7391238882698253739L));
      arrayList_f.add(new StringDecryptor(-8302715056032725677L));
      arrayList_f.add(new StringDecryptor(-2491357541847169330L));
      arrayList_f.add(new StringDecryptor(-482068295112907420L));
      arrayList_f.add(new StringDecryptor(-6208032000963927972L));
      arrayList_f.add(new StringDecryptor(7650956924128824216L));
      arrayList_f.add(new StringDecryptor(-7119903278782837593L));
      arrayList_f.add(new StringDecryptor(965412206442072674L));
      arrayList_f.add(new StringDecryptor(-6888872821162572424L));
      arrayList_f.add(new StringDecryptor(-868847193112695151L));
      arrayList_f.add(new StringDecryptor(-8510080241801384005L));
      arrayList_f.add(new StringDecryptor(-7582281836977379173L));
      arrayList_f.add(new StringDecryptor(4624136797782967704L));
      arrayList_f.add(new StringDecryptor(-895048458543485141L));
      arrayList_f.add(new StringDecryptor(-2155199649339333210L));
      arrayList_f.add(new StringDecryptor(6031965966225752297L));
      arrayList_f.add(new StringDecryptor(-2088677111643034463L));
      arrayList_f.add(new StringDecryptor(-8336555125022686047L));
      arrayList_f.add(new StringDecryptor(-7883758288948410844L));
      arrayList_f.add(new StringDecryptor(-3072527725243603007L));
      arrayList_f.add(new StringDecryptor(-719488235342344886L));
      arrayList_f.add(new StringDecryptor(-2871254724498234765L));
      arrayList_f.add(new StringDecryptor(-6791893035253594450L));
      arrayList_f.add(new StringDecryptor(5633129774339312646L));
      arrayList_f.add(new StringDecryptor(-5985670557925184562L));
      arrayList_f.add(new StringDecryptor(-3975579465657063497L));
      arrayList_f.add(new StringDecryptor(8822787078411864547L));
      arrayList_f.add(new StringDecryptor(-3564383636438645507L));
      arrayList_f.add(new StringDecryptor(-5383703741739241984L));
      arrayList_f.add(new StringDecryptor(5981798570524321326L));
      arrayList_f.add(new StringDecryptor(-4446381878649713670L));
      arrayList_f.add(new StringDecryptor(7303152506844563902L));
      arrayList_f.add(new StringDecryptor(-1356073234617448919L));
      arrayList_f.add(new StringDecryptor(5052942370734400542L));
      arrayList_f.add(new StringDecryptor(-3776728179752271172L));
      arrayList_f.add(new StringDecryptor(9054457181362611992L));
      arrayList_f.add(new StringDecryptor(-1762152343232034246L));
      arrayList_f.add(new StringDecryptor(2364766757331714589L));
      arrayList_f.add(new StringDecryptor(-8209009118544369474L));
      arrayList_f.add(new StringDecryptor(-602903996325732296L));
      arrayList_f.add(new StringDecryptor(275412047231133000L));
      arrayList_f.add(new StringDecryptor(-948534259837253534L));
      arrayList_f.add(new StringDecryptor(361666216292508740L));
      arrayList_f.add(new StringDecryptor(-1575140187778511376L));
      arrayList_f.add(new StringDecryptor(3496105612388640313L));
      arrayList_f.add(new StringDecryptor(-5416687334606599030L));
      arrayList_f.add(new StringDecryptor(-6645607690353400409L));
      arrayList_f.add(new StringDecryptor(5004057572983196102L));
      arrayList_f.add(new StringDecryptor(-4920895397447794247L));
      arrayList_f.add(new StringDecryptor(-8804437326008562662L));
      arrayList_f.add(new StringDecryptor(-7830551254931675924L));
      arrayList_f.add(new StringDecryptor(-8294682495451364419L));
      arrayList_f.add(new StringDecryptor(1749568879135918021L));
      arrayList_f.add(new StringDecryptor(1383474115565765363L));
      arrayList_f.add(new StringDecryptor(8977949342529536983L));
      arrayList_f.add(new StringDecryptor(-3892818687332364908L));
      arrayList_f.add(new StringDecryptor(2994567155760966099L));
      arrayList_f.add(new StringDecryptor(8054091805420351465L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(1598351087790786546L));
      arrayList_f.add(new StringDecryptor(2095150482955354370L));
      arrayList_f.add(new StringDecryptor(-6863048112797588132L));
      arrayList_f.add(new StringDecryptor(-8918902789026069517L));
      arrayList_f.add(new StringDecryptor(-2565331206513325202L));
      arrayList_f.add(new StringDecryptor(-7472913052557171349L));
      arrayList_f.add(new StringDecryptor(-76885235233551741L));
      arrayList_f.add(new StringDecryptor(7301112255588852482L));
      arrayList_f.add(new StringDecryptor(-8949048895307997033L));
      arrayList_f.add(new StringDecryptor(-554563597640498414L));
      arrayList_f.add(new StringDecryptor(7052416810656812750L));
      arrayList_f.add(new StringDecryptor(4690559168384158648L));
      arrayList_f.add(new StringDecryptor(3019894515422053697L));
      arrayList_f.add(new StringDecryptor(8451244528972475457L));
      arrayList_f.add(new StringDecryptor(7395621712143789835L));
      arrayList_f.add(new StringDecryptor(-3305378622656689798L));
      arrayList_f.add(new StringDecryptor(-8885770840597747079L));
      arrayList_f.add(new StringDecryptor(4662042520772504782L));
      arrayList_f.add(new StringDecryptor(-6654952238684649975L));
      arrayList_f.add(new StringDecryptor(520058919964780623L));
      arrayList_f.add(new StringDecryptor(1067466341031505304L));
      arrayList_f.add(new StringDecryptor(-7133943234674651514L));
      arrayList_f.add(new StringDecryptor(8631061501129728559L));
      arrayList_f.add(new StringDecryptor(-6646179436936715001L));
      arrayList_f.add(new StringDecryptor(5473992432148923925L));
      arrayList_f.add(new StringDecryptor(7188446657431448670L));
      arrayList_f.add(new StringDecryptor(2975427006123765254L));
      arrayList_f.add(new StringDecryptor(-5723206824127755683L));
      arrayList_f.add(new StringDecryptor(-5772665764121572863L));
      arrayList_f.add(new StringDecryptor(-569653762125428577L));
      arrayList_f.add(new StringDecryptor(-8275221237814549452L));
      arrayList_f.add(new StringDecryptor(-8059634495369091929L));
      arrayList_f.add(new StringDecryptor(-4487028729865510759L));
      arrayList_f.add(new StringDecryptor(2255565751118122471L));
      arrayList_f.add(new StringDecryptor(-8919009179002805138L));
      arrayList_f.add(new StringDecryptor(5771929444951484959L));
      arrayList_f.add(new StringDecryptor(1166110531321588824L));
      arrayList_f.add(new StringDecryptor(-8378668247919244781L));
      arrayList_f.add(new StringDecryptor(-5831496880547467373L));
      arrayList_f.add(new StringDecryptor(683019049312936255L));
      arrayList_f.add(new StringDecryptor(3015846939079328100L));
      arrayList_f.add(new StringDecryptor(-2185663194557407152L));
      arrayList_f.add(new StringDecryptor(-2872189098761442356L));
      arrayList_f.add(new StringDecryptor(-4074915738795007797L));
      arrayList_f.add(new StringDecryptor(9004005545385853183L));
      arrayList_f.add(new StringDecryptor(2485380185870495085L));
      arrayList_f.add(new StringDecryptor(3662835962581418751L));
      arrayList_f.add(new StringDecryptor(6129168812533358605L));
      arrayList_f.add(new StringDecryptor(-8337126871606524895L));
      arrayList_f.add(new StringDecryptor(1634820274623210411L));
      arrayList_f.add(new StringDecryptor(5136502504245790776L));
      arrayList_f.add(new StringDecryptor(-6453338083576706095L));
      arrayList_f.add(new StringDecryptor(9007927459247514370L));
      arrayList_f.add(new StringDecryptor(-1028498253325186634L));
      arrayList_f.add(new StringDecryptor(-4865497479793661941L));
      arrayList_f.add(new StringDecryptor(6666956664939823655L));
      arrayList_f.add(new StringDecryptor(149853759420384909L));
      arrayList_f.add(new StringDecryptor(7705039120725353977L));
      arrayList_f.add(new StringDecryptor(-8289067395392149595L));
      arrayList_f.add(new StringDecryptor(-6049422177141512932L));
      arrayList_f.add(new StringDecryptor(-8504020415970752288L));
      arrayList_f.add(new StringDecryptor(-2394659888688774117L));
      arrayList_f.add(new StringDecryptor(7732096640530712702L));
      arrayList_f.add(new StringDecryptor(-6448897013156370352L));
      arrayList_f.add(new StringDecryptor(-6849577135109247999L));
      arrayList_f.add(new StringDecryptor(-3993262742287347733L));
      arrayList_f.add(new StringDecryptor(734306491786577363L));
      arrayList_f.add(new StringDecryptor(-963492528323647574L));
      arrayList_f.add(new StringDecryptor(2618973313396392353L));
      arrayList_f.add(new StringDecryptor(-8637828759798152669L));
      arrayList_f.add(new StringDecryptor(-9010616014236661083L));
      arrayList_f.add(new StringDecryptor(4068964809672633596L));
      arrayList_f.add(new StringDecryptor(-7690264859935439534L));
      arrayList_f.add(new StringDecryptor(-8738948458518674205L));
      arrayList_f.add(new StringDecryptor(8045155852693685310L));
      arrayList_f.add(new StringDecryptor(4856847841478829611L));
      arrayList_f.add(new StringDecryptor(9011188097730448239L));
      arrayList_f.add(new StringDecryptor(8846175350078898488L));
      arrayList_f.add(new StringDecryptor(-3373186370036349711L));
      arrayList_f.add(new StringDecryptor(428242490869590076L));
      arrayList_f.add(new StringDecryptor(-4378333699747518611L));
      arrayList_f.add(new StringDecryptor(6179911932837340947L));
      arrayList_f.add(new StringDecryptor(6486518471855484145L));
      arrayList_f.add(new StringDecryptor(2098929256871552348L));
      arrayList_f.add(new StringDecryptor(-7212182270894289580L));
      arrayList_f.add(new StringDecryptor(1488351335313302246L));
      arrayList_f.add(new StringDecryptor(5690758079496448279L));
      arrayList_f.add(new StringDecryptor(4424997402958687592L));
      arrayList_f.add(new StringDecryptor(4963689803786191368L));
      arrayList_f.add(new StringDecryptor(4387514661740897350L));
      arrayList_f.add(new StringDecryptor(-4295345325485350488L));
      arrayList_f.add(new StringDecryptor(8497112044468267406L));
      arrayList_f.add(new StringDecryptor(-8371738894356616117L));
      arrayList_f.add(new StringDecryptor(-8674686091620332918L));
      arrayList_f.add(new StringDecryptor(9043887718909816631L));
      arrayList_f.add(new StringDecryptor(2639935845286854918L));
      arrayList_f.add(new StringDecryptor(-5796851413228172244L));
      arrayList_f.add(new StringDecryptor(-2626815477616644616L));
      arrayList_f.add(new StringDecryptor(-7695091572339949218L));
      arrayList_f.add(new StringDecryptor(7508979116464866350L));
      arrayList_f.add(new StringDecryptor(6755317380978845659L));
      arrayList_f.add(new StringDecryptor(9218405194858537394L));
      arrayList_f.add(new StringDecryptor(6620228251732509689L));
      arrayList_f.add(new StringDecryptor(7912784936307057293L));
      arrayList_f.add(new StringDecryptor(3075223799996992848L));
      arrayList_f.add(new StringDecryptor(-4761270564230486055L));
      arrayList_f.add(new StringDecryptor(7408502266109199988L));
      arrayList_f.add(new StringDecryptor(1685512500213673892L));
      arrayList_f.add(new StringDecryptor(6890536823285042969L));
      arrayList_f.add(new StringDecryptor(2667325988857761192L));
      arrayList_f.add(new StringDecryptor(3295095684369951598L));
      arrayList_f.add(new StringDecryptor(-570953451359171532L));
      arrayList_f.add(new StringDecryptor(-4888117039385206583L));
      arrayList_f.add(new StringDecryptor(3313940593470983501L));
      arrayList_f.add(new StringDecryptor(-5424891348518420202L));
      arrayList_f.add(new StringDecryptor(8856950196742130296L));
      arrayList_f.add(new StringDecryptor(-3012610562537086520L));
      arrayList_f.add(new StringDecryptor(-2867089218668640281L));
      arrayList_f.add(new StringDecryptor(5043739670251078846L));
      arrayList_f.add(new StringDecryptor(3449540779965352919L));
      arrayList_f.add(new StringDecryptor(3448356144101139227L));
      arrayList_f.add(new StringDecryptor(4577885067641039312L));
      arrayList_f.add(new StringDecryptor(-8194909943870780515L));
      arrayList_f.add(new StringDecryptor(6913919263202168601L));
      arrayList_f.add(new StringDecryptor(-934469734622082381L));
      arrayList_f.add(new StringDecryptor(1022176813111087030L));
      arrayList_f.add(new StringDecryptor(-9215223333692865966L));
      arrayList_f.add(new StringDecryptor(-435188718152341493L));
      arrayList_f.add(new StringDecryptor(3503068971036748497L));
      arrayList_f.add(new StringDecryptor(2061114947707145630L));
      arrayList_f.add(new StringDecryptor(-3770068849934332167L));
      arrayList_f.add(new StringDecryptor(-5649016426205083734L));
      arrayList_f.add(new StringDecryptor(-8471487402787198540L));
      arrayList_f.add(new StringDecryptor(5620487090775330576L));
      arrayList_f.add(new StringDecryptor(-8842735453304017416L));
      arrayList_f.add(new StringDecryptor(3385038822646349935L));
      arrayList_f.add(new StringDecryptor(-2614008543544507235L));
      arrayList_f.add(new StringDecryptor(1535403792474482127L));
      arrayList_f.add(new StringDecryptor(-6158407465765927775L));
      arrayList_f.add(new StringDecryptor(-7996343178002766523L));
      arrayList_f.add(new StringDecryptor(5129095023237678571L));
      arrayList_f.add(new StringDecryptor(-4881098572800368016L));
      arrayList_f.add(new StringDecryptor(6025838235931111230L));
      arrayList_f.add(new StringDecryptor(-3733297972599029298L));
      arrayList_f.add(new StringDecryptor(1243110342331703415L));
      arrayList_f.add(new StringDecryptor(-61035718435477662L));
      arrayList_f.add(new StringDecryptor(6499130560236473535L));
      arrayList_f.add(new StringDecryptor(5640049002767270016L));
      arrayList_f.add(new StringDecryptor(3177434857577784756L));
      arrayList_f.add(new StringDecryptor(-5767378408140608369L));
      arrayList_f.add(new StringDecryptor(-482631245065804348L));
      arrayList_f.add(new StringDecryptor(-4577406508812644919L));
      arrayList_f.add(new StringDecryptor(-2887444212875050808L));
      arrayList_f.add(new StringDecryptor(3961426828054487056L));
      arrayList_f.add(new StringDecryptor(8930531357368271144L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(3423480114418877421L));
      arrayList_f.add(new StringDecryptor(8073247131277044199L));
      arrayList_f.add(new StringDecryptor(-5879980425642243691L));
      arrayList_f.add(new StringDecryptor(-2719741115192803251L));
      arrayList_f.add(new StringDecryptor(-1349178454731569093L));
      arrayList_f.add(new StringDecryptor(-8850820134418756975L));
      arrayList_f.add(new StringDecryptor(520153848783055191L));
      arrayList_f.add(new StringDecryptor(6413546131507546320L));
      arrayList_f.add(new StringDecryptor(1130211798440928148L));
      arrayList_f.add(new StringDecryptor(4510887359181695032L));
      arrayList_f.add(new StringDecryptor(5507368139380720265L));
      arrayList_f.add(new StringDecryptor(267765458949958178L));
      arrayList_f.add(new StringDecryptor(6072500954608790741L));
      arrayList_f.add(new StringDecryptor(8059638328684470581L));
      arrayList_f.add(new StringDecryptor(-5720379137960794937L));
      arrayList_f.add(new StringDecryptor(6983362781032426106L));
      arrayList_f.add(new StringDecryptor(-3683040145010521394L));
      arrayList_f.add(new StringDecryptor(-6204072575789069837L));
      arrayList_f.add(new StringDecryptor(-1707507172790294231L));
      arrayList_f.add(new StringDecryptor(-3690186960432190844L));
      arrayList_f.add(new StringDecryptor(3000020138319170430L));
      arrayList_f.add(new StringDecryptor(1203200983814008513L));
      arrayList_f.add(new StringDecryptor(-7689503570240101434L));
      arrayList_f.add(new StringDecryptor(1051701516292842900L));
      arrayList_f.add(new StringDecryptor(-1132133566660114923L));
      arrayList_f.add(new StringDecryptor(-8747062447638189252L));
      arrayList_f.add(new StringDecryptor(6028441603424536342L));
      arrayList_f.add(new StringDecryptor(3292806959685102970L));
      arrayList_f.add(new StringDecryptor(-1357624666579582205L));
      arrayList_f.add(new StringDecryptor(4464176973035496514L));
      arrayList_f.add(new StringDecryptor(1382788485627636373L));
      arrayList_f.add(new StringDecryptor(-7301858374191461555L));
      arrayList_f.add(new StringDecryptor(-1524439940118303408L));
      arrayList_f.add(new StringDecryptor(-6935829123743773185L));
      arrayList_f.add(new StringDecryptor(7621648282045597898L));
      arrayList_f.add(new StringDecryptor(501584392636458053L));
      arrayList_f.add(new StringDecryptor(8642471486555177456L));
      arrayList_f.add(new StringDecryptor(-2378069309893599070L));
      arrayList_f.add(new StringDecryptor(-5709868049811545253L));
      arrayList_f.add(new StringDecryptor(5932764330960964246L));
      arrayList_f.add(new StringDecryptor(7651967048507131453L));
      arrayList_f.add(new StringDecryptor(-4924682858617322716L));
      arrayList_f.add(new StringDecryptor(9001076207481286297L));
      arrayList_f.add(new StringDecryptor(-5712912366889483118L));
      arrayList_f.add(new StringDecryptor(-7795079647469138151L));
      arrayList_f.add(new StringDecryptor(8588465718585181368L));
      arrayList_f.add(new StringDecryptor(938497530103530771L));
      arrayList_f.add(new StringDecryptor(-3596006551161503187L));
      arrayList_f.add(new StringDecryptor(-3203619477215039786L));
      arrayList_f.add(new StringDecryptor(-2489823474396754020L));
      arrayList_f.add(new StringDecryptor(-4426012393076880948L));
      arrayList_f.add(new StringDecryptor(-4820571345069227900L));
      arrayList_f.add(new StringDecryptor(-312568061882127751L));
      arrayList_f.add(new StringDecryptor(7080407861003429861L));
      arrayList_f.add(new StringDecryptor(126292876470463855L));
      arrayList_f.add(new StringDecryptor(110408959352668558L));
      arrayList_f.add(new StringDecryptor(184797253900461492L));
      arrayList_f.add(new StringDecryptor(-6181071322884290150L));
      arrayList_f.add(new StringDecryptor(-1139966623814610979L));
      arrayList_f.add(new StringDecryptor(2026662162674728960L));
      arrayList_f.add(new StringDecryptor(8593886215434389853L));
      arrayList_f.add(new StringDecryptor(-2982809271894530161L));
      arrayList_f.add(new StringDecryptor(7441513073896670608L));
      arrayList_f.add(new StringDecryptor(-1414503912902066107L));
      arrayList_f.add(new StringDecryptor(-4083495303641759229L));
      arrayList_f.add(new StringDecryptor(-8940164036323808324L));
      arrayList_f.add(new StringDecryptor(1628065780783933110L));
      arrayList_f.add(new StringDecryptor(-1344322976370734942L));
      arrayList_f.add(new StringDecryptor(1867469416141065724L));
      arrayList_f.add(new StringDecryptor(7185205552813502041L));
      arrayList_f.add(new StringDecryptor(6417902723541715259L));
      arrayList_f.add(new StringDecryptor(6862222664462011605L));
      arrayList_f.add(new StringDecryptor(-1037516797905425869L));
      arrayList_f.add(new StringDecryptor(-7279092180405264009L));
      arrayList_f.add(new StringDecryptor(1954062224714637425L));
      arrayList_f.add(new StringDecryptor(-9202683377594594135L));
      arrayList_f.add(new StringDecryptor(-7184696353270471866L));
      arrayList_f.add(new StringDecryptor(1029253793591477197L));
      arrayList_f.add(new StringDecryptor(1526018443769249978L));
      arrayList_f.add(new StringDecryptor(3018472433528303556L));
      arrayList_f.add(new StringDecryptor(3804272410862256953L));
      arrayList_f.add(new StringDecryptor(2407543093251039551L));
      arrayList_f.add(new StringDecryptor(8928884041507087963L));
      arrayList_f.add(new StringDecryptor(-2506897870850881121L));
      arrayList_f.add(new StringDecryptor(-4285459172452266060L));
      arrayList_f.add(new StringDecryptor(-935294235816982974L));
      arrayList_f.add(new StringDecryptor(7835793515276993157L));
      arrayList_f.add(new StringDecryptor(1676782264432831884L));
      arrayList_f.add(new StringDecryptor(2796464368362038198L));
      arrayList_f.add(new StringDecryptor(-1265257886118762461L));
      arrayList_f.add(new StringDecryptor(3171701341821116462L));
      arrayList_f.add(new StringDecryptor(-4469867027316260220L));
      arrayList_f.add(new StringDecryptor(5910695099350797131L));
      arrayList_f.add(new StringDecryptor(8599994704036097185L));
      arrayList_f.add(new StringDecryptor(-6280549993888922699L));
      arrayList_f.add(new StringDecryptor(3758157510059262812L));
      arrayList_f.add(new StringDecryptor(-1036399694092654029L));
      arrayList_f.add(new StringDecryptor(8810493748465101819L));
      arrayList_f.add(new StringDecryptor(2361211043939575622L));
      arrayList_f.add(new StringDecryptor(1589326941210796347L));
      arrayList_f.add(new StringDecryptor(5790142442188039046L));
      arrayList_f.add(new StringDecryptor(-7964027671853601927L));
      arrayList_f.add(new StringDecryptor(2510293468839782635L));
      arrayList_f.add(new StringDecryptor(-2762957384304031913L));
      arrayList_f.add(new StringDecryptor(-7853683022352692135L));
      arrayList_f.add(new StringDecryptor(-4220129705478519881L));
      arrayList_f.add(new StringDecryptor(-8801978177020125058L));
      arrayList_f.add(new StringDecryptor(2709032664792730541L));
      arrayList_f.add(new StringDecryptor(8436703181263217888L));
      arrayList_f.add(new StringDecryptor(1107682450925759831L));
      arrayList_f.add(new StringDecryptor(-6131944118782310061L));
      arrayList_f.add(new StringDecryptor(4294342364825546163L));
      arrayList_f.add(new StringDecryptor(1713702892171594766L));
      arrayList_f.add(new StringDecryptor(2090027645314583495L));
      arrayList_f.add(new StringDecryptor(8334337027018106588L));
      arrayList_f.add(new StringDecryptor(4547664100548685075L));
      arrayList_f.add(new StringDecryptor(5248885177980273569L));
      arrayList_f.add(new StringDecryptor(8397758263173220158L));
      arrayList_f.add(new StringDecryptor(483738185089582984L));
      arrayList_f.add(new StringDecryptor(1420315983962336404L));
      arrayList_f.add(new StringDecryptor(2803605603702458509L));
      arrayList_f.add(new StringDecryptor(-7496365870280709825L));
      arrayList_f.add(new StringDecryptor(1379262628414138530L));
      arrayList_f.add(new StringDecryptor(6096145644053242305L));
      arrayList_f.add(new StringDecryptor(-6342045257400987687L));
      arrayList_f.add(new StringDecryptor(-2084899986859974635L));
      arrayList_f.add(new StringDecryptor(3682133422578011428L));
      arrayList_f.add(new StringDecryptor(8860777953786760164L));
      arrayList_f.add(new StringDecryptor(79777605229789526L));
      arrayList_f.add(new StringDecryptor(-1207048934753751692L));
      arrayList_f.add(new StringDecryptor(-1285551383503369093L));
      arrayList_f.add(new StringDecryptor(-7266353027917108814L));
      arrayList_f.add(new StringDecryptor(2528801143513099147L));
      arrayList_f.add(new StringDecryptor(-3661786786995803602L));
      arrayList_f.add(new StringDecryptor(8106788814099099310L));
      arrayList_f.add(new StringDecryptor(-339720276585559714L));
      arrayList_f.add(new StringDecryptor(-6018808840719826708L));
      arrayList_f.add(new StringDecryptor(-3973470345613399573L));
      arrayList_f.add(new StringDecryptor(-6096133607924167749L));
      arrayList_f.add(new StringDecryptor(2472306884283002053L));
      arrayList_f.add(new StringDecryptor(-2491630845196572881L));
      arrayList_f.add(new StringDecryptor(5804461505312793267L));
      arrayList_f.add(new StringDecryptor(4717944100202594884L));
      arrayList_f.add(new StringDecryptor(-5444922248314476989L));
      arrayList_f.add(new StringDecryptor(-5669978216542426282L));
      arrayList_f.add(new StringDecryptor(103346162153014929L));
      arrayList_f.add(new StringDecryptor(8286863069585485741L));
      arrayList_f.add(new StringDecryptor(-8759838950932624938L));
      arrayList_f.add(new StringDecryptor(4889940354135023834L));
      arrayList_f.add(new StringDecryptor(7568997473933329109L));
      arrayList_f.add(new StringDecryptor(-120653804057993143L));
      arrayList_f.add(new StringDecryptor(-7292358205934607629L));
      arrayList_f.add(new StringDecryptor(2624541191621110598L));
      arrayList_f.add(new StringDecryptor(-3266678169429155574L));
      arrayList_f.add(new StringDecryptor(-5701776249753780206L));
      arrayList_f.add(new StringDecryptor(8565104477273334399L));
      arrayList_f.add(new StringDecryptor(8730129080639590296L));
      arrayList_f.add(new StringDecryptor(-7062755519377618383L));
      arrayList_f.add(new StringDecryptor(-7416883838109851503L));
      arrayList_f.add(new StringDecryptor(1489567717215489478L));
      arrayList_f.add(new StringDecryptor(-7733135893997508795L));
      arrayList_f.add(new StringDecryptor(5448932742456151196L));
      arrayList_f.add(new StringDecryptor(234008193283080921L));
      arrayList_f.add(new StringDecryptor(2627997801002952941L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(-3135451604427379426L));
      arrayList_f.add(new StringDecryptor(7088731916446827313L));
      arrayList_f.add(new StringDecryptor(-7975071936999840179L));
      arrayList_f.add(new StringDecryptor(-7107561775359554087L));
      arrayList_f.add(new StringDecryptor(6139032528670394923L));
      arrayList_f.add(new StringDecryptor(3553907743855494688L));
      arrayList_f.add(new StringDecryptor(3792317472980271731L));
      arrayList_f.add(new StringDecryptor(-7249490263854635547L));
      arrayList_f.add(new StringDecryptor(424989052441239721L));
      arrayList_f.add(new StringDecryptor(-2871626149345416340L));
      arrayList_f.add(new StringDecryptor(2613765748792911626L));
      arrayList_f.add(new StringDecryptor(-2217048560076880888L));
      arrayList_f.add(new StringDecryptor(3091071390049641177L));
      arrayList_f.add(new StringDecryptor(266639558506769058L));
      arrayList_f.add(new StringDecryptor(5260771681939680772L));
      arrayList_f.add(new StringDecryptor(-8441728496476945363L));
      arrayList_f.add(new StringDecryptor(-3666416628207762601L));
      arrayList_f.add(new StringDecryptor(8405352208393127891L));
      arrayList_f.add(new StringDecryptor(6076573871291632304L));
      arrayList_f.add(new StringDecryptor(-7381189680454176906L));
      arrayList_f.add(new StringDecryptor(-1215748828087424893L));
      arrayList_f.add(new StringDecryptor(-765307869605270686L));
      arrayList_f.add(new StringDecryptor(2172423302137832783L));
      arrayList_f.add(new StringDecryptor(8617243482694533374L));
      arrayList_f.add(new StringDecryptor(7618197554477123915L));
      arrayList_f.add(new StringDecryptor(-1207580188291044933L));
      arrayList_f.add(new StringDecryptor(3260392998900289111L));
      arrayList_f.add(new StringDecryptor(-371043130229299983L));
      arrayList_f.add(new StringDecryptor(-2414269518010523121L));
      arrayList_f.add(new StringDecryptor(583789039147083816L));
      arrayList_f.add(new StringDecryptor(-3555542052483486270L));
      arrayList_f.add(new StringDecryptor(8098369362931098145L));
      arrayList_f.add(new StringDecryptor(-3789119119030329090L));
      arrayList_f.add(new StringDecryptor(-8127272874624996598L));
      arrayList_f.add(new StringDecryptor(-392822678752025526L));
      arrayList_f.add(new StringDecryptor(-1144023728129203663L));
      arrayList_f.add(new StringDecryptor(8279240572243723284L));
      arrayList_f.add(new StringDecryptor(2914461106502082785L));
      arrayList_f.add(new StringDecryptor(-3049588028645052799L));
      arrayList_f.add(new StringDecryptor(-920520134811418235L));
      arrayList_f.add(new StringDecryptor(-2943970201001498926L));
      arrayList_f.add(new StringDecryptor(-7995695282281168060L));
      arrayList_f.add(new StringDecryptor(766164741357643584L));
      arrayList_f.add(new StringDecryptor(3772453445331666336L));
      arrayList_f.add(new StringDecryptor(-4389623447418443053L));
      arrayList_f.add(new StringDecryptor(-8304908196395595645L));
      arrayList_f.add(new StringDecryptor(-6032461984613708006L));
      arrayList_f.add(new StringDecryptor(7104930041983649638L));
      arrayList_f.add(new StringDecryptor(9078276899281915003L));
      arrayList_f.add(new StringDecryptor(-4908482623230089828L));
      arrayList_f.add(new StringDecryptor(-2877803096211758287L));
      arrayList_f.add(new StringDecryptor(-4192076381599930557L));
      arrayList_f.add(new StringDecryptor(8341886949855814428L));
      arrayList_f.add(new StringDecryptor(7639744771859136689L));
      arrayList_f.add(new StringDecryptor(-6268600240494048480L));
      arrayList_f.add(new StringDecryptor(-2207381529256501131L));
      arrayList_f.add(new StringDecryptor(-804239234775096623L));
      arrayList_f.add(new StringDecryptor(1198151149650158360L));
      arrayList_f.add(new StringDecryptor(-44566919633344778L));
      arrayList_f.add(new StringDecryptor(-837285643306644374L));
      arrayList_f.add(new StringDecryptor(-4304921374309324337L));
      arrayList_f.add(new StringDecryptor(-9221643931342027614L));
      arrayList_f.add(new StringDecryptor(2801174736791203014L));
      arrayList_f.add(new StringDecryptor(2881194099008286267L));
      arrayList_f.add(new StringDecryptor(-453843917189165680L));
      arrayList_f.add(new StringDecryptor(-8833735518173174292L));
      arrayList_f.add(new StringDecryptor(2411763071157903577L));
      arrayList_f.add(new StringDecryptor(3962022299966628137L));
      arrayList_f.add(new StringDecryptor(-6917619373985772990L));
      arrayList_f.add(new StringDecryptor(5902301173015881174L));
      arrayList_f.add(new StringDecryptor(-2478076478153234528L));
      arrayList_f.add(new StringDecryptor(1708085986926406058L));
      arrayList_f.add(new StringDecryptor(4069019327531755098L));
      arrayList_f.add(new StringDecryptor(-1025385084281157108L));
      arrayList_f.add(new StringDecryptor(2979648289553214087L));
      arrayList_f.add(new StringDecryptor(1564092170944826379L));
      arrayList_f.add(new StringDecryptor(5386752967850837537L));
      arrayList_f.add(new StringDecryptor(4512200764786312114L));
      arrayList_f.add(new StringDecryptor(5712201355995947232L));
      arrayList_f.add(new StringDecryptor(-3321249675805306895L));
      arrayList_f.add(new StringDecryptor(-3332657697431860268L));
      arrayList_f.add(new StringDecryptor(4374309429783744272L));
      arrayList_f.add(new StringDecryptor(-2009956658194757252L));
      arrayList_f.add(new StringDecryptor(-9036542319342721125L));
      arrayList_f.add(new StringDecryptor(7305900696138182410L));
      arrayList_f.add(new StringDecryptor(-3497520077620403984L));
      arrayList_f.add(new StringDecryptor(-9047443528648818530L));
      arrayList_f.add(new StringDecryptor(-4553264261484958498L));
      arrayList_f.add(new StringDecryptor(9057789915778032324L));
      arrayList_f.add(new StringDecryptor(-2106956582232948718L));
      arrayList_f.add(new StringDecryptor(-6169982193377795569L));
      arrayList_f.add(new StringDecryptor(-7247514934954480949L));
      arrayList_f.add(new StringDecryptor(6914669342475616307L));
      arrayList_f.add(new StringDecryptor(-5087868391490532694L));
      arrayList_f.add(new StringDecryptor(7304221226627138578L));
      arrayList_f.add(new StringDecryptor(6858886553894759789L));
      arrayList_f.add(new StringDecryptor(8485936681033156828L));
      arrayList_f.add(new StringDecryptor(2629123700910844141L));
      arrayList_f.add(new StringDecryptor(8445274148151730601L));
      arrayList_f.add(new StringDecryptor(8698541370287810944L));
      arrayList_f.add(new StringDecryptor(-4491511113723403815L));
      arrayList_f.add(new StringDecryptor(-961700167320903016L));
      arrayList_f.add(new StringDecryptor(343979289538021010L));
      arrayList_f.add(new StringDecryptor(8211620653374660815L));
      arrayList_f.add(new StringDecryptor(-3332945022520342327L));
      arrayList_f.add(new StringDecryptor(6997769263528406733L));
      arrayList_f.add(new StringDecryptor(8231335862189411164L));
      arrayList_f.add(new StringDecryptor(2344705593506603716L));
      arrayList_f.add(new StringDecryptor(8340398653556174605L));
      arrayList_f.add(new StringDecryptor(-4598280886773281256L));
      arrayList_f.add(new StringDecryptor(-2974979936826430935L));
      arrayList_f.add(new StringDecryptor(5851753069260466000L));
      arrayList_f.add(new StringDecryptor(4793656073962489815L));
      arrayList_f.add(new StringDecryptor(-3464289511186365219L));
      arrayList_f.add(new StringDecryptor(-7914984468240506868L));
      arrayList_f.add(new StringDecryptor(-4660249555659387197L));
      arrayList_f.add(new StringDecryptor(1435000886678570473L));
      arrayList_f.add(new StringDecryptor(2237849351828252709L));
      arrayList_f.add(new StringDecryptor(-4287866348337954583L));
      arrayList_f.add(new StringDecryptor(-2026542038583000515L));
      arrayList_f.add(new StringDecryptor(2048466681841020167L));
      arrayList_f.add(new StringDecryptor(-8118006099231332250L));
      arrayList_f.add(new StringDecryptor(-4754377912492094696L));
      arrayList_f.add(new StringDecryptor(612732656809880729L));
      arrayList_f.add(new StringDecryptor(3608430912239871269L));
      arrayList_f.add(new StringDecryptor(5951799942332253669L));
      arrayList_f.add(new StringDecryptor(6449554801212730292L));
      arrayList_f.add(new StringDecryptor(-5088246560887124659L));
      arrayList_f.add(new StringDecryptor(-7468098043708413772L));
      arrayList_f.add(new StringDecryptor(4476044364910383099L));
      arrayList_f.add(new StringDecryptor(-6386788721014112015L));
      arrayList_f.add(new StringDecryptor(-1173769991315267575L));
      arrayList_f.add(new StringDecryptor(7330010239350180702L));
      arrayList_f.add(new StringDecryptor(-8648489277023559445L));
      arrayList_f.add(new StringDecryptor(-4407595531940418043L));
      arrayList_f.add(new StringDecryptor(375406812679031646L));
      arrayList_f.add(new StringDecryptor(-398037903478641903L));
      arrayList_f.add(new StringDecryptor(3579039922480342314L));
      arrayList_f.add(new StringDecryptor(-3246738856409314329L));
      arrayList_f.add(new StringDecryptor(5779463989112144659L));
      arrayList_f.add(new StringDecryptor(1558378571426721786L));
      arrayList_f.add(new StringDecryptor(7136035274718260664L));
      arrayList_f.add(new StringDecryptor(-406533473944260758L));
      arrayList_f.add(new StringDecryptor(-5573736231995136722L));
      arrayList_f.add(new StringDecryptor(2995066771643744844L));
      arrayList_f.add(new StringDecryptor(-7190323925339599977L));
      arrayList_f.add(new StringDecryptor(5824509003408083388L));
      arrayList_f.add(new StringDecryptor(6174080776035273844L));
      arrayList_f.add(new StringDecryptor(2784338883485403186L));
      arrayList_f.add(new StringDecryptor(4404715294114121721L));
      arrayList_f.add(new StringDecryptor(-6657203873949406438L));
      arrayList_f.add(new StringDecryptor(-8455908997569903427L));
      arrayList_f.add(new StringDecryptor(-3004103744739703096L));
      arrayList_f.add(new StringDecryptor(-5713365515447852244L));
      arrayList_f.add(new StringDecryptor(-5301354023366055733L));
      arrayList_f.add(new StringDecryptor(-4925645101301175077L));
      arrayList_f.add(new StringDecryptor(-580713423557844689L));
      arrayList_f.add(new StringDecryptor(6043766955160117341L));
      arrayList_f.add(new StringDecryptor(-1542032049365438905L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(2476485548472576453L));
      arrayList_f.add(new StringDecryptor(-8179465128003966865L));
      arrayList_f.add(new StringDecryptor(-1649833819047375810L));
      arrayList_f.add(new StringDecryptor(-3604345161676331036L));
      arrayList_f.add(new StringDecryptor(-6262478966612483540L));
      arrayList_f.add(new StringDecryptor(1360469343136261299L));
      arrayList_f.add(new StringDecryptor(5018594843613679461L));
      arrayList_f.add(new StringDecryptor(5865598084871515528L));
      arrayList_f.add(new StringDecryptor(-6591917609443996234L));
      arrayList_f.add(new StringDecryptor(32954819125423089L));
      arrayList_f.add(new StringDecryptor(-8749085857585264673L));
      arrayList_f.add(new StringDecryptor(7137608988645335337L));
      arrayList_f.add(new StringDecryptor(1532273392548914183L));
      arrayList_f.add(new StringDecryptor(4779922960961750271L));
      arrayList_f.add(new StringDecryptor(3451432982884557020L));
      arrayList_f.add(new StringDecryptor(-6858129306912871525L));
      arrayList_f.add(new StringDecryptor(-7905274679002053772L));
      arrayList_f.add(new StringDecryptor(-771004086977206309L));
      arrayList_f.add(new StringDecryptor(-130837188320491035L));
      arrayList_f.add(new StringDecryptor(-360163193682016800L));
      arrayList_f.add(new StringDecryptor(7293870246227002985L));
      arrayList_f.add(new StringDecryptor(2632642926411744575L));
      arrayList_f.add(new StringDecryptor(-4128419669459138174L));
      arrayList_f.add(new StringDecryptor(-9071186143393906621L));
      arrayList_f.add(new StringDecryptor(-3669539417024208240L));
      arrayList_f.add(new StringDecryptor(-355755280782097847L));
      arrayList_f.add(new StringDecryptor(2563471428662898516L));
      arrayList_f.add(new StringDecryptor(8914207256925212314L));
      arrayList_f.add(new StringDecryptor(3946945708469962937L));
      arrayList_f.add(new StringDecryptor(-5892279208983408754L));
      arrayList_f.add(new StringDecryptor(-2907073578742723660L));
      arrayList_f.add(new StringDecryptor(3179314830529586986L));
      arrayList_f.add(new StringDecryptor(-5812843425095162557L));
      arrayList_f.add(new StringDecryptor(-8664667414067589718L));
      arrayList_f.add(new StringDecryptor(1828875860260334105L));
      arrayList_f.add(new StringDecryptor(-5384785306058792345L));
      arrayList_f.add(new StringDecryptor(-2645612610241093163L));
      arrayList_f.add(new StringDecryptor(8013968530427643869L));
      arrayList_f.add(new StringDecryptor(-5553992923783704651L));
      arrayList_f.add(new StringDecryptor(-3098364648288861234L));
      arrayList_f.add(new StringDecryptor(-8079102087456856521L));
      arrayList_f.add(new StringDecryptor(1536493952804760592L));
      arrayList_f.add(new StringDecryptor(7397130140091236446L));
      arrayList_f.add(new StringDecryptor(6357604941024256897L));
      arrayList_f.add(new StringDecryptor(6400020186690111162L));
      arrayList_f.add(new StringDecryptor(4474304559432941751L));
      arrayList_f.add(new StringDecryptor(-127715975321272268L));
      arrayList_f.add(new StringDecryptor(2626571359568546414L));
      arrayList_f.add(new StringDecryptor(-7714363930403723088L));
      arrayList_f.add(new StringDecryptor(-1997205417595450080L));
      arrayList_f.add(new StringDecryptor(6102636039974194240L));
      arrayList_f.add(new StringDecryptor(1767568604281826282L));
      arrayList_f.add(new StringDecryptor(6174360008268524140L));
      arrayList_f.add(new StringDecryptor(-4937324143708255050L));
      arrayList_f.add(new StringDecryptor(3831032056100136560L));
      arrayList_f.add(new StringDecryptor(5391424027491198957L));
      arrayList_f.add(new StringDecryptor(-4978084025532733333L));
      arrayList_f.add(new StringDecryptor(5068277771765247797L));
      arrayList_f.add(new StringDecryptor(5938809873398196937L));
      arrayList_f.add(new StringDecryptor(5526049153650108918L));
      arrayList_f.add(new StringDecryptor(-901992418985399733L));
      arrayList_f.add(new StringDecryptor(2373683439686583043L));
      arrayList_f.add(new StringDecryptor(7112968722733072830L));
      arrayList_f.add(new StringDecryptor(-2726042137994474269L));
      arrayList_f.add(new StringDecryptor(-5727104986713487948L));
      arrayList_f.add(new StringDecryptor(-3981774050044279110L));
      arrayList_f.add(new StringDecryptor(-312336909955938418L));
      arrayList_f.add(new StringDecryptor(5943214600842085745L));
      arrayList_f.add(new StringDecryptor(-8510545634908631939L));
      arrayList_f.add(new StringDecryptor(-5697300156328287749L));
      arrayList_f.add(new StringDecryptor(7024410561679535067L));
      arrayList_f.add(new StringDecryptor(-3570358642058362688L));
      arrayList_f.add(new StringDecryptor(3058967489923264270L));
      arrayList_f.add(new StringDecryptor(4376250138437435643L));
      arrayList_f.add(new StringDecryptor(-7835607197831231448L));
      arrayList_f.add(new StringDecryptor(1569420331708859714L));
      arrayList_f.add(new StringDecryptor(1103613760622337L));
      arrayList_f.add(new StringDecryptor(-6548321919564340059L));
      arrayList_f.add(new StringDecryptor(6431463767118464154L));
      arrayList_f.add(new StringDecryptor(8174699640709565822L));
      arrayList_f.add(new StringDecryptor(3285305622725804655L));
      arrayList_f.add(new StringDecryptor(8189195112043234023L));
      arrayList_f.add(new StringDecryptor(6073809609089615383L));
      arrayList_f.add(new StringDecryptor(-5871128641228233755L));
      arrayList_f.add(new StringDecryptor(-6268345101398324538L));
      arrayList_f.add(new StringDecryptor(-7347838121087459122L));
      arrayList_f.add(new StringDecryptor(-7366984348035563292L));
      arrayList_f.add(new StringDecryptor(-8964119779432306705L));
      arrayList_f.add(new StringDecryptor(-2648998824380218453L));
      arrayList_f.add(new StringDecryptor(-4297210614181491672L));
      arrayList_f.add(new StringDecryptor(8053485082556018438L));
      arrayList_f.add(new StringDecryptor(-4813129425772393166L));
      arrayList_f.add(new StringDecryptor(-3492612623223193377L));
      arrayList_f.add(new StringDecryptor(8949469233878130764L));
      arrayList_f.add(new StringDecryptor(-3937600817274067303L));
      arrayList_f.add(new StringDecryptor(7493706239828067082L));
      arrayList_f.add(new StringDecryptor(-6684128541195483824L));
      arrayList_f.add(new StringDecryptor(-558684491992633858L));
      arrayList_f.add(new StringDecryptor(3935067688700923222L));
      arrayList_f.add(new StringDecryptor(6911952373058283203L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(-2354507311038591808L));
      arrayList_f.add(new StringDecryptor(-3365535022963815368L));
      arrayList_f.add(new StringDecryptor(8656053339875215008L));
      arrayList_f.add(new StringDecryptor(8873912562685406316L));
      arrayList_f.add(new StringDecryptor(2793966313702961145L));
      arrayList_f.add(new StringDecryptor(748530423708363208L));
      arrayList_f.add(new StringDecryptor(5493448678775205337L));
      arrayList_f.add(new StringDecryptor(-4358912805192342527L));
      arrayList_f.add(new StringDecryptor(-7263342960021771969L));
      arrayList_f.add(new StringDecryptor(-9093229681255871407L));
      arrayList_f.add(new StringDecryptor(-5199736335256444326L));
      arrayList_f.add(new StringDecryptor(182125840343573748L));
      arrayList_f.add(new StringDecryptor(8849115909005675396L));
      arrayList_f.add(new StringDecryptor(101848655908933374L));
      arrayList_f.add(new StringDecryptor(5233202733866723011L));
      arrayList_f.add(new StringDecryptor(3299739928141481113L));
      arrayList_f.add(new StringDecryptor(2163161743316945510L));
      arrayList_f.add(new StringDecryptor(8109120976255206778L));
      arrayList_f.add(new StringDecryptor(-9151540802428066569L));
      arrayList_f.add(new StringDecryptor(-271358767214744774L));
      arrayList_f.add(new StringDecryptor(4571821026790862726L));
      arrayList_f.add(new StringDecryptor(6734415960846550045L));
      arrayList_f.add(new StringDecryptor(3741997727812471192L));
      arrayList_f.add(new StringDecryptor(-6408230926650874442L));
      arrayList_f.add(new StringDecryptor(111123496868637151L));
      arrayList_f.add(new StringDecryptor(-7230866063071723285L));
      arrayList_f.add(new StringDecryptor(-4371093184065461723L));
      arrayList_f.add(new StringDecryptor(873897027874670453L));
      arrayList_f.add(new StringDecryptor(684821636172736877L));
      arrayList_f.add(new StringDecryptor(-6173725648326926171L));
      arrayList_f.add(new StringDecryptor(-5645548495079036292L));
      arrayList_f.add(new StringDecryptor(-2668257717475753392L));
      arrayList_f.add(new StringDecryptor(7121355462035900681L));
      arrayList_f.add(new StringDecryptor(-193640907277562200L));
      arrayList_f.add(new StringDecryptor(9801815956161884L));
      arrayList_f.add(new StringDecryptor(1202487719246612406L));
      arrayList_f.add(new StringDecryptor(8503509635813714046L));
      arrayList_f.add(new StringDecryptor(-8259540597618867644L));
      arrayList_f.add(new StringDecryptor(8849853503907963737L));
      arrayList_f.add(new StringDecryptor(-3091335425184299823L));
      arrayList_f.add(new StringDecryptor(-2264047960185437216L));
      arrayList_f.add(new StringDecryptor(-8387467444743469583L));
      arrayList_f.add(new StringDecryptor(9009879662236584489L));
      arrayList_f.add(new StringDecryptor(-6492749859498851967L));
      arrayList_f.add(new StringDecryptor(3054040424709013800L));
      arrayList_f.add(new StringDecryptor(8888676048195502369L));
      arrayList_f.add(new StringDecryptor(-8111473290515668984L));
      arrayList_f.add(new StringDecryptor(3696104859749312481L));
      arrayList_f.add(new StringDecryptor(7043635491758195499L));
      arrayList_f.add(new StringDecryptor(-2712901689207068453L));
      arrayList_f.add(new StringDecryptor(-4159301943500009697L));
      arrayList_f.add(new StringDecryptor(-8430820334771460821L));
      arrayList_f.add(new StringDecryptor(1049961703439961192L));
      arrayList_f.add(new StringDecryptor(2867458957628465950L));
      arrayList_f.add(new StringDecryptor(6469174327493775287L));
      arrayList_f.add(new StringDecryptor(-9008454959977330966L));
      arrayList_f.add(new StringDecryptor(-1682540052536163712L));
      arrayList_f.add(new StringDecryptor(-344679812830474456L));
      arrayList_f.add(new StringDecryptor(-4580451609946684109L));
      arrayList_f.add(new StringDecryptor(1444412171704921305L));
      arrayList_f.add(new StringDecryptor(2477143240268442989L));
      arrayList_f.add(new StringDecryptor(-9134353033222059681L));
      arrayList_f.add(new StringDecryptor(2016359336528224570L));
      arrayList_f.add(new StringDecryptor(-8023417166395504424L));
      arrayList_f.add(new StringDecryptor(-6038106868082643913L));
      arrayList_f.add(new StringDecryptor(7503942082964425521L));
      arrayList_f.add(new StringDecryptor(2046089695520202827L));
      arrayList_f.add(new StringDecryptor(-789730934537027371L));
      arrayList_f.add(new StringDecryptor(738715686100897108L));
      arrayList_f.add(new StringDecryptor(-8382543407817792298L));
      arrayList_f.add(new StringDecryptor(-4484868337059993073L));
      arrayList_f.add(new StringDecryptor(-1222463559571060364L));
      arrayList_f.add(new StringDecryptor(-8646406440034767317L));
      arrayList_f.add(new StringDecryptor(-4503799712724417102L));
      arrayList_f.add(new StringDecryptor(1961411741733211096L));
      arrayList_f.add(new StringDecryptor(-9052647084959980306L));
      arrayList_f.add(new StringDecryptor(-5146032872540369272L));
      arrayList_f.add(new StringDecryptor(-3452841476176467779L));
      arrayList_f.add(new StringDecryptor(7104451023308451365L));
      arrayList_f.add(new StringDecryptor(734891827638299749L));
      arrayList_f.add(new StringDecryptor(2690079979193830370L));
      arrayList_f.add(new StringDecryptor(683800789461027158L));
      arrayList_f.add(new StringDecryptor(-9091737474799613373L));
      arrayList_f.add(new StringDecryptor(-1659788750253374396L));
      arrayList_f.add(new StringDecryptor(-341339101078795313L));
      arrayList_f.add(new StringDecryptor(-6026597787318689559L));
      arrayList_f.add(new StringDecryptor(-2233496351223067319L));
      arrayList_f.add(new StringDecryptor(-8702263897147323288L));
      arrayList_f.add(new StringDecryptor(2418401239944285874L));
      arrayList_f.add(new StringDecryptor(8814925568517226601L));
      arrayList_f.add(new StringDecryptor(-1875644946755565243L));
      arrayList_f.add(new StringDecryptor(401106658968316842L));
      arrayList_f.add(new StringDecryptor(-4103202913782002801L));
      arrayList_f.add(new StringDecryptor(4403341239744505200L));
      arrayList_f.add(new StringDecryptor(2225653351376462222L));
      arrayList_f.add(new StringDecryptor(8158492634268213456L));
      arrayList_f.add(new StringDecryptor(4222534134910731408L));
      arrayList_f.add(new StringDecryptor(6198805585991191871L));
      arrayList_f.add(new StringDecryptor(-4926866277222323600L));
      arrayList_f.add(new StringDecryptor(3176060319145173780L));
      arrayList_f.add(new StringDecryptor(5848589775178351364L));
      arrayList_f.add(new StringDecryptor(3875008017375519518L));
      arrayList_f.add(new StringDecryptor(-8964080969327849605L));
      arrayList_f.add(new StringDecryptor(-3456750609711701370L));
      arrayList_f.add(new StringDecryptor(-6971084781765776826L));
      arrayList_f.add(new StringDecryptor(3983230182495421212L));
      arrayList_f.add(new StringDecryptor(-3730643024111669807L));
      arrayList_f.add(new StringDecryptor(5986908644636953654L));
      arrayList_f.add(new StringDecryptor(7869546891902463118L));
      arrayList_f.add(new StringDecryptor(5906053383072893425L));
      arrayList_f.add(new StringDecryptor(7856837130277980784L));
      arrayList_f.add(new StringDecryptor(-1622374711883012795L));
      arrayList_f.add(new StringDecryptor(-2750922663861450112L));
      arrayList_f.add(new StringDecryptor(-1223090899218584189L));
      arrayList_f.add(new StringDecryptor(-20795869037762922L));
      arrayList_f.add(new StringDecryptor(6572403884750809523L));
      arrayList_f.add(new StringDecryptor(2609900826127149580L));
      arrayList_f.add(new StringDecryptor(-1715379242252006756L));
      arrayList_f.add(new StringDecryptor(-3361464742372644051L));
      arrayList_f.add(new StringDecryptor(298269465696725645L));
      arrayList_f.add(new StringDecryptor(-4882978797748156122L));
      arrayList_f.add(new StringDecryptor(-4064593282225413496L));
      arrayList_f.add(new StringDecryptor(2834398376984047539L));
      arrayList_f.add(new StringDecryptor(-4600450371184122782L));
      arrayList_f.add(new StringDecryptor(4937848049566435852L));
      arrayList_f.add(new StringDecryptor(2934347670211274657L));
      arrayList_f.add(new StringDecryptor(-385879040603690984L));
      arrayList_f.add(new StringDecryptor(-3045007449827670903L));
      arrayList_f.add(new StringDecryptor(-5314199238264199126L));
      arrayList_f.add(new StringDecryptor(-1311008385107308587L));
      arrayList_f.add(new StringDecryptor(-5504353238036544103L));
      arrayList_f.add(new StringDecryptor(7680611538885135901L));
      arrayList_f.add(new StringDecryptor(2509158772840441963L));
      arrayList_f.add(new StringDecryptor(-4626282342855982244L));
      arrayList_f.add(new StringDecryptor(6185644445028615864L));
      arrayList_f.add(new StringDecryptor(-3229134435355776866L));
      arrayList_f.add(new StringDecryptor(790664288525420139L));
      arrayList_f.add(new StringDecryptor(-5688009958368483073L));
      arrayList_f.add(new StringDecryptor(5109204891242373971L));
      arrayList_f.add(new StringDecryptor(8430154108058684336L));
      arrayList_f.add(new StringDecryptor(-4168616908182155872L));
      arrayList_f.add(new StringDecryptor(6924619826020593020L));
      arrayList_f.add(new StringDecryptor(6050722780720858270L));
      arrayList_f.add(new StringDecryptor(-1416192762225983419L));
      arrayList_f.add(new StringDecryptor(-5578696417245697331L));
      arrayList_f.add(new StringDecryptor(2017880587684414471L));
      arrayList_f.add(new StringDecryptor(7623658579420620901L));
      arrayList_f.add(new StringDecryptor(-2617201093803491318L));
      arrayList_f.add(new StringDecryptor(-6989343791112459056L));
      arrayList_f.add(new StringDecryptor(5436564111000464437L));
      arrayList_f.add(new StringDecryptor(2886088060771624683L));
      arrayList_f.add(new StringDecryptor(-4368723008668963971L));
      arrayList_f.add(new StringDecryptor(2940678770192925091L));
      arrayList_f.add(new StringDecryptor(4870626988889083760L));
      arrayList_f.add(new StringDecryptor(1822397562693461206L));
      arrayList_f.add(new StringDecryptor(-2413511179454316173L));
      arrayList_f.add(new StringDecryptor(8258325051920631039L));
      arrayList_f.add(new StringDecryptor(373784163028247741L));
      arrayList_f.add(new StringDecryptor(9110977856418261784L));
      arrayList_f.add(new StringDecryptor(-6354196709076587511L));
      arrayList_f.add(new StringDecryptor(898240269389737888L));
      arrayList_f.add(new StringDecryptor(3317479231522882028L));
      arrayList_f.add(new StringDecryptor(-6866907210735180630L));
      arrayList_f.add(new StringDecryptor(-7424055250295257989L));
      arrayList_f.add(new StringDecryptor(6833658912860841039L));
      arrayList_f.add(new StringDecryptor(-8056564577269874417L));
      arrayList_f.add(new StringDecryptor(-7347614324253343167L));
      arrayList_f.add(new StringDecryptor(-3998348762844780290L));
      arrayList_f.add(new StringDecryptor(11174782764156337L));
      arrayList_f.add(new StringDecryptor(-1116029194712390276L));
      arrayList_f.add(new StringDecryptor(-4725494788891647518L));
      arrayList_f.add(new StringDecryptor(4001200432208915519L));
      arrayList_f.add(new StringDecryptor(1727109895358736735L));
      arrayList_f.add(new StringDecryptor(-1964926292744934657L));
      arrayList_f.add(new StringDecryptor(854055412996845553L));
      arrayList_f.add(new StringDecryptor(438361039323237916L));
      arrayList_f.add(new StringDecryptor(7085742050803212793L));
      arrayList_f.add(new StringDecryptor(-1752381334548191232L));
      arrayList_f.add(new StringDecryptor(2027064591560944695L));
      arrayList_f.add(new StringDecryptor(-1900832886696164760L));
      arrayList_f.add(new StringDecryptor(1678358105866822910L));
      arrayList_f.add(new StringDecryptor(-7837819616191502925L));
      arrayList_f.add(new StringDecryptor(8225518515398437867L));
      arrayList_f.add(new StringDecryptor(2858611537659653088L));
      arrayList_f.add(new StringDecryptor(8305194533991064500L));
      arrayList_f.add(new StringDecryptor(3929069509079452765L));
      arrayList_f.add(new StringDecryptor(-4077702646813464159L));
      arrayList_f.add(new StringDecryptor(-8866778655041223958L));
      arrayList_f.add(new StringDecryptor(3026212821288240553L));
      arrayList_f.add(new StringDecryptor(8365633322384469575L));
      arrayList_f.add(new StringDecryptor(4900253789852043199L));
      arrayList_f.add(new StringDecryptor(1763090152574453202L));
      arrayList_f.add(new StringDecryptor(-8810333260502397762L));
      arrayList_f.add(new StringDecryptor(238705554371964447L));
      arrayList_f.add(new StringDecryptor(8975625074279313229L));
      arrayList_f.add(new StringDecryptor(-1523885785721033232L));
      arrayList_f.add(new StringDecryptor(3671569364283337927L));
      arrayList_f.add(new StringDecryptor(8856133742670219459L));
      arrayList_f.add(new StringDecryptor(5409029490676960571L));
      arrayList_f.add(new StringDecryptor(6012451787454295663L));
      arrayList_f.add(new StringDecryptor(296607929037073110L));
      arrayList_f.add(new StringDecryptor(-3095703693030620823L));
      arrayList_f.add(new StringDecryptor(-3226791660565968990L));
      arrayList_f.add(new StringDecryptor(-8396017934195979988L));
      arrayList_f.add(new StringDecryptor(-1038176727781776887L));
      arrayList_f.add(new StringDecryptor(4595235695362756129L));
      arrayList_f.add(new StringDecryptor(-7185335407232121452L));
      arrayList_f.add(new StringDecryptor(-8048606197338648959L));
      arrayList_f.add(new StringDecryptor(4946419791818730523L));
      arrayList_f.add(new StringDecryptor(-6770584318457551718L));
      arrayList_f.add(new StringDecryptor(-3631405256360206029L));
      arrayList_f.add(new StringDecryptor(994247469376604462L));
      arrayList_f.add(new StringDecryptor(-7359750027321079273L));
      arrayList_f.add(new StringDecryptor(-557913485292107611L));
      arrayList_f.add(new StringDecryptor(2062286345432346151L));
      arrayList_f.add(new StringDecryptor(781595828663755749L));
      arrayList_f.add(new StringDecryptor(-1613731651146208724L));
      arrayList_f.add(new StringDecryptor(-9001663262467144618L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(5981109512473593675L));
      arrayList_f.add(new StringDecryptor(7941457571793029524L));
      arrayList_f.add(new StringDecryptor(5358576856348361607L));
      arrayList_f.add(new StringDecryptor(5284717350778905526L));
      arrayList_f.add(new StringDecryptor(-4518449784331361914L));
      arrayList_f.add(new StringDecryptor(6850475827489844629L));
      arrayList_f.add(new StringDecryptor(4618324076500872984L));
      arrayList_f.add(new StringDecryptor(428217965083209685L));
      arrayList_f.add(new StringDecryptor(5963486965624471617L));
      arrayList_f.add(new StringDecryptor(1914769041029598718L));
      arrayList_f.add(new StringDecryptor(2911980920843904086L));
      arrayList_f.add(new StringDecryptor(-8145752440432672333L));
      arrayList_f.add(new StringDecryptor(8894446334305068453L));
      arrayList_f.add(new StringDecryptor(1770075230464090145L));
      arrayList_f.add(new StringDecryptor(-5424254257733009098L));
      arrayList_f.add(new StringDecryptor(6471320615759579739L));
      arrayList_f.add(new StringDecryptor(-7260599417951482127L));
      arrayList_f.add(new StringDecryptor(-4116011275210216786L));
      arrayList_f.add(new StringDecryptor(781749522477688691L));
      arrayList_f.add(new StringDecryptor(5697151502961123848L));
      arrayList_f.add(new StringDecryptor(5982379375048141292L));
      arrayList_f.add(new StringDecryptor(-602024967912552372L));
      arrayList_f.add(new StringDecryptor(-5932279514390912627L));
      arrayList_f.add(new StringDecryptor(5910321287001631440L));
      arrayList_f.add(new StringDecryptor(-8997101278128746973L));
      arrayList_f.add(new StringDecryptor(-2084371439292858191L));
      arrayList_f.add(new StringDecryptor(551389011025389873L));
      arrayList_f.add(new StringDecryptor(1807716627167922705L));
      arrayList_f.add(new StringDecryptor(4569860039324557465L));
      arrayList_f.add(new StringDecryptor(-4409245337461399444L));
      arrayList_f.add(new StringDecryptor(-1563702998735772217L));
      arrayList_f.add(new StringDecryptor(-9018689568032955913L));
      arrayList_f.add(new StringDecryptor(-6666210524955835261L));
      arrayList_f.add(new StringDecryptor(-6139571157973184515L));
      arrayList_f.add(new StringDecryptor(-977055093829325968L));
      arrayList_f.add(new StringDecryptor(-8053528323355540177L));
      arrayList_f.add(new StringDecryptor(-1934506623560564613L));
      arrayList_f.add(new StringDecryptor(3085804427368918239L));
      arrayList_f.add(new StringDecryptor(5776272856291935489L));
      arrayList_f.add(new StringDecryptor(3715698144644263565L));
      arrayList_f.add(new StringDecryptor(3032571786356747812L));
      arrayList_f.add(new StringDecryptor(8118774859701608617L));
      arrayList_f.add(new StringDecryptor(5673878486637060349L));
      arrayList_f.add(new StringDecryptor(5727569512812039202L));
      arrayList_f.add(new StringDecryptor(-1947276109994809949L));
      arrayList_f.add(new StringDecryptor(5898929139907848119L));
      arrayList_f.add(new StringDecryptor(-82888120459017080L));
      arrayList_f.add(new StringDecryptor(74181132845212865L));
      arrayList_f.add(new StringDecryptor(4936282413289227080L));
      arrayList_f.add(new StringDecryptor(6732030064093780L));
      arrayList_f.add(new StringDecryptor(-2114314548830130262L));
      arrayList_f.add(new StringDecryptor(-1077023274054145493L));
      arrayList_f.add(new StringDecryptor(-3203102875095400242L));
      arrayList_f.add(new StringDecryptor(962864276278274415L));
      arrayList_f.add(new StringDecryptor(-2309965249415147546L));
      arrayList_f.add(new StringDecryptor(1374704365830676499L));
      arrayList_f.add(new StringDecryptor(-1869848154124850364L));
      arrayList_f.add(new StringDecryptor(2349344315919476492L));
      arrayList_f.add(new StringDecryptor(-1779817280884060619L));
      arrayList_f.add(new StringDecryptor(2829927833214238755L));
      arrayList_f.add(new StringDecryptor(-8319016920341117400L));
      arrayList_f.add(new StringDecryptor(-7257110777372152882L));
      arrayList_f.add(new StringDecryptor(-9139588627738320746L));
      arrayList_f.add(new StringDecryptor(9041510886511951948L));
      arrayList_f.add(new StringDecryptor(3190035715316559653L));
      arrayList_f.add(new StringDecryptor(-406682034768679212L));
      arrayList_f.add(new StringDecryptor(216413486079191376L));
      arrayList_f.add(new StringDecryptor(-7821331084844994994L));
      arrayList_f.add(new StringDecryptor(-2320531587614422276L));
      arrayList_f.add(new StringDecryptor(-2472134717425981948L));
      arrayList_f.add(new StringDecryptor(8353252510895345340L));
      arrayList_f.add(new StringDecryptor(-7308794108228982885L));
      arrayList_f.add(new StringDecryptor(-7037240804808905726L));
      arrayList_f.add(new StringDecryptor(-7929257188732367973L));
      arrayList_f.add(new StringDecryptor(3732250448650708493L));
      arrayList_f.add(new StringDecryptor(3135736652689083148L));
      arrayList_f.add(new StringDecryptor(-8905204793040130157L));
      arrayList_f.add(new StringDecryptor(-6203911382520018858L));
      arrayList_f.add(new StringDecryptor(1956051243461978518L));
      arrayList_f.add(new StringDecryptor(3164338185354283854L));
      arrayList_f.add(new StringDecryptor(-6942940185716317066L));
      arrayList_f.add(new StringDecryptor(2305097532803105105L));
      arrayList_f.add(new StringDecryptor(4770537365430887514L));
      arrayList_f.add(new StringDecryptor(-2402042450327615862L));
      arrayList_f.add(new StringDecryptor(-8941366893150509536L));
      arrayList_f.add(new StringDecryptor(-573924246863732603L));
      arrayList_f.add(new StringDecryptor(2651541249379059631L));
      arrayList_f.add(new StringDecryptor(881821134153468446L));
      arrayList_f.add(new StringDecryptor(-2214971652464324761L));
      arrayList_f.add(new StringDecryptor(5247181057938549313L));
      arrayList_f.add(new StringDecryptor(1072123609522717865L));
      arrayList_f.add(new StringDecryptor(5137224327190260099L));
      arrayList_f.add(new StringDecryptor(-7720687692058554413L));
      arrayList_f.add(new StringDecryptor(9131742200913855613L));
      arrayList_f.add(new StringDecryptor(4231669909005451766L));
      arrayList_f.add(new StringDecryptor(1405457006371925200L));
      arrayList_f.add(new StringDecryptor(6018646294637397655L));
      arrayList_f.add(new StringDecryptor(4769683983535301852L));
      arrayList_f.add(new StringDecryptor(8567432696016816845L));
      arrayList_f.add(new StringDecryptor(-9167981874081247656L));
      arrayList_f.add(new StringDecryptor(5925654242472126340L));
      arrayList_f.add(new StringDecryptor(8734316276195475648L));
      arrayList_f.add(new StringDecryptor(8693127567500764570L));
      arrayList_f.add(new StringDecryptor(-3068192010305999069L));
      arrayList_f.add(new StringDecryptor(-3512792098137362708L));
      arrayList_f.add(new StringDecryptor(8958415828191243570L));
      arrayList_f.add(new StringDecryptor(3668201385541649716L));
      arrayList_f.add(new StringDecryptor(4819221206469009937L));
      arrayList_f.add(new StringDecryptor(-8291534935681634751L));
      arrayList_f.add(new StringDecryptor(-2272703786558863542L));
      arrayList_f.add(new StringDecryptor(-8506364439816141925L));
      arrayList_f.add(new StringDecryptor(-5221876652564610493L));
      arrayList_f.add(new StringDecryptor(7123953313714728747L));
      arrayList_f.add(new StringDecryptor(-2343583617764744009L));
      arrayList_f.add(new StringDecryptor(-8341006376341665113L));
      arrayList_f.add(new StringDecryptor(-7734682491257992537L));
      arrayList_f.add(new StringDecryptor(-7323417213721899148L));
      arrayList_f.add(new StringDecryptor(-7974272697114041812L));
      arrayList_f.add(new StringDecryptor(-3892827483424338636L));
      arrayList_f.add(new StringDecryptor(1328842492938512647L));
      arrayList_f.add(new StringDecryptor(-1305763207503525389L));
      arrayList_f.add(new StringDecryptor(23745361709877075L));
      arrayList_f.add(new StringDecryptor(-4547365519956071756L));
      arrayList_f.add(new StringDecryptor(-7002082927237537326L));
      arrayList_f.add(new StringDecryptor(4983581007604778715L));
      arrayList_f.add(new StringDecryptor(2885739017096916057L));
      arrayList_f.add(new StringDecryptor(8072606672558695068L));
      arrayList_f.add(new StringDecryptor(-4291174996630878367L));
      arrayList_f.add(new StringDecryptor(-171186383586670027L));
      arrayList_f.add(new StringDecryptor(7235554238451509353L));
      arrayList_f.add(new StringDecryptor(-3041458594435046759L));
      arrayList_f.add(new StringDecryptor(3181443272365788532L));
      arrayList_f.add(new StringDecryptor(5841660452485220277L));
      arrayList_f.add(new StringDecryptor(3897733346968506356L));
      arrayList_f.add(new StringDecryptor(8183073019825383844L));
      arrayList_f.add(new StringDecryptor(2576348647065463683L));
      arrayList_f.add(new StringDecryptor(6926023462422004655L));
      arrayList_f.add(new StringDecryptor(-6722217534261974204L));
      arrayList_f.add(new StringDecryptor(-1235685955642916071L));
      arrayList_f.add(new StringDecryptor(989715139486115026L));
      arrayList_f.add(new StringDecryptor(3495533866879591993L));
      arrayList_f.add(new StringDecryptor(-3288874869255066582L));
      arrayList_f.add(new StringDecryptor(3288599407697330340L));
      arrayList_f.add(new StringDecryptor(6213020121264448132L));
      arrayList_f.add(new StringDecryptor(-68803108711077866L));
      arrayList_f.add(new StringDecryptor(-1916631249606147474L));
      arrayList_f.add(new StringDecryptor(8530416956973828808L));
      arrayList_f.add(new StringDecryptor(-794409825924543066L));
      arrayList_f.add(new StringDecryptor(3481342366782685626L));
      arrayList_f.add(new StringDecryptor(5858777536425053929L));
      arrayList_f.add(new StringDecryptor(-5700997452392805716L));
      arrayList_f.add(new StringDecryptor(3860574950671681064L));
      arrayList_f.add(new StringDecryptor(-6625329107965538677L));
      arrayList_f.add(new StringDecryptor(499987497081226202L));
      arrayList_f.add(new StringDecryptor(8123272080537692954L));
      arrayList_f.add(new StringDecryptor(-6235245120439767897L));
      arrayList_f.add(new StringDecryptor(-8545275926921526208L));
      arrayList_f.add(new StringDecryptor(1032776501174274951L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(-3771030503591703733L));
      arrayList_f.add(new StringDecryptor(303468997680833004L));
      arrayList_f.add(new StringDecryptor(808039952809575806L));
      arrayList_f.add(new StringDecryptor(-4085480735718504206L));
      arrayList_f.add(new StringDecryptor(947300479024742450L));
      arrayList_f.add(new StringDecryptor(-1094403733626836048L));
      arrayList_f.add(new StringDecryptor(-537550779899412134L));
      arrayList_f.add(new StringDecryptor(-5981300730509875901L));
      arrayList_f.add(new StringDecryptor(7809716651693311988L));
      arrayList_f.add(new StringDecryptor(-6523024733774928582L));
      arrayList_f.add(new StringDecryptor(-7631225947912409334L));
      arrayList_f.add(new StringDecryptor(3417016349399704111L));
      arrayList_f.add(new StringDecryptor(-5471970778162213205L));
      arrayList_f.add(new StringDecryptor(-312425233543148007L));
      arrayList_f.add(new StringDecryptor(-6001120642522462267L));
      arrayList_f.add(new StringDecryptor(-6292514323934212875L));
      arrayList_f.add(new StringDecryptor(-4330297601587477266L));
      arrayList_f.add(new StringDecryptor(5716359032921935869L));
      arrayList_f.add(new StringDecryptor(-1167552127365626918L));
      arrayList_f.add(new StringDecryptor(-1922904669094156469L));
      arrayList_f.add(new StringDecryptor(2324706027071611800L));
      arrayList_f.add(new StringDecryptor(-6084523024587176853L));
      arrayList_f.add(new StringDecryptor(-7521941634946175559L));
      arrayList_f.add(new StringDecryptor(-1371115776440089039L));
      arrayList_f.add(new StringDecryptor(-5117062352133190124L));
      arrayList_f.add(new StringDecryptor(-7242772326718738490L));
      arrayList_f.add(new StringDecryptor(-6867477427464524491L));
      arrayList_f.add(new StringDecryptor(7276704958486646378L));
      arrayList_f.add(new StringDecryptor(-2356756485566085400L));
      arrayList_f.add(new StringDecryptor(-4716339688621781507L));
      arrayList_f.add(new StringDecryptor(-4677087583592479999L));
      arrayList_f.add(new StringDecryptor(-2772653959648080141L));
      arrayList_f.add(new StringDecryptor(2563110800835010804L));
      arrayList_f.add(new StringDecryptor(8565703348129243609L));
      arrayList_f.add(new StringDecryptor(-8731383095110417105L));
      arrayList_f.add(new StringDecryptor(607714512623389098L));
      arrayList_f.add(new StringDecryptor(7055486079154095460L));
      arrayList_f.add(new StringDecryptor(4361499109331314392L));
      arrayList_f.add(new StringDecryptor(4085147045543136397L));
      arrayList_f.add(new StringDecryptor(6515178429296485217L));
      arrayList_f.add(new StringDecryptor(2918812734472570570L));
      arrayList_f.add(new StringDecryptor(1914114757844093835L));
      arrayList_f.add(new StringDecryptor(2634304587606257387L));
      arrayList_f.add(new StringDecryptor(181095027285188608L));
      arrayList_f.add(new StringDecryptor(5918925584456592418L));
      arrayList_f.add(new StringDecryptor(7540593296936550952L));
      arrayList_f.add(new StringDecryptor(4048106866980014814L));
      arrayList_f.add(new StringDecryptor(-414294456488022365L));
      arrayList_f.add(new StringDecryptor(-3264576842161748160L));
      arrayList_f.add(new StringDecryptor(-6993880927408675211L));
      arrayList_f.add(new StringDecryptor(3001051843117878305L));
      arrayList_f.add(new StringDecryptor(-1167204017650880659L));
      arrayList_f.add(new StringDecryptor(1847451234589804399L));
      arrayList_f.add(new StringDecryptor(-3059938326725522789L));
      arrayList_f.add(new StringDecryptor(2496530791937993249L));
      arrayList_f.add(new StringDecryptor(-3862004241965004614L));
      arrayList_f.add(new StringDecryptor(-6480442163315840838L));
      arrayList_f.add(new StringDecryptor(-6472535593936877940L));
      arrayList_f.add(new StringDecryptor(-8159699319542078070L));
      arrayList_f.add(new StringDecryptor(3607419555978299527L));
      arrayList_f.add(new StringDecryptor(3319564254486129485L));
      arrayList_f.add(new StringDecryptor(5696147797505100313L));
      arrayList_f.add(new StringDecryptor(-4334953174622813111L));
      arrayList_f.add(new StringDecryptor(-5230557597517920628L));
      arrayList_f.add(new StringDecryptor(7684865338016334198L));
      arrayList_f.add(new StringDecryptor(-6252000977627725779L));
      arrayList_f.add(new StringDecryptor(-2221188914575216862L));
      arrayList_f.add(new StringDecryptor(4610872081071123118L));
      arrayList_f.add(new StringDecryptor(-341670835225744250L));
      arrayList_f.add(new StringDecryptor(187467794997732140L));
      arrayList_f.add(new StringDecryptor(8549745063176455341L));
      arrayList_f.add(new StringDecryptor(7921224182231926367L));
      arrayList_f.add(new StringDecryptor(788893159361716823L));
      arrayList_f.add(new StringDecryptor(8197412526380248825L));
      arrayList_f.add(new StringDecryptor(3294436830275931295L));
      arrayList_f.add(new StringDecryptor(7508097277094586579L));
      arrayList_f.add(new StringDecryptor(-3874479754377264659L));
      arrayList_f.add(new StringDecryptor(7681091980159928013L));
      arrayList_f.add(new StringDecryptor(2063051452199552668L));
      arrayList_f.add(new StringDecryptor(-6925915556709228352L));
      arrayList_f.add(new StringDecryptor(1049961702902565960L));
      arrayList_f.add(new StringDecryptor(-4283133098053762541L));
      arrayList_f.add(new StringDecryptor(-2468633348753749399L));
      arrayList_f.add(new StringDecryptor(3306865675864441131L));
      arrayList_f.add(new StringDecryptor(-5263969363691132306L));
      arrayList_f.add(new StringDecryptor(-4225639751219436376L));
      arrayList_f.add(new StringDecryptor(7198554614019237317L));
      arrayList_f.add(new StringDecryptor(-3701894517991747754L));
      arrayList_f.add(new StringDecryptor(9189450785510556084L));
      arrayList_f.add(new StringDecryptor(7976563118294992429L));
      arrayList_f.add(new StringDecryptor(7077156350024125411L));
      arrayList_f.add(new StringDecryptor(1787649465156062349L));
      arrayList_f.add(new StringDecryptor(2907503427995265593L));
      arrayList_f.add(new StringDecryptor(8106001255071024520L));
      arrayList_f.add(new StringDecryptor(2731094277059659610L));
      arrayList_f.add(new StringDecryptor(-8966000366882994694L));
      arrayList_f.add(new StringDecryptor(-1625513745873182192L));
      arrayList_f.add(new StringDecryptor(8587211043621266002L));
      arrayList_f.add(new StringDecryptor(4506362151715283678L));
      arrayList_f.add(new StringDecryptor(-7681976731256697666L));
      arrayList_f.add(new StringDecryptor(237486983174341621L));
      arrayList_f.add(new StringDecryptor(8156197855853682912L));
      arrayList_f.add(new StringDecryptor(6545827743299201674L));
      arrayList_f.add(new StringDecryptor(-1517715334395100263L));
      arrayList_f.add(new StringDecryptor(8437212442884410000L));
      arrayList_f.add(new StringDecryptor(-5825324063884408943L));
      arrayList_f.add(new StringDecryptor(5536302597790769573L));
      arrayList_f.add(new StringDecryptor(-2097586373211862815L));
      arrayList_f.add(new StringDecryptor(3987878386541281553L));
      arrayList_f.add(new StringDecryptor(-2103643487534178151L));
      arrayList_f.add(new StringDecryptor(6679344974814954923L));
      arrayList_f.add(new StringDecryptor(6674028771743337365L));
      arrayList_f.add(new StringDecryptor(3020050293993735963L));
      arrayList_f.add(new StringDecryptor(621871465166065178L));
      arrayList_f.add(new StringDecryptor(2104771511698482112L));
      arrayList_f.add(new StringDecryptor(1288525383791004120L));
      arrayList_f.add(new StringDecryptor(4702857080486880958L));
      arrayList_f.add(new StringDecryptor(-3202769274442750546L));
      arrayList_f.add(new StringDecryptor(-3090870960691867695L));
      arrayList_f.add(new StringDecryptor(9088122297506177955L));
      arrayList_f.add(new StringDecryptor(-4227059345140259291L));
      arrayList_f.add(new StringDecryptor(846307716758531236L));
      arrayList_f.add(new StringDecryptor(1755116395833397067L));
      arrayList_f.add(new StringDecryptor(4851047703559463573L));
      arrayList_f.add(new StringDecryptor(-3752596046738045738L));
      arrayList_f.add(new StringDecryptor(-7874368679691892670L));
      arrayList_f.add(new StringDecryptor(-4886923881479183083L));
      arrayList_f.add(new StringDecryptor(-1977701944775213009L));
      arrayList_f.add(new StringDecryptor(4625897886723039269L));
      arrayList_f.add(new StringDecryptor(1618501168362882783L));
      arrayList_f.add(new StringDecryptor(-1071196170974254988L));
      arrayList_f.add(new StringDecryptor(9038487224012359327L));
      arrayList_f.add(new StringDecryptor(998822007711590015L));
      arrayList_f.add(new StringDecryptor(8407459555213205945L));
      arrayList_f.add(new StringDecryptor(-7537421792427815192L));
      arrayList_f.add(new StringDecryptor(7464894549429063491L));
      arrayList_f.add(new StringDecryptor(25501771064954575L));
      arrayList_f.add(new StringDecryptor(-1548107087102940431L));
      arrayList_f.add(new StringDecryptor(926716267098629280L));
      arrayList_f.add(new StringDecryptor(1614232931838412935L));
      arrayList_f.add(new StringDecryptor(-1115499737862520059L));
      arrayList_f.add(new StringDecryptor(-5041033844161132372L));
      arrayList_f.add(new StringDecryptor(2852088540154760233L));
      arrayList_f.add(new StringDecryptor(-8699397864949309213L));
      arrayList_f.add(new StringDecryptor(-1146168003662306650L));
      arrayList_f.add(new StringDecryptor(-8296432744268411406L));
      arrayList_f.add(new StringDecryptor(-3713849733234548473L));
      arrayList_f.add(new StringDecryptor(-2353635306084302252L));
      arrayList_f.add(new StringDecryptor(9138744358535922955L));
      arrayList_f.add(new StringDecryptor(-4137612352152549319L));
      arrayList_f.add(new StringDecryptor(4553974665484512602L));
      arrayList_f.add(new StringDecryptor(3694355008339601725L));
      arrayList_f.add(new StringDecryptor(2710839762918853834L));
      arrayList_f.add(new StringDecryptor(1988058585645853699L));
      arrayList_f.add(new StringDecryptor(1532487694283571454L));
      arrayList_f.add(new StringDecryptor(3370286186421602928L));
      arrayList_f.add(new StringDecryptor(-8824273797808168818L));
      arrayList_f.add(new StringDecryptor(4484755709146899884L));
      arrayList_f.add(new StringDecryptor(-770261171464412773L));
      arrayList_f.add(new StringDecryptor(1959055704215145257L));
      arrayList_f.add(new StringDecryptor(-920356516072453103L));
      arrayList_f.add(new StringDecryptor(-3052637453031865225L));
      arrayList_f.add(new StringDecryptor(2911012247129303291L));
      arrayList_f.add(new StringDecryptor(6302259282385356923L));
      arrayList_f.add(new StringDecryptor(-6452582684991197586L));
      arrayList_f.add(new StringDecryptor(7887926096131665837L));
      arrayList_f.add(new StringDecryptor(-6127921080866157094L));
      arrayList_f.add(new StringDecryptor(2375819858165304862L));
      arrayList_f.add(new StringDecryptor(3738800642237597028L));
      arrayList_f.add(new StringDecryptor(4841124506049759241L));
      arrayList_f.add(new StringDecryptor(-1542382571355910972L));
      arrayList_f.add(new StringDecryptor(5783362937546532658L));
      arrayList_f.add(new StringDecryptor(7631017832942848903L));
      arrayList_f.add(new StringDecryptor(-2017504288203962032L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(-4596303303297955118L));
      arrayList_f.add(new StringDecryptor(8232161511818249221L));
      arrayList_f.add(new StringDecryptor(4953187495685211220L));
      arrayList_f.add(new StringDecryptor(1321209577457223693L));
      arrayList_f.add(new StringDecryptor(-6422072771827629273L));
      arrayList_f.add(new StringDecryptor(-1561464105813819265L));
      arrayList_f.add(new StringDecryptor(-5097894850601137237L));
      arrayList_f.add(new StringDecryptor(3864742302156768685L));
      arrayList_f.add(new StringDecryptor(6675627428439187847L));
      arrayList_f.add(new StringDecryptor(1870813968407889217L));
      arrayList_f.add(new StringDecryptor(-7112462521443710606L));
      arrayList_f.add(new StringDecryptor(6463297146171666080L));
      arrayList_f.add(new StringDecryptor(-6406996328391505408L));
      arrayList_f.add(new StringDecryptor(-3518476476550861523L));
      arrayList_f.add(new StringDecryptor(-222435548246160424L));
      arrayList_f.add(new StringDecryptor(-7440478294002973281L));
      arrayList_f.add(new StringDecryptor(4690049780424164887L));
      arrayList_f.add(new StringDecryptor(8286974634734741903L));
      arrayList_f.add(new StringDecryptor(393661683710101230L));
      arrayList_f.add(new StringDecryptor(1491675917348980824L));
      arrayList_f.add(new StringDecryptor(-7394615490669756029L));
      arrayList_f.add(new StringDecryptor(4869957121242638424L));
      arrayList_f.add(new StringDecryptor(3154454598737563183L));
      arrayList_f.add(new StringDecryptor(-7817760653250269757L));
      arrayList_f.add(new StringDecryptor(-3415433820955278443L));
      arrayList_f.add(new StringDecryptor(-2672216723489225146L));
      arrayList_f.add(new StringDecryptor(-3090792613791366799L));
      arrayList_f.add(new StringDecryptor(5824316005485437495L));
      arrayList_f.add(new StringDecryptor(-2142985286092017714L));
      arrayList_f.add(new StringDecryptor(6601959408667757924L));
      arrayList_f.add(new StringDecryptor(-5850423154905594336L));
      arrayList_f.add(new StringDecryptor(1927714247793413549L));
      arrayList_f.add(new StringDecryptor(-653449960966420113L));
      arrayList_f.add(new StringDecryptor(-8944492036404665291L));
      arrayList_f.add(new StringDecryptor(5421529717050116192L));
      arrayList_f.add(new StringDecryptor(8641128329474813555L));
      arrayList_f.add(new StringDecryptor(-8522084212828214810L));
      arrayList_f.add(new StringDecryptor(-7709383099237900056L));
      arrayList_f.add(new StringDecryptor(5209700222185062797L));
      arrayList_f.add(new StringDecryptor(-5539093060685944421L));
      arrayList_f.add(new StringDecryptor(-946385436765877884L));
      arrayList_f.add(new StringDecryptor(2691569775310333823L));
      arrayList_f.add(new StringDecryptor(2650071290197543929L));
      arrayList_f.add(new StringDecryptor(-416492931586364624L));
      arrayList_f.add(new StringDecryptor(-6946685809522712134L));
      arrayList_f.add(new StringDecryptor(-5987533966551176717L));
      arrayList_f.add(new StringDecryptor(-5250979406286846919L));
      arrayList_f.add(new StringDecryptor(7617406177257948252L));
      arrayList_f.add(new StringDecryptor(7615023506887870529L));
      arrayList_f.add(new StringDecryptor(4561176780503377457L));
      arrayList_f.add(new StringDecryptor(-5575389604446064833L));
      arrayList_f.add(new StringDecryptor(2441775187702860885L));
      arrayList_f.add(new StringDecryptor(-936803268050015668L));
      arrayList_f.add(new StringDecryptor(1268246662628443313L));
      arrayList_f.add(new StringDecryptor(3208809206461514718L));
      arrayList_f.add(new StringDecryptor(-3165456145524995776L));
      arrayList_f.add(new StringDecryptor(-5382531247673973662L));
      arrayList_f.add(new StringDecryptor(-1241182313654317409L));
      arrayList_f.add(new StringDecryptor(-4979839696126203719L));
      arrayList_f.add(new StringDecryptor(-320242737085569187L));
      arrayList_f.add(new StringDecryptor(4011974117704241049L));
      arrayList_f.add(new StringDecryptor(8589208304309545279L));
      arrayList_f.add(new StringDecryptor(2409081895947218330L));
      arrayList_f.add(new StringDecryptor(-5043779373720482017L));
      arrayList_f.add(new StringDecryptor(3917778013493921480L));
      arrayList_f.add(new StringDecryptor(3353159892455391981L));
      arrayList_f.add(new StringDecryptor(8902519808837273546L));
      arrayList_f.add(new StringDecryptor(8309570440570634478L));
      arrayList_f.add(new StringDecryptor(3092642585188107369L));
      arrayList_f.add(new StringDecryptor(-6452453373062935344L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new StringDecryptor(8916412657065273681L));
      arrayList_f.add(new StringDecryptor(679701495144735487L));
      arrayList_f.add(new StringDecryptor(-8696995722054360618L));
      arrayList_f.add(new StringDecryptor(-9199094264517218788L));
      arrayList_f.add(new StringDecryptor(-8436053721743848576L));
      arrayList_f.add(new StringDecryptor(2806523216685363155L));
      arrayList_f.add(new StringDecryptor(4300086992282937705L));
      arrayList_f.add(new StringDecryptor(3552261896092968277L));
      arrayList_f.add(new StringDecryptor(5196143207082354987L));
      arrayList_f.add(new StringDecryptor(8754361602044297239L));
      arrayList_f.add(new StringDecryptor(-1981530291661667901L));
      arrayList_f.add(new StringDecryptor(-8207134957012826601L));
      arrayList_f.add(new StringDecryptor(2744116271711233596L));
      arrayList_f.add(new StringDecryptor(-3948104751267773701L));
      arrayList_f.add(new StringDecryptor(-2082685194230085526L));
      arrayList_f.add(new StringDecryptor(-6470266018925885917L));
      arrayList_f.add(new StringDecryptor(-6895605855792790109L));
      arrayList_f.add(new StringDecryptor(-8515463522901122339L));
      arrayList_f.add(new StringDecryptor(7484944202194160954L));
      arrayList_f.add(new StringDecryptor(-9026000344739167369L));
      arrayList_f.add(new StringDecryptor(3605575443020318748L));
      arrayList_f.add(new StringDecryptor(-898574851054326392L));
      arrayList_f.add(new StringDecryptor(-1703104869776529176L));
      arrayList_f.add(new StringDecryptor(6193720153464212468L));
      arrayList_f.add(new StringDecryptor(1866355490887508184L));
      arrayList_f.add(new StringDecryptor(2848667263736565540L));
      arrayList_f.add(new StringDecryptor(-28158897836088781L));
      arrayList_f.add(new StringDecryptor(6726504407702176628L));
      arrayList_f.add(new StringDecryptor(-408280785734039680L));
      arrayList_f.add(new StringDecryptor(7727639062323406587L));
      arrayList_f.add(new StringDecryptor(3860463224811466389L));
      arrayList_f.add(new StringDecryptor(-5197827547478996766L));
      arrayList_f.add(new StringDecryptor(6511223927968744983L));
      arrayList_f.add(new StringDecryptor(2962489531352239073L));
      arrayList_f.add(new StringDecryptor(-8054592962465945383L));
      arrayList_f.add(new StringDecryptor(5094484325273153071L));
      arrayList_f.add(new StringDecryptor(-6508843226074839457L));
      arrayList_f.add(new StringDecryptor(6476754421385626574L));
      arrayList_f.add(new StringDecryptor(-3917383179661115192L));
      arrayList_f.add(new StringDecryptor(-6655340282465550069L));
      arrayList_f.add(new StringDecryptor(3543405325693446681L));
      arrayList_f.add(new StringDecryptor(-2288918393948541544L));
      arrayList_f.add(new StringDecryptor(-3796221117828100245L));
      arrayList_f.add(new StringDecryptor(8670115239386376922L));
      arrayList_f.add(new StringDecryptor(2014716834158005081L));
      arrayList_f.add(new StringDecryptor(3327750589590112856L));
      arrayList_f.add(new StringDecryptor(-6136842634509940414L));
      arrayList_f.add(new StringDecryptor(3530939748462054589L));
      arrayList_f.add(new StringDecryptor(-473559986807987425L));
      arrayList_f.add(new StringDecryptor(-3907713516327484610L));
      arrayList_f.add(new StringDecryptor(-4790144559165603777L));
      arrayList_f.add(new StringDecryptor(4238112323404777699L));
      arrayList_f.add(new StringDecryptor(7249868649648456815L));
      arrayList_f.add(new StringDecryptor(3927943609708432637L));
      arrayList_f.add(new StringDecryptor(-6323448911226041181L));
      arrayList_f.add(new StringDecryptor(7458749963471368030L));
      arrayList_f.add(new StringDecryptor(-1688765535831151494L));
      arrayList_f.add(new StringDecryptor(1248703067317356312L));
      arrayList_f.add(new StringDecryptor(-8634477885387324533L));
      arrayList_f.add(new StringDecryptor(8834802359236986721L));
      arrayList_f.add(new StringDecryptor(2590906679515488432L));
      arrayList_f.add(new StringDecryptor(-9039602471296022358L));
      arrayList_f.add(new StringDecryptor(791336268898076492L));
      arrayList_f.add(new StringDecryptor(8735231789707558977L));
      arrayList_f.add(new StringDecryptor(-7138503577220069883L));
      arrayList_f.add(new StringDecryptor(-7904764371172914232L));
      arrayList_f.add(new StringDecryptor(-3657037223729085125L));
      arrayList_f.add(new StringDecryptor(9222691464393002482L));
      arrayList_f.add(new StringDecryptor(4369573266005306533L));
      arrayList_f.add(new StringDecryptor(-1035827948583605741L));
      arrayList_f.add(new StringDecryptor(-6188417847132258281L));
      arrayList_f.add(new StringDecryptor(265778071648488781L));
      arrayList_f.add(new StringDecryptor(4146307934050781881L));
      arrayList_f.add(new StringDecryptor(5113430767005943515L));
      arrayList_f.add(new StringDecryptor(7258789047718758362L));
      arrayList_f.add(new StringDecryptor(-239213641043753036L));
      arrayList_f.add(new StringDecryptor(2507068459269006315L));
      arrayList_f.add(new StringDecryptor(3801195404793719241L));
      arrayList_f.add(new StringDecryptor(6442336361775718421L));
      arrayList_f.add(new StringDecryptor(7072632315330046765L));
      arrayList_f.add(new StringDecryptor(4886437577774131306L));
      arrayList_f.add(new StringDecryptor(-1192484422877557348L));
      arrayList_f.add(new StringDecryptor(-8012006538940699912L));
      arrayList_f.add(new StringDecryptor(6468081808273721876L));
      arrayList_f.add(new StringDecryptor(664353879041999093L));
      arrayList_f.add(new StringDecryptor(4307264935123618885L));
      arrayList_f.add(new StringDecryptor(8821406862499628480L));
      arr_e = new int[]{
         -21,
         -3,
         -18,
         -55,
         3,
         -37,
         -32,
         -8,
         -29,
         -16,
         -19,
         -21,
         -49,
         -11,
         -45,
         8,
         -44,
         -23,
         -12,
         -33,
         18,
         21,
         -1,
         1,
         11,
         16,
         -23,
         -26,
         -28,
         19,
         12,
         -8,
         21,
         -12,
         -23,
         -6,
         -27,
         29,
         32,
         8,
         23,
         6,
         37,
         -5,
         -6,
         12,
         -9,
         -7,
         5,
         23,
         6,
         -11,
         33,
         26,
         7,
         9,
         28,
         23,
         55,
         45,
         44,
         49,
         11,
         27
      };
   }
}
