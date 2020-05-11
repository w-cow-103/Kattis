// Will Cowden
// https://open.kattis.com/problems/softpasswords
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class password
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String org = file.next();
		String upd = file.next();
		
		if (org.length() == upd.length() && (org.equals(upd) || flipCase(org).equals(upd)))
			System.out.println("Yes");
		else if (org.length() == upd.length()+1)
		{
			//System.out.println(1);
			if ((org.charAt(0) == upd.charAt(0) && Character.isDigit(org.charAt(org.length()-1))) || (Character.isDigit(org.charAt(0))))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No");
		
	}
	
	
	public String flipCase(String str)
	{
		String rtn = "";
		for (int x = 0 ;x != str.length(); x++)
		{
			String temp = str.substring(x,x+1);
			if (str.charAt(x) > 96) rtn+=temp.toUpperCase();
			else rtn+=temp.toLowerCase();
		}
		return rtn;
	}

	public static void main(String[] args) throws Exception
	{
		new password().run();
	}	
	
}