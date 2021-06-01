import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Hashset <E>
		//LinkedHashset <E>
		//TreeSet <E>
		
		HashSet h = new HashSet();
		h.add("12");
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		
		Iterator itr = h.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
