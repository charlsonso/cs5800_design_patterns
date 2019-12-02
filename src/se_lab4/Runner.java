package se_lab4;

public class Runner {
	public static void main(String[] args) {
		task1();
		task2();
		task3();
	}
	
	public static void task1() {
		Student s = new Student("Charlson");
		s.addAssignmentScore(100.0);
		s.addAssignmentScore(90.0);
		s.addAssignmentScore(85.0);
		s.addExamScore(100.0);
		s.addExamScore(90.0);
		
		double method1 = s.calculateAverage(.4, .6, false);
		double method2 = s.calculateAverage(.4, .6, true);
		System.out.println("Task 1");
		System.out.println("Average Method 1: " + method1);
		System.out.println("Average Method 2: " + method2);
	}
	
	public static void task2() {
		Student s = new Student("Charlson");
		s.addAssignmentScore(100.0);
		s.addAssignmentScore(90.0);
		s.addAssignmentScore(85.0);
		s.addExamScore(100.0);
		s.addExamScore(90.0);
		
		GradeTracker gt = new GradeTracker(s);
		System.out.println("Task 2");
		System.out.println("Initial Grade: " + gt.getLetterGrade());
		
		s.addAssignmentScore(0);
		
		System.out.println("Grade with new score: " +  gt.getLetterGrade());
		
	}
	
	public static void task3() {
		Student s = new Student("Charlson");
		s.addAssignmentScore(100.0);
		s.addExamScore(100.0);
		Student f = new Student("Fabio");
		f.addAssignmentScore(60);
		f.addExamScore(70);
		Student g = new Student("Lynn");
		g.addAssignmentScore(80);
		g.addExamScore(90);
		Roster r = new Roster("cs", "1");
		r.addStudent(s);
		r.addStudent(f);
		r.addStudent(g);
		AvgDispenser ad = new AvgDispenser(r);
		
		System.out.println("Task 3");
		while(ad.hasNext()) {
			System.out.println(ad.next());
		}
		
	}
}
