import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, t, fark, min, max;
		int dizi[]=new int[9];
		
		//Dizi değişkelnerini al
		for(i=1;i<9;i++) {
			dizi[i] = scan.nextInt();
			System.out.println("sayı: " + dizi[i]);
		}
		
		//Sıralama işlemini yap
		for(i=1;i<9;i++) {
			for(j=1;j<9;j++) {
				if(dizi[j] <= dizi[i]) {
					t=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=t;
				}
			}
		}
		
		System.out.println("Sıralama");
		
		for(i=1;i<9;i++) {
			System.out.println(dizi[i]);
		}

	}

}
