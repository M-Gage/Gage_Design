package Adapter;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/14 17:05
 */
public class Lamp implements Socket {
	@Override
	public void electricCurrent() {
		System.out.println("接受"+Socket.voltage+"V电压，灯泡工作");
	}
}
