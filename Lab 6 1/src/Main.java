
public class Main {

	public static void main(String[] args) {

				SourceCode ob = new SourceCode ();
				int num = 8;
				int factorial = ob.Factorial(num);
				System.out.println("Factorial of " + num + " = " + factorial);
				System.out.println();
				
				int n = 10;
				int fibonacci = ob.Fibonacci(n);
				System.out.println("The Fibonacci number for index "+n+" = "+fibonacci);
				System.out.println();
				
				int number = 100;
				System.out.println("Printing the numbers 1 to 100 in reverse order:");
				ob.ReverseNumbers(number);
				System.out.println();
				
				System.out.println("\nPrinting Java 100 times");
				ob.printJAVA();
				System.out.println();
				String str = "DAD";
				if (ob.Palindrome(str, 0, str.length() - 1)) {
		                        System.out.print("\nIt's Palindrome");
		        	            } 
				else {
		                        System.out.print("\nIt's not Palindrome");
		        	            }
				
			}

		}
