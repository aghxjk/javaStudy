package CommandPattern;

/**
 * Created by zhaoyimeng on 2016/12/27.
 */
public class SellStockOrderImp implements IOrder{

    private Stock abcStock;

    public SellStockOrderImp(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
