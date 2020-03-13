import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args)
	{
			Scanner input = new Scanner(System.in);
			int myInt = 0;
			while(true)
			{
				if(input.hasNextInt())
				{
					myInt = input.nextInt();
					System.out.println(Integer.toHexString(myInt));
				}else
				{
					if(input.next().equals("@q"))
						break;
					System.out.println("Please input an Integer");
				}
			}
			input.close();
	}
}
	
