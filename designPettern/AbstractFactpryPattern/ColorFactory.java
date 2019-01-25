package AbstractFactpryPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
        if (color == null){
            return null;
        }

        if (color.equalsIgnoreCase("RED")){
            return new RedColorImp();
        } else if (color.equalsIgnoreCase("GREEN")){
            return new GreenColorImp();
        } else if (color.equalsIgnoreCase("BLUE")){
            return new BlueColorImp();
        }
            return null;
    }

    @Override
    public IShape getShape(String shapeType){
        return null;
    }
}
