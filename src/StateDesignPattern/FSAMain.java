package StateDesignPattern;
import java.util.Scanner;

public class FSAMain {

	public static void main(String[] args) {
		String input = "";

		
		FSA fsa = new FSA();			
		do {
			fsa.setState(new State1());					// Initializing Stage 1
			int lastStage = 0;
			Boolean flag = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string of abc's or press q to quit");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("q"))								//Check if user wants to quit
				break;
			for (int i = 0; i < input.length(); i++) {
				String str = String.valueOf(input.charAt(i));
				if (str.equalsIgnoreCase("A")) {
					lastStage = fsa.getState().gotoA(fsa);
				} else if (str.equalsIgnoreCase("B")) {
					lastStage = fsa.getState().gotoB(fsa);
				} else if (str.equalsIgnoreCase("C")) {
					lastStage = fsa.getState().gotoC(fsa);
				} else {
					System.out.println("Please insert a valid String :" + str + " is not valid" +"\n");    //If input string does not contain a/b or c
					flag = false;
					break;
				}
			}
			if (flag) {																//validating if final stage is 4/5 or 6.
				if (lastStage > 3) {
					System.out.println("Last Stage is " + lastStage + " Hence Valid Input"+"\n");
				} else {
					System.out.println("Last Stage is " + lastStage + " Hence Not a Valid Input"+"\n");
				}
			}
		} while (!input.equalsIgnoreCase("q")); // do until user chooses to quit.
												

	}
}
