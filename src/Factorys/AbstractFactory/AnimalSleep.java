package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:23
 */
public class AnimalSleep implements ISleep {
	@Override
	public void sleep() {
		System.out.println("动物睡觉");
	}
}
