package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class CokeDrink extends DrinkItemImp{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
