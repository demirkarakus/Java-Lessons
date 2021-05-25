
public class SayisalVeriTipleri {

	public static void main(String[] args) {
		byte abc = 100;
		System.out.println(abc);
		
		short shortDegisken = 1000;
		System.out.println(shortDegisken);
		
		float floatSayi1 = 30.0F;
		System.out.println(floatSayi1);
		
		double ondalikliSayi1 = 3.14;
		System.out.println(ondalikliSayi1);
		
		char karakter1 = 117;
		System.out.println(karakter1);
		
		char karakter2 = 'u';
		System.out.println(karakter2);
		
		boolean mantik = true;
		System.out.println(mantik);
		
		String str = "Hello";
		System.out.println(str);
		
		int sayi1 = 5;
		int sayi2 = 2;
		sayi2 +=20;
		
		boolean kosul1 = (sayi1 > sayi2);
		boolean kosul2 = (sayi2 < sayi1);
		boolean sonuc1 = (kosul1 && kosul2);
		System.out.println(sonuc1);
		
		String sonuc2 = (kosul1) ? "Doğru" : "Yanlış";
		System.out.println(sonuc2);
	}

}
