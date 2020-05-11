// Will Cowden
// https://open.kattis.com/problems/listgame
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aGame
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		long temp = file.nextLong();
		int rtn = 1;
		int pos = 2;
	    while (temp >= pos*pos)
	    {
	        if (temp % pos == 0)
	        {
	            temp /= pos;
	            rtn++;
	        }
	        else
	        	pos++;
	    }
	    System.out.println(rtn);
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new aGame().run();
	}	
	
}