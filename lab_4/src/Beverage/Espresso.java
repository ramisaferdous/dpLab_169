package Beverage;

import Condiments.Icondiment;

public class Espresso  implements Beverage {
    private Icondiment _condiment;

    public Espresso(Icondiment condiment){
        _condiment=condiment;
    }
    @Override
    public String getDescription() {
        return "Espresso" + (_condiment == null ? "." : _condiment.getDescription());
    }

    @Override
    public double cost() {

        return 9.5 +(_condiment == null ? 0 : _condiment.cost());

    }
}
