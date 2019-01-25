package annotation;

import java.lang.reflect.Method;

/**
 * Created by zhaoyimeng on 2016/12/15.
 */
public class AnnotationTest {

    public enum MyType{
        CTRIP, CTRIP_INTER
    }
    public static void main(String agrs[]) throws Exception {

        Object c = Class.forName("annotation.Student").newInstance();
        try {
            Method[] methodArray = c.getClass().getDeclaredMethods();
            for (int i = 0; i < methodArray.length; i++) {
                if (methodArray[i].isAnnotationPresent(MethodValueBind.class)) {
                    MethodValueBind annotation = methodArray[i].getAnnotation(MethodValueBind.class);
                    String type = String.valueOf(annotation.type());
                    String value = annotation.value();
                    if (type.equals("INT")) {
                        methodArray[i].invoke(c, new Integer[] { new Integer(
                                value) });
                    } else {
                        methodArray[i].invoke(c, new String[] { value });
                    }
                }
            }
            Student annotaedStudent = (Student) c;
            System.out.println("student Name = " + annotaedStudent.getName());
            System.out.println("student Age  = " + annotaedStudent.getAge());
            System.out.print("" + MyType.CTRIP + " and " + MyType.CTRIP_INTER);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
