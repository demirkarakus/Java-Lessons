//Throw Kullanımı ve Özel Hata Ayıklama (Exception) Oluşturma

public class Throw {

	public static void main(String[] args) {
		int a = 0;
		if(a == 0) {
			System.out.println("Bölen 0'a eşit olamaz!");
			throw new ArithmeticException("Exception!");
		}

	}

}
