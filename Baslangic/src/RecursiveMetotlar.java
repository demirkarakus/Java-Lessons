
public class RecursiveMetotlar {

	public static void main(String[] args) {
		System.out.println(r(10));
	}

	static int f(int x){
		int toplam = 0;
		
		for(int i=1; i<=x; i++) {
			toplam +=i;
		}
		return toplam;
	}
	
	//Recursive Method
	static int r(int x) {
		if(x == 1) {
			return 1;
		}
		return x + r(x - 1);
	}
}
