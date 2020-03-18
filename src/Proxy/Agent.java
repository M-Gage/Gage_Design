package Proxy;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/23 10:05
 */
public class Agent implements Invite {

	private Star star;
	 private String agentName;

	public Agent(String customerName,String starName,String agentName) {
		//外界知道这个类的存在，但是不能看到
		this.agentName = agentName;
		this.star = new Star(customerName,agentName,starName);
	}

	@Override
	public void invite() {
		star.invite();
		System.out.println(agentName+"通过网上找到了票");
	}

	@Override
	public void pay() {
		star.pay();
	}

	@Override
	public void sing() {
		star.sing();
	}

}
