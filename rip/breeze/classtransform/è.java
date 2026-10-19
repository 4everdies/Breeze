package rip.breeze.classtransform;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface è {
   ý value();

   þ invoke_1() default þ.REPLACE;

   boolean check_2() default false;

   Class<? extends ç> invoke_3() default å.class;
}
