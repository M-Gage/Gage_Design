package Factorys.Factory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/25 10:43
 */
public class Volunteer extends StudyLeiFeng {

	@Override
	void doHouseWork() {
		System.out.print("志愿者可以经常帮助");
		super.doHouseWork();
	}

	@Override
	void talk() {
		super.talk();
	}
}
