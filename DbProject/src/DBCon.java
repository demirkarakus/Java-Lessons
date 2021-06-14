import java.sql.*;
import java.util.Scanner;

public class DBCon {

	public static void main(String[] args) throws SQLException {
		//DB bağlantısı
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3325/car?user=root&password=root");
		Statement st = c.createStatement();
		
		//Kullanıcı veri girişi
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Araba Adı: ");
		String name = scan.nextLine();
		
		System.out.print("Araba Hızı: ");
		int speed = scan.nextInt();
		*/
		
		//Verilerin DB'ye girişi
		/*
		String query = "INSERT INTO cars (car_name, car_speed) VALUES ('"+name+"','"+speed+"')";
		int sonuc = st.executeUpdate(query);
		System.out.println(sonuc);
		st.close();
		*/
		
		//Verilerin DB'ye PreparedStatement ile girişi
		/*
		String q = "INSERT INTO cars (car_name,car_speed) VALUES (?,?)";
		PreparedStatement pt = c.prepareStatement(q);
		
		pt.setString(1, name);
		pt.setInt(2, speed);
		pt.executeUpdate();
		*/
		
		//Kullanıcı verilerini DB'den getirme
		ResultSet rs = st.executeQuery("SELECT * FROM cars");
		
		while(rs.next()) {
			System.out.println(rs.getInt("car_id") + " - " + rs.getString("car_name") + " - " + rs.getInt("car_speed"));
		}
		
	}

}
