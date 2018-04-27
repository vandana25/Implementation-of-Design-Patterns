package Command_Pattern;


import java.util.Stack;
/***
 * 
 * @author Vandana
 *  class extending the command abstract class and the way to call operations on actual calculator class.
 *
 */
public class CalculatorCommand extends Command{
	private String _thisCommand;
	private Calculator _calculator;
	private Stack<String> _undoStack;
	private Stack<String> _redoStack;

	
	public CalculatorCommand(String thisCommand, Calculator calculator, Stack<String> undoStack, Stack<String> redoStack) {
		this._thisCommand = thisCommand;
		this._calculator = calculator;
		this._undoStack = undoStack;
		this._redoStack = redoStack;
	}
	
	//Execute new command
	@Override
	public void execute() {
		_calculator.operation(_thisCommand, _undoStack, _redoStack);
	}
}
