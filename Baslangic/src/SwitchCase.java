import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz :");
		int sayi = scan.nextInt();
		
		switch(sayi) {
		case 1:
			System.out.println("Sayı eşitti 1");
			break;
		case 2:
			System.out.println("Sayı eşitti 2");
			break;
		case 3:
			System.out.println("Sayı eşitti 3");
			break;
		default:
			System.out.println("Geçersiz sayı girdiniz.");
		}
		
		
	}

}
