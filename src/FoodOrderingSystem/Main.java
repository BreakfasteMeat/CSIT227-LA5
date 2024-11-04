package FoodOrderingSystem;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.getPanel1());
        app.setSize(500,350);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}