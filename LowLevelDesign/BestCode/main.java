
package LowLevelDesign.BestCode;

public class main {
    public static void main(String[] args) {
        Product p =new Product.ProductBuilder()
                    .setName("Iphone")
                    .setPrice(2000)
                    .setDesc("lorem20")
                    .setBrand("Apple")
                    .setModel(2020)
                    .setSeller("adesh")
                    .setupadatedAt("2020")
       
                    .build();
                    
        System.out.println(p);
    }
}
