import javax.swing.JOptionPane;

public class unbday {
public static void main(String[] args) {
	String bday =JOptionPane.showInputDialog("what is your birthday");
	
	if("11/12".equals(bday)) {
		
		JOptionPane.showMessageDialog(null,"Happy Birthday");
	} else {
		
		JOptionPane.showMessageDialog(null,"happy unbirthbay");
		
	}
	
	


}
}