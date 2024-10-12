import Beverage.*;
import Condiments.*;
public class Coffee_shop {
    public static void main(String[] args) {
        // Create an Americano with Milk and White Sugar
        Beverage americanoWithWhiteSugar = new Cappuccino(new milk(new white_sugar(null)));
        System.out.println(americanoWithWhiteSugar.getDescription());
        System.out.println(americanoWithWhiteSugar.cost());

        // Create an Espresso with Milk and Whipped Cream
        Beverage espressoWithMilkAndWhippedCream = new Espresso(new milk(new whipped_cream(null)));
        System.out.println(espressoWithMilkAndWhippedCream.getDescription());
        System.out.println(espressoWithMilkAndWhippedCream.cost());

        // Create a Latte with Whipped Cream
        Beverage latteWithWhippedCream = new Latte(new whipped_cream(null));
        System.out.println(latteWithWhippedCream.getDescription());
        System.out.println(latteWithWhippedCream.cost());
    }
}
