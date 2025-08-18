package OOPSConcept.L2.ProtectedKeyword;

//parent class
public class User {
    protected String name;
    protected String email;
    
    public User(String name,String email)
     {
        this.name=name;
        this.email=email;
     }

     protected void Display()
     {
        System.out.println("Email : "+email);
        System.out.println("Name : "+name);
     }
}
