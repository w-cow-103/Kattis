// Will Cowden
// https://open.kattis.com/problems/savingforretirement
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class savings
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		long diff = file.nextLong() - file.nextLong();
		diff = - diff;
		long quantity1 = file.nextLong();
		
		long age = file.nextLong();
		long quantity2 = file.nextLong();

		System.out.println((int)Math.ceil((double)(diff*quantity1+1)/quantity2)+age);
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new savings().run();
	}	
	
}