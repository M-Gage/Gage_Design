package State;

/**
 * @author MiaoGuozhu
 * @describtion 状态模式
 * @date 2019/5/13 17:58
 */
public class Main {
	public static void main(String[] args) {
		//当控制一个对象状态的条件表达式过于复杂时的情况。把状态的判断逻辑转移到表示不同状态的一系列类中，可以把复杂的判断逻辑简化。
		//遵循开闭原则，if/else过多并且以后可能会增加时可以使用
		//Context（Hero）：它就是那个含有状态的对象，它可以处理一些请求，这些请求最终产生的响应会与状态相关。
		// State：状态接口，它定义了每一个状态的行为集合，这些行为会在Context中得以使用。
		//ConcreteState（MoveState)：具体状态，实现相关行为的具体状态类。

		Hero hero = new Hero(new StandState());
		hero.heroRun();
		hero.setState(new MoveState());
		hero.heroRun();
		//会增加的类的数量。一个状态一个类
		//使系统的复杂性增加。
	}
}
