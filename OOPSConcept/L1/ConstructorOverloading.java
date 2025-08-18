package OOPSConcept.L1;

public class ConstructorOverloading {
     
      private int a,b;

      private ConstructorOverloading(int i,int j)
      {
          this.a=i;
          this.b=j;
      }


      private ConstructorOverloading(int i)
      {
        this(i, i);
      }

      private ConstructorOverloading()
      {
        this(8);
      }
         
      int sum=0;
      public int Answer()
      {
          sum=this.a+this.b;
          return sum;
      }
      public static void main(String[] args) {
           ConstructorOverloading C1=new ConstructorOverloading(3,4);
          System.out.println(C1.Answer()); 
          ConstructorOverloading C2=new ConstructorOverloading(3,2);
           System.out.println(C2.Answer()); 
      }
}
