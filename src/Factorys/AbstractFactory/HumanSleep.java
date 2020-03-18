package Factorys.AbstractFactory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/8 11:21
 */
public class HumanSleep implements ISleep {
	@Override
	public void sleep() {
		System.out.println("人类睡觉");
	}
}
