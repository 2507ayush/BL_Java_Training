package CSV;
import java.io.*;
public class ValidateCSV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\CSV\\Data.csv"));
        String line;
        line = br.readLine();
        String[] lineArray = line.split(",");
        if(lineArray.length!=3){
            System.out.println("Invalid row");
        }
        if(lineArray[2].matches("[0-9]+")){
            System.out.println("Correct Numbers");
        }
        br.close();
    }
}