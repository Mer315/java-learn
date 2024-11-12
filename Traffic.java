package internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Traffic extends JFrame implements ItemListener {
    private JLabel l1, l2;
    private JRadioButton r1, r2, r3;
    private ButtonGroup bg;

    public Traffic() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setSize(800, 400);

        // Initialize the main label
        l1 = new JLabel();
        Font f = new Font("Verdana", Font.BOLD, 60);
        l1.setFont(f);
        l1.setHorizontalAlignment(JLabel.CENTER); // Center the text
        add(l1);

        // Panel for the radio buttons
        JPanel p1 = new JPanel(new FlowLayout());
        l2 = new JLabel("Select a Light");
        p1.add(l2);

        // Initialize radio buttons
        r1 = new JRadioButton("Red");
        r1.setBackground(Color.RED);
        r1.setActionCommand("Red");

        r2 = new JRadioButton("Yellow");
        r2.setBackground(Color.YELLOW);
        r2.setActionCommand("Yellow");

        r3 = new JRadioButton("Green");
        r3.setBackground(Color.GREEN);
        r3.setActionCommand("Green");

        // Group the radio buttons
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        // Add radio buttons to the panel
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);

        // Add item listener to the radio buttons
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);

        add(p1);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent i) {
        String selected = bg.getSelection().getActionCommand();
        switch (selected) {
            case "Red":
                l1.setText("Stop");
                l1.setForeground(Color.RED);
                break;
            case "Yellow":
                l1.setText("Ready");
                l1.setForeground(Color.YELLOW);
                break;
            case "Green":
                l1.setText("Go");
                l1.setForeground(Color.GREEN);
                break;
        }
    }

    public static void main(String args[]) {
        new Traffic();
    }
}
