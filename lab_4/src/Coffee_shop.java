import Beverage.*;
import Condiments.*;
public class Coffee_shop {
    public static void main(String[] args) {

        Beverage americanoWithWhiteSugar = new Cappuccino(new milk(new white_sugar(null)));
        System.out.println(americanoWithWhiteSugar.getDescription());
        System.out.println(americanoWithWhiteSugar.cost());


        Beverage espressoWithMilkAndWhippedCream = new Espresso(new milk(new whipped_cream(null)));
        System.out.println(espressoWithMilkAndWhippedCream.getDescription());
        System.out.println(espressoWithMilkAndWhippedCream.cost());


        Beverage latteWithWhippedCream = new Latte(new whipped_cream(null));
        System.out.println(latteWithWhippedCream.getDescription());
        System.out.println(latteWithWhippedCream.cost());
    }
}
