package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class ChickenBurger extends BurgerItemImp{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
