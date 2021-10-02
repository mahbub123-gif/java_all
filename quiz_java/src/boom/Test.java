package boom;

public class Test {

	public static void main(String[] args) {
		System.out.println("sum is" + xMethod(5));

	}
	public static int xMethod(int n) {
		if(n==1)
			return 1;
		else
			return n+ xMethod(n-1);
	}

}
