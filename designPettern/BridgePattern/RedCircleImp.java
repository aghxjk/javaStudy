package BridgePattern;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class RedCircleImp implements IDrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color:red, radius:" + radius + ", x:" + x + ", y:" + y + " ]");
    }
}
