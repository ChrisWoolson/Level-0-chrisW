import javax.swing.JOptionPane;

public class SummerTime {
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("what is your name?");
	String grade= JOptionPane.showInputDialog("What grade are you going into?");
	String activity= JOptionPane.showInputDialog("What is your favorite activity this summer?");
	
	JOptionPane.showMessageDialog(null, "Hi, " +name+ "! Are you excited to be going into " +grade+ " grade? I love that you like to " +activity+ " during the summer! I love "+activity+" too!");
	
	
}
}
