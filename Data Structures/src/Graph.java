import java.util.LinkedList;
public class Graph {
	int V;
	LinkedList<Integer> adjListArray[];
	
	Graph(int V){
		this.V = V;
		adjListArray = new LinkedList[V];
		for(int i=0;i<V;i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int src, int dest) {
		adjListArray[src].add(dest);
		adjListArray[dest].add(src);
	}
	
	public void printGraph() {
		for(int v=0;v<V;v++) {
			System.out.println("Adjacency List of vertex is  : " + v);
			System.out.print("Head ");
			for(Integer path : adjListArray[v]) {
				System.out.print(" -> " + path);
			}
			System.out.println("\n");
		}
	}
	public static void main(String args[]) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        
        graph.printGraph();
    }
}