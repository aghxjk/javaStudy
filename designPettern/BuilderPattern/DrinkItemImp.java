package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public abstract class DrinkItemImp implements ItemInterface{
    @Override
    public PackingInterface packing() {
        return new BottlePackingImp();
    }
}
