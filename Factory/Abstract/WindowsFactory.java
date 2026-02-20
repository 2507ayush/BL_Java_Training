package Factory.Abstract;

import java.awt.*;

public class WindowsFactory implements Factory{


    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }




}
