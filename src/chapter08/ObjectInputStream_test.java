package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by zhaoyimeng on 15/11/30.
 */
public class ObjectInputStream_test {

    public static  String getDir(){
        File directory = new File("src/chapter08/" + ObjectInputStream_test.class.getSimpleName() + ".java"); //设定为当前文件夹
        return directory.getParent();
    }

    public static void test_1() {

        System.out.println("---------------->ObjectInputStream");

        String fileName = getDir() + "/temp10.txt";
        User user;


        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            try {
                user = (User)objectInputStream.readObject();
                System.out.printf("-->" + user.toString());

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
