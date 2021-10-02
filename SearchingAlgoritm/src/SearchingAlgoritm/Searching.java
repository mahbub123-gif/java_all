package SearchingAlgoritm;

public class Searching {
	int[] data;
	public Searching(int [] data)
	{
		this.data =data;
	}
	public void linSearch(int number1) {
		boolean found =false;
		int loc=-1;
		for (int i=0; i<data.length; i++) {
			if(number1==data[i]) {
				
				 found=true;
				 loc =i;
				 break;
			}
		}
		if(found==true) {
			System.out.println("number1 is found in location"+" "+loc);
			System.out.println();
		}
		else {
			System.out.println("number1 is not found");
			System.out.println();
		}
		
	}
	public void binSearch(int number2) {
		int low =0;
		boolean found = false;
		int loc = -1;
		int high = data.length -1;
		System.out.println("For number 2 in binary: ");
		while(low <= high) {
			int mid = (low + high)/2;
			System.out.println("low = "+low+" high= "+high+ " mid= "+mid);
			if(number2 == data[mid]) {
				found = true;
				System.out.println(" Yes\n");
				loc = mid;
				break;
			}
			if(number2 < data[mid]) {
				high = mid-1;
				System.out.println(" No\n");
			}
			else {
				low = mid + 1;
				System.out.println(" No\n");
			}
		}
		if(found == true) {
			System.out.println("number2 is found in location"+loc);
			
		}
		else {
			System.out.println("number2 is not found");
		}
	}
	

}
