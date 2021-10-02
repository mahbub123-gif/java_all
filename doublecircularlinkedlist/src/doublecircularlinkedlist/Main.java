package doublecircularlinkedlist;
public class Main {
	 
	 public static void main(String[] args) {
		 
	        doublecircularlinkedlist l = new doublecircularlinkedlist();
	        l.InsertAtStart();
	        l.InsertAtStart();
	        l.InsertAtStart();
	        l.InsertAtStart();
	        l.InsertAtStart();
	        l.InsertAtStart();
	        System.out.println("After inserting at first, the list is :");
	        l.TraverseList();
	        l.DeleteAtStart();
	        System.out.println("\nAfter deleting one start node,the list is :");
	        l.TraverseList();
	        System.out.println();
	        l.InsertAtEnd();
	        System.out.println("\nAfter inserting at the end:");
	        l.TraverseList();
	        l.DeleteAtEnd();
	        System.out.println("\nAfter deletting end node :");
	        l.TraverseList();
	        System.out.println();
	        l.InsertAtMiddle();
	        System.out.println("\nAfter insert at the middle :");
	        l.TraverseList();
	        System.out.println();
	        l.DeleteAtMiddle();
	        System.out.println("After deleting middle node :");
	        l.TraverseList();
	    }
	}
