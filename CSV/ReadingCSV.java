package CSV;
import java.io.*;
public class ReadingCSV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\CSV\\Data.csv"));
        String line;

        while((line=br.readLine())!=null){
            String[] data = line.split(",");
            System.out.println("Id - " + data[0] + " Name - " + data[1] + " Marks - " + data[2]);
        }
        br.close();
    }
}
