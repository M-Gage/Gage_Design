package Template;

/**
 * @author MiaoGuozhu
 * @describtion 学生类（模板实现类）
 * @date 2019/5/5 11:38
 */
public class Student2 extends ATestPaper {
	@Override
	String studentName() {
		return "少年";
	}

	@Override
	void studentClass() {
		System.out.println("三年二班");
	}

	@Override
	String answer1() {
		return "小学老师说的等于2";
	}

	@Override
	String answer2() {
		return "有也不能说有";
	}
}
