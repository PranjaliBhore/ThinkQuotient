package javamorning;

public class exceptionfinally
	
	{
		
	public static void main(String args[])
	{
		int a=50,b=10,res;
		try
		{
			//a=Integer.parseInt(args[0]);
			//b=Integer.parseInt(args[1]);
			res=a/b;
			System.out.println("division is:" +res);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("insufficient arguments");
		}
		
		finally
		{
			res=a+b;
			System.out.println("Addition is" +res);
		
	}
	}
		
	}



