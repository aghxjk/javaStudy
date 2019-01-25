package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/27.
 */
public class Broker {

    private List<IOrder> orderList = new ArrayList<IOrder>();

    public void takeOrder(IOrder order){
        orderList.add(order);
    }

    public void placeOrder(){
        for (IOrder order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
