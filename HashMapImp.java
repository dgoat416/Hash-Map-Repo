import java.util.HashMap;

/**
 * Class to implement and test the hash map
 * @author DGOAT
 *
 */
public class HashMapImp {

	public static void main(String[] args) {
		// Hash Map
		 HashMap<String, Double> hm = new HashMap<String, Double>();  
		 
		 // insert into the hashMap
		 hm.put("Deron", 4.0);
		 hm.put("Malik", 4.0);
		 hm.put("Terrell", 4.0);
		 hm.put("Dummy", 1.0);
		 hm.put("Stupid", 1.5);
		 hm.put("Otis", 2.5);
		 hm.put("DGOAT", 5.0);
		 
		 if (hm.containsKey("DGOAT"))
			 System.out.print("DGOAT is here!!! And he got a " + hm.get("DGOAT") + " GPA\n");
		 
		 else
			 System.out.print("DGOAT don't live here\n");
		 
		 System.out.print("The entire list includes " + hm.toString());

	}
}
