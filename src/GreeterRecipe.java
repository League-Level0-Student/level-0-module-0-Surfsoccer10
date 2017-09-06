import javax.swing.JOptionPane;

public class GreeterRecipe {
	// This recipe says "hi" to the user
	public static void main(String[] args) {
		
	
	
String name =JOptionPane.showInputDialog("what is your name?");
	
// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
	
// HINT: Use a variable to store their name
	
	// 4. Use JOptionPane.showMessageDialog to say hi to them, e.g. Hi Jackie
JOptionPane.showMessageDialog(null,"hi " +  name);

}
}