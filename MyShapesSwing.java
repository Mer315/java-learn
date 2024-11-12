package internal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class Shape {
    public int x, y;
    public abstract void printArea(JTextArea areaText);
}

class Rectangle extends Shape {
    public void printArea(JTextArea areaText) {
        float area = x * y;
        areaText.append("Area of Rectangle is: " + area + "\n");
    }
}

class Triangle extends Shape {
    public void printArea(JTextArea areaText) {
        float area = (x * y) / 2.0f; // Use 2.0f to ensure float division
        areaText.append("Area of Triangle is: " + area + "\n");
    }
}

class Circle extends Shape {
    public void printArea(JTextArea areaText) {
        float area = (float) (Math.PI * x * x); // Use Math.PI for more accuracy
        areaText.append("Area of Circle is: " + area + "\n");
    }
}

public class MyShapesSwing {
    public static void main(String[] args) {
        // Set up the JFrame
        JFrame frame = new JFrame("Shape Area Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create UI components
        JLabel baseLabel = new JLabel("Enter the base:");
        JTextField baseField = new JTextField(10);
        JLabel heightLabel = new JLabel("Enter the height (or radius for Circle):");
        JTextField heightField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Area");
        JTextArea areaText = new JTextArea(10, 30);
        areaText.setEditable(false);

        // Add components to the frame
        frame.add(baseLabel);
        frame.add(baseField);
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(calculateButton);
        frame.add(new JScrollPane(areaText)); // Make JTextArea scrollable

        // Set up event listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Read input values
                    int base = Integer.parseInt(baseField.getText());
                    int height = Integer.parseInt(heightField.getText());

                    // Create instances of each shape
                    Rectangle rectangle = new Rectangle();
                    rectangle.x = base;
                    rectangle.y = height;

                    Triangle triangle = new Triangle();
                    triangle.x = base;
                    triangle.y = height;

                    Circle circle = new Circle();
                    circle.x = base; // Use base as radius for Circle

                    // Calculate and display the areas in the text area
                    areaText.setText(""); // Clear previous output
                    rectangle.printArea(areaText);
                    triangle.printArea(areaText);
                    circle.printArea(areaText);

                } catch (NumberFormatException ex) {
                    areaText.setText("Please enter valid numeric values.");
                }
            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
