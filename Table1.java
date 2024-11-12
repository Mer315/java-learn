package internal;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Table1 extends JFrame {

    public Table1() {
        setTitle("Table Display");
        setSize(600, 600);
        setLayout(new BorderLayout()); // Use BorderLayout to organize components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel for the table data
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(0, 4)); // Adjust the number of columns as needed

        try {
            FileInputStream fin = new FileInputStream("\"C:\\Users\\ssume\\eclipse-workspace\\internal practice\\bin\\internal\\sample.txt\"");
            Scanner sc = new Scanner(fin);
            
            // Read the header line and display it
            if (sc.hasNextLine()) {
                String headerLine = sc.nextLine();
                String[] headers = headerLine.split(",");
                for (String header : headers) {
                    tablePanel.add(new JLabel(header.trim(), JLabel.CENTER)); // Trim and add header
                }
            }
            
            // Read the data lines and display them
            while (sc.hasNextLine()) {
                String dataLine = sc.nextLine();
                String[] data = dataLine.split(",");
                for (String item : data) {
                    tablePanel.add(new JLabel(item.trim(), JLabel.CENTER)); // Trim and add data
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not found: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        JScrollPane scrollPane = new JScrollPane(tablePanel); // Add scroll pane to handle large content
        add(scrollPane, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Table1(); // Create an instance of Table1 to display the frame
    }
}
