//Run sınıfı içerisinde sınıf oluşturduk bu yerel bir sınıf olduğundan sadece run sınıfı içerisinde kullanılır. Başka bir metodda çağırılmaz.
public class Local {

	public void run() {

		class Yerel {
			int a;

			Yerel(int a) {
				this.a = a;
			}

			public void print() {
				System.out.println(a);
			}
		}
		Yerel y = new Yerel(10);
		y.print();
	}

}
