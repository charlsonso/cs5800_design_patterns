package se_lab4;
import java.util.Observable;
import java.util.Observer;

//Observer Pattern
public class GradeTracker implements Observer {
	public String letterGrade;
	public Student student;
	
	public GradeTracker(Student student) {
		student.addObserver(this);
		this.student = student;
		double average = student.calculateAverage(.4, .6, false);
		setLetterGrade(average);
	}
	
	private void setLetterGrade(double score) {
		if (score >= 90) {
			letterGrade = "A";
		}
		else if (score>=80) {
			letterGrade = "B";
		}
		else if (score>=70) {
			letterGrade = "C";
		}
		else if (score>=60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
	}

	public String getLetterGrade() {
		return letterGrade;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		double average = student.calculateAverage(.4, .6, false);
		setLetterGrade(average);
		
	}

}
