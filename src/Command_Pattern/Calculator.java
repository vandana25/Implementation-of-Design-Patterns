package Command_Pattern;


import java.util.Stack;
/***
 * 
 * @author Vandana
 *  Calculator class is responsible for performing all associated operations like compute, undo, and redo.
 *
 */
public class Calculator {
	/**
	 * performs operation using undoStack, redoStack, and thisCommand
	 * @param thisCommand decides what operation to perform.
	 * @param undoStack the stack containing outputs for all possible undo operations. 
	 * @param redoStack the stack containing outputs for all possible redo operations.
	 */
	public void operation(String thisCommand, Stack<String> undoStack, Stack<String> redoStack) {
		switch(thisCommand) {
			//command is to undo last operation.
			case "u" :
			case "U" :
				if(!undoStack.isEmpty()) {
					redoStack.push(undoStack.pop());
					if(!undoStack.isEmpty()) {
						System.out.println(undoStack.peek());
					}
				};
			break;
			//command is to redo last operation.
			case "r" :
			case "R" : 
				if(!redoStack.isEmpty()) {
					undoStack.push(redoStack.pop());
					System.out.println(undoStack.peek());
				}
			break;
			default:
				//print the already calculated value from the stack.
				System.out.println(undoStack.peek());
		}
	}
	
}
