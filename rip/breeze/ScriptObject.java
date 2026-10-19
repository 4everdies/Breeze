package rip.breeze;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ScriptObject {
   String name();

   String group();

   String superName() default "";

   String description() default "";

   String example() default "";

   String remarks() default "";
}
