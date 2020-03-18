package Template;

/**
 * @author MiaoGuozhu
 * @describtion 试卷模板（模板类）
 * @date 2019/5/5 10:56
 */
public abstract class ATestPaper {

	abstract String studentName();

	abstract void studentClass();

	public void testPaperTemplateMethod() {
		System.out.println("------2019博士毕业考试卷-------");
		System.out.println("姓名："+studentName());

		System.out.print("班级：");
		studentClass();
		examinationQuestion1();
		examinationQuestion2();
	}

	public void examinationQuestion1(){
		System.out.println("1+1=?");
		System.out.println("答："+answer1());
	}

	 abstract String answer1();

	public void examinationQuestion2(){
		System.out.println("你屁股有长痔疮吗？");
		System.out.println("答："+answer2());
	}

	 abstract String answer2();
}
