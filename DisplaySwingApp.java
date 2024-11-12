package internal;

import javax.swing.*;
import java.awt.*;

public class DisplaySwingApp extends JFrame {

    public DisplaySwingApp() {
        // Set up the frame
        setTitle("Display Swing App");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel with specified background color
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        
        // Create a label with specified foreground color
        JLabel label = new JLabel("Welcome to Swing");
        label.setForeground(Color.BLUE);
        
        // Add label to the panel
        panel.add(label);
        
        // Add panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        DisplaySwingApp app = new DisplaySwingApp();
        app.setVisible(true);
    }
}
