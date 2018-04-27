package StateDesignPattern;

public class State5 implements State {

	@Override
	public int gotoA(FSA fsa) {
		return 5;
	}

	@Override
	public int gotoB(FSA fsa) {
		fsa.setState(new State6());
		System.out.println("Moving to stage 6 from stage 5");
		return 6;
	}

	@Override
	public int gotoC(FSA fsa) {
		fsa.setState(new State4());
		System.out.println("Moving to stage 4 from stage 5");
		return 4;
	}

}
