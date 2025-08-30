package LowLevelDesign.BestCode;

import java.util.List;

public class Product {
    private String name;
    private int price;
    private String desc;
    private int model;
    private String seller;
    private String updatedAt;
    private String brand;
    private List<String> image;
    

    private Product(ProductBuilder builder)
    {
        this.name=builder.name;
         this.price=builder.price;
         this.desc=builder.desc;
         this.model=builder.model;
         this.seller=builder.seller;
         this.updatedAt=builder.updatedAt;
         this.brand=builder.brand;
         this.image=builder.image;
    }

    //for displaying the details 

      @Override
    public String toString()
    {
        return "Product [name : "+name+ " price : "+price + " desc"+ desc +
        " model"+model +" seller"+seller+" updatedAt"+updatedAt+" brand"+brand + "]";
    }
    
public static class ProductBuilder{
    private String name;
    private int price;
    private String desc;
    private int model;
    private String seller;
    private String updatedAt;
    private String brand;
    private List<String> image;

    public ProductBuilder setName(String name)
    {
       this.name=name; //assign value 
       return this;    //assign builder not string and if we not done like this then 
                       // we are not able to perform chaining
    }
     public ProductBuilder setPrice(int price)
    {
       this.price=price; //assign value 
       return this;    //assign builder not string
    }
     public ProductBuilder setDesc(String desc)
    {
       this.desc=desc; //assign value 
       return this;    //assign builder not string
    }
     public ProductBuilder setModel(int model)
    {
       this.model=model; //assign value 
       return this;    //assign builder not string
    }
     public ProductBuilder setSeller(String seller)
    {
       this.seller=seller; //assign value 
       return this;    //assign builder not string
    }
     public ProductBuilder setupadatedAt(String updatedAt)
    {
       this.updatedAt=updatedAt; //assign value 
       return this;    //assign builder not string
    }
      public ProductBuilder setBrand(String brand)
    {
       this.brand=brand; //assign value 
       return this;    //assign builder not string
    }

    // final method to create a product object

    public Product build()
    {
        return new Product(this); //Pass the CURRENT builder object to Product’s constructor
    }
}
}