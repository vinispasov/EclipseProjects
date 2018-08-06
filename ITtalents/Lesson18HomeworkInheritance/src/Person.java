
public class Person{
	private String name;
	private int age;
	public boolean isMale;
	
    //constructor
	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}

	//methods
	void showPersonInfo(){
		System.out.println("Name: "+this.getName());
		System.out.println("Age "+this.getAge());
		System.out.println("Is male: "+this.isMale);
	}
	
    //setters
	public void setName(String name) {
		if (name==" ") {
			System.out.println("Incorrect name!");
		}
		else{
			this.name = name;
		}
	}
	public void setAge(int age) {
		if (age<0) {
			System.out.println("Incorrect age!");
		}
		else {
		this.age = age;
		}
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
	
	
	

}
