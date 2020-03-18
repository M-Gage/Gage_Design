package Template;

/**
 * @author MiaoGuozhu
 * @describtion 模板模式
 * @date 2019/4/29 15:24
 */
public class Main {
	public static void main(String[] args) {
		//模板类里面搭好框架预留改变的部分，并且进行调用（可以抽象方法，也可实现方法然后让子类重写）
		//子类继承父类填写方法
		//实例化子类并调用父类的模板方法
		Student1  s1 = new Student1();
		s1.testPaperTemplateMethod();
		Student2 s2 = new Student2();
		s2.testPaperTemplateMethod();
	}
}
