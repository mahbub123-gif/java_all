package arnob;

import java.util.Scanner;

public class hhhh {

    public static void main(String[] args) {
        
        System.out.println("Book catagory : 1 for adventure, "
                + "2 for romance, "
                + "3 for fantasy, "
                + "4 for contemporary, "
                + "5 for mystery, "
                + "6 for horror, "
                + "7 for thriller");
         
        hhhh book = new hhhh();
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        if(n==1)
        {
            System.out.println("adventure");
            
           System.out.println();
            
            
        }
        if(n==2)
        {
            System.out.println("romance");
        }if(n==3)
        {
            System.out.println("fantasy");
        }if(n==4)
        {
            System.out.println("contemporary");
        }if(n==5)
        {
            System.out.println("mystery");
        }if(n==6)
        {
            System.out.println("horror");
        }
        if(n==7)
        {
            System.out.println("thriller");
        }
       
        
        
    }

	private void kkk() {
		// TODO Auto-generated method stub
		
	}
    
}