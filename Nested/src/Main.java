
public class Main {

	public static void main(String[] args) {
		// Nested Class (İç İçe Sınıflar)
		// -Inner Class (İç Sınıflar)
		//		-Non-Static
		//		-Static
		// -Local Class (Yerel Sınıflar)
		// -Anonymous Class (Anonim Sınıflar)
		
		NonStatic n = new NonStatic();
		NonStatic.Inner inner = n.new Inner();
		//inner.run();
		
		Static.Inner s = new Static.Inner();
		//s.run();
		
		Local l = new Local();
		//l.run();
		
		Anonymous a = new Anonymous() {
			public void run() {
				System.out.println("Anonim sınıfına ait bir run metodu.");
			}
		};
		a.run();
	}

}
