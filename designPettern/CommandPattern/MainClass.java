package CommandPattern;

/**
 * Created by zhaoyimeng on 2016/12/27.
 * 命令模式（Command Pattern）
 * 是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 *
 * 参考: http://www.runoob.com/design-pattern/command-pattern.html
 */
public class MainClass {


    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStockOrderImp buyStockOrderImp = new BuyStockOrderImp(stock);
        SellStockOrderImp sellStockOrderImp = new SellStockOrderImp(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrderImp);
        broker.takeOrder(sellStockOrderImp);

        broker.placeOrder();
    }
}
