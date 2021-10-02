package sortingAlgorithm;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		final int size1=10;
		final int size2=10;
		int [] data1= new int[size1];
		System.out.println("Enter "+size1+" values for Bubble Sort :");
		for(int i=0;i<size1;i++) {
			data1[i]=input.nextInt();
		}
		int [] data2= new int[size2];
		System.out.println("Enter "+size2+" values for Selection Sort :");
		for(int i=0;i<size2;i++) {
			data2[i]=input.nextInt();
	}
		Sort sort1=new Sort(data1);
		Sort sort2=new Sort(data2);
		System.out.println("Before bubble Sorting :");
		sort1.printArray();
		
		sort1.bubbleSort();
		System.out.println("\nAfter Bubble sorting :");
        sort1.printArray();
        
        System.out.println("\nBefore Selection Sorting :");
        sort2.printArray();
        
        sort2.selectionSort();
        System.out.println("\nAfter Selection Sorting :");
        sort2.printArray();

	}
}
