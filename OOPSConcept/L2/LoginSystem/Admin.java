package OOPSConcept.L2.LoginSystem;

public class Admin extends User {
    public  Admin (String email,String name){
      super(email,name);
      System.out.println("Admin account created for  "+name);
        
    }  
           @Override
   public void showDashboard()
       {
          
          System.out.println("This is Admin DashBoard");
       }
}
