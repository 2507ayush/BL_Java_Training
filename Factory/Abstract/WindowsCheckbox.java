package Factory.Abstract;

public class WindowsCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
