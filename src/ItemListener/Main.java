package ItemListener;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ItemListener app = new ItemListener();
        app.setContentPane(app.getPanel1());
        app.setSize(500,300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}