package annotation;

import java.lang.annotation.*;

/**
 * Created by zhaoyimeng on 2016/12/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodValueBind {

    enum fieldType{
        INT, STRING
    }

    fieldType type();
    String    value();
}
