package annotation;

import java.lang.annotation.Annotation;

/**
 * Created by zhaoyimeng on 2018/7/4.
 */
public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException{

        Class<?> classTest = Class.forName("annotation.Test");

        Annotation[] annotations = classTest.getAnnotations();
        for (Annotation ann:annotations){
            User user = (User) ann;
            System.out.println(user.name());
        }
    }
}
