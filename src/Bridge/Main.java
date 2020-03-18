package Bridge;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/5/17 14:35
 */
public class Main {
	public static void main(String[] args) {
		// 首先应该识别出一个类所具有的两个独立变化的维度（手机有品牌和软件两个维度），
		// 将它们设计为两个独立的继承等级结构，为两个维度都提供抽象层（手机品牌抽象类，软件接口类），并建立抽象耦合（品牌类关联接口类）。
		// 通常情况下，我们将具有两个独立变化维度的类的一些普通业务方法和与之关系最密切的维度设计（品牌和手机最密切，可以看成合成）为“抽象类”层次结构（抽象部分），
		// 而将另一个维度设计（软件和手机关系较弱，只是聚合关系）为“实现类”层次结构（实现部分）。
		PhoneHw hw = new PhoneHw();
		hw.setSoft(new GameSoft());
		hw.run();
		PhoneXm xm = new PhoneXm();
		xm.setSoft(new VideoSoft());
		xm.run();

		xm.setSoft(new GameSoft());
		xm.run();
	}
}
