
package OOPSConcept.L1;
public class PrivateAccessModifier {

    /*if we have to accesss the value from the private modifier for that we 
     have to use getter and setter method 
     */

public static void main(String[] args) {
     isPrivate checkName =new isPrivate();
     checkName.setName("hello");
     System.out.println(checkName.getName());
}
}

class isPrivate
{
    private String name;

    public String getName()
    {
       return this.name;
    }
    public String setName(String name)
    {
        return this.name=name;
    }
}