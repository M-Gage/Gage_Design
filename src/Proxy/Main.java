package Proxy;

/**
 * @author MiaoGuozhu
 * @describtion 静态代理模式
 * @date 2019/4/22 16:21
 */
public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("阿比盖尔");
		Agent agent = new Agent(customer.getCustomerName(), "周杰伦","缪缪");
		agent.invite();
		agent.pay();
		agent.sing();

	}
}
