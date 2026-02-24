package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student1 {
    public int id;
    public String name;
    public int marks;
}

public class WritingJSON {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        ObjectMapper mapper = new ObjectMapper();

        List<Student1> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student1 st = new Student1();

            System.out.print("Enter ID: ");
            st.id = Integer.parseInt(reader.readLine());

            System.out.print("Enter Name: ");
            st.name = reader.readLine();

            System.out.print("Enter Marks: ");
            st.marks = Integer.parseInt(reader.readLine());

            students.add(st);
        }

        File file = new File(
                "C:\\Users\\91853\\Desktop\\Magic\\IO Programming\\IO Programming\\src\\JSON\\Data.json"
        );

        mapper.writeValue(file, students);

        Student1[] s1 = mapper.readValue(file, Student1[].class);

        for (Student1 s : s1) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}