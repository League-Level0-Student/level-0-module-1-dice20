package _02_unbirthday;

import javax.swing.JOptionPane;

public class bye {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog(null,"what is your birthday?");
	if(input.equals("10/22")){
			
	JOptionPane.showMessageDialog(null,"happy birthbay ");		
	}			
	else {
		JOptionPane.showMessageDialog(null,"happy unbirthbay");
	}		
}
}
