package Condiments;

import Beverage.Beverage;

public  abstract class Icondiment implements Beverage {
    protected Beverage decoratedBeverage;
    public Icondiment (Beverage decoratedBeverage) {
        this.decoratedBeverage= decoratedBeverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    @Override
    public double cost() {
        return decoratedBeverage.cost();
    }

}
