package Observer;


public class User {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        Subscribers Aman = new Subscribers("Aman");
        Subscribers Manan = new Subscribers("Manan");
        youTubeChannel.Subscribe(Aman);
        youTubeChannel.Subscribe(Manan);
        youTubeChannel.notifyChanges();
        youTubeChannel.UnSubscribe(Aman);
        youTubeChannel.notifyChanges();
    }
}
