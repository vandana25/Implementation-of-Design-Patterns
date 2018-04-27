package StateDesignPattern;

public class State3 implements State {

	@Override
	public int gotoA(FSA fsa) {
		fsa.setState(new State2());
		System.out.println("Moving to stage 2 from stage 3");
		return 2;
	}

	@Override
	public int gotoB(FSA fsa) {
		fsa.setState(new State1());
		System.out.println("Moving to stage 1 from stage 3");
		return 1;
	}

	@Override
	public int gotoC(FSA fsa) {
		fsa.setState(new State4());
		System.out.println("Moving to stage 4 from stage 3");
		return 4;
	}
}
