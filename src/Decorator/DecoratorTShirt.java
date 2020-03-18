package Decorator;

/**
 * @author MiaoGuozhu
 * @describtion T恤装饰类
 * @date 2019/4/22 12:03
 */
public class DecoratorTShirt extends Decorator{

	public void show(){
		super.show();
		System.out.print(" "+super.getDecoration());
	}
}
