import java.util.LinkedList;
public class DirectedGraph {
	int V;
	LinkedList<Integer> adjArrayList[];
	
	DirectedGraph(int V){
		this.V = V;
		adjArrayList = new LinkedList[V];
		
		for(int i=0;i<V;i++) {
			adjArrayList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdges(int src, int dest) {
		adjArrayList[src].add(dest);
	}
	
	public void printGraph() {
		for(int v=0;v<V;v++) {
			System.out.println("Adjacency list of vertex : " + v);
			System.out.print("Head ");
			
			for(Integer path : adjArrayList[v]) {
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
