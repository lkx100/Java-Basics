import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JTextField textField;
    private JLabel displayLabel;
    
    public SimpleGUI() {
        // Set up the frame
        setTitle("Simple GUI Example");
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 150);
        
        // Create components
        textField = new JTextField(20);
        displayLabel = new JLabel("Enter text and click the button");
        JButton button = new JButton("Display Text");
        
        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                displayLabel.setText(inputText);
            }
        });
        
        // Add components to frame
        add(textField);
        add(button);
        add(displayLabel);
        
    }
    
    public static void main(String[] args) {
        // Create and display the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUI().setVisible(true);
            }
        });
    }
}