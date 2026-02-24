package CSV;
import java.io.*;
public class ParsingCSV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\CSV\\Data.csv"));
        String line;

        line = br.readLine();
        String[] parts = line.split(",");

        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int marks = Integer.parseInt(parts[2]);

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        br.close();

    }
}
