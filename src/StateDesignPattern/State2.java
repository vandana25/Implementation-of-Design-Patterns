package StateDesignPattern;

public class State2 implements State {

	@Override
	public int gotoA(FSA fsa) {
		return 2;
	}

	@Override
	public int gotoB(FSA fsa) {
		fsa.setState(new State3());
		System.out.println("Moving to stage 3 from stage 2");
		return 3;
	}

	@Override
	public int gotoC(FSA fsa) {
		fsa.setState(new State1());
		System.out.println("Moving to stage 1 from stage 2");
		return 1;
	}

}
