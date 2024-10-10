package Condiments;

import Beverage.Beverage;

public class whipped_cream extends Icondiment {
    public whipped_cream(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }


    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ",Condiments.whipped_cream";
    }

    @Override
    public double cost() {
        return decoratedBeverage.cost() + 2;
    }
}
