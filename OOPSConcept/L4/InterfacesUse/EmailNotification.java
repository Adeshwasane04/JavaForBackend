package OOPSConcept.L4.InterfacesUse;

public class EmailNotification implements NotificationSystem {
    
    private String mail;
    
    protected EmailNotification(String mail)
    {
       this.mail=mail;
    }
       @Override
       public void sendMessage(String message)
    {
       
        System.out.println("Email Notification send Successfully on mailId: "+mail);
         System.out.println("The Message is : "+message);
    }
    
}
