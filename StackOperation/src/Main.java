
public class Main {

	public static void main(String[] args) {
		final int SIZE=10;
		int[]stack=new int[SIZE];
		Stack s1=new Stack(stack);
		s1.Push(10);
		s1.Push(20);
		s1.Push(30);
		s1.Push(40);
		s1.Push(50);
		s1.Push(60);
		s1.printStack();
		s1.pop();
		System.out.println("After Deleting one item :");
		s1.printStack();
		

	}

}
