package Adapter;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/14 17:08
 */
public class Phone implements Socket {
	@Override
	public void electricCurrent() {
		System.out.println("接受"+Socket.voltage+"V电压，手机报废");
	}
}
