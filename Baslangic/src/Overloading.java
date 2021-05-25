
public class Overloading {

	public static void main(String[] args) {
		
		System.out.println(add(11, 2));
		System.out.println(add(11, 2, 5));
		System.out.println(add(11, 2, 7.0));
		
	}

	static int add(int a, int b){
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(int a, int b, double c) {
		return a + b + c;
	}
	
}
