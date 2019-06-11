package problem4;

public class Student {
	public String name;
	public static String proga;
	public Student(String name){
		this.name = name;
	}
	public String getName(){
		return "student's name: " + name;
	}
	public String getProga(){
		return proga;
	}
}
