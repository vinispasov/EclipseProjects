
public class StudentGroup {
	String groupSubject;
	Student[]students;
	int freePlaces;
	
	//constructors
	
	StudentGroup(){
		this.students=new Student[5];
		this.freePlaces=5;
	}
	StudentGroup(String subject){
		this();
		this.groupSubject=subject;
	}
	
	//methods
	
	void addStudent(Student s) {
		if (freePlaces==0) {
			System.out.println("The group is full.");
		}
		if (s.subject.equals(this.groupSubject)&&this.freePlaces>0) {
			this.students[students.length-this.freePlaces]=s;
			freePlaces--;
		}
		
	}
	void emptyGroup() {
		this.students=new Student[5];
		this.freePlaces=5;
	}
	
	String theBestStudent(Student[]students) {
		double maxGrade=this.students[0].grade;
		int maxIdx=0;
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].grade>maxGrade) {
				maxGrade=this.students[i].grade;
				maxIdx=i;
			}
			
		}
		return "The best student is: "+this.students[maxIdx].name;
		
	}
	
	void printStudentsInGroup() {
		System.out.println();
		System.out.println("Students Group:");
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student number "+(i+1));
			System.out.println("Name: "+students[i].name);
			System.out.println("Grade: "+students[i].grade);
			System.out.println("Age: "+students[i].age);
			System.out.println("Year in college: "+students[i].yearInCollege);
			System.out.println("Is degree: "+students[i].isDegree);
			System.out.println("Money: "+students[i].money);
			System.out.println();
		}
	}
			

}
