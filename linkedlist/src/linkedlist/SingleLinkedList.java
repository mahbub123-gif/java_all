package linkedlist;

import java.util.Scanner;
public class SingleLinkedList {
	Node start;
	public SingleLinkedList() {
	start = null;
	}
	public Node getNode() {

		Node newnode=new Node();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the data:");
		newnode.data=input.nextInt();
		newnode.next=null;
		return newnode;
		}
	
		public void insertAtStart() {

			Node newnode=getNode();
			if(start==null) {
			start= newnode;
			}
			else {
			newnode.next=start;
			start=newnode;
			}
			
	}
		public void insertAtMiddle() {

			Node newnode=getNode();
			if(start==null) {
			start=newnode;
			}
			else {
			System.out.println("Enter the position to insert the node");
			Scanner input=new Scanner(System.in);
			int position=input.nextInt();
			int nodecounter=nodeCounter();
			if(position>1 && position<=nodecounter) {
			Node temp=start;
			int c=1;
			while(c < position-1) {
			temp=temp.next;
			c++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			}
			else {
			System.out.println("THe position you entered is not a middle position");
			}
			}
		}
	
	public void deleteStartnode() {
		if(start==null) {
		System.out.println("The list is Empty. no node to delete.");
		}
		else {
		start=start.next;
		}
		}
	
	public void traverselist() {
		Node temp=start;
		while(temp!=null) {
		System.out.print(temp.data+"-->");
		temp=temp.next;
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
	}

