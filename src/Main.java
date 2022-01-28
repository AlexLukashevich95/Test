import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Orders> orders = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<OrdersProducts> ordersProduct = new ArrayList<>();
        Reader reader = new Reader();
        reader.readFile("src\\orders.csv",orders,products,ordersProduct);
        reader.readFile("src\\products.csv",orders,products,ordersProduct);
        reader.readFile("src\\order_items.csv",orders,products,ordersProduct);
        orders.sort(Orders::compareTo);
     }
}
