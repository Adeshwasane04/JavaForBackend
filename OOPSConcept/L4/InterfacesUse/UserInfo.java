package OOPSConcept.L4.InterfacesUse;

public class UserInfo {
     public static void main(String[] args) {
        NotificationSystem viaEmail=new EmailNotification("adeshwasane04@gmail.com");
        viaEmail.sendMessage("Best deal on Electronic items");

        NotificationSystem viaNumber=new Smsnotification(755773224);
        viaNumber.sendMessage("Rapido Book Your ride Now");
    }
}
