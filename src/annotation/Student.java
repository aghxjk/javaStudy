package annotation;

/**
 * Created by zhaoyimeng on 2016/12/15.
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @MethodValueBind(type = MethodValueBind.fieldType.STRING, value = "abc")
    public void setName(String name) {
        this.name = name;
    }

    @MethodValueBind(type = MethodValueBind.fieldType.INT, value = "30")
    public void setAge(int age) {
        this.age = age;
    }
}
