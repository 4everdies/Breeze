package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ConfigUtil2 extends ConfigUtil2_x {
   private final PreTickEvent dataBuilder29_l;
   private final MathUtil8 dataBuilder33_m = new MathUtil8(this::toggle);
   private final StringDecryptHelper6 stringDecryptHelper6_n;
   private int fieldInt_o = 0;
   private boolean fieldBool_p = false;
   private static final String CONST_R;

   public ConfigUtil2(StringDecryptHelper6 var1) {
      this.stringDecryptHelper6_n = var1;
      this.stringDecryptHelper6_n.setConsumer_i(this::update);
      this.dataBuilder29_l = new PreTickEvent(this);
      this.b(this.dataBuilder29_l);
      this.dataBuilder33_m.toggle_3(true);
      this.b(this.dataBuilder33_m);
   }

   @Override
   public boolean isValid() {
      return true;
   }

   public void processAll() {
      this.processAll();
   }

   public void processAll() {
      long var1 = 58813538110142L;
      this.dataBuilder33_m.initialize_3();
      this.dataBuilder33_m.toggle_4();
      boolean var3 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.CONFIG);
      boolean var4 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.THEME);
      boolean var5 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.SCRIPT);
      boolean var6 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.PROFILE);
      if (this.dataBuilder29_l.getEnum6Val() == RotationUtil1_x.SAVED || this.dataBuilder29_l.getEnum6Val() == RotationUtil1_x.PERSONAL) {
         this.stringDecryptHelper6_n.clamp_8("");
      }

      this.fieldBool_p = true;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs10(
         this.stringDecryptHelper6_n.getString_j(),
         this.dataBuilder29_l.getEnum6Val(),
         0,
         var3,
         var4,
         var6,
         var5,
         this::initialize,
         this::initialize_2,
         this::initialize_3
      );
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(771888216733179865L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var9 = var10000;
      Method var8 = var10003;

      try {
         var8.invoke(var9, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   private void toggle(int var1) {
      long var2 = 89762406054225L;
      boolean var4 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.CONFIG);
      boolean var5 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.THEME);
      boolean var6 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.SCRIPT);
      boolean var7 = this.dataBuilder29_l.getArrayList().contains(RenderUtil19_x.PROFILE);
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs10(
         this.stringDecryptHelper6_n.getString_j(),
         this.dataBuilder29_l.getEnum6Val(),
         this.fieldInt_o,
         var4,
         var5,
         var7,
         var6,
         this::update_1,
         this::initialize_2,
         this::initialize_3
      );
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-5090992958058042314L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var10 = var10000;
      Method var9 = var10003;

      try {
         var9.invoke(var10, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      this.fieldBool_p = false;
   }

   private void update(String var1) {
      this.dataBuilder29_l.initialize(RotationUtil1_x.POPULAR);
      this.processAll();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable_2();
   }

   private void initialize(ArrayList<UIPanel> var1, int var2) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$reloadCallback_Inner0);
   }

   private void initialize_2(ConfigUtil2_x var1) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$shareCodeCallback_Inner1);
   }

   private void update_1(ArrayList<UIPanel> var1, int var2) {
      long var3 = 18454627948979L;
      if (!this.fieldBool_p) {
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$loadMoreCallback_Inner2);
      }
   }

   private void initialize_3(String var1) {
      long var2 = 126813755204904L;
      BreezeContext.guiPanelSettings_f.processAll(CONST_R, var1);
   }

   public void calculate() {
      super.g();
      this.dataBuilder29_l.a(this.a + 10.0F, this.b, this.c - 20.0F, RenderUtil15_x.fieldInt_j);
      this.dataBuilder33_m.a(this.a, this.dataBuilder29_l.b + this.dataBuilder29_l.d, this.c, this.d - this.dataBuilder29_l.d - 10.0F);
   }

   @Override
   public boolean isValid_2(UIPanel var1) {
      return true;
   }

   private void lambda$loadMoreCallback_Inner2(ArrayList var1, int var2) {
      long var3 = 21721874194728L;
      this.dataBuilder33_m.update(var1);
      this.dataBuilder33_m.fieldBool_j = this.dataBuilder33_m.getValue() < var2;
      this.fieldInt_o = this.fieldInt_o + var1.size();
   }

   private void lambda$shareCodeCallback_Inner1(ConfigUtil2_x var1) {
      this.stringDecryptHelper6_n.clamp_8("");
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(var1);
      this.processAll();
   }

   private void lambda$reloadCallback_Inner0(ArrayList var1, int var2) {
      long var3 = 9358683319501L;
      this.dataBuilder33_m.fieldBool_j = var1.size() < var2;
      this.dataBuilder33_m.update_1(var1);
      this.fieldInt_o = var1.toArray().length;
   }

   static {
      long var0 = 118349664919754L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("_k\\ÌÚ{|I\u0098VQ0pl:s\u0099²MéÑb\u009bð".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_R = var5;
   }

   private static String buildString(byte[] var0) {
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
}
