package CSV;
import java.io.*;
public class WritingCSV {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\CSV\\Data.csv");
        fw.write("4,Ayush,98\n");
        fw.write("5,Shreyash,99\n");
        fw.close();
    }
}

