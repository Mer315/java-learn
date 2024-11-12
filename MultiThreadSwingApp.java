package internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Even implements Runnable {
    private final int x;
    private final JTextArea outputArea;

    public Even(int x, JTextArea outputArea) {
        this.x = x;
        this.outputArea = outputArea;
    }

    public void run() {
        outputArea.append("Thread " + x + " is EVEN. Square of " + x + " is: " + (x * x) + "\n");
    }
}

class Odd implements Runnable {
    private final int x;
    private final JTextArea outputArea;

    public Odd(int x, JTextArea outputArea) {
        this.x = x;
        this.outputArea = outputArea;
    }

    public void run() {
        outputArea.append("Thread " + x + " is ODD. Cube of " + x + " is: " + (x * x * x) + "\n");
    }
}

public class MultiThreadSwingApp extends JFrame implements ActionListener {
    private final JTextArea outputArea;
    private final JButton startButton;

    public MultiThreadSwingApp() {
        // Set up the frame
        setTitle("MultiThread Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize output area and button
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        startButton = new JButton("Start Generating Numbers");
        startButton.addActionListener(this);
        add(startButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        outputArea.setText(""); // Clear previous output
        new NumberGeneratorThread(outputArea).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MultiThreadSwingApp app = new MultiThreadSwingApp();
            app.setVisible(true);
        });
    }
}

class NumberGeneratorThread extends Thread {
    private final JTextArea outputArea;

    public NumberGeneratorThread(JTextArea outputArea) {
        this.outputArea = outputArea;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            SwingUtilities.invokeLater(() -> outputArea.append("Generated Number: " + num + "\n"));

            if (num % 2 == 0) {
                Thread evenThread = new Thread(new Even(num, outputArea));
                evenThread.start();
            } else {
                Thread oddThread = new Thread(new Odd(num, outputArea));
                oddThread.start();
            }

            try {
                Thread.sleep(1000); // Pause for 1 second between generations
                SwingUtilities.invokeLater(() -> outputArea.append("--------------------------------------\n"));
            } catch (InterruptedException ex) {
                SwingUtilities.invokeLater(() -> outputArea.append("Error: " + ex.getMessage() + "\n"));
            }
        }
    }
}
