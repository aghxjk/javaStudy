package DecoratorPattern;

/**
 * Created by zhaoyimeng on 2016/12/23.
 */
public class RectangleShapeImp implements IShape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle.");
    }
}
