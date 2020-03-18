package Mediator;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/31 15:32
 */
public class ConcreteMediatorOne extends Mediator {

	private ConcreteColleagueOne colleagueOne;
	private ConcreteColleagueTwo colleagueTwo;

	public ConcreteMediatorOne(ConcreteColleagueOne colleagueOne, ConcreteColleagueTwo colleagueTwo) {
		this.colleagueOne = colleagueOne;
		this.colleagueTwo = colleagueTwo;
	}

	@Override
	public void colleagueChanged(Colleague c) {
		if (c == colleagueOne) {
			System.out.println("colleagueOne");
			colleagueTwo.method();
		} else {
			System.out.println("colleagueTwo");
			colleagueOne.method();
		}
	}
}
