
public class College {
	public static void main(String[] args) {
		Student pesho=new Student("Pesho","BussinesAdministration",27);
		Student sisi=new Student("Sisi","Music and arts",21);
		Student gosho=new Student();
		pesho.grade=5.50;
		sisi.grade=6;
		System.out.println(pesho.receiveScholarship(3, 50));
		sisi.upYear();
		
		StudentGroup sg1=new StudentGroup("BussinesAdministration");
		StudentGroup sg2=new StudentGroup("Music and arts");
		
		for (int i = 0; i < sg1.students.length; i++) {
			if (i==1) {
		    sg1.addStudent(pesho);
			}
			else {
		    sg1.addStudent(new Student("Student number "+(i+1),"BussinesAdministration",i+19));
			}
		}
		
		for (int i = 0; i < sg2.students.length; i++) {
			if (i==1) {
				sg2.addStudent(sisi);
			}
			else {
		   sg2.addStudent(new Student("Student number "+(i+1),"Music and arts",i));
			}
		}
		
		
		System.out.println(sg2.theBestStudent(sg2.students));
		
		sg1.printStudentsInGroup();
		
	}

}
