package chapter03;

/**
 * Created by zhaoyimeng on 15/11/10.
 */
public class SubClass extends SuperClass {

    public SubClass(){}

    public SubClass(String actNo, double balance){
        super(actNo, balance);
    }

    public void m3(){
        System.out.println("m3........");
    }
}
