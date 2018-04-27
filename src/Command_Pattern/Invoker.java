package Command_Pattern;


import java.util.Stack;
/***
 * 
 * @author Vandana
 * The invoker is responsible for invoking execute operations on calculatorCommand
 */
public class Invoker {
	private Calculator _calculator; //receiver
	//stores values for all undo operations possible.
	private Stack<String> _undoStack;
	//stores values for all redo operations possible.
	private Stack<String> _redoStack;
	
	public Invoker() {
		this._calculator = new Calculator(); 
		this._undoStack = new Stack<String>();
		this._redoStack = new Stack<String>();
	}
	
	public void redo() {
		String calculateThis = "r";
		Command command = new CalculatorCommand(calculateThis, _calculator, _undoStack, _redoStack);
		command.execute();
	}
	
	public void undo() {
		String calculateThis = "u";
		Command command = new CalculatorCommand(calculateThis, _calculator, _undoStack, _redoStack);
		command.execute();
	}
	/**
	 * takes the postfix expression and evaluates it.
	 * @param thisCommand postfix expression to calculate.
	 */
	public void compute(String thisCommand) {
		Stack<String> tempStack = new Stack<String>();
		String tempString = thisCommand;
		_undoStack.push(thisCommand);
		tempStack = new Stack<String>();
		while(!tempString.isEmpty()) {
			String[] tokens = tempString.split(" ");
			boolean onePresent = false;
			boolean twoPresent = false;
			boolean skipAll = false;
			int one=0, two=0;
			if(tokens.length <= 2) {
				break;
			}
			for(int i=0; i<tokens.length; i++) {
				if(skipAll) {
					tempStack.push(tokens[i]);
					continue;
				}
				if(!tempStack.isEmpty()) {
					two = Integer.parseInt(tempStack.pop());
					twoPresent = true;
				}
				if(!tempStack.isEmpty()) {
					one = Integer.parseInt(tempStack.pop());
					onePresent = true;
				}
				
				if(tokens[i].equals("+")) {
					tempStack.push((two + one)+"");
					skipAll = true;
				} else if (tokens[i].equals("-")) {
					skipAll = true;
					tempStack.push((two - one)+"");
				} else if (tokens[i].equals("*")) {
					tempStack.push((one * two)+"");
					skipAll = true;
				} else if (tokens[i].equals("/")) {
					tempStack.push((two / one)+"");
					skipAll = true;
				} else if (tokens[i].equals("^")) {
					tempStack.push((Math.pow(one, two))+"");
					skipAll = true;
				} else {
					if(onePresent) {
						tempStack.push(one+"");
						onePresent = false;
					}
					if(twoPresent) {
						tempStack.push(two+"");
						twoPresent = false;
					}
					tempStack.push(tokens[i]);
				}
			}
			//convert all the tokens from tempStack to String. and push it in undoStack
			_undoStack.push(convertStackToString(tempStack));
			tempString = _undoStack.peek();
			if(tempStack.size() <= 1) {
				tempString = "";
			}
			tempStack.clear();
		}
		Command command = new CalculatorCommand(thisCommand, _calculator, _undoStack, _redoStack);
		command.execute();
	}
	
	/*
	 * utility method to convert values in a stack to a string.
	 */
	private String convertStackToString(Stack<String> stack) {
		String str = "";
		Stack<String> temp = new Stack<String>();
		
		while(!stack.isEmpty()) {
			str = stack.peek()+" "+str;
			temp.push(stack.pop());
		}
		while(!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return str.toString();
	}
}
