package rip.breeze.classtransform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rip.breeze.classtransform.è;
import rip.breeze.classtransform.ý;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface CShadow {
   @è(ý.SHORT_MEMBER)
   String value() default "";

   boolean makePublic() default false;
}
