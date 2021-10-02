package lab2;

import java.util.Arrays;
import java.util.Scanner; 

public class question3 {

    public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    // ask for user to input numbers
    System.out.println("Enter some integers between 1 and 100 (and 0 when done): ");

    int[] myArray = new int[1000];

    int number;
    int count = 0;

    do
    {
        number = input.nextInt();
        myArray[count] = number;
        count++;
    }

    while (number != 0); 
    int[] mySort = new int [count - 1];  
   for(int i = 0; i< (count-1); i++) { 

      mySort[i] = myArray[i];
    }

    java.util.Arrays.sort(mySort);

    int n = 0;

    for(int i = 0; i < mySort.length; i++) {
        int occurance = 0;
        if(n >= mySort[i]) {
            continue;
        }
        else {
        n = mySort[i]; 
        for (int j=0; j<mySort.length; j++) 
            if (n == mySort[j]) 
              occurance++; 
        System.out.print(n +  " occurs " + occurance );
        {
            if (occurance == 1) {
            System.out.println(" time.");
            }
            else {
                System.out.println(" times.");
            }
            }
        }
    }

    }

}