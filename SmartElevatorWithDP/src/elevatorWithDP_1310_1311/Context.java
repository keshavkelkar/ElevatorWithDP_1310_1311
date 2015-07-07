/*Program:-
 * Author:- Keshav Murtimant Kelkar
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public class Context {
	private State state;

	Context(State s){
		state=s;
	}
	
	public State getState(){
		
		return state;
	}
	
	public void setState(State s){
		state=s;
	}
	
	public void Switch(){
		state.handle(this);
		
	}
}
