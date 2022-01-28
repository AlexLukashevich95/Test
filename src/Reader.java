
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
    public void readFile(String file, ArrayList<Orders> list){
        //Build reader instance
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',', '"', 1);
        //Read all rows at once
        List<String[]> allRows = reader.readAll();
        //Read CSV line by line and use the string array as you want
        for(String[] row : allRows){
            System.out.println(Arrays.toString(row));
    }
}
