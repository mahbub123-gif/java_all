package ice245;

public class LinearSearch {
	public static int linearSearch(int[] array, int element){    
        for(int i=0;i<array.length;i++){    
            if(array[i] == element){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int element = 50;    
        System.out.println(element+ "  " +linearSearch(a1, element));    
    }    
}   

	
