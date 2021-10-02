package quiz;
class AI1{
    int A1,B1;
    AI1(){
        A1=0;
        B1=0;
    }
    AI1(int A1,int B1){
        this.A1=A1;
        this.B1=B1;
    }
    boolean experiment(int A1,int B1){

    	        int remainder = A1 % B1;
    	        boolean multiple;

    	        if (remainder != 0){
    	            multiple = false;
    	        }
    	        else{
    	            multiple = true;
    	        }

    	        return multiple;
    	    }
        
    
    double experiment(int C1){
        return Math.pow(A1,(B1+C1) );
    }
}

public class arnob {

	public static void main(String[] args) {
		AI1 a=new AI1(10,20);
        System.out.println("A1^(B1+c1)= "+a.experiment(400));
        System.out.println(a.experiment(370,7 ));
    }

	}


