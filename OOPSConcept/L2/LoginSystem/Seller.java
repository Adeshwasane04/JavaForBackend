package OOPSConcept.L2.LoginSystem;

public class Seller extends User{

     public Seller(String email,String name)
     {
            super(email,name);
          System.out.println("Seller account created for: " + name);
     }

     @Override
   public void showDashboard()
       {
          
          System.out.println("This is Seller DashBoard");
       }
}
