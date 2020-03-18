package Builder;

import java.math.BigDecimal;

/**
 * @author MiaoGuozhu
 * @describtion 建造者模式
 * @date 2019/5/6 10:15
 */
public class Main {
	public static void main(String[] args) {

		//需要经过固定程序造出固定对象Product(House)
		//Builder(HouseBuilder)建造类抽离出某一固定过程中的方法，返回产品类
		//ConcreteBuilder(BigHouse,SmallHouse)具体建造类实现过程的不同具体内荣
		//Director(HouseDirector)指挥类初始化具体建造类（因为是抽象的所以外部传进去），按照固定流程调取过程方法，并初始化产品类
		//调取指挥类的建造方法可以传需要的源数据
		HouseDirector houseDirector = new HouseDirector(new BigHouse());
		House h1 = houseDirector.build("30", "60", "哥特式");
		System.out.println(h1.getGround()+h1.getDecoration()+h1.getFloor());

		HouseDirector hd2= new HouseDirector(new SmallHouse());
		House h2 = hd2.build("5", "12", "英伦风");
		System.out.println(h2.getGround()+h2.getDecoration()+h2.getFloor());
	}
}
