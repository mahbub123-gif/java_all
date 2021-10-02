package doublecircularlinkedlist;
import java.util.Scanner;
 
class doublecircularlinkedlist {
 
    Node start;
 
    public doublecircularlinkedlist() {
        start = null;
    }
 
    public Node getNode() {
        Node newnode = new Node();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Data:");
        newnode.data = input.nextInt();
        newnode.next = null;
        newnode.prev = null;
        return newnode;
    }
 
    public void InsertAtStart() {
        Node newnode = getNode();
        if (start == null) {
            start = newnode;
            start.next=start;
            start.prev=start;
 
        } else {
            Node last=start.prev;
            newnode.next = start;
            newnode.prev = last;
            last.next = newnode;
            start.prev = newnode;
            start=newnode;
        }
    }
 
    public void InsertAtMiddle() {
        if (start == null) {
            System.out.println("List is Empty");
        } else {
            Node newnode = getNode();
            System.out.println("Enter the position to insert the node:");
 
            Scanner input = new Scanner(System.in);
            int position = input.nextInt();
            int counter = nodecounter();
            if (position > 1 && position <= counter) {
                Node temp = start;
                int c = 1;
                while (c < position - 1) {
                    temp = temp.next;
                    c++;
                }
                Node temp2=temp.next;
                newnode.next = temp2;
                newnode.prev = temp;
                temp2.prev = newnode;
                temp.next = newnode;
 
            } else {
                System.out.println("Invalid position between 1 and " + counter);
            }
        }
    }
 
    public void InsertAtEnd() {
    	Node newnode = getNode();
        if (start == null) {
            start = newnode;
            newnode.prev=start;
            newnode.next=start;
 
        } else {
            Node last=start.prev;
            newnode.next = start;
            newnode.prev = last;
            last.next = newnode;
            start.prev = newnode;
            
        }
    }
 
 
    public void DeleteAtStart() {
        if (start == null) {
            System.out.println("List is empty and No node to delete");
        } else {
            Node last=start.prev;
            start = start.next;
            start.prev = last;
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
 
                Node temp = start;
                int c = 1;
                while (c < position - 1) {
                    temp = temp.next;
                    c++;
                }
 
                temp.next = temp.next.next;
                temp.next.prev = temp;
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
            Node temp = start;
            while (temp.next.next != start) {
                temp = temp.next;
            }
            temp.next = start;
            start.prev=temp;
        }
    }
 
    public void TraverseList() {
 
        Node temp = start;
        while (temp != null && temp.next!=start) {
            System.out.print("|" + temp.data + "|" + "<-->");
            temp = temp.next;
        }
        if(temp!=null)
            System.out.print("|" + temp.data + "|" + "<-->");
    }
 
    public int nodecounter() {
        Node temp = start;
        int c = 1;
        while (temp.next != start) {
            temp = temp.next;
            c++;
        }
        return c;
    }
}
 
