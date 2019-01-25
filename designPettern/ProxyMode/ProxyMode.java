package ProxyMode;

/**
 * Created by zhaoyimeng on 15/12/10.
 */
public class ProxyMode {
    public static void main(String[] args) {

        /**
         * 1 创建一个UserWorkImp实例
         */
        UserWorkService userWorkService = new UserWorkImp();

        /**
         * 2 将实例交给代理
         */
        UserWorkService userWorkProxy = (UserWorkService) UserWorkHandler.factory(userWorkService);

        /**
         * 3 代理调用接口方法
         */
        userWorkProxy.work();

    }
}
