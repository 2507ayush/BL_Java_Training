package Factory.Simple;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.getSalary());

        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee2.getSalary());
    }
}
