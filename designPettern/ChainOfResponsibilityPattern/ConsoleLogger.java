package ChainOfResponsibilityPattern;

/**
 * Created by zhaoyimeng on 2016/12/26.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Logger: " + msg);
    }
}
