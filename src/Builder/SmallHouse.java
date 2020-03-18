package Builder;

/**
 * @author MiaoGuozhu
 * @describtion 小房子的具体建造类
 * @date 2019/5/6 11:29
 */
public class SmallHouse extends HouseBuilder {
	private House house = new House();

	@Override
	void buildGround(String deep) {
		if (Integer.parseInt(deep) >= 10) {
			throw new RuntimeException("地基太深太浪费");
		} else {
			System.out.println("先打" + deep + "深的地基");
			house.setGround(deep);
		}
	}

	@Override
	void buildFloor(String height) {
		if (Integer.parseInt(height) >= 20) {
			throw new RuntimeException("楼层太高需要建筑证");
		} else {
			System.out.println("再造" + height + "层的楼");
			house.setFloor(height);
		}
	}

	@Override
	void decorationHouse(String style) {
		System.out.println("最后装修成" + style + "的风格");
		house.setDecoration(style);
	}

	@Override
	House getHouse() {
		System.out.println("这个大楼有：" + house.getGround() + "深的地基，" + house.getFloor() + "高，装修成" + house.getDecoration() + "的风格");
		return house;
	}
}
