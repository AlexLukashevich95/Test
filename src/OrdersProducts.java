public class OrdersProducts {
    private String idProduct;
    private String idOrder;
    private Integer quantity;

    public OrdersProducts(String idProduct,String idOrder,Integer quantity ){
        this.idProduct = idProduct;
        this.idOrder = idOrder;
        this.quantity = quantity;
    }

    public  String getIdProduct(){
        return idProduct;
    }

    public String getIdOrder(){
        return idOrder;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
}
