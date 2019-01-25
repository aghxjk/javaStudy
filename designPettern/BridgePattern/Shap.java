package BridgePattern;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public abstract class Shap {
    protected IDrawAPI drawAPI;
    protected Shap(IDrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
