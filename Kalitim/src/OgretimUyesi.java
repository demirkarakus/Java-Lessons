
public class OgretimUyesi extends Akademisyen{
	protected String unvan;

	public OgretimUyesi(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String unvan) {
		super(adsoyad, eposta, telefon, bolum, gorevler, dersler);
		this.unvan = unvan;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	//Abstraction (Soyutlama) İlkesi
	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getAdsoyad() + " " + getDersler() + " Dersine Asistan girdi.");
		
	}
}
