package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday=JOptionPane.showInputDialog("When is your birthday?");
		if(birthday.equals("12/3")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
			
		}
		
		if(!birthday.equals("12/3")) { 
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
			
		}
		
		
		
	}
}
		
		
			
		
	



