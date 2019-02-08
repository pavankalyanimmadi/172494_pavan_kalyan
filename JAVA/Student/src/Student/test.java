package Student;

public class test {

	public static void main(String[] args) {
		Student s=new Student("pavan","guntur");
		s.addCourseGrade("java", 90);
		s.addCourseGrade("c", 80);
		s.addCourseGrade("sql", 85);
		s.addCourseGrade("c++", 90);
		s.printGrades();
		
		System.out.println("avarage-"+s.getaAvarageGrade());
		

	}

}
