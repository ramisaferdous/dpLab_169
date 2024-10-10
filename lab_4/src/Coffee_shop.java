import Beverage.Beverage;
import Beverage.Espresso;
import Condiments.milk;
import Condiments.whipped_cream;
import Condiments.white_sugar;

public class Coffee_shop{
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

       beverage = new whipped_cream(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new white_sugar(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


    }
}