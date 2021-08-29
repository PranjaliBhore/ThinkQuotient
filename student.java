package javamorning;


public class student {
	private int rollno;
	private String name;
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	static class person extends student{
		
		
	}
	 static class teacher extends person{
		
	}
	
	public static void main(String args[])
	{
	teacher obj1=new teacher();
	obj1.setRollno(12);
    obj1.setName("xyz");
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());
		System.out.println("teacher at school");
	}
	
	
	
	}
	




