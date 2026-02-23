package Observer;

interface Subject {
    void Subscribe(Observer ob);
    void UnSubscribe(Observer ob);

    void notifyChanges();
}
