import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	
	// 2. Add a main method
	
	// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
String forst =JOptionPane.showInputDialog("What is your name");
	// HINT: Use a variable to store their name
	
	// 4. Use JOptionPane.showMessageDialog to tell them you know what they did last summer,
	JOptionPane.showMessageDialog(null, "I know what you did last summer");
	// e.g.  I know that you [activity] last summer, [name]. Muhahaha!
	JOptionPane.showMessageDialog(null, "I know that you when to the beach," + forst +  "Muhahaha" );

	
	
	
	
	
}
}
