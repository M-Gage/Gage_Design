package Decorator;

/**
 * @author MiaoGuozhu
 * @describtion 内裤装饰类
 * @date 2019/4/22 12:03
 */
public class DecoratorBriefs extends Decorator{

	public void show(){
		super.show();
		System.out.print(" "+super.getDecoration());
	}
}
