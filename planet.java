package javamorning;
public class planet {
	private String name;
	private int distance;
	
	public  planet(String pname)
	{
		this.name=pname;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	 public  planet(int sdistance)
	{
		this.distance=sdistance;
	}
	public int getDistance()
	{
		return distance;
	}
	public void setDistance(int distance)
	{
		this.distance=distance;
	}
public static void main(String args[]) {
	planet obj1=new planet("earth");
	planet obj2 =new planet(40);
	 
	System.out.println( obj1.getName());
	System.out.println(obj2.getDistance());
	
	
	
}
}




