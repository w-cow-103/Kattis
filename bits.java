// Will Cowden
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bits
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int times = file.nextInt(); 

		for(int asdf = 0; asdf!=times; asdf++)
		{
			int num = file.nextInt(), max = 0;
			String curr = Integer.toString(num);
			
			while (true)
			{
				int pos = 0;
				String bin = Integer.toBinaryString(num);
				for (int x = 0; x != bin.length();x++)
				{
					if (bin.charAt(x) == '1')
						pos++;
				}
				if (pos > max) max = pos;
				num /= 10;
				curr = Integer.toString(num);
				if (curr.length()==1 && num == 0)
					break;
			}
			System.out.println(max);
			
			
			
		}
	}

	public static void main(String[] args) throws Exception
	{
		new bits().run();
	}	
	
}