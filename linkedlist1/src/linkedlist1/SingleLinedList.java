package linkedlist1;


import java.util.Scanner;
public class SingleLinedList {
	Node start;
	public SingleLinedList() {
	start = null;
	}
	public Node getNode() {
		Node newNode= new Node();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the data");
		newNode.data = input.nextInt();
		newNode.next=null;
		return newNode;
		
	}
	public void insertValue() {
		Node newNode = getNode();
		if(start == null) {
			start = newNode;
		}
		else {
			newNode.next=start;
			start = newNode;
		}
	}
	
	
	public void insertAtMiddle() {
	Node newNode = getNode();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the position to insert the node ");
	int position = input.nextInt();
	int totalNode = nodeCounter();
	if(position>1 && position<=totalNode) {
	Node temp = start;
	int ctr =1;
	while(ctr<position-1) {
	temp =temp.next;
	ctr++;
	}
	newNode.next=temp.next;
	temp.next =newNode;
	}
	else {
	System.out.println("The position you enter is not a middle position");
	}
	}
	
	
	public void deleteAtStart() {
		if(start==null) {
		System.out.println("List is empty.Deleting is not  possible");
		}
		else {
		start = start.next;
		}
		}

	
	
	public int nodeCounter() {
		Node temp = start;
		int counter = 0;
		while(temp!=null) {
		temp = temp.next;
		counter++;
		}
		return counter;}
	
public void traverseList() {
	Node temp = start;
	while(temp!=null) {
	if(temp.next!=null)
	System.out.print(temp.data+"--->");
	else
	System.out.println(temp.data);
	temp = temp.next;
	}
	}
}

