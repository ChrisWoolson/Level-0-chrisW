import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy= JOptionPane.showInputDialog("Are You Happy?");
		
		if(happy.equals ("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		
		
		
		
		if(happy.equals("no")){
		String want =JOptionPane.showInputDialog("Do you want to be happy?");
		
		if(want.equals("yes")){
			JOptionPane.showMessageDialog(null, "Change Something");
		}
		
	
		if(want.equals("no")){
			JOptionPane.showMessageDialog(null, "Keep Doing what you're doing");
		
		
		
		
	
}}
}}