
public class Main {

	public static void main(String[] args) {
		//Encapsulation (Sarmalama, kapsülleme) - Bir sınıfa ait değişkenlerin değerlerinin ancak o sınıf içerisine kodlanmış metotlar tarafından değiştirilebilmesi yapılandırılabilmesi ilkesidir.
		//Inheritance (Kalıtım) -> Kalitim ile ilgili bir örnek java projesi yaptık
		//Polymorphism (Çok biçimlilik)
		//Abstraction (Soyutlama)
		
		//Sınıflaar arası ilişkiler
		//-Bağımlılık (Dependency): "uses a" A uses B
		//-Birleştirme (Composition) "has a"
		
		/*
		Book b1 = new Book("Harry Poter", 400, "Rowling", "Kodlama Vakti");
		b1.setNumberOfPage(-100);
		System.out.println(b1.getNumberOfPage());
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
		*/
		
		
		
		A a = new A();
		B b = new B();
		a.run(b); //Dependency
		a.b = b; //Composition
	}

}
