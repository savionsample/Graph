
import java.util.ArrayList;

public class GDFRTester {
	public static void main (String [] args) 
	{
		String filename;

		if ( args != null && args.length > 0 ) 
		{
			filename = args[0];
		}
		else
		{
			filename = "tinyG.txt";
		}

		ArrayList<EdgePrototype> edgeList;
		edgeList = GraphDataFileReader.readDataFile(filename);
		if (edgeList != null && edgeList.size() > 0 ) 
		{
			for ( EdgePrototype edge : edgeList ) {
				System.out.println(edge);
			}
		}
		else
		{
			System.out.println("No edge list, possibly bad file name or empty file.");
		}

	}
}