package Mediator;

/**
 * @author MiaoGuozhu
 * @describtion 中介者模式
 * @date 2019/5/31 14:57
 */
public class Main {
	public static void main(String[] args) {

		//该模式适用于错综复杂的网状结构（重构），事情变成星型，各类达到解耦目的
		//抽取中介处理方法然后为抽象中介类就（Mediator）
		//具体中介类（ConcreteMediator）加载需要处理的对象,根据传进来的不同对象做不同的调转
		//同事抽象\父类（Colleague)关联中介类,掉用中介类的处理方法
		//具体同事类（ConcreteColleague）写写自己的方法

		//这个模式用到的时候再仔细看吧
		ConcreteColleagueOne co = new ConcreteColleagueOne();
		ConcreteColleagueTwo ct = new ConcreteColleagueTwo();
		ConcreteMediatorOne cm = new ConcreteMediatorOne(co, ct);

		//加入中介内
		co.setMediator(cm);
		ct.setMediator(cm);

		co.changed();
		System.out.println("---------------------");
		ct.changed();
	}
}
