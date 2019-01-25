package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class Meal {
    private List<ItemInterface> items = new ArrayList<ItemInterface>();

    public void addItem(ItemInterface item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (ItemInterface item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (ItemInterface item:items){
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
