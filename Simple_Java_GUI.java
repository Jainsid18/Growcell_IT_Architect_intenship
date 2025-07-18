import java.lang.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  

public class Simple_Java_GUI extends JFrame implements ActionListener {
    private JTextField txt1;
    private JButton btn1;

    public Simple_Java_GUI(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setBounds(100, 100, 500, 100);

        JLabel lbl1 = new JLabel("Enter Your Name");   
        txt1 = new JTextField(30);
        btn1 = new JButton("Greet Person");

        btn1.addActionListener(this); 

        add(lbl1);
        add(txt1);
        add(btn1);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String PersonName = txt1.getText().trim();
        if (PersonName.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Enter your Name",
                "Input Missing",
                JOptionPane.ERROR_MESSAGE
            );
            txt1.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Welcome " + PersonName,
                "Greetings",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new Simple_Java_GUI("Simple Greeting App")
        );
    }
}
