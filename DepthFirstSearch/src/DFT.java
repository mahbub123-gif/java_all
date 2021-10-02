import java.util.Iterator;

import java.util.LinkedList;

public class DFT {

LinkedList<Integer>[] adj;
int numberofVertex;

char []nodes; boolean []visited;

public DFT(LinkedList<Integer>[]adj,int numberofVertex,boolean[] visited,char[]nodes) {
this.adj=adj;

this.numberofVertex=numberofVertex;
this.visited=visited;

this.nodes=nodes;

}

public void addEdge(int u,int v) {
adj[u].add(v);

}
public void DepthFirstSearch(int u) {

LinkedList<Integer>stack= new LinkedList<Integer>();

stack.add(u);
visited[u]=true;

while(!stack.isEmpty()) {
int n=stack.pollLast();

System.out.println(nodes[n]+" ");
Iterator<Integer> i=adj[n].listIterator();

while(i.hasNext()) {

int v=i.next();
if(!visited[v]) {

stack.add(v);
visited[v]=true;

}

}

}
}
}
