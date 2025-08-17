package OOPSConcept.L1;
public class ThisKeyword {
    public static void main(String[] args) {
       isThis Name=new isThis();
      Name.isSet("hey Adesh");
      System.err.println(Name.getName());
    }
}
class isThis{
    private String name;
    public String isSet(String name)
    {
        return this.name=name;
    }
     public String getName()
     {
        return this.name;
     }
}
