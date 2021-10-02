
public class SourceCode {
	int Factorial(int num){
		if(num==0) {
			return 1;
		}
		else {
			return num * Factorial(num-1);
		}
		}
	
	int Fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	void ReverseNumbers(int number) {
		if(number>=1) {
			 System.out.println(number+" ");
			 ReverseNumbers(number-1);
		}
	}
	
	
	int count = 0;
	void printJAVA() {
		count++;
		if(count<=100) {
			System.out.println("JAVA"+count+" ");
			printJAVA();
		}
	}
	
	boolean Palindrome(String str, int a, int b) {
		if (a == b) {
			return true;
		}
		if ((str.charAt(a)) != (str.charAt(b))) {
			return false;
		}
		else {
			return Palindrome(str, a + 1, b - 1);
		}       
	}
	}
