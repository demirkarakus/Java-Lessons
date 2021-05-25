
public class Metotlar {

	public static void main(String[] args) {
		
		int r2 = power2(2,3);
		System.out.println(r2);
	}
	
	//Void method
	static void power1(int number1, int number2) {
		int result = 1;
		for(int i=1; i <= number2; i++) {
			result *=number1;
		}
		System.out.println("Cevap: " + result);
	}
	
	//Return method
	static int power2(int number1, int number2) {
		int result = 1;
		for(int i=1; i <= number2; i++) {
			result *=number1;
		}
		return result;
	}
	
}
