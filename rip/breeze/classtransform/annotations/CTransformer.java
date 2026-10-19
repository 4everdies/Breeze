package rip.breeze.classtransform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rip.breeze.classtransform.è;
import rip.breeze.classtransform.ý;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface CTransformer {
   Class<?>[] value() default {};

   @è(ý.CLASS)
   String[] name() default {};

   boolean optional() default false;

   Mapping[] mapping() default {Mapping.NONE};
}
