package Observer;

public class Subscribers implements Observer {

    String name;


    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " new Video Uploaded :" + title);
    }
}
