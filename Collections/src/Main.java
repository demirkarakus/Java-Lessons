import java.util.*;

public class Main {

	public static void main(String[] args) {
		// HashSet <E>
		// LinkedHashSet <E>
		// TreeSet <E>

		// HashSet ***********************************************
		/*
		 * HashSet h = new HashSet(); h.add("12"); h.add(12); //h.add(12); aynı hashset
		 * ten 1 tane yazmalıyız, çünkü ekrana 1 tanesi yazdırılır. h.add(12.0);
		 * h.add(true); h.add(null);
		 * 
		 * Iterator itr = (Iterator) h.iterator();
		 * 
		 * //h.remove(12); Hata verdi h.size(); System.out.println(h.size());
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 * 
		 * //for Each ile sıralama işlemi özellikle int sayılarda kullanılabilir.
		 * h.forEach(item -> System.out.println(item + " "));
		 */

		// LinkedHashSet ******************************************
		/*
		 * LinkedHashSet gunler = new LinkedHashSet(); gunler.add("Pazartesi");
		 * gunler.add("Salı"); gunler.add("Çarşamba"); gunler.add("Perşembe");
		 * gunler.add("Cuma"); gunler.add("Cumartesi"); gunler.add("Pazar");
		 * 
		 * gunler.remove("Pazar"); gunler.add("Pazartesi");
		 * 
		 * gunler.forEach(item -> System.out.println(item + ""));
		 */

		// TreeSet ******************************************
		// Elementler artan bir sıralama ile tutulur. Null kabul edilmez.
		/*
		 * TreeSet tree = new TreeSet(); tree.add(10); tree.add(6); tree.add(8);
		 * tree.add(1); tree.add(2);
		 * 
		 * tree.forEach(item -> System.out.println(item + " "));
		 */

		// **********************************************************************************************************
		// ArrayList <E>
		// LinkedList <E>
		// Vector <E>

		// ArrayList <E>
		/*
		 * ArrayList country = new ArrayList(); country.add("Ankara");
		 * country.add("İstanbul"); country.add("İzmir");
		 * 
		 * country.add(0, "İstanbul"); country.remove(2);
		 * 
		 * Iterator itr = country.iterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 * 
		 * //country.forEach(item -> System.out.println(item + " "));
		 */

		// LinkedList <E>
		/*
		 * LinkedList list = new LinkedList(); list.add("A"); list.add("B");
		 * list.add("C");
		 * 
		 * list.add(1,"BBB");
		 * 
		 * list.forEach(item -> System.out.println(item + " "));
		 */

		// Vector <E>
		/*
		 * Vector v = new Vector(10); v.add("Armut"); v.add("Kiraz"); v.add("Üzüm");
		 * v.add("Elma");
		 * 
		 * System.out.println("Boyut " + v.size()); System.out.println("Kapasite " +
		 * v.capacity());
		 * 
		 * v.remove(0); System.out.println(v.firstElement() + " - " + v.lastElement());
		 */

		// **********************************************************************************************************
		// Queue Kullanımı
		/*
		 * Queue kuyruk = new LinkedList(); kuyruk.add("Gökhan"); kuyruk.add("Aslı");
		 * 
		 * kuyruk.offer("Aykut"); kuyruk.offer("Cem"); kuyruk.offer("Fatma");
		 * kuyruk.offer("Görkem"); kuyruk.offer("Ilknur");
		 * 
		 * Iterator it = kuyruk.iterator(); System.out.println("Kuyruk boyutu: " +
		 * kuyruk.size());
		 * 
		 * while (it.hasNext()) { String iteratorValue = (String) it.next();
		 * System.out.println("Kuyrukta sonraki öğe :" + iteratorValue); }
		 * 
		 * System.out.println("Queue.peek() : Sıradaki Eleman: " + kuyruk.peek());
		 * System.out.println("Queue.poll() : Çıkartılan Eleman :" + kuyruk.poll());
		 * System.out.println("Kuyruğun kalan öğe sayısı :" + kuyruk.size());
		 */

		// **********************************************************************************************************
		// PriorityQueue Kullanımı
		/*
		 * Queue q = new PriorityQueue();
		 * 
		 * q.add(80); q.add(20); q.add(10); q.add(50);
		 * 
		 * while(!q.isEmpty()) { System.out.println(q.poll()); }
		 * 
		 * //q.forEach(item -> System.out.println(item));
		 */

		// **********************************************************************************************************
		//Map Interface ve HashMap Kullanımı
		/*
		HashMap h = new HashMap();
		
		h.put("TR", "Ankara");
		h.put("FR", "Paris");
		h.put("EN", "Londra");
		
		Set s = h.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		*/
		// **********************************************************************************************************
		//LinkedHashMap ve TreeMap Kullanımı
		/**/
		LinkedHashMap o = new LinkedHashMap();
		o.put("Ali", 90);
		o.put("Veli", 80);
		o.put("Ahmet", 70);
		
		Set s = o.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		
	}

}
