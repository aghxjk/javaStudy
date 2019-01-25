package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class VegBurger extends BurgerItemImp{
    @Override
    public String name() {
        return "Veg Burge";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
