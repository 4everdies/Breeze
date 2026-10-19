package rip.breeze.classtransform;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.inject.BreezeClass12;

public class ß implements â {
   @Override
   public List invoke_1(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      return Collections.singletonList(var3.թ_ê.method_002(new Object[0]));
   }

   @Override
   public CTarget$Shift invoke_2(Object[] var1) {
      CTarget var2 = (CTarget)var1[0];
      return CTarget$Shift.BEFORE;
   }
}
