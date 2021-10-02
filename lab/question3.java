import java.util.Scanner;
public class CountOccuranceOfNumbers {

	  public static void main (String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] counts = new int[100];
	    
	    System.out.print("Enter the integers between 1 and 100: ");
	    
	    // Read all numbers
	    int number = input.nextInt(); // number read from a file
	    while (number != 0) {
	      if (number <= ____ && number >= __)
	        counts[number - 1]++;
	      ________ = input.nextInt(); 
	    }

	    // Display result
	    for (int ___ = 0; ____ < 100; i++) {
	      if (counts[i] > 0)
	        System.out.println((i + 1) + " occurs " + counts[i]
	          + ((counts[i] == 1) ? " time" : " times"));
	    }
	  }
	}
