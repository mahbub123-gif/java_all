package boom;

public class quiz {

	public static void main(String[] args) {
		int m = print(3);
		System.out.println(m);

	}
	public static int print(int n) {
		if(n==0) {
			return 1;
		}
		else return n+ print(n-1);
	}

}
