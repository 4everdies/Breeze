package rip.breeze.client;

import java.util.Set;
import java.util.Map.Entry;
import rip.breeze.StringDecryptor;

public final class UserTheme extends PlayerUtil8 {
   private final ConfigMap<String, PlayerUtil8> colorMap = new ConfigMap<>();
   private static int[] arr_c;

   public void processNullable(String var1, long var2, PlayerUtil8 var4) {
      var2 = 132449824954779L ^ var2;
      if (var4 == null) {
         var4 = Util40.CONST_A;
      }

      this.colorMap.put(var1, var4);
   }

   public void update(String var1, String var2, long var3) {
      var3 = 132449824954779L ^ var3;
      long var10001 = var3 ^ 115309878470355L;
      int var5 = (int)((var3 ^ 115309878470355L) >>> 48);
      int var6 = (int)((var3 ^ 115309878470355L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 73654372202699L;
      this.processNullable(var1, var8, this.getDataBuilder2(var2, (char)var5, var6, var7));
   }

   public void runCloudJob(long var1, String var3, Number var4) {
      var1 = 132449824954779L ^ var1;
      long var10001 = var1 ^ 137428412848132L;
      int var5 = (int)((var1 ^ 137428412848132L) >>> 48);
      int var6 = (int)((var1 ^ 137428412848132L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 95515128776220L;
      this.processNullable(var3, var8, this.getDataBuilder2(var4, (char)var5, var6, var7));
   }

   public void update_1(String var1, Boolean var2, long var3) {
      var3 = 132449824954779L ^ var3;
      long var10001 = var3 ^ 74828425347357L;
      int var5 = (int)((var3 ^ 74828425347357L) >>> 48);
      int var6 = (int)((var3 ^ 74828425347357L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 121139743350533L;
      this.processNullable(var1, var8, this.getDataBuilder2(var2, (char)var5, var6, var7));
   }

   private PlayerUtil8 getDataBuilder2(Object var1, char var2, int var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ 132449824954779L;
      int var7 = (int)((var5 ^ 22416005859114L) >>> 32);
      int var8 = (int)((var5 ^ 22416005859114L) << 32 >>> 32);
      return var1 == null ? Util40.CONST_A : new Util138(var1, var7, var8);
   }

   public Set<Entry<String, PlayerUtil8>> getColors() {
      return this.colorMap.entrySet();
   }

   public boolean isValid(String var1) {
      return this.colorMap.containsKey(var1);
   }

   public PlayerUtil8 getDataBuilder2_2(String var1) {
      return this.colorMap.get(var1);
   }

   public BreezeIterable getBreezeIterable(String var1) {
      return (BreezeIterable)this.colorMap.get(var1);
   }

   public UserTheme getUserTheme(String var1) {
      return (UserTheme)this.colorMap.get(var1);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 50967143472832L;
      return var1 == this || var1 instanceof UserTheme && ((UserTheme)var1).colorMap.equals(this.colorMap);
   }

   @Override
   public int hashCode() {
      return this.colorMap.hashCode();
   }

   public static void initialize(int[] var0) {
      arr_c = var0;
   }

   public static int[] values() {
      return arr_c;
   }

   static {
      if (values() == null) {
         initialize(new int[4]);
      }
   }
}
