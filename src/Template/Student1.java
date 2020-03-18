package Template;

/**
 * @author MiaoGuozhu
 * @describtion 学生类（模板实现类）
 * @date 2019/5/5 11:28
 */
public class Student1 extends ATestPaper {
	@Override
	String studentName() {
		return "大黑";
	}

	@Override
	void studentClass() {
		System.out.println("三年二班");
	}

	@Override
	String answer1() {
		return "太难了，不会";
	}

	@Override
	String answer2() {
		return "检验是否诚实？没错，我就是长了";
	}
}
