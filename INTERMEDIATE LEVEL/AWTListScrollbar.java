import java.awt.*;
import java.awt.event.*;

public class AWTListScrollbar extends Frame implements AdjustmentListener, ActionListener {
    List list;
    Scrollbar scrollbar;
    Label label;

    AWTListScrollbar() {
        setLayout(new FlowLayout());

        list = new List(5);
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");

        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 100);
        label = new Label("Interact with List or Scrollbar");

        add(list);
        add(scrollbar);
        add(label);

        list.addActionListener(this);
        scrollbar.addAdjustmentListener(this);

        setSize(350,250);
        setTitle("List & Scrollbar Example");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Selected: " + list.getSelectedItem());
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        label.setText("Scrollbar Value: " + scrollbar.getValue());
    }

    public static void main(String[] args) {
        new AWTListScrollbar();
    }
}

