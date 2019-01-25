package chapter08;

/**
 * Created by zhaoyimeng on 15/11/27.
 */
public class DecoratorClass_B implements DecoratorInterFace{

    DecoratorInterFace decoratorInterFace;

    DecoratorClass_B(DecoratorInterFace decoratorInterFace){
        this.decoratorInterFace = decoratorInterFace;
    }

    @Override
    public void close() {
        System.out.println("DecoratorClass_B close() ...");
        decoratorInterFace.close();
        System.out.println("finish ...");
    }
}
