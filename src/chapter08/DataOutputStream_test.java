package chapter08;

import java.io.*;

/**
 * Created by zhaoyimeng on 15/11/27.
 */
public class DataOutputStream_test {

    public static  String getDir(){
        File directory = new File("src/chapter08/" + DataOutputStream_test.class.getSimpleName() + ".java"); //设定为当前文件夹
        return directory.getParent();
    }

    public static void test_1() {

        System.out.println("---------------->Data输出流:test_1()");
        String fName = getDir() + "/temp08.txt";

        DataOutputStream fo = null;

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.1f;
        double d = 1.1;

        boolean bl = true;
        char c = '1';

        try {

            fo = new DataOutputStream(new FileOutputStream(fName));

            fo.writeByte(b);
            fo.writeShort(s);
            fo.writeInt(i);
            fo.writeLong(l);
            fo.writeFloat(f);
            fo.writeDouble(d);
            fo.writeBoolean(bl);
            fo.writeChar(c);

            fo.flush();

            System.out.println("将数据写入到文件: temp08.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fo != null){
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
