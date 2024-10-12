package Beverage;

import Condiments.Icondiment;

public class Cappuccino  implements Beverage {
    private Icondiment _condiment;

    public Cappuccino(Icondiment condiment){
        _condiment=condiment;
    }
    @Override
    public String getDescription() {
        return "Cappuccino " + (_condiment == null ? "." : _condiment.getDescription());
    }

    @Override
    public double cost() {

        return 8.0 + + (_condiment == null ? 0 : _condiment.cost());

    }
}
