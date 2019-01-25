package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class PepsiDrink extends DrinkItemImp{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
