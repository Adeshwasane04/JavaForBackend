package OOPSConcept.L2.ProtectedKeyword;

//child class
public class Seller extends User {
      public Seller(String email,String name)
      {
          super(name, email);
      }

      public void show()
      {
                Display();
               System.out.println("User Details: " + name + ", " + email);
        
      }
}
