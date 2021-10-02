 
package binarySearchTree;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst bst = new Bst();
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.println("Press 1 : To Insert");
			System.out.println("Press 2 : To Print in In-Order");
			System.out.println("Press 3 : To Print in Pre-Order");
			System.out.println("Press 4 : To Print in Post-Order");
			System.out.println("Press 5 : To Search");
			System.out.println("Press 0 : To Exit");
			int userinput = input.nextInt();
			if(userinput==1) {
				bst.InsertBst();
			}
			else if(userinput==2) {
				System.out.println("The Inorder sequence is as below");
				bst.inOrder(bst.start);
			}
			else if(userinput==3) {
				System.out.println("The preorder sequence is as below");
				bst.preOrder(bst.start);
			}
			else if(userinput==4) {
				System.out.println("The Postorder sequence is as below");
				bst.postOrder(bst.start);
			}
			else if(userinput==5) {
				System.out.println("Enter Item to Search");
				int item = input.nextInt();
				System.out.println(bst.searchItem(bst.start, item));	
			}
			else {
				flag = false;
			}
		}
	}
}
