package OOPSConcept.L3;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which Product section do you want to go with Cloths or Electronics or Grocery ?");
        String choice=sc.nextLine();
        System.out.print("Enter product Name and price :");
        String ProductName=sc.nextLine();
        double Price=sc.nextDouble();

        sc.close();
        switch (choice) {
            case "Cloths":
                 Product obj=new Cloths(ProductName, Price);
                 obj.isProduct();
                break;

            case "Grocery":
                 Product obj2=new Grocery(ProductName, Price);
                 obj2.isProduct();
                break;

             case "Electronics":
                 Product obj3=new Electronics(ProductName, Price);
                 obj3.isProduct();
                break;
        
            default:System.out.println("No Section found!");
                break;
        }
       
    }
}
