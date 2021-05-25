
public class Book {
	
	private String name, author, publisher;
	private int numberOfPage;
	
	Book(String name, int numberOfPage, String author, String publisher){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.numberOfPage = numberOfPage;
	}
	
	public int getNumberOfPage() {
		return this.numberOfPage;
	}
	public void setNumberOfPage(int size) {
		if(size < 1) {
			System.out.println("Sayı negatif olamaz.");
			this.numberOfPage = 10;
		}else {
			this.numberOfPage = size;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
