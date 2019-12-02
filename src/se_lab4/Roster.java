package se_lab4;
//Factory Pattern
import java.util.ArrayList;

public class Roster {
	public String name;
	public String number;
	ArrayList<Student> studentRoster;
	
	public Roster(String name, String number) {
		studentRoster = new ArrayList<Student>();
		this.name = name;
		this.number = number;
	}
	
	public String getCourseName() {
		return name;
	}
	
	public void addStudent(Student student) {
		studentRoster.add(student);
	}
	
	public int getRosterSize() {
		return studentRoster.size();
	}
	
	public double getStudentAverage(int idx) {
		return studentRoster.get(idx).calculateAverage(.4, .6, false);
	}
}
