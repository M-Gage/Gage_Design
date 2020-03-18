package ChainOfResponsibility;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/30 17:47
 */
public abstract class Handller {
	private Handller handller;

	public void setHandller(Handller handller) {
		this.handller = handller;
	}

	public Handller getHandller() {
		return handller;
	}

	public abstract void handleRequest(Request request);

}
