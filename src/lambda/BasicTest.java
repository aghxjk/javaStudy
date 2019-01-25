package lambda;

import java.util.Arrays;
import java.util.List;

public class BasicTest {
    public static void lambdaTest_1 () {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                        "Stanislas Wawrinka",
                        "David Ferrer","Roger Federer",
                        "Andy Murray","Tomas Berdych",
                        "Juan Martin Del Potro"};

        List<String> players =  Arrays.asList(atp);
        players.forEach((player) -> System.out.print(player + ";\n"));
        System.out.println("--------------------");
        players.forEach(System.out::println);
    }

    public static void lambdaTest_2 () {
        // 使用 lambda expression
        System.out.println("--------------------");
        new Thread(() -> System.out.println("Hello world! with thread")).start();
    }

    public static void lambdaTest_3 () {
        Runnable runnable = () -> System.out.println("Hello World! with runnable");
        runnable.run();
    }

    public static void lambdaTest_4 () {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                        "Stanislas Wawrinka",
                        "David Ferrer","Roger Federer",
                        "Andy Murray","Tomas Berdych",
                        "Juan Martin Del Potro"};

        Arrays.sort(atp, (String x, String y) -> (x.compareTo(y)));
        List<String> list = Arrays.asList(atp);
        System.out.println("--------------------");
        list.forEach((item) -> System.out.println(item + ";"));
    }
}
