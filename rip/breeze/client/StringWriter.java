package rip.breeze.client;

import java.io.IOException;
import java.io.Writer;

final class StringWriter extends Writer {
   private final Appendable appendable_a;
   private final b3 b3_b = new b3();

   StringWriter(Appendable var1) {
      this.appendable_a = var1;
   }

   @Override
   public void write(char[] var1, int var2, int var3) throws IOException {
      this.b3_b.a = var1;
      this.appendable_a.append(this.b3_b, var2, var2 + var3);
   }

   @Override
   public void write(int var1) throws IOException {
      this.appendable_a.append((char)var1);
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }
}
