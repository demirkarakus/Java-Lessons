import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		File file = new File("kod.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		String val = "Kodlama Vakti";
		
		//Dosyaya veri yazma
		FileWriter fWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(val);
		bWriter.write("\nJava Dersi");
		bWriter.close();
		
		//Dosyadan veri okuma
		FileReader fReader = new FileReader(file);
		String line;
		
		BufferedReader bReader = new BufferedReader(fReader);
		
		while((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		bReader.close();
	}
}
