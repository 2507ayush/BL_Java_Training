package Student;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    static Connection con;
    public static Connection createC(){

        try{
            //Load the Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","Maan","AyushmanVerma");

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
