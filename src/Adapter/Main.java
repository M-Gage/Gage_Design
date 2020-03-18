package Adapter;

/**
 * @author MiaoGuozhu
 * @describtion 适配器模式
 * @date 2019/5/14 16:58
 */
public class Main {
	public static void main(String[] args) {
		//理解方式有很多，原本存在的类(插座)，在其他地方需要用（手机充电），但是内容不一致（电压太大）那么就可以使用适配器模式
		//注意的是适配类需要内部初始化
		Socket computer = new Computer();
		computer.electricCurrent();
		Socket lamp = new Lamp();
		lamp.electricCurrent();
		//没有带适配器的手机，像电脑和灯一样直接连上
		Socket phone = new Phone();
		phone.electricCurrent();
		//经过出厂自带的电源适配器，手机就可以充电了
		//插座还是那个110V的插座
		Socket adapterPhone = new AdapterPhone();
		adapterPhone.electricCurrent();
	}
}
