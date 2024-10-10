package Condiments;

import Beverage.Beverage;

public class milk extends Icondiment {
    public milk(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }


    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Condiments.milk";
    }

    @Override
    public double cost() {
        return decoratedBeverage.cost() + 1.75;
    }
}
