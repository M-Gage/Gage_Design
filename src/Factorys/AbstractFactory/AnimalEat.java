package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:20
 */
public class AnimalEat implements IEat {
	@Override
	public void eat() {
		System.out.println("动物进食");
	}
}
