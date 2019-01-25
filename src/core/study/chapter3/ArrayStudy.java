package core.study.chapter3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 从numbers中随机抽取不重复的数字放在results中
 * 排序后输出
 */
public class ArrayStudy {
    public static void main(String[] args) {

        if (false) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many numbers do you need to draw?");
            int k = scanner.nextInt();

            System.out.println("What is the highest number you can draw?");
            int n = scanner.nextInt();

            if (k > n) {
                System.out.println("抽取个数不能大于数据池总个数!!!");
            }

            DrawWithRandom drawWithRandom = new DrawWithRandom(n, k);
            drawWithRandom.withDraw();
        }

        ArrayToolsDemo.arrayCopy();
        System.out.println("-----------------------");
        LotteryArray.run();

    }
}

/**
 * 类似于抽奖：
 * 从一个连续的整型数组中,抽取不重复的数字
 */
class DrawWithRandom {

    private int n; //备选数组存储的最大值
    private int k; //备选数组抽取数字个数
    private int[] numbers;
    private int[] results;

    /**
     * 默认的构造函数
     */
    public DrawWithRandom() {
        this.n = 100;
        this.k = 12;
    }

    /**
     * 初始化数字池大小和抽取个数
     * @param n 数字池大小
     * @param k 待抽取数字个数
     */
    public DrawWithRandom(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public void withDraw() {

        numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        results = new int[k];
        for (int i = 0; i < results.length; i++) {

            int r = (int) (Math.random() * n);

            results[i] = numbers[r];

            numbers[r] = numbers[n-1];
            n--;
        }

        Arrays.sort(results);
        System.out.println("You got:");

        for (int r : results) {
            System.out.println(r);
        }
    }
}

/**
 * 常用数组工具类示例
 */
class ArrayToolsDemo {

    public static void arrayCopy() {
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] array2;
        int[] array3;

        // 数组拷贝工具
        array2 = Arrays.copyOf(array1, array1.length);
        array3 = Arrays.copyOfRange(array1, 5, array1.length);

        System.out.println("array1 :" + Arrays.toString(array1));
        System.out.println("array2 :" + Arrays.toString(array2));
        System.out.println("array3 :" + Arrays.toString(array3));

        // 数组排序工具
        Arrays.sort(array3);
        System.out.println("array3排序后 :" + Arrays.toString(array3));

        // 快速查找
        int flag1 = Arrays.binarySearch(array1, 9);
        int flag2 = Arrays.binarySearch(array1, 5, array1.length, 1);
        System.out.println("9 in array is found at index " + flag1);
        System.out.println("1 in array is found at index " + flag2);

        int[] array4 = new int[10];
        Arrays.fill(array4, 999);
        System.out.println("array4 :" + Arrays.toString(array4));

        System.out.println("array1 == array4 is : " + Arrays.equals(array1, array2));
    }
}

/**
 * 多维不规则数组
 */
class LotteryArray {
    public static void run(){
        final int NMAX = 10;

        int[][] odds = new int[NMAX][];
        for (int i = 0; i < NMAX; i++) {
            odds[i] = new int[i+1];
        }

        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;

                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }

        for ( int[] row : odds ) {
            for ( int odd : row ) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}