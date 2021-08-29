package javamorning;

 class superkeyword
 {
 int a;
}
class fun extends superkeyword
{
	int a;
	void display()
	{
		a=10;
		super.a=5;
		System.out.println("a:"+a);
		System.out.println("super.a:"+super.a);	
	}
}
class derived
{
	public static void main(String args[])
	{
		fun obj=new fun();
		obj.display();
	}
}