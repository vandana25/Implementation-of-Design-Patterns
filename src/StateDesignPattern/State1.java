package StateDesignPattern;

public class State1 implements State {

	@Override
	public int gotoA(FSA fsa) {
		fsa.setState(new State2());
		System.out.println("Moving to stage 2 from stage 1");
		return 2;
	}

	@Override
	public int gotoB(FSA fsa) {
		return 1;
	}

	@Override
	public int gotoC(FSA fsa) {
		return 1;
	}

}
