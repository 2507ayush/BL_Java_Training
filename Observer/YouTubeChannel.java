package Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();
    String title;

    @Override
    public void Subscribe(Observer ob) {
        subscribers.add(ob);
    }

    @Override
    public void UnSubscribe(Observer ob) {
        subscribers.remove(ob);
    }


    @Override
    public void notifyChanges() {

        for (Observer o : subscribers) {
            o.notified(" Design Principles");
        }

    }
}
