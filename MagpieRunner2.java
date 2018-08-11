import javax.swing.JOptionPane;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();

		String response = maggie.getGreeting();
		String statement = JOptionPane.showInputDialog(response);

		while (!statement.equals("Bye"))
		{
			response = maggie.getResponse(statement);
			statement = JOptionPane.showInputDialog(response);
		}
	}

}