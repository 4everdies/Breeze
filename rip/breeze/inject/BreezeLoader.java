package rip.breeze.inject;

import java.io.InputStream;
import java.net.URL;

@rip.breeze.ý
public class BreezeLoader extends ClassLoader {
   public BreezeLoader(ClassLoader var1) {
      super(var1);
   }

   @Override
   public native Class<?> findClass(String var1) throws ClassNotFoundException;

   @Override
   public native InputStream getResourceAsStream(String var1);

   @Override
   public native URL findResource(String var1);
}
