package Factory.Simple;

//This is the main Factory Design Pattern Class.
public class EmployeeFactory {

    public static Employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(type.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        else{
            return null;
        }
    }
}
