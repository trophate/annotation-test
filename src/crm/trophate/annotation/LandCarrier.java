package crm.trophate.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Carrier(type = "land")
public @interface LandCarrier {

    String name() default "";
}
