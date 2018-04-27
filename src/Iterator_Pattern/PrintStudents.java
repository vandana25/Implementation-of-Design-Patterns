package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrintStudents {

	public static void main(String[] args) {

		LAStudents s1 = new LAStudents();
		TechStudents s2 = new TechStudents();

		UniversityStudentData data = new UniversityStudentData(s1, s2);
		data.addStudent("Smith", "William", "CompSci", "Tech", 90, 90, 340);
		data.addStudent("Jones", "Michael", "CompEnr", "Tech", 45, 45, 100);
		data.addStudent("Carter", "Mary", "SoftEng", "Tech", 128, 124, 270);
		data.addStudent("Harris", "Harry", "CompSci", "Tech", 30, 30, 90);
		data.addStudent("Wilson", "Brian", "CompSci", "Tech", 90, 90, 270);
		data.addStudent("Adams", "Susan", "CompEng", "Tech", 12, 12, 45);
		data.addStudent("Washington", "George", "SoftEng", "Tech", 96, 96, 360);
		data.addStudent("Jackson", "Andrew", "SoftEng", "Tech", 62, 60, 145);
		data.addStudent("Madison", "James", "CompSci", "Tech", 78, 76, 120);
		data.addStudent("Madison", "Dolly", "CompSci", "Tech", 87, 87, 256);
		data.addStudent("Wagner", "Richardo", "English", "LA", 80, 80, 240);
		data.addStudent("DerfleigendeHollaender", "Albert", "History", "LA", 45, 45, 100);
		data.addStudent("Walkure", "B", " PoliSci", "LA", 128, 124, 270);
		data.addStudent("Lohengrin", "Harry", "English", "LA", 30, 30, 80);
		data.addStudent("Gotterdammerung", "Brian", "English", "LA", 80, 80, 270);
		data.addStudent("Siegfried", "Susan", "History", "LA", 12, 12, 45);
		data.addStudent("Renizi", "George", "PoliSci", "LA", 86, 86, 330);
		data.addStudent("Rheingold", "Andrew", "PoliSci", "LA", 62, 60, 145);
		data.addStudent("Tannhauser", "James", "English", "LA", 78, 76, 120);
		data.addStudent("Johanneskepplerstrasse", "A", "English", "LA", 87, 87, 256);

		List list = new ArrayList<>();
		int i = 0;
		int j = 0;
		/*
		 * Sorting all students by ascending order of their last names. Merging
		 * two sorted data Structures here.
		 */
		while (i < s1.Students.size() && j < 10) {
			String a = s1.Students.get(i).GetName();
			String b = s2.TechStudentData[j].GetName();
			int compare = a.compareTo(b);
			if (compare < 0) {
				list.add(s1.Students.get(i));
				i++;
			} else {
				list.add(s2.TechStudentData[j]);
				j++;
			}
		}
		/*
		 * Add Remaining LA students for sorting
		 */
		while (i < s1.Students.size()) {
			String a = s1.Students.get(i).GetName();
			list.add(s1.Students.get(i));
			i++;
		}
		/*
		 * Add Remaining Tech students for sorting
		 */
		while (j < 10) {
			String b = s2.TechStudentData[j].GetName();
			list.add(s2.TechStudentData[j]);
			j++;
		}
		/*
		 * Print All students in sorted order with their GPA's
		 */
		for (int k = 0; k < list.size(); k++) {
			StudentData var = (StudentData) list.get(k);
			System.out.println("Name-" + var.GetName() + " GPA-" + var.getGPA() + " College-" + var.GetCollege()
					+ " Credit hours Attemped-" + var.GetCreditHoursAttempted() + " Credit hours Earned-"
					+ var.GetCreditHoursEarned() + " Major-" + var.GetMajor() + " Quality Points-"
					+ var.GetQualityPoints());
		}

	}

}
