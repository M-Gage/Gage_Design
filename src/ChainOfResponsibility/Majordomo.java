package ChainOfResponsibility;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/30 17:59
 */
public class Majordomo extends Handller {
	@Override
	public void handleRequest(Request request) {
		if ("1".equals(request.getState())) {
			if (request.getNum() < 7) {
				System.out.println("请假" + request.getNum() + "天,总监允许");
			}else {
				getHandller().handleRequest(request);
			}

		}else if("2".equals(request.getState())){
			if (request.getNum() < 1000) {
				System.out.println("要求提薪" + request.getNum() + ",总监允许");
			}else {
				getHandller().handleRequest(request);
			}
		}
	}
}
