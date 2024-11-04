package KeyEventActivity;

import javax.swing.*;

public class Main{
	public static void main(String[] args){
		KeyEventActivity app = new KeyEventActivity();
		app.setContentPane(app.getPanel1());
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		app.setSize(400,300);
		app.setVisible(true);
	}
}
