package LowLevelDesign.Normal;

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
  

    public Product (String name,int price,String desc,int model,String seller,String updatedAt,String brand, List<String> image)

    {
        this.name=name;
        this.price=price;
        this.desc=desc;
        this.model=model;
        this.seller=seller;
        this.updatedAt=updatedAt;
        this.brand=brand;
        this.image=image;

    }
  void showInfo()
  {
    System.out.println();
  }
}
