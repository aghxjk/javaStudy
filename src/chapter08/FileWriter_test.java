package chapter08;

import java.io.*;

/**
 * Created by zhaoyimeng on 15/11/27.
 */
public class FileWriter_test {

    public static  String getDir(){
        File directory = new File("src/chapter08/" + FileReader_test.class.getSimpleName() + ".java"); //设定为当前文件夹
        return directory.getParent();
    }

    public static void test_1() {

        System.out.println("\n---------------->文件字符输出字节流:test_1()");
        String fisName = getDir() + "/temp04.txt";

        FileWriter fiw = null;

        try {

            fiw = new FileWriter(fisName);

            fiw.write("赵钱孙李!!!");

            char[] chars = {'中', '华', '人', '民', '共', '和', '国'};

            fiw.write(chars, 1, 5);

            fiw.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fiw != null){
                try {
                    fiw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void test_2() {

        System.out.println("\n---------------->文件字符输出字节流:test_2()");
        String fisName = getDir() + "/temp02.txt";
        String fosName = getDir() + "/temp05.txt";

        FileReader fi = null;
        FileWriter fo = null;

        try {

            fi = new FileReader(fisName);
            fo = new FileWriter(fosName);

            char[] chars = new char[10];
            int count;

            while ( (count=fi.read(chars)) != -1 ){

                fo.write(chars, 0, count);

            }

            fo.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fi != null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
