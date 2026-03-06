package Student;
import java.util.*;
public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Student Management System");
            System.out.println("Enter 1 to Add Student");
            System.out.println("Enter 2 to Delete Student");
            System.out.println("Enter 3 to Display Students");
            System.out.println("Enter 4 to Update Student Details");
            System.out.println("Enter 5 to Exit");

            int ch =  sc.nextInt();
            sc.nextLine();
            if(ch==1){
                System.out.println("Enter Student Name");
                String name = sc.nextLine();
                System.out.println("Enter Student Phone Number");
                String phone = sc.nextLine();
                System.out.println("Enter Student City Name");
                String city = sc.nextLine();

                Student st = new Student(name,phone,city);
                boolean ans = Operations.insertStudent(st);
                if(ans){
                    System.out.println("Student Added");
                }
                else{
                    System.out.println("Something Went Wrong");
                }

            }
            else if(ch==2){
                System.out.println("Enter Student Id = ");
                int id = sc.nextInt();
                boolean ans = Operations.deleteStudent(id);
                if(ans){
                    System.out.println("Student Deleted");
                }
                else{
                    System.out.println("Something Went Wrong");
                }
            }
            else if(ch==3){
                Operations.Display();
            }
            else if(ch==4){
                System.out.println("Enter Student ID for Update= ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter New Name = ");
                String name = sc.nextLine();
                System.out.println("Enter New Phone Number");
                String phone = sc.nextLine();
                System.out.println("Enter New City Name");
                String city = sc.nextLine();
                boolean ans = Operations.UpdateDetails(id,name,phone,city);
                if(ans){
                    System.out.println("Student Details Updated");
                }
                else{
                    System.out.println("Something Went Wrong");
                }
            }
            else{
                break;
            }
        }
        System.out.println("Thank you for using the App!");
    }
}
