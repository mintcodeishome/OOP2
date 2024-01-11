import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingArrayOperations {
    private static int[] originalArray;
    private static JTextArea outputTextArea;

    public static void main(String[] args) {
        originalArray = new int[15];

        // Create frame
        JFrame frame = new JFrame("Array Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create components
        JLabel titleLabel = new JLabel("Enter 15 integer values:");
        titleLabel.setBounds(10, 10, 200, 20);
        frame.add(titleLabel);

        JTextField[] inputFields = new JTextField[15];
        for (int i = 0; i < 15; i++) {
            inputFields[i] = new JTextField();
            inputFields[i].setBounds(10 + i * 25, 40, 20, 20);
            frame.add(inputFields[i]);
        }

        JButton processButton = new JButton("Process");
        processButton.setBounds(150, 70, 100, 30);
        frame.add(processButton);

        outputTextArea = new JTextArea();
        outputTextArea.setBounds(10, 110, 360, 120);
        outputTextArea.setEditable(false);
        frame.add(outputTextArea);

        // Add action listener to the button
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processArrayOperations(inputFields);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void processArrayOperations(JTextField[] inputFields) {
        // a) Store values in the array
        for (int i = 0; i < 15; i++) {
            originalArray[i] = Integer.parseInt(inputFields[i].getText());
        }

        // b) Print the values stored in the array on the screen
        outputTextArea.append("Values stored in the array:\n");
        for (int value : originalArray) {
            outputTextArea.append(value + " ");
        }

        // c) Ask the user to enter a number and check if it is present in the array
        int targetNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to check:"));
        boolean found = false;
        int index = -1;

        for (int i = 0; i < 15; i++) {
            if (originalArray[i] == targetNumber) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            outputTextArea.append("\nThe number found at index " + index);
        } else {
            outputTextArea.append("\nNumber not found in this array");
        }

        // d) Create another array, copy elements in reverse order, and print
        int[] reversedArray = new int[15];
        for (int i = 0, j = 14; i < 15; i++, j--) {
            reversedArray[j] = originalArray[i];
        }

        outputTextArea.append("\nElements of the new array in reverse order:\n");
        for (int value : reversedArray) {
            outputTextArea.append(value + " ");
        }

        // e) Get the sum and product of all elements of the array
        int sum = 0;
        int product = 1;

        for (int value : originalArray) {
            sum += value;
            product *= value;
        }

        outputTextArea.append("\nSum of all elements: " + sum + "\n");
        outputTextArea.append("Product of all elements: " + product + "\n");
    }
}
