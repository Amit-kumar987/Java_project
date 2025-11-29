import java.awt.*;
import java.awt.event.*;

public class AWTCheckbox extends Frame implements ItemListener {
    Checkbox cb1, cb2, cb3;
    Label label;

    AWTCheckbox() {
        setLayout(new FlowLayout());

        cb1 = new Checkbox("Java");
        cb2 = new Checkbox("Python");
        cb3 = new Checkbox("C++");

        label = new Label("Select a language");

        add(cb1);
        add(cb2);
        add(cb3);
        add(label);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        setSize(300,200);
        setTitle("AWT Checkbox Demo");
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selected = "Selected: ";
        if (cb1.getState()) selected += "Java ";
        if (cb2.getState()) selected += "Python ";
        if (cb3.getState()) selected += "C++ ";
        label.setText(selected);
    }

    public static void main(String[] args) {
        new AWTCheckbox();
    }
}
