package Decorator;

/**
 * 定义一个具体对象的父类
 * 用来让更多的对象可以用来被装饰
 * 当被装饰的对象只是一个的话那么可以省去这步
 * @author MiaoGuozhu
 * @describtion
 * @date 2019/4/22 15:24
 */
public class ConcreteComponent implements DecoratorComponent {
	@Override
	public void show() {

	}
}
