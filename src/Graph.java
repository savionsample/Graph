import java.util.ArrayList;

public class Graph 
{
	ArrayList<Vertex> vertices = new ArrayList<Vertex>(); 
	ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
	ArrayList<String> vertexListString = new ArrayList<String>();
	
	/* Default constructor */
	public Graph()
	{
		
	}
	
	/** Initialization Constructor
	 *  Uses provided GraphFileReader code to input starting graph data from a file.
	 *  @param filename Name of the file with data to initialize graph.
	 */
	public Graph(String filename)
	{
		ArrayList<EdgePrototype> edgeList = GraphDataFileReader.readDataFile(filename);

		
		for (EdgePrototype edge: edgeList)
		{
			if(!vertexList.contains(edge.getFirst()))
			{
				vertexList.add(new Vertex(edge.getFirst()));
				vertexListString.add((new Vertex(edge.getFirst())).toString());
			}
			if(!vertexList.contains(edge.getSecond()))
			{
				vertexList.add(new Vertex(edge.getSecond()));
				vertexListString.add((new Vertex(edge.getFirst())).toString());
			}
		}
		System.out.println(vertexList);
	}

	/* Converts graph to a text representation */
	public String toString()
	{
		String s = "";
		for (Vertex vertex: vertexList)
		{
			s += vertex + "\n";
		}
		return s;
	}
	
	/* Returns the total number of edges in the graph. */
	public int getNumEdges()
	{
		int total = 0;
		for (Vertex vertex: vertexList)
		{
			total += vertex.getNumConnections();
		}
		return total;
	}

	/* Returns the total number of vertices in the graph. */
	public int getNumVertices()
	{
		return vertexList.size();
	}

	/* Returns the Vertex with the most Edges.
	 *   What does it do if there is a tie?
	 */
	public Vertex getMostConnected()
	{
		int highest = vertexList.get(0).getNumConnections();
		Vertex mostConnected = vertexList.get(0);
		for (Vertex vertex: vertexList)
		{
			if (vertex.getNumConnections() > highest)
			{
				mostConnected = vertex;
			}
		}
		return mostConnected;
	}
	
	/* Adds a new Edge to the graph 
	 *   Do we want another version with different input parameters?
	 */
	public void add(Edge newEdge)
	{
		// check to see if the edge even exists using contain
		for (int i = 0; i < vertexList.size(); i++)
		{
			if (vertexList.get(i).getName().equals(newEdge.getFirst()))
			{
				vertexList.get(i).addEdge(newEdge);
			}
			if (vertexList.get(i).getName().equals(newEdge.getSecond()))
			{
				vertexList.get(i).addEdge(newEdge);
			}
		}
	}
	
	/* Removes an Edge from the graph
	 *   Updates the appropriate data structures...
	 */
	public void remove(Edge rmEdge)
	{
		for (int i = 0; i < vertexList.size(); i++)
		{
			if (vertexList.get(i).getName().equals(rmEdge.getFirst()))
			{
				vertexList.get(i).removeEdge(rmEdge);
			}
			if (vertexList.get(i).getName().equals(rmEdge.getSecond()))
			{
				vertexList.get(i).removeEdge(rmEdge);
			}
		}
	}
	
	/* Adds a new Vertex to the graph 
	 *   Do we want another version with different input parameters?
	 */
	public void add(Vertex newVertex)
	{
		vertexList.add(new Vertex(""));
	}

	/* Removes a Vertex from the graph 
	 *   updates the appropriate data structures...
	 */
	public void remove(Vertex rmVertex)
	{
		for (int i = 0; i < vertexList.size(); i++)
		{
			if (vertexList.get(i).equals(rmVertex))
			{
				vertexList.remove(i);
			}
		}
	}
	
	
	/* Displays the graph visually, using graphics commands.
	 *  (OPTIONAL!) 
	 */
	public void display()
	{
		
	}
	


//	public void set(??);
//
//	public boolean contains(String vertexName);
//	public boolean contains(Vertex inVertex);
//	public boolean areConnected(Vertex vertexA, Vertex vertexB);
//	public Path getShortestPath(Vertex start, Vertex stop);
//	public int getNumPaths(Vertex start, Veretex stop);
//	public int getMeanNumConnections();
//	public double getTotalDistance();
//	public ArrayList<Cycle> getCycles();
//	public ArrayList<Graph> getComponents();

	
	
	
	
}