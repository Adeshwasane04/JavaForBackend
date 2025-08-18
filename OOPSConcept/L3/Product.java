package OOPSConcept.L3;
abstract class Product extends OnlineStore{
    
   protected String ProductName;
   protected double Price;
   abstract double isDiscount();
   abstract double isShippingprice();
    abstract double isTax();

    protected Product(String ProductName, double Price)
    {
        this.ProductName=ProductName;
        this.Price=Price;
    }

    public void isProduct()
    {
        System.out.println("Product_Name : "+ProductName);
        System.out.println("Product_Name : "+Price);

        String val=String.format("%.2f", isDiscount());
        System.out.println("Discount : "+ val);

        String val2=String.format("%.2f", isShippingprice());
        System.out.println("Shipping_Charge : "+val2);

       System.out.println("Tax_Amount : "+isTax());


    }
    
}