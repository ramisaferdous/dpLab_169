package Condiments;

import Beverage.Beverage;

public class white_sugar extends Icondiment {
    public white_sugar(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }


    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ",Condiments.white_sugar";
    }

    @Override
    public double cost() {
        return decoratedBeverage.cost() + 1.5;
    }
}
