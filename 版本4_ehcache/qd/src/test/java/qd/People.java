package qd;

public class People {
	private String name;
	private int age;
	
	
	
	public People(String name ,int age){
		this.name = name;
		this.age = age;
	}
	
	protected void say() {
		System.out.println("protect say");
	}
	
	public void talk(String language) {
		System.out.println("say hello by" +language);
	}
	
	public void talk(String language1,String language2) {
		System.out.println("say hello by" +language1+ "and" + language2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
