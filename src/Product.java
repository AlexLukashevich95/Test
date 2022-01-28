import java.util.Date;

public class Product {
    private String id;
    private String name;
    private Integer price;

    public Product(String id, String name, Integer price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public  String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getPrice(){
        return price;
    }

}
