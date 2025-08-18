package OOPSConcept.L1;

public class PassingThisAsArgument {
       int i,j;
     public PassingThisAsArgument(int i,int j)
     {
         this.i=i;
         this.j=j;
           System.out.println("Before : "+this.i+" and "+this.j);
           isValue(this); // here this is taken as a argument
            System.out.println("After : "+this.i+" and "+this.j);
     }

     void isValue(PassingThisAsArgument obj)  //after that the control reach out here
     {
        obj.i+=2;
        obj.j+=2;
    
     }


     
    public static void main(String[] args) {
        PassingThisAsArgument c1=new PassingThisAsArgument(10, 20); //then here
        PassingThisAsArgument c2=new PassingThisAsArgument(2, 3);
    }
}
