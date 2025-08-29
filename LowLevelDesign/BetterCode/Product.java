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
    
    Product(Builder b)
    {
        //this is called validation we are performing before creation of the object 
        if(b.getPrice(price)>10)
        {
            this.price=b.getPrice(price);
        }
        this.name=b.getName(name);
        this.desc=b.getDesc(desc);
        //....

       
    }
   
  
}
