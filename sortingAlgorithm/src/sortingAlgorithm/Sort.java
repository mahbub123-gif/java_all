package sortingAlgorithm;

public class Sort {
	int [] data;
	public Sort(int[]data) {
		this.data=data;

	}
	public void bubbleSort() {
		for(int i=0; i<data.length;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]>data[j+1]);
				int temp=data[j];
				data[j]=data[j+1];
				data[j+1]=temp;
				
			}
		}
	}


   public void selectionSort() {
	   for(int i=0;i<data.length;i++) {
		   int minIndex=i;
		   for(int j=i+1;j<data.length;j++) {
			   if(data[j]<data[minIndex]) {
				   minIndex=j;
			   }
		   
			   }
		   int temp=data[i];
		   data[i]=data[minIndex];
		   data[minIndex]=temp;
		   }
	   
   }
   public void printArray() {
	   System.out.println();
	   for(int i=0;i<data.length;i++) {
		   System.out.println(data[i]+" ");
	   }
   }
}
