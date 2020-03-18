package Factorys.Factory;

/**
 * @author MiaoGuozhu
 * @describtion 工厂方法模式
 * @date 2019/4/23 15:05
 */
public class Main {
	public static void main(String[] args) {
		//工厂模式遵循开闭原则对于不明确的类创建来说工厂模式更好
		//对于
		StudentFactory factory = new StudentFactory();
		StudyLeiFeng student = factory.createLeiFeng();
		student.doHouseWork();
		student.talk();

		VolunteerFactory volunteerFactory = new VolunteerFactory();
		StudyLeiFeng volunteer = volunteerFactory.createLeiFeng();
		volunteer.doHouseWork();
		volunteer.talk();
	}
}
