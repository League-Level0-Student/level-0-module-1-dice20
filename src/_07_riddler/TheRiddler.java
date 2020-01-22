package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
int score = 0;
		// 1. Make a variable to hold the score
String answer=JOptionPane.showInputDialog("A basket contains 5 apples. Do you know how to divide them among 5 kids so that each one has an apple and one apple stays in the basket?");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
if(answer.equals("4 kids get an apple and the fifth kid gets an apple with the basket still containing the apple.")) {
	score=score+100;
JOptionPane.showMessageDialog(null,"correctamento");
	
	
}else{	
	
JOptionPane.showMessageDialog(null, "incorect");	
	
	




}

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"your score is "+ score);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}