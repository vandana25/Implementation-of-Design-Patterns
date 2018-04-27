package StateDesignPattern;

public class State6 implements State {

	@Override
	public int gotoA(FSA fsa) {
		fsa.setState(new State5());
		System.out.println("Moving to stage 5 from stage 6");
		return 5;
	}

	@Override
	public int gotoB(FSA fsa) {
		fsa.setState(new State4());
		System.out.println("Moving to stage 4 from stage 6");
		return 4;
	}

	@Override
	public int gotoC(FSA fsa) {
		fsa.setState(new State1());
		System.out.println("Moving to stage 1 from stage 6");
		return 1;
	}

}
