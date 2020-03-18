package Proxy;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/23 10:05
 */
public class Star implements Invite {

	private String starName;
	private String customerName;
	private String agentName;

	public Star(String customerName,String agentName,String starName) {
		this.customerName = customerName;
		this.agentName = agentName;
		this.starName = starName;
	}

	@Override
	public void invite() {
		System.out.println(customerName+"想看"+starName+"的演唱会");
	}

	@Override
	public void pay() {
		System.out.println(agentName+"帮"+customerName+"买了门票");
	}

	@Override
	public void sing() {
		System.out.println(customerName +"可以看"+starName+"演唱了");
	}
}
