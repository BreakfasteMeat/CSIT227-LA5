package SimpleCalculator;

import LeapYearChecker.LeapYearChecker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SimpleCalculatorApp app = new SimpleCalculatorApp();
        app.setContentPane(app.getPanel1());
        app.setSize(700,300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}