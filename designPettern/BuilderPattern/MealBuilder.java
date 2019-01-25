package BuilderPattern;

/**
 * Created by zhaoyimeng on 2016/12/19.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CokeDrink());
        return meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new PepsiDrink());
        return meal;
    }
}
