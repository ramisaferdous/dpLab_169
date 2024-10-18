import Notification.EpostNotification;
import Notification.INotify;

public class NotificatonAdapter implements INotify {
    EpostNotification enotify;
    UserInfo location;

    NotificatonAdapter(EpostNotification _enotify, UserInfo _location) {
    enotify=_enotify;
    location=_location;


    }
    @Override
    public void sendNotification(int Id,String message) {
         String Location=location.getLocation();
        enotify.sendlegacyNotification( Id, message,Location );
        System.out.println("Message id :"+Id+" message :"+ Location);
    }
}
