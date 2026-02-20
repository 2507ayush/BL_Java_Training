package Factory.Abstract;

public class MacFactory implements Factory {
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckbox();
    }
    @Override
    public Button createButton() {
        return new  MacButton();
    }
}
