import BundlePackage.BirthdayBundle;
import BundlePackage.BundleProduct;
import BundlePackage.HolidayBundle;
import SimpleProducts.Laptop;

public class Main {
    public static void main(String[] args) {
          BundleProduct holidaybundle =new HolidayBundle("Holiday basket");
          holidaybundle.addProduct( new Laptop(null,null,190));
          holidaybundle.addProduct(new BirthdayBundle(null));


               holidaybundle.displayDetails();
               System.out.println("Total price:"+ holidaybundle.get_price());
    }
}
