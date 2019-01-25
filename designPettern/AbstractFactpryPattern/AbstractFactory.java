package AbstractFactpryPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public abstract class AbstractFactory {
    abstract IColor getColor(String color);
    abstract IShape getShape(String shape);
}
