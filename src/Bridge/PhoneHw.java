package Bridge;

/**
 * @author MiaoGuozhu
 * @describtion 华为手机类
 * RefinedAbstraction（扩充抽象类）：扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，
 * 它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以调用在Implementor中定义的业务方法。
 * 可以称之为桥的支撑
 * @date 2019/5/17 15:31
 */
public class PhoneHw extends PhoneBrand {

	@Override
	void run() {
		System.out.print("华为手机");
		soft.run();
	}
}
