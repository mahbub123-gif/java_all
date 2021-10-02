package breadthfirsttraversal;

import java.util.Iterator;

import java.util.LinkedList;

public class BFT {

LinkedList<Integer>[] adj;
int numberofVertex;

char []nodes;
boolean []visited;

public BFT(LinkedList<Integer>[]adj,int numberofVertex,boolean[] visited,char[]nodes) {

this.adj = adj;

this.numberofVertex = numberofVertex; this.visited = visited; this.nodes = nodes;

}
public void addEdge(int u,int v) {

adj [u].add(v);

}

public void BreadthFirstSearch(int u) { LinkedList<Integer>queue= new LinkedList<Integer>(); queue.add(u);

visited[u]=true;

while(!queue.isEmpty()) {
int n=queue.pollFirst();

System.out.println(nodes[n]+" ");
Iterator<Integer> i=adj[n].listIterator();

while(i.hasNext()) {
int v=i.next();

if(!visited[v]) {
queue.add(v);

visited[v]=true;
}

}

}
}

}

