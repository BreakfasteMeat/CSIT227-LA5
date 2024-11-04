package LeapYearChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField yearTextField;
    private JPanel panel1;
    private JButton checkYearButton;

    public LeapYearChecker() throws HeadlessException {
        super("Leap Year Checker");
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = 0;
                try {
                    year = Integer.parseInt(yearTextField.getText());
                } catch (NumberFormatException exc){
                    JOptionPane.showMessageDialog(null, "Enter valid year");
                    return;
                }

                boolean isLeapYear = false;

                if (year % 4 == 0) {

                    if (year % 100 == 0) {

                        if (year % 400 == 0)
                            isLeapYear = true;
                        else
                            isLeapYear = false;
                    } else
                        isLeapYear = true;
                }

                String message = "";
                if(isLeapYear) message = "Leap year";
                else message = "Not a leap year";
                JOptionPane.showMessageDialog(null, message);
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
