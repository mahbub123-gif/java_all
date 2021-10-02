package SearchingAlgoritm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// declare the array
		Scanner input =new Scanner(System.in);
		final int SIZE1 = 10;
		final int SIZE2 = 10;
		int [] data1 =new int [SIZE1];
		System.out.println("Enter "+SIZE1+" values of Linear Search");
		for(int i = 0; i < SIZE1; i++) {
			data1[i]=input.nextInt();	
			}
		System.out.println();
		int [] data2 =new int [SIZE2];
		System.out.println("Enter "+SIZE2+" values of Binary Search");
		for(int i = 0; i < SIZE2; i++) {
			data2[i]=input.nextInt();	
			}
		System.out.println();
		
		
	Searching search1 = new Searching(data1);
	Searching search2 = new Searching(data2);
	int number1,number2;
	System.out.println("Enter the number you want seach in Linear");
	number1 = input.nextInt();
	System.out.println("Enter the number you want seach in Binary");
	number2 = input.nextInt();
	search1.linSearch(number1);
	search2.binSearch(number2);
	

	}

}
