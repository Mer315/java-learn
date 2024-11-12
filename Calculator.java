package internal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    String msg = " ";
    int p, q, result;
    JTextField t1;
    JButton[] b = new JButton[10];
    JButton add, sub, mul, div, clear, mod, EQ;
    char OP;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));

        // Create text field
        t1 = new JTextField(10);
        add(t1);

        // Create buttons 0-9
        for (int i = 0; i < 10; i++) {
            b[i] = new JButton("" + i);
            b[i].addActionListener(this);
            add(b[i]);
        }

        // Create operator buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        clear = new JButton("Clear");
        EQ = new JButton("=");

        // Add action listeners to operator buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);

        // Add operator buttons to the frame
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQ);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);

        // Handle digit input
        if (Character.isDigit(ch)) {
            t1.setText(t1.getText() + str);
        }
        // Handle operator buttons
        else if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
            if (!t1.getText().equals("")) {  // Only proceed if there's something in the text field
                p = Integer.parseInt(t1.getText());
                OP = str.charAt(0);  // Store the operator
                t1.setText("");  // Clear the text field for next input
            }
        }

        // Handle "=" button to perform the calculation
        if (str.equals("=")) {
            if (!t1.getText().equals("")) {  // Only proceed if there's a value to calculate
                q = Integer.parseInt(t1.getText());
                switch (OP) {
                    case '+':
                        result = p + q;
                        break;
                    case '-':
                        result = p - q;
                        break;
                    case '*':
                        result = p * q;
                        break;
                    case '/':
                        try {
                            result = p / q;
                        } catch (ArithmeticException e) {
                            t1.setText("Error");
                            System.out.println("Division by zero not possible");
                            return;
                        }
                        break;
                    case '%':
                        result = p % q;
                        break;
                }
                t1.setText("" + result);
                OP = ' ';  // Reset the operator after calculation
            }
        }

        // Handle Clear button
        if (str.equals("Clear")) {
            t1.setText("");
            p = q = result = 0;  // Reset all values
            OP = ' ';  // Reset operator
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }
}
