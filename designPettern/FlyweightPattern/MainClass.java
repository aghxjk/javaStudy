package FlyweightPattern;

import java.util.Random;

/**
 * Created by zhaoyimeng on 2016/12/26.
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * 我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。
 * 由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。
 *
 * 参考: http://www.runoob.com/design-pattern/flyweight-pattern.html
 */
public class MainClass {

    private static final String color[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            CircleShapeImp circleShapeImp = (CircleShapeImp) ShapeFactory.getCircle(getRandomColor());
            circleShapeImp.setX(getRandomX());
            circleShapeImp.setY(getRandomY());
            circleShapeImp.setRadius(100);
            circleShapeImp.draw();
            System.out.println("------------------------");
        }
    }

    private static String getRandomColor(){
        return color[new Random().nextInt(color.length)];
    }

    private static int getRandomX(){
        return new Random().nextInt(100);
    }

    private static int getRandomY(){
        return new Random().nextInt(100);
    }
}
