package testCode;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zhaoyimeng on 2018/6/29.
 */
public class TestCodeClass {

    public String stringRevert(String string){
//        return StringUtils.reverse(string);
        if(StringUtils.isEmpty(string))
            return null;
        StringBuilder s = new StringBuilder(string.length());
        for (int i = string.length()-1; i > 0; i--) {
            s.append(string.charAt(i));
        }
        return s.toString();
    }

    public int dichotomy(int[] array, int start, int end, int toFind){

        if ( array == null ){
            return -1;
        }

        int midIndex = (start + end)/2;
        int midValue = array[midIndex];

        if ( start <= end ){
            if ( toFind == midValue ){
                return 0;
            } else if ( toFind < midValue ){
                return dichotomy(array, start, midIndex-1, toFind);
            } else if ( toFind > midValue ){
                return dichotomy(array, midIndex+1, end, toFind);
            } else{
                return -1;
            }
        } else
            return -1;
    }

    public static void bubbleSorter(int[] list){
//        Arrays.sort(list);
        if (list == null || list.length==1) {
            return;
        }
        boolean swap = true;
        for (int i = 1; i < list.length && swap == true; i++) {
            swap = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j] > list[j+1]){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                    swap = true;
                }
            }
        }
    }

    public static float payoffProfile(float capital, float rate, int years){
        if (years == 1){
            return capital*(1.0f + rate);
        } else {
            return payoffProfile(capital*(1.0f+rate)+60000, rate, years-1);
        }
    }

    public static void main(String[] args) {


//        TestCodeClass testCodeClass = new TestCodeClass();
//
//        String str = testCodeClass.stringRevert("abcdefg");
//        System.out.println(str);

//        assert( false );

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        System.out.println("toFind = 2; is Find = " + testCodeClass.dichotomy(array, 0, array.length, 2));
//        System.out.println("toFind = 10; is Find = " + testCodeClass.dichotomy(array, 0, array.length, 10));
//        System.out.println("toFind = 1; is Find = " + testCodeClass.dichotomy(array, 0, array.length, 1));
//        System.out.println("toFind = 11; is Find = " + testCodeClass.dichotomy(array, 0, array.length, 11));
//        System.out.println("toFind = 12; is Find = " + testCodeClass.dichotomy(array, 0, array.length-1, 12));
//        System.out.println("toFind = 0; is Find = " + testCodeClass.dichotomy(array, 0, array.length-1, 0));

//        int[] list = {3,9,0,6,2,8,4,7};
//        TestCodeClass.bubbleSorter(list);
//        for (int i:list) {
//            System.out.println("list:" + i);
//        }

        float allProfit = TestCodeClass.payoffProfile(100000.0f, 0.1f, 20);
        System.out.println(String.valueOf(allProfit));
    }
}
