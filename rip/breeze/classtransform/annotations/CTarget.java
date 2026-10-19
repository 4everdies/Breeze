package rip.breeze.classtransform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rip.breeze.classtransform.æ;
import rip.breeze.classtransform.è;
import rip.breeze.classtransform.ý;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER)
public @interface CTarget {
   String value();

   @è(value = ý.DYNAMIC, ý = æ.class)
   String target() default "";

   CTarget$Shift shift() default CTarget$Shift.AFTER;

   int ordinal() default -1;

   boolean optional() default false;
}
