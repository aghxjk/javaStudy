package ChainOfResponsibilityPattern;

/**
 * Created by zhaoyimeng on 2016/12/26.
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Error::Logger: " + msg);
    }
}
