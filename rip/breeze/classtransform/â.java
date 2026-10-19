package rip.breeze.classtransform;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;

public interface â extends ç {
   List invoke_1(Object[] var1);

   default CTarget$Shift invoke_2(Object[] var1) {
      CTarget var2 = (CTarget)var1[0];
      return var2.shift();
   }

   @Override
   default ý invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      ò var4 = (ò)var1[1];
      Class var5 = (Class)var1[2];
      Map var6 = (Map)var1[3];
      Method var7 = (Method)var1[4];
      ó var8 = (ó)var1[5];
      rip.breeze.inject.é var9 = (rip.breeze.inject.é)var1[6];
      rip.breeze.inject.é var10 = (rip.breeze.inject.é)var1[7];
      return ý.MEMBER;
   }
}
