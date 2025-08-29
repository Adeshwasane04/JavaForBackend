import java.util.List;

public class Builder {
    private String name;
    private int price;
    private String desc;
    private int model;
    private String seller;
    private String updatedAt;
    private String brand;
    private List<String> image;
  

    Builder ()

    {
    }
    String SetName(String name)
    {
          return this.name=name;
    }

     int SetPrice(int price)
    {
        return this.price=price;
    }
    String SetDesc(String desc)
    {
        return this.desc=desc;
    }
    //...

     String getName(String name)
    {
          return this.name=name;
    }

     int getPrice(int price)
    {
        return this.price=price;
    }
    String getDesc(String desc)
    {
        return this.desc=desc;
    }
    //...
        public void show()
        {
           System.out.println(name);
           System.out.println(desc);
           System.out.println(price);
        }
}
