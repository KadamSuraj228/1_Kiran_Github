package Sample1;

public class Demo1 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		int temp;
		
		System.out.println("Value of num1="+num1+"\n value of num2="+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Value of num1="+num1+"\n value of num2="+num2);
		
		
	}

}
