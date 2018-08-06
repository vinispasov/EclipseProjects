
public class Person {
	private String name;
	private int age;
	private int money;
	
	//constructors
	Person(String name, int age,int money){
		setName(name);
		setAge(age);
		setMoney(money);
	}
	//setters
	public void setName(String name) {
		if (name!="") {
			this.name=name;
		}
		else {
			System.out.println("Invalid name!");
		}
	}
	public void setAge(int age) {
		if (age>=18) {
			this.age=age;
		}
		else {
			System.out.println("Invalid age of "+this.name);
		}
	}
	public void setMoney(int money) {
		if (money>=0) {
			this.money=money;
		}
		else {
			System.out.println("Invalid money entered!");
		}
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getMoney() {
		return this.money;
	}
	

}
