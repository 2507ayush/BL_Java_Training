package Factory.Abstract;

public class Client {
    public static void main(String[] args) {
        Factory factory = new WindowsFactory();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();

        Factory factory1 = new MacFactory();
        Button button1 = factory1.createButton();
        CheckBox checkBox1 = factory1.createCheckBox();
        button1.paint();
        checkBox1.paint();
    }
}
