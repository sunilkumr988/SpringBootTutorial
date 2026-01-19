package Module1Introduction.Module1Introduction;
import Module1Introduction.Module1Introduction.Imp.Email_Notification;
import Module1Introduction.Module1Introduction.Imp.SMS_Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Module1IntroductionApplication  {//implements CommandLineRunner
//	@Autowired
//	PaymentServices paymentServices;
//	final NotificationServices notificationServices;
//	public Module1IntroductionApplication(NotificationServices notificationServices) {
//		this.notificationServices = notificationServices;
//	}
	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
////		paymentServices.pay();
//		notificationServices.send("hello");
//	}
}
