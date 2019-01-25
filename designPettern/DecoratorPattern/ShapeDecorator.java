package DecoratorPattern;

/**
 * Created by zhaoyimeng on 2016/12/23.
 */
public abstract class ShapeDecorator implements IShape {
    protected IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
