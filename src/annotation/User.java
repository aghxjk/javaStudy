package annotation;

import java.lang.annotation.*;

/**
 * Created by zhaoyimeng on 2018/7/4.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface User {
    String name() default "张三";
}
