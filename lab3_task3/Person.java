package task3;

public class Person extends Object{
	public String name;
	public String id;
	public Person(String name,String id){
		this.name = name;
		this.id = id;
	}
	
	public String toString(){
		return name + " " + id;
	}
	
	public boolean equals(Person p) {
		return p.name==name && p.id==id;
	}
}
