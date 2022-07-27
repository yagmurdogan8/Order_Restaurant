// Do not work in the class
public class BuilderDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        System.out.println((vegMeal.vegBurger.name() + " " + vegMeal.vegBurger.price() + " " + vegMeal.vegBurger.packing().pack()));
        System.out.println((vegMeal.coke.name() + " " + vegMeal.coke.price() + " " + vegMeal.coke.packing().pack()));
        System.out.println("Total Cost: " + (vegMeal.vegBurger.price() + vegMeal.coke.price()));

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        System.out.println((nonVegMeal.chickenBurger.name() + " " + nonVegMeal.chickenBurger.price() + " " + nonVegMeal.chickenBurger.packing().pack()));
        System.out.println((nonVegMeal.pepsi.name() + " " + nonVegMeal.pepsi.price() + " " + nonVegMeal.pepsi.packing().pack()));
        System.out.println("Total Cost: " + (nonVegMeal.chickenBurger.price() + nonVegMeal.pepsi.price()));
    }
}
