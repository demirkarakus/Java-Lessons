
public class Static {

	private int a = 10; //buradaki a değişkeni ekrana yazdırılmayacak, Inner içindekini yazdıracağız.
	private static int b = 2; //b yi kullanabilmek için static olarak tanımlamamız gerekiyor.
	
	public static class Inner{
		int a = 1;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			//System.out.println(Static.this.a); Bu Non-Static örneğinde çalışır fakat Static örneğinde çalışmaz.
			//Sebebi Inner'dan nesne üretmeyecek olmamız, dolayısı ile üst sınıfına da ulaşamayız.
			System.out.println(b);
		}
	}
}
