package chapter08;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Scanner_test {
    public static void test_1() {
        try {
            String string;
            Scanner scanner = new Scanner(Paths.get(BufferedReader_test.getDir()+"/temp06.txt"), "UTF-8");
            for ( string=scanner.nextLine(); ;string=scanner.nextLine())
            {
                System.out.println(string);
            }
        } catch (NoSuchElementException e) {
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
