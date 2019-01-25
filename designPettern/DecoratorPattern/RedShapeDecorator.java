package DecoratorPattern;

/**
 * Created by zhaoyimeng on 2016/12/23.
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(IShape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
