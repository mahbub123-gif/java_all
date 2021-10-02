
public class Main {

	public static void main(String[] args) {
		int[]queue=new int[7];
		Queue q1=new Queue(queue);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(65);
		q1.printQueue();
		q1.dequeue();
		q1.dequeue();
		q1.printQueue();
		
		

	}

}
