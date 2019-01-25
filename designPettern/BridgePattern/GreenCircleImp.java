package BridgePattern;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class GreenCircleImp implements IDrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color:green, radius:" + radius + ", x:" + x + ", y:" + y + " ]");
    }
}
