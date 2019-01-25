package ProxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhaoyimeng on 15/12/10.
 * 动态代理示例
 */
public class UserWorkHandler implements InvocationHandler {

    Object object;

    public UserWorkHandler() {
        System.out.println("construct()");
    }

    public UserWorkHandler(Object object) {
        this();
        this.object = object;
        System.out.println("construct( Object )");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        doBefore();
        Object res = method.invoke(object, args);
        doAfter();
        return res;
    }

    public void doBefore(){
        System.out.println("do something before....");
    }

    public void doAfter(){
        System.out.println("do something before....");
    }

    /**
     * 动态代理工厂
     * @param object
     * @return
     */
    public static Object factory(Object object){

        Class clazz = object.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new UserWorkHandler(object));
    }
}
