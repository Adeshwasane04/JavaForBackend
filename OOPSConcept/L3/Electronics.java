package OOPSConcept.L3;

public class Electronics extends Product {
      protected Electronics (String ProductName,double Price)
    {
            super(ProductName,Price);
            
    }
     @Override
      double isDiscount()
     {
        return Price*0.3;
     }

     @Override
       double isShippingprice()
     {
        return Price*0.34;
     }

     @Override
       double isTax()
     {
        return 14.4;
     }
}
