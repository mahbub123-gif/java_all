
public class Stack {
int top;
int []stack;
public Stack(int[]stack) {
	int top=0;
	this.stack=stack;
}
  public void Push(int item) {
	  if(top==stack.length) {
		 System.out.println("Stack is Full");
	  }
	  else {
		  stack[top]=item;
		  top++;
	  }
  }
  public void pop() {
	  if(top==0) {
		  System.out.println("Stack is empty");
	  }
	  else {
		  top--;
	  }
  }
  public void printStack() {
	  System.out.println("The element in the Stack is :");
	  for(int i=top-1;i>=0;i--) {
		  System.out.println(stack[i]);
	  }
  }
}
   
