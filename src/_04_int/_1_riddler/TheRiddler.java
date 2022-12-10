package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=JOptionPane.showInputDialog("what belongs to you but other people use it more than you");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("Your name")) {
	JOptionPane.showMessageDialog(null,"CORRECT");
	 score=score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else{
	JOptionPane.showMessageDialog(null,"WRONG!The correct answer is your name");
}

		// 6. Add some more riddles
answer=JOptionPane.showInputDialog("The more you take the more you leave behind.What is it?");
if(answer.equals("footsteps")){
	JOptionPane.showMessageDialog(null, "Correct");
	score=score+1;
}
else {
	JOptionPane.showMessageDialog(null,"Wrong.The correct answer is footsteps");

}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score);
	}
}

