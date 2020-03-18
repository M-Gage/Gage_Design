package ChainOfResponsibility;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/30 17:32
 */
public class Main {
	public static void main(String[] args) {
		//先提取处理类，然后让所有责任人继承，加入设置获取下一责任人方法和处理请求方法（抽象）
		//责任人重写处理请求方法（handleRequest）为自己的逻辑，其中需要一个最终责任人（GeneralManager）
		//需要传递的获取下一个责任人的对象并调用处理请求方法带入请求内容（Request）
		CommonManager cm = new CommonManager();
		Majordomo mj = new Majordomo();
		GeneralManager gm = new GeneralManager();
		//责任传递
		cm.setHandller(mj);
		mj.setHandller(gm);

		Request request = new Request();
		request.setNum(60);
		request.setState("1");
		cm.handleRequest(request);


		request.setState("2");
		request.setNum(2000);
		cm.handleRequest(request);
	}
}
