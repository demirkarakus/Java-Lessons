
public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}
	
	public boolean getLocation() {
		player.setHealty(player.getrHealty());
		System.out.println("İyileştiniz...");
		System.out.println("Şuan güvenli evdesiniz.");
		
		return true;
	}
}
