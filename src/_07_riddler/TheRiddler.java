package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {
		int score = 1000;
		// 1. Make a variable to hold the score
		String answer = JOptionPane.showInputDialog(
				"A basket contains 5 apples. Do you know how to divide them among 5 kids so that each one has an apple and one apple stays in the basket?");
// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		if (answer.equals("make a pie with all 4 apples")) {
			score = score + 1000;
			JOptionPane.showMessageDialog(null, "correctamento");

		} else {
			score = score - 500;
			JOptionPane.showMessageDialog(null, "incorect the answer is you make a pie with all 4 apples");

		}

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one thousand

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	

int score2 = score;

String riddle =JOptionPane.showInputDialog("First you jerk me by my ear\r\n" + 
		"Then you kiss me on the lips.\r\n" + 
		"You say I'm hot and hold me near,\r\n" + 
		"Then laugh that I lack shapely hips.\r\n" + 
		"Up and down your silly game\r\n" + 
		"Your passion stirred already,\r\n" + 
		"Whether mood be light or dark -\r\n" + 
		"Just try to hold me steady!");




if (riddle.equals ("a mug of coffee")) {
	
	
	JOptionPane.showMessageDialog(null, "correctamento");

	
	
	
	
	
	score=score+1000;


}else {
	
	score = score - 500;
	JOptionPane.showMessageDialog(null, "incorect the anwser is a mug of coffee");


JOptionPane.showMessageDialog(null, "your score is " + score);
}
}}