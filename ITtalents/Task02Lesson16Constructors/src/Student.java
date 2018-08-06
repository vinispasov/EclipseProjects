
public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	//Constructors:
	Student(){
		this.grade=4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money=0;
	}
	
	Student(String name,String subject,int age){
		this();
		this.name=name;
		this.subject=subject;
		this.age=age;
	}
	//Methods:
	void upYear() {
		if (isDegree) {
			System.out.println("The student is, already degree.");
		}
		else {
			this.yearInCollege+=1;
			System.out.println("Just passed one year.Year in college: "+yearInCollege);
			if (yearInCollege==4) {
				this.isDegree=true;
			}
		}
	}
	
	double receiveScholarship(double min,double amount) {
		
		if (this.grade>=min&&age<30) {
			System.out.println("Total money:");
			return this.money+=amount;
		}
		System.out.println("Can not receive a scholarship.Total money:");
		return money;
		
	}
	

}
