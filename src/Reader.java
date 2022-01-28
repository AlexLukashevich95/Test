import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class Reader {
    public void readFile(String file, ArrayList<Orders> orders, ArrayList<Product> products, ArrayList<OrdersProducts> ordersProducts ) {
        BufferedReader reader = null;
        String line = "";
        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!= null){
                String[] s = line.split(",");
                switch (file){
                    case "src\\orders.csv":
                        orders.add(new Orders(s[0], s[1]));
                        break;
                    case "src\\products.csv":
                        products.add(new Product(s[0],s[1],Integer.parseInt(s[2])));
                        break;
                    case "src\\order_items.csv":
                        ordersProducts.add(new OrdersProducts(s[0],s[1],Integer.parseInt(s[2])));
                        break;
                }

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
