package OOPSConcept.L2.LoginSystem;

public class Customer extends User {
      public Customer(String email,String name)
     {
            super(email,name);
          System.out.println("Customer account created for: " + name);
     }
          @Override
   public void showDashboard()
       {
      
          System.out.println("This is Customer DashBoard");
       }
}
