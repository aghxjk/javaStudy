package AbstractFactpryPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
            return null;
    }

    @Override
    public IShape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleShapeImp();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleShapeImp();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareShapeImp();
        }
        return null;
    }
}
