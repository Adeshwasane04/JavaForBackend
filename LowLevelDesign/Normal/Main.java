package LowLevelDesign.Normal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         Product obj=new Product("watch", 200, "this is watch", 1990, "adesh", "2021", "sonata", new ArrayList<>());
         obj.showInfo();

    }
}
//problem with this code :
/*1. We have to remember that order of the arguments , making it hard to maintain 
  2. what if we want to have optional arguments, we will be forced to manually give default value and also we
    have to passed in constructor also 
 */
