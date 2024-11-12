package internal;

import javax.swing.*;
import java.awt.event.*;

public class FactorialSwingApp extends JFrame implements ActionListener {
    private JTextField t1, t2;
    private JLabel l1, l2, l3;
    private JButton b1;

    public FactorialSwingApp() {
        // Set up the frame
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create components
        l1 = new JLabel("Factorial of a Number");
        l2 = new JLabel("Enter Number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Compute");

        // Set bounds for components
        l1.setBounds(80, 10, 150, 20);
        l2.setBounds(30, 40, 100, 20);
        t1.setBounds(140, 40, 100, 20);
        l3.setBounds(30, 70, 100, 20);
        t2.setBounds(140, 70, 100, 20);
        b1.setBounds(100, 110, 100, 30);

        // Make the result field non-editable
        t2.setEditable(false);

        // Add components to the frame
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);

        // Add action listener to the button
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n = Integer.parseInt(t1.getText());
            int fact = 1;
            for (int i = n; i > 1; i--) {
                fact *= i;
            }
            t2.setText(String.valueOf(fact));
        } catch (NumberFormatException e) {
            t2.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        FactorialSwingApp app = new FactorialSwingApp();
        app.setVisible(true);
    }
}
