package Builder;

/**
 * @author MiaoGuozhu
 * @describtion 指挥类，控制建造过程
 * @date 2019/5/6 11:41
 */
public class HouseDirector {
	private HouseBuilder hb = null;
	public HouseDirector(HouseBuilder h) {
		hb = h;
	}

	public House build(String deep,String height,String style){
		System.out.println("开始建造");
		hb.buildGround(deep);
		hb.buildFloor(height);
		hb.decorationHouse(style);
		return hb.getHouse();
	}
}
