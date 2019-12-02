package se_lab4;
//Factory Pattern
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class Student extends Observable{
	public String name;
	public ArrayList<Double> assignmentScores;
	public ArrayList<Double> examScores;
	
	public Student(String name) {
		assignmentScores = new ArrayList<Double>();
		examScores = new ArrayList<Double>();
		this.name = name;
	}
	
	public void addAssignmentScore(double as) {
		assignmentScores.add(as);
		setChanged();
		notifyObservers();
	}
	
	public void addExamScore(double es) {
		examScores.add(es);
		setChanged();
		notifyObservers();
	}
	
	public double calculateAverage(double a, double e, boolean drop_lowest_assignment) {
		
		ArrayList<Double> assignment = new ArrayList<Double>(assignmentScores);
		if (drop_lowest_assignment && assignmentScores.size() > 1) {
			int index = assignment.indexOf(Collections.min(assignment));
			assignment.remove(index);
		}
		
		double total_a = 0;
		double total_e = 0;
		
		for (int i=0; i<assignment.size(); i++) {
			total_a += assignment.get(i);
		}
		
		for (int i=0; i<examScores.size(); i++) {
			total_e  += examScores.get(i);
		}
		
		return (((total_a/assignment.size())*a) + ((total_e/examScores.size())*e));
		
	}
}
