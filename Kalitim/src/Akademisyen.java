//extends Calisan dersek Akademisyen Calisanın alt sınıfı olur.

public abstract class Akademisyen extends Calisan {
	String bolum,gorevler;
	String dersler;
	
	public Akademisyen(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
		super(adsoyad, eposta, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}

	public abstract void derseGir(int dersSaati);
	
	//Metot Overriding (Metod Ezme) yaptık. Normalde bu metot Calisan classı içerisinde vardı
	protected String giris() {
		return this.adsoyad + " A kapısından giriş yaptı.";
	}
	
	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public String getDersler() {
		return dersler;
	}

	public void setDersler(String dersler) {
		this.dersler = dersler;
	}
}
