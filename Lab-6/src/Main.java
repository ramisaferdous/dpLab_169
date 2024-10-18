import Notification.EpostNotification;
import Notification.INotify;

public class Main {
    public static void main(String[] args) {
   EpostNotification epostNotification=new EpostNotification();

        UserInfo location = new UserInfo();
        INotify epost= new NotificatonAdapter(epostNotification, location);
        epost.sendNotification(1,"Hello!!!");


    }
}