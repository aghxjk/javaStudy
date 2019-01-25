package FactoryPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class ShapeFactory {

    public IShape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleImp();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleImp();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareImp();
        }
        return null;
    }
}
