package single;
import java.util.*;

public class doublecircularlinkedlist {
	 DCNode start;
	 
	    public doublecircularlinkedlist() {
	        start = null;
	    }
	 
	    public DCNode getNode() {
	        DCNode newnode = new DCNode();
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the Data:");
	        newnode.data = input.nextInt();
	        newnode.next = null;
	        newnode.previ = null;
	        return newnode;
	    }
	 
	    public void InsertAtStart() {
	        DCNode newnode = getNode();
	        if (start == null) {
	            start = newnode;
	            start.next=start;
	            start.previ=start;
	 
	        } else {
	            DCNode last=start.previ;
	            newnode.next = start;
	            newnode.previ = last;
	            last.next = newnode;
	            start.previ = newnode;
	            start=newnode;
	        }
	    }
	 
	    public void InsertAtMiddle() {
	        if (start == null) {
	            System.out.println("List is Empty");
	        } else {
	            DCNode newnode = getNode();
	            System.out.println("Enter the position to insert the node:");
	 
	            Scanner input = new Scanner(System.in);
	            int position = input.nextInt();
	            int counter = nodecounter();
	            if (position > 1 && position <= counter) {
	                DCNode temp = start;
	                int c = 1;
	                while (c < position - 1) {
	                    temp = temp.next;
	                    c++;
	                }
	                DCNode temp2=temp.next;
	                newnode.next = temp2;
	                newnode.previ = temp;
	                temp2.previ = newnode;
	                temp.next = newnode;
	 
	            } else {
	                System.out.println("Invalid position between 1 and " + counter);
	            }
	        }
	    }
	 
	    public void InsertAtEnd() {
	    	DCNode newnode = getNode();
	        if (start == null) {
	            start = newnode;
	            newnode.previ=start;
	            newnode.next=start;
	 
	        } else {
	            DCNode last=start.previ;
	            newnode.next = start;
	            newnode.previ = last;
	            last.next = newnode;
	            start.previ = newnode;
	            
	        }
	    }
	 
	 
	    public void DeleteAtStart() {
	        if (start == null) {
	            System.out.println("List is empty and No node to delete");
	        } else {
	            DCNode last=start.previ;
	            start = start.next;
	            start.previ = last;
	            last.next=start;
	        }
	    }
	 
	    public void DeleteAtMiddle() {
	        if (start == null) {
	            System.out.println("List is Empty");
	        } else {
	            System.out.println("Enter the position to delete the node:");
	 
	            Scanner input = new Scanner(System.in);
	            int position = input.nextInt();
	            int counter = nodecounter();
	            if (position > 1 && position < counter) {
	 
	                DCNode temp = start;
	                int c = 1;
	                while (c < position - 1) {
	                    temp = temp.next;
	                    c++;
	                }
	 
	                temp.next = temp.next.next;
	                temp.next.previ = temp;
	            } else {
	                System.out.println("position is not at middle");
	            }
	        }
	    }
	 
	    public void DeleteAtEnd() {
	        if (start == null) {
	            System.out.println("List is empty");
	        } else {
	            if(start.next==start){
	                System.out.println("ERROr");
	            }
	            DCNode temp = start;
	            while (temp.next.next != start) {
	                temp = temp.next;
	            }
	            temp.next = start;
	            start.previ=temp;
	        }
	    }
	 
	    public void TraverseList() {
	 
	        DCNode temp = start;
	        while (temp != null && temp.next!=start) {
	            System.out.print("|" + temp.data + "|" + "<-->");
	            temp = temp.next;
	        }
	        if(temp!=null)
	            System.out.print("|" + temp.data + "|" + "<-->");
	    }
	 
	    public int nodecounter() {
	        DCNode temp = start;
	        int c = 1;
	        while (temp.next != start) {
	            temp = temp.next;
	            c++;
	        }
	        return c;
	    }
	}}