package Facade;

/**
 * @author MiaoGuozhu
 * @describtion 外观模式
 * @date 2019/5/5 13:42
 */
public class Main {
	public static void main(String[] args) {
		//外观模式封装一系列方法步骤只提供需要的接口
		//三层结构就是很好的外观模式
		//开闭原则，迪米特法则都有很好的提现
		Service service = new Service();
		service.serviceMethod();
	}
}
