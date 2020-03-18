package Decorator;

/**
 * 定义一个具体装饰品的父类
 * 可以让继承类用来做装饰用
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/22 11:56
 */
public class Decorator extends ConcreteComponent{
	private DecoratorComponent dc;

	 public void decorator(DecoratorComponent dc) {
		this.dc = dc;
	}

	public String decoration;

	public void show(){
		if (dc !=null) {
			dc.show();
		}
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}
}
