import BundlePackage.BundleProduct;
import BundlePackage.GeneralBundle;
import BundlePackage.HolidayBundle;
import SimpleProducts.Phone;

public class Main {
    public static void main(String[] args) {
          BundleProduct holidaybundle =new HolidayBundle("Holiday basket");

        BundleProduct specialbundle = new GeneralBundle("Special Offer Bundle");
                specialbundle.addProduct(holidaybundle);
                specialbundle.addProduct(new Phone("Headphones", "Noise-cancelling headphones", 200));


                specialbundle.displayDetails();
               System.out.println("Total price:"+ specialbundle.get_price());
    }
}
