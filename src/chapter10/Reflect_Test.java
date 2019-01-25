package chapter10;

/**
 * Created by zhaoyimeng on 15/12/1.
 */
public class Reflect_Test {

    public static void test(int... a){
        for (int i:a){
            System.out.println("test(int... a) : param.length = " + a.length + " : " + i);
        }
        if (a.length==0){
            System.out.println("test(int... a) : param.length = " + a.length);
        }
    }

    public static void test(int a){
        System.out.println("test(int a) : " + a);
    }

    public static void test(int a, String... str){
        for (String st:str) {
            System.out.println("test(int a, String... str) : a = " + a + " str = " + st );
        }
    }

    public static void test1(){

        /**
         *  会执行A的静态语句块
         */
        System.out.println("------------------>Class.forName()");
        try {
            Class c = Class.forName("chapter10.A");
            System.out.println("Class = " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     *  不会执行A的静态语句块
     */
    public static void test2(){
        System.out.println("------------------>Class.class");
        Class c = A.class;
        System.out.println("Class = " + c);
    }

    public static void test3(){
        Class c = A.class;
        try {
            /**
             *  调用newInstance()一定要求有无参构造方法
             */
            Object o1 = c.newInstance();//调用了A类的无参数构造函数
            if (o1 instanceof A){
                System.out.println("I'm  class A");
                System.out.println("Class = " + o1.getClass());
            }
            System.out.println("------------------>Object.getClass()");
            Object o2 = new A();
            System.out.println("Class = " + o2.getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class A{

    static {
        System.out.println("static initial");
    }

    public A() {
    }

    {
        System.out.println("none static initial");
    }
}

