package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:19
 */
public class HumanEat implements IEat {
	@Override
	public void eat() {
		System.out.println("人类吃饭");
	}
}
