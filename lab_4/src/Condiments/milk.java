package Condiments;

public class milk implements Icondiment {
    private Icondiment _icondiment;


    public milk(Icondiment icondiment) {

        _icondiment=icondiment;
    }

    @Override
    public String getDescription() {
        return "with Milk " + (_icondiment != null ? _icondiment.getDescription() : "") + ".";
    }

    @Override
    public double cost() {
        return 1.75 + (_icondiment != null ? _icondiment.cost() : 0);
    }
}
