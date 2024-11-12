package internal;
import javax.swing.*;
import java.awt.event.*;

public class IntegerDivisionSwingApp extends JFrame implements ActionListener {
    private JTextField t1, t2, t3;
    private JButton divideButton;
    private JLabel L1, L2, L3, L4;

    public IntegerDivisionSwingApp() {
        // Set up the frame
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize text fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false); // Make result field non-editable

        // Initialize labels and button
        L1 = new JLabel("Enter Num1:");
        L2 = new JLabel("Enter Num2:");
        L3 = new JLabel("Result:");
        L4 = new JLabel("Division of Two Numbers");
        divideButton = new JButton("Divide");

        // Set bounds for components
        L4.setBounds(80, 10, 200, 20);
        L1.setBounds(30, 40, 100, 20);
        t1.setBounds(140, 40, 100, 20);
        L2.setBounds(30, 70, 100, 20);
        t2.setBounds(140, 70, 100, 20);
        L3.setBounds(30, 100, 100, 20);
        t3.setBounds(140, 100, 100, 20);
        divideButton.setBounds(100, 130, 100, 30);

        // Add components to the frame
        add(L4);
        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(L3);
        add(t3);
        add(divideButton);

        // Add action listener for the button
        divideButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            if (num2 == 0) {
                JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                t3.setText("");
            } else {
                int result = num1 / num2;
                t3.setText(String.valueOf(result));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        IntegerDivisionSwingApp app = new IntegerDivisionSwingApp();
        app.setVisible(true);
    }
}

