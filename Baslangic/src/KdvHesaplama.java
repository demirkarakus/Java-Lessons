import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		double tutar , kdvFiyat , kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ürün tutarını giriniz :");
		tutar = input.nextDouble();
		kdvFiyat = tutar + (tutar*kdv);
		System.out.println(kdvFiyat);
		
	}

}
