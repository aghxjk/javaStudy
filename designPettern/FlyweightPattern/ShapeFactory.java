package FlyweightPattern;


import java.util.HashMap;

/**
 * Created by zhaoyimeng on 2016/12/26.
 */
public class ShapeFactory {
    private static final HashMap<String, IShape> circleMap = new HashMap<String, IShape>();

    public static IShape getCircle(String color){
        CircleShapeImp circle = (CircleShapeImp) circleMap.get(color);

        if (circle == null) {
            circle = new CircleShapeImp(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
