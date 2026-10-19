package rip.breeze.classtransform.annotations.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rip.breeze.classtransform.è;
import rip.breeze.classtransform.ý;
import rip.breeze.classtransform.annotations.Mapping;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface COverride {
   @è(value = ý.SHORT_MEMBER, þ = true)
   String[] value() default {};

   Mapping[] mapping() default {Mapping.NONE};
}
