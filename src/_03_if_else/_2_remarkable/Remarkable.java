package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String a="A is smart";
	String b="B is kind";
	String c="C is funny";

		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name=JOptionPane.showInputDialog("Please enter a name:A,B,or C");

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	if(name.equals("A")) {
		JOptionPane.showMessageDialog(null, a );
	}
	if(name.equals("B")) {
		JOptionPane.showMessageDialog(null,b );
	}
	if(name.equals("C")) {
		JOptionPane.showMessageDialog(null, c);
		}
	}
		
	}
	


