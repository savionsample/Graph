import java.util.ArrayList;

public class Vertex 
{
	private String name;
	 ArrayList<Edge> connections;
	
	public Vertex(String name)
	{
		this.name = name;
		connections = new ArrayList<Edge>();	
	}
	
	public String toString()
	{
		return connections.size() + " connections";
	}
	
	public int getNumConnections()
	{
		return connections.size();
	}
	
	public void addEdge(Edge edge)
	{
		connections.add(edge);
	}
	
	public void removeEdge(Edge edge)
	{
		connections.remove(edge);
	}
	
	public String getName()
	{
		return name;
	}
}


