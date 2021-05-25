
public class Calisan {
	protected String adsoyad, eposta, telefon;

	//-constructor -> "Source" -> "Generate constructor using field" menüsünden oluşturuldu
	public Calisan(String adsoyad, String eposta, String telefon) {
		this.adsoyad = adsoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}

	protected String giris() {
		return this.adsoyad + " giriş yaptı.";
	}
	
	//-get set metodları -> "Source" -> "Generate Getters and Setters..." menüsünden oluşturuldu
	public String getAdsoyad() {
		return adsoyad;
	}

	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public static void listele(Calisan[] girisYapanlar) {
		for(Calisan c : girisYapanlar) {
			System.out.println(c.giris());
		}
	}
	
}
