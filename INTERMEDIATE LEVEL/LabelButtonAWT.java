import java.awt.*;
import java.awt.event.*;

public class LabelButtonAWT extends Frame implements ActionListener {
    Label label;
    Button button;

    LabelButtonAWT() {
        setLayout(new FlowLayout());

        label = new Label("Click the button");
        button = new Button("Click Me");

        add(label);
        add(button);

        button.addActionListener(this);

        setSize(300,150);
        setTitle("AWT Label & Button");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button was clicked!");
    }

    public static void main(String[] args) {
        new LabelButtonAWT();
    }
}
