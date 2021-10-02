package linkedlist1;

public class Main {

	public static void main(String[] args) {
		
		SingleLinedList list = new SingleLinedList();
		
		list.insertValue();
		list.insertValue();
		list.insertValue();
		list.insertValue();
		
		
		
		System.out.println("Inserting node at middle ");
		list.insertAtMiddle();
		list.traverseList();
		System.out.println("first data deleting ");
		list.deleteAtStart();
		list.traverseList();
		
		

	}

}
