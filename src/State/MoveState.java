package State;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/14 15:34
 */
public class MoveState extends State {
	@Override
	void action(Hero hero) {
		System.out.println("英雄移动");
		System.out.println("移动完后");
		//可以在此设计下一个状态的内容
		//注意不要死循环
		hero.setState(new StandState());
		hero.heroRun();
	}
}
