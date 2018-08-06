import java.util.Scanner;
public class Person {
	private static final int MIN_WEIGHT = 0;
	private static final int MAX_WEIGHT = 500;
	private String name;
	private int weight;
	private boolean isMale;
	
	public Person(String name, int weight, boolean isMale) {
		setName(name);
		setWeight(weight);
		setGenderMale(isMale);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		Scanner sc=new Scanner(System.in);
		while (weight<MIN_WEIGHT||weight>MAX_WEIGHT) {
			System.out.println("Invalid input,try again!");
			weight=sc.nextInt();
		}
		this.weight = weight;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setGenderMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
	

}
