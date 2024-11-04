package FoodOrderingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderingSystem() throws HeadlessException {
        super("Food Ordering System");
        JRadioButton[] disconts = {rbNone,rb5,rb10,rb15};
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = 0;
                if(cPizza.isSelected()) value+=100;
                if(cBurger.isSelected()) value+=80;
                if(cFries.isSelected()) value+=65;
                if(cSoftDrinks.isSelected()) value+=55;
                if(cTea.isSelected()) value+=50;
                if(cSundae.isSelected()) value+=40;
                double discount = 0;
                if(rb5.isSelected())discount = 0.05;
                else if(rb10.isSelected())discount = 0.10;
                else if(rb15.isSelected())discount = 0.15;

                double cost = value - (value * discount);
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f",cost));
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
