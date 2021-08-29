package javamorning;

public class constructor
{
	private String company;
	private int price;
	private String colour;
	public  constructor(String pcompany)
	{
		this.company=pcompany;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	 public  constructor(int sprice)
	{
		this.price=sprice;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void constructor(String rcolour)
	{
		this.colour=rcolour;
	}
	
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	


public static void main(String args[]) {
	constructor obj1=new constructor("samsung");
	constructor obj2 =new constructor(20000);
	 constructor obj3 =new constructor("black");
	System.out.println( obj1.getCompany());
	System.out.println(obj2.getPrice());
	System.out.println(obj2.getColour());
	
	
}
}



