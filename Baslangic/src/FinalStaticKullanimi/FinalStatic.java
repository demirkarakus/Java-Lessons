package FinalStaticKullanimi;

public class FinalStatic {
	
	//final yaptığımızda birdaha değiştirilemiyor.
	final static double PI=3.14;
	
	
	FinalStatic(){

	}
	
	public double area(int r) {
		return FinalStatic.PI * (Math.pow(r, 2));
	}

}
