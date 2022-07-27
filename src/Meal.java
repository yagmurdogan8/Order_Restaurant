import java.util.ArrayList;

public class Meal {

    MealBuilder mealBuilder = new MealBuilder();

    VegBurger vegBurger = new VegBurger();
    ChickenBurger chickenBurger = new ChickenBurger();
    Coke coke = new Coke();
    Pepsi pepsi = new Pepsi();

    ArrayList<Item> items = new ArrayList<>();


    public void addItem(Item a) {

        items.add(a);

    }

    public void showItems() {
        // Write the name, pack and price of each product added to the list

        if (items.contains(vegBurger) && items.contains(coke)) {
            System.out.println(vegBurger.name() + " " + vegBurger.price() + " " + vegBurger.packing().pack());
            System.out.println(coke.name() + " " + coke.price() + " " + coke.packing().pack());
        } else {
            System.out.println(chickenBurger.name() + " " + chickenBurger.price() + " " + chickenBurger.packing().pack());
            System.out.println(pepsi.name() + " " + pepsi.price() + " " + pepsi.packing().pack());
        }
    }

    public float getCost() {
        // Find the total price for each product added to the list

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.addItem(vegBurger);
        vegMeal.addItem(coke);
        float vegan = (vegMeal.vegBurger.price() + vegMeal.coke.price());
        System.out.println(vegan);

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.addItem(chickenBurger);
        nonVegMeal.addItem(pepsi);
        float nonVegan = (nonVegMeal.chickenBurger.price() + nonVegMeal.pepsi.price());
        return nonVegan;

    }

}
