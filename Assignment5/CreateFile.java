import java.util.Scanner;
import java.io.*;

public class CreateFile 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter myOutput = new FileWriter("command_line_input.txt");
		PrintWriter printer = new PrintWriter(myOutput);
		Scanner input = new Scanner(System.in);
		String myInput = "";
		while(true)
		{
			myInput = input.next();
			if(myInput.equals("@q"))
				break;
			printer.println(myInput);	
		}
		input.close();
		printer.close();
		myOutput.close();
	}
}
