package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public abstract class BurgerItemImp implements ItemInterface{
    @Override
    public PackingInterface packing() {
        return new WrapperPackingImp();
    }
}
