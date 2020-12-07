package context;

/*
 * @author Dusan
 */

public class Paper {
   private State state;
    public Paper() {
        state = null;
    }
   public void setState(State state){
      this.state = state;		
   }
   public State getState(){
      return state;
   }
}
