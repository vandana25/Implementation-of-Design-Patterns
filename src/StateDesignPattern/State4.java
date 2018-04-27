package StateDesignPattern;

public class State4 implements State {

	@Override
	public int gotoA(FSA fsa) {
		fsa.setState(new State5());
		System.out.println("Moving to stage 5 from stage 4");
		return 5;
	}

	@Override
	public int gotoB(FSA fsa) {
		return 4;
	}

	@Override
	public int gotoC(FSA fsa) {
		return 4;
	}

}
