import java.io.*;

public class ReadFileInput 
{
	public static void main(String[] args) {
		try {
			int i;
			FileReader myReader = new FileReader("quote.txt");
			while((i = myReader.read()) != -1)
			{
				System.out.print((char)i);
			}
			myReader.close();
		}catch(IOException err)
		{
			System.out.print("File is invalid");
		}
	}
}
