package chapter08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zhaoyimeng on 15/11/27.
 */
public class FileInputStream_test {


    public static  String getDir(){
        return FileInputStream_test.class.getResource("").getPath();
//        File directory = new File("src/chapter08/" + FileInputStream_test.class.getSimpleName() + ".java"); //设定为当前文件夹
//        return directory.getParent();
    }
    /**
     * 以下程序存储缺点:
     *    频繁访问磁盘,性能不高,伤害磁盘
     */
    public static void test_1() {


        System.out.println("---------------->文件输入字节流:test_1()");

        FileInputStream fileInStream = null;
        try {
            /**
             *  1. 创建文件输入流
             */
            String filePath = getDir() + "temp01.txt";
            fileInStream = new FileInputStream(filePath);

           /**
            *  2. 读文件
            */
            int iRead1 = fileInStream.read();
            int iRead2 = fileInStream.read();
            int iRead3 = fileInStream.read();
            int iRead4 = fileInStream.read();
            int iRead5 = fileInStream.read();
            int iRead6 = fileInStream.read();
            int iRead7 = fileInStream.read();

            System.out.println(iRead1);
            System.out.println(iRead2);
            System.out.println(iRead3);
            System.out.println(iRead4);
            System.out.println(iRead5);
            System.out.println(iRead6);
            System.out.println(iRead7);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( fileInStream != null ){
                try {
                    fileInStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void test_2() {

        System.out.println("---------------->文件输入字节流:test_2()");

        FileInputStream fileInStream = null;
        try {
            /**
             *  1. 创建文件输入流
             */
            String filePath = getDir() + "/temp01.txt";
            fileInStream = new FileInputStream(filePath);

            /**
             *  2. 读文件
             */
//            while (true){
//
//                int tmp = fileInStream.read();
//                if (tmp == -1) break;
//                System.out.println("temp01.txt : " + tmp);
//            }
            int tmp = 0;
            while ( (tmp=fileInStream.read()) != -1 ){
                System.out.println("temp01.txt : " + tmp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( fileInStream != null ){
                try {
                    fileInStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void test_3() {

        System.out.println("---------------->文件输入字节流:test_3()");

        FileInputStream fileInStream = null;
        try {
            /**
             *  1. 创建文件输入流
             */
            String filePath = getDir() + "/temp01.txt";
            fileInStream = new FileInputStream(filePath);

            //返回流中估计剩余字节数
            System.out.println("FileInputStream.available() = " + fileInStream.available());

            /**
             *  2. 读文件
             */
            byte[] arr = new byte[2];
            int count = 0;

            while ((count=fileInStream.read(arr)) != -1){
                fileInStream.skip(1);
                System.out.println("byte[] = " + new String(arr, 0 , count));
            }
            //返回流中估计剩余字节数
            System.out.println("FileInputStream.available() = " + fileInStream.available());

//            int i1 = fileInStream.read(arr);
//            System.out.println("1 byte[] = " + new String(arr).substring(0,i1));
//            System.out.println("2 byte[] = " + new String(arr, 0, i1));
//            int i2 = fileInStream.read(arr);
//            System.out.println("1 byte[] = " + new String(arr).substring(0,i2));
//            System.out.println("2 byte[] = " + new String(arr, 0, i2));
//            int i3 = fileInStream.read(arr);
//            System.out.println("1 byte[] = " + new String(arr).substring(0,i3));
//            System.out.println("2 byte[] = " + new String(arr, 0, i3));
//            int i4 = fileInStream.read(arr);
//
//            System.out.println("byte[] read : " + i1);
//            System.out.println("byte[] read : " + i2);
//            System.out.println("byte[] read : " + i3);
//            System.out.println("byte[] read : " + i4);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( fileInStream != null ){
                try {
                    fileInStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
