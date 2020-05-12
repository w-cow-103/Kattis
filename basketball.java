// Will Cowden
// https://open.kattis.com/problems/basketballoneonone
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class basketball
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String score = file.next();
		int a = 0, b = 0;
		for (int x = 0; x != score.length();x+=2)
		{
			if (score.substring(x,x+1).equals("A"))
				a+=Integer.parseInt(score.substring(x+1,x+2));
			else
				b+=Integer.parseInt(score.substring(x+1,x+2));
		}
		System.out.println(a>b? "A":"B");
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new basketball().run();
	}	
	
}