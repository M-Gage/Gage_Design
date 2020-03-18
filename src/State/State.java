package State;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/13 18:12
 */
public abstract class State {

	//英雄（Hero）的行为(方法action)状态(State)
	abstract void action(Hero hero);
}
