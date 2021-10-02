
package breadthfirsttraversal;
import java.util.LinkedList;

public class Main {

public static void main(String[] args) {

	int numberofVertex= 9;

char [] nodes= { 'A','B','C','D','E','F','G','H','l'}; boolean[] visited =new boolean[numberofVertex]; LinkedList<Integer>[]adj=new LinkedList[numberofVertex]; for(int i=0;i<numberofVertex;i++) {

adj[i]=new LinkedList<Integer>();

}

BFT ob = new BFT(adj,numberofVertex,visited,nodes); ob.addEdge(0,5);

ob.addEdge(0,2); ob.addEdge(0,1); ob.addEdge(1,0); ob.addEdge(1,2); ob.addEdge(1,6);


ob.addEdge(2,0);

ob.addEdge(2,1);
ob.addEdge(2,3);

ob.addEdge(2,4);
ob.addEdge(2,5);

ob.addEdge(2,6);
ob.addEdge(3,2);

ob.addEdge(3,5);
ob.addEdge(3,4);
ob.addEdge(3,7);

ob.addEdge(4,2);

ob.addEdge(4,3);
ob.addEdge(4,6);

ob.addEdge(4,7);
ob.addEdge(4,8);

ob.addEdge(5,0);
ob.addEdge(5,2);
 

ob.addEdge(5,3);
ob.addEdge(6,1);

ob.addEdge(6,2);
ob.addEdge(6,4);

ob.addEdge(6,8);
ob.addEdge(7,3);

ob.addEdge(7,4);
ob.addEdge(7,8);

ob.addEdge(8,4);
ob.addEdge(8,6);
ob.addEdge(8,7);

ob.BreadthFirstSearch(0);

}
}
