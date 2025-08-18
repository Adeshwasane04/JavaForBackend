package OOPSConcept.L3;

public class Cloths extends Product {
      protected Cloths (String ProductName,double Price)
    {
            super(ProductName,Price);
            
    }
     @Override
      double isDiscount()
     {
        return Price*0.6;
     }

     @Override
       double isShippingprice()
     {
        return Price*0.55;
     }

     @Override
       double isTax()
     {
        return 10.2;
     }
}
