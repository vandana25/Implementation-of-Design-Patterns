package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TechStudents {
	static final int NumUTS = 1000;
	StudentData[] TechStudentData = new StudentData[NumUTS];// sized to NumUTS
	StudentData studentData;
	int count = 0;

	public void addStudent(String l, String f, String m, String c, int cha, int che, int qp) {

		TechStudentData[count] = new StudentData(l, f, m, c, cha, che, qp);
		count++;
		Arrays.sort(TechStudentData, StudentData.CompareName);
	}

	public StudentData[] getStudents() {
		return TechStudentData;
	}

	/*
	 * custom iterator to Iterate Arraylist
	 */
	public Iterator<StudentData> iterator() {
		return new Iterator<StudentData>() {

			private int pos = 0;

			public boolean hasNext() {
				return pos < count;
			}

			public StudentData next() {
				if (pos < count)
					return TechStudentData[pos++];
				else {
					throw new NoSuchElementException();
				}
			}
		};
	}

}
