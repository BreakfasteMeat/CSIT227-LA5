package MostFrequentCharacter;

import javax.swing.*;

public class Main{
	public static void main(String[] args){
		MostFrequentCharacter app = new MostFrequentCharacter();
		app.setContentPane(app.getPanel1());
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		app.setSize(300,300);
		app.setVisible(true);
	}
}
