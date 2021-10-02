package single linked list;
import java.util.Scanner;
public class SingleLinkedList {
	Node start;
	public SingleLinkedList() {
	start = null;
	}
	public Node getNode() {
	Node newNode = new Node();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the data ");
	newNode.data = input.nextInt();
	newNode.next =null;
	return newNode;
	}
	public void insertAtStart() {
	Node newNode = getNode();
	if (start == null) {
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
	public void insertAtEnd() {
	Node newNode = getNode();
	if(start == null) {
	start=newNode;
	}
	else {
	Node temp = start;
	while(temp.next!=null) {
	temp = temp.next;
	}
	temp.next = newNode;
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
	public void deleteAtMiddle() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the position");
	int position = input.nextInt();
	int totalNode = nodeCounter();
	if(position>1 && position<=totalNode) {
	Node temp = start;
	int ctr =1;
	while(ctr<position-1) {
	temp = temp.next;
	ctr++;
	}
	temp.next = temp.next.next;}
	else {
	System.out.println("Invaild"); 
	}
	}
	public void deleteAtEnd() {
	if (start == null) {
	System.out.println("No node to delete ");
	}
	else {
	Node temp = start;
	while(temp.next.next!=null) {
	temp = temp.next;
	}
	temp.next = null;
	}
	}
	public void traverseList() {
	Node temp = start;
	while(temp!=null) {
	if(temp.next!=null)
	System.out.print(temp.data+"--->");
	else
	System.out.println(temp.data);
	temp = temp.next;
	}}
	public int nodeCounter() {
		Node temp = start;
		int counter = 0;
		while(temp!=null) {
		temp = temp.next;
		counter++;
		}
		return counter;}
	}

