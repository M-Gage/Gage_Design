package ChainOfResponsibility;

/**
 * @author MiaoGuozhu
 * @describtion 最终责任人，不在调取下方
 * @date 2019/5/30 17:59
 */
public class GeneralManager extends Handller {
	@Override
	public void handleRequest(Request request) {
		if ("1".equals(request.getState())) {
			if (request.getNum() < 15) {
				System.out.println("请假" + request.getNum() + "天,董事长允许");
			}else {
				System.out.println("请假" + request.getNum() + "天,董事长不允许允许，并表示卷铺盖走人吧");
			}
		}else if("2".equals(request.getState())){
			if (request.getNum() < 1500) {
				System.out.println("要求提薪" + request.getNum() + ",董事长允许");
			}else {
				System.out.println("要求提薪" + request.getNum() + ",董事长不允许，并表示洗洗睡吧");
			}
		}
	}
}
