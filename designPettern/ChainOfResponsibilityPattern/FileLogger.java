package ChainOfResponsibilityPattern;

/**
 * Created by zhaoyimeng on 2016/12/26.
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard File::Logger: " + msg);
    }
}
