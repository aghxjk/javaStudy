package FacadePattern;

/**
 * Created by zhaoyimeng on 2016/12/23.
 */
public class ShapeMaker {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMaker(){
        circle = new CircleShapeImp();
        rectangle = new RectangleShapeImp();
        square = new SquareIShapeImp();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
