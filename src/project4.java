import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class project4 {

	public static void main(String[] args) {
		/*
		 * 1.Create an instance of an ArrayList of String called employeeNames
		 */
		
		List<String> employeeNames = new ArrayList<String>();
		
		employeeNames.add("Leon");
		employeeNames.add("Malcom");
		employeeNames.add("Alex");
		employeeNames.add("Marrissa");
		employeeNames.add("Rocky");
		
		for (int i = 0; i < employeeNames.size(); i++) {
			System.out.println(employeeNames.get(i));
			
			/*
			 * 2.Create an instance of a HashSet of Integer called ids
			 */	
			
			Set<String> ids = new HashSet<String>();
			ids.add("Arizona");
			ids.add("California");
			ids.add("Nevada");
			ids.add("Oregon");
			ids.add("Washington");
			
			System.out.println(ids.size());
			
			for (String id : ids) {
				System.out.println(ids);
				
				
			/*
			 *  3. Create an instance of a HashMap of Integer, 
			 * String called employeeMap
			 * 4.Add at least five entries to the employeeNames and ids 
			 * (make sure both collections have the same number of entries).
			 */
				
			Map<Integer, String> employeeMap = new HashMap<Integer, String>();
				employeeMap.put(1,"Phoenix");
				employeeMap.put(2,"LA");
				employeeMap.put(3,"Las Vegas");
				employeeMap.put(4,"Portland");
				employeeMap.put(5,"Seattle");
				employeeMap.put(6,"ids");
				
				System.out.println(employeeMap.get(6));
				
				/*
				 * 5. Create a variable int i = 0; then iterate over ids using an enhanced for loop. 
				 * Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
				 * The entry should consist of a key that is the id in the enhanced loop’s current iteration,
				 *  and a value that is the employeeName at position i of the employeeNames ArrayList.
				 * 6.6.Once the employeeMap is fully populated, use another enhanced for loop to
				 *  iterate over the employeeMap.keySet(), and use the key for each current iteration 
				 *  to print to the console both the current key and its associated value in the map.
				 * 
				 */
				
				 
				Set<Integer> namePosition = employeeMap.keySet();
				for (Integer key : namePosition) {
					Object i1 = key;
					System.out.println(ids+ " : " + employeeMap.get(i1) + employeeNames);	
				
					 
					/*
					 * 7. Create a StringBuilder called idsBuilder
					 * 8.Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
					 * 9.Print the result of idsBuilder.toString() to the console.
					 * 10.Create another StringBuilder called namesBuilder.
					 * 11.Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
					 * 12.Print the result of namesBuilder.toString() to the console
					 */		
		}
	}
			

	}
		
}
	public static class StringidsBuilder{
		
		
		public static final Object NamesBuilder = null;
		public static PrintStream Location;
		public static String firstName;




		public static void main(String[] args) {
			
			String ids1 = "Arizona";
			String ids2 = "LA";
			String ids3 = "Las Vegas";
			String ids4 = "Seattle";
			String ids5 = "Portland";
			
			System.out.println(StringidsBuilder.toString(5));
			
		}

	private static char[] toString(int i) {
			// TODO Auto-generated method stub
			return null;
		}




	public static class StringNamesBuilder{
		
		
		public static void main(String[] args) {
			
			String employeeName1 = "Leon";
			String employeeName2 = "Malcom";
			String employeeName3 = "Alex";
			String employeeName4 = "Marrissa";
			String employeeName5 = "Rocky";
			
			
			StringBuilder employeeNames = new StringBuilder(firstName);
			Location.append("ids");
			System.out.println(NamesBuilder.toString());
			
			
			
			
			
			
			
			
		}
		}


}
}





