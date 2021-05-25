
public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println("Program başladı.");
		
		int a = 0;
		int[] arr = new int[3];
		
		try {
			a = 2/1;
			System.out.println(a);
			arr[4] = 10;
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " Hata.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " Hata.");
		} finally {
			System.out.println("Finally kısmı");
		}
		
		System.out.println("Program bitti.");
	}

}