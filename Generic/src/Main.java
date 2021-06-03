import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		
		//Integer sayıyı yazdırabiliyoruz.
		for(Integer obj : a) {
			System.out.println(obj);
		}
		
		System.out.println("*********************************************************************************");
		
		//Integer sayıyı double sayıya çevirebiliyoruz.
		for(Integer obj : a) {
			System.out.println(obj.doubleValue());
		}
		
		System.out.println("*********************************************************************************");

		HashMap<Integer, String> c = new HashMap<>();
		c.put(1, "İstanbul");
		c.put(2, "Ankara");
		c.put(3, "İzmir");
		
		//Map de yaptığımız yöntemi kullanabiliriz veya yeni bir yöntem kullanabiliriz.
		/*
		Set set = c.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		*/
		for(Integer key : c.keySet()) {
			System.out.println("Key : " + key + " - Value : " + c.get(key));
		}
		
		System.out.println("*********************************************************************************");
		
		//Mothod tipini istediğimiz gibi ayarlayabiliyoruz.
		Test2<Integer, String> i = new Test2<>(34, "İstanbul");
		i.print();
		
		Test<String> s = new Test<String>("Kodlama Vakti");
		System.out.println(s.getObj());
		
		System.out.println("*********************************************************************************");
		
		Integer[] intArr = {1,2,3,4};
		Double[] doubleArr = {1.1,2.1,3.3};
		Character[] chaArr = {'K','O','D'};
		
		genericMethod(intArr);
		System.out.println("*********************************************************************************");
		genericMethod(doubleArr);
		System.out.println("*********************************************************************************");
		genericMethod(chaArr);
	}

	public static <E> void genericMethod(E[] arr) {
		for(E item : arr) {
			System.out.println(item);
		}
	}

}
