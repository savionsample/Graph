public class EdgePrototype {
	private String first;
	private String second;
	private double weight;

	public EdgePrototype ( String iFirst, String iSecond, Double iWeight)
	{
		first = iFirst;
		second = iSecond;
		weight = iWeight;
	}

	public String getFirst()
	{
		return first;
	}

	public String getSecond()
	{
		return second;
	}

	public double getWeight()
	{
		return weight;
	}

	public String toString() 
	{
		return first + " -> " + second + " (" + weight + ")";
	}
}