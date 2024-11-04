package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorApp extends JFrame {
    private JTextField tfNumber1;
    private JPanel panel1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;

    public SimpleCalculatorApp() throws HeadlessException {
        super("Simple Calculator");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = 0, num2 = 0;
                try{
                    num1 = Double.parseDouble(tfNumber1.getText());
                    num2 = Double.parseDouble(tfNumber2.getText());
                } catch (NumberFormatException exc){
                    JOptionPane.showMessageDialog(null, "Invalid Input: Please enter numbers ");
                    return;
                }
                double result = 0;
                String operation = (String)cbOperations.getSelectedItem();
                switch (operation){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        try {
                            if(num2 == 0) throw new ArithmeticException();
                            result = num1 / num2;
                        } catch (ArithmeticException exc){
                            JOptionPane.showMessageDialog(null, "Cannot Divide by zero!");
                            return;
                        }
                        break;
                }
                lblResult.setText(String.valueOf(result));
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
