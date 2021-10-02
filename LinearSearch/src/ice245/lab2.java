package ice245;

public class lab2 {
	public static int MinDistance(int [] ar){
	    int [] a = ar;
	    int aSize = a.length-1;
	    int dMin = 999999;
	    for(int i=0; i< aSize; i++)
	    {
	        for(int j=i+1; j< aSize;j++)
	        {   
	        	if (i!=j && (Math.abs( a[i]-a[j])<dMin)){
	    	    	dMin =Math.abs( a[i]-a[j]);
	    	
	    	    	
	        }
	    
	        }
	    }
		return dMin;
	    
	   
	}



	public static void main(String[] args) {
	
        int [] someArray = {5,7,9,4};
        
        System.out.println("Array length = "+ someArray.length);
        System.out.println("The distance between the two closest elements: " + MinDistance(someArray));
	}
	}