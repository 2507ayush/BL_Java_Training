package Builder;

public class Client {
    public static void main(String[] args) {
         User user = new User.UserBuilder().setUserName("Ayushman Verma").setUserID("123").setEmail("abc@gmail.com").createUser();
        System.out.println(user);

    }
}
