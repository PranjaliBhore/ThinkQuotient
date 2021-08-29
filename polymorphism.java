package javamorning;

public class polymorphism
{  
		float getRateOfInterest()
		{
			return 0;
			}  
		}  
		class SBI extends polymorphism
		{  
		float getRateOfInterest()
		{
			return 8.4f; 
			}  
		}  
		class ICICI extends polymorphism
		{  
		float getRateOfInterest()
		{
			return 7.3f;
			}  
		}  
		class AXIS extends polymorphism
		{ 
		float getRateOfInterest()
		{
			return 9.7f;
			}  
		}  
		class TestPolymorphism
		{  
		public static void main(String args[])
		{  
		polymorphism b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		}  
		}  

