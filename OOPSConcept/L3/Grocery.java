package OOPSConcept.L3;

public class Grocery extends Product {
    
    protected Grocery (String ProductName,double Price)
    {
            super(ProductName,Price);
            
    }
     @Override
      double isDiscount()
     {
        return Price*0.1;
     }

     @Override
       double isShippingprice()
     {
        return Price*0.15;
     }

     @Override
       double isTax()
     {
        return 10.2;
     }
}
