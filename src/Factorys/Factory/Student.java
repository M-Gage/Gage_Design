package Factorys.Factory;

/**
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/23 16:03
 */
public class Student extends StudyLeiFeng {

	@Override
	void doHouseWork() {
		System.out.print("学生偶尔帮助");
		super.doHouseWork();
	}

	@Override
	void talk() {
		super.talk();
	}
}
