package OOPSConcept.L2.LoginSystem;

import java.util.Scanner;

import OOPSConcept.L2.LoginSystem.*;;

public class User {
      private String name;
       private String email;
   
       public User(String email,String name)
       {
         this.name=name;
         this.email=email;
       }
        
    

      public void display() {
        System.out.println("User login Details:");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
       }

       //we use method overriding here for showing the userDashboard

       public void showDashboard()
       {
          System.out.println("This is user DashBoard");
       }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Select a user Profile 1.Admin 2.Seller 3.Customer");
    int num=sc.nextInt();
    
    System.out.println("Enter email : ");

    String email=sc.next();
    
    System.out.println("Enter name : ");
    String name=sc.next();
      sc.close();
    switch(num){
        case 1:System.out.println("Login successful as a Admin");
                break;
         case 2:System.out.println("Login Successful as a Seller");
                break;
          case 3:System.out.println("Login Successful as a Customer");
                 break;
           default:System.out.println("Invaild case");
                 break;
          }
       
          if(num==2)
          {
                Seller obj = new Seller(email, name);
            obj.display(); // call display method
            obj.showDashboard();
          }
          else if(num==3)
          {
            Customer obj2=new Customer(email, name);
            obj2.display();
            obj2.showDashboard();
          }
          else{
            Admin obj3=new Admin(email,name);
             obj3.display();
             obj3.showDashboard();
          }
       
    } 
    
    

}
