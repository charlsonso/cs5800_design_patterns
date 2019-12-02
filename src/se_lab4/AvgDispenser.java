package se_lab4;
//Iterator Pattern
import java.util.Iterator;

public class AvgDispenser implements Iterator{
	Roster roster;
	int roster_size;
	int current_idx;
	
	public AvgDispenser(Roster roster) {
		this.roster = roster;
		roster_size = roster.getRosterSize();
		current_idx = 0;
	}

	@Override
	public boolean hasNext() {
		if (roster_size <= current_idx) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		double score = roster.getStudentAverage(current_idx);
		current_idx++;
		return score;
	}
	
	
}
