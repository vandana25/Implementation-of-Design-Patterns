package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class LAStudents {
	
	StudentData studentData;
	ArrayList<StudentData> Students = new ArrayList<>();
	public void addStudent(String l, String f, String m, String c, int cha, int che, int qp) {
		Students.add(new StudentData(l, f, m, c, cha, che, qp));
		Collections.sort(Students,StudentData.CompareName);
	}

	public ArrayList<StudentData> getStudents() {
		return Students;
	}

	public Iterator<StudentData> iterator() {
		return Students.iterator();
	}
}
