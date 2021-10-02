import java.util.Scanner;

public class Bst {
	Node start;
	public Bst() {
		this.start = null;
	}
	public Node getNode() {
		Node newNode = new Node();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the key");
		newNode.data = input.nextInt();
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	public void InsertBst() {
		Node newNode= getNode();
		if(start == null) {
			start = newNode; 
		}
		else {
			boolean flag = true;
			Node temp = start;
			while(flag) {
			 if(newNode.data< temp.data) {
				 if(temp.left == null) {
					 temp.left = newNode;
					 flag = false;
				  }
				  else {
					  temp = temp.left;
				  }
			 }
			 if(newNode.data >temp.data) {
				  if(temp.right == null) {
					  temp.right = newNode;
					  flag = false;
				  }
				  else {
					  temp = temp.right;
					  
				  }
		        }
	          }
	
		    }

	      }
	public void preOrder(Node temp) {
		if(temp!= null) {
			System.out.println(temp.data+" ");
			preOrder(temp.left);
			preOrder(temp.right);
		}
	}
	public void inOrder(Node temp) {
		if(temp!= null) {
			
			inOrder(temp.left);
			System.out.println(temp.data+" ");
			inOrder(temp.right);
		}
	}
	public void postOrder(Node temp) {
		if(temp!= null) {
			postOrder(temp.left);
			postOrder(temp.right);
			System.out.println(temp.data+" ");
			
		}
		
	}
	public boolean searchItem(Node start, int item) {
		if (start == null) {
			return false;
		} else if (start.data == item) {
			return true;
		} else if (item < start.data) {
			return searchItem(start.left, item);
		} else {
			return searchItem(start.right, item);
		}
	}
	
	
}
