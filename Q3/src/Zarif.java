import java.util.*;


class OddAndEven
{
	static int countOfOdd=0;
	static int countOfEven=0;
	public static void addNumber(int n)
	{
		if(n%2==0)
		{
			countOfEven++;
		}
		else
		{
			countOfOdd++;
		}
	}
	public String toString() {
		return "Number of Odd: " + countOfOdd + " , Number of Even: "+countOfEven;
	}
	
	
}


class TestOddAndEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		OddAndEven obj=new OddAndEven(); //object creation
		while(true)
		{
			String temp; //for taking input as string
			System.out.print("Enter Number: ");
			temp=sc.next();
			if(temp.charAt(0)=='Q' || temp.charAt(0)=='q') //if user enters Q or q break the loop
			{
				break;
			}
			else
			{
				int num=Integer.parseInt(temp); //convert string to int
				obj.addNumber(num); //method call
			}
		}
		
		System.out.println(obj.toString()); //print to string method
	}

}