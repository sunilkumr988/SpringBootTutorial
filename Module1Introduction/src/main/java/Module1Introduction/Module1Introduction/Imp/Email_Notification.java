package Module1Introduction.Module1Introduction.Imp;
import Module1Introduction.Module1Introduction.NotificationServices;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name="notification.type",havingValue="email")
public class Email_Notification implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("email sending..."+message);
    }
}
