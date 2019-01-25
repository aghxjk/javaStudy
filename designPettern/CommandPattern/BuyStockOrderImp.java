package CommandPattern;

/**
 * Created by zhaoyimeng on 2016/12/27.
 */
public class BuyStockOrderImp implements IOrder{

    private Stock abcStock;

    public BuyStockOrderImp(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
