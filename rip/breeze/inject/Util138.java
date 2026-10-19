package rip.breeze.inject;

import java.util.ArrayList;
import java.util.Vector;

public class Util138 implements IBreezeInterface {
   private long fieldLong_a;
   private int[] arr_b;
   private IBreezeInterface iBreezeInterface_c;
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

   public static IBreezeInterface getIBreezeInterface(long var0, long var2, Object var4) {
      PlayerUtil8.toggle(var0 > 0L);
      IBreezeInterface var5 = getIBreezeInterface_3(var0);
      IBreezeInterface var6 = getIBreezeInterface_3(var2);
      IBreezeInterface var7 = PlayerUtil8.getIBreezeInterface(var5, var6);
      if (var4 != null) {
         vector_m.add(var4);
      }

      return var7;
   }

   static IBreezeInterface getIBreezeInterface_2(long var0) {
      int var2 = (int)getLong_4(var0, fieldInt_h, 63, arr_e, arr_k);
      if (var2 < fieldInt_i) {
         return (IBreezeInterface)arrayList_f.get(var2);
      }

      if (arrayList_f.size() % fieldInt_l == 0) {
         arr_e = (int[])arr_e.clone();
      }

      Util138 var3 = new Util138(var0);
      arrayList_f.add(var3);
      return var3;
   }

   private static IBreezeInterface getIBreezeInterface_3(long var0) {
      return new Util138(var0);
   }

   static void initialize(PlayerUtil8 var0) {
      fieldInt_i = arrayList_f.size();
      calculate();
      var0.initialize();
   }

   static void execute_6(PlayerUtil8 var0) {
      calculate();
      int[] var10000 = arr_e = new int[64];
      var10000[0] = -11;
      var10000[1] = -47;
      var10000[2] = -8;
      var10000[3] = -17;
      var10000[4] = -28;
      var10000[5] = -46;
      var10000[6] = -44;
      var10000[7] = -1;
      var10000[8] = 1;
      var10000[9] = -4;
      var10000[10] = 8;
      var10000[11] = 11;
      var10000[12] = -34;
      var10000[13] = 4;
      var10000[14] = -25;
      var10000[15] = -16;
      var10000[16] = -12;
      var10000[17] = -9;
      var10000[18] = -36;
      var10000[19] = -25;
      var10000[20] = 17;
      var10000[21] = -14;
      var10000[22] = -27;
      var10000[23] = -6;
      var10000[24] = -19;
      var10000[25] = -12;
      var10000[26] = 9;
      var10000[27] = -18;
      var10000[28] = 12;
      var10000[29] = 6;
      var10000[30] = -23;
      var10000[31] = 16;
      var10000[32] = 28;
      var10000[33] = -27;
      var10000[34] = -27;
      var10000[35] = 14;
      var10000[36] = -21;
      var10000[37] = 12;
      var10000[38] = -3;
      var10000[39] = 25;
      var10000[40] = -12;
      var10000[41] = 3;
      var10000[42] = -16;
      var10000[43] = 19;
      var10000[44] = 25;
      var10000[45] = 18;
      var10000[46] = 34;
      var10000[47] = -16;
      var10000[48] = 47;
      var10000[49] = 27;
      var10000[50] = 44;
      var10000[51] = 46;
      var10000[52] = 12;
      var10000[53] = 23;
      var10000[54] = 36;
      var10000[55] = -1;
      var10000[56] = 1;
      var10000[57] = 21;
      var10000[58] = 16;
      var10000[59] = -3;
      var10000[60] = 27;
      var10000[61] = 27;
      var10000[62] = 3;
      var10000[63] = 16;
      var0.initialize();
   }

   private Util138(long var1) {
      this.fieldLong_a = var1;
      this.arr_b = arr_e;
      this.arr_j = arr_k;
   }

   public long getLong(long var1) {
      long var3 = this.getLong_3(8, 55);
      long var5 = this.fieldLong_a ^ var1 ^ this.fieldLong_d;
      this.fieldLong_a = var5;
      if (this.iBreezeInterface_c != null) {
         this.iBreezeInterface_c.method_003(var1);
      }

      return var3;
   }

   public void initialize_2(long var1) {
      this.fieldLong_d = var1;
   }

   public void processAll(IBreezeInterface var1) {
      if (this != var1) {
         if (this.iBreezeInterface_c == null) {
            this.iBreezeInterface_c = var1;
         } else {
            this.iBreezeInterface_c.method_001(var1);
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
         return var1 instanceof Util138 ? this.getLong_2(56) == ((Util138)var1).getLong_2(56) : false;
      }
   }

   public boolean checkCondition(IBreezeInterface var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof Util138 ? this.getLong_3(56, 63) - ((Util138)var1).getLong_3(56, 63) <= 0L : true;
      }
   }

