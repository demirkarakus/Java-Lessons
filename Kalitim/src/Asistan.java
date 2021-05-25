
public class Asistan extends Akademisyen{
	protected String yuksekLisans;

	public Asistan(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String yuksekLisans) {
		super(adsoyad, eposta, telefon, bolum, gorevler, dersler);
		this.yuksekLisans = yuksekLisans;
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	//Abstraction (Soyutlama) İlkesi
	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getAdsoyad() + " " + getDersler() + " Dersine Asistan girdi.");
		
	}
	
}
