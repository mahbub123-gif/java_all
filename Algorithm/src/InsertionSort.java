
public class InsertionSort {

	public static void main(String[] args) {
		int a [] = {1,2,5,6,8,12,3,4,2},key,i;
		for(int j=1;j<a.length;j++) {
			key = a[j];
			i = j-1;
			while (i>-1 && (a[i]>key)) {
				a[i+1]= a[i];
				i--;
			}
			a[i+1]= key;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
