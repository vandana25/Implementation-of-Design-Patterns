package StateDesignPattern;

public class FSA {
	 private State state;

	   public FSA(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}
