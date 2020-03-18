package State;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/13 18:13
 */
public class Hero {
	private State state;

	public Hero(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void heroRun(){
		state.action(this);
	}
}
