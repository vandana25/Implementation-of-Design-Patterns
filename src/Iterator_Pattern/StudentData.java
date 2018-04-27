package Iterator_Pattern;

import java.util.Comparator;

public class StudentData {
	private String LastName, FirstName;
	private String Major;
	private String College;
	private int CreditHoursAttempted;
	private int CreditHoursEarned;
	private int QualityPoints;

	public StudentData(String ln, String fn, String mj, String col, int cha, int che, int qp) {
		LastName = ln;
		FirstName = fn;
		Major = mj;
		College = col;
		CreditHoursAttempted = cha;
		CreditHoursEarned = che;
		QualityPoints = qp;
	}

	public String GetName() {
		return LastName + ", " + FirstName;
	}

	public String GetCollege() {
		return College;
	}

	public String GetMajor() {
		return Major;
	}

	public int GetCreditHoursAttempted() {
		return CreditHoursAttempted;
	}

	public int GetCreditHoursEarned() {
		return CreditHoursEarned;
	}

	public int GetQualityPoints() {
		return QualityPoints;
	}

	/*
	 * Calculate GPA
	 */
	public int getGPA() {
		return QualityPoints / CreditHoursAttempted;
	}

	/*
	 * Implemented Comparator to compare data while inserting
	 */
	public static Comparator<StudentData> CompareName = new Comparator<StudentData>() {
		public int compare(StudentData s1, StudentData s2) {
			if (s1 != null && s2 != null) {
				return s1.GetName().compareTo(s2.GetName());
			}
			return 0;
		}
	};
}