   @Override
   public int[] invoke_2() {
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
         IBreezeInterface var8;
         if (((IBreezeInterface)var4.get(var5)).method_005((IBreezeInterface)var4.get(var6))) {
            var8 = (IBreezeInterface)var4.get(var5++);
         } else {
            var8 = (IBreezeInterface)var4.get(var6++);
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
      initialize();
      fieldInt_i = arrayList_f.size();
      calculate();
   }

   private static void initialize() {
      arr_e = new int[]{
         -34,
         -61,
         -53,
         -54,
         -18,
         -12,
         -40,
         -32,
         -43,
         -28,
         -37,
         -52,
         -8,
         -28,
         -31,
         -38,
         -22,
         12,
         -22,
         -5,
         8,
         -10,
         18,
         -37,
         5,
         -25,
         -26,
         -21,
         -26,
         -13,
         -19,
         10,
         -11,
         -25,
         34,
         -24,
         -25,
         28,
         22,
         32,
         22,
         28,
         13,
         11,
         -12,
         31,
         40,
         37,
         21,
         19,
         25,
         43,
         26,
         38,
         26,
         53,
         12,
         54,
         25,
         24,
         37,
         25,
         61,
         52
      };
      arrayList_f.add(new Util138(-4196940876687500494L));
      arrayList_f.add(new Util138(-6198014202981124317L));
      arrayList_f.add(new Util138(-7170283107710579982L));
      arrayList_f.add(new Util138(-7170265515532924166L));
      arrayList_f.add(new Util138(-321443552426303213L));
      arrayList_f.add(new Util138(5879689709476189217L));
      arrayList_f.add(new Util138(-5466159426916870245L));
      arrayList_f.add(new Util138(3568865863206234112L));
      arrayList_f.add(new Util138(-1187851130323784751L));
      arrayList_f.add(new Util138(-4916005580154436864L));
      arrayList_f.add(new Util138(-528583628572280622L));
      arrayList_f.add(new Util138(5858941801513573089L));
      arrayList_f.add(new Util138(2079727160145426312L));
      arrayList_f.add(new Util138(4082512137971435656L));
      arrayList_f.add(new Util138(-6904332819461598334L));
      arrayList_f.add(new Util138(-8274194127431791312L));
      arrayList_f.add(new Util138(-1585457477942806176L));
      arrayList_f.add(new Util138(1482599907653164674L));
      arrayList_f.add(new Util138(-7785340602550487159L));
      arrayList_f.add(new Util138(-1285676300770023495L));
      arrayList_f.add(new Util138(2079744692210319242L));
      arrayList_f.add(new Util138(-8148057745814957823L));
      arrayList_f.add(new Util138(-914446027976277862L));
      arrayList_f.add(new Util138(-6373597966637879152L));
      arrayList_f.add(new Util138(7054357468693895787L));
      arrayList_f.add(new Util138(5884623066049530608L));
      arrayList_f.add(new Util138(8083216365608234075L));
      arrayList_f.add(new Util138(-8052794094700761856L));
      arrayList_f.add(new Util138(-2098898911842451582L));
      arrayList_f.add(new Util138(3568883395271125002L));
      arrayList_f.add(new Util138(2337666768911728401L));
      arrayList_f.add(new Util138(1871085478100570019L));
      arrayList_f.add(new Util138(6240566676861235721L));
      arrayList_f.add(new Util138(-944345546043739982L));
      arrayList_f.add(new Util138(8587400601902927282L));
      arrayList_f.add(new Util138(-5790344571070885232L));
      arrayList_f.add(new Util138(7665323046803796826L));
      arrayList_f.add(new Util138(9199455875322443947L));
      arrayList_f.add(new Util138(3115973663277064714L));
      arrayList_f.add(new Util138(6334357922709974234L));
      arrayList_f.add(new Util138(-6403917365592529079L));
      arrayList_f.add(new Util138(-6782104935353242760L));
      arrayList_f.add(new Util138(5634169089831181699L));
      arrayList_f.add(new Util138(6528232116609042034L));
      arrayList_f.add(new Util138(-8806001942450335424L));
      arrayList_f.add(new Util138(-1928201164812878711L));
      arrayList_f.add(new Util138(6837572796116288616L));
      arrayList_f.add(new Util138(3931625143183094091L));
      arrayList_f.add(new Util138(-709894778788236669L));
      arrayList_f.add(new Util138(3344040628529739000L));
      arrayList_f.add(new Util138(4501340906013056144L));
      arrayList_f.add(new Util138(-3450446734227384143L));
      arrayList_f.add(new Util138(-5457102149569096189L));
      arrayList_f.add(new Util138(3746690205602077073L));
      arrayList_f.add(new Util138(-5747623622668443662L));
      arrayList_f.add(new Util138(-4068104783960740823L));
      arrayList_f.add(new Util138(-6057087093043111880L));
      arrayList_f.add(new Util138(-7831334012622239840L));
      arrayList_f.add(new Util138(-1864134123614863981L));
      arrayList_f.add(new Util138(964468716436669083L));
      arrayList_f.add(new Util138(5278113635570937282L));
      arrayList_f.add(new Util138(6703780165270854344L));
      arrayList_f.add(new Util138(-3130915098553730189L));
      arrayList_f.add(new Util138(3521273429903230104L));
      arrayList_f.add(new Util138(1945958027166212344L));
      arrayList_f.add(new Util138(5218530836529801835L));
      arrayList_f.add(new Util138(-6867031369245820358L));
      arrayList_f.add(new Util138(6790704768349018081L));
      arrayList_f.add(new Util138(8233698281277636194L));
      arrayList_f.add(new Util138(-9142624038015027264L));
      arrayList_f.add(new Util138(1594678123126549569L));
      arrayList_f.add(new Util138(3549046596514912674L));
      arrayList_f.add(new Util138(460243619341319457L));
      arrayList_f.add(new Util138(4631996121031616195L));
      arrayList_f.add(new Util138(6405195213197493032L));
      arrayList_f.add(new Util138(-8010270372520270631L));
      arrayList_f.add(new Util138(4583395482861222842L));
      arrayList_f.add(new Util138(519636868457994312L));
      arrayList_f.add(new Util138(-7493153432648499592L));
      arrayList_f.add(new Util138(-3806666556953457165L));
      arrayList_f.add(new Util138(5950038983432481736L));
      arrayList_f.add(new Util138(-5449544050291416496L));
      arrayList_f.add(new Util138(6528984927320687906L));
      arrayList_f.add(new Util138(-1465684379118879504L));
      arrayList_f.add(new Util138(8223839769003960498L));
      arrayList_f.add(new Util138(-923246348195037399L));
      arrayList_f.add(new Util138(-7823582091397754621L));
      arrayList_f.add(new Util138(2790350588229492067L));
      arrayList_f.add(new Util138(2101281740081770856L));
      arrayList_f.add(new Util138(-8912718947392922856L));
      arrayList_f.add(new Util138(8190152310877783411L));
      arrayList_f.add(new Util138(9157687840405776618L));
      arrayList_f.add(new Util138(-5841310028771315767L));
      arrayList_f.add(new Util138(-8759536010168191638L));
      arrayList_f.add(new Util138(-9121899677785782911L));
      arrayList_f.add(new Util138(-4791273112054237478L));
      arrayList_f.add(new Util138(4459526153662779851L));
      arrayList_f.add(new Util138(-6602701990819311839L));
      arrayList_f.add(new Util138(8604972098709378880L));
      arrayList_f.add(new Util138(-4144999845141547032L));
      arrayList_f.add(new Util138(7254086884866062082L));
      arrayList_f.add(new Util138(7398502455721095616L));
      arrayList_f.add(new Util138(-4177704814509376837L));
      arrayList_f.add(new Util138(-1442312299175334144L));
      arrayList_f.add(new Util138(6204638453421936056L));
      arrayList_f.add(new Util138(-432630504083399488L));
      arrayList_f.add(new Util138(-2194861425204323735L));
      arrayList_f.add(new Util138(-9099371799034265375L));
      arrayList_f.add(new Util138(-6184254766293440344L));
      arrayList_f.add(new Util138(-3872847938539579518L));
      arrayList_f.add(new Util138(-8566310699762531368L));
      arrayList_f.add(new Util138(2661894403737667568L));
      arrayList_f.add(new Util138(6976140388198618417L));
      arrayList_f.add(new Util138(1052494623845472401L));
      arrayList_f.add(new Util138(4090597026348557696L));
      arrayList_f.add(new Util138(-589908648102135368L));
      arrayList_f.add(new Util138(-1420350597738479719L));
      arrayList_f.add(new Util138(6352234907863054912L));
      arrayList_f.add(new Util138(-6184824991652493463L));
      arrayList_f.add(new Util138(7611240535286819264L));
      arrayList_f.add(new Util138(-2445220111641305310L));
      arrayList_f.add(new Util138(-3484669094797344391L));
      arrayList_f.add(new Util138(4539078146668264161L));
      arrayList_f.add(new Util138(-42923479060951223L));
      arrayList_f.add(new Util138(-5475815963011138485L));
      arrayList_f.add(new Util138(-4759552239619352032L));
      arrayList_f.add(new Util138(6388808691539195161L));
      arrayList_f.add(new Util138(3900722756445923520L));
      arrayList_f.add(new Util138(-8943351378351782813L));
      arrayList_f.add(new Util138(2277618082209386195L));
      arrayList_f.add(new Util138(5541029219574673915L));
      arrayList_f.add(new Util138(5951819600338864530L));
      arrayList_f.add(new Util138(-4218399401353765061L));
      arrayList_f.add(new Util138(-4598621358168591653L));
      arrayList_f.add(new Util138(5783078070795182051L));
      arrayList_f.add(new Util138(-1692183276476320647L));
      arrayList_f.add(new Util138(-7717645546702594703L));
      arrayList_f.add(new Util138(406443272758831331L));
      arrayList_f.add(new Util138(4516512695728131203L));
      arrayList_f.add(new Util138(3361053658638300555L));
      arrayList_f.add(new Util138(3650230775647043043L));
      arrayList_f.add(new Util138(-4379437795978350207L));
      arrayList_f.add(new Util138(5656139006284570810L));
      arrayList_f.add(new Util138(2840725453210667907L));
      arrayList_f.add(new Util138(89442949205492834L));
      arrayList_f.add(new Util138(-4237090780226637414L));
      arrayList_f.add(new Util138(-727864288628215822L));
      arrayList_f.add(new Util138(5577311535859004792L));
      arrayList_f.add(new Util138(-5859855319939833901L));
      arrayList_f.add(new Util138(-2034080047857911887L));
      arrayList_f.add(new Util138(1564212480971857272L));
      arrayList_f.add(new Util138(1837106868866442403L));
      arrayList_f.add(new Util138(3150914369809045291L));
      arrayList_f.add(new Util138(-361551637541128245L));
      arrayList_f.add(new Util138(1282901273613586459L));
      arrayList_f.add(new Util138(-5719766420961730454L));
      arrayList_f.add(new Util138(-4148420499110968486L));
      arrayList_f.add(new Util138(-5070224039912585304L));
      arrayList_f.add(new Util138(-5727211595299887190L));
      arrayList_f.add(new Util138(1309664463653085187L));
      arrayList_f.add(new Util138(6939519679127574763L));
      arrayList_f.add(new Util138(-6120834863225912710L));
      arrayList_f.add(new Util138(-934429125884941272L));
      arrayList_f.add(new Util138(-4037293992895698647L));
      arrayList_f.add(new Util138(-7243707310442800453L));
      arrayList_f.add(new Util138(-8942000684371745071L));
      arrayList_f.add(new Util138(-3163938306171532295L));
      arrayList_f.add(new Util138(-1025723172661396664L));
      arrayList_f.add(new Util138(5636692287510422728L));
      arrayList_f.add(new Util138(1188118465440406713L));
      arrayList_f.add(new Util138(6134203704061026235L));
      arrayList_f.add(new Util138(4356745796813001640L));
      arrayList_f.add(new Util138(-6983460204038968616L));
      arrayList_f.add(new Util138(1429499914774783523L));
      arrayList_f.add(new Util138(973654908603301610L));
      arrayList_f.add(new Util138(-5340508225143718302L));
      arrayList_f.add(new Util138(-8924999002580157127L));
      arrayList_f.add(new Util138(-2926608173559982447L));
      arrayList_f.add(new Util138(-5427985626300871095L));
      arrayList_f.add(new Util138(1514223058307245426L));
      arrayList_f.add(new Util138(-1046815487663789365L));
      arrayList_f.add(new Util138(1748573709391132963L));
      arrayList_f.add(new Util138(5692348159884344825L));
      arrayList_f.add(new Util138(-1352139458350220045L));
      arrayList_f.add(new Util138(-5070089797655505910L));
      arrayList_f.add(new Util138(5870764278239578832L));
      arrayList_f.add(new Util138(-2467593267776085471L));
      arrayList_f.add(new Util138(5175878801404664968L));
      arrayList_f.add(new Util138(7186804197167312427L));
      arrayList_f.add(new Util138(3227867947078696714L));
      arrayList_f.add(new Util138(-1549735016312226197L));
      arrayList_f.add(new Util138(-5598520394266865893L));
      arrayList_f.add(new Util138(-7808806051466437198L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(5594206930333595601L));
      arrayList_f.add(new Util138(-1471955664169740111L));
      arrayList_f.add(new Util138(5684420657136813289L));
      arrayList_f.add(new Util138(2714674048740328008L));
      arrayList_f.add(new Util138(3336456714950092554L));
      arrayList_f.add(new Util138(3947677432651593136L));
      arrayList_f.add(new Util138(5150128426668373632L));
      arrayList_f.add(new Util138(1734623695403261210L));
      arrayList_f.add(new Util138(-6061062000038858925L));
      arrayList_f.add(new Util138(7475342473869779376L));
      arrayList_f.add(new Util138(3946398741023914826L));
      arrayList_f.add(new Util138(-6833096040606558423L));
      arrayList_f.add(new Util138(3346443738673043737L));
      arrayList_f.add(new Util138(-785065417890142648L));
      arrayList_f.add(new Util138(-715350586985466517L));
      arrayList_f.add(new Util138(-539858669366937902L));
      arrayList_f.add(new Util138(186507299618681531L));
      arrayList_f.add(new Util138(-883864107961145733L));
      arrayList_f.add(new Util138(-3095757766653263662L));
      arrayList_f.add(new Util138(3125172755895578481L));
      arrayList_f.add(new Util138(6076845148534215067L));
      arrayList_f.add(new Util138(924900232698103385L));
      arrayList_f.add(new Util138(8289909941609551835L));
      arrayList_f.add(new Util138(4771422113372233058L));
      arrayList_f.add(new Util138(-4457853010473217335L));
      arrayList_f.add(new Util138(7532671612469037242L));
      arrayList_f.add(new Util138(5114788383093472512L));
      arrayList_f.add(new Util138(9024664509386278650L));
      arrayList_f.add(new Util138(5853643770569669824L));
      arrayList_f.add(new Util138(7132505921349129649L));
      arrayList_f.add(new Util138(1484930068642966601L));
      arrayList_f.add(new Util138(-3517458295899328456L));
      arrayList_f.add(new Util138(-7720900394561861208L));
      arrayList_f.add(new Util138(3208081954641923914L));
      arrayList_f.add(new Util138(4573035159783734458L));
      arrayList_f.add(new Util138(-1771110222481419567L));
      arrayList_f.add(new Util138(8549898311378082043L));
      arrayList_f.add(new Util138(-113543768164890520L));
      arrayList_f.add(new Util138(7348864880532911344L));
      arrayList_f.add(new Util138(-5827210665461953503L));
      arrayList_f.add(new Util138(8194524509867961809L));
      arrayList_f.add(new Util138(2800401781121018803L));
      arrayList_f.add(new Util138(-8260570102655778903L));
      arrayList_f.add(new Util138(-6353033870026095981L));
      arrayList_f.add(new Util138(-2161451794521669022L));
      arrayList_f.add(new Util138(7304838680139519315L));
      arrayList_f.add(new Util138(-400610953639822598L));
      arrayList_f.add(new Util138(-7878038327304089776L));
      arrayList_f.add(new Util138(3876269226413752443L));
      arrayList_f.add(new Util138(-1616392523181712992L));
      arrayList_f.add(new Util138(7701508680688312504L));
      arrayList_f.add(new Util138(-6928694063769212310L));
      arrayList_f.add(new Util138(821563005867322793L));
      arrayList_f.add(new Util138(2330412278160585187L));
      arrayList_f.add(new Util138(-7441625189216713109L));
      arrayList_f.add(new Util138(-2926157461396036046L));
      arrayList_f.add(new Util138(-7437534646515610608L));
      arrayList_f.add(new Util138(2691023568441667072L));
      arrayList_f.add(new Util138(-8163099091979184328L));
      arrayList_f.add(new Util138(1327842943952989752L));
      arrayList_f.add(new Util138(-3441507331474780615L));
      arrayList_f.add(new Util138(-5033580108366502015L));
      arrayList_f.add(new Util138(-5859855319939833895L));
      arrayList_f.add(new Util138(8819385517875840275L));
      arrayList_f.add(new Util138(-6128249798524534902L));
      arrayList_f.add(new Util138(-9006740993738300381L));
      arrayList_f.add(new Util138(2955142944106369907L));
      arrayList_f.add(new Util138(-8239490686042735543L));
      arrayList_f.add(new Util138(-2915184880275766982L));
      arrayList_f.add(new Util138(36694134037744634L));
      arrayList_f.add(new Util138(-7790818495681592854L));
      arrayList_f.add(new Util138(-5114398323638661805L));
      arrayList_f.add(new Util138(2812623252891331483L));
      arrayList_f.add(new Util138(-1846445413947389261L));
      arrayList_f.add(new Util138(4354555342846739227L));
      arrayList_f.add(new Util138(1887580985011007072L));
      arrayList_f.add(new Util138(-6334224051787596895L));
      arrayList_f.add(new Util138(-7927673904625392341L));
      arrayList_f.add(new Util138(-8807678748897188518L));
      arrayList_f.add(new Util138(-3206982398079278821L));
      arrayList_f.add(new Util138(-3073207700213038661L));
      arrayList_f.add(new Util138(-3002326367114974621L));
      arrayList_f.add(new Util138(-1827216604130741991L));
      arrayList_f.add(new Util138(-7174313229264177359L));
      arrayList_f.add(new Util138(-5230543835156920182L));
      arrayList_f.add(new Util138(8425893246113153779L));
      arrayList_f.add(new Util138(3437816199537449497L));
      arrayList_f.add(new Util138(2275843189013822859L));
      arrayList_f.add(new Util138(-4215753582071675008L));
      arrayList_f.add(new Util138(-5591181099533756632L));
      arrayList_f.add(new Util138(7681254414537386899L));
      arrayList_f.add(new Util138(5492279441639039043L));
      arrayList_f.add(new Util138(-7589062499404777789L));
      arrayList_f.add(new Util138(4674680162928761593L));
      arrayList_f.add(new Util138(7814220608254895689L));
      arrayList_f.add(new Util138(-8458187190688622112L));
      arrayList_f.add(new Util138(796042324644092017L));
      arrayList_f.add(new Util138(-8235895357746807301L));
      arrayList_f.add(new Util138(6382550737667154897L));
      arrayList_f.add(new Util138(-7112142264362261037L));
      arrayList_f.add(new Util138(-3517826205260289565L));
      arrayList_f.add(new Util138(-6708556425756422768L));
      arrayList_f.add(new Util138(6718002414163060640L));
      arrayList_f.add(new Util138(1575345123894391832L));
      arrayList_f.add(new Util138(1675467991176010018L));
      arrayList_f.add(new Util138(-6583839766970287271L));
      arrayList_f.add(new Util138(-2746177906665231359L));
      arrayList_f.add(new Util138(2478197914614824075L));
      arrayList_f.add(new Util138(-721607390666117248L));
      arrayList_f.add(new Util138(-8822893264901127096L));
      arrayList_f.add(new Util138(-8787705633646633640L));
      arrayList_f.add(new Util138(2017501109949966400L));
      arrayList_f.add(new Util138(2609519246673735626L));
      arrayList_f.add(new Util138(-2102960886915990072L));
      arrayList_f.add(new Util138(2846859103274339768L));
      arrayList_f.add(new Util138(6293335196844479178L));
      arrayList_f.add(new Util138(6317574384876678202L));
      arrayList_f.add(new Util138(-8463538300136092991L));
      arrayList_f.add(new Util138(4245371448938822891L));
      arrayList_f.add(new Util138(-7088527631911861559L));
      arrayList_f.add(new Util138(-5925975972664137277L));
      arrayList_f.add(new Util138(6790243599885678313L));
      arrayList_f.add(new Util138(5748782412220451465L));
      arrayList_f.add(new Util138(-3723281777107821573L));
      arrayList_f.add(new Util138(6286038187040411496L));
      arrayList_f.add(new Util138(-1842012250509199695L));
      arrayList_f.add(new Util138(-9081513490059617110L));
      arrayList_f.add(new Util138(8499175671752073488L));
      arrayList_f.add(new Util138(500810564543417954L));
      arrayList_f.add(new Util138(-1479443557494276214L));
      arrayList_f.add(new Util138(-4125242561933104776L));
      arrayList_f.add(new Util138(5590923348545725634L));
      arrayList_f.add(new Util138(7657762887064546593L));
      arrayList_f.add(new Util138(-5700753238726438221L));
      arrayList_f.add(new Util138(7973302090764687040L));
      arrayList_f.add(new Util138(7796221782587975361L));
      arrayList_f.add(new Util138(-7631418789968878927L));
      arrayList_f.add(new Util138(284494786599600976L));
      arrayList_f.add(new Util138(-8506359714520601838L));
      arrayList_f.add(new Util138(-5698577818203816846L));
      arrayList_f.add(new Util138(-8994811264091784221L));
      arrayList_f.add(new Util138(5007795746393755121L));
      arrayList_f.add(new Util138(-7737886608768922798L));
      arrayList_f.add(new Util138(1318112473777289075L));
      arrayList_f.add(new Util138(-4094572677124168957L));
      arrayList_f.add(new Util138(-7745217749928922783L));
      arrayList_f.add(new Util138(-5609924476848933184L));
      arrayList_f.add(new Util138(70767813128895408L));
      arrayList_f.add(new Util138(628421430128533920L));
      arrayList_f.add(new Util138(8560169090088619009L));
      arrayList_f.add(new Util138(-8444631152857967895L));
      arrayList_f.add(new Util138(1592548411874993755L));
      arrayList_f.add(new Util138(1033475426484885811L));
      arrayList_f.add(new Util138(1358819332704507528L));
      arrayList_f.add(new Util138(-7276577142827954134L));
      arrayList_f.add(new Util138(-5359741068333661104L));
      arrayList_f.add(new Util138(1727991041674047115L));
      arrayList_f.add(new Util138(-2162993122155931639L));
      arrayList_f.add(new Util138(5366469585999418587L));
      arrayList_f.add(new Util138(-5529306264957818247L));
      arrayList_f.add(new Util138(-901013888003024192L));
      arrayList_f.add(new Util138(-5470409260504926511L));
      arrayList_f.add(new Util138(5829547334414006601L));
      arrayList_f.add(new Util138(-6294094238375770343L));
      arrayList_f.add(new Util138(-6572621555896984232L));
      arrayList_f.add(new Util138(-7579642912243388592L));
      arrayList_f.add(new Util138(8360549948276897195L));
      arrayList_f.add(new Util138(-268133169705036941L));
      arrayList_f.add(new Util138(8364747329305398161L));
      arrayList_f.add(new Util138(2585351979743715904L));
      arrayList_f.add(new Util138(-8335237785620270039L));
      arrayList_f.add(new Util138(6838422861023033705L));
      arrayList_f.add(new Util138(-7584554870464964926L));
      arrayList_f.add(new Util138(3002258087039323643L));
      arrayList_f.add(new Util138(5651134334598399459L));
      arrayList_f.add(new Util138(1576556541096825057L));
      arrayList_f.add(new Util138(-8128415852930935648L));
      arrayList_f.add(new Util138(-2043285295234983285L));
      arrayList_f.add(new Util138(-4060272945464042904L));
      arrayList_f.add(new Util138(-2170737283295449951L));
      arrayList_f.add(new Util138(2575648339348577379L));
      arrayList_f.add(new Util138(-2903924749238562821L));
      arrayList_f.add(new Util138(4542772411171575233L));
      arrayList_f.add(new Util138(700793289753015403L));
      arrayList_f.add(new Util138(-7900782573449157357L));
      arrayList_f.add(new Util138(4512154509411591944L));
      arrayList_f.add(new Util138(-1376714378416222925L));
      arrayList_f.add(new Util138(5534081528516808899L));
      arrayList_f.add(new Util138(997509436357178266L));
      arrayList_f.add(new Util138(-6864271345681961973L));
      arrayList_f.add(new Util138(584231080688326258L));
      arrayList_f.add(new Util138(215423453403622426L));
      arrayList_f.add(new Util138(502805873329776266L));
      arrayList_f.add(new Util138(-6286314038100919967L));
      arrayList_f.add(new Util138(-3351344281979841312L));
      arrayList_f.add(new Util138(-5541180171150959637L));
      arrayList_f.add(new Util138(8031127264228360907L));
      arrayList_f.add(new Util138(4452659265732074665L));
      arrayList_f.add(new Util138(8694387120928089090L));
      arrayList_f.add(new Util138(-1608632441045285406L));
      arrayList_f.add(new Util138(-6616158190574163311L));
      arrayList_f.add(new Util138(-5887564102157666672L));
      arrayList_f.add(new Util138(859358403627353648L));
      arrayList_f.add(new Util138(7527173778357250715L));
      arrayList_f.add(new Util138(-2519052811873619112L));
      arrayList_f.add(new Util138(-5906367977393444981L));
      arrayList_f.add(new Util138(3573656159275956354L));
      arrayList_f.add(new Util138(3274213105021666713L));
      arrayList_f.add(new Util138(-7839575089813587496L));
      arrayList_f.add(new Util138(-2655188794730826494L));
      arrayList_f.add(new Util138(8664878292783097976L));
      arrayList_f.add(new Util138(-7402709630103070455L));
      arrayList_f.add(new Util138(-4139115934444575352L));
      arrayList_f.add(new Util138(-144496802802537512L));
      arrayList_f.add(new Util138(2813538582659800176L));
      arrayList_f.add(new Util138(-1366327461292144061L));
      arrayList_f.add(new Util138(6384581901711804305L));
      arrayList_f.add(new Util138(-3332077728694913198L));
      arrayList_f.add(new Util138(-472041285043844181L));
      arrayList_f.add(new Util138(5192081787831972968L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(4957947063572173153L));
      arrayList_f.add(new Util138(-4034665448632558126L));
      arrayList_f.add(new Util138(4087474252401183835L));
      arrayList_f.add(new Util138(6007456640287488176L));
      arrayList_f.add(new Util138(9100458315790520409L));
      arrayList_f.add(new Util138(2749600853459249680L));
      arrayList_f.add(new Util138(-8888589410443153781L));
      arrayList_f.add(new Util138(9138566086220381546L));
      arrayList_f.add(new Util138(-9075746136703849269L));
      arrayList_f.add(new Util138(-4444972872807027190L));
      arrayList_f.add(new Util138(-3317471806738541175L));
      arrayList_f.add(new Util138(-4168798701173654549L));
      arrayList_f.add(new Util138(9052884893462658315L));
      arrayList_f.add(new Util138(-5310680118391723502L));
      arrayList_f.add(new Util138(4897124654426542136L));
      arrayList_f.add(new Util138(1295222719905791426L));
      arrayList_f.add(new Util138(-2761144455401032127L));
      arrayList_f.add(new Util138(-3233824330828509943L));
      arrayList_f.add(new Util138(355597792849997368L));
      arrayList_f.add(new Util138(-3710523124182734935L));
      arrayList_f.add(new Util138(284906308814698577L));
      arrayList_f.add(new Util138(7593564966423667776L));
      arrayList_f.add(new Util138(2253391194582786538L));
      arrayList_f.add(new Util138(-7983153691458912606L));
      arrayList_f.add(new Util138(-6722677141920950663L));
      arrayList_f.add(new Util138(8791858649723844232L));
      arrayList_f.add(new Util138(5200187269463026360L));
      arrayList_f.add(new Util138(5530250658572982249L));
      arrayList_f.add(new Util138(-296297392023728880L));
      arrayList_f.add(new Util138(8431864777894163994L));
      arrayList_f.add(new Util138(-1339709615353100224L));
      arrayList_f.add(new Util138(6153511919384619889L));
      arrayList_f.add(new Util138(6293352789038914242L));
      arrayList_f.add(new Util138(-39769372920330440L));
      arrayList_f.add(new Util138(420240447377058403L));
      arrayList_f.add(new Util138(-7291920508479077440L));
      arrayList_f.add(new Util138(1569625953419349345L));
      arrayList_f.add(new Util138(8137576493759191155L));
      arrayList_f.add(new Util138(9015430900175151888L));
      arrayList_f.add(new Util138(2072762334119676153L));
      arrayList_f.add(new Util138(-7807928446046226797L));
      arrayList_f.add(new Util138(3455604593655588769L));
      arrayList_f.add(new Util138(7604480512237048352L));
      arrayList_f.add(new Util138(1561333540782842721L));
      arrayList_f.add(new Util138(9108209437922249664L));
      arrayList_f.add(new Util138(-8482069545256089688L));
      arrayList_f.add(new Util138(-8172239550817211310L));
      arrayList_f.add(new Util138(3947430717799011323L));
      arrayList_f.add(new Util138(-360650483572793000L));
      arrayList_f.add(new Util138(8523208043767923881L));
      arrayList_f.add(new Util138(4114587016432219411L));
      arrayList_f.add(new Util138(5513000524858571872L));
      arrayList_f.add(new Util138(-7388359673642863032L));
      arrayList_f.add(new Util138(-7921588906810529304L));
      arrayList_f.add(new Util138(4245971667493740138L));
      arrayList_f.add(new Util138(5221480779473998648L));
      arrayList_f.add(new Util138(7920809901033935313L));
      arrayList_f.add(new Util138(-6854132995604225142L));
      arrayList_f.add(new Util138(6954753329660417744L));
      arrayList_f.add(new Util138(-3699185457717457917L));
      arrayList_f.add(new Util138(1318561470815579634L));
      arrayList_f.add(new Util138(-2293378182588472712L));
      arrayList_f.add(new Util138(-4654790572313883119L));
      arrayList_f.add(new Util138(8161585477316128496L));
      arrayList_f.add(new Util138(3191056075998835691L));
      arrayList_f.add(new Util138(-5628335187028725855L));
      arrayList_f.add(new Util138(-8103396372395423566L));
      arrayList_f.add(new Util138(-1404254647221513800L));
      arrayList_f.add(new Util138(531438825274263880L));
      arrayList_f.add(new Util138(8054665856749972449L));
      arrayList_f.add(new Util138(-4248546928710841216L));
      arrayList_f.add(new Util138(6054792671311829625L));
      arrayList_f.add(new Util138(960946323479859305L));
      arrayList_f.add(new Util138(-571197277451502200L));
      arrayList_f.add(new Util138(-1334383833556213198L));
      arrayList_f.add(new Util138(2115549322786200712L));
      arrayList_f.add(new Util138(-4159331149062730623L));
      arrayList_f.add(new Util138(-3079173848860452309L));
      arrayList_f.add(new Util138(-2739912610970490975L));
      arrayList_f.add(new Util138(-3255870953276926311L));
      arrayList_f.add(new Util138(7460301079563592137L));
      arrayList_f.add(new Util138(-123808275379899165L));
      arrayList_f.add(new Util138(6236319319066250490L));
      arrayList_f.add(new Util138(-1638742050047840743L));
      arrayList_f.add(new Util138(-6925134435457676078L));
      arrayList_f.add(new Util138(1143820745561076010L));
      arrayList_f.add(new Util138(2800419416256736187L));
      arrayList_f.add(new Util138(-6831133177074704880L));
      arrayList_f.add(new Util138(-4726270109509741976L));
      arrayList_f.add(new Util138(3901135814264256560L));
      arrayList_f.add(new Util138(-9139302034264202582L));
      arrayList_f.add(new Util138(-8790962600162879599L));
      arrayList_f.add(new Util138(6666842258257697722L));
      arrayList_f.add(new Util138(8557268104167821098L));
      arrayList_f.add(new Util138(-8879111875906567712L));
      arrayList_f.add(new Util138(501375593522250954L));
      arrayList_f.add(new Util138(1128825773426390856L));
      arrayList_f.add(new Util138(-6954984325142863949L));
      arrayList_f.add(new Util138(-7254583995032841070L));
      arrayList_f.add(new Util138(-5136345987110478560L));
      arrayList_f.add(new Util138(-7203107166120140845L));
      arrayList_f.add(new Util138(-7759821338908962447L));
      arrayList_f.add(new Util138(2074872190198454235L));
      arrayList_f.add(new Util138(976187257594978145L));
      arrayList_f.add(new Util138(1804939214980197082L));
      arrayList_f.add(new Util138(8426592787430735715L));
      arrayList_f.add(new Util138(1659243541296928570L));
      arrayList_f.add(new Util138(-8749853146664474351L));
      arrayList_f.add(new Util138(-4821999563837502581L));
      arrayList_f.add(new Util138(5511724994509145874L));
      arrayList_f.add(new Util138(-2931203828347826672L));
      arrayList_f.add(new Util138(425262987205852488L));
      arrayList_f.add(new Util138(-6701699004930094709L));
      arrayList_f.add(new Util138(-7130558386158322808L));
      arrayList_f.add(new Util138(-2927321937471350807L));
      arrayList_f.add(new Util138(5521876334473263817L));
      arrayList_f.add(new Util138(2698458849137837474L));
      arrayList_f.add(new Util138(343384035657770376L));
      arrayList_f.add(new Util138(-8817469259419751021L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(-2978706075229885112L));
      arrayList_f.add(new Util138(-5253213537669001935L));
      arrayList_f.add(new Util138(-1403303039142561024L));
      arrayList_f.add(new Util138(-1683524964715341141L));
      arrayList_f.add(new Util138(3413908475228705905L));
      arrayList_f.add(new Util138(-1662484850567415430L));
      arrayList_f.add(new Util138(8863397215900671345L));
      arrayList_f.add(new Util138(4148111508248020568L));
      arrayList_f.add(new Util138(4175626438157892050L));
      arrayList_f.add(new Util138(-130927806558287446L));
      arrayList_f.add(new Util138(-7935898837030741349L));
      arrayList_f.add(new Util138(-2202666057041511720L));
      arrayList_f.add(new Util138(951175717630217984L));
      arrayList_f.add(new Util138(-4922031730932356125L));
      arrayList_f.add(new Util138(-3624593947997841630L));
      arrayList_f.add(new Util138(-4949220421805449406L));
      arrayList_f.add(new Util138(3070423234954946978L));
      arrayList_f.add(new Util138(-3605115754612191352L));
      arrayList_f.add(new Util138(-92814600871064216L));
      arrayList_f.add(new Util138(8355572263562689457L));
      arrayList_f.add(new Util138(4142824294507581000L));
      arrayList_f.add(new Util138(2780239685663246065L));
      arrayList_f.add(new Util138(1428446894806802024L));
      arrayList_f.add(new Util138(-7670938651623436581L));
      arrayList_f.add(new Util138(-467754110332246526L));
      arrayList_f.add(new Util138(4482717838187074994L));
      arrayList_f.add(new Util138(8374411327915876146L));
      arrayList_f.add(new Util138(2614011424575813385L));
      arrayList_f.add(new Util138(-7890435214406539341L));
      arrayList_f.add(new Util138(3234213471122794530L));
      arrayList_f.add(new Util138(-1921804350847210413L));
      arrayList_f.add(new Util138(-8728398895945828911L));
      arrayList_f.add(new Util138(3130504729997355106L));
      arrayList_f.add(new Util138(5504888350367583088L));
      arrayList_f.add(new Util138(5892458293847405065L));
      arrayList_f.add(new Util138(170438820795239066L));
      arrayList_f.add(new Util138(5016679113019000224L));
      arrayList_f.add(new Util138(6911486985159733848L));
      arrayList_f.add(new Util138(7057469083475245698L));
      arrayList_f.add(new Util138(9082396647041921610L));
      arrayList_f.add(new Util138(-3034341735102464718L));
      arrayList_f.add(new Util138(-8376949068791227879L));
      arrayList_f.add(new Util138(1298698434186158769L));
      arrayList_f.add(new Util138(8617869032946193081L));
      arrayList_f.add(new Util138(-4196764370769740271L));
      arrayList_f.add(new Util138(-1384084079216363976L));
      arrayList_f.add(new Util138(2170464158790283312L));
      arrayList_f.add(new Util138(-5757583142187955309L));
      arrayList_f.add(new Util138(2720723791772133130L));
      arrayList_f.add(new Util138(3264674415403265899L));
      arrayList_f.add(new Util138(-3428608264735193744L));
      arrayList_f.add(new Util138(-5764435905264714776L));
      arrayList_f.add(new Util138(2718701165925311209L));
      arrayList_f.add(new Util138(-5921999042124503717L));
      arrayList_f.add(new Util138(2112487952897769720L));
      arrayList_f.add(new Util138(80104147221813721L));
      arrayList_f.add(new Util138(-7002920423526654126L));
      arrayList_f.add(new Util138(8122043299830854857L));
      arrayList_f.add(new Util138(5830263035847413299L));
      arrayList_f.add(new Util138(5624305394878085224L));
      arrayList_f.add(new Util138(4673820278419105969L));
      arrayList_f.add(new Util138(5163445499722476929L));
      arrayList_f.add(new Util138(-6883010472591763374L));
      arrayList_f.add(new Util138(214301159073810272L));
      arrayList_f.add(new Util138(-2026071638730142094L));
      arrayList_f.add(new Util138(2157396469287205754L));
      arrayList_f.add(new Util138(-4448794768639244568L));
      arrayList_f.add(new Util138(7829116346877954722L));
      arrayList_f.add(new Util138(-3148452433967555486L));
      arrayList_f.add(new Util138(-4955033611118544046L));
      arrayList_f.add(new Util138(1326094430013743608L));
      arrayList_f.add(new Util138(-2219356275103368239L));
      arrayList_f.add(new Util138(-368847188101221247L));
      arrayList_f.add(new Util138(7990524171761018264L));
      arrayList_f.add(new Util138(-8594688375939727808L));
      arrayList_f.add(new Util138(6857174230342767968L));
      arrayList_f.add(new Util138(5784756765352254241L));
      arrayList_f.add(new Util138(-7432267204449724351L));
      arrayList_f.add(new Util138(694886222809220680L));
      arrayList_f.add(new Util138(-7104343220553757023L));
      arrayList_f.add(new Util138(1933524367250214458L));
      arrayList_f.add(new Util138(-5992616643317930949L));
      arrayList_f.add(new Util138(-7835697277685459342L));
      arrayList_f.add(new Util138(-4886827970408159416L));
      arrayList_f.add(new Util138(-2898118558665571702L));
      arrayList_f.add(new Util138(-1488491828566098303L));
      arrayList_f.add(new Util138(7001671899727965850L));
      arrayList_f.add(new Util138(6551538277721293313L));
      arrayList_f.add(new Util138(-3231575496617635470L));
      arrayList_f.add(new Util138(-611065344745062702L));
      arrayList_f.add(new Util138(3179436127496380307L));
      arrayList_f.add(new Util138(8756432908706247920L));
      arrayList_f.add(new Util138(7999794893250213290L));
      arrayList_f.add(new Util138(5524906819788034113L));
      arrayList_f.add(new Util138(3086976910242993619L));
      arrayList_f.add(new Util138(-350516162760554119L));
      arrayList_f.add(new Util138(482046724029683250L));
      arrayList_f.add(new Util138(8067555223460304554L));
      arrayList_f.add(new Util138(7763488550057239912L));
      arrayList_f.add(new Util138(-8758934822390139055L));
      arrayList_f.add(new Util138(-3229783315168145535L));
      arrayList_f.add(new Util138(8904296263858331640L));
      arrayList_f.add(new Util138(-3107593485836530736L));
      arrayList_f.add(new Util138(4213429989525868202L));
      arrayList_f.add(new Util138(-5677990332209245710L));
      arrayList_f.add(new Util138(4092294298770813208L));
      arrayList_f.add(new Util138(3200632964539785723L));
      arrayList_f.add(new Util138(-2176994398787734093L));
      arrayList_f.add(new Util138(-888698703394418781L));
      arrayList_f.add(new Util138(-6248354499326790558L));
      arrayList_f.add(new Util138(711767086001950290L));
      arrayList_f.add(new Util138(-4236054471307233648L));
      arrayList_f.add(new Util138(7673662459493700697L));
      arrayList_f.add(new Util138(9200286393889690923L));
      arrayList_f.add(new Util138(3260331549321117258L));
      arrayList_f.add(new Util138(1695397279329675642L));
      arrayList_f.add(new Util138(-5587502177569005757L));
      arrayList_f.add(new Util138(-4305158805085444013L));
      arrayList_f.add(new Util138(94403294826421616L));
      arrayList_f.add(new Util138(4167316149060539506L));
      arrayList_f.add(new Util138(281321087836621913L));
      arrayList_f.add(new Util138(4927456795979516267L));
      arrayList_f.add(new Util138(880865677087093393L));
      arrayList_f.add(new Util138(7361557975756894304L));
      arrayList_f.add(new Util138(-90081968707475094L));
      arrayList_f.add(new Util138(-7935881167535285605L));
      arrayList_f.add(new Util138(-4459897322929076406L));
      arrayList_f.add(new Util138(-8099491108999219813L));
      arrayList_f.add(new Util138(6569555657422637984L));
      arrayList_f.add(new Util138(4398286113758239794L));
      arrayList_f.add(new Util138(360629210770315594L));
      arrayList_f.add(new Util138(8561246176842078224L));
      arrayList_f.add(new Util138(3900740408761508032L));
      arrayList_f.add(new Util138(730341230670297481L));
      arrayList_f.add(new Util138(2235641702189000408L));
      arrayList_f.add(new Util138(3824381645935593113L));
      arrayList_f.add(new Util138(5556302103535710144L));
      arrayList_f.add(new Util138(1554693317994757218L));
      arrayList_f.add(new Util138(-4854624239629369520L));
      arrayList_f.add(new Util138(1188214921854869722L));
      arrayList_f.add(new Util138(-3088935561487456328L));
      arrayList_f.add(new Util138(-2842660849428427512L));
      arrayList_f.add(new Util138(337331224160570488L));
      arrayList_f.add(new Util138(5286713540678519913L));
      arrayList_f.add(new Util138(-487372886490976621L));
      arrayList_f.add(new Util138(2528933317656009832L));
      arrayList_f.add(new Util138(-276620114168200301L));
      arrayList_f.add(new Util138(-8647624589956958255L));
      arrayList_f.add(new Util138(-3602574976232838549L));
      arrayList_f.add(new Util138(-3808199851136014840L));
      arrayList_f.add(new Util138(2222197441801797656L));
      arrayList_f.add(new Util138(653380072065923976L));
      arrayList_f.add(new Util138(-6996700760633502024L));
      arrayList_f.add(new Util138(-6459319883334802824L));
      arrayList_f.add(new Util138(-264680478556621272L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(9015413333758911250L));
      arrayList_f.add(new Util138(8206435053936336728L));
      arrayList_f.add(new Util138(4585533623946562264L));
      arrayList_f.add(new Util138(1923386482930928937L));
      arrayList_f.add(new Util138(6364420142466116968L));
      arrayList_f.add(new Util138(-4152878261139357671L));
      arrayList_f.add(new Util138(-7533406522902068120L));
      arrayList_f.add(new Util138(581333210094023105L));
      arrayList_f.add(new Util138(6533371785460318443L));
      arrayList_f.add(new Util138(1517056463718360928L));
      arrayList_f.add(new Util138(8864049157903591891L));
      arrayList_f.add(new Util138(144966663420347523L));
      arrayList_f.add(new Util138(347693466790215747L));
      arrayList_f.add(new Util138(1509144949299778288L));
      arrayList_f.add(new Util138(4120370448850669712L));
      arrayList_f.add(new Util138(3163337829244429386L));
      arrayList_f.add(new Util138(-3608169194731410597L));
      arrayList_f.add(new Util138(-8620121722080111926L));
      arrayList_f.add(new Util138(-8137390010734800861L));
      arrayList_f.add(new Util138(895954978405835792L));
      arrayList_f.add(new Util138(-5904428133553579518L));
      arrayList_f.add(new Util138(1171061581109687298L));
      arrayList_f.add(new Util138(3489428627222122936L));
      arrayList_f.add(new Util138(-7644257255633063157L));
      arrayList_f.add(new Util138(-4077810539628891823L));
      arrayList_f.add(new Util138(-8136942491384864623L));
      arrayList_f.add(new Util138(-7622933259512888111L));
      arrayList_f.add(new Util138(8716061393226897003L));
      arrayList_f.add(new Util138(883614514398229698L));
      arrayList_f.add(new Util138(-7969330602297777541L));
      arrayList_f.add(new Util138(5055939876878676498L));
      arrayList_f.add(new Util138(2483926877328098176L));
      arrayList_f.add(new Util138(-50058541761889584L));
      arrayList_f.add(new Util138(2312213775566317595L));
      arrayList_f.add(new Util138(-3752122203805542934L));
      arrayList_f.add(new Util138(-3765952800377327503L));
      arrayList_f.add(new Util138(2156924643403864737L));
      arrayList_f.add(new Util138(5344097911369308267L));
      arrayList_f.add(new Util138(6490377181336607602L));
      arrayList_f.add(new Util138(1343644879516144978L));
      arrayList_f.add(new Util138(3816748431297533435L));
      arrayList_f.add(new Util138(-2490110617665575006L));
      arrayList_f.add(new Util138(293146418563303482L));
      arrayList_f.add(new Util138(7292482401100578154L));
      arrayList_f.add(new Util138(-3365828686372606141L));
      arrayList_f.add(new Util138(-7226650046002631128L));
      arrayList_f.add(new Util138(2181501599878650208L));
      arrayList_f.add(new Util138(17343264580660722L));
      arrayList_f.add(new Util138(5902333221962652947L));
      arrayList_f.add(new Util138(-9046454019360395349L));
      arrayList_f.add(new Util138(4836864014755662979L));
      arrayList_f.add(new Util138(8838724700976420546L));
      arrayList_f.add(new Util138(5236917069939037234L));
      arrayList_f.add(new Util138(407322990925843033L));
      arrayList_f.add(new Util138(7547671860426209938L));
      arrayList_f.add(new Util138(-3444829196386472589L));
      arrayList_f.add(new Util138(-8115150377668229517L));
      arrayList_f.add(new Util138(4473939678718212427L));
      arrayList_f.add(new Util138(4680066371723070640L));
      arrayList_f.add(new Util138(-7049774172107945709L));
      arrayList_f.add(new Util138(2194099820972371337L));
      arrayList_f.add(new Util138(-6952052167755425894L));
      arrayList_f.add(new Util138(-5215600525161745518L));
      arrayList_f.add(new Util138(-5938262926441004608L));
      arrayList_f.add(new Util138(-874700896438719072L));
      arrayList_f.add(new Util138(8169999383622105864L));
      arrayList_f.add(new Util138(8619423821325303776L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(-6294745148475512888L));
      arrayList_f.add(new Util138(7373294903161362440L));
      arrayList_f.add(new Util138(-810275149685006622L));
      arrayList_f.add(new Util138(8373904877183029555L));
      arrayList_f.add(new Util138(7712305944558115347L));
      arrayList_f.add(new Util138(4667843562894363058L));
      arrayList_f.add(new Util138(1960341925664964769L));
      arrayList_f.add(new Util138(-2764493695093668086L));
      arrayList_f.add(new Util138(-8453792609301714837L));
      arrayList_f.add(new Util138(-4179053546075927023L));
      arrayList_f.add(new Util138(6725384241108278171L));
      arrayList_f.add(new Util138(4484966645918825530L));
      arrayList_f.add(new Util138(-3832921597076362736L));
      arrayList_f.add(new Util138(-361534122656104501L));
      arrayList_f.add(new Util138(2618455193537869024L));
      arrayList_f.add(new Util138(-6360273996764979088L));
      arrayList_f.add(new Util138(-4632523344508750703L));
      arrayList_f.add(new Util138(-8064132242292602320L));
      arrayList_f.add(new Util138(-8854979910586301533L));
      arrayList_f.add(new Util138(6744133559988222448L));
      arrayList_f.add(new Util138(1703045302966112184L));
      arrayList_f.add(new Util138(-3169255615945008264L));
      arrayList_f.add(new Util138(-5913336781505863861L));
      arrayList_f.add(new Util138(-372333988931664318L));
      arrayList_f.add(new Util138(-3389413509392739832L));
      arrayList_f.add(new Util138(2965995404634968938L));
      arrayList_f.add(new Util138(1465667539513964890L));
      arrayList_f.add(new Util138(-5606865842236662790L));
      arrayList_f.add(new Util138(7551831115349677171L));
      arrayList_f.add(new Util138(7047374021013398162L));
      arrayList_f.add(new Util138(-8840071918665001976L));
      arrayList_f.add(new Util138(-4485943392215466935L));
      arrayList_f.add(new Util138(8265336380634269730L));
      arrayList_f.add(new Util138(4588027365268553969L));
      arrayList_f.add(new Util138(4579051271740751801L));
      arrayList_f.add(new Util138(7552589528956308819L));
      arrayList_f.add(new Util138(-3646355728637749511L));
      arrayList_f.add(new Util138(-642348129242412503L));
      arrayList_f.add(new Util138(-8262097927040844013L));
      arrayList_f.add(new Util138(-1339290742308358055L));
      arrayList_f.add(new Util138(-3848087981048974192L));
      arrayList_f.add(new Util138(-8814922377311174087L));
      arrayList_f.add(new Util138(427395137177599963L));
      arrayList_f.add(new Util138(1005934091221990363L));
      arrayList_f.add(new Util138(7105856961815736545L));
      arrayList_f.add(new Util138(5442115869184755795L));
      arrayList_f.add(new Util138(7146721805011873075L));
      arrayList_f.add(new Util138(2928613202292523401L));
      arrayList_f.add(new Util138(-680163378064734645L));
      arrayList_f.add(new Util138(7223145523390391362L));
      arrayList_f.add(new Util138(-121411314713776981L));
      arrayList_f.add(new Util138(4746841142870876097L));
      arrayList_f.add(new Util138(6071681561575876200L));
      arrayList_f.add(new Util138(65485962614527706L));
      arrayList_f.add(new Util138(23652629690601040L));
      arrayList_f.add(new Util138(3772220637384313859L));
      arrayList_f.add(new Util138(-2906620951226530183L));
      arrayList_f.add(new Util138(-1570657255672089448L));
      arrayList_f.add(new Util138(2991703983921155424L));
      arrayList_f.add(new Util138(725422341327675312L));
      arrayList_f.add(new Util138(7103535246992630529L));
      arrayList_f.add(new Util138(-3174328331487630766L));
      arrayList_f.add(new Util138(7075383078687427042L));
      arrayList_f.add(new Util138(5025951911472582602L));
      arrayList_f.add(new Util138(4175626438157890000L));
      arrayList_f.add(new Util138(8167829223319487905L));
      arrayList_f.add(new Util138(5938235160367635361L));
      arrayList_f.add(new Util138(-2866503591891165526L));
      arrayList_f.add(new Util138(5436870655663525475L));
      arrayList_f.add(new Util138(1994303258706923826L));
      arrayList_f.add(new Util138(374032950277668930L));
      arrayList_f.add(new Util138(-4960150644660668798L));
      arrayList_f.add(new Util138(-2992673376532747957L));
      arrayList_f.add(new Util138(1502304976580437736L));
      arrayList_f.add(new Util138(1389609576027668803L));
      arrayList_f.add(new Util138(-7152706699183832031L));
      arrayList_f.add(new Util138(4086770445048808658L));
      arrayList_f.add(new Util138(-2789217128062636472L));
      arrayList_f.add(new Util138(-4808817480608493448L));
      arrayList_f.add(new Util138(3842336861400549577L));
      arrayList_f.add(new Util138(-6868414488138817936L));
      arrayList_f.add(new Util138(-4937406668097867077L));
      arrayList_f.add(new Util138(2058136684571643218L));
      arrayList_f.add(new Util138(-5380366515742869055L));
      arrayList_f.add(new Util138(3198393969386232082L));
      arrayList_f.add(new Util138(4288467075290426634L));
      arrayList_f.add(new Util138(-2874238368245264720L));
      arrayList_f.add(new Util138(3200632861460570617L));
      arrayList_f.add(new Util138(-1781038500995246880L));
      arrayList_f.add(new Util138(-4418401663490172759L));
      arrayList_f.add(new Util138(-3877669752921416622L));
      arrayList_f.add(new Util138(-7014615919071384976L));
      arrayList_f.add(new Util138(-8591441227850243752L));
      arrayList_f.add(new Util138(4933355510260822345L));
      arrayList_f.add(new Util138(-3624105281324139733L));
      arrayList_f.add(new Util138(-4725521667183457575L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(-463105401160604862L));
      arrayList_f.add(new Util138(-8441878448713763375L));
      arrayList_f.add(new Util138(-6997755892071027376L));
      arrayList_f.add(new Util138(-102031339799533567L));
      arrayList_f.add(new Util138(368251021937155536L));
      arrayList_f.add(new Util138(-6059560350671419838L));
      arrayList_f.add(new Util138(-8044617524757166759L));
      arrayList_f.add(new Util138(491875070605614914L));
      arrayList_f.add(new Util138(-461657700620871525L));
      arrayList_f.add(new Util138(-5107984499233334925L));
      arrayList_f.add(new Util138(9153421122905199290L));
      arrayList_f.add(new Util138(8666690374265133370L));
      arrayList_f.add(new Util138(-1929140079365349616L));
      arrayList_f.add(new Util138(-7590666685161532367L));
      arrayList_f.add(new Util138(-7002902943009759400L));
      arrayList_f.add(new Util138(3551608502711553984L));
      arrayList_f.add(new Util138(3225053119080042337L));
      arrayList_f.add(new Util138(-1734897621270800661L));
      arrayList_f.add(new Util138(-3891731452087491456L));
      arrayList_f.add(new Util138(4574222927006728224L));
      arrayList_f.add(new Util138(7451230818366008873L));
      arrayList_f.add(new Util138(-813833214616899448L));
      arrayList_f.add(new Util138(-3563633391730183621L));
      arrayList_f.add(new Util138(-7778062236037941991L));
      arrayList_f.add(new Util138(287676731380651531L));
      arrayList_f.add(new Util138(-4335358563518060262L));
      arrayList_f.add(new Util138(7657745363597976867L));
      arrayList_f.add(new Util138(-3261776907202254928L));
      arrayList_f.add(new Util138(-6976410000153413495L));
      arrayList_f.add(new Util138(-5644013754638054174L));
      arrayList_f.add(new Util138(2867042020739811698L));
      arrayList_f.add(new Util138(-637172899933212118L));
      arrayList_f.add(new Util138(-4354845414390207429L));
      arrayList_f.add(new Util138(6054775001816371825L));
      arrayList_f.add(new Util138(116249488412847483L));
      arrayList_f.add(new Util138(1148148720130959265L));
      arrayList_f.add(new Util138(1705753101294476010L));
      arrayList_f.add(new Util138(-1325829845916629824L));
      arrayList_f.add(new Util138(4045389339923315104L));
      arrayList_f.add(new Util138(-3624611540183884000L));
      arrayList_f.add(new Util138(5509132055285384304L));
      arrayList_f.add(new Util138(-7980319563548039407L));
      arrayList_f.add(new Util138(7918558729698302824L));
      arrayList_f.add(new Util138(3402091564352254192L));
      arrayList_f.add(new Util138(4583568687262877792L));
      arrayList_f.add(new Util138(-6761459905115101288L));
      arrayList_f.add(new Util138(1945883324910897681L));
      arrayList_f.add(new Util138(-2618362347754583166L));
      arrayList_f.add(new Util138(585668315489455137L));
      arrayList_f.add(new Util138(1289516295623042707L));
      arrayList_f.add(new Util138(8766181498051025993L));
      arrayList_f.add(new Util138(1889600656552563099L));
      arrayList_f.add(new Util138(2166563278303551545L));
      arrayList_f.add(new Util138(5752948115911434283L));
      arrayList_f.add(new Util138(3344058109038245112L));
      arrayList_f.add(new Util138(5150128495396241024L));
      arrayList_f.add(new Util138(6178621834935356234L));
      arrayList_f.add(new Util138(-8630411130965508285L));
      arrayList_f.add(new Util138(-5310629739055974702L));
      arrayList_f.add(new Util138(4503037165875380514L));
      arrayList_f.add(new Util138(588192933247605489L));
      arrayList_f.add(new Util138(3404474722950686699L));
      arrayList_f.add(new Util138(3396555708315898697L));
      arrayList_f.add(new Util138(2918291153333023754L));
      arrayList_f.add(new Util138(8702887221003075730L));
      arrayList_f.add(new Util138(3346828072720560529L));
      arrayList_f.add(new Util138(-8482803008283793112L));
      arrayList_f.add(new Util138(-3285828140099470782L));
      arrayList_f.add(new Util138(-3746047786634901126L));
      arrayList_f.add(new Util138(-8923246454663156816L));
      arrayList_f.add(new Util138(3938843531855948272L));
      arrayList_f.add(new Util138(2102050106305692696L));
      arrayList_f.add(new Util138(-928443375569449023L));
      arrayList_f.add(new Util138(-573635242215070856L));
      arrayList_f.add(new Util138(-9075507654682311894L));
      arrayList_f.add(new Util138(3681128568505750992L));
      arrayList_f.add(new Util138(3591444752209469282L));
      arrayList_f.add(new Util138(-3434442886412306031L));
      arrayList_f.add(new Util138(5570829866887236147L));
      arrayList_f.add(new Util138(4525978260223390825L));
      arrayList_f.add(new Util138(4863871911056459977L));
      arrayList_f.add(new Util138(-1020482198059147886L));
      arrayList_f.add(new Util138(4311852579521870985L));
      arrayList_f.add(new Util138(7940947070483644738L));
      arrayList_f.add(new Util138(-2746836832215355096L));
      arrayList_f.add(new Util138(-6272617850095644429L));
      arrayList_f.add(new Util138(-940095000378558048L));
      arrayList_f.add(new Util138(7240051864727447986L));
      arrayList_f.add(new Util138(5067266671622069099L));
      arrayList_f.add(new Util138(7885163101463001267L));
      arrayList_f.add(new Util138(6496855408328349904L));
      arrayList_f.add(new Util138(-5366652254331744160L));
      arrayList_f.add(new Util138(8012939411748938089L));
      arrayList_f.add(new Util138(-751823609647277016L));
      arrayList_f.add(new Util138(-219593469472291576L));
      arrayList_f.add(new Util138(-6776512454566552358L));
      arrayList_f.add(new Util138(-1728247051644627917L));
      arrayList_f.add(new Util138(4208590994019692082L));
      arrayList_f.add(new Util138(8451591946931640856L));
      arrayList_f.add(new Util138(3248421401274892874L));
      arrayList_f.add(new Util138(3573285277119364529L));
      arrayList_f.add(new Util138(-8161881513970303863L));
      arrayList_f.add(new Util138(4895985285544960371L));
      arrayList_f.add(new Util138(3007041956620776992L));
      arrayList_f.add(new Util138(4308342432915324368L));
      arrayList_f.add(new Util138(-5450348565263885894L));
      arrayList_f.add(new Util138(7701268037182567762L));
      arrayList_f.add(new Util138(288223953591981024L));
      arrayList_f.add(new Util138(-7720443718348867823L));
      arrayList_f.add(new Util138(1013881675183052992L));
      arrayList_f.add(new Util138(6872562059551795648L));
      arrayList_f.add(new Util138(-1744468054008181711L));
      arrayList_f.add(new Util138(7553399466037826450L));
      arrayList_f.add(new Util138(8412405197839442106L));
      arrayList_f.add(new Util138(9000312823660824089L));
      arrayList_f.add(new Util138(-2608614616714912165L));
      arrayList_f.add(new Util138(8455189619954557251L));
      arrayList_f.add(new Util138(-6139491795462005191L));
      arrayList_f.add(new Util138(5353479211432702666L));
      arrayList_f.add(new Util138(-4151098641399562421L));
      arrayList_f.add(new Util138(-2211941555253337157L));
      arrayList_f.add(new Util138(7644106962533481529L));
      arrayList_f.add(new Util138(3965370685730944384L));
      arrayList_f.add(new Util138(7237029888916072563L));
      arrayList_f.add(new Util138(-5534831774023476584L));
      arrayList_f.add(new Util138(-7846445565270943911L));
      arrayList_f.add(new Util138(-2967400527687007798L));
      arrayList_f.add(new Util138(2910063741206062659L));
      arrayList_f.add(new Util138(6834530598711991968L));
      arrayList_f.add(new Util138(-3757879885931711838L));
      arrayList_f.add(new Util138(-6547152443873381367L));
      arrayList_f.add(new Util138(-2540729940390696599L));
      arrayList_f.add(new Util138(-1627899492692226703L));
      arrayList_f.add(new Util138(6262570331227619264L));
      arrayList_f.add(new Util138(-1540493331038824647L));
      arrayList_f.add(new Util138(-5792543282491265110L));
      arrayList_f.add(new Util138(-513785298954297686L));
      arrayList_f.add(new Util138(-8893796732015706479L));
      arrayList_f.add(new Util138(-2279864542329286295L));
      arrayList_f.add(new Util138(5448407157622909250L));
      arrayList_f.add(new Util138(-2659871908500999255L));
      arrayList_f.add(new Util138(7747042026865302706L));
      arrayList_f.add(new Util138(-1486508941527037430L));
      arrayList_f.add(new Util138(6812134838250216465L));
      arrayList_f.add(new Util138(8001079209139036360L));
      arrayList_f.add(new Util138(-5302742388006870422L));
      arrayList_f.add(new Util138(-3349401189877870032L));
      arrayList_f.add(new Util138(-5964415961592699767L));
      arrayList_f.add(new Util138(-8923792765371105791L));
      arrayList_f.add(new Util138(-3605199088366744949L));
      arrayList_f.add(new Util138(5708439751212711841L));
      arrayList_f.add(new Util138(8185273422780852241L));
      arrayList_f.add(new Util138(-3167129374174794726L));
      arrayList_f.add(new Util138(6315520115345048370L));
      arrayList_f.add(new Util138(-8768984617931226039L));
      arrayList_f.add(new Util138(-559360747120692807L));
      arrayList_f.add(new Util138(-5547426062881792L));
      arrayList_f.add(new Util138(-684472053756756712L));
      arrayList_f.add(new Util138(8682751221404683008L));
      arrayList_f.add(new Util138(-6021434635981907423L));
      arrayList_f.add(new Util138(-6423743280404882589L));
      arr_e = (int[])arr_e.clone();
      arrayList_f.add(new Util138(-5745181564639956296L));
      arrayList_f.add(new Util138(-1407199497389757936L));
      arrayList_f.add(new Util138(1421244197508451826L));
      arrayList_f.add(new Util138(975524016088590305L));
      arrayList_f.add(new Util138(2774681646235971562L));
      arrayList_f.add(new Util138(-1729886526504265024L));
      arrayList_f.add(new Util138(-3757289178473419061L));
      arrayList_f.add(new Util138(-2733625343052810448L));
      arrayList_f.add(new Util138(-8784228614681807718L));
      arrayList_f.add(new Util138(-3420889724133327655L));
      arrayList_f.add(new Util138(4199993296712673490L));
      arrayList_f.add(new Util138(-6852683941856956999L));
      arrayList_f.add(new Util138(3981620773035499009L));
      arr_e = new int[]{
         -30,
         -62,
         -48,
         -4,
         -6,
         -29,
         -22,
         4,
         -19,
         -23,
         6,
         -35,
         -5,
         -44,
         -9,
         -16,
         -5,
         5,
         -15,
         -3,
         -29,
         5,
         3,
         9,
         -16,
         -31,
         -17,
         19,
         22,
         -32,
         30,
         16,
         23,
         15,
         29,
         -27,
         -19,
         -11,
         -16,
         -14,
         16,
         -4,
         -9,
         17,
         -14,
         4,
         35,
         -13,
         11,
         29,
         48,
         9,
         -7,
         14,
         16,
         19,
         31,
         44,
         14,
         7,
         13,
         32,
         27,
         62
      };
   }
}
