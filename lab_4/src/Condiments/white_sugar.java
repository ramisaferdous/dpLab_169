package Condiments;

public class white_sugar implements Icondiment {
    private Icondiment _icondiment;


    public white_sugar(Icondiment icondiment) {

        _icondiment=icondiment;
    }

    @Override
    public String getDescription() {
        return "with white sugar " + (_icondiment != null ? _icondiment.getDescription() : "") + ".";
    }

    @Override
    public double cost() {
        return 1.5 + (_icondiment != null ? _icondiment.cost() : 0);
    }
}
