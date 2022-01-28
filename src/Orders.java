import java.util.Date;

public class Orders {
    private String id;
    private String date;

    public Orders(String id,String date){
        this.id = id;
        this.date = date;
    }

    public  String getId(){
        return id;
    }

    public String getDate(){
        return date;
    }

    public int getDay(){
        return Integer.parseInt(date.charAt(8)+""+date.charAt(9));
    }

    public int compareTo(Orders o) {
        return getDate().compareTo(o.getDate());
    }
}
