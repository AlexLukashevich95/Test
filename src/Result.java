import java.util.Comparator;

public class Result {
    private String name;
    private String date;
    private int result;

    public Result(String name, String date, int result) {
        this.name = name;
        this.date = date;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getResult() {
        return result;
    }

    public static Comparator<Result> comparator = new Comparator<Result>() {

        @Override
        public int compare(Result p1, Result p2) {
            int productId1 = p1.getResult();
            int productId2 = p2.getResult();

            return (productId1 - productId2);
        }
    };
}

