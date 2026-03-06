package Student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Operations {
    public static boolean insertStudent(Student student) {
        boolean f =false;
        try{
            Connection con = CP.createC();
            String q = "insert into students(sname,sphone,scity) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, student.getStudentName());
            pstmt.setString(2, student.getStudentPhone());
            pstmt.setString(3, student.getStudentCity());

            pstmt.executeUpdate();
            f=true;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int id) {
        boolean f =false;
        try{
            Connection con = CP.createC();
            String q = "delete from students where sid = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, id);


            pstmt.executeUpdate();
            f=true;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void Display() {
        try{
            Connection con = CP.createC();
            String q = "select * from students";
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(q);

            while(set.next()){
                int id = set.getInt("sid");
                String sname = set.getString("sname");
                String sphone = set.getString("sphone");
                String scity = set.getString("scity");

                System.out.println("Student ID: " + id);
                System.out.println("Student Name: " + sname);
                System.out.println("Student Phone Number: " + sphone);
                System.out.println("Student City: " + scity);
                System.out.println("+++++++++++++++++++++++++++++++++");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean UpdateDetails(int id,String name,String phone,String city) {
        boolean f =false;
        try{
            Connection con = CP.createC();
            String q = "update students set sname=?, sphone=?, scity=? where sid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,phone);
            pstmt.setString(3,city);
            pstmt.setInt(4,id);

            pstmt.executeUpdate();
            f=true;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return f;

    }
}
