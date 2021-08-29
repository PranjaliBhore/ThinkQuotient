package javamorning;

public class StaticVariable
{
		int rollno;
		String name;
		static String college ="mno";
		StaticVariable(int r, String n)
		{
			rollno=r;
			name=n;
		}
		void display()
		{
			System.out.println(rollno+""+name+""+college);
		}
		public class Test
		{
			public void main(String args[])
			{
			StaticVariable s1 = new StaticVariable(10,"rst");
			StaticVariable s2 = new StaticVariable(12,"xyz");
			s1.display();
			s2.display();
			}
		}
		}


