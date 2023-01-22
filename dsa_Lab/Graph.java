package dsa_Lab;

public class Graph {

	private final int vertices;
    private int[][] adjMat;

    public Graph(int vertices) {
        
    	this.vertices = vertices;
        
    	adjMat = new int[vertices][vertices];
    
    }

    public void addEdge(int source, int destination) {
        
    	adjMat[source][destination] = 1;
    }

    public void printGraph() {
        
    	System.out.println("Graph using adjacency matrix: "+"\n");
        
    	for (int i = 0; i < vertices; i++) {
            
    		for (int j = 0; j < vertices; j++) {
                
    			System.out.print(adjMat[i][j] + " ");
            }
            
    		System.out.println();
        }
    }
}
