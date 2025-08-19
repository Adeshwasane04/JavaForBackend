package OOPSConcept.L4.InterfacesUse;

public class Smsnotification implements NotificationSystem {
     private long number;
    
    protected Smsnotification(long number)
    {
       this.number=number;
    }
       @Override
       public void sendMessage(String message)
    {
       
        System.out.println("Email Notification send Successfully on MobileNumber: "+number);
         System.out.println("The Message is : "+message);
    }
}
