import java.util.Date;

public class Orders {
    private String id;
    private Date date;

    public Orders(String id,Date date){
        this.id = id;
        this.date = date;
    }

    public  String getId(){
        return id;
    }

    public Date getDate(){
        return date;
    }



}
