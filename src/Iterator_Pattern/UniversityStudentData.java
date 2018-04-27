package Iterator_Pattern;

import java.util.Iterator;

public class UniversityStudentData {

	private LAStudents laStudents;
	private TechStudents techStudents;

	public UniversityStudentData(LAStudents laStudents,TechStudents techStudents) {
		this.laStudents = laStudents;
	 this.techStudents = techStudents;
	}

	public void addStudent(String l, String f, String m, String c, int cha, int che, int qp) {
		if (c.equals("LA"))
			laStudents.addStudent(l, f, m, c, cha, che, qp);
			
		else
			techStudents.addStudent(l, f, m, c, cha, che, qp);
	}

}
