package Adapter;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/14 17:17
 */
public class AdapterPhone implements Socket {

	private ElectricAdapter ea = new ElectricAdapter();

	@Override
	public void electricCurrent() {
		Integer voltage = ea.changeElectricCurrent();
		System.out.println("接受"+voltage+"V电压，手机充电");
	}
}
