package Condiments;

public class whipped_cream implements Icondiment {
    private Icondiment _icondiment;


    public whipped_cream(Icondiment icondiment) {

        _icondiment=icondiment;
    }

    @Override
    public String getDescription() {
        return "with Whipped Cream " + (_icondiment != null ? _icondiment.getDescription() : "") + ".";
    }

    @Override
    public double cost() {
        return 2 + (_icondiment != null ? _icondiment.cost() : 0);
    }
}
