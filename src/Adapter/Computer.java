package Adapter;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/14 17:07
 */
public class Computer implements Socket {
	@Override
	public void electricCurrent() {
		System.out.println("接受"+Socket.voltage+"V电压，电脑工作");
	}
}
