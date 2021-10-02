
public class Queue {

	int front;
	int rear;
	int count;
	int []queue;
	public Queue(int[]queue) {
		front=0;
		rear=0;
		count=0;
		this.queue=queue;
	}
	public void enqueue(int item) {
		if(count==queue.length) {
			System.out.println("The queue is full");
		}
		else {
			queue[rear]=item;
			rear=(rear+1)%queue.length;
			count++;
		}
	}
	public void dequeue() {
		if(count==0) {
			System.out.println("the queue is Empty.");
		}
		else {
			front=(front+1)%queue.length;
			count--;
			
		}
		
	}
	public void printQueue() {
		System.out.println("The element in the queue is:");
		for(int i=front;i<rear;i++) {
			System.out.println(queue[i]+" ");
		}
	}

}
