
public class Guvenlik extends Memurlar{
	
	protected String belgeler;

	public Guvenlik(String adsoyad, String eposta, String telefon, String departman, String mesai, String belgeler) {
		super(adsoyad, eposta, telefon, departman, mesai);
		this.belgeler = belgeler;
	}

	public String getBelgeler() {
		return belgeler;
	}

	public void setBelgeler(String belgeler) {
		this.belgeler = belgeler;
	}
}
