
public class Main {

	public static void main(String[] args) {
// 		Calisan c = new Calisan("Ahmet", "a@a.gmail.com", "05550000000");
//		Akademisyen a = new Akademisyen("Ahmet", "a@a.gmail.com", "05550000000", "CENG", "Hoca", "Ceng 101");
//		System.out.println(a.getAdsoyad());
		
		Memurlar m = new Memurlar("Memet","m@m.com","055500112233","CENG","Hoca");
//		
//		c.giris();
//		a.giris();
//		m.giris();
		
//		System.out.println(c.giris());
//		System.out.println(Akademisyen.giris());
		
//		Asistan as = new Asistan();
//		as.derseGir();
//		
		OgretimUyesi og = new OgretimUyesi("Memet","m@m.com","055500112233","CENG","Hoca","CENG 102","Doc");
//		og.giris();
		
// 		Polymorphism (Çok Biçimlilik) İlkesi		
//		Calisan[] girisListesi = {a,og};
//		Calisan.listele(girisListesi);
		
//		Abstraction (Soyutlama) İlkesi
		og.derseGir(10);
	}

}
