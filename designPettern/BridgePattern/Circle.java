package BridgePattern;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class Circle extends Shap{
    private int x, y, radius;
    protected Circle(int x, int y, int radius, IDrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
