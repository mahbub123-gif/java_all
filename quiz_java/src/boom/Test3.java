package boom;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("sum is :" + xMethod(10));

	}
	public static int xMethod(int n) {
		if(n<=1)
			return 1;
		else
	      {
	          if(n%2 == 1)
	              return xMethod(n - 1);
	          else
	              return n + xMethod(n - 1);
	      }
	}

}