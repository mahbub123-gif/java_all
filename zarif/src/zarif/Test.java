package zarif;


	import java.util.Scanner;
	public class Test {

		static int Sum(int n)throws NegativeNumberException{
			int sum = 0;
			if(n<0) {
				throw new NegativeNumberException("Input positive integer only");
			}
			else
				sum=sum+n;
			return sum;
			
		}

		public static void main(String[] args) {
			Scanner inp=new Scanner(System.in);
			System.out.println("Enter 10 positive integer : ");
			try {
				
			for(int i=1;i<=10;i++) {
			int b=inp.nextInt();
			int a=Sum(b);
			
			//System.out.println(a);
			}
			}
			
			catch(Exception x) {
				System.out.println(x);
			}
		}

	}