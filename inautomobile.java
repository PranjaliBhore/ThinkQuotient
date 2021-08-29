package javamorning;

public class inautomobile 
{
	private int speed;
	private String colour;
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	
	
	static class bike extends inautomobile{
		
		
	}
	 static class ktm extends bike{
		
	}
	
	public static void main(String args[])
	{
	ktm obj1=new ktm();
	obj1.setSpeed(90);
    obj1.setColour("orange");
		System.out.println(obj1.getSpeed());
		System.out.println(obj1.getColour());
		System.out.println("this is ktm class");
	}
	
	
	
	}
	



}
