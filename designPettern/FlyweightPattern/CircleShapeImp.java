package FlyweightPattern;

/**
 * Created by zhaoyimeng on 2016/12/26.
 */
public class CircleShapeImp implements IShape{

    private String color;
    private int x;
    private int y;
    private int radius;

    public CircleShapeImp(String color) {
        this.color = color;
    }


    @Override
    public void draw() {
        System.out.println("Circle : Draw() [Color :" + color
        + ", x : " + x
        + ", y : " + y
        + "radius : " + radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
