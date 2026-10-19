package rip.breeze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class FileUtil3 extends ImageUtil15 {
   private final File file_A;
   private final File file_B;
   private byte[] arr_C;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public FileUtil3(File var1, String var2, String var3) {
      long var4 = 99553143044489L;
      super(var2, var3);
      this.file_A = var1;
      this.file_B = new File(
         var1.getParentFile(),
         var1.getName().replaceFirst("[.][^.]+$", "") + ".config.json"
      );
      this.arr_C = this.update();
   }

   public void processNullable() {
      long var1 = 22069709772558L;

      try {
         this.o = HttpUtil2.buildString_2(this.file_A);
         if (this.o == null) {
            throw new RuntimeException("Failed to read file" + this.file_A.getName());
         }
      } catch (RuntimeException var3) {
         throw getThrowable(var3);
      }

      this.arr_C = this.update();
      super.update();
   }

   public File getFile_A() {
      return this.file_A;
   }

   @Override
   public boolean isValid() {
      return this.file_A.exists();
   }

   public byte[] update() {
      long var1 = 96963168579591L;

      try {
         if (!this.file_A.exists()) {
            throw new RuntimeException("File does not exist");
         }
      } catch (Throwable var27) {
         throw getThrowable(var27);
      }

      try {
         FileInputStream var3 = new FileInputStream(this.file_A);
         Throwable var4 = null;

         try {
            MessageDigest var5 = MessageDigest.getInstance("MD5");
            byte[] var6 = new byte[8192];

            while (true) {
               int var7;
               int var10000 = var7 = var3.read(var6);

               try {
                  if (var10000 == -1) {
                     return var5.digest();
                  }

                  var5.update(var6, 0, var7);
               } catch (Throwable var23) {
                  throw getThrowable(var23);
               }
            }
         } catch (Throwable var24) {
            var4 = var24;
            throw var24;
         } finally {
            label104: {
               label103: {
                  try {
                     if (var3 == null) {
                        break label104;
                     }

                     if (var4 == null) {
                        break label103;
                     }
                  } catch (Throwable var22) {
                     throw getThrowable(var22);
                  }

                  try {
                     var3.close();
                  } catch (Throwable var21) {
                     var4.addSuppressed(var21);
                  }
                  break label104;
               }

               var3.close();
            }
         }
      } catch (Exception var26) {
         throw new RuntimeException("Failed to calculate MD5", var26);
      }
   }

   public UserTheme getUserTheme() {
      long var1 = 20776952919899L;
      long var3 = var1 ^ 10617240909623L;
      long var5 = var1 ^ 47174939672682L;

      try {
         if (!this.file_B.exists()) {
            return new UserTheme();
         }
      } catch (Throwable var26) {
         throw getThrowable(var26);
      }

      try {
         FileInputStream var7 = new FileInputStream(this.file_B);
         Throwable var8 = null;

         try {
            return new rip.breeze.client.Util139().getDataBuilder2_2(new InputStreamReader(var7), var3).getUserTheme(var5);
         } catch (Throwable var22) {
            var8 = var22;
            throw var22;
         } finally {
            label90: {
               label89: {
                  try {
                     if (var7 == null) {
                        break label90;
                     }

                     if (var8 == null) {
                        break label89;
                     }
                  } catch (Throwable var23) {
                     throw getThrowable(var23);
                  }

                  try {
                     var7.close();
                  } catch (Throwable var21) {
                     var8.addSuppressed(var21);
                  }
                  break label90;
               }

               var7.close();
            }
         }
      } catch (Exception var25) {
         return new UserTheme();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void processAll(UserTheme var1) {
      long var2 = 102513517964191L;
      int var4 = (int)((var2 ^ 62120292051538L) >>> 48);
      long var5 = (var2 ^ 62120292051538L) << 16 >>> 16;
      long var10001 = var2 ^ 108685627934895L;
      int var7 = (int)((var2 ^ 108685627934895L) >>> 48);
      int var8 = (int)((var2 ^ 108685627934895L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);

      try {
         FileWriter var10 = new FileWriter(this.file_B);
         Throwable var11 = null;
         boolean var21 = false /* VF: Semaphore variable */;

         try {
            var21 = true;
            new rip.breeze.client.MathUtil3().isActive().getDataBuilder5((char)var4, var5).processAll_2(var1, (char)var7, var8, var10, (short)var9);
            var21 = false;
         } catch (Throwable var24) {
            var11 = var24;
            throw var24;
         } finally {
            if (var21) {
               label74: {
                  label73: {
                     try {
                        if (var10 == null) {
                           break label74;
                        }

                        if (var11 == null) {
                           break label73;
                        }
                     } catch (Throwable var25) {
                        throw getThrowable(var25);
                     }

                     try {
                        var10.close();
                     } catch (Throwable var22) {
                        var11.addSuppressed(var22);
                     }
                     break label74;
                  }

                  var10.close();
               }
            }
         }

         if (var10 != null) {
            if (var11 != null) {
               try {
                  var10.close();
               } catch (Throwable var23) {
                  var11.addSuppressed(var23);
               }
            } else {
               var10.close();
            }
         }
      } catch (Exception var27) {
         throw new RuntimeException("Failed to save config", var27);
      }
   }

   static {
      long var0 = 105602060497510L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "\u008dOf\u009f¶7\u0002d\u008e!)\u009e\u001bßî\u009e(á\u0086¦L4.rÍ\u0083ÎYÿØ~D:3ÁË\u001e\u0099é¨,\u0007É\u009aã¬y8(\\.\u0091x\u0096ì\u0017Î\u0018\u0016\u0096±Â\u0016¨\nHCòLy\fh\u008d*û\u0096÷\u00027N/ý(6aÞ[\u0094]0Xßp\u0001õâ-áË1ãËN\u008fAq\n×½\u0011!x_¯êG\u0099&eW\\Þt(}HÅ\u0094KÏ\tRÕ#fÓ$nHz]^ÁKÿèm\u001dè\u000f\f\u0080è\u0016«I\u0098Æ8\u009dÿç\u0010ß";
      int var7 = "\u008dOf\u009f¶7\u0002d\u008e!)\u009e\u001bßî\u009e(á\u0086¦L4.rÍ\u0083ÎYÿØ~D:3ÁË\u001e\u0099é¨,\u0007É\u009aã¬y8(\\.\u0091x\u0096ì\u0017Î\u0018\u0016\u0096±Â\u0016¨\nHCòLy\fh\u008d*û\u0096÷\u00027N/ý(6aÞ[\u0094]0Xßp\u0001õâ-áË1ãËN\u008fAq\n×½\u0011!x_¯êG\u0099&eW\\Þt(}HÅ\u0094KÏ\tRÕ#fÓ$nHz]^ÁKÿèm\u001dè\u000f\f\u0080è\u0016«I\u0098Æ8\u009dÿç\u0010ß"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_M = var4;
                     CONST_N = new String[7];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Tì'[³£`\u009b\u0097\"\u0091\u0005í\u0000ÕX\".\u0015\u0016©:\u000f\u008f\u0089E£\u008c\u0010)´i éÛ\u0016Òæ_õÃ¦|y\u007f\b¼ÉcÄË\u0012Ëôo/|â9zL\f\u001bj.";
                  var7 = "Tì'[³£`\u009b\u0097\"\u0091\u0005í\u0000ÕX\".\u0015\u0016©:\u000f\u008f\u0089E£\u008c\u0010)´i éÛ\u0016Òæ_õÃ¦|y\u007f\b¼ÉcÄË\u0012Ëôo/|â9zL\f\u001bj."
                     .length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31806;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_O.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aP", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/aP" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
