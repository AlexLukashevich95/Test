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
        int day = 1;
        while(day<32){
            ArrayList<Result> results = new ArrayList<Result>();
            ArrayList<Orders> ordersPerDay = new ArrayList<>();
            for(Orders order : orders){
                if(order.getDay()==day){
                    ordersPerDay.add(order);
                }
            }

            for(Orders dayOrder : ordersPerDay){
                for(OrdersProducts quant : ordersProduct){
                    if(quant.getIdOrder().equals(dayOrder.getId())){
                        for(Product product : products) {
                            if(quant.getIdProduct().equals(product.getId())){
                                int profit;
                                profit=product.getPrice()*quant.getQuantity();
                                results.add(new Result(product.getName(),dayOrder.getDate(),profit));
                                break;
                            }
                        }
                    }
                }
            }
            results.sort(Result.comparator);
            for(Result r : results) {
                if (results.indexOf(r) == results.size() - 1) {
                    System.out.println(r.getName() + " " + r.getDate() + " " + r.getResult());
                }
            }
            day++;
        }

    }
}
