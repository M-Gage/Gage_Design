package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:10
 */
public class Human implements IBiologicalFactory {

	@Override
	public IEat createEat() {
		return new HumanEat();
	}

	@Override
	public ISleep createSleep() {
		return new HumanSleep();
	}
}
