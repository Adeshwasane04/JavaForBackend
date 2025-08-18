package OOPSConcept.L2;

import java.util.Scanner;


public class UserLogin {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
         sc.close();
        isDetailofUser userInfo=new isDetailofUser(email,name);
        userInfo.Display();
    }
}
 class isDetailofUser{
    private String name;
    private String Email;
     isDetailofUser(String name,String email)
    {
        this.name=name;
        this.Email=email;
    }
  
    public void Display()
    {
         System.out.println("User login Details");
            System.out.println("Name : "+name);
             System.out.println("Email : "+Email);
    }
 }