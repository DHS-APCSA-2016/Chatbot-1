import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class Chatbot
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Books book = new Books();
		
		System.out.println (book.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.toLowerCase().equals("bye"))
		{
			System.out.println (book.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
