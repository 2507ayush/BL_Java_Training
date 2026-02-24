package JSON;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Student
{
    public int id;
    public String name;
    public int marks;
}

public class ReadingJSON {
    public static void main(String[] args) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Student[] s = mapper.readValue(new File("C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\JSON\\Data.json"),Student[].class);
        for(Student s1 : s){
            System.out.println(s1.name + " " + s1.marks);
        }

    }
}
