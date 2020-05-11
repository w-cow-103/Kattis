import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

/*

3
iloveyouJack
iloveyoutooJill
TheContestisOver

*/
			//change the class name
public class Secret
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf!=times; asdf++)
		{
			String str = file.nextLine();
			
			double num = Math.pow(str.length(),0.5);
			int square = (int)Math.ceil(num);
			
			char[][] arr = new char[square][square];
			
			
			int pos = 0;
			for (int x = 0; x != square;x++)
			{
				for (int y = 0; y != square;y++)
				{
					if (pos >= str.length())
						arr[x][y] = '*';
					else
						arr[x][y] = str.charAt(pos++);
				}
			}
			
			String rtn = "";
			for (int y = 0; y != square;y++)
			{
				for (int x = square-1; x != -1;x--)
				{
					String temp = arr[x][y] + "";
					if (! temp.equals("*"))
						rtn+=temp;
					
				}
			}
			
			System.out.println(rtn);

		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Secret().run();
	}	
	
}