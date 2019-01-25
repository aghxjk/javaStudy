package chapter01;

import java.io.Console;
import java.util.Scanner;

public class Main {

    static void chapter_fun1() {
        multiClass1 mc1 = new multiClass1();
        multiClass2 mc2 = new multiClass2();
        multiClass3 mc3 = new multiClass3();

        mc1.print();
        mc2.print();
        mc3.print();
    }

    static void scanner_test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }

    static void console_test() {
        // 在IDE中，console会出现空指针异常，因为IDE没有console。通过命令行可以正常执行下面的代码。
        Console console = System.console();
        String userName = console.readLine("User name: ");
        char[] passwd = console.readPassword("Password: ");
        System.out.println("UserName = " + userName + "passwd = " + new String(passwd));
    }

    public static void main(String argv[]){
//        Main.chapter_fun1();
        Main.console_test();
    }
//    public static void main(String argv[]){
//        System.out.println(File.class);
//        System.out.println(File.separator);
//        System.out.println(System.getProperty("user.dir"));
//    }
}

