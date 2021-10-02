
public class LAB2 {
		public static int minDistance(int[]a) {
			int dmin=888898989;
		
			for(int i=1;i<a.length;i++)
			
			{
				for(int j=0; j<a.length;j++)
				{
					if((i!=j) && (Math.abs(( a[i]-a[j]))<dmin)) {
						dmin=Math.abs( a[i]-a[j]);
					}
				}
					
			}
			return dmin;
			
		}

		public static void main(String[]args) {
			
		
			int[]a= {2,9,20,15};
			System.out.println("Arraylength :" +a.length);
			System.out.println("the distance between the two closest elements: "+minDistance(a));
			
		
	  }
	}
