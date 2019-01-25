package CommandPattern;

/**
 * Created by zhaoyimeng on 2016/12/27.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ name : " + name
        + ", Quantity : " + quantity
        + " ] bought");
    }

    public void sell(){
        System.out.println("Stock [ name : " + name
                + ", Quantity : " + quantity
                + " ] sold");
    }
}
