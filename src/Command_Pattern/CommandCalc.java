package Command_Pattern;


import java.util.Scanner;
/***
 * 
 * @author Vandana
 * Main class to test code for the calculator to do computation
 *
 */
public class CommandCalc {

	public static void main(String[] args) {
		Invoker user = new Invoker();
		Scanner sc = new Scanner(System.in);
		String calculateThis = "";
		String command = "";
		//user presses calculator button(s).
		//until user presses 'x', keep on taking inputs.
		while(!(command = sc.nextLine().trim()).equalsIgnoreCase("x")) {
			//if user presses 'd', empty stacks, take the input again.
			if(command.equalsIgnoreCase("d")) {
				calculateThis = "";
			} else if (command.equalsIgnoreCase("u")) {// undo the previous operation.
				user.undo();
			} else if (command.equalsIgnoreCase("r")) {//redo the last operation.
				user.redo();
			} else {//calculate the post-fix expression
				calculateThis = command;
				user.compute(calculateThis);
			}
		}
		sc.close();
	}

}
