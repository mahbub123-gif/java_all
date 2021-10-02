package quiz;

class example{
	double n1;
	double n2;
	void determine(double n3,double n4) {
		System.out.println("Distance between 2 point is :"+Math.sqrt(n2-n1)*(n2-n1)+(n4-n3)*(n4-n3));
	}
}
class subexample extends example{
	subexample(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
		
	}
	void determine(int i) {
		super.determine(n1, n2);
		int num = 5;
        for( i = 1; i <= 10; i++);
        {
        	System.out.println(num+" * "+i+" = "+num*i);
        }
        	
		
	}
}
public class quiz3 {

	public static void main(String[] args) {
		subexample m=new subexample(10,20);
		example m1=new example();
		subexample A1;
		A1=m;
		A1.determine(10,20);
		m1=A1;
		A1.determine(22,30);
		

	}

}

