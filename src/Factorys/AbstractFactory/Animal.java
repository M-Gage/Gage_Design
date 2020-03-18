package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:10
 */
public class Animal implements IBiologicalFactory {

	@Override
	public IEat createEat() {
		return new AnimalEat();
	}

	@Override
	public ISleep createSleep() {
		return new AnimalSleep();
	}
}
