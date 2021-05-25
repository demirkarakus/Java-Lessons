package StaticKullanimi;

public class Student {
	
	public String name;
	public int id,point;
	private static int count=0;
	
	Student(String name, int id, int point){
		this.name = name;
		this.id = id;
		this.point = point;
		Student.count++;
	}
	
	public void exit() {
		Student.count--;
	}
	
	public static int howStudent() {
		return Student.count;
	}
	
	public static double calcOverall(int[] arr) {
		double overall = 0;
		for(int i = 0; i < arr.length; i++) {
			overall += arr[i];
		}
		return overall / arr.length;
	}
}
