import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		
		System.out.print("İlk sayıyı giriniz: ");
		sayi1 = scan.nextInt();
		
		System.out.print("\nİkinci sayıyı giriniz: ");
		sayi2 = scan.nextInt();
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		System.out.println("1:Toplama\n2:Çıkartma\n3:Çarpma\n4:Bölme");
		System.out.print("Seçiminiz: ");
		secim = scan.nextInt();
		
		if(secim==1) {
			System.out.println("Toplama: " + (sayi1+sayi2));
		}else if (secim==2) {
			System.out.println("Çıkarma: " + (sayi1-sayi2));
		}else if (secim==2) {
			System.out.println("Çıkarma: " + (sayi1-sayi2));
		}else if (secim==3) {
			System.out.println("Çarpma: " + (sayi1*sayi2));
		}else if (secim==4) {
			System.out.println("Bölme: " + (sayi1/sayi2));
		}else {
			System.out.println("Doğru seçim yapılmadı.");
		}
	}

}
