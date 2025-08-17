package OOPSConcept.L1;
public class Cycle {
    public static void main (String args[])
    {
           Bicycle check=new Bicycle();
         
           check.bicycleName();
            System.out.println(check.price);
    }
}


 class Bicycle {
public int price=10;
 public void bicycleName()
 {
    System.err.println("Dirt");
    System.err.println("Sports");
   
 }
}
