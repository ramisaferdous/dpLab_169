package Beverage;

import Condiments.Icondiment;

public class Latte  implements Beverage {
    private Icondiment _condiment;
    public Latte(Icondiment condiment){
        _condiment=condiment;
    }
    @Override
    public String getDescription() {
        return "Latte " + (_condiment == null ? "." : _condiment.getDescription());
    }

    @Override
    public double cost() {

        return 9.0 +(_condiment == null ? 0 : _condiment.cost());

    }
}
