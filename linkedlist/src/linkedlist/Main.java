package linkedlist;

public class Main {

	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.insertAtStart();
		list.insertAtStart();
		list.insertAtStart();
		list.insertAtStart();
		list.insertAtStart();
		list.insertAtStart();
		
		System.out.println("After Inserting at Start, the list is:");
		list.traverselist();
		list.deleteStartnode();
		System.out.println("\nAfter deleting at Start, the list is: ");
		list.traverselist();
		System.out.println();
		
		
		list.traverselist();
		System.out.println();
		list.insertAtMiddle();
		System.out.println("After Inserting at Middle, the list is: ");
		
        System.out.println(); 
		list.traverselist();
	}

}
