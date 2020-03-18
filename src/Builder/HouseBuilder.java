package Builder;

/**
 * @author MiaoGuozhu
 * @describtion 抽象建造类
 * @date 2019/5/6 10:20
 */
public abstract class HouseBuilder {
	 abstract void buildGround(String deep);
	 abstract void buildFloor(String height);
	 abstract void decorationHouse(String style);
	 abstract House getHouse();
}
