package Decorator;

/**
 * @author MiaoGuozhu
 * @describtion 鞋子装饰类
 * @date 2019/4/22 12:03
 */
public class DecoratorShoe extends Decorator{

	public void show(){
		super.show();
		System.out.print(" "+super.getDecoration());
	}
}
