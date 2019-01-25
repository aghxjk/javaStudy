package DecoratorPattern;

/**
 * Created by zhaoyimeng on 2016/12/23.
 * 装饰器模式（Decorator Pattern）
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 * 我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
 *
 * 参考: http://www.runoob.com/design-pattern/decorator-pattern.html
 */
public class MainClass {
    public static void main(String[] args) {
        IShape circle = new CircleShapeImp();
        IShape redCircle = new RedShapeDecorator(new CircleShapeImp());
        IShape redRectangle = new RedShapeDecorator(new RectangleShapeImp());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
